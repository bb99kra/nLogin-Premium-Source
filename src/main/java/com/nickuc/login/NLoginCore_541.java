package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;

public class NLoginCore_541 implements NLoginInterface_024 {
   private static final TextComponent a = Component.text(a(NLoginCore_541.x, NLoginCore_541.y ^ NLoginCore_541.z));
   private static long c;
   private static int u = Integer.reverse(0);
   private final NLoginCore_509 a;
   private static int s = (0 >>> 114 | 0 << -114) & -1;
   private static int w = Integer.reverse(-1610612736);
   private static int m = Integer.reverse(1073741824);
   private static int q = -1 >>> 244 | -1 << ~244 + 1;
   private static int a = (4 >>> 34 | 4 << ~34 + 1) & -1;
   private static String[] a = new String[NLoginCore_541.v];
   private static int b = Integer.reverse(0);
   private static int g = (0 >>> 231 | 0 << -231) & -1;
   private static int t = (0 >>> 215 | 0 << -215) & -1;
   private static int j = (16 >>> 68 | 16 << -68) & -1;
   private static int d = (394264576 >>> 247 | 394264576 << -247) & -1;
   private static long l = Long.reverse(2817017081202121127L);
   private final NLoginCore_277 b;
   private static String[] b = new String[w];
   private static long z = Long.reverse(-5188146770730811392L);
   private static long y = Long.reverse(-6982815707956078169L);
   private static long r = Long.reverse(2817017081202121127L);
   private static long n = Long.reverse(-6982815707956078169L);
   private static int f = Integer.reverse(1073741824);
   private final NLoginCore_581 a;
   private static int e = Integer.reverse(-201326592);
   private static int v = (655360 >>> 145 | 655360 << -145) & -1;
   private static long h = Long.reverse(-6982815707956078169L);
   private static long o = Long.reverse(-5188146770730811392L);
   private static int k = Integer.reverse(-1);
   private static long i = Long.reverse(-5188146770730811392L);
   private static int x = Integer.reverse(536870912);
   private static int p = Integer.reverse(-1073741824);
   private static int c = Integer.reverse(0);

   private TextComponent a(String var1, boolean var2) {
      return NLoginCore_529.b(var1, var2);
   }

   @Generated
   NLoginCore_541(NLoginCore_277 var1, NLoginCore_509 var2, NLoginCore_581 var3) {
      this.b = var1;
      this.a = var2;
      this.a = var3;
   }

   @Override
   public NLoginCore_277 a() {
      return this.b;
   }

   static {
      b();
   }

   @Override
   public void a(String var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @Nullable String var5) {
      Object var6 = this.a(var1, (boolean)a);
      if (var2 != null) {
         var6 = var6.hoverEvent(HoverEvent.showText(this.a(var2, (boolean)b)));
      }

      if (var3 != null) {
         var6 = var6.clickEvent(ClickEvent.suggestCommand(NLoginCore_065.m(var3)));
      } else if (var4 != null) {
         var4 = NLoginCore_065.m(var4);
         if (!var4.isEmpty()) {
            char var7 = var4.charAt(c);
            if (var7 != d) {
               var4 = e + var4;
            }

            var6 = var6.clickEvent(ClickEvent.runCommand(var4));
         }
      } else if (var5 != null) {
         var6 = var6.clickEvent(ClickEvent.openUrl(NLoginCore_065.m(var5)));
      }

      this.a.a(this.b, (Component)var6);
   }

   private static String a(int var0, long var1) {
      var1 ^= 29L;
      var1 ^= -1039051748493596194L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(55 + 13),
                     69,
                     (byte)(27 + 56),
                     (byte)(43 + 4),
                     (byte)(34 + 33),
                     (byte)(36 + 30),
                     (byte)(59 + 8),
                     (byte)(36 + 11),
                     (byte)(12 + 68),
                     (byte)(49 + 26),
                     (byte)(60 + 7),
                     (byte)(51 + 32),
                     (byte)(47 + 6),
                     (byte)(46 + 34),
                     (byte)(32 + 65),
                     100,
                     (byte)(76 + 24),
                     (byte)(49 + 56),
                     (byte)(36 + 74),
                     (byte)(58 + 45)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(52 + 16), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_091.D("ԬԹԸӻԻԷԲԻՆԵԂՀՄԽՀՆԈࡺࢠ\u0896\u088fࢢ\u0893\u0896࢙", (byte)92, 68));
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

   @Override
   public void a(int var1, GUIButtonContainer[] var2) {
      if (var2.length != 0) {
         if (var2.length > f) {
            throw new IllegalArgumentException(a(g, h ^ i) + var2.length);
         } else {
            TextComponent var3 = Component.text(a(j & k, l));
            String var4 = a(m, n ^ o) + var1 + a(p & q, r);

            for (int var5 = s; var5 < var2.length; var5++) {
               if (var5 > 0) {
                  var3 = (TextComponent)((TextComponent)((TextComponent)var3.append(a)).append(a)).append(a);
               }

               GUIButtonContainer var6 = var2[var5];
               NLoginCore_190 var7 = var6.a();
               Component var8 = this.a(var7.ar(), (boolean)t).clickEvent(ClickEvent.runCommand(var4 + var6.a().v()));
               String var9 = var7.as();
               if (var9 != null) {
                  var8 = var8.hoverEvent(HoverEvent.showText(this.a(var9, (boolean)u)));
               }

               var3 = (TextComponent)var3.append(var8);
            }

            try {
               var3 = (TextComponent)var3.appendNewline();
            } catch (NoSuchMethodError var10) {
               var3 = (TextComponent)var3.append(Component.newline());
            }

            this.a.a(this.b, var3);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_541.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_110.D("ҔҶҸҘҼӛӓөӕҤӢӘӦӠҩӎӰӯӧӭӧҼ", (byte)61, 68), NLoginCore_541.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_453.D("ӏӜӛҞӞӚӕӞөӘҥӣӧӠӣөҫࠝࡃ࠹࠲ࡅ࠶࠹࠼ҿ", (byte)61, 68) + var1 + NLoginCore_324.A("ĳ", (byte)61, 65) + var2.toString(), var4);
      }
   }

   @Override
   public void c(String var1, String var2) {
      this.d(var1, null, var2);
   }

   private static void b() {
      c = -1902415922699691783L;
      long var0 = c ^ -1039051748493596194L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(47 + 21),
               (byte)(68 + 1),
               (byte)(75 + 8),
               (byte)(41 + 6),
               (byte)(23 + 44),
               (byte)(10 + 56),
               (byte)(9 + 58),
               (byte)(3 + 44),
               (byte)(79 + 1),
               75,
               (byte)(36 + 31),
               (byte)(31 + 52),
               (byte)(26 + 27),
               (byte)(27 + 53),
               (byte)(27 + 70),
               (byte)(26 + 74),
               (byte)(90 + 10),
               (byte)(79 + 26),
               110,
               (byte)(5 + 98)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(55 + 13), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_223.C("ՏԯՐԘ\u0530ՔԨդԣ՟ՙ\u0558ՐԮՐկՂմըՃզԸՏԶմԶյԸՇ\u0557՜Ս", (byte)103, 67);
               b[1] = NLoginCore_232.D("ՌՎԜԱզՐԛԦԾ՞ՁԲ", (byte)103, 68);
               b[2] = NLoginCore_127.B("żƳƜƒƾǈǇƹƯǊƩǋƫƍǍƑƷƗǘƮǖƒƯƮƔǒǟǋƱǠƬǢƢƵǁƺƽǌǚǪƬǆǦƵ", (byte)103, 66);
               b[3] = NLoginCore_575.B("ƹƥƟƹƽƾƻƃƜƩƋƕ", (byte)103, 66);
               b[4] = NLoginCore_232.A("ƯƱſƔǉƳžƉơǁƤƕ", (byte)103, 65);
               break;
            case 1:
               b[0] = NLoginCore_091.F("ֈը։Ցթ֍ա֝՜֑֘֒։է։֨ջ֭֡ռ֟լփ֬֏տ֦֗֠ո֩\u058b", (byte)103, 70);
               b[1] = NLoginCore_530.C("ՎԳԸ\u0558ԱէՅՊԳԢՍԲ", (byte)103, 67);
               b[2] = NLoginCore_471.D("ԙՐԹԯ՛եդՖՌէՆըՈԪժԮՔԴյՋճԯՌՋԱկռըՎսՉտիցճձսվֆճդցՈՒ", (byte)103, 68);
               b[3] = NLoginCore_521.D("ՐԟԢ\u0557ԵՠԲԡ\u0557ԹգԲ", (byte)103, 68);
               b[4] = NLoginCore_530.D("ԸՅԿԱԴդՊՙԨէՉԲ", (byte)103, 68);
               break;
            case 2:
               b[0] = NLoginCore_433.E("է֍֕ո֚֞ս֚֗՟֣ափ֥թ֛֫ս֥֢֟կդևհլյ֫֩ց֘֘", (byte)103, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_324.C("ՐՎ\u0558Թ՞Ք\u0558ԧԩՈգԲ", (byte)103, 67);
         }
      }
   }
}
