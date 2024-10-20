/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;

public final class aef {
    public final String a;
    public final aec b;
    public final aeb c;
    public final aei d;
    public final ady e;
    public final aed f;

    static {
        yj yj2 = new yj();
        int n2 = gzx.d;
        gzx gzx2 = hct.a;
        yj.j(null, null, yj2, Collections.emptyList(), hct.a, aed.a);
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
    }

    public aef(String string, adz adz2, aec aec2, aeb aeb2, aei aei2, aed aed2) {
        this.a = string;
        this.b = aec2;
        this.c = aeb2;
        this.d = aei2;
        this.e = adz2;
        this.f = aed2;
    }

    public static aef a(Uri uri) {
        yj yj2 = new yj();
        int n2 = gzx.d;
        gzx gzx2 = hct.a;
        return yj.j(null, uri, yj2, Collections.emptyList(), hct.a, aed.a);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aef)) {
            return false;
        }
        object = (aef)object;
        return Objects.equals(this.a, ((aef)object).a) && this.e.equals(((aef)object).e) && Objects.equals(this.b, ((aef)object).b) && Objects.equals(this.c, ((aef)object).c) && Objects.equals(this.d, ((aef)object).d) && Objects.equals(this.f, ((aef)object).f);
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        aec aec2 = this.b;
        int n3 = aec2 != null ? aec2.hashCode() : 0;
        return ((((n2 * 31 + n3) * 31 + this.c.hashCode()) * 31 + this.e.hashCode()) * 31 + this.d.hashCode()) * 31;
    }
}

