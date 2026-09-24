package com.nickuc.login;

import java.util.concurrent.TimeUnit;

public interface εβοςοηΦςψμνςωξΛ {
   default void b(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      κμΨχΩρεφπβ var4 = var3.d(πβκνλοΛκΠδΦτφλ.n);
      if (var4 == null) {
         throw new IllegalStateException(ΣφδσΔζιΠρα.B("ĩŋőŇŅŉńŃŗōŔŔćśŎŝŞŕŜŜďŞŠŦēŠŤŗśŝŝĚšūůĞ", (byte)46, 66) + var2.getName() + ΨφιωσρΓδΔθ.E("ԋ", (byte)46, 69));
      } else {
         εβοςοηΦςψμνςωξΛ var5 = var4.b(var2, var3);
         if (var5 == null) {
            var3.a(πβκνλοΛκΠδΦτφλ.n);
            if (!(this instanceof νζοιεμθΛηξτυωΦθ) && (!(this instanceof ΨψμΛροςζ) || !((ΨψμΛροςζ)this).c(var1))) {
               εδδΠηδξΛΣχ.a(var2, πωιψγηξΓρφυ.ae);
            }
         }

         if (this instanceof ΨψμΛροςζ && !(var5 instanceof ΨψμΛροςζ)) {
            ΨψμΛροςζ var6 = (ΨψμΛροςζ)this;
            if (var6.at()) {
               var3.a(πβκνλοΛκΠδΦτφλ.z);
               var3.a(πβκνλοΛκΠδΦτφλ.A);
               var2.o("");
            }

            if (!var6.c(var1)) {
               var2.ad();
               if (var5 != null) {
                  var3.a(πβκνλοΛκΠδΦτφλ.H, var5);
               }

               var1.b().a().a(var3.a(), var2, var3, var3.d(πβκνλοΛκΠδΦτφλ.s), var3.d(πβκνλοΛκΠδΦτφλ.u));
               return;
            }

            var3.a(οωλθςδυΛβσΨδγπ.d, οωλθςδυΛβσΨδγπ.c);
            var1.b().a().b(var2, var3);
         }

         if (var5 != null) {
            var5.c(var1, var2, var3);
         }
      }
   }

   default void c(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3) {
      this.a(var1, var2, var3, false);
   }

   default void a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, boolean var4) {
      πααΔΣνΨγνθυ var5 = var3.a();
      this.a(var1, var2, var3, var5);
      int var6 = this.a(var4);
      if (var6 > 0) {
         var1.b(true).a(() -> {
            if (var2.R()) {
               if (this.a(var3)) {
                  var5.a(this.a().v(), this.a(var1, var2, var3, var5));
               }
            }
         }, (long)var6, TimeUnit.MILLISECONDS);
      } else {
         var5.a(this.a().v(), this.a(var1, var2, var3, var5));
      }
   }

   boolean a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3);

   ΩγΛξιχγτ a();

   default boolean a(ιηοψσγξςΩγδ var1) {
      κμΨχΩρεφπβ var2 = var1.d(πβκνλοΛκΠδΦτφλ.n);
      return var2 != null && var2.b().a() == this.a();
   }

   αΠαβσΠτΦ[] a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4);

   default void a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4) {
   }

   default void a(ΨγημιδξΓτοθαζ var1, ΨαχΨχΣλεΠψΦ var2, ιηοψσγξςΩγδ var3, πααΔΣνΨγνθυ var4, γοηλιμεπη var5) {
      this.b(var1, var2, var3);
   }

   default int a(boolean var1) {
      return var1 ? 1500 : 0;
   }
}
