package com.nickuc.login;

import com.nickuc.login.lib.json.JSONObject;
import java.io.File;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.Properties;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_514 extends NLoginCore_098 {
   private static int eu = Integer.reverse(402653184);
   private static long cw = Long.reverse(-4723639687574241146L);
   private static int dd = Integer.reverse(1879048192);
   private static int dl = (-1 >>> 185 | -1 << -185) & -1;
   private static int em = 46137344 >>> 117 | 46137344 << -117;
   private static int ex = 6291456 >>> 242 | 6291456 << ~242 + 1;
   private static long ca = Long.reverse(-4723639687574241146L);
   private static int dz = 655360 >>> 47 | 655360 << ~47 + 1;
   private static long br = Long.reverse(2161727821137838080L);
   private static int dk = Integer.reverse(134217728);
   private static int cg = (-1 >>> 223 | -1 << ~223 + 1) & -1;
   private static int cy = Integer.reverse(-1342177280);
   private static long cn = Long.reverse(-4723639687574241146L);
   private static long es = Long.reverse(-6885367508712079226L);
   private static long ci = Long.reverse(-6885367508712079226L);
   private static long bk = Long.reverse(-4723639687574241146L);
   private static int cr = (369098752 >>> 121 | 369098752 << ~121 + 1) & -1;
   private static long bh = Long.reverse(-6885367508712079226L);
   private static int y = 536870912 >>> 61 | 536870912 << -61;
   private static int dh = (30 >>> 97 | 30 << -97) & -1;
   private static int ce = Integer.reverse(268435456);
   private static long at = Long.reverse(-4723639687574241146L);
   private static int er = Integer.reverse(-1);
   private static long dc = Long.reverse(2161727821137838080L);
   private static String[] e = new String[eu];
   private static int eq = (94208 >>> 172 | 94208 << ~172 + 1) & -1;
   private static int bn = Integer.reverse(-1610612736);
   private static int bd = Integer.reverse(-1073741824);
   private static int dt = Integer.reverse(1207959552);
   private static long dy = Long.reverse(-6885367508712079226L);
   private static long au = Long.reverse(2161727821137838080L);
   private static long dv = Long.reverse(-6885367508712079226L);
   private static long ds = Long.reverse(2161727821137838080L);
   private static long di = Long.reverse(-4723639687574241146L);
   private static long p = Long.reverse(-6885367508712079226L);
   private static long cl = Long.reverse(2161727821137838080L);
   private static int dw = 9961472 >>> 51 | 9961472 << -51;
   private static int dn = (272 >>> 100 | 272 << ~100 + 1) & -1;
   private static int dx = Integer.reverse(-1);
   private static long cx = Long.reverse(2161727821137838080L);
   private static int ek = Integer.reverse(-1476395008);
   private static String[] f = new String[ex];
   private static int cm = (1310720 >>> 145 | 1310720 << -145) & -1;
   private static long bo = Long.reverse(-4723639687574241146L);
   private static long bv = Long.reverse(-4723639687574241146L);
   private static int cj = 144 >>> 68 | 144 << -68;
   private static long dm = Long.reverse(-6885367508712079226L);
   private static long eb = Long.reverse(-4723639687574241146L);
   private static long cd = Long.reverse(2161727821137838080L);
   private static int bi = 268435456 >>> 218 | 268435456 << ~218 + 1;
   private static long ac = Long.reverse(2161727821137838080L);
   private static long ab = Long.reverse(-4723639687574241146L);
   private static int e = (0 >>> 79 | 0 << ~79 + 1) & -1;
   private static long ct = Long.reverse(-6885367508712079226L);
   private static long dj = Long.reverse(2161727821137838080L);
   private static int bz = (3584 >>> 201 | 3584 << -201) & -1;
   private static long bm = Long.reverse(2161727821137838080L);
   private static long cz = Long.reverse(-4723639687574241146L);
   private static long cp = Long.reverse(2161727821137838080L);
   private static long ee = Long.reverse(2161727821137838080L);
   private static long df = Long.reverse(-6885367508712079226L);
   private static long ck = Long.reverse(-4723639687574241146L);
   private static long o;
   private static long eo = Long.reverse(-6885367508712079226L);
   private static int bf = -1 >>> 44 | -1 << -44;
   private static int cv = Integer.reverse(805306368);
   private static int al = ('耀' >>> 206 | 32768 << ~206 + 1) & -1;
   private static long dp = Long.reverse(-4723639687574241146L);
   private static long el = Long.reverse(-6885367508712079226L);
   private static long by = Long.reverse(2161727821137838080L);
   private static int bu = (1610612736 >>> 60 | 1610612736 << ~60 + 1) & -1;

   private static void b() {
      o = 6990374854969151101L;
      long var0 = o ^ 5737158000913132138L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(42 + 26),
               (byte)(59 + 10),
               (byte)(76 + 7),
               (byte)(35 + 12),
               (byte)(54 + 13),
               (byte)(9 + 57),
               (byte)(53 + 14),
               47,
               (byte)(31 + 49),
               75,
               (byte)(43 + 24),
               (byte)(71 + 12),
               (byte)(31 + 22),
               (byte)(15 + 65),
               (byte)(58 + 39),
               (byte)(79 + 21),
               (byte)(28 + 72),
               (byte)(67 + 38),
               (byte)(84 + 26),
               (byte)(97 + 6)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(43 + 26), 83}, StandardCharsets.UTF_8));
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
               f[0] = NLoginCore_027.B("ĤĤĈïñĈćĺĸďĺđĶöĳğēğĘĻłďČč", (byte)29, 66);
               f[1] = NLoginCore_004.C("҂ёчєѹхѻѺыѦьѡѺѱѨґ҇ѭѳѹѯҘџѠ", (byte)29, 67);
               f[2] = NLoginCore_092.D("єјйѨҊщѩщѷ҅ѝѨѨѻѠцяѫѦҏҘҘџѠ", (byte)29, 68);
               f[3] = NLoginCore_453.F("ԢԐԜԝԐԏԑ\u0557ԖԕՒԡ", (byte)29, 70);
               f[4] = NLoginCore_173.D("ёѵнїфѶѥѝѩѩћє", (byte)29, 68);
               f[5] = NLoginCore_127.C(
                  "пѯѽђ҄҆тѪшфѫҋѥѻ҄ѾьѥѰѹықѦҌҗѱѿҗѷғљҔҡҚ҂Ѵ҇ѥѝѹҠҗҐѽґѬҪѪѮүҫҊҙүҦѵһҜ҈ҹҷҲҹӁӆҺӃҺҝҢӅѾҩҎӆҹҤҜғӆӓҷҧӆҵӓҙӒӏӘҺҵӒҘҮҝӅҞӈӕӥӛӤӡҶӝӐҿӀӀҪӠӔҾӶӎӇӳӭӉӰҾәӳҳӀӀӎӠԆӴҾӅӾӽԁԀӉԋӾԎӨӾԋӨӥӠӨӪԈӟӠ",
                  (byte)29,
                  67
               );
               f[6] = NLoginCore_241.A("ĂðüýðïñķöõĲā", (byte)29, 65);
               f[7] = NLoginCore_453.C("рнч҅ѝъҁѽуіҁјёѽ҂ѴѦі҆Ґ҃ѢџѠ", (byte)29, 67);
               f[8] = NLoginCore_471.E("ԡԥԆԵ\u0557ԖԶԖՄՒԨԶՈԜԠՊաԙաՕէՕԬԭ", (byte)29, 69);
               f[9] = NLoginCore_091.D("ѤѺ҅ѐѢњѻ҃ѤїѽѦчҁҐѦ҅Ѥѣ҆ѨѢџѠ", (byte)29, 68);
               f[10] = NLoginCore_451.E("ԡԥԆԵ\u0557ԖԶԖՄՒԫԩԜՉԪԷԸԫԛ՚ՀԯԬԭ", (byte)29, 69);
               f[11] = NLoginCore_027.F("ԡԥԆԵ\u0557ԖԶԖՄՒԩ՝ԚԬԫՒԮՂԼՔգեԬԭ", (byte)29, 70);
               f[12] = NLoginCore_387.D("єјйѨҊщѩщѷ҅ќѨҏ҉ѱ҇яђѢѷ҂ѲџѠ", (byte)29, 68);
               f[13] = NLoginCore_553.E("ԛՑՏՕԾԶՄԸԹՆԴԡ", (byte)29, 69);
               f[14] = NLoginCore_076.A("ĊĉĠĨïÿęĦĵíĎĨĉĵøığīďĝġĵČč", (byte)29, 65);
               f[15] = NLoginCore_141.B("úĞĦēĪĤïĬĊôĤĎĈęĸĢĢùēďĻŅČč", (byte)29, 66);
               f[16] = NLoginCore_141.D("фѐоѸ҄щѶѕҊрџҍѦюѪѥҖѦҏҏєѲџѠ", (byte)29, 68);
               f[17] = NLoginCore_173.C("фѐоѸ҄щѶѕҊрџҍѦюѪѥҖѦҏҏєѲџѠ", (byte)29, 67);
               f[18] = NLoginCore_076.C("пѱ҃ҁҀўѹѶўҁѢщћя҅ѪҀѐҍђ҇҈џѠ", (byte)29, 67);
               f[19] = NLoginCore_384.E("ԤԡՂԧԷԴԢԧՋԧ՚ԡ", (byte)29, 69);
               f[20] = NLoginCore_091.D("їєѵњѪѧѕњѾњҍє", (byte)29, 68);
               f[21] = NLoginCore_397.F("ԌԋԑԨԢԥԔԒԷԺԸՋԗ՟աԸԭ՝ԟՖԼԯԬԭ", (byte)29, 70);
               f[22] = NLoginCore_027.B("ìëñĈĂąôòėĚĘī÷ĿŁĘčĽÿĶĜďČč", (byte)29, 66);
               f[23] = NLoginCore_530.F("ՃԴԧՉՉԉՏՕՎԲ՛ՏԔԱԷԲԠԳԴԢ՟ԿԬԭ", (byte)29, 70);
               break;
            case 1:
               f[0] = NLoginCore_091.E("ՄՄԨԏԑԨԧ՚\u0558ԯ՛ԏԜԪՎԶՏՌԲՂՁՕԬԭ", (byte)29, 69);
               f[1] = NLoginCore_384.E("ՏԞԔԡՆԒՈՇԘԳԗԭՉԿԚբ\u0557ԴՠՑբեԬԭ", (byte)29, 69);
               f[2] = NLoginCore_110.C("єјйѨҊщѩщѷ҅ћѱѬѭяцѰѬѳҋҊѢџѠ", (byte)29, 67);
               f[3] = NLoginCore_553.B("ĜăìòĤĬòĺðöĈĸĹñÿŀĎńķüęğČč", (byte)29, 66);
               f[4] = NLoginCore_183.E("ԧԴԤԒՀ\u0558ԵԔԓԳԵԯՏՓԸԝԙԬՙԣԴեԬԭ", (byte)29, 69);
               f[5] = NLoginCore_141.F(
                  "ԌԼՊԟՑՓԏԷԕԑԸ\u0558ԲՈՑՋԙԲԽՆԘըԳՙդԾՌդՄՠԦածէՏՁՔԲԪՆխդ՝Պ՞ԹշԷԻռո\u0557զռճՂֈթՕֆքտֆ֎֓և\u0590ևժկ֒Ջն՛֓ֆձթՠ֓֠քմ֓ւ֠զ֥֟֜ևւ֟եջժ֒իֱֲ֢֮֕֨փ֪֝\u058c֍֍շ֭֡\u058b׃֛֔׀ֺֽ֖\u058b֦׀ր֍֍֛֭דׁ\u058b֒\u05cb\u05ca\u05ce\u05cd֖חֻ֚֜ןֶ֫גךבןץ֭֬",
                  (byte)29,
                  70
               );
               f[6] = NLoginCore_433.D("ѝюѯѤѡѧҀѷѢэыѥѭѠѼѝѱҐ҈ѪѥҘџѠ", (byte)29, 68);
               f[7] = NLoginCore_027.A("íêôĲĊ÷ĮĪðăıĪďĒĘĢĀĹüĶĢğČč", (byte)29, 65);
               f[8] = NLoginCore_223.F("ԡԥԆԵ\u0557ԖԶԖՄՒԨԱԞԞաՖԞՐՅԸԽՕԬԭ", (byte)29, 70);
               f[9] = NLoginCore_091.F("ԱՇՒԝԯԧՈՐԱԤՋԱՌԸԬՔ՝ՐԴ՜ԺԣԸԨ՝զԨ\u0558ՀկըՊ", (byte)29, 70);
               f[10] = NLoginCore_451.C("єјйѨҊщѩщѷ҅ќњыѝҋҋ҆ѿєѤҏѲџѠ", (byte)29, 67);
               f[11] = NLoginCore_241.D("єјйѨҊщѩщѷ҅ѝѫѝѦѾѳҕѯѲѮѹѲџѠ", (byte)29, 68);
               f[12] = NLoginCore_433.B("āąæĕķöĖöĤĲċĻđėĠīğýĘąĺğČč", (byte)29, 66);
               f[13] = NLoginCore_471.A("ĳąćčİõïùħċĮā", (byte)29, 65);
               f[14] = NLoginCore_138.B("ĊĉĠĨïÿęĦĵíČĞľĭŁþļĤĵĎěĵČč", (byte)29, 66);
               f[15] = NLoginCore_241.A("úĞĦēĪĤïĬĊôĤĞûĖĶĵāďĬĺĠŅČč", (byte)29, 65);
               f[16] = NLoginCore_183.B("ñýëĥıöģĂķíČĩĭŀĈĖķýğĥĳğČč", (byte)29, 66);
               f[17] = NLoginCore_201.E("ԑԝԋՅՑԖՃԢ\u0557ԍԭՋՐԗԚԻ՞ԱՑԹ՝եԬԭ", (byte)29, 69);
               f[18] = NLoginCore_387.F("ԌԾՐՎՍԫՆՃԫՎԯՇԩՒաԪԸՍԮեՆՈՖԣՂՔԫաժՃձՇ", (byte)29, 70);
               f[19] = NLoginCore_451.E("\u0530ԒԲԶԒԯԓԥԓՔ\u0530ԡ", (byte)29, 69);
               f[20] = NLoginCore_110.D("ѐљўѰєіѾ҇Ҍҏѣє", (byte)29, 68);
               f[21] = NLoginCore_141.E("ԌԋԑԨԢԥԔԒԷԺԻԜԷՏՀ՚ԝՓԻԠՆԿԬԭ", (byte)29, 69);
               f[22] = NLoginCore_433.E("ԌԋԑԨԢԥԔԒԷԺԻԧԚԮԶՕՀԶ՞Ԣ՛ԿԬԭ", (byte)29, 69);
               f[23] = NLoginCore_553.C("ѶѧњѼѼм҂҈ҁѥҍѢ҄ѩѝ҆ғєѯѨѷѢџѠ", (byte)29, 67);
               break;
            case 2:
               f[0] = NLoginCore_387.F("ԎԪԆՌՌԉԕԕԧՐԎՅԴԘԴԴՔՠԬԢԢԯԬԭ", (byte)29, 70);
            case 3:
            default:
               break;
            case 4:
               f[0] = NLoginCore_201.C("сѓѱѰ҃Ҁѳѽъчѿтҋў҃ѽѾяѩѱѷѢџѠ", (byte)29, 67);
         }
      }
   }

   static {
      b();
   }

   @Override
   protected void b(ResultSet var1) {
      JSONObject var2 = new JSONObject(var1.getString(a(cy, cz ^ dc)));
      this.r = var2.getString(a(dd, df));
      long var3 = var2.getLong(a(dh, di ^ dj));
      long var5 = var2.has(a(dk & dl, dm)) ? var2.getLong(a(dn, dp ^ ds)) : System.currentTimeMillis();
      boolean var7 = var2.getBoolean(a(dt, dv));
      String var8 = var2.has(a(dw & dx, dy)) ? var2.getString(a(dz, eb ^ ee)) : null;
      String var9 = var2.has(a(ek, el)) ? var2.getString(a(em, eo)) : null;
      String var10 = a(eq & er, es) + var9;
      Consumer var11 = var4 -> var4.a(var3, var5);
      if (var7) {
         this.a(this.r, var10, var8, null, null, var11);
      } else {
         this.a(this.r, var10, var8, null, var11);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 120L;
      var1 ^= 5737158000913132138L;
      if (e[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(66 + 2),
                     (byte)(63 + 6),
                     (byte)(73 + 10),
                     (byte)(7 + 40),
                     (byte)(47 + 20),
                     (byte)(42 + 24),
                     (byte)(5 + 62),
                     (byte)(23 + 24),
                     (byte)(48 + 32),
                     (byte)(18 + 57),
                     (byte)(2 + 65),
                     (byte)(60 + 23),
                     (byte)(2 + 51),
                     (byte)(55 + 25),
                     (byte)(83 + 14),
                     (byte)(48 + 52),
                     (byte)(48 + 52),
                     (byte)(68 + 37),
                     110,
                     (byte)(94 + 9)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(65 + 4), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_141.C("ҟҬҫѮҮҪҥҮҹҨѵҳҷҰҳҹѻࠍࠊࠐ߳ߺࠛࠓࠉࠜࠞࠞࠀࠔࠌࠤ", (byte)45, 67));
         }

         byte[] var5 = new byte[8];
         var5[0] = (byte)(var1 >>> 56);

         for (int var6 = 1; var6 < 8; var6++) {
            var5[var6] = (byte)(var1 << var6 * 8 >>> 56);
         }

         var3.init(2, var4.generateSecret(new DESKeySpec(var5)), new IvParameterSpec(new byte[8]));
         e[var0] = new String(var3.doFinal(Base64.getDecoder().decode(f[var0])), StandardCharsets.UTF_8);
      }

      return e[var0];
   }

   public NLoginCore_514(NLoginType_008 var1) {
      super(var1, NLoginCore_479.d, a(e, p), a(y, ab ^ ac));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_514.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_387.B("ōůűőŵƔƌƢƎŝƛƑƟƙŢƇƩƨƠƦƠŵ", (byte)83, 66), NLoginCore_514.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_451.A("ƈƕƔŗƗƓƎƗƢƑŞƜƠƙƜƢŤӶӳӹӜӣԄӼӲԅԇԇөӽӵԍſ", (byte)83, 65) + var1 + NLoginCore_427.A("ş", (byte)83, 65) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void c(NLoginCore_219 var1) {
      String var2 = var1.a(a(al, at ^ au), a(bd & bf, bh));
      if (a(bi, bk ^ bm).equals(var2)) {
         throw new UnsupportedOperationException(a(bn, bo ^ br));
      } else {
         boolean var3 = a(bu, bv ^ by).equals(var2);
         if (var3) {
            File var4 = new File(this.b(), a(bz, ca ^ cd));
            this.d = NLoginCore_586.a(this.m, var4, new Properties());
         } else {
            String var8 = var1.a(a(ce & cg, ci), a(cj, ck ^ cl));
            String var5 = var1.b(a(cm, cn ^ cp));
            String var6 = var1.b(a(cr, ct));
            String var7 = var1.b(a(cv, cw ^ cx));
            this.d = NLoginCore_034.b(this.m, NLoginCore_147.a(var8, var5, var6, var7, new Properties(), NLoginCore_036.d.i()));
         }
      }
   }
}
