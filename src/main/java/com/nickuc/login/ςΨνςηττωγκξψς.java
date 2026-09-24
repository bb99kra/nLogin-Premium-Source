package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.manager.server.ServerVersion;
import io.netty.channel.Channel;

public class ςΨνςηττωγκξψς implements θβορΛτηατθΨτΠτΦ {
   private static int a = Integer.reverse(0);

   public ςΨνςηττωγκξψς(αλμΣΩτψφγζηθξψ var1) {
      this.c = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      if (βδΔφμπθθγ.a() == ΠβππΓωΛΦυβΩμΔ.c) {
         if (!var1.getServerVersion().isOlderThan(ServerVersion.V_1_21_6)) {
            Channel var2 = (Channel)var1.getChannel();
            var2.attr(ωΩμΩχδοωδΔΠΔδ.c).set(new ωΩμΩχδοωδΔΠΔδ(null, (byte)a, null));
         }
      }
   }
}
