/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class fev {
    public final Optional a;
    public final Optional b;
    public final int c;
    public final int d;
    public final boolean e;
    private final int f;

    public fev() {
        throw null;
    }

    public fev(Optional optional, Optional optional2, int n2, int n3, int n4, boolean bl2) {
        this.a = optional;
        this.b = optional2;
        this.c = n2;
        this.d = n3;
        this.f = n4;
        this.e = bl2;
    }

    public static feu a() {
        feu feu2 = new feu(null);
        feu2.h(Optional.empty());
        feu2.e(Optional.empty());
        feu2.g(16000);
        feu2.c(1);
        feu2.d(2);
        feu2.f(true);
        return feu2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fev) {
            object = (fev)object;
            if (this.a.equals(((fev)object).a) && this.b.equals(((fev)object).b) && this.c == ((fev)object).c && this.d == ((fev)object).d && this.f == ((fev)object).f && this.e == ((fev)object).e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        int n4 = true != this.e ? 1237 : 1231;
        return (((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.f) * 1000003 ^ n4;
    }

    public final String toString() {
        Object object = this.b;
        String string = String.valueOf(this.a);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("AudioSourceParams{uri=");
        stringBuilder.append(string);
        stringBuilder.append(", fileDescriptor=");
        stringBuilder.append((String)object);
        stringBuilder.append(", samplingRate=");
        stringBuilder.append(this.c);
        stringBuilder.append(", channelCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", encoding=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isFromMic=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

