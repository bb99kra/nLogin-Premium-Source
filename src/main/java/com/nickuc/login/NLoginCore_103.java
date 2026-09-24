package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class NLoginCore_103 {
   private static long b = Long.reverse(-1679541903181808983L);
   private static int k = 2048 >>> 107 | 2048 << ~107 + 1;
   private static long c;
   private final NLoginCore_103 a;
   private static int h = (11776 >>> 136 | 11776 << ~136 + 1) & -1;
   private static int p = Integer.reverse(0);
   private static int t = Integer.reverse(1073741824);
   final Map<String, Object> d = new LinkedHashMap<>();
   private static int r = Integer.reverse(Integer.MIN_VALUE);
   private static int e = Integer.reverse(1946157056);
   private static int u = Integer.reverse(1073741824);
   private static int g = 0 >>> 8 | 0 << ~8 + 1;
   private static int v = (385875968 >>> 151 | 385875968 << ~151 + 1) & -1;
   private static String[] a = new String[t];
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static String[] b = new String[u];
   private static int f = Integer.reverse(-1);
   private static int o = (0 >>> 105 | 0 << ~105 + 1) & -1;
   private static long d = Long.reverse(2017612633061982208L);
   private static int i = -1 >>> 25 | -1 << -25;
   private static final char a = (char)v;
   private static int m = Integer.reverse(0);
   private static int l = 0 >>> 52 | 0 << -52;
   private static int a = (0 >>> 37 | 0 << -37) & -1;
   private static int q = Integer.reverse(0);
   private static long s = Long.reverse(-814850774726673751L);
   private static int n = Integer.reverse(0);

   public String k(String var1) {
      Object var2 = this.e(var1);
      return this.g(var1, var2 instanceof String ? (String)var2 : a(r, s));
   }

   public NLoginCore_103 b(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, (NLoginCore_103)(var2 instanceof NLoginCore_103 ? var2 : new NLoginCore_103(this.a == null ? null : this.a.b(var1))));
   }

   public List<String> k(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof String) {
            var3.add((String)var5);
         }
      }

      return var3;
   }

   private String j(String var1) {
      int var2 = var1.indexOf(h);
      return var2 == i ? var1 : var1.substring(var2 + j);
   }

   public boolean l(String var1) {
      return (boolean)(this.a(var1, null) != null ? k : l);
   }

   public void a(String var1, Object var2) {
      if (var2 instanceof Map) {
         var2 = new NLoginCore_103((Map<?, ?>)var2, this.a == null ? null : this.a.b(var1));
      }

      NLoginCore_103 var3 = this.a(var1);
      if (var3 == this) {
         if (var2 == null) {
            this.d.remove(var1);
         } else {
            this.d.put(var1, var2);
         }
      } else {
         var3.a(this.j(var1), var2);
      }
   }

   public List<Long> f(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Number) {
            var3.add(((Number)var5).longValue());
         }
      }

      return var3;
   }

   public byte a(String var1, byte var2) {
      Object var3 = this.a(var1, Byte.valueOf(var2));
      return var3 instanceof Number ? ((Number)var3).byteValue() : var2;
   }

   public Collection<String> e() {
      return new LinkedHashSet<>(this.d.keySet());
   }

   NLoginCore_103(Map<?, ?> var1, NLoginCore_103 var2) {
      this.a = var2;

      for (Entry var4 : var1.entrySet()) {
         String var5 = var4.getKey() == null ? a(a, b ^ d) : var4.getKey().toString();
         if (var4.getValue() instanceof Map) {
            this.d.put(var5, new NLoginCore_103((Map<?, ?>)var4.getValue(), var2 == null ? null : var2.b(var5)));
         } else {
            this.d.put(var5, var4.getValue());
         }
      }
   }

   public List<Byte> c(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Number) {
            var3.add(((Number)var5).byteValue());
         }
      }

      return var3;
   }

   public double a(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, var2 instanceof Number ? ((Number)var2).doubleValue() : 0.0);
   }

   private NLoginCore_103 a(String var1) {
      int var2 = var1.indexOf(e);
      if (var2 == f) {
         return this;
      } else {
         String var3 = var1.substring(g, var2);
         Object var4 = this.d.get(var3);
         if (var4 == null) {
            var4 = new NLoginCore_103(this.a == null ? null : this.a.b(var3));
            this.d.put(var3, var4);
         }

         return (NLoginCore_103)var4;
      }
   }

   public char a(String var1, char var2) {
      Object var3 = this.a(var1, Character.valueOf(var2));
      return var3 instanceof Character ? (Character)var3 : var2;
   }

   public float a(String var1, float var2) {
      Object var3 = this.a(var1, Float.valueOf(var2));
      return var3 instanceof Number ? ((Number)var3).floatValue() : var2;
   }

   static {
      b();
   }

   public int a(String var1, int var2) {
      Object var3 = this.a(var1, Integer.valueOf(var2));
      return var3 instanceof Number ? ((Number)var3).intValue() : var2;
   }

   public long a(String var1, long var2) {
      Object var4 = this.a(var1, Long.valueOf(var2));
      return var4 instanceof Number ? ((Number)var4).longValue() : var2;
   }

   public List<Character> j(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Character) {
            var3.add((Character)var5);
         }
      }

      return var3;
   }

   public List<Boolean> i(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Boolean) {
            var3.add((Boolean)var5);
         }
      }

      return var3;
   }

   public String g(String var1, String var2) {
      Object var3 = this.a(var1, var2);
      return var3 instanceof String ? (String)var3 : var2;
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_103.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_110.F("ՐղմՔո֗֏֥֑ՠ֢֞֔֜ե֊֣֣֬֫֩ո", (byte)108, 70), NLoginCore_103.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_559.C("՜թըԫիէբինեԲհմխհնԸࣈࣈࢵ࣎ࢩࣂࣂࣙࣇࣉࣉࣗࢶ࣑Ւ", (byte)108, 67) + var1 + NLoginCore_241.C("Գ", (byte)108, 67) + var2.toString(), var4
         );
      }
   }

   public short a(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, (short)(var2 instanceof Number ? ((Number)var2).shortValue() : n));
   }

   public float a(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, var2 instanceof Number ? ((Number)var2).floatValue() : 0.0F);
   }

   public int a(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, var2 instanceof Number ? ((Number)var2).intValue() : o);
   }

   public byte a(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, (byte)(var2 instanceof Number ? ((Number)var2).byteValue() : m));
   }

   public Object a(String var1) {
      return this.a(var1, this.e(var1));
   }

   private static String a(int var0, long var1) {
      var1 ^= 56L;
      var1 ^= -4517046173456661787L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(40 + 28),
                     (byte)(49 + 20),
                     (byte)(35 + 48),
                     (byte)(25 + 22),
                     67,
                     (byte)(29 + 37),
                     (byte)(17 + 50),
                     (byte)(34 + 13),
                     (byte)(49 + 31),
                     (byte)(26 + 49),
                     (byte)(63 + 4),
                     (byte)(13 + 70),
                     (byte)(48 + 5),
                     (byte)(73 + 7),
                     (byte)(6 + 91),
                     100,
                     (byte)(34 + 66),
                     (byte)(69 + 36),
                     (byte)(43 + 67),
                     (byte)(16 + 87)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(59 + 10), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.E("՜թըԫիէբինեԲհմխհնԸࣈࣈࢵ࣎ࢩࣂࣂࣙࣇࣉࣉࣗࢶ࣑", (byte)61, 69));
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

   public List<?> a(String var1, List<?> var2) {
      Object var3 = this.a(var1, var2);
      return var3 instanceof List ? (List)var3 : var2;
   }

   public NLoginCore_103(NLoginCore_103 var1) {
      this(new LinkedHashMap(), var1);
   }

   public char a(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, (char)(var2 instanceof Character ? (Character)var2 : q));
   }

   public List<Short> d(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Number) {
            var3.add(((Number)var5).shortValue());
         }
      }

      return var3;
   }

   public Object e(String var1) {
      return this.a == null ? null : this.a.a(var1);
   }

   public short a(String var1, short var2) {
      Object var3 = this.a(var1, Short.valueOf(var2));
      return var3 instanceof Number ? ((Number)var3).shortValue() : var2;
   }

   public long a(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, var2 instanceof Number ? ((Number)var2).longValue() : 0L);
   }

   public NLoginCore_103() {
      this(null);
   }

   public double a(String var1, double var2) {
      Object var4 = this.a(var1, Double.valueOf(var2));
      return var4 instanceof Number ? ((Number)var4).doubleValue() : var2;
   }

   private static void b() {
      c = -7683300644441518825L;
      long var0 = c ^ -4517046173456661787L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(29 + 39),
               (byte)(31 + 38),
               (byte)(55 + 28),
               (byte)(40 + 7),
               (byte)(37 + 30),
               (byte)(59 + 7),
               (byte)(6 + 61),
               47,
               (byte)(44 + 36),
               (byte)(22 + 53),
               (byte)(51 + 16),
               83,
               (byte)(13 + 40),
               (byte)(19 + 61),
               (byte)(67 + 30),
               (byte)(94 + 6),
               (byte)(32 + 68),
               (byte)(58 + 47),
               (byte)(95 + 15),
               (byte)(18 + 85)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(18 + 51), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_387.C("ӆһҪӃӐүӐӳӣӑөӀ", (byte)65, 67);
               b[1] = NLoginCore_433.A("łŋŻŬľŹƀŵļŞŶŉ", (byte)65, 65);
               break;
            case 1:
               b[0] = NLoginCore_027.E("դեբՖմգՙզՒԱ\u0558մսԾյ\u0557ԽՆֈՄՆգՐՑ", (byte)65, 69);
               b[1] = NLoginCore_110.E("ԵիէժխՋՐԻՓՑՔՅ", (byte)65, 69);
               break;
            case 2:
               b[0] = NLoginCore_471.E("զՖՙոՋլԲԶՉԷ՞խՠքհՐֆ՛ՑնեչՐՑ", (byte)65, 69);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_027.C("ӐҬӣҪӄҶӦӧӳӪӱӨӭӰӘӴәӠӓӐӽӚӐӘӛӠӅӛӛԀӘԅ", (byte)65, 67);
         }
      }
   }

   public List<?> l(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, var2 instanceof List ? (List)var2 : Collections.EMPTY_LIST);
   }

   public List<Integer> e(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Number) {
            var3.add(((Number)var5).intValue());
         }
      }

      return var3;
   }

   public List<Float> g(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Number) {
            var3.add(((Number)var5).floatValue());
         }
      }

      return var3;
   }

   public <T> T a(String var1, T var2) {
      NLoginCore_103 var3 = this.a(var1);
      Object var4;
      if (var3 == this) {
         var4 = this.d.get(var1);
      } else {
         var4 = var3.a(this.j(var1), var2);
      }

      if (var4 == null && var2 instanceof NLoginCore_103) {
         this.d.put(var1, var2);
      }

      return (T)(var4 != null ? var4 : var2);
   }

   public boolean m(String var1) {
      Object var2 = this.e(var1);
      return this.a(var1, (boolean)(var2 instanceof Boolean ? (Boolean)var2 : p));
   }

   public boolean a(String var1, boolean var2) {
      Object var3 = this.a(var1, Boolean.valueOf(var2));
      return var3 instanceof Boolean ? (Boolean)var3 : var2;
   }

   public List<Double> h(String var1) {
      List var2 = this.l(var1);
      ArrayList var3 = new ArrayList();

      for (Object var5 : var2) {
         if (var5 instanceof Number) {
            var3.add(((Number)var5).doubleValue());
         }
      }

      return var3;
   }
}
