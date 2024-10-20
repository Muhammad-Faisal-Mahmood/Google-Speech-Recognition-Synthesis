/*
 * Decompiled with CFR 0.152.
 */
public final class im {
    long a = 0L;
    im b;

    private final void h() {
        if (this.b == null) {
            this.b = new im();
        }
    }

    final int a(int n2) {
        im im2 = this.b;
        if (im2 == null) {
            if (n2 >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & (1L << n2) - 1L);
        }
        if (n2 < 64) {
            return Long.bitCount(this.a & (1L << n2) - 1L);
        }
        return im2.a(n2 - 64) + Long.bitCount(this.a);
    }

    final void b(int n2) {
        if (n2 >= 64) {
            im im2 = this.b;
            if (im2 != null) {
                im2.b(n2 - 64);
            }
            return;
        }
        this.a &= 1L << n2 ^ 0xFFFFFFFFFFFFFFFFL;
    }

    final void c(int n2, boolean bl2) {
        if (n2 >= 64) {
            this.h();
            this.b.c(n2 - 64, bl2);
            return;
        }
        long l2 = this.a;
        boolean bl3 = (Long.MIN_VALUE & l2) != 0L;
        long l3 = (1L << n2) - 1L;
        long l4 = l2 & (l3 ^ 0xFFFFFFFFFFFFFFFFL);
        this.a = l4 + l4 | l2 & l3;
        if (bl2) {
            this.e(n2);
        } else {
            this.b(n2);
        }
        if (!bl3 && this.b == null) {
            return;
        }
        this.h();
        this.b.c(0, bl3);
    }

    public final void d() {
        this.a = 0L;
        im im2 = this.b;
        if (im2 != null) {
            im2.d();
        }
    }

    public final void e(int n2) {
        if (n2 >= 64) {
            this.h();
            this.b.e(n2 - 64);
            return;
        }
        this.a |= 1L << n2;
    }

    final boolean f(int n2) {
        if (n2 >= 64) {
            this.h();
            return this.b.f(n2 - 64);
        }
        return (this.a & 1L << n2) != 0L;
    }

    final boolean g(int n2) {
        if (n2 >= 64) {
            this.h();
            return this.b.g(n2 - 64);
        }
        long l2 = this.a;
        long l3 = 1L << n2;
        boolean bl2 = (l2 & l3) != 0L;
        this.a = l2 &= l3 ^ 0xFFFFFFFFFFFFFFFFL;
        this.a = --l3 & l2 | Long.rotateRight((l3 ^ 0xFFFFFFFFFFFFFFFFL) & l2, 1);
        im im2 = this.b;
        if (im2 != null) {
            if (im2.f(0)) {
                this.e(63);
            }
            this.b.g(0);
        }
        return bl2;
    }

    public final String toString() {
        CharSequence charSequence;
        if (this.b == null) {
            charSequence = Long.toBinaryString(this.a);
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.b.toString());
            ((StringBuilder)charSequence).append("xx");
            ((StringBuilder)charSequence).append(Long.toBinaryString(this.a));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

