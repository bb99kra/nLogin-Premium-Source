package com.nickuc.login;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.geysermc.floodgate.api.FloodgateApi;

public class NLoginCore_286 implements NLoginInterface_007 {
   private static long af = Long.reverse(6034313055463619491L);
   private static int ak = (-1 >>> 121 | -1 << -121) & -1;
   private static long an = Long.reverse(-4341980485998003293L);
   private static long b = Long.reverse(6034313055463619491L);
   private static long ai = Long.reverse(-4341980485998003293L);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long al = Long.reverse(-4341980485998003293L);
   private static long p = Long.reverse(6034313055463619491L);
   private static int ao = Integer.reverse(805306368);
   private static final int s = NLoginCore_286.aq;
   private static int n = (0 >>> 104 | 0 << ~104 + 1) & -1;
   private static long g = Long.reverse(-4341980485998003293L);
   private static long q = Long.reverse(-8070450532247928832L);
   private static long ac = Long.reverse(6034313055463619491L);
   private static int w = Integer.reverse(1610612736);
   private static int am = 44 >>> 66 | 44 << -66;
   private static long d = Long.reverse(-8070450532247928832L);
   private static int f = (-1 >>> 148 | -1 << ~148 + 1) & -1;
   private static long y = Long.reverse(-8070450532247928832L);
   private static long ad = Long.reverse(-8070450532247928832L);
   private static int aq = Integer.reverse(Integer.MIN_VALUE);
   private static int t = 20480 >>> 236 | 20480 << ~236 + 1;
   private static long ag = Long.reverse(-8070450532247928832L);
   private static int h = Integer.reverse(Integer.MIN_VALUE);
   private static String[] a = new String[ao];
   private static long u = Long.reverse(6034313055463619491L);
   private static long j = Long.reverse(-4341980485998003293L);
   private static int ap = Integer.reverse(805306368);
   private static long s = Long.reverse(-4341980485998003293L);
   private static int aj = 655360 >>> 48 | 655360 << -48;
   private static int aa = Integer.reverse(0);
   public static NLoginCore_286 a = new NLoginCore_286();
   private static long c;
   private static int z = Integer.reverse(0);
   private static int a = (0 >>> 228 | 0 << ~228 + 1) & -1;
   private static int l = Integer.reverse(Integer.MIN_VALUE);
   private static int ab = Integer.reverse(-536870912);
   private static long x = Long.reverse(6034313055463619491L);
   private static long v = Long.reverse(-8070450532247928832L);
   private static int ae = 4194304 >>> 115 | 4194304 << -115;
   private static int i = (2 >>> 160 | 2 << ~160 + 1) & -1;
   private static int k = (0 >>> 247 | 0 << -247) & -1;
   private static int ah = (18432 >>> 171 | 18432 << ~171 + 1) & -1;
   private static int o = 3 >>> 32 | 3 << ~32 + 1;
   private static int m = 0 >>> 132 | 0 << ~132 + 1;
   private static int r = Integer.reverse(536870912);
   private static String[] b = new String[ap];

   private static void b() {
      c = -4189308158399447606L;
      long var0 = c ^ 4205642118873385630L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(53 + 15),
               (byte)(61 + 8),
               (byte)(46 + 37),
               (byte)(37 + 10),
               67,
               (byte)(50 + 16),
               (byte)(49 + 18),
               47,
               (byte)(54 + 26),
               (byte)(62 + 13),
               (byte)(54 + 13),
               (byte)(30 + 53),
               (byte)(9 + 44),
               (byte)(8 + 72),
               (byte)(19 + 78),
               (byte)(58 + 42),
               (byte)(69 + 31),
               (byte)(78 + 27),
               (byte)(51 + 59),
               (byte)(93 + 10)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(62 + 7), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_451.B("×çûĔčĒĆĒĎĢĖĎüęþãąèòċèäĪìðĐĆûĂıðĥıģĖĤĴĜėĳŀøĢć", (byte)16, 66);
               b[1] = NLoginCore_091.A("ĎïėĊÒÕìóĐĝûëĀòðþĨĔóåĈõòó", (byte)16, 65);
               b[2] = NLoginCore_027.C("ЮЛзКеёљѠкЯѢѣзѧЬџшпѰёѲѲьѝЮцѴѩѦяѶх", (byte)16, 67);
               b[3] = NLoginCore_110.B("ðćĕæèêċùØāöç", (byte)16, 66);
               b[4] = NLoginCore_183.A("äČìĘïûÖčĞàíÿėùôĒĩÛòħĖċĮĉćıûĂēĬóā", (byte)16, 65);
               b[5] = NLoginCore_027.D("ЪђвўесМѓѤЦгхѝпкјѯСиѭќўуъѡызѭебззќўѷѡѱѱѭѦпнјэ", (byte)16, 68);
               b[6] = NLoginCore_387.A("äČìĘïûÖčĞàíÿėùôĒĩÛòħĖĖĎćæāıêýïė÷", (byte)16, 65);
               b[7] = NLoginCore_004.D("бьяЪэЙуйчсбѩнжчџќШЩыѨыий", (byte)16, 68);
               b[8] = NLoginCore_092.C("ЧЧѓЩнђЭТсѨфЭ", (byte)16, 67);
               b[9] = NLoginCore_530.F("ԝԴՂԓԕԗԸԦԅԮԣԔ", (byte)16, 70);
               b[10] = NLoginCore_232.E("ԘԳԶԑԴԀԪԠԮԨԙԹՊԱԪՒԥԷՕԤՌԸԣՇԹԷԖաԾԱԺԛ", (byte)16, 69);
               b[11] = NLoginCore_173.B("ááčã÷ČçÜûĢþç", (byte)16, 66);
               break;
            case 1:
               b[0] = NLoginCore_397.A("×çûĔčĒĆĒĎĢĖĎüęþãąèòċèäĪìðĐĆûĂıðĥħĊąĨùĴĘñĹļŀć", (byte)16, 65);
               b[1] = NLoginCore_092.B("ĎïėĊÒÕìóĐĝüĔĚďĚąøûĈþĭīòó", (byte)16, 66);
               b[2] = NLoginCore_553.D("ЮЛзКеёљѠкЯѢѣзѧЬџшпѰёѲѲмѴѨбвэѸкњжйѴѪѝрѾѬѳќѥ҆э", (byte)16, 68);
               b[3] = NLoginCore_141.D("ўёѝЯЬееўУлПЭ", (byte)16, 68);
               b[4] = NLoginCore_110.D("ЪђвўесМѓѤЦгхѝпкјѯСиѭќќсѐдѥЮѱфвѯѴ", (byte)16, 68);
               b[5] = NLoginCore_076.F("ԑԹԙՅԜԨԃԺՋԍԚԬՄԦԡԿՖԈԟՔՃՅԪԱՈԲԞՔԜԘԞԞԯՒդաԿԼԣ՟բիաԴ", (byte)16, 70);
               b[6] = NLoginCore_232.E("ԑԹԙՅԜԨԃԺՋԍԚԬՄԦԡԿՖԈԟՔՃԳԤԩ՞ԼՊԪԺԟՠԽԳգՃԾ՟ԾէգժԸՋԴ", (byte)16, 69);
               b[7] = NLoginCore_183.F("ԘԳԶԑԴԀԪԠԮԨԘՇՀԯՇԫՄԳՉՈՇԌՇԬՋՌԧԻԬՑՁԟ", (byte)16, 70);
               b[8] = NLoginCore_232.D("ћИЫЩПѢюѣѕПѤѕїѦрћѣчцўњыий", (byte)16, 68);
               b[9] = NLoginCore_127.B("÷ĂõěèēùğĊÚÝç", (byte)16, 66);
               b[10] = NLoginCore_110.F("ԘԳԶԑԴԀԪԠԮԨԙԹՊԱԪՒԥԷՕԤՌԻԧ՜ԝԛԸԟԛՁ՛՜", (byte)16, 70);
               b[11] = NLoginCore_451.D("жжвзѠѕѓдучцдірщшячЫйЯыий", (byte)16, 68);
               break;
            case 2:
               b[0] = NLoginCore_397.D("іЧјГрўхСЮяѥфќФщонъѧѲссоѯіѨсѺфѧэъ", (byte)16, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_433.F("ՁԼԃӿԃԡՂԅԩՀՋԬՉՉԒԲԒՀԤԩՊՆԧՖԻՊՉԷԷԔՂ՛", (byte)16, 70);
         }
      }
   }

   static {
      b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_286.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_092.A("ƛƽƿƟǃǢǚǰǜƫǩǟǭǧưǕǷǶǮǴǮǃ", (byte)122, 65), NLoginCore_286.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_127.A("ǖǣǢƥǥǡǜǥǰǟƬǪǮǧǪǰƲԿԾՋՇՋԼՏՆǆ", (byte)122, 65) + var1 + NLoginCore_173.F("հ", (byte)122, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      return (boolean)(var2.a() == null ? l : m);
   }

   private static String a(int var0, long var1) {
      var1 ^= 9L;
      var1 ^= 4205642118873385630L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(9 + 59),
                     (byte)(6 + 63),
                     (byte)(18 + 65),
                     (byte)(38 + 9),
                     (byte)(23 + 44),
                     (byte)(21 + 45),
                     (byte)(25 + 42),
                     (byte)(42 + 5),
                     (byte)(4 + 76),
                     (byte)(71 + 4),
                     (byte)(23 + 44),
                     (byte)(72 + 11),
                     53,
                     (byte)(8 + 72),
                     (byte)(84 + 13),
                     (byte)(16 + 84),
                     (byte)(10 + 90),
                     (byte)(8 + 97),
                     (byte)(13 + 97),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(17 + 51), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_324.F("ց֎֍Ր\u0590\u058cև\u0590֛֊\u0557֛֕֙֒֕՝ࣱࣲࣩࣶࣶࣺ࣪ࣧ", (byte)98, 70));
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
   public void a(NLoginType_008 var1, NLoginCore_495 var2, NLoginCore_459 var3) {
      if (var1.b().j(a(e & f, g))) {
         String var4 = FloodgateApi.getInstance().getPlayerPrefix();
         if (var4 != null && var4.isEmpty()) {
            d(var1);
         }
      }

      var2.a(h);
      NLoginCore_370.c(a(i, j) + this.q());
   }

   @Override
   public boolean I() {
      return (boolean)n;
   }

   @Override
   public String q() {
      return a(a, b ^ d);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void d(NLoginType_008 var0) {
      File var1 = var0.a().d();
      StringBuilder var2 = new StringBuilder();

      try {
         NLoginCore_549 var3 = NLoginCore_428.a(var1);

         while (true) {
            boolean var9 = false /* VF: Semaphore variable */;

            try {
               var9 = true;
               String var4;
               if ((var4 = var3.ah()) == null) {
                  var9 = false;
                  break;
               }

               if (var2.length() > 0) {
                  var2.append(a(o, p ^ q));
               }

               if (var4.trim().startsWith(a(r, s))) {
                  var2.append(var4.replace(a(t, u ^ v), a(w, x ^ y)));
               } else {
                  var2.append(var4);
               }
            } finally {
               if (var9) {
                  if (Collections.singletonList(var3).get(aa) != null) {
                     var3.close();
                  }
               }
            }
         }

         if (Collections.singletonList(var3).get(z) != null) {
            var3.close();
         }
      } catch (IOException var12) {
         throw new RuntimeException(a(ab, ac ^ ad) + var1 + a(ae, af ^ ag), var12);
      }

      try {
         if (var1.delete()) {
            NLoginCore_294.a(var1, var2.toString().split(a(ah, ai)));
            var0.a().X();
            NLoginCore_195.e(var0);
         }
      } catch (IOException var10) {
         throw new RuntimeException(a(aj & ak, al) + var1 + a(am, an), var10);
      }
   }
}
