/*
 * Decompiled with CFR 0.152.
 */
public final class dcn
extends dcv {
    private final int b;
    private final int c;
    private volatile transient String d;

    public dcn(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof dcv && this.b == ((dcv)(object = (dcv)object)).b() && this.c == ((dcv)object).a();
    }

    public final int hashCode() {
        return (this.b ^ 0xF4243) * 1000003 ^ this.c;
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
            int n2 = this.c;
            Object object = "absolute:";
            if (n2 != 1) {
                object = "relative:";
            }
            n2 = this.b;
            StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append((String)object);
            stringBuilder.append(n2);
            stringBuilder.append("}");
            this.d = stringBuilder.toString();
            if (this.d != null) {
                return this.d;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

