package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.entity.Player.Spigot;

public class NLoginCore_534 implements NLoginInterface_001 {
   private static int m = Integer.reverse(1073741824);
   private static String[] ZKM_STR_A = new String[m];
   private static String[] ZKM_STR_B = new String[NLoginCore_534.n];
   private static long d = Long.reverse(1152921504606846976L);
   private static long b = Long.reverse(-1744366225216420974L);
   private static int i = 16 >>> 3 | 16 << -3;
   private static int a = Integer.reverse(0);
   private static int f = 64 >>> 166 | 64 << -166;
   private static int j = Integer.reverse(0);
   private static int k = (134217728 >>> 251 | 134217728 << -251) & -1;
   private static int l = Integer.reverse(0);
   private static int n = 64 >>> 5 | 64 << ~5 + 1;
   private static int g = (-1 >>> 59 | -1 << ~59 + 1) & -1;
   private static long h = Long.reverse(-591444720609573998L);
   private static long c;
   private static int e = (0 >>> 69 | 0 << -69) & -1;

   static {
      b();
   }

   public NLoginCore_534() {
      a(a, b ^ d);
      String var10001 = a(f & g, h);
      Class[] var10002 = new Class[i];
      var10002[j] = ChatMessageType.class;
      var10002[k] = Array.newInstance(BaseComponent.class, l).getClass();
      Objects.requireNonNull(Spigot.class.getMethod(var10001, var10002));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_534.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.E("ԛԽԿԟՃբ՚հ՜ԫթ՟խէ\u0530ՕշնծմծՃ", (byte)55, 69), NLoginCore_534.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_384.A("ŐŝŜğşśŖşŪřĦŤŨšŤŪĬҴҟҨҹҾҷӀҽҹӁҫӀӓŅ", (byte)55, 65) + var1 + NLoginCore_223.B("ħ", (byte)55, 66) + var2.toString(), var4
         );
      }
   }

   @Override
   public void send(Player var1, String var2) {
      var1.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(var2));
   }

   private static String a(int var0, long var1) {
      var1 ^= 8L;
      var1 ^= 7443382481383945549L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(17 + 51),
                     (byte)(31 + 38),
                     (byte)(5 + 78),
                     (byte)(15 + 32),
                     (byte)(22 + 45),
                     (byte)(65 + 1),
                     (byte)(38 + 29),
                     (byte)(25 + 22),
                     (byte)(20 + 60),
                     (byte)(19 + 56),
                     (byte)(62 + 5),
                     (byte)(31 + 52),
                     (byte)(39 + 14),
                     (byte)(34 + 46),
                     (byte)(91 + 6),
                     (byte)(82 + 18),
                     (byte)(10 + 90),
                     (byte)(10 + 95),
                     (byte)(37 + 73),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(49 + 19), (byte)(52 + 17), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_138.A("ĺŇņĉŉŅŀŉŔŃĐŎŒŋŎŔĖҞ҉ҒңҨҡҪҧңҫҕҪҽ", (byte)44, 65));
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

   private static void b() {
      c = 5314972965578953703L;
      long var0 = c ^ 7443382481383945549L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(14 + 54),
               (byte)(33 + 36),
               (byte)(35 + 48),
               (byte)(37 + 10),
               67,
               (byte)(29 + 37),
               (byte)(10 + 57),
               (byte)(35 + 12),
               (byte)(8 + 72),
               (byte)(58 + 17),
               (byte)(19 + 48),
               (byte)(42 + 41),
               (byte)(32 + 21),
               (byte)(14 + 66),
               (byte)(16 + 81),
               100,
               (byte)(25 + 75),
               (byte)(77 + 28),
               (byte)(91 + 19),
               (byte)(85 + 18)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(8 + 61), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_110.D("ҠӂҼһұӜӡҿӆӚӋҴ", (byte)61, 68);
               ZKM_STR_B[1] = NLoginCore_127.A("ŝńŒųĮŷĴŤŌķŰųųŖŪĻŻŻŘŒźşŌō", (byte)61, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.C("ӄӅӄҰӈҴӦҢӖӘӡҬҿӊҳӥӏҰӅҴҷӂҿӀ", (byte)61, 67);
               ZKM_STR_B[1] = NLoginCore_141.E("՝ՄՒճԮշԴդՌԷծՕ\u0558տիՖԸպ՞Վօ՟ՌՍ", (byte)61, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_530.B("ŨŐŜŌŠŮŎŒŇňŏźŝŴŻŏŖļőĿŁŏŌō", (byte)61, 66);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_183.A("ţńōőŮŷŬŲŇŅŶŁ", (byte)61, 65);
         }
      }
   }
}
