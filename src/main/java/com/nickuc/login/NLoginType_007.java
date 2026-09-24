package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.nLoginAPI.nLoginInternal;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import com.nickuc.login.tasks.SynchronizeWithServerThreadTask;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class NLoginType_007 extends NLoginType_006 {
   private static int bp = Integer.reverse(268435456);
   private static long au = Long.reverse(1914425674436061519L);
   private static int af = Integer.reverse(536870912);
   private static String[] c = new String[NLoginType_007.bo];
   private static long e;
   private final NLoginCore_155 a = new NLoginCore_155(this);
   private static int aa = 3145728 >>> 52 | 3145728 << -52;
   private static long j = Long.reverse(1873497444986126336L);
   private static long w = Long.reverse(1873497444986126336L);
   private static int u = '耀' >>> 'n' | 32768 << ~110 + 1;
   private static String[] d = new String[bp];
   private static long bi = Long.reverse(1914425674436061519L);
   private static long av = Long.reverse(1873497444986126336L);
   private static long v = Long.reverse(1914425674436061519L);
   private static int f = Integer.reverse(0);
   private static long t = Long.reverse(1873497444986126336L);
   private static long aj = Long.reverse(1873497444986126336L);
   private static int bo = Integer.reverse(268435456);
   private static long s = Long.reverse(1914425674436061519L);
   private static int aq = Integer.reverse(-1610612736);
   private static long as = Long.reverse(40928229449935183L);
   private static long ac = Long.reverse(40928229449935183L);
   private static long h = Long.reverse(1914425674436061519L);
   private static int at = '쀀' >>> 'M' | 49152 << -77;
   private static long ag = Long.reverse(1914425674436061519L);
   private static int q = (67108864 >>> 90 | 67108864 << ~90 + 1) & -1;
   private static long bj = Long.reverse(1873497444986126336L);
   private static int bg = (1792 >>> 104 | 1792 << -104) & -1;

   public void requestLogin(@Nonnull Identity var1, @Nonnull Object var2) {
      if (var2 == null) {
         throw new IllegalArgumentException(a(q, s ^ t));
      } else if (!(var2 instanceof Plugin)) {
         throw new IllegalArgumentException(a(u, v ^ w) + var2 + a(aa, ac) + Plugin.class + a(af, ag ^ aj));
      } else if (var1 == null) {
         throw new IllegalArgumentException(a(aq, as));
      } else if (!(var1 instanceof NLoginCore_473)) {
         throw new IllegalArgumentException(a(at, au ^ av) + NLoginCore_473.class.getCanonicalName() + a(bg, bi ^ bj) + var1.getClass().getCanonicalName());
      } else {
         String var3 = this.b(var1);
         NLoginCore_277 var4 = this.a.b().a(var3);
         if (var4 != null) {
            Runnable var5 = () -> this.a.b().a().c(var4, this.a.a().b(var4));
            if (Bukkit.getServer().isPrimaryThread() && !NLoginCore_012.V()) {
               var5.run();
            } else {
               var4.a().a(new SynchronizeWithServerThreadTask(var5));
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_007.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.F("՝տցաօֲ֤֜֞խ֫֡֯֩ղְְֶָֹ֗օ", (byte)121, 70), NLoginType_007.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.E("֥֤֘էֲ֧֣֧֞֡ծְֲ֬֩֬մऍऎअऊऒࣟऎ࣠ࣴक࣫ࣥ\u058c", (byte)121, 69) + var1 + NLoginCore_575.A("ƫ", (byte)121, 65) + var2.toString(), var4
         );
      }
   }

   @Nonnull
   public nLoginInternal internal() {
      return this.a;
   }

   private static void b() {
      e = -967036418472375976L;
      long var0 = e ^ 5928336535419652815L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(64 + 4),
               (byte)(18 + 51),
               (byte)(17 + 66),
               (byte)(15 + 32),
               67,
               (byte)(31 + 35),
               (byte)(6 + 61),
               (byte)(16 + 31),
               (byte)(44 + 36),
               (byte)(29 + 46),
               (byte)(23 + 44),
               (byte)(18 + 65),
               (byte)(51 + 2),
               (byte)(12 + 68),
               (byte)(62 + 35),
               (byte)(66 + 34),
               (byte)(96 + 4),
               (byte)(38 + 67),
               (byte)(39 + 71),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(39 + 29), 69, 83}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_387.C("ԥՂԛՂԈԥԅՉԺՏԭԒԾԧԷԖՈԷՑԖԖՎ՞Շ՛Ջ՛ԱԺԠԤՈ՚ԣԽաՄԵԨգՊՏ՜Է", (byte)94, 67);
               d[1] = NLoginCore_127.A("ƦƧƩƋƎŴŹƋƔƑƹƛƹưƯƑƺƣƜƶưƼƇƳƆƝƘƁƫƎǌƊƟƳǒǈǓƺƗƘƳƭƮƣ", (byte)94, 65);
               d[2] = NLoginCore_521.A("ƦƧƩƋƎŴŹƋƔƑƸǀƜƹŸžƷơƠƱƶƖƕƴƽƋǂǋƦƌǊƅ", (byte)94, 65);
               d[3] = NLoginCore_387.B("ƌƃƯƑƔƋŹƒŮƊƫƹƟƌƊƢƵƃƻƓƾƵƪƃƢƼƄƷǄƥưǋƳƵƷƤƯǒƱƔǓǌƪƣ", (byte)94, 66);
               d[4] = NLoginCore_397.F("֓ձ֑հ֖զՓՐ։զթբ", (byte)94, 70);
               d[5] = NLoginCore_559.D("ԘԴԫԖԩԤՏԙՏՉԤՍՕԾՆԑՓԫՌՐԲԼՕ՜ԶԼԛԚՃԴՏՄՔԛԧ՚ԩախթՑՆհԷ", (byte)94, 68);
               d[6] = NLoginCore_433.D("ԘԴԫԖԩԤՏԙՏՉԣ\u0530ԋԎՊՏՇԥԔԑԗԝԯ՝ԘԪԯ՚ՍՁ՜ՅզԵ\u0558ՊԻէաԭ՞ԽՂԷ", (byte)94, 68);
               d[7] = NLoginCore_223.D("ԁԜՄՇԆՊԖՁԱԊՀԣ\u0530ԲԖԴՙՃՆՐՇՋԢԣ", (byte)94, 68);
               break;
            case 1:
               d[0] = NLoginCore_324.E("հ֍զ֍ՓհՐ֔օ֚ո՝։ղւա֓ւ֜աա֦֖֦֙֩֒ռօիկ֓ի֝֊֡֯քֲֲղ֪մւ", (byte)94, 69);
               d[1] = NLoginCore_127.E("օֆֈժխՓ\u0558ժճհ֘պ֘֏֎հ֙ւջ֕֏֛զ֒եռշՠ֊խ֫թֈֲ֪֫֯֒չֺ֮ճ֙ֈֺׁ֞ս֓պִ֛֖\u0590֍֎", (byte)94, 69);
               d[2] = NLoginCore_232.C("ԺԻԽԟԢԈԍԟԨԥՌՔ\u0530ՍԌԒՋԵԴՅՊԯԩԸԭ\u0557ՔՋԮ\u0530ՂէԽԟՋ՛բ՟ՀԼխԨԱԷ", (byte)94, 67);
               d[3] = NLoginCore_201.F("իբ֎հճժ\u0558ձՍթ֊֘վիթց֔բ֚ղ֝֔։բց֛գ֖֣ք֏֪֯օրևղ֢\u0590֚֯ո֕ւ", (byte)94, 70);
               d[4] = NLoginCore_076.A("ƁƦƑƣƍƶƈƬŸƉƖƃ", (byte)94, 65);
               d[5] = NLoginCore_387.D("ԘԴԫԖԩԤՏԙՏՉԤՍՕԾՆԑՓԫՌՐԲԼՕ՜ԶԼԛԚՃԴՏՄ՟ՆՊ\u0558ԨԺՃՠՉԣհԷ", (byte)94, 68);
               d[6] = NLoginCore_451.F("գտնամկ֚դ֚֔ծջՖՙ֚֕֒հ՟՜բըպ֨գյպ֥֘\u058c֧\u0590տ\u058cձ֍֨ճֆַճ֍ִ֝֊ִ֫־ցֶַׁ֛֤֍֎", (byte)94, 70);
               d[7] = NLoginCore_138.B("ŭƈưƳŲƶƂƭƝŶƯƏƱƠżƵƳƃžƗƐơƎƏ", (byte)94, 66);
               break;
            case 2:
               d[0] = NLoginCore_173.B("ƂƁƵƎƸƒƔŵƍƩƗŵǁƲƙƱƬƎƂƙƱǇƎƏ", (byte)94, 66);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_530.C("ԓԩԾԗԌՁԞՍԇԦԡԦԭԢԈ\u0558ԔԖՂԨՄԥԢԣ", (byte)94, 67);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= 5928336535419652815L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(36 + 33),
                     (byte)(80 + 3),
                     (byte)(36 + 11),
                     (byte)(39 + 28),
                     (byte)(34 + 32),
                     (byte)(14 + 53),
                     (byte)(29 + 18),
                     (byte)(76 + 4),
                     (byte)(39 + 36),
                     (byte)(10 + 57),
                     (byte)(49 + 34),
                     (byte)(46 + 7),
                     80,
                     (byte)(18 + 79),
                     (byte)(79 + 21),
                     (byte)(79 + 21),
                     (byte)(11 + 94),
                     110,
                     (byte)(68 + 35)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(15 + 68)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_453.C("ӕӢӡҤӤӠӛӤӯӞҫөӭӦөӯұࡊࡋࡂࡇࡏࠜࡋࠝ࠱ࡒࠨࠢ", (byte)63, 67));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   public NLoginType_007(NLoginType_008 var1) {
      super(var1);
   }

   static {
      b();
   }

   public Optional<Location> getSpawnLocation(@Nonnull SpawnType var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(f, h ^ j));
      } else {
         NLoginType_016 var2 = NLoginType_016.a(var1);
         org.bukkit.Location var3 = NLoginCore_393.a(this.a.a().a().k(var2.aE()));
         if (var3 == null) {
            return Optional.empty();
         } else {
            NLoginCore_457 var4 = new NLoginCore_457(var3.getWorld().getName(), var3.getX(), var3.getY(), var3.getZ(), var3.getYaw(), var3.getPitch());
            return Optional.of(var4);
         }
      }
   }
}
