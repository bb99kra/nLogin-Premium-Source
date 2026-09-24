package com.nickuc.login.bukkit;

import com.nickuc.login.ΓχυψπωΣςΠκγζΦ;
import com.nickuc.login.ΔοΓκωΠαλξφιΩθ;
import com.nickuc.login.ΔχλΩψδλΛιχ;
import com.nickuc.login.ΠΛΨοδΩσμνΛγΦφβς;
import com.nickuc.login.ΣδτΠνεγοΓορητ;
import com.nickuc.login.ΦδφπθΩΩλζξ;
import com.nickuc.login.ΦωοφυδιφΣΦ;
import com.nickuc.login.ΨΦνΨΦωυΩνβςμ;
import com.nickuc.login.ΨγημιδξΓτοθαζ;
import com.nickuc.login.ΨφιωσρΓδΔθ;
import com.nickuc.login.ΩψΨρεξοσΠςΛυ;
import com.nickuc.login.βζερηΣολσαμ;
import com.nickuc.login.βθκςνθΩθυμςτκχ;
import com.nickuc.login.δςμθγκΓγΨληνυΠ;
import com.nickuc.login.ζβησεθωυγτ;
import com.nickuc.login.θεωψξβΛσσ;
import com.nickuc.login.ιΠοθΩΦξκ;
import com.nickuc.login.καΦζθθυυεφΦγ;
import com.nickuc.login.λΣΩσμφγχ;
import com.nickuc.login.μΛΔθΛτναεαΓ;
import com.nickuc.login.μεςΩΔΣγν;
import com.nickuc.login.ξψθρΣΠΣς;
import com.nickuc.login.οοθδΨιοΦΠβδζ;
import com.nickuc.login.ορΣψφρΔαεδψσθυ;
import com.nickuc.login.ρΣνμχγΨοΔΦ;
import com.nickuc.login.ςΦζσμτΓσ;
import com.nickuc.login.ςπυηννναΣ;
import com.nickuc.login.φΨαξωυθανΣφυκη;
import com.nickuc.login.χΠξΦιζΨΣωΦσΨζ;
import com.nickuc.login.loader.MemClassLoader;
import com.nickuc.login.loader.platform.BukkitLoader;
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
import lombok.Generated;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;

public class nLoginBukkit extends μΛΔθΛτναεαΓ implements ΔχλΩψδλΛιχ {
   private static int t = 917504 >>> 209 | 917504 << -209;
   private ΦωοφυδιφΣΦ a;
   private static int ag = Integer.reverse(0);
   private static long ab = Long.reverse(-8358680908399640576L);
   private static int f = Integer.reverse(Integer.MIN_VALUE);
   private static long aa = Long.reverse(-6623002351950786523L);
   private static int ai = 20 >>> 161 | 20 << -161;
   private static int o = (640 >>> 103 | 640 << -103) & -1;
   private static String[] b = new String[ai];
   private static long n = Long.reverse(-8358680908399640576L);
   private static long e = Long.reverse(-8358680908399640576L);
   private static int ah = 1342177280 >>> 251 | 1342177280 << ~251 + 1;
   private static long m = Long.reverse(-6623002351950786523L);
   private static long c;
   private static long k = Long.reverse(2888600061055701029L);
   private static int ac = Integer.reverse(Integer.MIN_VALUE);
   private static int z = 144 >>> 196 | 144 << -196;
   private static long x = Long.reverse(-6623002351950786523L);
   private static int w = (268435456 >>> 249 | 268435456 << ~249 + 1) & -1;
   private static int l = Integer.reverse(536870912);
   private static long d = Long.reverse(-6623002351950786523L);
   private static int u = Integer.reverse(-1);
   private static String[] a = new String[ah];
   private static long s = Long.reverse(2888600061055701029L);
   private static int ae = 0 >>> 94 | 0 << ~94 + 1;
   private static long g = Long.reverse(2888600061055701029L);
   private boolean s;
   private static int j = (6144 >>> 43 | 6144 << -43) & -1;
   private static long i = Long.reverse(2888600061055701029L);
   private static long v = Long.reverse(2888600061055701029L);
   private static long q = Long.reverse(-8358680908399640576L);
   private static int ad = (0 >>> 70 | 0 << ~70 + 1) & -1;
   private static int r = Integer.reverse(1610612736);
   private static int b = Integer.reverse(0);
   private static long p = Long.reverse(-6623002351950786523L);
   private static long y = Long.reverse(-8358680908399640576L);
   private static int h = Integer.reverse(1073741824);
   private static int af = 8192 >>> 237 | 8192 << ~237 + 1;

   @Override
   public Class<?> getPlayerClass() {
      return Player.class;
   }

   private static String a(int var0, long var1) {
      var1 ^= 49L;
      var1 ^= -1988018952073068700L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(37 + 31),
                     (byte)(54 + 15),
                     (byte)(32 + 51),
                     47,
                     (byte)(9 + 58),
                     (byte)(46 + 20),
                     (byte)(32 + 35),
                     (byte)(13 + 34),
                     (byte)(20 + 60),
                     (byte)(72 + 3),
                     (byte)(25 + 42),
                     (byte)(10 + 73),
                     (byte)(45 + 8),
                     (byte)(24 + 56),
                     (byte)(6 + 91),
                     100,
                     (byte)(81 + 19),
                     (byte)(50 + 55),
                     (byte)(20 + 90),
                     (byte)(2 + 101)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(17 + 66)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ςΦζσμτΓσ.C("ӧӴӳҶӶӲӭӶԁӰҽӻӿӸӻԁӃӷԋԂԃԂԎӊԊөԍԆԉԏӤԘԏԐԏԛ", (byte)69, 67));
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

   static {
      b();
   }

   private static void b() {
      c = -6626582175699802075L;
      long var0 = c ^ -1988018952073068700L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(48 + 20),
               (byte)(45 + 24),
               83,
               (byte)(36 + 11),
               (byte)(53 + 14),
               (byte)(63 + 3),
               (byte)(49 + 18),
               (byte)(44 + 3),
               (byte)(8 + 72),
               (byte)(22 + 53),
               (byte)(47 + 20),
               (byte)(56 + 27),
               (byte)(22 + 31),
               (byte)(60 + 20),
               (byte)(92 + 5),
               100,
               (byte)(98 + 2),
               (byte)(94 + 11),
               (byte)(50 + 60),
               (byte)(90 + 13)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(50 + 19), 83}, StandardCharsets.UTF_8));
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
               b[0] = ΦδφπθΩΩλζξ.D("ЛбЍЕяЕРдйЛњС", (byte)12, 68);
               b[1] = ιΠοθΩΦξκ.D("КЪЯЮУВЦчвязлвыРћёёРпцњТТлъшШѣѦйѮ", (byte)12, 68);
               b[2] = ζβησεθωυγτ.B("ûČĎĈàÌċâĔâíĎäĖîĀĉßęĔõĚĚĝĐħĤħĤûĜææğĠéċąôĶñĐĪùēċľĝġĩĸčĲĻĚğľňŇĻōÿĊĈňăċŉđŏİĠĔĘĮĖŅŘŘŉĺĮğŌŎĥįţłŚŅśŃĵĻŮ", (byte)12, 66);
               b[3] = ΣδτΠνεγοΓορητ.C("ТСврЦіѕЕвлчаєўшысбвяюрУўзѩўэпѢѪњѝгѲѨяѸѪѵѨѶѭячяџѴяѕ҂ѹѹѡѕѩђ҄ѿѤѻҍўѣѽыўҖѥѪѶҙѵјюѨѾѹѫѲҙҖѿѡ҅ѳҔѺ҉ѧѴҗҢ҆ҝҎ", (byte)12, 67);
               b[4] = ξψθρΣΠΣς.B("ĐąčÓēßĖïĐĘÖëĝøČú×ĞÿāĤĕĆÙĕÿĔäýúÿĆþÿćòġĎĊĦĪöįòĐóûħĹŀĚĤĴĦĦĺĨĝĵăōĥĉŃĜĦĦğİğčŅŃńŘĬĚĭĪĚŚěĮŝŠœķĢňőĻşŜŢŦĨ", (byte)12, 66);
               b[5] = χΠξΦιζΨΣωΦσΨζ.D("ѐВђЕъЖѓејыѓИЛўбѕљНфњоякеУсѧѦѫѣљњѧэѴэѕѕчјѪёѥѰѼђёпрысрѹҁѐјѤѬ҂ѻѧѮѠѡҏ҉ђѳѴҎѠѮѻѹѸѶѿ҉ҙҟңћҌҠѾҨ҃ґҞҡѶѣҨҬѸѼ", (byte)12, 68);
               b[6] = θεωψξβΛσσ.B("ĊäèÒóĆÍñćðĒÑĔýÛëčÛýĠďÝôóüàĪèĪéģÿĥąıĪĊìĊĠĩħùĺĮĩĉęüĽģĽłĲĳġėĳĦĖĩĿĬĘŁŐđďČİōŘġŉįōĤŖŏŖıœĘţţńœŒśĳŚŖŬŮĩŉ", (byte)12, 66);
               b[7] = ΨΦνΨΦωυΩνβςμ.C("ЋЯыЍАфцђВХжљйчќђЮзєСхјѩктеѝџхѐТѢэЮєЧѶдѥіѨѼщѥцлпѮјҁмќќѵ҃јѹѕѝҀѮѬѥҎќђѠ҄ѰёѶы҆҉ѱѳѿҞҎҖѹ҄ѠҎѢѾҐҕѼҚѶ҄ѺҢҤҰ", (byte)12, 67);
               b[8] = ςΦζσμτΓσ.E("ԽԂԘԤԐӾԷԺԞԝԓԙԼԖԸԣՄ\u0530ՂՄԵԲԟԣՇ\u0558\u0557՝ԳՐԷ՞՟ԝԱԼՔԷՏԦՀթԢ\u0530", (byte)12, 69);
               b[9] = μεςΩΔΣγν.A("ČÑçóßÍĆĉíìåĔėěñíďÿēðěēêë", (byte)12, 65);
               break;
            case 1:
               b[0] = βθκςνθΩθυμςτκχ.A("ĐąìĉđďĐČĀĘăöčÖĜ×ĞìóáÚýêë", (byte)12, 65);
               b[1] = ςΦζσμτΓσ.E("ԉԙԞԝԒԁԕԶԡԾԦԪԡԺԏՊՀՀԏԮԵՅԒԹՂ՛ԴԧԻԷՒՏ", (byte)12, 69);
               b[2] = ςπυηννναΣ.B("ûČĎĈàÌċâĔâíĎäĖîĀĉßęĔõĚĚĝĐħĤħĤûĜææğĠéċąôĶñĐĪùēċľĝġĩĸčĲĻĚğľňŇĻōÿĊĈňăċŉđŏİĠĔĘĮĖŅŘŘŉĺĮğŌŎĤĘĿĚŢłĶŅŢŦħ", (byte)12, 66);
               b[3] = οοθδΨιοΦΠβδζ.B("àßðþäĔēÓðùąîĒĜĆĉÿïðčČþáĜõħĜċýĠĨĘěñİĦčĶĨĳĦĴīčąčĝĲčēŀķķğēħĐłĽĢĹŋĜġĻĉĜŔģĨĴŗĳĖČĦļķĩİŗŔĽğŃĳļĻŢŦģĦŝŝŠĻ", (byte)12, 66);
               b[4] = λΣΩσμφγχ.F(
                  "ՁԶԾԄՄԐՇԠՁՉԇԜՎԩԽԫԈՏ\u0530ԲՕՆԷԊՆ\u0530ՅԕԮԫ\u0530Էԯ\u0530ԸԣՒԿԻ\u0557՛ԧՠԣՁԤԬ\u0558ժձՋՕե\u0557\u0557իՙՎզԴվՖԺմՍ\u0557\u0557ՐաՐԾնմյ։՝Ջ՞՛Ջ\u058bՌ՟֎֑\u0590\u0557աՖպՔէլճ֝՞",
                  (byte)12,
                  70
               );
               b[5] = λΣΩσμφγχ.D("ѐВђЕъЖѓејыѓИЛўбѕљНфњоякеУсѧѦѫѣљњѧэѴэѕѕчјѪёѥѰѼђёпрысрѹҁѐјѤѬ҂ѻѧѮѠѡҏ҉ђѳѴҎѠѮѻѹѸѶѿ҉ҙҟңћҌҠѾѡѺ҃ѡѥңҬ҅ѨѽҦ", (byte)12, 68);
               b[6] = ΨΦνΨΦωυΩνβςμ.F(
                  "ԻԕԙԃԤԷӾԢԸԡՃԂՅԮԌԜԾԌԮՑՀԎԥԤԭԑ՛ԙ՛ԚՔ\u0530ՖԶբ՛ԻԝԻՑ՚\u0558Ԫի՟՚ԺՊԭծՔծճգդՒՈդ\u0557Շ՚հ՝ՉղցՂՀԽավ։ՒպՠվՕևրևբքՉ֔֔մՔ֏Ց֕ն\u058c֒Օո֘", (byte)12, 70
               );
               b[7] = οοθδΨιοΦΠβδζ.D("ЋЯыЍАфцђВХжљйчќђЮзєСхјѩктеѝџхѐТѢэЮєЧѶдѥіѨѼщѥцлпѮјҁмќќѵ҃јѹѕѝҀѮѬѥҎќђѠ҄ѰёѶы҆҉ѱѳѿҞҎҖѹ҄ѠҎѢѾҘѱҠҙѿҭҎҭґҭ", (byte)12, 68);
               b[8] = ΠΛΨοδΩσμνΛγΦφβς.E("ԽԂԘԤԐӾԷԺԞԝԓԙԼԖԸԣՄ\u0530ՂՄԵԲԟԣՇ\u0558\u0557՝ԳՐԷ՞ԘԿԶԯՃԣԺ\u0558գԡԳԨՌ՞աՀՠ՚ՔԴՋՎԻԼ", (byte)12, 69);
               b[9] = χΠξΦιζΨΣωΦσΨζ.B("ČÑçóßÍĆĉíìäĕĄČýĜîþðÙíýêë", (byte)12, 66);
               break;
            case 2:
               b[0] = ξψθρΣΠΣς.F("ԽԶӺԻӼԕԓԡԂԃԿԺԸԆԆՌԡԡՌՇԣԞԛԜ", (byte)12, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = φΨαξωυθανΣφυκη.A("èÎÎÅĒāĀëçďĖñęÛěÚĔáÜÿîģêë", (byte)12, 65);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  nLoginBukkit.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(ΨφιωσρΓδΔθ.D("ѶҘҚѺҞҽҵӋҷ҆ӄҺӈӂҋҰӒӑӉӏӉҞ", (byte)51, 68), nLoginBukkit.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ζβησεθωυγτ.C("ұҾҽҀӀҼҷӀӋҺ҇ӅӉӂӅӋҍӁӕӌӍӌӘҔӔҳӗӐӓәҮӢәӚәӥҬ", (byte)51, 67) + var1 + ΨΦνΨΦωυΩνβςμ.E("ԩ", (byte)51, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   protected ρΣνμχγΨοΔΦ[] a() {
      return ΩψΨρεξοσΠςΛυ.values();
   }

   @Override
   public boolean callEvent(Object var1) {
      this.a().getPluginManager().callEvent((Event)var1);
      return (boolean)(var1 instanceof Cancellable && ((Cancellable)var1).isCancelled() ? ag : af);
   }

   public ΨγημιδξΓτοθαζ a() {
      return super.b();
   }

   @Generated
   public boolean i() {
      return this.s;
   }

   @Override
   protected void j() {
      if (this.s) {
         this.a = new ΦωοφυδιφΣΦ(this);
      }

      Object var1 = this.s ? new δςμθγκΓγΨληνυΠ(this) : new βζερηΣολσαμ(this);
      this.a(new ΨγημιδξΓτοθαζ((ΔοΓκωΠαλξφιΩθ)var1, this, this.s));
      super.j();
   }

   @Generated
   public ΦωοφυδιφΣΦ a() {
      return this.a;
   }

   @Override
   protected void i() {
      try {
         MemClassLoader var1 = this.a().a();
         ClassLoader var2 = var1.getParentLoader();
         (var2.getParent() != null ? var2.getParent() : ClassLoader.getSystemClassLoader()).loadClass(c<"㺀">(w, x ^ y));
         var1.configureFilter(Collections.singleton(c<"㺃">(z, aa ^ ab)));
      } catch (ClassNotFoundException var3) {
      }

      this.s = (boolean)(ορΣψφρΔαεδψσθυ.aG || !ΓχυψπωΣςΠκγζΦ.T() && !ΓχυψπωΣςΠκγζΦ.U() ? ad : ac);
      if (this.s) {
         this.b(ae);
      }

      super.i();
   }

   public nLoginBukkit(BukkitLoader var1) {
      super(
         var1, c<"㺀">(b, d ^ e), new καΦζθθυυεφΦγ(c<"㺃">(f, g), c<"㺆">(h, i), c<"㺉">(j, k), c<"㺌">(l, m ^ n), c<"㺏">(o, p ^ q), c<"㺒">(r, s), c<"㺕">(t & u, v))
      );
   }
}
