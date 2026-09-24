package com.nickuc.login;

import com.nickuc.login.lib.packetevents.api.event.PacketReceiveEvent;
import com.nickuc.login.lib.packetevents.api.wrapper.login.client.WrapperLoginClientLoginStart;
import io.netty.channel.Channel;
import java.net.InetAddress;

public class NLoginCore_006 implements NLoginInterface_003 {
   private static int a = Integer.reverse(0);

   @Override
   public void a(PacketReceiveEvent var1) {
      WrapperLoginClientLoginStart var2 = new WrapperLoginClientLoginStart(var1);
      String var3 = var2.getUsername();
      Channel var4 = (Channel)var1.getChannel();
      InetAddress var5 = var1.getSocketAddress().getAddress();
      com.nickuc.login.bukkit.BukkitHelper_001 var6 = new com.nickuc.login.bukkit.BukkitHelper_001(var1.getUser(), null, var3, null, (boolean)a, null, var4, null);
      var4.attr(com.nickuc.login.bukkit.BukkitHelper_001.a).set(var6);
      com.nickuc.login.bukkit.BukkitHelper_001.a(var3, var3, var5, var6);
   }
}
