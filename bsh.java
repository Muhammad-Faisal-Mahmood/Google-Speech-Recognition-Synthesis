/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class bsh {
    public final gzx a;
    public final int b;
    public final int c;
    public final int d;
    public final gzx e;

    public bsh() {
        throw null;
    }

    public bsh(gzx gzx2, int n2, int n3, int n4, gzx gzx3) {
        this.a = gzx2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = gzx3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bsh) {
            object = (bsh)object;
            if (fvd.z(this.a, ((bsh)object).a) && this.b == ((bsh)object).b && this.c == ((bsh)object).c && this.d == ((bsh)object).d && fvd.z(this.e, ((bsh)object).e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        gzx gzx2 = this.e;
        return ((((n2 ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ gzx2.hashCode();
    }

    public final String toString() {
        Serializable serializable = this.e;
        String string = ((Object)this.a).toString();
        String string2 = serializable.toString();
        serializable = new StringBuilder("SynthesisValue{audioBytes=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", sampleRateInHz=");
        ((StringBuilder)serializable).append(this.b);
        ((StringBuilder)serializable).append(", audioFormat=");
        ((StringBuilder)serializable).append(this.c);
        ((StringBuilder)serializable).append(", channelCount=");
        ((StringBuilder)serializable).append(this.d);
        ((StringBuilder)serializable).append(", timePoints=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

