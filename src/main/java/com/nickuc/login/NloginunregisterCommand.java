package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.enums.event.UnregisterSource;
import com.nickuc.login.api.enums.event.UpdatePasswordSource;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NloginunregisterCommand extends NLoginCore_353 {
   private static long g = Long.reverse(-1070343748826016497L);
   private static long al = Long.reverse(5270724526511641871L);
   private static int cb = Integer.reverse(134217728);
   private static int bh = Integer.reverse(1342177280);
   private static int af = 0 >>> 146 | 0 << -146;
   private static int z = Integer.reverse(536870912);
   private static long dd = Long.reverse(5270724526511641871L);
   private static int aq = (20480 >>> 236 | 20480 << -236) & -1;
   private static long bp = Long.reverse(5270724526511641871L);
   private static int bq = Integer.reverse(0);
   private static int at = 16 >>> 163 | 16 << -163;
   private static long bj = Long.reverse(-5188146770730811392L);
   private static long bn = Long.reverse(5270724526511641871L);
   private static int cl = Integer.reverse(-939524096);
   private static int bb = (-1 >>> 104 | -1 << -104) & -1;
   private static long cc = Long.reverse(5270724526511641871L);
   private static int c = (0 >>> 9 | 0 << -9) & -1;
   private static int m = (8192 >>> 108 | 8192 << ~108 + 1) & -1;
   private static long ai = Long.reverse(5270724526511641871L);
   private static int ba = Integer.reverse(268435456);
   private static int l = (0 >>> 152 | 0 << -152) & -1;
   private static int cx = (92 >>> 226 | 92 << ~226 + 1) & -1;
   private static int u = Integer.reverse(536870912);
   private static int dh = Integer.reverse(0);
   private static String[] ZKM_STR_A = new String[NloginunregisterCommand.di];
   private static int j = (0 >>> 227 | 0 << -227) & -1;
   private static int ae = Integer.reverse(0);
   private static int au = (402653184 >>> 155 | 402653184 << ~155 + 1) & -1;
   private static int ar = Integer.reverse(0);
   private static long bc = Long.reverse(5270724526511641871L);
   private static long bi = Long.reverse(-1070343748826016497L);
   private static int be = (1179648 >>> 49 | 1179648 << ~49 + 1) & -1;
   private static long dg = Long.reverse(5270724526511641871L);
   private static int k = Integer.reverse(Integer.MIN_VALUE);
   private static long cs = Long.reverse(-5188146770730811392L);
   private static int bo = Integer.reverse(805306368);
   private static int de = Integer.reverse(1073741824);
   private static long bg = Long.reverse(-5188146770730811392L);
   private static int as = (16 >>> 164 | 16 << -164) & -1;
   private static long bw = Long.reverse(5270724526511641871L);
   private static int bu = Integer.reverse(1879048192);
   private static int co = (1310720 >>> 208 | 1310720 << -208) & -1;
   private static int aa = Integer.reverse(0);
   private static int an = -1 >>> 15 | -1 << -15;
   private static int ah = (-1 >>> 110 | -1 << -110) & -1;
   private static int df = 204800 >>> 13 | 204800 << ~13 + 1;
   private static long bf = Long.reverse(-1070343748826016497L);
   private static long cf = Long.reverse(-5188146770730811392L);
   private static long cj = Long.reverse(-5188146770730811392L);
   private static long t = Long.reverse(5270724526511641871L);
   private static long ci = Long.reverse(-1070343748826016497L);
   private static int s = (12 >>> 162 | 12 << -162) & -1;
   private static int ab = (16 >>> 132 | 16 << -132) & -1;
   private static int am = Integer.reverse(-536870912);
   private static String[] ZKM_STR_B = new String[NloginunregisterCommand.dj];
   private static int q = 1024 >>> 170 | 1024 << -170;
   private static long c;
   private static int ca = 0 >>> 233 | 0 << -233;
   private static int bx = Integer.reverse(-268435456);
   private static long bs = Long.reverse(5270724526511641871L);
   private static float az = Float.intBitsToFloat(Integer.reverse(514));
   private static int ak = (-1 >>> 93 | -1 << -93) & -1;
   private static long cn = Long.reverse(5270724526511641871L);
   private static int f = (1 >>> 128 | 1 << -128) & -1;
   private static long e = Long.reverse(5270724526511641871L);
   private static int cy = -1 >>> 245 | -1 << ~245 + 1;
   private static long h = Long.reverse(-5188146770730811392L);
   private static long bz = Long.reverse(-5188146770730811392L);
   private static long v = Long.reverse(-1070343748826016497L);
   private static int aj = (48 >>> 195 | 48 << ~195 + 1) & -1;
   private static int x = (16 >>> 100 | 16 << -100) & -1;
   private static float ay = Float.intBitsToFloat(Integer.reverse(3714));
   private static int dj = 872415232 >>> 249 | 872415232 << ~249 + 1;
   private static long w = Long.reverse(-5188146770730811392L);
   private static int bv = (-1 >>> 5 | -1 << ~5 + 1) & -1;
   private static int p = Integer.reverse(1073741824);
   private static int ag = Integer.reverse(-1610612736);
   private static int r = 0 >>> 52 | 0 << -52;
   private static int bd = (0 >>> 73 | 0 << ~73 + 1) & -1;
   private static long by = Long.reverse(-1070343748826016497L);
   private static int da = Integer.reverse(0);
   private static long ce = Long.reverse(-1070343748826016497L);
   private static int ad = 384 >>> 7 | 384 << -7;
   private static int cg = Integer.reverse(0);
   private static long cr = Long.reverse(-1070343748826016497L);
   private static int ct = Integer.reverse(1744830464);
   private static int ck = (0 >>> 175 | 0 << ~175 + 1) & -1;
   private static long ao = Long.reverse(5270724526511641871L);
   private static int db = (1536 >>> 230 | 1536 << ~230 + 1) & -1;
   private static int di = Integer.reverse(1476395008);
   private static int aw = Integer.reverse(0);
   private static int bt = Integer.reverse(0);
   private static int dc = Integer.reverse(-1);
   private static int cm = Integer.reverse(-1);
   private static long cv = Long.reverse(-5188146770730811392L);
   private static long cu = Long.reverse(-1070343748826016497L);
   private static int i = (33554432 >>> 57 | 33554432 << -57) & -1;
   private static int ax = 0 >>> 37 | 0 << -37;
   private static int y = 0 >>> 158 | 0 << ~158 + 1;
   private static int ap = Integer.reverse(0);
   private static int bm = Integer.reverse(-1);
   private static int bk = (0 >>> 78 | 0 << -78) & -1;
   private static int ac = Integer.reverse(1073741824);
   private static long cz = Long.reverse(5270724526511641871L);
   private static int bl = 22 >>> 97 | 22 << ~97 + 1;
   private static int cd = (34 >>> 129 | 34 << ~129 + 1) & -1;
   private static long o = Long.reverse(5270724526511641871L);
   private static int av = 32 >>> 3 | 32 << -3;
   private static int cq = 1344 >>> 230 | 1344 << -230;
   private static long cp = Long.reverse(5270724526511641871L);
   private static int d = Integer.reverse(-1);
   private static int ch = Integer.reverse(1207959552);
   private static int n = -1 >>> 89 | -1 << -89;
   private static int cw = Integer.reverse(0);
   private static int br = Integer.reverse(-1342177280);

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != p) {
         NLoginCore_487 var22 = NLoginCore_487.x;
         Object[] var24 = new Object[q];
         var24[r] = a(s, t) + this.e() + a(u, v ^ w);
         NLoginCore_150.a(var1, var22, var24);
      } else {
         NLoginCore_270 var3 = new NLoginCore_270();
         String var4 = var2[x];
         NLoginCore_291 var5 = this.a.a();
         ForceRegisterConfig var6 = var5.a(var1, super.l, var2, var4);
         if (var6 != null) {
            if (!var6.h()) {
               NLoginCore_150.a(var1, NLoginCore_487.t);
               NLoginCore_150.a(var1, NLoginCore_194.F);
            } else {
               String var7 = var6.i();
               NLoginCore_277 var8 = this.a.b().a(var7);
               UUID var9 = var8 != null ? var8.a() : var6.a();
               NLoginType_008 var10000 = this.a;
               EventEnum var10001 = EventEnum.UNREGISTER;
               Object[] var10002 = new Object[z];
               var10002[aa] = var8;
               var10002[ab] = var9;
               var10002[ac] = var6.i();
               var10002[ad] = UnregisterSource.BY_ADMIN;
               if (var10000.a(var10001, var10002)) {
                  synchronized (var6.c) {
                     if (!var6.h()) {
                        NLoginCore_150.a(var1, NLoginCore_487.t);
                        NLoginCore_150.a(var1, NLoginCore_194.F);
                        return;
                     }

                     if (var8 != null) {
                        var7 = var8.getName();
                     }

                     if (!var5.a(var6)) {
                        NLoginCore_150.a(var1, NLoginCore_487.w);
                        NLoginCore_150.a(var1, NLoginCore_194.F);
                        return;
                     }

                     NLoginCore_370.b(a(ag & ah, ai) + var7 + a(aj & ak, al) + var1.getName() + a(am & an, ao));
                     boolean var15 = false /* VF: Semaphore variable */;

                     try {
                        var15 = true;
                        var10000 = this.a;
                        var10001 = EventEnum.PASSWORD_UPDATE_EVENT;
                        var10002 = new Object[aq];
                        var10002[ar] = var8;
                        var10002[as] = var9;
                        var10002[at] = var7;
                        var10002[au] = null;
                        var10002[av] = UpdatePasswordSource.BY_ADMIN;
                        var10000.a(var10001, var10002);
                        var15 = false;
                     } finally {
                        if (var15) {
                           if (var8 != null) {
                              var8.a(NLoginCore_150.a(NLoginCore_487.q, var8));
                           }
                        }
                     }

                     if (var8 != null) {
                        var8.a(NLoginCore_150.a(NLoginCore_487.q, var8));
                     }

                     NLoginCore_150.a(var1, NLoginCore_194.C, ay, az);
                     if (var6.t() && var6.a().equals(var6.getMojangId())) {
                        if (this.j()) {
                           NLoginCore_150.a(var1, a(ba & bb, bc));
                           NLoginCore_150.a(var1, a(be, bf ^ bg) + var7 + a(bh, bi ^ bj));
                           NLoginCore_150.a(var1, a(bl & bm, bn) + var7 + a(bo, bp));
                        } else {
                           NLoginCore_150.a(var1, a(br, bs));
                           NLoginCore_150.a(var1, a(bu & bv, bw) + var7 + a(bx, by ^ bz));
                           NLoginCore_150.a(var1, a(cb, cc) + var7 + a(cd, ce ^ cf));
                        }

                        NLoginCore_150.a(var1, a(ch, ci ^ cj));
                     }

                     NLoginCore_150.a(var1, this.j() ? a(cl & cm, cn) + var7 + a(co, cp) : a(cq, cr ^ cs) + var7 + a(ct, cu ^ cv));
                     NLoginCore_150.a(var1, a(cx & cy, cz));
                     NLoginCore_150.a(var1, a(db & dc, dd) + var3.a(TimeUnit.MILLISECONDS, de) + a(df, dg));
                  }
               }
            }
         }
      }
   }

   static {
      b();
   }

   private static void b() {
      c = -1104976337736129393L;
      long var0 = c ^ -9201417024994226076L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(23 + 45),
               (byte)(36 + 33),
               (byte)(35 + 48),
               (byte)(26 + 21),
               (byte)(49 + 18),
               66,
               (byte)(39 + 28),
               (byte)(9 + 38),
               (byte)(40 + 40),
               (byte)(30 + 45),
               (byte)(31 + 36),
               (byte)(13 + 70),
               (byte)(41 + 12),
               (byte)(50 + 30),
               97,
               (byte)(12 + 88),
               (byte)(32 + 68),
               (byte)(86 + 19),
               (byte)(82 + 28),
               (byte)(29 + 74)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(22 + 47), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_446.D("јѮҙ҂ҒҚѴѠ҆ҠҦѫҁѷѻҝ҈ҩүҥҋѽѺѻ", (byte)38, 68);
               ZKM_STR_B[1] = NLoginCore_110.B("ėĲĳĀģĠĿĩŉĊĜŐŉĬĪŒĦČďŃĎŁČĮĻĮŖĭľŀŐęŜťĸŒĚŦŇŘģĥŏĭŝŐĽŞıŐĲŎŲŁľĿ", (byte)38, 66);
               ZKM_STR_B[2] = NLoginCore_092.C("ѻљңѻѤҞѲҔѤҚѥѯ", (byte)38, 67);
               ZKM_STR_B[3] = NLoginCore_521.F("ԖՉԩ\u0558ԬՁ\u0557ԱԽԺԱՖԼեԛԩ՟էՋեԿԸԵԶ", (byte)38, 70);
               ZKM_STR_B[4] = NLoginCore_397.F("ՖԯԻԮԨ\u0558ՊՐԟԾզՐՑ՛աԽԡԧԻԧ\u0558ծԵԶ", (byte)38, 70);
               ZKM_STR_B[5] = NLoginCore_241.F("ՏՅՓ\u0530ԧՒՙԡԺԺԤԪ", (byte)38, 70);
               ZKM_STR_B[6] = NLoginCore_201.B("ĜńŃěęĄĝĻħĘŅĈěŃņŎĝĒĩōŅħŕĪīĴĕœĵŜŊġőŁğšĽĵńĹŤŤŊįĢŤİŅĬōŦĴĶŢőŭŲŔŜūũŴşŹ", (byte)38, 66);
               ZKM_STR_B[7] = NLoginCore_427.B("ĹĢĖćĠľĹėĹľĞē", (byte)38, 66);
               ZKM_STR_B[8] = NLoginCore_427.E(
                  "ՉՋ\u0558ԚԜՁԻՌՄԶԺԺԱՄՓըՁեՠ՚խխԿէԬՔ՞ՌՕԪԱԴԸՐՙձոՋլղՐԼշդքր\u0557ֈ՛ռ\u058bի\u0558կկզ\u0590ռ֏ՖևՊկՑՒ֝\u0558թս֎սո\u0590օ֗քշ֕՛ր֣ր֙զ֟֝պփ֏լֆ֍հֵֹ֗ղֱֆֳ֫׀֎ׁ֟֏֡ռև֦֨֙֕׀\u05c9֪֮֟֟֜֍֣\u05c9֧\u05c9ׂ֨֨",
                  (byte)38,
                  69
               );
               ZKM_STR_B[9] = NLoginCore_141.D("ѶѾѾѮџ҂ѳҝҤѽҥѝѩѫѬҪҘҮҥҏҞҋҔҒѷҮҺғҕҝқҍҴұҵѼҗһүҽһҜҪ҉ҕҹҮӎӊӏҎӆӊӒӃҷҕӐӖґҦҕӈҙӏӓҺқҝӃҞӤӔҶҸҹӕҹӍӢӉүӓӅӠӳҺһ", (byte)38, 68);
               ZKM_STR_B[10] = NLoginCore_559.E("ՕՅԹՔԽԯՔԹ\u0557\u0530ԺՂ՛ԟԽ\u0557ՄԫԨՇՅԾԿՉԳՓ՞՟հՐճԶ", (byte)38, 69);
               ZKM_STR_B[11] = NLoginCore_141.E(
                  "ԱԹԹԩԚԽԮ\u0558՟Ը՟ԡ\u0530\u0557Ոԧ՝էԬՇՐՆՠՠդԾՎՊշՑշ\u0558ՔնՔԻ՜Ռշմհ՜ր\u0558Կ։ՓֆՂխխ՞ո՝\u058cՐՍՔ֊Ոքդմթխևխղ֑շ֕ց֑\u0590դք֧է֞աեօփ֥֦ֈյն", (byte)38, 69
               );
               ZKM_STR_B[12] = NLoginCore_433.D("ҚѹѵѬѲҒҤҟѲѦ҂ѯ", (byte)38, 68);
               ZKM_STR_B[13] = NLoginCore_427.C("ҒҚҘҟѲҕўҞҟҜѶ҅ҬѼҝѻѾҋҲҭҠҦҰҮҴҔҏ҄ҼҾҺҳҜҺҾҮѶӅҗҏҕҡӋҶӃҚҩӄӈӋҨӅҊӂӖҶҭӑӋҺҼҰҿҺқҡҚҞҽӠӞӦӣӪәҿҦҫҧөҼӒӊӉӒҫӀҶӏҰӲҴӰӌҼӹӲӓӚӐӣӘԀҽӤӺԀӏ", (byte)38, 67);
               ZKM_STR_B[14] = NLoginCore_141.C("ўґҘўҥїѻҥѽ҉ѹҫҩ҆ѦѨ҈ҲҋҠҲҲҠ҈ґҲұҤҫұҨ҈ҏҸҀҏҳҲҁҟҀ҃ҒҔҥӆ҄ҿ҂ҭӄӋғӍҦӄӈӊӏҵҧҴӜӌӞӉӔҵҜҽһҶӒӂҡү", (byte)38, 67);
               ZKM_STR_B[15] = NLoginCore_241.E("ԬԯԵ\u0557ՓԙԡԯԼՓՆԘ՞աԳԪԹԸծԬՐաիՀԿյծ՟ՖՌխկ", (byte)38, 69);
               ZKM_STR_B[16] = NLoginCore_446.E(
                  "ՑԭԚԽՒԬԵԠՂբ\u0530ԟՇՉՉդԴՍՆ՜\u0558ԻՙՐհՊՄ\u0530ժթՊդՎծՇ\u0558ՖջնՌՍջՐօկՃսՃքըՆ֎փսժ֏ֈՎՇ֒\u0557մՓ֘ղե֒֘հը֒֟\u0590֑դժ", (byte)38, 69
               );
               ZKM_STR_B[17] = NLoginCore_553.A("ľĝęĐĖĶňŃĖĊĦē", (byte)38, 65);
               ZKM_STR_B[18] = NLoginCore_453.F("ՋԹՏԧԬԬԡ՝ԯԱԠԪ", (byte)38, 70);
               ZKM_STR_B[19] = NLoginCore_397.F("ԩՙՓԱ՞ՀԺԟաՄԮԳԣԥՇՂԣ՞ՀՊբհԮդՔզիԾՎշ\u0557՚ՖԹՍ՚Ող՟ՌՠԼՀ\u0557՝ՕպտԽպյեՎվՕՖ", (byte)38, 70);
               ZKM_STR_B[20] = NLoginCore_453.C("ѵјѬґҕҞѱҁҧѸҖѤ҅ѸҀ҈Ҥҏ҃ҥҤѬҟҎ҇ҎҮҖҔҥҎҚ", (byte)38, 67);
               ZKM_STR_B[21] = NLoginCore_530.F("ԛՌԧԻԛՈԸԼԲԷԶ՟ՁԟԥԶԥՈԤԤ՛ՍՄԾԼճբզ\u0530ղԵՉ՜ՋՋԴ՞Քժղ՜ՔպՂմպՁոՃՖևտջ՞ասւթղ֎փՕ֘ՑՖս֍֔վ՜ղՔ֗ս֠վ՞ՠ֑չ֖֦դք֮֬յն", (byte)38, 70);
               ZKM_STR_B[22] = NLoginCore_076.F("ԳԒԜԧԨ՛ԮՀ՛ԴԹԪ", (byte)38, 70);
               ZKM_STR_B[23] = NLoginCore_241.D("ҐѾҔѬѱѱѦҢѴѶѥѯ", (byte)38, 68);
               ZKM_STR_B[24] = NLoginCore_451.F("՛Ո՚ԕԝՓ\u0557՛՝ԯԷՆագբԠեՉԦԦէ՚թ՛թբբծԵՠյպԶխԳ՜Օխլ\u0557ՙՔկՊ", (byte)38, 70);
               ZKM_STR_B[25] = NLoginCore_183.B("úýĽăćĠĩĥĈħĖē", (byte)38, 66);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.E("ԓԩՔԽՍՕԯԛՁ՛բա՛Ձԣ՟Լԩ՚ԧ՟ԸԵԶ", (byte)38, 69);
               ZKM_STR_B[1] = NLoginCore_232.D("ѳҎҏќѿѼқ҅ҥѦѸҬҥ҈҆Ү҂ѨѫҟѪҝѨҊҗҊҲ҉ҚҜҬѵҸӁҔҮѶӂңҴѿҁҳӊҠҿҡҟӐүӈңҳҭҚқ", (byte)38, 68);
               ZKM_STR_B[2] = NLoginCore_530.B("ĐĕėįĩģġĹĬăņĆĤĐĜğĥċĶņĬıĞğ", (byte)38, 66);
               ZKM_STR_B[3] = NLoginCore_471.A("ÿĲĒŁĕĪŀĚĦģĚŐŇĻċĜİĐĿĲĵġĞğ", (byte)38, 65);
               ZKM_STR_B[4] = NLoginCore_127.A("ĿĘĤėđŁĳĹĈħŎĭĺĪĥĬŋľŗŘĩŗĞğ", (byte)38, 65);
               ZKM_STR_B[5] = NLoginCore_092.A("İþĮćķğńŀīŎńē", (byte)38, 65);
               ZKM_STR_B[6] = NLoginCore_173.C("ѸҠҟѷѵѠѹҗ҃ѴҡѤѷҟҢҪѹѮ҅ҩҡ҃ұ҆҇ҐѱүґҸҦѽҭҝѻҽҙґҠҕӀӀҦҋѾӀҌҡ҈ҩӂҐҒүӈӐұґҔӍӚҭҼҜ", (byte)38, 67);
               ZKM_STR_B[7] = NLoginCore_173.B("úąęĿłėăĹĨĥňē", (byte)38, 66);
               ZKM_STR_B[8] = NLoginCore_397.D(
                  "ҎҐҝџѡ҆Ҁґ҉ѻѿѿѶ҉Ҙҭ҆ҪҥҟҲҲ҄ҬѱҙңґҚѯѶѹѽҕҞҶҽҐұҷҕҁҼҩӉӅҜӍҠӁӐҰҝҴҴҫӕӁӔқӌҏҴҖҗӢҝҮӂӓӂҽӕӊӜӉҼӚҠӅӨӅӞҫӤӢҿӈӔұӋӒҵӾӜӺҷӶӋӰӸԅӓӤԆӔӦӁӌӭӞӫӚԅԎӤӳӽӾӣӏԙԅӍӷԔӵӿ",
                  (byte)38,
                  68
               );
               ZKM_STR_B[9] = NLoginCore_451.C("ѶѾѾѮџ҂ѳҝҤѽҥѝѩѫѬҪҘҮҥҏҞҋҔҒѷҮҺғҕҝқҍҴұҵѼҗһүҽһҜҪ҉ҕҹҮӎӊӏҎӆӊӒӃҷҕӐӖґҦҕӈҙӏӓҺқҝӃҞӤӔҶҸҶҽӉӧҭӂӁӎҽӆҽҺһ", (byte)38, 67);
               ZKM_STR_B[10] = NLoginCore_091.C("ҚҊѾҙ҂ѴҙѾҜѵѿ҇ҠѤ҂Ҝ҉ѰѭҌҊҀѵҮ҉ѷҋҪҰҰѰҸ", (byte)38, 67);
               ZKM_STR_B[11] = NLoginCore_110.D("ѶѾѾѮџ҂ѳҝҤѽҤѦѵҜҍѬҢҬѱҌҕҋҥҥҩ҃ғҏҼҖҼҝҙһҙҀҡґҼҹҵҡӅҝ҄ӎҘӋ҇ҲҲңҽҢӑҕҒҙӏҍӉҩҹҮҲӌҲҷӖҼӚӆӖӕҜҶҫҤһӛӊӍӤӡӐӣҺһ", (byte)38, 68);
               ZKM_STR_B[12] = NLoginCore_092.B("ŁĖĿıŁŇĝĄĊĮĦē", (byte)38, 66);
               ZKM_STR_B[13] = NLoginCore_173.C(
                  "ҒҚҘҟѲҕўҞҟҜѶ҅ҬѼҝѻѾҋҲҭҠҦҰҮҴҔҏ҄ҼҾҺҳҜҺҾҮѶӅҗҏҕҡӋҶӃҚҩӄӈӋҨӅҊӂӖҶҭӑӋҺҼҰҿҺқҡҚҞҽӠӞӦӣӪәҿҦҫҧөҼӒӊӉӒҫӀҶӏҰӲҴӰӌҼӹӸӍҽӹӞӁӗӠӡӁӖӏ", (byte)38, 67
               );
               ZKM_STR_B[14] = NLoginCore_223.E("ԙՌՓԙՠԒԶՠԸՄԴզդՁԡԣՃխՆ՛խխ՛ՃՌխլ՟զլգՃՊճԻՊծխԼ՚ԻԾՍՏՠցԿպԽըտֆՎֈատփօ֊հբկ֗և֚՛\u058bզշ\u0590֏լ֓֎գփռ֚֜ֆփո\u058bո֊ֈյն", (byte)38, 69);
               ZKM_STR_B[15] = NLoginCore_232.C("ѱѴѺҜҘўѦѴҁҘҋѝңҦѸѯѾѽҳѱҕҪҞҡ҉ҮҪҩѶ҅ҭҊ", (byte)38, 67);
               ZKM_STR_B[16] = NLoginCore_138.A("ĺĖăĦĻĕĞĉīŋęĈİĲĲōĝĶįŅŁĤłĹřĳĭęœŒĳōķŗİŁĿŤşĵĶŤĹŮŘĬŦĬŭőįŷŬŦœŸűķİŻŀŝļƁŚųŶŇƅƁƅŚŘňŚœ", (byte)38, 65);
               ZKM_STR_B[17] = NLoginCore_027.E("ԖԎԓ՞ՔԪԻԪԮՠՁԺՕՕՆԴԣՖՋՋՁՈԵԶ", (byte)38, 69);
               ZKM_STR_B[18] = NLoginCore_575.A("ŀľāđĶęĶĩĚņčē", (byte)38, 65);
               ZKM_STR_B[19] = NLoginCore_076.B("ĒłļĚŇĩģĈŊĭėĜČĎİīČŇĩĳŋřėōĽŏŔħķŠŀŃĿĢĶŃıśňĵŉĥĩŏľŧťĪťńųŷŹŃŰĺĴŉŧŝƁůūƄ", (byte)38, 66);
               ZKM_STR_B[20] = NLoginCore_433.E("\u0530ԓԧՌՐՙԬԼբԳՑԟՀԳԻՃ՟ՊԾՠ՟հԺԲԮղ\u0530ԬՖիթԳ", (byte)38, 69);
               ZKM_STR_B[21] = NLoginCore_387.C("ѠґѬҀѠҍѽҁѷѼѻҤ҆ѤѪѻѪҍѩѩҠҒ҉҃ҁҸҧҫѵҷѺҎҡҐҐѹңҙүҷҡҙҿ҇ҹҿ҆ҽ҈қӌӄӀңҦӂӇҮҷӓӈҚӝҖқӂӒәӃҡҷҙӜӂӧӥӕӪҿәҹӡҪӍӨӳҺһ", (byte)38, 67);
               ZKM_STR_B[22] = NLoginCore_471.F("ԲԽԗԷ՜ՖԞՙԟԳՏԪ", (byte)38, 70);
               ZKM_STR_B[23] = NLoginCore_427.E("ՋԚԖԝՙ՟ՋԚբ\u0530ԭԪ", (byte)38, 69);
               ZKM_STR_B[24] = NLoginCore_076.D("ҠҍҟњѢҘҜҠҢѴѼҋҦҨҧѥҪҎѫѫҬҟҮҠҮҧҧҳѺҥҺҿҿѸҠҞҥҾҽҤҰҖ҉ҧӉҊҪҜӈґҬӋӑҝҚқ", (byte)38, 68);
               ZKM_STR_B[25] = NLoginCore_201.A("ġĀĂņÿĴĀňĖĿęĺħłŌĜňłŅŘįŇĞğ", (byte)38, 65);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_173.D("њҏҌѲѝѤѵѧџҤѠѫѾҧҧѦѫҦҰҎѦҮ҃ѩҥҵѺҺҊҼҏҘ", (byte)38, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_138.D("ҐѝҎѼҐќҕҚѷҨѣңѥҘѪҘѰѮѨүҠѽѺѻ", (byte)38, 68);
         }
      }
   }

   public NloginunregisterCommand(NLoginType_008 var1) {
      String var10002 = a(c & d, e);
      String var10003 = a(f, g ^ h);
      int var10004 = i;
      int var10005 = j;
      String[] var10006 = new String[k];
      var10006[l] = a(m & n, o);
      super(var1, var10002, var10003, (var10004 != 0), (var10005 != 0), var10006);
   }

   private static String a(int var0, long var1) {
      var1 ^= 29L;
      var1 ^= -9201417024994226076L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(12 + 56),
                     (byte)(7 + 62),
                     (byte)(68 + 15),
                     (byte)(29 + 18),
                     (byte)(63 + 4),
                     (byte)(3 + 63),
                     (byte)(59 + 8),
                     47,
                     (byte)(3 + 77),
                     (byte)(16 + 59),
                     (byte)(66 + 1),
                     (byte)(18 + 65),
                     (byte)(22 + 31),
                     (byte)(9 + 71),
                     (byte)(42 + 55),
                     100,
                     (byte)(94 + 6),
                     (byte)(17 + 88),
                     (byte)(97 + 13),
                     (byte)(49 + 54)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(51 + 17), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.E("ՂՏՎԑՑՍՈՑ՜ՋԘՖ՚ՓՖ՜Ԟ\u0896ࢯࢯࢹࢰ࢞ࢹࢬ࢛ࣁࢽࢣࢰࣂࢯ", (byte)35, 69));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NloginunregisterCommand.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.A("ÅçéÉíČĄĚĆÕēĉėđÚÿġĠĘĞĘí", (byte)15, 65), NloginunregisterCommand.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.D("хђёДєѐыєџюЛљѝіљџСޙ\u07b2\u07b2\u07bc\u07b3ޡ\u07bcޯޞ߄߀ަ\u07b3߅\u07b2м", (byte)15, 68)
               + var1
               + NLoginCore_110.F("ԅ", (byte)15, 70)
               + var2.toString(),
            var4
         );
      }
   }
}
