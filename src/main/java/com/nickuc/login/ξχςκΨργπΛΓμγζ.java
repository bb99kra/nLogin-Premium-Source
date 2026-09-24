package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.protocol.ConnectionState;

// $VF: synthetic class
class ξχςκΨργπΛΓμγζ {
   private static int c = 12582912 >>> 86 | 12582912 << ~86 + 1;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int b = 4096 >>> 171 | 4096 << -171;

   static {
      try {
         R[ConnectionState.LOGIN.ordinal()] = a;
      } catch (NoSuchFieldError var3) {
      }

      try {
         R[ConnectionState.CONFIGURATION.ordinal()] = b;
      } catch (NoSuchFieldError var2) {
      }

      try {
         R[ConnectionState.PLAY.ordinal()] = c;
      } catch (NoSuchFieldError var1) {
      }
   }
}
