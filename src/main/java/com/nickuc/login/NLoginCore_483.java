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

public abstract class NLoginCore_483<V extends NLoginInterface_011<?>> implements NLoginInterface_047 {
   private static long d = Long.reverse(-8359511176136350356L);
   private static int f = Integer.reverse(1073741824);
   private static long b = Long.reverse(6052007631449236844L);
   protected final V h;
   private static int a = 0 >>> 76 | 0 << -76;
   private static long h = Long.reverse(-2882303761517117440L);
   private static long c;
   private static int k = 0 >>> 217 | 0 << ~217 + 1;
   private static String[] a = new String[NLoginCore_483.l];
   private static long g = Long.reverse(-8359511176136350356L);
   private static long e = Long.reverse(-2882303761517117440L);
   private static int m = Integer.reverse(-1073741824);
   private static int i = Integer.reverse(Integer.MIN_VALUE);
   private static int c = Integer.reverse(Integer.MIN_VALUE);
   private static int l = 48 >>> 100 | 48 << ~100 + 1;
   private static int j = Integer.reverse(Integer.MIN_VALUE);
   private static String[] b = new String[m];

   private static void b() {
      c = 3937340539207204817L;
      long var0 = c ^ 7634789438276402145L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(66 + 2),
               (byte)(33 + 36),
               (byte)(54 + 29),
               (byte)(9 + 38),
               (byte)(7 + 60),
               (byte)(42 + 24),
               (byte)(48 + 19),
               47,
               (byte)(50 + 30),
               (byte)(5 + 70),
               (byte)(51 + 16),
               (byte)(59 + 24),
               (byte)(4 + 49),
               80,
               (byte)(54 + 43),
               (byte)(53 + 47),
               (byte)(68 + 32),
               (byte)(14 + 91),
               (byte)(27 + 83),
               (byte)(58 + 45)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(64 + 5), 83}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_451.B("ƬǅƱưƵƉƇǊƹƨǍƆƨƿƬƍƠǓǎƗƗƩƮƷǘǚǈƵǁǒǓǛ", (byte)102, 66);
               b[1] = NLoginCore_091.C("ՈաՍՌՑԥԣզՕՄթԢՄ՛ՈԩԼկժԳԳՁղԲեՖպՒՅ՞ՆԸԿՠս\u0558ԶԼ՚աքֈժՏ", (byte)102, 67);
               b[2] = NLoginCore_553.F("ֈխլձ֜ՠջ՜շ֕յղտս֑֩ջ֭թ֢լւ֢֮֓֍ֱ֨֔֊ָյַ\u0590֔ֈָ֖֯չ֭֙ր֊", (byte)102, 70);
               break;
            case 1:
               b[0] = NLoginCore_471.E("փ֜ֈև\u058cՠ՞֡\u0590տ֤՝տ֖փդշ֪֥ծծր֍֧֠֕֨֍ղկիֶ֖յַׁ֩֞֫֒֜ն֕֊", (byte)102, 69);
               b[1] = NLoginCore_446.B("ƬǅƱưƵƉƇǊƹƨǍƆƨƿƬƍƠǓǎƗƗƥǖƖǉƺǞƶƩǂƪƜƽǐƵǞƲơǀǉǜǍƶƳ", (byte)102, 66);
               b[2] = NLoginCore_127.E("ֈխլձ֜ՠջ՜շ֕յղտս֑֩ջ֭թ֢լւ֢֮֓֍ֱ֨֔֊ָյ֍ֲַַֽ֑֪մ\u0590ւ֍֊", (byte)102, 69);
               break;
            case 2:
               b[0] = NLoginCore_173.F("Օռկ֖\u0558՛տպ՛֣վչձ֔եղ֘բռ֍֚֞յն", (byte)102, 70);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_553.E("֙Վ։՞֖֜՝խ\u058b֢ցժ", (byte)102, 69);
         }
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 27L;
      var1 ^= 7634789438276402145L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(63 + 5),
                     (byte)(49 + 20),
                     (byte)(8 + 75),
                     (byte)(19 + 28),
                     (byte)(8 + 59),
                     (byte)(25 + 41),
                     (byte)(41 + 26),
                     (byte)(5 + 42),
                     80,
                     (byte)(55 + 20),
                     (byte)(2 + 65),
                     (byte)(65 + 18),
                     (byte)(13 + 40),
                     (byte)(61 + 19),
                     97,
                     (byte)(84 + 16),
                     (byte)(25 + 75),
                     (byte)(73 + 32),
                     (byte)(74 + 36),
                     (byte)(102 + 1)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(44 + 24), 69, 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_173.C("ӀӍӌҏӏӋӆӏӚӉҖӔӘӑӔӚҜࠬ࠴࠭\u082fࠤ\u082f࠻ࠪ", (byte)56, 67));
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

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_483.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_091.B("ŏűųœŷƖƎƤƐşƝƓơƛŤƉƫƪƢƨƢŷ", (byte)84, 66), NLoginCore_483.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_223.D("ԔԡԠӣԣԟԚԣԮԝӪԨԬԥԨԮӰࢀ࢈ࢁࢃࡸࢃ\u088fࡾԄ", (byte)84, 68) + var1 + NLoginCore_559.F("Պ", (byte)84, 70) + var2.toString(), var4
         );
      }
   }

   @Generated
   public NLoginCore_483(V var1) {
      this.h = (V)var1;
   }

   @Override
   public boolean a(NLoginCore_277 var1, NLoginCore_337 var2, Object var3, byte[] var4) {
      if (var3 == null) {
         throw new IllegalArgumentException(a(a, b));
      } else if (var3 instanceof String && ((String)var3).isEmpty()) {
         throw new IllegalArgumentException(a(c, d ^ e));
      } else if (var4 == null) {
         throw new IllegalArgumentException(a(f, g ^ h));
      } else if (var1 != null) {
         var1.a(this.h, var2, var3, var4);
         return (boolean)i;
      } else {
         for (NLoginCore_277 var6 : this.h.b().c()) {
            if (var6.R()) {
               var6.a(this.h, var2, var3, var4);
               return (boolean)j;
            }
         }

         return (boolean)k;
      }
   }

   static {
      b();
   }
}
