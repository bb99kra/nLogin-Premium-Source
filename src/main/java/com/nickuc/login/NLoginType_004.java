package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;

// $VF: synthetic class
class NLoginType_004 {
   private static int b = Integer.reverse(1073741824);
   private static int a = Integer.reverse(Integer.MIN_VALUE);

   static {
      try {
         a[AccountType.PREMIUM.ordinal()] = a;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[AccountType.BEDROCK.ordinal()] = b;
      } catch (NoSuchFieldError var1) {
      }
   }
}
