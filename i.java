/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Objects;

public final class i {
    public final ArrayList a = new ArrayList();

    public final void a(j j2) {
        int n2;
        k k2;
        int n3;
        this.a.clear();
        for (n3 = 1; n3 < j2.e; ++n3) {
            k2 = ((k[])j2.g.a)[n3];
            for (n2 = 0; n2 < 6; ++n2) {
                k2.e[n2] = 0.0f;
            }
            k2.e[k2.c] = 1.0f;
            if (k2.h != 4) continue;
            this.a.add(k2);
        }
        int n4 = this.a.size();
        for (n3 = 0; n3 < n4; ++n3) {
            k2 = (k)this.a.get(n3);
            n2 = k2.b;
            if (n2 == -1) continue;
            g g2 = j2.c[n2].d;
            int n5 = g2.a;
            for (n2 = 0; n2 < n5; ++n2) {
                k k3 = g2.d(n2);
                if (k3 == null) continue;
                float f2 = g2.b(n2);
                for (int i2 = 0; i2 < 6; ++i2) {
                    float[] fArray = k3.e;
                    fArray[i2] = fArray[i2] + k2.e[i2] * f2;
                }
                if (this.a.contains(k3)) continue;
                this.a.add(k3);
            }
            for (n2 = 0; n2 < 6; ++n2) {
                k2.e[n2] = 0.0f;
            }
        }
    }

    public final String toString() {
        int n2 = this.a.size();
        String string = "Goal: ";
        for (int i2 = 0; i2 < n2; ++i2) {
            k k2 = (k)this.a.get(i2);
            Objects.toString(k2);
            Object object = "null[";
            int n3 = 0;
            while (true) {
                Object object2 = k2.e;
                if (n3 >= 6) break;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(k2.e[n3]);
                object2 = ((StringBuilder)object2).toString();
                object = k2.e;
                object = n3 < 5 ? ", " : "] ";
                object = ((String)object2).concat((String)object);
                ++n3;
            }
            string = string.concat((String)object);
        }
        return string;
    }
}

