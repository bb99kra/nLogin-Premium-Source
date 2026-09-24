package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.common.client.WrapperCommonClientSettings;
import lombok.Generated;

public class ΛγψΛεΦγτΩααγοξχ implements θβορΛτηατθΨτΠτΦ {
   private final nLoginBukkit s;

   @Generated
   public ΛγψΛεΦγτΩααγοξχ(nLoginBukkit var1) {
      this.s = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      Object var2 = var1.getPlayer();
      if (var2 != null) {
         ΨαχΨχΣλεΠψΦ var3 = this.s.b().a(var2);
         ιηοψσγξςΩγδ var4 = this.s.a().a().a(var3);
         if (var4 != null) {
            WrapperCommonClientSettings var5 = new WrapperCommonClientSettings(var1);
            εθσξξτΛακπΣ var6 = εθσξξτΛακπΣ.c(var5.getLocale());
            if (var6 != null) {
               var4.a(πβκνλοΛκΠδΦτφλ.i, var6);
            }
         }
      }
   }
}
