package com.nickuc.login.proxy.velocity;

import com.nickuc.login.NLoginInterface_008;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_241;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_232;
import com.nickuc.login.NLoginInterface_041;
import com.nickuc.login.NLoginCore_127;
import com.nickuc.login.NLoginCore_277;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_379;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_443;
import com.nickuc.login.NLoginCore_530;
import com.nickuc.login.NLoginCore_422;
import com.nickuc.login.NLoginCore_553;
import com.nickuc.login.NLoginType_010;
import com.nickuc.login.NLoginCore_455;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_141;
import com.nickuc.login.NLoginCore_397;
import com.nickuc.login.NLoginInterface_022;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginInterface_034;
import com.nickuc.login.NLoginCore_424;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_433;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_199;
import com.nickuc.login.api.enums.ServerConnectType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.internal.velocity.VelocityCancellableEvent;
import com.nickuc.login.api.event.velocity.connection.ServerPreConnectEvent;
import com.nickuc.login.loader.platform.VelocityLoader;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ServerConnection;
import com.velocitypowered.api.proxy.ConnectionRequestBuilder.Status;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.kyori.adventure.text.Component;

public class nLoginVelocity extends NLoginCore_455 implements NLoginInterface_008, NLoginType_010 {
   private static int av = (0 >>> 106 | 0 << ~106 + 1) & -1;
   private static long u = Long.reverse(-8086987327712914107L);
   private static long e;
   private static long s = Long.reverse(8070450532247928832L);
   private static long af = Long.reverse(-8086987327712914107L);
   private static int bb = 24 >>> 67 | 24 << ~67 + 1;
   private static int bc = 0 >>> 240 | 0 << ~240 + 1;
   private static int at = (0 >>> 16 | 0 << ~16 + 1) & -1;
   private static int t = (24 >>> 3 | 24 << ~3 + 1) & -1;
   private final ChannelIdentifier c;
   private static int p = Integer.reverse(1073741824);
   private static long ag = Long.reverse(8070450532247928832L);
   private static int j = 0 >>> 66 | 0 << -66;
   private static long al = Long.reverse(-16536795464985275L);
   private NLoginCore_199 a;
   private static int ae = 1792 >>> 200 | 1792 << ~200 + 1;
   private static long o = Long.reverse(-16536795464985275L);
   private static int an = (-1 >>> 233 | -1 << ~233 + 1) & -1;
   private static long y = Long.reverse(-16536795464985275L);
   private static int m = 1073741824 >>> 62 | 1073741824 << -62;
   private static int be = 131072 >>> 112 | 131072 << -112;
   private static int z = Integer.reverse(-1610612736);
   private static int ac = (393216 >>> 240 | 393216 << ~240 + 1) & -1;
   private static int ax = (0 >>> 192 | 0 << ~192 + 1) & -1;
   private static long v = Long.reverse(8070450532247928832L);
   private static String[] c = new String[nLoginVelocity.bk];
   private static int bl = Integer.reverse(-1342177280);
   private static long bj = Long.reverse(-16536795464985275L);
   private static int w = 4096 >>> 42 | 4096 << ~42 + 1;
   private static int ar = (-1 >>> 115 | -1 << -115) & -1;
   private static int am = (41943040 >>> 22 | 41943040 << -22) & -1;
   private static int au = (1024 >>> 106 | 1024 << ~106 + 1) & -1;
   private static int bh = 0 >>> 19 | 0 << ~19 + 1;
   private static int aa = -1 >>> 56 | -1 << ~56 + 1;
   private static int k = -1 >>> 33 | -1 << ~33 + 1;
   private static int aq = (1610612737 >>> 125 | 1610612737 << ~125 + 1) & -1;
   private static int aw = Integer.reverse(Integer.MIN_VALUE);
   private static int ak = 1179648 >>> 145 | 1179648 << -145;
   private static int bg = 33554432 >>> 121 | 33554432 << -121;
   private static long l = Long.reverse(-16536795464985275L);
   private static long ao = Long.reverse(-16536795464985275L);
   private static int x = -1 >>> 38 | -1 << ~38 + 1;
   private static long as = Long.reverse(-16536795464985275L);
   private static int ah = 524288 >>> 208 | 524288 << ~208 + 1;
   private static int az = Integer.reverse(Integer.MIN_VALUE);
   private static long ab = Long.reverse(-16536795464985275L);
   private static long ai = Long.reverse(-8086987327712914107L);
   private static long aj = Long.reverse(8070450532247928832L);
   private static int ap = Integer.reverse(0);
   private final ChannelIdentifier d;
   private static int bd = (4194304 >>> 214 | 4194304 << ~214 + 1) & -1;
   private static int bk = 436207616 >>> 153 | 436207616 << -153;
   private static int ba = Integer.reverse(0);
   private static int ay = (33554432 >>> 217 | 33554432 << ~217 + 1) & -1;
   private static int bi = 6 >>> 95 | 6 << ~95 + 1;
   private static long ad = Long.reverse(-16536795464985275L);
   private static String[] d = new String[bl];
   private static long r = Long.reverse(-8086987327712914107L);
   private static int bf = 134217728 >>> 123 | 134217728 << ~123 + 1;

   @Generated
   @Override
   public NLoginCore_199 a() {
      return this.a;
   }

   public nLoginVelocity(VelocityLoader var1) {
      super(
         var1,
         a(j & k, l),
         new NLoginCore_422(a(m, o), a(p, r ^ s), a(t, u ^ v), a(w & x, y), a(z & aa, ab), a(ac, ad), a(ae, af ^ ag))
      );
      this.c = new LegacyChannelIdentifier(a(ah, ai ^ aj));
      this.d = MinecraftChannelIdentifier.create(a(ak, al), a(am & an, ao));
      this.a(new NLoginType_008(new NLoginCore_424(this), this, (boolean)ap));
   }

   @Generated
   public ChannelIdentifier a() {
      return this.c;
   }

   @Override
   public boolean callEvent(Object var1) {
      this.a().getEventManager().fireAndForget(var1);
      return (boolean)(var1 instanceof VelocityCancellableEvent && ((VelocityCancellableEvent)var1).isCancelled() ? ax : aw);
   }

   private static void b() {
      e = -6726010444500392975L;
      long var0 = e ^ -739400897411439151L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(42 + 26),
               69,
               (byte)(4 + 79),
               (byte)(28 + 19),
               (byte)(19 + 48),
               (byte)(3 + 63),
               (byte)(38 + 29),
               (byte)(45 + 2),
               (byte)(44 + 36),
               (byte)(23 + 52),
               67,
               (byte)(24 + 59),
               (byte)(17 + 36),
               (byte)(79 + 1),
               (byte)(46 + 51),
               (byte)(41 + 59),
               (byte)(9 + 91),
               (byte)(27 + 78),
               (byte)(35 + 75),
               (byte)(47 + 56)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(49 + 34)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_201.C("єцѕ҃ѭѦчхџѮѢї", (byte)30, 67);
               d[1] = NLoginCore_453.A("ÿôĳīĸõöďīĐľċĸĴİēăûĖŃĢĸĕĶĆąĨŇĉĎļņ", (byte)30, 65);
               d[2] = NLoginCore_387.A("ĒõđİĨĲöĥČĴĞēĪĐīĐļđĖłĆĽīĥğĮĿłŏċŊīĳŎĵőŕĒŎőĹĬľŜęĳšĝŁĠŢĶŦĽńŗŠŬŇůŏłŲıŭţųŭĵŕŅņūňŖŵĲŘţļƂšŃřŦŧřŚşŋƀƉťŐţƀ", (byte)30, 65);
               d[3] = NLoginCore_575.C("ѦѳњѷѾшѦҍѐѤғѠѠҊҌѷѤҗқ҉҄ѓѝіѝѬҔѴњҁҁѰҐҨқѨ҃Ҁ҇Ѭѩҙѯҋҁ҆ү҈҇ҏҵҘ҉ҹ҆ґѽҋѿҽҠ҄ѸӀҡ҉ҿѽӅҤҀҡӎҎҏҟҜҢҴӔҔҷҹҶқӗӇӍӖӜҢӍӌҠӞӑ", (byte)30, 67);
               d[4] = NLoginCore_553.A("ĉĳìíĔčöòĈĎīğĶĸĞŁŅýüĘħĪĺŅĻĝŏŉŐĬĿŋļőŗĔŋřĲĵĳďņĴīŊĪŞōŝŁŨŚťŃňŋŗŋġŰĬŨťĴĳņİŊŸůŨŜŷŘśŭŶſŔĻŃŕŠŰŞŸŃŽƈŨŻŇŎňŅ", (byte)30, 65);
               d[5] = NLoginCore_397.C("ѩѸј҉ѠџѫъѩѾҍѴҔ҅ҔїѶѭѲё҄ѻҗѨѺѶҔѰҔҜѤ҅ѥҪҟҨңѸѧҊѯҮ҉ҋҳ҂ѲұҳҙҴңҹѵҼѿһҏҕ҃ѿ҄ҮҚҵӁҾҔҝӁ҈ӇӉҧҝҴҍҴӏҳӆӖҮҕқӌҬҸҸӑҡӘҳӡҳӏ", (byte)30, 67);
               d[6] = NLoginCore_223.E("ՄԬԪԿԩԪԪ\u0558ՓՋՏԸԧ՟ՀԠԞԠդՏԶՓՆՠ՚ՀիՅՅՅխՠԯԿՁԵՕՊՙՒձՍթծՋՙչՁ՟Ւ՟՟վդէպդՄ֍տ՜ՊվօքՐվհցգդջ՚֘ո։֕չ\u0557ձ֖ռ՝֞գսցտր֗ըեխְ֊֤", (byte)30, 69);
               d[7] = NLoginCore_173.C("ђлђѽоќы҇ы҈҆ҍѲя҄ѬҗѮҒѮҒѨѦҀҚҠҏѰќҢҙҁҢҟѿңҋѶҗҡҢѣ҉ѯҔѱҪҀҴ҂ѶѸҥѹ҇ҲҋҽҫӃҌҸѼҲ҇ӈҢӈҢҗҪҟҝҐҍҍӑҝҿґҴӑӕҖҮӅҵӞӞҪӗҺҽҶӜҸ", (byte)30, 67);
               d[8] = NLoginCore_451.A("ýñĐČčðĉøĖĖħćęĿĐĔģĴĖāĕđĎď", (byte)30, 65);
               d[9] = NLoginCore_173.D("уѻ҅цҋѡҏѫѩѩѢї", (byte)30, 68);
               d[10] = NLoginCore_027.C("хѡѨ҅ҁѩыѯјѝ҈ї", (byte)30, 67);
               d[11] = NLoginCore_223.C("ѣ҃њћѥѪѷҐѐѰѾяѲѲ҈ҋіђҌїѶѥѢѣ", (byte)30, 67);
               d[12] = NLoginCore_553.E("ԎԟՅԣԑՔՄԌԖԧԼՖԩԘԴԷ՜ՂՠԱԝԾԼՇՕժԫՙ՛ագժԻճՖԭէՃԸՈՊԹ՜Ֆ՜իԺւՃգՂէ\u0557ՠԻՂոյ՞ո՝ռվհ", (byte)30, 69);
               break;
            case 1:
               d[0] = NLoginCore_241.C("џѨѷ҅ҌѠ҇ўҊћѯхђѳђѬѸҋқѭѧѵѢѣ", (byte)30, 67);
               d[1] = NLoginCore_451.D("ѓш҇ѿҌщъѣѿѤҒџҌ҈҄ѧїяѪҗѶҍїҠѶҍҊқҚҒѡҥ", (byte)30, 68);
               d[2] = NLoginCore_553.C("Ѧщѥ҄Ѽ҆ъѹѠ҈ѲѧѾѤѿѤҐѥѪҖњґѿѹѳ҂ғҖңџҞѿ҇Ң҉ҥҩѦҢҥҍҀҒҰѭ҇ҵѱҕѴҶҊҺґҘҫҴӀқӃңҖӆ҅ӁҷӇӁ҉ҩҙҚҿҜҪӉ҆ҬҷҐӖҵҗҭҺҼҧӜӞҷӞҕһҠӞӨ", (byte)30, 67);
               d[3] = NLoginCore_110.F(
                  "ԱԾԥՂՉԓԱ\u0558ԛԯ՞ԫԫՕ\u0557ՂԯբզՔՏԞԨԡԨԷ՟ԿԥՌՌԻ՛ճզԳՎՋՒԷԴդԺՖՌՑպՓՒ՚րգՔքՑ՜ՈՖՊֈիՏՃ\u058bլՔ֊Ո\u0590կՋլ֙ՙ՚ժէխտ֟՟ւքցզ֞էոփ֔տ֣֠֊֪֜", (byte)30, 70
               );
               d[4] = NLoginCore_141.B("ĉĳìíĔčöòĈĎīğĶĸĞŁŅýüĘħĪĺŅĻĝŏŉŐĬĿŋļőŗĔŋřĲĵĳďņĴīŊĪŞōŝŁŨŚťŃňŋŗŋġŰĬŨťĴĳņİŊŸůŨŜŷŘśŭŶſŔĻŃŕŠŰŒŽńţŉŽŎŏƋƓŪ", (byte)30, 66);
               d[5] = NLoginCore_138.C("ѩѸј҉ѠџѫъѩѾҍѴҔ҅ҔїѶѭѲё҄ѻҗѨѺѶҔѰҔҜѤ҅ѥҪҟҨңѸѧҊѯҮ҉ҋҳ҂ѲұҳҙҴңҹѵҼѿһҏҕ҃ѿ҄ҮҚҵӁҾҔҝӁ҈ӇӉҧҝҴҍҴӏҳӆӖҮҕқӔӖҕҭҙҟҮӁӟӅң", (byte)30, 67);
               d[6] = NLoginCore_232.C("ѹѡџѴўџџҍ҈Ҁ҄ѭќҔѵѕѓѕҙ҄ѫ҈ѻҕҏѵҠѺѺѺҢҕѤѴѶѪҊѿҎ҇Ҧ҂ҞңҀҎҮѶҔ҇ҔҔҳҙҜүҙѹӂҴґѿҳҺҹ҅ҳҥҶҘҙҰҏӍҭҾӊҮҌҦӋұҒӓҘҭҧҙҫӘӘӘӂӜӥҶ", (byte)30, 67);
               d[7] = NLoginCore_127.C("ђлђѽоќы҇ы҈҆ҍѲя҄ѬҗѮҒѮҒѨѦҀҚҠҏѰќҢҙҁҢҟѿңҋѶҗҡҢѣ҉ѯҔѱҪҀҴ҂ѶѸҥѹ҇ҲҋҽҫӃҌҸѼҲ҇ӈҢӈҢҗҪҟҝҐҍҍӑҝҿґҴӑӕҖҮҺұҲҬҮҡҚңҤӑӣ", (byte)30, 67);
               d[8] = NLoginCore_433.A("ýñĐČčðĉøĖĖħĉľķĔıĵĤņđŃġĎď", (byte)30, 65);
               d[9] = NLoginCore_076.D("ѕѓ҇хѦѫ҆ҌѼҋѫђҊьѲѪҏѱѳѯ҆ҋѢѣ", (byte)30, 68);
               d[10] = NLoginCore_241.F("ՋՆԪԥՓԦԷՆԹԦՓԢ", (byte)30, 70);
               d[11] = NLoginCore_110.D("ѣ҃њћѥѪѷҐѐѰѿѿѫѧѨѱѴ҃ѻѕљқѢѣ", (byte)30, 68);
               d[12] = NLoginCore_127.A("ïĀĦĄòĵĥí÷ĈĝķĊùĕĘĽģŁĒþğĝĨĶŋČĺļłńŋĜŔķĎňĤęĩīĚĽķĽŌěţĤńģňĸőŕŌĤŘōŜŅľĪŦ", (byte)30, 65);
               break;
            case 2:
               d[0] = NLoginCore_173.B("ċĊĎğĆôĸĘĖČěĿŁċþńĽûĀÿńħĳāėĢŅčņĻČł", (byte)30, 66);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_530.D("ҁѻ҈ѳ҄҆҉э҂ҊҀї", (byte)30, 68);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 14L;
      var1 ^= -739400897411439151L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(42 + 26),
                     (byte)(12 + 57),
                     (byte)(7 + 76),
                     (byte)(8 + 39),
                     67,
                     (byte)(61 + 5),
                     (byte)(42 + 25),
                     (byte)(14 + 33),
                     (byte)(70 + 10),
                     (byte)(39 + 36),
                     (byte)(49 + 18),
                     (byte)(75 + 8),
                     (byte)(32 + 21),
                     80,
                     (byte)(72 + 25),
                     (byte)(74 + 26),
                     (byte)(98 + 2),
                     (byte)(54 + 51),
                     (byte)(93 + 17),
                     (byte)(100 + 3)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(29 + 40), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.B("ňŕŔėŗœŎŗŢőĞŜŠřŜŢĤŦũŧűųĪŲŢŪŮţŪŶżĳųŒŶůŲŸšűŹŽŲŹƅƋ", (byte)51, 66));
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
   protected void i() {
      this.a().a().configureFilter(Collections.singleton(a(aq & ar, as)));
      super.i();
   }

   @Nullable
   @Override
   public String a(NLoginCore_277 var1) {
      Player var2 = var1.c();
      return var2.getCurrentServer().map(var0 -> var0.getServerInfo().getName()).orElse(null);
   }

   @Override
   public NLoginType_008 a() {
      return super.b();
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  nLoginVelocity.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_575.B("ŹƛƝŽơǀƸǎƺƉǇƽǋǅƎƳǕǔǌǒǌơ", (byte)105, 66), nLoginVelocity.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_530.E("ֈ֕֔\u0557֗֓֎֢֑֗՞֢֜֠֙֜դֱֳ֦֧֩ժֲֶּ֢֪֣֪֮ճֱֲֲֳֶָֹֹֽׅ֒֯֡\u05cb֍", (byte)105, 69) + var1 + NLoginCore_324.B("Ƌ", (byte)105, 66) + var2.toString(),
            var4
         );
      }
   }

   @Override
   protected NLoginInterface_034[] a() {
      return NLoginCore_379.values();
   }

   @Override
   public NLoginCore_443 a(NLoginCore_277 var1, String var2, ServerConnectType var3, @Nullable NLoginInterface_041<Boolean> var4) {
      return !var1.R()
         ? NLoginCore_443.c
         : this.a()
            .getServer(var2)
            .map(
               var5 -> {
                  Player var6 = var1.c();
                  NLoginType_008 var10000 = this.a();
                  EventEnum var10001 = EventEnum.SERVER_PRE_CONNECT;
                  Object[] var10002 = new Object[bb];
                  var10002[bc] = var1;
                  var10002[bd] = var3;
                  var10002[be] = var5;
                  ServerPreConnectEvent var7 = var10000.a(var10001, var10002);
                  if (!this.a().callEvent(var7)) {
                     return NLoginCore_443.b;
                  } else {
                     var5 = var7.getServer();
                     Optional var8 = var6.getCurrentServer();
                     if (var8.isPresent() && var5.getServerInfo().equals(((ServerConnection)var8.get()).getServerInfo())) {
                        if (var4 != null) {
                           var4.done(Boolean.valueOf((boolean)bf));
                        }

                        return NLoginCore_443.a;
                     } else {
                        if (var4 == null) {
                           var6.createConnectionRequest(var5).connect().whenComplete((var2xx, var3xx) -> {
                              if (!var2xx.isSuccessful() && var2xx.getStatus() != Status.ALREADY_CONNECTED) {
                                 var6.disconnect((Component)var2xx.getReasonComponent().orElse(Component.text(a(bi, bj) + var2)));
                              }
                           });
                        } else {
                           var6.createConnectionRequest(var5)
                              .connectWithIndication()
                              .whenComplete((var1xx, var2xx) -> var4.done(Boolean.valueOf((boolean)(var1xx != null && var2xx == null && var1xx ? bg : bh))));
                        }

                        return NLoginCore_443.a;
                     }
                  }
               }
            )
            .orElse(NLoginCore_443.c);
   }

   @Override
   public boolean t(String var1) {
      return this.a().getServer(var1).isPresent();
   }

   @Generated
   public ChannelIdentifier b() {
      return this.d;
   }

   @Override
   protected void j() {
      this.a = new NLoginCore_199(this.a(), this.b());
      super.j();
   }

   @Override
   public Class<?> getPlayerClass() {
      return Player.class;
   }

   @Override
   public NLoginInterface_022 b() {
      return this.a((boolean)ay);
   }

   static {
      b();
   }

   @Override
   public boolean a(NLoginCore_277 var1) {
      if (!var1.R()) {
         return (boolean)at;
      } else {
         Player var2 = var1.c();
         Optional var3 = var2.getCurrentServer();
         return (boolean)(var3.isPresent()
               && var3.<Boolean>map(var0 -> Boolean.valueOf((boolean)(!var0.getServer().getPlayersConnected().isEmpty() ? az : ba))).get()
            ? au
            : av);
      }
   }
}
