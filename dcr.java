/*
 * Decompiled with CFR 0.152.
 */
public final class dcr
extends dds {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private volatile transient String e;

    public dcr(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.a = bl2;
        this.b = bl3;
        this.c = bl4;
        this.d = bl5;
    }

    @Override
    public final boolean a() {
        return this.d;
    }

    @Override
    public final boolean b() {
        return this.b;
    }

    @Override
    public final boolean c() {
        return this.c;
    }

    @Override
    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof dds && this.a == ((dds)(object = (dds)object)).d() && this.b == ((dds)object).b() && this.c == ((dds)object).c() && this.d == ((dds)object).a();
    }

    public final int hashCode() {
        boolean bl2 = this.a;
        int n2 = 1237;
        int n3 = true != bl2 ? 1237 : 1231;
        int n4 = true != this.b ? 1237 : 1231;
        int n5 = true != this.c ? 1237 : 1231;
        if (this.d) {
            n2 = 1231;
        }
        return (((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.e != null) return this.e;
        synchronized (this) {
            if (this.e != null) return this.e;
            this.e = dec.b(this.a, this.b, this.c, this.d);
            if (this.e != null) {
                return this.e;
            }
            NullPointerException nullPointerException = new NullPointerException("toString() cannot return null");
            throw nullPointerException;
        }
    }
}

