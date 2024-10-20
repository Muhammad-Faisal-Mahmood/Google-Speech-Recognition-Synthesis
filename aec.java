/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.Objects;
import java.util.List;

public final class aec {
    public final Uri a;
    public final String b;
    public final aea c;
    public final adx d;
    public final List e;
    public final String f;
    public final gzx g;
    public final Object h;
    public final long i;

    static {
        yi.d();
    }

    public aec(Uri object, List list, gzx gzx2) {
        this.a = object;
        object = ael.a;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = list;
        this.f = null;
        this.g = gzx2;
        object = new gzs();
        if (((hct)gzx2).c <= 0) {
            ((gzs)object).g();
            this.h = null;
            this.i = -9223372036854775807L;
            return;
        }
        object = (aee)gzx2.get(0);
        throw null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aec)) {
            return false;
        }
        object = (aec)object;
        if (this.a.equals((Object)((aec)object).a)) {
            Object object2 = ((aec)object).b;
            if (Objects.equals(null, null)) {
                object2 = ((aec)object).c;
                if (Objects.equals(null, null)) {
                    object2 = ((aec)object).d;
                    if (Objects.equals(null, null) && this.e.equals(((aec)object).e)) {
                        object2 = ((aec)object).f;
                        if (Objects.equals(null, null) && fvd.z(this.g, ((aec)object).g)) {
                            object2 = ((aec)object).h;
                            if (Objects.equals(null, null)) {
                                object2 = -9223372036854775807L;
                                long l2 = ((aec)object).i;
                                if (Objects.equals(object2, object2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int)((long)(((this.a.hashCode() * 923521 + this.e.hashCode()) * 961 + this.g.hashCode()) * 31) * 31L - Long.MAX_VALUE);
    }
}

