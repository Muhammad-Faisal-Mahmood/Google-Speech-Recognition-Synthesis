/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class eyz {
    public static final hei a = hei.m("com/google/android/libraries/speech/encoding/CodecConfig");
    public final icq b;
    public final gto c;
    public final gto d;
    public final gto e;

    public eyz() {
        throw null;
    }

    public eyz(icq icq2, gto gto2, gto gto3, gto gto4) {
        this.b = icq2;
        this.c = gto2;
        this.d = gto3;
        this.e = gto4;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof eyz) {
            object = (eyz)object;
            if (this.b.equals(((eyz)object).b) && this.c.equals(((eyz)object).c) && this.d.equals(((eyz)object).d) && this.e.equals(((eyz)object).e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        Serializable serializable = this.e;
        Object object = this.d;
        Object object2 = this.c;
        String string = String.valueOf(this.b);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        String string2 = String.valueOf(serializable);
        serializable = new StringBuilder("CodecConfig{format=");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(", outputBitRate=");
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(", sampleRateHz=");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(", channelCount=");
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append("}");
        return ((StringBuilder)serializable).toString();
    }
}

