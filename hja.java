/*
 * Decompiled with CFR 0.152.
 */
public final class hja
extends hjc {
    public hja(hiy hiy2, Character c2) {
        super(hiy2, c2);
        boolean bl2 = hiy2.a.length == 64;
        fxf.q(bl2);
    }

    public hja(String string, String string2, Character c2) {
        this(new hiy(string, string2.toCharArray()), c2);
    }

    @Override
    public final int a(byte[] object, CharSequence charSequence) {
        int n2 = (charSequence = ((hjd)this).e(charSequence)).length();
        if (this.b.c(n2)) {
            n2 = 0;
            int n3 = 0;
            while (n2 < charSequence.length()) {
                int n4 = this.b.b(charSequence.charAt(n2));
                int n5 = this.b.b(charSequence.charAt(n2 + 1));
                int n6 = n3 + 1;
                int n7 = n4 << 18 | n5 << 12;
                object[n3] = (byte)(n7 >>> 16);
                n4 = n2 + 2;
                if (n4 < charSequence.length()) {
                    hiy hiy2 = this.b;
                    n5 = n2 + 3;
                    n7 |= hiy2.b(charSequence.charAt(n4)) << 6;
                    n4 = n3 + 2;
                    object[n6] = (byte)(n7 >>> 8 & 0xFF);
                    if (n5 < charSequence.length()) {
                        hiy2 = this.b;
                        n2 += 4;
                        n6 = hiy2.b(charSequence.charAt(n5));
                        n3 += 3;
                        object[n4] = (byte)((n7 | n6) & 0xFF);
                        continue;
                    }
                    n3 = n4;
                    n2 = n5;
                    continue;
                }
                n2 = n4;
                n3 = n6;
            }
            return n3;
        }
        n2 = charSequence.length();
        object = new StringBuilder("Invalid input length ");
        ((StringBuilder)object).append(n2);
        throw new hjb(((StringBuilder)object).toString());
    }

    @Override
    public final void b(Appendable appendable, byte[] byArray, int n2) {
        int n3 = byArray.length;
        int n4 = 0;
        fxf.z(0, n2, n3);
        for (n3 = n2; n3 >= 3; n3 -= 3) {
            int n5 = byArray[n4];
            byte by2 = byArray[n4 + 1];
            byte by3 = byArray[n4 + 2];
            hiy hiy2 = this.b;
            n5 = (by2 & 0xFF) << 8 | (n5 & 0xFF) << 16 | by3 & 0xFF;
            appendable.append(hiy2.a(n5 >>> 18));
            appendable.append(this.b.a(n5 >>> 12 & 0x3F));
            appendable.append(this.b.a(n5 >>> 6 & 0x3F));
            appendable.append(this.b.a(n5 & 0x3F));
            n4 += 3;
        }
        if (n4 < n2) {
            this.f(appendable, byArray, n4, n2 - n4);
        }
    }
}

