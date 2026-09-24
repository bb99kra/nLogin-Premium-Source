package com.nickuc.login;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class οΨημζξξνς {
   private static String[] b = new String[οΨημζξξνς.d];
   private static int a = Integer.reverse(0);
   private static String[] a = new String[οΨημζξξνς.c];
   private static long c;
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static long b = Long.reverse(-7096634573547640957L);

   static {
      b();
   }

   public void a(Location var1, DataOutputStream var2) {
      World var3 = var1.getWorld();
      if (var3 == null) {
         throw new IllegalArgumentException(c<"㺀">(a, b));
      } else {
         var2.writeUTF(var3.getName());
         var2.writeDouble(var1.getX());
         var2.writeDouble(var1.getY());
         var2.writeDouble(var1.getZ());
         var2.writeFloat(var1.getYaw());
         var2.writeFloat(var1.getPitch());
      }
   }

   private static void b() {
      c = -4474335652178181757L;
      long var0 = c ^ -2531416651929521423L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(28 + 40),
               (byte)(58 + 11),
               (byte)(42 + 41),
               (byte)(16 + 31),
               67,
               (byte)(16 + 50),
               (byte)(3 + 64),
               (byte)(27 + 20),
               (byte)(50 + 30),
               (byte)(9 + 66),
               (byte)(66 + 1),
               (byte)(60 + 23),
               (byte)(3 + 50),
               (byte)(39 + 41),
               97,
               (byte)(49 + 51),
               (byte)(50 + 50),
               (byte)(9 + 96),
               (byte)(71 + 39),
               (byte)(61 + 42)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(30 + 39), 83}, StandardCharsets.UTF_8));
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
               b[0] = θεωψξβΛσσ.F("ոբՙ\u058bղզձ֠չ֛֓֗ճ֟յ՚֙չժ֧ընճմ", (byte)100, 70);
               break;
            case 1:
               b[0] = ςΦζσμτΓσ.D("ԹԣԚՌԳԧԲաԺՔ՝ԯ\u0557ԾթԼդեՙՙԫիՊԮԫըԫՇՌՔԴՋ", (byte)100, 68);
               break;
            case 2:
               b[0] = ντθΔζβΔζ.E("ղշմ֓՚մռցմր֒֕րգ֏֢֘֗ի֖֝նճմ", (byte)100, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = πψυκΠΨμΛΩβΣφμφσ.A("ƽƌƯƼƑžƴƯƟƝƅƏ", (byte)100, 65);
         }
      }
   }

   @CheckReturnValue
   @Nullable
   public Location a(DataInputStream var1) {
      String var2 = var1.readUTF();
      double var3 = var1.readDouble();
      double var5 = var1.readDouble();
      double var7 = var1.readDouble();
      float var9 = var1.readFloat();
      float var10 = var1.readFloat();
      World var11 = Bukkit.getServer().getWorld(var2);
      return var11 != null ? new Location(var11, var3, var5, var7, var9, var10) : null;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  οΨημζξξνς.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(οοθδΨιοΦΠβδζ.D("Քնո\u0558ռ֛֓֩֕դ֢֦֘֠թ֎ְ֧֧֭֯ռ", (byte)125, 68), οΨημζξξνς.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣφδσΔζιΠρα.D("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩իࣦࣶࣼࣼࣷऀँँइր", (byte)125, 68) + var1 + οΩνΩρωλΨηΛδωδ.E("ճ", (byte)125, 69) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 58L;
      var1 ^= -2531416651929521423L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(16 + 52),
                     (byte)(2 + 67),
                     (byte)(46 + 37),
                     (byte)(45 + 2),
                     (byte)(21 + 46),
                     66,
                     (byte)(66 + 1),
                     47,
                     (byte)(22 + 58),
                     (byte)(72 + 3),
                     (byte)(65 + 2),
                     (byte)(77 + 6),
                     (byte)(14 + 39),
                     (byte)(48 + 32),
                     (byte)(33 + 64),
                     (byte)(46 + 54),
                     (byte)(33 + 67),
                     (byte)(44 + 61),
                     (byte)(11 + 99),
                     (byte)(71 + 32)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(20 + 48), 69, (byte)(13 + 70)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(πχσδΦΦνθΔπ.E("ծջպԽսչմսֈշՄւֆտւֈՊࣛࣅࣦࣕࣛࣖࣟ࣠࣠", (byte)79, 69));
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
