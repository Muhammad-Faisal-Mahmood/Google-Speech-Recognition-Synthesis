/*
 * Decompiled with CFR 0.152.
 */
public final class dee
extends deh {
    public final dcv a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    private final int g;
    private volatile transient String h;

    public dee(dcv dcv2, int n2, int n3, int n4, int n5, int n6) {
        this.a = dcv2;
        this.g = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
    }

    @Override
    public final int a() {
        return this.d;
    }

    @Override
    public final int b() {
        return this.b;
    }

    @Override
    public final int c() {
        return this.g;
    }

    @Override
    public final int d() {
        return this.c;
    }

    @Override
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof deh && this.a.equals(((deh)(object = (deh)object)).f()) && this.g == ((deh)object).c() && this.b == ((deh)object).b() && this.c == ((deh)object).d() && this.d == ((deh)object).a() && this.e == ((deh)object).e();
    }

    @Override
    public final dcv f() {
        return this.a;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.g) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e;
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
            String string = dec.a(this.g, this.b, this.c, this.d);
            String string2 = dec.i(this.e);
            Object object = ((Object)this.a).toString();
            StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append(string);
            stringBuilder.append(", ");
            stringBuilder.append(string2);
            stringBuilder.append(", p ");
            stringBuilder.append((String)object);
            stringBuilder.append("}");
            this.h = stringBuilder.toString();
            if (this.h != null) {
                return this.h;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

