package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.PacketEvents;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.netty.channel.ChannelHelper;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;
import com.nickuc.login.lib.packetevents.api.wrapper.configuration.client.WrapperConfigClientSelectKnownPacks;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class βΓτξΦΓψδ implements θβορΛτηατθΨτΠτΦ {
   private static long e = Long.reverse(4887550275829466299L);
   private static int g = (67108864 >>> 218 | 67108864 << -218) & -1;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int b = (0 >>> 163 | 0 << -163) & -1;
   private static long c;
   private static long f = Long.reverse(-9079256848778919936L);
   private static String[] a = new String[g];
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = Integer.reverse(0);
   private static int h = (4194304 >>> 182 | 4194304 << -182) & -1;
   private static String[] b = new String[h];

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  βΓτξΦΓψδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ςΦζσμτΓσ.C("҈ҪҬҌҰӏӇӝӉҘӖӌӚӔҝӂӤӣӛӡӛҰ", (byte)57, 67), βΓτξΦΓψδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(λΣΩσμφγχ.B("ŔšŠģţşŚţŮŝĪŨŬťŨŮİҴҖӈӃҬҚӐҽń", (byte)57, 66) + var1 + ΦδφπθΩΩλζξ.C("Қ", (byte)57, 67) + var2.toString(), var4);
      }
   }

   private void a(User var1, PacketWrapper<?> var2) {
      if (αλμΣΩτψφγζηθξψ.a(this.d).b().a().L()) {
         Channel var3 = (Channel)var1.getChannel();
         var2.prepareForSend(var3, (boolean)b, (boolean)c);
         ByteBuf var4 = (ByteBuf)var2.buffer;
         if (var4 == null) {
            throw new IllegalStateException(c<"㺀">(d, e ^ f));
         }

         if (ChannelHelper.isOpen(var3)) {
            ChannelHelper.fireChannelReadInContext(var3, PacketEvents.DECODER_NAME, var4);
         } else {
            var4.release();
         }
      } else {
         var1.receivePacketSilently(var2);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 65L;
      var1 ^= 4348913793934821578L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(55 + 13),
                     (byte)(10 + 59),
                     (byte)(38 + 45),
                     (byte)(41 + 6),
                     67,
                     (byte)(17 + 49),
                     (byte)(32 + 35),
                     (byte)(27 + 20),
                     (byte)(62 + 18),
                     (byte)(22 + 53),
                     (byte)(4 + 63),
                     (byte)(3 + 80),
                     (byte)(29 + 24),
                     (byte)(15 + 65),
                     97,
                     (byte)(30 + 70),
                     (byte)(95 + 5),
                     (byte)(90 + 15),
                     (byte)(4 + 106),
                     (byte)(29 + 74)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ζβησεθωυγτ.E("ռ։ֈՋ\u058bևւ\u058b֖օՒ\u0590֔֍\u0590֖\u0558ࣜࢾࣰ࣫ࣔࣂࣸࣥ", (byte)93, 69));
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

   private static void b() {
      c = -2512527859998250046L;
      long var0 = c ^ 4348913793934821578L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(62 + 6),
               (byte)(35 + 34),
               (byte)(54 + 29),
               (byte)(41 + 6),
               67,
               (byte)(51 + 15),
               67,
               (byte)(2 + 45),
               (byte)(38 + 42),
               (byte)(38 + 37),
               (byte)(58 + 9),
               (byte)(31 + 52),
               (byte)(5 + 48),
               (byte)(48 + 32),
               (byte)(64 + 33),
               (byte)(59 + 41),
               (byte)(54 + 46),
               (byte)(67 + 38),
               (byte)(103 + 7),
               (byte)(67 + 36)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(20 + 49), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
               b[0] = φδχεθοκψαλΛογλ.A("ĺĂĹĕąėŋŊğħĥĬĊŌĽŒĳŇďĒĚŐŏĮŕěĽĘŠńńĹ", (byte)39, 65);
               break;
            case 1:
               b[0] = φδχεθοκψαλΛογλ.D("җџҖѲѢѴҨҧѼ҄҂҉ѧҩҚүҐҤѬѯѷҫҦҎҊүҪҩ҉ҫҵұѽҁҕҏӇҔҥѼҠӃӋҒ", (byte)39, 68);
               break;
            case 2:
               b[0] = οοθδΨιοΦΠβδζ.C("ҎҜғѦҜѵѲқҟ҈ѫ҉Ѽѯ҉ҌѲҦҧѵѳҶѽѾ", (byte)39, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = ζβησεθωυγτ.C("ѮѬѹ҇Җ҈ѵѥ҇ҊҦҨҐҤѭѯҌѽҪҴ҈ҀҡҖҜҘҫҩғҸҸѿ", (byte)39, 67);
         }
      }
   }

   public βΓτξΦΓψδ(αλμΣΩτψφγζηθξψ var1) {
      this.d = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      Channel var2 = (Channel)var1.getChannel();
      if (var2.hasAttr(ωΩμΩχδοωδΔΠΔδ.c)) {
         ωΩμΩχδοωδΔΠΔδ var3 = (ωΩμΩχδοωδΔΠΔδ)var2.attr(ωΩμΩχδοωδΔΠΔδ.c).get();
         if (var3 != null && var3.f == 0) {
            WrapperConfigClientSelectKnownPacks var4 = new WrapperConfigClientSelectKnownPacks(var1);
            User var5 = var1.getUser();
            υηηΠχΛγξ var6 = var3x -> {
               if (var3x) {
                  this.a(var5, var4);
               }
            };
            if (this.d.a(var5, var6)) {
               if (αλμΣΩτψφγζηθξψ.a(this.d).L()) {
                  Object var7 = var1.getPlayer();
                  if (var7 != null) {
                     ΨαχΨχΣλεΠψΦ var8 = αλμΣΩτψφγζηθξψ.a(this.d).b().a(var7);
                     ιηοψσγξςΩγδ var9 = αλμΣΩτψφγζηθξψ.a(this.d).a().b(var8);
                     μΦξβετδμγ var10 = αλμΣΩτψφγζηθξψ.a(this.d).c();
                     String var11 = var10.a(var8);
                     if (var11 != null) {
                        var10.a().a(var8, var9, var11);
                     }
                  }

                  var1.setCancelled((boolean)a);
               }
            } else {
               var2.attr(ωΩμΩχδοωδΔΠΔδ.c).set(null);
            }
         }
      }
   }
}
