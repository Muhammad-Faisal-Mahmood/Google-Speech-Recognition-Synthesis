/*
 * Decompiled with CFR 0.152.
 */
final class hiz
extends hjc {
    final char[] a = new char[512];

    public hiz(hiy hiy2) {
        super(hiy2, null);
        int n2 = hiy2.a.length;
        boolean bl2 = n2 == 16;
        fxf.q(bl2);
        for (int i2 = 0; i2 < 256; ++i2) {
            this.a[i2] = hiy2.a(i2 >>> 4);
            this.a[i2 | 0x100] = hiy2.a(i2 & 0xF);
        }
    }

    @Override
    public final int a(byte[] object, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int n2 = 0;
            int n3 = 0;
            while (n2 < charSequence.length()) {
                object[n3] = (byte)(this.b.b(charSequence.charAt(n2)) << 4 | this.b.b(charSequence.charAt(n2 + 1)));
                n2 += 2;
                ++n3;
            }
            return n3;
        }
        int n4 = charSequence.length();
        object = new StringBuilder("Invalid input length ");
        ((StringBuilder)object).append(n4);
        throw new hjb(((StringBuilder)object).toString());
    }

    @Override
    public final void b(Appendable appendable, byte[] byArray, int n2) {
        int n3 = byArray.length;
        fxf.z(0, n2, n3);
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = byArray[i2] & 0xFF;
            appendable.append(this.a[n3]);
            appendable.append(this.a[n3 | 0x100]);
        }
    }
}

