package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.manager.server.ServerVersion;
import io.netty.channel.Channel;

public class NLoginCore_146 implements NLoginInterface_003 {
   private static int a = Integer.reverse(0);

   public NLoginCore_146(NLoginCore_206 var1) {
      this.c = var1;
   }

   @Override
   public void a(PacketReceiveEvent var1) {
      if (BCryptHashProvider.a() == NLoginCore_175.c) {
         if (!var1.getServerVersion().isOlderThan(ServerVersion.V_1_21_6)) {
            Channel var2 = (Channel)var1.getChannel();
            var2.attr(NLoginCore_096.c).set(new NLoginCore_096(null, (byte)a, null));
         }
      }
   }
}
