/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class gtn {
    private final String a;
    private final gtm b;
    private gtm c;
    private boolean d;

    public gtn(String string) {
        gtm gtm2;
        this.b = gtm2 = new gtm();
        this.c = gtm2;
        this.d = false;
        fxf.K(string);
        this.a = string;
    }

    private final gtm h() {
        gtm gtm2;
        this.c.c = gtm2 = new gtm();
        this.c = gtm2;
        return gtm2;
    }

    public final void a(Object object) {
        this.h().b = object;
    }

    public final void b(String string, Object object) {
        gtm gtm2 = this.h();
        gtm2.b = object;
        gtm2.a = string;
    }

    public final void c(String string, Object object) {
        gtl gtl2 = new gtl();
        this.c.c = gtl2;
        this.c = gtl2;
        gtl2.b = object;
        gtl2.a = string;
    }

    public final void d() {
        this.d = true;
    }

    public final void e(String string, int n2) {
        this.c(string, String.valueOf(n2));
    }

    public final void f(String string, long l2) {
        this.c(string, String.valueOf(l2));
    }

    public final void g(String string, boolean bl2) {
        this.c(string, String.valueOf(bl2));
    }

    public final String toString() {
        boolean bl2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append(this.a);
        stringBuilder.append('{');
        gtm gtm2 = this.b.c;
        String string = "";
        while (gtm2 != null) {
            String string2;
            block8: {
                Object object;
                block7: {
                    boolean bl3 = gtm2 instanceof gtl;
                    object = gtm2.b;
                    if (bl3 || object != null) break block7;
                    string2 = string;
                    if (bl2) break block8;
                }
                stringBuilder.append(string);
                string2 = gtm2.a;
                if (string2 != null) {
                    stringBuilder.append(string2);
                    stringBuilder.append('=');
                }
                if (object != null && object.getClass().isArray()) {
                    string2 = Arrays.deepToString(new Object[]{object});
                    stringBuilder.append(string2, 1, string2.length() - 1);
                } else {
                    stringBuilder.append(object);
                }
                string2 = ", ";
            }
            gtm2 = gtm2.c;
            string = string2;
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

