/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class ixd {
    public final iyh a;
    public final Object b;

    public ixd(iyh iyh2) {
        this.b = null;
        this.a = iyh2;
        fxf.v(iyh2.g() ^ true, "cannot use OK status: %s", iyh2);
    }

    public ixd(Object object) {
        this.b = object;
        this.a = null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (ixd)object;
            if (a.k(this.a, ((ixd)object).a) && a.k(this.b, ((ixd)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            gtn gtn2 = fxf.R(this);
            gtn2.b("config", this.b);
            return gtn2.toString();
        }
        gtn gtn3 = fxf.R(this);
        gtn3.b("error", this.a);
        return gtn3.toString();
    }
}

