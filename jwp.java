/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public class jwp
implements jwi {
    private final juc a;
    public final juc d;

    public jwp(boolean bl2) {
        jvs jvs2 = bl2 ? jwq.g : jwq.f;
        this.d = new juc(jvs2, jud.a);
        this.a = new juc(null, jud.a);
    }

    private final void R(jvs jvs2) {
        jwu jwu2;
        jwe jwe2 = jwu2 = new jwu();
        if (!jvs2.a) {
            jwe2 = new jwd(jwu2);
        }
        this.d.d(jvs2, jwe2);
    }

    private final void S(jwl jwl2) {
        kbk kbk2 = new jwu();
        kbk2.d.b(jwl2);
        kbk2.c.b(jwl2);
        while (jwl2.f() == jwl2) {
            if (!jwl2.c.d(jwl2, kbk2)) continue;
            kbk2.k(jwl2);
            break;
        }
        kbk2 = jwl2.h();
        this.d.d(jwl2, kbk2);
    }

    private final boolean T(Throwable throwable) {
        if (this.h()) {
            return true;
        }
        boolean bl2 = throwable instanceof CancellationException;
        jup jup2 = this.E();
        if (jup2 != null && jup2 != jwv.a) {
            return jup2.d(throwable) || bl2;
            {
            }
        }
        return bl2;
    }

    private static final String U(Object object) {
        boolean bl2 = object instanceof jwo;
        String string = "Active";
        if (bl2) {
            jwo jwo2 = (jwo)object;
            if (jwo2.g()) {
                object = "Cancelling";
            } else {
                object = string;
                if (jwo2.h()) {
                    object = "Completing";
                }
            }
        } else {
            object = object instanceof jwe ? (((jwe)object).bv() ? string : "New") : (object instanceof jut ? "Cancelled" : "Completed");
        }
        return object;
    }

    private final int e(Object object) {
        if (object instanceof jvs) {
            if (((jvs)object).a) {
                return 0;
            }
            if (!this.d.d(object, jwq.g)) {
                return -1;
            }
            this.J();
            return 1;
        }
        if (object instanceof jwd) {
            if (!this.d.d(object, ((jwd)object).a)) {
                return -1;
            }
            this.J();
            return 1;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object g(Object object, Object object2) {
        void var2_2;
        if (!(object instanceof jwe)) {
            return jwq.a;
        }
        if ((object instanceof jvs || object instanceof jwl) && !(object instanceof juq) && !(var2_2 instanceof jut)) {
            object = (jwe)object;
            boolean bl2 = jve.a;
            if (!this.d.d(object, jwq.a(var2_2))) {
                return jwq.c;
            }
            this.bC(var2_2);
            this.m((jwe)object, var2_2);
            return var2_2;
        }
        jwe jwe2 = (jwe)object;
        jwu jwu2 = this.k(jwe2);
        if (jwu2 == null) {
            return jwq.c;
        }
        boolean bl3 = jwe2 instanceof jwo;
        Object var5_7 = null;
        object = bl3 ? (jwo)jwe2 : null;
        Object object3 = object;
        if (object == null) {
            object3 = new jwo(jwu2, null);
        }
        jsj jsj2 = new jsj();
        synchronized (object3) {
            if (((jwo)object3).h()) {
                return jwq.a;
            }
            ((jwo)object3).b.a = 1;
            if (object3 != jwe2 && !this.d.d(jwe2, object3)) {
                return jwq.c;
            }
            bl3 = jve.a;
            bl3 = ((jwo)object3).g();
            object = var2_2 instanceof jut ? (jut)var2_2 : null;
            if (object != null) {
                ((jwo)object3).e(((jut)object).b);
            }
            object = ((jwo)object3).d();
            Boolean.valueOf(bl3 ^= true).getClass();
            if (!bl3) {
                object = var5_7;
            }
            jsj2.a = object;
        }
        object = (Throwable)jsj2.a;
        if (object != null) {
            this.n(jwu2, (Throwable)object);
        }
        if ((object = this.F(jwu2)) != null && this.P((jwo)object3, (juq)object, var2_2)) {
            return jwq.b;
        }
        jwu2.j(2);
        object = this.F(jwu2);
        if (object == null) return this.z((jwo)object3, var2_2);
        if (!this.P((jwo)object3, (juq)object, var2_2)) return this.z((jwo)object3, var2_2);
        return jwq.b;
    }

    private final Throwable j(Object object) {
        block12: {
            Throwable throwable;
            block11: {
                block6: {
                    Object object2;
                    block10: {
                        jwp jwp2;
                        CancellationException cancellationException;
                        block8: {
                            block9: {
                                block7: {
                                    cancellationException = null;
                                    if (object == null || object instanceof Throwable) break block6;
                                    jwp2 = (jwp)object;
                                    object2 = jwp2.B();
                                    if (!(object2 instanceof jwo)) break block7;
                                    object = ((jwo)object2).d();
                                    break block8;
                                }
                                if (!(object2 instanceof jut)) break block9;
                                object = ((jut)object2).b;
                                break block8;
                            }
                            if (object2 instanceof jwe) break block10;
                            object = null;
                        }
                        if (object instanceof CancellationException) {
                            cancellationException = (CancellationException)object;
                        }
                        throwable = cancellationException;
                        if (cancellationException == null) {
                            throwable = new jwj("Parent job is ".concat(jwp.U(object2)), (Throwable)object, jwp2);
                        }
                        break block11;
                    }
                    Objects.toString(object2);
                    throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(object2)));
                }
                throwable = (Throwable)object;
                if (throwable == null) break block12;
            }
            return throwable;
        }
        return new jwj(this.a(), null, this);
    }

    private final jwu k(jwe jwe2) {
        jwu jwu2;
        jwu jwu3 = jwu2 = jwe2.bt();
        if (jwu2 == null) {
            if (jwe2 instanceof jvs) {
                jwu3 = new jwu();
            } else if (jwe2 instanceof jwl) {
                this.S((jwl)jwe2);
                jwu3 = null;
            } else {
                Objects.toString(jwe2);
                throw new IllegalStateException("State should have list: ".concat(String.valueOf(jwe2)));
            }
        }
        return jwu3;
    }

    private final void m(jwe object, Object object2) {
        Object object3 = this.E();
        if (object3 != null) {
            object3.bu();
            this.K(jwv.a);
        }
        boolean bl2 = object2 instanceof jut;
        object3 = null;
        object2 = bl2 ? (jut)object2 : null;
        object2 = object2 != null ? ((jut)object2).b : null;
        if (object instanceof jwl) {
            try {
                ((jwl)object).a((Throwable)object2);
                return;
            }
            catch (Throwable throwable) {
                this.i(new juu(a.am(this, object, "Exception in completion handler ", " for "), throwable));
                return;
            }
        }
        jwu jwu2 = object.bt();
        if (jwu2 != null) {
            jwu2.j(1);
            object = jwu2.f();
            jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            Object object4 = (kbk)object;
            object = object3;
            object3 = object4;
            while (!jse.i(object3, jwu2)) {
                object4 = object;
                if (object3 instanceof jwl) {
                    object4 = (jwl)object3;
                    try {
                        ((jwl)object4).a((Throwable)object2);
                        object4 = object;
                    }
                    catch (Throwable throwable) {
                        if (object != null) {
                            jns.b((Throwable)object, throwable);
                            object4 = object;
                        }
                        object4 = new juu(a.am(this, object3, "Exception in completion handler ", " for "), throwable);
                    }
                }
                object3 = ((kbk)object3).h();
                object = object4;
            }
            if (object != null) {
                this.i((Throwable)object);
            }
        }
    }

    private final void n(jwu jwu2, Throwable throwable) {
        jwu2.j(4);
        Object object = jwu2.f();
        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        object = (kbk)object;
        juu juu2 = null;
        while (!jse.i(object, jwu2)) {
            juu juu3 = juu2;
            if (object instanceof jwl) {
                jwl jwl2 = (jwl)object;
                juu3 = juu2;
                if (jwl2.b()) {
                    try {
                        jwl2.a(throwable);
                        juu3 = juu2;
                    }
                    catch (Throwable throwable2) {
                        if (juu2 != null) {
                            jns.b(juu2, throwable2);
                            juu3 = juu2;
                        }
                        juu3 = new juu(a.am(this, object, "Exception in completion handler ", " for "), throwable2);
                    }
                }
            }
            object = ((kbk)object).h();
            juu2 = juu3;
        }
        if (juu2 != null) {
            this.i(juu2);
        }
        this.T(throwable);
    }

    public final Object A() {
        Object object = this.B();
        if (!(object instanceof jwe)) {
            if (!(object instanceof jut)) {
                return jwq.b(object);
            }
            throw ((jut)object).b;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public final Object B() {
        return this.d.a;
    }

    public final Object C(Object object) {
        Object object2;
        do {
            if ((object2 = this.g(this.B(), object)) != jwq.a) continue;
            String string = a.am(object, this, "Job ", " is already complete or completing, but is being completed with ");
            boolean bl2 = object instanceof jut;
            object2 = null;
            object = bl2 ? (jut)object : null;
            if (object != null) {
                object2 = ((jut)object).b;
            }
            throw new IllegalStateException(string, (Throwable)object2);
        } while (object2 == jwq.c);
        return object2;
    }

    protected final CancellationException D(Throwable throwable, String string) {
        Object object = throwable instanceof CancellationException ? (CancellationException)throwable : null;
        CancellationException cancellationException = object;
        if (object == null) {
            object = string;
            if (string == null) {
                object = this.a();
            }
            cancellationException = new jwj((String)object, throwable, this);
        }
        return cancellationException;
    }

    public final jup E() {
        return (jup)this.a.a;
    }

    public final juq F(kbk kbk2) {
        kbk kbk3;
        while (true) {
            kbk3 = kbk2;
            if (!kbk2.bw()) break;
            kbk2 = kbk2.i();
        }
        while (true) {
            kbk3 = kbk2 = kbk3.h();
            if (kbk2.bw()) continue;
            if (kbk2 instanceof juq) {
                return (juq)kbk2;
            }
            kbk3 = kbk2;
            if (kbk2 instanceof jwu) break;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final jvq G(boolean bl2, jwl jwl2) {
        jwu jwu2;
        Object object;
        Object object2;
        block9: {
            jwl2.b = this;
            while (true) {
                if ((object2 = this.B()) instanceof jvs) {
                    object = (jvs)object2;
                    if (((jvs)object).a) {
                        if (!this.d.d(object2, jwl2)) continue;
                        return jwl2;
                    }
                    this.R((jvs)object);
                    continue;
                }
                boolean bl3 = object2 instanceof jwe;
                jwu2 = null;
                object = null;
                if (!bl3) break block9;
                jwe jwe2 = (jwe)object2;
                jwu2 = jwe2.bt();
                if (jwu2 == null) {
                    jse.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    this.S((jwl)object2);
                    continue;
                }
                if (jwl2.b()) {
                    object2 = jwe2 instanceof jwo ? (jwo)jwe2 : null;
                    if (object2 != null) {
                        object = ((jwo)object2).d();
                    }
                    if (object != null) {
                        if (!bl2) return jwv.a;
                        jwl2.a((Throwable)object);
                        return jwv.a;
                    }
                    bl3 = jwu2.l(jwl2, 5);
                } else {
                    bl3 = jwu2.l(jwl2, 1);
                }
                if (bl3) break;
            }
            return jwl2;
        }
        if (!bl2) return jwv.a;
        object2 = this.B();
        object2 = object2 instanceof jut ? (jut)object2 : null;
        object = jwu2;
        if (object2 != null) {
            object = ((jut)object2).b;
        }
        jwl2.a((Throwable)object);
        return jwv.a;
    }

    public void H(Throwable throwable) {
        this.L(throwable);
    }

    protected final void I(jwi object) {
        boolean bl2 = jve.a;
        if (object == null) {
            this.K(jwv.a);
            return;
        }
        object.x();
        object = object.v(this);
        this.K((jup)object);
        if (this.bH()) {
            object.bu();
            this.K(jwv.a);
        }
    }

    protected void J() {
    }

    public final void K(jup jup2) {
        this.a.c(jup2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean L(Object object) {
        Object object2;
        boolean bl2;
        block19: {
            block20: {
                Object object3;
                boolean bl3 = this.br();
                Object object4 = jwq.a;
                bl2 = true;
                if (bl3) {
                    block18: {
                        while (!(!((object2 = this.B()) instanceof jwe) || object2 instanceof jwo && ((jwo)object2).h())) {
                            if ((object2 = this.g(object2, new jut(this.j(object)))) == jwq.c) continue;
                            break block18;
                        }
                        object2 = jwq.a;
                    }
                    if (object2 == jwq.b) return true;
                    object4 = object2;
                }
                object2 = object4;
                if (object4 != jwq.a) break block19;
                Object var6_6 = null;
                object2 = null;
                while (true) {
                    Object object5;
                    block21: {
                        block23: {
                            block24: {
                                block25: {
                                    block22: {
                                        if (!((object5 = this.B()) instanceof jwo)) break block21;
                                        // MONITORENTER : object5
                                        object3 = (jwo)object5;
                                        if (((jwo)object3).c() == jwq.e) {
                                            object2 = jwq.d;
                                            // MONITOREXIT : object5
                                            break block19;
                                        }
                                        bl3 = ((jwo)object3).g();
                                        if (object != null) break block22;
                                        if (bl3) break block23;
                                        object4 = object2;
                                        if (object2 != null) break block24;
                                        break block25;
                                    }
                                    object4 = object2;
                                    if (object2 != null) break block24;
                                }
                                object4 = this.j(object);
                            }
                            ((jwo)object3).e((Throwable)object4);
                        }
                        object = ((jwo)object3).d();
                        if (bl3) {
                            object = var6_6;
                        }
                        // MONITOREXIT : object5
                        if (object != null) {
                            this.n(((jwo)object5).a, (Throwable)object);
                        }
                        object2 = jwq.a;
                        break block19;
                    }
                    if (!(object5 instanceof jwe)) break block20;
                    object4 = object2;
                    if (object2 == null) {
                        object4 = this.j(object);
                    }
                    if ((object3 = (jwe)object5).bv()) {
                        bl3 = jve.a;
                        object5 = this.k((jwe)object3);
                        object2 = object4;
                        if (object5 == null) continue;
                        jwo jwo2 = new jwo((jwu)object5, (Throwable)object4);
                        object2 = object4;
                        if (!this.d.d(object3, jwo2)) continue;
                        this.n((jwu)object5, (Throwable)object4);
                        object2 = jwq.a;
                        break block19;
                    }
                    object3 = this.g(object5, new jut((Throwable)object4));
                    if (object3 == jwq.a) {
                        Objects.toString(object5);
                        throw new IllegalStateException("Cannot happen in ".concat(String.valueOf(object5)));
                    }
                    object2 = object4;
                    if (object3 != jwq.c) break;
                }
                object2 = object3;
                break block19;
            }
            object2 = jwq.d;
        }
        if (object2 == jwq.a) {
            return bl2;
        }
        if (object2 == jwq.b) {
            return bl2;
        }
        if (object2 == jwq.d) {
            return false;
        }
        this.bG(object2);
        return true;
    }

    public boolean M(Throwable throwable) {
        if (throwable instanceof CancellationException) {
            return true;
        }
        return this.L(throwable) && this.bq();
    }

    protected boolean N(Throwable throwable) {
        return false;
    }

    public final boolean O(Object object) {
        block2: {
            Object object2;
            do {
                if ((object2 = this.g(this.B(), object)) == jwq.a) {
                    return false;
                }
                if (object2 == jwq.b) break block2;
            } while (object2 == jwq.c);
            this.bG(object2);
        }
        return true;
    }

    public final boolean P(jwo jwo2, juq juq2, Object object) {
        juq juq3;
        do {
            if (jns.ar(juq2.a, false, new jwn(this, jwo2, juq2, object)) != jwv.a) {
                return true;
            }
            juq2 = juq3 = this.F(juq2);
        } while (juq3 != null);
        return false;
    }

    protected String a() {
        return "Job was cancelled";
    }

    public String b() {
        return jvf.a(this);
    }

    protected void bC(Object object) {
    }

    @Override
    public final jvq bF(boolean bl2, boolean bl3, jrk object) {
        object = bl2 ? new jwg((jrk)object) : new jwh((jrk)object);
        return this.G(bl3, (jwl)object);
    }

    protected void bG(Object object) {
    }

    @Override
    public final boolean bH() {
        return !(this.B() instanceof jwe);
    }

    public boolean bq() {
        return true;
    }

    public boolean br() {
        return false;
    }

    @Override
    public final Object fold(Object object, jro jro2) {
        return jjj.o(this, object, jro2);
    }

    @Override
    public final jqd get(jqe jqe2) {
        return jjj.p(this, jqe2);
    }

    @Override
    public final jqe getKey() {
        return jwi.c;
    }

    protected boolean h() {
        return false;
    }

    public void i(Throwable throwable) {
        throw throwable;
    }

    @Override
    public final jqf minusKey(jqe jqe2) {
        return jjj.q(this, jqe2);
    }

    @Override
    public final Object o(jqb object) {
        Object object2;
        do {
            if ((object2 = this.B()) instanceof jwe) continue;
            jns.at(object.d());
            return jon.a;
        } while (this.e(object2) < 0);
        object2 = new jul(jjj.n((jqb)object), 1);
        ((jul)object2).r();
        jsl.r((jul)object2, jns.av(this, new jwy((jqb)object2)));
        object2 = ((jul)object2).a();
        if (object2 == jqh.a) {
            jsd.j((jqb)object);
        }
        jqh jqh2 = jqh.a;
        object = object2;
        if (object2 != jqh2) {
            object = jon.a;
        }
        if (object == jqh2) {
            return object;
        }
        return jon.a;
    }

    @Override
    public final CancellationException p() {
        block5: {
            Object object;
            block4: {
                block2: {
                    block3: {
                        object = this.B();
                        if (!(object instanceof jwo)) break block2;
                        if ((object = ((jwo)object).d()) == null) break block3;
                        object = this.D((Throwable)object, String.valueOf(jvf.a(this)).concat(" is cancelling"));
                        break block4;
                    }
                    ((Object)this).toString();
                    throw new IllegalStateException("Job is still new or active: ".concat(((Object)this).toString()));
                }
                if (object instanceof jwe) break block5;
                object = object instanceof jut ? this.D(((jut)object).b, null) : new jwj(String.valueOf(jvf.a(this)).concat(" has completed normally"), null, this);
            }
            return object;
        }
        ((Object)this).toString();
        throw new IllegalStateException("Job is still new or active: ".concat(((Object)this).toString()));
    }

    @Override
    public final jqf plus(jqf jqf2) {
        return jjj.r(this, jqf2);
    }

    @Override
    public void r(CancellationException cancellationException) {
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new jwj(this.a(), null, this);
        }
        this.H(cancellationException2);
    }

    @Override
    public final boolean s() {
        Object object = this.B();
        return object instanceof jwe && ((jwe)object).bv();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean t() {
        boolean bl2;
        Object object = this.B();
        boolean bl3 = object instanceof jut;
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        if (!(object instanceof jwo)) return false;
        if (!((jwo)object).g()) return false;
        return bl2;
    }

    public final String toString() {
        String string = this.b();
        CharSequence charSequence = jwp.U(this.B());
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append(string);
        charSequence2.append("{");
        charSequence2.append((String)charSequence);
        charSequence2.append("}");
        string = charSequence2.toString();
        charSequence2 = jvf.b(this);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append("@");
        ((StringBuilder)charSequence).append((String)charSequence2);
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final jup v(jwp object) {
        Object object2;
        juq juq2;
        block7: {
            boolean bl2;
            juq2 = new juq((jwp)object);
            juq2.b = this;
            while (true) {
                Object object3;
                if ((object3 = this.B()) instanceof jvs) {
                    object = (jvs)object3;
                    if (((jvs)object).a) {
                        if (!this.d.d(object3, juq2)) continue;
                        return juq2;
                    }
                    this.R((jvs)object);
                    continue;
                }
                bl2 = object3 instanceof jwe;
                object2 = null;
                object = null;
                if (!bl2) break block7;
                object2 = ((jwe)object3).bt();
                if (object2 != null) break;
                jse.c(object3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                this.S((jwl)object3);
            }
            if (((kbk)object2).l(juq2, 7)) return juq2;
            boolean bl3 = ((kbk)object2).l(juq2, 3);
            object2 = this.B();
            if (object2 instanceof jwo) {
                object = ((jwo)object2).d();
            } else {
                bl2 = jve.a;
                if ((object2 = object2 instanceof jut ? (jut)object2 : null) != null) {
                    object = ((jut)object2).b;
                }
            }
            juq2.a((Throwable)object);
            if (!bl3) return jwv.a;
            bl2 = jve.a;
            return juq2;
        }
        object = this.B();
        object = object instanceof jut ? (jut)object : null;
        if (object != null) {
            object2 = ((jut)object).b;
        }
        juq2.a((Throwable)object2);
        return jwv.a;
    }

    @Override
    public final void w(jrk jrk2) {
        this.G(true, new jwh(jrk2));
    }

    @Override
    public final void x() {
        int n2;
        while ((n2 = this.e(this.B())) != 0 && n2 != 1) {
        }
    }

    public final Object y(jqb jqb2) {
        Object object;
        do {
            if ((object = this.B()) instanceof jwe) continue;
            if (object instanceof jut) {
                object = ((jut)object).b;
                if (!jve.b) {
                    throw object;
                }
                throw kbs.a((Throwable)object, (jqp)((Object)jqb2));
            }
            return jwq.b(object);
        } while (this.e(object) < 0);
        object = new jwm(jjj.n(jqb2), this);
        ((jul)object).r();
        jsl.r((jul)object, jns.av(this, new jwx((jul)object)));
        object = ((jul)object).a();
        if (object == jqh.a) {
            jsd.j(jqb2);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object z(jwo jwo2, Object object) {
        Object object2;
        boolean bl2 = jve.a;
        bl2 = object instanceof jut;
        Object object3 = null;
        Object object4 = null;
        Object object5 = bl2 ? (jut)object : null;
        Throwable throwable = object5 != null ? ((jut)object5).b : null;
        synchronized (jwo2) {
            Object object6;
            Object object7;
            jwo2.g();
            object5 = jwo2.c();
            if (object5 == null) {
                object2 = new ArrayList(4);
            } else if (object5 instanceof Throwable) {
                object2 = new ArrayList(4);
                ((ArrayList)object2).add(object5);
            } else {
                if (!(object5 instanceof ArrayList)) {
                    Objects.toString(object5);
                    object = new IllegalStateException("State is ".concat(object5.toString()));
                    throw object;
                }
                object2 = (ArrayList)object5;
            }
            object5 = jwo2.d();
            if (object5 != null) {
                ((ArrayList)object2).add(0, object5);
            }
            if (throwable != null && !jse.i(throwable, object5)) {
                ((ArrayList)object2).add(throwable);
            }
            jwo2.f(jwq.e);
            if (object2.isEmpty()) {
                object5 = object3;
                if (jwo2.g()) {
                    object5 = new jwj(this.a(), null, this);
                }
            } else {
                block26: {
                    object3 = object2.iterator();
                    while (object3.hasNext()) {
                        object5 = object3.next();
                        if ((Throwable)object5 instanceof CancellationException) continue;
                        break block26;
                    }
                    object5 = null;
                }
                object5 = (Throwable)object5;
                if (object5 == null) {
                    object5 = object3 = (Throwable)object2.get(0);
                    if (object3 instanceof jxd) {
                        object7 = object2.iterator();
                        do {
                            object5 = object4;
                        } while (object7.hasNext() && ((object6 = (Throwable)(object5 = object7.next())) == object3 || !(object6 instanceof jxd)));
                        object5 = object4 = (Throwable)object5;
                        if (object4 == null) {
                            object5 = object3;
                        }
                    }
                }
            }
            if (object5 != null && object2.size() > 1) {
                int n2 = object2.size();
                object4 = new IdentityHashMap(n2);
                object7 = Collections.newSetFromMap(object4);
                object4 = !jve.b ? object5 : kbs.c((Throwable)object5);
                object6 = object2.iterator();
                while (object6.hasNext()) {
                    object2 = object3 = (Throwable)object6.next();
                    if (jve.b) {
                        object2 = kbs.c((Throwable)object3);
                    }
                    if (object2 == object5 || object2 == object4 || object2 instanceof CancellationException || !object7.add(object2)) continue;
                    jns.b((Throwable)object5, (Throwable)object2);
                }
            }
        }
        object2 = object;
        if (object5 != null) {
            object2 = object;
            if (object5 != throwable) {
                object2 = new jut((Throwable)object5);
            }
        }
        if (object5 != null && (this.T((Throwable)object5) || this.N((Throwable)object5))) {
            jse.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((jut)object2).a();
        }
        this.bC(object2);
        this.d.d(jwo2, jwq.a(object2));
        this.m(jwo2, object2);
        return object2;
    }
}

