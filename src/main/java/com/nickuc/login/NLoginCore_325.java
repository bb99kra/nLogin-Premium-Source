package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.util.UUID;
import javax.annotation.Nonnull;

public class NLoginCore_325 implements NLoginInterface_019<UUID> {
   public static final NLoginCore_325 a = new NLoginCore_325();

   public UUID a(@Nonnull JSONObject var1) {
      String var2 = NLoginCore_028.a.a(var1);
      return NLoginCore_432.c(var2);
   }

   @Override
   public Class<?> a() {
      return UUID.class;
   }

   public JSONObject a(@Nonnull UUID var1) {
      return NLoginCore_028.a.a(NLoginCore_432.b(var1));
   }
}
