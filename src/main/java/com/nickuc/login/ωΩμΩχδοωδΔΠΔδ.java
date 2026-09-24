package com.nickuc.login;

import io.netty.util.AttributeKey;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ωΩμΩχδοωδΔΠΔδ {
   private static int a = 32 >>> 229 | 32 << ~229 + 1;
   public static final byte e;
   private static String[] a;
   private static long c;
   public static final byte c;
   private static String[] b;
   private static int d = (1073741824 >>> 61 | 1073741824 << ~61 + 1) & -1;
   private static int f = Integer.reverse(0);
   private static long g = Long.reverse(1415443172793877962L);
   private static int c = Integer.reverse(0);
   public static final byte d;
   private static long h = Long.reverse(5476377146882523136L);
   @Nullable
   public final υηηΠχΛγξ a;
   private static int e = (1048576 >>> 148 | 1048576 << ~148 + 1) & -1;
   public static final AttributeKey<ωΩμΩχδοωδΔΠΔδ> c = σιβεθκιπΓνΣΔουρ.a(c<"㺀">(f, g ^ h));
   public byte f;
   private static int b = 268435456 >>> 252 | 268435456 << ~252 + 1;

   private static String a(int var0, long var1) {
      var1 ^= 50L;
      var1 ^= -9004925823629404570L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(12 + 56),
                     (byte)(11 + 58),
                     (byte)(31 + 52),
                     (byte)(34 + 13),
                     (byte)(45 + 22),
                     (byte)(20 + 46),
                     67,
                     (byte)(28 + 19),
                     80,
                     (byte)(58 + 17),
                     (byte)(33 + 34),
                     (byte)(22 + 61),
                     (byte)(43 + 10),
                     (byte)(27 + 53),
                     (byte)(32 + 65),
                     (byte)(55 + 45),
                     (byte)(86 + 14),
                     (byte)(57 + 48),
                     (byte)(69 + 41),
                     (byte)(90 + 13)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(36 + 32), 69, (byte)(20 + 63)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΨφιωσρΓδΔθ.D("ѠѭѬЯѯѫѦѯѺѩжѴѸѱѴѺмߗ\u07b8ߌ\u07baߙ߇ߓߞߊޫ\u07b8ޭߎ", (byte)24, 68));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωΩμΩχδοωδΔΠΔδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.E("ԗԹԻԛԿ՞Ֆլ\u0558ԧե՛թգԬՑճղժհժԿ", (byte)51, 69), ωΩμΩχδοωδΔΠΔδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            δΛψπξκσβγςα.B("ňŕŔėŗœŎŗŢőĞŜŠřŜŢĤҿҠҴҢӁүһӆҲғҠҕҶĽ", (byte)51, 66) + var1 + ξψθρΣΠΣς.B("ğ", (byte)51, 66) + var2.toString(), var4
         );
      }
   }

   @Generated
   private ωΩμΩχδοωδΔΠΔδ(@Nullable υηηΠχΛγξ var1, byte var2) {
      this.a = var1;
      this.f = var2;
   }

   static {
      a = new String[a];
      b = new String[b];
      b();
      c = (byte)c;
      e = (byte)d;
      d = (byte)e;
   }

   private static void b() {
      c = 6026243320094991816L;
      long var0 = c ^ -9004925823629404570L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(54 + 15),
               (byte)(6 + 77),
               (byte)(8 + 39),
               (byte)(16 + 51),
               (byte)(28 + 38),
               (byte)(12 + 55),
               (byte)(28 + 19),
               80,
               (byte)(61 + 14),
               (byte)(14 + 53),
               (byte)(82 + 1),
               (byte)(12 + 41),
               (byte)(43 + 37),
               (byte)(86 + 11),
               (byte)(85 + 15),
               (byte)(27 + 73),
               (byte)(27 + 78),
               (byte)(45 + 65),
               (byte)(53 + 50)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(26 + 42), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = λΣΩσμφγχ.A("ƯƶŸƦŲƗƲƉƎƖƾƀƢƙǁžƖƢǄƻƙƥƒƓ", (byte)96, 65);
               break;
            case 1:
               b[0] = ΣερμΔσατσκ.C("ՅՌԎԼԈԭՈԟԤԬՕԭՎՅԖ՝ՈՇԸՉ՜ԭ\u0558ԢԹՃդ՛\u0558Ի՜՛", (byte)96, 67);
               break;
            case 2:
               b[0] = ΨΦνΨΦωυΩνβςμ.D("ԄԿԸԽԿԛՆԳԷ\u0530ԥԘԬ\u0530ԎԻԳՌՕՌԔաԨԩ", (byte)96, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = ςπυηννναΣ.C("ԚԻԍԬԒԾՒՒԣԥԘՌՖԥՎԮ՝ԾՀԠբԷԽՆէ՜ԤԦզէՇՠ", (byte)96, 67);
         }
      }
   }
}
