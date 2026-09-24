package com.nickuc.login.api;

import com.nickuc.login.api.exception.nLoginNotLoadedException;
import javax.annotation.Nonnull;

public class nLoginAPIHolder {
   private static nLoginAPI api;

   public static void init(nLoginAPI api) {
      if (nLoginAPIHolder.api != null) {
         throw new IllegalStateException("Already set!");
      } else {
         nLoginAPIHolder.api = api;
      }
   }

   @Nonnull
   static nLoginAPI getApi() {
      if (api == null) {
         throw new nLoginNotLoadedException("nLoginAPI has not yet been instantiated, please wait to use api");
      } else {
         return api;
      }
   }
}
