/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class gow {
    public final int[] a;
    public final gou b;
    public gou c;
    public int d;
    public int e;
    public int f;

    public gow(int[] object) {
        this.a = object;
        object = new gou(-1, -1);
        this.b = object;
        this.c = object;
    }

    private final void d(gou gou2, StringBuilder stringBuilder) {
        for (gou gou3 : gou2.d.values()) {
            stringBuilder.append("  ");
            stringBuilder.append(gou2);
            stringBuilder.append(" -> ");
            stringBuilder.append(gou3);
            stringBuilder.append(" [label=\"");
            int[] nArray = this.a;
            int n2 = gou3.a;
            int n3 = gou3.b;
            stringBuilder.append(Arrays.toString(Arrays.copyOfRange(nArray, n2, Math.min(nArray.length, n3 + 1))));
            stringBuilder.append("\"]\n");
            this.d(gou3, stringBuilder);
        }
    }

    final void a() {
        gou gou2 = this.c.c;
        if (gou2 != null) {
            this.c = gou2;
        } else {
            this.c = this.b;
            int n2 = this.e;
            if (n2 > 0) {
                this.e = n2 - 1;
            }
            if (this.f > 0) {
                ++this.d;
            }
        }
        this.b();
    }

    final void b() {
        if (this.e != 0) {
            int n2;
            int n3;
            gou gou2 = (gou)this.c.d.get(this.a[this.d]);
            while ((n3 = gou2.b - gou2.a + 1) <= (n2 = this.e)) {
                int n4;
                this.d = n4 = this.d + n3;
                this.c = gou2;
                this.e = n3 = n2 - n3;
                if (n3 <= 0) continue;
                gou2 = (gou)gou2.d.get(this.a[n4]);
            }
        }
    }

    public final boolean c(int n2, int n3, int n4, int n5) {
        int n6;
        if (n2 >= 0 && n4 >= 0 && (n6 = Math.min(this.a.length, n3)) - n2 == Math.min(this.a.length, n5) - n4) {
            for (n3 = n2; n3 <= n6; ++n3) {
                int[] nArray = this.a;
                if (nArray[n3] == nArray[n4 + n3 - n2]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("digraph {\n");
        this.d(this.b, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

