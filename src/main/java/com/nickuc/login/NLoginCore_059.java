package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.LoaderOptions;
import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.constructor.Constructor;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_059 {
   private static int ak = Integer.reverse(-1);
   private static long ai = Long.reverse(864691128455135232L);
   private static int r = 3072 >>> 10 | 3072 << ~10 + 1;
   private static int a = Integer.reverse(0);
   private static int o = (8 >>> 162 | 8 << -162) & -1;
   private static int as = 0 >>> 243 | 0 << -243;
   private static int z = 196608 >>> 111 | 196608 << -111;
   private static long ae = Long.reverse(5790726819417952499L);
   private static int h = (0 >>> 244 | 0 << -244) & -1;
   private static long an = Long.reverse(5790726819417952499L);
   private static int x = (81920 >>> 206 | 81920 << -206) & -1;
   private static int p = -1 >>> 58 | -1 << -58;
   private static int au = Integer.reverse(805306368);
   private static long ab = Long.reverse(864691128455135232L);
   private static int ao = Integer.reverse(0);
   private static int ad = (-1 >>> 32 | -1 << -32) & -1;
   private static long j = Long.reverse(5790726819417952499L);
   private static final Yaml a = new Yaml(new Constructor(new LoaderOptions()));
   private static long w = Long.reverse(5790726819417952499L);
   private static long aq = Long.reverse(6655417947873087731L);
   private static int ap = Integer.reverse(-805306368);
   private static long y = Long.reverse(5790726819417952499L);
   private static int af = Integer.reverse(0);
   private static int c = (0 >>> 30 | 0 << -30) & -1;
   private static long aa = Long.reverse(6655417947873087731L);
   private static int i = Integer.reverse(-1);
   private static int v = 1 >>> 190 | 1 << ~190 + 1;
   private static int f = Integer.reverse(0);
   private static int b = 0 >>> 208 | 0 << -208;
   private static long c;
   private static int n = Integer.reverse(0);
   private static long m = Long.reverse(5790726819417952499L);
   private static int aj = (73728 >>> 109 | 73728 << -109) & -1;
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static long ar = Long.reverse(864691128455135232L);
   private static long ah = Long.reverse(6655417947873087731L);
   private static final long s = 2592000000L;
   private static long q = Long.reverse(5790726819417952499L);
   private static int ag = 128 >>> 100 | 128 << ~100 + 1;
   private static int am = Integer.reverse(1342177280);
   private static int l = (-1 >>> 78 | -1 << ~78 + 1) & -1;
   private static int ac = Integer.reverse(-536870912);
   private static int u = 0 >>> 160 | 0 << ~160 + 1;
   private static String[] ZKM_STR_B = new String[au];
   private static int at = Integer.reverse(805306368);
   private static long g = Long.reverse(5486945274691584L);
   private static String[] ZKM_STR_A = new String[at];
   private static int e = 0 >>> 244 | 0 << ~244 + 1;
   private static int d = Integer.reverse(0);
   private static long al = Long.reverse(5790726819417952499L);
   private static long t = Long.reverse(5790726819417952499L);

   private static void b() {
      c = -3528502785877001670L;
      long var0 = c ^ -6310219778306212681L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(5 + 63),
               (byte)(53 + 16),
               (byte)(17 + 66),
               (byte)(35 + 12),
               (byte)(55 + 12),
               (byte)(65 + 1),
               (byte)(25 + 42),
               (byte)(44 + 3),
               (byte)(76 + 4),
               (byte)(68 + 7),
               (byte)(18 + 49),
               (byte)(17 + 66),
               (byte)(49 + 4),
               (byte)(67 + 13),
               97,
               (byte)(91 + 9),
               100,
               (byte)(4 + 101),
               (byte)(23 + 87),
               (byte)(68 + 35)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(35 + 34), (byte)(81 + 2)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_241.F("\u0530ՋՊ\u0558Թ՛ՇՋԹ\u0530՚Տ՜Պԕՠ՛ԘԦԶաէ\u0557ԢԺիէՙԩՁԫբ", (byte)32, 70);
               ZKM_STR_B[1] = NLoginCore_446.E("ՈՈԔԑԢԦՐԩԦԵԿԤ", (byte)32, 69);
               ZKM_STR_B[2] = NLoginCore_433.F("ԲԷԭԩԧԱԑԓԦԞԕԒբՂԚԾՑԶՃե՞\u0558ԯ\u0530", (byte)32, 70);
               ZKM_STR_B[3] = NLoginCore_553.B("ġĵĎĩįûħĊĉğĲļĮĿįňěĦńėĭŋĒē", (byte)32, 66);
               ZKM_STR_B[4] = NLoginCore_387.F("\u0530ՃԧՋՅԩՄՄԓԦԿԤ", (byte)32, 70);
               ZKM_STR_B[5] = NLoginCore_559.D("ўѽцѯѳћђѣѵѢ҂ѝ", (byte)32, 68);
               ZKM_STR_B[6] = NLoginCore_027.F(
                  "ՒԴ\u0558ԭԷՎ\u0558ԤԝԸԞԷ՚ԞԬ\u0530ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆշ՚Մֆժժ։ֆգ՞աը֍խ\u0557֎֖֗յ՚ըհխ֕\u0558շ֛֖֘֞֩՟վ֧ռտնել֤կխֆ֣֯փ։֑յְ֚շնֹչֳ֯֠׃\u0590ׁ֖ׅփ֢֏\u0590",
                  (byte)32,
                  70
               );
               ZKM_STR_B[7] = NLoginCore_110.B("ĹòĦĎĵėýĳĠċĴć", (byte)32, 66);
               ZKM_STR_B[8] = NLoginCore_004.E("ՒԴ\u0558ԭԷՎ\u0558ԤԝԸԞԷ՚ԞԬ\u0530ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆըի\u058bք֍չ\u058bՎջց֎", (byte)32, 69);
               ZKM_STR_B[9] = NLoginCore_232.E("ՂԳԭԣՄԘԮԭՎՎԶՐԘԱԯԝ՛՜ՆԢ՟իթդՙՇՍԹՌՃ՟Ո", (byte)32, 69);
               ZKM_STR_B[10] = NLoginCore_559.F("ՖԏՃԫՒԴԚՐԽԨՑԤ", (byte)32, 70);
               ZKM_STR_B[11] = NLoginCore_110.C("ҋѭґѦѰ҇ґѝіѱїѰғїѥѩѭ҈ѻѝҟѼѮҥѰѵѺ҈ќѪҞҊҖүҟҧҥҞҭѮҶҟҫ҈Ѵҗ҄ҪҨѷҪѽѿңҰҏҦӁҖҢҵӋҹҾ", (byte)32, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_324.B("ēĮĭĻĜľĪĮĜēĽĲĿĭøŃľûĉęńĿŋĨĿęŏőĢĐĶčĊĦŔŃĵŒřļŒĠĪħ", (byte)32, 66);
               ZKM_STR_B[1] = NLoginCore_141.C("ѠѨьҏғщўҍѩѥѬѝ", (byte)32, 67);
               ZKM_STR_B[2] = NLoginCore_521.E("ԲԷԭԩԧԱԑԓԦԞԟՏԭ՜ԴՂՅԱՒՇԹՂԯ\u0530", (byte)32, 69);
               ZKM_STR_B[3] = NLoginCore_446.A("ġĵĎĩįûħĊĉğĲĴĿĥĚĺŃĢŅħĤĕĒē", (byte)32, 65);
               ZKM_STR_B[4] = NLoginCore_453.A("ĵĔăĵĖěýČķĻİńŀāğģĵĨėĦĭĥĒē", (byte)32, 65);
               ZKM_STR_B[5] = NLoginCore_387.D("ћѡў҄ґ҃ѱѣѦҗҒѝ", (byte)32, 68);
               ZKM_STR_B[6] = NLoginCore_201.F(
                  "ՒԴ\u0558ԭԷՎ\u0558ԤԝԸԞԷ՚ԞԬ\u0530ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆշ՚Մֆժժ։ֆգ՞աը֍խ\u0557֎֖֗յ՚ըհխ֕\u0558շ֛֖֘֞֩՟վ֧ռտնել֤կխֆ֣֯փ։֑յְ֚շնְֻ\u058bցսׅ֠֓փַָ֘֏\u0590",
                  (byte)32,
                  70
               );
               ZKM_STR_B[7] = NLoginCore_027.B("ĂëĒėĄĪĦĘēĝāć", (byte)32, 66);
               ZKM_STR_B[8] = NLoginCore_559.F("ՒԴ\u0558ԭԷՎ\u0558ԤԝԸԞԷ՚ԞԬ\u0530ԴՏՂԤզՃԵլԷԼՁՏԣԱեՑ՝նզծլեմԵսզղՏԻ՞ՋձկԾձՄՆզմ։Պգ՞՝\u058cձև՟", (byte)32, 70);
               ZKM_STR_B[9] = NLoginCore_004.A("ĥĖĐĆħûđĐııęĳûĔĒĀľĿĩąłĆĹħőŏĺĴĢĢĤŖĭŏĵŅŕśĩĝěŁŌħ", (byte)32, 65);
               ZKM_STR_B[10] = NLoginCore_183.E("ԯԯԠԹՏՌԣԥՕՕԯԤ", (byte)32, 69);
               ZKM_STR_B[11] = NLoginCore_453.D("ҋѭґѦѰ҇ґѝіѱїѰғїѥѩѭ҈ѻѝҟѼѮҥѰѵѺ҈ќѪҞҊҖүҟҧҥҞҭѮҶҟҫ҈Ѵҗ҄ҪҨѷҪѽѿҜҬѿҲҴҙ҇ҜӌҤӅ", (byte)32, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_575.D("юѣѾҎѳҁѨҁҎҁѯыѭҍҙѼҏѽҍ҂҃ҡѨѩ", (byte)32, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_091.C("ѽыќѬьѬѓѤџҏҖѝ", (byte)32, 67);
         }
      }
   }

   private static void a(NLoginInterface_011<?> var0, File var1) {
      File[] var2 = var1.listFiles();
      if (var2 != null) {
         File[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = f; var5 < var4; var5++) {
            File var6 = var3[var5];
            b(var0, var6);
         }
      }
   }

   public static void b(NLoginInterface_011<?> var0, File var1) {
      if (var1.isDirectory()) {
         a(var0, var1);
      } else if (NLoginCore_366.a(var1, g)) {
         if (NLoginCore_525.as()) {
            NLoginCore_370.b(a(h & i, j) + var1 + a(k & l, m));
         }

         if (!var1.delete()) {
            var1.deleteOnExit();
         }
      }
   }

   public static void c(NLoginInterface_011<?> var0, File var1) {
      NLoginCore_419 var2 = var0.b().a();
      String var3 = var2 == NLoginCore_419.c ? a(o & p, q) : a(r, t);
      String var4 = var0.a().f().getName();

      try {
         File[] var5 = var1.listFiles();
         if (var5 == null) {
            return;
         }

         File[] var6 = var5;
         int var7 = var5.length;

         for (int var8 = u; var8 < var7; var8++) {
            File var9 = var6[var8];
            if (!var9.isDirectory()) {
               String var10 = var9.getName();
               if (!var4.equals(var10) && var10.endsWith(a(v, w))) {
                  try {
                     Map var11 = a(var9, var3);
                     if (var11 != null) {
                        String var12 = (String)var11.get(a(x, y));
                        if (var0.q().equals(var12) && !var9.delete()) {
                           if (NLoginCore_525.as()) {
                              NLoginCore_370.d(a(z, aa ^ ab) + var10 + a(ac & ad, ae));
                           }

                           var9.deleteOnExit();
                        }
                     }
                  } catch (Throwable var13) {
                     if (NLoginCore_525.as()) {
                        NLoginCore_370.c(a(ag, ah ^ ai) + var13.getMessage() + a(aj & ak, al) + var10 + a(am, an), var13);
                     }
                  }
               }
            }
         }
      } catch (Exception var14) {
         NLoginCore_370.a(var14);
         NLoginCore_370.d(a(ap, aq ^ ar));
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static Map<String, Object> a(File var0, String var1) {
      if (var1 != null) {
         JarFile var2 = new JarFile(var0);
         boolean var10 = false /* VF: Semaphore variable */;

         Map var5;
         label137: {
            try {
               var10 = true;
               JarEntry var3 = var2.getJarEntry(var1);
               if (var3 != null) {
                  InputStream var4 = var2.getInputStream(var3);
                  boolean var13 = false /* VF: Semaphore variable */;

                  try {
                     var13 = true;
                     var5 = (Map)a.load(var4);
                     var13 = false;
                  } finally {
                     if (var13) {
                        if (Collections.singletonList(var4).get(c) != null) {
                           var4.close();
                        }
                     }
                  }

                  if (Collections.singletonList(var4).get(a) != null) {
                     var4.close();
                     var10 = false;
                  } else {
                     var10 = false;
                  }
                  break label137;
               }

               var10 = false;
            } finally {
               if (var10) {
                  if (Collections.singletonList(var2).get(e) != null) {
                     var2.close();
                  }
               }
            }

            if (Collections.singletonList(var2).get(d) != null) {
               var2.close();
            }

            return null;
         }

         if (Collections.singletonList(var2).get(b) != null) {
            var2.close();
         }

         return var5;
      } else {
         return null;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_059.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.D("ѰҒҔѴҘҷүӅұҀҾҴӂҼ҅ҪӌӋӃӉӃҘ", (byte)49, 68), NLoginCore_059.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_183.B("ńőŐēœŏŊœŞōĚŘŜŕŘŞĠҬҜҜҕҞҰӁҶүĵ", (byte)49, 66) + var1 + NLoginCore_553.E("ԧ", (byte)49, 69) + var2.toString(), var4);
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 48L;
      var1 ^= -6310219778306212681L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(15 + 53),
                     (byte)(23 + 46),
                     (byte)(79 + 4),
                     (byte)(18 + 29),
                     67,
                     (byte)(16 + 50),
                     (byte)(44 + 23),
                     (byte)(15 + 32),
                     (byte)(59 + 21),
                     (byte)(9 + 66),
                     (byte)(16 + 51),
                     (byte)(15 + 68),
                     (byte)(10 + 43),
                     (byte)(68 + 12),
                     (byte)(16 + 81),
                     100,
                     (byte)(33 + 67),
                     (byte)(67 + 38),
                     (byte)(40 + 70),
                     (byte)(87 + 16)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_427.C("йцхЈшфпшѓтЏэёъэѓЕޡޑޑފޓޥ\u07b6ޫޤ", (byte)11, 67));
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
}
