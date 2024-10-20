/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class dze {
    public final String a;
    public final gto b;
    public final gto c;
    public final gto d;
    public final gto e;
    public final gto f;
    private final gto g;

    public dze() {
        throw null;
    }

    public dze(gto gto2, gto gto3, gto gto4, gto gto5, gto gto6, gto gto7) {
        this.a = "GOOGLETTS";
        this.b = gto2;
        this.c = gto3;
        this.g = gto4;
        this.d = gto5;
        this.e = gto6;
        this.f = gto7;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dze) {
            object = (dze)object;
            if (this.a.equals(((dze)object).a) && this.b.equals(((dze)object).b) && this.c.equals(((dze)object).c) && this.g.equals(((dze)object).g) && this.d.equals(((dze)object).d) && this.e.equals(((dze)object).e) && this.f.equals(((dze)object).f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        Serializable serializable = this.f;
        Object object = this.e;
        Object object2 = this.d;
        Object object3 = this.g;
        Object object4 = this.c;
        String string = String.valueOf(this.b);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("TransportConfiguration{logSource=");
        ((StringBuilder)serializable).append(this.a);
        ((StringBuilder)serializable).append(", accountNameFutureSupplier=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", zwiebackOverrideFutureSupplier=");
        ((StringBuilder)serializable).append((String)object4);
        ((StringBuilder)serializable).append(", transportExecutorService=");
        ((StringBuilder)serializable).append((String)object3);
        ((StringBuilder)serializable).append(", appFlowProtoWrapper=");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(", eventCode=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", logVerifier=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append(", sendAsSemanticEvent=false}");
        return ((StringBuilder)serializable).toString();
    }
}

