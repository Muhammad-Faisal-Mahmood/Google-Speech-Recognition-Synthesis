/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.Collections;

public final class ank {
    public final long a;
    public final Uri b;
    public final ahk c;
    public final apq d;
    public final afn e;
    public final apy f;
    public volatile boolean g;
    public boolean h;
    public long i;
    public agt j;
    public aqe k;
    public boolean l;
    public final ann m;
    public final ivu n;

    public ank(ann ann2, Uri uri, agr agr2, ivu ivu2, apq apq2, afn afn2) {
        this.m = ann2;
        this.b = uri;
        this.c = new ahk(agr2);
        this.n = ivu2;
        this.d = apq2;
        this.e = afn2;
        this.f = new apy();
        this.h = true;
        this.a = amv.a.getAndIncrement();
        this.j = this.a(0L);
    }

    public final agt a(long l2) {
        Collections.emptyMap();
        return new agt(this.b, ann.a, l2);
    }

    public final void b(long l2, long l3) {
        this.f.a = l2;
        this.i = l3;
        this.h = true;
        this.l = false;
    }
}

