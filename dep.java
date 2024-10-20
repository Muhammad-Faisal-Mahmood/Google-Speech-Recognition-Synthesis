/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dep
implements ddp {
    public final hac a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final gzx c;
    private final byte[] d;
    private gzx e;

    public dep(hac hac2, gzx gzx2, byte[] byArray) {
        this.a = dep.d(hac2);
        this.c = gzx2;
        this.d = byArray;
    }

    public static dep c(byte[] byArray) {
        hac hac2 = hcy.a;
        int n2 = gzx.d;
        return new dep(hac2, hct.a, byArray);
    }

    public static hac d(Map object) {
        gzy gzy2 = new gzy();
        for (Map.Entry entry : object.entrySet()) {
            object = ((ddp)entry.getValue()).a();
            gzy2.d((String)entry.getKey(), object);
        }
        return gzy2.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ded b() {
        synchronized (this) {
            Collection collection = this.e();
            boolean bl2 = collection.isEmpty();
            if (!bl2) return ((den)fvd.N(collection, 0)).e();
            return null;
        }
    }

    @Override
    public final void close() {
        if (!this.b.getAndSet(true)) {
            for (Object object : DesugarCollections.unmodifiableSet(this.a.l())) {
                if ((object = (del)this.a.get(object)) == null) continue;
                ((del)object).close();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Collection e() {
        synchronized (this) {
            Object object = this.e;
            if (object != null) {
                return object;
            }
            if (this.a.isEmpty()) {
                int n2 = gzx.d;
                this.e = hct.a;
                return this.e;
            } else {
                object = new gzs();
                hdx hdx2 = this.a.g().k();
                while (hdx2.hasNext()) {
                    ((gzs)object).h(((del)hdx2.next()).a);
                }
                this.e = ((gzs)object).g();
            }
            return this.e;
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dep)) {
            return false;
        }
        object = (dep)object;
        boolean bl2 = fvd.s(this.a, ((dep)object).a);
        boolean bl3 = Arrays.equals(this.d, ((dep)object).d);
        return bl2 && bl3;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        gtn gtn2 = new gtn("");
        gtn2.b("superpack", this.b());
        boolean bl2 = this.d != null;
        gtn2.g("metadata", bl2);
        hac hac2 = this.a;
        gtn2.b("packs", gtk.c(',').d(hac2.g()));
        return gtn2.toString();
    }
}

