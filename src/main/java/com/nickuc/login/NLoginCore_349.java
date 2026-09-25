package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.PacketEvents;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.item.ItemStack;
import com.nickuc.login.lib.packetevents.api.wrapper.play.server.WrapperPlayServerWindowItems;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.entity.Player;

public class NLoginCore_349 {
   private static int k = Integer.reverse(-1879048192);
   private static int l = 0 >>> 219 | 0 << -219;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static long e = Long.reverse(-830314656285576930L);
   private static int d = (0 >>> 29 | 0 << ~29 + 1) & -1;
   private static int n = 64 >>> 196 | 64 << -196;
   private static String[] ZKM_STR_A = new String[NLoginCore_349.h];
   private static final int ai = NLoginCore_349.j;
   private static int o = (94371840 >>> 85 | 94371840 << ~85 + 1) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_349.i];
   private static long f = Long.reverse(-3170534137668829184L);
   private static int m = 864 >>> 37 | 864 << ~37 + 1;
   private static final int ah = l;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static final WrapperPlayServerWindowItems a;
   private static final int ak = m;
   private static int j = 10 >>> 1 | 10 << ~1 + 1;
   private final NLoginType_008 w;
   public final NLoginCore_405 a = new NLoginCore_405(this);
   public final NLoginCore_309 a = new NLoginCore_309(this);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static final int aj = n;
   private static int p = (0 >>> 246 | 0 << ~246 + 1) & -1;
   private static int q = Integer.reverse(0);
   private static int g = 0 >>> 109 | 0 << ~109 + 1;
   private static final int al = k;
   private static long c;
   private static int i = (4 >>> 226 | 4 << -226) & -1;
   private static int b = Integer.reverse(0);

   @Generated
   public NLoginCore_349(NLoginType_008 var1) {
      this.w = var1;
   }

   private boolean az() {
      return ((!NLoginCore_477.x.ar() != 0) ? a : b);
   }

   private void a(PacketSendEvent var1, int var2) {
      if (var2 == 0) {
         Player var3 = (Player)var1.getPlayer();
         if (var3 == null || !this.w.a().b(this.w.b().a(var3))) {
            var1.setCancelled((c != 0));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 43L;
      var1 ^= -7064887898967816110L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(40 + 28),
                     (byte)(66 + 3),
                     (byte)(42 + 41),
                     47,
                     (byte)(22 + 45),
                     (byte)(6 + 60),
                     (byte)(35 + 32),
                     (byte)(38 + 9),
                     (byte)(22 + 58),
                     (byte)(66 + 9),
                     (byte)(56 + 11),
                     (byte)(9 + 74),
                     (byte)(12 + 41),
                     (byte)(11 + 69),
                     97,
                     (byte)(93 + 7),
                     (byte)(53 + 47),
                     (byte)(16 + 89),
                     (byte)(85 + 25),
                     (byte)(11 + 92)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(47 + 22), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.C("ӹԆԅӈԈԄӿԈԓԂӏԍԑԊԍԓӕࡂࡈࡲ\u086d\u086cࡢࡲࡵࡦ", (byte)75, 67));
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
      ItemStack[] var0 = new ItemStack[o];
      Arrays.fill(var0, ItemStack.EMPTY);
      a = new WrapperPlayServerWindowItems(NLoginCore_349.p, NLoginCore_349.q, Arrays.asList(var0), null);
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_349.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_027.B("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 66), NLoginCore_349.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_138.F("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗࢄࢊࢴࢯࢮࢤࢴࢷࢨԬ", (byte)28, 70) + var1 + NLoginCore_223.E("Ԓ", (byte)28, 69) + var2.toString(), var4);
      }
   }

   private static void b() {
      c = 8686372911969492527L;
      long var0 = c ^ -7064887898967816110L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(43 + 25),
               (byte)(40 + 29),
               (byte)(2 + 81),
               (byte)(44 + 3),
               (byte)(15 + 52),
               (byte)(51 + 15),
               (byte)(3 + 64),
               (byte)(28 + 19),
               (byte)(4 + 76),
               (byte)(39 + 36),
               67,
               (byte)(2 + 81),
               (byte)(24 + 29),
               (byte)(21 + 59),
               (byte)(77 + 20),
               (byte)(84 + 16),
               100,
               (byte)(52 + 53),
               (byte)(39 + 71),
               (byte)(94 + 9)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(32 + 36), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_451.E("գթռց՟ղ՛\u058bՋ\u058cՎ֒իթ֊օթ\u0590Ֆ֘՜տ֕պղ֣֞բրֈ֙շֈրպ\u0590փֲ\u058bղְֈְַոոպ֧֤֦֪֜\u0590֎ַ֖׀֏ׇ\u05c8ֹׁ֙ց", (byte)87, 69);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.A("ŽƃƖƛŹƌŵƥťƦŨƬƅƃƤƟƃƪŰƲŶƙƯƔƌƸƽżƚƢƳƑƢƚƔƪƝǌƥƌǊƢǊǑƒƒƔǁƾǀǄƶƪƨǕƲƗƻƫưǣǒǛǦƣƙǀǢƽǄǪǄǎƧǚƵ", (byte)87, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_092.D("ԑԦԁԍԧԸԴԔԄԍӺԏԒԯՁԑӹԒԱ\u0530\u0530ԐԑԼԔԔՇԉԇԥՇԝ", (byte)87, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.E("֊փՠլՂ֑՞ր՞֎ՑՎՠխբՕ\u0557֏չՖՠ֟զէ", (byte)87, 69);
         }
      }
   }

   public void a(Channel var1) {
      try {
         PacketEvents.getAPI().getProtocolManager().sendPacketSilently(var1, a);
      } catch (Exception var3) {
         NLoginCore_370.c(a(d, e ^ f), var3);
      }
   }
}
