package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_376 extends NLoginCore_353 {
   private static int x = 0 >>> 38 | 0 << -38;
   private static long ar = Long.reverse(8453346185347064615L);
   private static long av = Long.reverse(8453346185347064615L);
   private static int j = Integer.reverse(0);
   private static int i = Integer.reverse(0);
   private static String[] b = new String[NLoginCore_376.bc];
   private static int q = Integer.reverse(-1073741824);
   private static String[] a = new String[NLoginCore_376.bb];
   private static long d = Long.reverse(4994581671526523687L);
   private static float ai = Float.intBitsToFloat(4288512 >>> 88 | 4288512 << ~88 + 1);
   private static int m = (0 >>> 194 | 0 << -194) & -1;
   private static long w = Long.reverse(4994581671526523687L);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static long z = Long.reverse(4994581671526523687L);
   private static int ac = Integer.reverse(0);
   private static long az = Long.reverse(4994581671526523687L);
   private static int l = (134217728 >>> 59 | 134217728 << ~59 + 1) & -1;
   private static int ab = 0 >>> 173 | 0 << -173;
   private static long p = Long.reverse(3458764513820540928L);
   private static int bc = Integer.reverse(1342177280);
   private static int ao = Integer.reverse(0);
   private static int k = Integer.reverse(1073741824);
   private static float aj = Float.intBitsToFloat(Integer.reverse(514));
   private static long am = Long.reverse(4994581671526523687L);
   private static int f = (-1 >>> 25 | -1 << ~25 + 1) & -1;
   private static int ah = Integer.reverse(0);
   private static long as = Long.reverse(3458764513820540928L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int r = Integer.reverse(-1);
   private static long s = Long.reverse(4994581671526523687L);
   private static int y = (81920 >>> 78 | 81920 << -78) & -1;
   private static int t = Integer.reverse(Integer.MIN_VALUE);
   private static int ag = Integer.reverse(0);
   private static int ak = (6 >>> 32 | 6 << -32) & -1;
   private static int ad = 16777216 >>> 120 | 16777216 << ~120 + 1;
   private static int ax = (524288 >>> 50 | 524288 << -50) & -1;
   private static int ae = Integer.reverse(1073741824);
   private static long c;
   private static int an = Integer.reverse(1073741824);
   private static int u = Integer.reverse(536870912);
   private static int c = Integer.reverse(0);
   private static int ay = Integer.reverse(-1879048192);
   private static int at = (0 >>> 14 | 0 << ~14 + 1) & -1;
   private static int af = Integer.reverse(Integer.MIN_VALUE);
   private static int al = -1 >>> 54 | -1 << ~54 + 1;
   private static int bb = (10 >>> 192 | 10 << -192) & -1;
   private static int aa = Integer.reverse(-1073741824);
   private static long g = Long.reverse(4994581671526523687L);
   private static int ap = Integer.reverse(Integer.MIN_VALUE);
   private static long o = Long.reverse(8453346185347064615L);
   private static int aq = 939524096 >>> 91 | 939524096 << -91;
   private static int ba = Integer.reverse(0);
   private static int v = (-1 >>> 242 | -1 << ~242 + 1) & -1;
   private static int au = Integer.reverse(268435456);
   private static long aw = Long.reverse(3458764513820540928L);
   private static int n = Integer.reverse(1073741824);

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_376.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.F("ՒմնՖպ֑֧֙֓բ֖֤֠֞է\u058c֥֥֭֮֫պ", (byte)110, 70), NLoginCore_376.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_091.F("֍֚֙՜֧֖֜֘֓֜գ֥֧֡֞֡թࣵऄࣱࣽࣷࣟऄ\u08e2ࣵࣘँऄࣹࣧփ", (byte)110, 70) + var1 + NLoginCore_427.D("Թ", (byte)110, 68) + var2.toString(), var4
         );
      }
   }

   static {
      b();
   }

   public NLoginCore_376(NLoginType_008 var1) {
      super(var1, a(c, d), a(e & f, g), (boolean)h, (boolean)i);
   }

   private static void b() {
      c = -1961387205292586322L;
      long var0 = c ^ -1758294923247816578L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               69,
               (byte)(19 + 64),
               47,
               (byte)(35 + 32),
               (byte)(40 + 26),
               (byte)(35 + 32),
               (byte)(36 + 11),
               (byte)(57 + 23),
               (byte)(50 + 25),
               (byte)(23 + 44),
               (byte)(58 + 25),
               (byte)(9 + 44),
               (byte)(53 + 27),
               (byte)(70 + 27),
               (byte)(30 + 70),
               (byte)(81 + 19),
               (byte)(64 + 41),
               (byte)(45 + 65),
               (byte)(100 + 3)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(21 + 47), (byte)(28 + 41), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_201.D("ѱфѫћіџѿяйѽкш", (byte)25, 68);
               b[1] = NLoginCore_223.C("ѰдѼкѺѱѕёѻѺџ҄ѱѱѐѩёрѬѼэѼѓє", (byte)25, 67);
               b[2] = NLoginCore_110.A("ĢĢôúĊéĥĦĄĆđòĀĎčĔıİĥúīĽĄą", (byte)25, 65);
               b[3] = NLoginCore_446.F("ՈՏՉԊԒՍՑԍԏԮԸԝ", (byte)25, 70);
               b[4] = NLoginCore_127.F("ԙԟԡԟՋՀԤԱԐԒՈԙՆԹԖԴ\u0530ԮԺբԴՑԨԩ", (byte)25, 70);
               b[5] = NLoginCore_141.D("ыѲїѽжмѓѫлёҁҀфѥѸ҃ѺѵхѺѾюѠѐ҇ѭѢѩђэғѹѷѯғҚѱћҍѷҁѶқҙҝѯҝѿҨ҈ҬҍѨ҄ѯ҉ҍҠѽ҈ұғү҉ҹұҙҖһҭѽҺҎҺҹ҈", (byte)25, 68);
               b[6] = NLoginCore_324.B("ģøåãĠĚđĬıĳćġîħøĤĭĎļĶğĚĶŀĂīĔĽĔľİľĕĕăōŀļěčĪĤġĤĥďĪĘńŅĖĚřŜőķŀěřĜĝņĺĤĳũłĹľťŁňŮŪŠĬŇőŧőŻĹŇķŹŽńŅ", (byte)25, 66);
               b[7] = NLoginCore_110.B("ĕċĈĈĘĤìđĳįĀù", (byte)25, 66);
               b[8] = NLoginCore_241.C("ѲђуяьчеэјѝыњѵѦцћѴѽ҇ьѶѯњѿѿ҂ѡѲѐҗҘҍҏљёҕҚѾѶѵҔґњѨ", (byte)25, 67);
               b[9] = NLoginCore_521.B("èēħĝĞþèîðĎóù", (byte)25, 66);
               break;
            case 1:
               b[0] = NLoginCore_201.A("þġĊĂýĬįûúĤëćİİĴĤĭíøĪľĽĄą", (byte)25, 65);
               b[1] = NLoginCore_453.B("ġåĭëīĢĆĂĬīēĮąĔģòĈĹĊćõĽĄą", (byte)25, 66);
               b[2] = NLoginCore_183.D("ѱѱущљиѴѵѓѕѡѴѱ҃ѧрђѥєѴфҌѓє", (byte)25, 68);
               b[3] = NLoginCore_241.C("йуѳэжыюњмєѭҀѽю҆ћѣчѥ҅ҀҌѓє", (byte)25, 67);
               b[4] = NLoginCore_138.B("õûýûħĜĀčìîĥđĮĎêĔăûĴĐöćĄą", (byte)25, 66);
               b[5] = NLoginCore_076.C("ыѲїѽжмѓѫлёҁҀфѥѸ҃ѺѵхѺѾюѠѐ҇ѭѢѩђэғѹѷѯғҚѱћҍѷҁѶқҙҝѯҝѿҨ҈ҬҍѨ҄ѯ҉ҍҠѽ҈ұғү҉҉ұѹҖҖһҧҿӂҀғ҈", (byte)25, 67);
               b[6] = NLoginCore_453.E(
                  "ՇԜԉԇՄԾԵՐՕ\u0557ԫՅԒՋԜՈՑԲՠ՚ՃԾ՚դԦՏԸաԸբՔբԹԹԧձդՠԿԱՎՈՅՈՉԳՎԼըթԺԾսրյ՛դԿսՀՁժ՞Ո\u0557֍զ՝բ։ել֒֎օշ\u0557մչը՞ը\u058bՓսստ֕֘֜ց֞֩ճ֞լ", (byte)25, 69
               );
               b[7] = NLoginCore_446.D("ѩуѼѼѕйѬѠіѵѣш", (byte)25, 68);
               b[8] = NLoginCore_201.E("ՇԧԘԤԡԜԊԢԭԲԠԯՊԻԛ\u0530ՉՒ՜ԡՋՄԯՔՔ\u0557ԶՇԥլխբԮԨԢՂՎՈՍլԭիդԳՎճԴՉՏԺԼՖղՋՈՉ", (byte)25, 69);
               b[9] = NLoginCore_141.C("эшиєѭѕѼѯъѫкѹхҁ҆ѵѦ҅уѭѿіѓє", (byte)25, 67);
               break;
            case 2:
               b[0] = NLoginCore_575.F("ԪԦԱԨԚԋՈԮՊՎԷՃԯՆԮԹԖ\u0557ԠՑ\u0558ԫԨԩ", (byte)25, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_201.E("ԿԜՇԫՓԿԍՏՐԱԕԪՔՓՕՕԐԟԜԼՙԫԨԩ", (byte)25, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 12L;
      var1 ^= -1758294923247816578L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(52 + 16),
                     (byte)(17 + 52),
                     (byte)(18 + 65),
                     (byte)(36 + 11),
                     (byte)(19 + 48),
                     (byte)(62 + 4),
                     67,
                     (byte)(44 + 3),
                     (byte)(57 + 23),
                     (byte)(23 + 52),
                     (byte)(53 + 14),
                     83,
                     (byte)(46 + 7),
                     (byte)(9 + 71),
                     (byte)(91 + 6),
                     (byte)(10 + 90),
                     (byte)(92 + 8),
                     (byte)(46 + 59),
                     (byte)(45 + 65),
                     (byte)(84 + 19)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(47 + 21), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_027.A("ƲƿƾƁǁƽƸǁǌƻƈǆǊǃǆǌƎԚԩԢԜԄԖԩԇԚӽԦԩԌԞ", (byte)104, 65));
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

   @Override
   public void b(NLoginInterface_042 var1, String[] var2) {
      if (var2.length != k) {
         NLoginCore_487 var9 = NLoginCore_487.x;
         Object[] var12 = new Object[l];
         var12[m] = a(n, o ^ p) + this.e().toLowerCase(Locale.ENGLISH) + a(q & r, s);
         NLoginCore_150.a(var1, var9, var12);
      } else {
         NLoginCore_270 var3 = new NLoginCore_270();
         String var4 = var2[t];
         if (a(u & v, w).equals(var4)) {
            NLoginCore_150.a(var1, NLoginCore_487.t);
         } else {
            NLoginCore_459 var10000 = this.a.a().a();
            String var10001 = a(y, z);
            Object[] var10002 = new Object[aa];
            var10002[ab] = NLoginCore_477.e.a(new Object[ac]);
            var10002[ad] = NLoginCore_436.g.getName();
            var10002[ae] = NLoginCore_436.g.getName();
            var10001 = String.format(var10001, var10002);
            var10002 = new Object[af];
            var10002[ag] = var4;
            NLoginCore_218 var5 = var10000.b(var10001, var10002);
            int var6 = (Integer)var5.d();
            if (var6 == 0) {
               NLoginCore_150.a(var1, NLoginCore_487.t);
            } else {
               NLoginCore_150.a(var1, NLoginCore_194.C, ai, aj);
               var10001 = a(ak & al, am);
               var10002 = new Object[an];
               var10002[ao] = var4;
               var10002[ap] = var6;
               NLoginCore_150.a(var1, var10001, var10002);
               NLoginCore_150.a(var1, a(aq, ar ^ as));
               NLoginCore_150.a(var1, a(au, av ^ aw) + var3.a(TimeUnit.SECONDS, ax) + a(ay, az));
            }
         }
      }
   }
}
