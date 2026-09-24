package com.nickuc.login;

import com.nickuc.login.api.enums.event.CommandType;
import com.nickuc.login.api.enums.event.EventEnum;
import com.nickuc.login.api.event.internal.CancellableEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public abstract class εκΓγΣΔφυεΛΩρ extends ιχρΨκεπυξ<ΨγημιδξΓτοθαζ> {
   private static int ac = Integer.reverse(0);
   private static int au = Integer.reverse(0);
   private static int h = Integer.reverse(0);
   private static int ao = Integer.reverse(1073741824);
   private static int as = Integer.reverse(Integer.MIN_VALUE);
   private static int at = (1 >>> 96 | 1 << ~96 + 1) & -1;
   private static int v = Integer.reverse(Integer.MIN_VALUE);
   private static int ab = Integer.reverse(Integer.MIN_VALUE);
   private static int t = Integer.reverse(1073741824);
   private static int ap = Integer.reverse(-1073741824);
   protected final ηισξπαΠχΩ a;
   private static int b = (0 >>> 104 | 0 << -104) & -1;
   private static int s = Integer.reverse(1073741824);
   private static int ai = (0 >>> 136 | 0 << ~136 + 1) & -1;
   private static int ar = Integer.reverse(0);
   private static int ah = ('耀' >>> 237 | 32768 << -237) & -1;
   private static int k = Integer.reverse(0);
   private static int af = Integer.reverse(0);
   private static int ak = (16777216 >>> 56 | 16777216 << ~56 + 1) & -1;
   private static int aq = 1073741824 >>> 62 | 1073741824 << -62;
   private static int p = Integer.reverse(Integer.MIN_VALUE);
   private static long a = Long.reverse(2562548187973812224L);

   public εκΓγΣΔφυεΛΩρ(ηισξπαΠχΩ var1) {
      super(var1.e());
      this.a = var1;
   }

   protected abstract void a(θΦγνΩερριδκ var1, String var2, String[] var3);

   @Override
   protected final void b(θΦγνΩερριδκ var1, String var2, String[] var3) {
      if (var1 instanceof ΨαχΨχΣλεΠψΦ) {
         ΨαχΨχΣλεΠψΦ var4 = (ΨαχΨχΣλεΠψΦ)var1;
         εσλρΔμΔψχεθυνΔ var5 = this.a.a();
         ιηοψσγξςΩγδ var6 = var5.b(var4);
         Long var7 = var6.a(πβκνλοΛκΠδΦτφλ.k);
         if (var7 == null || System.currentTimeMillis() - var7 > a) {
            return;
         }

         String[] var8 = var6.a(πβκνλοΛκΠδΦτφλ.j);
         if (var8 != null) {
            var3 = var8;
         }

         οωλθςδυΛβσΨδγπ var9 = var6.a();
         if (var9.c(οωλθςδυΛβσΨδγπ.c) || (var9 == οωλθςδυΛβσΨδγπ.c || var9 == οωλθςδυΛβσΨδγπ.f) && !this.a.m()) {
            return;
         }

         if (!super.a(var1, var2, var3, (boolean)b)) {
            εδδΠηδξΛΣχ.a(var1, πωιψγηξΓρφυ.y);
            return;
         }

         CommandType var10 = null;
         int var11 = k;
         if (this instanceof ςλενφεΨΛνγεΦΦο) {
            var10 = CommandType.LOGIN;
            var11 = p;
         } else if (this instanceof ΩιιφΔβχυ) {
            var10 = CommandType.REGISTER;
            var11 = s;
         } else if (this instanceof εγωπΨπεοξΠυ) {
            var10 = CommandType.CHANGE_PASSWORD;
            var11 = t;
         } else if (this instanceof ΓαφθλΔΔζρΔγβθΦ) {
            var10 = CommandType.UNREGISTER;
            var11 = v;
         }

         int var12 = var9 != οωλθςδυΛβσΨδγπ.f && !this.a.l() && !var5.b(var4) ? ab : ac;
         if (var10 != null) {
            String[] var13 = var3.length <= var11 ? new String[af] : Arrays.copyOfRange(var3, var11, var3.length);
            ΨγημιδξΓτοθαζ var10000 = this.a;
            EventEnum var10001 = EventEnum.PRE_COMMAND_EXECUTE;
            Object[] var10002 = new Object[ah];
            var10002[ai] = var4;
            var10002[ak] = var10;
            var10002[ao] = var2;
            var10002[ap] = var13;
            CancellableEvent var14 = var10000.a(var10001, var10002);
            var14.setCancelled((boolean)var12);
            var12 = !this.a.callEvent(var14) ? aq : ar;
         }

         if (var12 != 0) {
            return;
         }
      }

      this.a(var1, var2.toLowerCase(Locale.ENGLISH), var3);
   }

   @Override
   protected final List<String> a(θΦγνΩερριδκ var1, String var2, String[] var3) {
      return this.b(var1, var2, var3);
   }

   @Override
   protected boolean a(θΦγνΩερριδκ var1, String var2, String[] var3, boolean var4) {
      return (boolean)(var4 && !super.a(var1, var2, var3, (boolean)as) ? au : at);
   }

   protected List<String> b(θΦγνΩερριδκ var1, String var2, String[] var3) {
      return null;
   }
}
