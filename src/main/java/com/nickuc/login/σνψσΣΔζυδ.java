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

public enum σνψσΣΔζυδ {
   a(c<"㺃">(σνψσΣΔζυδ.q, σνψσΣΔζυδ.r ^ σνψσΣΔζυδ.s), c<"㺆">(σνψσΣΔζυδ.t, σνψσΣΔζυδ.u)),
   b(c<"㺌">(σνψσΣΔζυδ.z, σνψσΣΔζυδ.aa), c<"㺏">(σνψσΣΔζυδ.ab, σνψσΣΔζυδ.ac ^ σνψσΣΔζυδ.ad)),
   c(c<"㺕">(σνψσΣΔζυδ.ah, σνψσΣΔζυδ.ai), c<"㺘">(σνψσΣΔζυδ.aj, σνψσΣΔζυδ.ak ^ σνψσΣΔζυδ.al)),
   d(c<"㺞">(σνψσΣΔζυδ.ap & σνψσΣΔζυδ.aq, σνψσΣΔζυδ.ar), c<"㺡">(σνψσΣΔζυδ.as, σνψσΣΔζυδ.at ^ σνψσΣΔζυδ.au));

   public final String bk;
   public final String bl;
   private static String[] a = new String[σνψσΣΔζυδ.k];
   private static String[] b = new String[σνψσΣΔζυδ.l];
   private static long c;
   private static int a = 0 >>> 156 | 0 << -156;
   private static long b = Long.reverse(8250629998600340730L);
   private static int c = (8192 >>> 205 | 8192 << -205) & -1;
   private static int d = Integer.reverse(-1);
   private static long e = Long.reverse(8250629998600340730L);
   private static int f = Integer.reverse(536870912);
   private static int g = Integer.reverse(0);
   private static int h = (4194304 >>> 54 | 4194304 << -54) & -1;
   private static int i = 512 >>> 40 | 512 << -40;
   private static int j = Integer.reverse(-1073741824);
   private static int k = Integer.reverse(1879048192);
   private static int l = (448 >>> 5 | 448 << -5) & -1;
   private static int m = Integer.reverse(1073741824);
   private static long n = Long.reverse(-540396474026867462L);
   private static long o = Long.reverse(-8502796096475496448L);
   private static int p = 0 >>> 108 | 0 << ~108 + 1;
   private static int q = Integer.reverse(-1073741824);
   private static long r = Long.reverse(-540396474026867462L);
   private static long s = Long.reverse(-8502796096475496448L);
   private static int t = (131072 >>> 143 | 131072 << -143) & -1;
   private static long u = Long.reverse(8250629998600340730L);
   private static int v = 40 >>> 35 | 40 << ~35 + 1;
   private static long w = Long.reverse(-540396474026867462L);
   private static long x = Long.reverse(-8502796096475496448L);
   private static int y = 256 >>> 72 | 256 << -72;
   private static int z = Integer.reverse(1610612736);
   private static long aa = Long.reverse(8250629998600340730L);
   private static int ab = Integer.reverse(-536870912);
   private static long ac = Long.reverse(-540396474026867462L);
   private static long ad = Long.reverse(-8502796096475496448L);
   private static int ae = ('耀' >>> 'L' | 32768 << ~76 + 1) & -1;
   private static long af = Long.reverse(8250629998600340730L);
   private static int ag = (4194304 >>> 149 | 4194304 << ~149 + 1) & -1;
   private static int ah = Integer.reverse(-1879048192);
   private static long ai = Long.reverse(8250629998600340730L);
   private static int aj = Integer.reverse(1342177280);
   private static long ak = Long.reverse(-540396474026867462L);
   private static long al = Long.reverse(-8502796096475496448L);
   private static int am = Integer.reverse(-805306368);
   private static long an = Long.reverse(8250629998600340730L);
   private static int ao = 98304 >>> 143 | 98304 << -143;
   private static int ap = Integer.reverse(805306368);
   private static int aq = (-1 >>> 225 | -1 << -225) & -1;
   private static long ar = Long.reverse(8250629998600340730L);
   private static int as = Integer.reverse(-1342177280);
   private static long at = Long.reverse(-540396474026867462L);
   private static long au = Long.reverse(-8502796096475496448L);

   private static void b() {
      c = 6855186686704615711L;
      long var0 = c ^ 4952038128344746915L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               (byte)(53 + 16),
               (byte)(19 + 64),
               47,
               (byte)(36 + 31),
               (byte)(38 + 28),
               (byte)(47 + 20),
               (byte)(40 + 7),
               (byte)(10 + 70),
               (byte)(66 + 9),
               (byte)(11 + 56),
               (byte)(16 + 67),
               (byte)(16 + 37),
               80,
               (byte)(25 + 72),
               (byte)(59 + 41),
               (byte)(57 + 43),
               (byte)(6 + 99),
               (byte)(106 + 4),
               (byte)(37 + 66)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(29 + 39), 69, (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
               b[0] = δΛψπξκσβγςα.E("կքգք֥֦֞֝նֆ֚ձ", (byte)109, 69);
               b[1] = ΣδτΠνεγοΓορητ.E("փ֑՝֗֟ամթ֧՝ֈձ", (byte)109, 69);
               b[2] = ΣδτΠνεγοΓορητ.A("ƳǍƽƭƬǃƕǂƖƱǒơ", (byte)109, 65);
               b[3] = ΦδφπθΩΩλζξ.B("ƳǁƍǇǏƑƤƙǗƍƸơ", (byte)109, 66);
               b[4] = ΣδτΠνεγοΓορητ.D("Ֆդ\u0530ժղԴՇԼպ\u0530՛Մ", (byte)109, 68);
               b[5] = βθκςνθΩθυμςτκχ.C("ԾՔՖԵՁձռՊՒԶ\u0557Մ", (byte)109, 67);
               b[6] = ζοηκορΦνΣθγΩ.E("֙ծ֓ք֛ֆռձ֒ե֤֞։֮֫ֆ֠ղ֎ֳֵ֫ռս", (byte)109, 69);
               b[7] = ΣερμΔσατσκ.F("֣֝ռ֤֜֘տփ֚շռձ", (byte)109, 70);
               b[8] = ΣδτΠνεγοΓορητ.C("զՐխՎխՎՖԳկթՋՄ", (byte)109, 67);
               b[9] = μζξτΩσσφυδεπλΨ.E("վՙրռվ֡՚ղ՜սրձ", (byte)109, 69);
               b[10] = ΣερμΔσατσκ.D("ԾխձԮԵՔղեռ\u0558ձՄ", (byte)109, 68);
               b[11] = ιΠοθΩΦξκ.C("ՎՅՆգՈԳՉձՖԴԾՄ", (byte)109, 67);
               b[12] = ΨφιωσρΓδΔθ.E("հբտկրջհպ֖֢֨։ի֡տ֥֩֒րի֩տռս", (byte)109, 69);
               b[13] = ΠΛΨοδΩσμνΛγΦφβς.D("գհՈՁիՐԸԷծՈՏՄ", (byte)109, 68);
               break;
            case 1:
               b[0] = μζξτΩσσφυδεπλΨ.D("դՉՈՃթՔՐձռԵՋՄ", (byte)109, 68);
               b[1] = φδχεθοκψαλΛογλ.B("ƌǃǈƞƱƥƭƓǏǍƬơ", (byte)109, 66);
               b[2] = χΠξΦιζΨΣωΦσΨζ.C("Նլ\u0530ԷխոՆՌՏԶԺՄ", (byte)109, 67);
               b[3] = θεωψξβΛσσ.D("իՂհՅՇՈոիՅԹ՛Մ", (byte)109, 68);
               b[4] = ΨφιωσρΓδΔθ.E("՞շղ֚սյվվ֪֝ռձ", (byte)109, 69);
               b[5] = ιΠοθΩΦξκ.C("՞լբՃ\u0558՛Օ՜\u0558յչՌյ՟՚՞Րև՟շժՒՏՐ", (byte)109, 67);
               b[6] = οΩνΩρωλΨηΛδωδ.A("ǉƞǃƴǋƶƬơǂƕǓƜƖƶǡǂǠƫƬƹǏƯƬƭ", (byte)109, 65);
               b[7] = ντθΔζβΔζ.E("֊֠ոռ֟ՠէ֓֙\u058c֞ձ", (byte)109, 69);
               b[8] = ντθΔζβΔζ.A("ƺƱƒƬƵƮǆƓǏǎƓơ", (byte)109, 65);
               b[9] = ΨΦνΨΦωυΩνβςμ.A("ƾƻƪƝƧƴƓǏƒǕƬǅƭǈƗƘǊǘǀǅǠǥƬƭ", (byte)109, 65);
               b[10] = πχσδΦΦνθΔπ.C("ն\u0557ՀՖթիխՈ՜վսՄ", (byte)109, 67);
               b[11] = ιΠοθΩΦξκ.C("գյՂէՃոչ՝ՓճՌԾծՊՏՍԾ՜և՟ԿՒՏՐ", (byte)109, 67);
               b[12] = ΨΦνΨΦωυΩνβςμ.E("հբտկրջհպ֖֢֧ֈք֡֊ռս\u058c\u058c֤֗տռս", (byte)109, 69);
               b[13] = οοθδΨιοΦΠβδζ.A("ǂƅƽƲƣƍǈơǘǕǆơ", (byte)109, 65);
               break;
            case 2:
               b[0] = λΣΩσμφγχ.B("ƌƴƬƣƫǘǑƑƲƕƱƛƮƧƿƭǚǜǟƸƿƽǖǠǝƷƺǘƤǞƸǫ", (byte)109, 66);
            case 3:
            default:
               break;
            case 4:
               b[0] = λΣΩσμφγχ.A("ǋƅƨƴǆǈǙƖǃǋǚơ", (byte)109, 65);
         }
      }
   }

   static {
      b();
   }

   private static String a(int var0, long var1) {
      var1 ^= 81L;
      var1 ^= 4952038128344746915L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(22 + 46),
                     (byte)(33 + 36),
                     (byte)(35 + 48),
                     (byte)(40 + 7),
                     (byte)(56 + 11),
                     (byte)(38 + 28),
                     (byte)(47 + 20),
                     (byte)(15 + 32),
                     (byte)(55 + 25),
                     75,
                     (byte)(31 + 36),
                     (byte)(65 + 18),
                     (byte)(41 + 12),
                     (byte)(9 + 71),
                     (byte)(78 + 19),
                     (byte)(91 + 9),
                     (byte)(87 + 13),
                     (byte)(11 + 94),
                     (byte)(53 + 57),
                     103
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(65 + 18)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΣερμΔσατσκ.D("ӼԉԈӋԋԇԂԋԖԅӒԐԔԍԐԖӘ\u086dࡨࡴࡰࡑࡃࡦࡶࡦ", (byte)76, 68));
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

   @Generated
   private σνψσΣΔζυδ(String var3, String var4) {
      this.bk = var3;
      this.bl = var4;
   }

   public String b(String var1, boolean var2) {
      return var2 ? this.bl + ψΓωτιμωκχψΛΨ.X() + this.bk + (this == d ? c<"㺀">(a, b) : c<"㺃">(c & d, e)) + var1 : ψΓωτιμωκχψΛΨ.X() + this.bk + var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  σνψσΣΔζυδ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΦδφπθΩΩλζξ.D("ԕԷԹԙԽ՜ՔժՖԥգՙէաԪՏձհըծըԽ", (byte)104, 68), σνψσΣΔζυδ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ςΦζσμτΓσ.E("և֔֓Ֆ֖֒֍֖֡\u0590՝֛֛֟֘֡գࣱࣸࣳࣿࣻࣜ࣎ँࣱո", (byte)104, 69) + var1 + οοθδΨιοΦΠβδζ.A("Ɖ", (byte)104, 65) + var2.toString(), var4
         );
      }
   }
}
