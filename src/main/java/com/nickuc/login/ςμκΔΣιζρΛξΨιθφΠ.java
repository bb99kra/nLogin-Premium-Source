package com.nickuc.login;

import org.bukkit.entity.Player;

public interface ςμκΔΣιζρΛξΨιθφΠ {
   void send(Player var1, String var2);

   static ςμκΔΣιζρΛξΨιθφΠ a() {
      return ηιχχΩωξγψιδζα.a();
   }

   default void a(Player var1) {
      this.send(var1, "");
   }
}
