package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public interface μΦξβετδμγ {
   οεΦρΓψωΓξγΔι b();

   default boolean b(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2) {
      return this.a(var2, this.a(var1));
   }

   ωΓπκΩβςςδξΔν a();

   @Nullable
   default ServerConnectType a(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2) {
      for (ServerConnectType var6 : ServerConnectType.values()) {
         ηβΨςλδθσΓξ var7 = this.a(var1, var2, var6);
         if (ηβΨςλδθσΓξ.a(var7)) {
            return var6;
         }
      }

      return null;
   }

   @Nullable
   String a(ΨαχΨχΣλεΠψΦ var1);

   default boolean a(ιηοψσγξςΩγδ var1, String var2) {
      if (var2 == null) {
         return false;
      } else {
         return var2.equals(var1.d(πβκνλοΛκΠδΦτφλ.F)) ? true : ΨστμαυςτθΓΔ.a.a(new Object[0]).stream().anyMatch(var1x -> var1x.equalsIgnoreCase(var2));
      }
   }

   ηβΨςλδθσΓξ a(ΨαχΨχΣλεΠψΦ var1, String var2, ServerConnectType var3, @Nullable ΦτχπδσρχΓΨω<Boolean> var4);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   default ηβΨςλδθσΓξ a(ΨαχΨχΣλεΠψΦ var1, ιηοψσγξςΩγδ var2, ServerConnectType var3) {
      switch (ΨμΔβΣΓψυωζδξνυ.T[var3.ordinal()]) {
         case 1:
            if (ΨστμαυςτθΓΔ.g.ar()) {
               στΩξξχκι var15 = var2.a();
               String var17 = var15.a().a(ΣερμΔσατσκ.B("ǋǁǔǖƐǗǊǘǝǍǛ", (byte)112, 66));
               if (var17 != null && !this.a(var2, var17) && this.t(var17) && !ΨστμαυςτθΓΔ.h.a(new Object[0]).contains(var17)) {
                  int var19 = ΨστμαυςτθΓΔ.f.r();
                  ΦτχπδσρχΓΨω var20 = var19 <= 0 ? null : var5x -> {
                     if (!var5x) {
                        this.b().a(() -> this.a(var1, var2, var3), (long)var19);
                     } else {
                        this.a().b().a().a(var1, var2, false);
                     }
                  };
                  return this.a(var1, var17, ServerConnectType.WITH_LAST_SERVER, var20);
               }
            }
            break;
         case 2:
            if (ΨστμαυςτθΓΔ.d.ar()) {
               String var14 = var2.d(πβκνλοΛκΠδΦτφλ.L);
               if (var14 != null && !this.a(var2, var14) && this.t(var14)) {
                  int var16 = ΨστμαυςτθΓΔ.f.r();
                  ΦτχπδσρχΓΨω var18 = var16 <= 0 ? null : var5x -> {
                     if (!var5x) {
                        this.b().a(() -> this.a(var1, var2, var3), (long)var16);
                     } else {
                        this.a().b().a().a(var1, var2, false);
                     }
                  };
                  return this.a(var1, var14, ServerConnectType.WITH_PLATFORM_SERVER, var18);
               }
            }
            break;
         case 3:
            if (!ΨστμαυςτθΓΔ.i.ar()) {
               break;
            }

            List var4 = ΨστμαυςτθΓΔ.j.a(new Object[0]);
            if (var4.isEmpty()) {
               break;
            }

            String var5 = this.a(var1);
            if (var5 != null && var4.stream().anyMatch(var5::equalsIgnoreCase)) {
               break;
            }

            Set var6 = var2.d(πβκνλοΛκΠδΦτφλ.K);
            Object var7;
            if (var6 != null) {
               ArrayList var8 = new ArrayList(var4);
               synchronized (var6) {
                  var8.removeIf(var6::contains);
               }

               if (var8.isEmpty()) {
                  var7 = var4;
                  var2.a(πβκνλοΛκΠδΦτφλ.K);
                  var6 = null;
               } else {
                  var7 = var8;
               }
            } else {
               var7 = var4;
            }

            String var21 = (String)var7.get(ιχωυζπψημωΔτΦθ.a().nextInt(var7.size()));
            if (var6 != null) {
               synchronized (var6) {
                  var6.add(var21);
               }
            }

            int var9 = ΨστμαυςτθΓΔ.f.r();
            ΦτχπδσρχΓΨω var10 = var9 <= 0 ? null : var7x -> {
               if (!var7x) {
                  this.b().a(() -> {
                     if (var4.size() > 1 && !var2.a(πβκνλοΛκΠδΦτφλ.K)) {
                        HashSet var6xx = new HashSet();
                        var6xx.add(var21);
                        var2.a(πβκνλοΛκΠδΦτφλ.K, var6xx);
                     }

                     this.a(var1, var2, var3);
                  }, (long)var9);
               } else {
                  this.a().b().a().a(var1, var2, false);
               }
            };
            return this.a(var1, var21, ServerConnectType.WITH_CONFIGURED_SERVER, var10);
         default:
            throw new IllegalArgumentException(ςΦζσμτΓσ.B("ƴǎǔǗǓǔǔǘǛǍǍƊǞǑǟǤǔǢƑǕǢǢǣǛǚǬƙǮǴǬǢƟƟ", (byte)112, 66) + var3);
      }

      return ηβΨςλδθσΓξ.d;
   }

   boolean t(String var1);

   ΨγημιδξΓτοθαζ a();

   boolean a(ΨαχΨχΣλεΠψΦ var1);
}
