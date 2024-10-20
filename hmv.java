/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public abstract class hmv
extends hov
implements Runnable {
    hpn a;
    Class b;
    Object c;

    public hmv(hpn hpn2, Class clazz, Object object) {
        fxf.K(hpn2);
        this.a = hpn2;
        this.b = clazz;
        this.c = object;
    }

    public static hpn f(hpn hpn2, Class object, gte gte2, Executor executor) {
        object = new hmu(hpn2, (Class)object, gte2);
        hpn2.c((Runnable)object, hhk.G(executor, (hnk)object));
        return object;
    }

    public static hpn g(hpn hpn2, Class object, hny hny2, Executor executor) {
        object = new hmt(hpn2, (Class)object, hny2);
        hpn2.c((Runnable)object, hhk.G(executor, (hnk)object));
        return object;
    }

    @Override
    protected final String a() {
        Object object = this.a;
        Serializable serializable = this.b;
        Object object2 = this.c;
        String string = super.a();
        object = object != null ? a.ar(object, "inputFuture=[", "], ") : "";
        if (serializable != null && object2 != null) {
            string = serializable.toString();
            object2 = object2.toString();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append((String)object);
            ((StringBuilder)serializable).append("exceptionType=[");
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append("], fallback=[");
            ((StringBuilder)serializable).append((String)object2);
            ((StringBuilder)serializable).append("]");
            return ((StringBuilder)serializable).toString();
        }
        if (string != null) {
            return ((String)object).concat(string);
        }
        return null;
    }

    @Override
    protected final void b() {
        this.l(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public abstract Object d(Object var1, Throwable var2);

    public abstract void e(Object var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        Object object2;
        Object object3;
        Class clazz;
        hpn hpn2;
        block14: {
            String string;
            block13: {
                hpn2 = this.a;
                clazz = this.b;
                object3 = this.c;
                boolean bl2 = true;
                boolean bl3 = hpn2 == null;
                boolean bl4 = clazz == null;
                if (object3 != null) {
                    bl2 = false;
                }
                if (bl2 | (bl3 | bl4)) return;
                if (this.isCancelled()) {
                    return;
                }
                this.a = null;
                try {
                    object2 = hpn2 instanceof hqi ? ((hqi)((Object)hpn2)).i() : null;
                    object = object2;
                    if (object2 != null) break block13;
                    object = hhk.S(hpn2);
                    break block14;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                catch (ExecutionException executionException) {
                    object2 = object = executionException.getCause();
                    if (object == null) {
                        object2 = String.valueOf(hpn2.getClass());
                        string = String.valueOf(executionException.getClass());
                        object = new StringBuilder("Future type ");
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(" threw ");
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append(" without a cause");
                        object2 = new NullPointerException(((StringBuilder)object).toString());
                    }
                    object = object2;
                }
            }
            string = null;
            object2 = object;
            object = string;
        }
        if (object2 == null) {
            this.m(object);
            return;
        }
        if (!clazz.isInstance(object2)) {
            this.o(hpn2);
            return;
        }
        try {
            object2 = this.d(object3, (Throwable)object2);
            this.b = null;
            this.c = null;
            this.e(object2);
            return;
        }
        catch (Throwable throwable) {
            try {
                hhk.D(throwable);
                this.n(throwable);
                return;
            }
            finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}

