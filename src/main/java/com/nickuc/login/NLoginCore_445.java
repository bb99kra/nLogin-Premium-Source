package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_445 {
   a(NLoginCore_102.b),
   b(NLoginCore_102.c),
   c(NLoginCore_102.d),
   d(NLoginCore_102.e),
   e(NLoginCore_102.f),
   f(NLoginCore_102.g),
   g(NLoginCore_102.h),
   h(NLoginCore_102.i),
   i(NLoginCore_102.j),
   j(NLoginCore_102.k),
   k(NLoginCore_102.l),
   l(NLoginCore_102.m),
   m(NLoginCore_102.n),
   n(NLoginCore_102.o),
   o(NLoginCore_102.p),
   p(NLoginCore_102.q);

   private final NLoginCore_102 a;
   private static String[] a = new String[NLoginCore_445.r];
   private static String[] b = new String[NLoginCore_445.s];
   private static long c;
   private static int a = 262144 >>> 238 | 262144 << -238;
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(1073741824);
   private static int e = Integer.reverse(-1073741824);
   private static int f = Integer.reverse(536870912);
   private static int g = Integer.reverse(-1610612736);
   private static int h = (24 >>> 34 | 24 << -34) & -1;
   private static int i = Integer.reverse(-536870912);
   private static int j = Integer.reverse(268435456);
   private static int k = 18874368 >>> 53 | 18874368 << -53;
   private static int l = (160 >>> 228 | 160 << ~228 + 1) & -1;
   private static int m = Integer.reverse(-805306368);
   private static int n = Integer.reverse(805306368);
   private static int o = 106496 >>> 77 | 106496 << ~77 + 1;
   private static int p = 14680064 >>> 20 | 14680064 << -20;
   private static int q = Integer.reverse(-268435456);
   private static int r = Integer.reverse(134217728);
   private static int s = Integer.reverse(134217728);
   private static int t = 0 >>> 45 | 0 << ~45 + 1;
   private static long u = Long.reverse(-1133913861306689307L);
   private static long v = Long.reverse(-4611686018427387904L);
   private static int w = Integer.reverse(0);
   private static int x = Integer.reverse(Integer.MIN_VALUE);
   private static long y = Long.reverse(3477772157120698597L);
   private static int z = Integer.reverse(Integer.MIN_VALUE);
   private static int aa = Integer.reverse(1073741824);
   private static long ab = Long.reverse(3477772157120698597L);
   private static int ac = Integer.reverse(1073741824);
   private static int ad = Integer.reverse(-1073741824);
   private static long ae = Long.reverse(-1133913861306689307L);
   private static long af = Long.reverse(-4611686018427387904L);
   private static int ag = (25165824 >>> 183 | 25165824 << ~183 + 1) & -1;
   private static int ah = 262144 >>> 176 | 262144 << ~176 + 1;
   private static int ai = (-1 >>> 227 | -1 << -227) & -1;
   private static long aj = Long.reverse(3477772157120698597L);
   private static int ak = Integer.reverse(536870912);
   private static int al = 1310720 >>> 178 | 1310720 << ~178 + 1;
   private static long am = Long.reverse(3477772157120698597L);
   private static int an = 81920 >>> 110 | 81920 << ~110 + 1;
   private static int ao = (96 >>> 228 | 96 << -228) & -1;
   private static long ap = Long.reverse(3477772157120698597L);
   private static int aq = Integer.reverse(1610612736);
   private static int ar = -536870912 >>> 29 | -536870912 << ~29 + 1;
   private static long as = Long.reverse(3477772157120698597L);
   private static int at = 14 >>> 1 | 14 << ~1 + 1;
   private static int au = 524288 >>> 208 | 524288 << -208;
   private static long av = Long.reverse(-1133913861306689307L);
   private static long aw = Long.reverse(-4611686018427387904L);
   private static int ax = Integer.reverse(268435456);
   private static int ay = Integer.reverse(-1879048192);
   private static int az = -1 >>> 214 | -1 << -214;
   private static long ba = Long.reverse(3477772157120698597L);
   private static int bb = (-2147483644 >>> 255 | -2147483644 << ~255 + 1) & -1;
   private static int bc = Integer.reverse(1342177280);
   private static int bd = -1 >>> 3 | -1 << -3;
   private static long be = Long.reverse(3477772157120698597L);
   private static int bf = (335544320 >>> 57 | 335544320 << ~57 + 1) & -1;
   private static int bg = Integer.reverse(-805306368);
   private static long bh = Long.reverse(-1133913861306689307L);
   private static long bi = Long.reverse(-4611686018427387904L);
   private static int bj = (2816 >>> 8 | 2816 << -8) & -1;
   private static int bk = 3145728 >>> 114 | 3145728 << -114;
   private static long bl = Long.reverse(-1133913861306689307L);
   private static long bm = Long.reverse(-4611686018427387904L);
   private static int bn = (6 >>> 31 | 6 << -31) & -1;
   private static int bo = Integer.reverse(-1342177280);
   private static long bp = Long.reverse(-1133913861306689307L);
   private static long bq = Long.reverse(-4611686018427387904L);
   private static int br = '퀀' >>> 140 | 53248 << -140;
   private static int bs = Integer.reverse(1879048192);
   private static long bt = Long.reverse(-1133913861306689307L);
   private static long bu = Long.reverse(-4611686018427387904L);
   private static int bv = 1835008 >>> 113 | 1835008 << -113;
   private static int bw = Integer.reverse(-268435456);
   private static int bx = -1 >>> 185 | -1 << -185;
   private static long by = Long.reverse(3477772157120698597L);
   private static int bz = (1006632960 >>> 218 | 1006632960 << ~218 + 1) & -1;

   public int v() {
      return this.ordinal();
   }

   public NLoginCore_190 a(NLoginCore_277 var1) {
      return NLoginCore_150.a(this.a, var1);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_445.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.B("ūƍƏůƓƲƪǀƬŻƹƯƽƷƀƥǇǆƾǄƾƓ", (byte)98, 66), NLoginCore_445.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_433.D("ԾՋՊԍՍՉՄՍ\u0558ՇԔՒՖՏՒ\u0558Ԛ࢟ࢬࢥࢪࢩࢭࢧࢳࢫԯ", (byte)98, 68) + var1 + NLoginCore_397.A("Ž", (byte)98, 65) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 3L;
      var1 ^= 2880854648471936711L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(38 + 31),
                     83,
                     (byte)(24 + 23),
                     (byte)(6 + 61),
                     (byte)(5 + 61),
                     (byte)(21 + 46),
                     47,
                     (byte)(69 + 11),
                     (byte)(43 + 32),
                     (byte)(41 + 26),
                     (byte)(13 + 70),
                     (byte)(10 + 43),
                     (byte)(60 + 20),
                     (byte)(54 + 43),
                     (byte)(86 + 14),
                     (byte)(65 + 35),
                     (byte)(101 + 4),
                     (byte)(17 + 93),
                     (byte)(33 + 70)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), 69, (byte)(78 + 5)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.B("ƢƯƮűƱƭƨƱƼƫŸƶƺƳƶƼžԃԐԉԎԍԑԋԗԏ", (byte)96, 66));
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

   @Nullable
   public static NLoginCore_445 a(int var0) {
      NLoginCore_445[] var1 = values();
      return var0 >= 0 && var0 < var1.length ? var1[var0] : null;
   }

   private static void b() {
      c = -6405746722120547825L;
      long var0 = c ^ 2880854648471936711L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(18 + 50),
               (byte)(30 + 39),
               (byte)(3 + 80),
               (byte)(36 + 11),
               (byte)(43 + 24),
               (byte)(45 + 21),
               (byte)(25 + 42),
               (byte)(15 + 32),
               (byte)(22 + 58),
               (byte)(17 + 58),
               (byte)(35 + 32),
               (byte)(19 + 64),
               (byte)(8 + 45),
               80,
               (byte)(94 + 3),
               (byte)(12 + 88),
               (byte)(8 + 92),
               105,
               (byte)(89 + 21),
               (byte)(11 + 92)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(21 + 47), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_446.D("ЫЦѭеЩѩѷЬђхчюѼѐѰѫнѬѐуў҆эю", (byte)23, 68);
               b[1] = NLoginCore_324.D("ќнџўѧѤѺхиіѻт", (byte)23, 68);
               b[2] = NLoginCore_092.F("ԵԶԢԫԍԐԮԭԥԝՐԛ", (byte)23, 70);
               b[3] = NLoginCore_076.B("ĢĐÚġąīĊãĦĂïďīéëċĔĈòĆķăĀā", (byte)23, 66);
               b[4] = NLoginCore_384.B("ĀĜæõéăīöêāÿĞĜıĦĖāîčĸĺĹĀā", (byte)23, 66);
               b[5] = NLoginCore_397.B("ĄħĩàĩĈāĕüĎĚģēĲĜčè÷òġēĹĀā", (byte)23, 66);
               b[6] = NLoginCore_138.A("ûûðĩçħĈöåħüõ", (byte)23, 65);
               b[7] = NLoginCore_553.F("ԻԻԺՆԹԡԦՐԆՏՔԛ", (byte)23, 70);
               b[8] = NLoginCore_575.F("ԄԩԷԎԼՊԫՓԜԠԷԳՑԧ՚ԱՆՙԨՒԜԹԦԧ", (byte)23, 70);
               b[9] = NLoginCore_223.F("ԇԢԽԧԦ\u0530ԟԐԍԴԲԛ", (byte)23, 70);
               b[10] = NLoginCore_027.E("ՋԭԭՈԬԡԦԣԆԝՌԛ", (byte)23, 69);
               b[11] = NLoginCore_092.C("цэЧгѡфѣгйѴёт", (byte)23, 67);
               b[12] = NLoginCore_521.D("отўюжѸѧѐѼшмжѽѐѩњјѹ҄ѴѠ҆эю", (byte)23, 68);
               b[13] = NLoginCore_141.D("ќьЬыѯвѩшќѝмѸѭоѻѾѮпѶѱј҆эю", (byte)23, 68);
               b[14] = NLoginCore_451.C("ѴѮЫтхщїћиыдт", (byte)23, 67);
               b[15] = NLoginCore_453.F("ԄՁԪԝԹՐՆՉԏՄԢԛ", (byte)23, 70);
               break;
            case 1:
               b[0] = NLoginCore_433.C("ЫЦѭеЩѩѷЬђхцѵѰк҂Ѭѓѝѷ҅ѓѠэю", (byte)23, 67);
               b[1] = NLoginCore_530.E("ԕԶԗԛԾԜՍՅԬՔԲԛ", (byte)23, 69);
               b[2] = NLoginCore_091.D("ѥЭыстѰјєѨѷѕт", (byte)23, 68);
               b[3] = NLoginCore_127.D("ѯѝЧѮђѸїаѳяЯѿъяытҁѕѷњѾѶэю", (byte)23, 68);
               b[4] = NLoginCore_223.C("эѩгтжѐѸузюьдѼйѕыџѿѽѣѨѺѕѫєѪѭѪљћѫ҅", (byte)23, 67);
               b[5] = NLoginCore_446.E("ԪՍՏԆՏԮԧԻԢԴՃԷԫԑՆԨԸԷԾ\u0558Ԯ՟Ԧԧ", (byte)23, 69);
               b[6] = NLoginCore_138.B("ĔòûĂėĉğĠĦġøĎēĊĲĂġĄĥģĲĹĀā", (byte)23, 66);
               b[7] = NLoginCore_141.C("ѥщѕѵёьэцёѹиїэѿѽџісѿќѓѠэю", (byte)23, 67);
               b[8] = NLoginCore_092.D("ЫѐўеѣѱђѺучѦўѺѼјѯѶѠѣ҇р҆эю", (byte)23, 68);
               b[9] = NLoginCore_453.C("ёѡѭеѕђзбьвѮѾѕѕъъѼљюѸѼѶэю", (byte)23, 67);
               b[10] = NLoginCore_384.D("ЫђщюѶчЫјєіѳт", (byte)23, 68);
               b[11] = NLoginCore_110.E("ӾԙԊՉԤԻԬԴՏԫԏԲՓՍԐՋԎՏԪԾԾԩԦԧ", (byte)23, 69);
               b[12] = NLoginCore_004.F("ԗԛԷԧԏՑՀԩՕԡԕԎՃՖՑԓԼ\u0558ԲԯԞԩԦԧ", (byte)23, 70);
               b[13] = NLoginCore_387.F("ԵԥԅԤՈԋՂԡԵԶԖԲՏԺԩՕԫՖԲՇՎԹԦԧ", (byte)23, 70);
               b[14] = NLoginCore_553.D("џвЫхѐёььѺѝўћїѷѫѺтѲѽѢѹ҆эю", (byte)23, 68);
               b[15] = NLoginCore_173.E("ԅԩՀԽՄԞՅԤԔՖԦԛ", (byte)23, 69);
               break;
            case 2:
               b[0] = NLoginCore_530.F("ՃՁԶԁԜԡԣԍԋԪՄԛ", (byte)23, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_091.B("ėýÞĩĨćĖý÷ĥýĦĪħčçĵăĖįıĵļüĶĖįďĭēĘģ", (byte)23, 66);
         }
      }
   }

   static {
      b();
   }

   @Generated
   private NLoginCore_445(NLoginCore_102 var3) {
      this.a = var3;
   }

   public GUIButtonContainer a(NLoginCore_277 var1) {
      return new GUIButtonContainer(this, this.a(var1));
   }
}
