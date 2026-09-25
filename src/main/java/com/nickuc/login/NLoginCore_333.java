package com.nickuc.login;

import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_333 extends NLoginType_002 {
   private static int dq = Integer.reverse(536870912);
   private static long db = Long.reverse(7018432570938216842L);
   private static long dk = Long.reverse(1542055424055693706L);
   private static int be = Integer.reverse(0);
   private static int dc = Integer.reverse(Integer.MIN_VALUE);
   private static int cq = (8388608 >>> 215 | 8388608 << ~215 + 1) & -1;
   private static int cd = Integer.reverse(0);
   private static int df = Integer.reverse(1073741824);
   private static int bg = Integer.reverse(Integer.MIN_VALUE);
   private static int bv = Integer.reverse(1073741824);
   private static int ct = Integer.reverse(0);
   private static int dg = Integer.reverse(-1);
   private static int cs = Integer.reverse(-1174405120);
   private static int dr = 67108864 >>> 88 | 67108864 << ~88 + 1;
   private static long dm = Long.reverse(8358680908399640576L);
   private static int da = Integer.reverse(Integer.MIN_VALUE);
   private static int cc = Integer.reverse(-1073741824);
   private static int cg = 1610612747 >>> 221 | 1610612747 << ~221 + 1;
   private static int bh = (0 >>> 15 | 0 << -15) & -1;
   private static long bt = Long.reverse(1542055424055693706L);
   private static int bb = Integer.reverse(Integer.MIN_VALUE);
   private static int var_do = 6144 >>> 234 | 6144 << ~234 + 1;
   private static String[] ZKM_STR_B = new String[dr];
   private static String[] ZKM_STR_A = new String[dq];
   private static int by = 0 >>> 118 | 0 << -118;
   private static int dd = Integer.reverse(Integer.MIN_VALUE);
   private static long g;
   private static int di = -1073741824 >>> 254 | -1073741824 << -254;
   private static long dh = Long.reverse(7018432570938216842L);
   private static long bu = Long.reverse(8358680908399640576L);
   private static int cy = Integer.reverse(67108864);
   private static int bk = 0 >>> 192 | 0 << -192;
   private static int bd = (0 >>> 40 | 0 << ~40 + 1) & -1;
   private static int bz = Integer.reverse(Integer.MIN_VALUE);
   private static int cw = Integer.reverse(0);
   private static int br = 0 >>> 78 | 0 << -78;

   static {
      b();
   }

   @Override
   protected void a(NLoginCore_277 var1, ForceRegisterConfig var2, NLoginCore_509 var3, String var4, String[] var5) {
      this.a(var1, var3, var2, var4);
   }

   public NLoginCore_333(NLoginCore_466 var1) {
      super(var1, NLoginCore_311.e);
   }

   private static void b() {
      g = 5875987463538632360L;
      long var0 = g ^ -6460519601995377226L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(20 + 48),
               (byte)(59 + 10),
               (byte)(37 + 46),
               47,
               (byte)(63 + 4),
               (byte)(50 + 16),
               (byte)(18 + 49),
               (byte)(39 + 8),
               (byte)(53 + 27),
               (byte)(43 + 32),
               (byte)(24 + 43),
               (byte)(17 + 66),
               (byte)(38 + 15),
               (byte)(2 + 78),
               (byte)(60 + 37),
               (byte)(21 + 79),
               (byte)(16 + 84),
               (byte)(36 + 69),
               (byte)(8 + 102),
               103
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(15 + 54), (byte)(79 + 4)}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_127.B("ǙƢǙǆǀƨǛƫƦǈưǊǈƱƲǤǯưǗǏǹǩǀǁ", (byte)119, 66);
               ZKM_STR_B[1] = NLoginCore_092.B("ƵǗǣƢƩǅƽǈǨǌǮƵ", (byte)119, 66);
               ZKM_STR_B[2] = NLoginCore_471.C("զվէ\u058cէիՓ֛ծՙՓ՛։ՠո\u058cա֝ոտՠ֦խծ", (byte)119, 67);
               ZKM_STR_B[3] = NLoginCore_241.A("ƹǑƺǟƺƾƦǮǁƬƦƮǜƳǋǟƴǰǋǒƳǹǀǁ", (byte)119, 65);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_559.D("ֆՏֆճխՕֈ\u0558Փյ՝Ֆ֑՞՟֊\u058c՟ֆնտ֦խծ", (byte)119, 68);
               ZKM_STR_B[1] = NLoginCore_223.B("ƵƢǨǝǀƥǭƸƪǉǢƵ", (byte)119, 66);
               ZKM_STR_B[2] = NLoginCore_127.A("ƹǑƺǟƺƾƦǮǁƬƯƱǡǯǮǎǟƭƴǢǴǩǀǁ", (byte)119, 65);
               ZKM_STR_B[3] = NLoginCore_433.E("տ֗ր֥րքլִևղլ֯֏ִ\u0590ִ֒֔֨־ֿ֙ֆև", (byte)119, 69);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_141.C("ձքրզ֒ւՖշհ\u0557պխ֊\u058bրւ֏վյ֖քրխծ", (byte)119, 67);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_453.F("֡ժ֍աֲ֣֡ի֡էյջ", (byte)119, 70);
         }
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_333.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_004.B("±ÓÕµÙøðĆòÁÿõăýÆëčČĄĊĄÙ", (byte)5, 66), NLoginCore_333.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_173.E("ԤԱ\u0530ӳԳԯԪԳԾԭӺԸԼԵԸԾԀࡺ࢜ࡴࢇ\u0895\u0890\u0897ࢎ࢘࢘ࢠࢀԘ", (byte)5, 69) + var1 + NLoginCore_530.C("Ͼ", (byte)5, 67) + var2.toString(), var4
         );
      }
   }

   @Override
   protected void a(NLoginCore_277 var1, ForceRegisterConfig var2, NLoginInterface_038 var3, String var4, String[] var5) {
      if (this.a.b(var2) == null) {
         NLoginCore_487 var10001 = NLoginCore_487.aj;
         Object[] var10002 = new Object[bg];
         var10002[bh] = this.a.u();
         NLoginCore_150.a(var1, var10001, var10002);
      } else {
         var3.b(var2, var1);
         NLoginCore_150.a(var1, NLoginCore_487.ax);
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 46L;
      var1 ^= -6460519601995377226L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(6 + 63),
                     (byte)(50 + 33),
                     (byte)(35 + 12),
                     (byte)(38 + 29),
                     (byte)(54 + 12),
                     (byte)(62 + 5),
                     (byte)(11 + 36),
                     80,
                     (byte)(10 + 65),
                     (byte)(54 + 13),
                     (byte)(21 + 62),
                     (byte)(5 + 48),
                     (byte)(37 + 43),
                     (byte)(45 + 52),
                     (byte)(68 + 32),
                     (byte)(16 + 84),
                     (byte)(7 + 98),
                     (byte)(68 + 42),
                     (byte)(71 + 32)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(37 + 32), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.B("ĺŇņĉŉŅŀŉŔŃĐŎŒŋŎŔĖҐҲҊҝҫҦҭҤҮҮҶҖ", (byte)44, 66));
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

   private void a(NLoginCore_277 var1, NLoginCore_509 var2, String var3, String var4) {
      String var5 = a(br, bt ^ bu) + var4;
      NLoginInterface_024 var6 = var2.a();
      Consumer var7 = var2x -> {
         String var3x = var2x.trim();
         if (var3x.length() > cc && var3x.charAt(cd) == cg && var3x.charAt(var3x.length() - cq) == cs) {
            int var4x = ct;
            char[] var5x = var2x.toCharArray();
            int var6x = var5x.length;

            for (int var7x = cw; var7x < var6x; var7x++) {
               char var8 = var5x[var7x];
               if (var8 != cy) {
                  break;
               }

               var4x++;
            }

            String var9 = NLoginCore_112.b(a(da, db), var4x) + var3x.substring(dc, var3x.length() - dd).replace(a(df & dg, dh), var5);
            var6.f(var9, var5);
         } else {
            var6.a(var2x.replace(a(di, dk ^ dm), var5));
         }
      };
      NLoginCore_487 var10001 = NLoginCore_487.aA;
      Object[] var10003 = new Object[bv];
      var10003[by] = var3;
      var10003[bz] = this.a.a().a().a().getSelfUser().getAsTag();
      NLoginCore_150.a(var1, var10001, var7, var10003);
   }

   @Override
   protected void a(NLoginCore_277 var1, ForceRegisterConfig var2, NLoginCore_509 var3, NLoginInterface_038 var4, String var5, String[] var6) {
      NLoginCore_335 var7 = var2.a();
      if (var7.m() != null) {
         NLoginCore_487 var10001 = NLoginCore_487.ak;
         Object[] var10002 = new Object[bb];
         var10002[bd] = this.a.u();
         NLoginCore_150.a(var1, var10001, var10002);
      } else {
         String var8 = NLoginCore_363.b.a(new Object[be]);
         String var9 = var3.d(NLoginCore_567.O);
         if (var9 == null) {
            var9 = NLoginCore_177.a(NLoginType_019.l.asMap(), () -> NLoginCore_354.a(NLoginCore_198.d, var_do));
            var3.a(NLoginCore_567.O, var9);
            NLoginType_019.l.put(var9, var1.getName());
         }

         this.a(var1, var3, var8, var9);
      }
   }
}
