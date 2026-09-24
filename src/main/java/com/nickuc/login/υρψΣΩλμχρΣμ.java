package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketSendEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.PacketWrapper;

public class υρψΣΩλμχρΣμ implements μθοδηοΠνΦΛνξΛ {
   @Override
   public void a(PacketSendEvent var1) {
      if (!ΛΠωσρζυχη.a(this.c)) {
         PacketWrapper var2 = new PacketWrapper(var1);
         int var3 = var2.readContainerId();
         ΛΠωσρζυχη.a(this.c, var1, var3);
      }
   }

   public υρψΣΩλμχρΣμ(ΛΠωσρζυχη var1) {
      this.c = var1;
   }
}
