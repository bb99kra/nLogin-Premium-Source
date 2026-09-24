package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
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
import org.bukkit.plugin.PluginManager;

public class NLoginCore_252 implements NLoginInterface_030, NLoginInterface_025 {
   private static int b = Integer.reverse(-1);
   private final nLoginBukkit n;
   private static String[] b = new String[NLoginCore_252.k];
   private static long d = Long.reverse(-943954654571020931L);
   private static int e = 65536 >>> 16 | 65536 << ~16 + 1;
   private static int j = 786432 >>> 178 | 786432 << ~178 + 1;
   private static String[] a = new String[j];
   private static long h = Long.reverse(-2817452099557147267L);
   private NLoginCore_087 a;
   private static int a = (0 >>> 227 | 0 << -227) & -1;
   private static long f = Long.reverse(-943954654571020931L);
   private static int g = Integer.reverse(1073741824);
   private static long i = Long.reverse(3026418949592973312L);
   private static int k = Integer.reverse(-1073741824);
   private static long c;

   @Override
   public NLoginInterface_031 a() {
      throw new UnsupportedOperationException(a(e, f));
   }

   @Generated
   public NLoginCore_252(nLoginBukkit var1) {
      this.n = var1;
   }

   @Override
   public NLoginCore_033 a() {
      throw new UnsupportedOperationException(a(g, h ^ i));
   }

   static {
      b();
   }

   @Generated
   @Override
   public NLoginCore_087 a() {
      return this.a;
   }

   @Override
   public void a(NLoginType_008 var1, boolean var2) {
      this.k();
   }

   private static String a(int var0, long var1) {
      var1 ^= 84L;
      var1 ^= -6007181037255066259L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(17 + 51),
                     69,
                     (byte)(82 + 1),
                     (byte)(30 + 17),
                     (byte)(31 + 36),
                     (byte)(15 + 51),
                     (byte)(36 + 31),
                     (byte)(17 + 30),
                     (byte)(45 + 35),
                     (byte)(70 + 5),
                     (byte)(30 + 37),
                     (byte)(23 + 60),
                     (byte)(14 + 39),
                     (byte)(9 + 71),
                     (byte)(51 + 46),
                     (byte)(48 + 52),
                     100,
                     (byte)(11 + 94),
                     (byte)(99 + 11),
                     (byte)(39 + 64)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(2 + 67), (byte)(67 + 16)}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_092.D("ҺӇӆ҉ӉӅӀӉӔӃҐӎӒӋӎӔҖࠬࠥࠞ࠲ࠏࠨࠠࠕࠪࠢ", (byte)54, 68));
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

   private static void b() {
      c = -4702342622656174309L;
      long var0 = c ^ -6007181037255066259L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(31 + 37),
               (byte)(53 + 16),
               (byte)(52 + 31),
               (byte)(12 + 35),
               (byte)(64 + 3),
               (byte)(56 + 10),
               67,
               (byte)(27 + 20),
               (byte)(30 + 50),
               (byte)(7 + 68),
               (byte)(5 + 62),
               (byte)(13 + 70),
               (byte)(15 + 38),
               (byte)(15 + 65),
               (byte)(48 + 49),
               (byte)(63 + 37),
               100,
               (byte)(15 + 90),
               (byte)(75 + 35),
               (byte)(49 + 54)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(40 + 43)}, StandardCharsets.UTF_8));
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
               b[0] = NLoginCore_091.A("ĒĎĸēĻĠĐąŅĺĥĲĊŉĩċģĞĠğĒěĘę", (byte)35, 65);
               b[1] = NLoginCore_141.E("ԊԲԹՏ՛ԲՔԭՔ՟Տ՚ԶԥՕԽՔՆՕՆՅ՝՚՛ՏՀՊկ\u0530ԱկնԮդՈնԻԹՖՉ՚ՌՔ\u0557՞նքՇյ՚ժ\u058b\u0558եՒՓ", (byte)35, 69);
               b[2] = NLoginCore_110.F("ԊԲԹՏ՛ԲՔԭՔ՟Տ՚ԶԥՕԽՔՆՕՆՅ՝՚՛ՏՀՊկ\u0530ԱկնԮդՈնԻԹՖՉ՚ՌՔ\u0557՞նքՇյ՚ժ\u058b\u0558եՒՓ", (byte)35, 70);
               break;
            case 1:
               b[0] = NLoginCore_110.F("ԬԨՒԭՕԺԪԟ՟ՔԾՠԬԴ՚Բ՝\u0557ԳՌՁԵԲԳ", (byte)35, 70);
               b[1] = NLoginCore_241.E("ԊԲԹՏ՛ԲՔԭՔ՟Տ՚ԶԥՕԽՔՆՕՆՅ՝՚՛ՏՀՊկ\u0530ԱկնԮդՈնԻԹՖՉ՚ՌՓրքցդբպ՛ՊյֆՕՒՓ", (byte)35, 69);
               b[2] = NLoginCore_183.D("щѱѸҎҚѱғѬғҞҎҙѵѤҔѼғ҅Ҕ҅҄ҜҙҚҎѿ҉ҮѯѰҮҵѭң҇ҵѺѸҕ҈ҙҋҔҟӀҥ҄҄Ғ҈ӀӀӋӊґҒ", (byte)35, 68);
               break;
            case 2:
               b[0] = NLoginCore_092.C("ѯѢҎѴѫѰҙқѰј҂ѻѰҚқҀѷ҇ѠѦѵ҃ҊҏҚҩҁҧҔҊҴѲ", (byte)35, 67);
            case 3:
            default:
               break;
            case 4:
               b[0] = NLoginCore_110.F("ԢՋԘՍՐԽԲՎԶԱԔԬՍԡԲ՟եՆԻ՛ԞԵԲԳ", (byte)35, 70);
         }
      }
   }

   @Override
   public void l() {
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_252.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_138.B("ŋŭůŏųƒƊƠƌśƙƏƝƗŠƅƧƦƞƤƞų", (byte)82, 66), NLoginCore_252.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_201.D("ԎԛԚӝԝԙԔԝԨԗӤԢԦԟԢԨӪࢀࡹࡲࢆࡣࡼࡴࡩࡾࡶԀ", (byte)82, 68) + var1 + NLoginCore_091.E("Ո", (byte)82, 69) + var2.toString(), var4
         );
      }
   }

   @Override
   public void k() {
      PluginManager var1 = this.n.a().getPluginManager();
      if (var1.getPlugin(a(a & b, d)) != null) {
         this.a = new NLoginCore_087();
      }
   }
}
