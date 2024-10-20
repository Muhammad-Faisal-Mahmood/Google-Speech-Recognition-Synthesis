/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public class jul
extends jvm
implements jqp,
jxj,
jqb {
    public final jqb a;
    public final jqf b;
    public final jua c;
    public final juc d;
    private final juc f;

    public jul(jqb jqb2, int n2) {
        super(n2);
        this.a = jqb2;
        boolean bl2 = jve.a;
        this.b = jqb2.d();
        this.c = new jua(0x1FFFFFFF, jud.a);
        this.d = new juc(juf.a, jud.a);
        this.f = new juc(null, jud.a);
    }

    public static final Object D(jww jww2, Object object, int n2) {
        if (object instanceof jut) {
            boolean bl2 = jve.a;
        } else if (jvf.n(n2) && jww2 instanceof juk) {
            return new jus(object, (juk)jww2, null, 16);
        }
        return object;
    }

    private final jvq F() {
        Object object = (jwi)this.b.get(jwi.c);
        if (object == null) {
            return null;
        }
        object = jns.av((jwi)object, new juo(this));
        this.f.d(null, object);
        return object;
    }

    private static final void G(Object object, Object object2) {
        throw new IllegalStateException(a.am(object2, object, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void H(kau object) {
        int n2 = this.c.b & 0x1FFFFFFF;
        if (n2 == 0x1FFFFFFF) throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        try {
            boolean bl2 = n2 >= jxw.a;
            int n3 = n2;
            if (bl2) {
                n3 = n2 - jxw.a;
            }
            ((kau)object).l(n3);
            while (true) {
                Object object2;
                if (!((object2 = ((kau)object).m(n3)) instanceof jxj) && !(object2 instanceof jyl)) {
                    if (object2 != jxw.i && object2 != jxw.j) {
                        if (object2 == jxw.f || object2 == jxw.e) continue;
                        if (object2 == jxw.h) return;
                        if (object2 == jxw.c) return;
                        if (object2 == jxw.k) {
                            return;
                        }
                        Objects.toString(object2);
                        object = new IllegalStateException("unexpected state: ".concat(String.valueOf(object2)));
                        throw object;
                    }
                    ((kau)object).p(n3);
                    if (!bl2) return;
                    object = ((kau)object).o().a;
                    return;
                }
                kbt kbt2 = bl2 ? jxw.i : jxw.j;
                if (((kau)object).t(n3, object2, kbt2)) break;
            }
            ((kau)object).p(n3);
            ((kau)object).q(n3, bl2 ^ true);
            if (!bl2) return;
            object = ((kau)object).o().a;
            return;
        }
        catch (Throwable throwable) {
            jqf jqf2 = this.b;
            ((Object)this).toString();
            jvf.i(jqf2, new juu("Exception in invokeOnCancellation handler for ".concat(((Object)this).toString()), throwable));
            return;
        }
    }

    public final void A(Throwable throwable) {
        boolean bl2;
        Object object;
        Object object2;
        do {
            boolean bl3;
            if (!((object2 = this.d.a) instanceof jww)) {
                return;
            }
            boolean bl4 = object2 instanceof juk;
            bl2 = bl3 = true;
            if (bl4) continue;
            bl2 = object2 instanceof kau ? bl3 : false;
        } while (!this.d.d(object2, object = new jun(this, throwable, bl2)));
        object = (jww)object2;
        if (object instanceof juk) {
            this.n((juk)object2, throwable);
        } else if (object instanceof kau) {
            this.H((kau)object2);
        }
        this.p();
        this.q(this.e);
    }

    public final void B(Object object) {
        this.C(object, this.e);
    }

    public final void C(Object object, int n2) {
        Object object2;
        while ((object2 = this.d.a) instanceof jww) {
            Object object3 = jul.D((jww)object2, object, n2);
            if (!this.d.d(object2, object3)) continue;
            this.p();
            this.q(n2);
            return;
        }
        if (object2 instanceof jun && ((jun)object2).a.a(false, true)) {
            return;
        }
        Objects.toString(object);
        throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(object)));
    }

    public final Object a() {
        int n2;
        boolean bl2 = this.w();
        do {
            int n3;
            if ((n3 = (n2 = this.c.b) >> 29) == 0) continue;
            if (n3 == 2) {
                Object object;
                Object object2;
                if (bl2) {
                    this.u();
                }
                if ((object2 = this.b()) instanceof jut) {
                    Throwable throwable = ((jut)object2).b;
                    if (jve.b) {
                        throw kbs.a(throwable, this);
                    }
                    throw throwable;
                }
                if (jvf.n(this.e) && (object = (jwi)this.b.get(jwi.c)) != null && !object.s()) {
                    object = object.p();
                    ((jvm)this).y((Throwable)object);
                    if (jve.b) {
                        throw kbs.a((Throwable)object, this);
                    }
                    throw object;
                }
                return ((jvm)this).c(object2);
            }
            throw new IllegalStateException("Already suspended");
        } while (!this.c.b(n2, (0x1FFFFFFF & n2) + 0x20000000));
        if (this.m() == null) {
            this.F();
        }
        if (bl2) {
            this.u();
        }
        return jqh.a;
    }

    public final Object b() {
        return this.d.a;
    }

    @Override
    public final void bD(Object object) {
        Throwable throwable = joe.a(object);
        if (throwable != null) {
            object = throwable;
            if (jve.b) {
                object = kbs.a(throwable, this);
            }
            object = new jut((Throwable)object);
        }
        this.C(object, this.e);
    }

    @Override
    public final jqp bx() {
        jqb jqb2 = this.a;
        if (jqb2 instanceof jqp) {
            return (jqp)((Object)jqb2);
        }
        return null;
    }

    @Override
    public final void by() {
    }

    @Override
    public final Object c(Object object) {
        Object object2 = object;
        if (object instanceof jus) {
            object2 = ((jus)object).a;
        }
        return object2;
    }

    @Override
    public final jqf d() {
        return this.b;
    }

    @Override
    public final Object g() {
        return this.b();
    }

    protected String i() {
        return "CancellableContinuation";
    }

    public Throwable j(jwi jwi2) {
        return jwi2.p();
    }

    @Override
    public final Throwable k(Object object) {
        Throwable throwable = super.k(object);
        if (throwable != null) {
            jqb jqb2 = this.a;
            object = throwable;
            if (jve.b) {
                object = !(jqb2 instanceof jqp) ? throwable : kbs.a(throwable, (jqp)((Object)jqb2));
            }
        } else {
            object = null;
        }
        return object;
    }

    @Override
    public final jqb l() {
        return this.a;
    }

    public final jvq m() {
        return (jvq)this.f.a;
    }

    public final void n(juk object, Throwable throwable) {
        try {
            object.a(throwable);
            return;
        }
        catch (Throwable throwable2) {
            object = this.b;
            ((Object)this).toString();
            jvf.i((jqf)object, new juu("Exception in invokeOnCancellation handler for ".concat(((Object)this).toString()), throwable2));
            return;
        }
    }

    public final void o() {
        jvq jvq2 = this.m();
        if (jvq2 == null) {
            return;
        }
        jvq2.bu();
        this.f.c(jwv.a);
    }

    public final void p() {
        if (!this.w()) {
            this.o();
        }
    }

    public final void q(int n2) {
        int n3;
        do {
            int n4;
            if ((n4 = (n3 = this.c.b) >> 29) == 0) continue;
            if (n4 == 1) {
                boolean bl2 = jve.a;
                Object object = ((jvm)this).l();
                bl2 = n2 == 4;
                if (!bl2 && object instanceof kaz && jvf.n(n2) == jvf.n(this.e)) {
                    Object object2 = (kaz)object;
                    object = ((kaz)object2).a;
                    if (!((juy)object).b((jqf)(object2 = ((kaz)object2).d()))) {
                        object = jxc.a;
                        object = jxc.a();
                        if (((jvt)object).o()) {
                            ((jvt)object).m(this);
                            return;
                        }
                        ((jvt)object).n(true);
                        try {
                            jvf.m(this, ((jvm)this).l(), true);
                            while (bl2 = ((jvt)object).q()) {
                            }
                            ((jvt)object).l(true);
                            return;
                        }
                        catch (Throwable throwable) {
                            try {
                                this.E(throwable);
                                return;
                            }
                            finally {
                                ((jvt)object).l(true);
                            }
                        }
                    }
                    ((juy)object).a((jqf)object2, this);
                    return;
                }
                jvf.m(this, (jqb)object, bl2);
                return;
            }
            throw new IllegalStateException("Already resumed");
        } while (!this.c.b(n3, (0x1FFFFFFF & n3) + 0x40000000));
    }

    public final void r() {
        jvq jvq2 = this.F();
        if (jvq2 != null && !(this.b() instanceof jww)) {
            jvq2.bu();
            this.f.c(jwv.a);
        }
    }

    public final void s(jrk jrk2) {
        this.t(new juj(jrk2, 0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void t(Object object) {
        boolean bl2 = jve.a;
        while (true) {
            Object object2;
            block11: {
                if ((object2 = this.d.a) instanceof juf) {
                    if (!this.d.d(object2, object)) continue;
                    return;
                }
                if (!(object2 instanceof juk) && !(object2 instanceof kau)) {
                    Object object3;
                    bl2 = object2 instanceof jut;
                    Object object4 = null;
                    if (bl2) {
                        object3 = (jut)object2;
                        if (!((jut)object3).a()) {
                            jul.G(object, object2);
                        }
                        if (!(object2 instanceof jun)) return;
                        if (object3 != null) {
                            object4 = ((jut)object3).b;
                        }
                        if (object instanceof juk) {
                            this.n((juk)object, (Throwable)object4);
                            return;
                        }
                        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        this.H((kau)object);
                        return;
                    }
                    if (object2 instanceof jus) {
                        object3 = (jus)object2;
                        if (((jus)object3).b != null) {
                            jul.G(object, object2);
                        }
                        if (object instanceof kau) return;
                        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        object4 = (juk)object;
                        if (((jus)object3).a()) {
                            this.n((juk)object4, ((jus)object3).e);
                            return;
                        }
                        if (!this.d.d(object2, object4 = jus.b((jus)object3, (juk)object4, null, 29))) continue;
                        return;
                    } else {
                        if (object instanceof kau) return;
                        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        object4 = new jus(object2, (juk)object, null, 28);
                        if (!this.d.d(object2, object4)) continue;
                    }
                }
                break block11;
                return;
            }
            jul.G(object, object2);
        }
    }

    public final String toString() {
        String string = jvf.c(this.a);
        Object object = this.b();
        object = object instanceof jww ? "Active" : (object instanceof jun ? "Cancelled" : "Completed");
        String string2 = this.i();
        String string3 = jvf.b(this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("(");
        stringBuilder.append(string);
        stringBuilder.append("){");
        stringBuilder.append((String)object);
        stringBuilder.append("}@");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void u() {
        Object object;
        block4: {
            Object object2;
            block3: {
                kbt kbt2;
                object2 = this.a;
                boolean bl2 = object2 instanceof kaz;
                Object var3_3 = null;
                if (!bl2) return;
                object2 = (kaz)object2;
                if (object2 == null) return;
                while ((object = ((kaz)object2).f.a) == (kbt2 = kba.b)) {
                    if (!((kaz)object2).f.d(kbt2, this)) continue;
                    object2 = var3_3;
                    break block3;
                }
                if (!(object instanceof Throwable)) break block4;
                if (!((kaz)object2).f.d(object, null)) throw new IllegalArgumentException("Failed requirement.");
                object2 = (Throwable)object;
            }
            if (object2 == null) return;
            this.o();
            this.A((Throwable)object2);
            return;
        }
        Objects.toString(object);
        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(object)));
    }

    public final void v(juy juy2, Object object) {
        jqb jqb2 = this.a;
        boolean bl2 = jqb2 instanceof kaz;
        juy juy3 = null;
        jqb2 = bl2 ? (kaz)jqb2 : null;
        if (jqb2 != null) {
            juy3 = ((kaz)jqb2).a;
        }
        int n2 = juy3 == juy2 ? 4 : this.e;
        this.C(object, n2);
    }

    public final boolean w() {
        if (this.e == 2) {
            jqb jqb2 = this.a;
            jse.c(jqb2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((kaz)jqb2).f.a != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void x(kau kau2, int n2) {
        block1: {
            int n3;
            jua jua2;
            do {
                jua2 = this.c;
                n3 = jua2.b;
                if ((n3 & 0x1FFFFFFF) != 0x1FFFFFFF) break block1;
            } while (!jua2.b(n3, (n3 >> 29 << 29) + n2));
            this.t(kau2);
            return;
        }
        throw new IllegalStateException("invokeOnCancellation should be called at most once");
    }

    @Override
    public final void y(Throwable object) {
        Object object2;
        while (!((object2 = this.d.a) instanceof jww)) {
            if (!(object2 instanceof jut)) {
                if (object2 instanceof jus) {
                    jus jus2 = (jus)object2;
                    if (!jus2.a()) {
                        Object object3 = jus.b(jus2, null, (Throwable)object, 15);
                        if (!this.d.d(object2, object3)) continue;
                        object3 = jus2.b;
                        if (object3 != null) {
                            this.n((juk)object3, (Throwable)object);
                        }
                        object = jus2.c;
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                if (!this.d.d(object2, new jus(object2, null, (Throwable)object, 14))) continue;
            }
            return;
        }
        throw new IllegalStateException("Not completed");
    }
}

