/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.List;

public final class hvz {
    public int a;
    public int b;
    public final Object c;
    private int d;

    public hvz(View view) {
        this.c = view;
    }

    private hvz(hvy hvy2) {
        this.b = 0;
        Object object = hxl.b;
        this.c = hvy2;
        object = hvy2;
        hvy2.d = this;
    }

    private final void T(Object object, hyu hyu2, hwj hwj2) {
        block3: {
            int n2 = this.d;
            this.d = hzo.c(hzo.a(this.a), 4);
            try {
                hyu2.l(object, this, hwj2);
                int n3 = this.a;
                int n4 = this.d;
                if (n3 != n4) break block3;
                this.d = n2;
                return;
            }
            catch (Throwable throwable) {
                this.d = n2;
                throw throwable;
            }
        }
        object = new hxn("Failed to parse the message.");
        throw object;
    }

    private final void U(Object object, hyu hyu2, hwj hwj2) {
        hvy hvy2 = (hvy)this.c;
        int n2 = hvy2.n();
        if (hvy2.a < hvy2.b) {
            n2 = hvy2.e(n2);
            hvy2 = (hvy)this.c;
            ++hvy2.a;
            hyu2.l(object, this, hwj2);
            ((hvy)this.c).z(0);
            object = (hvy)this.c;
            --((hvy)object).a;
            ((hvy)object).A(n2);
            return;
        }
        throw new hxn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void V(int n2) {
        if (((hvy)this.c).d() == n2) {
            return;
        }
        throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private static final void W(int n2) {
        if ((n2 & 3) == 0) {
            return;
        }
        throw new hxn("Failed to parse the message.");
    }

    private static final void X(int n2) {
        if ((n2 & 7) == 0) {
            return;
        }
        throw new hxn("Failed to parse the message.");
    }

    public static hvz p(hvy hvy2) {
        hvz hvz2 = hvy2.d;
        if (hvz2 != null) {
            return hvz2;
        }
        return new hvz(hvy2);
    }

    public final void A(List object) {
        block10: {
            int n2;
            if (object instanceof hww) {
                hww hww2 = (hww)object;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        object = (hvy)this.c;
                        n2 = ((hvy)object).n();
                        n2 = ((hvy)object).d() + n2;
                        do {
                            hww2.g(((hvy)this.c).f());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    hww2.g(((hvy)this.c).f());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            object.add(((hvy)this.c).f());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    object.add(((hvy)this.c).f());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    public final void B(List list) {
        block6: {
            int n2;
            block11: {
                block12: {
                    block10: {
                        block7: {
                            block8: {
                                block9: {
                                    if (!(list instanceof hww)) break block7;
                                    list = (hww)list;
                                    n2 = hzo.b(this.a);
                                    if (n2 == 2) break block8;
                                    if (n2 != 5) break block9;
                                    do {
                                        ((hww)list).g(((hvy)this.c).g());
                                        if (((hvy)this.c).C()) break block6;
                                    } while ((n2 = ((hvy)this.c).m()) == this.a);
                                    break block10;
                                }
                                throw new hxm();
                            }
                            int n3 = ((hvy)this.c).n();
                            hvz.W(n3);
                            n2 = ((hvy)this.c).d();
                            do {
                                ((hww)list).g(((hvy)this.c).g());
                            } while (((hvy)this.c).d() < n2 + n3);
                            break block6;
                        }
                        n2 = hzo.b(this.a);
                        if (n2 == 2) break block11;
                        if (n2 != 5) break block12;
                        do {
                            list.add(((hvy)this.c).g());
                            if (((hvy)this.c).C()) break block6;
                        } while ((n2 = ((hvy)this.c).m()) == this.a);
                    }
                    this.b = n2;
                    return;
                }
                throw new hxm();
            }
            n2 = ((hvy)this.c).n();
            hvz.W(n2);
            int n4 = ((hvy)this.c).d();
            do {
                list.add(((hvy)this.c).g());
            } while (((hvy)this.c).d() < n4 + n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void C(List list) {
        int n2;
        if (!(list instanceof hxw)) {
            n2 = hzo.b(this.a);
            if (n2 != 1) {
                if (n2 != 2) throw new hxm();
                int n3 = ((hvy)this.c).n();
                hvz.X(n3);
                n2 = ((hvy)this.c).d();
                do {
                    list.add(((hvy)this.c).o());
                } while (((hvy)this.c).d() < n2 + n3);
                return;
            }
            do {
                list.add(((hvy)this.c).o());
                if (((hvy)this.c).C()) return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        } else {
            list = (hxw)list;
            n2 = hzo.b(this.a);
            if (n2 != 1) {
                if (n2 != 2) throw new hxm();
                int n4 = ((hvy)this.c).n();
                hvz.X(n4);
                n2 = ((hvy)this.c).d();
                do {
                    ((hxw)list).e(((hvy)this.c).o());
                } while (((hvy)this.c).d() < n2 + n4);
                return;
            }
            do {
                ((hxw)list).e(((hvy)this.c).o());
                if (!((hvy)this.c).C()) continue;
                return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        }
        this.b = n2;
    }

    public final void D(List list) {
        block6: {
            int n2;
            block11: {
                block12: {
                    block10: {
                        block7: {
                            block8: {
                                block9: {
                                    if (!(list instanceof hwn)) break block7;
                                    list = (hwn)list;
                                    n2 = hzo.b(this.a);
                                    if (n2 == 2) break block8;
                                    if (n2 != 5) break block9;
                                    do {
                                        ((hwn)list).g(((hvy)this.c).c());
                                        if (((hvy)this.c).C()) break block6;
                                    } while ((n2 = ((hvy)this.c).m()) == this.a);
                                    break block10;
                                }
                                throw new hxm();
                            }
                            n2 = ((hvy)this.c).n();
                            hvz.W(n2);
                            int n3 = ((hvy)this.c).d();
                            do {
                                ((hwn)list).g(((hvy)this.c).c());
                            } while (((hvy)this.c).d() < n3 + n2);
                            break block6;
                        }
                        n2 = hzo.b(this.a);
                        if (n2 == 2) break block11;
                        if (n2 != 5) break block12;
                        do {
                            list.add(Float.valueOf(((hvy)this.c).c()));
                            if (((hvy)this.c).C()) break block6;
                        } while ((n2 = ((hvy)this.c).m()) == this.a);
                    }
                    this.b = n2;
                    return;
                }
                throw new hxm();
            }
            int n4 = ((hvy)this.c).n();
            hvz.W(n4);
            n2 = ((hvy)this.c).d();
            do {
                list.add(Float.valueOf(((hvy)this.c).c()));
            } while (((hvy)this.c).d() < n2 + n4);
        }
    }

    public final void E(List list) {
        block10: {
            int n2;
            if (list instanceof hww) {
                list = (hww)list;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            ((hww)list).g(((hvy)this.c).h());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    ((hww)list).g(((hvy)this.c).h());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy3 = (hvy)this.c;
                        n2 = hvy3.n();
                        n2 = hvy3.d() + n2;
                        do {
                            list.add(((hvy)this.c).h());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    list.add(((hvy)this.c).h());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    public final void F(List object) {
        block10: {
            int n2;
            if (object instanceof hxw) {
                hxw hxw2 = (hxw)object;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        object = (hvy)this.c;
                        n2 = ((hvy)object).n();
                        n2 = ((hvy)object).d() + n2;
                        do {
                            hxw2.e(((hvy)this.c).p());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    hxw2.e(((hvy)this.c).p());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            object.add(((hvy)this.c).p());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    object.add(((hvy)this.c).p());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    public final void G(List list) {
        block6: {
            int n2;
            block11: {
                block12: {
                    block10: {
                        block7: {
                            block8: {
                                block9: {
                                    if (!(list instanceof hww)) break block7;
                                    list = (hww)list;
                                    n2 = hzo.b(this.a);
                                    if (n2 == 2) break block8;
                                    if (n2 != 5) break block9;
                                    do {
                                        ((hww)list).g(((hvy)this.c).k());
                                        if (((hvy)this.c).C()) break block6;
                                    } while ((n2 = ((hvy)this.c).m()) == this.a);
                                    break block10;
                                }
                                throw new hxm();
                            }
                            n2 = ((hvy)this.c).n();
                            hvz.W(n2);
                            int n3 = ((hvy)this.c).d();
                            do {
                                ((hww)list).g(((hvy)this.c).k());
                            } while (((hvy)this.c).d() < n3 + n2);
                            break block6;
                        }
                        n2 = hzo.b(this.a);
                        if (n2 == 2) break block11;
                        if (n2 != 5) break block12;
                        do {
                            list.add(((hvy)this.c).k());
                            if (((hvy)this.c).C()) break block6;
                        } while ((n2 = ((hvy)this.c).m()) == this.a);
                    }
                    this.b = n2;
                    return;
                }
                throw new hxm();
            }
            n2 = ((hvy)this.c).n();
            hvz.W(n2);
            int n4 = ((hvy)this.c).d();
            do {
                list.add(((hvy)this.c).k());
            } while (((hvy)this.c).d() < n4 + n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void H(List list) {
        int n2;
        if (!(list instanceof hxw)) {
            n2 = hzo.b(this.a);
            if (n2 != 1) {
                if (n2 != 2) throw new hxm();
                n2 = ((hvy)this.c).n();
                hvz.X(n2);
                int n3 = ((hvy)this.c).d();
                do {
                    list.add(((hvy)this.c).t());
                } while (((hvy)this.c).d() < n3 + n2);
                return;
            }
            do {
                list.add(((hvy)this.c).t());
                if (((hvy)this.c).C()) return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        } else {
            list = (hxw)list;
            n2 = hzo.b(this.a);
            if (n2 != 1) {
                if (n2 != 2) throw new hxm();
                int n4 = ((hvy)this.c).n();
                hvz.X(n4);
                n2 = ((hvy)this.c).d();
                do {
                    ((hxw)list).e(((hvy)this.c).t());
                } while (((hvy)this.c).d() < n2 + n4);
                return;
            }
            do {
                ((hxw)list).e(((hvy)this.c).t());
                if (!((hvy)this.c).C()) continue;
                return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        }
        this.b = n2;
    }

    public final void I(List object) {
        block10: {
            int n2;
            if (object instanceof hww) {
                hww hww2 = (hww)object;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        object = (hvy)this.c;
                        n2 = ((hvy)object).n();
                        n2 = ((hvy)object).d() + n2;
                        do {
                            hww2.g(((hvy)this.c).l());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    hww2.g(((hvy)this.c).l());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            object.add(((hvy)this.c).l());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    object.add(((hvy)this.c).l());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    public final void J(List list) {
        block10: {
            int n2;
            if (list instanceof hxw) {
                list = (hxw)list;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            ((hxw)list).e(((hvy)this.c).u());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    ((hxw)list).e(((hvy)this.c).u());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy3 = (hvy)this.c;
                        n2 = hvy3.n();
                        n2 = hvy3.d() + n2;
                        do {
                            list.add(((hvy)this.c).u());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    list.add(((hvy)this.c).u());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void K(List list, boolean bl2) {
        int n2;
        if (hzo.b(this.a) != 2) throw new hxm();
        if (list instanceof hxu && !bl2) {
            list = (hxu)list;
            do {
                this.o();
                list.b();
                if (((hvy)this.c).C()) return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        } else {
            do {
                String string = bl2 ? this.v() : this.u();
                list.add(string);
                if (!((hvy)this.c).C()) continue;
                return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        }
        this.b = n2;
    }

    public final void L(List object) {
        block10: {
            int n2;
            if (object instanceof hww) {
                hww hww2 = (hww)object;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        object = (hvy)this.c;
                        n2 = ((hvy)object).n();
                        n2 = ((hvy)object).d() + n2;
                        do {
                            hww2.g(((hvy)this.c).n());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    hww2.g(((hvy)this.c).n());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            object.add(((hvy)this.c).n());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    object.add(((hvy)this.c).n());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    public final void M(List list) {
        block10: {
            int n2;
            if (list instanceof hxw) {
                list = (hxw)list;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            ((hxw)list).e(((hvy)this.c).v());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    ((hxw)list).e(((hvy)this.c).v());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy3 = (hvy)this.c;
                        n2 = hvy3.n();
                        n2 = hvy3.d() + n2;
                        do {
                            list.add(((hvy)this.c).v());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    list.add(((hvy)this.c).v());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    public final void N(int n2) {
        if (hzo.b(this.a) == n2) {
            return;
        }
        throw new hxm();
    }

    public final boolean O() {
        this.N(0);
        return ((hvy)this.c).D();
    }

    public final boolean P() {
        int n2;
        if (!((hvy)this.c).C() && (n2 = this.a) != this.d) {
            return ((hvy)this.c).E(n2);
        }
        return false;
    }

    public final void Q() {
        Object object = this.c;
        int n2 = this.a;
        object = (View)object;
        int n3 = object.getTop();
        int n4 = this.b;
        int[] nArray = wj.a;
        object.offsetTopAndBottom(n2 - (n3 - n4));
        object = (View)this.c;
        object.offsetLeftAndRight(-(object.getLeft() - this.d));
    }

    public final void R() {
        this.b = ((View)this.c).getTop();
        this.d = ((View)this.c).getLeft();
    }

    public final boolean S(int n2) {
        if (this.a != n2) {
            this.a = n2;
            this.Q();
            return true;
        }
        return false;
    }

    public final double a() {
        this.N(1);
        return ((hvy)this.c).b();
    }

    public final float b() {
        this.N(5);
        return ((hvy)this.c).c();
    }

    public final int c() {
        int n2 = this.b;
        if (n2 != 0) {
            this.a = n2;
            this.b = 0;
        } else {
            this.a = n2 = ((hvy)this.c).m();
        }
        if (n2 != 0 && n2 != this.d) {
            return hzo.a(n2);
        }
        return Integer.MAX_VALUE;
    }

    public final int d() {
        this.N(0);
        return ((hvy)this.c).f();
    }

    public final int e() {
        this.N(5);
        return ((hvy)this.c).g();
    }

    public final int f() {
        this.N(0);
        return ((hvy)this.c).h();
    }

    public final int g() {
        this.N(5);
        return ((hvy)this.c).k();
    }

    public final int h() {
        this.N(0);
        return ((hvy)this.c).l();
    }

    public final int i() {
        this.N(0);
        return ((hvy)this.c).n();
    }

    public final long j() {
        this.N(1);
        return ((hvy)this.c).o();
    }

    public final long k() {
        this.N(0);
        return ((hvy)this.c).p();
    }

    public final long l() {
        this.N(1);
        return ((hvy)this.c).t();
    }

    public final long m() {
        this.N(0);
        return ((hvy)this.c).u();
    }

    public final long n() {
        this.N(0);
        return ((hvy)this.c).v();
    }

    public final hvu o() {
        this.N(2);
        return ((hvy)this.c).w();
    }

    public final Object q(hzm hzm2, Class clazz, hwj hwj2) {
        hzm hzm3 = hzm.a;
        switch (hzm2.ordinal()) {
            default: {
                throw new IllegalArgumentException("unsupported field type.");
            }
            case 17: {
                return this.m();
            }
            case 16: {
                return this.h();
            }
            case 15: {
                return this.l();
            }
            case 14: {
                return this.g();
            }
            case 13: {
                return this.d();
            }
            case 12: {
                return this.i();
            }
            case 11: {
                return this.o();
            }
            case 10: {
                return this.t(clazz, hwj2);
            }
            case 8: {
                return this.v();
            }
            case 7: {
                return this.O();
            }
            case 6: {
                return this.e();
            }
            case 5: {
                return this.j();
            }
            case 4: {
                return this.f();
            }
            case 3: {
                return this.n();
            }
            case 2: {
                return this.k();
            }
            case 1: {
                return Float.valueOf(this.b());
            }
            case 0: 
        }
        return this.a();
    }

    public final Object r(hyu hyu2, hwj hwj2) {
        Object object = hyu2.e();
        this.T(object, hyu2, hwj2);
        hyu2.g(object);
        return object;
    }

    public final Object s(hyu hyu2, hwj hwj2) {
        Object object = hyu2.e();
        this.U(object, hyu2, hwj2);
        hyu2.g(object);
        return object;
    }

    public final Object t(Class clazz, hwj hwj2) {
        this.N(2);
        return this.s(hyo.a.a(clazz), hwj2);
    }

    public final String u() {
        this.N(2);
        return ((hvy)this.c).x();
    }

    public final String v() {
        this.N(2);
        return ((hvy)this.c).y();
    }

    public final void w(Object object, hyu hyu2, hwj hwj2) {
        this.N(3);
        this.T(object, hyu2, hwj2);
    }

    public final void x(Object object, hyu hyu2, hwj hwj2) {
        this.N(2);
        this.U(object, hyu2, hwj2);
    }

    public final void y(List list) {
        block10: {
            int n2;
            if (list instanceof hvm) {
                list = (hvm)list;
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy2 = (hvy)this.c;
                        n2 = hvy2.n();
                        n2 = hvy2.d() + n2;
                        do {
                            ((hvm)list).e(((hvy)this.c).D());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    ((hvm)list).e(((hvy)this.c).D());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            } else {
                n2 = hzo.b(this.a);
                if (n2 != 0) {
                    if (n2 == 2) {
                        hvy hvy3 = (hvy)this.c;
                        n2 = hvy3.n();
                        n2 = hvy3.d() + n2;
                        do {
                            list.add(((hvy)this.c).D());
                        } while (((hvy)this.c).d() < n2);
                        this.V(n2);
                        return;
                    }
                    throw new hxm();
                }
                do {
                    list.add(((hvy)this.c).D());
                    if (((hvy)this.c).C()) break block10;
                } while ((n2 = ((hvy)this.c).m()) == this.a);
            }
            this.b = n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z(List list) {
        int n2;
        if (!(list instanceof hwf)) {
            n2 = hzo.b(this.a);
            if (n2 != 1) {
                if (n2 != 2) throw new hxm();
                n2 = ((hvy)this.c).n();
                hvz.X(n2);
                int n3 = ((hvy)this.c).d();
                do {
                    list.add(((hvy)this.c).b());
                } while (((hvy)this.c).d() < n3 + n2);
                return;
            }
            do {
                list.add(((hvy)this.c).b());
                if (((hvy)this.c).C()) return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        } else {
            list = (hwf)list;
            n2 = hzo.b(this.a);
            if (n2 != 1) {
                if (n2 != 2) throw new hxm();
                int n4 = ((hvy)this.c).n();
                hvz.X(n4);
                n2 = ((hvy)this.c).d();
                do {
                    ((hwf)list).f(((hvy)this.c).b());
                } while (((hvy)this.c).d() < n2 + n4);
                return;
            }
            do {
                ((hwf)list).f(((hvy)this.c).b());
                if (!((hvy)this.c).C()) continue;
                return;
            } while ((n2 = ((hvy)this.c).m()) == this.a);
        }
        this.b = n2;
    }
}

