/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class gsm
implements Iterator {
    public int a = 2;
    final CharSequence b;
    final gsy c;
    final boolean d;
    int e = 0;
    int f;
    private Object g;

    protected gsm(guf guf2, CharSequence charSequence) {
        this.c = guf2.a;
        this.d = guf2.b;
        this.f = Integer.MAX_VALUE;
        this.b = charSequence;
    }

    public abstract int a(int var1);

    public abstract int b(int var1);

    @Override
    public final boolean hasNext() {
        boolean bl2 = this.a != 4;
        fxf.A(bl2);
        int n2 = this.a;
        int n3 = n2 - 1;
        CharSequence charSequence = null;
        if (n2 != 0) {
            if (n3 != 0) {
                if (n3 != 2) {
                    block16: {
                        this.a = 4;
                        n2 = this.e;
                        while ((n3 = this.e) != -1) {
                            CharSequence charSequence2;
                            gsy gsy2;
                            int n4;
                            if ((n3 = this.b(n3)) == -1) {
                                n3 = this.b.length();
                                this.e = -1;
                                n4 = -1;
                            } else {
                                this.e = n4 = this.a(n3);
                            }
                            int n5 = n2;
                            if (n4 == n2) {
                                this.e = n3 = n4 + 1;
                                if (n3 <= this.b.length()) continue;
                                this.e = -1;
                                continue;
                            }
                            while (true) {
                                n2 = n3;
                                if (n5 >= n3) break;
                                n2 = n3;
                                if (!this.c.b(this.b.charAt(n5))) break;
                                ++n5;
                            }
                            while (n2 > n5 && (gsy2 = this.c).b((charSequence2 = this.b).charAt(n3 = n2 - 1))) {
                                n2 = n3;
                            }
                            if (this.d && n5 == n2) {
                                n2 = this.e;
                                continue;
                            }
                            n3 = this.f;
                            if (n3 == 1) {
                                n2 = this.b.length();
                                this.e = -1;
                                while (true) {
                                    n3 = n2;
                                    if (n2 > n5) {
                                        gsy2 = this.c;
                                        charSequence = this.b;
                                        n4 = n2 - 1;
                                        n3 = n2;
                                        if (gsy2.b(charSequence.charAt(n4))) {
                                            n2 = n4;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            } else {
                                this.f = n3 - 1;
                                n3 = n2;
                            }
                            charSequence = this.b.subSequence(n5, n3).toString();
                            break block16;
                        }
                        this.a = 3;
                    }
                    this.g = charSequence;
                    if (this.a != 3) {
                        this.a = 1;
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    public final Object next() {
        if (this.hasNext()) {
            this.a = 2;
            Object object = this.g;
            this.g = null;
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

