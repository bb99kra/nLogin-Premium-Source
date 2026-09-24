package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.chat.ChatTypes;
import com.nickuc.login.lib.packetevents.api.protocol.chat.message.ChatMessage;
import com.nickuc.login.lib.packetevents.api.wrapper.play.client.WrapperPlayClientChatMessage;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerChatMessage;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class ΠλαιΠγλΛψζχηε implements θβορΛτηατθΨτΠτΦ, μθοδηοΠνΦΛνξΛ {
   private static int r = 1006632960 >>> 90 | 1006632960 << ~90 + 1;
   private static int p = Integer.reverse(0);
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(-3891110078048108544L);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static String[] a = new String[ΠλαιΠγλΛψζχηε.t];
   private static long c;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int h = 0 >>> 98 | 0 << ~98 + 1;
   private static String[] b = new String[ΠλαιΠγλΛψζχηε.u];
   private static int f = Integer.reverse(1073741824);
   private static int o = 0 >>> 0 | 0 << ~0 + 1;
   private static int b = 0 >>> 110 | 0 << ~110 + 1;
   private static long i = Long.reverse(3258719003570544716L);
   private static int s = Integer.reverse(Integer.MIN_VALUE);
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int u = 2048 >>> 11 | 2048 << ~11 + 1;
   private static int k = 16 >>> 196 | 16 << ~196 + 1;
   private static int c = Integer.reverse(-201326592);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int m = 4 >>> 34 | 4 << ~34 + 1;
   private static int n = (536870912 >>> 189 | 536870912 << ~189 + 1) & -1;
   private static int l = Integer.reverse(0);
   private static int q = 262144 >>> 114 | 262144 << -114;

   @Override
   public void a(PacketSendEvent var1) {
      if (ΣλνΨουΩΔοθεβ.an.ar()) {
         Object var2 = var1.getPlayer();
         if (var2 != null) {
            ΨαχΨχΣλεΠψΦ var3 = ΓΩηκψγΓεςσγΓ.a(this.c).b().a(var2);
            ιηοψσγξςΩγδ var4 = ΓΩηκψγΓεςσγΓ.a(this.c).a().a(var3);
            if (var4 != null) {
               if (!var4.a().b(οωλθςδυΛβσΨδγπ.f)) {
                  WrapperPlayServerChatMessage var5 = new WrapperPlayServerChatMessage(var1);
                  ChatMessage var6 = var5.getMessage();
                  if (var6.getType() != ChatTypes.GAME_INFO) {
                     Component var7 = var6.getChatContent();
                     List var8 = var4.a(πβκνλοΛκΠδΦτφλ.l, var0 -> new ArrayList());
                     if (var8.size() < r) {
                        var8.add(var7);
                     }

                     var1.setCancelled((boolean)s);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      Object var2 = var1.getPlayer();
      if (var2 != null) {
         ΨαχΨχΣλεΠψΦ var3 = ΓΩηκψγΓεςσγΓ.a(this.c).b().a(var2);
         ιηοψσγξςΩγδ var4 = ΓΩηκψγΓεςσγΓ.a(this.c).a().a(var3);
         if (var4 == null) {
            var1.setCancelled((boolean)a);
         } else {
            WrapperPlayClientChatMessage var5 = new WrapperPlayClientChatMessage(var1);
            String var6 = var5.getMessage();
            if (!(var6 = var6.trim()).isEmpty()) {
               if (var6.charAt(b) == c) {
                  String var7 = ΓΩηκψγΓεςσγΓ.a(this.c).b().a(var3, var6);
                  if (var7 == null) {
                     var1.setCancelled((boolean)d);
                     return;
                  }

                  var5.setMessage(var7);
                  var1.markForReEncode((boolean)e);
                  if (var6.length() < f) {
                     return;
                  }

                  String[] var8 = var6.substring(g).split(c<"㺀">(h, i ^ j));
                  if (var8.length < k) {
                     return;
                  }

                  ηισξπαΠχΩ var9 = ΓΩηκψγΓεςσγΓ.a(this.c).a().a(var8[l].toLowerCase(Locale.ENGLISH));
                  if (var9 != null) {
                     String[] var10 = new String[var8.length - m];
                     if (var10.length > 0) {
                        System.arraycopy(var8, n, var10, o, var10.length);
                     }

                     var9.a(var3, var4, var8[p], var10);
                  }
               } else if (ΓΩηκψγΓεςσγΓ.a(this.c).b().a(var3, var6)) {
                  var1.setCancelled((boolean)q);
               }
            }
         }
      }
   }

   private static void b() {
      c = 3604222655857859764L;
      long var0 = c ^ 3119402993596358944L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               69,
               (byte)(66 + 17),
               (byte)(21 + 26),
               (byte)(39 + 28),
               (byte)(61 + 5),
               (byte)(18 + 49),
               (byte)(19 + 28),
               (byte)(27 + 53),
               (byte)(45 + 30),
               (byte)(19 + 48),
               (byte)(59 + 24),
               (byte)(8 + 45),
               (byte)(5 + 75),
               (byte)(64 + 33),
               (byte)(49 + 51),
               (byte)(33 + 67),
               (byte)(33 + 72),
               (byte)(78 + 32),
               (byte)(79 + 24)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(31 + 52)}, StandardCharsets.UTF_8));
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
               b[0] = πψυκΠΨμΛΩβΣφμφσ.C("њѧћѽѵѹқҁћџѴѩ", (byte)36, 67);
               break;
            case 1:
               b[0] = χΠξΦιζΨΣωΦσΨζ.B("ľėúįēĭŀĂĴĦĴď", (byte)36, 66);
               break;
            case 2:
               b[0] = ΠΛΨοδΩσμνΛγΦφβς.B("ĲĖĚĂľĥĿćłĖĴď", (byte)36, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = ΣδτΠνεγοΓορητ.A("ķüĚĶöĘĲýġğĠŊĖĮŉėŇĲĄěĽŇĞŉĭĕņĘŊĥŒĨ", (byte)36, 65);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΠλαιΠγλΛψζχηε.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(χφπρψπφΦθμπ.C("јѺѼќҀҟҗҭҙѨҦҜҪҤѭҒҴҳҫұҫҀ", (byte)41, 67), ΠλαιΠγλΛψζχηε.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            πχσδΦΦνθΔπ.A("ĴŁŀăŃĿĺŃŎĽĊňŌŅňŎĐ҂ҞҕҞ҆Қң҄ҲҡҳҤңĩ", (byte)41, 65) + var1 + φδχεθοκψαλΛογλ.E("ԟ", (byte)41, 69) + var2.toString(), var4
         );
      }
   }

   @Generated
   private ΠλαιΠγλΛψζχηε(ΓΩηκψγΓεςσγΓ var1) {
      this.c = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 83L;
      var1 ^= 3119402993596358944L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(20 + 48),
                     (byte)(61 + 8),
                     (byte)(43 + 40),
                     (byte)(32 + 15),
                     (byte)(46 + 21),
                     (byte)(49 + 17),
                     (byte)(33 + 34),
                     (byte)(42 + 5),
                     (byte)(44 + 36),
                     75,
                     67,
                     (byte)(11 + 72),
                     (byte)(5 + 48),
                     (byte)(42 + 38),
                     (byte)(14 + 83),
                     (byte)(79 + 21),
                     (byte)(60 + 40),
                     (byte)(34 + 71),
                     (byte)(18 + 92),
                     (byte)(91 + 12)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(3 + 80)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(φδχεθοκψαλΛογλ.D("ыјїКњіёњѥєСџѣќџѥЧޙ\u07b5ެ\u07b5ޝޱ\u07baޛ߉\u07b8ߊ\u07bb\u07ba", (byte)17, 68));
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

   static {
      b();
   }
}
