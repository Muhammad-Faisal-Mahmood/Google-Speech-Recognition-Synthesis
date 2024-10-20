/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import java.util.Arrays;

public final class L {
    private final String a;
    private final String b;
    private final String c;
    private String[] d;
    private int e;
    private int f;

    public L(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.a = "";
        this.b = charSequence.toString();
        this.c = "";
    }

    private void b() {
        if (this.e > 1) {
            int n2;
            char[] cArray = new char[this.f];
            int n3 = L.c(this.d[0], cArray, 0);
            int n4 = 1;
            do {
                n3 += L.c(this.b, cArray, n3);
                n3 += L.c(this.d[n4], cArray, n3);
                String[] stringArray = this.d;
                stringArray[n4] = null;
                n4 = n2 = n4 + 1;
            } while (n2 < this.e);
            this.e = 1;
            stringArray[0] = new String(cArray);
        }
    }

    private static int c(String string, char[] cArray, int n2) {
        int n3 = string.length();
        string.getChars(0, n3, cArray, n2);
        return n3;
    }

    public final void a(CharSequence charSequence) {
        int n2;
        charSequence = String.valueOf(charSequence);
        String[] stringArray = this.d;
        if (stringArray == null) {
            this.d = new String[8];
        } else {
            n2 = this.e;
            if (n2 == stringArray.length) {
                this.d = Arrays.copyOf(stringArray, n2 * 2);
            }
            n2 = this.f;
            this.f = this.b.length() + n2;
        }
        n2 = this.f;
        this.f = ((String)charSequence).length() + n2;
        stringArray = this.d;
        n2 = this.e;
        this.e = n2 + 1;
        stringArray[n2] = charSequence;
    }

    public final void d(L l2) {
        Objects.requireNonNull(l2);
        if (l2.d == null) {
            return;
        }
        l2.b();
        this.a(l2.d[0]);
    }

    public final String toString() {
        Object object = this.d;
        int n2 = this.e;
        String string = this.a;
        int n3 = string.length();
        String string2 = this.c;
        n3 = string2.length() + n3;
        if (n3 == 0) {
            this.b();
            object = n2 == 0 ? "" : object[0];
            return object;
        }
        char[] cArray = new char[this.f + n3];
        int n4 = n3 = L.c(string, cArray, 0);
        if (n2 > 0) {
            n3 += L.c(object[0], cArray, n3);
            int n5 = 1;
            while (true) {
                n4 = n3;
                if (n5 >= n2) break;
                n3 += L.c(this.b, cArray, n3);
                n3 += L.c(object[n5], cArray, n3);
                ++n5;
            }
        }
        L.c(string2, cArray, n4);
        return new String(cArray);
    }
}

