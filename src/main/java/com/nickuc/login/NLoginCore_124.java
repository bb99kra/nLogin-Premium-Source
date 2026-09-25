package com.nickuc.login;

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

public class NLoginCore_124 implements NLoginInterface_035 {
   private static int y = Integer.reverse(0);
   private static int h = 32 >>> 133 | 32 << -133;
   private static long ai = Long.reverse(8214565720323784704L);
   private static int q = (0 >>> 143 | 0 << ~143 + 1) & -1;
   private static long d = Long.reverse(-8609587492184958597L);
   private static int k = Integer.reverse(1073741824);
   private static int e = (256 >>> 136 | 256 << ~136 + 1) & -1;
   private static int aa = (128 >>> 134 | 128 << ~134 + 1) & -1;
   private static int a = (2 >>> 129 | 2 << -129) & -1;
   private static int n = 16384 >>> 141 | 16384 << ~141 + 1;
   private static int v = (536870912 >>> 125 | 536870912 << -125) & -1;
   private static int s = (512 >>> 232 | 512 << -232) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_124.aj];
   private static int ag = '耀' >>> '\r' | 32768 << ~13 + 1;
   private static int z = (128 >>> 71 | 128 << -71) & -1;
   private static String[] ZKM_STR_B = new String[NLoginCore_124.ak];
   private static int w = (0 >>> 71 | 0 << -71) & -1;
   private static long ae = Long.reverse(8214565720323784704L);
   private static int t = Integer.reverse(0);
   private static int ac = (3 >>> 192 | 3 << -192) & -1;
   private static long o = Long.reverse(-395021771861173893L);
   private static int f = 33554432 >>> 121 | 33554432 << -121;
   private static long c;
   private static long ad = Long.reverse(-395021771861173893L);
   private static int x = Integer.reverse(1073741824);
   private final NLoginCore_211 O;
   private static int ab = Integer.reverse(0);
   private static int g = Integer.reverse(0);
   private static int r = Integer.reverse(0);
   private static int l = Integer.reverse(0);
   private static long i = Long.reverse(-395021771861173893L);
   private static int u = Integer.reverse(Integer.MIN_VALUE);
   private static int ak = 2621440 >>> 115 | 2621440 << -115;
   private static int aj = 10 >>> 161 | 10 << -161;
   private static int c = Integer.reverse(0);
   private static long ah = Long.reverse(-395021771861173893L);
   private static long p = Long.reverse(8214565720323784704L);
   private static int m = Integer.reverse(Integer.MIN_VALUE);
   private static int b = Integer.reverse(0);
   private static int af = Integer.reverse(Integer.MIN_VALUE);
   private static long j = Long.reverse(8214565720323784704L);

   @Override
   public GUIButtonContainer[] a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4) {
      NLoginCore_142 var5 = var1.a().a();
      String var6 = var5.M();
      String var7 = var1.s();
      boolean var8 = var1.a().a().ac();
      String var12;
      if (!var7.equals(var6)) {
         var12 = a(h, i ^ j);
         Object[] var10001 = new Object[k];
         var10001[l] = var7;
         var10001[m] = var6;
         var12 = String.format(var12, var10001);
      } else {
         var12 = a(n, o ^ p);
      }

      String var9 = var12;
      NLoginCore_204 var10 = var5.b();
      if (var10 == null) {
         var10 = NLoginCore_204.c;
      }

      String var11 = NLoginCore_150.a(var3.a()).a(var10 == NLoginCore_204.b ? NLoginCore_237.a : NLoginCore_237.b);
      NLoginCore_150.a(var2, NLoginCore_508.q);
      NLoginCore_237 var14 = var8 ? NLoginCore_237.y : NLoginCore_237.x;
      Object[] var10002 = new Object[s];
      var10002[t] = var9;
      var10002[u] = var11;
      NLoginCore_150.a(var2, var14, var10002);
      GUIButtonContainer[] var13;
      if (var8) {
         NLoginCore_445[] var15 = new NLoginCore_445[v];
         var15[w] = NLoginCore_445.a;
         var13 = GUIButtonContainer.a(var2, var15);
      } else {
         NLoginCore_445[] var16 = new NLoginCore_445[x];
         var16[y] = NLoginCore_445.b;
         var16[z] = NLoginCore_445.c;
         var13 = GUIButtonContainer.a(var2, var16);
      }

      return var13;
   }

   @Override
   public boolean a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3) {
      NLoginCore_227 var4 = var1.a();
      NLoginCore_142 var5 = var4.a();
      String var6 = var5.M();
      NLoginCore_233 var7 = var1.a().a();
      if (var6 == null) {
         var7.e((a != 0));
         return (b != 0);
      } else {
         return ((var1.a() != 0).a().a(a(c, d), (e != 0)) || !var1.a().a().ac() && (!var5.ad() || var7.ah()) ? g : f);
      }
   }

   static {
      b();
   }

   @Generated
   @Override
   public NLoginCore_211 a() {
      return this.O;
   }

   @Generated
   public NLoginCore_124(NLoginCore_211 var1) {
      this.O = var1;
   }

   private static String a(int var0, long var1) {
      var1 ^= 78L;
      var1 ^= -4894186428224314876L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(13 + 55),
                     (byte)(9 + 60),
                     (byte)(31 + 52),
                     (byte)(43 + 4),
                     (byte)(5 + 62),
                     (byte)(55 + 11),
                     (byte)(63 + 4),
                     (byte)(19 + 28),
                     (byte)(53 + 27),
                     75,
                     (byte)(11 + 56),
                     (byte)(52 + 31),
                     (byte)(48 + 5),
                     80,
                     (byte)(94 + 3),
                     (byte)(83 + 17),
                     (byte)(23 + 77),
                     (byte)(27 + 78),
                     (byte)(3 + 107),
                     (byte)(5 + 98)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(76 + 7)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_530.D("ԠԭԬӯԯԫԦԯԺԩӶԴԸԱԴԺӼ\u0890\u0894ࡳࢌ\u0894ࡹ࢚࢛", (byte)88, 68));
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
      c = -2406376196366851745L;
      long var0 = c ^ -4894186428224314876L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               68,
               (byte)(65 + 4),
               (byte)(32 + 51),
               (byte)(24 + 23),
               (byte)(14 + 53),
               (byte)(19 + 47),
               (byte)(35 + 32),
               (byte)(39 + 8),
               (byte)(27 + 53),
               (byte)(3 + 72),
               (byte)(10 + 57),
               83,
               (byte)(28 + 25),
               (byte)(25 + 55),
               (byte)(6 + 91),
               (byte)(91 + 9),
               (byte)(99 + 1),
               (byte)(14 + 91),
               (byte)(92 + 18),
               (byte)(11 + 92)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(28 + 40), (byte)(51 + 18), 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_387.C("҈ѶҠќѿѼѬѽѳҒҏҀѽ҉Ѧ҆Ҧ҈҂үѺҊѷѸ", (byte)37, 67);
               ZKM_STR_B[1] = NLoginCore_446.C("ј҈ҐѨњѡҐңѷ҆ҙѴҦѩ҂ҧ҅ѷҭ҃ҜґҊҁҌҏ҉Ҍңҍѵҝ", (byte)37, 67);
               ZKM_STR_B[2] = NLoginCore_092.F("ՍԨՅԩԩԽԨԱՂԿԬԩ", (byte)37, 70);
               ZKM_STR_B[3] = NLoginCore_232.A("ėłďĻĤÿĿĵģņĤđ", (byte)37, 65);
               ZKM_STR_B[4] = NLoginCore_397.C("Ѿ҇ҞѺѠҚҀҝҁѲѷѬ", (byte)37, 67);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_141.C("҈ѶҠќѿѼѬѽѳҒ҈ҡѧҊҔѶѦѹѻҥѺҊѷѸ", (byte)37, 67);
               ZKM_STR_B[1] = NLoginCore_127.F("ԕՅՍԥԗԞՍՠԴՃՖԱգԦԿդՂԴժՀՙՐԬզղՌՐՒկգէԱպՃձԸ՚ՊՒՓՁջ՜Չ", (byte)37, 70);
               ZKM_STR_B[2] = NLoginCore_110.D("ҜѨѪҗѹҡҍҜѡҒҥѬ", (byte)37, 68);
               ZKM_STR_B[3] = NLoginCore_004.A("ĠęĚķėĘİĸĆěĿČīĺęĥļŇēŌčŕĜĝ", (byte)37, 65);
               ZKM_STR_B[4] = NLoginCore_241.C("ҐѼёѹѿѡѿѬѣҧҙҁ҉ҞѫҗҦҎѡҁ҅ѺѷѸ", (byte)37, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_521.E("ՃՔ\u0558ԧԭԵՉԾՕԞՠԥԘՙԻՀԺՌդ՟ԪՇԴԵ", (byte)37, 69);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_433.E("ՉԸ\u0558ՏԨԑԺԲԿԝ\u0558ՔգՏ՟ՈԳՃՄաԤԷԴԵ", (byte)37, 69);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(NLoginType_008 var1, NLoginCore_277 var2, NLoginCore_509 var3, NLoginInterface_024 var4, NLoginCore_445 var5) {
      switch (NLoginCore_278.u[var5.ordinal()]) {
         case 1:
         case 2:
            NLoginCore_466 var10000 = NLoginCore_466.b;
            String[] var10003 = new String[aa];
            var10003[ab] = a(ac, ad ^ ae);
            var10003[af] = a(ag, ah ^ ai);
            var10000.a(var2, var3, var10003);
         case 3:
            NLoginInterface_035.super.a(var1, var2, var3, var4, var5);
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_124.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_241.E("ԲՔՖԶ՚չձևճՂրնքվՇլ֎֍օ\u058bօ՚", (byte)78, 69), NLoginCore_124.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_110.D("ԂԏԎӑԑԍԈԑԜԋӘԖԚԓԖԜӞࡲࡶࡕ\u086eࡶ࡛ࡼࡽӲ", (byte)78, 68) + var1 + NLoginCore_446.D("ә", (byte)78, 68) + var2.toString(), var4
         );
      }
   }
}
