package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ChatHookManager extends NLoginCore_139 {
   private static int au = (-1 >>> 228 | -1 << ~228 + 1) & -1;
   private static long e;
   private static int ao = 0 >>> 56 | 0 << ~56 + 1;
   private static int aw = (6291456 >>> 244 | 6291456 << ~244 + 1) & -1;
   private static long ad = Long.reverse(-3860997805912308364L);
   private static String[] ZKM_STR_A = new String[ChatHookManager.az];
   private static int aq = Integer.reverse(536870912);
   private static int af = Integer.reverse(-1073741824);
   private static String[] ZKM_STR_B = new String[ChatHookManager.ba];
   private static int j = Integer.reverse(0);
   private static int ap = Integer.reverse(0);
   private static long ag = Long.reverse(5362374230942467444L);
   private static int q = Integer.reverse(0);
   private static int b = 0 >>> 113 | 0 << ~113 + 1;
   private static long ai = Long.reverse(Long.MIN_VALUE);
   private static int ar = (-1 >>> 230 | -1 << -230) & -1;
   private static long l = Long.reverse(5362374230942467444L);
   private static int ba = (112 >>> 132 | 112 << ~132 + 1) & -1;
   private static long av = Long.reverse(-3860997805912308364L);
   private static long as = Long.reverse(-3860997805912308364L);
   private static long g = Long.reverse(5362374230942467444L);
   private static int az = Integer.reverse(-536870912);
   private static long ay = Long.reverse(Long.MIN_VALUE);
   private static long i = Long.reverse(Long.MIN_VALUE);
   private static int k = (Integer.MIN_VALUE >>> 31 | Integer.MIN_VALUE << ~31 + 1) & -1;
   private static long ax = Long.reverse(5362374230942467444L);
   private static int y = 0 >>> 12 | 0 << -12;
   private static int at = Integer.reverse(-1610612736);
   private static long o = Long.reverse(Long.MIN_VALUE);
   private static int ak = Integer.reverse(Integer.MIN_VALUE);
   private static int ac = 67108864 >>> 89 | 67108864 << ~89 + 1;

   @Override
   public void b(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.u, var1x -> {
         if (var1x.contains(a(aq & ar, as))) {
            var4.d(var1x, a(at & au, av), a(aw, ax ^ ay));
         } else {
            var4.a(var1x);
         }
      });
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      if (var1.b().a() != NLoginCore_419.b) {
         return (j != 0);
      } else {
         NLoginInterface_040 var4 = var1.b();
         if (var4.j(a(k, l ^ o))) {
            return (q != 0);
         } else if (!var1.a().p()) {
            return (y != 0);
         } else {
            return ((!NLoginCore_150.j() != 0) || !var4.j(a(ac, ad)) && !var4.j(a(af, ag ^ ai)) ? ao : ak);
         }
      }
   }

   public ChatHookManager(NLoginCore_211 var1) {
      super(var1, a(b, g ^ i));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ChatHookManager.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.C("ԒԴԶԖԺՙՑէՓԢՠՖդ՞ԧՌծխեիեԺ", (byte)103, 67), ChatHookManager.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.D("Ս՚ՙԜ՜\u0558Փ՜էՖԣաե՞աէԩࢤࢷࢮ࢞ࢶࢩࣈ\u0896ࢸ࣍ࣇ࢚Ձ", (byte)103, 68) + var1 + NLoginCore_092.A("Ƈ", (byte)103, 65) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 1L;
      var1 ^= -3743231616916174527L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(29 + 39),
                     (byte)(35 + 34),
                     (byte)(73 + 10),
                     (byte)(25 + 22),
                     (byte)(50 + 17),
                     (byte)(29 + 37),
                     (byte)(9 + 58),
                     (byte)(14 + 33),
                     (byte)(60 + 20),
                     (byte)(18 + 57),
                     (byte)(52 + 15),
                     (byte)(43 + 40),
                     (byte)(22 + 31),
                     (byte)(38 + 42),
                     97,
                     (byte)(9 + 91),
                     (byte)(8 + 92),
                     (byte)(11 + 94),
                     (byte)(99 + 11),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.D("йцхЈшфпшѓтЏэёъэѓЕސޣޚފޢޕ\u07b4ނޤ\u07b9\u07b3ކ", (byte)11, 68));
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

   private static void b() {
      e = 3360547535887226450L;
      long var0 = e ^ -3743231616916174527L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(9 + 59),
               (byte)(18 + 51),
               (byte)(5 + 78),
               (byte)(40 + 7),
               (byte)(31 + 36),
               (byte)(33 + 33),
               (byte)(66 + 1),
               (byte)(8 + 39),
               (byte)(14 + 66),
               (byte)(16 + 59),
               (byte)(48 + 19),
               (byte)(13 + 70),
               53,
               (byte)(22 + 58),
               (byte)(3 + 94),
               (byte)(24 + 76),
               (byte)(94 + 6),
               (byte)(69 + 36),
               110,
               (byte)(21 + 82)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(18 + 50), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_530.F("ԗԓԒӵԪԦԛԉԫԹԬԇ", (byte)3, 70);
               ZKM_STR_B[1] = NLoginCore_530.C("ЖВБϴЩХКЈЪиЫІ", (byte)3, 67);
               ZKM_STR_B[2] = NLoginCore_091.E("ԵԚӵԯԫԚԮԚ\u0530ՀԍԹԕԾԤԸՈԳԒԙӾԥԒԓ", (byte)3, 69);
               ZKM_STR_B[3] = NLoginCore_004.C("Ͽϳ϶ЇЗзаЋмЫВЛПкКДЯІвЄϽъБВ", (byte)3, 67);
               ZKM_STR_B[4] = NLoginCore_575.B("Õ¹¶þĀËûÎÁ¿öÍ", (byte)3, 66);
               ZKM_STR_B[5] = NLoginCore_223.F("Ӳԧ\u0530ԱԦԒԕԌԐԌӼԾԺԷԙԒԕԩՈԵԹԭԆԗԌԐԊՋԽՒԨԔԪ\u0557Գԗԩԧ\u0530ԮԷԞՐԮ\u0558Դ\u0530՚ԷՙդԻԸՅԲԳ", (byte)3, 70);
               ZKM_STR_B[6] = NLoginCore_076.E("ԤӶԥԑԳӽԓԧԞԍԻԝԼԁԎԚԈԁԸԛԕՅԍԨՊԻԏՐՃՔՒԳ\u0558ՒՊԱԬ\u0557ԬԫԮ՝Ժԧ", (byte)3, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_232.C("ІйбϰЇжЋЙϼКϽЭЫИуЁОКЩЊОФБВ", (byte)3, 67);
               ZKM_STR_B[1] = NLoginCore_004.D("ЖФбЬгмϷОРЍϼІ", (byte)3, 68);
               ZKM_STR_B[2] = NLoginCore_091.D("дЙϴЮЪЙЭЙЯпЋЖЀнϽддЁгкДкБВ", (byte)3, 68);
               ZKM_STR_B[3] = NLoginCore_076.B("Æº½ÎÞþ÷ÒăòÙÇé÷ĉćăìïăïđØÙ", (byte)3, 66);
               ZKM_STR_B[4] = NLoginCore_397.B("ÞÞÑËÙÑăÐÖÐÅãêÂäâĊÇæÐĄëØÙ", (byte)3, 66);
               ZKM_STR_B[5] = NLoginCore_427.E("Ӳԧ\u0530ԱԦԒԕԌԐԌӼԾԺԷԙԒԕԩՈԵԹԭԆԗԌԐԊՋԽՒԨԔԪ\u0557Գԗԩԧ\u0530ԮԷԞՒՔգդԸՒԠԟԸզԽՅԲԳ", (byte)3, 69);
               ZKM_STR_B[6] = NLoginCore_553.B("ê¼ë×ùÃÙíäÓāãĂÇÔàÎÇþáÛċÓîĐāÕĖĉĚĘùþýāĉõÞġąĔęøĆùęìĜĭþĢĈĊûøù", (byte)3, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_223.C("ЧЀЕЬЭЋгϼБОтЁЃкПаМУмЦЙкБВ", (byte)3, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_575.B("Ô÷ÝÓíüÓÃ½ÖýÄàċöāčÁąÜĒāØÙ", (byte)3, 66);
         }
      }
   }

   static {
      b();
   }
}
