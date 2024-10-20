/*
 * Decompiled with CFR 0.152.
 */
public class ady {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        new ady();
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
        agf.z(6);
    }

    public ady() {
        int n2 = agf.a;
        this.a = 0L;
        this.b = Long.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ady)) {
            return false;
        }
        object = (ady)object;
        long l2 = ((ady)object).a;
        l2 = ((ady)object).b;
        boolean bl2 = ((ady)object).c;
        bl2 = ((ady)object).d;
        bl2 = ((ady)object).e;
        return true;
    }

    public final int hashCode() {
        return (int)-9223372034707292160L * 29791;
    }
}

