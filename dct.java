/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class dct
extends ded {
    public final String a;
    public final int b;
    private volatile transient String c;

    public dct(String string, int n2) {
        if (string != null) {
            this.a = string;
            this.b = n2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override
    public final int a() {
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
        return object instanceof ded && this.a.equals(((ded)(object = (ded)object)).b()) && this.b == ((ded)object).a();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
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
            String string = this.a;
            int n2 = this.b;
            Serializable serializable = new StringBuilder();
            serializable.append(string);
            serializable.append(".");
            serializable.append(n2);
            this.c = serializable.toString();
            if (this.c != null) {
                return this.c;
            }
            serializable = new NullPointerException("toString() cannot return null");
            throw serializable;
        }
    }
}

