package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.DumperOptions;
import com.nickuc.login.lib.snakeyaml.representer.Representer;

class NLoginCore_051 extends Representer {
   NLoginCore_051(NLoginCore_219 var1, DumperOptions var2) {
      super(var2);
      this.a = var1;
      this.representers.put(NLoginCore_103.class, var1x -> this.represent(((NLoginCore_103)var1x).d));
   }
}
