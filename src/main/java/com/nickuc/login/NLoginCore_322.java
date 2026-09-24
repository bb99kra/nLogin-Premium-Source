package com.nickuc.login;

import com.nickuc.login.lib.argon2.Argon2Factory;
import com.nickuc.login.lib.argon2.Argon2Factory.Argon2Types;

public class NLoginCore_322 extends NLoginCore_491 {
   public NLoginCore_322() {
      super(Argon2Factory.create(Argon2Types.ARGON2i));
   }
}
