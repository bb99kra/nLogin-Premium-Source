package com.nickuc.login;

import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_407 {
   final HashMap<String, Object> a;
   private static int c = Integer.reverse(0);
   private static long m = Long.reverse(1297036692682702848L);
   private static long bi = Long.reverse(1297036692682702848L);
   private static int be = Integer.reverse(-1);
   private static long x = Long.reverse(2111809637166672514L);
   private static long d = Long.reverse(2111809637166672514L);
   private static int u = Integer.reverse(-1);
   private static int ak = Integer.reverse(805306368);
   private static int bl = (83886080 >>> 246 | 83886080 << ~246 + 1) & -1;
   private static String[] ZKM_STR_B = new String[bl];
   private static long c;
   private static int aq = 1835008 >>> 241 | 1835008 << -241;
   private static int bc = (0 >>> 23 | 0 << ~23 + 1) & -1;
   private static int ax = Integer.reverse(134217728);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long o = Long.reverse(2111809637166672514L);
   private static long ar = Long.reverse(2111809637166672514L);
   String w;
   private static int bg = 637534208 >>> 185 | 637534208 << -185;
   private static long af = Long.reverse(1103003320635681410L);
   private static long s = Long.reverse(1103003320635681410L);
   private static int az = (536870914 >>> 61 | 536870914 << ~61 + 1) & -1;
   private static long al = Long.reverse(1103003320635681410L);
   private static int ab = 18432 >>> 43 | 18432 << -43;
   private static long ba = Long.reverse(2111809637166672514L);
   private static long p = Long.reverse(1297036692682702848L);
   private static int aj = (0 >>> 74 | 0 << ~74 + 1) & -1;
   private static long ay = Long.reverse(1103003320635681410L);
   boolean z;
   private static int ah = -1 >>> 26 | -1 << ~26 + 1;
   private static int n = (2048 >>> 41 | 2048 << -41) & -1;
   private static int bj = (0 >>> 213 | 0 << -213) & -1;
   private static int ae = (-1 >>> 212 | -1 << ~212 + 1) & -1;
   private static long ai = Long.reverse(1103003320635681410L);
   private static long ap = Long.reverse(1297036692682702848L);
   private static int k = 6291456 >>> 213 | 6291456 << ~213 + 1;
   private static int z = (8 >>> 192 | 8 << ~192 + 1) & -1;
   private static long bf = Long.reverse(1103003320635681410L);
   private static long v = Long.reverse(1103003320635681410L);
   private static int bk = (41943040 >>> 53 | 41943040 << ~53 + 1) & -1;
   private static int au = (2013265920 >>> 91 | 2013265920 << ~91 + 1) & -1;
   private static long aw = Long.reverse(1297036692682702848L);
   private static int t = 3072 >>> 233 | 3072 << -233;
   private static int a = (128 >>> 71 | 128 << ~71 + 1) & -1;
   private static int q = Integer.reverse(-1610612736);
   private static long l = Long.reverse(2111809637166672514L);
   private static int at = Integer.reverse(0);
   private static int b = 4 >>> 130 | 4 << ~130 + 1;
   private static long i = Long.reverse(2111809637166672514L);
   private static int w = Integer.reverse(-536870912);
   private static int r = Integer.reverse(-1);
   private static long j = Long.reverse(1297036692682702848L);
   private static long ac = Long.reverse(1103003320635681410L);
   private static long bh = Long.reverse(2111809637166672514L);
   private static int ag = Integer.reverse(-805306368);
   private static int am = Integer.reverse(Integer.MIN_VALUE);
   private static long av = Long.reverse(2111809637166672514L);
   private static long bb = Long.reverse(1297036692682702848L);
   private static int h = 131072 >>> 16 | 131072 << ~16 + 1;
   private static long y = Long.reverse(1297036692682702848L);
   private static long ao = Long.reverse(2111809637166672514L);
   private static int an = 208 >>> 196 | 208 << -196;
   private static long aa = Long.reverse(1103003320635681410L);
   private static long e = Long.reverse(1297036692682702848L);
   private static int bd = (37748736 >>> 53 | 37748736 << -53) & -1;
   private static long as = Long.reverse(1297036692682702848L);
   private static int ad = 2560 >>> 168 | 2560 << ~168 + 1;
   private static long g = Long.reverse(1103003320635681410L);
   private static String[] ZKM_STR_A = new String[bk];

   public void I() {
      int var2 = aj;
      JSONObject var1;
      synchronized (this.a) {
         var1 = this.a(a(ak, al));
         if (var1 == null) {
            return;
         }

         Iterator var4 = var1.keys();

         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (this.b(var5) == null) {
               var4.remove();
               var2 = am;
            }
         }
      }

      if (var1.isEmpty()) {
         this.d(a(an, ao ^ ap));
      } else if (var2 != 0) {
         this.a(a(aq, ar ^ as), var1);
      }
   }

   private static void b() {
      c = 4708241937174721208L;
      long var0 = c ^ -8173772978999119172L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               69,
               (byte)(79 + 4),
               (byte)(7 + 40),
               (byte)(29 + 38),
               (byte)(42 + 24),
               (byte)(24 + 43),
               (byte)(46 + 1),
               (byte)(2 + 78),
               (byte)(61 + 14),
               (byte)(2 + 65),
               (byte)(15 + 68),
               (byte)(35 + 18),
               (byte)(21 + 59),
               (byte)(59 + 38),
               100,
               (byte)(8 + 92),
               (byte)(59 + 46),
               (byte)(34 + 76),
               (byte)(31 + 72)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_553.E("֑֚֫ըրֲִ֮֟֘ֈ֪֮ջָ֪֝չ֠֏֣\u058c։֊", (byte)122, 69);
               ZKM_STR_B[1] = NLoginCore_027.D("\u0557՛ֆ֟հ\u058b֗հչ֡ւի", (byte)122, 68);
               ZKM_STR_B[2] = NLoginCore_110.D("եի՜\u0557֘֝ց՝խ՝֝ա֢֩֩ժ֛֎֎պ֚։նշ", (byte)122, 68);
               ZKM_STR_B[3] = NLoginCore_110.F("ովկժְ֫֔հրհְմֵּּս֮֡֡֍֭֜։֊", (byte)122, 70);
               ZKM_STR_B[4] = NLoginCore_471.B("ƧƫǖǯǀǛǧǀǉǱǒƻ", (byte)122, 66);
               ZKM_STR_B[5] = NLoginCore_004.B("ǜǎǬǉǈǲǬƻǡǣǐưǎǬǲƺǉƷǨǉǿǋǖƺǮǛǱǰǈȊǽǷ", (byte)122, 66);
               ZKM_STR_B[6] = NLoginCore_173.B("ǨǎǗƥƽǫǜǱǯǕǅǫǧƸǚǧǵƶǝǌǠǉǆǇ", (byte)122, 66);
               ZKM_STR_B[7] = NLoginCore_559.A("ƧƫǖǯǀǛǧǀǉǱǒƻ", (byte)122, 65);
               ZKM_STR_B[8] = NLoginCore_446.A("ƵƻƬƧǨǭǑƭƽƭǭƱǲǹǹƺǫǞǞǊǪǙǆǇ", (byte)122, 65);
               ZKM_STR_B[9] = NLoginCore_076.D("֘վևՕխ֛\u058c֡֟օյ֛֗ը֊֥֗զ֍ռ\u0590չնշ", (byte)122, 68);
               ZKM_STR_B[10] = NLoginCore_446.E("֑֚֫ըրֲִ֮֟֘ֈ֪֮ջָ֪֝չ֠֏֣\u058c։֊", (byte)122, 69);
               ZKM_STR_B[11] = NLoginCore_575.C("֘վևՕխ֛\u058c֡֟օյ֛֗ը֊֥֗զ֍ռ\u0590չնշ", (byte)122, 67);
               ZKM_STR_B[12] = NLoginCore_127.A("ǨǎǗƥƽǫǜǱǯǕǅǫǧƸǚǧǵƶǝǌǠǉǆǇ", (byte)122, 65);
               ZKM_STR_B[13] = NLoginCore_453.C("֘վևՕխ֛\u058c֡֟օյ֛֗ը֊֥֗զ֍ռ\u0590չնշ", (byte)122, 67);
               ZKM_STR_B[14] = NLoginCore_446.F("֑֚֫ըրֲִ֮֟֘ֈ֪֮ջָ֪֝չ֠֏֣\u058c։֊", (byte)122, 70);
               ZKM_STR_B[15] = NLoginCore_223.A("ƾǛǮƼǅǨǱƥǌǍǒƻ", (byte)122, 65);
               ZKM_STR_B[16] = NLoginCore_141.D("\u0557՛ֆ֟հ\u058b֗հչ֡ւի", (byte)122, 68);
               ZKM_STR_B[17] = NLoginCore_559.B("ƵǅƶƷƽǋǰǊƲƵǖƻ", (byte)122, 66);
               ZKM_STR_B[18] = NLoginCore_559.B("ǇǠƸǦǧƪƭǇǍƭǪǖǣǕǆǩǚǙǱǓǓǙǆǇ", (byte)122, 66);
               ZKM_STR_B[19] = NLoginCore_387.A("ǙǗǣǰǫƧǟǝǎǈǯǒǡǄǪǐƳǵǍǙǭǪǓǱǖƿǷǖȁǜǁǕǬǩǍǆǭǉǉǎȎǏǞǉȈǸǓǖȌǜȋǬǜǹǦǧ", (byte)122, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_530.F("֑֚֫ըրֲִ֮֟֘ֈַָֽ֥֭֕֙շռֻ\u058c։֊", (byte)122, 70);
               ZKM_STR_B[1] = NLoginCore_397.D("\u058bՖղՙՖ՚ժ\u0590֏\u0590ջ֕բ֩ե֓֕ժ֢֤֟֟նշ", (byte)122, 68);
               ZKM_STR_B[2] = NLoginCore_453.C("եի՜\u0557֘֝ց՝խ՝֜ֈէփ֩֊֠դ֣ս֘։նշ", (byte)122, 67);
               ZKM_STR_B[3] = NLoginCore_397.F("ովկժְ֫֔հրհֲ֮\u058bֳ֊ֆպֈ֯֎֍ֲ։֊", (byte)122, 70);
               ZKM_STR_B[4] = NLoginCore_183.E("֟֫֩֬֊։֢֮ֈֳ֣֪֙֙֙ֆշָ֮ւֲֵ։֊", (byte)122, 69);
               ZKM_STR_B[5] = NLoginCore_004.C("\u058cվ֜չո֢֜ի֑֓րՠվ֢֜ժչէ֘չ֯ւփ֊֓ր֍օ֊ִּ֑ոֲִֵַ֛֬֟֘\u0590ִ\u058b", (byte)122, 67);
               ZKM_STR_B[6] = NLoginCore_530.A("ǨǎǗƥƽǫǜǱǯǕǄưǏǌǘǥǸǰǚǨǵǉǆǇ", (byte)122, 65);
               ZKM_STR_B[7] = NLoginCore_004.C("֍֏՞։֠ակ֤֜աս֛ՠբթմևդ֎֗֡չնշ", (byte)122, 67);
               ZKM_STR_B[8] = NLoginCore_397.C("եի՜\u0557֘֝ց՝խ՝֞֨ՠ֢֧֗֓֩իփժ։նշ", (byte)122, 67);
               ZKM_STR_B[9] = NLoginCore_433.B("ǨǎǗƥƽǫǜǱǯǕǂǷƲƫǒǼǊǼǊǰǩǿǆǇ", (byte)122, 66);
               ZKM_STR_B[10] = NLoginCore_092.D("֘վևՕխ֛\u058c֡֟օճյձ֞ամ\u058c֥֙֨ց֯նշ", (byte)122, 68);
               ZKM_STR_B[11] = NLoginCore_183.A("ǨǎǗƥƽǫǜǱǯǕǃǁǬǅǨǆǊǾǏǧǖǯǆǇ", (byte)122, 65);
               ZKM_STR_B[12] = NLoginCore_553.E("֑֚֫ըրֲִ֮֟֘ևչֈְֱֽ֛֧֬ւ֛֜։֊", (byte)122, 69);
               ZKM_STR_B[13] = NLoginCore_004.D("֘վևՕխ֛\u058c֡֟օմ֜ւ֢չշլ֜ժչ֧։նշ", (byte)122, 68);
               ZKM_STR_B[14] = NLoginCore_384.C("֘վևՕխ֛\u058c֡֟օճկֈս֛տցցէ֝փ֟նշ", (byte)122, 67);
               ZKM_STR_B[15] = NLoginCore_076.C("֓իռղլթխ֔փվւի", (byte)122, 67);
               ZKM_STR_B[16] = NLoginCore_553.C("լ֚֘պ՝ժ֜\u058bփտ՜֣֞ըը֚թօ֟ռր֯նշ", (byte)122, 67);
               ZKM_STR_B[17] = NLoginCore_091.B("ǅǢǮǅǉƿǚǠǴƭǤƭǨǸǺǱǔǏǲǧǶǿǆǇ", (byte)122, 66);
               ZKM_STR_B[18] = NLoginCore_110.D("շ\u0590ը֖֗՚՝շս՝֘\u0590ջձ֒տ֖իօ֮֝֟նշ", (byte)122, 68);
               ZKM_STR_B[19] = NLoginCore_004.F("ֳ֦֚֮֜ժ֢֑֠\u058bֲ֤֕և֭֓նָ\u0590ְִ֖֭֜֙ւֺ֙ׄ֟ք֘֯֬\u0590։ְ\u058c\u058c֑ב֤֥֒֔\u05c8דןז֛א֚ס֪֬֩", (byte)122, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_530.B("ƿǣƥǃƹǟǋƯƯǠƾǂǬǏǂǼƼǻƼǭǰǽƴǭǄǶǕǸǿȆǦǆ", (byte)122, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.B("ǝƺƻǢǄǊǯǏǯǕǓǣǔưǸƱǐǖǿƼǚǿǆǇ", (byte)122, 66);
         }
      }
   }

   static {
      b();
   }

   @Nullable
   public <T> T a(String var1) {
      synchronized (this.a) {
         return (T)this.a.get(var1.toLowerCase(Locale.ENGLISH));
      }
   }

   public HashMap<String, Object> a() {
      return (HashMap<String, Object>)this.a.clone();
   }

   @Generated
   public boolean E() {
      return this.z;
   }

   public boolean c(String var1) {
      synchronized (this.a) {
         return this.a.containsKey(var1.toLowerCase(Locale.ENGLISH));
      }
   }

   @Nullable
   public String n() {
      if (this.c.a.z) {
         try {
            JSONObject var1 = new JSONObject();
            synchronized (this.a) {
               if (this.a.isEmpty()) {
                  return null;
               }

               JSONArray var3 = new JSONArray();
               int var4 = at;

               for (Entry var6 : this.a.entrySet()) {
                  JSONObject var7 = new JSONObject();
                  var7.put(a(au, av ^ aw), var6.getKey());
                  var7.put(a(ax, ay), var6.getValue());
                  var3.put(var4, var7);
                  var4++;
               }

               var1.put(a(az, ba ^ bb), bc);
               var1.put(a(bd & be, bf), var3);
            }

            return this.w = var1.toString();
         } catch (Exception var10) {
            NLoginCore_370.b(a(bg, bh ^ bi));
         }
      }

      return this.w;
   }

   public <T> T a(String var1, T var2) {
      synchronized (this.a) {
         return (T)this.a.getOrDefault(var1.toLowerCase(Locale.ENGLISH), var2);
      }
   }

   public void a(String var1, Object var2, long var3, TimeUnit var5) {
      if (var2 == null) {
         throw new IllegalArgumentException(a(q & r, s));
      } else {
         synchronized (this.a) {
            JSONObject var7 = (JSONObject)this.a.computeIfAbsent(a(t & u, v), var0 -> new JSONObject());
            JSONObject var8 = new JSONObject();
            var8.put(a(w, x ^ y), var2);
            var8.put(a(z, aa), System.currentTimeMillis() + var5.toMillis(var3));
            var7.put(var1, var8);
            this.a(a(ab, ac), var7);
         }
      }
   }

   public void d(String var1) {
      synchronized (this.a) {
         if (this.a.remove(var1.toLowerCase(Locale.ENGLISH)) != null) {
            this.z = (b != 0);
         }
      }
   }

   public void a(String var1, Object var2) {
      synchronized (this.a) {
         this.a.put(var1, var2);
      }

      this.z = (a != 0);
   }

   @Nullable
   public <T> T b(String var1) {
      var1 = var1.toLowerCase(Locale.ENGLISH);
      JSONObject var3;
      synchronized (this.a) {
         JSONObject var2 = this.a(a(c, d ^ e));
         if (var2 == null) {
            return null;
         }

         if (!var2.has(var1)) {
            return null;
         }

         var3 = var2.getJSONObject(var1);
      }

      if (var3.has(a(f, g)) && var3.has(a(h, i ^ j))) {
         long var9 = var3.getLong(a(k, l ^ m));
         if (System.currentTimeMillis() >= var9) {
            this.d(var1);
            return null;
         } else {
            Object var6 = var3.get(a(n, o ^ p));
            if (var6 == null) {
               this.d(var1);
               return null;
            } else {
               return (T)var6;
            }
         }
      } else {
         this.d(var1);
         return null;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_407.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_397.C("ԒԴԶԖԺՙՑէՓԢՠՖդ՞ԧՌծխեիեԺ", (byte)103, 67), NLoginCore_407.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.C("Ս՚ՙԜ՜\u0558Փ՜էՖԣաե՞աէԩ࢞ࢽ࢘ࢳ\u0892ࢷ\u0895ࢴ࣊࣍ࢺ࣏ࢭࣆՃ", (byte)103, 67) + var1 + NLoginCore_446.D("Ԥ", (byte)103, 68) + var2.toString(),
            var4
         );
      }
   }

   public void e(String var1) {
      synchronized (this.a) {
         JSONObject var3 = (JSONObject)this.a.computeIfAbsent(a(ad & ae, af), var0 -> new JSONObject());
         if (var3.remove(var1) != null) {
            this.a(a(ag & ah, ai), var3);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 72L;
      var1 ^= -8173772978999119172L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(3 + 65),
                     (byte)(45 + 24),
                     (byte)(58 + 25),
                     (byte)(27 + 20),
                     (byte)(10 + 57),
                     (byte)(57 + 9),
                     (byte)(45 + 22),
                     (byte)(5 + 42),
                     (byte)(10 + 70),
                     (byte)(51 + 24),
                     (byte)(56 + 11),
                     (byte)(37 + 46),
                     (byte)(23 + 30),
                     (byte)(17 + 63),
                     97,
                     (byte)(57 + 43),
                     (byte)(65 + 35),
                     (byte)(90 + 15),
                     110,
                     (byte)(80 + 23)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(53 + 15), 69, (byte)(29 + 54)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶӫԊӥԀӟԄӢԁԗԚԇԜӺԓ", (byte)92, 66));
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

   public NLoginCore_407(ForceRegisterConfig var1) {
      this.c = var1;
      this.a = new HashMap<>();
   }
}
