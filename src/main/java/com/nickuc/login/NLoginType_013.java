package com.nickuc.login;

import com.nickuc.login.api.enums.SpawnType;
import com.nickuc.login.api.nLoginAPI.nLoginInternal;
import com.nickuc.login.api.types.Identity;
import com.nickuc.login.api.types.Location;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginType_013 extends NLoginType_006 {
   private static long h = Long.reverse(-5423946641750332377L);
   private static int q = Integer.reverse(Integer.MIN_VALUE);
   private static String[] d = new String[NLoginType_013.ar];
   private static long v = Long.reverse(-5423946641750332377L);
   private static int ar = 320 >>> 102 | 320 << ~102 + 1;
   private static long t = Long.reverse(-8358680908399640576L);
   private static long s = Long.reverse(-5423946641750332377L);
   private static int af = Integer.reverse(536870912);
   private static int aq = Integer.reverse(-1610612736);
   private static int aa = (384 >>> 71 | 384 << ~71 + 1) & -1;
   private static long j = Long.reverse(-8358680908399640576L);
   private static long aj = Long.reverse(-8358680908399640576L);
   private static int u = Integer.reverse(1073741824);
   private static String[] c = new String[aq];
   private static long ac = Long.reverse(-5423946641750332377L);
   private static long ad = Long.reverse(-8358680908399640576L);
   private static long e;
   private static int f = 0 >>> 110 | 0 << ~110 + 1;
   private static long ag = Long.reverse(-5423946641750332377L);
   private static long w = Long.reverse(-8358680908399640576L);
   private final NLoginCore_085 a = new NLoginCore_085(this);

   static {
      b();
   }

   private static void b() {
      e = -2002356350299775699L;
      long var0 = e ^ 5778464559792133565L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(42 + 26),
               (byte)(11 + 58),
               (byte)(74 + 9),
               (byte)(43 + 4),
               (byte)(62 + 5),
               (byte)(54 + 12),
               (byte)(39 + 28),
               (byte)(41 + 6),
               (byte)(64 + 16),
               (byte)(51 + 24),
               (byte)(40 + 27),
               83,
               (byte)(44 + 9),
               (byte)(53 + 27),
               97,
               (byte)(63 + 37),
               (byte)(55 + 45),
               (byte)(91 + 14),
               (byte)(87 + 23),
               (byte)(96 + 7)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(65 + 3), 69, (byte)(71 + 12)}, StandardCharsets.UTF_8));
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
               d[0] = NLoginCore_521.D("\u058b՜ՔռկՈձ՜կՍ֒ֈտՑնՙ֊֜՚ղմը֒֔պ՛կխւՠօփ", (byte)116, 68);
               d[1] = NLoginCore_397.E("֗֡֗ս\u058b֍ւ֤գծ֎֣֨կֲֵ֣֚֮֕֔ն֎֛ց\u0590׃ֵֵַׁ֦֟֩֕ւ֛֝\u05caֿ֑֯\u05c9֘", (byte)116, 69);
               d[2] = NLoginCore_446.D("չոևոՇ֍֎աբմՔ֒օհւևկկէս֖էՒ֑շՠՖհւզ֨ՠչւ֞պ֖\u0590֍֤֞֜ռչ", (byte)116, 68);
               d[3] = NLoginCore_530.E("֦֘֗֗զ֭֬րց֓եվ֟լ֦րֆְֱֳ֥֜֔պַ֑րַֿׁׅ֦֯֝֒փֱּׁׂ֭֮֫֘", (byte)116, 69);
               d[4] = NLoginCore_384.A("ƷǍƚƞǖƜƱǡǜƶǗƸǭǋƥǘǪƿǋǍǑǍƺƻ", (byte)116, 65);
               break;
            case 1:
               d[0] = NLoginCore_141.C("\u058b՜ՔռկՈձ՜կՍ֒ֈտՑնՙ֊֜՚ղմժռտ֕՞ծ֧֚֝֔թ֣֓֩ֈջ֤֍֣֜վ֪չ", (byte)116, 67);
               d[1] = NLoginCore_451.E("֗֡֗ս\u058b֍ւ֤գծ֎֣֨կֲֵ֣֚֮֕֔ն֎֛ց\u0590׃ֵֵֹ֦֟֩\u05c8ֶ֚֨֕\u05c8֨׀א֛֘", (byte)116, 69);
               d[2] = NLoginCore_446.F("֦֘֗֗զ֭֬րց֓ճֱ֤֏֦֡֎֎ֆֵ֜ֆձְ֖տյ֏֡օׇտ֔։ַָ\u058c֦֮\u05cb׆\u05caׁ֘", (byte)116, 70);
               d[3] = NLoginCore_521.B("ǏǎǝǎƝǣǤƷƸǊƜƵǖƣǝƷƽǪǓǜǨǋǧƱǮǈƷǦǔǮǼǉǜǿǴǴȀǣǎǀǤǽǪǤǙǪǜǆǈǬȍȈȎȃǚǛ", (byte)116, 66);
               d[4] = NLoginCore_110.A("ƷǍƚƞǖƜƱǡǜƶǗǄǊǚƤƹǙǚƭƮǑƽƺƻ", (byte)116, 65);
               break;
            case 2:
               d[0] = NLoginCore_183.E("պ֘ըվ֭ցր֦֜ւ֝ո", (byte)116, 69);
            case 3:
            default:
               break;
            case 4:
               d[0] = NLoginCore_232.F("֛ճ֤֖շ֖\u0590֊պ֚և֎էֳֶ֦֕ւ֛֖֚֩փք", (byte)116, 70);
         }
      }
   }

   public void requestLogin(@Nonnull Identity var1, @Nonnull Object var2) {
      if (var2 == null) {
         throw new IllegalArgumentException(a(q, s ^ t));
      } else if (var1 == null) {
         throw new IllegalArgumentException(a(u, v ^ w));
      } else if (!(var1 instanceof NLoginCore_473)) {
         throw new IllegalArgumentException(a(aa, ac ^ ad) + NLoginCore_473.class.getCanonicalName() + a(af, ag ^ aj) + var1.getClass().getCanonicalName());
      } else {
         String var3 = this.b(var1);
         NLoginCore_277 var4 = this.a.b().a(var3);
         if (var4 != null) {
            this.a.b().a().c(var4, this.a.a().b(var4));
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 49L;
      var1 ^= 5778464559792133565L;
      if (c[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(16 + 52),
                     (byte)(34 + 35),
                     (byte)(44 + 39),
                     (byte)(32 + 15),
                     (byte)(56 + 11),
                     (byte)(25 + 41),
                     (byte)(53 + 14),
                     (byte)(44 + 3),
                     (byte)(61 + 19),
                     (byte)(33 + 42),
                     (byte)(23 + 44),
                     (byte)(38 + 45),
                     (byte)(9 + 44),
                     80,
                     (byte)(27 + 70),
                     (byte)(50 + 50),
                     100,
                     (byte)(25 + 80),
                     (byte)(96 + 14),
                     (byte)(60 + 43)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(14 + 55), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.D("жутЅхсмхѐпЌъючъѐВޢާޙނޱީޟދ\u07b5ޠޮ\u07b6", (byte)10, 68));
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

   public Optional<Location> getSpawnLocation(@Nonnull SpawnType var1) {
      throw new UnsupportedOperationException(a(f, h ^ j));
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginType_013.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_521.F("ՉիխՍձ\u0590ֈ֞֊ՙ֗֍֛֕՞փ֥֤֢֜֜ձ", (byte)101, 70), NLoginType_013.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.B("ƬƹƸŻƻƷƲƻǆƵƂǀǄƽǀǆƈԘԝԏӸԧԟԕԁԫԖԤԬƠ", (byte)101, 66) + var1 + NLoginCore_575.A("ƃ", (byte)101, 65) + var2.toString(), var4
         );
      }
   }

   public NLoginType_013(NLoginType_008 var1) {
      super(var1);
   }

   @Nonnull
   public nLoginInternal internal() {
      return this.a;
   }
}
