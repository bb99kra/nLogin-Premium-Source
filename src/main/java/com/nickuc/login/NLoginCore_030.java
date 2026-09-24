package com.nickuc.login;

import com.nickuc.login.lib.bcrypt.BCrypt;
import com.nickuc.login.lib.bcrypt.BCrypt.Version;

public class NLoginCore_030 extends NLoginCore_128 {
   public NLoginCore_030() {
      super(BCrypt.with(Version.VERSION_BC));
   }
}
