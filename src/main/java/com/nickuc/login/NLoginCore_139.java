package com.nickuc.login;

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

public abstract class NLoginCore_139 implements NLoginInterface_010, NLoginInterface_035 {
   private final NLoginCore_211 aa;
   private static int o = 'ꀀ' >>> 237 | 40960 << -237;
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int ad = (2048 >>> 40 | 2048 << -40) & -1;
   private static int ag = (301989888 >>> 89 | 301989888 << -89) & -1;
   private static int aj = (-1 >>> 134 | -1 << -134) & -1;
   private static int w = (24 >>> 226 | 24 << -226) & -1;
   private static long d = Long.reverse(5332261958806667264L);
   private static int p = Integer.reverse(-1);
   private static long af = Long.reverse(7091371883922153061L);
   private static int v = Integer.reverse(0);
   private static long h = Long.reverse(7091371883922153061L);
   private static long k = Long.reverse(5332261958806667264L);
   private static String[] ZKM_STR_A = new String[NLoginCore_139.am];
   private static long q = Long.reverse(7091371883922153061L);
   private static long b = Long.reverse(2912031429722332773L);
   private static int ab = Integer.reverse(-1);
   private static int a = Integer.reverse(0);
   private static long y = Long.reverse(7091371883922153061L);
   private static int x = -1 >>> 51 | -1 << -51;
   private static long ac = Long.reverse(7091371883922153061L);
   private static int i = (1572864 >>> 211 | 1572864 << ~211 + 1) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_139.an];
   private static long ah = Long.reverse(7091371883922153061L);
   private static int al = Integer.reverse(0);
   private static int r = 2048 >>> 42 | 2048 << ~42 + 1;
   private static int ae = (-1 >>> 239 | -1 << -239) & -1;
   private static int am = 1610612737 >>> 61 | 1610612737 << ~61 + 1;
   private static long c;
   private static int ai = Integer.reverse(1342177280);
   private static long j = Long.reverse(2912031429722332773L);
   private static long f = Long.reverse(7091371883922153061L);
   private final String bW;
   private static int g = Integer.reverse(1073741824);
   private static int s = (0 >>> 166 | 0 << ~166 + 1) & -1;
   private static int l = Integer.reverse(536870912);
   private static int aa = (-1073741823 >>> 30 | -1073741823 << -30) & -1;
   private static int an = Integer.reverse(-805306368);
   private static long n = Long.reverse(5332261958806667264L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int z = 1024 >>> 138 | 1024 << ~138 + 1;
   private static long ak = Long.reverse(7091371883922153061L);
   private static int u = 16384 >>> 237 | 16384 << -237;
   private static long m = Long.reverse(2912031429722332773L);

   @Generated
   public NLoginCore_139(NLoginCore_211 var1, String var2) {
      this.aa = var1;
      this.bW = var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 82L;
      var1 ^= 3182601868028485015L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(35 + 33),
                     (byte)(38 + 31),
                     (byte)(36 + 47),
                     (byte)(33 + 14),
                     (byte)(12 + 55),
                     (byte)(50 + 16),
                     (byte)(57 + 10),
                     (byte)(32 + 15),
                     (byte)(43 + 37),
                     75,
                     (byte)(4 + 63),
                     (byte)(51 + 32),
                     (byte)(34 + 19),
                     (byte)(5 + 75),
                     (byte)(95 + 2),
                     (byte)(12 + 88),
                     (byte)(34 + 66),
                     (byte)(104 + 1),
                     (byte)(66 + 44),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_433.E("լչոԻջշղջֆյՂրքսրֆՈ࣐ࣤࢼࣩࣜࣘࣜࣜࣨࢶࣩࣤࣘࣛࣨ", (byte)77, 69));
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
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      String var5;
      String var6;
      String var7;
      if (var3.j()) {
         var5 = a(a, b ^ d);
         var6 = a(e, f);
         var7 = a(g, h);
      } else {
         var5 = a(i, j ^ k);
         var6 = a(l, m ^ n);
         var7 = a(o & p, q);
      }

      this.b(var1, var2, var3, var4);
      GUIButtonContainer[] var10000 = new GUIButtonContainer[r];
      var10000[s] = new GUIButtonContainer(NLoginCore_445.o, new NLoginCore_190(var5, var7));
      var10000[t] = new GUIButtonContainer(NLoginCore_445.c, new NLoginCore_190(var6, null));
      return var10000;
   }

   static {
      b();
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.aa;
   }

   @Generated
   public String at() {
      return this.bW;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_139.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.A("ëčďïēĲĪŀĬûĹįĽķĀĥŇņľńľē", (byte)34, 65), NLoginCore_139.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.F("ՁՎՍԐՐՌՇՐ՛ՊԗՕՙՒՕ՛ԝࢥࢹ\u0891ࢱࢭࢱࢱࢾࢽࢋࢾࢹࢭࢰࢽԸ", (byte)34, 70) + var1 + NLoginCore_471.D("ѕ", (byte)34, 68) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = -6450567572848273900L;
      long var0 = c ^ 3182601868028485015L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(66 + 3),
               (byte)(58 + 25),
               (byte)(19 + 28),
               (byte)(50 + 17),
               (byte)(43 + 23),
               (byte)(65 + 2),
               (byte)(29 + 18),
               (byte)(36 + 44),
               (byte)(32 + 43),
               (byte)(60 + 7),
               (byte)(53 + 30),
               (byte)(20 + 33),
               (byte)(26 + 54),
               (byte)(32 + 65),
               (byte)(70 + 30),
               (byte)(60 + 40),
               105,
               (byte)(97 + 13),
               (byte)(48 + 55)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.B("ÑýĎĆėàĎîóĄúúĎĖĈïðÛ÷ýòáôğäĆĝĥýëûĉ", (byte)13, 66);
               ZKM_STR_B[1] = NLoginCore_530.A("čĂóĈĔåÖãÒóĐëîĔĎÜØÕčöâßĈĂĖćĦèāĪĐñ", (byte)13, 65);
               ZKM_STR_B[2] = NLoginCore_427.E("ԴՀԤ\u0530\u0530ԆԾԥՈԋԋԹՂՌԣԌԾՊՈԳԷԎԤԮԤԒԖԭԚԗ՟ՐԾաԸեՑբ\u0558ՃԩԦՉեԼԾՏիՀՐԴգճՃգԲԺծն՚ըշվղիպճՃգԿԾեՂ\u058cլՑ", (byte)13, 69);
               ZKM_STR_B[3] = NLoginCore_232.A("ÑýĎĆėàĎîóĄûÚëďÜ×ÛĕĂĚěĐÚĄĈĩīĢīĘĝĦ", (byte)13, 65);
               ZKM_STR_B[4] = NLoginCore_433.E("ԽԲԣԸՄԕԆԓԂԣՀԶԼՏԤԞԧԳԋԫԫՕԜԝ", (byte)13, 69);
               ZKM_STR_B[5] = NLoginCore_173.E("ԽԳӽԔԟԟԩԔԠԺՁԺԟԎԚՊՐԭԎՍՄԩՖԢՂՑՅԔԞԵԾՁԾՓԷՐԳՔՔԺՁԡՇ՝Շգ\u0530ԮՉՋծբլբՁՊբԹձԻՆԻՖՍրՒմգսևցրֆլըՑ", (byte)13, 69);
               ZKM_STR_B[6] = NLoginCore_559.C("ГзыжиЌЫгЫїОФ", (byte)13, 67);
               ZKM_STR_B[7] = NLoginCore_384.E(
                  "ԶՄԡԝԔԒՄԷԈԟԄԧԟԤԢՈ\u0530\u0530ԎԏԪԸԒԳ՚ԸԭՊԸՍԼԬԸԵՠԽԲՔ՛ԾԹԾԿԤՇլ՞ժ\u0530ԽՋբթԮՊՒզՙ՛մԽԿծԿոց՟ՙվ՞Ծգղճ\u058bշզի՝Ռ֒լ֍ըձֈՐշշ֎ռ՝սշ֕չ֏֣ցձջրչն֦չֆ֖֭֨ռօְ֯սֶ֫ֆֵַ֑֬ծֳ֟֓ոָֺֻ֮׃ռփ֢֤֨֓׀ևׁׅ֚֩֞־ׇ\u0590ֱ֯֜֝",
                  (byte)13,
                  69
               );
               ZKM_STR_B[8] = NLoginCore_092.B("àĎßôĉîąãÔăóďïíþĠđßğĖÝĈðèĨĠĊĄĀĘĎĐ", (byte)13, 66);
               ZKM_STR_B[9] = NLoginCore_553.C("пЈъйгуіКѝлЫоЙўЮгђИдРчвЯа", (byte)13, 67);
               ZKM_STR_B[10] = NLoginCore_201.D("ГчЦЭЧчиљєгчѓЗжСодљѨѐетедѤцЩйѢѬсѤъѤгљѹзѤѷъїѱф", (byte)13, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_138.C("ДрёщњУёбжчннёљывгОкреѩѬѭѢўћѩѩѤќѦ", (byte)13, 67);
               ZKM_STR_B[1] = NLoginCore_232.A("čĂóĈĔåÖãÒóĐëîĔĎÜØÕčöâÝüĔğù÷ĭĮĦęĥ", (byte)13, 65);
               ZKM_STR_B[2] = NLoginCore_553.C("чѓзууЙёићООьѕџжПёѝћцъСзсзХЩрЭЪѲѣёѴыѸѤѵѫімйќѸяёѢѾѓѣчѶ҆іѶхэҁ҉ѭѻҊґ҅ҒшҔѢѰҊѩҍҏҋҏѳҍҔљҌѥѝҜѣҝ҂ѯѰ", (byte)13, 67);
               ZKM_STR_B[3] = NLoginCore_397.A("ÑýĎĆėàĎîóĄûÚëďÜ×ÛĕĂĚěĐúėėýģãĉîāć", (byte)13, 65);
               ZKM_STR_B[4] = NLoginCore_559.C("ѐхжыїШЙЦЕжёНЪЪУгўОџцѓеЧоыюѬѯЮЬюо", (byte)13, 67);
               ZKM_STR_B[5] = NLoginCore_324.E("ԽԳӽԔԟԟԩԔԠԺՁԺԟԎԚՊՐԭԎՍՄԩՖԢՂՑՅԔԞԵԾՁԾՓԷՐԳՔՔԺՁԡՇ՝Շգ\u0530ԮՉՋծբլբՁՊբԹձԻՆԻՖՍփՓՠՏէդՕՆՁէ՜Ց", (byte)13, 69);
               ZKM_STR_B[6] = NLoginCore_138.E("ԝԛԻԤՀԇԞԇՉԜԟՈԼԛԜԎՊԑՑԬՇԯԜԝ", (byte)13, 69);
               ZKM_STR_B[7] = NLoginCore_091.F(
                  "ԶՄԡԝԔԒՄԷԈԟԄԧԟԤԢՈ\u0530\u0530ԎԏԪԸԒԳ՚ԸԭՊԸՍԼԬԸԵՠԽԲՔ՛ԾԹԾԿԤՇլ՞ժ\u0530ԽՋբթԮՊՒզՙ՛մԽԿծԿոց՟ՙվ՞Ծգղճ\u058bշզի՝Ռ֒լ֍ըձֈՐշշ֎ռ՝սշ֕չ֏֣ցձջրչն֦չֆ֖֭֨ռօְ֯սֶ֫ֆֵַ֑֬ծֳ֟֓ոָֺֻ֮׃ռփׁ֢֤֨֓־֡ցׂ֣֞֠ׄ׃֔֟֜֝",
                  (byte)13,
                  70
               );
               ZKM_STR_B[8] = NLoginCore_110.F("ԐԾԏԤԹԞԵԓԄԳԣԿԟԝԮՐՁԏՏՆԍՀՌԸՉԱԸԹՋԜՑՙԸՐԹդԝզԷՁԷԷԣԱ", (byte)13, 70);
               ZKM_STR_B[9] = NLoginCore_553.B("üÅćöðĀē×ĚøêÝďĝĕĀâãĎðĞÿìí", (byte)13, 66);
               ZKM_STR_B[10] = NLoginCore_559.B("ÐĄãêäĄõĖđðĄĐÔóÞûñĖĥčòÿòñġăæöğĩþġĠþĩąôĊðĦěúęóĪļĠĔŃþĵŁĤğČč", (byte)13, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_575.F("ԾԖՂԤԿԜԥԧԤԻԣԼԇԛԜԝՏԧԮԑՃԯԜԝ", (byte)13, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_138.E("ԿԙԟԢԝӾԑӿԢՆԔԑ", (byte)13, 69);
         }
      }
   }

   public abstract void b(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4);

   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      if (var5 == NLoginCore_445.o) {
         NLoginCore_043 var6 = (NLoginCore_043)NLoginCore_466.b.a();

         try {
            String var10002 = var6.aa();
            String[] var10003 = new String[u];
            var10003[v] = a(w & x, y);
            var10003[z] = this.bW;
            var6.a(var2, var10002, var10003);
         } catch (Exception var8) {
            var3.a().a(a(aa & ab, ac));
            NLoginCore_370.c(a(ad & ae, af) + var6.aa().toLowerCase(Locale.ENGLISH) + a(ag, ah) + var2.getName() + a(ai & aj, ak), var8);
         }
      }

      NLoginInterface_010.super.a(var1, var2, var3, var4, var5);
   }
}
