/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

final class art
extends ars {
    private int a;
    private boolean o;
    private aqg p;
    private diz q;
    private bzb r;

    @Override
    protected final long a(aga aga2) {
        Object object = aga2.a;
        int n2 = 0;
        int n3 = object[0];
        if ((n3 & 1) != 1) {
            int n4;
            object = this.q;
            abr.j(object);
            int n5 = object.a;
            n5 = !((gfb[])object.e)[n3 >> 1 & 255 >>> 8 - n5].a ? ((aqg)object.d).e : ((aqg)object.d).f;
            if (this.o) {
                n2 = (this.a + n5) / 4;
            }
            if ((n4 = aga2.b()) < (n3 = aga2.c + 4)) {
                object = Arrays.copyOf(aga2.a, n3);
                aga2.t((byte[])object, ((byte[])object).length);
            } else {
                aga2.u(n3);
            }
            long l2 = n2;
            object = aga2.a;
            n2 = aga2.c;
            object[n2 - 4] = (byte)(l2 & 0xFFL);
            object[n2 - 3] = (byte)(l2 >>> 8 & 0xFFL);
            object[n2 - 2] = (byte)(l2 >>> 16 & 0xFFL);
            object[n2 - 1] = (byte)(l2 >>> 24 & 0xFFL);
            this.o = true;
            this.a = n5;
            return l2;
        }
        return -1L;
    }

    @Override
    protected final void b(boolean bl2) {
        super.b(bl2);
        if (bl2) {
            this.q = null;
            this.p = null;
            this.r = null;
        }
        this.a = 0;
        this.o = false;
    }

    @Override
    protected final boolean c(aga object, long l2, arq arq2) {
        block48: {
            block55: {
                Object object2;
                Object object3;
                Object object4;
                block52: {
                    int n2;
                    boolean bl2;
                    int n3;
                    int n4;
                    int n5;
                    aqf aqf2;
                    int n6;
                    int n7;
                    int n8;
                    block46: {
                        block47: {
                            block51: {
                                block50: {
                                    block49: {
                                        int n9;
                                        if (this.q != null) break block48;
                                        object4 = this.p;
                                        if (object4 != null) break block49;
                                        wd.s(1, (aga)object, false);
                                        ((aga)object).e();
                                        int n10 = ((aga)object).h();
                                        int n11 = ((aga)object).e();
                                        int n12 = ((aga)object).d();
                                        if (n12 <= 0) {
                                            n12 = -1;
                                        }
                                        if ((n9 = ((aga)object).d()) <= 0) {
                                            n9 = -1;
                                        }
                                        ((aga)object).d();
                                        int n13 = ((aga)object).h();
                                        int n14 = (int)Math.pow(2.0, n13 & 0xF);
                                        n13 = (int)Math.pow(2.0, (n13 & 0xF0) >> 4);
                                        ((aga)object).h();
                                        this.p = new aqg(n10, n11, n12, n9, n14, n13, Arrays.copyOf(((aga)object).a, ((aga)object).c));
                                        break block50;
                                    }
                                    object3 = this.r;
                                    if (object3 != null) break block51;
                                    this.r = wd.w((aga)object, true, true);
                                }
                                object = null;
                                break block52;
                            }
                            n8 = ((aga)object).c;
                            object2 = new byte[n8];
                            System.arraycopy(((aga)object).a, 0, object2, 0, n8);
                            n7 = object4.a;
                            wd.s(5, (aga)object, false);
                            n6 = ((aga)object).h();
                            aqf2 = new aqf(((aga)object).a);
                            aqf2.b(((aga)object).b * 8);
                            n8 = 0;
                            object = object4;
                            while (true) {
                                block54: {
                                    block53: {
                                        n5 = 2;
                                        if (n8 >= n6 + 1) break block46;
                                        if (aqf2.a(24) != 5653314) break block47;
                                        n4 = aqf2.a(16);
                                        n3 = aqf2.a(24);
                                        if (!aqf2.c()) {
                                            bl2 = aqf2.c();
                                            for (n2 = 0; n2 < n3; ++n2) {
                                                if (bl2) {
                                                    if (!aqf2.c()) continue;
                                                    aqf2.b(5);
                                                    continue;
                                                }
                                                aqf2.b(5);
                                            }
                                        } else {
                                            aqf2.b(5);
                                            for (n2 = 0; n2 < n3; n2 += aqf2.a(wd.q(n3 - n2))) {
                                            }
                                        }
                                        if ((n2 = aqf2.a(4)) > 2) break;
                                        if (n2 == 1) break block53;
                                        if (n2 != 2) break block54;
                                        n2 = n5;
                                    }
                                    aqf2.b(32);
                                    aqf2.b(32);
                                    n5 = aqf2.a(4);
                                    aqf2.b(1);
                                    if (n2 == 1) {
                                        if (n4 != 0) {
                                            l2 = n3;
                                            double d2 = n4;
                                            l2 = (long)Math.floor(Math.pow(l2, 1.0 / d2));
                                        } else {
                                            l2 = 0L;
                                        }
                                    } else {
                                        l2 = (long)n4 * (long)n3;
                                    }
                                    aqf2.b((int)(l2 * (long)(n5 + 1)));
                                }
                                ++n8;
                            }
                            throw new aem(a.af(n2, "lookup type greater than 2 not decodable: "), null, true, 1);
                        }
                        n8 = aqf2.a;
                        n2 = aqf2.b;
                        object = new StringBuilder("expected code book to start with [0x56, 0x43, 0x42] at ");
                        ((StringBuilder)object).append(n8 * 8 + n2);
                        throw new aem(((StringBuilder)object).toString(), null, true, 1);
                    }
                    n2 = aqf2.a(6);
                    for (n8 = 0; n8 < n2 + 1; ++n8) {
                        if (aqf2.a(16) == 0) {
                            continue;
                        }
                        throw new aem("placeholder of time domain transforms not zeroed out", null, true, 1);
                    }
                    n8 = aqf2.a(6) + 1;
                    block4: for (n2 = 0; n2 < n8; ++n2) {
                        n5 = aqf2.a(16);
                        if (n5 != 0) {
                            if (n5 == 1) {
                                int n15 = aqf2.a(5);
                                object4 = new int[n15];
                                n5 = -1;
                                for (n6 = 0; n6 < n15; ++n6) {
                                    n3 = aqf2.a(4);
                                    object4[n6] = n3;
                                    n4 = n5;
                                    if (n3 > n5) {
                                        n4 = n3;
                                    }
                                    n5 = n4;
                                }
                                n4 = n5 + 1;
                                int[] nArray = new int[n4];
                                for (n5 = 0; n5 < n4; ++n5) {
                                    nArray[n5] = aqf2.a(3) + 1;
                                    n3 = aqf2.a(2);
                                    if (n3 > 0) {
                                        aqf2.b(8);
                                    }
                                    for (n6 = 0; n6 < 1 << n3; ++n6) {
                                        aqf2.b(8);
                                    }
                                }
                                n5 = n8;
                                aqf2.b(2);
                                int n16 = aqf2.a(4);
                                n6 = 0;
                                n3 = 0;
                                n4 = 0;
                                while (true) {
                                    n8 = n5;
                                    if (n6 >= n15) continue block4;
                                    n3 += nArray[object4[n6]];
                                    while (n4 < n3) {
                                        aqf2.b(n16);
                                        ++n4;
                                    }
                                    ++n6;
                                }
                            }
                            throw new aem(a.af(n5, "floor type greater than 1 not decodable: "), null, true, 1);
                        }
                        n5 = n8;
                        aqf2.b(8);
                        aqf2.b(16);
                        aqf2.b(16);
                        aqf2.b(6);
                        aqf2.b(8);
                        n4 = aqf2.a(4);
                        n6 = 0;
                        while (true) {
                            n8 = n5;
                            if (n6 >= n4 + 1) continue block4;
                            aqf2.b(8);
                            ++n6;
                        }
                    }
                    n6 = aqf2.a(6);
                    for (n8 = 0; n8 < n6 + 1; ++n8) {
                        if (aqf2.a(16) <= 2) {
                            aqf2.b(24);
                            aqf2.b(24);
                            aqf2.b(24);
                            n4 = aqf2.a(6) + 1;
                            aqf2.b(8);
                            object4 = new int[n4];
                            for (n2 = 0; n2 < n4; ++n2) {
                                n3 = aqf2.a(3);
                                n5 = aqf2.c() ? aqf2.a(5) : 0;
                                object4[n2] = (gfb)(n5 * 8 + n3);
                            }
                            for (n2 = 0; n2 < n4; ++n2) {
                                for (n5 = 0; n5 < 8; ++n5) {
                                    if ((object4[n2] & 1 << n5) == 0) continue;
                                    aqf2.b(8);
                                }
                            }
                            continue;
                        }
                        throw new aem("residueType greater than 2 is not decodable", null, true, 1);
                    }
                    n6 = aqf2.a(6);
                    for (n8 = 0; n8 < n6 + 1; ++n8) {
                        n2 = aqf2.a(16);
                        if (n2 != 0) {
                            afx.b("VorbisUtil", a.af(n2, "mapping type other than 0 not supported: "));
                            continue;
                        }
                        n2 = aqf2.c() ? aqf2.a(4) + 1 : 1;
                        if (aqf2.c()) {
                            n4 = aqf2.a(8);
                            for (n5 = 0; n5 < n4 + 1; ++n5) {
                                n3 = n7 - 1;
                                aqf2.b(wd.q(n3));
                                aqf2.b(wd.q(n3));
                            }
                        }
                        if (aqf2.a(2) == 0) {
                            if (n2 > 1) {
                                for (n5 = 0; n5 < n7; ++n5) {
                                    aqf2.b(4);
                                }
                            }
                            for (n5 = 0; n5 < n2; ++n5) {
                                aqf2.b(8);
                                aqf2.b(8);
                                aqf2.b(8);
                            }
                            continue;
                        }
                        throw new aem("to reserved bits must be zero after mapping coupling steps", null, true, 1);
                    }
                    n2 = aqf2.a(6);
                    n5 = n2 + 1;
                    object4 = new gfb[n5];
                    for (n8 = 0; n8 < n5; ++n8) {
                        bl2 = aqf2.c();
                        aqf2.a(16);
                        aqf2.a(16);
                        aqf2.a(8);
                        object4[n8] = new gfb(bl2);
                    }
                    if (!aqf2.c()) break block55;
                    object = new diz((aqg)object, (bzb)object3, (byte[])object2, (gfb[])object4, wd.q(n2));
                }
                this.q = object;
                if (object == null) {
                    return true;
                }
                object4 = new ArrayList();
                object3 = (aqg)((diz)object).d;
                object4.add(((aqg)object3).g);
                object4.add(((diz)object).c);
                object = wd.r(gzx.p((Object[])((bzb)((diz)object).b).a));
                object2 = new adt();
                ((adt)object2).a("audio/vorbis");
                ((adt)object2).h = ((aqg)object3).d;
                ((adt)object2).i = ((aqg)object3).c;
                ((adt)object2).B = ((aqg)object3).a;
                ((adt)object2).C = ((aqg)object3).b;
                ((adt)object2).p = object4;
                ((adt)object2).k = object;
                arq2.a = new adu((adt)object2);
                return true;
            }
            throw new aem("framing bit after modes not set as expected", null, true, 1);
        }
        abr.i(arq2.a);
        return false;
    }

    @Override
    protected final void g(long l2) {
        this.h = l2;
        int n2 = 0;
        boolean bl2 = l2 != 0L;
        this.o = bl2;
        aqg aqg2 = this.p;
        if (aqg2 != null) {
            n2 = aqg2.e;
        }
        this.a = n2;
    }
}

