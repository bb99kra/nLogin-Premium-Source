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
import net.citizensnpcs.api.CitizensAPI;
import org.bukkit.entity.Entity;

public class NLoginCore_087 {
   private static int b = 0 >>> 93 | 0 << ~93 + 1;
   private static int l = Integer.reverse(1073741824);
   private static int j = Integer.reverse(0);
   private boolean G;
   private static int k = 0 >>> 27 | 0 << ~27 + 1;
   private static String[] ZKM_STR_B = new String[NLoginCore_087.m];
   private static long c;
   private static String[] ZKM_STR_A = new String[l];
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(0);
   private static int f = (0 >>> 186 | 0 << -186) & -1;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long i = Long.reverse(-2769929339290368018L);
   private static int m = (134217728 >>> 186 | 134217728 << ~186 + 1) & -1;
   private static int h = Integer.reverse(-1);
   private static long d = Long.reverse(-2769929339290368018L);

   static {
      b();
   }

   private static void b() {
      c = 8638560977188352451L;
      long var0 = c ^ -2569751829866761772L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(8 + 60),
               69,
               (byte)(81 + 2),
               (byte)(26 + 21),
               (byte)(43 + 24),
               (byte)(62 + 4),
               (byte)(32 + 35),
               (byte)(44 + 3),
               (byte)(42 + 38),
               (byte)(37 + 38),
               67,
               (byte)(24 + 59),
               (byte)(10 + 43),
               (byte)(46 + 34),
               (byte)(70 + 27),
               (byte)(24 + 76),
               (byte)(41 + 59),
               (byte)(3 + 102),
               (byte)(57 + 53),
               (byte)(19 + 84)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_201.D(
                  "ҝҟӂ҃ґұҕҚ҄ҢҵҢҌӏҞӂҨӃӇӉҞғӂҊӉґӕҤӊҗӒӈҩӂҢӕӀҿҢӡҧӡҪӞҬҺӉҢӊӠӤӬӞӊӊӁӕӦӜӯӮӻҿӠӬӐԀӷҷӰӥәӲӄӪӤӪԌӆӛԀӲԂӪӧԊԇԄӱԉӴӥԋԛӾԡөӼԑԁӞԚәӾӣԫԡӰ", (byte)49, 68
               );
               ZKM_STR_B[1] = NLoginCore_384.A(
                  "ĶĸśĜĪŊĮĳĝĻŎĻĥŨķśŁŜŠŢķĬśģŢĪŮĽţİūšłśĻŮřŘĻźŀźŃŷŅœŢĻţŹŽƅŷťƋŚƑōƀŰŬšƒƏŭƗřƗŷŖŠŚŽƖŷžƂƣƣťƆƛƃźơƪƁƌƍųƥŰƧƈƩƩƣƔưƳƇƹƙƟƘƮǂƕƝƛƵƺƙƆǅǀƠƧƔƕ", (byte)49, 65
               );
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_387.C(
                  "ҝҟӂ҃ґұҕҚ҄ҢҵҢҌӏҞӂҨӃӇӉҞғӂҊӉґӕҤӊҗӒӈҩӂҢӕӀҿҢӡҧӡҪӞҬҺӉҢӊӠӤӬӞӊӊӁӕӦӜӯӮӻҿӠӬӐԀӷҷӰӥәӲӄӪӤӪԌӆӛԀӲԂӪӧԊԇԄӱԉӴӥԋԛӾԡӚԕӛӭӛӷӞԤӳԈԃӰ", (byte)49, 67
               );
               ZKM_STR_B[1] = NLoginCore_004.E(
                  "ՂՄէԨԶՖԺԿԩՇ՚ՇԱմՃէՍըլծՃԸէԯծԶպՉկԼշխՎէՇպեդՇֆՌֆՏփՑ՟ծՇկօ։֑փձ֗զ֝ՙ\u058cռոխ֛֞չ֣ե֣փբլզ։֢փ֊֎֯֯ձ֧֒֏ֆֶ֭֍֘֙տֱռֳֵֵֺּֿׅ֥֤֔֯֠֓֫א\u05ce֡֊ׇ\u05ceֵׇ֣֬֬֫֠֡",
                  (byte)49,
                  69
               );
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_092.F("ԺդԲ՞ՠ\u0557ԶԦԤ՞ԩԱՄ՞՞ՄՇՋՒեՑՃՀՁ", (byte)49, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_530.C("ҁѻҳҌҕґҔґҵӋқҐ", (byte)49, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_087.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.D("҂ҤҦ҆ҪӉӁӗӃҒӐӆӔӎҗҼӞӝӕӛӕҪ", (byte)55, 68), NLoginCore_087.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.E("Ֆգբԥեա՜եհ՟ԬժծէժհԲࢸࢿ࣋ࢹࢮࢲࢻ࣒ࢵࢿՈ", (byte)55, 69) + var1 + NLoginCore_141.C("Ҕ", (byte)55, 67) + var2.toString(), var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 88L;
      var1 ^= -2569751829866761772L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(16 + 53),
                     (byte)(76 + 7),
                     (byte)(18 + 29),
                     (byte)(43 + 24),
                     (byte)(18 + 48),
                     (byte)(30 + 37),
                     (byte)(38 + 9),
                     (byte)(9 + 71),
                     (byte)(47 + 28),
                     (byte)(20 + 47),
                     83,
                     (byte)(15 + 38),
                     80,
                     (byte)(84 + 13),
                     (byte)(90 + 10),
                     (byte)(23 + 77),
                     (byte)(63 + 42),
                     (byte)(51 + 59),
                     (byte)(21 + 82)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(19 + 49), (byte)(9 + 60), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.F("ճրտՂւվչւ֍ռՉև\u058bքև֍Տ࣏࣯࣒ࣕࣜࣨࣖ࣋ࣘࣜ", (byte)84, 70));
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

   public NLoginCore_087() {
      this.G = (a != 0);
   }

   public boolean b(Entity var1) {
      if (this.G) {
         try {
            return CitizensAPI.getNPCRegistry().isNPC(var1);
         } catch (Throwable var3) {
            this.G = (b != 0);
            if (var3.getCause() instanceof ClassNotFoundException) {
               String var10000 = a(c, d);
               Object[] var10001 = new Object[e];
               var10001[f] = var3.getMessage();
               NLoginCore_370.c(var10000, var10001);
            } else {
               NLoginCore_370.b(a(g & h, i), var3);
            }
         }
      }

      return (k != 0);
   }
}
