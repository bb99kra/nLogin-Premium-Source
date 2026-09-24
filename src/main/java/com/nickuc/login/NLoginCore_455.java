package com.nickuc.login;

import com.nickuc.login.loader.LoaderBootstrap;
import com.nickuc.login.loader.platform.VelocityLoader;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class NLoginCore_455 implements LoaderBootstrap, NLoginInterface_015, NLoginInterface_011<VelocityLoader> {
   private static int e = Integer.reverse(0);
   private static int i = 0 >>> 181 | 0 << ~181 + 1;
   private static int s = Integer.reverse(-1073741824);
   private static long p = Long.reverse(3519352953317866042L);
   private final VelocityLoader a;
   private static int o = 4 >>> 225 | 4 << -225;
   final NLoginCore_572 c;
   private static int g = Integer.reverse(Integer.MIN_VALUE);
   private static String[] a = new String[NLoginCore_455.r];
   private static String[] b = new String[s];
   private static long q = Long.reverse(-4467570830351532032L);
   private static int c = 0 >>> 163 | 0 << ~163 + 1;
   private static int f = Integer.reverse(0);
   private static int h = (67108864 >>> 26 | 67108864 << ~26 + 1) & -1;
   private static int b = Integer.reverse(0);
   private static long n = Long.reverse(-4467570830351532032L);
   private static long c;
   private final NLoginCore_516 a;
   private final NLoginInterface_020 c;
   private static int d = (Integer.MIN_VALUE >>> 63 | Integer.MIN_VALUE << -63) & -1;
   private static long j = Long.reverse(3519352953317866042L);
   private static long k = Long.reverse(-4467570830351532032L);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int r = 6291456 >>> 117 | 6291456 << ~117 + 1;
   private boolean Q;
   private static long m = Long.reverse(3519352953317866042L);
   private static int l = Integer.reverse(Integer.MIN_VALUE);

   protected void i() {
      if (this.c.am()) {
         this.c.<NLoginCore_100>a().i();
      }
   }

   protected abstract NLoginInterface_034[] a();

   @Override
   public void c() {
      this.Q = (boolean)c;
   }

   @Override
   public boolean N() {
      return this.Q;
   }

   protected void j() {
      if (this.c.am()) {
         this.c.<NLoginCore_100>a().j();
      }
   }

   @Override
   public Object a(int var1) {
      switch (var1) {
         case 0:
            Collection var2 = this.a().getAllServers();
            if (var2 != null && !var2.isEmpty()) {
               StringBuilder var3 = new StringBuilder();

               for (RegisteredServer var5 : var2) {
                  InetSocketAddress var6 = var5.getServerInfo().getAddress();
                  String var7;
                  int var8;
                  if (!var6.isUnresolved()) {
                     InetAddress var9 = var6.getAddress();
                     var8 = !var9.isLoopbackAddress() && !var9.isAnyLocalAddress() && !NLoginCore_071.a.b(var9) && !NLoginCore_071.b.b(var9) && !NLoginCore_071.c.b(var9)
                        ? e
                        : d;
                     var7 = var9.getHostAddress();
                  } else {
                     var8 = f;
                     var7 = var6.getHostName();
                     if (var7 == null) {
                        var8 = g;
                     } else {
                        try {
                           var7 = InetAddress.getByName(var7).getHostAddress();
                        } catch (UnknownHostException var10) {
                           var8 = h;
                        }
                     }
                  }

                  if (var3.length() > 0) {
                     var3.append(a(i, j ^ k));
                  }

                  if (var8 != 0) {
                     var3.append(a(l, m ^ n));
                  } else {
                     var3.append(var7);
                  }

                  var3.append(a(o, p ^ q));
                  var3.append(var6.getPort());
               }

               return var3.toString();
            }
         default:
            return null;
         case 1:
            return this.a().getBoundAddress().getPort();
      }
   }

   public NLoginCore_390 a() {
      return (NLoginCore_390)this.c.c();
   }

   @Override
   public String toString() {
      return this.c.toString();
   }

   public void enable() {
      this.c.av();
   }

   public void load() {
      this.Q = (boolean)a;
      this.c.au();
   }

   public void disable() {
      this.c.aw();
      this.Q = (boolean)b;
   }

   public NLoginCore_386 a(boolean var1) {
      return (NLoginCore_386)this.c.b(var1);
   }

   private static void b() {
      c = 6655719618394647308L;
      long var0 = c ^ 9049174501871798176L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(24 + 44),
               (byte)(47 + 22),
               (byte)(33 + 50),
               (byte)(16 + 31),
               (byte)(43 + 24),
               (byte)(34 + 32),
               (byte)(49 + 18),
               (byte)(41 + 6),
               (byte)(25 + 55),
               (byte)(67 + 8),
               67,
               (byte)(6 + 77),
               (byte)(29 + 24),
               (byte)(5 + 75),
               (byte)(57 + 40),
               (byte)(24 + 76),
               (byte)(98 + 2),
               (byte)(93 + 12),
               (byte)(23 + 87),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(76 + 7)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_384.A("šůšĩĬũūņŤŔŮĽ", (byte)59, 65);
               b[1] = NLoginCore_138.F("Ջ՚ՠըՓյՕԶՂաըԿ", (byte)59, 70);
               b[2] = NLoginCore_201.B("ŌřůŉņĳűŀŵİŲĽ", (byte)59, 66);
               break;
            case 1:
               b[0] = NLoginCore_201.C("ҕӘһӜҮӖҳӁӑӖӗҮ", (byte)59, 67);
               b[1] = NLoginCore_471.A("ŜŅŇůľūŏŧőůĪŲŰĭŅĶŲƀŭŚłƁňŉ", (byte)59, 65);
               b[2] = NLoginCore_004.F("գ՞թՑլՃՈդՉՕ՚Կ", (byte)59, 70);
               break;
            case 2:
               b[0] = NLoginCore_559.C("ҶҾӜӚӟҮӆӕӄӣҳөӡӃӝӠӞҧңұӰӢҹҺ", (byte)59, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_324.F("ՋԱճՄիմՕՒՓլՇԵսկՎՙՊԹ՟որ՝ՊՋ", (byte)59, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_455.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_453.D("ҋҭүҏҳӒӊӠӌқәӏӝӗҠӅӧӦӞӤӞҳ", (byte)58, 68), NLoginCore_455.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_521.C("ӆӓӒҕӕӑӌӕӠӏҜӚӞӗӚӠҢ࠱ࠪࠉ࠻࠭࠳ࠍ࠲࠲࠲ࠒ࠺࠹ࠪҼ", (byte)58, 67) + var1 + NLoginCore_324.B("ĭ", (byte)58, 66) + var2.toString(), var4);
      }
   }

   @Override
   public File c() {
      return this.a.getDataDirectory();
   }

   @Override
   public String s() {
      return this.a.getVersion();
   }

   public ProxyServer a() {
      return this.a.getServer();
   }

   public VelocityLoader a() {
      return this.a;
   }

   @Override
   public NLoginInterface_020 a() {
      return this.c;
   }

   protected void O() {
      if (this.c.am()) {
         this.c.<NLoginCore_100>a().O();
      }
   }

   static {
      b();
   }

   @Override
   public String q() {
      return this.c.bn;
   }

   @Override
   public NLoginInterface_026 a() {
      return this.a;
   }

   protected void T() {
      if (this.c.am()) {
         this.c.<NLoginCore_100>a().T();
      }
   }

   @Override
   public NLoginCore_572 a() {
      return this.c;
   }

   public NLoginCore_455(VelocityLoader var1, String var2, NLoginCore_422 var3) {
      this.a = var1;
      this.a = new NLoginCore_516(this);
      this.c = new NLoginCore_572(var2, var1.getVersion(), var3, this);
      this.c = new NLoginCore_152(var1.getLogger());
   }

   private static String a(int var0, long var1) {
      var1 ^= 67L;
      var1 ^= 9049174501871798176L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(36 + 32),
                     (byte)(65 + 4),
                     (byte)(77 + 6),
                     (byte)(26 + 21),
                     (byte)(34 + 33),
                     (byte)(42 + 24),
                     (byte)(4 + 63),
                     (byte)(15 + 32),
                     (byte)(18 + 62),
                     (byte)(50 + 25),
                     (byte)(16 + 51),
                     (byte)(31 + 52),
                     53,
                     (byte)(79 + 1),
                     (byte)(53 + 44),
                     (byte)(22 + 78),
                     (byte)(80 + 20),
                     (byte)(16 + 89),
                     110,
                     (byte)(64 + 39)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(61 + 8), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_201.B("ĠĭĬïįīĦįĺĩöĴĸıĴĺüҋ҄ѣҕ҇ҍѧҌҌҌѬҔғ҄", (byte)31, 66));
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
