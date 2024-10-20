/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.AttributionSource
 *  android.net.Uri
 *  hom
 */
import android.content.AttributionSource;
import android.net.Uri;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

public final class ivu {
    public Object a;
    public final Object b;
    public Object c;

    public ivu() {
        this.b = its.a;
        this.c = new Object[0][2];
    }

    public ivu(apr apr2) {
        this.b = apr2;
    }

    public ivu(hog hog2, gdx gdx2) {
        this.b = new Object();
        fpk.c();
        this.a = hog2;
        fxf.K(gdx2);
    }

    public ivu(byte[] byArray) {
        this.a = null;
        this.c = null;
        this.b = new StringBuilder();
    }

    public ivu(char[] cArray) {
        this.b = new AtomicInteger();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void m() {
        Object object = this.b;
        synchronized (object) {
            fxf.A(((hog)this.a).c().isDone());
            Object object2 = this.a;
            Object object3 = new AmbientModeSupport$AmbientController(this, null);
            hom hom2 = hom.a;
            Object object4 = hof.a;
            Object object5 = hof.f;
            if (((hog)object2).h((hof)((Object)object4), (hof)((Object)object5))) {
                object4 = ((hog)object2).d;
                object5 = new ffe(object2, object3, 20, null);
                ((hnk)object4).c((Runnable)object5, (Executor)hom2);
                this.a = null;
                return;
            }
            int n2 = ((hof)((Object)((hog)object2).b.get())).ordinal();
            if (n2 == 1) {
                object2 = new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
                throw object2;
            }
            if (n2 != 2 && n2 != 3 && n2 != 4) {
                if (n2 != 5) {
                    object3 = new AssertionError(((hog)object2).b);
                    throw object3;
                }
                object2 = new IllegalStateException("Cannot call finishToValueAndCloser() twice");
                throw object2;
            }
            object2 = new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            throw object2;
        }
    }

    public final ivw a() {
        Object object = this.b;
        Object object2 = this.a;
        Object object3 = this.c;
        return new ivw((List)object2, (its)object, (Object[][])object3);
    }

    public final void b(List list) {
        fxf.r(list.isEmpty() ^ true, "addrs is empty");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public final int c() {
        Object object = this.c;
        if (object == null) {
            return 0;
        }
        return (int)((double)((bwt)object).a() / 1000000.0);
    }

    public final void d() {
        a.s(this.c, "Call startVoiceLoad() before endVoiceLoad()");
        Object object = this.c;
        djt djt2 = new djt("VoiceLoad");
        ((bwt)object).b(djt2);
    }

    public final void e(String string) {
        if (((StringBuilder)this.b).length() != 0) {
            ((StringBuilder)this.b).append("|");
        }
        Object object = Thread.currentThread().getStackTrace()[3].getClassName();
        String string2 = ((String)object).substring(((String)object).lastIndexOf(46) + 1);
        int n2 = Thread.currentThread().getStackTrace()[3].getLineNumber();
        object = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(n2);
        stringBuilder.append(":");
        stringBuilder.append(string);
        string = stringBuilder.toString();
        ((StringBuilder)object).append(string);
    }

    public final long f() {
        Object object = this.a;
        if (object != null) {
            return ((apl)object).c;
        }
        return -1L;
    }

    public final void g(adn object, Uri object2, Map object3, long l2, long l3, apq apq2) {
        block24: {
            block20: {
                boolean bl2;
                boolean bl3;
                int n2;
                block19: {
                    this.a = object2 = new apl((adn)object, l2, l3);
                    if (this.c != null) {
                        return;
                    }
                    object3 = this.b.b();
                    n2 = ((apo[])object3).length;
                    object = gzx.g(n2);
                    bl3 = false;
                    bl2 = false;
                    if (n2 != 1) break block19;
                    this.c = object3[0];
                    break block20;
                }
                for (int i2 = 0; i2 < n2; ++i2) {
                    boolean bl4;
                    block23: {
                        block18: {
                            block17: {
                                apo apo2;
                                block15: {
                                    block16: {
                                        apo2 = object3[i2];
                                        if (!apo2.e((app)object2)) break block15;
                                        this.c = apo2;
                                        if (apo2 == null) {
                                            bl4 = bl2;
                                            if (((apl)object2).c != l2) break block16;
                                        }
                                        bl4 = true;
                                    }
                                    abr.f(bl4);
                                    object2.i();
                                    break;
                                }
                                try {
                                    ((gzs)object).j(apo2.b());
                                    if (this.c == null && ((apl)object2).c != l2) break block17;
                                    break block18;
                                }
                                catch (Throwable throwable) {
                                    block22: {
                                        block21: {
                                            if (this.c != null) break block21;
                                            bl4 = bl3;
                                            if (((apl)object2).c != l2) break block22;
                                        }
                                        bl4 = true;
                                    }
                                    abr.f(bl4);
                                    object2.i();
                                    throw throwable;
                                }
                                catch (EOFException eOFException) {
                                    if (this.c != null || ((apl)object2).c == l2) break block18;
                                }
                            }
                            bl4 = false;
                            break block23;
                        }
                        bl4 = true;
                    }
                    abr.f(bl4);
                    object2.i();
                }
                if (this.c == null) break block24;
            }
            this.c.c(apq2);
            return;
        }
        object2 = new gtk(", ").d(fvd.y(gzx.p((Object[])object3), new ain(2)));
        object3 = new StringBuilder("None of the available extractors (");
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(") could read the stream.");
        throw new aoc(((StringBuilder)object3).toString(), ((gzs)object).g());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gdo h() {
        Object object = this.b;
        synchronized (object) {
            if (this.a != null) {
                this.m();
            }
            try {
                return (gdo)hhk.S(((hog)((bzq)this.c).a).d);
            }
            catch (ExecutionException executionException) {
                gej gej2 = new gej(executionException.getCause());
                throw gej2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn i() {
        Object object = this.b;
        synchronized (object) {
            Object object2 = this.a;
            if (object2 == null) return hhk.K(null);
            return ((hog)object2).c();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        Object object = this.b;
        synchronized (object) {
            Object object2 = this.a;
            if (object2 != null) {
                hog.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "cancel", "cancelling {0}", object2);
                if (((hog)object2).d.cancel(false)) {
                    ((hog)object2).f();
                }
                this.m();
            }
            ((hog)((bzq)this.c).a).f();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final edk k(AttributionSource object) {
        synchronized (this) {
            hyg hyg2 = edk.a.l();
            int n2 = ((AtomicInteger)this.b).incrementAndGet();
            if (!hyg2.b.B()) {
                hyg2.u();
            }
            edk edk2 = (edk)hyg2.b;
            edk2.b |= 1;
            edk2.c = n2;
            hyg2 = (edk)hyg2.o();
            this.a = hyg2;
            this.c = object;
            object = (edk)hyg2;
            return hyg2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gto l(edk object) {
        synchronized (this) {
            if (!((hwv)object).equals(this.a)) return gsl.a;
            this.a = null;
            object = this.c;
            this.c = null;
            return gto.h(object);
        }
    }
}

