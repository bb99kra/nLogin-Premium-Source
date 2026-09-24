package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;

// $VF: synthetic class
class NLoginType_033 {
   private static int b = Integer.reverse(1073741824);
   private static int a = (524288 >>> 211 | 524288 << -211) & -1;
   private static int c = Integer.reverse(-1073741824);

   static {
      try {
         T[ServerConnectType.WITH_LAST_SERVER.ordinal()] = a;
      } catch (NoSuchFieldError var3) {
      }

      try {
         T[ServerConnectType.WITH_PLATFORM_SERVER.ordinal()] = b;
      } catch (NoSuchFieldError var2) {
      }

      try {
         T[ServerConnectType.WITH_CONFIGURED_SERVER.ordinal()] = c;
      } catch (NoSuchFieldError var1) {
      }
   }
}
