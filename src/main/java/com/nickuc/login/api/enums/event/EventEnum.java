package com.nickuc.login.api.enums.event;

import com.nickuc.login.api.event.internal.EventPlayer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum EventEnum {
   LOGIN_REQUEST("auth.request.LoginRequestEvent"),
   AUTHENTICATE_EVENT("auth.AuthenticateEvent"),
   LOGIN_EVENT("auth.LoginEvent"),
   PREMIUM_LOGIN_EVENT("auth.PremiumLoginEvent"),
   BEDROCK_LOGIN_EVENT("auth.BedrockLoginEvent"),
   REGISTER_EVENT("auth.RegisterEvent"),
   SESSION_LOGIN_EVENT("auth.SessionLoginEvent"),
   WRONG_PASSWORD_EVENT("auth.WrongPasswordEvent"),
   PASSWORD_UPDATE_EVENT("account.PasswordUpdateEvent"),
   CHANGE_PASSWORD("command.ChangePasswordEvent"),
   PRE_COMMAND_EXECUTE("command.PreCommandExecuteEvent"),
   UNREGISTER("command.UnregisterEvent"),
   DEFINE_AUTH_SERVER("connection.DefineAuthServerEvent", false),
   SERVER_PRE_CONNECT("connection.ServerPreConnectEvent", false),
   TWO_FACTOR_ADD("twofactor.TwoFactorAddEvent"),
   TWO_FACTOR_AUTH("twofactor.TwoFactorAuthEvent"),
   TWO_FACTOR_REMOVE("twofactor.TwoFactorRemoveEvent"),
   TWO_FACTOR_REQUEST("twofactor.TwoFactorRequestEvent");

   private final String formattedClass;
   private final boolean forwardEvent;
   private Class<?>[] originalClasses;
   private Class<?>[] rewrittenClasses;
   private Class<?> eventClass;
   private Constructor<?> constructor;

   private EventEnum(String classLocation) {
      this(classLocation, true);
   }

   private EventEnum(String classLocation, boolean forwardEvent) {
      this.formattedClass = "com.nickuc.login.api.event.%s." + classLocation;
      this.forwardEvent = forwardEvent;
   }

   public boolean isForwardEvent() {
      return this.forwardEvent;
   }

   public Class<?>[] getRewrittenClasses() {
      return (Class<?>[])this.rewrittenClasses.clone();
   }

   private void loadClass(String platformName) throws ClassNotFoundException, NoClassDefFoundError {
      if (this.eventClass != null) {
         throw new IllegalStateException("Event class already set!");
      } else {
         this.eventClass = Class.forName(String.format(this.formattedClass, platformName));
      }
   }

   private void loadConstructor(Class<?> playerClass, String platformName) throws NoSuchMethodException, ClassNotFoundException, NoClassDefFoundError {
      if (this.constructor != null) {
         throw new IllegalStateException("Event constructor already set!");
      } else {
         this.loadClass(platformName);
         Constructor<?>[] constructors = this.eventClass.getConstructors();
         if (constructors.length == 0) {
            throw new IllegalStateException("Event constructor missing for " + this + "!");
         } else {
            this.constructor = constructors[0];
            this.originalClasses = this.constructor.getParameterTypes();
            this.rewrittenClasses = new Class[this.originalClasses.length];

            for (int i = 0; i < this.originalClasses.length; i++) {
               Class<?> currentClass = this.originalClasses[i];
               if (playerClass.isAssignableFrom(currentClass)) {
                  this.rewrittenClasses[i] = EventPlayer.class;
               } else {
                  this.rewrittenClasses[i] = currentClass;
               }
            }
         }
      }
   }

   public Object createEvent(Object... arguments) throws InvocationTargetException, InstantiationException, IllegalAccessException {
      if (this.constructor == null) {
         throw new IllegalStateException("Event constructor not loaded!");
      } else if (arguments.length != this.constructor.getParameterCount()) {
         throw new IllegalArgumentException(
            "Invalid arguments length for event " + this + "! " + arguments.length + " != " + this.constructor.getParameterCount()
         );
      } else {
         return this.constructor.newInstance(arguments);
      }
   }

   public static void loadEvents(Class<?> playerClass, String platformName, boolean proxy) throws NoSuchMethodException, ClassNotFoundException, NoClassDefFoundError {
      for (EventEnum eventEnum : values()) {
         if (eventEnum.forwardEvent || proxy) {
            eventEnum.loadConstructor(playerClass, platformName);
         }
      }
   }
}
