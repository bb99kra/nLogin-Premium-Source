package com.nickuc.login.api.types;

import com.nickuc.login.api.enums.AccountType;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import lombok.Generated;

public class AccountDataImpl implements AccountData {
   @Nullable
   private final Long id;
   private final AccountType accountType;
   private final String lastName;
   @Nullable
   private final UUID uniqueId;
   @Nullable
   private final UUID mojangId;
   @Nullable
   private final UUID bedrockId;
   @Nullable
   private final String hashedPassword;
   private final String lastIP;
   private final long lastLogin;
   private final long creationDate;
   @Nullable
   private final String email;
   @Nullable
   private final String discordId;
   private final Map<String, Object> copyOfSettings;

   @Override
   public Optional<Long> getId() {
      return Optional.ofNullable(this.id);
   }

   @Nonnull
   @Override
   public AccountType getType() {
      return this.accountType;
   }

   @Nonnull
   @Override
   public String getLastName() {
      return this.lastName;
   }

   @Override
   public Optional<UUID> getUniqueId() {
      return Optional.ofNullable(this.uniqueId);
   }

   @Override
   public Optional<UUID> getMojangId() {
      return Optional.ofNullable(this.mojangId);
   }

   @Override
   public Optional<UUID> getBedrockId() {
      return Optional.ofNullable(this.bedrockId);
   }

   @Override
   public Optional<String> getHashedPassword() {
      return Optional.ofNullable(this.hashedPassword);
   }

   @Nonnull
   @Override
   public String getLastIP() {
      return this.lastIP;
   }

   @Nonnull
   @Override
   public Instant getLastLogin() {
      return Instant.ofEpochMilli(this.lastLogin);
   }

   @Nonnull
   @Override
   public Instant getCreationDate() {
      return Instant.ofEpochMilli(this.creationDate);
   }

   @Override
   public Optional<String> getEmail() {
      return Optional.ofNullable(this.email);
   }

   @Override
   public Optional<String> getDiscordId() {
      return Optional.ofNullable(this.discordId);
   }

   @Nonnull
   @Override
   public Map<String, Object> getSettings() {
      return this.copyOfSettings;
   }

   @Generated
   public AccountDataImpl(
      @Nullable Long id,
      AccountType accountType,
      String lastName,
      @Nullable UUID uniqueId,
      @Nullable UUID mojangId,
      @Nullable UUID bedrockId,
      @Nullable String hashedPassword,
      String lastIP,
      long lastLogin,
      long creationDate,
      @Nullable String email,
      @Nullable String discordId,
      Map<String, Object> copyOfSettings
   ) {
      this.id = id;
      this.accountType = accountType;
      this.lastName = lastName;
      this.uniqueId = uniqueId;
      this.mojangId = mojangId;
      this.bedrockId = bedrockId;
      this.hashedPassword = hashedPassword;
      this.lastIP = lastIP;
      this.lastLogin = lastLogin;
      this.creationDate = creationDate;
      this.email = email;
      this.discordId = discordId;
      this.copyOfSettings = copyOfSettings;
   }

   @Generated
   @Override
   public String toString() {
      return "AccountDataImpl(id="
         + this.getId()
         + ", accountType="
         + this.accountType
         + ", lastName="
         + this.getLastName()
         + ", uniqueId="
         + this.getUniqueId()
         + ", mojangId="
         + this.getMojangId()
         + ", bedrockId="
         + this.getBedrockId()
         + ", hashedPassword="
         + this.getHashedPassword()
         + ", lastIP="
         + this.getLastIP()
         + ", lastLogin="
         + this.getLastLogin()
         + ", creationDate="
         + this.getCreationDate()
         + ", email="
         + this.getEmail()
         + ", discordId="
         + this.getDiscordId()
         + ", copyOfSettings="
         + this.copyOfSettings
         + ")";
   }
}
