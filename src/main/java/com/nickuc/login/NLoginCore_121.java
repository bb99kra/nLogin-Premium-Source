package com.nickuc.login;

import com.nickuc.login.api.nLoginAPI;
import com.nickuc.login.lib.json.JSONArray;
import com.nickuc.login.lib.json.JSONObject;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public enum NLoginCore_121 {
   a(NLoginCore_121.ab, a(NLoginCore_121.ac, NLoginCore_121.ad), NLoginType_028.a),
   b,
   c,
   d(NLoginCore_121.bd, a(NLoginCore_121.be, NLoginCore_121.bf ^ NLoginCore_121.bg), NLoginCore_028.b),
   e,
   f,
   g,
   h,
   i,
   j,
   k,
   l,
   m,
   n;

   private final int k;
   private final Method a;
   private final boolean t;
   private final NLoginInterface_019<Object> a;
   private final NLoginInterface_019<Object>[] a;
   private static String[] a = new String[NLoginCore_121.v];
   private static String[] b = new String[NLoginCore_121.w];
   private static long c;
   private static int a = Integer.reverse(0);
   private static int b = Integer.reverse(0);
   private static int c = Integer.reverse(0);
   private static int d = Integer.reverse(0);
   private static int e = (0 >>> 137 | 0 << -137) & -1;
   private static int f = Integer.reverse(1879048192);
   private static int g = 0 >>> 136 | 0 << ~136 + 1;
   private static int h = 268435456 >>> 252 | 268435456 << -252;
   private static int i = Integer.reverse(1073741824);
   private static int j = Integer.reverse(-1073741824);
   private static int l = (64 >>> 68 | 64 << -68) & -1;
   private static int m = Integer.reverse(-1610612736);
   private static int n = (24 >>> 66 | 24 << ~66 + 1) & -1;
   private static int o = (28672 >>> 44 | 28672 << ~44 + 1) & -1;
   private static int p = (2048 >>> 72 | 2048 << -72) & -1;
   private static int q = (-2147483644 >>> 159 | -2147483644 << ~159 + 1) & -1;
   private static int r = (1342177280 >>> 251 | 1342177280 << ~251 + 1) & -1;
   private static int s = Integer.reverse(-805306368);
   private static int t = Integer.reverse(805306368);
   private static int u = Integer.reverse(-1342177280);
   private static int v = Integer.reverse(939524096);
   private static int w = (14 >>> 95 | 14 << ~95 + 1) & -1;
   private static int x = 0 >>> 246 | 0 << -246;
   private static int y = (-1 >>> 58 | -1 << ~58 + 1) & -1;
   private static long z = Long.reverse(1372661448372655613L);
   private static int aa = 0 >>> 113 | 0 << ~113 + 1;
   private static int ab = Integer.reverse(0);
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static long ad = Long.reverse(1372661448372655613L);
   private static int ae = Integer.reverse(0);
   private static int af = Integer.reverse(1073741824);
   private static long ag = Long.reverse(1372661448372655613L);
   private static int ah = (524288 >>> 147 | 524288 << -147) & -1;
   private static int ai = 67108864 >>> 250 | 67108864 << -250;
   private static int aj = 96 >>> 133 | 96 << ~133 + 1;
   private static int ak = Integer.reverse(-1);
   private static long al = Long.reverse(1372661448372655613L);
   private static int am = (536870912 >>> 221 | 536870912 << ~221 + 1) & -1;
   private static int an = Integer.reverse(Integer.MIN_VALUE);
   private static int ao = Integer.reverse(0);
   private static int ap = Integer.reverse(536870912);
   private static long aq = Long.reverse(4831425962193196541L);
   private static long ar = Long.reverse(5764607523034234880L);
   private static int as = 16777216 >>> 23 | 16777216 << ~23 + 1;
   private static int at = (262144 >>> 145 | 262144 << ~145 + 1) & -1;
   private static int au = (83886080 >>> 248 | 83886080 << -248) & -1;
   private static int av = -1 >>> 75 | -1 << ~75 + 1;
   private static long aw = Long.reverse(1372661448372655613L);
   private static int ax = Integer.reverse(Integer.MIN_VALUE);
   private static int ay = Integer.reverse(0);
   private static int az = Integer.reverse(1610612736);
   private static long ba = Long.reverse(4831425962193196541L);
   private static long bb = Long.reverse(5764607523034234880L);
   private static int bc = 6291456 >>> 85 | 6291456 << ~85 + 1;
   private static int bd = Integer.reverse(-1342177280);
   private static int be = (224 >>> 133 | 224 << ~133 + 1) & -1;
   private static long bf = Long.reverse(4831425962193196541L);
   private static long bg = Long.reverse(5764607523034234880L);
   private static int bh = Integer.reverse(0);
   private static int bi = Integer.reverse(268435456);
   private static long bj = Long.reverse(4831425962193196541L);
   private static long bk = Long.reverse(5764607523034234880L);
   private static int bl = Integer.reverse(536870912);
   private static int bm = Integer.reverse(-1073741824);
   private static int bn = Integer.reverse(-1879048192);
   private static long bo = Long.reverse(4831425962193196541L);
   private static long bp = Long.reverse(5764607523034234880L);
   private static int bq = Integer.reverse(Integer.MIN_VALUE);
   private static int br = 0 >>> 188 | 0 << -188;
   private static int bs = (83886080 >>> 119 | 83886080 << -119) & -1;
   private static int bt = -1 >>> 86 | -1 << ~86 + 1;
   private static long bu = Long.reverse(1372661448372655613L);
   private static int bv = Integer.reverse(-1610612736);
   private static int bw = (4194304 >>> 84 | 4194304 << ~84 + 1) & -1;
   private static int bx = (704 >>> 38 | 704 << ~38 + 1) & -1;
   private static long by = Long.reverse(4831425962193196541L);
   private static long bz = Long.reverse(5764607523034234880L);
   private static int ca = (8192 >>> 141 | 8192 << ~141 + 1) & -1;
   private static int cb = 0 >>> 171 | 0 << ~171 + 1;
   private static int cc = Integer.reverse(805306368);
   private static long cd = Long.reverse(4831425962193196541L);
   private static long ce = Long.reverse(5764607523034234880L);
   private static int cf = 12 >>> 97 | 12 << ~97 + 1;
   private static int cg = Integer.reverse(-1610612736);
   private static int ch = 52 >>> 2 | 52 << ~2 + 1;
   private static long ci = Long.reverse(4831425962193196541L);
   private static long cj = Long.reverse(5764607523034234880L);
   private static int ck = (8388608 >>> 118 | 8388608 << ~118 + 1) & -1;
   private static int cl = (0 >>> 225 | 0 << ~225 + 1) & -1;
   private static int cm = (512 >>> 233 | 512 << ~233 + 1) & -1;
   private static int cn = Integer.reverse(1879048192);
   private static long co = Long.reverse(4831425962193196541L);
   private static long cp = Long.reverse(5764607523034234880L);
   private static int cq = (939524096 >>> 155 | 939524096 << ~155 + 1) & -1;
   private static int cr = Integer.reverse(1610612736);
   private static int cs = Integer.reverse(-268435456);
   private static long ct = Long.reverse(1372661448372655613L);
   private static int cu = -1073741824 >>> 190 | -1073741824 << -190;
   private static int cv = 0 >>> 163 | 0 << -163;
   private static int cw = Integer.reverse(Integer.MIN_VALUE);
   private static int cx = Integer.reverse(1073741824);
   private static int cy = 268435456 >>> 184 | 268435456 << -184;
   private static long cz = Long.reverse(1372661448372655613L);
   private static int da = Integer.MIN_VALUE >>> 220 | Integer.MIN_VALUE << -220;
   private static int db = (1792 >>> 232 | 1792 << ~232 + 1) & -1;
   private static int dc = Integer.reverse(-2013265920);
   private static int dd = Integer.reverse(-1);
   private static long de = Long.reverse(1372661448372655613L);
   private static int df = (65536 >>> 208 | 65536 << -208) & -1;
   private static int dg = (0 >>> 61 | 0 << -61) & -1;
   private static int dh = Integer.reverse(1207959552);
   private static int di = -1 >>> 139 | -1 << -139;
   private static long dj = Long.reverse(1372661448372655613L);
   private static int dk = (9216 >>> 234 | 9216 << ~234 + 1) & -1;
   private static int dl = 536870912 >>> 218 | 536870912 << -218;
   private static int dm = Integer.reverse(-939524096);
   private static int dn = Integer.reverse(-1);
   private static long var_do = Long.reverse(1372661448372655613L);
   private static int dp = (524288 >>> 114 | 524288 << -114) & -1;
   private static int dq = (0 >>> 65 | 0 << -65) & -1;
   private static int dr = (1073741824 >>> 254 | 1073741824 << ~254 + 1) & -1;
   private static int ds = 'ꀀ' >>> 235 | 40960 << -235;
   private static int dt = -1 >>> 121 | -1 << ~121 + 1;
   private static long du = Long.reverse(1372661448372655613L);
   private static int dv = 41943040 >>> 150 | 41943040 << -150;
   private static int dw = (576 >>> 6 | 576 << ~6 + 1) & -1;
   private static int dx = Integer.reverse(-1476395008);
   private static long dy = Long.reverse(4831425962193196541L);
   private static long dz = Long.reverse(5764607523034234880L);
   private static int ea = (8388608 >>> 54 | 8388608 << ~54 + 1) & -1;
   private static int eb = 0 >>> 229 | 0 << ~229 + 1;
   private static int ec = 2 >>> 129 | 2 << -129;
   private static int ed = (176 >>> 3 | 176 << ~3 + 1) & -1;
   private static long ee = Long.reverse(4831425962193196541L);
   private static long ef = Long.reverse(5764607523034234880L);
   private static int eg = Integer.reverse(-805306368);
   private static int eh = Integer.reverse(1342177280);
   private static int ei = Integer.reverse(-402653184);
   private static long ej = Long.reverse(1372661448372655613L);
   private static int ek = (2 >>> 160 | 2 << -160) & -1;
   private static int el = (0 >>> 207 | 0 << -207) & -1;
   private static int em = (64 >>> 134 | 64 << -134) & -1;
   private static int en = Integer.reverse(402653184);
   private static long eo = Long.reverse(1372661448372655613L);
   private static int ep = Integer.reverse(805306368);
   private static int eq = (196608 >>> 238 | 196608 << -238) & -1;
   private static int er = Integer.reverse(-1744830464);
   private static long es = Long.reverse(4831425962193196541L);
   private static long et = Long.reverse(5764607523034234880L);
   private static int eu = Integer.reverse(1073741824);
   private static int ev = (0 >>> 214 | 0 << -214) & -1;
   private static int ew = 524288 >>> 211 | 524288 << ~211 + 1;
   private static int ex = 13631488 >>> 19 | 13631488 << ~19 + 1;
   private static long ey = Long.reverse(4831425962193196541L);
   private static long ez = Long.reverse(5764607523034234880L);
   private static int fa = -2147483642 >>> 191 | -2147483642 << ~191 + 1;
   private static int fb = 44 >>> 130 | 44 << ~130 + 1;
   private static int fc = Integer.reverse(-671088640);
   private static long fd = Long.reverse(4831425962193196541L);
   private static long fe = Long.reverse(5764607523034234880L);
   private static int ff = Integer.reverse(1073741824);
   private static int fg = Integer.reverse(0);
   private static int fh = Integer.reverse(Integer.MIN_VALUE);

   private NLoginCore_121(int var3, String var4, NLoginInterface_019<?> var5, NLoginInterface_019<?>... var6) {
      this(var3, var4, (boolean)a, var5, var6);
   }

   @Generated
   public NLoginInterface_019<Object> a() {
      return this.a;
   }

   private static void b() {
      c = -4636450520511991614L;
      long var0 = c ^ 3392356188992231089L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(43 + 26),
               (byte)(65 + 18),
               (byte)(25 + 22),
               (byte)(50 + 17),
               (byte)(48 + 18),
               (byte)(35 + 32),
               (byte)(35 + 12),
               80,
               (byte)(65 + 10),
               (byte)(22 + 45),
               (byte)(28 + 55),
               (byte)(3 + 50),
               80,
               (byte)(37 + 60),
               (byte)(60 + 40),
               (byte)(11 + 89),
               (byte)(6 + 99),
               (byte)(53 + 57),
               (byte)(77 + 26)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(32 + 37), (byte)(72 + 11)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_559.D("хмжѴязѹѕѡрѾѰѳљѕ҉Ѽ҆ѦҐѩѤѩҍѬѲѯ҃ҖҋіѼ", (byte)26, 68);
               b[1] = NLoginCore_387.C("вѱѯйѯјѾпѕџ҂҆фѷѦѤѼѶэ҅Ѫҏії", (byte)26, 67);
               b[2] = NLoginCore_138.F("ՊԜԦԽԨ\u0530ՂԳԒԪՈԐԓԳԚԨԨՉԫԬԳբԩԪ", (byte)26, 70);
               b[3] = NLoginCore_127.C("шыьѨмкѰќљѵ҄яћуҀєѩпцҍњҏії", (byte)26, 67);
               b[4] = NLoginCore_183.C("ѷщѓѪѕѝѯѠпїѴйѷхѣҌѼѶэҁѺѼѲ҂ѧҏєѵѯѳѪѲ", (byte)26, 67);
               b[5] = NLoginCore_427.C("шыьѨмкѰќљѵ҆Ѻ҅ҀѸѬ҂ҀҁҎҌѩії", (byte)26, 67);
               b[6] = NLoginCore_091.A("ħùăĚąčğĐïćĤĩčóęĐčûĳùĮĺĭĕŃüĔùĶĕęĢ", (byte)26, 65);
               b[7] = NLoginCore_433.D("шыьѨмкѰќљѵ҄ѣўѓѕўѥ҅рѣѐѿії", (byte)26, 68);
               b[8] = NLoginCore_397.B("ĆĝíČĚïèĴąĵĆĔĆĮķĊĶīĭþěęĻĠĢŁŀĆĜļĥĠ", (byte)26, 66);
               b[9] = NLoginCore_183.D("єѥѲѵѬѵлкѺњќѨхѦјѡіѾ҈щѠҏії", (byte)26, 68);
               b[10] = NLoginCore_092.F("ԝԐԲՆԱՈՀԕԐԔԧԔԺՋԜ՚ՕԸԗԭՑԴԼԺՠՅԴ\u0558ԻԻՖժ", (byte)26, 70);
               b[11] = NLoginCore_384.C("ыѪьйіѹҀѽѾџіѐ҈ћѫїіщѽћ҄ѯѮ҈ҋяҏѭҏѳѩ҆", (byte)26, 67);
               b[12] = NLoginCore_141.F("ԤԇԣԾՐԼՏԩՂԧՄՇՐԨԼԶ՟ԺՋՒ\u0557\u0558ԤՎ\u0558ԟԨԽ\u0558գ՚ԭ", (byte)26, 70);
               b[13] = NLoginCore_397.E("ՎՃԬՆԡԠԧԑԦԱՍԑԛ՝ՏԙԑԼԜԺԷԬԩԪ", (byte)26, 69);
               b[14] = NLoginCore_471.B("ħæĈĤāïéįĆđĄĥĤĤúøĩćČěĿùĒĶķĒľŃĖŁęļ", (byte)26, 66);
               b[15] = NLoginCore_138.A("ĔíĎĉćêĝĐĪąíïĸĳİĪčĭðĝĉĉĆć", (byte)26, 65);
               b[16] = NLoginCore_110.A("ħæĈĤāïéįĆđąāĪĥĎĻ÷ĲğęįğĭİŁŁĞĵĆŅĔī", (byte)26, 65);
               b[17] = NLoginCore_451.F("ԎԱԎԝԉՁԇՅՁԘԸԙԹՙԱՊԧՙՌՠՑՕՆԦԱԞԸ՛ԼՈբ՟", (byte)26, 70);
               b[18] = NLoginCore_110.E("ԙԞԻՅԭՑԾՂԣԥԘ\u0530ՇԴ\u0558ՇԲՁՍ՝ՑԬԩԪ", (byte)26, 69);
               b[19] = NLoginCore_241.C("ѩмїоѿлйѿѰрѮйѱ҄Ҋ҄҈ҋѷцьҏії", (byte)26, 67);
               b[20] = NLoginCore_138.A("ģĦöùąĐĀûĔðöĥöıøČċąėĺĽĿĆć", (byte)26, 65);
               b[21] = NLoginCore_141.D("ћѭђёѝѽѢлуѵнѥѣщҀѽҀѬљцҌҏії", (byte)26, 68);
               b[22] = NLoginCore_091.D("щѩѴђѫѹ҂эк҂Ѿ҇ѐєѝ҉ѡѾѽ҆шѩії", (byte)26, 68);
               b[23] = NLoginCore_575.C("Ѹѥщѓѝќюлѯінњѐѳхєҋ҃цҊѧҏії", (byte)26, 67);
               b[24] = NLoginCore_091.F("ԽԡԞԉԞԆՀՅՄԶՉԌՍ՛ԙԩ՚ՁՍԹՒԼԩԪ", (byte)26, 70);
               b[25] = NLoginCore_553.E("ԌԝՍԥՃԜԟՍԯԭԏԻԸՍ\u0530ԻԽՀԞՖԚբԩԪ", (byte)26, 69);
               b[26] = NLoginCore_201.E("ԞԍՌԽՒԯԍ\u0557ՊՌՉ՛ՎՋԨԾԘԟԠ՜ՀԼԩԪ", (byte)26, 69);
               b[27] = NLoginCore_324.B("÷öæĈĆđĎĭĊýĄĄðĔĩěćĪĶĿğĿĆć", (byte)26, 66);
               break;
            case 1:
               b[0] = NLoginCore_223.A("õìæĤÿçĩąđðĮĠģĉąĹĬĶĖŀęčĢĭĞŅŇĆĥŅīĂ", (byte)26, 65);
               b[1] = NLoginCore_091.F("ԅՄՂԌՂԫՑԒԨԲՖԒ՚ՆԚՉԚ\u0530ՠ\u0557ԙՠեՅԵէգՉէԪ՟ա", (byte)26, 70);
               b[2] = NLoginCore_076.E("ՊԜԦԽԨ\u0530ՂԳԒԪՉԓԶԽ՜ԵԪԯՕԘԺբԩԪ", (byte)26, 69);
               b[3] = NLoginCore_173.E("ԛԞԟԻԏԍՃԯԬՈ\u0557ՙ\u0558ԷԷԪԗԛՏՃՔբԩԪ", (byte)26, 69);
               b[4] = NLoginCore_138.C("ѷщѓѪѕѝѯѠпїѴйѷхѣҌѼѶэҁѺѽ҉ъѳяіѫҕҊ҉љ", (byte)26, 67);
               b[5] = NLoginCore_471.A("øûüĘìêĠČĉĥĴñċįĤĕļöĎùĶČôĸýĘĚğĐĉėŁ", (byte)26, 65);
               b[6] = NLoginCore_521.D("ѷщѓѪѕѝѯѠпїѴѹѝуѩѠѝы҃щѾ҄ҏѨўѴѨѕҍѓѴҖ", (byte)26, 68);
               b[7] = NLoginCore_453.C("шыьѨмкѰќљѵ҇рѱўјѣѽ҉їѫтѹў҃єђџѯѨѶ҉қ", (byte)26, 67);
               b[8] = NLoginCore_559.C("іѭнќѪпи҄ѕ҅іѤіѾ҇њ҆ѻѽюѫѪҀэѩѢѠяѢѢ҈ј", (byte)26, 67);
               b[9] = NLoginCore_110.C("єѥѲѵѬѵлкѺњњѦучџѠ҆ъѹѯўҐҏѳѱѭьіюғђѰ", (byte)26, 67);
               b[10] = NLoginCore_141.F("ԝԐԲՆԱՈՀԕԐԔԧԔԺՋԜ՚ՕԸԗԭՑԸԳԯԸԸԥ\u0557՞՜՜ԥԷԮ՛ՋիէՌ՟մղՁԾ", (byte)26, 70);
               b[11] = NLoginCore_559.E("ԞԽԟԌԩՌՓՐՑԲԩԣ՛ԮԾԪԩԜՐԮ\u0557ՅԱՄԞ՞ԸդՉԶբՋ", (byte)26, 69);
               b[12] = NLoginCore_232.E("ԤԇԣԾՐԼՏԩՂԧՄՇՐԨԼԶ՟ԺՋՒ\u0557՟ԮԢ\u0558Ԛ՟ԸդՇժԪ", (byte)26, 69);
               b[13] = NLoginCore_223.D("ѻѰљѳюэєоѓўѸосѪѫічѶҎьэґѡѯѼҐ҈ѤєѢҋѴ", (byte)26, 68);
               b[14] = NLoginCore_384.F("ՊԉԫՇԤԒԌՒԩԴԧՈՇՇԝԛՌԪԯԾբԣԵԸզ\u0558Չԥ՟թ՝Թ", (byte)26, 70);
               b[15] = NLoginCore_201.E("ԷԐԱԬԪԍՀԳՍԨԑԪԍ՜ԫ՞ԾԗԾԶԱԴ\u0558ԝԱԸԥԣբզեԻ", (byte)26, 69);
               b[16] = NLoginCore_173.D("ѷжјѴёпйѿіѡѕёѺѵўҋч҂ѯѩѿѬѯ҉ѐѦҔяѯѥљҖ", (byte)26, 68);
               b[17] = NLoginCore_453.C("лўлъжѮдѲѮхѥцѦ҆ўѷє҆ѹҍѾҍфѢцѣѬѯҍѣѣћ", (byte)26, 67);
               b[18] = NLoginCore_446.D("цыѨѲњѾѫѯѐђцџтџќ҃ьѣѶъҀҀћѫђҎѧѱҕёҚ҅", (byte)26, 68);
               b[19] = NLoginCore_091.F("ԼԏԪԑՒԎԌՒՃԓՁՙՍ՛ԹԱԕՖԯԔՙԶՙԵՁ՛էաՁԺԨ՝", (byte)26, 70);
               b[20] = NLoginCore_092.B("ģĦöùąĐĀûĔðèĐĮĆĚúķīļþĒįĆć", (byte)26, 66);
               b[21] = NLoginCore_384.C("ћѭђёѝѽѢлуѵофќхїїҋь҃ҍшѿії", (byte)26, 67);
               b[22] = NLoginCore_110.A("ùęĤĂěĩĲýêĲĮĘĥĹĻôĸį÷ĭČįĆć", (byte)26, 65);
               b[23] = NLoginCore_127.A("ĨĕùăčČþëğĆðıĳăĮĦĎĝôĚķĉĆć", (byte)26, 65);
               b[24] = NLoginCore_091.C("ѪюыжыгѭѲѱѣѶѺїёфсѡхѻҏљѿії", (byte)26, 67);
               b[25] = NLoginCore_092.A("éúĪĂĠùüĪČĊèĸĤēúĪıďČėĳĉĆć", (byte)26, 65);
               b[26] = NLoginCore_530.D("ыкѹѪѿќк҄ѷѹѴѯ҅ѷҁ҃ѡ҆ј҅Ѱљії", (byte)26, 68);
               b[27] = NLoginCore_183.E("ԚԙԉԫԩԴԱՐԭԠԨԥ՛ԱՍՕ՛ՠԫՊՐՒԩԪ", (byte)26, 69);
               break;
            case 2:
               b[0] = NLoginCore_091.F("ԍԍՊՐՏՐԎՄԮԒԐԞ", (byte)26, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_453.A("ĀĮçøČëýåğçõû", (byte)26, 65);
         }
      }
   }

   @Generated
   public int b() {
      return this.k;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_121.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.D("бѓѕељѸѰ҆Ѳсѿѵ҃ѽцѫҍҌ҄Ҋ҄љ", (byte)28, 68), NLoginCore_121.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(NLoginCore_575.C("ѬѹѸлѻѷѲѻ҆ѵтҀ҄ѽҀ҆шߕߢߏߖ߆ߙߗߗߣѝ", (byte)28, 67) + var1 + NLoginCore_521.F("Ԓ", (byte)28, 70) + var2.toString(), var4);
      }
   }

   public JSONArray a(Object... var1) {
      JSONArray var2 = new JSONArray();

      for (int var3 = b; var3 < this.a.length; var3++) {
         var2.put(var3, this.a[var3].a(var1[var3]));
      }

      return var2;
   }

   public Object[] a(JSONArray var1) {
      Object[] var2 = new Object[var1.length()];

      for (int var3 = c; var3 < var2.length; var3++) {
         JSONObject var4 = var1.getJSONObject(var3);
         var2[var3] = this.a[var3].a(var4);
      }

      return var2;
   }

   @Generated
   public boolean k() {
      return this.t;
   }

   public Object a(nLoginAPI var1, Object... var2) {
      return this.a.invoke(var1, var2);
   }

   private void p() {
   }

   @Generated
   public NLoginInterface_019<Object>[] a() {
      return this.a;
   }

   @Nullable
   public static NLoginCore_121 a(int var0) {
      NLoginCore_121[] var1 = values();
      int var2 = var1.length;

      for (int var3 = d; var3 < var2; var3++) {
         NLoginCore_121 var4 = var1[var3];
         if (var0 == var4.k) {
            return var4;
         }
      }

      return null;
   }

   private NLoginCore_121(int var3, String var4, boolean var5, NLoginInterface_019<?> var6, NLoginInterface_019<?>... var7) {
      this.k = var3;
      this.t = var5;
      this.a = var6;
      this.a = var7;
      Class[] var8 = Arrays.stream(var7).map(NLoginInterface_019::a).toArray(Class[]::new);

      try {
         this.a = nLoginAPI.class.getMethod(var4, var8);
      } catch (NoSuchMethodException var10) {
         throw new RuntimeException(var10);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 10L;
      var1 ^= 3392356188992231089L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(49 + 19),
                     69,
                     (byte)(25 + 58),
                     (byte)(15 + 32),
                     (byte)(8 + 59),
                     (byte)(58 + 8),
                     (byte)(43 + 24),
                     47,
                     (byte)(34 + 46),
                     (byte)(62 + 13),
                     (byte)(28 + 39),
                     (byte)(16 + 67),
                     (byte)(37 + 16),
                     (byte)(19 + 61),
                     (byte)(21 + 76),
                     (byte)(34 + 66),
                     (byte)(12 + 88),
                     (byte)(3 + 102),
                     (byte)(25 + 85),
                     (byte)(98 + 5)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(41 + 28), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_110.D("ҷӄӃ҆ӆӂҽӆӑӀҍӋӏӈӋӑғࠠ࠭ࠚࠡࠑࠤࠢࠢ\u082e", (byte)53, 68));
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

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      b();
      String var10002 = a(af, ag);
      int var10003 = ah;
      int var10004 = ai;
      String var10005 = a(aj & ak, al);
      int var10006 = am;
      NLoginType_003 var10007 = NLoginType_003.a;
      NLoginInterface_019[] var10008 = new NLoginInterface_019[an];
      var10008[ao] = NLoginCore_452.a;
      b = new NLoginCore_121(var10004, var10005, (boolean)var10006, var10007, var10008);
      var10002 = a(ap, aq ^ ar);
      var10003 = as;
      var10004 = at;
      var10005 = a(au & av, aw);
      NLoginCore_125 var44 = NLoginCore_125.a;
      NLoginInterface_019[] var55 = new NLoginInterface_019[ax];
      var55[ay] = NLoginCore_028.a;
      c = new NLoginCore_121(var10004, var10005, var44, var55);
      var10002 = a(bi, bj ^ bk);
      var10003 = bl;
      var10004 = bm;
      var10005 = a(bn, bo ^ bp);
      NLoginCore_028 var45 = NLoginCore_028.b;
      NLoginInterface_019[] var56 = new NLoginInterface_019[bq];
      var56[br] = NLoginCore_452.a;
      e = new NLoginCore_121(var10004, var10005, var45, var56);
      var10002 = a(bs & bt, bu);
      var10003 = bv;
      var10004 = bw;
      var10005 = a(bx, by ^ bz);
      NLoginCore_028 var46 = NLoginCore_028.b;
      NLoginInterface_019[] var57 = new NLoginInterface_019[ca];
      var57[cb] = NLoginCore_452.a;
      f = new NLoginCore_121(var10004, var10005, var46, var57);
      var10002 = a(cc, cd ^ ce);
      var10003 = cf;
      var10004 = cg;
      var10005 = a(ch, ci ^ cj);
      NLoginCore_028 var47 = NLoginCore_028.c;
      NLoginInterface_019[] var58 = new NLoginInterface_019[ck];
      var58[cl] = NLoginType_003.a;
      var58[cm] = NLoginCore_028.a;
      g = new NLoginCore_121(var10004, var10005, var47, var58);
      var10002 = a(cn, co ^ cp);
      var10003 = cq;
      var10004 = cr;
      var10005 = a(cs, ct);
      NLoginCore_028 var48 = NLoginCore_028.c;
      NLoginInterface_019[] var59 = new NLoginInterface_019[cu];
      var59[cv] = NLoginCore_452.a;
      var59[cw] = NLoginCore_028.a;
      var59[cx] = NLoginCore_028.a;
      h = new NLoginCore_121(var10004, var10005, var48, var59);
      var10002 = a(cy, cz);
      var10003 = da;
      var10004 = db;
      var10005 = a(dc & dd, de);
      NLoginCore_028 var49 = NLoginCore_028.c;
      NLoginInterface_019[] var60 = new NLoginInterface_019[df];
      var60[dg] = NLoginCore_452.a;
      i = new NLoginCore_121(var10004, var10005, var49, var60);
      var10002 = a(dh & di, dj);
      var10003 = dk;
      var10004 = dl;
      var10005 = a(dm & dn, var_do);
      NLoginCore_028 var50 = NLoginCore_028.c;
      NLoginInterface_019[] var61 = new NLoginInterface_019[dp];
      var61[dq] = NLoginCore_452.a;
      var61[dr] = NLoginCore_028.a;
      j = new NLoginCore_121(var10004, var10005, var50, var61);
      var10002 = a(ds & dt, du);
      var10003 = dv;
      var10004 = dw;
      var10005 = a(dx, dy ^ dz);
      NLoginCore_028 var51 = NLoginCore_028.c;
      NLoginInterface_019[] var62 = new NLoginInterface_019[ea];
      var62[eb] = NLoginCore_452.a;
      var62[ec] = NLoginCore_028.a;
      k = new NLoginCore_121(var10004, var10005, var51, var62);
      var10002 = a(ed, ee ^ ef);
      var10003 = eg;
      var10004 = eh;
      var10005 = a(ei, ej);
      NLoginCore_028 var52 = NLoginCore_028.c;
      NLoginInterface_019[] var63 = new NLoginInterface_019[ek];
      var63[el] = NLoginCore_452.a;
      var63[em] = NLoginCore_028.d;
      l = new NLoginCore_121(var10004, var10005, var52, var63);
      var10002 = a(en, eo);
      var10003 = ep;
      var10004 = eq;
      var10005 = a(er, es ^ et);
      NLoginCore_028 var53 = NLoginCore_028.c;
      NLoginInterface_019[] var64 = new NLoginInterface_019[eu];
      var64[ev] = NLoginCore_452.a;
      var64[ew] = NLoginCore_028.a;
      m = new NLoginCore_121(var10004, var10005, var53, var64);
      var10002 = a(ex, ey ^ ez);
      var10003 = fa;
      var10004 = fb;
      var10005 = a(fc, fd ^ fe);
      NLoginCore_028 var54 = NLoginCore_028.c;
      NLoginInterface_019[] var65 = new NLoginInterface_019[ff];
      var65[fg] = NLoginCore_452.a;
      var65[fh] = NLoginCore_028.c;
      n = new NLoginCore_121(var10004, var10005, var54, var65);
   }

   public static void load() {
      NLoginCore_121[] var0 = values();
      int var1 = var0.length;

      for (int var2 = e; var2 < var1; var2++) {
         NLoginCore_121 var3 = var0[var2];
         var3.p();
      }
   }
}
