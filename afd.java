/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class afd {
    public static final afd a;
    public final gzx b;

    static {
        int n2 = gzx.d;
        a = new afd(hct.a);
        agf.z(0);
    }

    public afd(List list) {
        this.b = gzx.o(list);
    }

    public final boolean a(int n2) {
        block0: for (int i2 = 0; i2 < this.b.size(); ++i2) {
            afc afc2 = (afc)this.b.get(i2);
            boolean[] blArray = afc2.c;
            int n3 = blArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                if (!blArray[i3]) continue;
                if (afc2.b.c != n2) continue block0;
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (afd)object;
            return fvd.z(this.b, ((afd)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

