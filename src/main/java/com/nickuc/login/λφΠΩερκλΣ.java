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

public class λφΠΩερκλΣ implements θβορΛτηατθΨτΠτΦ, μθοδηοΠνΦΛνξΛ {
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
   private final ΨγημιδξΓτοθαζ z;
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
   private static String[] b = new String[be];
   private static long g = Long.reverse(1729382256910270464L);
   private static int l = Integer.reverse(-1);
   private static int ac = (14 >>> 65 | 14 << ~65 + 1) & -1;
   private static long ab = Long.reverse(-5561543878746664748L);
   private static int y = Integer.reverse(536870912);
   private static long m = Long.reverse(-5561543878746664748L);
   private static int h = (0 >>> 214 | 0 << -214) & -1;
   private static int z = Integer.reverse(1610612736);
   private static int n = 65536 >>> 208 | 65536 << -208;
   private static String[] a = new String[λφΠΩερκλΣ.bd];
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
      if (a[var0] == null) {
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
            throw new RuntimeException(βθκςνθΩθυμςτκχ.E("ԟԬԫӮԮԪԥԮԹԨӵԳԷ\u0530ԳԹӻ࢈\u0894\u086fࡹࢆ\u0893ࢍ\u088fࡸ", (byte)0, 69));
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

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(PacketReceiveEvent var1) {
      User var2 = var1.getUser();
      Channel var3 = (Channel)var1.getChannel();
      ωΦΛΩμυνθφςςκαα var4 = (ωΦΛΩμυνθφςςκαα)var3.attr(ωΦΛΩμυνθφςςκαα.f).get();
      if (var4 == null) {
         String var8 = c<"㺀">(a & b, d) + var2.getName() + c<"㺃">(e, f ^ g);
         ψΓωτιμωκχψΛΨ.c(var8);
         String[] var10001 = new String[i];
         var10001[j] = c<"㺆">(k & l, m);
         var10001[n] = c<"㺉">(o, p ^ q);
         var10001[r] = c<"㺌">(s, t ^ u) + var8;
         var10001[v] = c<"㺏">(w, x);
         var10001[y] = c<"㺒">(z & aa, ab);
         αυμξτυζΩ.i(var2, βιχγΓλχΠσπ.a(var10001));
      } else {
         String var5 = var4.d();
         InetAddress var6 = var2.getAddress().getAddress();
         ΛΨΨγδσκνψνε var7 = νκσΩννοψξ.a(var5, var6);
         switch (ΓιτχζδΓΠ.Q[var7.ordinal()]) {
            case 1:
            case 2:
               νκσΩννοψξ.a(this.z, var5, var6, ΛΨΨγδσκνψνε.a);
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
                  λφΠΩερκλΣ.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ντθΔζβΔζ.F("Փյշ\u0557ջ֚֒֨֔գ֥֡֗֟ը֍֦֦֮֯֬ջ", (byte)111, 70), λφΠΩερκλΣ.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            χΠξΦιζΨΣωΦσΨζ.D("եղձԴմհիմտծԻչսնչտՁ࣎ࣚࢵࢿ࣓࣌ࣙࣕࢾՖ", (byte)111, 68) + var1 + πηγμΣΔκκ.F("ե", (byte)111, 70) + var2.toString(), var4
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
               b[0] = οΩνΩρωλΨηΛδωδ.D("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюгЧрѝџџѨѪяъл", (byte)1, 68);
               b[1] = φΨαξωυθανΣφυκη.D("ЁУЅϭдТϮРЈЄϹЧϺМРпϽкЎмпхЁнзЁУсЕнНщЬьмЍОЧЏЦЕШЕюМшЩєЩкяКїизѦцфѨхѣѩуылѭѦќоџѦѴсыєѓљѲкѡѐҁуѱѾўыь", (byte)1, 68);
               b[2] = ΣφδσΔζιΠρα.C("ЯЄаАϳϳЅЈЎКЙАлЩЪЛЯЎϾоНОЋЌ", (byte)1, 67);
               b[3] = ΨΦνΨΦωυΩνβςμ.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
               b[4] = ζοηκορΦνΣθγΩ.E("ԱԫԤԉԳԈԊԧӶԴӻԅ", (byte)1, 69);
               b[5] = χΠξΦιζΨΣωΦσΨζ.D("ОЉТЄРЅϳЗϷЕЭЀ", (byte)1, 68);
               b[6] = δΛψπξκσβγςα.D("ІϼϥОЅϾϱРЈЂЄМВЭЯсЉсЮНхнмгчЫФлышсхцФёаЧАёТйьќэЏћвггмѝзлєЫЬ", (byte)1, 68);
               b[7] = χΠξΦιζΨΣωΦσΨζ.F("ԏԌԴӳԭԑӷԵԴԫԨՂԑӽԢԭԖԅԣԃԀԁՇՁԯԆԨԮԡԏՐԱԣԧԷԣԒԒԯ\u0530ԭԶԹԴՃԭՎ\u0557Ԟ\u0558ՁԛՓԸԬՅբդդխկՔՏՀ", (byte)1, 70);
               b[8] = πψυκΠΨμΛΩβΣφμφσ.B("ÊìÎ¶ýë·éÑÍÂðÃåéĈÆă×ąĈĎÊĆĀÊìĊÞĆæĒõĕąÖçðØïÞñÞėåđòĝòăĘãĠāĀįďčıĎĬĲČĔĄĶįĥćĨįĽĊĔĝĜĢĻăĪęŊČĺŇħĔĕ", (byte)1, 66);
               b[9] = ιΠοθΩΦξκ.C("ЯЄаАϳϳЅЈЎКЙАлЩЪЛЯЎϾоНОЋЌ", (byte)1, 67);
               b[10] = ςπυηννναΣ.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
               b[11] = πηγμΣΔκκ.A("õïèÍ÷ÌÎëºø¿É", (byte)1, 65);
               b[12] = οΩνΩρωλΨηΛδωδ.A("çÒëÍéÎ¼àÀÞöÉ", (byte)1, 65);
               b[13] = μεςΩΔΣγν.C("ІϼϥОЅϾϱРЈЂЄМВЭЯсЉсЮНхнмгчЫФлышсхцФёаЧАёТйьќэЏћвггмѝзлєЫЬ", (byte)1, 67);
               break;
            case 1:
               b[0] = λΣΩσμφγχ.D("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюжшмхзїдХэѪа", (byte)1, 68);
               b[1] = πχσδΦΦνθΔπ.B("ÊìÎ¶ýë·éÑÍÂðÃåéĈÆă×ąĈĎÊĆĀÊìĊÞĆæĒõĕąÖçðØïÞñÞėåđòĝòăĘãĠāĀįďčıĎĬĲČĔĄĶįĥćĨįĽĊĔğğŁĝđĺĹŀĈłģĽĔĕ", (byte)1, 66);
               b[2] = χφπρψπφΦθμπ.C("ЯЄаАϳϳЅЈЎКЙийЧЫМЊНЍхоЎЋЌ", (byte)1, 67);
               b[3] = ςπυηννναΣ.A("òèÈè´ï·Ì»Ï»É", (byte)1, 65);
               b[4] = πχσδΦΦνθΔπ.C("ϪНГШбϬТдЎЭйЀ", (byte)1, 67);
               b[5] = ζοηκορΦνΣθγΩ.B("Â¹Ì³¸à÷éúóöÉ", (byte)1, 66);
               b[6] = ΨΦνΨΦωυΩνβςμ.E("ԋԁӪԣԊԃӶԥԍԇԉԡԗԲԴՆԎՆԳԢՊՂՁԸՌ\u0530ԩՀՐՍՆՊՋԩՖԵԬԕՖԧԾՑաԮԔՃԮՏՃԶբՆՊՙ\u0530Ա", (byte)1, 69);
               b[7] = ζοηκορΦνΣθγΩ.C("ЊЇЯϮШЌϲаЯЦУнЌϸНШБЀОϾϻϼтмЪЁУЩМЊыЬОТвОЍЍЪЫШбдЯоШщђЙѓмЖюкиСгдеѪѕѦцћ", (byte)1, 67);
               b[8] = μζξτΩσσφυδεπλΨ.D("ЁУЅϭдТϮРЈЄϹЧϺМРпϽкЎмпхЁнзЁУсЕнНщЬьмЍОЧЏЦЕШЕюМшЩєЩкяКїизѦцфѨхѣѩуылѭѦќоџѦѴсыѕгеѯѠѶоксжпѴыь", (byte)1, 68);
               b[9] = ξψθρΣΠΣς.E("ԴԉԵԕӸӸԊԍԓԟԜԘԚӹԥՆӸՅ\u0530ԄԅԹԐԑ", (byte)1, 69);
               b[10] = ΦδφπθΩΩλζξ.A("×ÆÎ·ç¹ÎüþÕúÉ", (byte)1, 65);
               b[11] = δΛψπξκσβγςα.B("ËðÛõÔùéßĂ¹þÉ", (byte)1, 66);
               b[12] = βεξΠθρρςΔΦμ.D("ЈϯЮЄДСЭЙЅЕеЀ", (byte)1, 68);
               b[13] = φδχεθοκψαλΛογλ.F("ԋԁӪԣԊԃӶԥԍԇԉԡԗԲԴՆԎՆԳԢՊՂՁԸՌ\u0530ԩՀՐՍՆՊՋԩՖԵԬԕՖԧԾՑՠԿՂ՞ԭԛԼՠ\u0530ՕՇԳ\u0530Ա", (byte)1, 70);
               break;
            case 2:
               b[0] = θεωψξβΛσσ.C("ЯЍϽЌОϰХЬддϺаДлЫнйϼзЯрупвϿХрмуйЅЫ", (byte)1, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = ζβησεθωυγτ.B("¶ÇÅúï×ÓÉÒäØÉ", (byte)1, 66);
         }
      }
   }

   @Override
   public void a(PacketSendEvent var1) {
      User var2 = var1.getUser();
      Channel var3 = (Channel)var1.getChannel();
      ωΦΛΩμυνθφςςκαα var4 = (ωΦΛΩμυνθφςςκαα)var3.attr(ωΦΛΩμυνθφςςκαα.f).get();
      if (var4 == null) {
         String var8 = c<"㺀">(ac, ad ^ ae) + var2.getName() + c<"㺃">(af, ag ^ ah);
         ψΓωτιμωκχψΛΨ.c(var8);
         String[] var10001 = new String[aj];
         var10001[ak] = c<"㺆">(al, am ^ an);
         var10001[ao] = c<"㺉">(ap, aq ^ ar);
         var10001[as] = c<"㺌">(at & au, av) + var8;
         var10001[aw] = c<"㺏">(ax, ay);
         var10001[az] = c<"㺒">(ba, bb ^ bc);
         αυμξτυζΩ.i(var2, βιχγΓλχΠσπ.a(var10001));
      } else {
         String var5 = var4.d();
         InetAddress var6 = var2.getAddress().getAddress();
         ΛΨΨγδσκνψνε var7 = νκσΩννοψξ.a(var5, var6);
         νκσΩννοψξ.a(this.z, var5, var6, var7 == ΛΨΨγδσκνψνε.b ? ΛΨΨγδσκνψνε.d : ΛΨΨγδσκνψνε.e);
      }
   }

   @Generated
   public λφΠΩερκλΣ(ΨγημιδξΓτοθαζ var1) {
      this.z = var1;
   }
}
