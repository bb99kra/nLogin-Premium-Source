package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;

public class NLoginCore_032 implements NLoginInterface_033 {
   private static long b = Long.reverse(-8964563583952790989L);
   private final Constructor<?> b;
   private static int k = 65536 >>> 16 | 65536 << ~16 + 1;
   private static int ad = Integer.reverse(536870912);
   private static String[] a = new String[NLoginCore_032.aj];
   private static int ag = Integer.reverse(-1610612736);
   private static int aa = Integer.reverse(536870912);
   private static int y = Integer.reverse(1073741824);
   private static int p = Integer.reverse(1073741824);
   private final Method e;
   private static long m = Long.reverse(-4179340454199820288L);
   private static int j = Integer.reverse(536870912);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static long ah = Long.reverse(-8964563583952790989L);
   private static int s = (3145728 >>> 212 | 3145728 << -212) & -1;
   private static long af = Long.reverse(5014609659405228595L);
   private static int aj = (98304 >>> 142 | 98304 << -142) & -1;
   private static int i = 786432 >>> 242 | 786432 << -242;
   private static int x = 8192 >>> 77 | 8192 << ~77 + 1;
   private static int q = Integer.reverse(-1);
   private static long r = Long.reverse(5014609659405228595L);
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static int z = Integer.reverse(-1073741824);
   private static int ae = (-1 >>> 11 | -1 << -11) & -1;
   private static long l = Long.reverse(-8964563583952790989L);
   private static int v = (327680 >>> 176 | 327680 << ~176 + 1) & -1;
   private static int o = Integer.reverse(0);
   private static long ai = Long.reverse(-4179340454199820288L);
   private static int ak = Integer.reverse(1610612736);
   private static int n = Integer.reverse(Integer.MIN_VALUE);
   private static int w = (0 >>> 8 | 0 << ~8 + 1) & -1;
   private static int f = Integer.reverse(0);
   private static int ac = 0 >>> 24 | 0 << -24;
   private static int t = Integer.reverse(-1);
   private static long u = Long.reverse(5014609659405228595L);
   private static int a = Integer.reverse(0);
   private static int e = (5242880 >>> 116 | 5242880 << -116) & -1;
   private static int h = (1024 >>> 169 | 1024 << ~169 + 1) & -1;
   private static long c;
   private static long d = Long.reverse(-4179340454199820288L);
   private static String[] b = new String[ak];

   private static String a(int var0, long var1) {
      var1 ^= 99L;
      var1 ^= -639599704231149394L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(62 + 6),
                     (byte)(19 + 50),
                     (byte)(82 + 1),
                     47,
                     (byte)(63 + 4),
                     (byte)(60 + 6),
                     (byte)(62 + 5),
                     (byte)(41 + 6),
                     (byte)(7 + 73),
                     (byte)(48 + 27),
                     (byte)(3 + 64),
                     (byte)(14 + 69),
                     (byte)(20 + 33),
                     (byte)(6 + 74),
                     (byte)(71 + 26),
                     (byte)(54 + 46),
                     (byte)(58 + 42),
                     (byte)(18 + 87),
                     110,
                     (byte)(22 + 81)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, (byte)(62 + 21)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.A("ê÷ö¹ùõðùĄóÀþĂûþĄÆљѕќѢтяћѓљѕшѣ", (byte)4, 65));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_032.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_092.F("ՂդզՆժ։ց֗փՒ\u0590ֆ֔֎\u0557ռ֛֞֝֕֕ժ", (byte)94, 70), NLoginCore_032.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.C("ԲԿԾԁՁԽԸՁՌԻԈՆՊՃՆՌԎࢡ࢝ࢤࢪࢊ\u0897ࢣ࢛ࢡ࢝\u0890ࢫԦ", (byte)94, 67) + var1 + NLoginCore_559.C("ԉ", (byte)94, 67) + var2.toString(), var4
         );
      }
   }

   @Override
   public void a(Player var1, String var2, String var3, int var4, int var5, int var6) {
      if (var2.isEmpty() && var3.isEmpty()) {
         this.a(var1);
      } else {
         if (var2.isEmpty()) {
            var2 = a(p & q, r);
         }

         if (var3.isEmpty()) {
            var3 = a(s & t, u);
         }

         try {
            Constructor var10000 = this.b;
            Object[] var10001 = new Object[v];
            var10001[w] = var2;
            var10001[x] = var3;
            var10001[y] = var4;
            var10001[z] = var5;
            var10001[aa] = var6;
            Object var7 = var10000.newInstance(var10001);
            Method var9 = this.e;
            Object[] var10002 = new Object[ab];
            var10002[ac] = var7;
            var9.invoke(var1, var10002);
         } catch (ReflectiveOperationException var8) {
            throw new RuntimeException(a(ad & ae, af) + var1.getName() + a(ag, ah ^ ai), var8);
         }
      }
   }

   public NLoginCore_032() {
      Class var1 = Class.forName(a(a, b ^ d));
      Class[] var10002 = new Class[e];
      var10002[f] = String.class;
      var10002[g] = String.class;
      var10002[h] = int.class;
      var10002[i] = int.class;
      var10002[j] = int.class;
      this.b = var1.getConstructor(var10002);
      String var2 = a(k, l ^ m);
      Class[] var10003 = new Class[n];
      var10003[o] = var1;
      this.e = Player.class.getMethod(var2, var10003);
   }

   static {
      b();
   }

   private static void b() {
      c = -3721406826275739199L;
      long var0 = c ^ -639599704231149394L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               69,
               (byte)(28 + 55),
               (byte)(24 + 23),
               (byte)(60 + 7),
               (byte)(41 + 25),
               (byte)(13 + 54),
               47,
               (byte)(13 + 67),
               (byte)(39 + 36),
               (byte)(63 + 4),
               (byte)(71 + 12),
               (byte)(44 + 9),
               (byte)(56 + 24),
               (byte)(59 + 38),
               (byte)(99 + 1),
               (byte)(67 + 33),
               (byte)(74 + 31),
               (byte)(26 + 84),
               (byte)(41 + 62)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, (byte)(33 + 50)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_027.D("ѮсќЪѬѭѬѦззёѨќѪіѱжѡћѠѻсѴѽѠњ҃ѺѣѸ҃҈ҀюѯѤѴ҄Ғ҆іѥёџ", (byte)22, 68);
               b[1] = NLoginCore_076.C("ЩѝмѢъэѷѸхѬѦкжнњѺёѮҀѷлѳъы", (byte)22, 67);
               b[2] = NLoginCore_092.A("÷óàÝĄèĩóĠëĎó", (byte)22, 65);
               b[3] = NLoginCore_138.A("÷óàÝĄèĩóĠëĎó", (byte)22, 65);
               b[4] = NLoginCore_127.B("ñùĚçÿāēăġĕĭèĀêīĪğĳėďĳĔøøüĝĜĻùğĵú", (byte)22, 66);
               b[5] = NLoginCore_559.C("ѦўўёѭѴѬЩѶэѸп", (byte)22, 67);
               break;
            case 1:
               b[0] = NLoginCore_559.E("ՉԜԷԅՇՈՇՁԒԒԬՃԷՅԱՌԑԼԶԻՖԜՏ\u0558ԻԵ՞ՕԾՓ՞գզՉՖՌիԻՄՀՒՇՐծկմԳպԶԵ\u0558՞՜վՅՆ", (byte)22, 69);
               b[1] = NLoginCore_091.E("ԄԸԗԽԥԨՒՓԠՇՀԎՑ\u0557ՙՊԤԖ՞՞ԶՎԥԦ", (byte)22, 69);
               b[2] = NLoginCore_553.F("ӽՄԧԚԣԛԯՂԲԽԐԚ", (byte)22, 70);
               b[3] = NLoginCore_387.C("ЬЬшєгѰіѤјѹѬп", (byte)22, 67);
               b[4] = NLoginCore_324.D("нхѦгыэџяѭѡѹдьжѷѶѫѿѣћѿѮхѳ҄҈Ѿѿ҄ѧҌѪ҈ҀѺѱъҌѥяҎѦѮџ", (byte)22, 68);
               b[5] = NLoginCore_173.B("ÖĖĠúĜĖĘôīçĂó", (byte)22, 66);
               break;
            case 2:
               b[0] = NLoginCore_223.C("уоѓрѤѰѳѳчЫђп", (byte)22, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_521.F("ԹՍԖԿԘԐԊԬՅՇԔԞԱՂԖԒԥԽԺՈԻԸԥԦ", (byte)22, 70);
         }
      }
   }

   @Override
   public void a(Player var1) {
      var1.resetTitle();
   }
}
