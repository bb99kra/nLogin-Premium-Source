package com.nickuc.login;

import com.nickuc.login.loader.platform.VelocityLoader;

public interface ωΩΩαομοΣψΩ extends μΓμρΨπζνιφφβΩΛΓ {
   @Override
   default void a(Object var1) {
      νεΓτεκΓηζεΔλιΩ var2 = (νεΓτεκΓηζεΔλιΩ)var1;
      VelocityLoader var3 = var2.a();
      var3.getServer().getEventManager().register(var3, this);
   }
}
