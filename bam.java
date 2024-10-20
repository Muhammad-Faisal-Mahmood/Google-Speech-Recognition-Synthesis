/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$-CC
 */
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import java.util.concurrent.Executor;

public final class bam {
    public final Executor a;
    public final jqf b;
    public final Executor c;
    public final bbz d;
    public final bbt e;
    public final um f;
    public final um g;
    public final um h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final AmbientLifecycleObserver$AmbientLifecycleCallback.-CC o;
    public final AmbientMode$AmbientCallback p;
    public final AmbientLifecycleObserver$AmbientLifecycleCallback.-CC q;

    public bam(bal bal2) {
        Object object;
        Object object2;
        jqf jqf2;
        block8: {
            block12: {
                block9: {
                    block11: {
                        block10: {
                            jqf2 = bal2.b;
                            object = object2 = bal2.a;
                            if (object2 != null) break block8;
                            if (jqf2 == null || (object2 = (object = (jqc)jqf2.get(jqc.b)) instanceof juy ? (juy)object : null) == null) break block9;
                            object = object2 instanceof jwa ? (jwa)object2 : null;
                            if (object == null) break block10;
                            Executor executor = ((jwa)object).e();
                            object = executor;
                            if (executor != null) break block11;
                        }
                        object = new jvn((juy)object2);
                    }
                    object2 = object;
                    break block12;
                }
                object2 = null;
            }
            object = object2;
            if (object2 == null) {
                object = AmbientLifecycleObserverKt.a(false);
            }
        }
        this.a = object;
        object2 = jqf2;
        if (jqf2 == null) {
            object2 = bal2.a != null ? jvf.k((Executor)object) : jvo.a;
        }
        this.b = object2;
        object = object2 = bal2.d;
        if (object2 == null) {
            object = AmbientLifecycleObserverKt.a(true);
        }
        this.c = object;
        this.p = new AmbientMode$AmbientCallback(null);
        object = object2 = bal2.c;
        if (object2 == null) {
            object = bau.a;
        }
        this.d = object;
        this.q = bbk.a;
        object = object2 = bal2.e;
        if (object2 == null) {
            object = new gcr(1);
        }
        this.e = object;
        this.j = bal2.j;
        this.k = Integer.MAX_VALUE;
        this.m = bal2.k;
        this.f = bal2.f;
        this.g = bal2.g;
        this.h = bal2.h;
        this.i = bal2.i;
        this.l = 8;
        this.n = bal2.l;
        this.o = new AmbientLifecycleObserver$AmbientLifecycleCallback$_CC();
    }
}

