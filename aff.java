/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class aff {
    public static final aff a = new aff(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;

    public aff(int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        n2 = agf.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aff)) {
            return false;
        }
        object = (aff)object;
        return this.b == ((aff)object).b && this.c == ((aff)object).c && this.d == ((aff)object).d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioFormat[sampleRate=");
        stringBuilder.append(this.b);
        stringBuilder.append(", channelCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", encoding=");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

