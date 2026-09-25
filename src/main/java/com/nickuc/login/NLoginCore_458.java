package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.protocol.player.User;
import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class NLoginCore_458 implements NLoginInterface_003, NLoginInterface_043 {
   private static int v = 24 >>> 163 | 24 << ~163 + 1;
   private static int al = 576 >>> 70 | 576 << ~70 + 1;
   private static long ah = Long.reverse(1729382256910270464L);
   private static int w = 640 >>> 167 | 640 << -167;
   private static int be = Integer.reverse(1879048192);
   private static long ad = Long.reverse(-6138004631050088236L);
   private static long ae = Long.reverse(1729382256910270464L);
   private static long an = Long.reverse(1729382256910270464L);
   private static int b = (-1 >>> 147 | -1 << ~147 + 1) & -1;
   private static long x = Long.reverse(-5561543878746664748L);
   private static long ar = Long.reverse(1729382256910270464L);
   private static int at = Integer.reverse(-805306368);
   private static int k = Integer.reverse(1073741824);
   private static int az = Integer.reverse(536870912);
   private final NLoginType_008 z;
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int au = Integer.reverse(-1);
   private static int ap = Integer.reverse(1342177280);
   private static long ag = Long.reverse(-6138004631050088236L);
   private static int j = 0 >>> 238 | 0 << ~238 + 1;
   private static int aa = -1 >>> 85 | -1 << -85;
   private static int ax = -2147483647 >>> 29 | -2147483647 << -29;
   private static int r = (1073741824 >>> 221 | 1073741824 << -221) & -1;
   private static int as = Integer.reverse(1073741824);
   private static long p = Long.reverse(-6138004631050088236L);
   private static String[] ZKM_STR_B = new String[be];
   private static long g = Long.reverse(1729382256910270464L);
   private static int l = Integer.reverse(-1);
   private static int ac = (14 >>> 65 | 14 << ~65 + 1) & -1;
   private static long ab = Long.reverse(-5561543878746664748L);
   private static int y = Integer.reverse(536870912);
   private static long m = Long.reverse(-5561543878746664748L);
   private static int h = (0 >>> 214 | 0 << -214) & -1;
   private static int z = Integer.reverse(1610612736);
   private static int n = 65536 >>> 208 | 65536 << -208;
   private static String[] ZKM_STR_A = new String[NLoginCore_458.bd];
   private static int ak = Integer.reverse(0);
   private static long aq = Long.reverse(-6138004631050088236L);
   private static long d = Long.reverse(-5561543878746664748L);
   private static int a = 0 >>> 6 | 0 << -6;
   private static int ba = Integer.reverse(-1342177280);
   private static long c;
   private static long q = Long.reverse(1729382256910270464L);
   private static int s = (2 >>> 223 | 2 << ~223 + 1) & -1;
   private static long ay = Long.reverse(-5561543878746664748L);
   private static long av = Long.reverse(-5561543878746664748L);
   private static long u = Long.reverse(1729382256910270464L);
   private static int ao = Integer.reverse(Integer.MIN_VALUE);
   private static long f = Long.reverse(-6138004631050088236L);
   private static long bb = Long.reverse(-6138004631050088236L);
   private static long t = Long.reverse(-6138004631050088236L);
   private static int aj = 2621440 >>> 243 | 2621440 << -243;
   private static int bd = Integer.reverse(1879048192);
   private static long bc = Long.reverse(1729382256910270464L);
   private static int af = Integer.reverse(268435456);
   private static long am = Long.reverse(-6138004631050088236L);
   private static int aw = (100663296 >>> 121 | 100663296 << -121) & -1;
   private static int ai = Integer.reverse(0);
   private static int i = Integer.reverse(-1610612736);
   private static int o = (24576 >>> 13 | 24576 << ~13 + 1) & -1;

   private static String a(int var0, long var1) {
      var1 ^= 24L;
      var1 ^= 1436641353287244469L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(37 + 31),
                     (byte)(57 + 12),
                     83,
                     (byte)(36 + 11),
                     (byte)(39 + 28),
                     (byte)(16 + 50),
                     (byte)(55 + 12),
                     (byte)(3 + 44),
                     (byte)(68 + 12),
                     (byte)(65 + 10),
                     (byte)(17 + 50),
                     (byte)(2 + 81),
                     (byte)(19 + 34),
                     (byte)(45 + 35),
                     97,
                     (byte)(92 + 8),
                     (byte)(31 + 69),
                     (byte)(40 + 65),
                     (byte)(89 + 21),
                     (byte)(97 + 6)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(61 + 22)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.E("ԟԬԫӮԮԪԥԮԹԨӵԳԷ\u0530ԳԹӻ࢈\u0894\u086fࡹࢆ\u0893ࢍ\u088fࡸ", (byte)0, 69));
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

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(PacketReceiveEvent var1) {
      User var2 = var1.getUser();
      Channel var3 = (Channel)var1.getChannel();
      NLoginCore_588 var4 = (NLoginCore_588)var3.attr(NLoginCore_588.f).get();
      if (var4 == null) {
         String var8 = a(a & b, d) + var2.getName() + a(e, f ^ g);
         NLoginCore_370.c(var8);
         String[] var10001 = new String[i];
         var10001[j] = a(k & l, m);
         var10001[n] = a(o, p ^ q);
         var10001[r] = a(s, t ^ u) + var8;
         var10001[v] = a(w, x);
         var10001[y] = a(z & aa, ab);
         NLoginCore_234.i(var2, NLoginCore_112.a(var10001));
      } else {
         String var5 = var4.d();
         InetAddress var6 = var2.getAddress().getAddress();
         NLoginCore_280 var7 = NLoginCore_073.a(var5, var6);
         switch (NLoginCore_408.Q[var7.ordinal()]) {
            case 1:
            case 2:
               NLoginCore_073.a(this.z, var5, var6, NLoginCore_280.a);
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
                  NLoginCore_458.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_110.F("Փյշ\u0557ջ֚֒֨֔գ֥֡֗֟ը֍֦֦֮֯֬ջ", (byte)111, 70), NLoginCore_458.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.D("եղձԴմհիմտծԻչսնչտՁ࣎ࣚࢵࢿ࣓࣌ࣙࣕࢾՖ", (byte)111, 68) + var1 + NLoginCore_138.F("ե", (byte)111, 70) + var2.toString(), var4
         );
      }
   }

   private static void b() {
      c = 3101134067307285333L;
      long var0 = c ^ 1436641353287244469L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(5 + 63),
               (byte)(27 + 42),
               (byte)(51 + 32),
               (byte)(10 + 37),
               (byte)(16 + 51),
               (byte)(62 + 4),
               (byte)(60 + 7),
               (byte)(14 + 33),
               (byte)(20 + 60),
               (byte)(35 + 40),
               67,
               (byte)(19 + 64),
               (byte)(14 + 39),
               (byte)(13 + 67),
               (byte)(25 + 72),
               (byte)(40 + 60),
               (byte)(80 + 20),
               (byte)(67 + 38),
               110,
               (byte)(20 + 83)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(49 + 20), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_397.D("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюгЧрѝџџѨѪяъл", (byte)1, 68);
               ZKM_STR_B[1] = NLoginCore_453.D("ЁУЅϭдТϮРЈЄϹЧϺМРпϽкЎмпхЁнзЁУсЕнНщЬьмЍОЧЏЦЕШЕюМшЩєЩкяКїизѦцфѨхѣѩуылѭѦќоџѦѴсыєѓљѲкѡѐҁуѱѾўыь", (byte)1, 68);
               ZKM_STR_B[2] = NLoginCore_451.C("ЯЄаАϳϳЅЈЎКЙАлЩЪЛЯЎϾоНОЋЌ", (byte)1, 67);
               ZKM_STR_B[3] = NLoginCore_127.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
               ZKM_STR_B[4] = NLoginCore_092.E("ԱԫԤԉԳԈԊԧӶԴӻԅ", (byte)1, 69);
               ZKM_STR_B[5] = NLoginCore_387.D("ОЉТЄРЅϳЗϷЕЭЀ", (byte)1, 68);
               ZKM_STR_B[6] = NLoginCore_183.D("ІϼϥОЅϾϱРЈЂЄМВЭЯсЉсЮНхнмгчЫФлышсхцФёаЧАёТйьќэЏћвггмѝзлєЫЬ", (byte)1, 68);
               ZKM_STR_B[7] = NLoginCore_387.F("ԏԌԴӳԭԑӷԵԴԫԨՂԑӽԢԭԖԅԣԃԀԁՇՁԯԆԨԮԡԏՐԱԣԧԷԣԒԒԯ\u0530ԭԶԹԴՃԭՎ\u0557Ԟ\u0558ՁԛՓԸԬՅբդդխկՔՏՀ", (byte)1, 70);
               ZKM_STR_B[8] = NLoginCore_201.B("ÊìÎ¶ýë·éÑÍÂðÃåéĈÆă×ąĈĎÊĆĀÊìĊÞĆæĒõĕąÖçðØïÞñÞėåđòĝòăĘãĠāĀįďčıĎĬĲČĔĄĶįĥćĨįĽĊĔĝĜĢĻăĪęŊČĺŇħĔĕ", (byte)1, 66);
               ZKM_STR_B[9] = NLoginCore_427.C("ЯЄаАϳϳЅЈЎКЙАлЩЪЛЯЎϾоНОЋЌ", (byte)1, 67);
               ZKM_STR_B[10] = NLoginCore_575.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
               ZKM_STR_B[11] = NLoginCore_138.A("õïèÍ÷ÌÎëºø¿É", (byte)1, 65);
               ZKM_STR_B[12] = NLoginCore_397.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
               ZKM_STR_B[13] = NLoginCore_521.C("ІϼϥОЅϾϱРЈЂЄМВЭЯсЉсЮНхнмгчЫФлышсхцФёаЧАёТйьќэЏћвггмѝзлєЫЬ", (byte)1, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_553.D("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюжшмхзїдХэѪа", (byte)1, 68);
               ZKM_STR_B[1] = NLoginCore_384.B("ÊìÎ¶ýë·éÑÍÂðÃåéĈÆă×ąĈĎÊĆĀÊìĊÞĆæĒõĕąÖçðØïÞñÞėåđòĝòăĘãĠāĀįďčıĎĬĲČĔĄĶįĥćĨįĽĊĔğğŁĝđĺĹŀĈłģĽĔĕ", (byte)1, 66);
               ZKM_STR_B[2] = NLoginCore_004.C("ЯЄаАϳϳЅЈЎКЙийЧЫМЊНЍхоЎЋЌ", (byte)1, 67);
               ZKM_STR_B[3] = NLoginCore_575.A("òèÈè´ï·Ì»Ï»É", (byte)1, 65);
               ZKM_STR_B[4] = NLoginCore_384.C("ϪНГШбϬТдЎЭйЀ", (byte)1, 67);
               ZKM_STR_B[5] = NLoginCore_092.B("Â¹Ì³¸à÷éúóöÉ", (byte)1, 66);
               ZKM_STR_B[6] = NLoginCore_127.E("ԋԁӪԣԊԃӶԥԍԇԉԡԗԲԴՆԎՆԳԢՊՂՁԸՌ\u0530ԩՀՐՍՆՊՋԩՖԵԬԕՖԧԾՑաԮԔՃԮՏՃԶբՆՊՙ\u0530Ա", (byte)1, 69);
               ZKM_STR_B[7] = NLoginCore_092.C("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюкиСгдеѪѕѦцћ", (byte)1, 67);
               ZKM_STR_B[8] = NLoginCore_446.D("ЁУЅϭдТϮРЈЄϹЧϺМРпϽкЎмпхЁнзЁУсЕнНщЬьмЍОЧЏЦЕШЕюМшЩєЩкяКїизѦцфѨхѣѩуылѭѦќоџѦѴсыѕгеѯѠѶоксжпѴыь", (byte)1, 68);
               ZKM_STR_B[9] = NLoginCore_141.E("ԴԉԵԕӸӸԊԍԓԟԜԘԚӹԥՆӸՅ\u0530ԄԅԹԐԑ", (byte)1, 69);
               ZKM_STR_B[10] = NLoginCore_232.A("×ÆÎ·ç¹ÎüþÕúÉ", (byte)1, 65);
               ZKM_STR_B[11] = NLoginCore_183.B("ËðÛõÔùéßĂ¹þÉ", (byte)1, 66);
               ZKM_STR_B[12] = NLoginCore_223.D("ЈϯЮЄДСЭЙЅЕеЀ", (byte)1, 68);
               ZKM_STR_B[13] = NLoginCore_433.F("ԋԁӪԣԊԃӶԥԍԇԉԡԗԲԴՆԎՆԳԢՊՂՁԸՌ\u0530ԩՀՐՍՆՊՋԩՖԵԬԕՖԧԾՑՠԿՂ՞ԭԛԼՠ\u0530ՕՇԳ\u0530Ա", (byte)1, 70);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_530.C("ЯЍϽЌОϰХЬддϺаДлЫнйϼзЯрупвϿХрмуйЅЫ", (byte)1, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_027.B("¶ÇÅúï×ÓÉÒäØÉ", (byte)1, 66);
         }
      }
   }

   @Override
   public void a(PacketSendEvent var1) {
      User var2 = var1.getUser();
      Channel var3 = (Channel)var1.getChannel();
      NLoginCore_588 var4 = (NLoginCore_588)var3.attr(NLoginCore_588.f).get();
      if (var4 == null) {
         String var8 = a(ac, ad ^ ae) + var2.getName() + a(af, ag ^ ah);
         NLoginCore_370.c(var8);
         String[] var10001 = new String[aj];
         var10001[ak] = a(al, am ^ an);
         var10001[ao] = a(ap, aq ^ ar);
         var10001[as] = a(at & au, av) + var8;
         var10001[aw] = a(ax, ay);
         var10001[az] = a(ba, bb ^ bc);
         NLoginCore_234.i(var2, NLoginCore_112.a(var10001));
      } else {
         String var5 = var4.d();
         InetAddress var6 = var2.getAddress().getAddress();
         NLoginCore_280 var7 = NLoginCore_073.a(var5, var6);
         NLoginCore_073.a(this.z, var5, var6, var7 == NLoginCore_280.b ? NLoginCore_280.d : NLoginCore_280.e);
      }
   }

   @Generated
   public NLoginCore_458(NLoginType_008 var1) {
      this.z = var1;
   }
}
