/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

final class dfq
extends dfy {
    private final ddn a;
    private final long b;
    private final int c;
    private final int d;
    private final dcv e;
    private volatile transient int f;
    private volatile transient boolean g;
    private volatile transient String h;

    public dfq(ddn ddn2, long l2, int n2, int n3, dcv dcv2) {
        this.a = ddn2;
        this.b = l2;
        this.c = n2;
        this.d = n3;
        this.e = dcv2;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final long c() {
        return this.b;
    }

    @Override
    public final dcv d() {
        return this.e;
    }

    @Override
    public final ddn e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof dfy && this.a.equals(((dfy)(object = (dfy)object)).e()) && this.b == ((dfy)object).c() && this.c == ((dfy)object).a() && this.d == ((dfy)object).b() && this.e.equals(((dfy)object).d());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int f() {
        if (this.g) return this.f;
        synchronized (this) {
            if (this.g) return this.f;
            this.f = this.e.c(this.c);
            this.g = true;
            return this.f;
        }
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        long l2 = this.b;
        dcv dcv2 = this.e;
        return ((((n2 ^ 0xF4243) * 1000003 ^ (int)(l2 ^ l2 >>> 32)) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ dcv2.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.h != null) return this.h;
        synchronized (this) {
            if (this.h != null) return this.h;
            String string = ((Object)this.a).toString();
            long l2 = this.b;
            Serializable serializable = new StringBuilder("{");
            serializable.append(string);
            serializable.append(": ");
            serializable.append(l2);
            serializable.append(" bytes}");
            this.h = serializable.toString();
            if (this.h != null) {
                return this.h;
            }
            serializable = new NullPointerException("toString() cannot return null");
            throw serializable;
        }
    }
}

