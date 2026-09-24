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

public class SHA256HashProvider extends PBKDF2HashProvider implements NLoginInterface_037 {
   private static int at = Integer.reverse(1073741824);
   private static int ad = Integer.reverse(1073741824);
   private static long j = Long.reverse(-2738188573441261568L);
   private static String[] d = new String[SHA256HashProvider.bb];
   private static long af = Long.reverse(-2738188573441261568L);
   private static int av = 65536 >>> 111 | 65536 << ~111 + 1;
   private static int v = 0 >>> 72 | 0 << ~72 + 1;
   private static int az = 2097152 >>> 241 | 2097152 << ~241 + 1;
   private static long ap = Long.reverse(4914942000171893922L);
   private static int n = (0 >>> 170 | 0 << ~170 + 1) & -1;
   private static int ah = (96 >>> 197 | 96 << -197) & -1;
   private static int an = (12288 >>> 172 | 12288 << ~172 + 1) & -1;
   private static long e;
   private static long bd = Long.reverse(4914942000171893922L);
   private static int aw = 268435456 >>> 56 | 268435456 << ~56 + 1;
   private static int bb = ('\ue000' >>> 'm' | 57344 << -109) & -1;
   private static int w = Integer.reverse(Integer.MIN_VALUE);
   private static long ae = Long.reverse(4914942000171893922L);
   private static int ag = Integer.reverse(Integer.MIN_VALUE);
   private static int au = Integer.reverse(0);
   private static long as = Long.reverse(-7046618610124143454L);
   private static int ax = Integer.reverse(536870912);
   private static int al = (0 >>> 222 | 0 << ~222 + 1) & -1;
   private static long aj = Long.reverse(-2738188573441261568L);
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static int f = (0 >>> 129 | 0 << ~129 + 1) & -1;
   private static long h = Long.reverse(4914942000171893922L);
   private static int p = Integer.reverse(0);
   private static long be = Long.reverse(-2738188573441261568L);
   private static long ai = Long.reverse(4914942000171893922L);
   private static final String cn = a(SHA256HashProvider.bc, bd ^ be);
   private static int ar = Integer.reverse(-1610612736);
   private static int ay = Integer.reverse(Integer.MIN_VALUE);
   private static int ba = Integer.reverse(-536870912);
   private static int am = Integer.reverse(1073741824);
   private static long r = Long.reverse(4914942000171893922L);
   private static int ak = Integer.reverse(0);
   private static String[] c = new String[ba];
   private static long t = Long.reverse(-2738188573441261568L);
   private static long aq = Long.reverse(-2738188573441261568L);
   private static int bc = Integer.reverse(1610612736);
   private static int k = Integer.reverse(536870912);
   private static int ao = Integer.reverse(536870912);

   @Override
   public boolean i(String var1, String var2) {
      String[] var3 = var2.split(a(f, h ^ j));
      if (var3.length != k) {
         return (boolean)n;
      } else if (!var3[p].equalsIgnoreCase(a(q, r ^ t))) {
         return (boolean)v;
      } else {
         Integer var4 = NLoginCore_449.a(var3[w]);
         if (var4 == null) {
            NLoginCore_370.c(a(ad, ae ^ af) + var3[ag] + a(ah, ai ^ aj));
            return (boolean)al;
         } else {
            String var5 = var3[am];
            byte[] var6 = d(var3[an]);
            byte[] var7 = a(a(ao, ap ^ aq), var1.toCharArray(), var5.getBytes(), var4, b(a(ar, as)));
            return PBKDF2HashProvider.a(var6, var7);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  SHA256HashProvider.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_183.F("՞րւբֆֳ֥֝֟ծְ֢֪֬ճֱֱַֺֹ֘ֆ", (byte)122, 70), SHA256HashProvider.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_027.E("֦֥֙ըֳ֤֢֨֟֨կֱֳ֪֭֭յऀऋࣼँऄऎउࣷःࣰऌऑࣧचࣩ\u0590", (byte)122, 69) + var1 + NLoginCore_521.C("՝", (byte)122, 67) + var2.toString(), var4
         );
      }
   }

   private static byte[] d(String var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1 / at];

      for (int var3 = au; var3 < var1; var3 += 2) {
         var2[var3 / av] = (byte)((Character.digit(var0.charAt(var3), aw) << ax) + Character.digit(var0.charAt(var3 + ay), az));
      }

      return var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 91L;
      var1 ^= 4462577079677662321L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(44 + 24),
                     (byte)(65 + 4),
                     (byte)(82 + 1),
                     (byte)(20 + 27),
                     (byte)(35 + 32),
                     (byte)(5 + 61),
                     67,
                     (byte)(37 + 10),
                     80,
                     (byte)(53 + 22),
                     (byte)(40 + 27),
                     (byte)(45 + 38),
                     (byte)(37 + 16),
                     (byte)(68 + 12),
                     (byte)(76 + 21),
                     (byte)(11 + 89),
                     (byte)(68 + 32),
                     (byte)(99 + 6),
                     (byte)(35 + 75),
                     (byte)(14 + 89)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(40 + 28), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_451.D("ҐҝҜџҟқҖҟҪҙѦҤҨҡҤҪѬ߷ࠂ߳߸\u07fbࠅࠀ߮ߺߧࠃࠈߞࠑߠ", (byte)40, 68));
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

   private static void b() {
      e = 4981869415789669410L;
      long var0 = e ^ 4462577079677662321L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(42 + 26),
               (byte)(56 + 13),
               (byte)(60 + 23),
               (byte)(10 + 37),
               (byte)(36 + 31),
               (byte)(55 + 11),
               (byte)(21 + 46),
               47,
               (byte)(62 + 18),
               (byte)(19 + 56),
               (byte)(42 + 25),
               (byte)(72 + 11),
               (byte)(46 + 7),
               (byte)(16 + 64),
               (byte)(85 + 12),
               (byte)(81 + 19),
               (byte)(37 + 63),
               105,
               (byte)(106 + 4),
               (byte)(99 + 4)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(8 + 75)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_427.E("֚\u0590ս֡֙ֈւ֣իծշմ", (byte)112, 69);
               d[1] = NLoginCore_027.A("ƮǓƔƬƲƼǙƪƖǘƔǡƮǛƠƴơǙǩǃǄǅƲƳ", (byte)112, 65);
               d[2] = NLoginCore_232.D(
                  "ըՈԺՀմ՜քռՆկֆեեըզէւոըկլփլկ֏ՉՑՔ֚փ֍֞֞ֈ֕ձ֣մ֢՟՝֥ր֪֢֥֣շզ֢\u058b\u058b֎ִ։֤\u058c֖֩֬շִַָֻּ֪֮֞ռջֽׁ֥֘֝֠֟\u05c9ׅ\u05ccא\u058c\u05cb\u05cfׄגֿ֎֪֗\u058b֮ז\u05caׇ",
                  (byte)112,
                  68
               );
               d[3] = NLoginCore_384.F("դ֕֞դև֣վ֢֭֠֟մ", (byte)112, 70);
               d[4] = NLoginCore_027.A("ƮƫǅƫǉǖǌǛƮǞǜƢƠƟƯǥǃǩǜƣǖƵƲƳ", (byte)112, 65);
               d[5] = NLoginCore_446.E("ջո֒ո֖֣֙֨ջ֫֩կխլռֲ\u0590ֶ֩հ֣ւտր", (byte)112, 69);
               d[6] = NLoginCore_076.F("ջո֒ո֖֣֙֨ջ֫֩կխլռֲ\u0590ֶ֩հ֣ւտր", (byte)112, 70);
               break;
            case 1:
               d[0] = NLoginCore_110.F("֠զճ֦։թբռսլ֙մ", (byte)112, 70);
               d[1] = NLoginCore_384.C("ՔչԺՒ\u0558բտՐԼվՇ՞ՊնբևՙչւՋօ՛\u0558ՙ", (byte)112, 67);
               d[2] = NLoginCore_530.F(
                  "֏կաէ֛փ֣֫խ֖֭\u058c\u058c֏֍֎֩֟֏ֶ֖֪֖֓֓հոջִּׁ֪ׅׅ֯֘\u05ca֛\u05c9ֆք\u05cc֧ב\u05c9\u05cc\u05ca֞֍\u05c9ֲֲֵכְ\u05cbֳאֽד֞מכׅוןףעבֿ֣֢ׄ\u05ccׇרפ׆װ\u05ec׳\u05f7ֳײ\u05f6\u05ee\u05cb\u05ed\u05fd\u05f7ױ־ׯּ\u05ed\u05f8",
                  (byte)112,
                  70
               );
               d[3] = NLoginCore_201.F("բ֜ղ֡դ֞գ֣֭իտմ", (byte)112, 70);
               d[4] = NLoginCore_110.D("ՔՑիՑկռղցՔքւՄ՝սՂրվև\u0558փլ՛\u0558ՙ", (byte)112, 68);
               d[5] = NLoginCore_530.A("ƮƫǅƫǉǖǌǛƮǞǞƢǓǥǇƣǕǅǓǜǘƵƲƳ", (byte)112, 65);
               d[6] = NLoginCore_451.F("ջո֒ո֖֣֙֨ջ֫֫֙֡ֈխִ֦֩֊նָ֚տր", (byte)112, 70);
               break;
            case 2:
               d[0] = NLoginCore_091.E("֦֦յ֑֖բ֘֫֊֤պ֜վձև֊ְֱխָո֑֧֭֕֬ն֚\u058bְ֘֕", (byte)112, 69);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_183.A("ƗƯƖƤǘǔƬǔƠǛƚǡƝƟǧǤǂƻǂƝǌǥǘƫǪǝƬƿƱǣƵǦ", (byte)112, 65);
         }
      }
   }

   static {
      b();
   }
}
