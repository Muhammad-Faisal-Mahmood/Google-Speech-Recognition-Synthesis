/*
 * Decompiled with CFR 0.152.
 */
public final class drw
implements dlv {
    public final boolean a;
    public final doc b;
    private final int c;
    private final int d;

    public drw() {
        throw null;
    }

    public drw(doc doc2) {
        this.d = 2;
        this.c = 10;
        this.b = doc2;
        this.a = true;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof drw) {
            object = (drw)object;
            int n2 = this.d;
            int n3 = ((drw)object).d;
            if (n2 != 0) {
                return n2 == n3 && this.c == ((drw)object).c && this.b.equals(((drw)object).b) && this.a == ((drw)object).a;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.d;
        a.E(n2);
        doc doc2 = this.b;
        int n3 = this.c;
        int n4 = doc2.hashCode();
        int n5 = true != this.a ? 1237 : 1231;
        return ((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("TikTokTraceConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.d));
        stringBuilder.append(", rateLimitPerSecond=");
        stringBuilder.append(this.c);
        stringBuilder.append(", dynamicSampler=");
        stringBuilder.append(string);
        stringBuilder.append(", recordTimerDuration=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sendEmptyTraces=false}");
        return stringBuilder.toString();
    }
}

