/*
 * Decompiled with CFR 0.152.
 */
public final class day
extends dbx {
    public final String a;
    public final int b;
    public final hac c;
    private final hac d;
    private volatile transient ded e;
    private volatile transient ddm f;
    private volatile transient String g;

    public day(String string, int n2, hac hac2, hac hac3) {
        this.a = string;
        this.b = n2;
        if (hac2 != null) {
            this.d = hac2;
            if (hac3 != null) {
                this.c = hac3;
                return;
            }
            throw new NullPointerException("Null packs");
        }
        throw new NullPointerException("Null extraMap");
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final hac b() {
        return this.c;
    }

    @Override
    public final String c() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ddm d() {
        if (this.f != null) return this.f;
        synchronized (this) {
            if (this.f != null) return this.f;
            Object object = new ddl();
            ((ddl)object).c(this.d);
            this.f = ((ddl)object).a();
            if (this.f != null) {
                return this.f;
            }
            object = new NullPointerException("extras() cannot return null");
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ded e() {
        if (this.e != null) return this.e;
        synchronized (this) {
            if (this.e != null) return this.e;
            this.e = ded.c(this.a, this.b);
            if (this.e != null) {
                return this.e;
            }
            NullPointerException nullPointerException = new NullPointerException("versionedName() cannot return null");
            throw nullPointerException;
        }
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
            if (this.g != null) return this.g;
            this.g = ((dbx)this).e().toString();
            if (this.g != null) {
                return this.g;
            }
            NullPointerException nullPointerException = new NullPointerException("toString() cannot return null");
            throw nullPointerException;
        }
    }
}

