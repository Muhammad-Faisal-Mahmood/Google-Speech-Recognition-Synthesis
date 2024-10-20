/*
 * Decompiled with CFR 0.152.
 */
public final class ety {
    public final ebs a;
    public final ebp b;
    public final ebg c;
    public final ebo d;
    public final String e;

    public ety(ebs ebs2, ebp ebp2, ebg ebg2, ebo ebo2, String string) {
        jse.e(ebs2, "openingFailure");
        jse.e(ebp2, "closingFailure");
        jse.e(ebg2, "disconnectReason");
        jse.e(ebo2, "updateRoutingStatus");
        this.a = ebs2;
        this.b = ebp2;
        this.c = ebg2;
        this.d = ebo2;
        this.e = string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ety)) {
            return false;
        }
        object = (ety)object;
        if (this.a != ((ety)object).a) {
            return false;
        }
        if (this.b != ((ety)object).b) {
            return false;
        }
        if (this.c != ((ety)object).c) {
            return false;
        }
        if (this.d != ((ety)object).d) {
            return false;
        }
        return jse.i(this.e, ((ety)object).e);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FailedRouteStatuses(openingFailure=");
        stringBuilder.append(this.a);
        stringBuilder.append(", closingFailure=");
        stringBuilder.append(this.b);
        stringBuilder.append(", disconnectReason=");
        stringBuilder.append(this.c);
        stringBuilder.append(", updateRoutingStatus=");
        stringBuilder.append(this.d);
        stringBuilder.append(", message=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

