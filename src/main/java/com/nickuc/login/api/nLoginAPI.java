package com.nickuc.login.api;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.api.enums.DatabaseType;
import com.nickuc.login.api.enums.ImplementationType;
import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.event.internal.LockableEvent;
import com.nickuc.login.api.event.internal.LockableNewActionEvent;
import com.nickuc.login.api.types.AccountData;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface nLoginAPI {
   @Nonnull
   static nLoginAPI getApi() {
      return nLoginAPIHolder.getApi();
   }

   boolean isAvailable();

   @Nonnull
   String getVersion();

   int getApiVersion();

   @Nonnull
   ImplementationType getImplementationType();

   DatabaseType getDatabaseType();

   Optional<Location> getSpawnLocation(@Nonnull SpawnType var1);

   Optional<AccountData> getAccount(@Nonnull Identity var1);

   @Nonnull
   Iterator<AccountData> getAccounts();

   long getAccountCount();

   @Nonnull
   List<AccountData> getAccountsByIp(@Nonnull String var1);

   boolean isAuthenticated(@Nonnull Identity var1);

   boolean isAuthenticated(@Nonnull String var1);

   int getRemainingSeconds(@Nonnull Identity var1);

   /** @deprecated */
   default int getRemainingSeconds(@Nonnull String playerName) {
      return this.getRemainingSeconds(Identity.ofKnownName(playerName));
   }

   /** @deprecated */
   @Nullable
   default String getRealName(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(AccountData::getLastName).orElse(null);
   }

   /** @deprecated */
   @Nullable
   default String getHashedPassword(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).flatMap(AccountData::getHashedPassword).orElse(null);
   }

   /** @deprecated */
   @Nullable
   default String getAddress(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(AccountData::getLastIP).orElse(null);
   }

   /** @deprecated */
   @Nonnull
   default Instant getLastLogin(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(AccountData::getLastLogin).orElse(Instant.ofEpochMilli(0L));
   }

   /** @deprecated */
   default long getLastLoginUnix(@Nonnull String playerName) {
      return this.getLastLogin(playerName).toEpochMilli();
   }

   /** @deprecated */
   @Nonnull
   default Instant getRegisterDate(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(AccountData::getCreationDate).orElse(Instant.ofEpochMilli(0L));
   }

   /** @deprecated */
   default long getRegisterDateUnix(@Nonnull String playerName) {
      return this.getRegisterDate(playerName).toEpochMilli();
   }

   /** @deprecated */
   @Nullable
   default String getEmail(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).flatMap(AccountData::getEmail).orElse(null);
   }

   /** @deprecated */
   @Nullable
   default String getDiscord(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).flatMap(AccountData::getDiscordId).orElse(null);
   }

   /** @deprecated */
   default boolean hasEmail(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(account -> account.getEmail().isPresent()).orElse(false);
   }

   /** @deprecated */
   default boolean hasDiscord(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(account -> account.getDiscordId().isPresent()).orElse(false);
   }

   /** @deprecated */
   @Nonnull
   default String getLanguage(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(account -> account.getLanguage().orElse("other")).orElse("other");
   }

   boolean comparePassword(AccountData var1, String var2);

   /** @deprecated */
   default boolean comparePassword(String playerName, String plainPassword) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(account -> account.comparePassword(plainPassword)).orElse(false);
   }

   /** @deprecated */
   default boolean isRegistered(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).isPresent();
   }

   /** @deprecated */
   default boolean isPremium(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(AccountData::getType).orElse(null) == AccountType.PREMIUM;
   }

   /** @deprecated */
   default boolean isBedrock(@Nonnull String playerName) {
      return this.getAccount(Identity.ofKnownName(playerName)).map(AccountData::getType).orElse(null) == AccountType.BEDROCK;
   }

   void requestLogin(@Nonnull Identity var1, @Nonnull Object var2);

   /** @deprecated */
   default void requestLogin(@Nonnull String playerName, @Nonnull Object plugin) {
      this.requestLogin(Identity.ofKnownName(playerName), plugin);
   }

   default boolean performRegister(@Nonnull Identity identity, @Nonnull String plainPassword) {
      return this.performRegister(identity, plainPassword, null);
   }

   boolean performRegister(@Nonnull Identity var1, @Nonnull String var2, @Nullable String var3);

   /** @deprecated */
   default boolean performRegister(@Nonnull String playerName, @Nonnull String plainPassword) {
      return this.performRegister(Identity.ofKnownName(playerName), plainPassword, null);
   }

   /** @deprecated */
   default boolean performRegister(@Nonnull String playerName, @Nonnull String plainPassword, @Nullable String ip) {
      return this.performRegister(Identity.ofKnownName(playerName), plainPassword, ip);
   }

   boolean performUnregister(@Nonnull Identity var1);

   /** @deprecated */
   default boolean performUnregister(@Nonnull String playerName) {
      return this.performUnregister(Identity.ofKnownName(playerName));
   }

   boolean changePassword(@Nonnull Identity var1, @Nonnull String var2);

   /** @deprecated */
   default boolean changePassword(@Nonnull String playerName, @Nonnull String newPassword) {
      return this.changePassword(Identity.ofKnownName(playerName), newPassword);
   }

   boolean setEmail(@Nonnull Identity var1, @Nullable String var2);

   /** @deprecated */
   default boolean setEmail(@Nonnull String playerName, @Nullable String newEmail) {
      return this.setEmail(Identity.ofKnownName(playerName), newEmail);
   }

   boolean setDiscord(@Nonnull Identity var1, long var2);

   /** @deprecated */
   default boolean setDiscord(@Nonnull String playerName, long newAccountId) {
      return this.setDiscord(Identity.ofKnownName(playerName), newAccountId);
   }

   boolean setLanguage(@Nonnull Identity var1, @Nullable String var2);

   default boolean forceLogin(@Nonnull Identity identity) {
      return this.forceLogin(identity, true);
   }

   boolean forceLogin(@Nonnull Identity var1, boolean var2);

   /** @deprecated */
   default boolean forceLogin(@Nonnull String playerName) {
      return this.forceLogin(Identity.ofKnownName(playerName), true);
   }

   /** @deprecated */
   default boolean forceLogin(@Nonnull String playerName, boolean showMessages) {
      return this.forceLogin(Identity.ofKnownName(playerName), showMessages);
   }

   @Nonnull
   nLoginAPI.nLoginInternal internal();

   public interface nLoginInternal {
      void lockableNewAction(LockableNewActionEvent<?> var1);

      void lockableEvent(LockableEvent var1, byte var2, byte var3);

      Identity createIdentity(String var1, UUID var2, UUID var3, AccountType var4);

      Identity createIdentityFromKnownName(String var1);
   }
}
