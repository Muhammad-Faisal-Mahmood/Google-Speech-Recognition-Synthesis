/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.math.RoundingMode;

public class hjc
extends hjd {
    public final hiy b;
    public final Character c;

    public hjc(hiy hiy2, Character c2) {
        boolean bl2;
        this.b = hiy2;
        boolean bl3 = bl2 = true;
        if (c2 != null) {
            c2.charValue();
            bl3 = bl2;
            if (hiy2.f[61] != -1) {
                bl3 = false;
            }
        }
        fxf.v(bl3, "Padding character %s was already in alphabet", c2);
        this.c = c2;
    }

    public hjc(String string, String string2, Character c2) {
        this(new hiy(string, string2.toCharArray()), c2);
    }

    @Override
    public int a(byte[] object, CharSequence object2) {
        CharSequence charSequence = ((hjd)this).e((CharSequence)object2);
        int n2 = charSequence.length();
        if (this.b.c(n2)) {
            int n3 = 0;
            for (n2 = 0; n2 < charSequence.length(); n2 += this.b.d) {
                int n4;
                long l2 = 0L;
                int n5 = 0;
                int n6 = 0;
                while (true) {
                    long l3;
                    object2 = this.b;
                    if (n5 >= ((hiy)object2).d) break;
                    l2 = l3 = l2 << ((hiy)object2).c;
                    n4 = n6;
                    if (n2 + n5 < charSequence.length()) {
                        l2 = l3 | (long)this.b.b(charSequence.charAt(n6 + n2));
                        n4 = n6 + 1;
                    }
                    ++n5;
                    n6 = n4;
                }
                int n7 = ((hiy)object2).e;
                n4 = ((hiy)object2).c;
                n5 = (n7 - 1) * 8;
                while (n5 >= n7 * 8 - n6 * n4) {
                    object[n3] = (byte)(l2 >>> n5 & 0xFFL);
                    n5 -= 8;
                    ++n3;
                }
            }
            return n3;
        }
        n2 = charSequence.length();
        object = new StringBuilder("Invalid input length ");
        ((StringBuilder)object).append(n2);
        throw new hjb(((StringBuilder)object).toString());
    }

    @Override
    public void b(Appendable appendable, byte[] byArray, int n2) {
        int n3 = byArray.length;
        fxf.z(0, n2, n3);
        for (int i2 = 0; i2 < n2; i2 += this.b.e) {
            this.f(appendable, byArray, i2, Math.min(this.b.e, n2 - i2));
        }
    }

    @Override
    public final int c(int n2) {
        return (int)(((long)this.b.c * (long)n2 + 7L) / 8L);
    }

    @Override
    public final int d(int n2) {
        hiy hiy2 = this.b;
        n2 = hhk.av(n2, hiy2.e, RoundingMode.CEILING);
        return hiy2.d * n2;
    }

    @Override
    public final CharSequence e(CharSequence charSequence) {
        int n2;
        fxf.K(charSequence);
        Character c2 = this.c;
        if (c2 == null) {
            return charSequence;
        }
        c2.charValue();
        int n3 = charSequence.length();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (charSequence.charAt(n2) == '=') continue;
        }
        return charSequence.subSequence(0, n2 + 1);
    }

    public final boolean equals(Object object) {
        if (object instanceof hjc) {
            object = (hjc)object;
            if (this.b.equals(((hjc)object).b) && Objects.equals(this.c, ((hjc)object).c)) {
                return true;
            }
        }
        return false;
    }

    final void f(Appendable appendable, byte[] object, int n2, int n3) {
        fxf.z(n2, n2 + n3, ((byte[])object).length);
        int n4 = this.b.e;
        int n5 = 0;
        boolean bl2 = n3 <= n4;
        fxf.q(bl2);
        long l2 = 0L;
        for (n4 = 0; n4 < n3; ++n4) {
            l2 = (l2 | (long)(object[n2 + n4] & 0xFF)) << 8;
        }
        hiy hiy2 = this.b;
        for (n2 = n5; n2 < n3 * 8; n2 += this.b.c) {
            n4 = hiy2.c;
            object = this.b;
            appendable.append(((hiy)object).a((int)(l2 >>> (n3 + 1) * 8 - n4 - n2) & ((hiy)object).b));
        }
        if (this.c != null) {
            while (n2 < this.b.e * 8) {
                this.c.charValue();
                appendable.append('=');
                n2 += this.b.c;
            }
        }
    }

    public final int hashCode() {
        Character c2 = this.c;
        int n2 = this.b.hashCode();
        return Objects.hashCode(c2) ^ n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        stringBuilder.append(this.b);
        if (8 % this.b.c != 0) {
            if (this.c == null) {
                stringBuilder.append(".omitPadding()");
            } else {
                stringBuilder.append(".withPadChar('");
                stringBuilder.append(this.c);
                stringBuilder.append("')");
            }
        }
        return stringBuilder.toString();
    }
}

