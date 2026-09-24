package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;

// $VF: synthetic class
class χΔησΓμΔΨΠ {
   private static int a = 131072 >>> 17 | 131072 << ~17 + 1;
   private static int b = Integer.reverse(1073741824);

   static {
      try {
         b[LoginType.REGISTER.ordinal()] = a;
      } catch (NoSuchFieldError var2) {
      }

      try {
         b[LoginType.LOGIN.ordinal()] = b;
      } catch (NoSuchFieldError var1) {
      }
   }
}
