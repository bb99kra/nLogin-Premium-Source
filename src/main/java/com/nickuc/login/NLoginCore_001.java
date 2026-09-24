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

public class NLoginCore_001 implements NLoginInterface_035 {
   private static int n = Integer.reverse(0);
   private static int d = 4096 >>> 236 | 4096 << -236;
   private static int k = Integer.reverse(-637534208);
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int l = (131072 >>> 177 | 131072 << -177) & -1;
   private static int g = 16777216 >>> 248 | 16777216 << ~248 + 1;
   private static int q = 256 >>> 72 | 256 << -72;
   private static int e = Integer.reverse(0);
   private static int h = (0 >>> 143 | 0 << ~143 + 1) & -1;
   private static int a = 4718592 >>> 179 | 4718592 << -179;
   private static final int ag = NLoginCore_001.s;
   private static int i = Integer.reverse(1073741824);
   private static String[] a = new String[q];
   private static int c = (1 >>> 159 | 1 << -159) & -1;
   private static long o = Long.reverse(5777182693857563028L);
   private static int b = Integer.reverse(637534208);
   private static String[] b = new String[r];
   private static int s = Integer.reverse(1073741824);
   private static long p = Long.reverse(1297036692682702848L);
   private static int j = Integer.reverse(0);
   private final NLoginCore_211 L;
   private static int f = (0 >>> 9 | 0 << -9) & -1;
   private static int m = Integer.reverse(-1174405120);

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_150.a(var2, NLoginCore_237.B, var1x -> {
         String var2x = var1x.trim();
         if (var2x.length() > i && var2x.charAt(j) == k && var2x.charAt(var1x.length() - l) == m) {
            var4.c(var1x, a(n, o ^ p));
         } else {
            var4.a(var1x);
         }
      });
      NLoginCore_445[] var10001 = new NLoginCore_445[g];
      var10001[h] = NLoginCore_445.a;
      return GUIButtonContainer.a(var2, var10001);
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      return (boolean)(!var1.a().p() && var1.a().n() != a && NLoginCore_354.a().nextInt(b) <= c ? d : e);
   }

   private static void b() {
      c = 2992738403137958922L;
      long var0 = c ^ -2349340210140150405L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(3 + 65),
               (byte)(32 + 37),
               (byte)(52 + 31),
               (byte)(4 + 43),
               67,
               (byte)(51 + 15),
               (byte)(43 + 24),
               47,
               (byte)(42 + 38),
               (byte)(51 + 24),
               (byte)(13 + 54),
               (byte)(8 + 75),
               (byte)(33 + 20),
               (byte)(40 + 40),
               (byte)(3 + 94),
               (byte)(94 + 6),
               (byte)(38 + 62),
               (byte)(72 + 33),
               (byte)(35 + 75),
               (byte)(23 + 80)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(38 + 45)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_241.F("ՄՐՉԫՆԻԥՊ՛ԳԹՀԯԖՂԼԴՔԵէԩԞՎԻլխԨԩՂՁ\u0530ենզ՚ժիՔհՐ\u0558՝՝ղԼԼհ՛ԹՒՃնլՔՑՒ", (byte)34, 70);
               break;
            case 1:
               b[0] = NLoginCore_427.E("ՄՐՉԫՆԻԥՊ՛ԳԹՀԯԖՂԼԴՔԵէԩԞՎԻլխԨԩՂՁ\u0530ենզ՚ժիՔհՐ\u0558՝ՠՙՁցՏմՓբ\u0557քջՂ՛֏շՎՊրֈր\u058cխ", (byte)34, 69);
               break;
            case 2:
               b[0] = NLoginCore_183.D("ѯѦѧѓҗѯҙҌ҅ҒѧѴғѮҞҁҕҚѴ҃ѾҒңѨҊџѾҀҙҁѾҩ", (byte)34, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_324.F("Րԡ\u0558ԑՄԪԩԹ՝Զ՟Ԧ", (byte)34, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_001.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_232.B("·ÙÛ»ßþöČøÇąûĉăÌñēĒĊĐĊß", (byte)8, 66), NLoginCore_001.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_138.A("òÿþÁāýøāČûÈĆĊăĆČÎћщныїѥљтѐѤä", (byte)8, 65) + var1 + NLoginCore_004.F("Ӿ", (byte)8, 70) + var2.toString(), var4);
      }
   }

   @Generated
   public NLoginCore_001(NLoginCore_211 var1) {
      this.L = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 72L;
      var1 ^= -2349340210140150405L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(20 + 48),
                     (byte)(68 + 1),
                     (byte)(19 + 64),
                     (byte)(45 + 2),
                     (byte)(50 + 17),
                     (byte)(60 + 6),
                     (byte)(30 + 37),
                     (byte)(32 + 15),
                     80,
                     (byte)(28 + 47),
                     (byte)(52 + 15),
                     (byte)(22 + 61),
                     53,
                     (byte)(71 + 9),
                     (byte)(43 + 54),
                     (byte)(91 + 9),
                     (byte)(79 + 21),
                     (byte)(93 + 12),
                     (byte)(51 + 59),
                     (byte)(9 + 94)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(64 + 19)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_232.F("՝ժթԬլըգլշզԳձյծձշԹࣆࢴࢨࢶࣂ࣐ࣄࢭࢻ࣏", (byte)62, 70));
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
   @Override
   public NLoginCore_211 a() {
      return this.L;
   }

   static {
      b();
   }
}
