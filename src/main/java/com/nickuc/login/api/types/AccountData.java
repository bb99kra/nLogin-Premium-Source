package com.nickuc.login.api.types;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.api.enums.AccountType;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nonnull;

public interface AccountData {
   Optional<Long> getId();

   @Nonnull
   AccountType getType();

   @Nonnull
   String getLastName();

   Optional<UUID> getUniqueId();

   Optional<UUID> getMojangId();

   Optional<UUID> getBedrockId();

   Optional<String> getHashedPassword();

   default boolean comparePassword(String plainPassword) {
      return nLoginAPI.getApi().comparePassword(this, plainPassword);
   }

   @Nonnull
   default String getLastAddress() {
      return this.getLastIP();
   }

   @Nonnull
   String getLastIP();

   @Nonnull
   Instant getLastLogin();

   @Nonnull
   Instant getCreationDate();

   Optional<String> getEmail();

   Optional<String> getDiscordId();

   @Nonnull
   Map<String, Object> getSettings();

   default Optional<String> getLanguage() {
      Object value = this.getSettings().get("language");
      return Optional.ofNullable(value instanceof String ? (String)value : null);
   }
}
