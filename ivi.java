/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class ivi {
    public final String a;
    public final ivh b;
    public final long c;
    public final ivs d;
    public final ivs e;

    public ivi(String string, ivh ivh2, long l2, ivs ivs2) {
        this.a = string;
        a.s((Object)ivh2, "severity");
        this.b = ivh2;
        this.c = l2;
        this.d = null;
        this.e = ivs2;
    }

    public final boolean equals(Object object) {
        if (object instanceof ivi) {
            object = (ivi)object;
            if (a.k(this.a, ((ivi)object).a) && a.k((Object)this.b, (Object)((ivi)object).b) && this.c == ((ivi)object).c) {
                ivs ivs2 = ((ivi)object).d;
                if (a.k(null, null) && a.k(this.e, ((ivi)object).e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, null, this.e});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("description", this.a);
        gtn2.b("severity", (Object)this.b);
        gtn2.f("timestampNanos", this.c);
        gtn2.b("channelRef", null);
        gtn2.b("subchannelRef", this.e);
        return gtn2.toString();
    }
}

