/*
 * Decompiled with CFR 0.152.
 */
public final class ekk {
    public final hpn a;
    public final eaz b;
    public final gto c;
    public final gto d;

    public ekk() {
        throw null;
    }

    public ekk(hpn hpn2, eaz eaz2, gto gto2, gto gto3) {
        if (hpn2 != null) {
            this.a = hpn2;
            if (eaz2 != null) {
                this.b = eaz2;
                this.c = gto2;
                this.d = gto3;
                return;
            }
            throw new NullPointerException("Null audioRouteType");
        }
        throw new NullPointerException("Null audioRouteDisconnectStatus");
    }

    public static ekk a() {
        hyg hyg2 = eav.a.l();
        Object object = ebg.a;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        Object object2 = (eav)hyg2.b;
        ((eav)object2).c = ((ebg)object).J;
        ((eav)object2).b |= 1;
        object = hhk.K((eav)hyg2.o());
        hyg2 = eaz.a;
        object2 = gsl.a;
        return new ekk((hpn)object, (eaz)hyg2, (gto)object2, (gto)object2);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ekk) {
            object = (ekk)object;
            if (this.a.equals(((ekk)object).a) && this.b.equals(((ekk)object).b) && this.c.equals(((ekk)object).c) && this.d.equals(((ekk)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        eaz eaz2 = this.b;
        if (eaz2.B()) {
            n2 = eaz2.i();
        } else {
            int n4;
            n2 = n4 = eaz2.memoizedHashCode;
            if (n4 == 0) {
                eaz2.memoizedHashCode = n2 = eaz2.i();
            }
        }
        return (((n3 ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }

    public final String toString() {
        Object object = this.d;
        Object object2 = this.c;
        Object object3 = this.b;
        String string = this.a.toString();
        object3 = object3.toString();
        object2 = object2.toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("AudioRouteData{audioRouteDisconnectStatus=");
        stringBuilder.append(string);
        stringBuilder.append(", audioRouteType=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", handoffDataOptional=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", routeRef=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

