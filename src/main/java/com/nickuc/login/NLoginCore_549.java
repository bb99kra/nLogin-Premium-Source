/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.nickuc.login;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public class NLoginCore_549
implements Closeable {
    private InputStreamReader var_java_io_InputStreamReader_a;
    private BufferedReader var_java_io_BufferedReader_a;
    private InputStream var_java_io_InputStream_a;

    @Nullable
    public String ah() {
        return this.var_java_io_BufferedReader_a.readLine();
    }

    @Override
    public void close() {
        if (this.var_java_io_BufferedReader_a != null) {
            this.var_java_io_BufferedReader_a.close();
            this.var_java_io_BufferedReader_a = null;
        }
        if (this.var_java_io_InputStreamReader_a != null) {
            this.var_java_io_InputStreamReader_a.close();
            this.var_java_io_InputStreamReader_a = null;
        }
        if (this.var_java_io_InputStream_a != null) {
            this.var_java_io_InputStream_a.close();
            this.var_java_io_InputStream_a = null;
        }
    }

    NLoginCore_549(InputStream inputStream, Charset charset) {
        this.var_java_io_InputStream_a = inputStream;
        this.var_java_io_InputStreamReader_a = new InputStreamReader(inputStream, charset);
        this.var_java_io_BufferedReader_a = new BufferedReader(this.var_java_io_InputStreamReader_a);
    }
}

