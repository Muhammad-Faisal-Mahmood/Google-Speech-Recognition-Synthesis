/*
 * Decompiled with CFR 0.152.
 */
public final class kmh
extends klp {
    public final transient byte[][] e;
    public final transient int[] f;

    public kmh(byte[][] byArray, int[] nArray) {
        super(klp.a.b);
        this.e = byArray;
        this.f = nArray;
    }

    private final klp n() {
        return new klp(((klp)this).k());
    }

    private final Object writeReplace() {
        return this.n();
    }

    @Override
    public final byte a(int n2) {
        int n3 = this.e.length;
        kmp.x(this.f[n3 - 1], n2, 1L);
        int n4 = kmp.o(this, n2);
        n3 = n4 == 0 ? 0 : this.f[n4 - 1];
        int[] nArray = this.f;
        byte[][] byArray = this.e;
        int n5 = nArray[byArray.length + n4];
        return byArray[n4][n2 - n3 + n5];
    }

    @Override
    public final int b() {
        int n2 = this.e.length;
        return this.f[n2 - 1];
    }

    @Override
    public final String d() {
        return this.n().d();
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object != this) {
            if (object instanceof klp && ((klp)(object = (klp)object)).b() == ((klp)this).b() && ((klp)this).l((klp)object, ((klp)this).b())) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public final klp g() {
        return this.n().g();
    }

    @Override
    public final boolean h(int n2, byte[] byArray, int n3, int n4) {
        boolean bl2;
        block9: {
            boolean bl3;
            jse.e(byArray, "other");
            bl2 = bl3 = false;
            if (n2 >= 0) {
                bl2 = bl3;
                if (n2 <= ((klp)this).b() - n4) {
                    bl2 = bl3;
                    if (n3 >= 0) {
                        if (n3 > byArray.length - n4) {
                            bl2 = bl3;
                        } else {
                            int n5 = n4 + n2;
                            int n6 = kmp.o(this, n2);
                            n4 = n2;
                            n2 = n6;
                            while (n4 < n5) {
                                if (n2 == 0) {
                                    n2 = 0;
                                    n6 = 0;
                                } else {
                                    n6 = this.f[n2 - 1];
                                }
                                int[] nArray = this.f;
                                int n7 = nArray[n2];
                                int n8 = nArray[this.e.length + n2];
                                n7 = Math.min(n5, n7 - n6 + n6) - n4;
                                if (!kmp.y(this.e[n2], n8 + (n4 - n6), byArray, n3, n7)) {
                                    bl2 = bl3;
                                    break block9;
                                }
                                n3 += n7;
                                n4 += n7;
                                ++n2;
                            }
                            bl2 = true;
                        }
                    }
                }
            }
        }
        return bl2;
    }

    @Override
    public final int hashCode() {
        int n2 = this.c;
        if (n2 == 0) {
            int n3;
            byte[][] byArray = this.e;
            n2 = 1;
            int n4 = 0;
            for (int i2 = 0; i2 < (n3 = byArray.length); ++i2) {
                int[] nArray = this.f;
                Object object = this.e;
                int n5 = nArray[n3 + i2];
                int n6 = nArray[i2];
                object = object[i2];
                for (n3 = n5; n3 < n6 - n4 + n5; ++n3) {
                    n2 = n2 * 31 + object[n3];
                }
                n4 = n6;
            }
            this.c = n2;
        }
        return n2;
    }

    @Override
    public final byte[] j() {
        return ((klp)this).k();
    }

    @Override
    public final byte[] k() {
        byte[][] byArray;
        int n2;
        byte[] byArray2 = new byte[((klp)this).b()];
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < (n2 = (byArray = this.e).length); ++i2) {
            Object[] objectArray = this.f;
            int n5 = objectArray[n2 + i2];
            n2 = objectArray[i2];
            objectArray = byArray[i2];
            n3 = n2 - n3;
            jns.V((byte[])objectArray, byArray2, n4, n5, n5 + n3);
            n4 += n3;
            n3 = n2;
        }
        return byArray2;
    }

    @Override
    public final boolean l(klp klp2, int n2) {
        boolean bl2;
        block5: {
            jse.e(klp2, "other");
            int n3 = ((klp)this).b();
            bl2 = false;
            if (n3 - n2 >= 0) {
                n3 = kmp.o(this, 0);
                int n4 = 0;
                int n5 = 0;
                while (n4 < n2) {
                    int n6;
                    if (n3 == 0) {
                        n3 = 0;
                        n6 = 0;
                    } else {
                        n6 = this.f[n3 - 1];
                    }
                    int[] nArray = this.f;
                    int n7 = nArray[n3];
                    int n8 = nArray[this.e.length + n3];
                    n7 = Math.min(n2, n7 - n6 + n6) - n4;
                    if (klp2.h(n5, this.e[n3], n8 + (n4 - n6), n7)) {
                        n5 += n7;
                        n4 += n7;
                        ++n3;
                        continue;
                    }
                    break block5;
                }
                bl2 = true;
            }
        }
        return bl2;
    }

    @Override
    public final void m(klm klm2, int n2) {
        int n3 = kmp.o(this, 0);
        int n4 = 0;
        while (n4 < n2) {
            int n5;
            if (n3 == 0) {
                n3 = 0;
                n5 = 0;
            } else {
                n5 = this.f[n3 - 1];
            }
            Object object = this.f;
            int n6 = object[n3];
            int n7 = object[this.e.length + n3];
            n6 = Math.min(n2, n6 - n5 + n5) - n4;
            n5 = n7 + (n4 - n5);
            object = new kmf(this.e[n3], n5, n5 + n6, true);
            kmf kmf2 = klm2.a;
            if (kmf2 == null) {
                object.g = object;
                klm2.a = object.f = object.g;
            } else {
                kmf2 = kmf2.g;
                jse.b(kmf2);
                kmf2.d((kmf)object);
            }
            n4 += n6;
            ++n3;
        }
        klm2.b += (long)n2;
    }

    @Override
    public final String toString() {
        return this.n().toString();
    }
}

