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

public class ΩθΔφχδρκσλΓ extends χΣυσφλελΣμεψξ {
   private static int aa = Integer.reverse(0);
   private static int t = Integer.reverse(0);
   private static int ab = Integer.reverse(1073741824);
   private static int ai = 3145728 >>> 52 | 3145728 << ~52 + 1;
   private static long e;
   private static int aj = 1073741824 >>> 126 | 1073741824 << ~126 + 1;
   private static long au = Long.reverse(-2594073385365405696L);
   private final μΦξβετδμγ a;
   private static int ba = Integer.reverse(-1073741824);
   private static int bb = (96 >>> 69 | 96 << ~69 + 1) & -1;
   private static long at = Long.reverse(-5688160275219536097L);
   private static int m = Integer.reverse(536870912);
   private static int ar = 524288 >>> 146 | 524288 << -146;
   private static String[] c = new String[ba];
   private static int ap = 0 >>> 194 | 0 << ~194 + 1;
   private static long ah = Long.reverse(-2594073385365405696L);
   private static int am = Integer.reverse(1073741824);
   private static int o = Integer.reverse(0);
   private static String[] d = new String[bb];
   private static int ad = 67108864 >>> 58 | 67108864 << -58;
   private static long u = Long.reverse(7858667403910915871L);
   private static int l = (Integer.MIN_VALUE >>> 223 | Integer.MIN_VALUE << ~223 + 1) & -1;
   private static int y = (268435456 >>> 92 | 268435456 << -92) & -1;
   private static int av = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191) & -1;
   private static long af = Long.reverse(-5688160275219536097L);
   private static int ax = (134217728 >>> 155 | 134217728 << ~155 + 1) & -1;

   private static String a(int var0, long var1) {
      var1 ^= 59L;
      var1 ^= -4244818938173805318L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(7 + 61),
                     (byte)(66 + 3),
                     (byte)(79 + 4),
                     (byte)(37 + 10),
                     (byte)(60 + 7),
                     (byte)(19 + 47),
                     (byte)(65 + 2),
                     (byte)(8 + 39),
                     (byte)(5 + 75),
                     (byte)(62 + 13),
                     (byte)(30 + 37),
                     (byte)(44 + 39),
                     (byte)(27 + 26),
                     (byte)(35 + 45),
                     (byte)(45 + 52),
                     (byte)(64 + 36),
                     (byte)(99 + 1),
                     (byte)(40 + 65),
                     110,
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(21 + 47), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζοηκορΦνΣθγΩ.C("բկծԱձխըձռիԸնպճնռԾࢹࣉࢦࣙࣛࣉ࣑ࣗࣛࣔࢭ", (byte)110, 67));
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

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΩθΔφχδρκσλΓ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πχσδΦΦνθΔπ.E("ԀԢԤԄԨՇԿՕՁԐՎՄՒՌԕԺ՜՛ՓՙՓԨ", (byte)28, 69), ΩθΔφχδρκσλΓ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            οοθδΨιοΦΠβδζ.F("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗ\u0892ࢢࡿࢲࢴࢢࢰࢪࢴࢭࢆԮ", (byte)28, 70) + var1 + χφπρψπφΦθμπ.F("Ԓ", (byte)28, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   public void a(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2) {
      ωΓπκΩβςςδξΔν var10000 = this.a.a();
      int var10002 = aj;
      Object[] var10003 = new Object[am];
      var10003[ap] = c<"㺀">(ar, at ^ au);
      var10003[av] = ax;
      var10000.a(var1, var10002, var10003);
   }

   public ΩθΔφχδρκσλΓ(ΨγημιδξΓτοθαζ var1) {
      super(var1);
      this.a = var1.c();
   }

   @Override
   public void b(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2, boolean var3) {
      ωΓπκΩβςςδξΔν var10000 = this.a.a();
      int var10002 = l;
      Object[] var10003 = new Object[m];
      var10003[o] = c<"㺀">(t, u);
      var10003[y] = aa;
      var10003[ab] = c<"㺃">(ad, af ^ ah);
      var10003[ai] = var3;
      var10000.a(var1, var10002, var10003);
   }

   private static void b() {
      e = -512090566782488435L;
      long var0 = e ^ -4244818938173805318L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(42 + 26),
               (byte)(30 + 39),
               (byte)(69 + 14),
               (byte)(27 + 20),
               (byte)(35 + 32),
               (byte)(30 + 36),
               (byte)(31 + 36),
               (byte)(20 + 27),
               (byte)(66 + 14),
               (byte)(49 + 26),
               (byte)(31 + 36),
               (byte)(31 + 52),
               (byte)(28 + 25),
               (byte)(58 + 22),
               (byte)(48 + 49),
               100,
               100,
               (byte)(62 + 43),
               (byte)(36 + 74),
               (byte)(69 + 34)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(11 + 57), 69, 83}, StandardCharsets.UTF_8));
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
               d[0] = ΨφιωσρΓδΔθ.E("֬֊էեֈֱ֢\u058b֜֕֎ջ", (byte)119, 69);
               d[1] = πψυκΠΨμΛΩβΣφμφσ.A("ǞƤƿǙǅƹƿǂǄƮƨƺǨǅǊǩǫǡǀǹǻƵǘǒǈǪǾȀǹƽǬǎ", (byte)119, 65);
               d[2] = ντθΔζβΔζ.C("֓ձՎՌկ֘։ղփռյբ", (byte)119, 67);
               break;
            case 1:
               d[0] = ζοηκορΦνΣθγΩ.A("ǓƷǆǙǄǦǭǉǫƷǂưƼǇǓǅǦǇƴǇǔǓǀǁ", (byte)119, 65);
               d[1] = λΣΩσμφγχ.A("ǞƤƿǙǅƹƿǂǄƮƨƺǨǅǊǩǫǡǀǹǻƷǌǗǫǉǽǟǍȃǽȀ", (byte)119, 65);
               d[2] = φδχεθοκψαλΛογλ.C("կՔ\u0590֊֊ՎճՖ՛յկ֊ջի֢շսղմ֥տրխծ", (byte)119, 67);
               break;
            case 2:
               d[0] = ντθΔζβΔζ.A("ǧǔƸǄǔǌƦǧƿǁǑƱǂǯƭǭǦƷƮǘǭǓǀǁ", (byte)119, 65);
            case 3:
            default:
               break;
            case 4:
               d[0] = πηγμΣΔκκ.C("ձմ֓ՌշՓ\u0558\u058bո֘֘Ֆհ\u058c֕֝՜֖վղկ֢֟֡֗֗շ֛֝֯֨֨", (byte)119, 67);
         }
      }
   }
}
