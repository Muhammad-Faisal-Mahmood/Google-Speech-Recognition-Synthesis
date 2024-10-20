/*
 * Decompiled with CFR 0.152.
 */
public final class aof {
    public final long a;
    public final long b;

    public aof(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aof)) {
            return false;
        }
        object = (aof)object;
        return this.a == ((aof)object).a && this.b == ((aof)object).b;
    }

    public final int hashCode() {
        return (int)this.a * 31 + (int)this.b;
    }
}

