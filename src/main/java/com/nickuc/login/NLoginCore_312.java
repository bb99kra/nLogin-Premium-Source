package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerSystemChatMessage;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TranslatableComponent;

public class NLoginCore_312 implements NLoginInterface_043 {
   private static long c;
   private static long l = Long.reverse(-680009430275803389L);
   private static int t = Integer.reverse(-1610612736);
   private static int i = Integer.reverse(1073741824);
   private static int h = (0 >>> 233 | 0 << ~233 + 1) & -1;
   private static long b = Long.reverse(-2841737251413641469L);
   private static long g = Long.reverse(-680009430275803389L);
   private static int m = 0 >>> 70 | 0 << -70;
   private static int p = 8388608 >>> 183 | 8388608 << ~183 + 1;
   private static int q = Integer.reverse(-268435456);
   private static long o = Long.reverse(-680009430275803389L);
   private static int f = Integer.reverse(-1);
   private static int k = (24576 >>> 173 | 24576 << -173) & -1;
   private static int r = (8 >>> 35 | 8 << -35) & -1;
   private static int e = (134217728 >>> 155 | 134217728 << -155) & -1;
   private static int n = 256 >>> 230 | 256 << -230;
   private static int s = Integer.reverse(-1610612736);
   private static int a = (0 >>> 200 | 0 << -200) & -1;
   private static long j = Long.reverse(-680009430275803389L);
   private static String[] ZKM_STR_A = new String[s];
   private static String[] ZKM_STR_B = new String[t];
   private static long d = Long.reverse(3314649325744685056L);

   private static String a(int var0, long var1) {
      var1 ^= 116L;
      var1 ^= -6830523307795471896L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(17 + 51),
                     (byte)(8 + 61),
                     (byte)(40 + 43),
                     47,
                     (byte)(59 + 8),
                     (byte)(51 + 15),
                     (byte)(35 + 32),
                     (byte)(9 + 38),
                     (byte)(65 + 15),
                     (byte)(48 + 27),
                     (byte)(22 + 45),
                     (byte)(37 + 46),
                     (byte)(50 + 3),
                     (byte)(19 + 61),
                     (byte)(44 + 53),
                     (byte)(19 + 81),
                     (byte)(14 + 86),
                     (byte)(91 + 14),
                     110,
                     (byte)(49 + 54)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(63 + 20)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.D("ҨҵҴѷҷҳҮҷӂұѾҼӀҹҼӂ҄ߩ࠘߬࠙߭࠘ࠤࠃࠒࠣ", (byte)48, 68));
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

   static {
      b();
   }

   private static void b() {
      c = -4544837818660681445L;
      long var0 = c ^ -6830523307795471896L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(46 + 22),
               (byte)(9 + 60),
               83,
               (byte)(20 + 27),
               (byte)(41 + 26),
               (byte)(38 + 28),
               (byte)(14 + 53),
               (byte)(30 + 17),
               (byte)(79 + 1),
               (byte)(33 + 42),
               (byte)(40 + 27),
               (byte)(47 + 36),
               (byte)(29 + 24),
               (byte)(13 + 67),
               (byte)(48 + 49),
               (byte)(37 + 63),
               (byte)(49 + 51),
               (byte)(5 + 100),
               110,
               (byte)(52 + 51)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_183.D("ФѝўвОгыуљюрѣуѣўчпыЧѬююкѭѝЭѬъѦѓжѯѲкћџѻџїѹўкпћєѣѧъфѥѭюѼјѕі", (byte)15, 68);
               ZKM_STR_B[1] = NLoginCore_076.B("ćĀĊçďíęÜćĈ×õĀĝĚûĞĤñòĕĜĈĜĢďđñÿąĢĦñĉĊĪđĦćĳĖ÷öįĀģþĕĽĴĥđĀĹĐđ", (byte)15, 66);
               ZKM_STR_B[2] = NLoginCore_427.A("ßĘęíÙîĆþĔĉûĞþĞęĂúĆâħĉĉõĨĘèħąġĎñĪĭõĖĚĶĚĒĴęõúĖďĞĢąÿĠĨĉķēĐđ", (byte)15, 65);
               ZKM_STR_B[3] = NLoginCore_223.B("ÒĎđÏéøóęÜÚĊå", (byte)15, 66);
               ZKM_STR_B[4] = NLoginCore_553.E("ՅԄԑԚԅԿԆԹԟԸԧԮԈԲՅԭՎՇԍՃ\u0557ԡՌՇԦԹԭՋԱԪԠԹՑգԠԴՇԢԧՔՆՅ՜ԺգՏճԩՇՇԯՄղՁԾԿ", (byte)15, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_433.E("ԍՆՇԛԇԜԴԬՂԷԩՌԬՌՇ\u0530ԨԴԐՕԷԷԣՖՆԖՕԳՏԼԟ\u0558՛ԣՄՈդՈՀբՇԣԨՁծկՌՒէՕժՀթՑԾԿ", (byte)15, 69);
               ZKM_STR_B[1] = NLoginCore_092.B("ćĀĊçďíęÜćĈ×õĀĝĚûĞĤñòĕĜĈĜĢďđñÿąĢĦñĉĊĪđĦćĳĖ÷öěĚúýĂďęĞķăĄĔĮĬłŀĥōąňĭ", (byte)15, 66);
               ZKM_STR_B[2] = NLoginCore_433.C("ФѝўвОгыуљюрѣуѣўчпыЧѬююкѭѝЭѬъѦѓжѯѲкћџѻџїѹўкоїѳѦҁѺѣѥѧѠшҎѕі", (byte)15, 67);
               ZKM_STR_B[3] = NLoginCore_232.B("ÍòĖČčïäĊĆëĎå", (byte)15, 66);
               ZKM_STR_B[4] = NLoginCore_427.E("ՅԄԑԚԅԿԆԹԟԸԧԮԈԲՅԭՎՇԍՃ\u0557ԡՌՇԦԹԭՋԱԪԠԹՑգԠԴՇԢԧՔՆՅ՟՜ՍՆՋՏբԲկհՍՁԾԿ", (byte)15, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_138.A("ãÕĖÕĒČùĆĎêÛéâëþĎûâĖñĉóðñ", (byte)15, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.C("јЫЪіЖакДџѥПфтѣхѝщТнѡпѮеж", (byte)15, 67);
         }
      }
   }

   @Generated
   private NLoginCore_312(NLoginCore_346 var1) {
      this.d = var1;
   }

   @Override
   public void a(PacketSendEvent var1) {
      if (NLoginCore_477.an.ar()) {
         Object var2 = var1.getPlayer();
         if (var2 != null) {
            NLoginCore_277 var3 = NLoginCore_346.a(this.d).b().a(var2);
            NLoginCore_509 var4 = NLoginCore_346.a(this.d).a().a(var3);
            if (var4 != null) {
               if (!var4.a().b(NLoginCore_077.f)) {
                  WrapperPlayServerSystemChatMessage var5;
                  try {
                     var5 = new WrapperPlayServerSystemChatMessage(var1);
                  } catch (Throwable var8) {
                     if (!NLoginCore_370.aj() && var8 instanceof IllegalArgumentException) {
                        NLoginCore_370.c(a(i, j) + var3.getName() + a(k, l) + var8.getMessage());
                     } else {
                        NLoginCore_370.c(a(a, b ^ d) + var3.getName() + a(e & f, g), var8);
                     }

                     return;
                  }

                  if (!var5.isOverlay()) {
                     Component var6 = var5.getMessage();
                     if (var6 instanceof TranslatableComponent) {
                        TranslatableComponent var7 = (TranslatableComponent)var6;
                        if (a(n, o).equals(var7.key())) {
                           var1.setCancelled((p != 0));
                           return;
                        }
                     }

                     List var9 = var4.a(NLoginCore_567.l, var0 -> new ArrayList());
                     if (var9.size() < q) {
                        var9.add(var6);
                     }

                     var1.setCancelled((r != 0));
                  }
               }
            }
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_312.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.D("һӝӟҿӣԂӺԐӼӋԉӿԍԇӐӵԗԖԎԔԎӣ", (byte)74, 68), NLoginCore_312.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_127.E("թնյԸոմկոփղԿսցպսփՅࢪࣙࢭࣚࢮࣙࣥࣄ࣓ࣤ՛", (byte)74, 69) + var1 + NLoginCore_453.C("Ӎ", (byte)74, 67) + var2.toString(), var4
         );
      }
   }
}
