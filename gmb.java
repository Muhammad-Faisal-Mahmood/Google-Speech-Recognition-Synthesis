/*
 * Decompiled with CFR 0.152.
 */
public final class gmb {
    public final gmc a;
    public final hpn b;

    public gmb() {
        throw null;
    }

    public gmb(gmc gmc2, hpn hpn2) {
        if (gmc2 != null) {
            this.a = gmc2;
            this.b = hpn2;
            return;
        }
        throw new NullPointerException("Null monitor");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gmb) {
            object = (gmb)object;
            if (this.a.equals(((gmb)object).a) && this.b.equals(((gmb)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        Object object = this.b;
        String string = this.a.toString();
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("MonitorReport{monitor=");
        stringBuilder.append(string);
        stringBuilder.append(", startReport=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

