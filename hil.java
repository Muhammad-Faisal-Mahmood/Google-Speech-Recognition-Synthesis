/*
 * Decompiled with CFR 0.152.
 */
abstract class hil
implements hiq {
    public void a(char c2) {
        throw null;
    }

    public void d(byte[] byArray, int n2) {
        throw null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(charSequence.charAt(i2));
        }
    }

    @Override
    public final void f(byte[] byArray) {
        this.d(byArray, byArray.length);
    }
}

