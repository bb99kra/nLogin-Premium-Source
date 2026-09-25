package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public final class NLoginCore_442 implements NLoginInterface_021, CommandExecutor, TabCompleter {
   private static int af = (-1 >>> 212 | -1 << ~212 + 1) & -1;
   private static long g = Long.reverse(6009847471270414956L);
   private static long ag = Long.reverse(6009847471270414956L);
   private static int am = Integer.reverse(-1879048192);
   private static int x = (0 >>> 34 | 0 << -34) & -1;
   private static long w = Long.reverse(-1008806316530991104L);
   private static long k = Long.reverse(-1008806316530991104L);
   private static long v = Long.reverse(-6816404267480757652L);
   private static int z = (0 >>> 117 | 0 << -117) & -1;
   private static long aj = Long.reverse(6009847471270414956L);
   private static long p = Long.reverse(-6816404267480757652L);
   private static String[] ZKM_STR_B = new String[am];
   private static int ai = Integer.reverse(-1);
   private static int al = Integer.reverse(-1879048192);
   private static int ad = (8192 >>> 109 | 8192 << ~109 + 1) & -1;
   private final NLoginCore_168<?> b;
   private PluginCommand a;
   private static int l = Integer.reverse(-1073741824);
   private static long q = Long.reverse(-1008806316530991104L);
   private static int b = Integer.reverse(0);
   private static int ab = Integer.reverse(1073741824);
   private static int ac = Integer.reverse(0);
   private static int aa = Integer.reverse(Integer.MIN_VALUE);
   private static int a = Integer.reverse(Integer.MIN_VALUE);
   private final Server a;
   private static long d = Long.reverse(-6816404267480757652L);
   private static long c;
   private static int u = Integer.reverse(1610612736);
   private static int ak = 0 >>> 154 | 0 << ~154 + 1;
   private static long t = Long.reverse(-1008806316530991104L);
   private static int ae = -1073741823 >>> 94 | -1073741823 << -94;
   private static long s = Long.reverse(-6816404267480757652L);
   private static int ah = (1 >>> 93 | 1 << ~93 + 1) & -1;
   private static int r = (10 >>> 1 | 10 << ~1 + 1) & -1;
   private static int h = (0 >>> 6 | 0 << ~6 + 1) & -1;
   private static int i = Integer.MIN_VALUE >>> 94 | Integer.MIN_VALUE << ~94 + 1;
   private static int y = (1073741824 >>> 93 | 1073741824 << ~93 + 1) & -1;
   private static long j = Long.reverse(-6816404267480757652L);
   private static int f = 4096 >>> 204 | 4096 << -204;
   private static long m = Long.reverse(-6816404267480757652L);
   private static int o = Integer.reverse(536870912);
   private static long n = Long.reverse(-1008806316530991104L);
   private static String[] ZKM_STR_A = new String[al];
   private static long e = Long.reverse(-1008806316530991104L);

   @Override
   public void W() {
      this.a = this.a();
      if (this.a != null) {
         try {
            PluginManager var1 = this.a.getPluginManager();
            Field var2 = NLoginCore_546.a(var1.getClass(), a(b, d ^ e));
            Object var3 = var2.get(var1);
            if (var3 instanceof CommandMap) {
               CommandMap var4 = (CommandMap)var3;
               var4.register(this.b.a().q().toLowerCase(Locale.ENGLISH), this.a);
            }
         } catch (Exception var5) {
            NLoginCore_370.c(a(f, g) + var5.getLocalizedMessage(), var5);
         }
      }
   }

   public boolean onCommand(CommandSender var1, Command var2, String var3, String[] var4) {
      this.b.a(var1, var1.getName(), var1 instanceof Player, var3, var4);
      return (a != 0);
   }

   static {
      b();
   }

   private PluginCommand a() {
      try {
         Class[] var10001 = new Class[y];
         var10001[z] = String.class;
         var10001[aa] = Plugin.class;
         Constructor var1 = NLoginCore_546.b(PluginCommand.class, var10001);
         Object[] var5 = new Object[ab];
         var5[ac] = this.b.aa();
         var5[ad] = this.b.a().b();
         PluginCommand var2 = (PluginCommand)var1.newInstance(var5);
         var2.setAliases(this.b.c());
         String var3 = this.b.ab();
         var2.setDescription(var3 == null ? a(ae & af, ag) : var3);
         var2.setExecutor(this);
         var2.setTabCompleter(this);
         return var2;
      } catch (Exception var4) {
         NLoginCore_370.c(a(ah & ai, aj) + var4.getLocalizedMessage(), var4);
         return null;
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 79L;
      var1 ^= -7795250138684718832L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(33 + 35),
                     69,
                     (byte)(65 + 18),
                     (byte)(6 + 41),
                     (byte)(45 + 22),
                     (byte)(19 + 47),
                     (byte)(58 + 9),
                     (byte)(27 + 20),
                     (byte)(60 + 20),
                     (byte)(53 + 22),
                     (byte)(54 + 13),
                     (byte)(21 + 62),
                     53,
                     (byte)(64 + 16),
                     (byte)(28 + 69),
                     (byte)(4 + 96),
                     (byte)(17 + 83),
                     (byte)(17 + 88),
                     (byte)(61 + 49),
                     (byte)(37 + 66)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(60 + 8), (byte)(60 + 9), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.E("ԸՅՄԇՇՃԾՇՒՁԎՌՐՉՌՒԔ࢙ࢧ࢝ࢮ\u0890ࢆࢥࢦࢥࢧࢲ", (byte)25, 69));
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

   private static void b() {
      c = 3914291079383541381L;
      long var0 = c ^ -7795250138684718832L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(27 + 41),
               (byte)(16 + 53),
               (byte)(58 + 25),
               (byte)(4 + 43),
               (byte)(5 + 62),
               (byte)(63 + 3),
               (byte)(8 + 59),
               (byte)(3 + 44),
               (byte)(47 + 33),
               (byte)(14 + 61),
               (byte)(7 + 60),
               (byte)(46 + 37),
               (byte)(28 + 25),
               80,
               97,
               (byte)(43 + 57),
               (byte)(10 + 90),
               (byte)(97 + 8),
               (byte)(64 + 46),
               (byte)(3 + 100)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(63 + 6), (byte)(27 + 56)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_559.A("ƘƞǁƘƠƟƠƞƣƎǋƅƵǆƒǒƬƲƲƹǑǛƢƣ", (byte)104, 65);
               ZKM_STR_B[1] = NLoginCore_241.C("ԽԯԟէԡՔՍԭՁԬՂԱԫ՟ՠԿԾԯՈՙհմռԼնՠկԸլբԿնՐՇրևՅթսնէՙլՕ", (byte)104, 67);
               ZKM_STR_B[2] = NLoginCore_427.C("ԶԼ՟ԶԾԽԾԼՁԬթԣՓդ\u0530հՊՐՐ\u0557կչՀՁ", (byte)104, 67);
               ZKM_STR_B[3] = NLoginCore_092.A("ưƶƹƶƼƿƪƽƛƼƥƼƓƞǖƥƑƫƥǄǅǋƢƣ", (byte)104, 65);
               ZKM_STR_B[4] = NLoginCore_004.F("զ՛֒ս֗֕պաջ֟֝լ", (byte)104, 70);
               ZKM_STR_B[5] = NLoginCore_138.B("ƑƆƽƨǂǀƥƌƦǊǈƗ", (byte)104, 66);
               ZKM_STR_B[6] = NLoginCore_110.E("մզՖ֞\u0558\u058bքդոգշա֛֥՝սվվ֡պցտց֎ք֎֯կղփֻ֦֪հ֛րַ֬֙֫փ׃ֆ\u058c", (byte)104, 69);
               ZKM_STR_B[7] = NLoginCore_173.E("֛֓֏ծ֚֚ռ֢֟֟ս֑աղց՞֩֘ի\u058bչ֪ց֡ք֑֊֏ָն֥։ֵհ׀֩։ֿ֕քրֆֵ֟ք֓քּ֦֨ׄ׃\u05cfֽ־֡֫\u05c9ׄ֓֩\u05ccל֕", (byte)104, 69);
               ZKM_STR_B[8] = NLoginCore_446.C("ԽԯԟէԡՔՍԭՁԬՁՀԽԮՊզՕՇՙեժԳՈեսՐձՙխփձԻվֈ\u0557շտբյ\u058cՆ֎֊Օ", (byte)104, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_575.A("ƘƞǁƘƠƟƠƞƣƎǈƿǏƕƞƒǁƭƓǌƷƥƢƣ", (byte)104, 65);
               ZKM_STR_B[1] = NLoginCore_127.E("մզՖ֞\u0558\u058bքդոգչըբ֖֗նյզտ\u0590ֳ֧֫ճ֦֭֗կ֣֙ն֭\u058bֲֽ֟չֽ֢֑֥ւֹ\u058c", (byte)104, 69);
               ZKM_STR_B[2] = NLoginCore_076.C("ԶԼ՟ԶԾԽԾԼՁԬզ՟՚իՠԳՏՊյհգՃՀՁ", (byte)104, 67);
               ZKM_STR_B[3] = NLoginCore_433.B("ưƶƹƶƼƿƪƽƛƼƤƢǐƽƴƓƏƩƬƓƛǛƢƣ", (byte)104, 66);
               ZKM_STR_B[4] = NLoginCore_241.A("ƆǄƛƫǌƦƋƧƠǌǌƗ", (byte)104, 65);
               ZKM_STR_B[5] = NLoginCore_232.C("ԟըԼՈՃՂՌԸԠՠԯԵ", (byte)104, 67);
               ZKM_STR_B[6] = NLoginCore_183.A("ƟƑƁǉƃƶƯƏƣƎƢƌǆǐƈƨƩƩǌƥƬƪƬƹƯƹǚƚƝƮǑǦƨƧǙǜƴƟƼƺǣƨǇǞǣǈǟƮƴǢǛǌǥǕǂǃ", (byte)104, 65);
               ZKM_STR_B[7] = NLoginCore_397.C("՜դ\u0558ԷգգՅըիըՆ՚ԪԻՊԧղաԴՔՂճՊժՍ՚Փ\u0558ցԿծՒվԹ։ղՒֈ՞ՍՉՏվըՍ՜Սօկձ֍\u058c֘օ֎թ֕ժ\u0558՚֝\u058bհֆ", (byte)104, 67);
               ZKM_STR_B[8] = NLoginCore_223.C("ԽԯԟէԡՔՍԭՁԬՁՀԽԮՊզՕՇՙեժԳՈեսՐձՙխփձԻէզյՑ։ՅսռՠՆդՕ", (byte)104, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_559.A("ǇſǀƸƛƥƺƥƭƠƧƮƍƓƣƳƢƳǌưǍƴƾƝƞƽƾƶǀǕơǜ", (byte)104, 65);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.C("ՐԵՇՃՅԩԪԭՙբՏԻՊլ՟ՇըղիաջԹԲՓՖպմվլհՐւ", (byte)104, 67);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_442.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_201.E("բքֆզ֊ַ֣֩֡ղְִ֦֮շ֜־ֵֵֻֽ֊", (byte)126, 69), NLoginCore_442.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_387.E("֪֝֩լַ֣֦֬֨֬ճֱֱֵַ֮չࣾऌंओࣵ࣫ऊऋऊऌग\u0590", (byte)126, 69) + var1 + NLoginCore_076.F("մ", (byte)126, 70) + var2.toString(), var4
         );
      }
   }

   @Override
   public synchronized void X() {
      if (this.a != null) {
         try {
            PluginManager var1 = this.a.getPluginManager();
            Field var2 = NLoginCore_546.a(var1.getClass(), a(i, j ^ k));
            Object var3 = var2.get(var1);
            if (var3 instanceof CommandMap) {
               CommandMap var4 = (CommandMap)var3;
               List var5 = this.a.getAliases();
               this.a.setAliases(Collections.emptyList());
               this.a.unregister(var4);
               if (var4 instanceof SimpleCommandMap) {
                  Field var6 = NLoginCore_546.a(SimpleCommandMap.class, a(l, m ^ n));
                  Map var7 = (Map)var6.get(var4);
                  String var8 = this.b.a().q().toLowerCase(Locale.ENGLISH);
                  String var9 = this.a.getName();
                  var7.remove(var8 + a(o, p ^ q) + var9);
                  var7.remove(var9);

                  for (String var11 : var5) {
                     var7.remove(var8 + a(r, s ^ t) + var11);
                     var7.remove(var11);
                  }
               }
            }
         } catch (Exception var12) {
            NLoginCore_370.c(a(u, v ^ w) + var12.getLocalizedMessage(), var12);
         }
      }
   }

   public List<String> onTabComplete(CommandSender var1, Command var2, String var3, String[] var4) {
      return this.b.a(var1, var1.getName(), var1 instanceof Player, var3, var4);
   }

   @Generated
   public NLoginCore_442(Server var1, NLoginCore_168<?> var2) {
      this.a = var1;
      this.b = var2;
   }
}
