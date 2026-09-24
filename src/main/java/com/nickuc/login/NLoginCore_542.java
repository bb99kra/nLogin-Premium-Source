package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
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
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

public class NLoginCore_542 implements PluginMessageListener {
   private static long c;
   private static int f = (0 >>> 78 | 0 << -78) & -1;
   private final NLoginCore_033 a;
   private static String[] a = new String[NLoginCore_542.g];
   private static long d = Long.reverse(1885258834822696923L);
   private static int h = Integer.reverse(1073741824);
   private final nLoginBukkit q;
   private static int c = (16777216 >>> 248 | 16777216 << ~248 + 1) & -1;
   private static String[] b = new String[h];
   private static long e = Long.reverse(-5764607523034234880L);
   private static long b = Long.reverse(-6185191697425231909L);
   private static int a = Integer.reverse(0);
   private static int g = Integer.reverse(1073741824);

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 13L;
      var1 ^= 3629531750775056015L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(50 + 18),
                     (byte)(55 + 14),
                     (byte)(7 + 76),
                     (byte)(2 + 45),
                     (byte)(58 + 9),
                     66,
                     (byte)(12 + 55),
                     (byte)(10 + 37),
                     80,
                     (byte)(46 + 29),
                     (byte)(51 + 16),
                     (byte)(68 + 15),
                     (byte)(31 + 22),
                     (byte)(28 + 52),
                     (byte)(61 + 36),
                     (byte)(12 + 88),
                     (byte)(9 + 91),
                     (byte)(39 + 66),
                     (byte)(87 + 23),
                     (byte)(63 + 40)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), (byte)(23 + 46), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.D("ѻ҈҇ъҊ҆ҁҊҕ҄ёҏғҌҏҕїߟߦ߲߲ߐߧߤ߭ߙߕߧߏ", (byte)33, 68));
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

   @Generated
   public NLoginCore_542(nLoginBukkit var1, NLoginCore_033 var2) {
      this.q = var1;
      this.a = var2;
   }

   public void onPluginMessageReceived(@NotNull String var1, Player var2, byte[] var3) {
      if (var1.equals(a(a, b))) {
         try {
            this.a.a().a(this.q.b().a(var2), var3);
         } catch (Exception var5) {
            NLoginCore_370.a(a(c, d ^ e) + var2.getName(), var5);
         }
      }
   }

   private static void b() {
      c = -2598468202747685800L;
      long var0 = c ^ 3629531750775056015L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(23 + 45),
               (byte)(20 + 49),
               (byte)(48 + 35),
               47,
               (byte)(21 + 46),
               (byte)(20 + 46),
               (byte)(29 + 38),
               (byte)(10 + 37),
               (byte)(76 + 4),
               (byte)(48 + 27),
               (byte)(51 + 16),
               (byte)(40 + 43),
               (byte)(22 + 31),
               (byte)(24 + 56),
               (byte)(66 + 31),
               (byte)(98 + 2),
               (byte)(86 + 14),
               (byte)(70 + 35),
               (byte)(78 + 32),
               103
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
               b[0] = NLoginCore_521.D("ЫДцГЦђчјкљїзѐОѣѠёзмжѭевг", (byte)14, 68);
               b[1] = NLoginCore_451.E("ԽӶԻԤՂԐӻԔԸԌԃԫԚՅԻՒԒԧԪՆԨՂԏՈԱԸ՛ԹՓՏ\u0558ԳԕԢԟԜՖՈԹեԽԞթԹ՜ԯՏԯճՒը՞ՂնՐհխՉԻճղղխՁ", (byte)14, 69);
               break;
            case 1:
               b[0] = NLoginCore_004.E("ԖӿԱӾԑԽԲՃԥՄՂԹԛՀԧՏԦԨԫԣԯՖԝԞ", (byte)14, 69);
               b[1] = NLoginCore_091.D("ђЋѐйїХАЩэСИрЯњѐѧЧмпћнїФѝцэѰюѨѤѭшЪздбѫѝюѺђгѾюѱфѤф҈ѧѽѳїщҎѰҊэъ҄ёҋѭ҉јѴѨѻҎ҉ҌҐџѳҌѧ", (byte)14, 68);
               break;
            case 2:
               b[0] = NLoginCore_446.D("ДцгюЕЦЗљРЙмфПЗЦѣПмчпихвг", (byte)14, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_201.C("иФЕгЙдМЪЪГќЧ", (byte)14, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_542.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_110.C("ћѽѿџ҃ҢҚҰҜѫҩҟҭҧѰҕҷҶҮҴҮ҃", (byte)42, 67), NLoginCore_542.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_397.E("ՉՖՕԘ\u0558ՔՏ\u0558գՒԟ՝ա՚՝գԥࢭࢴࣀࣀ࢞ࢵࢲࢻࢧࢣࢵ࢝Խ", (byte)42, 69) + var1 + NLoginCore_433.B("č", (byte)42, 66) + var2.toString(), var4
         );
      }
   }
}
