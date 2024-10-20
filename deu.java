/*
 * Decompiled with CFR 0.152.
 */
public final class deu
extends dff {
    public final String a;
    public final ded b;
    public final int c;
    public final gzx d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final String k;
    public final long l;
    public volatile transient ddn m;
    private volatile transient String n;
    private volatile transient String o;

    public deu(String string, ded ded2, int n2, gzx gzx2, long l2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, String string2, long l3) {
        if (string != null) {
            this.a = string;
            this.b = ded2;
            this.c = n2;
            if (gzx2 != null) {
                this.d = gzx2;
                this.e = l2;
                this.f = bl2;
                this.g = bl3;
                this.h = bl4;
                this.i = bl5;
                this.j = n3;
                if (string2 != null) {
                    this.k = string2;
                    this.l = l3;
                    return;
                }
                throw new NullPointerException("Null filePath");
            }
            throw new NullPointerException("Null urls");
        }
        throw new NullPointerException("Null id");
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.j;
    }

    @Override
    public final long c() {
        return this.e;
    }

    @Override
    public final long d() {
        return this.l;
    }

    @Override
    public final ded e() {
        return this.b;
    }

    public final boolean equals(Object object) {
        ded ded2;
        if (object == this) {
            return true;
        }
        return object instanceof dff && this.a.equals(((dff)(object = (dff)object)).h()) && ((ded2 = this.b) == null ? ((dff)object).e() == null : ded2.equals(((dff)object).e())) && this.c == ((dff)object).a() && fvd.z(this.d, ((dff)object).f()) && this.e == ((dff)object).c() && this.f == ((dff)object).l() && this.g == ((dff)object).j() && this.h == ((dff)object).k() && this.i == ((dff)object).i() && this.j == ((dff)object).b() && this.k.equals(((dff)object).g()) && this.l == ((dff)object).d();
    }

    @Override
    public final gzx f() {
        return this.d;
    }

    @Override
    public final String g() {
        return this.k;
    }

    @Override
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        ded ded2 = this.b;
        int n3 = ded2 == null ? 0 : ded2.hashCode();
        int n4 = this.c;
        int n5 = this.d.hashCode();
        long l2 = this.e;
        int n6 = (int)(l2 ^ l2 >>> 32);
        boolean bl2 = this.f;
        int n7 = 1237;
        int n8 = true != bl2 ? 1237 : 1231;
        int n9 = true != this.g ? 1237 : 1231;
        int n10 = true != this.h ? 1237 : 1231;
        if (this.i) {
            n7 = 1231;
        }
        int n11 = this.j;
        int n12 = this.k.hashCode();
        l2 = this.l;
        return (((((((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n8) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n7) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ (int)(l2 ^ l2 >>> 32);
    }

    @Override
    public final boolean i() {
        return this.i;
    }

    @Override
    public final boolean j() {
        return this.g;
    }

    @Override
    public final boolean k() {
        return this.h;
    }

    @Override
    public final boolean l() {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String m() {
        if (this.n != null) return this.n;
        synchronized (this) {
            if (this.n != null) return this.n;
            String string = dec.b(this.f, this.g, this.h, this.i);
            Object object = dec.i(this.j);
            StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append(string);
            stringBuilder.append(", ");
            stringBuilder.append((String)object);
            stringBuilder.append("}");
            this.n = stringBuilder.toString();
            if (this.n != null) {
                return this.n;
            }
            object = new NullPointerException("paramsString() cannot return null");
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.o != null) return this.o;
        synchronized (this) {
            if (this.o != null) return this.o;
            gtn gtn2 = new gtn("");
            gtn2.d();
            gtn2.b("id", this.a);
            gtn2.b("params", ((dff)this).m());
            gtn2.b("urls", this.d);
            gtn2.e("prio", this.c);
            long l2 = this.l;
            Object object = l2 == 0L ? "never" : dec.d(this.e + l2);
            gtn2.b("ttl", object);
            this.o = gtn2.toString();
            if (this.o != null) {
                return this.o;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

