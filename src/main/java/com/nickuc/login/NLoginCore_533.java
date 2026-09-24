package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_533 extends NLoginCore_098 {
   private static String[] f = new String[NLoginCore_533.co];
   private static int ce = (1152 >>> 167 | 1152 << ~167 + 1) & -1;
   private static long be = Long.reverse(-5391377290451550117L);
   private static long o;
   private static long br = Long.reverse(-5391377290451550117L);
   private static int bp = 50331648 >>> 183 | 50331648 << ~183 + 1;
   private static long au = Long.reverse(5620492334958379008L);
   private static int bz = Integer.reverse(268435456);
   private static int al = (2048 >>> 74 | 2048 << -74) & -1;
   private static long p = Long.reverse(-5391377290451550117L);
   private static long bs = Long.reverse(5620492334958379008L);
   private static long by = Long.reverse(5620492334958379008L);
   private static int y = Integer.reverse(Integer.MIN_VALUE);
   private static int bd = Integer.reverse(-1073741824);
   private static long ab = Long.reverse(-347345707796594597L);
   private static long q = Long.reverse(5620492334958379008L);
   private static long bk = Long.reverse(-347345707796594597L);
   private static int bu = 234881024 >>> 185 | 234881024 << ~185 + 1;
   private static long at = Long.reverse(-5391377290451550117L);
   private static int e = (0 >>> 170 | 0 << -170) & -1;
   private static long bh = Long.reverse(5620492334958379008L);
   private static int bj = (-1 >>> 164 | -1 << ~164 + 1) & -1;
   private static long cd = Long.reverse(-347345707796594597L);
   private static long bv = Long.reverse(-5391377290451550117L);
   private static int cb = Integer.reverse(-1);
   private static long ck = Long.reverse(-5391377290451550117L);
   private static int cj = Integer.reverse(1342177280);
   private static int bi = (2 >>> 127 | 2 << ~127 + 1) & -1;
   private static int cm = 1441792 >>> 113 | 1441792 << ~113 + 1;
   private static long bo = Long.reverse(5620492334958379008L);
   private static int co = Integer.reverse(-805306368);
   private static String[] e = new String[cm];
   private static long bm = Long.reverse(-5391377290451550117L);
   private static long ci = Long.reverse(5620492334958379008L);
   private static int bl = (80 >>> 68 | 80 << -68) & -1;
   private static long cf = Long.reverse(-5391377290451550117L);
   private static long cl = Long.reverse(5620492334958379008L);

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al, at ^ au), a(bd, be ^ bh));
      String var3 = var1.b(a(bi & bj, bk));
      String var4 = var1.b(a(bl, bm ^ bo));
      String var5 = var1.b(a(bp, br ^ bs));
      this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var2, var3, var4, var5, new Properties(), NLoginCore_036.d.i()));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_533.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.A("ĿšţŃŧƆžƔƀŏƍƃƑƋŔŹƛƚƒƘƒŧ", (byte)76, 65), NLoginCore_533.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.D("ӼԉԈӋԋԇԂԋԖԅӒԐԔԍԐԖӘ\u085fࡣ\u086bࡓࡰࡪࡓࡹࡷࡺࡲӯ", (byte)76, 68) + var1 + NLoginCore_004.F("Ղ", (byte)76, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void b(ResultSet var1) {
      JSONObject var2 = new JSONObject(var1.getString(a(bu, bv ^ by)));
      this.r = var2.getString(a(bz & cb, cd));
      String var3 = var2.getString(a(ce, cf ^ ci));
      this.a(this.r, a(cj, ck ^ cl) + var3, null, null);
   }

   private static String a(int var0, long var1) {
      var1 ^= 114L;
      var1 ^= -982606169600488707L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(21 + 47),
                     (byte)(42 + 27),
                     (byte)(6 + 77),
                     (byte)(6 + 41),
                     (byte)(19 + 48),
                     (byte)(5 + 61),
                     (byte)(38 + 29),
                     (byte)(25 + 22),
                     (byte)(27 + 53),
                     (byte)(16 + 59),
                     (byte)(43 + 24),
                     (byte)(7 + 76),
                     (byte)(11 + 42),
                     80,
                     (byte)(75 + 22),
                     100,
                     (byte)(23 + 77),
                     (byte)(48 + 57),
                     (byte)(100 + 10),
                     (byte)(68 + 35)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(11 + 72)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_387.A("ŲſžŁƁŽŸƁƌŻňƆƊƃƆƌŎӕәӡӉӦӠӉӯӭӰӨ", (byte)72, 65));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   static {
      b();
   }

   private static void b() {
      o = -2737941102402227027L;
      long var0 = o ^ -982606169600488707L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(67 + 1),
               (byte)(56 + 13),
               (byte)(68 + 15),
               (byte)(15 + 32),
               (byte)(55 + 12),
               (byte)(17 + 49),
               (byte)(2 + 65),
               (byte)(46 + 1),
               (byte)(21 + 59),
               (byte)(13 + 62),
               (byte)(8 + 59),
               83,
               (byte)(32 + 21),
               (byte)(73 + 7),
               (byte)(44 + 53),
               (byte)(68 + 32),
               (byte)(74 + 26),
               105,
               (byte)(72 + 38),
               (byte)(99 + 4)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(6 + 62), 69, 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_127.C("ӃҡӫӎӡӛӬӱӀӊӰҷӰӓӍӸӶӏҹӉӋӋӈӉ", (byte)64, 67);
               f[1] = NLoginCore_575.E("ԽդԴոՑչԳՆզժոԲրնՠփտևւՒՔոՏՐ", (byte)64, 69);
               f[2] = NLoginCore_173.F("ՂՁՀածՓնղԹԶՐժԽՏխվշդհհթոՏՐ", (byte)64, 70);
               f[3] = NLoginCore_183.D("ӦӰӀӟӁӃҭӂҴӯӐҸӹӻӨҹӫӔӯӟӷӛӈӉ", (byte)64, 68);
               f[4] = NLoginCore_453.A("ŉœŒŖķŚŋũŭŴŞŗųŔűśťŁŜƄŋŻŒœ", (byte)64, 65);
               f[5] = NLoginCore_138.F("գԴծՄՓՆ՚զձէՔցյ՜ՕՄՀԼդղՠՒՏՐ", (byte)64, 70);
               f[6] = NLoginCore_397.B("ŊŚŃūŉŰűķřķſŌŜĿŝŤťŶƀŤƍŕŒœ", (byte)64, 66);
               f[7] = NLoginCore_076.D("ӋӟӐұҮӉӊӮӳұӪҽ", (byte)64, 68);
               f[8] = NLoginCore_446.E("ԧՋԲմԷխռյԯճԺրՊվՂՙօ՜պՖպոՏՐ", (byte)64, 69);
               f[9] = NLoginCore_521.B("őŭňĶŬŏŶŕŋŏĸőšŞſųŢŚŕśřťŒœ", (byte)64, 66);
               f[10] = NLoginCore_141.A("ŨĴųŗŚůŦŶŞœŬŇ", (byte)64, 65);
               break;
            case 1:
               f[0] = NLoginCore_575.B("ōīŵŘūťŶŻŊŔŹŝļžńųŠŻųŵŞƋŒœ", (byte)64, 66);
               f[1] = NLoginCore_223.E("ԽդԴոՑչԳՆզժյԹՕպԺԾԾոնվՕֈՏՐ", (byte)64, 69);
               f[2] = NLoginCore_141.D("һҺҹӚӧӌӯӫҲүӉӎӖӎӤҶӜӖӕӷӽӱӈӉ", (byte)64, 68);
               f[3] = NLoginCore_471.F("խշՇզՈՊԴՉԻնՙ՝՜խ՞շտԿ\u0557ոզզՙ\u0558\u0558֎ֆժՋսփք", (byte)64, 70);
               f[4] = NLoginCore_446.F("ՆՐՏՓԴ\u0557Ոզժձ՝ԺկԺՍտԻսհոքֆջ\u0558ՖՉՍ֎ղՏվ՝", (byte)64, 70);
               f[5] = NLoginCore_530.C("ӜҭӧҽӌҿӓӟӪӠӏӓӌҲӑӑӞӝӕӡӭәӲҷӝӜԃӽӳӸӘӭ", (byte)64, 67);
               f[6] = NLoginCore_451.A("ŊŚŃūŉŰűķřķŽŋŃŮŢŦŗŔşœņŻŒœ", (byte)64, 65);
               f[7] = NLoginCore_324.A("łŰĺťļŇĹŘĹŁŚŇ", (byte)64, 65);
               f[8] = NLoginCore_397.C("ҠӄҫӭҰӦӵӮҨӬҳӇӶӷӯҳӳӮӡӯӣӛӈӉ", (byte)64, 67);
               f[9] = NLoginCore_471.C("ӇӣҾҬӢӅӬӋӁӅҮӊӕҺӲӨӳӎӹӠӂԁӈӉ", (byte)64, 67);
               f[10] = NLoginCore_446.A("ŴŲŻťőŲŕſŚŰŠŻŕŰśžŁƉƆŠŬťŒœ", (byte)64, 65);
               break;
            case 2:
               f[0] = NLoginCore_387.F("ծեի\u0530ծեԳՎԷԽըԾՑԼՀաՀ\u0558ափժ՟Յֈնռբ֍֒֏աՐ", (byte)64, 70);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_384.E("ՀՋըԵծՐխՆԻյՙաՋգՁՏճյըՑաֈՏՐ", (byte)64, 69);
         }
      }
   }

   public NLoginCore_533(NLoginType_008 var1) {
      super(var1, NLoginCore_479.e, a(e, p ^ q), a(y, ab));
   }
}
