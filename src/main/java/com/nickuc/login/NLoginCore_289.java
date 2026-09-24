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

public class NLoginCore_289 extends NLoginCore_098 {
   private static int cj = 536870913 >>> 253 | 536870913 << -253;
   private static String[] e = new String[NLoginCore_289.cv];
   private static int bn = 1024 >>> 200 | 1024 << ~200 + 1;
   private static int cy = Integer.reverse(805306368);
   private static int ce = 1073741824 >>> 251 | 1073741824 << ~251 + 1;
   private static int bg = Integer.reverse(0);
   private static int cb = -1 >>> 150 | -1 << -150;
   private static long cu = Long.reverse(288230376151711744L);
   private static int bi = 100663296 >>> 185 | 100663296 << -185;
   private static int ao = Integer.reverse(-1);
   private static long bo = Long.reverse(-4118172789611893007L);
   private static int m = (-1 >>> 93 | -1 << -93) & -1;
   private static int cv = Integer.reverse(805306368);
   private static long ab = Long.reverse(-4118172789611893007L);
   private static int bu = '쀀' >>> 237 | 49152 << -237;
   private static int bp = (1280 >>> 104 | 1280 << -104) & -1;
   private static long o;
   private static int cr = Integer.reverse(-805306368);
   private static long br = Long.reverse(-4406403165763604751L);
   private static int al = Integer.reverse(1073741824);
   private static String[] f = new String[cy];
   private static long cp = Long.reverse(-4118172789611893007L);
   private static long bs = Long.reverse(288230376151711744L);
   private static long bk = Long.reverse(-4406403165763604751L);
   private static int bd = Integer.reverse(1073741824);
   private static long by = Long.reverse(288230376151711744L);
   private static long ct = Long.reverse(-4406403165763604751L);
   private static int cg = -1 >>> 58 | -1 << ~58 + 1;
   private static long at = Long.reverse(-4118172789611893007L);
   private static int bf = Integer.reverse(Integer.MIN_VALUE);
   private static long bv = Long.reverse(-4406403165763604751L);
   private static long cd = Long.reverse(-4118172789611893007L);
   private static long ci = Long.reverse(-4118172789611893007L);
   private static int y = 128 >>> 39 | 128 << ~39 + 1;
   private static int e = Integer.reverse(0);
   private static long ck = Long.reverse(-4118172789611893007L);
   private static long bm = Long.reverse(288230376151711744L);
   private static int bz = (-536870912 >>> 93 | -536870912 << ~93 + 1) & -1;
   private static long p = Long.reverse(-4118172789611893007L);
   private static int co = (-1 >>> 92 | -1 << -92) & -1;
   private static int cm = (80 >>> 131 | 80 << ~131 + 1) & -1;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_289.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.D("ђѴѶіѺҙґҧғѢҠҖҤҞѧҌҮҭҥҫҥѺ", (byte)39, 68), NLoginCore_289.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.B("İĽļÿĿĻĶĿŊĹĆńňŁńŊČѾѺѳ҉ҚҡҚ҅ҏҥҪģ", (byte)39, 66) + var1 + NLoginCore_223.B("ć", (byte)39, 66) + var2.toString(), var4);
      }
   }

   private static void b() {
      o = -8109010485196448957L;
      long var0 = o ^ 705858205868202074L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(37 + 31),
               (byte)(35 + 34),
               (byte)(78 + 5),
               47,
               (byte)(53 + 14),
               (byte)(46 + 20),
               (byte)(21 + 46),
               (byte)(32 + 15),
               (byte)(37 + 43),
               (byte)(3 + 72),
               (byte)(53 + 14),
               83,
               (byte)(35 + 18),
               (byte)(58 + 22),
               (byte)(92 + 5),
               (byte)(55 + 45),
               (byte)(57 + 43),
               (byte)(29 + 76),
               (byte)(23 + 87),
               (byte)(24 + 79)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_183.C("\u0557զՊծզըբժթՅՠԭԸԯթՉթՒ՟թ՜ՙՆՇ", (byte)106, 67);
               f[1] = NLoginCore_387.D("ի՟ԹԪլհբԬԯՌ\u0557ոոՎյՆԺնզի\u0558ՙՆՇ", (byte)106, 68);
               f[2] = NLoginCore_530.F("֔ո\u0557֓ր֥֡՟֥֡սճն֝ն֪օ֠ֆ֭լֲչպ", (byte)106, 70);
               f[3] = NLoginCore_092.C("աՅԤՠՍծղԬծղՍԯթբ\u0530ճՔԵԵպԽկՆՇ", (byte)106, 67);
               f[4] = NLoginCore_223.F("֔ո\u0557֓ր֥֡՟֥֡րը֖֜ս֬ռջջֲֳ֤֨֓֫և\u058c֤շ֏յ֧", (byte)106, 70);
               f[5] = NLoginCore_241.E("֔ո\u0557֓ր֥֡՟֥֡վ֦֝֝֫եկժխօսռչպ", (byte)106, 69);
               f[6] = NLoginCore_241.F("֔ո\u0557֓ր֥֡՟֥֡տդ֭֬֫\u058c֧֬֜ւճֲչպ", (byte)106, 70);
               f[7] = NLoginCore_397.D("՛ԷՅիէԧխՂՑԵՎՏԴթՃէպՋՐրըտՆՇ", (byte)106, 68);
               f[8] = NLoginCore_521.E("֎֔պպաշեմսբչծ", (byte)106, 69);
               f[9] = NLoginCore_387.B("ƄǉƊƟǏƽƚǀƱǉǔƛ", (byte)106, 66);
               f[10] = NLoginCore_127.C("ՂՙԾդԾՈ՟եԿաըԻ", (byte)106, 67);
               f[11] = NLoginCore_553.B("ƬƉƛƋƱƠưƉǌƪƢƛ", (byte)106, 66);
               break;
            case 1:
               f[0] = NLoginCore_451.C("\u0557զՊծզըբժթՅբՖՁԯղԻ՚ոկլձՙՆՇ", (byte)106, 67);
               f[1] = NLoginCore_433.F("֞֒լ՝֣֟֕՟բտ։֔թ֢֪ծ֗֙վ֦֢֨չպ", (byte)106, 70);
               f[2] = NLoginCore_575.B("ǁƥƄǀƭǎǒƌǎǒƫƓƬƭǇǚƮƼǈǞǡǋƟƢƿǔǀƧƻǢƽǦ", (byte)106, 66);
               f[3] = NLoginCore_427.A("ǁƥƄǀƭǎǒƌǎǒƫƩǅǂǌǉǄǓƮƼƺǋǌǐǡǜƮǜƞǙƷǀ", (byte)106, 65);
               f[4] = NLoginCore_232.A("ǁƥƄǀƭǎǒƌǎǒƭƕǃǉƪǙƩƨƨǕǀǖƯǚǞǓƜǑǒǨƜƵ", (byte)106, 65);
               f[5] = NLoginCore_384.A("ǁƥƄǀƭǎǒƌǎǒƪƦǆǄǎƲǅǆǑƟǏƪƸƾǤưǜƧƷƤǣǡ", (byte)106, 65);
               f[6] = NLoginCore_183.A("ǁƥƄǀƭǎǒƌǎǒƬǋƥǕǗƺƫƳƶƬƶưǘǚƴǍǑǦƼƾǋƶ", (byte)106, 65);
               f[7] = NLoginCore_397.F("֎ժո֚֞՚֠յքըւ֩֙ր֍֛֭֮֫֩տֲչպ", (byte)106, 70);
               f[8] = NLoginCore_575.E("֘պ։ցՕ֚կչ֔՟֘֩ռրֆ֤֡֩խְե\u058cչպ", (byte)106, 69);
               f[9] = NLoginCore_427.C("թԶՀՅՁէԾ՝ԪեԾՠԮկժԱ՝ԺԺթՕտՆՇ", (byte)106, 67);
               f[10] = NLoginCore_232.E("ղ֏յկ֠֔ե՜֔֒ՠծ", (byte)106, 69);
               f[11] = NLoginCore_324.E("՞յչտմչօպֈ՞գեևն֢փ֯ևժժ֊\u058cչպ", (byte)106, 69);
               break;
            case 2:
               f[0] = NLoginCore_110.C("բԶԽԺԧՋԺՒաԲԭշշՑՌԴ\u0557ՒՏՕՙՕՠջջՍևՠպվքֆ", (byte)106, 67);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_471.D("՜ԨԧգիծԫՓԽժՎԻ", (byte)106, 68);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 32L;
      var1 ^= 705858205868202074L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(22 + 46),
                     (byte)(39 + 30),
                     (byte)(59 + 24),
                     (byte)(41 + 6),
                     (byte)(19 + 48),
                     (byte)(47 + 19),
                     (byte)(14 + 53),
                     (byte)(32 + 15),
                     (byte)(45 + 35),
                     (byte)(69 + 6),
                     (byte)(52 + 15),
                     83,
                     53,
                     (byte)(78 + 2),
                     (byte)(95 + 2),
                     (byte)(37 + 63),
                     (byte)(20 + 80),
                     (byte)(84 + 21),
                     (byte)(98 + 12),
                     (byte)(63 + 40)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(22 + 46), 69, (byte)(56 + 27)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.C("жутЅхсмхѐпЌъючъѐВބހݹޏޠާޠދޕޫް", (byte)10, 67));
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

   @Override
   protected void c(NLoginCore_219 var1) {
      int var2 = var1.a((String)a(al & ao, at)) == bd ? bf : bg;
      if (var2 != 0) {
         String var3 = var1.b(a(bi, bk ^ bm));
         String var4 = var1.b(a(bn, bo));
         String var5 = var1.b(a(bp, br ^ bs));
         String var6 = var1.b(a(bu, bv ^ by));
         this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var3, var4, var5, var6, new Properties(), NLoginCore_036.d.i()));
      } else {
         File var7 = new File(this.b(), a(bz & cb, cd));
         this.d = NLoginCore_586.a(this.m, var7, new Properties());
      }
   }

   public NLoginCore_289(NLoginType_008 var1) {
      super(var1, NLoginCore_479.D, a(e & m, p), a(y, ab));
   }

   static {
      b();
   }

   @Override
   protected void b(ResultSet var1) {
      this.r = var1.getString(a(ce & cg, ci));
      String var2 = var1.getString(a(cj, ck));
      String var3 = var1.getString(a(cm & co, cp));
      this.a(this.r, a(cr, ct ^ cu) + var2, var3, null);
   }
}
