/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;

public final class amz
extends aod {
    public amx g;
    private final boolean i;
    private final aev j;
    private final aeu k;
    private amw l;
    private boolean m;
    private boolean n;
    private boolean o;

    public amz(ane ane2, boolean bl2) {
        super(ane2);
        if (bl2) {
            ane2.p();
            bl2 = true;
        } else {
            bl2 = false;
        }
        this.i = bl2;
        this.j = new aev();
        this.k = new aeu();
        ane2.o();
        this.g = amx.s(ane2.C());
    }

    private final Object E(Object object) {
        amx amx2 = this.g;
        Object object2 = amx.c;
        object2 = object;
        if (amx2.d != null) {
            object2 = object;
            if (object.equals(amx.c)) {
                object2 = this.g.d;
            }
        }
        return object2;
    }

    private final boolean F(long l2) {
        amw amw2 = this.l;
        int n2 = ((amt)this.g).a(amw2.a.a);
        if (n2 == -1) {
            return false;
        }
        long l3 = this.g.m((int)n2, (aeu)this.k).d;
        long l4 = l2;
        if (l3 != -9223372036854775807L) {
            l4 = l2;
            if (l2 >= l3) {
                l4 = Math.max(0L, l3 - 1L);
            }
        }
        amw2.e = l4;
        return true;
    }

    public final amw A(anc anc2, apb object, long l2) {
        object = new amw(anc2, (apb)object, l2);
        boolean bl2 = ((amw)object).c == null;
        abr.f(bl2);
        ((amw)object).c = this.h;
        if (this.n) {
            ((amw)object).n(anc2.a(this.E(anc2.a)));
        } else {
            this.l = object;
            if (!this.m) {
                this.m = true;
                this.D();
            }
        }
        return object;
    }

    @Override
    public final void k() {
        this.n = false;
        this.m = false;
        for (bmu bmu2 : this.d.values()) {
            bmu2.a.j((and)bmu2.c);
            bmu2.a.m((ani)bmu2.b);
            bmu2.a.l((alc)bmu2.b);
        }
        this.d.clear();
    }

    @Override
    public final void n(aef aef2) {
        this.g = this.o ? this.g.r(new aoa(this.g.b, aef2)) : amx.s(aef2);
        this.h.n(aef2);
    }

    @Override
    public final void t() {
    }

    @Override
    protected final anc w(anc anc2) {
        Object object = this.g;
        Object object2 = amx.c;
        Object object3 = ((amx)object).d;
        object = object2 = anc2.a;
        if (object3 != null) {
            object = object2;
            if (this.g.d.equals(object2)) {
                object = amx.c;
            }
        }
        return anc2.a(object);
    }

    @Override
    protected final void x(aew object) {
        amw amw2;
        block9: {
            long l2;
            Object object2;
            amw amw3;
            Object object3;
            block12: {
                block11: {
                    block10: {
                        block8: {
                            boolean bl2 = this.n;
                            amw2 = null;
                            if (!bl2) break block8;
                            this.g = this.g.r((aew)object);
                            amw amw4 = this.l;
                            object = amw2;
                            if (amw4 != null) {
                                this.F(amw4.e);
                                object = amw2;
                            }
                            break block9;
                        }
                        if (!((aew)object).p()) break block10;
                        object = this.o ? this.g.r((aew)object) : new amx((aew)object, aev.a, amx.c);
                        this.g = object;
                        object = amw2;
                        break block9;
                    }
                    ((aew)object).o(0, this.j);
                    object3 = this.j.b;
                    amw3 = this.l;
                    if (amw3 == null) break block11;
                    object2 = this.g;
                    aeu aeu2 = this.k;
                    ((aew)object2).n(amw3.a.a, aeu2);
                    l2 = this.g.o((int)0, (aev)this.j).l;
                    l2 = amw3.b;
                    if (l2 != 0L) break block12;
                }
                l2 = 0L;
            }
            amw3 = ((aew)object).k(this.j, this.k, 0, l2);
            object2 = ((Pair)amw3).first;
            l2 = (Long)((Pair)amw3).second;
            object = this.o ? this.g.r((aew)object) : new amx((aew)object, object3, object2);
            this.g = object;
            object3 = this.l;
            object = amw2;
            if (object3 != null) {
                object = amw2;
                if (this.F(l2)) {
                    object = ((amw)object3).a;
                    object = ((anc)object).a(this.E(((anc)object).a));
                }
            }
        }
        this.o = true;
        this.n = true;
        this.i(this.g);
        if (object != null) {
            amw2 = this.l;
            abr.i(amw2);
            amw2.n((anc)object);
        }
    }

    @Override
    public final void y() {
        if (!this.i) {
            this.m = true;
            this.D();
        }
    }

    @Override
    public final void z(anb anb2) {
        amw amw2 = (amw)anb2;
        if (amw2.d != null) {
            ane ane2 = amw2.c;
            abr.i(ane2);
            ane2.z(amw2.d);
        }
        if (anb2 == this.l) {
            this.l = null;
        }
    }
}

