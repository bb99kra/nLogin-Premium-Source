package com.nickuc.login;

import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.plugin.PluginDescription;
import com.velocitypowered.api.proxy.ProxyServer;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_500 implements NLoginInterface_040 {
   private static String[] ZKM_STR_A = new String[NLoginCore_500.e];
   private final ProxyServer e;
   private static String[] ZKM_STR_B = new String[NLoginCore_500.f];
   private final NLoginInterface_006 c;
   private static int b = (0 >>> 102 | 0 << ~102 + 1) & -1;
   private final NLoginCore_455 d;
   private static int a = 0 >>> 0 | 0 << -0;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static int c = (-1 >>> 100 | -1 << -100) & -1;
   private static long d = Long.reverse(1940044231534033297L);
   private static long c;
   private static int e = 1073741824 >>> 254 | 1073741824 << -254;

   @Override
   public NLoginCore_277 a(Object var1) {
      return NLoginCore_420.a(this.d, this.e, var1);
   }

   @Override
   public NLoginInterface_021 a(NLoginCore_168<?> var1) {
      return new NLoginCore_191(this.e, var1);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_500.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.A("÷ęěûğľĶŌĸćŅĻŉŃČıœŒŊŐŊğ", (byte)40, 65), NLoginCore_500.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.C("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬߞߴ߷ߡߵߴࠆ߸ࠊ߽ࠃࠐࠐࠉ҆", (byte)40, 67) + var1 + NLoginCore_141.E("Ԟ", (byte)40, 69) + var2.toString(), var4
         );
      }
   }

   @Generated
   @Override
   public NLoginInterface_006 a() {
      return this.c;
   }

   @Override
   public NLoginCore_277 a(String var1) {
      return NLoginCore_420.a(this.d, this.e, var1);
   }

   @Override
   public PluginInfoModel[] a() {
      Collection var1 = this.e.getPluginManager().getPlugins();
      PluginInfoModel[] var2 = new PluginInfoModel[var1.size()];
      int var3 = a;

      for (PluginContainer var5 : var1) {
         PluginDescription var6 = var5.getDescription();
         var2[var3++] = new PluginInfoModel(var6.getId(), var6.getVersion().orElse(a(b & c, d)), var6.getAuthors(), (Path)var6.getSource().orElse(null));
      }

      return var2;
   }

   @Override
   public boolean j(String var1) {
      return this.e.getPluginManager().isLoaded(var1);
   }

   @Generated
   public NLoginCore_500(NLoginCore_455 var1, ProxyServer var2, NLoginInterface_006 var3) {
      this.d = var1;
      this.e = var2;
      this.c = var3;
   }

   @Override
   public NLoginCore_277 a(UUID var1) {
      return this.e.getPlayer(var1).map(this::a).orElse(null);
   }

   @Nullable
   @Override
   public NLoginCore_081 a(String var1) {
      return this.e.getPluginManager().getPlugin(var1).map(var0 -> {
         PluginDescription var1x = var0.getDescription();
         Object var2 = var0.getInstance().map(var0x -> (PluginContainer)var0x).orElse(var0);
         return new NLoginCore_081((String)var1x.getName().orElse(null), (String)var1x.getVersion().orElse(null), var2);
      }).orElse(null);
   }

   private static void b() {
      c = -8530516275773425827L;
      long var0 = c ^ 8695300948959298820L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(33 + 35),
               69,
               (byte)(65 + 18),
               (byte)(32 + 15),
               (byte)(62 + 5),
               (byte)(49 + 17),
               (byte)(64 + 3),
               (byte)(26 + 21),
               (byte)(13 + 67),
               (byte)(24 + 51),
               (byte)(2 + 65),
               (byte)(20 + 63),
               (byte)(18 + 35),
               (byte)(61 + 19),
               (byte)(39 + 58),
               (byte)(52 + 48),
               (byte)(81 + 19),
               (byte)(36 + 69),
               110,
               (byte)(58 + 45)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
      byte[] var4 = new byte[8];
      var4[0] = (byte)(var0 >>> 56);

      for (int var5 = 1; var5 < 8; var5++) {
         var4[var5] = (byte)(var0 << var5 * 8 >>> 56);
      }

      var2.init(2, var3.generateSecret(new DESKeySpec(var4)), new IvParameterSpec(new byte[8]));
      byte var7 = 1;

      for (int var6 = 0; var6 < var7; var6++) {
         switch (var6) {
            case 0:
               ZKM_STR_B[0] = NLoginCore_138.B("ĕýĖĀþûĬĜìñĒ÷", (byte)24, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.D("шѤѩхѳћвѥљчћюѲђѕ҄ріњҀр҉ѐё", (byte)24, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_451.D("жуѰѬѓѮчжѻѭћѽҀйѵњ҃оцђј҉ѐё", (byte)24, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_553.B("ĆøÿěĜąįêçĞĊĭċĂĨĠĘôøĲĥĕĂă", (byte)24, 66);
         }
      }
   }

   @Override
   public Collection<NLoginCore_277> c() {
      return this.e.getAllPlayers().stream().map(this::a).collect(Collectors.toList());
   }

   private static String a(int var0, long var1) {
      var1 ^= 5L;
      var1 ^= 8695300948959298820L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(40 + 29),
                     (byte)(56 + 27),
                     (byte)(41 + 6),
                     (byte)(55 + 12),
                     (byte)(8 + 58),
                     (byte)(46 + 21),
                     47,
                     (byte)(66 + 14),
                     (byte)(2 + 73),
                     (byte)(53 + 14),
                     (byte)(57 + 26),
                     (byte)(19 + 34),
                     (byte)(6 + 74),
                     (byte)(29 + 68),
                     (byte)(99 + 1),
                     100,
                     (byte)(25 + 80),
                     (byte)(86 + 24),
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_127.A("ŪŷŶĹŹŵŰŹƄųŀžƂŻžƄņҸӎӑһӏӎӠӒӤӗӝӪӪӣ", (byte)68, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         ZKM_STR_A[var0] = new String(var3.doFinal(Base64.getDecoder().decode(ZKM_STR_B[var0])), StandardCharsets.UTF_8);
      }

      return ZKM_STR_A[var0];
   }

   @Override
   public void c() {
      this.e.shutdown();
   }

   static {
      b();
   }

   @Override
   public <T> T c() {
      return (T)this.e;
   }
}
