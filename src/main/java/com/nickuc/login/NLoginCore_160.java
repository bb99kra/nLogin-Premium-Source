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

public class NLoginCore_160 implements NLoginInterface_027 {
   private static long d = Long.reverse(7205759403792793600L);
   private static long f = Long.reverse(-2934580578066116807L);
   private static long l = Long.reverse(-5528653963431522503L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(7205759403792793600L);
   private static String[] ZKM_STR_A = new String[NLoginCore_160.m];
   private static int m = Integer.reverse(536870912);
   private static long b = Long.reverse(-2934580578066116807L);
   private static long g = Long.reverse(7205759403792793600L);
   private static String[] ZKM_STR_B = new String[NLoginCore_160.n];
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
               ZKM_STR_B[0] = NLoginCore_433.A("ĬįĴĭĠĲþŊāňĥŌĸŏīŐĜőŋĢīņĔņĘņĒŗħŒļĿ", (byte)37, 65);
               ZKM_STR_B[1] = NLoginCore_138.F("ԕԻԚԸ՛ԑԬԪԻՃԹՑԥըՙՒՉ\u0558ի՟թՇԴԵ", (byte)37, 70);
               ZKM_STR_B[2] = NLoginCore_241.C("ҏѿѧіҌѵѕѤҥќѿѬ", (byte)37, 67);
               ZKM_STR_B[3] = NLoginCore_433.A("ĴĤČûıĚúĉŊāĤđ", (byte)37, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_521.D("҇Ҋҏ҈ѻҍљҥќңҀҧғҪ҆ҫѷҬҦѽ҆ҩҲѦҥғ҄ҌҧҚҥҴ", (byte)37, 68);
               ZKM_STR_B[1] = NLoginCore_241.A("ýģĂĠŃùĔĒģīġąĦħŀŀŇČďŔĨğĜĝ", (byte)37, 65);
               ZKM_STR_B[2] = NLoginCore_553.E("ԗԮ՛Թ՞Ի՛՛ԫդԣՐՐՠ\u0558ՑաէԦԺԷԷԴԵ", (byte)37, 69);
               ZKM_STR_B[3] = NLoginCore_076.A("üĂēįėıĲĽĲĸŁĶĬĪņĬīĤčĿŗğĜĝ", (byte)37, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_223.B("ğþĿĸąăĽāĴĳĔŇĜĮńīħĦœĎĨįņıĻĖŖĦřřĭĿ", (byte)37, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.A("ĕĖįĂĢħĢŁāāġĶŏīłĦħĳŁŒĿįĜĝ", (byte)37, 65);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_160.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_433.B("ēĵķėĻŚŒŨŔģšŗťşĨōůŮŦŬŦĻ", (byte)54, 66), NLoginCore_160.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.F("ՕբաԤդՠ՛դկ՞ԫթխզթկԱࣂࢼࢾࢦࢭ࣋ࣇࣀՅ", (byte)54, 70) + var1 + NLoginCore_076.D("ґ", (byte)54, 68) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_160(nLoginBukkit var1) {
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
         if (!var2.hasPermission(a(a, b ^ d)) && !var2.hasPermission(a(e, f ^ g))) {
            Collection var3 = var1.getCommands();
            if (var3.stream().noneMatch(a(h, i ^ j)::equalsIgnoreCase)) {
               var3.add(a(k, l));
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 38L;
      var1 ^= -8098623117213163047L;
      if (ZKM_STR_A[var0] == null) {
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
            throw new RuntimeException(NLoginCore_521.E("֦֥֙ըֳ֤֢֨֟֨կֱֳ֪֭֭յआऀंࣱ࣪एऋऄ", (byte)122, 69));
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
}
