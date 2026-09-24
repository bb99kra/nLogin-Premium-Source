package com.nickuc.login;

import com.nickuc.login.lib.snakeyaml.DumperOptions;
import com.nickuc.login.lib.snakeyaml.LoaderOptions;
import com.nickuc.login.lib.snakeyaml.Yaml;
import com.nickuc.login.lib.snakeyaml.constructor.Constructor;
import com.nickuc.login.lib.snakeyaml.nodes.MappingNode;
import com.nickuc.login.lib.snakeyaml.nodes.Node;
import com.nickuc.login.lib.snakeyaml.nodes.NodeTuple;
import com.nickuc.login.lib.snakeyaml.nodes.ScalarNode;
import com.nickuc.login.lib.snakeyaml.representer.Representer;
import java.io.File;
import java.io.FileReader;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_222 {
   private static int e = Integer.reverse(Integer.MIN_VALUE);
   private static long o = Long.reverse(-2491562224144250311L);
   private static int q = 2560 >>> 73 | 2560 << -73;
   private static long g = Long.reverse(-1441151880758558720L);
   private static int b = Integer.reverse(0);
   private static long c;
   private static int a = (0 >>> 160 | 0 << ~160 + 1) & -1;
   private static int l = Integer.reverse(-1);
   private static int r = 1280 >>> 8 | 1280 << ~8 + 1;
   private static long f = Long.reverse(-2491562224144250311L);
   private static long i = Long.reverse(-2491562224144250311L);
   private static long j = Long.reverse(-1441151880758558720L);
   private static String[] a = new String[q];
   private static int h = 8192 >>> 44 | 8192 << -44;
   private static int c = -1 >>> 82 | -1 << ~82 + 1;
   private static int k = Integer.reverse(-1073741824);
   private static String[] b = new String[r];
   private static long p = Long.reverse(-1441151880758558720L);
   private static long m = Long.reverse(3561275675041696313L);
   private static long d = Long.reverse(3561275675041696313L);
   private static int n = 134217728 >>> 153 | 134217728 << -153;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_222.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_451.C("ҩӋӍҭӑӰӨӾӪҹӷӭӻӵҾӣԅԄӼԂӼӑ", (byte)68, 67), NLoginCore_222.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_427.A("ŪŷŶĹŹŵŰŹƄųŀžƂŻžƄņҳӢҭӟӜӕӒәӝӛӚӫӖӥӠš", (byte)68, 65) + var1 + NLoginCore_127.A("Ł", (byte)68, 65) + var2.toString(), var4
         );
      }
   }

   public static MappingNode a(Yaml var0, File var1) {
      FileReader var3 = new FileReader(var1);

      Node var2;
      try {
         var2 = var0.compose(var3);
      } catch (Throwable var7) {
         try {
            var3.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var3.close();
      if (!(var2 instanceof MappingNode)) {
         throw new IllegalStateException(a(n, o ^ p) + var2.getClass().getCanonicalName());
      } else {
         return (MappingNode)var2;
      }
   }

   public static void a(MappingNode var0, String var1, BiFunction<String, Node, Node> var2) {
      List var3 = var0.getValue();

      for (int var4 = a; var4 < var3.size(); var4++) {
         NodeTuple var5 = (NodeTuple)var3.get(var4);
         Node var6 = var5.getKeyNode();
         if (!(var6 instanceof ScalarNode)) {
            throw new IllegalStateException(a(b & c, d) + var6.getClass().getCanonicalName() + a(e, f ^ g) + var6);
         }

         ScalarNode var7 = (ScalarNode)var6;
         String var8 = var1 + (var1.isEmpty() ? a(h, i ^ j) : a(k & l, m)) + var7.getValue();
         Node var9 = var5.getValueNode();
         if (var9 instanceof MappingNode) {
            a((MappingNode)var9, var8, var2);
         } else {
            Node var10 = (Node)var2.apply(var8, var9);
            if (var10 != null) {
               var3.set(var4, new NodeTuple(var6, var10));
            }
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 55L;
      var1 ^= -2818592983003543264L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(28 + 40),
                     (byte)(17 + 52),
                     (byte)(62 + 21),
                     (byte)(3 + 44),
                     67,
                     (byte)(26 + 40),
                     67,
                     (byte)(10 + 37),
                     (byte)(32 + 48),
                     (byte)(72 + 3),
                     (byte)(58 + 9),
                     (byte)(20 + 63),
                     (byte)(24 + 29),
                     (byte)(29 + 51),
                     (byte)(66 + 31),
                     (byte)(55 + 45),
                     (byte)(99 + 1),
                     (byte)(78 + 27),
                     (byte)(81 + 29),
                     (byte)(12 + 91)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(42 + 27), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_004.F("ԦԳԲӵԵԱԬԵՀԯӼԺԾԷԺՀԂ\u086f࢞ࡩ࢛࢘\u0891ࢎ\u0895࢙\u0897\u0896ࢧ\u0892ࢡ࢜", (byte)7, 70));
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

   public static Yaml a(boolean var0) {
      LoaderOptions var1 = new LoaderOptions();
      var1.setProcessComments(var0);
      DumperOptions var2 = new DumperOptions();
      var2.setProcessComments(var0);
      return new Yaml(new Constructor(var1), new Representer(var2), var2, var1);
   }

   private static void b() {
      c = -7182792367453489477L;
      long var0 = c ^ -2818592983003543264L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(40 + 28),
               (byte)(12 + 57),
               (byte)(32 + 51),
               (byte)(23 + 24),
               (byte)(16 + 51),
               (byte)(40 + 26),
               67,
               (byte)(14 + 33),
               (byte)(40 + 40),
               (byte)(52 + 23),
               (byte)(46 + 21),
               (byte)(74 + 9),
               (byte)(36 + 17),
               (byte)(70 + 10),
               (byte)(12 + 85),
               (byte)(15 + 85),
               (byte)(69 + 31),
               (byte)(79 + 26),
               110,
               (byte)(14 + 89)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(82 + 1)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_232.B("ƅŘłţŢƐƁſŽƍųőƍŪƅŴŕƅƖŔƉƍƙƟƊŽųƦƄƥŽƀŜſŶŸƩƏũŨƞƦƢŹ", (byte)73, 66);
               b[1] = NLoginCore_446.A("ŴĽŵŪšŌſƊůŦŠř", (byte)73, 65);
               b[2] = NLoginCore_553.B("ŉŷŽŶņŠŋňƁżƎř", (byte)73, 66);
               b[3] = NLoginCore_451.B("ũŚśƂƄƊżřűŢœř", (byte)73, 66);
               b[4] = NLoginCore_201.A("ƅŘłţŢƐƁſŽƍűƖƈŗƔŹƋƊƚœżƎŗũšŴƜţşųƝƊƅŻŴţƁšƞžƜƃƮŹ", (byte)73, 65);
               break;
            case 1:
               b[0] = NLoginCore_201.B("ƅŘłţŢƐƁſŽƍųőƍŪƅŴŕƅƖŔƉƍƙƟƊŽųƦƄƥŽƀƖŵƥơťƫżƊơƓƈŹ", (byte)73, 66);
               b[1] = NLoginCore_384.A("ŗŊŌƅţŉŘŏźŉƆř", (byte)73, 65);
               b[2] = NLoginCore_201.E("տչտ՟հՑԻՒՔկղՍ", (byte)73, 69);
               b[3] = NLoginCore_091.D("ӔӢԂөԌԄӻԌӱӜӯӘ", (byte)73, 68);
               b[4] = NLoginCore_027.D("ԄӗӁӢӡԏԀӾӼԌӰԕԇӖԓӸԊԉԙӒӻԍӖӨӠӳԛӢӞӲԜԉԈөԤԘԌӤӺӧԞԜԝӸ", (byte)73, 68);
               break;
            case 2:
               b[0] = NLoginCore_559.A("ńťŖŹŦŦŏřŮƒŲšŌƎŒŤŨƒƖƜƌƐŵŶƂſƗŹšŝƈƅ", (byte)73, 65);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_387.C("ӖӧӺԌӗӚԌԀӼӲӧԊӏӪӸԕԖԑӼөԞӦӣӤ", (byte)73, 67);
         }
      }
   }
}
