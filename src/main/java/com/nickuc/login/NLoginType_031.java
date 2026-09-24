package com.nickuc.login;

import com.nickuc.login.api.enums.LoginType;
import io.netty.channel.Channel;
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

public class NLoginType_031 extends NLoginCore_056 {
   private static int eh = Integer.reverse(-1610612736);
   private static int h = 0 >>> 224 | 0 << -224;
   private static long cc = Long.reverse(1797986653705226057L);
   private static long cr = Long.reverse(-3891110078048108544L);
   private static String[] c = new String[NLoginType_031.gk];
   private static int ci = Integer.reverse(1073741824);
   private static long er = Long.reverse(-3246044928949729463L);
   private static int bx = 160 >>> 69 | 160 << ~69 + 1;
   private static long bl = Long.reverse(1797986653705226057L);
   private static long fs = Long.reverse(1797986653705226057L);
   private static int b = Integer.reverse(1073741824);
   private static long bp = Long.reverse(-3246044928949729463L);
   private static long ck = Long.reverse(1797986653705226057L);
   private static long ge = Long.reverse(1797986653705226057L);
   private static int z = (24 >>> 163 | 24 << -163) & -1;
   private static int fv = (0 >>> 8 | 0 << -8) & -1;
   private static int ee = 0 >>> 157 | 0 << -157;
   private static int fu = Integer.reverse(Integer.MIN_VALUE);
   private static long ea = Long.reverse(-3891110078048108544L);
   private final NLoginType_010 b;
   private static long q = Long.reverse(-3891110078048108544L);
   private static long fl = Long.reverse(1797986653705226057L);
   private static long du = Long.reverse(1797986653705226057L);
   private static int ca = 0 >>> 47 | 0 << -47;
   private static int e = Integer.reverse(1610612736);
   private static long cg = Long.reverse(-3246044928949729463L);
   private static long ch = Long.reverse(-3891110078048108544L);
   private static int ct = Integer.reverse(-1073741824);
   private static int dk = Integer.reverse(-1342177280);
   private static int el = (544 >>> 101 | 544 << ~101 + 1) & -1;
   private static int fr = -1 >>> 225 | -1 << -225;
   private static int gg = Integer.reverse(0);
   private static int ew = (-1 >>> 114 | -1 << ~114 + 1) & -1;
   private static int fg = Integer.reverse(-1073741824);
   private static long ax = Long.reverse(-3246044928949729463L);
   private static long es = Long.reverse(-3891110078048108544L);
   private static int dv = Integer.reverse(134217728);
   private static long bd = Long.reverse(1797986653705226057L);
   private static int al = Integer.reverse(-1);
   private static long gj = Long.reverse(-3891110078048108544L);
   private static int fj = Integer.reverse(671088640);
   private static long dp = Long.reverse(-3891110078048108544L);
   private static int at = (16777216 >>> 120 | 16777216 << ~120 + 1) & -1;
   private static long dm = Long.reverse(-3891110078048108544L);
   private static int aw = (12288 >>> 236 | 12288 << -236) & -1;
   private static int eu = (608 >>> 101 | 608 << ~101 + 1) & -1;
   private static int ag = Integer.reverse(1073741824);
   private static int bo = Integer.reverse(-536870912);
   private static int cj = (2621440 >>> 210 | 2621440 << ~210 + 1) & -1;
   private static int ep = (32 >>> 229 | 32 << ~229 + 1) & -1;
   private static long i = Long.reverse(1797986653705226057L);
   private static int gl = Integer.reverse(-1744830464);
   private static long var_do = Long.reverse(-3246044928949729463L);
   private static long an = Long.reverse(1797986653705226057L);
   private static int ds = Integer.reverse(-1);
   private static int dq = 30 >>> 129 | 30 << ~129 + 1;
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static int bg = 2621440 >>> 51 | 2621440 << -51;
   private static int gc = 771751936 >>> 121 | 771751936 << -121;
   private static int gh = Integer.reverse(402653184);
   private static int o = 4096 >>> 44 | 4096 << ~44 + 1;
   private static int g = Integer.reverse(0);
   private static int eq = Integer.reverse(1207959552);
   private static int fn = (16777216 >>> 54 | 16777216 << ~54 + 1) & -1;
   private static int k = (2 >>> 193 | 2 << -193) & -1;
   private static int cd = 4194304 >>> 150 | 4194304 << -150;
   private static int ac = Integer.reverse(536870912);
   private static long bq = Long.reverse(-3891110078048108544L);
   private static long en = Long.reverse(1797986653705226057L);
   private static long bi = Long.reverse(1797986653705226057L);
   private static int cf = (2304 >>> 200 | 2304 << -200) & -1;
   private static int fo = Integer.reverse(-1476395008);
   private static int cz = Integer.reverse(805306368);
   private static int gk = 26214400 >>> 148 | 26214400 << -148;
   private static long ey = Long.reverse(1797986653705226057L);
   private static int et = Integer.reverse(1073741824);
   private static long gi = Long.reverse(-3246044928949729463L);
   private static long ay = Long.reverse(-3891110078048108544L);
   private static long ga = Long.reverse(1797986653705226057L);
   private static int bu = (0 >>> 135 | 0 << -135) & -1;
   private static long dd = Long.reverse(1797986653705226057L);
   private static int cm = (5632 >>> 137 | 5632 << -137) & -1;
   private static int be = Integer.reverse(0);
   private static int ba = (8388608 >>> 213 | 8388608 << ~213 + 1) & -1;
   private static int ei = 0 >>> 153 | 0 << ~153 + 1;
   private static long dl = Long.reverse(-3246044928949729463L);
   private static int dc = -1 >>> 39 | -1 << ~39 + 1;
   private static String[] d = new String[gl];
   private static long f;
   private static long co = Long.reverse(-3246044928949729463L);
   private static int dg = 512 >>> 103 | 512 << ~103 + 1;
   private static long p = Long.reverse(-3246044928949729463L);
   private static int cb = 536870912 >>> 154 | 536870912 << -154;
   private static int fz = Integer.reverse(1744830464);
   private static int bc = -1 >>> 180 | -1 << ~180 + 1;
   private static long dx = Long.reverse(-3246044928949729463L);
   private static int dn = (7168 >>> 233 | 7168 << ~233 + 1) & -1;
   private static int n = (8192 >>> 44 | 8192 << -44) & -1;
   private static int bj = 1572864 >>> 114 | 1572864 << ~114 + 1;
   private static int ap = (163840 >>> 239 | 163840 << -239) & -1;

   static {
      b();
   }

   @Override
   public void d(NLoginCore_277 var1) {
      long var2 = System.nanoTime();
      NLoginCore_187 var4 = this.e.a();

      try {
         super.d(var1);
      } catch (Throwable var9) {
         NLoginCore_370.c(a(bj, bl) + var1.getName() + a(bo, bp ^ bq), var9);
      } finally {
         var4.l(var1);
         NLoginCore_548.a(NLoginCore_425.e, var2);
      }
   }

   public NLoginType_031(NLoginType_008 var1, NLoginType_010 var2) {
      super(var1);
      this.b = var2;
   }

   public void a(NLoginCore_277 var1, String var2, boolean var3) {
      long var4 = System.nanoTime();

      try {
         if (var1.R()) {
            NLoginCore_509 var6 = this.e.a().b(var1);
            this.b.a().a(var1, var6, var2);
            if (var6.a().b(NLoginCore_077.f)) {
               NLoginCore_199 var10000 = this.b.a();
               int var10002 = b;
               Object[] var10003 = new Object[e];
               var10003[g] = a(h, i);
               var10003[k] = LoginType.SESSION.ordinal();
               var10003[n] = a(o, p ^ q);
               var10003[z] = Boolean.valueOf((boolean)aa);
               var10003[ac] = a(ag & al, an);
               var10003[ap] = Boolean.valueOf((boolean)at);
               var10000.a(var1, var10002, var10003);
            } else if (var3) {
               super.d(var1, var6);
            }

            this.b.a().f(var1, var6);
            return;
         }
      } catch (Throwable var10) {
         NLoginCore_370.c(a(aw, ax ^ ay) + var1.getName() + a(ba & bc, bd), var10);
         var1.a(a(bg, bi));
         return;
      } finally {
         NLoginCore_548.a(NLoginCore_425.d, var4);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 83L;
      var1 ^= 4533956647352555023L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(22 + 47),
                     (byte)(3 + 80),
                     (byte)(41 + 6),
                     (byte)(34 + 33),
                     (byte)(54 + 12),
                     (byte)(47 + 20),
                     (byte)(6 + 41),
                     (byte)(27 + 53),
                     (byte)(52 + 23),
                     (byte)(48 + 19),
                     (byte)(62 + 21),
                     (byte)(25 + 28),
                     (byte)(7 + 73),
                     (byte)(33 + 64),
                     (byte)(13 + 87),
                     (byte)(97 + 3),
                     (byte)(2 + 103),
                     110,
                     (byte)(57 + 46)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.C("йцхЈшфпшѓтЏэёъэѓЕޏާޜިޥޤޥ\u07b2", (byte)11, 67));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         c[var0] = new String(var3.doFinal(Base64.getDecoder().decode(d[var0])), StandardCharsets.UTF_8);
      }

      return c[var0];
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_031.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_324.A("řŻŽŝƁƠƘƮƚũƧƝƫƥŮƓƵƴƬƲƬƁ", (byte)89, 65), NLoginType_031.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_232.B("ƔơƠţƣƟƚƣƮƝŪƨƬƥƨƮŰӪԂӷԃԀӿԀԍƄ", (byte)89, 66) + var1 + NLoginCore_232.A("ū", (byte)89, 65) + var2.toString(), var4);
      }
   }

   @Nullable
   public String a(NLoginCore_277 var1, Object var2, Channel var3, boolean var4) {
      long var5 = System.nanoTime();
      String var7 = var1.getName();

      String var10;
      try {
         if (var3 == null) {
            String[] var20 = new String[bx];
            var20[ca] = a(cb, cc);
            var20[cd] = a(cf, cg ^ ch);
            var20[ci] = a(cj, ck) + var2.getClass().getSimpleName() + a(cm, co ^ cr);
            var20[ct] = a(cz & dc, dd);
            var20[dg] = a(dk, dl ^ dm);
            return NLoginCore_112.a(var20);
         }

         NLoginCore_588 var8 = (NLoginCore_588)var3.attr(NLoginCore_588.f).get();
         if (var8 != null) {
            NLoginInterface_031 var18 = this.e.b().a();
            return super.a(var1, var8.f, var8.ci, var1.b(), var4, (boolean)(var8.a == null && (var18 == null || !var18.a(var1.a())) ? fv : fu), var8);
         }

         String var17 = a(dn, var_do ^ dp) + var1.getName() + a(dq & ds, du) + var2.getClass().getSimpleName() + a(dv, dx ^ ea);
         NLoginCore_370.c(var17);
         String[] var10000 = new String[eh];
         var10000[ei] = a(el, en);
         var10000[ep] = a(eq, er ^ es);
         var10000[et] = a(eu & ew, ey) + var17;
         var10000[fg] = a(fj, fl);
         var10000[fn] = a(fo & fr, fs);
         var10 = NLoginCore_112.a(var10000);
      } catch (Throwable var14) {
         NLoginCore_370.c(a(fz, ga) + var7 + a(gc, ge), var14);
         return a(gh, gi ^ gj);
      } finally {
         NLoginCore_548.a(NLoginCore_425.c, var5);
      }

      return var10;
   }

   private static void b() {
      f = -7862582105189003445L;
      long var0 = f ^ 4533956647352555023L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(28 + 40),
               (byte)(24 + 45),
               (byte)(18 + 65),
               47,
               (byte)(15 + 52),
               (byte)(12 + 54),
               (byte)(2 + 65),
               (byte)(33 + 14),
               (byte)(14 + 66),
               (byte)(36 + 39),
               (byte)(34 + 33),
               (byte)(66 + 17),
               (byte)(43 + 10),
               (byte)(13 + 67),
               (byte)(12 + 85),
               (byte)(33 + 67),
               (byte)(99 + 1),
               (byte)(69 + 36),
               (byte)(11 + 99),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(27 + 42), (byte)(79 + 4)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_446.C("ѲѪѐчѵѝѻуѱњѦы", (byte)26, 67);
               d[1] = NLoginCore_110.A("÷Ėę÷îèāĒÿĦĐČöĖñćĔĈĻĨĸďĎúŅİĥŀĲħĲý", (byte)26, 65);
               d[2] = NLoginCore_138.B("ĂöĎøéĄāıñģĊĐĵĦěĸĴĝďŀĎęĆć", (byte)26, 66);
               d[3] = NLoginCore_521.B("çğĉëČģĐðþĔĊĥ÷ĪĬĬöČĈĪĸĒıĚĚÿįľņķüĝħĭŇČňĎĈŁňīĒŎģĬśěŔŖŕļĞķįŀŃğŘĸŅĹĦŚūŋŝōŇĪōįĴŀŨĻ", (byte)26, 66);
               d[4] = NLoginCore_453.F("ԥԾԋՇՓԽԤՎԕԹՋԞ", (byte)26, 70);
               d[5] = NLoginCore_110.E(
                  "ԽԋՎՇԱԓԋԥԴԒՈԻՕ\u0558ՌՏՉԱաՒՁ\u0558ՓԘԶԾԽՇԢԺ՚ԷԩԮ՜եեեՔՒաԱդՓՌմՐՉԼՏՍմկ՜տո\u0558ՐսՙըՕռփզ֎փՏ՟սՑՎՓ֍ևՒք֕էՙ֖՛՝֘խ֖բրօֆզռ֚֕սլ", (byte)26, 69
               );
               d[6] = NLoginCore_201.E("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԴՕՂեԣԿԽիԞբՈՋԮհեՓՋ՞՞խբՍՃԲ՜ՅյկՀբՏՃւՉՊ", (byte)26, 69);
               d[7] = NLoginCore_110.C("ђѫиѴҀѪёѻтѦѸы", (byte)26, 67);
               d[8] = NLoginCore_387.E("ԽԋՎՇԱԓԋԥԴԒՊՃՖ՝ԩ՟ԧ\u0530ԛ՞ԛբԩԪ", (byte)26, 69);
               d[9] = NLoginCore_521.A("ČúöìěĮĢāòćñû", (byte)26, 65);
               d[10] = NLoginCore_553.A("ĊëįğġĆëİĳĲĮĎęĬĄñİúĦĐĈĹúĸýĳĺĨĵĽĲýĦăŁħŏĨŀŒĦĳĬġńġĮŋŐōıęįĹĦħ", (byte)26, 65);
               d[11] = NLoginCore_183.A("ûåāêýèĢĪĥĈĨû", (byte)26, 65);
               d[12] = NLoginCore_530.F("ԯԝԙԏԾՑՅԤԕԪԔԞ", (byte)26, 70);
               d[13] = NLoginCore_076.F("ԗՏՐՇ\u0530ԣՁԖԴԕԹԤՋԔԵ՜ԸՖԘԬԳԛԷՂՏՅՈթԤՙԽՏԸծէԨըե՝ՂԩԸԱԱՆսՎՎ՟Տ՜՝դ՜ՉՊ", (byte)26, 70);
               d[14] = NLoginCore_521.F("ԁԋԩԲԳՉԡԯՆՁԷԙԣԤ՛ԨԹԵՑԷԹՖԥէեՃԳԲՕըԨԪԻժԮաՒԬիՑժիեՅչՌեՒռոՍշՠԿպԽՏԾտվլ՚Պՠ", (byte)26, 70);
               d[15] = NLoginCore_110.D("ѤдѓэѱѮѷнкѻюы", (byte)26, 68);
               d[16] = NLoginCore_223.C("ѵгџкєрѕљѕѢѼѦјѕѲ҃ҍѮѾѠт҃Ҏ҈ѝѐ҉ѦѦєҎҌқіѯѳѶҋѫѭѝѻѸҞ҃ҁҘҊҡ҇ҘҘѹүѶѷ", (byte)26, 67);
               d[17] = NLoginCore_397.F("ԽԋՎՇԱԓԋԥԴԒՊՃՖ՝ԩ՟ԧ\u0530ԛ՞ԛբԩԪ", (byte)26, 70);
               d[18] = NLoginCore_453.A("ČúöìěĮĢāòćñû", (byte)26, 65);
               d[19] = NLoginCore_141.B("øêĬĄğĥčêĉģĂû", (byte)26, 66);
               d[20] = NLoginCore_004.C("ќъцмѫѾѲётїсы", (byte)26, 67);
               d[21] = NLoginCore_076.B("ôĬĭĤčĀĞóđòĖāĨñĒĹĕĳõĉĐøĔğĬĢĥņāĶĚĬĕŋńąŅłĺğĆĕĎĎģŚīīļĬĹĺŁĹĦħ", (byte)26, 66);
               d[22] = NLoginCore_521.E("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԵՔԽԽԢՒաթ՚ԟՀՄՀՌաՌԱՕՊձՌԹժՊԲՓԹժչյՌԽղՉՊ", (byte)26, 69);
               d[23] = NLoginCore_004.D("ђѫиѴҀѪёѻтѦѸы", (byte)26, 68);
               d[24] = NLoginCore_575.B("ĚèīĤĎðèĂđïĥĘĲĵĩĬĦĎľįĞĵİõēěĚĤÿėķĔĆċĹłłłıįľĎŁİĩőĭĦęĬĪőŌĹŜŕĵĭŚĶŅĲřŠŃūŠĬļŚĮīİŪŤįšŲńĶųĸĺŵŊųĿŝŢţŃřŷŲŚŉ", (byte)26, 66);
               break;
            case 1:
               d[0] = NLoginCore_530.B("ìČ÷ėíĨěĞĆĒēĮčģčĤòĩĩĩĐĉĆć", (byte)26, 66);
               d[1] = NLoginCore_173.D("чѦѩчоиёѢяѶѠќцѦсїѤјҋѸ҈ѣѾѯђѥѨѫѪѢѐҖ", (byte)26, 68);
               d[2] = NLoginCore_471.A("ĂöĎøéĄāıñģČİïĵąīęĵĕĮīĿĆć", (byte)26, 65);
               d[3] = NLoginCore_553.F("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԵՔԽԽԢՒաթ՚ԟՀՊՐժԯիԱԫդիՎԵձՆՏվԾշչո՟Ձ՚ՒգզՂջ՛ը՜Չսռ՞ղիՠժեՈՠչչ՞", (byte)26, 70);
               d[4] = NLoginCore_553.C("хішѯџѿѣєѰѱҀы", (byte)26, 67);
               d[5] = NLoginCore_433.C(
                  "ѪиѻѴўриђѡпѵѨ҂҅ѹѼѶўҎѿѮ҅ҀхѣѫѪѴяѧ҇Ѥіћ҉ҒҒҒҁѿҎўґҀѹҡѽѶѩѼѺҡҜ҉Ҭҥ҅ѽҪ҆ҕ҂ҩҰғһҰѼҌҪѾѻҀҺҴѿұӂҔ҆Ӄ҈ҊӅҚӊҢҡҞҥӍҟӋҋҷҥҮҸӌӓӠҽҞӟңңҺҫ", (byte)26, 67
               );
               d[6] = NLoginCore_076.E("ԊՂԬԎԯՆԳԓԡԷԭՈԚՍՏՏԙԯԫՍ՛ԴՕՂեԣԿԽիԞբՈՋԮհեՓՋ՞՞խբՎՇիլ\u0557էրԼիՑվ՜ՉՊ", (byte)26, 69);
               d[7] = NLoginCore_324.A("ġĬħĀČđĆčĬõĴû", (byte)26, 65);
               d[8] = NLoginCore_427.F("ԽԋՎՇԱԓԋԥԴԒՈԭԬԗԻԺՈՠԛԯՏԬԩԪ", (byte)26, 70);
               d[9] = NLoginCore_453.D("ьћѵпћѶѽеіфђы", (byte)26, 68);
               d[10] = NLoginCore_223.F("ԭԎՒՂՄԩԎՓՖՕՑԱԼՏԧԔՓԝՉԳԫ՜ԝ՛ԠՖ՝Ջ\u0558ՠՕԠՉԦդՊղՋգյՉՖՐ\u0558ԶԵզՖձ՝\u0557ՊտղՉՊ", (byte)26, 70);
               d[11] = NLoginCore_076.F("ԛՌԋԈ\u0530ԪԲԴՉՂԤԤԶ՚ԏԼՕԿԚԪաԬԩԪ", (byte)26, 70);
               d[12] = NLoginCore_110.F("ԈԽԍԜՇԾԯԑՐԦԹԞ", (byte)26, 70);
               d[13] = NLoginCore_232.C("фѼѽѴѝѐѮуѡтѦёѸсѢ҉ѥ҃хљѠшѤѯѼѲѵҖё҆ѪѼѥқҔѕҕҒҊѯіѥўҁҕ҄҇ѴҢ҂ѧҞҋүѶѷ", (byte)26, 67);
               d[14] = NLoginCore_387.C("ЮиіџѠѶюќѳѮѤцѐё҈ѕѦѢѾѤѦ҃ђҔҒѰѠџ҂ҕѕїѨҗћҎѿљҘѾҗҘҒѲҦѹҒѿҩҥѺҤҍѬѼѪѴѯҦҬҸѱҤұ", (byte)26, 67);
               d[15] = NLoginCore_223.C("фѴжѧѿҁѓѲѺҀ҂ѹѱѵ҆ѝєчѧѥҋѩії", (byte)26, 67);
               d[16] = NLoginCore_127.E("ՈԆԲԍԧԓԨԬԨԵՏԹԫԨՅՖՠՁՑԳԕՖա՛\u0530ԣ՜ԹԹԧա՟ծԩՂՆՉ՞ԾՀ\u0530ՎՌհՉջԷ\u0557թԲՕհգ՝ղ՝շևՓՠպդՕՋ", (byte)26, 69);
               d[17] = NLoginCore_451.B("ĚèīĤĎðèĂđïĤðČĺįİĽĳĎĘýĉĆć", (byte)26, 66);
               d[18] = NLoginCore_575.E("ՉԮԧՌՊՑՖԱ\u0558ԧՃԞ", (byte)26, 69);
               d[19] = NLoginCore_433.B("ĭĖåĎïçĚĝýġíû", (byte)26, 66);
               d[20] = NLoginCore_471.F("ԾԚԻԺԱՍԯՆԍՊԱԞ", (byte)26, 70);
               d[21] = NLoginCore_427.F("ԗՏՐՇ\u0530ԣՁԖԴԕԹԤՋԔԵ՜ԸՖԘԬԳԛԷՂՏՅՈթԤՙԽՏԸծէԨըե՝ՂԩԸԱԺԶո\u0558իՙշշն՜ւՉՊ", (byte)26, 70);
               d[22] = NLoginCore_027.A("çğĉëČģĐðþĔĊĥ÷ĪĬĬöČĈĪĸĒıĚĚÿįľņķüĝġĝĩľĩĎĲħŎĩĕıńđĐĲĳŐŘœĬŏĦħ", (byte)26, 65);
               d[23] = NLoginCore_384.B("ĊĬäĊëďüİĂþĊû", (byte)26, 66);
               d[24] = NLoginCore_553.D("ѪиѻѴўриђѡпѵѨ҂҅ѹѼѶўҎѿѮ҅ҀхѣѫѪѴяѧ҇Ѥіћ҉ҒҒҒҁѿҎўґҀѹҡѽѶѩѼѺҡҜ҉Ҭҥ҅ѽҪ҆ҕ҂ҩҰғһҰѼҌҪѾѻҀҺҴѿұӂҔ҆Ӄ҈ҊӅҚӁӌҜҫҞӌҰҕӖҥҥҼҽӗҬӔӉҳҙӌӁӆҫ", (byte)26, 68);
               break;
            case 2:
               d[0] = NLoginCore_173.C("йњчѺџлѠыѐѵѢя҄ѝт҆ѺѹѬѝѮҏії", (byte)26, 67);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_004.D("њќьѰв҂ѼйњѡѥцњѱѼѵ҂ѿћхѢѿії", (byte)26, 68);
         }
      }
   }
}
