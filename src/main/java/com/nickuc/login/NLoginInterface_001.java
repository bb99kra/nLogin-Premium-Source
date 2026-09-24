package com.nickuc.login;

import org.bukkit.entity.Player;

public interface NLoginInterface_001 {
   void send(Player var1, String var2);

   static NLoginInterface_001 a() {
      return NLoginCore_426.a();
   }

   default void a(Player var1) {
      this.send(var1, "");
   }
}
