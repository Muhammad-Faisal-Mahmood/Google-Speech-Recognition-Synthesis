/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class cnc {
    public final iez a;
    public final gto b;
    public final gto c;
    private final gto d;

    public cnc() {
        throw null;
    }

    public cnc(iez iez2, gto gto2, gto gto3, gto gto4) {
        this.a = iez2;
        this.b = gto2;
        this.c = gto3;
        this.d = gto4;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cnc) {
            object = (cnc)object;
            if (this.a.equals(((cnc)object).a) && this.b.equals(((cnc)object).b) && this.c.equals(((cnc)object).c) && this.d.equals(((cnc)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        iez iez2 = this.a;
        if (iez2.B()) {
            n2 = iez2.i();
        } else {
            int n3;
            n2 = n3 = iez2.memoizedHashCode;
            if (n3 == 0) {
                iez2.memoizedHashCode = n2 = iez2.i();
            }
        }
        return (((n2 ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        Serializable serializable = this.d;
        Object object = this.c;
        Object object2 = this.b;
        String string = String.valueOf(this.a);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("SodaInitParams{sodaCoreConfig=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", sodaTransportFactory=");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(", sodaDataProvider=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", sodaApaAppFlow=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

