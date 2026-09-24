package com.nickuc.login;

import com.nickuc.login.lib.hikari.HikariConfig;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class HikariConnectionPool implements NLoginCore_459 {
   private static long j = Long.reverse(3026418949592973312L);
   private static int bi = Integer.reverse(1207959552);
   private static long c;
   private static int bd = Integer.reverse(-939524096);
   private static long am = Long.reverse(-7611824465769637790L);
   private static int t = 24 >>> 162 | 24 << -162;
   private static int az = Integer.reverse(134217728);
   private static int al = Integer.reverse(-805306368);
   private static int c = (0 >>> 191 | 0 << -191) & -1;
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long d = Long.reverse(-7611824465769637790L);
   private static int aj = 1342177280 >>> 59 | 1342177280 << ~59 + 1;
   private static long ac = Long.reverse(-7611824465769637790L);
   private static int bf = 2176 >>> 71 | 2176 << ~71 + 1;
   private static int ao = (48 >>> 98 | 48 << -98) & -1;
   private static long v = Long.reverse(3026418949592973312L);
   private static int h = (1024 >>> 233 | 1024 << -233) & -1;
   private static int aw = Integer.reverse(-268435456);
   private static long ad = Long.reverse(3026418949592973312L);
   private static int q = (80 >>> 196 | 80 << ~196 + 1) & -1;
   private static long e = Long.reverse(3026418949592973312L);
   private static int k = 201326592 >>> 154 | 201326592 << -154;
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static int aq = 0 >>> 101 | 0 << -101;
   private static long m = Long.reverse(3026418949592973312L);
   private static long z = Long.reverse(-6917529027641081856L);
   private static long an = Long.reverse(3026418949592973312L);
   private static long bj = Long.reverse(-7611824465769637790L);
   private static int x = 5120 >>> 137 | 5120 << -137;
   private static long ax = Long.reverse(-7611824465769637790L);
   private static String[] a = new String[bd];
   private static long af = Long.reverse(-4873635892328376222L);
   private static long bb = Long.reverse(3026418949592973312L);
   private static long ba = Long.reverse(-7611824465769637790L);
   private static int be = 38 >>> 1 | 38 << ~1 + 1;
   private static int ae = Integer.reverse(268435456);
   private static long y = Long.reverse(8646911284551352320L);
   private static long ak = Long.reverse(-4873635892328376222L);
   private static long as = Long.reverse(-4873635892328376222L);
   private static long o = Long.reverse(-7611824465769637790L);
   private static long p = Long.reverse(3026418949592973312L);
   private static int a = (262144 >>> 18 | 262144 << -18) & -1;
   private static int ar = Integer.reverse(-1342177280);
   private static int ab = 1792 >>> 8 | 1792 << -8;
   private static long s = Long.reverse(-4873635892328376222L);
   private static long i = Long.reverse(-7611824465769637790L);
   private static int b = Integer.reverse(0);
   private static long bh = Long.reverse(3026418949592973312L);
   private final NLoginCore_459 g;
   private static long u = Long.reverse(-7611824465769637790L);
   private static long au = Long.reverse(-7611824465769637790L);
   private static int n = Integer.reverse(536870912);
   private static long ai = Long.reverse(-4873635892328376222L);
   private static long ap = Long.reverse(-4873635892328376222L);
   private static long bc = Long.reverse(8646911284551352320L);
   private static int w = Integer.reverse(1342177280);
   private static int at = Integer.reverse(1879048192);
   private static long av = Long.reverse(3026418949592973312L);
   private static long bk = Long.reverse(3026418949592973312L);
   private static int ag = Integer.reverse(-1879048192);
   private static String[] b = new String[be];
   private static int ah = Integer.reverse(-1);
   private static long bg = Long.reverse(-7611824465769637790L);
   private static long l = Long.reverse(-7611824465769637790L);
   private static int r = -1 >>> 229 | -1 << ~229 + 1;
   private static long g = Long.reverse(-4873635892328376222L);
   private static long ay = Long.reverse(3026418949592973312L);

   protected abstract String w();

   static {
      b();

      try {
         Class.forName(a(bf, bg ^ bh));
      } catch (ClassNotFoundException var1) {
         throw new RuntimeException(a(bi, bj ^ bk), var1);
      }
   }

   protected abstract String a(NLoginCore_147 var1);

   private static String a(int var0, long var1) {
      var1 ^= 84L;
      var1 ^= 4189878986798920054L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(60 + 8),
                     (byte)(42 + 27),
                     (byte)(31 + 52),
                     (byte)(12 + 35),
                     (byte)(42 + 25),
                     (byte)(28 + 38),
                     (byte)(16 + 51),
                     (byte)(37 + 10),
                     (byte)(15 + 65),
                     (byte)(73 + 2),
                     (byte)(42 + 25),
                     (byte)(7 + 76),
                     (byte)(10 + 43),
                     (byte)(78 + 2),
                     (byte)(58 + 39),
                     (byte)(30 + 70),
                     (byte)(74 + 26),
                     105,
                     110,
                     (byte)(64 + 39)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(79 + 4)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_446.B("ĈĕĔ×ėēĎėĢđÞĜĠęĜĢäѶѩѓѿѢѡ҂ѱѯѓѷҁ҉҅", (byte)19, 66));
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

   private static void b() {
      c = 5051407666605898345L;
      long var0 = c ^ 4189878986798920054L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(24 + 45),
               (byte)(56 + 27),
               (byte)(3 + 44),
               (byte)(6 + 61),
               66,
               (byte)(64 + 3),
               (byte)(9 + 38),
               (byte)(22 + 58),
               (byte)(34 + 41),
               (byte)(57 + 10),
               (byte)(34 + 49),
               (byte)(5 + 48),
               (byte)(14 + 66),
               (byte)(78 + 19),
               (byte)(49 + 51),
               (byte)(49 + 51),
               (byte)(29 + 76),
               (byte)(44 + 66),
               (byte)(70 + 33)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(37 + 31), (byte)(60 + 9), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_183.B("ÞìÅþçæÚÒĊÿĉéĈĐúÒčĕõÞÞéæç", (byte)10, 66);
               b[1] = NLoginCore_183.C("ЌНЛЉЪЮЍПАФепётјЦэјъчЛџЪанЛдЧѕеѨь", (byte)10, 67);
               b[2] = NLoginCore_530.F("ԎԐԛԬԲԭԖՆՇՁԢԔՅԄԬԶՁՎԈԄԤԬԙԚ", (byte)10, 70);
               b[3] = NLoginCore_127.F("ԋԹԶԍԒԟӽӿԑԚԈԎ", (byte)10, 70);
               b[4] = NLoginCore_530.D("зРХчэкПЭгѕшбуювгГШЬКрЬбглмОвујѨй", (byte)10, 68);
               b[5] = NLoginCore_183.B("çþďÅČåèíïáÍÛ", (byte)10, 66);
               b[6] = NLoginCore_384.D("ЉКьШРЇЫлбэгррюДзЕъоЬдяЦЧ", (byte)10, 68);
               b[7] = NLoginCore_427.C("РЌУУццЩоОШТпВЭюЗеЪЖћлйЦЧ", (byte)10, 67);
               b[8] = NLoginCore_201.C("еЧрИийбНІєѐєШФйИєэЖѠЙЯПзѠеИїѤџзыоѨѨЩѧтрѥѕєѕђЪѹѨвяѷжязщцч", (byte)10, 67);
               b[9] = NLoginCore_446.B("àÌããĆĆéþÞèâÿÒíĎ×õêÖěûùæç", (byte)10, 66);
               b[10] = NLoginCore_173.A("÷ÄéÞĊĐÚþëĄÕÍčåÌÛĝĒýñ×ÙģÿĞþĤ÷ĤĕõĥýĘęĈïĭıĠôÿĠû", (byte)10, 65);
               b[11] = NLoginCore_092.A("÷êËýĉÙïĉēâöÛ", (byte)10, 65);
               b[12] = NLoginCore_559.B("öâêèÛäüĆÊĔĎóÐęĊîÚ÷êþėùæç", (byte)10, 66);
               b[13] = NLoginCore_553.D("чОкШИЙкШЍАщВБъзфЎШЮіКмпрюяѕфсХъш", (byte)10, 68);
               b[14] = NLoginCore_451.B("ÞìÅþçæÚÒĊÿĉéĈĐúÒčĕõÞÞéæç", (byte)10, 66);
               b[15] = NLoginCore_138.F("ӷԶԒԬԑԵՃԳԧԄԒԀԝԸԽԋԸԩԻԐՉԜԙԚ", (byte)10, 70);
               b[16] = NLoginCore_553.A("ĆÿýþÊÊâóòÏĕÔćâøôüÙìċàďæç", (byte)10, 65);
               b[17] = NLoginCore_453.A("ÞÜÚëăčđĆÞï÷ďáĊëÚÖĈċÛĈÿčáďáðĖèþĔĥ", (byte)10, 65);
               b[18] = NLoginCore_530.E("ӾԕԱԎԬӺԃԥԱԡԪՂԇՀԍԄԦԼԋՓՌԾՕՀՏԣՌՏԻԤ\u0558Չ՛ԙՎԲՍԟՎ՟բ՟՜ԼԳ\u0557էՉԽԻՙԱ՝ղԹԺ", (byte)10, 69);
               break;
            case 1:
               b[0] = NLoginCore_183.F("ԑԟӸԱԚԙԍԅԽԲԾԘԃՋԘՈԹՍԾՊԮՌՕՌԬԑ\u0530՛ԓԖԚԼ", (byte)10, 70);
               b[1] = NLoginCore_004.E("ӿԐԎӼԝԡԀԒԃԗԨԲՄԵՋԙՀՋԽԺԎԊՀՊՈԔՑՅՆԹԕՇ", (byte)10, 69);
               b[2] = NLoginCore_553.B("ÛÝèùÿúãēĔĎîÿõĈěêÛĊćÖïéæç", (byte)10, 66);
               b[3] = NLoginCore_453.A("øìÚĂìÚßàñÓĈÛ", (byte)10, 65);
               b[4] = NLoginCore_092.C("зРХчэкПЭгѕшбуювгГШЬКрдЮНікнѦЦўыѝ", (byte)10, 67);
               b[5] = NLoginCore_138.A("õêÍĐØÌÑáæČâÛ", (byte)10, 65);
               b[6] = NLoginCore_446.E("ӼԍԿԛԓӺԞԮԤՀԧԫՈԵԾԋԫՋՉԞՀՒԙԚ", (byte)10, 69);
               b[7] = NLoginCore_091.A("àÌããĆĆéþÞèåāāąûĉæĕĒČĀěðãßĒĘģĥæåá", (byte)10, 65);
               b[8] = NLoginCore_446.C("еЧрИийбНІєѐєШФйИєэЖѠЙЯПзѠеИїѤџзыоѨѨЩѧтрѥѕєєцѹгзѴчѫњбѵљцч", (byte)10, 67);
               b[9] = NLoginCore_451.A("àÌããĆĆéþÞèäĕÔúûĄä÷ýúïúĘăĤöĦĝáãåë", (byte)10, 65);
               b[10] = NLoginCore_453.B("÷ÄéÞĊĐÚþëĄÕÍčåÌÛĝĒýñ×ÙģÿĞþĤ÷ĤĕõĥèĊāĭĨİđĈĒįĒû", (byte)10, 66);
               b[11] = NLoginCore_173.B("íîÜÊđëÝéĔðêÛ", (byte)10, 66);
               b[12] = NLoginCore_521.E("ԩԕԝԛԎԗԯԹӽՇԿԽԙԧՂԠՄՈԚԭԌԬԙԚ", (byte)10, 69);
               b[13] = NLoginCore_397.A("ćÞúèØÙúèÍÐĉÒÑĊ÷ĄÎèîĖÚýóîĖôēûĢĈúī", (byte)10, 65);
               b[14] = NLoginCore_232.E("ԑԟӸԱԚԙԍԅԽԲԽԊԡԃՉԄԻՇՅԣՉԐՑԾԉԲՄՑԻԼՖԺ", (byte)10, 69);
               b[15] = NLoginCore_201.F("ӷԶԒԬԑԵՃԳԧԄԔԫԛӾԷՍՍՄՊԭԢԬԙԚ", (byte)10, 70);
               b[16] = NLoginCore_092.D("цпноЊЊТгвЏєЯиюкуКюипЪЛТёѣХхѨкцои", (byte)10, 68);
               b[17] = NLoginCore_232.D("ОМКЫуэёцОЯзяСъЫКЖшыЛшпњићСѠѧѧўѝѧ", (byte)10, 68);
               b[18] = NLoginCore_092.D("ЋТоЛйЇАвоЮзяДэКБгщИѠљыѢэќаљќшбѥіѨЦћпњЬћѬѯѬѨьѳѕаейѝнкиљцч", (byte)10, 68);
               break;
            case 2:
               b[0] = NLoginCore_091.B("çÞÞÝĆûČĎĔÿíð×ô÷÷ýėėėĒďæç", (byte)10, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_091.E("ӺԿԀԖԳԂՂԑԇԧԟԀԴԥԸԈԙԢԞՐ\u0530ԜԙԚ", (byte)10, 69);
         }
      }
   }

   protected abstract void a(HikariConfig var1, NLoginCore_147 var2);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  HikariConnectionPool.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.A("ÃåçÇëĊĂĘĄÓđćĕďØýğĞĖĜĖë", (byte)14, 65), HikariConnectionPool.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_324.A("þċĊÍčĉĄčĘćÔĒĖďĒĘÚѬџщѵјїѸѧѥщѭѷѿѻô", (byte)14, 65) + var1 + NLoginCore_427.F("Ԅ", (byte)14, 70) + var2.toString(), var4);
      }
   }

   protected HikariConnectionPool(NLoginCore_036 var1, NLoginInterface_011<?> var2, NLoginCore_147 var3, @Nullable Consumer<HikariConfig> var4, NLoginCore_536 var5) {
      NLoginCore_583 var10000 = var2.a();
      NLoginInterface_034[] var10001 = new NLoginInterface_034[a];
      var10001[b] = var1.a();
      if (!var10000.a(var10001)) {
         throw new RuntimeException(a(c, d ^ e) + var1.v() + a(f, g));
      } else {
         Properties var6 = var3.a();
         var6.putIfAbsent(a(h, i ^ j), a(k, l ^ m));
         var6.putIfAbsent(a(n, o ^ p), a(q & r, s));
         switch (var5) {
            case a:
               HikariConfig var12 = new HikariConfig();
               var12.setPoolName(var2.q().toLowerCase(Locale.ENGLISH) + a(t, u ^ v));
               this.a(var12, var3);
               var12.setMaximumPoolSize(w);
               var12.setMinimumIdle(x);
               var12.setMaxLifetime(TimeUnit.MINUTES.toMillis(y));
               var12.setConnectionTimeout(TimeUnit.SECONDS.toMillis(z));
               this.a(var6, (boolean)aa);
               var12.setDataSourceProperties(var6);
               if (var4 != null) {
                  var4.accept(var12);
               }

               NLoginCore_269 var13 = new NLoginCore_269(var12);
               this.g = new NLoginCore_484(var1, var13, null);
               break;
            case b:
               ClassLoader var8 = this.getClass().getClassLoader();

               Driver var7;
               try {
                  var7 = (Driver)var8.loadClass(this.w()).newInstance();
               } catch (ClassNotFoundException var10) {
                  throw new RuntimeException(a(ab, ac ^ ad) + this.w() + a(ae, af) + var8.getClass().getCanonicalName());
               } catch (IllegalAccessException | InstantiationException var11) {
                  throw new RuntimeException(a(ag & ah, ai) + this.w() + a(aj, ak), var11);
               }

               var6.putIfAbsent(a(al, am ^ an), var3.z());
               var6.putIfAbsent(a(ao, ap), var3.j());
               this.a(var6, (boolean)aq);
               this.a(var3);
               String var9 = this.a(var3);
               this.g = new NLoginCore_197(var1, var7, var9, var6, null);
               break;
            default:
               throw new UnsupportedOperationException(a(ar, as) + var5);
         }

         this.ah();
      }
   }

   protected void ah() {
      Enumeration var1 = DriverManager.getDrivers();

      while (var1.hasMoreElements()) {
         Driver var2 = (Driver)var1.nextElement();
         if (var2.getClass().getName().equals(this.w())) {
            try {
               DriverManager.deregisterDriver(var2);
            } catch (SQLException var4) {
            }
         }
      }
   }

   @Override
   public Connection a() {
      return this.g.a();
   }

   protected void a(Properties var1, boolean var2) {
      if (var2) {
         var1.putIfAbsent(a(az, ba ^ bb), String.valueOf(TimeUnit.SECONDS.toMillis(bc)));
      }
   }

   @Override
   public NLoginCore_036 a() {
      return this.g.a();
   }

   @Override
   public void a(Connection var1) {
      this.g.a(var1);
   }

   protected void a(NLoginCore_147 var1) {
      try {
         Class.forName(this.w());
      } catch (ClassNotFoundException var3) {
         throw new RuntimeException(a(at, au ^ av) + this.a().v() + a(aw, ax ^ ay), var3);
      }
   }

   @Override
   public void c() {
      this.g.c();
   }
}
