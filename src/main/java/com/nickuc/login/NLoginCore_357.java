package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.protocol.ConnectionState;

// $VF: synthetic class
class NLoginCore_357 {
   private static int e = 98304 >>> 175 | 98304 << ~175 + 1;
   private static int a = 16 >>> 100 | 16 << -100;
   private static int b = Integer.reverse(1073741824);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(1073741824);

   static {
      try {
         M[ConnectionState.CONFIGURATION.ordinal()] = a;
      } catch (NoSuchFieldError var5) {
      }

      try {
         M[ConnectionState.PLAY.ordinal()] = b;
      } catch (NoSuchFieldError var4) {
      }

      L = new int[NLoginCore_419.values().length];

      try {
         L[NLoginCore_419.b.ordinal()] = c;
      } catch (NoSuchFieldError var3) {
      }

      try {
         L[NLoginCore_419.d.ordinal()] = d;
      } catch (NoSuchFieldError var2) {
      }

      try {
         L[NLoginCore_419.c.ordinal()] = e;
      } catch (NoSuchFieldError var1) {
      }
   }
}
