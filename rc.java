/*
 * Decompiled with CFR 0.152.
 */
public final class rc {
    public final boolean a;
    final String b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;
    public final int h;

    public rc(String string, int n2, Object object, boolean bl2) {
        this.b = string;
        this.h = n2;
        this.a = bl2;
        this.a(object);
    }

    public rc(rc rc2, Object object) {
        this.a = false;
        this.b = rc2.b;
        this.h = rc2.h;
        this.a(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Object object) {
        int n2 = this.h;
        if (n2 == 0) {
            throw null;
        }
        if (--n2 != 0) {
            if (n2 == 1) {
                this.d = ((Float)object).floatValue();
                return;
            }
            if (n2 != 2 && n2 != 3) {
                if (n2 == 4) {
                    this.e = (String)object;
                    return;
                }
                if (n2 == 5) {
                    this.f = (Boolean)object;
                    return;
                }
                if (n2 != 7) {
                    this.d = ((Float)object).floatValue();
                    return;
                }
            } else {
                this.g = (Integer)object;
                return;
            }
        }
        this.c = (Integer)object;
    }
}

