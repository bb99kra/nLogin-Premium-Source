package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_437 extends NLoginType_032 {
   private static int bz = Integer.reverse(Integer.MIN_VALUE);
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static int cd = Integer.reverse(Integer.MIN_VALUE);
   private static int bo = 0 >>> 96 | 0 << -96;
   private static String[] ZKM_STR_A = new String[NLoginCore_437.ch];
   private static int bj = (0 >>> 232 | 0 << -232) & -1;
   private static int bw = Integer.reverse(0);
   private static int bc = '耀' >>> 206 | 32768 << -206;
   private static long ay = Long.reverse(-6341068275337658368L);
   private static int ce = Integer.reverse(-1610612736);
   private static int bf = 6291456 >>> 213 | 6291456 << ~213 + 1;
   private static String[] ZKM_STR_B = new String[NLoginCore_437.ci];
   private static long ax = Long.reverse(-2718840801652279408L);
   private static int bl = (0 >>> 104 | 0 << ~104 + 1) & -1;
   private static int cc = 262144 >>> 242 | 262144 << ~242 + 1;
   private static int bi = Integer.reverse(0);
   private static int cb = 0 >>> 118 | 0 << ~118 + 1;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int aw = (0 >>> 46 | 0 << ~46 + 1) & -1;
   private static int ca = (0 >>> 150 | 0 << ~150 + 1) & -1;
   private static long bb = Long.reverse(-6341068275337658368L);
   private static int bk = Integer.reverse(0);
   private static long ba = Long.reverse(-2718840801652279408L);
   private static int bt = Integer.reverse(Integer.MIN_VALUE);
   private static int av = (0 >>> 11 | 0 << -11) & -1;
   private static int br = 8 >>> 1 | 8 << ~1 + 1;
   private static int bv = Integer.reverse(0);
   private static int bq = Integer.reverse(0);
   private static int by = Integer.reverse(0);
   private static int bd = Integer.reverse(-1);
   private static long be = Long.reverse(8233913492112766864L);
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static long cg = Long.reverse(-6341068275337658368L);
   private static int ch = 48 >>> 3 | 48 << -3;
   private static int bn = Integer.reverse(0);
   private static long e;
   private static long bs = Long.reverse(8233913492112766864L);
   private static int bm = 0 >>> 66 | 0 << ~66 + 1;
   private static int bu = 0 >>> 84 | 0 << -84;
   private static long bg = Long.reverse(8233913492112766864L);
   private static int bx = 0 >>> 3 | 0 << ~3 + 1;
   private static long cf = Long.reverse(-2718840801652279408L);
   private static int ci = 24576 >>> 236 | 24576 << -236;
   private static int bh = 0 >>> 122 | 0 << ~122 + 1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_437.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_446.E("Լ՞ՠՀդփջ֑սՌ֊ր֎ֈՑն֘֗֏֕֏դ", (byte)88, 69), NLoginCore_437.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.E("շքփՆֆւսֆ֑րՍ\u058b֏ֈ\u058b֑Փ࣮࣎ࣟ࣠ࢽࣱࣲࣜէ", (byte)88, 69) + var1 + NLoginCore_138.E("Վ", (byte)88, 69) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   @Override
   public void a(NLoginInterface_042 var1, String var2, String[] var3) {
      if (!(var1 instanceof NLoginCore_277)) {
         NLoginCore_487 var13 = NLoginCore_487.x;
         Object[] var14 = new Object[a];
         var14[av] = a(aw, ax ^ ay) + (var3.length > 0 ? a(az, ba ^ bb) : a(bc & bd, be)) + String.join(a(bf, bg), var3);
         NLoginCore_150.a(var1, var13, var14);
      } else {
         NLoginCore_277 var4 = (NLoginCore_277)var1;
         NLoginCore_509 var5 = this.a.a().b(var4);
         ForceRegisterConfig var6 = var5.a();
         if (var6 == null) {
            NLoginCore_150.a(var4, NLoginCore_487.w);
            NLoginCore_150.a(var4, NLoginCore_194.F);
         } else if (var6.s()) {
            NLoginCore_150.a(var4, NLoginCore_487.H);
            NLoginCore_150.a(var4, NLoginCore_508.g);
            NLoginCore_150.a(var4, NLoginCore_194.F);
         } else if (var5.a().b(NLoginCore_077.e)) {
            NLoginCore_150.a(var4, NLoginCore_487.F);
            NLoginCore_150.a(var4, NLoginCore_508.f);
            NLoginCore_150.a(var4, NLoginCore_194.F);
         } else if (var3.length == 0) {
            NLoginInterface_024 var10 = var5.a();
            NLoginCore_150.a(var4, NLoginCore_487.e, var2x -> var10.e(var2x, var2.toLowerCase(Locale.ENGLISH) + a(ce, cf ^ cg)));
         } else {
            NLoginCore_229 var7 = var6.a();
            if (var7 != NLoginCore_229.a && var7 != NLoginCore_229.c) {
               String var8 = var4.ac();
               if (NLoginCore_477.M.ar() && !NLoginCore_477.S.a(new Object[bn]).contains(var8)) {
                  NLoginCore_576 var9 = this.a.a().a(var8);
                  if (var9 == null) {
                     NLoginCore_150.a(var4, NLoginCore_487.w);
                     NLoginCore_150.a(var4, NLoginCore_194.F);
                     return;
                  }

                  if (var9.a(NLoginCore_477.N.r())) {
                     NLoginCore_487 var10001 = NLoginCore_487.v;
                     Object[] var10002 = new Object[bp];
                     var10002[bq] = var9.a().stream().map(NLoginCore_216::getName).collect(Collectors.joining(a(br, bs)));
                     NLoginCore_150.a(var4, var10001, var10002);
                     NLoginCore_150.a(var4, NLoginCore_194.F);
                     return;
                  }
               }
            }

            if (var3.length == bt) {
               NLoginCore_150.a(var4, NLoginCore_487.O);
               NLoginCore_150.a(var4, NLoginCore_194.F);
            } else {
               String var11 = var3[bv];
               int var12 = var11.length();
               if (var12 <= NLoginCore_477.T.r()) {
                  NLoginCore_150.a(var4, NLoginCore_487.L);
                  NLoginCore_150.a(var4, NLoginCore_194.F);
               } else if (var12 >= NLoginCore_477.U.r()) {
                  NLoginCore_150.a(var4, NLoginCore_487.K);
                  NLoginCore_150.a(var4, NLoginCore_194.F);
               } else if (NLoginCore_477.V.ar() && !BCryptHashProvider.b().matcher(var11).matches()) {
                  NLoginCore_150.a(var4, NLoginCore_487.M);
                  NLoginCore_150.a(var4, NLoginCore_194.F);
               } else if (!var11.equals(var3[bz])) {
                  NLoginCore_150.a(var4, NLoginCore_487.N);
                  NLoginCore_150.a(var4, NLoginCore_508.h);
                  NLoginCore_150.a(var4, NLoginCore_194.F);
               } else {
                  this.a.b().a(var6, var4, var5, var11, null, (cc != 0), (cd != 0));
               }
            }
         }
      }
   }

   public NLoginCore_437(NLoginCore_466 var1) {
      super(var1);
      this.b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 21L;
      var1 ^= -5627185576920779960L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(26 + 42),
                     (byte)(6 + 63),
                     (byte)(22 + 61),
                     (byte)(4 + 43),
                     67,
                     (byte)(29 + 37),
                     (byte)(15 + 52),
                     (byte)(42 + 5),
                     (byte)(61 + 19),
                     (byte)(59 + 16),
                     (byte)(42 + 25),
                     (byte)(20 + 63),
                     (byte)(14 + 39),
                     (byte)(51 + 29),
                     97,
                     (byte)(15 + 85),
                     (byte)(63 + 37),
                     (byte)(102 + 3),
                     (byte)(41 + 69),
                     (byte)(84 + 19)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), (byte)(49 + 20), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.E("հսռԿտջնտ֊չՆքֈցք֊Ռࣇࣘࣙࣧࢶࣕ࣫࣪", (byte)81, 69));
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
      e = 715708489598313051L;
      long var0 = e ^ -5627185576920779960L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(35 + 33),
               (byte)(17 + 52),
               (byte)(51 + 32),
               (byte)(42 + 5),
               (byte)(39 + 28),
               (byte)(24 + 42),
               (byte)(55 + 12),
               (byte)(23 + 24),
               (byte)(3 + 77),
               (byte)(36 + 39),
               (byte)(2 + 65),
               (byte)(32 + 51),
               (byte)(28 + 25),
               (byte)(31 + 49),
               97,
               100,
               (byte)(22 + 78),
               (byte)(11 + 94),
               (byte)(89 + 21),
               (byte)(10 + 93)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_173.F("\u0530ԌԨԍӰӱԔԮԾԜӼԟԅԹԩԻԤԆԴԈԼԻԮԑՇԮՄԔԱԬՒՃ", (byte)5, 70);
               ZKM_STR_B[1] = NLoginCore_223.E("ԄԓԩԬԚӼԊԱԍԓԘԉ", (byte)5, 69);
               ZKM_STR_B[2] = NLoginCore_201.A("¿ÁüÝÑÃûßÖçØÑ", (byte)5, 65);
               ZKM_STR_B[3] = NLoginCore_427.D("ЇЖЬЯНϿЍдАЖЛЌ", (byte)5, 68);
               ZKM_STR_B[4] = NLoginCore_446.A("ðìäæû¾ÐâØÔöÑ", (byte)5, 65);
               ZKM_STR_B[5] = NLoginCore_397.E("ԄԓԩԬԚӼԊԱԍԓԘԉ", (byte)5, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_324.C("гЏЫАϳϴЗбсПϿТЈмЬоЧЉзЋпЬЭПЍУяЩСчЧи", (byte)5, 67);
               ZKM_STR_B[1] = NLoginCore_453.D("гВБКЙйЕбрЙЗЌ", (byte)5, 68);
               ZKM_STR_B[2] = NLoginCore_471.C("ЋМдМпЍДБЎϼЂЌ", (byte)5, 67);
               ZKM_STR_B[3] = NLoginCore_091.E("ԇԊӻԑԈԏԖԲԙԐԾԉ", (byte)5, 69);
               ZKM_STR_B[4] = NLoginCore_427.B("÷½ÌòãúþăÚÃöÑ", (byte)5, 66);
               ZKM_STR_B[5] = NLoginCore_141.B("úäĀðÖ¹ôĈóÁĊÑ", (byte)5, 66);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_384.D("огЯЪЩЖврцрЕБххЩЈчЦЙИШЪЗИ", (byte)5, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_138.E("ԊԲԻӹԷԔԘӺԯԗԡՁԆԟԾԪՊԟԫԞՆԽԔԕ", (byte)5, 69);
         }
      }
   }
}
