package com.nickuc.login.api.enums;

public enum TwoFactorType {
   DISCORD,
   EMAIL;

   public static TwoFactorType convert(Enum<?> twoFactorType) {
      String var1 = twoFactorType.name();
      switch (var1) {
         case "DISCORD":
            return DISCORD;
         case "EMAIL":
            return EMAIL;
         default:
            throw new IllegalArgumentException("Unsupported type " + twoFactorType + ".");
      }
   }
}
