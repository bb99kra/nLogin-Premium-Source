package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;

// $VF: synthetic class
class NLoginType_026 {
   private static int a = (1 >>> 192 | 1 << -192) & -1;
   private static int c = Integer.reverse(-1073741824);
   private static int e = (1310720 >>> 242 | 1310720 << ~242 + 1) & -1;
   private static int d = 4194304 >>> 84 | 4194304 << -84;
   private static int b = 128 >>> 166 | 128 << ~166 + 1;

   static {
      try {
         ah[SpawnType.JOIN.ordinal()] = a;
      } catch (NoSuchFieldError var5) {
      }

      try {
         ah[SpawnType.FIRST_JOIN.ordinal()] = b;
      } catch (NoSuchFieldError var4) {
      }

      try {
         ah[SpawnType.LOGIN.ordinal()] = c;
      } catch (NoSuchFieldError var3) {
      }

      try {
         ah[SpawnType.REGISTER.ordinal()] = d;
      } catch (NoSuchFieldError var2) {
      }

      try {
         ah[SpawnType.RESPAWN.ordinal()] = e;
      } catch (NoSuchFieldError var1) {
      }
   }
}
