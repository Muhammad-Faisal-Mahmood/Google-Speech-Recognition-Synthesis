/*
 * Decompiled with CFR 0.152.
 */
public final class aeb {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
    }

    public aeb() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.d = -3.4028235E38f;
        this.e = -3.4028235E38f;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aeb)) {
            return false;
        }
        object = (aeb)object;
        long l2 = ((aeb)object).a;
        l2 = ((aeb)object).b;
        l2 = ((aeb)object).c;
        float f2 = ((aeb)object).d;
        f2 = ((aeb)object).e;
        return true;
    }

    public final int hashCode() {
        int n2 = (int)-9223372034707292159L;
        return (((n2 * 31 + n2) * 31 + n2) * 31 + Float.floatToIntBits(-3.4028235E38f)) * 31 + Float.floatToIntBits(-3.4028235E38f);
    }
}

