package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_562 extends HikariConnectionPool {
   private static long q = Long.reverse(8864429928844572754L);
   private static int e = Integer.reverse(-1);
   private static long h = Long.reverse(649864208520788050L);
   private static int i = 1024 >>> 234 | 1024 << ~234 + 1;
   private static String[] d = new String[NLoginCore_562.z];
   private static long r = Long.reverse(8214565720323784704L);
   private static long f;
   private static int z = Integer.reverse(536870912);
   private static long w = Long.reverse(8214565720323784704L);
   private static String[] c = new String[NLoginCore_562.y];
   private static int o = Integer.reverse(1073741824);
   private static int d = Integer.reverse(0);
   private static long n = Long.reverse(8214565720323784704L);
   private static long k = Long.reverse(8864429928844572754L);
   private static int s = Integer.reverse(-1073741824);
   private static long t = Long.reverse(8864429928844572754L);
   private static int y = (8192 >>> 107 | 8192 << ~107 + 1) & -1;

   private static String a(int var0, long var1) {
      var1 ^= 78L;
      var1 ^= 8672720750311079988L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(6 + 62),
                     (byte)(65 + 4),
                     (byte)(11 + 72),
                     (byte)(3 + 44),
                     (byte)(21 + 46),
                     (byte)(44 + 22),
                     67,
                     (byte)(33 + 14),
                     (byte)(41 + 39),
                     (byte)(8 + 67),
                     (byte)(27 + 40),
                     (byte)(63 + 20),
                     (byte)(3 + 50),
                     (byte)(6 + 74),
                     (byte)(73 + 24),
                     (byte)(3 + 97),
                     (byte)(58 + 42),
                     (byte)(65 + 40),
                     (byte)(109 + 1),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.F("Պ\u0557ՖԙՙՕՐՙդՓԠ՞բ՛՞դԦ࢛ࢭࢻ\u088fࢲࢴࢼࢽ", (byte)43, 70));
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

   public static NLoginCore_562 a(NLoginInterface_011<?> var0, NLoginCore_147 var1) {
      return a(var0, var1, null);
   }

   private static void b() {
      f = 5340416691611574494L;
      long var0 = f ^ 8672720750311079988L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(37 + 32),
               (byte)(63 + 20),
               (byte)(9 + 38),
               (byte)(16 + 51),
               (byte)(40 + 26),
               (byte)(65 + 2),
               47,
               (byte)(61 + 19),
               (byte)(37 + 38),
               (byte)(19 + 48),
               (byte)(68 + 15),
               (byte)(23 + 30),
               (byte)(27 + 53),
               (byte)(93 + 4),
               (byte)(33 + 67),
               (byte)(14 + 86),
               (byte)(54 + 51),
               (byte)(97 + 13),
               (byte)(4 + 99)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(28 + 41), (byte)(18 + 65)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_241.A("ƤǂƉǏǑƑǇƢƮǍǆǋǋƚƳǝǝǀǗƹƛƭƴǝǀƶǉǝǣƻǨǚǇƼǨǆǄǄǱǀǖǃǬǓǌǞǯǕǙǾȁǏǛǝǊǋ", (byte)108, 65);
               d[1] = NLoginCore_471.A("ƘǄǎƴƬƭƿƕƭǐǃǜǄǑƳǗƺǘƭǟƲƽƪƫ", (byte)108, 65);
               d[2] = NLoginCore_521.B("ƂǃǒǑǅƽǒƷǕƗǐƟ", (byte)108, 66);
               d[3] = NLoginCore_141.E("֞ատօ֘դռռվգ֥հ", (byte)108, 69);
               break;
            case 1:
               d[0] = NLoginCore_183.A("ƤǂƉǏǑƑǇƢƮǍǆǋǋƚƳǝǝǀǗƹƛƭƴǝǀƶǉǝǣƻǨǚǇƼǨǆǄǄǱǀǖǃǯǶƳǹƽǰǀǼǗǔǥǍǊǋ", (byte)108, 65);
               d[1] = NLoginCore_553.B("ƘǄǎƴƬƭƿƕƭǐƻƭƵǓưƿǉƻǂǠƱƴƞǢǛǇƣǋƤǢƪƭ", (byte)108, 66);
               d[2] = NLoginCore_427.E("֏֕խ֞՛՟ՙյ֨ն֩հ", (byte)108, 69);
               d[3] = NLoginCore_384.E("ծ֘ս֠\u0590վ֖֦չն֙հ", (byte)108, 69);
               break;
            case 2:
               d[0] = NLoginCore_183.D("Ռ՝ՔդլԵճՋՇ՚ղՁ", (byte)108, 68);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_092.C("՝ՇզԫՅՊԶ\u0558յՓլՊՖ՛ՌյՁկրփ՛յՌՍ", (byte)108, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_562.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_141.A("čįıđĵŔŌŢŎĝśőşřĢŇũŨŠŦŠĵ", (byte)51, 65), NLoginCore_562.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_223.F("Ւ՟՞ԡա՝\u0558ալ՛ԨզժգզլԮࢣࢵࣃ\u0897ࢺࢼࣄࣅՂ", (byte)51, 70) + var1 + NLoginCore_091.D("҈", (byte)51, 68) + var2.toString(), var4
         );
      }
   }

   public static NLoginCore_562 b(NLoginInterface_011<?> var0, NLoginCore_147 var1) {
      return new NLoginCore_562(var0, var1, null, NLoginCore_536.b);
   }

   static {
      b();
   }

   @Override
   protected String a(NLoginCore_147 var1) {
      return a(i, k ^ n) + var1.x() + a(o, q ^ r) + var1.j() + a(s, t ^ w) + var1.y();
   }

   @Override
   protected String w() {
      return a(d & e, h);
   }

   public static NLoginCore_562 a(NLoginInterface_011<?> var0, NLoginCore_147 var1, Consumer<HikariConfig> var2) {
      return new NLoginCore_562(var0, var1, var2, NLoginCore_536.a);
   }

   private NLoginCore_562(NLoginInterface_011<?> var1, NLoginCore_147 var2, Consumer<HikariConfig> var3, NLoginCore_536 var4) {
      super(NLoginCore_036.c, var1, var2, var3, var4);
   }

   @Override
   protected void a(HikariConfig var1, NLoginCore_147 var2) {
      var1.setDriverClassName(this.w());
      var1.setJdbcUrl(this.a(var2));
      var1.setUsername(var2.z());
      var1.setPassword(var2.j());
   }
}
