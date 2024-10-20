/*
 * Decompiled with CFR 0.152.
 */
public final class dkd {
    public final hpr a;
    public final int b;
    public final int c;
    public final boolean d;

    public dkd() {
        throw null;
    }

    public dkd(hpr hpr2, int n2, int n3, boolean bl2) {
        this.a = hpr2;
        this.b = n2;
        this.c = n3;
        this.d = bl2;
    }

    public static dps a() {
        dps dps2 = new dps(null);
        dps2.a = 11;
        byte by2 = dps2.c;
        dps2.d = 2;
        dps2.c = (byte)(by2 | 3);
        dps2.c(true);
        return dps2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dkd) {
            dkd dkd2 = (dkd)object;
            object = this.a;
            if ((object == null ? dkd2.a == null : object.equals(dkd2.a)) && this.b == dkd2.b && this.c == dkd2.c && this.d == dkd2.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        hpr hpr2 = this.a;
        int n2 = hpr2 == null ? 0 : hpr2.hashCode();
        int n3 = this.b;
        int n4 = this.c;
        int n5 = true != this.d ? 1237 : 1231;
        return (((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("PrimesThreadsConfigurations{primesExecutorService=");
        stringBuilder.append(string);
        stringBuilder.append(", primesMetricExecutorPriority=");
        stringBuilder.append(this.b);
        stringBuilder.append(", primesMetricExecutorPoolSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", enableDeferredTasks=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

