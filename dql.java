/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class dql {
    public final long a;
    public long b;
    public long c;
    public int d;
    public int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    int j;
    public String k;
    ker l;
    int m;
    kdo n;
    int o;
    int p;
    public int q;
    public int r;
    public int s = -1;
    public gto t;
    int u;
    public int v;
    int w = 1;

    public dql(String string, String string2, boolean bl2, long l2) {
        this.g = fxf.N(string);
        this.f = fxf.N(string2);
        this.h = bl2;
        this.a = l2;
        this.t = gsl.a;
    }

    public static dql a(String string, djt djt2) {
        return new dql(string, djt.c(djt2), true, SystemClock.elapsedRealtime());
    }
}

