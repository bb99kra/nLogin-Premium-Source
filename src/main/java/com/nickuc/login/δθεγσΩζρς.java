package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class δθεγσΩζρς extends ΣμςΠΔυσθ {
   private static int aw = (25165824 >>> 23 | 25165824 << -23) & -1;
   private static long as = Long.reverse(Long.MIN_VALUE);
   private static long ad = Long.reverse(Long.MIN_VALUE);
   private static long o;
   private static final String G = c<"㺃">(δθεγσΩζρς.bi, δθεγσΩζρς.bk ^ δθεγσΩζρς.bm);
   private static long ax = Long.reverse(420650961751067539L);
   private static int z = (Integer.MIN_VALUE >>> 159 | Integer.MIN_VALUE << -159) & -1;
   private static int e = (0 >>> 116 | 0 << -116) & -1;
   private static long bm = Long.reverse(Long.MIN_VALUE);
   private static long bh = Long.reverse(-8802721075103708269L);
   private static long bk = Long.reverse(420650961751067539L);
   private static long ay = Long.reverse(Long.MIN_VALUE);
   private static final String H = c<"㺀">(δθεγσΩζρς.bd & δθεγσΩζρς.bf, bh);
   private static long q = Long.reverse(Long.MIN_VALUE);
   private static long p = Long.reverse(420650961751067539L);
   private static int bc = Integer.reverse(1610612736);
   private static String[] f = new String[bc];
   private static int bd = 256 >>> 166 | 256 << -166;
   private static long ac = Long.reverse(420650961751067539L);
   private static String[] e = new String[δθεγσΩζρς.az];
   private static int bi = Integer.reverse(-1610612736);
   private static int bf = Integer.reverse(-1);
   private static long ap = Long.reverse(420650961751067539L);
   private static int af = Integer.reverse(1073741824);
   private static int az = Integer.reverse(1610612736);

   static {
      b();
   }

   @Override
   protected void a(τφθχΔαΣγτφς var1, String var2, String var3) {
      String var4 = var1.b(var3 + c<"㺀">(af, ap ^ as));
      if (var4 != null) {
         String var5 = var1.b(var3 + c<"㺃">(aw, ax ^ ay));
         ΛηακψΨηξη var6 = ΛηακψΨηξη.valueOf(var4.toUpperCase(Locale.ENGLISH));
         this.a(var2, var6.e(var5), null, null);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  δθεγσΩζρς.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ζοηκορΦνΣθγΩ.C("ԏԱԳԓԷՖՎդՐԟ՝Փա՛ԤՉիժբըբԷ", (byte)102, 67), δθεγσΩζρς.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            φΨαξωυθανΣφυκη.E("օ֑֒Ք֔\u0590\u058b֔֟֎՛֖֙֝֙֟աࣩࣺ࣯ࣧ࣬࣪࣡ࣻࣽն", (byte)102, 69) + var1 + θεωψξβΛσσ.B("ƅ", (byte)102, 66) + var2.toString(), var4
         );
      }
   }

   public δθεγσΩζρς(ΨγημιδξΓτοθαζ var1) {
      super(var1, ΓεοκπνΨωπτ.C, c<"㺀">(e, p ^ q), c<"㺃">(z, ac ^ ad));
   }

   private static String a(int var0, long var1) {
      var1 ^= 1L;
      var1 ^= 3056502792772163012L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(38 + 30),
                     (byte)(46 + 23),
                     (byte)(23 + 60),
                     (byte)(43 + 4),
                     (byte)(59 + 8),
                     (byte)(28 + 38),
                     (byte)(65 + 2),
                     (byte)(24 + 23),
                     (byte)(71 + 9),
                     (byte)(54 + 21),
                     67,
                     (byte)(11 + 72),
                     (byte)(45 + 8),
                     (byte)(76 + 4),
                     (byte)(85 + 12),
                     100,
                     (byte)(63 + 37),
                     (byte)(50 + 55),
                     (byte)(14 + 96),
                     (byte)(79 + 24)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(67 + 16)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(θεωψξβΛσσ.E("չֆօՈֈքտֈ֓ւՏ֍֑֊֍֓Օࣱ࣮ࣣ࣯ࣛ࣠ࣞࣝࣕ", (byte)90, 69));
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

   private static void b() {
      o = -3903888927331816544L;
      long var0 = o ^ 3056502792772163012L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(65 + 3),
               69,
               (byte)(70 + 13),
               (byte)(21 + 26),
               (byte)(6 + 61),
               (byte)(50 + 16),
               (byte)(38 + 29),
               (byte)(5 + 42),
               (byte)(7 + 73),
               (byte)(38 + 37),
               (byte)(25 + 42),
               (byte)(38 + 45),
               (byte)(20 + 33),
               (byte)(20 + 60),
               (byte)(63 + 34),
               (byte)(52 + 48),
               (byte)(98 + 2),
               (byte)(40 + 65),
               110,
               (byte)(48 + 55)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(57 + 26)}, StandardCharsets.UTF_8));
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
               f[0] = ντθΔζβΔζ.C("ӍҤґҕҘҪҥғҳӜҲӡәҮӥӐҴҺҹӪӆәҰұ", (byte)56, 67);
               f[1] = ζοηκορΦνΣθγΩ.A("şĶģħĪļķĥŅŮłŨŬĬŅņŠųĶŤśŻłŃ", (byte)56, 65);
               f[2] = οοθδΨιοΦΠβδζ.F("՛էԧՁԺՐբ՟թճՏԼ", (byte)56, 70);
               f[3] = πχσδΦΦνθΔπ.D("ӄҬҶҩӆҫҥҔӒӑӎҥ", (byte)56, 68);
               f[4] = ξψθρΣΠΣς.F("՛էԧՁԺՐբ՟թճՏԼ", (byte)56, 70);
               f[5] = ΣερμΔσατσκ.F("՛ՃՍՀ՝ՂԼԫթըեԼ", (byte)56, 70);
               break;
            case 1:
               f[0] = μεςΩΔΣγν.F("դԻԨԬԯՁԼԪՊճՊՊՖծՙիեՒԹըՊՊՇՈ", (byte)56, 70);
               f[1] = ΨφιωσρΓδΔθ.C("ӍҤґҕҘҪҥғҳӜҳҙҢҵӘӎҵҾӅӦӁәҰұ", (byte)56, 67);
               f[2] = ΠΛΨοδΩσμνΛγΦφβς.F("խԭՋՆԨԫՀաԿՓնՊթՎծԵՍԻԸԹԿՊՇՈ", (byte)56, 70);
               f[3] = ΣφδσΔζιΠρα.B("ıŨũĽĺŁłĭūņņķ", (byte)56, 66);
               f[4] = μεςΩΔΣγν.A("őġŘŧĿŁōĨũİłķ", (byte)56, 65);
               f[5] = βεξΠθρρςΔΦμ.F("ԾԽԡ՝ձԼ՞ՐԧՎԶԼ", (byte)56, 70);
               break;
            case 2:
               f[0] = λΣΩσμφγχ.A("ĿŀŘŌĩīŭġŎŅœşŢũşŔŘŦřņŒŦŻĹŔŋűřŞųļƀ", (byte)56, 65);
            case 3:
            default:
               break;
            case 4:
               f[0] = ζοηκορΦνΣθγΩ.C("ӕҲҐҏӗҨӚӉҦҴҹҫҿҳӢһңӖӄӨӆҶҞҧӣӅҺӧөҾӎӭ", (byte)56, 67);
         }
      }
   }
}
