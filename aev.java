/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

public final class aev {
    public static final Object a = new Object();
    private static final aef p;
    public Object b = a;
    @Deprecated
    public Object c;
    public aef d = p;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public aeb j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;

    static {
        yj yj2 = new yj();
        int n2 = gzx.d;
        Object object = hct.a;
        List list = Collections.emptyList();
        gzx gzx2 = hct.a;
        object = aed.a;
        p = yj.j("androidx.media3.common.Timeline", Uri.EMPTY, yj2, list, gzx2, (aed)object);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
        agf.z(6);
        agf.z(7);
        agf.z(8);
        agf.z(9);
        agf.z(10);
        agf.z(11);
        agf.z(12);
        agf.z(13);
    }

    public final long a() {
        return agf.m(0L);
    }

    public final boolean b() {
        return this.j != null;
    }

    public final void c(Object object, aef aef2, boolean bl2, boolean bl3, aeb aeb2, long l2) {
        this.b = object;
        object = aef2;
        if (aef2 == null) {
            object = p;
        }
        this.d = object;
        this.c = null;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = bl2;
        this.i = bl3;
        this.j = aeb2;
        this.l = 0L;
        this.m = l2;
        this.n = 0;
        this.o = 0;
        this.k = false;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass().equals(object.getClass())) {
            object = (aev)object;
            if (Objects.equals(this.b, ((aev)object).b) && Objects.equals(this.d, ((aev)object).d) && Objects.equals(null, null) && Objects.equals(this.j, ((aev)object).j) && this.e == ((aev)object).e && this.f == ((aev)object).f && this.g == ((aev)object).g && this.h == ((aev)object).h && this.i == ((aev)object).i && this.k == ((aev)object).k && this.m == ((aev)object).m && this.n == ((aev)object).n && this.o == ((aev)object).o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b.hashCode();
        int n3 = this.d.hashCode();
        aeb aeb2 = this.j;
        int n4 = aeb2 == null ? 0 : aeb2.hashCode();
        long l2 = this.e;
        int n5 = (int)(l2 ^ l2 >>> 32);
        l2 = this.f;
        int n6 = (int)(l2 ^ l2 >>> 32);
        l2 = this.g;
        int n7 = (int)(l2 ^ l2 >>> 32);
        int n8 = this.h;
        int n9 = this.i;
        int n10 = this.k;
        l2 = this.m;
        return ((((((((((((n2 + 217) * 31 + n3) * 961 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + n10) * 961 + (int)(l2 ^ l2 >>> 32)) * 31 + this.n) * 31 + this.o) * 31;
    }
}

