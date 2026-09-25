package com.nickuc.login;

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

public class NLoginCore_367 extends NLoginType_032 {
   private static int dg = Integer.reverse(0);
   private static int ay = Integer.reverse(0);
   private static long e;
   private static long dj = Long.reverse(6052837899185946624L);
   private static int bx = Integer.reverse(0);
   private static int bt = (-1 >>> 188 | -1 << -188) & -1;
   private static long bh = Long.reverse(6052837899185946624L);
   private static long dq = Long.reverse(-4722916484593236763L);
   private static long bm = Long.reverse(-1552382346924407579L);
   private static int av = Integer.reverse(0);
   private static int bc = Integer.reverse(Integer.MIN_VALUE);
   private static int cm = 20 >>> 129 | 20 << ~129 + 1;
   private static int bq = (16 >>> 100 | 16 << -100) & -1;
   private static long dc = Long.reverse(6052837899185946624L);
   private static long cx = Long.reverse(6052837899185946624L);
   private static int bv = (0 >>> 61 | 0 << ~61 + 1) & -1;
   private static long cq = Long.reverse(-4722916484593236763L);
   private static int cc = 896 >>> 103 | 896 << -103;
   private static int dd = Integer.reverse(Integer.MIN_VALUE);
   private static long cj = Long.reverse(-4722916484593236763L);
   private static int be = (0 >>> 144 | 0 << -144) & -1;
   private static long var_do = Long.reverse(-1552382346924407579L);
   private static int dt = Integer.reverse(-1);
   private static int bi = (262144 >>> 49 | 262144 << ~49 + 1) & -1;
   private static int dp = Integer.reverse(1207959552);
   private static int cz = (64 >>> 230 | 64 << ~230 + 1) & -1;
   private static long cr = Long.reverse(6052837899185946624L);
   private static long cb = Long.reverse(-1552382346924407579L);
   private static int dk = (128 >>> 99 | 128 << ~99 + 1) & -1;
   private static int bf = (4096 >>> 236 | 4096 << -236) & -1;
   private static int by = (6144 >>> 43 | 6144 << ~43 + 1) & -1;
   private static int dz = (0 >>> 153 | 0 << -153) & -1;
   private static int cf = Integer.reverse(268435456);
   private static int bo = Integer.reverse(-1);
   private static int bz = 3145728 >>> 147 | 3145728 << -147;
   private static long du = Long.reverse(-1552382346924407579L);
   private static long ce = Long.reverse(-1552382346924407579L);
   private static long cu = Long.reverse(6052837899185946624L);
   private static long dl = Long.reverse(-4722916484593236763L);
   private static int ax = (65536 >>> 208 | 65536 << -208) & -1;
   private static long ct = Long.reverse(-4722916484593236763L);
   private static long di = Long.reverse(-4722916484593236763L);
   private static int co = Integer.reverse(0);
   private static int bs = 655360 >>> 17 | 655360 << ~17 + 1;
   private static long bj = Long.reverse(-4722916484593236763L);
   private static long db = Long.reverse(-4722916484593236763L);
   private static int da = (1792 >>> 231 | 1792 << ~231 + 1) & -1;
   private static long cn = Long.reverse(-1552382346924407579L);
   private static int de = 0 >>> 108 | 0 << ~108 + 1;
   private static long bu = Long.reverse(-1552382346924407579L);
   private static int aw = Integer.reverse(0);
   private static int ea = Integer.reverse(Integer.MIN_VALUE);
   private static int az = (0 >>> 74 | 0 << ~74 + 1) & -1;
   private static long dw = Long.reverse(-4722916484593236763L);
   private static int bl = Integer.reverse(-1073741824);
   private static int ds = Integer.reverse(-939524096);
   private static long ck = Long.reverse(6052837899185946624L);
   private static int dv = 160 >>> 195 | 160 << -195;
   private static long bk = Long.reverse(6052837899185946624L);
   private static int ca = Integer.reverse(-1);
   private static long bg = Long.reverse(-4722916484593236763L);
   private static int dh = (15360 >>> 10 | 15360 << ~10 + 1) & -1;
   private static int br = (0 >>> 139 | 0 << -139) & -1;
   private static int bn = Integer.reverse(536870912);
   private static int bd = (16384 >>> 238 | 16384 << -238) & -1;
   private static int df = (262144 >>> 178 | 262144 << -178) & -1;
   private static int ch = (1048576 >>> 20 | 1048576 << -20) & -1;
   private static int cd = -1 >>> 105 | -1 << ~105 + 1;
   private static int cp = Integer.reverse(-805306368);
   private static int eb = (-1610612734 >>> 221 | -1610612734 << ~221 + 1) & -1;
   private static int dy = (32 >>> 132 | 32 << -132) & -1;
   private static int ci = Integer.reverse(-1879048192);
   private static int a = 0 >>> 232 | 0 << ~232 + 1;
   private static int ec = Integer.reverse(-1476395008);
   private static long dx = Long.reverse(6052837899185946624L);
   private static long bp = Long.reverse(-1552382346924407579L);
   private static long dr = Long.reverse(6052837899185946624L);
   private static int bw = Integer.reverse(Integer.MIN_VALUE);
   private static int cl = Integer.reverse(Integer.MIN_VALUE);
   private static long dm = Long.reverse(6052837899185946624L);
   private static long ba = Long.reverse(-1552382346924407579L);
   private static int cy = (0 >>> 207 | 0 << -207) & -1;
   private static String[] ZKM_STR_B = new String[ec];
   private static int cv = 425984 >>> 47 | 425984 << ~47 + 1;
   private static long cg = Long.reverse(-1552382346924407579L);
   private static int cs = Integer.reverse(805306368);
   private static long cw = Long.reverse(-4722916484593236763L);
   private static int dn = (71303168 >>> 22 | 71303168 << ~22 + 1) & -1;
   private static String[] ZKM_STR_A = new String[eb];
   private static int bb = 0 >>> 26 | 0 << -26;

   private static List<NLoginCore_311> a(ForceRegisterConfig var0) {
      ArrayList var1 = new ArrayList();
      NLoginCore_311[] var2 = NLoginCore_311.values();
      int var3 = var2.length;

      for (int var4 = de; var4 < var3; var4++) {
         NLoginCore_311 var5 = var2[var4];
         if (var5.b(var0) != null) {
            var1.add(var5);
         }
      }

      return var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_367.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_559.A("¯ÑÓ³×öîĄð¿ýóāûÄéċĊĂĈĂ×", (byte)4, 65), NLoginCore_367.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_183.A("ê÷ö¹ùõðùĄóÀþĂûþĄÆъјѕїўуєвѨєѦћирà", (byte)4, 65) + var1 + NLoginCore_324.D("ϻ", (byte)4, 68) + var2.toString(), var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 42L;
      var1 ^= -4060219949736760146L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(63 + 5),
                     (byte)(49 + 20),
                     (byte)(54 + 29),
                     (byte)(9 + 38),
                     (byte)(12 + 55),
                     (byte)(34 + 32),
                     (byte)(10 + 57),
                     (byte)(38 + 9),
                     (byte)(47 + 33),
                     (byte)(54 + 21),
                     (byte)(36 + 31),
                     (byte)(47 + 36),
                     (byte)(14 + 39),
                     (byte)(53 + 27),
                     (byte)(57 + 40),
                     (byte)(37 + 63),
                     100,
                     (byte)(61 + 44),
                     (byte)(103 + 7),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(31 + 38), (byte)(36 + 47)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_223.E("֏֛֜՞֚֞֕֞֩֘ե֣֧֣֠֩ի࣯ࣺࣽࣼःࣹࣨࣗऍࣹऋऀࣝࣥ", (byte)112, 69));
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

   private static void b() {
      e = -6403028026020647299L;
      long var0 = e ^ -4060219949736760146L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(67 + 1),
               (byte)(57 + 12),
               (byte)(31 + 52),
               (byte)(35 + 12),
               (byte)(34 + 33),
               (byte)(59 + 7),
               (byte)(20 + 47),
               (byte)(8 + 39),
               (byte)(25 + 55),
               (byte)(16 + 59),
               (byte)(57 + 10),
               (byte)(21 + 62),
               53,
               (byte)(47 + 33),
               (byte)(23 + 74),
               (byte)(65 + 35),
               100,
               (byte)(40 + 65),
               (byte)(32 + 78),
               (byte)(19 + 84)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(40 + 29), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_521.F("Ս\u0530ՕՂԦԵԬԩՒՉ՚ԡ", (byte)29, 70);
               ZKM_STR_B[1] = NLoginCore_201.B("ĆăĳďĎóêĥĊĵĪā", (byte)29, 66);
               ZKM_STR_B[2] = NLoginCore_397.B("ĀāĪİģĢĆđĬúĦā", (byte)29, 66);
               ZKM_STR_B[3] = NLoginCore_575.D("ѵм҄јҊцѿъҌхѧє", (byte)29, 68);
               ZKM_STR_B[4] = NLoginCore_092.A("ĒĎĔĕĥĀĭāđĳĎĳĶñĕĔĜþčķĶļĜŁĽĦğĈĦĸŀŃ", (byte)29, 65);
               ZKM_STR_B[5] = NLoginCore_575.A("êħĀĦčĐñąñĆČā", (byte)29, 65);
               ZKM_STR_B[6] = NLoginCore_324.D("мќф҄Ѡѧ҄ѧщѣҍє", (byte)29, 68);
               ZKM_STR_B[7] = NLoginCore_559.C("њўћ҄сѦ҃ѷ҂ѝъє", (byte)29, 67);
               ZKM_STR_B[8] = NLoginCore_530.F("ԉԩԑՑԭԴՑԴԖ\u0530՚ԡ", (byte)29, 70);
               ZKM_STR_B[9] = NLoginCore_004.B("ćċĈıîēİĤįĊ÷ā", (byte)29, 66);
               ZKM_STR_B[10] = NLoginCore_138.D("ѦѱѠѹҁчн҅ѕцъѪ҃ѩўѣѯ҇ѦҍҁҒ҃҈ѬіѼѲѱјҒѵ", (byte)29, 68);
               ZKM_STR_B[11] = NLoginCore_451.D("т҃цѻћђѵѸҊѿҐѥѹҁҁѮѣѪѣѰ҉҈џѠ", (byte)29, 68);
               ZKM_STR_B[12] = NLoginCore_559.F("ԳԢԣԾԾԐՂ\u0530Օ՚ԓԡ", (byte)29, 70);
               ZKM_STR_B[13] = NLoginCore_201.B("ĀĥëĵćíăĪģĳĄā", (byte)29, 66);
               ZKM_STR_B[14] = NLoginCore_451.F("ԠՅԋՕԧԍԣՊՃՓԤԡ", (byte)29, 70);
               ZKM_STR_B[15] = NLoginCore_446.B("ĆăĳďĎóêĥĊĵĪā", (byte)29, 66);
               ZKM_STR_B[16] = NLoginCore_324.E("ՊՇԡՒՈՑԷԶՒԷԬՒՒ՞ԮԿՍՂՠՍՐԿԬԭ", (byte)29, 69);
               ZKM_STR_B[17] = NLoginCore_183.A("ĆăĳďĎóêĥĊĵĪā", (byte)29, 65);
               ZKM_STR_B[18] = NLoginCore_110.F("ՊՇԡՒՈՑԷԶՒԷԮԷԭՇՙՀԭԹԶԻՏՕԬԭ", (byte)29, 70);
               ZKM_STR_B[19] = NLoginCore_091.D("ѵм҄јҊцѿъҌхѧє", (byte)29, 68);
               ZKM_STR_B[20] = NLoginCore_092.D("ѥѡѧѨѸѓҀєѤ҆ѡ҆҉фѨѧѯёѠҊ҉ҏѯҔҐѹѲћѹҋғҖ", (byte)29, 68);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.C("оѓѨіцѪѺѩѪҁѧє", (byte)29, 67);
               ZKM_STR_B[1] = NLoginCore_384.E("ԒԳԢԝՕԬԣՊՄԖԛԡ", (byte)29, 69);
               ZKM_STR_B[2] = NLoginCore_110.C("ђ҃ѹуѽѧчєљѸює", (byte)29, 67);
               ZKM_STR_B[3] = NLoginCore_241.A("ăòįĒďĀħĥēĲĄā", (byte)29, 65);
               ZKM_STR_B[4] = NLoginCore_384.A("ĒĎĔĕĥĀĭāđĳĎĳĶñĕĔĜþčķĶĺĺĥļĔōĿĨĹŎđ", (byte)29, 65);
               ZKM_STR_B[5] = NLoginCore_521.E("ՄԅՎՍԏՍԥԵԤ\u0530ԥԷՎՇ\u0558ԬՑՀԯԼեՕԬԭ", (byte)29, 69);
               ZKM_STR_B[6] = NLoginCore_530.D("ќѠйфѶѼѻіҌѭѫє", (byte)29, 68);
               ZKM_STR_B[7] = NLoginCore_183.F("ԜԼԭԏՃՆ\u0557ՒՙԸԼԡ", (byte)29, 70);
               ZKM_STR_B[8] = NLoginCore_004.B("ąČĮíìĥċ÷ĄĪĲā", (byte)29, 66);
               ZKM_STR_B[9] = NLoginCore_201.F("ՎՏՏԍՅՄՌՎԳԻԸԡ", (byte)29, 70);
               ZKM_STR_B[10] = NLoginCore_453.D("ѦѱѠѹҁчн҅ѕцъѪ҃ѩўѣѯ҇ѦҍҁҒѯґѯѱѳѪҐѰҙ҂ҖңҥҦѧҖҨңѶѪ҇Ѵ", (byte)29, 68);
               ZKM_STR_B[11] = NLoginCore_127.F("ԏՐԓՈԨԟՂՅ\u0557Ռ՚ԓԭԹ՟Ծԛ\u0530ԡԺ՚եԬԭ", (byte)29, 70);
               ZKM_STR_B[12] = NLoginCore_433.B("ĀĞăĔîġĳġĘĺĪā", (byte)29, 66);
               ZKM_STR_B[13] = NLoginCore_387.F("ԳԓՀԞՁՕԸՅՄԳԓԡ", (byte)29, 70);
               ZKM_STR_B[14] = NLoginCore_471.F("ՎԠԯՓՆԸՉ՚ՋՐԸԡ", (byte)29, 70);
               ZKM_STR_B[15] = NLoginCore_521.B("ģĒĊĕôāĎĊĥīĲā", (byte)29, 66);
               ZKM_STR_B[16] = NLoginCore_004.A("ĪħāĲĨıėĖĲėĎĳĚĚûĊýĺĬûĦďČč", (byte)29, 65);
               ZKM_STR_B[17] = NLoginCore_241.E("ՌՍԝԑԕԥԖԒԫ՜\u0530ԡ", (byte)29, 69);
               ZKM_STR_B[18] = NLoginCore_004.D("ѽѺє҅ѻ҄Ѫѩ҅ѪџјџҎѓҀьѠѥ҂ѪѲџѠ", (byte)29, 68);
               ZKM_STR_B[19] = NLoginCore_559.D("ѐмѨѵѱѽщљѸчїє", (byte)29, 68);
               ZKM_STR_B[20] = NLoginCore_232.D("ѥѡѧѨѸѓҀєѤ҆ѡ҆҉фѨѧѯёѠҊ҉ғѦҍѾґҠѫҚѡҢѳ", (byte)29, 68);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_091.A("īĳĎģôĆêĪĲčĖ÷ĕĽĺĒĵĬýńĤĕđļŊļĬĢĿĪİĦ", (byte)29, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.D("ҀуѰѥ҉єщщ҉҇њќ҂Ѧ҂҃ҐғѱђѪѢџѠ", (byte)29, 68);
         }
      }
   }

   static {
      b();
   }

   public static boolean a(NLoginType_008 var0, ForceRegisterConfig var1) {
      return a(var1).stream().anyMatch(var1x -> ((var1x.d(var0) != 0) && var1x.a(var0).aF() ? df : dg));
   }

   public NLoginCore_367(NLoginCore_466 var1) {
      super(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void a(NLoginInterface_042 var1, String var2, String[] var3) {
      if (!(var1 instanceof NLoginCore_277)) {
         NLoginCore_150.a(var1, NLoginCore_487.z);
      } else {
         NLoginCore_277 var4 = (NLoginCore_277)var1;
         NLoginCore_187 var5 = this.a.a();
         if (var5.b(var4)) {
            NLoginCore_150.a(var4, NLoginCore_487.F);
            NLoginCore_150.a(var4, NLoginCore_508.f);
            NLoginCore_150.a(var4, NLoginCore_194.F);
         } else {
            NLoginCore_509 var6 = var5.b(var4);
            ForceRegisterConfig var7 = var6.a();
            List var8 = a(var7);
            switch (var8.size()) {
               case 0:
                  NLoginCore_487 var21 = NLoginCore_487.aj;
                  Object[] var22 = new Object[ax];
                  var22[ay] = a(az, ba);
                  NLoginCore_150.a(var1, var21, var22);
                  break;
               case 1:
                  NLoginCore_311 var18 = (NLoginCore_311)var8.get(bb);
                  NLoginCore_466 var19;
                  switch (NLoginCore_080.ZKM_STR_B[var18.ordinal()]) {
                     case 1:
                        var19 = NLoginCore_466.d;
                        break;
                     case 2:
                        var19 = NLoginCore_466.e;
                        if (var3.length != bc) {
                           NLoginCore_487 var10001 = NLoginCore_487.x;
                           Object[] var10002 = new Object[bd];
                           var10002[be] = a(bf, bg ^ bh) + var2 + a(bi, bj ^ bk) + var18.u() + a(bl, bm);
                           NLoginCore_150.a(var1, var10001, var10002);
                           return;
                        }
                        break;
                     default:
                        throw new IllegalStateException(a(bn & bo, bp) + var8);
                  }

                  String[] var20 = new String[var3.length + bq];
                  var20[br] = a(bs & bt, bu);
                  System.arraycopy(var3, bv, var20, bw, var3.length);
                  var19.a(var4, var6, var20);
                  break;
               default:
                  NLoginInterface_024 var9 = var6.a();

                  for (String var12 : NLoginCore_150.a(NLoginCore_487.at, var4)) {
                     if (var12.length() > by && var12.contains(a(bz & ca, cb)) && var12.contains(a(cc & cd, ce))) {
                        int var13 = var12.indexOf(a(cf, cg)) + ch;
                        int var14 = var12.lastIndexOf(a(ci, cj ^ ck));
                        if (var14 - var13 <= cl) {
                           throw new IllegalArgumentException(a(cm, cn) + NLoginCore_487.at.a().a()[co] + a(cp, cq ^ cr) + var12 + a(cs, ct ^ cu));
                        }

                        String var15 = a(cv, cw ^ cx);
                        if (var13 > 0) {
                           var15 = var12.substring(cy, var13 - cz);
                        }

                        String var16 = a(da, db ^ dc);
                        if (var14 + dd != var12.length()) {
                           var16 = var12.substring(var14);
                        }

                        String var17 = var15 + var12.substring(var13, var14) + var16;
                        var8.forEach(var2x -> {
                           String var3x;
                           String var4x;
                           switch (NLoginCore_080.ZKM_STR_B[var2x.ordinal()]) {
                              case 1:
                                 var3x = NLoginCore_466.d.a().aa();
                                 var4x = a(dh, di ^ dj) + var3x + a(dk, dl ^ dm);
                                 break;
                              case 2:
                                 var3x = NLoginCore_466.e.a().aa();
                                 var4x = a(dn, var_do) + var3x + a(dp, dq ^ dr) + var2x.u() + a(ds & dt, du);
                                 break;
                              default:
                                 throw new IllegalStateException(a(dv, dw ^ dx) + var2x);
                           }

                           Object[] var10002x = new Object[dy];
                           var10002x[dz] = NLoginCore_112.t(var2x.u());
                           var10002x[ea] = var3x;
                           var9.e(NLoginCore_112.a(var17, var10002x), var4x);
                        });
                     } else {
                        var9.a(var12);
                     }
                  }
            }
         }
      }
   }
}
