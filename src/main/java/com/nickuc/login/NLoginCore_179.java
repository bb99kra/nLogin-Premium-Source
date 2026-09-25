package com.nickuc.login;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class NLoginCore_179 {
   private static int ak = Integer.reverse(268435456);
   private static long c;
   private static int g = (16777216 >>> 151 | 16777216 << -151) & -1;
   private static int aa = Integer.reverse(-1610612736);
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static String[] ZKM_STR_A = new String[NLoginCore_179.aj];
   private static long f = Long.reverse(1806859174016032129L);
   private static long ai = Long.reverse(8646911284551352320L);
   private static boolean az;
   private static int m = Integer.reverse(0);
   private static long ah = Long.reverse(6995005944746843521L);
   private static long ac = Long.reverse(8646911284551352320L);
   private static long ab = Long.reverse(6995005944746843521L);
   private static Field m;
   private static long ae = Long.reverse(6995005944746843521L);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static long k = Long.reverse(6995005944746843521L);
   private static int ag = Integer.reverse(-536870912);
   private static long af = Long.reverse(8646911284551352320L);
   private static String[] ZKM_STR_B = new String[ak];
   private static int h = -1 >>> 94 | -1 << ~94 + 1;
   private static int q = Integer.reverse(536870912);
   private static int p = (0 >>> 199 | 0 << ~199 + 1) & -1;
   private static int j = 3072 >>> 74 | 3072 << ~74 + 1;
   private static long s = Long.reverse(1806859174016032129L);
   private static int ad = Integer.reverse(1610612736);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static long i = Long.reverse(1806859174016032129L);
   private static int o = Integer.reverse(0);
   private static long l = Long.reverse(8646911284551352320L);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int r = Integer.reverse(-1);
   private static int b = Integer.reverse(0);
   private static int x = 0 >>> 115 | 0 << ~115 + 1;
   private static int c = Integer.reverse(-1);
   private static int a = Integer.reverse(0);
   private static int e = (256 >>> 104 | 256 << -104) & -1;
   private static int u = 0 >>> 196 | 0 << ~196 + 1;
   private static long d = Long.reverse(1806859174016032129L);
   private static int n = 2048 >>> 75 | 2048 << ~75 + 1;
   private static int aj = Integer.reverse(268435456);
   private static Field n;

   private static void b() {
      c = -9099093833387161466L;
      long var0 = c ^ 1986387054110919534L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(34 + 35),
               (byte)(46 + 37),
               47,
               (byte)(63 + 4),
               (byte)(19 + 47),
               (byte)(57 + 10),
               (byte)(30 + 17),
               (byte)(6 + 74),
               (byte)(33 + 42),
               67,
               (byte)(63 + 20),
               (byte)(20 + 33),
               (byte)(29 + 51),
               (byte)(10 + 87),
               (byte)(86 + 14),
               (byte)(64 + 36),
               (byte)(91 + 14),
               (byte)(29 + 81),
               (byte)(98 + 5)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(12 + 57), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_076.D("ѶюьњялѣхѶѡѦѫћҋҎҊѻчюќѲҔҏўѳѷѢє҈ѩҝҌѰҔѱѭѹҏҎҕ҂ѽқѮ", (byte)27, 68);
               ZKM_STR_B[1] = NLoginCore_092.B("þİĢùčĨĐóėîĔý", (byte)27, 66);
               ZKM_STR_B[2] = NLoginCore_427.E("ԊԺՌՉՁԝՀՁԐՔԢԟ", (byte)27, 69);
               ZKM_STR_B[3] = NLoginCore_446.E("ԦԚԚԅԽՃԵՑԔԖՋՏԸԓՎԿԭԘ\u0558ԷդԱԯՏԚգՀՉբլԼՋԨՀՀղԽխծ\u0558աՄՎԿ", (byte)27, 69);
               ZKM_STR_B[4] = NLoginCore_241.B("ĪĩëĒĂĤÿăèı÷ý", (byte)27, 66);
               ZKM_STR_B[5] = NLoginCore_575.C("ђѺьѡљђїѳҀѤѤ҄ѠьѠјъѫҒғѮѬљњ", (byte)27, 67);
               ZKM_STR_B[6] = NLoginCore_397.C("ђѺьѡљђїѳҀѤѤ҄ѠьѠјъѫҒғѮѬљњ", (byte)27, 67);
               ZKM_STR_B[7] = NLoginCore_201.F("ՇԟԝԫԠԌԴԖՇԲԸՓԨԛԺԯԷՖԿ՝ՅԱաՀԴԹՠթՌԪԭՙԺՎթԲժղՀկհեՉՇեսՑԵՀպփձՎտվՠեՇդժՠ֊\u0558Ռ\u0558՛Տ֏֎բ֊Ւըֈ֚Փ֓իըՑՠՠ՞՞֓սժի", (byte)27, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_433.E("ՇԟԝԫԠԌԴԖՇԲԷԼԬ՜՟՛ՌԘԟԭՃեՠԯՄՈԳԥՙԺծ՝խըԲՎՋԫՀ\u0557ԮաՂԿ", (byte)27, 69);
               ZKM_STR_B[1] = NLoginCore_110.D("ѬнљѴѣяѲѱѿкѷю", (byte)27, 68);
               ZKM_STR_B[2] = NLoginCore_324.F("ԝՆԜՀԵՉԫԔԬԓՐԟ", (byte)27, 70);
               ZKM_STR_B[3] = NLoginCore_091.D("ѕщщдѬѲѤҀухѺѾѧтѽѮќч҇ѦғѠўѾщҒѯѸґқѫѺѮѸҘғңҔѠѾҗѷґҧҀҍѽѭүү҅ұҥҢѹѺ", (byte)27, 68);
               ZKM_STR_B[4] = NLoginCore_559.F("ԣՌՂՇՎԬԷԮՒԦԪԟ", (byte)27, 70);
               ZKM_STR_B[5] = NLoginCore_027.E("ԣՋԝԲԪԣԨՄՑԵԳԯԷԓԿ\u0557ԘԽ՜բբԽԪԫ", (byte)27, 69);
               ZKM_STR_B[6] = NLoginCore_559.E("ԣՋԝԲԪԣԨՄՑԵԵԴԎ\u0557ԿՌԿՀբԝԠԽԪԫ", (byte)27, 69);
               ZKM_STR_B[7] = NLoginCore_201.F("ՇԟԝԫԠԌԴԖՇԲԸՓԨԛԺԯԷՖԿ՝ՅԱաՀԴԹՠթՌԪԭՙԺՎթԲժղՀկհեՉՇեսՑԵՀպփձՎտվՠեՇդժՠ֊\u0558Ռ\u0558՛Տ֏֎բ֊Ւըֈ֛օ֝ծպկ֚ն֍չ֔֓ժի", (byte)27, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.F("ԪԪԠԡԡՍՁԳԨՐԲԟ", (byte)27, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_575.E("ՑԟԻԜԟՉԳ\u0557ՀՈ\u0558ԟ", (byte)27, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_179.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.B("ěĽĿğŃŢŚŰŜīũşŭŧİŕŷŶŮŴŮŃ", (byte)58, 66), NLoginCore_179.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_004.E("ՙզեԨըդ՟ըճբԯխձժխճԵࣃ࣑࣓࢜ࢫ࣓ࢨ࣌ࣄ࣊ࣆՌ", (byte)58, 69) + var1 + NLoginCore_575.A("ĭ", (byte)58, 65) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 30L;
      var1 ^= 1986387054110919534L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(10 + 58),
                     (byte)(6 + 63),
                     (byte)(23 + 60),
                     (byte)(17 + 30),
                     (byte)(33 + 34),
                     (byte)(31 + 35),
                     (byte)(56 + 11),
                     47,
                     (byte)(75 + 5),
                     (byte)(55 + 20),
                     (byte)(14 + 53),
                     (byte)(79 + 4),
                     (byte)(5 + 48),
                     (byte)(28 + 52),
                     97,
                     (byte)(35 + 65),
                     (byte)(48 + 52),
                     (byte)(57 + 48),
                     (byte)(56 + 54),
                     (byte)(28 + 75)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.F("ջֈևՊ֊ֆց֊֕քՑ֏֓\u058c֏֕\u0557ࣥࢾ࣮ࣦࣳࣵ࣍ࣵ࣊࣬ࣨ", (byte)92, 70));
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

   private NLoginCore_179() {
   }

   static {
      b();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean f(Object var0) {
      if (az) {
         return ((m != null && n != null ? n : o) != 0);
      } else {
         boolean var12 = false /* VF: Semaphore variable */;

         int var8;
         label89: {
            int var15;
            try {
               var12 = true;
               Field[] var1 = var0.getClass().getDeclaredFields();
               int var2 = var1.length;

               for (int var3 = p; var3 < var2; var3++) {
                  Field var4 = var1[var3];
                  Class var5 = var4.getType();
                  if (!var5.isPrimitive() && var5.getPackage() != null && !var5.getPackage().getName().startsWith(a(q & r, s))) {
                     try {
                        var4.setAccessible((t != 0));
                     } catch (Throwable var13) {
                        continue;
                     }

                     Object var6 = var4.get(var0);
                     if (var6 != null) {
                        Field var7 = NLoginCore_546.a(var6.getClass(), SpigotReflectionUtil.GAME_PROFILE_CLASS, u);
                        if (var7 != null) {
                           m = var4;
                           n = var7;
                           var8 = v;
                           var12 = false;
                           break label89;
                        }
                     }
                  }
               }

               var15 = x;
               var12 = false;
            } finally {
               if (var12) {
                  az = (z != 0);
               }
            }

            az = (y != 0);
            return (var15 != 0);
         }

         az = (w != 0);
         return (var8 != 0);
      }
   }

   @Nullable
   public static Runnable a(Object var0, String var1, UUID var2, @Nullable NLoginCore_454 var3) {
      try {
         Field var4 = NLoginCore_546.a(var0.getClass(), UUID.class, a);
         if (var4 != null) {
            var4.set(var0, var2);
         }

         if (!NLoginCore_290.r) {
            if (!f(var0) && var4 == null) {
               throw new RuntimeException(a(b & c, d) + var2 + a(e, f) + var1 + a(g & h, i));
            }

            if (az && m != null && n != null) {
               return () -> {
                  try {
                     Object var4x = m.get(var0);
                     GameProfile var5x = new GameProfile(var2, var1);
                     if (var3 != null) {
                        var5x.getProperties().put(a(aa, ab ^ ac), new Property(a(ad, ae ^ af), var3.ce, var3.cf));
                     }

                     n.set(var4x, var5x);
                  } catch (IllegalAccessException var6) {
                     throw new RuntimeException(a(ag, ah ^ ai), var6);
                  }
               };
            }
         }
      } catch (Exception var5) {
         NLoginCore_370.c(a(j, k ^ l) + var1, var5);
      }

      return null;
   }
}
