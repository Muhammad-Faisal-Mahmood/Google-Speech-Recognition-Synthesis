/*
 * Decompiled with CFR 0.152.
 */
public final class evx {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public evx(String string, int n2, int n3, int n4) {
        this.a = string;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof evx)) {
            return false;
        }
        object = (evx)object;
        if (!jse.i(this.a, ((evx)object).a)) {
            return false;
        }
        if (this.b != ((evx)object).b) {
            return false;
        }
        if (this.c != ((evx)object).c) {
            return false;
        }
        return this.d == ((evx)object).d;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Config(name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", encodingFormat=");
        stringBuilder.append(this.b);
        stringBuilder.append(", channelCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sampleRateHz=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

