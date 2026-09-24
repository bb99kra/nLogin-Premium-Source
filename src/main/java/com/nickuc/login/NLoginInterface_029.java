package com.nickuc.login;

import com.nickuc.login.loader.platform.VelocityLoader;

public interface NLoginInterface_029 extends NLoginInterface_013 {
   @Override
   default void a(Object var1) {
      NLoginCore_455 var2 = (NLoginCore_455)var1;
      VelocityLoader var3 = var2.a();
      var3.getServer().getEventManager().register(var3, this);
   }
}
