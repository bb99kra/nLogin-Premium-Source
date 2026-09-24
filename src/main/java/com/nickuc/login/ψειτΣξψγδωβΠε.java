package com.nickuc.login;

import java.io.DataOutput;
import java.io.IOException;
import lombok.Generated;

public class ψειτΣξψγδωβΠε {
   private final DataOutput a;

   public void d(int var1) {
      try {
         this.a.write(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   @Generated
   public ψειτΣξψγδωβΠε(DataOutput var1) {
      this.a = var1;
   }

   public void f(int var1) {
      try {
         this.a.writeShort(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void a(byte[] var1) {
      try {
         this.a.write(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void w(String var1) {
      try {
         this.a.writeChars(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void a(byte[] var1, int var2, int var3) {
      try {
         this.a.write(var1, var2, var3);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }

   public void x(String var1) {
      try {
         this.a.writeUTF(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void a(float var1) {
      try {
         this.a.writeFloat(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void a(double var1) {
      try {
         this.a.writeDouble(var1);
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }
   }

   public DataOutput a() {
      return this.a;
   }

   public void e(int var1) {
      try {
         this.a.writeByte(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void g(int var1) {
      try {
         this.a.writeChar(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void h(boolean var1) {
      try {
         this.a.writeBoolean(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void v(String var1) {
      try {
         this.a.writeBytes(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void h(int var1) {
      try {
         this.a.writeInt(var1);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public void a(long var1) {
      try {
         this.a.writeLong(var1);
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }
   }
}
