/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.CheckReturnValue
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_366;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import javax.annotation.CheckReturnValue;

public class NLoginCore_294 {
    private static int d;
    private static int e;
    private static int l;
    private static int c;
    private static int b;
    private static int k;
    private static int g;
    private static int a;
    private static int j;
    private static int i;
    private static int h;
    private static int f;

    static {
        a = (4 >>> 66 | 4 << -66) & 0xFFFFFFFF;
        b = 0 >>> 195 | 0 << ~195 + 1;
        c = (0 >>> 103 | 0 << ~103 + 1) & 0xFFFFFFFF;
        d = Integer.reverse(0);
        e = (128 >>> 135 | 128 << ~135 + 1) & 0xFFFFFFFF;
        f = Integer.reverse(0);
        g = (0 >>> 172 | 0 << ~172 + 1) & 0xFFFFFFFF;
        h = 0x100000 >>> 244 | 0x100000 << ~244 + 1;
        i = Integer.reverse(0);
        j = Integer.reverse(Integer.MIN_VALUE);
        k = Integer.reverse(0);
        l = 0 >>> 194 | 0 << ~194 + 1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(File file, Charset charset, String ... stringArray) {
        if (stringArray.length == 0) {
            return f != 0;
        }
        if (!NLoginCore_366.b(file)) {
            return g != 0;
        }
        PrintWriter printWriter = NLoginCore_294.a(file, charset, h != 0);
        try {
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            for (int i = NLoginCore_294.i; i < n; ++i) {
                String string = stringArray2[i];
                if (string.isEmpty()) {
                    printWriter.println();
                    continue;
                }
                printWriter.println(string);
            }
            printWriter.flush();
            boolean bl = j;
            return bl;
        }
        finally {
            if (Collections.singletonList(printWriter).get(k) != null) {
                printWriter.close();
            }
        }
    }

    @CheckReturnValue
    public static PrintWriter a(File file, Charset charset, boolean bl) {
        return new PrintWriter((Writer)new BufferedWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(file, e != 0), charset)), bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(File file, byte[] byArray) {
        if (NLoginCore_366.b(file)) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            try {
                NLoginCore_366.a(byteArrayInputStream, file);
                boolean bl = a;
                return bl;
            }
            finally {
                if (Collections.singletonList(byteArrayInputStream).get(b) != null) {
                    ((InputStream)byteArrayInputStream).close();
                }
            }
        }
        return d != 0;
    }

    public static boolean a(File file, String ... stringArray) {
        return NLoginCore_294.a(file, StandardCharsets.UTF_8, stringArray);
    }
}

