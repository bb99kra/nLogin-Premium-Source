package com.nickuc.login;

public interface χΛΛβηεδοε extends ρητολεοΔεγ {
   @Override
   default boolean a(ΨγημιδξΓτοθαζ var1) {
      σΔυγκςνΓλξ var2 = var1.a();
      return this.a(var1, var2, var2.a());
   }

   boolean a(ΨγημιδξΓτοθαζ var1, σΔυγκςνΓλξ var2, ΨδΨξξοζεΦεςνδς var3);

   default boolean I() {
      return true;
   }

   @Override
   default void c(ΨγημιδξΓτοθαζ var1) {
      σΔυγκςνΓλξ var2 = var1.a();
      ΨδΨξξοζεΦεςνδς var3 = var2.a();
      if (this.I()) {
         ΨδΨξξοζεΦεςνδς var4 = σΔυγκςνΓλξ.a(var1, var3.a(), true);

         try {
            this.a(var1, var2, var4);
         } finally {
            var4.c();
         }
      } else {
         this.a(var1, var2, var3);
      }
   }

   void a(ΨγημιδξΓτοθαζ var1, σΔυγκςνΓλξ var2, ΨδΨξξοζεΦεςνδς var3);
}
