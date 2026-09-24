package com.nickuc.login.api.types;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.enums.AccountType;
import java.util.UUID;
import javax.annotation.Nonnull;

public interface Identity {
   @Nonnull
   static Identity ofKnownName(@Nonnull String knownName) {
      return nLoginAPI.getApi().internal().createIdentityFromKnownName(knownName);
   }

   static Identity ofOffline(@Nonnull String name) {
      return nLoginAPI.getApi().internal().createIdentity(name, null, null, AccountType.OFFLINE);
   }

   static Identity ofPremium(@Nonnull String name, @Nonnull UUID mojangId) {
      return nLoginAPI.getApi().internal().createIdentity(name, mojangId, null, AccountType.PREMIUM);
   }

   static Identity ofBedrock(@Nonnull String name, @Nonnull UUID bedrockId) {
      return nLoginAPI.getApi().internal().createIdentity(name, null, bedrockId, AccountType.BEDROCK);
   }
}
