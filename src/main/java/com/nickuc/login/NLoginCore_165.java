package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.Server;

public enum NLoginCore_165 {
   a(a(NLoginCore_165.u, NLoginCore_165.v ^ NLoginCore_165.w), (NLoginCore_165 != 0).x),
   b(a(NLoginCore_165.ab & NLoginCore_165.ac, NLoginCore_165.ad), (NLoginCore_165 != 0).ae),
   c(a(NLoginCore_165.aj, NLoginCore_165.ak ^ NLoginCore_165.al), (NLoginCore_165 != 0).am),
   d(a(NLoginCore_165.ar, NLoginCore_165.as), (NLoginCore_165 != 0).at),
   e(a(NLoginCore_165.ay, NLoginCore_165.az), (NLoginCore_165 != 0).ba),
   f(a(NLoginCore_165.be, NLoginCore_165.bf), (NLoginCore_165 != 0).bg),
   g(a(NLoginCore_165.bk, NLoginCore_165.bl ^ NLoginCore_165.bm), (NLoginCore_165 != 0).bn),
   h(a(NLoginCore_165.bs, NLoginCore_165.bt ^ NLoginCore_165.bu), (NLoginCore_165 != 0).bv),
   i(a(NLoginCore_165.ca, NLoginCore_165.cb ^ NLoginCore_165.cc), (NLoginCore_165 != 0).cd),
   j(a(NLoginCore_165.ch & NLoginCore_165.ci, NLoginCore_165.cj), (NLoginCore_165 != 0).ck),
   k(a(NLoginCore_165.co & NLoginCore_165.cp, NLoginCore_165.cq), (NLoginCore_165 != 0).cr),
   l(a(NLoginCore_165.cw, NLoginCore_165.cx), (NLoginCore_165 != 0).cy),
   m(a(NLoginCore_165.dc & NLoginCore_165.dd, NLoginCore_165.de), (NLoginCore_165 != 0).df);

   private final String ag;
   private final boolean J;
   private static final NLoginCore_165 n;
   private static String[] ZKM_STR_A = new String[NLoginCore_165.o];
   private static String[] ZKM_STR_B = new String[NLoginCore_165.p];
   private static long c;
   private static int a = Integer.reverse(-1342177280);
   private static int b = 0 >>> 155 | 0 << -155;
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int d = 131072 >>> 208 | 131072 << -208;
   private static int e = (12288 >>> 140 | 12288 << ~140 + 1) & -1;
   private static int f = Integer.reverse(536870912);
   private static int g = Integer.reverse(-1610612736);
   private static int h = Integer.reverse(1610612736);
   private static int i = 224 >>> 37 | 224 << ~37 + 1;
   private static int j = 16 >>> 225 | 16 << ~225 + 1;
   private static int k = (288 >>> 197 | 288 << ~197 + 1) & -1;
   private static int l = 335544320 >>> 185 | 335544320 << -185;
   private static int m = 46137344 >>> 214 | 46137344 << ~214 + 1;
   private static int n = Integer.reverse(805306368);
   private static int o = Integer.reverse(1476395008);
   private static int p = Integer.reverse(1476395008);
   private static int q = (0 >>> 159 | 0 << -159) & -1;
   private static long r = Long.reverse(4447026826566579236L);
   private static long s = Long.reverse(-2882303761517117440L);
   private static int t = 0 >>> 235 | 0 << -235;
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static long v = Long.reverse(4447026826566579236L);
   private static long w = Long.reverse(-2882303761517117440L);
   private static int x = Integer.reverse(0);
   private static int y = 1073741824 >>> 61 | 1073741824 << ~61 + 1;
   private static long z = Long.reverse(-1894041448771079132L);
   private static int aa = (128 >>> 199 | 128 << ~199 + 1) & -1;
   private static int ab = Integer.reverse(-1073741824);
   private static int ac = Integer.reverse(-1);
   private static long ad = Long.reverse(-1894041448771079132L);
   private static int ae = 0 >>> 223 | 0 << ~223 + 1;
   private static int af = Integer.reverse(536870912);
   private static long ag = Long.reverse(4447026826566579236L);
   private static long ah = Long.reverse(-2882303761517117440L);
   private static int ai = Integer.reverse(1073741824);
   private static int aj = ('ꀀ' >>> 205 | 40960 << -205) & -1;
   private static long ak = Long.reverse(4447026826566579236L);
   private static long al = Long.reverse(-2882303761517117440L);
   private static int am = Integer.reverse(0);
   private static int an = (402653184 >>> 154 | 402653184 << -154) & -1;
   private static int ao = Integer.reverse(-1);
   private static long ap = Long.reverse(-1894041448771079132L);
   private static int aq = Integer.reverse(-1073741824);
   private static int ar = Integer.reverse(-536870912);
   private static long as = Long.reverse(-1894041448771079132L);
   private static int at = Integer.reverse(0);
   private static int au = Integer.reverse(268435456);
   private static long av = Long.reverse(4447026826566579236L);
   private static long aw = Long.reverse(-2882303761517117440L);
   private static int ax = (4 >>> 0 | 4 << ~0 + 1) & -1;
   private static int ay = Integer.reverse(-1879048192);
   private static long az = Long.reverse(-1894041448771079132L);
   private static int ba = (0 >>> 145 | 0 << ~145 + 1) & -1;
   private static int bb = 671088640 >>> 90 | 671088640 << ~90 + 1;
   private static long bc = Long.reverse(-1894041448771079132L);
   private static int bd = (5242880 >>> 148 | 5242880 << -148) & -1;
   private static int be = Integer.reverse(-805306368);
   private static long bf = Long.reverse(-1894041448771079132L);
   private static int bg = Integer.reverse(0);
   private static int bh = Integer.reverse(805306368);
   private static long bi = Long.reverse(-1894041448771079132L);
   private static int bj = Integer.reverse(1610612736);
   private static int bk = -1610612735 >>> 189 | -1610612735 << -189;
   private static long bl = Long.reverse(4447026826566579236L);
   private static long bm = Long.reverse(-2882303761517117440L);
   private static int bn = (0 >>> 178 | 0 << -178) & -1;
   private static int bo = (29360128 >>> 53 | 29360128 << ~53 + 1) & -1;
   private static int bp = Integer.reverse(-1);
   private static long bq = Long.reverse(-1894041448771079132L);
   private static int br = 58720256 >>> 247 | 58720256 << ~247 + 1;
   private static int bs = (15728640 >>> 212 | 15728640 << ~212 + 1) & -1;
   private static long bt = Long.reverse(4447026826566579236L);
   private static long bu = Long.reverse(-2882303761517117440L);
   private static int bv = 65536 >>> 176 | 65536 << -176;
   private static int bw = (134217728 >>> 247 | 134217728 << -247) & -1;
   private static int bx = Integer.reverse(-1);
   private static long by = Long.reverse(-1894041448771079132L);
   private static int bz = Integer.reverse(268435456);
   private static int ca = (139264 >>> 205 | 139264 << -205) & -1;
   private static long cb = Long.reverse(4447026826566579236L);
   private static long cc = Long.reverse(-2882303761517117440L);
   private static int cd = Integer.reverse(Integer.MIN_VALUE);
   private static int ce = 1207959552 >>> 250 | 1207959552 << -250;
   private static long cf = Long.reverse(-1894041448771079132L);
   private static int cg = Integer.reverse(-1879048192);
   private static int ch = Integer.reverse(-939524096);
   private static int ci = (-1 >>> 15 | -1 << -15) & -1;
   private static long cj = Long.reverse(-1894041448771079132L);
   private static int ck = 4 >>> 34 | 4 << -34;
   private static int cl = Integer.reverse(671088640);
   private static long cm = Long.reverse(-1894041448771079132L);
   private static int cn = Integer.reverse(1342177280);
   private static int co = 44040192 >>> 149 | 44040192 << ~149 + 1;
   private static int cp = -1 >>> 139 | -1 << ~139 + 1;
   private static long cq = Long.reverse(-1894041448771079132L);
   private static int cr = ('耀' >>> 'O' | 32768 << ~79 + 1) & -1;
   private static int cs = ('뀀' >>> 235 | 45056 << -235) & -1;
   private static long ct = Long.reverse(4447026826566579236L);
   private static long cu = Long.reverse(-2882303761517117440L);
   private static int cv = Integer.reverse(-805306368);
   private static int cw = 3014656 >>> 209 | 3014656 << -209;
   private static long cx = Long.reverse(-1894041448771079132L);
   private static int cy = Integer.reverse(Integer.MIN_VALUE);
   private static int cz = Integer.reverse(402653184);
   private static long da = Long.reverse(-1894041448771079132L);
   private static int db = Integer.reverse(805306368);
   private static int dc = Integer.reverse(-1744830464);
   private static int dd = Integer.reverse(-1);
   private static long de = Long.reverse(-1894041448771079132L);
   private static int df = Integer.reverse(Integer.MIN_VALUE);
   private static int dg = 0 >>> 80 | 0 << -80;
   private static int dh = 0 >>> 250 | 0 << ~250 + 1;

   private static void b() {
      c = 2606533078692195772L;
      long var0 = c ^ 2604326186624820738L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(17 + 51),
               69,
               (byte)(8 + 75),
               (byte)(25 + 22),
               67,
               (byte)(17 + 49),
               (byte)(16 + 51),
               (byte)(5 + 42),
               (byte)(2 + 78),
               (byte)(72 + 3),
               (byte)(25 + 42),
               (byte)(39 + 44),
               (byte)(7 + 46),
               (byte)(40 + 40),
               (byte)(62 + 35),
               (byte)(29 + 71),
               (byte)(48 + 52),
               (byte)(68 + 37),
               (byte)(94 + 16),
               (byte)(33 + 70)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(13 + 55), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_384.B("ŁŖėőŐľŌŘĭĺĺħ", (byte)48, 66);
               ZKM_STR_B[1] = NLoginCore_433.E("Ւ՚ՒԤ՝Խ՝՚ՆՈծ՟ԣդձըՋԲդՅձՒԿՀ", (byte)48, 69);
               ZKM_STR_B[2] = NLoginCore_232.A("ŕňŚňĤĚĬőĨěĶħ", (byte)48, 65);
               ZKM_STR_B[3] = NLoginCore_433.B("ĖįĢőŎĜĔĵęıĲŒŁĥŧŃŇĢŋŇĽŅĲĳ", (byte)48, 66);
               ZKM_STR_B[4] = NLoginCore_223.D("қґқҰѻҞҗ҃Ґҕѿҍ", (byte)48, 68);
               ZKM_STR_B[5] = NLoginCore_241.E("ՑՕ՛ՉԧՓՋԫՕՂժՋ՚՟՟գձԨբՉըՂԿՀ", (byte)48, 69);
               ZKM_STR_B[6] = NLoginCore_521.D("ҙҝҡҷӁңҴһ҅Ҧ҃ҍ", (byte)48, 68);
               ZKM_STR_B[7] = NLoginCore_397.A("įīĚňļĘŜřļęĺĳĚŦşĲŝěŢĩĺŅĲĳ", (byte)48, 65);
               ZKM_STR_B[8] = NLoginCore_141.A("ĵĕĸĳĻśĶŚšĴŐħ", (byte)48, 65);
               ZKM_STR_B[9] = NLoginCore_076.A("ĒĭŏŅĻřŉļĸķķŌŏŅŦŐŚŧģŨĩŅĲĳ", (byte)48, 65);
               ZKM_STR_B[10] = NLoginCore_453.B("ĳŊĖŌőŕŒęşĝĲħ", (byte)48, 66);
               ZKM_STR_B[11] = NLoginCore_451.A("ĪĔħİĚŅĔĪĳĚıłĹĸĶĲŅļşħņŅĲĳ", (byte)48, 65);
               ZKM_STR_B[12] = NLoginCore_004.A("ĎĤēŐĳĽŚĖĒĝŜħ", (byte)48, 65);
               ZKM_STR_B[13] = NLoginCore_521.B("ŎīĤŐņĽĸęňĜġŚĚĹŝļţşřġūĵĲĳ", (byte)48, 66);
               ZKM_STR_B[14] = NLoginCore_091.E("ԯՙՓՕԻէի\u0557ՇթՙԴ", (byte)48, 69);
               ZKM_STR_B[15] = NLoginCore_223.C("ҘҊҜүҿҷҲ҃ҕҷҨҍ", (byte)48, 67);
               ZKM_STR_B[16] = NLoginCore_173.E("ԴԞԙՈՇՉզ՝\u0558ԮՃԴ", (byte)48, 69);
               ZKM_STR_B[17] = NLoginCore_575.E("ՑԳԾԸ՚ԨՈՙՃԹԷԴ", (byte)48, 69);
               ZKM_STR_B[18] = NLoginCore_387.D("ҽҽѾҡҌѵҮѽӃҘҀӅҤҷӋҟҫӅҩҮҞқҘҙ", (byte)48, 68);
               ZKM_STR_B[19] = NLoginCore_092.F("ԯԤՕՑՃդԻ՚ԶՍԨԫլՍՔՉՠՈԵԴզըԿՀ", (byte)48, 70);
               ZKM_STR_B[20] = NLoginCore_173.A("ĤŉĲŏħŊŔŗĭļłħ", (byte)48, 65);
               ZKM_STR_B[21] = NLoginCore_397.B("ńĬĶĖŏŞĦİįśġħ", (byte)48, 66);
               ZKM_STR_B[22] = NLoginCore_521.A("ĢŉıŎņĩŒŝĜŕŐŢŐĽŗĹũšŢīīśĲĳ", (byte)48, 65);
               ZKM_STR_B[23] = NLoginCore_004.C("һҭҨҫҲҾҁү҄ҳҔҁҹҤҚӂҶҢҮҙҮӁҘҙ", (byte)48, 67);
               ZKM_STR_B[24] = NLoginCore_232.A("ĔńŖķĳŜħŚľśŌőįŚŜŞļœŀŕŘĵĲĳ", (byte)48, 65);
               ZKM_STR_B[25] = NLoginCore_223.F("՝ԵբՂԦԾԢՂԣՃ\u0557ԾՌծլ՝ԭՒԿըղոԿՀ", (byte)48, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_575.D("ҧѿҠѺҘҶҤґҹҥҖҦҙӊҢҙӌҬҞҤӇҫҘҙ", (byte)48, 68);
               ZKM_STR_B[1] = NLoginCore_446.C("ҫҳҫѽҶҖҶҳҟҡӇӃҦҕӈҬҬҎңӀҞӁҘҙ", (byte)48, 67);
               ZKM_STR_B[2] = NLoginCore_397.C("҈ҞҹҵҪқҐӁҁҼҔҍ", (byte)48, 67);
               ZKM_STR_B[3] = NLoginCore_324.B("ĖįĢőŎĜĔĵęıĲŜśŞŗœŧœŊŉŀĵĲĳ", (byte)48, 66);
               ZKM_STR_B[4] = NLoginCore_183.C("ѽҎҨүѽүҗӀҰґӉ҃ҶҚҜҌҨӁһ҈ҋҫҘҙ", (byte)48, 67);
               ZKM_STR_B[5] = NLoginCore_559.A("ńňŎļĚņľĞňĵŞŤŚİŒŐţœĶţťūĲĳ", (byte)48, 65);
               ZKM_STR_B[6] = NLoginCore_091.B("ŖŌĨıĨĳĩŗŜįĭĠŔŦģŜŜłńŇŋśĲĳ", (byte)48, 66);
               ZKM_STR_B[7] = NLoginCore_092.B("įīĚňļĘŜřļęļŕķĲŐİŚŀĪŀĞśĲĳ", (byte)48, 66);
               ZKM_STR_B[8] = NLoginCore_076.E("ՙԶԷԧԽՔ՝ԺԵդՇՁՍԼՌԬխըժՉաՒԿՀ", (byte)48, 69);
               ZKM_STR_B[9] = NLoginCore_559.F("ԟԺ՜ՒՈզՖՉՅՄՅՅՒՀիէկՉՏգՇըԿՀ", (byte)48, 70);
               ZKM_STR_B[10] = NLoginCore_091.F("աՓԣՅԧՇ՛Ԟ՞եգՙգԾՉԽՄծՅԯշըԿՀ", (byte)48, 70);
               ZKM_STR_B[11] = NLoginCore_397.B("ĪĔħİĚŅĔĪĳĚİģŠŞťġğķũŋŇūĲĳ", (byte)48, 66);
               ZKM_STR_B[12] = NLoginCore_091.A("ňłŔņĽĹĴķŜŁěęŝŗĵőĸŁķśŌśĲĳ", (byte)48, 65);
               ZKM_STR_B[13] = NLoginCore_173.D("ҴґҊҶҬңҞѿҮ҂ѾӆҥҋҨӋӌӌҨҼӐӑҘҙ", (byte)48, 68);
               ZKM_STR_B[14] = NLoginCore_092.A("ĬĹĢŚĺĖĻĴŎŒŒĳĞĶŇńİŨŗŇģśĲĳ", (byte)48, 65);
               ZKM_STR_B[15] = NLoginCore_223.D("҆ҘҼѳҳҷҬѾҦқҜҜѼҸҙӂ҈ҢҜң҈ҫҘҙ", (byte)48, 68);
               ZKM_STR_B[16] = NLoginCore_446.D("ҝҽѸҲқҫґҟ҅ӁҺҍ", (byte)48, 68);
               ZKM_STR_B[17] = NLoginCore_553.D("ҩѸҳҢѿҢҮһҕҒқѿӆӈӃҪҧӈӄҠӈӑҘҙ", (byte)48, 68);
               ZKM_STR_B[18] = NLoginCore_004.A("ŗŗĘĻĦďňėŝĲĜŜŕĭĴńĞĸĸŊōśĲĳ", (byte)48, 65);
               ZKM_STR_B[19] = NLoginCore_446.D("҈ѽҮҪҜҽҔҳҏҦ҂҈ҨҳҬқҺһӆӉұҫҘҙ", (byte)48, 68);
               ZKM_STR_B[20] = NLoginCore_521.B("łĐŘōĨŒŖĕœĪĠŝĮĲļĴŉŅœĹŋĵĲĳ", (byte)48, 66);
               ZKM_STR_B[21] = NLoginCore_183.D("ҜѷѸҮѼѾҝӅҺҰҧ҅ӆҊӇҺҩҞҩҭӊӑҘҙ", (byte)48, 68);
               ZKM_STR_B[22] = NLoginCore_201.E("ԯՖԾ՛ՓԶ՟ժԩբ՟ՙծԲՋ\u0530ծԿԶյՁըԿՀ", (byte)48, 69);
               ZKM_STR_B[23] = NLoginCore_453.E("բՔՏՒՙեԨՖԫ՚ԼԸբղՌղծՓգոԶըԿՀ", (byte)48, 69);
               ZKM_STR_B[24] = NLoginCore_427.F("ԡՑգՄՀթԴէՋը՛ԩ\u0530ՠԿծեձԷիՔըԿՀ", (byte)48, 70);
               ZKM_STR_B[25] = NLoginCore_553.E("՝ԵբՂԦԾԢՂԣՃՏՠ՜՟ԥՐ՞ՠզՔդըԿՀ", (byte)48, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_521.F("ՆԸԧՉՖզԝ՝ԿՅԡ\u0530՞\u0530\u0530ՔթԯՀՁդըԿՀ", (byte)48, 70);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.E("ԡՖԹԞՊ՝ՊԺՍՌՙ՜ՄԾթՃլժՓՙՑՋդճծնկըՙՁՀՕ", (byte)48, 69);
         }
      }
   }

   @Generated
   public boolean O() {
      return this.J;
   }

   public static NLoginCore_165 a() {
      return n;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_165.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_427.B("ãąćçċĪĢĸĤóıħĵįøĝĿľĶļĶċ", (byte)30, 66), NLoginCore_165.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_521.F("ԽՊՉԌՌՈՃՌ\u0557ՆԓՑՕՎՑ\u0557ԙࢫࢢࢦࢦࢊࢄࢲࢹ࢛ࢹࢉ\u0530", (byte)30, 70) + var1 + NLoginCore_138.D("щ", (byte)30, 68) + var2.toString(), var4
         );
      }
   }

   static {
      b();
      NLoginCore_165 var0 = null;
      Server var1 = Bukkit.getServer();
      String var2 = var1.getVersion();
      String var3 = var1.getName();
      NLoginCore_165[] var4 = values();
      NLoginCore_165[] var5 = var4;
      int var6 = var4.length;

      for (int var7 = dg; var7 < var6; var7++) {
         NLoginCore_165 var8 = var5[var7];
         if (var2.contains(var8.getName()) || var3 != null && var3.contains(var8.getName())) {
            var0 = var8;
            break;
         }
      }

      if (var0 == null) {
         var0 = var4[dh];
      }

      n = var0;
   }

   @Generated
   public String getName() {
      return this.ag;
   }

   @Generated
   private NLoginCore_165(String var3, boolean var4) {
      this.ag = var3;
      this.J = var4;
   }

   private static String a(int var0, long var1) {
      var1 ^= 27L;
      var1 ^= 2604326186624820738L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(24 + 45),
                     (byte)(28 + 55),
                     47,
                     (byte)(6 + 61),
                     (byte)(20 + 46),
                     (byte)(7 + 60),
                     (byte)(20 + 27),
                     (byte)(22 + 58),
                     (byte)(35 + 40),
                     (byte)(63 + 4),
                     (byte)(7 + 76),
                     53,
                     (byte)(32 + 48),
                     (byte)(17 + 80),
                     (byte)(83 + 17),
                     (byte)(23 + 77),
                     (byte)(28 + 77),
                     (byte)(34 + 76),
                     (byte)(59 + 44)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(25 + 58)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_433.B("ƺǇǆƉǉǅǀǉǔǃƐǎǒǋǎǔƖԨԟԣԣԇԁԯԶԘԶԆ", (byte)108, 66));
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
}
