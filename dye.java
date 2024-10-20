/*
 * Decompiled with CFR 0.152.
 */
public final class dye {
    public final int a;
    public final hav b;
    public final dyf c;

    public dye() {
        throw null;
    }

    public dye(int n2, hav hav2, dyf dyf2) {
        this.a = n2;
        if (hav2 != null) {
            this.b = hav2;
            if (dyf2 != null) {
                this.c = dyf2;
                return;
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null loggerId");
    }

    public final int a() {
        return this.c.a;
    }

    public final int b() {
        return this.c.b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dye) {
            object = (dye)object;
            if (this.a == ((dye)object).a && this.b.equals(((dye)object).b) && ((Object)this.c).equals(((dye)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((Object)this.c).hashCode();
    }

    public final String toString() {
        Object object = this.c;
        String string = ((Object)this.b).toString();
        String string2 = object.toString();
        object = new StringBuilder("AppFlowEventIdentifier{eventId=");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append(", loggerId=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", clientId=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

