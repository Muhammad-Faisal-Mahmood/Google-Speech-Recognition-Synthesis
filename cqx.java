/*
 * Decompiled with CFR 0.152.
 */
public final class cqx {
    public final String a;
    public final int b;
    public final boolean c;

    public cqx() {
        throw null;
    }

    public cqx(String string, int n2, boolean bl2) {
        this.a = string;
        this.b = n2;
        this.c = bl2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cqx) {
            object = (cqx)object;
            if (this.a.equals(((cqx)object).a) && this.b == ((cqx)object).b && this.c == ((cqx)object).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = true != this.c ? 1237 : 1231;
        return (((((n2 ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ Integer.MAX_VALUE) * 1000003 ^ Integer.MAX_VALUE) * 1000003 ^ 0x4CF) * 1000003 ^ n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ThreadPoolConfig{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numThreads=");
        stringBuilder.append(this.b);
        stringBuilder.append(", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

