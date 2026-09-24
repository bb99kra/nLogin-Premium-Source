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
import lombok.Generated;

public class NLoginCore_256 implements NLoginInterface_010, NLoginInterface_035 {
   private static int g = (0 >>> 212 | 0 << ~212 + 1) & -1;
   private static long i = Long.reverse(5162468837789311745L);
   private final NLoginCore_211 V;
   private static String[] b = new String[NLoginCore_256.l];
   private static long c;
   private static String[] a = new String[NLoginCore_256.k];
   private static int d = 0 >>> 34 | 0 << ~34 + 1;
   private static int c = Integer.reverse(0);
   private static int a = Integer.reverse(0);
   private static int b = 1048576 >>> 116 | 1048576 << ~116 + 1;
   private static int e = Integer.reverse(-1);
   private static int l = (4 >>> 161 | 4 << -161) & -1;
   private static long f = Long.reverse(5162468837789311745L);
   private static int k = Integer.reverse(1073741824);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static int j = Integer.reverse(0);

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.V;
   }

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.w);
      NLoginCore_445[] var10001 = new NLoginCore_445[b];
      var10001[c] = NLoginCore_445.b;
      return GUIButtonContainer.a(var2, var10001);
   }

   private static void b() {
      c = -9167870775353203210L;
      long var0 = c ^ -6422624177605464252L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(61 + 7),
               (byte)(16 + 53),
               (byte)(6 + 77),
               (byte)(29 + 18),
               (byte)(58 + 9),
               (byte)(22 + 44),
               67,
               (byte)(45 + 2),
               (byte)(10 + 70),
               75,
               (byte)(18 + 49),
               (byte)(29 + 54),
               (byte)(49 + 4),
               (byte)(76 + 4),
               (byte)(59 + 38),
               (byte)(6 + 94),
               (byte)(20 + 80),
               (byte)(29 + 76),
               (byte)(34 + 76),
               (byte)(23 + 80)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(4 + 64), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_446.A("ŴƟƍŜƤƅŶƇŚśƈƛƖŽƉƄƐƀƣƈƤƊŶƶƑŲŰŶƏƍƚƇƈƵưƿƣƄǅƏƑǆƞƏ", (byte)84, 65);
               b[1] = NLoginCore_110.A("ƚƉƒƗŭƦƜſƈƑſŷŦƨŭƦŮƥƄƦƮŴƦŵƹƕųƪƕŽƻƬƳƜƒƑƻƮƮƄƒƅƕƚƨƻƦƻƾƦƑǀǏǒǇǏƩǏƵƘǘƙƹǐƟǛƚƸǎǚǟǣƱǜǟƵǇǍƠƪǝǆǪǜǌǡƬǆǒǑǄƺǗǍǛǓǷǍǌǸǀȄǠǥǖȆǖǏ", (byte)84, 65);
               break;
            case 1:
               b[0] = NLoginCore_201.E("՝ֈնՅ֍ծ՟հՃՄձքտզղխչթ\u058cձ֍ճ՟֟պ՛ՙ՟ոնփհ֊ն։յ֖֙֝ւ֢֦֢֩լ\u058bյֺ֣֭ճּּ֝փք", (byte)84, 69);
               b[1] = NLoginCore_138.D(
                  "ԤԓԜԡӷ\u0530ԦԉԒԛԉԁӰԲӷ\u0530ӸԯԎ\u0530ԸӾ\u0530ӿՃԟӽԴԟԇՅԶԽԦԜԛՅԸԸԎԜԏԟԤԲՅ\u0530ՅՈ\u0530ԛՊՙ՜ՑՙԳՙԿԢբԣՃ՚ԩեԤՂ\u0558դթխԻզթԿՑ\u0557ԪԴէՐմզՖիԶՐ՜՛ՎՄա\u0557ե՝Ֆմՠդ֊ո֏֏քՓՏք֕եքխ։մպ֔Ք֝դե",
                  (byte)84,
                  68
               );
               break;
            case 2:
               b[0] = NLoginCore_004.D("ӹӷԈӿԅԏӧӣԫԑԥԴӲԷԣԳԫӳԧӺԾԗԄԅ", (byte)84, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_110.F("՛Օ՝յ՜ֈ֎ՙ\u0590֒ՓՑֈ\u058bծօդչփ֖մմո՟՜֟աՠ֑֙շվ", (byte)84, 70);
         }
      }
   }

   @Generated
   public NLoginCore_256(NLoginCore_211 var1) {
      this.V = var1;
   }

   static {
      b();
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return var1.a().q();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_256.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.F("ԉԫԭԍԱՐՈ՞Պԙ\u0557Ս՛ՕԞՃեդ՜բ՜Ա", (byte)37, 70), NLoginCore_256.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_138.B("ĬĹĸûĻķĲĻņĵĂŀńĽŀņĈқѮѰҗҟѿҘҥҝҪҗҋѹġ", (byte)37, 66) + var1 + NLoginCore_471.B("ă", (byte)37, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      if (var5 == NLoginCore_445.b) {
         try {
            this.a(var3).f(var1);
         } catch (Exception var7) {
            NLoginCore_370.c(a(d & e, f), var7);
            NLoginCore_150.a(var2, a(h, i));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 20L;
      var1 ^= -6422624177605464252L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(53 + 15),
                     (byte)(29 + 40),
                     (byte)(39 + 44),
                     (byte)(40 + 7),
                     (byte)(4 + 63),
                     66,
                     67,
                     (byte)(28 + 19),
                     (byte)(72 + 8),
                     (byte)(61 + 14),
                     (byte)(16 + 51),
                     (byte)(82 + 1),
                     (byte)(16 + 37),
                     (byte)(41 + 39),
                     (byte)(77 + 20),
                     (byte)(51 + 49),
                     (byte)(83 + 17),
                     (byte)(17 + 88),
                     (byte)(103 + 7),
                     (byte)(62 + 41)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_384.F("ռ։ֈՋ\u058bևւ\u058b֖օՒ\u0590֔֍\u0590֖\u0558࣫ࢾࣀ࣯࣏࣭ࣺࣧࣨࣵࣧࣛࣉ", (byte)93, 70));
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
}
