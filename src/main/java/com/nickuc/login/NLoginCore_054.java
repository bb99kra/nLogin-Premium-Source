package com.nickuc.login;

import com.nickuc.login.bukkit.nLoginBukkit;
import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.common.client.WrapperCommonClientSettings;
import lombok.Generated;

public class NLoginCore_054 implements NLoginInterface_003 {
   private final nLoginBukkit s;

   @Generated
   public NLoginCore_054(nLoginBukkit var1) {
      this.s = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      Object var2 = var1.getPlayer();
      if (var2 != null) {
         NLoginCore_277 var3 = this.s.b().a(var2);
         NLoginCore_509 var4 = this.s.a().a().a(var3);
         if (var4 != null) {
            WrapperCommonClientSettings var5 = new WrapperCommonClientSettings(var1);
            NLoginCore_055 var6 = NLoginCore_055.c(var5.getLocale());
            if (var6 != null) {
               var4.a(NLoginCore_567.i, var6);
            }
         }
      }
   }
}
