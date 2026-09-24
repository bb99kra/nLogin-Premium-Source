package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class γντωΩλβκν {
   private static int y = (65536 >>> 176 | 65536 << -176) & -1;
   private static int m = 4 >>> 98 | 4 << -98;
   private static int u = 130560 >>> 129 | 130560 << ~129 + 1;
   private static int n = Integer.reverse(0);
   private static int e = (4 >>> 2 | 4 << ~2 + 1) & -1;
   private static int f = Integer.reverse(-1);
   private final int ad;
   private static int a = Integer.reverse(0);
   private static long ag = Long.reverse(-7608842141633908653L);
   private final InetAddress a;
   private static int ab = 1280 >>> 136 | 1280 << ~136 + 1;
   private final boolean ap;
   private static String[] b = new String[γντωΩλβκν.ac];
   private static int aa = 32 >>> 101 | 32 << ~101 + 1;
   private static int j = (0 >>> 92 | 0 << ~92 + 1) & -1;
   private final int ae;
   private static long ah = Long.reverse(4611686018427387904L);
   private static int r = -1 >>> 139 | -1 << -139;
   private static int x = Integer.reverse(0);
   private static int g = (4194304 >>> 117 | 4194304 << ~117 + 1) & -1;
   private static long q = Long.reverse(4611686018427387904L);
   private static int l = 65536 >>> 169 | 65536 << -169;
   private static int s = Integer.reverse(268435456);
   private static int al = Integer.reverse(-1);
   private static int h = '耀' >>> 'j' | 32768 << -106;
   private static long am = Long.reverse(-2997156123206520749L);
   private static int c = Integer.reverse(1073741824);
   public static final γντωΩλβκν b;
   private static String[] a = new String[ab];
   private static int w = Integer.reverse(0);
   private static int t = Integer.reverse(0);
   private static int ac = Integer.reverse(-1610612736);
   private static long aj = Long.reverse(-2997156123206520749L);
   public static final γντωΩλβκν c;
   private static long c;
   private static int af = Integer.reverse(1073741824);
   private static int ai = (-2147483647 >>> 159 | -2147483647 << ~159 + 1) & -1;
   private static int i = 4096 >>> 172 | 4096 << -172;
   private static int o = Integer.reverse(Integer.MIN_VALUE);
   private static int z = (0 >>> 232 | 0 << ~232 + 1) & -1;
   private static long b = Long.reverse(-2997156123206520749L);
   private static int k = 1048576 >>> 19 | 1048576 << -19;
   private static int d = Integer.reverse(0);
   public static final γντωΩλβκν a;
   private static int v = Integer.reverse(-536870912);
   private static long p = Long.reverse(-7608842141633908653L);
   private static int ak = Integer.reverse(536870912);

   private static String a(int var0, long var1) {
      var1 ^= 2L;
      var1 ^= -2579059339680935499L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(20 + 48),
                     (byte)(27 + 42),
                     (byte)(73 + 10),
                     (byte)(3 + 44),
                     67,
                     (byte)(46 + 20),
                     (byte)(25 + 42),
                     (byte)(30 + 17),
                     (byte)(12 + 68),
                     (byte)(7 + 68),
                     (byte)(62 + 5),
                     (byte)(72 + 11),
                     53,
                     (byte)(70 + 10),
                     (byte)(76 + 21),
                     (byte)(67 + 33),
                     (byte)(15 + 85),
                     (byte)(86 + 19),
                     (byte)(57 + 53),
                     (byte)(49 + 54)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(59 + 9), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(θεωψξβΛσσ.F("ֆ֓֒Օ֑֕\u058c֕֠֏՜֚֚֞֗֠բࣲࣺࣧऀࣹ࣡ࣴ࣬ࣵ", (byte)103, 70));
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

   public γντωΩλβκν(String var1) {
      String[] var2 = var1.split(c<"㺀">(a, b));
      String var3;
      if (var2.length == c) {
         var3 = var2[d];
         this.ad = Integer.parseInt(var2[e]);
      } else {
         var3 = var1;
         this.ad = f;
      }

      this.a = InetAddress.getByName(var3);
      if (this.a instanceof Inet4Address) {
         this.ap = (boolean)(var2.length == g && this.ad != h ? j : i);
      } else {
         if (!(this.a instanceof Inet6Address)) {
            throw new IllegalArgumentException(c<"㺃">(o, p ^ q) + this.a.getClass().getCanonicalName());
         }

         this.ap = (boolean)(var2.length == k && this.ad != l ? n : m);
      }

      this.ae = this.ap ? r : this.ad / s;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  γντωΩλβκν.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨΦνΨΦωυΩνβςμ.D("ϸКМϼРпзэйЈцмъфЍвєѓыёыР", (byte)9, 68), γντωΩλβκν.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(βθκςνθΩθυμςτκχ.C("грпЂтойтэмЉчыфчэЏޔޟާޭގޡޙޢަФ", (byte)9, 67) + var1 + μεςΩΔΣγν.A("Ë", (byte)9, 65) + var2.toString(), var4);
      }
   }

   public boolean b(InetAddress var1) {
      if (!this.a.getClass().equals(var1.getClass())) {
         return (boolean)t;
      } else if (this.ap) {
         return var1.equals(this.a);
      } else {
         byte[] var2 = var1.getAddress();
         byte[] var3 = this.a.getAddress();
         byte var4 = (byte)(u >> (this.ad & v));

         for (int var5 = w; var5 < this.ae; var5++) {
            if (var2.length < var5 || var3.length < var5 || var2[var5] != var3[var5]) {
               return (boolean)x;
            }
         }

         if (var4 != 0) {
            return (boolean)((var2[this.ae] & var4) == (var3[this.ae] & var4) ? y : z);
         } else {
            return (boolean)aa;
         }
      }
   }

   static {
      b();

      try {
         a = new γντωΩλβκν(c<"㺀">(af, ag ^ ah));
         b = new γντωΩλβκν(c<"㺃">(ai, aj));
         c = new γντωΩλβκν(c<"㺆">(ak & al, am));
      } catch (UnknownHostException var1) {
         throw new RuntimeException(var1);
      }
   }

   private static void b() {
      c = -3886949743910197655L;
      long var0 = c ^ -2579059339680935499L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(63 + 6),
               (byte)(14 + 69),
               47,
               (byte)(21 + 46),
               (byte)(54 + 12),
               (byte)(60 + 7),
               (byte)(43 + 4),
               80,
               (byte)(47 + 28),
               (byte)(44 + 23),
               (byte)(39 + 44),
               (byte)(39 + 14),
               (byte)(54 + 26),
               (byte)(53 + 44),
               (byte)(46 + 54),
               (byte)(5 + 95),
               (byte)(90 + 15),
               (byte)(13 + 97),
               (byte)(34 + 69)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(13 + 56), (byte)(39 + 44)}, StandardCharsets.UTF_8));
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
               b[0] = ζοηκορΦνΣθγΩ.A("ƿƠǁƽƞƜƔƸƼƝƶƑ", (byte)101, 65);
               b[1] = πηγμΣΔκκ.E("֎գֆֆը֛֒՟րչդ֙ա֒։օե\u058b֟թռ֑֧֘կլֲ֝֬֒֫\u0590ְօօ֘\u058c\u058b֢֤֜֘־։", (byte)101, 69);
               b[2] = ΨφιωσρΓδΔθ.D("ՈՊԪԟԞԽԳԞԛԲԻԢԵԲՇէՌԮ՟ՍՇՊԷԸ", (byte)101, 68);
               b[3] = ςπυηννναΣ.B("ƂǄƱǀƮŽƻƗƺƧƛǀǈƬƪƜǐƑǁƬƕǅƜƝ", (byte)101, 66);
               b[4] = δΛψπξκσβγςα.F("օռծՖչՑ֝֠կՠ֥֝հ֒֞տ֗֝֡զւ֝մյ", (byte)101, 70);
               break;
            case 1:
               b[0] = βεξΠθρρςΔΦμ.A("ƍžǂƞƟƥƶƈƶƝƶƑ", (byte)101, 65);
               b[1] = λΣΩσμφγχ.A("ƶƋƮƮƐƺǃƇƨơƌǁƉƺƱƭƍƳǇƑƤǀƹǏƗƔǅǔƺǓǚƸƵǤƿƿƱǏǧƟǔƢǚƱ", (byte)101, 65);
               b[2] = ξψθρΣΠΣς.E("օևէ՜՛պհ՛\u0558կջ֓֗֝ֆռ֢պգ֧և֭մյ", (byte)101, 69);
               b[3] = βθκςνθΩθυμςτκχ.D("ԝ՟Ռ՛ՉԘՖԲՕՂԳՀՑԡԹԢԹԹՀՂխխՋՋ\u0530ՐՏծՍՖէթ", (byte)101, 68);
               b[4] = ιΠοθΩΦξκ.E("օռծՖչՑ֝֠կՠ֚փֆ֦֜֩ր֔ֆ֢֎֟ի֢հ֝֜իֈֹ֓շ", (byte)101, 69);
               break;
            case 2:
               b[0] = ΦδφπθΩΩλζξ.A("ƙƏƐƮƞǃǄƛƸƢƻƪƘƣƯǉǏǇƬƾǕƎǈƧƧƫǓƜƨƱƠƵ", (byte)101, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = θεωψξβΛσσ.D("ՒԜՠՋԙԮԴՐԻԿԽՀժԤԷ՚ԼՄԸբԺհԷԸ", (byte)101, 68);
         }
      }
   }
}
