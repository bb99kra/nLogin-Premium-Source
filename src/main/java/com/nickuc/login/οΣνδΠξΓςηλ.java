package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public abstract class οΣνδΠξΓςηλ {
   private static boolean ao;
   private static long ab = Long.reverse(-4255371103741205332L);
   private static int u = Integer.reverse(1073741824);
   private static long c;
   private static int an = Integer.reverse(0);
   private static int ax = 256 >>> 168 | 256 << -168;
   private static int ay = Integer.reverse(Integer.MIN_VALUE);
   private static String[] a = new String[οΣνδΠξΓςηλ.az];
   private static int a = (-1 >>> 187 | -1 << ~187 + 1) & -1;
   private static long ae = Long.reverse(-4255371103741205332L);
   private static int aq = (0 >>> 71 | 0 << -71) & -1;
   private static int at = 7340032 >>> 180 | 7340032 << -180;
   private static int t = 256 >>> 232 | 256 << ~232 + 1;
   private static int as = (0 >>> 87 | 0 << -87) & -1;
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int ad = Integer.reverse(1610612736);
   private static int j = -1 >>> 70 | -1 << ~70 + 1;
   private static long ac = Long.reverse(1008806316530991104L);
   private static int x = 128 >>> 101 | 128 << ~101 + 1;
   private static int i = 268435456 >>> 123 | 268435456 << -123;
   private static long o = Long.reverse(1008806316530991104L);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static long au = Long.reverse(-4255371103741205332L);
   private static int b = Integer.reverse(0);
   private static long d = Long.reverse(-4255371103741205332L);
   private static int ah = (0 >>> 169 | 0 << -169) & -1;
   private static int ar = (0 >>> 25 | 0 << ~25 + 1) & -1;
   private static int aa = (10485760 >>> 181 | 10485760 << ~181 + 1) & -1;
   private static int ao = (1073741824 >>> 254 | 1073741824 << -254) & -1;
   private static int k = (64 >>> 198 | 64 << -198) & -1;
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static int w = 134217728 >>> 155 | 134217728 << -155;
   private static int s = Integer.reverse(0);
   private static long af = Long.reverse(1008806316530991104L);
   private static int ba = (2097152 >>> 18 | 2097152 << -18) & -1;
   private static int ag = Integer.reverse(0);
   private static long q = Long.reverse(-3823025539513637716L);
   private static String[] b = new String[ba];
   private static int f = 3 >>> 32 | 3 << -32;
   private static int p = 1536 >>> 169 | 1536 << ~169 + 1;
   private static long y = Long.reverse(-4255371103741205332L);
   private static int r = (3 >>> 160 | 3 << ~160 + 1) & -1;
   private static int ak = Integer.reverse(0);
   private static int al = Integer.reverse(0);
   private static long l = Long.reverse(-3823025539513637716L);
   private static int aj = Integer.reverse(Integer.MIN_VALUE);
   private static long e = Long.reverse(1008806316530991104L);
   private static long z = Long.reverse(1008806316530991104L);
   private static int g = Integer.reverse(0);
   private static int az = (1048576 >>> 177 | 1048576 << ~177 + 1) & -1;
   private static int m = (524288 >>> 18 | 524288 << -18) & -1;
   private static long n = Long.reverse(-4255371103741205332L);
   private static int aw = Integer.reverse(0);
   private static int ai = 524288 >>> 179 | 524288 << -179;
   private static int ap = 0 >>> 215 | 0 << ~215 + 1;
   static χθδΔοφΣψωαθζς[][] a;
   private static long av = Long.reverse(1008806316530991104L);

   public static void g(boolean var0) {
      ψΓωτιμωκχψΛΨ.f(var0);
      ao = var0;
   }

   public static JSONObject a(boolean var0) {
      JSONObject var1 = new JSONObject();
      if (a == null) {
         return var1;
      } else {
         HashMap var2 = new HashMap();
         χθδΔοφΣψωαθζς[][] var3 = a;
         int var4 = var3.length;

         for (int var5 = aq; var5 < var4; var5++) {
            χθδΔοφΣψωαθζς[] var6 = var3[var5];
            χθδΔοφΣψωαθζς[] var7 = var6;
            int var8 = var6.length;

            for (int var9 = ar; var9 < var8; var9++) {
               χθδΔοφΣψωαθζς var10 = var7[var9];
               if (var10 != null) {
                  λρζηΓζςφζ var11 = χθδΔοφΣψωαθζς.a(var10);
                  if (var0 && var11 instanceof ΔζωχςθνλεΦι) {
                     break;
                  }

                  String var12 = χθδΔοφΣψωαθζς.a(var10).bB;
                  JSONObject var13 = var2.computeIfAbsent(var12, var2x -> {
                     JSONObject var3x = new JSONObject();
                     var1.put(var12, var3x);
                     return var3x;
                  });
                  String var14 = var11.a().a()[as];
                  String[] var15 = var14.split(c<"㺀">(at, au ^ av));
                  JSONObject var16 = var13;

                  for (int var17 = aw; var17 < var15.length - ax; var17++) {
                     JSONObject var18 = var16;
                     int var19 = var17;
                     var16 = var2.computeIfAbsent(var17 + var15[var17], var3x -> {
                        JSONObject var4x = new JSONObject();
                        var18.put(var15[var19], var4x);
                        return var4x;
                     });
                  }

                  var16.put(var15[var15.length - ay], χθδΔοφΣψωαθζς.a(var10) != null ? χθδΔοφΣψωαθζς.a(var10) : JSONObject.NULL);
               }
            }
         }

         return var1;
      }
   }

   public static void a(λρζηΓζςφζ var0, κξυΔχιυψΓ var1, Object var2, boolean var3) {
      if (var1.ab == j) {
         a(var1);
      }

      if (var2 == null) {
         throw new IllegalArgumentException(c<"㺀">(k, l));
      } else {
         Object var4 = var0.a(var0, var2);
         if (var4 == null) {
            throw new IllegalArgumentException(c<"㺃">(m, n ^ o));
         } else {
            if (var3) {
               if (var4 instanceof String) {
                  var4 = ςβικδπφδΣκ.q((String)var4);
               } else if (var4 instanceof List) {
                  ArrayList var5 = new ArrayList((List)var4);
                  if (!var5.isEmpty()) {
                     var5.replaceAll(var0x -> {
                        if (var0x instanceof String) {
                           var0x = ςβικδπφδΣκ.q((String)var0x);
                        }

                        return var0x;
                     });
                  }

                  var4 = ηζησΠΠωΓργπ.a(var5);
               }
            }

            χθδΔοφΣψωαθζς[] var7 = a[var1.ab];
            int var6 = var0.a();
            if (var6 < var7.length) {
               var7[var6] = new χθδΔοφΣψωαθζς(var0, var1, var4, null);
            } else {
               String var10002 = c<"㺆">(p, q);
               Object[] var10003 = new Object[r];
               var10003[s] = var0;
               var10003[t] = var6;
               var10003[u] = var7.length;
               throw new ArrayIndexOutOfBoundsException(String.format(var10002, var10003));
            }
         }
      }
   }

   public static void a(λρζηΓζςφζ[] var0, κξυΔχιυψΓ var1, τφθχΔαΣγτφς var2) {
      λρζηΓζςφζ[] var3 = var0;
      int var4 = var0.length;

      for (int var5 = ah; var5 < var4; var5++) {
         λρζηΓζςφζ var6 = var3[var5];
         a(var6, var1, var2, (boolean)ai);
      }
   }

   public static void a(λρζηΓζςφζ var0, κξυΔχιυψΓ var1, Object var2) {
      a(var0, var1, var2, (boolean)v);
   }

   private static synchronized void a(κξυΔχιυψΓ var0) {
      if (a != null) {
         χθδΔοφΣψωαθζς[][] var1 = a;
         χθδΔοφΣψωαθζς[][] var2 = new χθδΔοφΣψωαθζς[var1.length + aj][];
         System.arraycopy(var1, ak, var2, al, var1.length);
         int var3 = var2.length - am;
         var0.ab = var3;
         var2[var3] = new χθδΔοφΣψωαθζς[var0.aa];
         a = var2;
      } else {
         var0.ab = an;
         χθδΔοφΣψωαθζς[][] var10000 = new χθδΔοφΣψωαθζς[ao][];
         var10000[ap] = new χθδΔοφΣψωαθζς[var0.aa];
         a = var10000;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 112L;
      var1 ^= -403955592431108508L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(54 + 14),
                     (byte)(23 + 46),
                     (byte)(82 + 1),
                     (byte)(5 + 42),
                     (byte)(27 + 40),
                     66,
                     (byte)(25 + 42),
                     (byte)(27 + 20),
                     (byte)(32 + 48),
                     (byte)(55 + 20),
                     (byte)(35 + 32),
                     (byte)(19 + 64),
                     (byte)(11 + 42),
                     80,
                     (byte)(52 + 45),
                     (byte)(43 + 57),
                     (byte)(83 + 17),
                     (byte)(35 + 70),
                     (byte)(50 + 60),
                     (byte)(13 + 90)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), (byte)(69 + 14)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(βεξΠθρρςΔΦμ.E("ՉՖՕԘ\u0558ՔՏ\u0558գՒԟ՝ա՚՝գԥࢶ࢛ࢶࢮ࢛ࢺ\u0890ࣀࢶࢻ", (byte)42, 69));
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

   static {
      b();
   }

   public static void a(λρζηΓζςφζ var0, κξυΔχιυψΓ var1, τφθχΔαΣγτφς var2, boolean var3) {
      String[] var4 = var0.a().a();
      if (var4 == null) {
         throw new IllegalArgumentException(c<"㺀">(x, y ^ z));
      } else if (var4.length == 0) {
         throw new IllegalArgumentException(c<"㺃">(aa, ab ^ ac));
      } else {
         Object var5 = var0.a();
         if (var5 == null) {
            throw new IllegalArgumentException(c<"㺆">(ad, ae ^ af) + var0);
         } else {
            Object var6 = a(var4, var5, var2, ag);
            a(var0, var1, var6, var3);
         }
      }
   }

   @Nullable
   public static Object a(λρζηΓζςφζ var0, κξυΔχιυψΓ var1) {
      int var2 = var1.ab;
      if (var2 == a) {
         return null;
      } else {
         χθδΔοφΣψωαθζς[] var3 = a[var2];
         int var4 = var0.a();
         if (var4 < var3.length) {
            χθδΔοφΣψωαθζς var5 = var3[var4];
            return var5 != null ? χθδΔοφΣψωαθζς.a(var5) : null;
         } else {
            String var10002 = c<"㺀">(b, d ^ e);
            Object[] var10003 = new Object[f];
            var10003[g] = var0;
            var10003[h] = var4;
            var10003[i] = var3.length;
            throw new ArrayIndexOutOfBoundsException(String.format(var10002, var10003));
         }
      }
   }

   @Generated
   public static boolean as() {
      return ao;
   }

   private static void b() {
      c = 3829414794323529507L;
      long var0 = c ^ -403955592431108508L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(19 + 49),
               (byte)(14 + 55),
               (byte)(50 + 33),
               47,
               (byte)(35 + 32),
               (byte)(11 + 55),
               (byte)(47 + 20),
               (byte)(29 + 18),
               (byte)(41 + 39),
               (byte)(15 + 60),
               (byte)(2 + 65),
               (byte)(22 + 61),
               (byte)(13 + 40),
               (byte)(18 + 62),
               (byte)(64 + 33),
               (byte)(75 + 25),
               (byte)(2 + 98),
               105,
               (byte)(81 + 29),
               (byte)(15 + 88)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(62 + 21)}, StandardCharsets.UTF_8));
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
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.B("ëēğĞĥîģãĦĈĠçħùģğċĀčĴĲēħĮĩċðĈİćĞĽùĹÿğĳŁġĄŅĸĴľĸĺŉĎŁŋıĝŐĭĚě", (byte)20, 66);
               b[1] = πηγμΣΔκκ.A("×úěĤĒĘĂàĥħīĂěğöĩĆıĬĭĎíĬĖïðĆĒĩąďĵ", (byte)20, 65);
               b[2] = πψυκΠΨμΛΩβΣφμφσ.E("ԶՁԬԌՄՍԋԩԡԚՉԽՕԫԪՅԓԘԔԹԼՙՕ՛ԱԽՀբԱբԲԧԷ՛Դ՛ՃԶՏԹԮՋԳՐԧՋՍՈԶճ՜ԮՉՈԵիճՋց՚ՠ՝բդ", (byte)20, 69);
               b[3] = ΣερμΔσατσκ.C("еѝѩѨѯиѭЭѰђѪбѱуѭѩѕъїѾѼѝѱѸѳѕкђѺёѨ҇у҃щѩѽҋѫюҏ҂Ѿ҈҂҄ғјҋҕѻѧҚѷѤѥ", (byte)20, 67);
               b[4] = ΨΦνΨΦωυΩνβςμ.B("číđģíĢĕãđĤĦĚąČčìĩĄĨĩýðċĤćęħĹĥùĖď", (byte)20, 66);
               b[5] = ΣφδσΔζιΠρα.D("їзћѭзѬџЭћѮѮѰѬтѳјѲізѓяѴҁрѷѐм҄Ѻђѷ҈", (byte)20, 68);
               b[6] = ΨφιωσρΓδΔθ.A("þĂûăôĢÜĔãĔĪÝăĄĦþħêĉĄĕĵćģĦĐĴĤēøýĳļēĭĳĳĶĘıĔıļď", (byte)20, 65);
               b[7] = ΣδτΠνεγοΓορητ.B("ÜõġĐ÷ÞĞħĞćĘï", (byte)20, 66);
               break;
            case 1:
               b[0] = ΣφδσΔζιΠρα.A("ëēğĞĥîģãĦĈĠçħùģğċĀčĴĲēħĮĩċðĈİćĞĽùĹÿğĳŁġĄŅĸĴľĕăĭĮĐĐĞČđĭĚě", (byte)20, 65);
               b[1] = ΨΦνΨΦωυΩνβςμ.C("СфѥѮќѢьЪѯѱѵьѥѩрѳѐѻѶѷјбҁѬѮѤоѭѻѯљл", (byte)20, 67);
               b[2] = πχσδΦΦνθΔπ.E("ԶՁԬԌՄՍԋԩԡԚՉԽՕԫԪՅԓԘԔԹԼՙՕ՛ԱԽՀբԱբԲԧԷ՛Դ՛ՃԶՏԹԮՋԳՐԧՋՍՈԶճ՜ԮՉՋնսՙտսլռՠԾՐ", (byte)20, 69);
               b[3] = οοθδΨιοΦΠβδζ.C("еѝѩѨѯиѭЭѰђѪбѱуѭѩѕъїѾѼѝѱѸѳѕкђѺёѨ҇у҃щѩѽҋѫюҏ҂ҀѤ҉ѫѴы҈ѯїѫҊѧѤѥ", (byte)20, 67);
               b[4] = οοθδΨιοΦΠβδζ.D("їзћѭзѬџЭћѮѰѤяіїжѳюѲѳчѿѭўѸрья҃Ѣё҈", (byte)20, 68);
               b[5] = χΠξΦιζΨΣωΦσΨζ.E("ԶԖԺՌԖՋԾԌԺՍՍՏՋԡՒԷՑԵԖԲԮՑՋԜՉԡՔԺբէԺԱ՞Ւ՛՛Չ՝ԻխՄ՟ԪԸ", (byte)20, 69);
               b[6] = χΠξΦιζΨΣωΦσΨζ.E("ԧԫԤԬԝՋԅԽԌԽՓԆԬԭՏԧՐԓԲԭԾ՞\u0530ՌՏԹ՝ՍԼԡԦ՜Ղ՜զիԟըա՝աԻՔՋըՑԷԯՃձՖԳ՚ՖՃՄ", (byte)20, 69);
               b[7] = μεςΩΔΣγν.D("длѡХљЫйЫЭѥфй", (byte)20, 68);
               break;
            case 2:
               b[0] = θεωψξβΛσσ.C("РфиѧјЩсшЯЮѝвішѱзйїѼмщъѮѕўђўмѵѥт҇", (byte)20, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = πηγμΣΔκκ.F("ԞԈԽԸԬԻՊԱԑՀԤԿ\u0530ԞՓԓՊԓԹԱ\u0530ՔԽԳԽԽԡՀՕԷՖՁ", (byte)20, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  οΣνδΠξΓςηλ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(χφπρψπφΦθμπ.E("Փյշ\u0557ջ֚֒֨֔գ֥֡֗֟ը֍֦֦֮֯֬ջ", (byte)111, 69), οΣνδΠξΓςηλ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            θεωψξβΛσσ.A("ǀǍǌƏǏǋǆǏǚǉƖǔǘǑǔǚƜԭԒԭԥԒԱԇԷԭԲƲ", (byte)111, 65) + var1 + μζξτΩσσφυδεπλΨ.E("ե", (byte)111, 69) + var2.toString(), var4
         );
      }
   }

   private static Object a(String[] var0, Object var1, τφθχΔαΣγτφς var2, int var3) {
      if (var3 >= var0.length) {
         return var1;
      } else {
         Object var4 = var2.e(var0[var3++]);
         return var4 != null && (var1 == null || var1 instanceof Iterable || var1.getClass().isAssignableFrom(var4.getClass()))
            ? var4
            : a(var0, var1, var2, var3);
      }
   }

   public static void a(λρζηΓζςφζ var0, Object var1) {
      a(var0, var0.a(), var1, (boolean)w);
   }
}
