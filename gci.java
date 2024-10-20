/*
 * Decompiled with CFR 0.152.
 */
public final class gci {
    public final gcj a;
    public final gto b;

    public gci() {
        throw null;
    }

    public gci(gcj gcj2, gto gto2) {
        if (gcj2 != null) {
            this.a = gcj2;
            this.b = gto2;
            return;
        }
        throw new NullPointerException("Null repeatInterval");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gci) {
            object = (gci)object;
            if (((Object)this.a).equals(((gci)object).a) && this.b.equals(((gci)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Object)this.a).hashCode() ^ 0xF4243) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("PeriodicWorkSpec{repeatInterval=");
        stringBuilder.append(string);
        stringBuilder.append(", flexInterval=Optional.absent()}");
        return stringBuilder.toString();
    }
}

