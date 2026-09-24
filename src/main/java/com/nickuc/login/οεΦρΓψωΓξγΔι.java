package com.nickuc.login;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public interface οεΦρΓψωΓξγΔι {
   απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1, long var2, TimeUnit var4);

   απνηβηψθσΣγοξ a(Runnable var1, long var2, TimeUnit var4);

   default Collection<απνηβηψθσΣγοξ> f() {
      return this.a().e();
   }

   απνηβηψθσΣγοξ a(Runnable var1, long var2, long var4, TimeUnit var6);

   απνηβηψθσΣγοξ a(Runnable var1);

   απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1, long var2, long var4, TimeUnit var6);

   απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1);

   default απνηβηψθσΣγοξ a(Runnable var1, long var2, long var4) {
      return this.a(var1, var2, var4, TimeUnit.MILLISECONDS);
   }

   θυυΔΓΨνεπς a();

   default απνηβηψθσΣγοξ a(Runnable var1, long var2) {
      return this.a(var1, var2, TimeUnit.MILLISECONDS);
   }

   void Y();

   default boolean a(int var1, TimeUnit var2) {
      return this.a().a(var1, var2);
   }

   default απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1, long var2, long var4) {
      return this.a(var1, var2, var4, TimeUnit.MILLISECONDS);
   }

   default απνηβηψθσΣγοξ a(Consumer<απνηβηψθσΣγοξ> var1, long var2) {
      return this.a(var1, var2, TimeUnit.MILLISECONDS);
   }
}
