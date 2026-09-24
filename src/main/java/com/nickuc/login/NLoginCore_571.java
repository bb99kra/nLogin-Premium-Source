package com.nickuc.login;

import net.md_5.bungee.protocol.DefinedPacket;

class NLoginCore_571 implements NLoginInterface_023 {
   private static int a = 0 >>> 47 | 0 << ~47 + 1;

   @Override
   public void sendPacket(Object var1, Object... var2) {
      if (NLoginCore_230.a(this.a).isConnected()) {
         NLoginCore_230.a(this.a).unsafe().sendPacket((DefinedPacket)var1);
         Object[] var3 = var2;
         int var4 = var2.length;

         for (int var5 = a; var5 < var4; var5++) {
            Object var6 = var3[var5];
            NLoginCore_230.a(this.a).unsafe().sendPacket((DefinedPacket)var6);
         }
      }
   }

   NLoginCore_571(NLoginCore_230 var1) {
      this.a = var1;
   }
}
