/*
 * Decompiled with CFR 0.152.
 */
public final class fgc {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final fgs e;
    public final boolean f;
    public final int g;
    private final int h;
    private final boolean i;

    public fgc() {
        throw null;
    }

    public fgc(int n2, String string, String string2, int n3, boolean bl2, boolean bl3, boolean bl4, fgs fgs2, boolean bl5) {
        this.h = n2;
        this.a = string;
        this.b = string2;
        this.g = n3;
        this.c = bl2;
        this.i = bl3;
        this.d = bl4;
        this.e = fgs2;
        this.f = bl5;
    }

    public static fgb a() {
        fgb fgb2 = new fgb();
        fgb2.c(-1);
        fgb2.b("");
        fgb2.h("");
        fgb2.j(1);
        fgb2.f(false);
        fgb2.e(false);
        fgb2.g(false);
        fgb2.d(fgs.a);
        fgb2.i(false);
        return fgb2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fgc) {
            object = (fgc)object;
            if (this.h == ((fgc)object).h && this.a.equals(((fgc)object).a) && this.b.equals(((fgc)object).b)) {
                int n2 = this.g;
                int n3 = ((fgc)object).g;
                if (n2 != 0) {
                    if (n2 == n3 && this.c == ((fgc)object).c && this.i == ((fgc)object).i && this.d == ((fgc)object).d && this.e.equals(((fgc)object).e) && this.f == ((fgc)object).f) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.h;
        int n3 = this.a.hashCode();
        int n4 = this.b.hashCode();
        int n5 = this.g;
        a.L(n5);
        boolean bl2 = this.d;
        int n6 = this.e.hashCode();
        int n7 = 1237;
        int n8 = true != bl2 ? 1237 : 1231;
        int n9 = true != this.i ? 1237 : 1231;
        int n10 = true != this.c ? 1237 : 1231;
        if (this.f) {
            n7 = 1231;
        }
        return ((((((((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n10) * 1000003 ^ n9) * 1000003 ^ n8) * 1000003 ^ n6) * 1000003 ^ n7;
    }

    public final String toString() {
        int n2 = this.g;
        String string = n2 != 0 ? fde.c(n2) : "null";
        String string2 = String.valueOf(this.e);
        StringBuilder stringBuilder = new StringBuilder("RecognitionStartConfig{callingUid=");
        stringBuilder.append(this.h);
        stringBuilder.append(", callingPackageName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.b);
        stringBuilder.append(", recognizerMode=");
        stringBuilder.append(string);
        stringBuilder.append(", isExternalAudioSource=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isSmartDictation=");
        stringBuilder.append(this.i);
        stringBuilder.append(", enableIncognitoMode=");
        stringBuilder.append(this.d);
        stringBuilder.append(", clientType=");
        stringBuilder.append(string2);
        stringBuilder.append(", preferOffline=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

