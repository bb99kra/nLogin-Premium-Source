package com.nickuc.login;

import com.nickuc.login.api.enums.AccountType;
import com.nickuc.login.api.nLoginAPI.nLoginInternal;
import com.nickuc.login.api.types.Identity;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginType_011 implements nLoginInternal {
   private static long aj = Long.reverse(7943673492002518387L);
   private static long aa = Long.reverse(7943673492002518387L);
   private static int u = (-1 >>> 186 | -1 << -186) & -1;
   private static long r = Long.reverse(7943673492002518387L);
   private static long m = Long.reverse(7943673492002518387L);
   private static long n = Long.reverse(2738188573441261568L);
   private static int h = Integer.reverse(1073741824);
   private static int q = Integer.reverse(-1610612736);
   private static int t = Integer.reverse(1610612736);
   private static String[] ZKM_STR_A = new String[NLoginType_011.al];
   private static long y = Long.reverse(2738188573441261568L);
   private static int l = (48 >>> 68 | 48 << -68) & -1;
   private static long ae = Long.reverse(5205484918561256819L);
   private static long ah = Long.reverse(2738188573441261568L);
   private static long d = Long.reverse(5205484918561256819L);
   private static long ag = Long.reverse(7943673492002518387L);
   private static long c;
   private static int a = 0 >>> 95 | 0 << -95;
   private static long ak = Long.reverse(2738188573441261568L);
   private static int ac = (75497472 >>> 247 | 75497472 << ~247 + 1) & -1;
   private static long v = Long.reverse(5205484918561256819L);
   private static int am = (384 >>> 165 | 384 << ~165 + 1) & -1;
   private static long x = Long.reverse(7943673492002518387L);
   private static int b = Integer.reverse(-1);
   private static int i = Integer.reverse(-1);
   private static long g = Long.reverse(5205484918561256819L);
   private static String[] ZKM_STR_B = new String[am];
   private static int k = Integer.reverse(536870912);
   private static int f = (-1 >>> 104 | -1 << -104) & -1;
   private static int o = Integer.reverse(536870912);
   private static int ai = 2816 >>> 72 | 2816 << -72;
   private static long j = Long.reverse(5205484918561256819L);
   private static int z = Integer.reverse(268435456);
   private static int e = 131072 >>> 241 | 131072 << ~241 + 1;
   private static int w = 58720256 >>> 55 | 58720256 << -55;
   private static long s = Long.reverse(2738188573441261568L);
   private static int ad = -1 >>> 136 | -1 << -136;
   private static int al = (50331648 >>> 246 | 50331648 << ~246 + 1) & -1;
   private static int af = Integer.reverse(1342177280);
   private static long ab = Long.reverse(2738188573441261568L);
   private static long p = Long.reverse(5205484918561256819L);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_011.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.D("҂ҤҦ҆ҪӉӁӗӃҒӐӆӔӎҗҼӞӝӕӛӕҪ", (byte)55, 68), NLoginType_011.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_223.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҦҸҲҺӊҽӍҘҹŁ", (byte)55, 65) + var1 + NLoginCore_076.F("ԭ", (byte)55, 70) + var2.toString(), var4
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Identity createIdentity(String var1, UUID var2, UUID var3, AccountType var4) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(a & b, d));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(a(e & f, g));
      } else {
         switch (NLoginType_004.ZKM_STR_A[var4.ordinal()]) {
            case 1:
               if (var2 == null) {
                  throw new IllegalArgumentException(a(h & i, j));
               }

               if (var2.version() != k) {
                  throw new IllegalArgumentException(a(l, m ^ n) + var2.version() + a(o, p) + var1 + a(q, r ^ s) + var2);
               }
               break;
            case 2:
               if (var3 == null) {
                  throw new IllegalArgumentException(a(t & u, v));
               }

               if (var3.version() != 0) {
                  throw new IllegalArgumentException(a(w, x ^ y) + var3.version() + a(z, aa ^ ab) + var1 + a(ac & ad, ae) + var3);
               }
         }

         return new NLoginCore_539(var1, var2, var3);
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 100L;
      var1 ^= -8773386552734719635L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(24 + 44),
                     (byte)(58 + 11),
                     (byte)(21 + 62),
                     (byte)(2 + 45),
                     (byte)(52 + 15),
                     (byte)(61 + 5),
                     (byte)(3 + 64),
                     (byte)(23 + 24),
                     (byte)(24 + 56),
                     (byte)(67 + 8),
                     67,
                     (byte)(74 + 9),
                     (byte)(17 + 36),
                     (byte)(12 + 68),
                     97,
                     (byte)(45 + 55),
                     (byte)(49 + 51),
                     (byte)(85 + 20),
                     (byte)(83 + 27),
                     (byte)(93 + 10)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(62 + 6), 69, (byte)(19 + 64)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_183.E("ԷՄՃԆՆՂԽՆՑՀԍՋՏՈՋՑԓࢍ࢙࢟ࢡࢱࢤࢴࡿࢠ", (byte)24, 69));
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

   public Identity createIdentityFromKnownName(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException(a(af, ag ^ ah));
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException(a(ai, aj ^ ak));
      } else {
         return new NLoginCore_174(var1);
      }
   }

   private static void b() {
      c = -3554186213762417546L;
      long var0 = c ^ -8773386552734719635L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(33 + 35),
               (byte)(57 + 12),
               (byte)(45 + 38),
               (byte)(33 + 14),
               67,
               (byte)(3 + 63),
               (byte)(40 + 27),
               (byte)(14 + 33),
               (byte)(72 + 8),
               (byte)(67 + 8),
               (byte)(64 + 3),
               (byte)(73 + 10),
               (byte)(22 + 31),
               (byte)(42 + 38),
               (byte)(44 + 53),
               (byte)(74 + 26),
               100,
               (byte)(84 + 21),
               (byte)(22 + 88),
               (byte)(39 + 64)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(53 + 30)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_223.D("ЭЯПсйџфЗЯчёњъъъшЫюѤўѩчоѨѦтљйвзѧћещыѲѓќэѣљѶѠэ", (byte)16, 68);
               ZKM_STR_B[1] = NLoginCore_530.A("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģĀĠĜĤČįĐĲĬķĩĥăčöĬįĶĬĖļİć", (byte)16, 65);
               ZKM_STR_B[2] = NLoginCore_453.A("ÎĒÓĎąçòîĊúÝýČăěñùáĖĨôýįĉíģāğĔĠĉĤĆĬùõĶûęĞĞċļć", (byte)16, 65);
               ZKM_STR_B[3] = NLoginCore_471.C(
                  "зђюѠапѕѦОдљѦѫьуѨяѥѝѲрѩѤѳьѲѡиѳѼѺљѺѲѫѵєуїћтњѵщѨўѵѣхѪюѿѰџѲўіѬѩҋјҚҏ҅ѰѧқќҁѰҏҡ҄ҀҧҟҁѸ҄ҝѶҘѹҙ҄ѫѦҧҖ҆ҋѱ҅Ҽғѽҳѷқҩҵҳҷ҅ҟ҄Ҿҍ", (byte)16, 67
               );
               ZKM_STR_B[4] = NLoginCore_397.F("ԞԼԢԖՇԈԔԟԤԞՋԐԏԨՍԝԍՄԐԫԐՈԟԠ", (byte)16, 70);
               ZKM_STR_B[5] = NLoginCore_521.F("Ԕԏ\u0530ԷԓԳՈԷԸԡԈԥԻԝԊԧԯԑՃԶԤՈԟԠ", (byte)16, 70);
               ZKM_STR_B[6] = NLoginCore_173.E("ԀԼԨԳՃՃՇԟՊԘՌՀԠԥՋԆՎ\u0530ՖԣՎԶՙԴԲԽԚՑ՝ՂՎՍԼեըՉՇզՕը\u0558ՅԪԴ", (byte)16, 69);
               ZKM_STR_B[7] = NLoginCore_453.E(
                  "ԼԖԂԴԗԴԴՇԚՄԫՀԾՌԧԩԩՁԭԕԨԯԨՆՌ\u0558ՔԺԸԟԭԣՐԾ՞\u0558ՀԴիԧԵդԼԨՒդզմՑՕ\u0558կյՃՋ՜ՙՆԻտՖՀդքզՒրֈրՇՃֈՊլփեՙժգեց՟֑֘֎֗֎նՏ֝Օկ֢֚֞լքշզ֙թ֖֤֜ֆևծմ", (byte)16, 69
               );
               ZKM_STR_B[8] = NLoginCore_138.C("зѕлЯѠСЭинзѤЩШсѦжЦѝЩфЩѡий", (byte)16, 67);
               ZKM_STR_B[9] = NLoginCore_397.A("çâăĊæĆěĊċôÛøĎðÝúĂäĖĉ÷ěòó", (byte)16, 65);
               ZKM_STR_B[10] = NLoginCore_141.C("ЭЯПсйџфЗЯчёњъъъшЫюѤўѩчоѨѦтљйвзѧћещыѲѓќэѣљѶѠэ", (byte)16, 67);
               ZKM_STR_B[11] = NLoginCore_451.F("ԔԖԆԨԠՆԫӾԖԮԸՁԱԱԱԯԒԵՋՅՐԭՍՉՑԹ՜Խ՟ՙդՖՒ\u0530Ժԣՙ՜գՙՃթ՝Դ", (byte)16, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_384.B("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģāøĢĠüēóìñġĕđģĤļďķļċĔĠĊć", (byte)16, 66);
               ZKM_STR_B[1] = NLoginCore_384.A("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģĀĠĜĤČįĐĲĬķĩĐķĕĴĉĜĬċĪĚĞć", (byte)16, 65);
               ZKM_STR_B[2] = NLoginCore_575.D("ДјЙєыЭидѐрУуђщѡзпЧќѮкуѵягѩчѥњѦяѪіѮрѰѢэѠѹҀѶќэ", (byte)16, 68);
               ZKM_STR_B[3] = NLoginCore_076.E(
                  "ԞԹԵՇԗԦԼՍԅԛՀՍՒԳԪՏԶՌՄՙԧՐՋ՚ԳՙՈԟ՚գաՀաՙՒ՜ԻԪԾՂԩՁ՜\u0530ՏՅ՜ՊԬՑԵզ\u0557ՆՙՅԽՓՐղԿցնլ\u0557ՎւՃը\u0557նֈիէ֎ֆը՟իք՝տՠրիՒՍ֎սխղ\u0558լ֣պդ֦֤֛֣֗՜յե֘պջ֬գհ֜ղ֊փְ֖ղ֒տր",
                  (byte)16,
                  69
               );
               ZKM_STR_B[4] = NLoginCore_471.B("ñďõéĚÛçò÷ñĞĠþîîėħôøīĕúĞæøāğíĆĐĢĸ", (byte)16, 66);
               ZKM_STR_B[5] = NLoginCore_027.E("Ԕԏ\u0530ԷԓԳՈԷԸԡԈՃ\u0530ՏԲՆԤԡԠԶԱԢԟԠ", (byte)16, 69);
               ZKM_STR_B[6] = NLoginCore_223.F("ԀԼԨԳՃՃՇԟՊԘՌՀԠԥՋԆՎ\u0530ՖԣՎԶՙԴԲԽԚՑ՝ՂՎՍՐաԙԨԷԩՉ՜ՋզԦԴ", (byte)16, 70);
               ZKM_STR_B[7] = NLoginCore_427.A(
                  "ďéÕćêććĚíėþēđğúüüĔĀèûĂûęğīħčċòĀöģđıīēćľúĈķďûĥķĹŇĤĨīłňĖĞįĬęĎŒĩēķŗĹĥœśœĚĖśĝĿŖĸĬĽĶĸŔĲūŤšŪšŉĢŰĨłűŭŵĿĳŦŊųĵżōŇšžŶŃĽůžŰŔŦŊƌłťŒœ", (byte)16, 65
               );
               ZKM_STR_B[8] = NLoginCore_559.F("ԞԼԢԖՇԈԔԟԤԞՊԧԠԳԉՊԲԟԫՒՈԐ\u0530ԺԘ՚ԸՐՀԙՍ՚", (byte)16, 70);
               ZKM_STR_B[9] = NLoginCore_127.B("çâăĊæĆěĊċôÜčęčïĈēóúâäěòó", (byte)16, 66);
               ZKM_STR_B[10] = NLoginCore_027.E("ԔԖԆԨԠՆԫӾԖԮԸՁԱԱԱԯԒԵՋՅՐԮԥՏՍԩՀԠԙԞՎՂԴ՛ՓՄՁՄժ\u0558ժԷՙԴ", (byte)16, 69);
               ZKM_STR_B[11] = NLoginCore_232.B("çéÙûóęþÑéāċĔĄĄĄĂåĈĞĘģĀĠĜĤČįĐĲĬķĩąİöúôčĶõùĭİć", (byte)16, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_201.E("ԚՆӹԟԀՂԥԆԮԤԏԨԲՍԱԜԧՂՁԕԱԢԟԠ", (byte)16, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_183.F("ԔՃԕԝԣԘՉՁԃԀԺԆԏԼԼՉԤՁԡԣՕԢԟԠ", (byte)16, 70);
         }
      }
   }
}
