/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class avx {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public avx(String string, String string2, boolean bl2, int n2, String string3, int n3) {
        jse.e(string, "name");
        jse.e(string2, "type");
        this.a = string;
        this.b = string2;
        this.c = bl2;
        this.d = n2;
        this.e = string3;
        this.f = n3;
        n2 = 5;
        if (string2 != null) {
            string = string2.toUpperCase(Locale.ROOT);
            jse.d(string, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (jse.F(string, "INT")) {
                n2 = 3;
            } else if (!(jse.F(string, "CHAR") || jse.F(string, "CLOB") || jse.F(string, "TEXT"))) {
                if (!jse.F(string, "BLOB")) {
                    n2 = !(jse.F(string, "REAL") || jse.F(string, "FLOA") || jse.F(string, "DOUB")) ? 1 : 4;
                }
            } else {
                n2 = 2;
            }
        }
        this.g = n2;
    }

    public final boolean a() {
        return this.d > 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        String string;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (!(object instanceof avx)) return false;
        boolean bl3 = this.a();
        if (!(bl3 != ((avx)(object = (avx)object)).a() || !jse.i(this.a, ((avx)object).a) || this.c != ((avx)object).c || this.f == 1 && ((avx)object).f == 2 && (string = this.e) != null && !wg.h(string, ((avx)object).e) || this.f == 2 && ((avx)object).f == 1 && (string = ((avx)object).e) != null && !wg.h(string, this.e) || this.f == ((avx)object).f && ((string = this.e) != null ? !wg.h(string, ((avx)object).e) : ((avx)object).e != null))) {
            if (this.g == ((avx)object).g) return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = true != this.c ? 1237 : 1231;
        return ((n2 * 31 + this.g) * 31 + n3) * 31 + this.d;
    }

    public final String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder("\n            |Column {\n            |   name = '");
        stringBuilder.append(this.a);
        stringBuilder.append("',\n            |   type = '");
        stringBuilder.append(this.b);
        stringBuilder.append("',\n            |   affinity = '");
        stringBuilder.append(this.g);
        stringBuilder.append("',\n            |   notNull = '");
        stringBuilder.append(this.c);
        stringBuilder.append("',\n            |   primaryKeyPosition = '");
        stringBuilder.append(this.d);
        stringBuilder.append("',\n            |   defaultValue = '");
        String string2 = string = this.e;
        if (string == null) {
            string2 = "undefined";
        }
        stringBuilder.append(string2);
        stringBuilder.append("'\n            |}\n        ");
        return jse.P(jse.Z(stringBuilder.toString()));
    }
}

