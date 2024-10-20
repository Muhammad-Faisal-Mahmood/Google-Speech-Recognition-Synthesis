/*
 * Decompiled with CFR 0.152.
 */
final class dpd {
    public final dpl a;
    public final gto b;
    public final gto c;

    public dpd() {
        throw null;
    }

    public dpd(dpl dpl2, gto gto2, gto gto3) {
        this.a = dpl2;
        this.b = gto2;
        this.c = gto3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dpd) {
            object = (dpd)object;
            if (this.a.equals(((dpd)object).a) && this.b.equals(((dpd)object).b) && this.c.equals(((dpd)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * -721379959 ^ 0x4D5) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("InternalJankEventCollectionParameters{measurementKey=");
        stringBuilder.append(string);
        stringBuilder.append(", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent()}");
        return stringBuilder.toString();
    }
}

