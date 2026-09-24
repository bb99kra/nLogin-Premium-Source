package com.nickuc.login.api.enums;

import javax.annotation.Nullable;

public enum AccountType {
   PREMIUM,
   BEDROCK,
   OFFLINE;

   @Nullable
   public static AccountType convert(Enum<?> twoFactorType) {
      String var1 = twoFactorType.name();
      switch (var1) {
         case "PREMIUM":
            return PREMIUM;
         case "BEDROCK":
            return BEDROCK;
         case "OFFLINE":
            return OFFLINE;
         case "UNREGISTERED":
            return null;
         default:
            throw new IllegalArgumentException("Unsupported type " + twoFactorType + ".");
      }
   }
}
