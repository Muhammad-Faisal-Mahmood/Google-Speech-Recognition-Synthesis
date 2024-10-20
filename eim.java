/*
 * Decompiled with CFR 0.152.
 */
public final class eim {
    public final egz a;
    public final boolean b;
    private final boolean c;

    public eim() {
        this(null);
    }

    public eim(egz egz2, boolean bl2, boolean bl3) {
        this.a = egz2;
        this.b = bl2;
        this.c = bl3;
    }

    public /* synthetic */ eim(byte[] byArray) {
        this(null, false, false);
    }

    public static /* synthetic */ eim b(eim eim2, egz egz2, boolean bl2, boolean bl3, int n2) {
        if ((n2 & 1) != 0) {
            egz2 = eim2.a;
        }
        if ((n2 & 2) != 0) {
            bl2 = eim2.b;
        }
        if ((n2 & 4) != 0) {
            bl3 = eim2.c;
        }
        return new eim(egz2, bl2, bl3);
    }

    public final egz a() {
        if (this.c) {
            return this.a;
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eim)) {
            return false;
        }
        object = (eim)object;
        if (!jse.i(this.a, ((eim)object).a)) {
            return false;
        }
        if (this.b != ((eim)object).b) {
            return false;
        }
        return this.c == ((eim)object).c;
    }

    public final int hashCode() {
        egz egz2 = this.a;
        int n2 = egz2 == null ? 0 : egz2.hashCode();
        boolean bl2 = this.b;
        boolean bl3 = this.c;
        return (n2 * 31 + a.f(bl2)) * 31 + a.f(bl3);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BvrDeviceState(bluetoothAudioDevice=");
        stringBuilder.append(this.a);
        stringBuilder.append(", started=");
        stringBuilder.append(this.b);
        stringBuilder.append(", connected=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

