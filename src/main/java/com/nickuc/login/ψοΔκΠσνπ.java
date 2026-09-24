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

public class ψοΔκΠσνπ {
   private static int j = 16384 >>> 205 | 16384 << ~205 + 1;
   private static long u = Long.reverse(-6917529027641081856L);
   private static int s = Integer.reverse(536870912);
   private static int b = (0 >>> 127 | 0 << ~127 + 1) & -1;
   private static long l = Long.reverse(-6917529027641081856L);
   private static long x = Long.reverse(-2047184366358920393L);
   private static int ae = Integer.reverse(-536870912);
   private static int a = 0 >>> 232 | 0 << ~232 + 1;
   private static int d = 0 >>> 176 | 0 << ~176 + 1;
   private static long k = Long.reverse(-2047184366358920393L);
   private static String[] a = new String[ψοΔκΠσνπ.ad];
   private static int p = (402653184 >>> 155 | 402653184 << ~155 + 1) & -1;
   private static long e = Long.reverse(-2047184366358920393L);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int o = (0 >>> 11 | 0 << -11) & -1;
   private static long ab = Long.reverse(-6917529027641081856L);
   private static int q = -1 >>> 61 | -1 << ~61 + 1;
   private static int w = (1342177280 >>> 60 | 1342177280 << -60) & -1;
   private static int ac = Integer.reverse(0);
   private static long h = Long.reverse(-2047184366358920393L);
   private static long i = Long.reverse(-6917529027641081856L);
   private static long t = Long.reverse(-2047184366358920393L);
   private static long r = Long.reverse(4870344661282161463L);
   private static int ad = Integer.reverse(-536870912);
   private static int m = 0 >>> 70 | 0 << ~70 + 1;
   private static int g = 32 >>> 165 | 32 << -165;
   private static long f = Long.reverse(-6917529027641081856L);
   private static String[] b = new String[ae];
   private static long y = Long.reverse(-6917529027641081856L);
   private static int v = Integer.reverse(0);
   private static long c;
   private static int z = Integer.reverse(1610612736);
   private static long aa = Long.reverse(-2047184366358920393L);
   private static int c = Integer.reverse(0);

   private static String a(int var0, long var1) {
      var1 ^= 5L;
      var1 ^= 4619764335393803488L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     (byte)(27 + 42),
                     (byte)(46 + 37),
                     (byte)(20 + 27),
                     (byte)(35 + 32),
                     (byte)(22 + 44),
                     (byte)(30 + 37),
                     (byte)(4 + 43),
                     (byte)(38 + 42),
                     (byte)(38 + 37),
                     (byte)(16 + 51),
                     (byte)(75 + 8),
                     (byte)(42 + 11),
                     (byte)(60 + 20),
                     97,
                     100,
                     (byte)(46 + 54),
                     (byte)(74 + 31),
                     (byte)(98 + 12),
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(βθκςνθΩθυμςτκχ.C("ӘӥӤҧӧӣӞӧӲӡҮӬӰөӬӲҴࡎࡆࠜࡃࠪࡎࡉࡍ", (byte)64, 67));
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

   private static void b() {
      c = -1386670313671005753L;
      long var0 = c ^ 4619764335393803488L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(37 + 32),
               (byte)(20 + 63),
               (byte)(14 + 33),
               (byte)(30 + 37),
               (byte)(26 + 40),
               (byte)(41 + 26),
               (byte)(36 + 11),
               (byte)(51 + 29),
               75,
               (byte)(39 + 28),
               (byte)(41 + 42),
               (byte)(34 + 19),
               (byte)(68 + 12),
               (byte)(47 + 50),
               (byte)(64 + 36),
               (byte)(22 + 78),
               (byte)(71 + 34),
               (byte)(8 + 102),
               (byte)(56 + 47)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(9 + 59), (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
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
               b[0] = ΨφιωσρΓδΔθ.A("ååíëðäÏöâéÛĊĈĘĜĘĠöðĢĢäĀ÷āĜėĦĄĎĄĨ", (byte)13, 65);
               b[1] = ΣερμΔσατσκ.B("äċÑäâĐïâĔåÓØčúČúĒìāĠúãĝãāùĔĄùèāĩýûôôĞēĀĭĂĔĜøİĚđĵĀĮĂ÷ĦĨģĒĸŌėčĤľıŅďĲĭľŁĦĭœŐŘėġ", (byte)13, 66);
               b[2] = ΣφδσΔζιΠρα.F("ӺԍӺԟԕԖՉՃԾԥԶԑ", (byte)13, 70);
               b[3] = δΛψπξκσβγςα.C("ЎЎяИАїВЬјћнмЩњЭмТцћеСвЯа", (byte)13, 67);
               b[4] = ζοηκορΦνΣθγΩ.B("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàßģãéĬċíĤáĨĤ", (byte)13, 66);
               b[5] = ΠΛΨοδΩσμνΛγΦφβς.A("ËËČÕÍĔÏéĕĘúùæėêùßăĘòÞïìí", (byte)13, 65);
               b[6] = ςπυηννναΣ.E("ԠԸԚԀԛԐԾԇԴՂԺԥՄԥԹԡԍԜԧՌԐԏՓԓԙ՜ԻԝՔԑ\u0558Ք", (byte)13, 69);
               break;
            case 1:
               b[0] = χφπρψπφΦθμπ.E("ԕԕԝԛԠԔӿԦԒԙԋԺԸՈՌՈՐԦԠՒՒԓԔԳՓԥՈԗԯ\u0557ԸՑ", (byte)13, 69);
               b[1] = ντθΔζβΔζ.F("ԔԻԁԔԒՀԟԒՄԕԃԈԽԪԼԪՂԜԱՐԪԓՍԓԱԩՄԴԩԘԱՙԭԫԤԤՎՃ\u0530՝ԲՄՌԨՠՊՁե\u0530՞ԲԧՖ\u0558ՓՂըռՇԽՔծայղ՛մՁեմև՚ՆՅֆՑ", (byte)13, 70);
               b[2] = ΣφδσΔζιΠρα.D("ГАјРЏЦуЖэИЫФ", (byte)13, 68);
               b[3] = ΣδτΠνεγοΓορητ.D("ЎЎяИАїВЬјћоюКћЫижєјиштЯа", (byte)13, 68);
               b[4] = οΩνΩρωλΨηΛδωδ.A("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàâçđüýãĘĈĪĪČ", (byte)13, 65);
               b[5] = οοθδΨιοΦΠβδζ.F("ӻӻԼԅӽՄӿԙՅՈԪԼԚՎՉԣԞԡՓԴԞՅԜԝ", (byte)13, 70);
               b[6] = οοθδΨιοΦΠβδζ.A("ðĈêÐëàĎ×ĄĒĊõĔõĉñÝì÷ĜàåęûĒĖĥĩĉĠîą", (byte)13, 65);
               break;
            case 2:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.E("ԵԢԤԚԐՇԄԑԇԄԂԄԄՉԎՊԾԓԎԵԫԯԜԝ", (byte)13, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = ντθΔζβΔζ.C("УпЫЊИЌэИоЭЬЪЗДОйЮРООкџШньљѠуѲџѳѦ", (byte)13, 67);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static boolean a(ΨγημιδξΓτοθαζ var0, String var1, String var2, στΩξξχκι var3) {
      if (var1 != null && var2 != null) {
         long var4 = System.nanoTime();
         γτΓξβμΠΣυχ var6 = βδΔφμπθθγ.b();
         int var7 = b;
         boolean var13 = false /* VF: Semaphore variable */;

         int var10;
         try {
            var13 = true;
            int var8 = c;
            γτΓξβμΠΣυχ var9 = var3.a();
            if (var9 == null) {
               ψΓωτιμωκχψΛΨ.c(c<"㺀">(d, e ^ f) + var3.i() + c<"㺃">(g, h ^ i) + var2 + c<"㺆">(j, k ^ l));
            } else {
               var8 = var9.a().i(var1, var2);
            }

            if (var8 != 0) {
               var7 = var9 == var6 && !var9.a().v(var2) ? o : n;
            }

            var10 = var8;
            var13 = false;
         } finally {
            if (var13) {
               κδξτΦΠωφ.a(ΨΛυνγφυνδΨδγΣ.l, var4);
               if (var7 != 0) {
                  ψΓωτιμωκχψΛΨ.b(c<"㺏">(w, x ^ y) + var3.i() + c<"㺒">(z, aa ^ ab) + var6.name());
                  var0.a().c(var3, var1);
               }
            }
         }

         κδξτΦΠωφ.a(ΨΛυνγφυνδΨδγΣ.l, var4);
         if (var7 != 0) {
            ψΓωτιμωκχψΛΨ.b(c<"㺉">(p & q, r) + var3.i() + c<"㺌">(s, t ^ u) + var6.name());
            var0.a().c(var3, var1);
         }

         return (boolean)var10;
      } else {
         return (boolean)a;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ψοΔκΠσνπ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(πηγμΣΔκκ.B("şƁƃţƇƦƞƴƠůƭƣƱƫŴƙƻƺƲƸƲƇ", (byte)92, 66), ψοΔκΠσνπ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            βθκςνθΩθυμςτκχ.B("ƚƧƦũƩƥƠƩƴƣŰƮƲƫƮƴŶԐԈӞԅӬԐԋԏƊ", (byte)92, 66) + var1 + ΨφιωσρΓδΔθ.A("ű", (byte)92, 65) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }
}
