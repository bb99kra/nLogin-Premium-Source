package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import lombok.Generated;

public class ΛεσΨΛδωμς implements θβορΛτηατθΨτΠτΦ {
   private final ΨγημιδξΓτοθαζ x;

   @Generated
   public ΛεσΨΛδωμς(ΨγημιδξΓτοθαζ var1) {
      this.x = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      Object var2 = var1.getPlayer();
      if (var2 != null) {
         ΨαχΨχΣλεΠψΦ var3 = this.x.b().a(var2);
         ιηοψσγξςΩγδ var4 = this.x.a().a(var3);
         if (var4 != null) {
            var4.a(πβκνλοΛκΠδΦτφλ.h, System.currentTimeMillis());
         }
      }
   }
}
