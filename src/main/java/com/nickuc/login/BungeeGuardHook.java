package com.nickuc.login;

import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class BungeeGuardHook implements NLoginInterface_010, NLoginInterface_035 {
   private static int aa = (0 >>> 95 | 0 << ~95 + 1) & -1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long u = Long.reverse(5418457867534283217L);
   private static int ae = 3072 >>> 9 | 3072 << -9;
   private static int c = Integer.reverse(0);
   private static long ad = Long.reverse(-5044031582654955520L);
   private static long ah = Long.reverse(5418457867534283217L);
   private static int j = (0 >>> 74 | 0 << ~74 + 1) & -1;
   private static int b = Integer.reverse(0);
   private static long l = Long.reverse(-5044031582654955520L);
   private static int ab = (5 >>> 32 | 5 << -32) & -1;
   private static String[] a = new String[BungeeGuardHook.aq];
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static long x = Long.reverse(5418457867534283217L);
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = Integer.reverse(1342177280);
   private static int ag = Integer.reverse(-536870912);
   private static int ai = 0 >>> 145 | 0 << ~145 + 1;
   private static long ao = Long.reverse(-5044031582654955520L);
   private static int d = Integer.reverse(1073741824);
   private static int ap = Integer.reverse(0);
   private final NLoginCore_211 Q;
   private static int s = Integer.reverse(-1073741824);
   private static int ar = (40 >>> 34 | 40 << ~34 + 1) & -1;
   private static int i = Integer.reverse(0);
   private static int al = Integer.reverse(318767104);
   private static long af = Long.reverse(5418457867534283217L);
   private static int y = (262144 >>> 112 | 262144 << ~112 + 1) & -1;
   private static String[] b = new String[ar];
   private static long z = Long.reverse(5418457867534283217L);
   private static int n = Integer.reverse(1073741824);
   private static long q = Long.reverse(-1066725595879231023L);
   private static long r = Long.reverse(-5044031582654955520L);
   private static int t = Integer.reverse(1073741824);
   private static long k = Long.reverse(-1066725595879231023L);
   private static int o = Integer.reverse(1073741824);
   private static long c;
   private static long ak = Long.reverse(5418457867534283217L);
   private static long an = Long.reverse(-1066725595879231023L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int g = Integer.reverse(536870912);
   private static int w = Integer.reverse(-1);
   private static int h = Integer.reverse(536870912);
   private static int am = Integer.reverse(-1879048192);
   private static int v = 100663296 >>> 57 | 100663296 << -57;
   private static int aj = Integer.reverse(268435456);
   private static int e = 0 >>> 70 | 0 << ~70 + 1;
   private static long ac = Long.reverse(-1066725595879231023L);

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.k);
      NLoginCore_445[] var10001 = new NLoginCore_445[d];
      var10001[e] = NLoginCore_445.o;
      var10001[f] = NLoginCore_445.p;
      return GUIButtonContainer.a(var2, var10001);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  BungeeGuardHook.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_387.A("ţƅƇŧƋƪƢƸƤųƱƧƵƯŸƝƿƾƶƼƶƋ", (byte)94, 65), BungeeGuardHook.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.C("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࡳ࢟ࢋࡶࢥࢪ࢛࢜ࢧࢧࡽ\u0894ࢇࢭࢵԩ", (byte)94, 67) + var1 + NLoginCore_091.D("ԉ", (byte)94, 68) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 93L;
      var1 ^= 7502766169204301027L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(59 + 10),
                     (byte)(30 + 53),
                     (byte)(16 + 31),
                     67,
                     (byte)(15 + 51),
                     (byte)(17 + 50),
                     (byte)(37 + 10),
                     (byte)(43 + 37),
                     (byte)(23 + 52),
                     (byte)(4 + 63),
                     (byte)(3 + 80),
                     (byte)(41 + 12),
                     (byte)(19 + 61),
                     (byte)(51 + 46),
                     100,
                     (byte)(55 + 45),
                     (byte)(32 + 73),
                     (byte)(16 + 94),
                     (byte)(60 + 43)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(61 + 7), 69, (byte)(22 + 61)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.C("Ր՝՜ԟ՟՛Ֆ՟ժՙԦդըադժԬ\u0891ࢽࢩ\u0894ࣃࣈࢹࢺࣅࣅ࢛ࢲࢥ࣓࣋", (byte)104, 67));
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
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return (boolean)(var1.a().p() && var1.L() ? a : b);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_582.w[var5.ordinal()]) {
         case 1:
            this.b(var1, var2);
         case 2:
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   static {
      b();
   }

   @Generated
   public BungeeGuardHook(NLoginCore_211 var1) {
      this.Q = var1;
   }

   private static void b() {
      c = -8391135093839868785L;
      long var0 = c ^ 7502766169204301027L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(36 + 33),
               (byte)(64 + 19),
               (byte)(38 + 9),
               (byte)(20 + 47),
               (byte)(23 + 43),
               (byte)(26 + 41),
               (byte)(26 + 21),
               (byte)(77 + 3),
               75,
               (byte)(58 + 9),
               (byte)(43 + 40),
               (byte)(16 + 37),
               (byte)(72 + 8),
               (byte)(62 + 35),
               (byte)(37 + 63),
               (byte)(45 + 55),
               (byte)(11 + 94),
               (byte)(41 + 69),
               (byte)(98 + 5)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_433.F("Լ\u0530ԼԉԥԨԤՈԼԾԻԖ", (byte)18, 70);
               b[1] = NLoginCore_453.F("ԱՃԖԶՇԬԌԫԜԨԌԖ", (byte)18, 70);
               b[2] = NLoginCore_324.F("ԁՇԧԴԩԬԠԎԺԽԋՈԜՃԢԒՇԱԯՏ՚ԴԡԢ", (byte)18, 70);
               b[3] = NLoginCore_451.D("ОѤфёцщнЫїњШѥйѠпЯѤюьѬѷёоп", (byte)18, 68);
               b[4] = NLoginCore_446.D("ндќхўѨѧѧѡѧѥСэњфъЮѐѷѯѡѕѹбьѱѨѠѸйѸѸѰ҄ѼнјѺѨѿѝѕѪѓ", (byte)18, 68);
               b[5] = NLoginCore_092.B("ÖĜüĉþāõãďĒÞġĜĨĕèāĈħùúĉö÷", (byte)18, 66);
               b[6] = NLoginCore_553.E("ԛԳԈӼՁԖԼԖԁՑԑԎԬԥԇՓԧԡԭԨԖԷ\u0557ԽՒԙԾԿԶՁ\u0557Թ", (byte)18, 69);
               b[7] = NLoginCore_110.E("ԀԕӿՊԼԩԋՉԪԘԐԖ", (byte)18, 69);
               b[8] = NLoginCore_076.F(
                  "ԡԝԦԔԋԡԶԖՂԪԬԌԌԵԞԠԨՙՑԻԧԼ՜ՌՈՁՎՒԮԹԵէՆԡդաԧԞՖժեՉՃՀՓդԯԳշՠպ\u0530իՄկԵՒՐՖԹՑք՝յֈվ՞թ՝տ\u0557խպՎՏ\u0590՛\u0590֑Ւ֕ոթ֒֏Օ֎֛֔ձ\u058c\u0590կպպ֥֡րղ֚֊մջխ֊ըչն",
                  (byte)18,
                  70
               );
               b[9] = NLoginCore_324.E("ԛԳԈӼՁԖԼԖԁՑԃԍԤՆՄՓԟՂԗԓՇ\u0530\u0557ՖՊԹՊ՞՞՜՝ՔՃ՟ՈՕթՂԩգՂՎԫ\u0530ծթդղնիՈէԹՔՁՂ", (byte)18, 69);
               break;
            case 1:
               b[0] = NLoginCore_223.C("ђПїтЧќШлѭУќњѭьЯѫѧюѨЩвѧоп", (byte)18, 67);
               b[1] = NLoginCore_453.C("ОюѢжУѪгзЫюѮйЪѐњьѢѤѥѯыѷоп", (byte)18, 67);
               b[2] = NLoginCore_451.B("ÖĜüĉþāõãďĒàēĉĨèĩĭĚĄÿđùö÷", (byte)18, 66);
               b[3] = NLoginCore_004.B("ÖĜüĉþāõãďĒßĝ÷ĀĠþė÷ĄĬĨįö÷", (byte)18, 66);
               b[4] = NLoginCore_559.F("ԠԗԿԨՁՋՊՊՄՊՈԄ\u0530ԽԧԭԑԳ՚ՒՄԸ՜ԔԯՔՋՃ՛Ԝ՛՛ԡՠԾ՛ԹԹզՋԮՃԺգիԪԽՕՃՑՙՂլժՁՂ", (byte)18, 70);
               b[5] = NLoginCore_076.C("ОѤфёцщнЫїњШѐпѝѝХсѕіѯіѐѲшяьѕіѿьѻя", (byte)18, 67);
               b[6] = NLoginCore_530.E("ԛԳԈӼՁԖԼԖԁՑԑԎԬԥԇՓԧԡԭԨԖԻԳՒԞ\u0530ՊԬԵԬ՜ե", (byte)18, 69);
               b[7] = NLoginCore_559.C("ЯРгхніфьфьэљЪнѧѥєеччъсоп", (byte)18, 67);
               b[8] = NLoginCore_232.A(
                  "öòûéàöċëėÿāááĊóõýĮĦĐüđıġĝĖģħăĎĊļěöĹĶüóīĿĺĞĘĕĨĹĄĈŌĵŏąŀęńĊħĥīĎĦřĲŊŝœĳľĲŔĬłŏģĤťİťŦħŪōľŧŤĪţũŰņšťńŏŏźĮŞŜŝŜśĿōŖſŸŞſŒŢŉƄŖžŝƑƏŖŗ", (byte)18, 65
               );
               b[9] = NLoginCore_173.A("ðĈÝÑĖëđëÖĦØâùěęĨôėìèĜąĬīğĎğĳĳıĲĩĘĴĝĪľėþĸėģþēăĽľĻĕňļėŋĲčŐŔŉŗčĎċĶŗ", (byte)18, 65);
               break;
            case 2:
               b[0] = NLoginCore_427.D("ѡџрєчбиїикЭѨщУџѮэчуѠьѧоп", (byte)18, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_076.A("ÖÙėòóďĎëĠăþë", (byte)18, 65);
         }
      }
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.Q;
   }

   private void b(NLoginType_008 var1, NLoginCore_277 var2) {
      NLoginType_010 var3 = var1.c();
      NLoginCore_199 var10000 = var3.a();
      int var10002 = g;
      Object[] var10003 = new Object[h];
      var10003[i] = a(j, k ^ l);
      var10003[m] = n;
      var10003[o] = a(p, q ^ r);
      var10003[s] = a(t, u);
      var10000.a(var2, var10002, var10003);
      if (var1.b().a() == NLoginCore_419.c && !var1.b().j(a(v & w, x))) {
         NLoginCore_370.e(a(y, z));
         File var4 = var1.c().getParentFile();
         File var5 = new File(var4, a(ab, ac ^ ad));
         if (var5.exists() && !var5.delete()) {
            var5.deleteOnExit();
            NLoginCore_370.d(a(ae, af) + var5 + a(ag, ah));
            return;
         }

         NLoginCore_285 var6 = NLoginCore_305.a().a(a(aj, ak), var5);
         if (var6.p() != al || !var6.af()) {
            NLoginCore_370.d(a(am, an ^ ao) + var6.p());
         }
      }
   }
}
