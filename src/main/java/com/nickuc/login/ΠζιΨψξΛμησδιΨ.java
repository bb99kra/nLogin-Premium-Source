package com.nickuc.login;

import com.nickuc.login.lib.bcrypt.BCrypt;
import com.nickuc.login.lib.bcrypt.BCrypt.Version;

public class ΠζιΨψξΛμησδιΨ extends ρφτηκξεηωεδξψρψ {
   public ΠζιΨψξΛμησδιΨ() {
      super(BCrypt.with(Version.VERSION_BC));
   }
}
