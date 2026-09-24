package com.nickuc.login;

import com.nickuc.login.api.enums.TwoFactorType;
import com.nickuc.login.api.enums.event.EventEnum;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ξΩνεξτεθΩΓυςπΩε extends εκΓγΣΔφυεΛΩρ {
   private static int gk = Integer.reverse(1073741824);
   private static int in = (64 >>> 230 | 64 << ~230 + 1) & -1;
   private static int fc = (3456 >>> 7 | 3456 << ~7 + 1) & -1;
   private static int cm = Integer.reverse(1073741824);
   private static int ia = (0 >>> 80 | 0 << ~80 + 1) & -1;
   private static int gy = (18432 >>> 201 | 18432 << -201) & -1;
   private static int kj = (2944 >>> 38 | 2944 << -38) & -1;
   private static int gt = Integer.reverse(Integer.MIN_VALUE);
   private static int kb = Integer.reverse(872415232);
   private static int er = Integer.reverse(0);
   private static int jw = 0 >>> 28 | 0 << ~28 + 1;
   private static int gs = (Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1) & -1;
   private static long dt = Long.reverse(6918091554182798006L);
   private static int bu = 160 >>> 165 | 160 << ~165 + 1;
   private static int iz = 0 >>> 42 | 0 << ~42 + 1;
   private static int ef = 262144 >>> 50 | 262144 << -50;
   private static int bp = Integer.reverse(Integer.MIN_VALUE);
   private static int ba = Integer.reverse(-1);
   private static long fd = Long.reverse(6918091554182798006L);
   private static long kg = Long.reverse(6918091554182798006L);
   private static long dw = Long.reverse(-7637542441478645066L);
   private static long fk = Long.reverse(6918091554182798006L);
   private static int io = (0 >>> 36 | 0 << ~36 + 1) & -1;
   private static int gg = Integer.reverse(Integer.MIN_VALUE);
   private static int ej = Integer.reverse(-1744830464);
   private static int hi = -1 >>> 225 | -1 << -225;
   private static int gm = Integer.reverse(-1);
   private static int ey = Integer.reverse(-1);
   private static long cy = Long.reverse(-7637542441478645066L);
   private static int eb = 33554432 >>> 56 | 33554432 << -56;
   private static int js = (0 >>> 19 | 0 << ~19 + 1) & -1;
   private static int fg = Integer.reverse(939524096);
   private static long jk = Long.reverse(-7637542441478645066L);
   private static int iq = (0 >>> 114 | 0 << -114) & -1;
   private static int bo = 8388608 >>> 86 | 8388608 << ~86 + 1;
   private static int gh = 67584 >>> 43 | 67584 << -43;
   private static int jj = Integer.reverse(1409286144);
   private static long bv = Long.reverse(-7637542441478645066L);
   private static int ca = Integer.reverse(0);
   private static int gu = 0 >>> 249 | 0 << ~249 + 1;
   private static int az = (0 >>> 251 | 0 << ~251 + 1) & -1;
   private static long cg = Long.reverse(-7637542441478645066L);
   private static long kl = Long.reverse(-7637542441478645066L);
   private static long br = Long.reverse(6918091554182798006L);
   private static long gb = Long.reverse(-720575940379279360L);
   private static int ep = 128 >>> 71 | 128 << -71;
   private static int hf = Integer.reverse(1610612736);
   private static int cj = Integer.reverse(Integer.MIN_VALUE);
   private static long df = Long.reverse(6918091554182798006L);
   private static long dg = Long.reverse(-720575940379279360L);
   private static long bk = Long.reverse(-7637542441478645066L);
   private static int ju = (-1073741813 >>> 158 | -1073741813 << -158) & -1;
   private static int fw = Integer.reverse(Integer.MIN_VALUE);
   private static int av = Integer.reverse(0);
   private static int ke = (32 >>> 100 | 32 << ~100 + 1) & -1;
   private static int hk = Integer.reverse(1677721600);
   private static int ch = (16777216 >>> 183 | 16777216 << -183) & -1;
   private static long ez = Long.reverse(-7637542441478645066L);
   private static int gw = (-1 >>> 212 | -1 << -212) & -1;
   private static long gf = Long.reverse(-720575940379279360L);
   private static int ib = (131072 >>> 113 | 131072 << ~113 + 1) & -1;
   private static int jg = 67108864 >>> 217 | 67108864 << -217;
   private static int fy = Integer.reverse(-1);
   private static int de = (960 >>> 166 | 960 << -166) & -1;
   private static int aw = Integer.reverse(Integer.MIN_VALUE);
   private static int jm = Integer.reverse(0);
   private static int cz = Integer.reverse(-1342177280);
   private static int ik = (0 >>> 173 | 0 << -173) & -1;
   private static long dq = Long.reverse(6918091554182798006L);
   private static int jo = Integer.reverse(1073741824);
   private static int et = Integer.reverse(0);
   private static int gp = Integer.reverse(0);
   private static final List<String> f;
   private static int ea = 0 >>> 1 | 0 << -1;
   private static long fo = Long.reverse(6918091554182798006L);
   private static int gq = 0 >>> 155 | 0 << -155;
   private static int iw = (167936 >>> 12 | 167936 << -12) & -1;
   private static int bm = Integer.reverse(1073741824);
   private static long bz = Long.reverse(-720575940379279360L);
   private static int dh = (1073741824 >>> 186 | 1073741824 << ~186 + 1) & -1;
   private static int hy = Integer.reverse(0);
   private static int is = Integer.reverse(Integer.MIN_VALUE);
   private static int jh = Integer.reverse(0);
   private static int jx = Integer.reverse(-738197504);
   private static int jc = Integer.reverse(0);
   private static long iy = Long.reverse(-7637542441478645066L);
   private static long cd = Long.reverse(-720575940379279360L);
   private static int kf = Integer.reverse(-1275068416);
   private static int dv = (1376256 >>> 240 | 1376256 << ~240 + 1) & -1;
   private static int cr = Integer.reverse(1342177280);
   private static long di = Long.reverse(6918091554182798006L);
   private static int hw = (16 >>> 195 | 16 << ~195 + 1) & -1;
   private static long hp = Long.reverse(-720575940379279360L);
   private static int cv = (-1 >>> 220 | -1 << ~220 + 1) & -1;
   private static int hn = Integer.reverse(-469762048);
   private static int ed = Integer.reverse(-402653184);
   private static int jb = 268435456 >>> 252 | 268435456 << ~252 + 1;
   private static int kk = Integer.reverse(-1);
   private static int iu = Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1;
   private static int ip = (Integer.MIN_VALUE >>> 127 | Integer.MIN_VALUE << ~127 + 1) & -1;
   private static int hd = (0 >>> 93 | 0 << ~93 + 1) & -1;
   private static String[] c = new String[ξΩνεξτεθΩΓυςπΩε.jt];
   private static int eo = Integer.reverse(0);
   private static long kd = Long.reverse(-720575940379279360L);
   private static int je = 0 >>> 101 | 0 << -101;
   private static int hg = Integer.reverse(0);
   private static int cf = Integer.reverse(-1);
   private static long ei = Long.reverse(-7637542441478645066L);
   private static int jq = Integer.reverse(536870912);
   private static long dc = Long.reverse(6918091554182798006L);
   private static int go = (48 >>> 36 | 48 << -36) & -1;
   private static int hu = Integer.reverse(0);
   private static int ji = (16777216 >>> 184 | 16777216 << ~184 + 1) & -1;
   private static long cw = Long.reverse(-7637542441478645066L);
   private static long ho = Long.reverse(6918091554182798006L);
   private static int bc = (16 >>> 196 | 16 << ~196 + 1) & -1;
   private static long jz = Long.reverse(-720575940379279360L);
   private static int dn = Integer.reverse(1207959552);
   private static int dy = 5632 >>> 232 | 5632 << ~232 + 1;
   private static long dz = Long.reverse(-7637542441478645066L);
   private static long gx = Long.reverse(-7637542441478645066L);
   private static long be = Long.reverse(-720575940379279360L);
   private static long fl = Long.reverse(-720575940379279360L);
   private static int iv = (0 >>> 131 | 0 << -131) & -1;
   private static int jl = Integer.reverse(-1610612736);
   private static int ij = Integer.reverse(1073741824);
   private static long da = Long.reverse(-7637542441478645066L);
   private static int fb = Integer.reverse(0);
   private static int en = Integer.reverse(0);
   private static int bf = (16384 >>> 45 | 16384 << -45) & -1;
   private static int bq = Integer.reverse(536870912);
   private static int fv = Integer.reverse(0);
   private static long gi = Long.reverse(6918091554182798006L);
   private static int dx = Integer.reverse(0);
   private static int cp = Integer.reverse(-1);
   private static long if = Long.reverse(-7637542441478645066L);
   private static int jn = 4096 >>> 76 | 4096 << -76;
   private static int db = (234881024 >>> 216 | 234881024 << -216) & -1;
   private static int il = (16384 >>> 110 | 16384 << ~110 + 1) & -1;
   private static long hm = Long.reverse(-720575940379279360L);
   private static int es = 16 >>> 36 | 16 << -36;
   private static int ex = (3407872 >>> 81 | 3407872 << -81) & -1;
   private static int fu = 134217728 >>> 218 | 134217728 << ~218 + 1;
   private static long ee = Long.reverse(-7637542441478645066L);
   protected final ιιιττκγβγβτωπ a;
   private static int ic = Integer.reverse(0);
   private static int ig = ('쀀' >>> 'N' | 49152 << -78) & -1;
   private static int bi = 1536 >>> 137 | 1536 << ~137 + 1;
   private static int jp = (24 >>> 195 | 24 << ~195 + 1) & -1;
   private static long ek = Long.reverse(6918091554182798006L);
   private static int fz = Integer.reverse(-134217728);
   private static int ki = (192 >>> 38 | 192 << -38) & -1;
   private static int fh = (-1 >>> 16 | -1 << -16) & -1;
   private static int jv = 134217728 >>> 57 | 134217728 << ~57 + 1;
   private static int gl = Integer.reverse(1140850688);
   private static int ev = 4 >>> 34 | 4 << ~34 + 1;
   private static int hq = (0 >>> 122 | 0 << -122) & -1;
   private static int bx = (12 >>> 129 | 12 << ~129 + 1) & -1;
   private static int ci = 0 >>> 143 | 0 << ~143 + 1;
   private static int dk = 278528 >>> 238 | 278528 << -238;
   private static long gn = Long.reverse(-7637542441478645066L);
   private static long dl = Long.reverse(-7637542441478645066L);
   private static int ie = -1 >>> 188 | -1 << ~188 + 1;
   private static int bn = 8 >>> 131 | 8 << ~131 + 1;
   private static long bs = Long.reverse(-720575940379279360L);
   private static int ay = 3 >>> 32 | 3 << ~32 + 1;
   private static long bg = Long.reverse(6918091554182798006L);
   private static int ff = Integer.reverse(1073741824);
   private static long by = Long.reverse(6918091554182798006L);
   private static int id = (83886080 >>> 21 | 83886080 << ~21 + 1) & -1;
   private static long dj = Long.reverse(-720575940379279360L);
   private static long fp = Long.reverse(-720575940379279360L);
   private static long e;
   private static int hx = (64 >>> 38 | 64 << -38) & -1;
   private static int hb = Integer.reverse(0);
   private static int ih = Integer.reverse(0);
   private static int fj = Integer.reverse(-1207959552);
   private static int ew = (0 >>> 1 | 0 << ~1 + 1) & -1;
   private static int cn = (512 >>> 41 | 512 << ~41 + 1) & -1;
   private static int jr = Integer.reverse(Integer.MIN_VALUE);
   private static String[] d = new String[ju];
   private static int hv = Integer.reverse(Integer.MIN_VALUE);
   private static int dm = Integer.reverse(-1879048192);
   private static long cs = Long.reverse(6918091554182798006L);
   private static int ck = Integer.reverse(1073741824);
   private static int co = Integer.reverse(-1879048192);
   private static int cx = 6144 >>> 73 | 6144 << -73;
   private static int ft = (16 >>> 100 | 16 << ~100 + 1) & -1;
   private static int cu = Integer.reverse(-805306368);
   private static int ja = Integer.reverse(0);
   private static long ga = Long.reverse(6918091554182798006L);
   private static int eu = Integer.reverse(0);
   private static int jf = 8 >>> 3 | 8 << -3;
   private static int hh = Integer.reverse(-1543503872);
   private static int jd = Integer.reverse(1073741824);
   private static int fm = (Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << ~94 + 1) & -1;
   private static int eg = (0 >>> 51 | 0 << -51) & -1;
   private static int he = 1048576 >>> 244 | 1048576 << ~244 + 1;
   private static int cl = Integer.reverse(Integer.MIN_VALUE);
   private static long ct = Long.reverse(-720575940379279360L);
   private static long jy = Long.reverse(6918091554182798006L);
   private static int fr = Integer.reverse(0);
   private static int ix = -1 >>> 45 | -1 << -45;
   private static long dd = Long.reverse(-720575940379279360L);
   private static int eq = Integer.reverse(0);
   private static int ha = (0 >>> 158 | 0 << -158) & -1;
   private static int ir = Integer.reverse(0);
   private static int bl = Integer.reverse(Integer.MIN_VALUE);
   private static int hz = Integer.reverse(Integer.MIN_VALUE);
   private static int hs = Integer.reverse(0);
   private static int gc = Integer.reverse(0);
   private static int bt = Integer.reverse(0);
   private static int it = Integer.reverse(0);
   private static long fe = Long.reverse(-720575940379279360L);
   private static long dr = Long.reverse(-720575940379279360L);
   private static int gv = Integer.reverse(-1006632960);
   private static int eh = (100663296 >>> 54 | 100663296 << -54) & -1;
   private static int ka = (128 >>> 7 | 128 << -7) & -1;
   private static long ge = Long.reverse(6918091554182798006L);
   private static int fn = 251658240 >>> 247 | 251658240 << -247;
   private static int fq = Integer.reverse(0);
   private static int hr = 512 >>> 9 | 512 << -9;
   private static long fi = Long.reverse(-7637542441478645066L);
   private static long do = Long.reverse(-7637542441478645066L);
   private static int fx = 0 >>> 70 | 0 << ~70 + 1;
   private static long du = Long.reverse(-720575940379279360L);
   private static long cq = Long.reverse(-7637542441478645066L);
   private static int cb = 28 >>> 194 | 28 << ~194 + 1;
   private static long bb = Long.reverse(-7637542441478645066L);
   private static long bd = Long.reverse(6918091554182798006L);
   private static int im = Integer.reverse(0);
   private static int ht = Integer.reverse(-1073741824);
   private static int ce = 2048 >>> 72 | 2048 << ~72 + 1;
   private static int hc = Integer.reverse(0);
   private static long cc = Long.reverse(6918091554182798006L);
   private static long bh = Long.reverse(-720575940379279360L);
   private static long gz = Long.reverse(-7637542441478645066L);
   private static long el = Long.reverse(-720575940379279360L);
   private static long kh = Long.reverse(-720575940379279360L);
   private static int dp = Integer.reverse(-939524096);
   private static int gd = 64 >>> 129 | 64 << ~129 + 1;
   private static long gj = Long.reverse(-720575940379279360L);
   private static int fs = (0 >>> 14 | 0 << -14) & -1;
   private static int fa = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(-1073741824);
   private static int em = Integer.reverse(Integer.MIN_VALUE);
   private static int ds = Integer.reverse(671088640);
   private static long kc = Long.reverse(6918091554182798006L);
   private static int ii = 16384 >>> 174 | 16384 << ~174 + 1;
   private static long hl = Long.reverse(6918091554182798006L);
   private static int bj = (-1 >>> 104 | -1 << ~104 + 1) & -1;
   private static long hj = Long.reverse(-7637542441478645066L);
   private static int ec = 0 >>> 49 | 0 << ~49 + 1;
   private static int jt = 47 >>> 192 | 47 << ~192 + 1;
   private static int ax = Integer.reverse(1073741824);
   private static int bw = Integer.reverse(Integer.MIN_VALUE);
   private static int gr = Integer.reverse(Integer.MIN_VALUE);

   @Override
   protected List<String> b(θΦγνΩερριδκ var1, String var2, String[] var3) {
      return var3.length <= gr ? ΠΨΓηεΣΨΠζτβΔκΣΣ.a(f, var3) : null;
   }

   private static void b() {
      e = 7879132582967738374L;
      long var0 = e ^ 3765102308061839440L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(63 + 5),
               (byte)(31 + 38),
               (byte)(26 + 57),
               (byte)(19 + 28),
               (byte)(10 + 57),
               (byte)(17 + 49),
               (byte)(3 + 64),
               (byte)(5 + 42),
               80,
               (byte)(22 + 53),
               (byte)(66 + 1),
               (byte)(27 + 56),
               (byte)(12 + 41),
               (byte)(6 + 74),
               (byte)(96 + 1),
               (byte)(54 + 46),
               (byte)(84 + 16),
               (byte)(6 + 99),
               (byte)(11 + 99),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(16 + 52), 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
               d[0] = μεςΩΔΣγν.F("օգհ\u0557ջՙ֞ո֗։ցզ", (byte)98, 70);
               d[1] = ΣδτΠνεγοΓορητ.E("\u0590\u058bճ֑և՛\u0590իծլթզ", (byte)98, 69);
               d[2] = φΨαξωυθανΣφυκη.E("\u0557ւ\u0590֍Փ֓֒Ք՚֛֕զ", (byte)98, 69);
               d[3] = ιΠοθΩΦξκ.C("ՍՈ\u0530ՎՄԘՍԨԫԩԦԣ", (byte)98, 67);
               d[4] = δΛψπξκσβγςα.D("ԭԳԭՉԮԖՇ՜ՅԹՔԣ", (byte)98, 68);
               d[5] = ζοηκορΦνΣθγΩ.C("ՍՈ\u0530ՎՄԘՍԨԫԩԦԣ", (byte)98, 67);
               d[6] = ΠΛΨοδΩσμνΛγΦφβς.C("ՍՈ\u0530ՎՄԘՍԨԫԩԦԣ", (byte)98, 67);
               d[7] = ξψθρΣΠΣς.A("ƑƩƹƷƖƊƲƻƳƖŽƋ", (byte)98, 65);
               d[8] = ΠΛΨοδΩσμνΛγΦφβς.A("ƑƩƹƷƖƊƲƻƳƖŽƋ", (byte)98, 65);
               d[9] = ντθΔζβΔζ.E("եե։֙\u0557ո։՝ըթյզ", (byte)98, 69);
               d[10] = ΦδφπθΩΩλζξ.D("ՑԑԮՁՇՎՄԺՊԺԙԣ", (byte)98, 68);
               d[11] = ΦδφπθΩΩλζξ.B("ƴŹƆƭƽƝǂƿƕƭƞƋ", (byte)98, 66);
               d[12] = πχσδΦΦνθΔπ.E("տկյգ\u0557թիֆջմ֛զ", (byte)98, 69);
               d[13] = μζξτΩσσφυδεπλΨ.F("֔Քձք֊֑ևս֍ս՜զ", (byte)98, 70);
               d[14] = μεςΩΔΣγν.A("ƉƓƍƜƓƠƹƽƝƟƤƖźƚǆƺƢƗƻƟǄƙƖƗ", (byte)98, 65);
               d[15] = οΩνΩρωλΨηΛδωδ.E("էճև֗Ւելճ՚֓֗զ", (byte)98, 69);
               d[16] = θεωψξβΛσσ.B("ƹŹƖƩƯƶƬƢƲƢƁƋ", (byte)98, 66);
               d[17] = οοθδΨιοΦΠβδζ.B("ƌƘƬƼŷƊƑƘſƸƼƋ", (byte)98, 66);
               d[18] = ΦδφπθΩΩλζξ.B("ƫųƫƸƈƀƟǁƂƽƕƾƶƣƕƬƤƥƈǊƝƇƟƒƵǔǀƉǏƦƓƘƒǊưǛƩǟƬǚǑƛƝƫ", (byte)98, 66);
               d[19] = ΠΛΨοδΩσμνΛγΦφβς.A(
                  "ƷƫƏƺƓžƟƜƣŻžưƚƳƽƨƖƵƟƥǌƊơƓǍǅǒƑǇƶƸƑǆǌǜƶƽƺǣǐǁǢǁǛǒƾǚǠǕǝǩƺƩƨƭǉƭǎǟǖǂǵǬǯǗǰǞǧǮȀǀǘǕǿǢǱȁȉǟǽǾǵǞǌǠǹǳǯȔǬǦȉǭǺǰǧǷȑșǽǴǘȡǵǞȖȐǫ", (byte)98, 65
               );
               d[20] = ζοηκορΦνΣθγΩ.C("ԊԥԡՌԶԮՊՏ\u0530ԦԘԕԚԛաԚ՜ՐԴ\u0530ԣէՈ՜\u0557ե՝զՎծգՇՄՌըԲՀՔկԸռջԵՃ", (byte)98, 67);
               d[21] = ντθΔζβΔζ.E(
                  "ցձշՒծդ֑Րտվ֛֜ճ՝֔֝շևա։նս֪օփֲ֣ձխִղվկհִշֈչ֎ևִֿ֠սպ֣׀ֿ֯\u05c8ִ֝ևׅ֤ׄ֬׃ֻ\u05c9\u05cd֭\u05cc\u05cb\u05cb֊֦֘ה\u05cbח֛֮֘גגֳּוּדךַּןֱֲִ", (byte)98, 69
               );
               d[22] = βθκςνθΩθυμςτκχ.C("ՕԱԿԶՍԨ\u0530ՅՕՔ՚ԺՋԿԪԜՅԵԷբԳԱԮԯ", (byte)98, 67);
               d[23] = οοθδΨιοΦΠβδζ.A("ƺƕŶƈƻƓžƸžƹƸƋ", (byte)98, 65);
               d[24] = ΨΦνΨΦωυΩνβςμ.F("֔Քձք֊֑ևս֍ս՜զ", (byte)98, 70);
               d[25] = πψυκΠΨμΛΩβΣφμφσ.A("ƉƓƍƜƓƠƹƽƝƟƢƿƝǁƉƪǅƃƮƨǐǋƚƭƧǇƿƗǖǐǏǗ", (byte)98, 65);
               d[26] = δΛψπξκσβγςα.A("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƟǅƉƳǓƯǏǙǑǈƸ", (byte)98, 65);
               d[27] = ςΦζσμτΓσ.D("ՓԨԓԵԎԙԶՍԗԼԬԖ\u0558ՊՒՕՒՒԿԼըԷԨՁԴ՚Խ\u0557ըԱՂՆՓԿՊժՄՑշԹնխՏՐՖցՋԽՌդվհՐ։նՈցա՚֏՛ՠգ֊", (byte)98, 68);
               d[28] = μζξτΩσσφυδεπλΨ.F("ոբ\u0557֚շօոճտ֒՜զ", (byte)98, 70);
               d[29] = ΦδφπθΩΩλζξ.C("ԌԕՕԫԢՓԶ\u0557ՄԚԧԲՌԾԺԫԯԣԺդԶՄէՔըԼՀՎդԮԻՃժՒղծգզՓՐլկմՃ", (byte)98, 67);
               d[30] = φδχεθοκψαλΛογλ.C("ԾԤԐԵՍԺԔԒՅՕ՜ԣ", (byte)98, 67);
               d[31] = βθκςνθΩθυμςτκχ.A("ƴƦƳŽƕƐƛżƹƔƁƋ", (byte)98, 65);
               d[32] = ΦδφπθΩΩλζξ.F("֕հՑգ֖ծՙ֓ՙ֔֓զ", (byte)98, 70);
               d[33] = ζβησεθωυγτ.F("քխժհջթձ֚էղսզ", (byte)98, 70);
               d[34] = ςπυηννναΣ.B("ƸƌƒƭƸŹƖƓƽƻƁƋ", (byte)98, 66);
               d[35] = πψυκΠΨμΛΩβΣφμφσ.E("֔Քձք֊֑ևս֍ս՜զ", (byte)98, 69);
               d[36] = χφπρψπφΦθμπ.F("֔ծաբե՛յ\u0557֙֍թզ", (byte)98, 70);
               d[37] = ζοηκορΦνΣθγΩ.F("՟ևհջք֎֎ոռշ֢նպվն֧֕՚նյֆ֧֠֟֊֏֣\u0590խ֢֔֞", (byte)98, 70);
               d[38] = ζοηκορΦνΣθγΩ.A("ƭųƶƪƫƝƕƔƣƣƔƅưƔơǃƚƕƽơǋƙǋƳƢǑƲǌǌƕƙǐƱƏǛƽǖƝƝƬƮƳƥƫ", (byte)98, 65);
               d[39] = ΣφδσΔζιΠρα.D("ՁԨՍԮԶՒՅԛԒԹՔՕՒԼԸՁԬՁեԴԨԱԮԯ", (byte)98, 68);
               d[40] = ξψθρΣΠΣς.A("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƟǅƉƳǓƯǏǙǑǈƸ", (byte)98, 65);
               d[41] = ςπυηννναΣ.C("ԥԧՑՃԏ\u0557ԲԸԸԹԪ\u0558՞ՓԡբԝՍ\u0558զ\u0557Է՝ԡՋիՇէձթՠՐ", (byte)98, 67);
               d[42] = χφπρψπφΦθμπ.C("ԥԧՑՃԏ\u0557ԲԸԸԹԪ\u0558՞ՓԡբԝՍ\u0558զ\u0557Է՝ԡՋիՇէձթՠՐ", (byte)98, 67);
               d[43] = χφπρψπφΦθμπ.A("ƴƦƳŽƕƐƛżƹƔƁƋ", (byte)98, 65);
               d[44] = οοθδΨιοΦΠβδζ.F("֕հՑգ֖ծՙ֓ՙ֔֓զ", (byte)98, 70);
               d[45] = ΨΦνΨΦωυΩνβςμ.B("ƩƒƏƕƠƎƖƿƌƗƢƋ", (byte)98, 66);
               d[46] = ξψθρΣΠΣς.A("ƸƌƒƭƸŹƖƓƽƻƁƋ", (byte)98, 65);
               break;
            case 1:
               d[0] = ζοηκορΦνΣθγΩ.A("ƭƩŵűƺžƍƳŽƕƒƋ", (byte)98, 65);
               d[1] = πχσδΦΦνθΔπ.D("ՇՕՇԑԢՙԷԛՖՙԕԣ", (byte)98, 68);
               d[2] = δΛψπξκσβγςα.D("ԏԱՏԶՖԹ\u0530ԥԜՕԪԣ", (byte)98, 68);
               d[3] = ςΦζσμτΓσ.A("ƸƼƗƖƖƝŴƲżƳƁƋ", (byte)98, 65);
               d[4] = βεξΠθρρςΔΦμ.B("ƕƮƧƐƕƵſƓƎƅǀƋ", (byte)98, 66);
               d[5] = οΩνΩρωλΨηΛδωδ.A("ƅƪƹƟƀƫƗŽǁƀƴƋ", (byte)98, 65);
               d[6] = ζβησεθωυγτ.D("ԡԽՒԵՔՒԮԲԶ՞Ԧԣ", (byte)98, 68);
               d[7] = χΠξΦιζΨΣωΦσΨζ.F("Ւժ֒Րը\u0558օպծթ֟զ", (byte)98, 70);
               d[8] = φΨαξωυθανΣφυκη.F("\u0557քՐէՍթ\u058b֗\u058c՞֗զ", (byte)98, 70);
               d[9] = μεςΩΔΣγν.E("նփ\u058c՚ը֝ջ֏՞ց֓զ", (byte)98, 69);
               d[10] = ΣφδσΔζιΠρα.B("ƬƌŰƮƔƫƘƽǅǂǀƋ", (byte)98, 66);
               d[11] = οΩνΩρωλΨηΛδωδ.B("ƝƑƼƧƔƯƶƓƢǃƸƋ", (byte)98, 66);
               d[12] = μζξτΩσσφυδεπλΨ.F("ֆփ֘քք֍եժՙ֝֠֜մւ֏ա֤ա֨֠֨քձղ", (byte)98, 70);
               d[13] = χφπρψπφΦθμπ.E("Ւ\u0590֘՚֗֙ծ\u0558\u0557֡֓զ", (byte)98, 69);
               d[14] = ζοηκορΦνΣθγΩ.E("դծըշծջ֔֘ոպրց՜֣֛ձ֥ըջ֩շմձղ", (byte)98, 69);
               d[15] = ΠΛΨοδΩσμνΛγΦφβς.A("ƤƊƨŵƽƭƝƢŻƁƟǃƧƱƅƔƄƆƄƹƜƙƖƗ", (byte)98, 65);
               d[16] = πχσδΦΦνθΔπ.D("ՈԾԧԬԢԪՒԵԽԳՔԣ", (byte)98, 68);
               d[17] = ζοηκορΦνΣθγΩ.F("Վՠ֚ւպ֚֒֓ռ֑րտ֙կ\u0590ո֓֩րդր֚ձղ", (byte)98, 70);
               d[18] = ντθΔζβΔζ.A("ƫųƫƸƈƀƟǁƂƽƕƾƶƣƕƬƤƥƈǊƝƇƟƒƵǔǀƉǏƦƓƘƮǘǆƚǌǚǋƵǕǝơƫ", (byte)98, 65);
               d[19] = ξψθρΣΠΣς.D(
                  "ՏՃԧՒԫԖԷԴԻԓԖՈԲՋՕՀԮՍԷԽդԢԹԫե՝ժԩ՟ՎՐԩ՞դմՎՕՒջըՙպՙճժՖղոխյցՒՁՀՅաՅզշծ՚֍քևկֈնտֆ֘\u0558հխ֗պ։֙֡շ֖֕֍նդո֑\u058bև֬քվ֡օ֒ֈտֆհֵ֖ք֚։ֻ֛\u058cְփ", (byte)98, 68
               );
               d[20] = μεςΩΔΣγν.E("Սըդ֏չձ֍֒ճթ՛\u0558՝՞֤՝֟֓շճզ֪\u058bֱ֑֦֚֟֨֠֩֊ִ֤֒ո֭֗չ֛֟֔֍ֆ", (byte)98, 69);
               d[21] = πχσδΦΦνθΔπ.E(
                  "ցձշՒծդ֑Րտվ֛֜ճ՝֔֝շևա։նս֪օփֲ֣ձխִղվկհִշֈչ֎ևִֿ֠սպ֣׀ֿ֯\u05c8ִ֝ևׅ֤ׄ֬׃ֻ\u05c9\u05cd֭\u05cc\u05cb\u05cb֊֦֘ה\u05cbח֛֮֘ב֭בׄבִ֤ףֳ֤סתֱֲ", (byte)98, 69
               );
               d[22] = λΣΩσμφγχ.A("ƽƙƧƞƵƐƘƭƽƼǀƽƗǁǁƋƫǍǆƩƋƿƖƗ", (byte)98, 65);
               d[23] = οΩνΩρωλΨηΛδωδ.D("ԞԢԿԖ\u0530ՍԕԸԎ\u0558ՏԚԝՌԭՏԟ՝ՓզՁՁԮԯ", (byte)98, 68);
               d[24] = ΨφιωσρΓδΔθ.D("ՄԏԫԦԣՏԣԹՎԔՌԣ", (byte)98, 68);
               d[25] = φδχεθοκψαλΛογλ.D("ԡԫԥԴԫԸՑՕԵԷԺ\u0557ԵՙԡՂ՝ԛՆՀը\u0557ՓՙԞԤԠԼԿհդՊ", (byte)98, 68);
               d[26] = ΨφιωσρΓδΔθ.E("ըժ֔ֆՒ֚յջջռխ֛֖֡դ֥ՠ\u0590֛֚֩վ֚֝֘տ֧֒\u058c֎֟ֈ", (byte)98, 69);
               d[27] = βθκςνθΩθυμςτκχ.D("ՓԨԓԵԎԙԶՍԗԼԬԖ\u0558ՊՒՕՒՒԿԼըԷԨՁԴ՚Խ\u0557ըԱՂՆՓԿՊժՄՑշԹնխՏՐՖցՋԽՌդվհՐևևՁչիՄ֎ՂկըՑ", (byte)98, 68);
               d[28] = θεωψξβΛσσ.B("ƬƫƇŸƱƚƝſƥƅƘƏƨƅƳƺƞƃƸƼƈƩƖƗ", (byte)98, 66);
               d[29] = ΦδφπθΩΩλζξ.F("Տ\u0558֘ծե֖չ֚և՝ժյ֏ցսծղզս֧չև֪֗֫տփ֑֧ձվֆկ֏֗֎ֶָֹև֯֟֏֮֔ւ\u0590ׇւվִֶ֛֑֔֒", (byte)98, 70);
               d[30] = ΣδτΠνεγοΓορητ.B("ƐůŶƗƬƬƖƣƷƛƄƐƐǃǊƆƥƢǃƷǊƿƖƗ", (byte)98, 66);
               d[31] = ΨφιωσρΓδΔθ.C("ԜԠՃՊԶՃԨԮ՝Ԯԕԣ", (byte)98, 67);
               d[32] = ςΦζσμτΓσ.F("\u0590ֆճ֙֊շջ֔֍֊֟՝վ֛ծ՟֚շճ֡ա֚ձղ", (byte)98, 70);
               d[33] = ΦδφπθΩΩλζξ.D("ԠԴՔԵԫԩՃԻՎԔ՚\u0557ՍԵԵԶԜԜ՛ՄՓՁԮԯ", (byte)98, 68);
               d[34] = ιΠοθΩΦξκ.C("ՁԐՅԕԨԫԩՆԛՋԝԣ", (byte)98, 67);
               d[35] = οοθδΨιοΦΠβδζ.B("ƇŵŹƐƕƔƼƾƓƶƸƋ", (byte)98, 66);
               d[36] = ζοηκορΦνΣθγΩ.E("Րճժմ՚կ֑֚֞ջ֖\u058bձ\u0590\u0590ջ\u0590֑վե֧֚ձղ", (byte)98, 69);
               d[37] = θεωψξβΛσσ.A("ƄƬƕƠƩƳƳƝơƜǇƛƟƣƛǌƺſƛƚƫǅƽǇǐƱǁƧǕơǃƲ", (byte)98, 65);
               d[38] = ζβησεθωυγτ.A("ƭųƶƪƫƝƕƔƣƣƔƅưƔơǃƚƕƽơǋƙǋƳƢǑƲǌǌƕƙǐǐƏǜǀƛǘƟǃƟǚƮƫ", (byte)98, 65);
               d[39] = ξψθρΣΠΣς.C("ՁԨՍԮԶՒՅԛԒԹՔԲՎԛԳԲՎՏՄդՁ\u0557Ԯԯ", (byte)98, 67);
               d[40] = ςπυηννναΣ.B("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƨƒǎƵƝƐƔƣǑƒƖ", (byte)98, 66);
               d[41] = φδχεθοκψαλΛογλ.C("ԥԧՑՃԏ\u0557ԲԸԸԹԪ\u0558՞ՓԡբԝՍ\u0558զ\u0557ԸԿԷդՈԥլծՑ՟ի", (byte)98, 67);
               d[42] = βθκςνθΩθυμςτκχ.B("ƍƏƹƫŷƿƚƠƠơƒǀǆƻƉǊƅƵǀǎƿƤƺǂǇƢƞǉǘƔƻǔ", (byte)98, 66);
               d[43] = ΣερμΔσατσκ.F("֔ծւք֗ժվտպվյզ", (byte)98, 70);
               d[44] = πψυκΠΨμΛΩβΣφμφσ.B("ƬƬŰƛƠƢǀƙżƤƃƴƛƴƘǌǋǊǆǎǄƙƖƗ", (byte)98, 66);
               d[45] = πηγμΣΔκκ.F("։֗ճ\u0590և֘հ՞ղռ֡՟֜֟ր֚֕֝֒ջ֝քձղ", (byte)98, 70);
               d[46] = οΩνΩρωλΨηΛδωδ.F("տփլյչ֒։֒ղպ֏զ", (byte)98, 70);
               break;
            case 2:
               d[0] = ΨφιωσρΓδΔθ.B("ƐƱƾƕƩƞƚƍƱƖƥŽǄƩǆƈƘǊƮƫƺƙƖƗ", (byte)98, 66);
            case 3:
            default:
               break;
            case 4:
               d[0] = χφπρψπφΦθμπ.D("ԎԞԾՁԬԹԻԸԭԳՑԽԹՐՙԝԟԟՀԡԲԱԮԯ", (byte)98, 68);
         }
      }
   }

   static {
      b();
      String[] var10000 = new String[jv];
      var10000[jw] = c<"㺀">(jx, jy ^ jz);
      var10000[ka] = c<"㺃">(kb, kc ^ kd);
      var10000[ke] = c<"㺆">(kf, kg ^ kh);
      var10000[ki] = c<"㺉">(kj & kk, kl);
      f = Arrays.asList(var10000);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(ομλφεαναβδ var1, ΨαχΨχΣλεΠψΦ var2, στΩξξχκι var3, ιηοψσγξςΩγδ var4, String var5, String[] var6) {
      String var7 = this.a.b(var3);
      if (var7 != null) {
         if (var6.length != gs) {
            πωιψγηξΓρφυ var13 = πωιψγηξΓρφυ.x;
            Object[] var14 = new Object[gt];
            var14[gu] = c<"㺀">(gv & gw, gx) + var5.toLowerCase(Locale.ENGLISH) + c<"㺃">(gy, gz);
            εδδΠηδξΛΣχ.a(var2, var13, var14);
         } else {
            String var8 = var6[ha];
            if (!this.a.a(var3, null, var8)) {
               εδδΠηδξΛΣχ.a(var2, πωιψγηξΓρφυ.an);
               if (ΣλνΨουΩΔοθεβ.Y.r() > 0 && var4.a((πβκνλοΛκΠδΦτφλ)πβκνλοΛκΠδΦτφλ.t) < ΣλνΨουΩΔοθεβ.Y.r()) {
                  var4.a(πβκνλοΛκΠδΦτφλ.t, var4.a((πβκνλοΛκΠδΦτφλ)πβκνλοΛκΠδΦτφλ.t) + he);
               } else {
                  var4.a(πβκνλοΛκΠδΦτφλ.t, hc);
                  var2.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.Q, var2));
               }
            } else {
               θνΛωΔπβψμαυΛυεχ var9 = this.a.a(var3);
               if (var9 != null) {
                  switch (οΨτμςκΦθηΩβΩΨηλ.f[var9.ordinal()]) {
                     case 1:
                        if (this.a.aH()) {
                           var3.B();
                        }

                        String var12 = ιχωυζπψημωΔτΦθ.a(βλυςΓυφγζπΩΣΠΨτ.d, hf);
                        if (!this.a.a().c(var3, var12)) {
                           εδδΠηδξΛΣχ.a(var2, πωιψγηξΓρφυ.w);
                           return;
                        }

                        ψΓωτιμωκχψΛΨ.b(c<"㺆">(hh & hi, hj) + var3.i() + c<"㺉">(hk, hl ^ hm) + this.a.u() + c<"㺌">(hn, ho ^ hp));
                        var4.a(πβκνλοΛκΠδΦτφλ.G, var12);
                        var1.b(var3, var2, var12);
                        this.a.b().a(var3, var2, (boolean)hr, (boolean)hs);
                        break;
                     case 2:
                        κμΨχΩρεφπβ var10 = var4.d(πβκνλοΛκΠδΦτφλ.n);
                        if (var10 != null) {
                           εβοςοηΦςψμνςωξΛ var11 = var10.b();
                           if (var11 instanceof οχωηΛλςξΩνψ && ((οχωηΛλςξΩνψ)var11).a() == this.a) {
                              var11.b(this.a, var2, var4);
                           }
                        }
                  }

                  this.a.a(var3, null, null);
                  ΨγημιδξΓτοθαζ var10000 = this.a;
                  EventEnum var10001 = EventEnum.TWO_FACTOR_AUTH;
                  Object[] var10002 = new Object[ht];
                  var10002[hu] = TwoFactorType.convert(this.a);
                  var10002[hv] = var2;
                  var10002[hw] = var7;
                  var10000.a(var10001, var10002);
               }
            }
         }
      } else {
         this.a(var2, var4, var3, var5);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void b(ΨαχΨχΣλεΠψΦ var1, στΩξξχκι var2, String var3, String[] var4) {
      String var5 = this.a.b(var2);
      if (var5 == null) {
         πωιψγηξΓρφυ var10001 = πωιψγηξΓρφυ.aj;
         Object[] var10 = new Object[in];
         var10[io] = this.a.u();
         εδδΠηδξΛΣχ.a(var1, var10001, var10);
      } else {
         int var6 = !this.a.e(var2) ? ip : iq;
         εδδΠηδξΛΣχ.a(var1, var6 != 0 ? πωιψγηξΓρφυ.au : πωιψγηξΓρφυ.av);
         ψτχψηΛςαψΨγ var7 = var2.a();
         switch (οΨτμςκΦθηΩβΩΨηλ.e[this.a.ordinal()]) {
            case 1:
               var7.c((boolean)var6);
               ςθΓωΩπγΩΩΔβΨω var8 = this.a.a();
               ξξοηλξνΨ[] var9 = new ξξοηλξνΨ[is];
               var9[it] = ξξοηλξνΨ.l;
               var8.a(var2, var9);
               break;
            case 2:
               var7.b((boolean)var6);
               ςθΓωΩπγΩΩΔβΨω var10000 = this.a.a();
               ξξοηλξνΨ[] var10002 = new ξξοηλξνΨ[iu];
               var10002[iv] = ξξοηλξνΨ.l;
               var10000.a(var2, var10002);
               break;
            default:
               throw new IllegalStateException(c<"㺀">(iw & ix, iy) + this.a);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 111L;
      var1 ^= 3765102308061839440L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(48 + 20),
                     (byte)(7 + 62),
                     (byte)(29 + 54),
                     (byte)(29 + 18),
                     (byte)(52 + 15),
                     (byte)(36 + 30),
                     (byte)(26 + 41),
                     (byte)(20 + 27),
                     (byte)(28 + 52),
                     (byte)(44 + 31),
                     (byte)(20 + 47),
                     (byte)(13 + 70),
                     53,
                     (byte)(35 + 45),
                     (byte)(63 + 34),
                     (byte)(41 + 59),
                     100,
                     (byte)(46 + 59),
                     (byte)(5 + 105),
                     (byte)(53 + 50)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(50 + 18), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣερμΔσατσκ.B("òÿþÁāýøāČûÈĆĊăĆČÎўъџјѢѩћџёмѯѭѬіѣ", (byte)8, 66));
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

   protected abstract void a(ΨαχΨχΣλεΠψΦ var1, στΩξξχκι var2, ιηοψσγξςΩγδ var3, ομλφεαναβδ var4, String var5, String[] var6);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void a(ΨαχΨχΣλεΠψΦ var1, στΩξξχκι var2, ιηοψσγξςΩγδ var3, String var4, String[] var5) {
      String var6 = this.a.a(var2);
      if (var6 == null) {
         this.a(var1, var3, var2, var4);
      } else {
         String var7 = var5[iz];
         if (!this.a.a(var2, θνΛωΔπβψμαυΛυεχ.a, var7)) {
            εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.an);
         } else {
            ψτχψηΛςαψΨγ var8 = var2.a();
            int var9 = this.a.aI() && !var2.t() && !var2.u() ? jb : jc;
            switch (οΨτμςκΦθηΩβΩΨηλ.e[this.a.ordinal()]) {
               case 1:
                  var8.c((boolean)var9);
                  var8.c(var6);
                  ςθΓωΩπγΩΩΔβΨω var12 = this.a.a();
                  ξξοηλξνΨ[] var15 = new ξξοηλξνΨ[jd];
                  var15[je] = ξξοηλξνΨ.k;
                  var15[jf] = ξξοηλξνΨ.l;
                  var12.a(var2, var15);
                  break;
               case 2:
                  var8.b((boolean)var9);
                  var8.b(var6);
                  ςθΓωΩπγΩΩΔβΨω var10000 = this.a.a();
                  ξξοηλξνΨ[] var10002 = new ξξοηλξνΨ[jg];
                  var10002[jh] = ξξοηλξνΨ.j;
                  var10002[ji] = ξξοηλξνΨ.l;
                  var10000.a(var2, var10002);
                  break;
               default:
                  throw new IllegalStateException(c<"㺀">(jj, jk) + this.a);
            }

            ΨγημιδξΓτοθαζ var13 = this.a;
            EventEnum var10001 = EventEnum.TWO_FACTOR_ADD;
            Object[] var16 = new Object[jl];
            var16[jm] = TwoFactorType.convert(this.a);
            var16[jn] = var1;
            var16[jo] = var1.a();
            var16[jp] = var1.getName();
            var16[jq] = var6;
            var13.a(var10001, var16);
            this.a.b(var2, null);
            this.a.a(var2, null, null);
            πωιψγηξΓρφυ var14 = πωιψγηξΓρφυ.ap;
            var16 = new Object[jr];
            var16[js] = this.a.u();
            εδδΠηδξΛΣχ.a(var1, var14, var16);
            κμΨχΩρεφπβ var10 = var3.d(πβκνλοΛκΠδΦτφλ.n);
            if (var10 != null) {
               εβοςοηΦςψμνςωξΛ var11 = var10.b();
               if (var11 instanceof ΩψωλΣνΩΛφυμ && ((ΩψωλΣνΩΛφυμ)var11).a() == this.a) {
                  var11.b(this.a, var1, var3);
               }
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void a(ΨαχΨχΣλεΠψΦ var1, στΩξξχκι var2, String var3, String[] var4) {
      String var5 = this.a.b(var2);
      if (var5 == null) {
         πωιψγηξΓρφυ var10 = πωιψγηξΓρφυ.aj;
         Object[] var14 = new Object[hx];
         var14[hy] = this.a.u();
         εδδΠηδξΛΣχ.a(var1, var10, var14);
      } else {
         ψτχψηΛςαψΨγ var6 = var2.a();
         switch (οΨτμςκΦθηΩβΩΨηλ.e[this.a.ordinal()]) {
            case 1:
               var6.c(null);
               ςθΓωΩπγΩΩΔβΨω var7 = this.a.a();
               ξξοηλξνΨ[] var11 = new ξξοηλξνΨ[hz];
               var11[ia] = ξξοηλξνΨ.k;
               var7.a(var2, var11);
               break;
            case 2:
               var6.b(null);
               ςθΓωΩπγΩΩΔβΨω var10000 = this.a.a();
               ξξοηλξνΨ[] var10002 = new ξξοηλξνΨ[ib];
               var10002[ic] = ξξοηλξνΨ.j;
               var10000.a(var2, var10002);
               break;
            default:
               throw new IllegalStateException(c<"㺀">(id & ie, if) + this.a);
         }

         ΨγημιδξΓτοθαζ var8 = this.a;
         EventEnum var10001 = EventEnum.TWO_FACTOR_REMOVE;
         Object[] var12 = new Object[ig];
         var12[ih] = TwoFactorType.convert(this.a);
         var12[ii] = var1;
         var12[ij] = var5;
         var8.a(var10001, var12);
         if (this.a.aJ()) {
            var1.a(εδδΠηδξΛΣχ.a(πωιψγηξΓρφυ.q, var1));
         } else {
            πωιψγηξΓρφυ var9 = πωιψγηξΓρφυ.am;
            var12 = new Object[il];
            var12[im] = this.a.u();
            εδδΠηδξΛΣχ.a(var1, var9, var12);
         }
      }
   }

   protected void a(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2, στΩξξχκι var3, String var4) {
      String var5 = var4.toLowerCase(Locale.ENGLISH);
      πααΔΣνΨγνθυ var6 = var2.a();
      String var7 = this.a.u().toLowerCase(Locale.ENGLISH);
      String var8 = βιχγΓλχΠσπ.t(var7);
      πωιψγηξΓρφυ var10000 = πωιψγηξΓρφυ.as;
      Object[] var10002 = new Object[a];
      var10002[av] = var5;
      var10002[aw] = var7;
      var10002[ax] = var8;

      for (String var11 : εδδΠηδξΛΣχ.a(var10000, var1, var10002)) {
         if (var11.length() > ay && var11.contains(c<"㺀">(az & ba, bb)) && var11.contains(c<"㺃">(bc, bd ^ be))) {
            String[] var12 = var11.split(c<"㺆">(bf, bg ^ bh));
            int var13 = var11.split(c<"㺉">(bi & bj, bk)).length;
            if ((var12.length == bl || var12.length == bm) && (var13 == bn || var13 == bo)) {
               String var14 = var12.length == bp ? c<"㺌">(bq, br ^ bs) : var12[bt];
               if (!var14.contains(c<"㺏">(bu, bv))) {
                  String[] var15 = var12[bw].split(c<"㺒">(bx, by ^ bz));
                  String var16 = var15[ca];
                  if (var16.contains(c<"㺕">(cb, cc ^ cd))) {
                     String[] var17 = var16.split(c<"㺘">(ce & cf, cg));
                     if (var17.length == ch) {
                        int var21 = this.a.b(var3) != null ? ci : cj;
                        String var19 = var14 + var17[var21];
                        if (var15.length == ck) {
                           var19 = var19 + var15[cl];
                        }

                        var6.a(var19);
                        continue;
                     }
                  }

                  String var20 = var14 + var16;
                  if (var15.length == cm) {
                     var20 = var20 + var15[cn];
                  }

                  String var18;
                  if (var20.contains(var5 + c<"㺛">(co & cp, cq))) {
                     var18 = c<"㺞">(cr, cs ^ ct) + var5 + c<"㺡">(cu & cv, cw);
                  } else if (var20.contains(var5 + c<"㺤">(cx, cy))) {
                     var18 = c<"㺧">(cz, da) + var5 + c<"㺪">(db, dc ^ dd);
                  } else {
                     if (!var20.contains(var5 + c<"㺭">(de, df ^ dg))) {
                        var6.a(var20);
                        continue;
                     }

                     var18 = c<"㺰">(dh, di ^ dj) + var5 + c<"㺳">(dk, dl);
                  }

                  var6.a(var20, null, var18);
                  continue;
               }
            }
         }

         var6.a(var11);
      }
   }

   public ξΩνεξτεθΩΓυςπΩε(ηισξπαΠχΩ var1, ιιιττκγβγβτωπ var2) {
      super(var1);
      this.b();
      this.a = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void a(θΦγνΩερριδκ var1, String var2, String[] var3) {
      σΓρμχρΛγδΛΦκχξ var4 = this.a.a();
      if (var4.n() == dm) {
         ομλφεαναβδ var5 = this.a.a(this.a);
         if (!var5.aF()) {
            εδδΠηδξΛΣχ.a(var1, εδδΠηδξΛΣχ.j() ? c<"㺀">(dn, do) + this.a.u() + c<"㺃">(dp, dq ^ dr) : c<"㺆">(ds, dt ^ du) + this.a.u() + c<"㺉">(dv, dw));
            εδδΠηδξΛΣχ.a(var1, εξνσΔχΣεθθζΔαΠζ.F);
         } else if (!(var1 instanceof ΨαχΨχΣλεΠψΦ)) {
            if (!var1.i(c<"㺌">(dy, dz))) {
               εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.y);
            } else if (var3.length == eb && var3[ec].equalsIgnoreCase(c<"㺏">(ed, ee))) {
               θρδΣβΔωΣΛ var18 = new θρδΣβΔωΣΛ();
               ςθΓωΩπγΩΩΔβΨω var19 = this.a.a();
               String var21 = var3[em];
               ΨαχΨχΣλεΠψΦ var22 = this.a.b().a(var21);
               στΩξξχκι var20;
               if (var22 != null) {
                  var20 = this.a.a().b(var22).a();
               } else {
                  var20 = var19.a(var1, super.a, var3, var21);
                  if (var20 == null) {
                     εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.w);
                     return;
                  }
               }

               if (!var20.r()) {
                  εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.t);
               } else if (this.a.b(var20) == null) {
                  πωιψγηξΓρφυ var24 = πωιψγηξΓρφυ.aj;
                  Object[] var27 = new Object[ep];
                  var27[eq] = this.a.u();
                  εδδΠηδξΛΣχ.a(var1, var24, var27);
               } else {
                  switch (οΨτμςκΦθηΩβΩΨηλ.e[this.a.ordinal()]) {
                     case 1:
                        var20.a().c(null);
                        var20.a().c((boolean)er);
                        ξξοηλξνΨ[] var26 = new ξξοηλξνΨ[es];
                        var26[et] = ξξοηλξνΨ.k;
                        var19.a(var20, var26);
                        break;
                     case 2:
                        var20.a().b(null);
                        var20.a().b((boolean)eu);
                        ξξοηλξνΨ[] var25 = new ξξοηλξνΨ[ev];
                        var25[ew] = ξξοηλξνΨ.j;
                        var19.a(var20, var25);
                        break;
                     default:
                        throw new IllegalStateException(c<"㺘">(ex & ey, ez) + this.a);
                  }

                  if (var22 != null) {
                     πωιψγηξΓρφυ var23 = πωιψγηξΓρφυ.am;
                     Object[] var10003 = new Object[fa];
                     var10003[fb] = this.a.u();
                     var22.a(εδδΠηδξΛΣχ.a(var23, var22, var10003));
                  }

                  εδδΠηδξΛΣχ.a(
                     var1,
                     εδδΠηδξΛΣχ.j()
                        ? c<"㺛">(fc, fd ^ fe) + var18.a(TimeUnit.MILLISECONDS, ff) + c<"㺞">(fg & fh, fi)
                        : c<"㺡">(fj, fk ^ fl) + var18.a(TimeUnit.SECONDS, fm) + c<"㺤">(fn, fo ^ fp)
                  );
               }
            } else {
               πωιψγηξΓρφυ var10001 = πωιψγηξΓρφυ.x;
               Object[] var10002 = new Object[ef];
               var10002[eg] = c<"㺒">(eh, ei) + var2 + c<"㺕">(ej, ek ^ el);
               εδδΠηδξΛΣχ.a(var1, var10001, var10002);
            }
         } else {
            ΨαχΨχΣλεΠψΦ var6 = (ΨαχΨχΣλεΠψΦ)var1;
            String var7 = this.a.aA();
            if (!this.a.aJ() && var7 != null && !var6.i(var7)) {
               εδδΠηδξΛΣχ.a(var6, πωιψγηξΓρφυ.y);
               εδδΠηδξΛΣχ.a(var6, εξνσΔχΣεθθζΔαΠζ.F);
            } else {
               εσλρΔμΔψχεθυνΔ var8 = this.a.a();
               ιηοψσγξςΩγδ var9 = var8.b(var6);
               στΩξξχκι var10 = var9.a();
               if (!var10.h()) {
                  εδδΠηδξΛΣχ.a(var6, πωιψγηξΓρφυ.t);
                  εδδΠηδξΛΣχ.a(var6, εξνσΔχΣεθθζΔαΠζ.F);
               } else if (var3.length != ft && var3.length != fu) {
                  this.a(var6, var9, var10, var2);
               } else {
                  String var11 = var3[fv];
                  κμΨχΩρεφπβ var12 = var9.d(πβκνλοΛκΠδΦτφλ.n);
                  εβοςοηΦςψμνςωξΛ var13 = var12 != null ? var12.b() : null;
                  int var14 = var13 instanceof ΩψωλΣνΩΛφυμ && ((ΩψωλΣνΩΛφυμ)var13).a() == this.a ? fw : fx;
                  boolean var15 = var8.b(var6);
                  String var16 = var11.toLowerCase(Locale.ENGLISH);
                  int var17 = fy;
                  switch (var16.hashCode()) {
                     case -934610812:
                        if (var16.equals(c<"㺪">(gd, ge ^ gf))) {
                           var17 = gg;
                        }
                        break;
                     case 51309:
                        if (var16.equals(c<"㺰">(gl & gm, gn))) {
                           var17 = go;
                        }
                        break;
                     case 96417:
                        if (var16.equals(c<"㺧">(fz, ga ^ gb))) {
                           var17 = gc;
                        }
                        break;
                     case 1082600804:
                        if (var16.equals(c<"㺭">(gh, gi ^ gj))) {
                           var17 = gk;
                        }
                  }

                  switch (var17) {
                     case 0:
                        if (var15 || var14 != 0) {
                           this.a(var6, var10, var9, var5, var2, var3);
                        }
                        break;
                     case 1:
                        if (var15) {
                           this.a(var6, var10, var2, var3);
                        }
                        break;
                     case 2:
                        if (var15) {
                           εδδΠηδξΛΣχ.a(var6, πωιψγηξΓρφυ.F);
                           εδδΠηδξΛΣχ.a(var6, αΦαοΓηντσθΩαλΛ.f);
                           εδδΠηδξΛΣχ.a(var6, εξνσΔχΣεθθζΔαΠζ.F);
                        } else {
                           this.a(var6, var10, var5, var2, var3);
                        }
                        break;
                     case 3:
                        if (var15) {
                           this.b(var6, var10, var2, var3);
                        }
                        break;
                     default:
                        if (!var15 && var14 == 0) {
                           this.a(var5, var6, var10, var9, var2, var3);
                        } else if (this.a.b(var10, θνΛωΔπβψμαυΛυεχ.a)) {
                           this.a(var6, var10, var9, var2, var3);
                        } else {
                           this.a(var6, var9, var10, var2);
                        }
                  }
               }
            }
         }
      }
   }

   protected abstract void a(ΨαχΨχΣλεΠψΦ var1, στΩξξχκι var2, ομλφεαναβδ var3, String var4, String[] var5);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ξΩνεξτεθΩΓυςπΩε.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(δΛψπξκσβγςα.C("ӊӬӮӎӲԑԉԟԋӚԘԎԜԖӟԄԦԥԝԣԝӲ", (byte)79, 67), ξΩνεξτεθΩΓυςπΩε.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΨΦνΨΦωυΩνβςμ.A("ƀƍƌŏƏƋƆƏƚƉŖƔƘƑƔƚŜӬӘӭӦӰӷөӭӟӊӽӻӺӤӱŷ", (byte)79, 65) + var1 + ιΠοθΩΦξκ.D("Ӝ", (byte)79, 68) + var2.toString(), var4
         );
      }
   }
}
