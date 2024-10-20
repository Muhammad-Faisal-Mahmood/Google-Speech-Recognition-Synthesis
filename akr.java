/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.LogSessionId
 */
import android.media.metrics.LogSessionId;
import j$.util.Objects;

public final class akr {
    public final String a;
    public final akq b;
    private final Object c;

    static {
        if (agf.a < 31) {
            new akr();
        } else {
            int n2 = akq.b;
        }
    }

    public akr() {
        boolean bl2 = agf.a < 31;
        abr.f(bl2);
        this.a = "";
        this.b = null;
        this.c = new Object();
    }

    public akr(LogSessionId object) {
        object = new akq((LogSessionId)object);
        this.b = object;
        this.a = "";
        this.c = new Object();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof akr)) {
            return false;
        }
        object = (akr)object;
        return Objects.equals(this.a, ((akr)object).a) && Objects.equals(this.b, ((akr)object).b) && Objects.equals(this.c, ((akr)object).c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}

