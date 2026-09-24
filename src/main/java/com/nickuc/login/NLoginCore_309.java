package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;

public class NLoginCore_309 implements NLoginInterface_043 {
   @Override
   public void a(PacketSendEvent var1) {
      if (!NLoginCore_349.a(this.c)) {
         PacketWrapper var2 = new PacketWrapper(var1);
         int var3 = var2.readContainerId();
         NLoginCore_349.a(this.c, var1, var3);
      }
   }

   public NLoginCore_309(NLoginCore_349 var1) {
      this.c = var1;
   }
}
