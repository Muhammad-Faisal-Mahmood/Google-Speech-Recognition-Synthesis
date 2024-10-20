/*
 * Decompiled with CFR 0.152.
 */
public final class dco
extends ddn {
    public final String a;
    public final String b;
    private volatile transient String c;

    public dco(String string, String string2) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null namespace");
    }

    @Override
    public final String a() {
        return this.b;
    }

    @Override
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof ddn && this.a.equals(((ddn)(object = (ddn)object)).b()) && this.b.equals(((ddn)object).a());
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.c != null) return this.c;
        synchronized (this) {
            if (this.c != null) return this.c;
            this.c = ddn.g(this.a, this.b);
            if (this.c != null) {
                return this.c;
            }
            NullPointerException nullPointerException = new NullPointerException("toString() cannot return null");
            throw nullPointerException;
        }
    }
}

