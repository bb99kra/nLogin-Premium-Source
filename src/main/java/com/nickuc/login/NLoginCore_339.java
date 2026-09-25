package com.nickuc.login;

import io.netty.channel.Channel;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.connection.InitialHandler;
import net.md_5.bungee.netty.ChannelWrapper;

public class NLoginCore_339 {
   private static String[] ZKM_STR_B = new String[NLoginCore_339.j];
   private static int l = (0 >>> 191 | 0 << -191) & -1;
   private static int h = Integer.reverse(0);
   private static final Field h = NLoginCore_546.a(ChannelWrapper.class, Channel.class, l);
   private static int b = -1 >>> 189 | -1 << ~189 + 1;
   private static long c;
   private static long g = Long.reverse(1100844421645380329L);
   private static int e = (67108864 >>> 250 | 67108864 << -250) & -1;
   private static int k = (0 >>> 166 | 0 << -166) & -1;
   private static String[] ZKM_STR_A = new String[NLoginCore_339.i];
   private static int a = 0 >>> 187 | 0 << ~187 + 1;
   private static int i = Integer.reverse(1073741824);
   private static final Field g = NLoginCore_546.a(InitialHandler.class, ChannelWrapper.class, k);
   private static int f = Integer.reverse(-1);
   private static int j = (Integer.MIN_VALUE >>> 30 | Integer.MIN_VALUE << -30) & -1;
   private static long d = Long.reverse(1100844421645380329L);

   static {
      b();
   }

   @Nullable
   public static Channel a(Object var0, PendingConnection var1) {
      try {
         InitialHandler var2 = (InitialHandler)var1;
         ChannelWrapper var3 = (ChannelWrapper)g.get(var2);
         return (Channel)h.get(var3);
      } catch (Exception var4) {
         NLoginCore_370.c(a(a & b, d) + var0.getClass().getCanonicalName() + a(e & f, g), var4);
         return null;
      }
   }

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  NLoginCore_339.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(NLoginCore_127.A("¯ÑÓ³×öîĄð¿ýóāûÄéċĊĂĈĂ×", (byte)4, 65), NLoginCore_339.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            NLoginCore_446.E("ԣ\u0530ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿ\u0890ࢇ\u0893\u086fࡾ࢟\u0895࢜ࢊࢢࢣࢥ\u088fࢠԙ", (byte)4, 69)
               + var1
               + NLoginCore_521.E("Ӻ", (byte)4, 69)
               + var2.toString(),
            var4
         );
      }
   }

   private static String a(int var0, long var1) {
      var1 ^= 110L;
      var1 ^= 2760580908677354940L;
      if (ZKM_STR_A[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     (byte)(8 + 60),
                     (byte)(61 + 8),
                     (byte)(7 + 76),
                     (byte)(34 + 13),
                     (byte)(60 + 7),
                     (byte)(24 + 42),
                     (byte)(60 + 7),
                     (byte)(19 + 28),
                     80,
                     (byte)(74 + 1),
                     (byte)(59 + 8),
                     (byte)(2 + 81),
                     (byte)(52 + 1),
                     (byte)(21 + 59),
                     (byte)(24 + 73),
                     (byte)(75 + 25),
                     100,
                     (byte)(3 + 102),
                     (byte)(11 + 99),
                     (byte)(41 + 62)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(15 + 53), (byte)(56 + 13), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(NLoginCore_076.D("юћњНѝљєѝѨїФѢѦџѢѨЪ\u07bb\u07b2\u07beޚީߊ߀߇\u07b5ߍߎߐ\u07baߋ", (byte)18, 68));
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
      c = -7542081856636755298L;
      long var0 = c ^ 2760580908677354940L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(52 + 16),
               (byte)(2 + 67),
               (byte)(57 + 26),
               (byte)(17 + 30),
               (byte)(18 + 49),
               (byte)(28 + 38),
               (byte)(55 + 12),
               (byte)(43 + 4),
               (byte)(49 + 31),
               (byte)(6 + 69),
               (byte)(59 + 8),
               (byte)(72 + 11),
               (byte)(47 + 6),
               (byte)(26 + 54),
               97,
               (byte)(51 + 49),
               (byte)(73 + 27),
               (byte)(10 + 95),
               110,
               (byte)(53 + 50)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(56 + 12), 69, 83}, StandardCharsets.UTF_8));
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
               ZKM_STR_B[0] = NLoginCore_384.F("֕չպ֣֗օվ֝ևոլդց֚ւ֣ծետ֟տձֳ֫և\u058cֹּ֫֎֍ְ֏׃֎ֵׁ֛֒֓֙ֆ֑֔", (byte)109, 70);
               ZKM_STR_B[1] = NLoginCore_201.F("վ֡֙ոձւչ֒֙յիձ", (byte)109, 70);
               break;
            case 1:
               ZKM_STR_B[0] = NLoginCore_183.C("ըՌՍժն\u0558Ցհ՚ՋԿԷՔխՕնՁԸՒղՒՄֆվ՚՟֏\u058cվաՠփՑր֔ժ֙բիջսվհյ֡ՙձփ՜֓զքյ֘կհ", (byte)109, 67);
               ZKM_STR_B[1] = NLoginCore_471.C("ծյէԷժԶԹՌլջՠՐվՋՑջհյՂՙփՒՏՐ", (byte)109, 67);
               break;
            case 2:
               ZKM_STR_B[0] = NLoginCore_384.D("ՋթԷՠԶչՋճի\u0558վտՁ\u0558պԽ\u0557ցւշՉբՏՐ", (byte)109, 68);
            case 3:
            default:
               break;
            case 4:
               ZKM_STR_B[0] = NLoginCore_521.A("ǁƟƫƩƯƵƩƣƚƨƻƘǍǚǠƘƳƽƚƛǝǕƬƭ", (byte)109, 65);
         }
      }
   }
}
