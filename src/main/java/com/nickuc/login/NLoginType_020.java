package com.nickuc.login;

import com.nickuc.login.api.enums.event.EventEnum;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_020 extends NLoginType_032 {
   private static String[] d = new String[NLoginType_020.da];
   private static long ci = Long.reverse(-2693999973159044433L);
   private static long bc = Long.reverse(-2693999973159044433L);
   private static int da = -2147483645 >>> 158 | -2147483645 << -158;
   private static int cp = -1342177280 >>> 188 | -1342177280 << -188;
   private static int cw = Integer.reverse(-1342177280);
   private static int bh = Integer.reverse(0);
   private static int bk = Integer.reverse(Integer.MIN_VALUE);
   private static long e;
   private static int bg = Integer.reverse(0);
   private static int ca = Integer.reverse(Integer.MIN_VALUE);
   private static String[] c = new String[NLoginType_020.cz];
   private static int bx = (96 >>> 36 | 96 << -36) & -1;
   private static long cr = Long.reverse(-2693999973159044433L);
   private static int cv = Integer.reverse(0);
   private static int cm = -1610612736 >>> 156 | -1610612736 << -156;
   private static int bm = Integer.reverse(Integer.MIN_VALUE);
   private static int cs = Integer.reverse(805306368);
   private static long co = Long.reverse(8935141660703064064L);
   private static int cx = Integer.reverse(-1);
   private static long cu = Long.reverse(8935141660703064064L);
   private static int bn = (0 >>> 46 | 0 << ~46 + 1) & -1;
   private static int br = Integer.reverse(536870912);
   private static int aw = (0 >>> 223 | 0 << -223) & -1;
   private static int cb = Integer.reverse(0);
   private static long bs = Long.reverse(-6440994863131297105L);
   private static int cc = Integer.reverse(0);
   private static int bi = (0 >>> 47 | 0 << -47) & -1;
   private static long be = Long.reverse(-2693999973159044433L);
   private static int ce = Integer.reverse(-1);
   private static int ay = (32 >>> 229 | 32 << -229) & -1;
   private static long cn = Long.reverse(-6440994863131297105L);
   private static long cy = Long.reverse(-2693999973159044433L);
   private static int bl = 1048576 >>> 212 | 1048576 << ~212 + 1;
   private static int cz = 112 >>> 35 | 112 << ~35 + 1;
   private static long by = Long.reverse(-2693999973159044433L);
   private static long bt = Long.reverse(8935141660703064064L);
   private static int cd = (3584 >>> 137 | 3584 << ~137 + 1) & -1;
   private static long bw = Long.reverse(-2693999973159044433L);
   private static int bv = Integer.reverse(-1);
   private static int bu = 40 >>> 3 | 40 << -3;
   private static long az = Long.reverse(-2693999973159044433L);
   private static int bb = -1 >>> 239 | -1 << -239;
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private static int av = 0 >>> 113 | 0 << -113;
   private static long ct = Long.reverse(-6440994863131297105L);
   private static int cl = Integer.reverse(0);
   private static int cq = Integer.reverse(-1);
   private static int ch = (-1 >>> 123 | -1 << -123) & -1;
   private static long ck = Long.reverse(-2693999973159044433L);
   private static int bq = Integer.reverse(0);
   private static int bj = (0 >>> 62 | 0 << -62) & -1;
   private static long ax = Long.reverse(-2693999973159044433L);
   private static int ba = (16777216 >>> 151 | 16777216 << ~151 + 1) & -1;
   private static int bf = Integer.reverse(0);
   private static int bo = (16 >>> 228 | 16 << -228) & -1;
   private static int bz = Integer.reverse(0);
   private static int bp = (0 >>> 74 | 0 << ~74 + 1) & -1;
   private static long cf = Long.reverse(-2693999973159044433L);
   private static int cg = (1 >>> 125 | 1 << -125) & -1;
   private static int bd = Integer.reverse(-1073741824);
   private static int cj = Integer.reverse(-1879048192);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_020.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_223.D("ԏԱԳԓԷՖՎդՐԟ՝Փա՛ԤՉիժբըբԷ", (byte)102, 68), NLoginType_020.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_076.C("Պ\u0557ՖԙՙՕՐՙդՓԠ՞բ՛՞դԦࢺࢴࢯࢸࣂࢲࢦ࢚ࢽࢴࢷࢩࢪࣄՀ", (byte)102, 67) + var1 + NLoginCore_446.A("ƅ", (byte)102, 65) + var2.toString(), var4
         );
      }
   }

   public NLoginType_020(NLoginCore_466 var1) {
      super(var1);
      this.b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 62L;
      var1 ^= -5959823748358515071L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(29 + 39),
                     (byte)(20 + 49),
                     (byte)(77 + 6),
                     (byte)(5 + 42),
                     (byte)(49 + 18),
                     (byte)(3 + 63),
                     (byte)(38 + 29),
                     47,
                     (byte)(38 + 42),
                     (byte)(68 + 7),
                     (byte)(13 + 54),
                     (byte)(38 + 45),
                     (byte)(30 + 23),
                     (byte)(57 + 23),
                     (byte)(93 + 4),
                     (byte)(62 + 38),
                     (byte)(19 + 81),
                     (byte)(3 + 102),
                     (byte)(12 + 98),
                     (byte)(90 + 13)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(26 + 43), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_575.D("њѧѦЩѩѥѠѩѴѣаѮѲѫѮѴжߊ߄\u07bf߈ߒ߂\u07b6ުߍ߄߇\u07b9\u07baߔ", (byte)22, 68));
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

   @Override
   public void a(NLoginInterface_042 var1, String var2, String[] var3) {
      if (!(var1 instanceof NLoginCore_277)) {
         NLoginCore_487 var10001 = NLoginCore_487.x;
         Object[] var10002 = new Object[a];
         var10002[av] = a(aw, ax) + (var3.length > 0 ? a(ay, az) : a(ba & bb, bc)) + String.join(a(bd, be), var3);
         NLoginCore_150.a(var1, var10001, var10002);
      } else {
         NLoginCore_277 var4 = (NLoginCore_277)var1;
         NLoginCore_509 var5 = this.a.a().b(var4);
         if (var5.a().b(NLoginCore_077.e)) {
            NLoginCore_150.a(var4, NLoginCore_487.F);
            NLoginCore_150.a(var4, NLoginCore_508.f);
            NLoginCore_150.a(var4, NLoginCore_194.F);
         } else if (var3.length == 0) {
            NLoginInterface_024 var9 = var5.a();
            NLoginCore_150.a(var4, NLoginCore_487.d, var2x -> var9.e(var2x, var2.toLowerCase(Locale.ENGLISH) + a(cw & cx, cy)));
         } else {
            NLoginCore_291 var6 = this.a.a();
            ForceRegisterConfig var7 = var5.a();
            if (!var7.s()) {
               NLoginCore_150.a(var4, NLoginCore_487.t);
               NLoginCore_150.a(var4, NLoginCore_194.F);
            } else if (!var7.t() || !NLoginCore_329.n.ar()) {
               String var8 = var3[bj];
               if (!var6.a(var7, var8)) {
                  this.a(var7, var4, var5, var8);
               } else {
                  this.a.b().a(var7, var4, var5, var8, (boolean)bk, (boolean)bl);
               }
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(ForceRegisterConfig var1, NLoginCore_277 var2, NLoginCore_509 var3, String var4) {
      NLoginType_008 var10000 = this.a;
      EventEnum var10001 = EventEnum.WRONG_PASSWORD_EVENT;
      Object[] var10002 = new Object[bm];
      var10002[bn] = var2;
      if (var10000.a(var10001, var10002)) {
         String var5 = var2.getName();
         String var6 = var2.ac();
         int var7 = var3.a((NLoginCore_567)NLoginCore_567.t) + bo;
         var3.a(NLoginCore_567.t, var7);
         boolean var11 = false /* VF: Semaphore variable */;

         label43: {
            try {
               var11 = true;
               if (var7 < NLoginCore_477.Y.r()) {
                  NLoginCore_150.a(var2, NLoginCore_487.P);
                  NLoginCore_150.a(var2, NLoginCore_508.e);
                  NLoginCore_150.a(var2, NLoginCore_194.F);
                  var11 = false;
                  break label43;
               }

               Long var8 = this.a.a().a(var1, var5, var6);
               if (var8 != null) {
                  NLoginCore_487 var17 = NLoginCore_487.S;
                  Object[] var10003 = new Object[ca];
                  var10003[cb] = NLoginCore_189.b(var8);
                  var2.a(NLoginCore_150.a(var17, var2, var10003));
                  var11 = false;
               } else {
                  var2.a(NLoginCore_150.a(NLoginCore_487.Q, var2));
                  var11 = false;
               }
            } finally {
               if (var11) {
                  NLoginCore_370.b(a(cm, cn ^ co) + var5 + a(cp & cq, cr) + var6 + a(cs, ct ^ cu));
               }
            }

            NLoginCore_370.b(a(cd & ce, cf) + var5 + a(cg & ch, ci) + var6 + a(cj, ck));
            return;
         }

         NLoginCore_370.b(a(br, bs ^ bt) + var5 + a(bu & bv, bw) + var6 + a(bx, by));
      }
   }

   static {
      b();
   }

   private static void b() {
      e = -766017123016296091L;
      long var0 = e ^ -5959823748358515071L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(21 + 47),
               (byte)(24 + 45),
               (byte)(6 + 77),
               (byte)(27 + 20),
               (byte)(57 + 10),
               (byte)(36 + 30),
               (byte)(14 + 53),
               47,
               (byte)(44 + 36),
               75,
               (byte)(8 + 59),
               (byte)(74 + 9),
               (byte)(2 + 51),
               (byte)(79 + 1),
               (byte)(64 + 33),
               (byte)(67 + 33),
               (byte)(97 + 3),
               (byte)(73 + 32),
               (byte)(32 + 78),
               (byte)(14 + 89)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(57 + 26)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_092.F("Պավ\u0590զձմծՖէզո֖֛՜խճ֣ֆզֆ֓֜ք֥ե֞տէ֯խ֟", (byte)95, 70);
               d[1] = NLoginCore_201.D("ԫԄԶԶՅԊԾԲԋԝՃԚ", (byte)95, 68);
               d[2] = NLoginCore_091.A("ƳƮƑƂźƯƔŽƒƸƾƅ", (byte)95, 65);
               d[3] = NLoginCore_127.F("մՍտտ֎ՓևջՔզ\u058cգ", (byte)95, 70);
               d[4] = NLoginCore_471.E("յմզբ֙ՕՔ՛֚ս֘գ", (byte)95, 69);
               d[5] = NLoginCore_324.F("ՒՑխե֘ք֘գ֙ծծգ", (byte)95, 70);
               d[6] = NLoginCore_384.E("֕եէւ\u058cՑ֑՚\u0557ջ֗ս֟։\u058c֘վ\u0590֒֟ղց֡ճոց֬զ֝֫լֳ֦֟֞ևֹ֤֥շ֔և\u0590ִֻ֓\u058c֙־ֶսׇ֣֗֎֏", (byte)95, 69);
               d[7] = NLoginCore_110.E("յմզբ֙ՕՔ՛֚ս֘գ", (byte)95, 69);
               d[8] = NLoginCore_127.C("ԉԈԤԜՏԻՏԚՐԥԥԚ", (byte)95, 67);
               d[9] = NLoginCore_453.E("֕եէւ\u058cՑ֑՚\u0557ջ֗ս֟։\u058c֘վ\u0590֒֟ղց֡ճոց֬զ֝֫լֳ֦֟֞ևֹ֤֥շ֔և\u0590ִֻ֓\u058c֙־ֶսׇ֣֗֎֏", (byte)95, 69);
               d[10] = NLoginCore_387.E("յմզբ֙ՕՔ՛֚ս֘գ", (byte)95, 69);
               d[11] = NLoginCore_110.D("ԉԈԤԜՏԻՏԚՐԥԥԚ", (byte)95, 68);
               d[12] = NLoginCore_027.B("ƷƇƉƤƮųƳżŹƝƹƟǁƫƮƺƠƲƴǁƔƣǃƕƚƣǎƈƿǍƎǁǀǈǕƩǆǇǛƙƶƩƲǖƵǝƮƻǠǘƟǅƹǩưƱ", (byte)95, 66);
               d[13] = NLoginCore_092.B("ƖůơơưŵƩƝŶƈƮƅ", (byte)95, 66);
               break;
            case 1:
               d[0] = NLoginCore_092.E("Պավ\u0590զձմծՖէզո֖֛՜խճ֣ֆզֆցվքգ֙ի֦֘քִ֝", (byte)95, 69);
               d[1] = NLoginCore_027.A("ƯƖƏƌŵƨƗƥƷƏƐƅ", (byte)95, 65);
               d[2] = NLoginCore_453.D("ՆՄԼԷԥԻԱԼՀԦԵԚ", (byte)95, 68);
               d[3] = NLoginCore_110.A("ƖſƏƱƃƹƷƕŵƸƺƅ", (byte)95, 65);
               d[4] = NLoginCore_530.A("ƴŶƶƳűƊŲƼƴźſƅ", (byte)95, 65);
               d[5] = NLoginCore_384.E("։\u058bլը\u0557հհ֖֔֒֔գ", (byte)95, 69);
               d[6] = NLoginCore_471.D("ՌԜԞԹՃԈՈԑԎԲՎԴՖՀՃՏԵՇՉՖԩԸ\u0558ԪԯԸգԝՔբԣՖՕ՝ժԾ՛՜հԮՋԾՅԬԿԵՔԴխՑձըԹըԺԺ՜ՙՖՄՃպսՈ", (byte)95, 68);
               d[7] = NLoginCore_397.D("ԩՂՋԿԫՊԟԣՒԼԡԚ", (byte)95, 68);
               d[8] = NLoginCore_141.F("։ւթ֒կիթզօ֖ծգ", (byte)95, 70);
               d[9] = NLoginCore_433.D("ՌԜԞԹՃԈՈԑԎԲՎԴՖՀՃՏԵՇՉՖԩԸ\u0558ԪԯԸգԝՔբԣՖՕ՝ժԾ՛՜հԮՋԾՇԱԱգՁՍԷշչՏխՕի\u0557ցւրճ՜ջչԼ", (byte)95, 68);
               d[10] = NLoginCore_141.A("ƨƓƘųƓƩŲƳƘſƔƅ", (byte)95, 65);
               d[11] = NLoginCore_397.D("ԷՀԭԝԟԈՎՉԣԼԡԚ", (byte)95, 68);
               d[12] = NLoginCore_559.D("ՌԜԞԹՃԈՈԑԎԲՎԴՖՀՃՏԵՇՉՖԩԸ\u0558ԪԯԸգԝՔբԣՖՕ՝ժԾ՛՜հԮՋԾՇեեԯԯՎզԲԵՇչԶչԽցԺՙՔցտՖՉ", (byte)95, 68);
               d[13] = NLoginCore_127.D("ԿՅԼՅՈԻԈԦԤՇԔԚ", (byte)95, 68);
               break;
            case 2:
               d[0] = NLoginCore_076.A("ƉƕůƯƨƊƚŸƺƧƋƒƒƿƤǁǇƯǈƆƢƓƐƑ", (byte)95, 65);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_110.A("ưƖűƯƶƋƴƫƉƔŹƟƁƹƐƣưƥƢƥƲǉƐƑ", (byte)95, 65);
         }
      }
   }
}
