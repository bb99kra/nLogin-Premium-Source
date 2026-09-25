/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package com.nickuc.login;

import java.io.DataOutput;
import java.io.IOException;
import lombok.Generated;

public class NLoginCore_126 {
    private final DataOutput a;

    public void d(int n) {
        try {
            this.a.write(n);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Generated
    public NLoginCore_126(DataOutput dataOutput) {
        this.a = dataOutput;
    }

    public void f(int n) {
        try {
            this.a.writeShort(n);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(byte[] byArray) {
        try {
            this.a.write(byArray);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void w(String string) {
        try {
            this.a.writeChars(string);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(byte[] byArray, int n, int n2) {
        try {
            this.a.write(byArray, n, n2);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void x(String string) {
        try {
            this.a.writeUTF(string);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(float f) {
        try {
            this.a.writeFloat(f);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(double d) {
        try {
            this.a.writeDouble(d);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public DataOutput a() {
        return this.a;
    }

    public void e(int n) {
        try {
            this.a.writeByte(n);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void g(int n) {
        try {
            this.a.writeChar(n);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void h(boolean bl) {
        try {
            this.a.writeBoolean(bl);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void v(String string) {
        try {
            this.a.writeBytes(string);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void h(int n) {
        try {
            this.a.writeInt(n);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public void a(long l) {
        try {
            this.a.writeLong(l);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

