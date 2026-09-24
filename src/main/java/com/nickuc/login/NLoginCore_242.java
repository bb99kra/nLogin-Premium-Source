package com.nickuc.login;

import java.io.File;
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

public class NLoginCore_242 extends NLoginCore_098 {
   private static long bm = Long.reverse(-1297036692682702848L);
   private static int cv = Integer.reverse(805306368);
   private static int ce = (1073741824 >>> 251 | 1073741824 << -251) & -1;
   private static long cp = Long.reverse(350737646364077035L);
   private static long ct = Long.reverse(350737646364077035L);
   private static long cd = Long.reverse(-1297036692682702848L);
   private static int bu = 201326592 >>> 89 | 201326592 << -89;
   private static long q = Long.reverse(-1297036692682702848L);
   private static String[] e = new String[cv];
   private static int bd = Integer.reverse(-1073741824);
   private static int y = 8 >>> 3 | 8 << -3;
   private static long ck = Long.reverse(350737646364077035L);
   private static int bw = -1 >>> 24 | -1 << -24;
   private static int bi = 1048576 >>> 50 | 1048576 << -50;
   private static int bn = Integer.reverse(-1610612736);
   private static long p = Long.reverse(-1522759798622049301L);
   private static int ao = -1 >>> 116 | -1 << -116;
   private static long br = Long.reverse(-1297036692682702848L);
   private static String[] f = new String[NLoginCore_242.cy];
   private static int bz = Integer.reverse(-536870912);
   private static long at = Long.reverse(350737646364077035L);
   private static int cg = (-1 >>> 180 | -1 << -180) & -1;
   private static long ci = Long.reverse(350737646364077035L);
   private static int cm = Integer.reverse(1342177280);
   private static long bk = Long.reverse(-1522759798622049301L);
   private static long ab = Long.reverse(350737646364077035L);
   private static long bh = Long.reverse(-1297036692682702848L);
   private static long ca = Long.reverse(-1522759798622049301L);
   private static int e = Integer.reverse(0);
   private static long bo = Long.reverse(-1522759798622049301L);
   private static long be = Long.reverse(-1522759798622049301L);
   private static int cs = Integer.reverse(-805306368);
   private static int cy = (98304 >>> 45 | 98304 << -45) & -1;
   private static int co = (-1 >>> 232 | -1 << ~232 + 1) & -1;
   private static int al = Integer.reverse(1073741824);
   private static int cj = (150994944 >>> 88 | 150994944 << -88) & -1;
   private static int cr = Integer.reverse(-536870912);
   private static long by = Long.reverse(350737646364077035L);
   private static int z = (-1 >>> 106 | -1 << -106) & -1;
   private static long o;

   private static void b() {
      o = -2894469652052149417L;
      long var0 = o ^ -1033283744661563784L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(50 + 19),
               (byte)(78 + 5),
               (byte)(34 + 13),
               (byte)(57 + 10),
               (byte)(38 + 28),
               (byte)(65 + 2),
               (byte)(10 + 37),
               (byte)(33 + 47),
               (byte)(13 + 62),
               67,
               (byte)(70 + 13),
               (byte)(51 + 2),
               (byte)(70 + 10),
               (byte)(83 + 14),
               100,
               (byte)(9 + 91),
               (byte)(56 + 49),
               (byte)(19 + 91),
               (byte)(39 + 64)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(63 + 5), 69, (byte)(32 + 51)}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_027.E("Գ՞ջծՊջԼձգՠէՐքՃ\u058cեթթփտլ՚\u0557\u0558", (byte)72, 69);
               f[1] = NLoginCore_127.A("żőŵŗŔŮũţƌƎŠŒŧťŏƖƂƎźƖƘƋŢţ", (byte)72, 65);
               f[2] = NLoginCore_223.D("ҽӹԅԁӳԀӗӈԋӼӌәӎӭԓӨԑԖԐӪӒӳӠӡ", (byte)72, 68);
               f[3] = NLoginCore_324.D("ҿԇӱӒӥӚӚӷԊӯӈӟӮӦӤӽӿӕӳӑӲԙӠӡ", (byte)72, 68);
               f[4] = NLoginCore_004.F("ՕՏՔժ՚ՑմտսՙձձՅվռ\u0557՞Նՙ՝ձ՚\u0557\u0558", (byte)72, 70);
               f[5] = NLoginCore_387.B("ƅƃŲłşŤņŝƅŃŲŎōŒŏŭƋŦŶƍƙƛŢţ", (byte)72, 66);
               f[6] = NLoginCore_553.B("ŚŽƄŦŋŸŧŚũŢƓŅŴœƎƌŬřŹřŶťŢţ", (byte)72, 66);
               f[7] = NLoginCore_110.F("ՒՒՈՕռՓՒ՟դՖՇֆ՜ևՕը\u058c՛ֆչթթՐՋրֆ֖֔ժէ՚֑", (byte)72, 70);
               f[8] = NLoginCore_530.C("ӞӷӶӉӕӋӆӆӛәӹӊӼӪӰԂӵԏӹӲԏԙӠӡ", (byte)72, 67);
               f[9] = NLoginCore_324.C("ҿәԃӴӺӻӭӉԅӥԊӻӧӞԕӾԀӲӸӪԕӳӠӡ", (byte)72, 67);
               f[10] = NLoginCore_559.A("ƇŃŗŞņŷƊƉŬŠůƅƎŠŒŏŭũūƃƊƑũƓŰŞŸƕƂƄƏƘ", (byte)72, 65);
               f[11] = NLoginCore_223.F("ՇՏծժՎրՠկՎռեե՟ֆյ՜րշՉ\u0558՚ժ\u0557\u0558", (byte)72, 70);
               break;
            case 1:
               f[0] = NLoginCore_471.C("ҼӧԄӷӓԄӅӺӬөӹӧԁԊӪӱӱԎӢӗӚԚӼԏԐԌԍԋԓӹӜӰ", (byte)72, 67);
               f[1] = NLoginCore_553.E("ձՆժՌՉգ՞\u0558ցփՔաՕիցֈքպքէՈ՚\u0557\u0558", (byte)72, 69);
               f[2] = NLoginCore_521.E("ԴհռոժշՎԿւճՃՠևչՖՔբ՚՜գ֑՚\u0557\u0558", (byte)72, 69);
               f[3] = NLoginCore_232.A("ŁƉųŔŧŜŜŹƌűŋŊſƕŤƗƒƆŒŮűƋŢţ", (byte)72, 65);
               f[4] = NLoginCore_324.D("ӞӘӝӳӣӚӽԈԆӢӼԌӡԓӰӞӵԑԘԁӫӕԓԗӾӨԝӗәԟԟӗ", (byte)72, 68);
               f[5] = NLoginCore_223.B("ƅƃŲłşŤņŝƅŃźŪŞťŌŨŏƕŚƘƐŮŕƕƜŸūŜűŴŦŸ", (byte)72, 66);
               f[6] = NLoginCore_387.E("Տղչ՛Հխ՜Տ՞\u0557ֆչղը՟ՅպՍ՜\u058bեբՊ՝լէ\u058bդ\u0558ձֈս", (byte)72, 69);
               f[7] = NLoginCore_384.D("ӛӛӑӞԅӜӛӨӭӟӐԏӥԐӞӱԕӤԏԂӲөӒӯӿӶӟӿӵԗӡԗ", (byte)72, 68);
               f[8] = NLoginCore_397.C("ӞӷӶӉӕӋӆӆӛәӹԏӭԂӍӡӷӟԙԚԆԉӠӡ", (byte)72, 67);
               f[9] = NLoginCore_092.A("ŁśƅŶżŽůŋƇŧƍŎƄŞƓŴŠŹƐűŕƛŢţ", (byte)72, 65);
               f[10] = NLoginCore_324.A("ƇŃŗŞņŷƊƉŬŠůƅƎŠŒŏŭũūƃƊƘƐƑŷŭŘŹƎƣŲƕ", (byte)72, 65);
               f[11] = NLoginCore_091.E("ՇՏծժՎրՠկՎռզռդՆ\u0558։\u058bր֏դա\u0590\u0557\u0558", (byte)72, 69);
               break;
            case 2:
               f[0] = NLoginCore_232.A("ŹŵŚšŝŅƂƐƅŢżŗ", (byte)72, 65);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_453.E("մռՍՉտԴսհՠո՝՝ցՃ\u0558ՙռ\u0557֊֎սժ\u0557\u0558", (byte)72, 69);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_242.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(
                     NLoginCore_232.D("\u0530ՒՔԴ\u0558շկօձՀվմւռՅժ\u058c\u058bփ։փ\u0558", (byte)113, 68), NLoginCore_242.class.getClassLoader()
                  )
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_324.E("\u0590֝֜՟֛֖֪֟֟֙զ֤֤֪֨֡լ࣡ࣸअࣧ࣪࣬ंऌ࣮आւ", (byte)113, 69) + var1 + NLoginCore_397.B("ƛ", (byte)113, 66) + var2.toString(), var4
         );
      }
   }

   public NLoginCore_242(NLoginType_008 var1) {
      super(var1, NLoginCore_479.c, a(e, p ^ q), a(y & z, ab));
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(ce & cg, ci));
      String var2 = var1.getString(a(cj, ck));
      int var3 = var1.getInt(a(cm & co, cp));
      if (var3 != cr) {
         this.e(this.r, var2, Integer.toString(var3));
      }

      String var4 = var1.getString(a(cs, ct));
      this.a(this.r, var2, var4, null);
   }

   static {
      b();
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      boolean var2 = var1.d(a(al & ao, at));
      if (var2) {
         String var3 = var1.b(a(bd, be ^ bh));
         String var4 = var1.b(a(bi, bk ^ bm));
         String var5 = var1.b(a(bn, bo ^ br));
         String var6 = var1.b(a(bu & bw, by));
         this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var3, var6, var4, var5, new Properties(), NLoginCore_036.d.i()));
      } else {
         File var7 = new File(this.b(), a(bz, ca ^ cd));
         this.d = NLoginCore_586.a(this.m, var7, new Properties());
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 119L;
      var1 ^= -1033283744661563784L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(25 + 43),
                     (byte)(50 + 19),
                     (byte)(4 + 79),
                     (byte)(4 + 43),
                     (byte)(62 + 5),
                     (byte)(6 + 60),
                     (byte)(11 + 56),
                     (byte)(32 + 15),
                     (byte)(9 + 71),
                     (byte)(11 + 64),
                     (byte)(6 + 61),
                     (byte)(36 + 47),
                     (byte)(43 + 10),
                     (byte)(13 + 67),
                     (byte)(86 + 11),
                     (byte)(85 + 15),
                     (byte)(54 + 46),
                     105,
                     (byte)(35 + 75),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(57 + 11), (byte)(24 + 45), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_453.E("֧֦֚թִ֥֣֩֠֩հֲִ֮֮֫ն࣫ंएࣱࣶࣴऌखࣸऐ", (byte)123, 69));
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
}
