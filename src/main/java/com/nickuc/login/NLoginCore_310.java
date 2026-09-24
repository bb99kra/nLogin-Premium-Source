package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import lombok.Generated;

public class NLoginCore_310 implements NLoginInterface_003 {
   private final NLoginType_008 x;

   @Generated
   public NLoginCore_310(NLoginType_008 var1) {
      this.x = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      Object var2 = var1.getPlayer();
      if (var2 != null) {
         NLoginCore_277 var3 = this.x.b().a(var2);
         NLoginCore_509 var4 = this.x.a().a(var3);
         if (var4 != null) {
            var4.a(NLoginCore_567.h, System.currentTimeMillis());
         }
      }
   }
}
