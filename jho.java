/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

public final class jho
implements Runnable {
    final boolean a;
    final Object b;
    final Object c;
    final Object d;
    final Object e;
    final Object f;
    private final int g;

    public /* synthetic */ jho(ajn ajn2, Pair pair, amv amv2, hti hti2, IOException iOException, boolean bl2, int n2) {
        this.g = n2;
        this.f = ajn2;
        this.c = pair;
        this.b = amv2;
        this.e = hti2;
        this.d = iOException;
        this.a = bl2;
    }

    public jho(jid jid2, Collection collection, jib jib2, Future future, boolean bl2, Future future2, int n2) {
        this.g = n2;
        this.b = collection;
        this.c = jib2;
        this.d = future;
        this.a = bl2;
        this.e = future2;
        this.f = jid2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        if (this.g != 0) {
            Object object2 = (Pair)this.c;
            int n2 = (Integer)object2.first;
            anc anc2 = (anc)object2.second;
            ajq ajq2 = ((ajn)this.f).a;
            boolean bl2 = this.a;
            Object object3 = this.d;
            Object object4 = this.e;
            object2 = (amv)this.b;
            object4 = (hti)object4;
            object3 = (IOException)object3;
            ajq2.j.D(n2, anc2, (amv)object2, (hti)object4, (IOException)object3, bl2);
            return;
        }
        Object object5 = this.b.iterator();
        while (object5.hasNext()) {
            object = (jib)object5.next();
            if (object == this.c) continue;
            ((jib)object).a.c(jid.c);
        }
        object = this.d;
        if (object != null) {
            object.cancel(false);
            if (!this.a && ((jid)this.f).t.decrementAndGet() == Integer.MIN_VALUE) {
                object = this.f;
                object5 = new jel(this, 20);
                ((jid)object).g.execute((Runnable)object5);
            }
        }
        if ((object = this.e) != null) {
            object.cancel(false);
        }
        object = this.f;
        jfr jfr2 = ((jid)object).D.b.z;
        object5 = jfr2.a;
        synchronized (object5) {
            HashSet hashSet;
            jfr2.b.remove(object);
            if (!jfr2.b.isEmpty()) return;
            object = jfr2.c;
            jfr2.b = hashSet = new HashSet();
        }
        if (object == null) return;
        jfr2.d.y.o((iyh)object);
    }
}

