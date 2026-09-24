package com.nickuc.login;

import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.ServerInfo;
import com.velocitypowered.api.util.ProxyVersion;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_516 implements NLoginInterface_026 {
   private static String[] b = new String[NLoginCore_516.t];
   private static int b = (0 >>> 101 | 0 << ~101 + 1) & -1;
   private static int c = Integer.reverse(0);
   private static int m = Integer.reverse(-1073741824);
   private static int t = (41943040 >>> 183 | 41943040 << -183) & -1;
   private static int g = Integer.reverse(-1);
   private static long h = Long.reverse(-2985419875947495063L);
   private static long d = Long.reverse(329229449797189993L);
   private static int j = Integer.reverse(1073741824);
   private static int p = (32 >>> 3 | 32 << -3) & -1;
   private static long c;
   private static int s = Integer.reverse(-1610612736);
   private static int o = Integer.reverse(0);
   private static long n = Long.reverse(-2985419875947495063L);
   private static String[] a = new String[s];
   private static long q = Long.reverse(329229449797189993L);
   private final NLoginCore_455 a;
   private static int k = -1 >>> 84 | -1 << ~84 + 1;
   private static long e = Long.reverse(-3314649325744685056L);
   private static int f = (128 >>> 199 | 128 << ~199 + 1) & -1;
   private static int i = Integer.reverse(0);
   private static long r = Long.reverse(-3314649325744685056L);
   private static int a = 0 >>> 98 | 0 << ~98 + 1;
   private static long l = Long.reverse(-2985419875947495063L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_516.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.A("ÑóõÕùĘĐĦĒáğĕģĝæċĭĬĤĪĤù", (byte)21, 65), NLoginCore_516.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.F("ԴՁՀԃՃԿԺՃՎԽԊՈՌՅՈՎԐ\u0897\u0895࢜ࢠ࢙ࢂࢯࢠࢦԥ", (byte)21, 70) + var1 + NLoginCore_141.E("ԋ", (byte)21, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   public NLoginInterface_013 a() {
      return new NLoginCore_328(this.a);
   }

   private static String a(int var0, long var1) {
      var1 ^= 75L;
      var1 ^= -5014730474369604794L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(8 + 61),
                     83,
                     (byte)(23 + 24),
                     (byte)(13 + 54),
                     (byte)(15 + 51),
                     (byte)(13 + 54),
                     (byte)(16 + 31),
                     (byte)(18 + 62),
                     (byte)(29 + 46),
                     (byte)(50 + 17),
                     (byte)(36 + 47),
                     (byte)(44 + 9),
                     (byte)(72 + 8),
                     (byte)(2 + 95),
                     (byte)(29 + 71),
                     (byte)(68 + 32),
                     (byte)(2 + 103),
                     (byte)(103 + 7),
                     (byte)(25 + 78)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.A("ŴƁƀŃƃſźƃƎŽŊƈƌƅƈƎŐӗӕӜӠәӂӯӠӦ", (byte)73, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         a[var0] = new String(var3.doFinal(Base64.getDecoder().decode(b[var0])), StandardCharsets.UTF_8);
      }

      return a[var0];
   }

   @Override
   public void j() {
      this.a.j();
   }

   @Override
   public NLoginInterface_040 a() {
      ProxyServer var1 = this.a.a();
      return new NLoginCore_500(this.a, var1, NLoginCore_149.a(var1, var1.getConsoleCommandSource()));
   }

   @Override
   public NLoginInterface_034[] a() {
      return this.a.a();
   }

   @Override
   public boolean e(String var1) {
      return (boolean)o;
   }

   @Override
   public NLoginInterface_013 b() {
      return new NLoginCore_008(this.a, this.a.a());
   }

   @Override
   public NLoginInterface_047 a() {
      return new NLoginCore_390(this.a);
   }

   @Override
   public void i() {
      this.a.i();
   }

   @Override
   public void U() {
      NLoginCore_370.a(this.a, (boolean)a, (boolean)b);
   }

   @Override
   public void T() {
      this.a.T();
   }

   private static void b() {
      c = -7601439360259094240L;
      long var0 = c ^ -5014730474369604794L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(19 + 49),
               (byte)(33 + 36),
               (byte)(24 + 59),
               (byte)(17 + 30),
               (byte)(43 + 24),
               (byte)(65 + 1),
               (byte)(14 + 53),
               (byte)(28 + 19),
               (byte)(63 + 17),
               75,
               (byte)(34 + 33),
               (byte)(51 + 32),
               (byte)(41 + 12),
               (byte)(52 + 28),
               97,
               (byte)(59 + 41),
               (byte)(79 + 21),
               (byte)(16 + 89),
               (byte)(83 + 27),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(67 + 1), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_559.D("ՀԚԱԯԟԭԨՃԑՅՆԝ", (byte)96, 68);
               b[1] = NLoginCore_110.F("֎֑Չ֑֘֓դ֖֍֊՞դ", (byte)96, 70);
               b[2] = NLoginCore_232.B("ƖƤƪŶƏųƍſƜŽƝƣƀŽżơƤơƂǉƅƕƒƓ", (byte)96, 66);
               b[3] = NLoginCore_091.A("ƣƵŰƎŸƹƬŷƭŽƸƇ", (byte)96, 65);
               b[4] = NLoginCore_091.C("ՁՉԂՃԬԌԪՔՆԕԓԝ", (byte)96, 67);
               break;
            case 1:
               b[0] = NLoginCore_241.A("ƊƦƉƜƏƽŽƪƛƌŽƇ", (byte)96, 65);
               b[1] = NLoginCore_575.D("ԭԭԐԎԒԤԡՃԟՐԴԝ", (byte)96, 68);
               b[2] = NLoginCore_223.B("ƖƤƪŶƏųƍſƜŽƛƾƶƹƿƁǄƂƵǋƾƥƒƓ", (byte)96, 66);
               b[3] = NLoginCore_387.A("ƢƚƊƤƫƼŷƘŹƌƢƇ", (byte)96, 65);
               b[4] = NLoginCore_076.D("ԾՉՃԎԐԮՀԯՉԫՖԝ", (byte)96, 68);
               break;
            case 2:
               b[0] = NLoginCore_433.C("ԸՄՎԎՎՐՏՀՉՒԐԢԵԔԵՆՉՠԱԯՂԫԨԩ", (byte)96, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_141.C("ԿԼՂԨԄԣՏՃՄԡԗԨՆ\u0557ԪՐԜԴԳԙ՟ՓԽՃՏԹԸՇԦգԸբ", (byte)96, 67);
         }
      }
   }

   @Override
   public NLoginInterface_022 a(boolean var1) {
      return new NLoginCore_386(this.a.a());
   }

   @Generated
   public NLoginCore_516(NLoginCore_455 var1) {
      this.a = var1;
   }

   @Override
   public NLoginCore_364 a() {
      ProxyVersion var1 = this.a.a().getVersion();
      return new NLoginCore_364(
         var1.getName(), var1.getVersion(), var1.getVersion() + a(c, d ^ e) + var1.getVendor() + a(f & g, h), NLoginCore_419.d, (boolean)i
      );
   }

   @Override
   public void O() {
      this.a.O();
   }

   @Override
   public void V() {
      try {
         Collection var1 = this.a.a().getAllServers();
         if (var1 != null && !var1.isEmpty()) {
            List var2 = var1.stream().map(var0 -> {
               ServerInfo var1x = var0.getServerInfo();
               return var1x.getName() + a(p, q ^ r) + var1x.getAddress();
            }).collect(Collectors.toList());
            this.a.c.a().a().a(a(j & k, l), String.join(a(m, n), var2));
         }
      } catch (NoSuchMethodError var3) {
      }
   }

   static {
      b();
   }
}
