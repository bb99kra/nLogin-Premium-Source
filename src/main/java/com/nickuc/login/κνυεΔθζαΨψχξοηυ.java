package com.nickuc.login;

import com.nickuc.login.api.types.Location;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;

public class κνυεΔθζαΨψχξοηυ implements ςνΛωΠθρπυΣμκΓΩο<Location> {
   private static int h = (8388608 >>> 182 | 8388608 << ~182 + 1) & -1;
   private static long d = Long.reverse(-7061644215716937728L);
   private static long b = Long.reverse(-1360614773642580895L);
   private static int f = Integer.reverse(-1);
   private static int a = (0 >>> 154 | 0 << ~154 + 1) & -1;
   public static κνυεΔθζαΨψχξοηυ a = new κνυεΔθζαΨψχξοηυ();
   private static String[] b = new String[κνυεΔθζαΨψχξοηυ.i];
   private static long g = Long.reverse(8295102827439762529L);
   private static String[] a = new String[h];
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long c;
   private static int i = Integer.reverse(1073741824);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  κνυεΔθζαΨψχξοηυ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςΦζσμτΓσ.B("ÉëíÍñĐĈĞĊÙėčěĕÞăĥĤĜĢĜñ", (byte)17, 66), κνυεΔθζαΨψχξοηυ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            πχσδΦΦνθΔπ.B("ĄđĐÓēďĊēĞčÚĘĜĕĘĞàѬѰѹѪъѯѮѪѢ҃҃ѻѽѶ҅û", (byte)17, 66) + var1 + χφπρψπφΦθμπ.F("ԇ", (byte)17, 70) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 121L;
      var1 ^= -3400446070645699238L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(42 + 26),
                     (byte)(62 + 7),
                     (byte)(40 + 43),
                     (byte)(35 + 12),
                     (byte)(41 + 26),
                     (byte)(29 + 37),
                     (byte)(4 + 63),
                     (byte)(46 + 1),
                     (byte)(39 + 41),
                     (byte)(69 + 6),
                     (byte)(49 + 18),
                     83,
                     53,
                     (byte)(5 + 75),
                     (byte)(51 + 46),
                     (byte)(2 + 98),
                     (byte)(98 + 2),
                     (byte)(45 + 60),
                     (byte)(75 + 35),
                     (byte)(61 + 42)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(66 + 2), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(λΣΩσμφγχ.F("եղձԴմհիմտծԻչսնչտՁ࣑࣍ࣚ࣋ࢫ࣐࣏࣋ࣃࣦࣤࣤࣜࣞࣗ", (byte)70, 70));
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

   public JSONObject a(@Nonnull Location var1) {
      JSONObject var2 = new JSONObject();
      org.bukkit.Location var3 = new org.bukkit.Location(
         Bukkit.getServer().getWorld(var1.getWorldName()), var1.getX(), var1.getY(), var1.getZ(), var1.getYaw(), var1.getPitch()
      );
      var2.put(c<"㺀">(a, b ^ d), ξπχιβρμογιω.a(var3));
      return var2;
   }

   public Location a(@Nonnull JSONObject var1) {
      String var2 = var1.getString(c<"㺀">(e & f, g));
      org.bukkit.Location var3 = ξπχιβρμογιω.a(var2);
      return new γδδΛζΨφδΠΛ(var3.getWorld().getName(), var3.getX(), var3.getY(), var3.getZ(), var3.getYaw(), var3.getPitch());
   }

   private static void b() {
      c = -8776029966039746377L;
      long var0 = c ^ -3400446070645699238L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(4 + 64),
               (byte)(64 + 5),
               (byte)(48 + 35),
               47,
               (byte)(65 + 2),
               (byte)(43 + 23),
               (byte)(64 + 3),
               (byte)(14 + 33),
               (byte)(79 + 1),
               (byte)(15 + 60),
               (byte)(15 + 52),
               83,
               (byte)(16 + 37),
               (byte)(33 + 47),
               (byte)(82 + 15),
               (byte)(49 + 51),
               (byte)(31 + 69),
               (byte)(79 + 26),
               (byte)(2 + 108),
               (byte)(43 + 60)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
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
               b[0] = ΣερμΔσατσκ.D("ЅеІ϶зЏкйϻОϹЃ", (byte)2, 68);
               b[1] = ΠΛΨοδΩσμνΛγΦφβς.C("ЅеІ϶зЏкйϻОϹЃ", (byte)2, 67);
               break;
            case 1:
               b[0] = οΩνΩρωλΨηΛδωδ.D("СжаБАиЂЃЯМϾЉАГϿсЏЦЮЁшчЎЏ", (byte)2, 68);
               b[1] = πχσδΦΦνθΔπ.C("ТФЧϴЎСХБАЖЗЗПйЎϽБЭмхвСЎЏ", (byte)2, 67);
               break;
            case 2:
               b[0] = ζβησεθωυγτ.F("ӭԐӳԸԬԇԹԐԼԑԲԞԾӾԅӿՆԣԡԅՁԺԑԒ", (byte)2, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = οοθδΨιοΦΠβδζ.E("өԪԐԚԍԄԸԔԻԾӼӽԟӿԲԹԄԟԼԷԕԅՀԩԝ\u0530ԚԮԣՇՉԯ", (byte)2, 69);
         }
      }
   }

   @Override
   public Class<?> a() {
      return Location.class;
   }
}
