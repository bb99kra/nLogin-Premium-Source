package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.util.UUID;
import javax.annotation.Nonnull;

public class κΠθισΠκΔθψψπΛλ implements ςνΛωΠθρπυΣμκΓΩο<UUID> {
   public static final κΠθισΠκΔθψψπΛλ a = new κΠθισΠκΔθψψπΛλ();

   public UUID a(@Nonnull JSONObject var1) {
      String var2 = μλωΨδΩΣΔα.a.a(var1);
      return λΣσΣκΓβΠΨ.c(var2);
   }

   @Override
   public Class<?> a() {
      return UUID.class;
   }

   public JSONObject a(@Nonnull UUID var1) {
      return μλωΨδΩΣΔα.a.a(λΣσΣκΓβΠΨ.b(var1));
   }
}
