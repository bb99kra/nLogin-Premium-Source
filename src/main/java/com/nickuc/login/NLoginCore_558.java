package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.tasks.LoginMainQueueTask;
import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class NLoginCore_558 implements NLoginInterface_018 {
   private static String[] ZKM_STR_B = new String[NLoginCore_558.x];
   private static int a = (0 >>> 136 | 0 << -136) & -1;
   private static int m = Integer.reverse(-1);
   private static int h = (1048576 >>> 211 | 1048576 << ~211 + 1) & -1;
   private static int x = Integer.reverse(-536870912);
   private static long r = Long.reverse(8073347853545759936L);
   private static int b = (0 >>> 55 | 0 << -55) & -1;
   private static long g = Long.reverse(8073347853545759936L);
   private static int v = Integer.reverse(0);
   private static long d = Long.reverse(8073347853545759936L);
   private static int w = Integer.reverse(-536870912);
   private final nLoginBukkit b;
   private static int k = 0 >>> 116 | 0 << -116;
   private static int l = (384 >>> 135 | 384 << ~135 + 1) & -1;
   private static int s = Integer.reverse(1610612736);
   private static long t = Long.reverse(8073347853545759936L);
   private static int f = (-1 >>> 32 | -1 << ~32 + 1) & -1;
   private static long j = Long.reverse(-3458764513820540928L);
   private static long n = Long.reverse(8073347853545759936L);
   private static String[] ZKM_STR_A = new String[w];
   private static int e = (524288 >>> 51 | 524288 << -51) & -1;
   private static int o = (1048576 >>> 82 | 1048576 << -82) & -1;
   private static long p = Long.reverse(8073347853545759936L);
   private static long i = Long.reverse(-6914631706343250752L);
   private static int u = (0 >>> 250 | 0 << ~250 + 1) & -1;
   private static long c;
   private static int q = Integer.reverse(-1610612736);

   private static void e() {
      c = 227294843008864261L;
      long var0 = c ^ -4917188553326520618L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(13 + 55),
               (byte)(38 + 31),
               (byte)(59 + 24),
               (byte)(5 + 42),
               (byte)(22 + 45),
               (byte)(21 + 45),
               67,
               (byte)(24 + 23),
               (byte)(20 + 60),
               (byte)(69 + 6),
               (byte)(36 + 31),
               (byte)(59 + 24),
               53,
               (byte)(54 + 26),
               (byte)(86 + 11),
               (byte)(23 + 77),
               (byte)(81 + 19),
               (byte)(65 + 40),
               (byte)(22 + 88),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, (byte)(11 + 72)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_183.F("ՋԓԴԦԷԸԯՇ՜ԱԹԭՙԠՉՎԷ\u0530\u0557ՄԤ\u0530ԭԮ", (byte)30, 70);
               ZKM_STR_B[1] = NLoginCore_397.E("ԮՑՑԞՓԩԢԶԍԕՋԨ՚ԚԹ\u0530՛Ց\u0558ԮԱՖԭԮ", (byte)30, 69);
               ZKM_STR_B[2] = NLoginCore_471.F("ԟԼԲԫԴՀԙԦԤՔԪԻԾՎՠՌ՟ԝԴԜՃ\u0530ԭԮ", (byte)30, 70);
               ZKM_STR_B[3] = NLoginCore_324.A("ôýćĐòĤĢćĘĩĐĿĻāēĤİĲŅĖĂķĎď", (byte)30, 65);
               ZKM_STR_B[4] = NLoginCore_453.F("ԋԩԣՕ\u0530ԹՓՕՐՆՋԫՏԻԓԚՙՑԟՄՏզԭԮ", (byte)30, 70);
               ZKM_STR_B[5] = NLoginCore_092.C("ѸлѾтљѼѼїҀѣшѧ҃ҍѮѡяѪѣёҋқљґҍѠҕғҢґҙҥ", (byte)30, 67);
               ZKM_STR_B[6] = NLoginCore_091.B("āĬĈéĎĭĔąĮĥĞă", (byte)30, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_004.F("ՋԓԴԦԷԸԯՇ՜ԱԹԼԛՙՠԪաԾՒՐ՟՟՚ԼԡԹեՁեթԻձ", (byte)30, 70);
               ZKM_STR_B[1] = NLoginCore_076.D("ѣ҆҆ѓ҈ўїѫтъҀѰѭҎҌ҉ѹљҘѫјѵѢѣ", (byte)30, 68);
               ZKM_STR_B[2] = NLoginCore_559.F("ԟԼԲԫԴՀԙԦԤՔԬԫԷաԯ\u0530ԫԭԺ՚ՒՀԭԮ", (byte)30, 70);
               ZKM_STR_B[3] = NLoginCore_471.D("шёћѤцѸѶћѬѽѣќ҅ѨѷҌҒѫљѻѶҞҒёѼҁѪѹџҢ҆ѡ", (byte)30, 68);
               ZKM_STR_B[4] = NLoginCore_141.F("ԋԩԣՕ\u0530ԹՓՕՐՆՎՖԱՌԙՕՂԮԣՂՅՀԭԮ", (byte)30, 70);
               ZKM_STR_B[5] = NLoginCore_127.F("ՃԆՉԍԤՇՇԢՋԮԓԲՎ\u0558ԹԬԚԵԮԜՖԧբԦ՞ՙգԺ՝զՏ՟", (byte)30, 70);
               ZKM_STR_B[6] = NLoginCore_027.D("ѩш҇ѺѩьѤҌџ҂ҏъѰҕьѢ҉җѣјҐқѢѣ", (byte)30, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_397.A("ĕīąÿĥēăĦĄĜüĲĳŁĬüĭďĞĤúŇĎď", (byte)30, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_091.E("ԼՇՃՃԴՀԤԸԖ՜ՊՊԳՠԾԳ՛ԟԼ՞՝ԻՁԸԧՙբ՝եաՒՂ", (byte)30, 69);
         }
      }
   }

   static {
      e();
   }

   @Override
   public boolean a() {
      return NLoginCore_195.e(this.b.a());
   }

   @Override
   public NLoginInterface_030 a() {
      return new NLoginCore_299(this.b);
   }

   private void d() {
      PluginManager var1 = this.b.a().getPluginManager();
      Plugin var2 = var1.getPlugin(a(l & m, n));
      if (var2 != null) {
         var1.disablePlugin(var2);
         File var3 = new File(this.b.c().getParentFile(), a(o, p));
         if (var3.exists() && !var3.delete()) {
            NLoginCore_370.d(a(q, r) + var3.getPath() + a(s, t));
         }
      }
   }

   public NLoginCore_447 a() {
      return new NLoginCore_447(this.b);
   }

   private static String a(int var0, long var1) {
      var1 ^= 11L;
      var1 ^= -4917188553326520618L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(59 + 9),
                     (byte)(55 + 14),
                     (byte)(78 + 5),
                     (byte)(24 + 23),
                     (byte)(34 + 33),
                     (byte)(3 + 63),
                     (byte)(30 + 37),
                     (byte)(38 + 9),
                     (byte)(21 + 59),
                     (byte)(28 + 47),
                     (byte)(45 + 22),
                     (byte)(34 + 49),
                     (byte)(42 + 11),
                     (byte)(11 + 69),
                     (byte)(7 + 90),
                     100,
                     100,
                     (byte)(81 + 24),
                     (byte)(35 + 75),
                     (byte)(70 + 33)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(3 + 65), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.B("ĆēĒÕĕđČĕĠďÜĚĞėĚĠâѦѫѫѸѯќѹѶѿѮѺ", (byte)18, 66));
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
   public NLoginCore_056 a() {
      return new NLoginCore_209(this.b.b(), this.b, (k != 0));
   }

   @Override
   public nLoginAPI a() {
      return new NLoginType_007(this.b.a());
   }

   @Generated
   public NLoginCore_558(nLoginBukkit var1) {
      this.b = var1;
   }

   private static Object f(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_558.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_384.A("¿áãÃçĆþĔĀÏčăđċÔùěĚĒĘĒç", (byte)12, 65), NLoginCore_558.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.D("мщшЋычтыіхВѐєэѐіИޜޡޡޮޥޒޯެ\u07b5ޤްЯ", (byte)12, 68) + var1 + NLoginCore_427.B("Ñ", (byte)12, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public void c() {
   }

   @Override
   public void b() {
      NLoginType_008 var1 = this.b.a();
      this.b.b().c().forEach(var0 -> var0.a(NLoginCore_150.a(NLoginCore_487.p, var0)));
      NLoginCore_478.a(this.b, (a != 0));
      NLoginCore_276 var2 = var1.a();
      var2.r();
      NLoginCore_535.a(this.b.b().a(), var2);
      LoginMainQueueTask.p(var1);
      this.b.b().c().forEach(var1x -> var1.b().a().c(var1x, var1.a().b(var1x)));
      NLoginCore_374.b(var1);
      NLoginCore_090.a.b(var1);
      NLoginCore_203 var3 = this.b.a().a();
      var3.a(a(b, d), var1.a().a());
      var3.a(a(e & f, g), NLoginCore_150.aC());
      var3.a(a(h, i ^ j), BCryptHashProvider.b().name().toLowerCase(Locale.ENGLISH));
      this.d();
   }
}
