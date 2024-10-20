/*
 * Decompiled with CFR 0.152.
 */
public final class dcp
extends ddo {
    private final ddn b;
    private final int c;
    private volatile transient String d;

    public dcp(ddn ddn2, int n2) {
        if (ddn2 != null) {
            this.b = ddn2;
            this.c = n2;
            return;
        }
        throw new NullPointerException("Null qualifiedName");
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final ddn b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof ddo && this.b.equals(((ddo)(object = (ddo)object)).b()) && this.c == ((ddo)object).a();
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ 0xF4243) * 1000003 ^ this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.d != null) return this.d;
        synchronized (this) {
            if (this.d != null) return this.d;
            Object object = new gtn("");
            ((gtn)object).b("name", this.b);
            ((gtn)object).e("version", this.c);
            this.d = ((gtn)object).toString();
            if (this.d != null) {
                return this.d;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

