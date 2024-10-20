/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class dge
extends dgx {
    private final der a;
    private final dej b;
    private final des c;
    private final hac d;
    private final dcv e;
    private volatile transient deh f;
    private volatile transient String g;
    private final elq h;

    public dge(der der2, dej dej2, elq elq2, des des2, hac hac2, dcv dcv2) {
        if (der2 != null) {
            this.a = der2;
            this.b = dej2;
            if (elq2 != null) {
                this.h = elq2;
                this.c = des2;
                this.d = hac2;
                this.e = dcv2;
                return;
            }
            throw new NullPointerException("Null fetchInfo");
        }
        throw new NullPointerException("Null slice");
    }

    @Override
    public final dcv a() {
        return this.e;
    }

    @Override
    public final dej b() {
        return this.b;
    }

    @Override
    public final der c() {
        return this.a;
    }

    @Override
    public final des d() {
        return this.c;
    }

    @Override
    public final hac e() {
        return this.d;
    }

    public final boolean equals(Object object) {
        dgx dgx2;
        if (object == this) {
            return true;
        }
        return object instanceof dgx && this.a.equals((dgx2 = (dgx)object).c()) && this.b.equals(dgx2.b()) && this.h.equals(dgx2.g()) && ((object = this.c) == null ? dgx2.d() == null : object.equals(dgx2.d())) && fvd.s(this.d, dgx2.e()) && this.e.equals(dgx2.a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final deh f() {
        if (this.f != null) return this.f;
        synchronized (this) {
            if (this.f != null) return this.f;
            Object object = this.e;
            Object object2 = this.a;
            int n2 = ((der)object2).c();
            int n3 = ((der)object2).b();
            int n4 = ((der)object2).d();
            int n5 = ((der)object2).a();
            int n6 = ((der)object2).e();
            this.f = object2 = new dee((dcv)object, n2, n3, n4, n5, n6);
            if (this.f != null) {
                return this.f;
            }
            object = new NullPointerException("fetchParams() cannot return null");
            throw object;
        }
    }

    @Override
    public final elq g() {
        return this.h;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        int n4 = this.h.hashCode();
        des des2 = this.c;
        int n5 = des2 == null ? 0 : des2.hashCode();
        return (((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.g != null) return this.g;
        synchronized (this) {
            Object object;
            if (this.g != null) return this.g;
            gtn gtn2 = new gtn("");
            gtn2.d();
            gtn2.b("fetcher", crh.n(this.b));
            gtn2.b("unpacker", crh.n(this.c));
            if (!this.d.isEmpty()) {
                object = this.d.k().k();
                while (object.hasNext()) {
                    Object object2 = (Map.Entry)object.next();
                    String string = (String)object2.getKey();
                    String string2 = crh.n((dgh)object2.getValue());
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(string);
                    ((StringBuilder)object2).append(": ");
                    ((StringBuilder)object2).append(string2);
                    gtn2.b("validator", ((StringBuilder)object2).toString());
                }
            }
            gtn2.f("size", this.a.f().d());
            gtn2.f("compressed", this.h.a);
            gtn2.b("scheme", this.h.b);
            gtn2.b("params", ((dgx)this).f());
            this.g = gtn2.toString();
            if (this.g != null) {
                return this.g;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

