/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class hcr
extends hjy
implements Serializable,
gtq {
    public static final hcr a = new hcr(gyy.a, gyw.a);
    private static final long serialVersionUID = 0L;
    public final gyz b;
    public final gyz c;

    public hcr(gyz gyz2, gyz gyz3) {
        this.b = gyz2;
        this.c = gyz3;
        if (gyz2 != gyw.a && gyz3 != gyy.a) {
            return;
        }
        throw new IllegalArgumentException("Invalid range: ".concat("(-\u221e..+\u221e)"));
    }

    @Override
    @Deprecated
    public final /* synthetic */ boolean a(Object object) {
        fxf.K((Comparable)object);
        return true;
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    public final boolean equals(Object object) {
        if (object instanceof hcr) {
            object = (hcr)object;
            if (this.b.equals(((hcr)object).b) && this.c.equals(((hcr)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b) * 31 + System.identityHashCode(this.c);
    }

    Object readResolve() {
        hcr hcr2 = a;
        if (this.equals(hcr2)) {
            return hcr2;
        }
        return this;
    }

    public final String toString() {
        return "(-\u221e..+\u221e)";
    }
}

