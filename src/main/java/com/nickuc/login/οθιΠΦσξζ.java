package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class οθιΠΦσξζ implements ΦοιυξχςΩΦψξΓΣΨ {
   private static long d = Long.reverse(7205759403792793600L);
   private static long f = Long.reverse(-2934580578066116807L);
   private static long l = Long.reverse(-5528653963431522503L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(7205759403792793600L);
   private static String[] a = new String[οθιΠΦσξζ.m];
   private static int m = Integer.reverse(536870912);
   private static long b = Long.reverse(-2934580578066116807L);
   private static long g = Long.reverse(7205759403792793600L);
   private static String[] b = new String[οθιΠΦσξζ.n];
   private static int a = Integer.reverse(0);
   private static long c;
   private static int k = '쀀' >>> 174 | 49152 << ~174 + 1;
   private static int h = 8 >>> 2 | 8 << ~2 + 1;
   private static long i = Long.reverse(-2934580578066116807L);
   private static int n = (512 >>> 199 | 512 << -199) & -1;
   private final nLoginBukkit h;

   private static void b() {
      c = -7137121407931882773L;
      long var0 = c ^ -8098623117213163047L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(54 + 14),
               (byte)(11 + 58),
               (byte)(63 + 20),
               (byte)(7 + 40),
               (byte)(6 + 61),
               (byte)(58 + 8),
               (byte)(53 + 14),
               (byte)(21 + 26),
               (byte)(75 + 5),
               (byte)(5 + 70),
               (byte)(5 + 62),
               (byte)(10 + 73),
               (byte)(12 + 41),
               (byte)(49 + 31),
               (byte)(44 + 53),
               100,
               (byte)(49 + 51),
               (byte)(96 + 9),
               110,
               (byte)(63 + 40)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = φδχεθοκψαλΛογλ.A("ĬįĴĭĠĲþŊāňĥŌĸŏīŐĜőŋĢīņĔņĘņĒŗħŒļĿ", (byte)37, 65);
               b[1] = πηγμΣΔκκ.F("ԕԻԚԸ՛ԑԬԪԻՃԹՑԥըՙՒՉ\u0558ի՟թՇԴԵ", (byte)37, 70);
               b[2] = ΣερμΔσατσκ.C("ҏѿѧіҌѵѕѤҥќѿѬ", (byte)37, 67);
               b[3] = φδχεθοκψαλΛογλ.A("ĴĤČûıĚúĉŊāĤđ", (byte)37, 65);
               break;
            case 1:
               b[0] = μεςΩΔΣγν.D("҇Ҋҏ҈ѻҍљҥќңҀҧғҪ҆ҫѷҬҦѽ҆ҩҲѦҥғ҄ҌҧҚҥҴ", (byte)37, 68);
               b[1] = ΣερμΔσατσκ.A("ýģĂĠŃùĔĒģīġąĦħŀŀŇČďŔĨğĜĝ", (byte)37, 65);
               b[2] = λΣΩσμφγχ.E("ԗԮ՛Թ՞Ի՛՛ԫդԣՐՐՠ\u0558ՑաէԦԺԷԷԴԵ", (byte)37, 69);
               b[3] = ΣδτΠνεγοΓορητ.A("üĂēįėıĲĽĲĸŁĶĬĪņĬīĤčĿŗğĜĝ", (byte)37, 65);
               break;
            case 2:
               b[0] = βεξΠθρρςΔΦμ.B("ğþĿĸąăĽāĴĳĔŇĜĮńīħĦœĎĨįņıĻĖŖĦřřĭĿ", (byte)37, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = φΨαξωυθανΣφυκη.A("ĕĖįĂĢħĢŁāāġĶŏīłĦħĳŁŒĿįĜĝ", (byte)37, 65);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  οθιΠΦσξζ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(φδχεθοκψαλΛογλ.B("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 66), οθιΠΦσξζ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            βθκςνθΩθυμςτκχ.F("ՕբաԤդՠ՛դկ՞ԫթխզթկԱࣂࢼࢾࢦࢭ࣋ࣇࣀՅ", (byte)54, 70) + var1 + ΣδτΠνεγοΓορητ.D("ґ", (byte)54, 68) + var2.toString(), var4
         );
      }
   }

   @Generated
   public οθιΠΦσξζ(nLoginBukkit var1) {
      this.h = var1;
   }

   static {
      b();
   }

   @EventHandler(
      priority = EventPriority.MONITOR
   )
   public void a(PlayerCommandSendEvent var1) {
      if (!this.h.i()) {
         Player var2 = var1.getPlayer();
         if (!var2.hasPermission(c<"㺀">(a, b ^ d)) && !var2.hasPermission(c<"㺃">(e, f ^ g))) {
            Collection var3 = var1.getCommands();
            if (var3.stream().noneMatch(c<"㺆">(h, i ^ j)::equalsIgnoreCase)) {
               var3.add(c<"㺉">(k, l));
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 38L;
      var1 ^= -8098623117213163047L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(19 + 50),
                     (byte)(70 + 13),
                     (byte)(35 + 12),
                     (byte)(23 + 44),
                     (byte)(33 + 33),
                     (byte)(54 + 13),
                     47,
                     (byte)(18 + 62),
                     (byte)(44 + 31),
                     (byte)(10 + 57),
                     (byte)(77 + 6),
                     (byte)(4 + 49),
                     (byte)(22 + 58),
                     (byte)(41 + 56),
                     (byte)(97 + 3),
                     100,
                     (byte)(18 + 87),
                     (byte)(65 + 45),
                     (byte)(4 + 99)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(10 + 58), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(μεςΩΔΣγν.E("֦֥֙ըֳ֤֢֨֟֨կֱֳ֪֭֭յआऀंࣱ࣪एऋऄ", (byte)122, 69));
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
