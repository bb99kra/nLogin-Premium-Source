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

public abstract class ζωΠοκνμψφΓυοβδπ implements ιΨφαρελΣζΠΔΩ, κΓΦνκχβδ {
   private final ΩγΛξιχγτ aa;
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
   private static String[] a = new String[ζωΠοκνμψφΓυοβδπ.am];
   private static long q = Long.reverse(7091371883922153061L);
   private static long b = Long.reverse(2912031429722332773L);
   private static int ab = Integer.reverse(-1);
   private static int a = Integer.reverse(0);
   private static long y = Long.reverse(7091371883922153061L);
   private static int x = -1 >>> 51 | -1 << -51;
   private static long ac = Long.reverse(7091371883922153061L);
   private static int i = (1572864 >>> 211 | 1572864 << ~211 + 1) & -1;
   private static String[] b = new String[ζωΠοκνμψφΓυοβδπ.an];
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
   public ζωΠοκνμψφΓυοβδπ(ΩγΛξιχγτ var1, String var2) {
      this.aa = var1;
      this.bW = var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 82L;
      var1 ^= 3182601868028485015L;
      if (a[var0] == null) {
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
            throw new RuntimeException(φδχεθοκψαλΛογλ.E("լչոԻջշղջֆյՂրքսրֆՈ࣐ࣤࢼࣩࣜࣘࣜࣜࣨࢶࣩࣤࣘࣛࣨ", (byte)77, 69));
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
   public αΠαβσΠτΦ[] a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
      String var5;
      String var6;
      String var7;
      if (var3.j()) {
         var5 = c<"㺀">(a, b ^ d);
         var6 = c<"㺃">(e, f);
         var7 = c<"㺆">(g, h);
      } else {
         var5 = c<"㺉">(i, j ^ k);
         var6 = c<"㺌">(l, m ^ n);
         var7 = c<"㺏">(o & p, q);
      }

      this.b(var1, var2, var3, var4);
      αΠαβσΠτΦ[] var10000 = new αΠαβσΠτΦ[r];
      var10000[s] = new αΠαβσΠτΦ(γοηλιμεπη.o, new λθΩζιΣΔεΔθτβ(var5, var7));
      var10000[t] = new αΠαβσΠτΦ(γοηλιμεπη.c, new λθΩζιΣΔεΔθτβ(var6, null));
      return var10000;
   }

   static {
      b();
   }

   @Generated
   @Override
   public ΩγΛξιχγτ a() {
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
                  ζωΠοκνμψφΓυοβδπ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζβησεθωυγτ.A("ëčďïēĲĪŀĬûĹįĽķĀĥŇņľńľē", (byte)34, 65), ζωΠοκνμψφΓυοβδπ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣδτΠνεγοΓορητ.F("ՁՎՍԐՐՌՇՐ՛ՊԗՕՙՒՕ՛ԝࢥࢹ\u0891ࢱࢭࢱࢱࢾࢽࢋࢾࢹࢭࢰࢽԸ", (byte)34, 70) + var1 + οοθδΨιοΦΠβδζ.D("ѕ", (byte)34, 68) + var2.toString(), var4
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
               b[0] = βθκςνθΩθυμςτκχ.B("ÑýĎĆėàĎîóĄúúĎĖĈïðÛ÷ýòáôğäĆĝĥýëûĉ", (byte)13, 66);
               b[1] = θεωψξβΛσσ.A("čĂóĈĔåÖãÒóĐëîĔĎÜØÕčöâßĈĂĖćĦèāĪĐñ", (byte)13, 65);
               b[2] = ιΠοθΩΦξκ.E("ԴՀԤ\u0530\u0530ԆԾԥՈԋԋԹՂՌԣԌԾՊՈԳԷԎԤԮԤԒԖԭԚԗ՟ՐԾաԸեՑբ\u0558ՃԩԦՉեԼԾՏիՀՐԴգճՃգԲԺծն՚ըշվղիպճՃգԿԾեՂ\u058cլՑ", (byte)13, 69);
               b[3] = ΦδφπθΩΩλζξ.A("ÑýĎĆėàĎîóĄûÚëďÜ×ÛĕĂĚěĐÚĄĈĩīĢīĘĝĦ", (byte)13, 65);
               b[4] = φδχεθοκψαλΛογλ.E("ԽԲԣԸՄԕԆԓԂԣՀԶԼՏԤԞԧԳԋԫԫՕԜԝ", (byte)13, 69);
               b[5] = βθκςνθΩθυμςτκχ.E("ԽԳӽԔԟԟԩԔԠԺՁԺԟԎԚՊՐԭԎՍՄԩՖԢՂՑՅԔԞԵԾՁԾՓԷՐԳՔՔԺՁԡՇ՝Շգ\u0530ԮՉՋծբլբՁՊբԹձԻՆԻՖՍրՒմգսևցրֆլըՑ", (byte)13, 69);
               b[6] = ΨφιωσρΓδΔθ.C("ГзыжиЌЫгЫїОФ", (byte)13, 67);
               b[7] = πχσδΦΦνθΔπ.E(
                  "ԶՄԡԝԔԒՄԷԈԟԄԧԟԤԢՈ\u0530\u0530ԎԏԪԸԒԳ՚ԸԭՊԸՍԼԬԸԵՠԽԲՔ՛ԾԹԾԿԤՇլ՞ժ\u0530ԽՋբթԮՊՒզՙ՛մԽԿծԿոց՟ՙվ՞Ծգղճ\u058bշզի՝Ռ֒լ֍ըձֈՐշշ֎ռ՝սշ֕չ֏֣ցձջրչն֦չֆ֖֭֨ռօְ֯սֶ֫ֆֵַ֑֬ծֳ֟֓ոָֺֻ֮׃ռփ֢֤֨֓׀ևׁׅ֚֩֞־ׇ\u0590ֱ֯֜֝",
                  (byte)13,
                  69
               );
               b[8] = ζοηκορΦνΣθγΩ.B("àĎßôĉîąãÔăóďïíþĠđßğĖÝĈðèĨĠĊĄĀĘĎĐ", (byte)13, 66);
               b[9] = λΣΩσμφγχ.C("пЈъйгуіКѝлЫоЙўЮгђИдРчвЯа", (byte)13, 67);
               b[10] = πψυκΠΨμΛΩβΣφμφσ.D("ГчЦЭЧчиљєгчѓЗжСодљѨѐетедѤцЩйѢѬсѤъѤгљѹзѤѷъїѱф", (byte)13, 68);
               break;
            case 1:
               b[0] = πηγμΣΔκκ.C("ДрёщњУёбжчннёљывгОкреѩѬѭѢўћѩѩѤќѦ", (byte)13, 67);
               b[1] = ΦδφπθΩΩλζξ.A("čĂóĈĔåÖãÒóĐëîĔĎÜØÕčöâÝüĔğù÷ĭĮĦęĥ", (byte)13, 65);
               b[2] = λΣΩσμφγχ.C("чѓзууЙёићООьѕџжПёѝћцъСзсзХЩрЭЪѲѣёѴыѸѤѵѫімйќѸяёѢѾѓѣчѶ҆іѶхэҁ҉ѭѻҊґ҅ҒшҔѢѰҊѩҍҏҋҏѳҍҔљҌѥѝҜѣҝ҂ѯѰ", (byte)13, 67);
               b[3] = οΩνΩρωλΨηΛδωδ.A("ÑýĎĆėàĎîóĄûÚëďÜ×ÛĕĂĚěĐúėėýģãĉîāć", (byte)13, 65);
               b[4] = ΨφιωσρΓδΔθ.C("ѐхжыїШЙЦЕжёНЪЪУгўОџцѓеЧоыюѬѯЮЬюо", (byte)13, 67);
               b[5] = ςΦζσμτΓσ.E("ԽԳӽԔԟԟԩԔԠԺՁԺԟԎԚՊՐԭԎՍՄԩՖԢՂՑՅԔԞԵԾՁԾՓԷՐԳՔՔԺՁԡՇ՝Շգ\u0530ԮՉՋծբլբՁՊբԹձԻՆԻՖՍփՓՠՏէդՕՆՁէ՜Ց", (byte)13, 69);
               b[6] = πηγμΣΔκκ.E("ԝԛԻԤՀԇԞԇՉԜԟՈԼԛԜԎՊԑՑԬՇԯԜԝ", (byte)13, 69);
               b[7] = ΠΛΨοδΩσμνΛγΦφβς.F(
                  "ԶՄԡԝԔԒՄԷԈԟԄԧԟԤԢՈ\u0530\u0530ԎԏԪԸԒԳ՚ԸԭՊԸՍԼԬԸԵՠԽԲՔ՛ԾԹԾԿԤՇլ՞ժ\u0530ԽՋբթԮՊՒզՙ՛մԽԿծԿոց՟ՙվ՞Ծգղճ\u058bշզի՝Ռ֒լ֍ըձֈՐշշ֎ռ՝սշ֕չ֏֣ցձջրչն֦չֆ֖֭֨ռօְ֯սֶ֫ֆֵַ֑֬ծֳ֟֓ոָֺֻ֮׃ռփׁ֢֤֨֓־֡ցׂ֣֞֠ׄ׃֔֟֜֝",
                  (byte)13,
                  70
               );
               b[8] = ντθΔζβΔζ.F("ԐԾԏԤԹԞԵԓԄԳԣԿԟԝԮՐՁԏՏՆԍՀՌԸՉԱԸԹՋԜՑՙԸՐԹդԝզԷՁԷԷԣԱ", (byte)13, 70);
               b[9] = λΣΩσμφγχ.B("üÅćöðĀē×ĚøêÝďĝĕĀâãĎðĞÿìí", (byte)13, 66);
               b[10] = ΨφιωσρΓδΔθ.B("ÐĄãêäĄõĖđðĄĐÔóÞûñĖĥčòÿòñġăæöğĩþġĠþĩąôĊðĦěúęóĪļĠĔŃþĵŁĤğČč", (byte)13, 66);
               break;
            case 2:
               b[0] = ςπυηννναΣ.F("ԾԖՂԤԿԜԥԧԤԻԣԼԇԛԜԝՏԧԮԑՃԯԜԝ", (byte)13, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = πηγμΣΔκκ.E("ԿԙԟԢԝӾԑӿԢՆԔԑ", (byte)13, 69);
         }
      }
   }

   public abstract void b(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4);

   @Override
   public void a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4, γοηλιμεπη var5) {
      if (var5 == γοηλιμεπη.o) {
         χΔωυρΩΠΩυς var6 = (χΔωυρΩΠΩυς)ηισξπαΠχΩ.b.a();

         try {
            String var10002 = var6.aa();
            String[] var10003 = new String[u];
            var10003[v] = c<"㺀">(w & x, y);
            var10003[z] = this.bW;
            var6.a(var2, var10002, var10003);
         } catch (Exception var8) {
            var3.a().a(c<"㺃">(aa & ab, ac));
            ψΓωτιμωκχψΛΨ.c(c<"㺆">(ad & ae, af) + var6.aa().toLowerCase(Locale.ENGLISH) + c<"㺉">(ag, ah) + var2.getName() + c<"㺌">(ai & aj, ak), var8);
         }
      }

      ιΨφαρελΣζΠΔΩ.super.a(var1, var2, var3, var4, var5);
   }
}
