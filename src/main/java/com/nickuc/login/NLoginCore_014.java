package com.nickuc.login;

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

public class NLoginCore_014 extends NLoginType_032 {
   private static long cc = Long.reverse(-7061644215716937728L);
   private static int be = -1 >>> 150 | -1 << -150;
   private static int bh = (0 >>> 134 | 0 << ~134 + 1) & -1;
   private static int bd = Integer.reverse(-1073741824);
   private static int a = 1 >>> 96 | 1 << -96;
   private static int cg = (0 >>> 159 | 0 << ~159 + 1) & -1;
   private static int cj = 0 >>> 202 | 0 << ~202 + 1;
   private static int bl = 2621440 >>> 243 | 2621440 << -243;
   private static long bs = Long.reverse(-7061644215716937728L);
   private static String[] d = new String[NLoginCore_014.cx];
   private static int cq = Integer.reverse(Integer.MIN_VALUE);
   private static int cv = Integer.reverse(-1073741824);
   private static int by = Integer.reverse(0);
   private static int bk = (16384 >>> 174 | 16384 << -174) & -1;
   private static long ba = Long.reverse(-7061644215716937728L);
   private static long e;
   private static int cu = Integer.reverse(1073741824);
   private static int ca = Integer.reverse(-536870912);
   private static int ci = Integer.reverse(0);
   private static int cn = Integer.reverse(-1879048192);
   private static long az = Long.reverse(-9076135791038160039L);
   private static int bt = (16 >>> 195 | 16 << -195) & -1;
   private static int bw = Integer.reverse(0);
   private static long cb = Long.reverse(-9076135791038160039L);
   private static long bm = Long.reverse(-9076135791038160039L);
   private static int cm = Integer.reverse(0);
   private static int bb = (256 >>> 103 | 256 << -103) & -1;
   private static long bf = Long.reverse(2020733690802742105L);
   private static int bi = (64 >>> 196 | 64 << -196) & -1;
   private static long cs = Long.reverse(-9076135791038160039L);
   private static long cp = Long.reverse(-7061644215716937728L);
   private static int bq = (786432 >>> 177 | 786432 << ~177 + 1) & -1;
   private static long ax = Long.reverse(2020733690802742105L);
   private static int cl = 8 >>> 225 | 8 << -225;
   private static int bz = 0 >>> 16 | 0 << -16;
   private static long bn = Long.reverse(-7061644215716937728L);
   private static int ck = (0 >>> 95 | 0 << ~95 + 1) & -1;
   private static int ay = 1073741824 >>> 222 | 1073741824 << -222;
   private static int bp = Integer.reverse(-1073741824);
   private static long br = Long.reverse(-9076135791038160039L);
   private static long co = Long.reverse(-9076135791038160039L);
   private static int bv = 2097152 >>> 117 | 2097152 << -117;
   private static int cr = 640 >>> 134 | 640 << ~134 + 1;
   private static int bo = Integer.reverse(1073741824);
   private static int bx = Integer.reverse(Integer.MIN_VALUE);
   private static long ce = Long.reverse(-9076135791038160039L);
   private static int cw = Integer.reverse(-805306368);
   private static int aw = Integer.reverse(0);
   private static int cd = Integer.reverse(268435456);
   private static int bu = (0 >>> 148 | 0 << -148) & -1;
   private static long ct = Long.reverse(-7061644215716937728L);
   private static long cf = Long.reverse(-7061644215716937728L);
   private static int bg = Integer.reverse(536870912);
   private static int av = (0 >>> 6 | 0 << ~6 + 1) & -1;
   private static long bj = Long.reverse(2020733690802742105L);
   private static long bc = Long.reverse(2020733690802742105L);
   private static String[] c = new String[cw];
   private static int cx = 360448 >>> 111 | 360448 << -111;
   private static int ch = 0 >>> 63 | 0 << ~63 + 1;

   @Override
   protected void a(NLoginInterface_042 var1, String var2, String[] var3) {
      if (NLoginCore_329.n.ar()) {
         if (!NLoginCore_329.d.ar()) {
            if (!(var1 instanceof NLoginCore_277)) {
               NLoginCore_487 var20 = NLoginCore_487.x;
               Object[] var21 = new Object[a];
               var21[av] = a(aw, ax)
                  + NLoginCore_466.h.a().aa()
                  + (var3.length > 0 ? a(ay, az ^ ba) : a(bb, bc))
                  + String.join(a(bd & be, bf), var3);
               NLoginCore_150.a(var1, var20, var21);
            } else {
               NLoginCore_277 var4 = (NLoginCore_277)var1;
               NLoginCore_187 var5 = this.a.a();
               if (!var5.b(var4)) {
                  NLoginCore_509 var15 = var5.b(var4);
                  NLoginCore_501 var16 = var15.d(NLoginCore_567.n);
                  if (var16 != null && var16.a() == NLoginCore_211.b) {
                     NLoginCore_466 var18 = NLoginCore_466.b;
                     String[] var22 = new String[bg];
                     var22[bh] = a(bi, bj);
                     var22[bk] = a(bl, bm ^ bn);
                     var22[bo] = Integer.toString(NLoginCore_211.b.v());
                     var22[bp] = Integer.toString(NLoginCore_445.c.v());
                     var18.a(var4, var15, var22);
                  }
               } else if (var3.length == 0) {
                  String var17 = a(bq, br ^ bs);
                  Object[] var10001 = new Object[bt];
                  var10001[bu] = var2;
                  var10001[bv] = NLoginCore_150.a(NLoginCore_487.D, var4);
                  String var14 = String.format(var17, var10001);
                  NLoginCore_487 var19 = NLoginCore_487.x;
                  Object[] var10002 = new Object[bx];
                  var10002[by] = var14;
                  NLoginCore_150.a(var1, var19, var10002);
               } else {
                  NLoginCore_509 var6 = var5.b(var4);
                  ForceRegisterConfig var7 = var6.a();
                  synchronized (var7.c) {
                     if (!var7.h()) {
                        NLoginCore_150.a(var1, NLoginCore_487.t);
                        NLoginCore_150.a(var4, NLoginCore_194.F);
                        return;
                     }

                     UUID var9 = var7.getMojangId();
                     if (var9 != null) {
                        if (var9.equals(var7.a())) {
                           var6.a().a(var6.j() ? a(ca, cb ^ cc) : a(cd, ce ^ cf));
                           NLoginCore_150.a(var1, NLoginCore_194.F);
                           return;
                        }

                        if (var7.t()) {
                           NLoginCore_291 var10 = this.a.a();
                           String var11 = var3[cg];
                           if (!var10.a(var7, var11)) {
                              NLoginCore_150.a(var4, NLoginCore_487.P);
                              NLoginCore_150.a(var4, NLoginCore_194.F);
                              return;
                           }

                           var7.b(null);
                           if (!this.a.a().a(var7)) {
                              var7.b(var9);
                              NLoginCore_150.a(var4, NLoginCore_487.w);
                              NLoginCore_150.a(var4, NLoginCore_194.F);
                              return;
                           }

                           var4.a(NLoginCore_150.a(NLoginCore_487.r, var4));
                           return;
                        }
                     }
                  }

                  NLoginCore_466 var10000 = NLoginCore_466.b;
                  String[] var10003 = new String[cl];
                  var10003[cm] = a(cn, co ^ cp);
                  var10003[cq] = a(cr, cs ^ ct);
                  var10003[cu] = Integer.toString(NLoginCore_211.b.v());
                  var10003[cv] = Integer.toString(NLoginCore_445.c.v());
                  var10000.a(var4, var6, var10003);
               }
            }
         }
      }
   }

   private static void b() {
      e = -7294582867979874239L;
      long var0 = e ^ -7348227837346636250L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(43 + 25),
               (byte)(46 + 23),
               (byte)(36 + 47),
               (byte)(45 + 2),
               (byte)(42 + 25),
               (byte)(33 + 33),
               (byte)(40 + 27),
               (byte)(42 + 5),
               (byte)(19 + 61),
               (byte)(22 + 53),
               (byte)(31 + 36),
               (byte)(3 + 80),
               (byte)(24 + 29),
               (byte)(10 + 70),
               97,
               100,
               (byte)(54 + 46),
               (byte)(47 + 58),
               (byte)(88 + 22),
               (byte)(7 + 96)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(52 + 17), (byte)(49 + 34)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_575.D("ռձշ֙֔սջբ\u0590ոՠծ", (byte)123, 68);
               d[1] = NLoginCore_232.A("ǪǚƩǄǁƫǓǡƲǄǶƽ", (byte)123, 65);
               d[2] = NLoginCore_530.B("ƶǆǘǁǰǢƼǯǆǏǶƽ", (byte)123, 66);
               d[3] = NLoginCore_397.A("ǪǚƩǄǁƫǓǡƲǄǶƽ", (byte)123, 65);
               d[4] = NLoginCore_173.A("ǅǡưǊƬǴǣǃǏǤǄƽ", (byte)123, 65);
               d[5] = NLoginCore_183.E("սպ֧֞խխ֗խցչֵּ\u058cֶֹ֩֙֘ո־ֳ֡֊\u058b", (byte)123, 69);
               d[6] = NLoginCore_384.F("չ֚խ֢֣֔վֳ\u0590։ճְ֦֍֟֟ղִ֣֟֡׃֊\u058b", (byte)123, 70);
               d[7] = NLoginCore_092.A("ǞǀǦƬǩǠǡǯǦǠǧǌǣǐƮǨǴǠǓǝǿǒƿǚǡǅǁǼǵǦǅǋǎȋǰǤǒǭǢȊǟȐȏǴǑȌȔșȘǙǙǾǺȝǠǺȧȣǞǺǠșȢǶ", (byte)123, 65);
               d[8] = NLoginCore_027.D("֛Ւճ֊֍նրնպչցք֤և֜֟ոբ֑պև\u058b֔֟ցծ\u0590ֶ֨մ֚նִֵֵֹֿ֕֜֬ւօׁ֥\u05ca׀֛֜֙\u05caֈ֨\u0590֏\u05c8\u05c9ֲׁׄחגִֶָ", (byte)123, 68);
               d[9] = NLoginCore_451.F("և֣ղ\u058cծֶ֥օ֑֦ֆտ", (byte)123, 70);
               d[10] = NLoginCore_530.B("ƻƸǜǥƫƫǕƫƿƷǳǺǊǧǗǴǷǖƶǼǟǱǈǉ", (byte)123, 66);
               break;
            case 1:
               d[0] = NLoginCore_092.E("ֈհց\u058cֵիֱֲ֨֏֒տ", (byte)123, 69);
               d[1] = NLoginCore_092.A("ƮƷǞǆǁǯǧǃǟƮǀƽ", (byte)123, 65);
               d[2] = NLoginCore_553.D("տ֗ՠ֣՝՟՞֑֦՞֟ծ", (byte)123, 68);
               d[3] = NLoginCore_076.F("֏կ֦֮ձօյִ֧֓ւտ", (byte)123, 70);
               d[4] = NLoginCore_384.E("օ֬կւձլֳ։֗ւֈֳօ֛֮֫֙ռֳִ֮֟֊\u058b", (byte)123, 69);
               d[5] = NLoginCore_027.F("սպ֧֞խխ֗խցչִֶַֽ֪֫֗֏֢\u058bֳ֗֊\u058b", (byte)123, 70);
               d[6] = NLoginCore_453.E("չ֚խ֢֣֔վֳ\u0590։ղ֜֍ռև֑\u0590ֳֿ֮֞֝֊\u058b", (byte)123, 69);
               d[7] = NLoginCore_004.A("ǞǀǦƬǩǠǡǯǦǠǧǌǣǐƮǨǴǠǓǝǿǒƿǚǡǅǁǼǵǦǅǋǎȋǰǤǒǭǢȊǟȐȏǴǑȌȔșȘǙǙǾǺȕǶǵǥǸǡǧȈȪȚǤ", (byte)123, 65);
               d[8] = NLoginCore_201.C("֛Ւճ֊֍նրնպչցք֤և֜֟ոբ֑պև\u058b֔֟ցծ\u0590ֶ֨մ֚նִֵֵֹֿ֕֜֬ւօׁ֥\u05ca׀֛֜֙\u05caֈ֨\u0590֎ֲ֤֪\u05c9֔כב֭֕ו", (byte)123, 67);
               d[9] = NLoginCore_427.F("հ֥սօտ֖ֆփ֧չ֏֜մָ֫\u058bտ֘ջֵ֡֍֊\u058b", (byte)123, 70);
               d[10] = NLoginCore_004.E("սպ֧֞խխ֗խցչֲִ֪֝֓յִֵ֑֓վֻտׂ֤֤֡׃օֈֶ֡", (byte)123, 69);
               break;
            case 2:
               d[0] = NLoginCore_530.A("ǢǩǀǛǠǟǭǯǡǒǳǰǳƭƲǽǾƱǶǯǒǸȂǣǿǐǃǧǔǼǄǤ", (byte)123, 65);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_201.A("ƭƿƧǎƭǋǱƿƭǎǲƽ", (byte)123, 65);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 121L;
      var1 ^= -7348227837346636250L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(14 + 55),
                     (byte)(33 + 50),
                     (byte)(14 + 33),
                     (byte)(22 + 45),
                     (byte)(14 + 52),
                     (byte)(59 + 8),
                     (byte)(3 + 44),
                     (byte)(12 + 68),
                     (byte)(21 + 54),
                     (byte)(64 + 3),
                     (byte)(10 + 73),
                     (byte)(4 + 49),
                     (byte)(79 + 1),
                     (byte)(35 + 62),
                     (byte)(80 + 20),
                     (byte)(9 + 91),
                     (byte)(2 + 103),
                     (byte)(89 + 21),
                     (byte)(59 + 44)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(4 + 65), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_446.F("ԭԺԹӼԼԸԳԼՇԶԃՁՅԾՁՇԉ࢜ࡷ\u0893ࢆ࢝ࢩ࢘࢟ࢉࢌ", (byte)14, 70));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_014.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.E("ӰԒԔӴԘԷԯՅԱԀԾԴՂԼԅԪՌՋՃՉՃԘ", (byte)12, 69), NLoginCore_014.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_201.E("ԫԸԷӺԺԶԱԺՅԴԁԿՃԼԿՅԇ࢚ࡵ\u0891ࢄ࢛ࢧ\u0896࢝ࢇࢊԝ", (byte)12, 69) + var1 + NLoginCore_530.F("Ԃ", (byte)12, 70) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public NLoginCore_014(NLoginCore_466 var1) {
      super(var1);
   }
}
