package patcher;

import java.nio.charset.StandardCharsets;

public final class NLoginApiForge {
   private static final byte[] EMPTY = new byte[0];
   private static final byte[] SESSION_BODY = "{\"session\":{\"id\":900001,\"token\":\"offlineTok7XmQ2pL9vR4nK8wZ3hJ\"},\"server\":{\"id\":\"offlineSrv01\",\"secret\":\"offlineSec8Kp2mN5qT1vY6wX\"}}"
      .getBytes(StandardCharsets.UTF_8);
   private static final byte[] REFRESH_BODY = "{\"signature\":\"0000000000000000000000000000000000000000000000000000000000000000\",\"address\":\"127.0.0.1\",\"plugin\":{\"latest\":{\"version\":\"2.0.18\",\"checksum\":\"0000000000000000000000000000000000000000000000000000000000000000\",\"build\":\"offline\",\"type\":1,\"url\":\"https:\\/\\/repo.nickuc.com\\/files\\/latest\\/nLogin.jar\",\"signature-url\":\"https:\\/\\/repo.nickuc.com\\/files\\/latest\\/nLogin.jar.asc\"},\"extra\":{\"rfrequency\":300,\"mfrequency\":600}},\"license\":{\"status\":9}}"
      .getBytes(StandardCharsets.UTF_8);

   private NLoginApiForge() {
   }

   public static boolean shouldForge(String var0) {
      return var0 == null ? false : var0.contains("plugin/session") || var0.contains("plugin/refresh") || var0.contains("plugin/send");
   }

   public static byte[] bodyFor(String var0) {
      if (var0 == null) {
         return EMPTY;
      } else if (var0.contains("plugin/session")) {
         return (byte[])SESSION_BODY.clone();
      } else if (var0.contains("plugin/send")) {
         return EMPTY;
      } else {
         return var0.contains("plugin/refresh") ? (byte[])REFRESH_BODY.clone() : EMPTY;
      }
   }

   public static int statusFor(String var0) {
      return var0 != null && var0.contains("plugin/session") ? 201 : 200;
   }
}
