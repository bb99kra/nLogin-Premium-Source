package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.exception.InvalidHandshakeException;
import com.nickuc.login.lib.packetevents.api.wrapper.handshaking.client.WrapperHandshakingClientHandshake;
import com.nickuc.login.lib.packetevents.impl.util.SpigotReflectionUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ΣΨξξΣΠΣΩτ implements θβορΛτηατθΨτΠτΦ {
   private static int f = Integer.reverse(0);
   private static long j = Long.reverse(6629298651489370112L);
   private static long c;
   private static int k = 32 >>> 5 | 32 << -5;
   private static int b = Integer.reverse(-1);
   private static int g = (262144 >>> 82 | 262144 << -82) & -1;
   private static String[] a = new String[k];
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int e = (736 >>> 196 | 736 << -196) & -1;
   private static int c = (0 >>> 81 | 0 << ~81 + 1) & -1;
   private static int a = Integer.reverse(0);
   private static int d = Integer.reverse(Integer.MIN_VALUE);
   private static int h = Integer.reverse(0);
   private static String[] b = new String[l];
   private static long i = Long.reverse(8342817736012217178L);

   private static String z(String var0) {
      String var1 = var0;
      int var2 = var0.indexOf(a);
      if (var2 > b) {
         var1 = var0.substring(c, var2);
      }

      if (!var1.isEmpty() && var1.charAt(var1.length() - d) == e) {
         var1 = var1.substring(f, var1.length() - g);
      }

      return var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΣΨξξΣΠΣΩτ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(θεωψξβΛσσ.C("ӄӦӨӈӬԋԃԙԅӔԒԈԖԐәӾԠԟԗԝԗӬ", (byte)77, 67), ΣΨξξΣΠΣΩτ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(ιΠοθΩΦξκ.A("żƉƈŋƋƇƂƋƖƅŒƐƔƍƐƖŘӍӓӪӫӑӏӓӚӶŭ", (byte)77, 65) + var1 + βεξΠθρρςΔΦμ.B("œ", (byte)77, 66) + var2.toString(), var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 58L;
      var1 ^= 3201205524715572492L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(55 + 13),
                     (byte)(7 + 62),
                     (byte)(76 + 7),
                     (byte)(45 + 2),
                     (byte)(18 + 49),
                     (byte)(63 + 3),
                     (byte)(43 + 24),
                     (byte)(16 + 31),
                     80,
                     (byte)(5 + 70),
                     (byte)(56 + 11),
                     (byte)(72 + 11),
                     (byte)(27 + 26),
                     (byte)(8 + 72),
                     (byte)(41 + 56),
                     (byte)(52 + 48),
                     (byte)(38 + 62),
                     (byte)(101 + 4),
                     110,
                     (byte)(93 + 10)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(48 + 35)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(χφπρψπφΦθμπ.B("ǊǗǖƙǙǕǐǙǤǓƠǞǢǛǞǤƦԛԡԸԹԟԝԡԨՄ", (byte)116, 66));
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
      c = 6547225858919490510L;
      long var0 = c ^ 3201205524715572492L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(25 + 43),
               (byte)(43 + 26),
               (byte)(82 + 1),
               (byte)(28 + 19),
               (byte)(24 + 43),
               (byte)(52 + 14),
               (byte)(65 + 2),
               (byte)(29 + 18),
               (byte)(2 + 78),
               (byte)(53 + 22),
               (byte)(27 + 40),
               (byte)(31 + 52),
               (byte)(46 + 7),
               (byte)(57 + 23),
               (byte)(36 + 61),
               (byte)(87 + 13),
               100,
               (byte)(32 + 73),
               (byte)(103 + 7),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(68 + 15)}, StandardCharsets.UTF_8));
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
               b[0] = ΣδτΠνεγοΓορητ.F("ՐԪԙ\u0558ԥՎ՟՛ԯ\u0558ԚՒԤՃՂԠՖԟ\u0557՛Չ՛ՌՂԨՆՎՏդՑՅշՏՈիճԳՏԼլճսովրքգշմթն\u0558նՕՒՓ", (byte)35, 70);
               break;
            case 1:
               b[0] = πηγμΣΔκκ.C("ҏѩјҗѤҍҞҚѮҗљґѣ҂ҁџҕўҖҚ҈Қҋҁѧ҅ҍҎңҐ҄ҶҎ҇ҪҲѲҎѻҫҲҼҸҭҋҀ҅ҜҲҷҳӀ҂ҔґҒ", (byte)35, 67);
               break;
            case 2:
               b[0] = δΛψπξκσβγςα.C("҇ѦѨ҉Ҝ҆ҎҍҒҙҒҚ҂ѾѡҦҡѤ҆ҔѷѦ҂ҀҌѬ҉ѾҴҢѫҍ", (byte)35, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = ιΠοθΩΦξκ.B("ĔđĹīùėłĤĄăĶŇňĬėļĠĦČăŋŁĘę", (byte)35, 66);
         }
      }
   }

   private static Object a(Channel var0) {
      for (Entry var2 : var0.pipeline()) {
         if (SpigotReflectionUtil.NETWORK_MANAGER_CLASS.isAssignableFrom(((ChannelHandler)var2.getValue()).getClass())) {
            return var2.getValue();
         }
      }

      throw new IllegalArgumentException(c<"㺀">(h, i ^ j) + var0);
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      WrapperHandshakingClientHandshake var2;
      try {
         var2 = new WrapperHandshakingClientHandshake(var1);
      } catch (InvalidHandshakeException var4) {
         return;
      }

      Channel var3 = (Channel)var1.getChannel();
      var3.attr(ΣπβςζρμθΔπφψοωφ.d).set(new ΣπβςζρμθΔπφψοωφ(var2.getProtocolVersion(), z(var2.getServerAddress()), a(var3)));
   }
}
