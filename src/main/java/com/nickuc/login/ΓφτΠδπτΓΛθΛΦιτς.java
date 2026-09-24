package com.nickuc.login;

import com.velocitypowered.api.command.CommandManager;
import com.velocitypowered.api.command.CommandMeta;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.command.SimpleCommand;
import com.velocitypowered.api.command.SimpleCommand.Invocation;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;

public class ΓφτΠδπτΓΛθΛΦιτς implements οηΔΦθκορ, SimpleCommand {
   private static long g = Long.reverse(4823502279966634215L);
   private static String[] a = new String[ΓφτΠδπτΓΛθΛΦιτς.i];
   private static long d = Long.reverse(8070450532247928832L);
   private static int i = 1048576 >>> 147 | 1048576 << ~147 + 1;
   private static int a = Integer.reverse(0);
   private static int f = (-1 >>> 45 | -1 << ~45 + 1) & -1;
   private static int e = (262144 >>> 242 | 262144 << -242) & -1;
   private static long b = Long.reverse(3670580775359787239L);
   private static String[] b = new String[ΓφτΠδπτΓΛθΛΦιτς.j];
   private static int h = (0 >>> 204 | 0 << -204) & -1;
   private static int j = (262144 >>> 145 | 262144 << -145) & -1;
   private final ιχρΨκεπυξ<?> d;
   private final ProxyServer a;
   private static long c;

   private static Object c(Lookup var0, String var1, MethodType var2) {
      try {
         return new MutableCallSite(
            var0.findStatic(
                  ΓφτΠδπτΓΛθΛΦιτς.class,
                  new String(new byte[]{97}, StandardCharsets.UTF_8),
                  MethodType.fromMethodDescriptorString(οΩνΩρωλΨηΛδωδ.F("ӿԡԣԃԧՆԾՔՀԏՍՃՑՋԔԹ՛՚Ւ\u0558Ւԧ", (byte)27, 70), ΓφτΠδπτΓΛθΛΦιτς.class.getClassLoader())
               )
               .asType(var2)
         );
      } catch (Exception var4) {
         throw new RuntimeException(
            ΣφδσΔζιΠρα.E("ԺՇՆԉՉՅՀՉՔՃԐՎՒՋՎՔԖࡻࢯࢮࢋࢠࢭࢲࢂࢋࢩࢍ࢙ࢭࢹࢸԱ", (byte)27, 69) + var1 + ΨφιωσρΓδΔθ.A("ï", (byte)27, 65) + var2.toString(), var4
         );
      }
   }

   public List<String> a(Invocation var1) {
      CommandSource var2 = var1.source();
      boolean var3 = var2 instanceof Player;
      String var4 = var3 ? ((Player)var2).getUsername() : c<"㺀">(e & f, g);
      List var5 = this.d.a(var2, var4, var3, var1.alias(), (String[])var1.arguments());
      return var5 != null ? var5 : Collections.emptyList();
   }

   @Override
   public void W() {
      CommandManager var1 = this.a.getCommandManager();
      CommandMeta var2 = var1.metaBuilder(this.d.aa()).aliases(this.d.c().toArray(new String[h])).build();
      var1.register(var2, this);
   }

   static {
      b();
   }

   private static void b() {
      c = -1797695734084989108L;
      long var0 = c ^ 5236053179007801768L;
      Cipher var2 = Cipher.getInstance(
         new String(
            new byte[]{
               (byte)(58 + 10),
               (byte)(16 + 53),
               (byte)(44 + 39),
               47,
               (byte)(29 + 38),
               (byte)(43 + 23),
               (byte)(33 + 34),
               (byte)(26 + 21),
               (byte)(70 + 10),
               (byte)(60 + 15),
               (byte)(5 + 62),
               (byte)(54 + 29),
               (byte)(33 + 20),
               (byte)(43 + 37),
               (byte)(29 + 68),
               100,
               (byte)(84 + 16),
               (byte)(37 + 68),
               (byte)(45 + 65),
               (byte)(99 + 4)
            },
            StandardCharsets.UTF_8
         )
      );
      SecretKeyFactory var3 = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(38 + 30), 69, (byte)(28 + 55)}, StandardCharsets.UTF_8));
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
               b[0] = χΠξΦιζΨΣωΦσΨζ.B("ðĔþčĶġĔąİİľč", (byte)35, 66);
               b[1] = οΩνΩρωλΨηΛδωδ.E("ԊԮԘԧՐԻԮԟՊՊ\u0558ԧ", (byte)35, 69);
               break;
            case 1:
               b[0] = ςπυηννναΣ.D("҄ѯђҐғ҅ѱѫѵѭҋґҎҖѭѱљҕ҄ќѹҚѱѲ", (byte)35, 68);
               b[1] = μζξτΩσσφυδεπλΨ.B("ĕĜĎļġăĬĴıħĲŇģĊĔăĮĺŋčīőĘę", (byte)35, 66);
               break;
            case 2:
               b[0] = χφπρψπφΦθμπ.D("ҕ҆ѥҗљҋґѧѝҟѝѹҝ҂ќҚѧҘѷҀѨ҄ѱѲ", (byte)35, 68);
            case 3:
            default:
               break;
            case 4:
               b[0] = μζξτΩσσφυδεπλΨ.A("÷īĽøĮĒĢüĺāĜč", (byte)35, 65);
         }
      }
   }

   @Override
   public void X() {
      this.a.getCommandManager().unregister(this.d.aa());
   }

   @Generated
   public ΓφτΠδπτΓΛθΛΦιτς(ProxyServer var1, ιχρΨκεπυξ<?> var2) {
      this.a = var1;
      this.d = var2;
   }

   private static String a(int var0, long var1) {
      var1 ^= 14L;
      var1 ^= 5236053179007801768L;
      if (a[var0] == null) {
         Cipher var3;
         SecretKeyFactory var4;
         try {
            var3 = Cipher.getInstance(
               new String(
                  new byte[]{
                     68,
                     (byte)(60 + 9),
                     (byte)(23 + 60),
                     (byte)(13 + 34),
                     (byte)(20 + 47),
                     (byte)(28 + 38),
                     (byte)(3 + 64),
                     (byte)(16 + 31),
                     (byte)(78 + 2),
                     (byte)(71 + 4),
                     (byte)(57 + 10),
                     (byte)(21 + 62),
                     53,
                     (byte)(53 + 27),
                     (byte)(64 + 33),
                     (byte)(90 + 10),
                     (byte)(8 + 92),
                     (byte)(24 + 81),
                     (byte)(42 + 68),
                     (byte)(32 + 71)
                  },
                  StandardCharsets.UTF_8
               )
            );
            var4 = SecretKeyFactory.getInstance(new String(new byte[]{68, (byte)(58 + 11), 83}, StandardCharsets.UTF_8));
         } catch (Exception var7) {
            throw new RuntimeException(ΠΛΨοδΩσμνΛγΦφβς.C("ԣ\u0530ԯӲԲԮԩԲԽԬӹԷԻԴԷԽӿࡤ࢘\u0897ࡴࢉ\u0896࢛\u086bࡴ\u0892ࡶࢂ\u0896ࢢࢡ", (byte)89, 67));
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

   public void a(Invocation var1) {
      CommandSource var2 = var1.source();
      boolean var3 = var2 instanceof Player;
      String var4 = var3 ? ((Player)var2).getUsername() : c<"㺀">(a, b ^ d);
      this.d.a(var2, var4, var3, var1.alias(), (String[])var1.arguments());
   }
}
