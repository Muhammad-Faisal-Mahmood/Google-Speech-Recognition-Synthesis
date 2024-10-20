/*
 * Decompiled with CFR 0.152.
 */
final class gua
extends gsm {
    final String g;

    public gua(guf guf2, CharSequence charSequence, String string) {
        this.g = string;
        super(guf2, charSequence);
    }

    @Override
    public final int a(int n2) {
        return n2 + this.g.length();
    }

    @Override
    public final int b(int n2) {
        int n3 = this.b.length();
        int n4 = this.g.length();
        block0: while (n2 <= n3 - n4) {
            for (int i2 = 0; i2 < n4; ++i2) {
                CharSequence charSequence = this.b;
                String string = this.g;
                if (charSequence.charAt(i2 + n2) == string.charAt(i2)) continue;
                ++n2;
                continue block0;
            }
            return n2;
        }
        return -1;
    }
}

