/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.util.List;

public final class bhc {
    public final String a;
    public final bbv b;
    public final bas c;
    public final long d;
    public final long e;
    public final long f;
    public final baq g;
    public final int h;
    public final bak i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public bhc(String string, bbv bbv2, bas bas2, long l2, long l3, long l4, baq baq2, int n2, bak bak2, long l5, long l6, int n3, int n4, long l7, int n5, List list, List list2) {
        jse.e(string, "id");
        jse.e((Object)bbv2, "state");
        jse.e(bas2, "output");
        jse.e((Object)bak2, "backoffPolicy");
        jse.e(list, "tags");
        jse.e(list2, "progress");
        this.a = string;
        this.b = bbv2;
        this.c = bas2;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = baq2;
        this.h = n2;
        this.i = bak2;
        this.j = l5;
        this.k = l6;
        this.l = n3;
        this.m = n4;
        this.n = l7;
        this.o = n5;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bhc)) {
            return false;
        }
        object = (bhc)object;
        if (!jse.i(this.a, ((bhc)object).a)) {
            return false;
        }
        if (this.b != ((bhc)object).b) {
            return false;
        }
        if (!jse.i(this.c, ((bhc)object).c)) {
            return false;
        }
        if (this.d != ((bhc)object).d) {
            return false;
        }
        if (this.e != ((bhc)object).e) {
            return false;
        }
        if (this.f != ((bhc)object).f) {
            return false;
        }
        if (!jse.i(this.g, ((bhc)object).g)) {
            return false;
        }
        if (this.h != ((bhc)object).h) {
            return false;
        }
        if (this.i != ((bhc)object).i) {
            return false;
        }
        if (this.j != ((bhc)object).j) {
            return false;
        }
        if (this.k != ((bhc)object).k) {
            return false;
        }
        if (this.l != ((bhc)object).l) {
            return false;
        }
        if (this.m != ((bhc)object).m) {
            return false;
        }
        if (this.n != ((bhc)object).n) {
            return false;
        }
        if (this.o != ((bhc)object).o) {
            return false;
        }
        if (!jse.i(this.p, ((bhc)object).p)) {
            return false;
        }
        return jse.i(this.q, ((bhc)object).q);
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        int n4 = this.c.hashCode();
        Object object = this.g;
        long l2 = this.f;
        long l3 = this.e;
        int n5 = AmbientLifecycleObserverKt.p(this.d);
        int n6 = AmbientLifecycleObserverKt.p(l3);
        int n7 = AmbientLifecycleObserverKt.p(l2);
        int n8 = ((baq)object).hashCode();
        object = this.i;
        int n9 = this.h;
        int n10 = ((Enum)object).hashCode();
        object = this.p;
        l2 = this.n;
        l3 = this.k;
        return (((((((((((((((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + n10) * 31 + AmbientLifecycleObserverKt.p(this.j)) * 31 + AmbientLifecycleObserverKt.p(l3)) * 31 + this.l) * 31 + this.m) * 31 + AmbientLifecycleObserverKt.p(l2)) * 31 + this.o) * 31 + object.hashCode()) * 31 + ((Object)this.q).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WorkInfoPojo(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", state=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", output=");
        stringBuilder.append(this.c);
        stringBuilder.append(", initialDelay=");
        stringBuilder.append(this.d);
        stringBuilder.append(", intervalDuration=");
        stringBuilder.append(this.e);
        stringBuilder.append(", flexDuration=");
        stringBuilder.append(this.f);
        stringBuilder.append(", constraints=");
        stringBuilder.append(this.g);
        stringBuilder.append(", runAttemptCount=");
        stringBuilder.append(this.h);
        stringBuilder.append(", backoffPolicy=");
        stringBuilder.append((Object)this.i);
        stringBuilder.append(", backoffDelayDuration=");
        stringBuilder.append(this.j);
        stringBuilder.append(", lastEnqueueTime=");
        stringBuilder.append(this.k);
        stringBuilder.append(", periodCount=");
        stringBuilder.append(this.l);
        stringBuilder.append(", generation=");
        stringBuilder.append(this.m);
        stringBuilder.append(", nextScheduleTimeOverride=");
        stringBuilder.append(this.n);
        stringBuilder.append(", stopReason=");
        stringBuilder.append(this.o);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.p);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.q);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

