/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class iwb {
    public static final iwb a = new iwb(null, iyh.b, false);
    public final iwe b;
    public final iyh c;
    public final boolean d;
    private final fvc e;

    public iwb(iwe iwe2, iyh iyh2, boolean bl2) {
        this.b = iwe2;
        this.e = null;
        a.s(iyh2, "status");
        this.c = iyh2;
        this.d = bl2;
    }

    public static iwb a(iyh iyh2) {
        fxf.r(iyh2.g() ^ true, "error status shouldn't be OK");
        return new iwb(null, iyh2, false);
    }

    public static iwb b(iwe iwe2) {
        return new iwb(iwe2, iyh.b, false);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof iwb)) {
            return false;
        }
        object = (iwb)object;
        if (a.k(this.b, ((iwb)object).b) && a.k(this.c, ((iwb)object).c)) {
            fvc fvc2 = ((iwb)object).e;
            if (a.k(null, null) && this.d == ((iwb)object).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, this.d});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("subchannel", this.b);
        gtn2.b("streamTracerFactory", null);
        gtn2.b("status", this.c);
        gtn2.g("drop", this.d);
        return gtn2.toString();
    }
}

