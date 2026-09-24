package com.nickuc.login;

import com.nickuc.login.api.enums.ServerConnectType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public interface NLoginType_010 {
   NLoginInterface_022 b();

   default boolean b(NLoginCore_277 var1, NLoginCore_509 var2) {
      return this.a(var2, this.a(var1));
   }

   NLoginCore_199 a();

   @Nullable
   default ServerConnectType a(NLoginCore_277 var1, NLoginCore_509 var2) {
      for (ServerConnectType var6 : ServerConnectType.values()) {
         NLoginCore_443 var7 = this.a(var1, var2, var6);
         if (NLoginCore_443.a(var7)) {
            return var6;
         }
      }

      return null;
   }

   @Nullable
   String a(NLoginCore_277 var1);

   default boolean a(NLoginCore_509 var1, String var2) {
      if (var2 == null) {
         return false;
      } else {
         return var2.equals(var1.d(NLoginCore_567.F)) ? true : NLoginCore_532.a.a(new Object[0]).stream().anyMatch(var1x -> var1x.equalsIgnoreCase(var2));
      }
   }

   NLoginCore_443 a(NLoginCore_277 var1, String var2, ServerConnectType var3, @Nullable NLoginInterface_041<Boolean> var4);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   default NLoginCore_443 a(NLoginCore_277 var1, NLoginCore_509 var2, ServerConnectType var3) {
      switch (NLoginType_033.T[var3.ordinal()]) {
         case 1:
            if (NLoginCore_532.g.ar()) {
               ForceRegisterConfig var15 = var2.a();
               String var17 = var15.a().a(NLoginCore_241.B("ǋǁǔǖƐǗǊǘǝǍǛ", (byte)112, 66));
               if (var17 != null && !this.a(var2, var17) && this.t(var17) && !NLoginCore_532.h.a(new Object[0]).contains(var17)) {
                  int var19 = NLoginCore_532.f.r();
                  NLoginInterface_041 var20 = var19 <= 0 ? null : var5x -> {
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
            if (NLoginCore_532.d.ar()) {
               String var14 = var2.d(NLoginCore_567.L);
               if (var14 != null && !this.a(var2, var14) && this.t(var14)) {
                  int var16 = NLoginCore_532.f.r();
                  NLoginInterface_041 var18 = var16 <= 0 ? null : var5x -> {
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
            if (!NLoginCore_532.i.ar()) {
               break;
            }

            List var4 = NLoginCore_532.j.a(new Object[0]);
            if (var4.isEmpty()) {
               break;
            }

            String var5 = this.a(var1);
            if (var5 != null && var4.stream().anyMatch(var5::equalsIgnoreCase)) {
               break;
            }

            Set var6 = var2.d(NLoginCore_567.K);
            Object var7;
            if (var6 != null) {
               ArrayList var8 = new ArrayList(var4);
               synchronized (var6) {
                  var8.removeIf(var6::contains);
               }

               if (var8.isEmpty()) {
                  var7 = var4;
                  var2.a(NLoginCore_567.K);
                  var6 = null;
               } else {
                  var7 = var8;
               }
            } else {
               var7 = var4;
            }

            String var21 = (String)var7.get(NLoginCore_354.a().nextInt(var7.size()));
            if (var6 != null) {
               synchronized (var6) {
                  var6.add(var21);
               }
            }

            int var9 = NLoginCore_532.f.r();
            NLoginInterface_041 var10 = var9 <= 0 ? null : var7x -> {
               if (!var7x) {
                  this.b().a(() -> {
                     if (var4.size() > 1 && !var2.a(NLoginCore_567.K)) {
                        HashSet var6xx = new HashSet();
                        var6xx.add(var21);
                        var2.a(NLoginCore_567.K, var6xx);
                     }

                     this.a(var1, var2, var3);
                  }, (long)var9);
               } else {
                  this.a().b().a().a(var1, var2, false);
               }
            };
            return this.a(var1, var21, ServerConnectType.WITH_CONFIGURED_SERVER, var10);
         default:
            throw new IllegalArgumentException(NLoginCore_324.B("ƴǎǔǗǓǔǔǘǛǍǍƊǞǑǟǤǔǢƑǕǢǢǣǛǚǬƙǮǴǬǢƟƟ", (byte)112, 66) + var3);
      }

      return NLoginCore_443.d;
   }

   boolean t(String var1);

   NLoginType_008 a();

   boolean a(NLoginCore_277 var1);
}
