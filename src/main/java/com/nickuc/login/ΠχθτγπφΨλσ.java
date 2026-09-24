package com.nickuc.login;

import net.md_5.bungee.protocol.DefinedPacket;

class ΠχθτγπφΨλσ implements κκψασΩψμωΩυθ {
   private static int a = 0 >>> 47 | 0 << ~47 + 1;

   @Override
   public void sendPacket(Object var1, Object... var2) {
      if (ΓκυξρχλγθρςΦ.a(this.a).isConnected()) {
         ΓκυξρχλγθρςΦ.a(this.a).unsafe().sendPacket((DefinedPacket)var1);
         Object[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = a; var5 < var4; var5++) {
            Object var6 = var3[var5];
            ΓκυξρχλγθρςΦ.a(this.a).unsafe().sendPacket((DefinedPacket)var6);
         }
      }
   }

   ΠχθτγπφΨλσ(ΓκυξρχλγθρςΦ var1) {
      this.a = var1;
   }
}
