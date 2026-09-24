package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.loader.platform.BukkitLoader;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class κΓωλλτδχμη {
   private static int f = Integer.reverse(-1);
   private static int q = (268435456 >>> 58 | 268435456 << ~58 + 1) & -1;
   private static int i = Integer.reverse(1073741824);
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static int x = (0 >>> 90 | 0 << -90) & -1;
   private static int b = (-1 >>> 84 | -1 << -84) & -1;
   private static long c;
   private static long d = Long.reverse(-4017994531919259281L);
   private static long m = Long.reverse(-4017994531919259281L);
   private static final boolean k;
   private static int a = Integer.reverse(0);
   private static int t = 8388608 >>> 182 | 8388608 << ~182 + 1;
   private static int p = Integer.reverse(-1610612736);
   private static long r = Long.reverse(-3873879343843403409L);
   private static long j = Long.reverse(-3873879343843403409L);
   private static long k = Long.reverse(144115188075855872L);
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int w = 2097152 >>> 181 | 2097152 << -181;
   private static int n = 0 >>> 51 | 0 << ~51 + 1;
   private static int l = 384 >>> 103 | 384 << -103;
   private static int h = (0 >>> 198 | 0 << ~198 + 1) & -1;
   private static int u = (0 >>> 153 | 0 << -153) & -1;
   private static long s = Long.reverse(144115188075855872L);
   private static int o = 163840 >>> 175 | 163840 << ~175 + 1;
   private static String[] b = new String[p];
   private static String[] a = new String[o];
   private static long g = Long.reverse(-4017994531919259281L);

   private static void a(Plugin var0, Player var1, Player var2) {
      if (k) {
         var1.hidePlayer(var0, var2);
      } else {
         var1.hidePlayer(var2);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  κΓωλλτδχμη.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(θεωψξβΛσσ.A("ßāăãćĦĞĴĠïĭģıīôęĻĺĲĸĲć", (byte)28, 65), κΓωλλτδχμη.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            μζξτΩσσφυδεπλΨ.E("ԻՈՇԊՊՆՁՊՕՄԑՏՓՌՏՕԗࢣࡽࢴࢧࢨࢲࢣࢷࢭࢩԭ", (byte)28, 69) + var1 + χφπρψπφΦθμπ.A("ñ", (byte)28, 65) + var2.toString(), var4
         );
      }
   }

   private static void b(Plugin var0, Player var1, Player var2) {
      if (k) {
         var1.showPlayer(var0, var2);
      } else {
         var1.showPlayer(var2);
      }
   }

   static {
      b();
      String var10001 = c<"㺀">(q, r ^ s);
      Class[] var10002 = new Class[t];
      var10002[u] = Plugin.class;
      var10002[v] = Player.class;
      k = (boolean)(ΓΛθσφζςηκ.a(Player.class, var10001, var10002) != null ? κΓωλλτδχμη.w : x);
   }

   public static void b(nLoginBukkit var0, Player var1) {
      try {
         εσλρΔμΔψχεθυνΔ var2 = var0.a().a();
         BukkitLoader var3 = var0.a();

         for (ΨαχΨχΣλεΠψΦ var5 : var0.b().c()) {
            if (!var5.S() && var2.b(var5)) {
               Player var6 = var5.c();
               b(var3, var6, var1);
               b(var3, var1, var6);
            }
         }
      } catch (Exception var7) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(i, j ^ k) + var1.getName() + c<"㺃">(l, m), var7);
      }
   }

   private static void b() {
      c = -677300299753538477L;
      long var0 = c ^ -8075671453443573067L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(44 + 25),
               (byte)(77 + 6),
               (byte)(42 + 5),
               (byte)(54 + 13),
               (byte)(39 + 27),
               67,
               (byte)(36 + 11),
               80,
               (byte)(73 + 2),
               (byte)(34 + 33),
               (byte)(19 + 64),
               (byte)(15 + 38),
               (byte)(7 + 73),
               (byte)(36 + 61),
               (byte)(67 + 33),
               (byte)(6 + 94),
               (byte)(70 + 35),
               (byte)(101 + 9),
               (byte)(79 + 24)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(45 + 23), 69, 83}, StandardCharsets.UTF_8));
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
               b[0] = ςΦζσμτΓσ.E("նպս֥֙ֆ\u058bչ֗շ֣ոքսռ֥֓֟֕ֈֵ֩ղֳֽ֩չִֺ֟\u058c֎֎ְոׇ֑֯ց֢ׅ׀֚֓", (byte)111, 69);
               b[1] = μεςΩΔΣγν.F("շ֦֜էգ֞֨նև֢րր֟քցլժյ֗\u0590ֳַվտ", (byte)111, 70);
               b[2] = βεξΠθρρςΔΦμ.A("ƨƬƯǗǋƸƽƫǉƩǕƪƶƯƮǅǑǗǇƺǧǨǠǣǢǨǬǜƫƬǬưǳǳǧǅǩǓƳǛƶǧǶǅ", (byte)111, 65);
               b[3] = ΨφιωσρΓδΔθ.F("շ֦֜էգ֞֨նև֢րր֟քցլժյ֗\u0590ֳַվտ", (byte)111, 70);
               b[4] = ιΠοθΩΦξκ.F("՟֤֜և֔ռ֩րտէ֤֬։ֲ֯֨֯էִհָ֑վտ", (byte)111, 70);
               break;
            case 1:
               b[0] = ζβησεθωυγτ.F("նպս֥֙ֆ\u058bչ֗շ֣ոքսռ֥֓֟֕ֈֵ֩ղֳֽ֩չִֺ֟\u058c֎տ֭׀֥֒քֺֻׂ׆ּ֓", (byte)111, 70);
               b[1] = ςπυηννναΣ.B("ƩǎǘƙƕǐǚƨƹǔưƽǜǂƲǙǚǤƶƸƧǩưƱ", (byte)111, 66);
               b[2] = ΨφιωσρΓδΔθ.D("ՍՑՔռհ՝բՐծՎպՏ՛ՔՓժնռլ՟\u058c֍օֈև֍֑ցՐՑ֑ՕՒդ֑է\u058b՚ռպհւ՜ժ", (byte)111, 68);
               b[3] = πψυκΠΨμΛΩβΣφμφσ.B("ƩǎǘƙƕǐǚƨƹǔưƲǠǎưǁǗƵƱǦƳǙưƱ", (byte)111, 66);
               b[4] = ξψθρΣΠΣς.B("ƑǎǖƹǆƮǛƲƱƙǟƪǋƺǥƟǅưǈơǛǩưƱ", (byte)111, 66);
               break;
            case 2:
               b[0] = ιΠοθΩΦξκ.F("տ֦գ՟֤֜ըեո֊֬զօֲ\u058b֑֝֝հִ֠ղչփ֗մֳֶֻ֑֚ׄ", (byte)111, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = ςπυηννναΣ.E("ս֍շ֒֩մվն֦֟ֆճ", (byte)111, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 64L;
      var1 ^= -8075671453443573067L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(33 + 35),
                     (byte)(31 + 38),
                     (byte)(81 + 2),
                     (byte)(36 + 11),
                     67,
                     (byte)(53 + 13),
                     (byte)(55 + 12),
                     (byte)(3 + 44),
                     (byte)(47 + 33),
                     (byte)(9 + 66),
                     (byte)(6 + 61),
                     (byte)(17 + 66),
                     (byte)(29 + 24),
                     (byte)(4 + 76),
                     (byte)(85 + 12),
                     (byte)(40 + 60),
                     (byte)(28 + 72),
                     105,
                     (byte)(91 + 19),
                     (byte)(17 + 86)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(10 + 59), (byte)(50 + 33)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΦδφπθΩΩλζξ.B("òÿþÁāýøāČûÈĆĊăĆČÎњдѫўџѩњѮѤѠ", (byte)8, 66));
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

   public static void a(nLoginBukkit var0, Player var1) {
      try {
         BukkitLoader var2 = var0.a();

         for (ΨαχΨχΣλεΠψΦ var4 : var0.b().c()) {
            if (!var4.S()) {
               Player var5 = var4.c();
               a(var2, var5, var1);
               a(var2, var1, var5);
            }
         }
      } catch (Exception var6) {
         ψΓωτιμωκχψΛΨ.c(c<"㺀">(a & b, d) + var1.getName() + c<"㺃">(e & f, g), var6);
      }
   }
}
