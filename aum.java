/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import androidx.wear.ambient.AmbientDelegate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;

public abstract class aum {
    public volatile awl a;
    public jvb b;
    public Executor c;
    public Executor d;
    public aue e;
    public boolean f;
    public final Map g;
    public final awg h = new awg();
    public AmbientDelegate i;
    private final ThreadLocal j = new ThreadLocal();

    public aum() {
        this.g = new LinkedHashMap();
    }

    public abstract aue a();

    public final aue b() {
        aue aue2;
        aue aue3 = aue2 = this.e;
        if (aue2 == null) {
            jse.h("internalTracker");
            aue3 = null;
        }
        return aue3;
    }

    public awp c(att att2) {
        jse.e(att2, "config");
        throw new job(null);
    }

    public final awp d() {
        AmbientDelegate ambientDelegate = this.i;
        Object object = ambientDelegate;
        if (ambientDelegate == null) {
            jse.h("connectionManager");
            object = null;
        }
        if ((object = ((AmbientDelegate)object).B()) != null) {
            return object;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object e(Callable callable) {
        this.k();
        try {
            callable = callable.call();
            this.n();
            return callable;
        }
        finally {
            this.l();
        }
    }

    public Map f() {
        return jpb.a;
    }

    public Set g() {
        return jpc.a;
    }

    public final jvb h() {
        jvb jvb2;
        jvb jvb3 = jvb2 = this.b;
        if (jvb2 == null) {
            jse.h("coroutineScope");
            jvb3 = null;
        }
        return jvb3;
    }

    public final void i() {
        if (this.f || Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void j() {
        if (!this.p() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        awl awl2;
        block12: {
            this.i();
            this.i();
            awl2 = this.d().b();
            if (!awl2.i()) {
                Object object = this.b();
                Object object2 = null;
                object = new aus((aue)object, null, 1);
                jqg jqg2 = jqg.a;
                Object object3 = Thread.currentThread();
                jqg2.get(jqc.b);
                Object object4 = jxc.a;
                jvt jvt2 = jxc.a();
                object4 = jwc.a;
                jqg2.plus(jvt2);
                object3 = new juh(jux.b((jvb)object4, jvt2), (Thread)object3, jvt2);
                jvc.a.a((jro)object, object3, (jqb)object3);
                object = ((juh)object3).b;
                if (object != null) {
                    jvt.t((jvt)object);
                }
                try {
                    while (!Thread.interrupted()) {
                        object = ((juh)object3).b;
                        long l2 = object != null ? ((jvt)object).k() : Long.MAX_VALUE;
                        if (!((jwp)object3).bH()) {
                            LockSupport.parkNanos(object3, l2);
                            continue;
                        }
                        object = jwq.b(((jwp)object3).B());
                        if (object instanceof jut) {
                            object2 = (jut)object;
                        }
                        if (object2 != null) {
                            throw ((jut)object2).b;
                        }
                        break block12;
                    }
                    object2 = new InterruptedException();
                    ((jwp)object3).L(object2);
                    throw object2;
                }
                finally {
                    object = ((juh)object3).b;
                    if (object != null) {
                        jvt.s((jvt)object);
                    }
                }
            }
        }
        if (((awu)awl2).d.isWriteAheadLoggingEnabled()) {
            awl2.e();
            return;
        }
        awl2.d();
    }

    public final void l() {
        this.d().b().f();
        if (!this.p()) {
            aue aue2 = this.b();
            aue2.c.f(aue2.f, aue2.g);
        }
    }

    public final void m(Runnable runnable) {
        this.k();
        try {
            runnable.run();
            this.n();
            return;
        }
        finally {
            this.l();
        }
    }

    public final void n() {
        this.d().b().h();
    }

    public final boolean o() {
        AmbientDelegate ambientDelegate;
        AmbientDelegate ambientDelegate2 = ambientDelegate = this.i;
        if (ambientDelegate == null) {
            jse.h("connectionManager");
            ambientDelegate2 = null;
        }
        return ambientDelegate2.B() != null;
    }

    public final boolean p() {
        return this.d().b().i();
    }

    public final boolean q() {
        AmbientDelegate ambientDelegate = this.i;
        Object object = ambientDelegate;
        if (ambientDelegate == null) {
            jse.h("connectionManager");
            object = null;
        }
        if ((object = ((AmbientDelegate)object).a) != null) {
            return object.j();
        }
        return false;
    }

    public List r() {
        return jpa.a;
    }

    public final Object s(jro jro2, jqb jqb2) {
        AmbientDelegate ambientDelegate;
        AmbientDelegate ambientDelegate2 = ambientDelegate = this.i;
        if (ambientDelegate == null) {
            jse.h("connectionManager");
            ambientDelegate2 = null;
        }
        return jro2.b((avk)((avh)ambientDelegate2.b).a.a(), jqb2);
    }
}

