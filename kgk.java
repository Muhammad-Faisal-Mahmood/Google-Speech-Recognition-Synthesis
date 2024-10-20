/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Iterator;

public final class kgk
implements Iterable,
jsm {
    private final String[] a;

    public kgk(String[] stringArray) {
        this.a = stringArray;
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(String string) {
        String string2;
        String[] stringArray = this.a;
        int n2 = stringArray.length - 2;
        int n3 = jsd.g(n2, 0, -2);
        String string3 = string2 = null;
        if (n3 <= n2) {
            while (true) {
                if (jse.H(string, stringArray[n2])) {
                    string3 = stringArray[n2 + 1];
                    break;
                }
                string3 = string2;
                if (n2 == n3) break;
                n2 -= 2;
            }
        }
        return string3;
    }

    public final String c(int n2) {
        return this.a[n2 + n2];
    }

    public final String d(int n2) {
        return this.a[n2 + n2 + 1];
    }

    public final bzo e() {
        bzo bzo2 = new bzo(null, null, null);
        Object object = bzo2.a;
        Object[] objectArray = this.a;
        jse.e(objectArray, "elements");
        object.addAll(jns.L(objectArray));
        return bzo2;
    }

    public final boolean equals(Object object) {
        return object instanceof kgk && Arrays.equals(this.a, ((kgk)object).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final Iterator iterator() {
        int n2 = this.a();
        Object[] objectArray = new joc[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            objectArray[i2] = new joc(this.c(i2), this.d(i2));
        }
        return jsd.b(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = this.c(i2);
            String string2 = this.d(i2);
            stringBuilder.append(string);
            stringBuilder.append(": ");
            if (khb.w(string)) {
                string2 = "\u2588\u2588";
            }
            stringBuilder.append(string2);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

