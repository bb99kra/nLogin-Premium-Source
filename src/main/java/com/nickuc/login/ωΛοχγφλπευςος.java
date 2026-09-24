package com.nickuc.login;

import com.nickuc.login.proxy.bungee.nLoginBungee;
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
import net.md_5.bungee.ServerConnection;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PluginMessageEvent;
import net.md_5.bungee.event.EventHandler;

public class ωΛοχγφλπευςος implements χιςζΓθωφρο {
   private static String[] a = new String[ωΛοχγφλπευςος.ae];
   private static long p = Long.reverse(-5774156773265975862L);
   private static int f = 32 >>> 37 | 32 << ~37 + 1;
   private static int ae = Integer.reverse(268435456);
   private static int j = 268435456 >>> 220 | 268435456 << ~220 + 1;
   private static int g = -1 >>> 217 | -1 << -217;
   private final nLoginBungee d;
   private static int x = Integer.reverse(1610612736);
   private static long y = Long.reverse(-5774156773265975862L);
   private static int ac = -1 >>> 82 | -1 << -82;
   private static int q = Integer.reverse(0);
   private static String[] b = new String[ωΛοχγφλπευςος.af];
   private static long w = Long.reverse(4611686018427387904L);
   private static long h = Long.reverse(-5774156773265975862L);
   private static int aa = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << -191) & -1;
   private static long c;
   private static int ab = 939524096 >>> 27 | 939524096 << -27;
   private static long v = Long.reverse(-1162470754838587958L);
   private static int l = (-1 >>> 187 | -1 << ~187 + 1) & -1;
   private static int b = Integer.reverse(0);
   private static long m = Long.reverse(-5774156773265975862L);
   private static int u = (320 >>> 38 | 320 << -38) & -1;
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static long ad = Long.reverse(-5774156773265975862L);
   private static int z = Integer.reverse(0);
   private static int s = Integer.reverse(536870912);
   private static int k = Integer.reverse(1073741824);
   private static int a = Integer.reverse(-1);
   private static int n = (100663296 >>> 185 | 100663296 << -185) & -1;
   private static int e = Integer.reverse(0);
   private static long d = Long.reverse(-5774156773265975862L);
   private static int r = 2097152 >>> 213 | 2097152 << -213;
   private static int o = (-1 >>> 136 | -1 << -136) & -1;
   private static int af = Integer.reverse(268435456);
   private static long t = Long.reverse(-5774156773265975862L);

   static {
      b();
   }

   private static void b() {
      c = 6028921560642386935L;
      long var0 = c ^ 602700047346163727L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(23 + 45),
               69,
               (byte)(60 + 23),
               (byte)(3 + 44),
               67,
               (byte)(24 + 42),
               (byte)(65 + 2),
               (byte)(16 + 31),
               (byte)(59 + 21),
               (byte)(51 + 24),
               (byte)(57 + 10),
               (byte)(18 + 65),
               (byte)(20 + 33),
               (byte)(10 + 70),
               (byte)(77 + 20),
               (byte)(79 + 21),
               (byte)(37 + 63),
               (byte)(84 + 21),
               (byte)(56 + 54),
               (byte)(71 + 32)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(75 + 8)}, StandardCharsets.UTF_8));
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
               b[0] = ζοηκορΦνΣθγΩ.E("ՙՎՠՅըՓբՠԯՊգԷԺզՅՐյսՔխԵ՜ՉՊ", (byte)58, 69);
               b[1] = ζβησεθωυγτ.F("՟ըկՆկՃՎեՌՙՖղթՅ՛Ժղ՛՟Պղ՜ՉՊ", (byte)58, 70);
               b[2] = ΣερμΔσατσκ.C("ӒӏҿһҼҙҚҿӤӔҡӃӛҲҽӬӚҥӭҺөҩӇӐұӤҲӖӎҫӅӋӴҶӬӧԀӻӵӛӠӚӓӯԇӢӕӶӋӫӪӰӞӧӢӠӋӧӣӉӪԈӯԐӹԇԍӟӾԖԞӾӼӟԇԅԘӺԠԢԆӼԝԧԝԯӶӷ", (byte)58, 67);
               b[3] = ιΠοθΩΦξκ.F("՜լ՚Ի՟կՔՇ՟ՅՇխՑՍՅՓշՓ՚ՍլՑՂՔֆբօ։ՙփևՍևֈ\u058b\u058cՠրՠ։իքճ֓օՔ֛՝֓ժ֠բ֑ՠխց֝պվսֆ֟՟֬֩ևտկօ֥֎֏֤օ֥ֈֱծֱ֭֨֞֫տׂ֤։֊", (byte)58, 70);
               b[4] = μζξτΩσσφυδεπλΨ.C("ӋҳҩҰүғҷӓӑҾҜҳӒҥҠӝҦӮҼҺҦӯӎҽҼөӁӷӥӆӧӕ", (byte)58, 67);
               b[5] = βεξΠθρρςΔΦμ.D("ӍқһӏӕӀҶҚӄҮӜӕҹҨҢӕҪӚӞҦӝӉҶҷ", (byte)58, 68);
               b[6] = φδχεθοκψαλΛογλ.B("ĵōĭġŠļņŋŊŵľĻ", (byte)58, 66);
               b[7] = ξψθρΣΠΣς.B("ĥŚĨņŎĹŮŠŧŁľũœŇůĺťŖĴŰżŊƁŠźœŧşƂƅŧƊƌŞƂƃūƎŬŊƑŲƁƊŎƆŖŮƚřŚŭřƍƝŭűŗťƝźƈƣżƊƘƛůƠƩżƢŽƱƮŮƅŶŸƈƔƎƛƙƶƁƱƗǃƽƂƥƄƩƄƶ", (byte)58, 66);
               break;
            case 1:
               b[0] = ΨφιωσρΓδΔθ.B("ŖŋŝłťŐşŝĬŇŠŅŔłŦŤŜűŋžżſņŇ", (byte)58, 66);
               b[1] = ςπυηννναΣ.A("ŜťŬŃŬŀŋŢŉŖŔŬŦřŖŐŌžņžſřņŇ", (byte)58, 65);
               b[2] = φΨαξωυθανΣφυκη.E(
                  "եբՒՎՏԬԭՒշէԴՖծՅՐտխԸրՍռԼ՚գՄշՅթաԾ\u0558՞ևՉտպ֓֎ֈծճխզւ֚յը։՞վսփձպյճ՞պն՜ս֛ւ֣\u058c֚֠ղֱ֑֑֩֏ղֺ֡շֱ֩֗ոַջִֵ֤֮֡֞֠\u05ca\u05caׂ֓\u058bַ", (byte)58, 69
               );
               b[3] = πχσδΦΦνθΔπ.A("řũŗĸŜŬőńŜłńŪŎŊłŐŴŐŗŊũŎĿőƃşƂƆŖƀƄŊƄƅƈƉŝŽŝƆŨƁŰƐƂőƘŚƐŧƝşƎŝŪžƚŷŻźƃƜŜƩƦƄżŬƂƢƋƌơƂƢƒƀƁƩźƭƾƩƴƑƯƆƇ", (byte)58, 65);
               b[4] = πχσδΦΦνθΔπ.A("śŃĹŀĿģŇţšŎĬŃŢĵİŭĶžŌŊĶĺŲŝŲŰƆŝŖŖņŹ", (byte)58, 65);
               b[5] = ζοηκορΦνΣθγΩ.B("ŝīŋşťŐņĪŔľŮũĪįŚŦĵĴőƀŭſņŇ", (byte)58, 66);
               b[6] = ΠΛΨοδΩσμνΛγΦφβς.B("ŕŀťŰŌŚŇŃıŇņĻ", (byte)58, 66);
               b[7] = ΣερμΔσατσκ.A("ĥŚĨņŎĹŮŠŧŁľũœŇůĺťŖĴŰżŊƁŠźœŧşƂƅŧƊƌŞƂƃūƎŬŊƑŲƁƊŎƆŖŮƚřŚŭřƍƝŭűŗťƝźƈƣżƊƘƛůƠƩżƢŽƱƮŮƅŶŸƈƔƎƛƙƶŸƜƙǀƼǆƐǈƒƔƺƆƥǃƿǆǄǇƌǆǌƞƛ", (byte)58, 65);
               break;
            case 2:
               b[0] = χφπρψπφΦθμπ.A("łŮĩŰŅŊųĪŉşŴŊŐńťŖťŴŻĹůŎŝĻŽńƆſƅŲşœ", (byte)58, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = οΩνΩρωλΨηΛδωδ.E("ՅՎ՚ՌԳԼԭԲՅհՋծԹլՊՌծՈձՂճղՉՊ", (byte)58, 69);
         }
      }
   }

   @Generated
   public ωΛοχγφλπευςος(nLoginBungee var1) {
      this.d = var1;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ωΛοχγφλπευςος.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(μεςΩΔΣγν.C("ҚҼҾҞӂӡәӯӛҪӨӞӬӦүӔӶӵӭӳӭӂ", (byte)63, 67), ωΛοχγφλπευςος.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΨφιωσρΓδΔθ.E("՞իժԭխթդխոէԴղնկղոԺࣕࢨ࣍ࣖࣃ࣓ࣗ࣍ࣉࣚࣘࣖࣚՓ", (byte)63, 69) + var1 + λΣΩσμφγχ.B("ķ", (byte)63, 66) + var2.toString(), var4
         );
      }
   }

   @EventHandler
   public void a(PluginMessageEvent var1) {
      if (!var1.isCancelled()) {
         try {
            String var2 = var1.getTag();
            int var4 = a;
            switch (var2.hashCode()) {
               case -1878167016:
                  if (var2.equals(c<"㺀">(b, d))) {
                     var4 = e;
                  }
                  break;
               case 1895367105:
                  if (var2.equals(c<"㺃">(f & g, h))) {
                     var4 = i;
                  }
            }

            switch (var4) {
               case 0:
                  var1.setCancelled((boolean)j);
                  Connection var10 = var1.getSender();
                  if (!(var10 instanceof ServerConnection)) {
                     if (var10 instanceof ProxiedPlayer) {
                        ProxiedPlayer var12 = (ProxiedPlayer)var10;
                        var12.disconnect(TextComponent.fromLegacyText(c<"㺆">(k & l, m)));
                        ψΓωτιμωκχψΛΨ.c(var12.getName() + c<"㺉">(n & o, p));
                     }

                     return;
                  }

                  ΨαχΨχΣλεΠψΦ var11 = this.d.b().a(var1.getReceiver());
                  String var7 = ((ServerConnection)var10).getInfo().getName();
                  byte[] var8 = var1.getData();
                  this.d.a().a(var11, var7, var8);
                  break;
               case 1:
                  νΦβκιψωζςεοει var5 = this.d.a().b().a();
                  if (var5 == null) {
                     return;
                  }

                  Connection var6 = var1.getSender();
                  if (!(var6 instanceof ProxiedPlayer)) {
                     return;
                  }

                  if (var5.a().a(this.d.b().a(var6), var1.getData())) {
                     var1.setCancelled((boolean)r);
                  }
            }
         } catch (Throwable var9) {
            ψΓωτιμωκχψΛΨ.c(c<"㺌">(s, t) + var1.getClass().getSimpleName() + c<"㺏">(u, v ^ w) + var1.getSender() + c<"㺒">(x, y), var9);
            var1.setCancelled((boolean)aa);
            var1.getSender().disconnect(TextComponent.fromLegacyText(c<"㺕">(ab & ac, ad)));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 2L;
      var1 ^= 602700047346163727L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(47 + 21),
                     (byte)(38 + 31),
                     (byte)(45 + 38),
                     (byte)(13 + 34),
                     (byte)(65 + 2),
                     (byte)(27 + 39),
                     (byte)(44 + 23),
                     (byte)(11 + 36),
                     80,
                     (byte)(72 + 3),
                     (byte)(34 + 33),
                     (byte)(49 + 34),
                     (byte)(8 + 45),
                     (byte)(8 + 72),
                     (byte)(94 + 3),
                     (byte)(77 + 23),
                     (byte)(77 + 23),
                     (byte)(47 + 58),
                     110,
                     (byte)(56 + 47)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(41 + 27), (byte)(54 + 15), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΠΛΨοδΩσμνΛγΦφβς.E("տ\u058c\u058bՎ֎֊օ֎֙ֈՕ֓֗\u0590֓֙՛ࣶࣉ࣮࣮ࣹࣷࣤࣸࣴ࣪ࣻࣷࣻ", (byte)96, 69));
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
}
