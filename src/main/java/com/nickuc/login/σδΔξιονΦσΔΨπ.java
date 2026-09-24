package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.manager.server.ServerVersion;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;

public class σδΔξιονΦσΔΨπ implements μθοδηοΠνΦΛνξΛ {
   @Override
   public void a(PacketSendEvent var1) {
      if (!ΛΠωσρζυχη.a(this.b)) {
         PacketWrapper var2 = new PacketWrapper(var1);
         int var3 = var2.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_2) ? var2.readContainerId() : var2.readByte();
         ΛΠωσρζυχη.a(this.b, var1, var3);
      }
   }

   public σδΔξιονΦσΔΨπ(ΛΠωσρζυχη var1) {
      this.b = var1;
   }
}
