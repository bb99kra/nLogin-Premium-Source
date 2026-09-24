package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.api.types.AccountDataImpl;

public class NLoginType_024 {
   public static AccountDataImpl from(ForceRegisterConfig var0) {
      return new AccountDataImpl(
         var0.a(),
         AccountType.convert(var0.a()),
         var0.i(),
         var0.a(),
         var0.getMojangId(),
         var0.getBedrockId(),
         var0.j(),
         var0.k(),
         var0.b(),
         var0.c(),
         var0.a().l(),
         var0.a().m(),
         var0.a().a()
      );
   }
}
