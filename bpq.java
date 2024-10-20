/*
 * Decompiled with CFR 0.152.
 */
public final class bpq {
    public final String a;
    public final int b;
    public final int c;
    private final String d;
    private final int e;
    private final int f;

    public bpq() {
        throw null;
    }

    public bpq(String string, String string2, int n2, int n3, int n4, int n5) {
        if (string != null) {
            this.a = string;
            if (string2 != null) {
                this.d = string2;
                this.b = n2;
                this.e = n3;
                this.c = n4;
                this.f = n5;
                return;
            }
            throw new NullPointerException("Null modelName");
        }
        throw new NullPointerException("Null name");
    }

    public final boy a() {
        return new boy(this.a, this.d, this.b, this.e, this.c, this.f);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bpq) {
            object = (bpq)object;
            if (this.a.equals(((bpq)object).a) && this.d.equals(((bpq)object).d) && this.b == ((bpq)object).b && this.e == ((bpq)object).e && this.c == ((bpq)object).c && this.f == ((bpq)object).f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.b) * 1000003 ^ this.e) * 1000003 ^ this.c) * 1000003 ^ this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AiFeature{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", modelName=");
        stringBuilder.append(this.d);
        stringBuilder.append(", type=");
        stringBuilder.append(this.b);
        stringBuilder.append(", variant=");
        stringBuilder.append(this.e);
        stringBuilder.append(", id=");
        stringBuilder.append(this.c);
        stringBuilder.append(", version=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

