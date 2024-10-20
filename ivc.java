/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public final class ivc
extends kmp {
    public final jjc a;
    public final izd b;
    private boolean c;

    protected ivc() {
        super(null);
    }

    public ivc(iyp object, iys iys2) {
        this();
        izd izd2;
        this.b = izd2 = new izd();
        izd2.a = object;
        this.a = object = new jjc(new jeq(this, iys2));
        ((jjc)object).l = false;
        ((jjc)object).o = false;
    }

    @Override
    public final void Y(ixz ixz2) {
        List list = ((jjc)this.k()).e;
        a.s(ixz2, "interceptor");
        list.add(ixz2);
    }

    public final ixw j() {
        fxf.B(this.c ^ true, "BinderServerBuilder can only be used to build one server instance.");
        this.c = true;
        ((kmp)this).Y(new izj());
        Object object = this.a;
        this.b.c = ((jjc)object).h;
        kmp.P();
        Object object2 = new ArrayList<Object>();
        jjc jjc2 = this.a;
        boolean bl2 = jjc2.l;
        Object object3 = null;
        if (bl2) {
            block14: {
                try {
                    Class<?> clazz = Class.forName("jar");
                    object = Boolean.TYPE;
                    object = (iyb)clazz.getDeclaredMethod("getServerStreamTracerFactory", new Class[]{object, object, object}).invoke(null, jjc2.m, jjc2.n, false);
                    break block14;
                }
                catch (InvocationTargetException invocationTargetException) {
                    jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", invocationTargetException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", illegalAccessException);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", noSuchMethodException);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", classNotFoundException);
                }
                object = null;
            }
            if (object != null) {
                ((ArrayList)object2).add(object);
            }
        }
        if (jjc2.o) {
            try {
                object = (iyb)Class.forName("jas").getDeclaredMethod("getServerStreamTracerFactory", null).invoke(null, null);
            }
            catch (InvocationTargetException invocationTargetException) {
                jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", invocationTargetException);
                object = object3;
            }
            catch (IllegalAccessException illegalAccessException) {
                jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", illegalAccessException);
                object = object3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", noSuchMethodException);
                object = object3;
            }
            catch (ClassNotFoundException classNotFoundException) {
                jjc.a.logp(Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", classNotFoundException);
                object = object3;
            }
            if (object != null) {
                ((ArrayList)object2).add(object);
            }
        }
        object = jjc2.q;
        ((ArrayList)object2).addAll(jjc2.f);
        ((ArrayList)object2).trimToSize();
        object3 = DesugarCollections.unmodifiableList(object2);
        object2 = ((jeq)object).a;
        object = ((jeq)object).b;
        object2 = ((ivc)object2).b;
        ((izd)object2).b = object3;
        object3 = new izf((izd)object2);
        ((iys)object).a = object2 = ((izf)object3).c;
        return new jja(jjc2, (jej)object3, ius.d);
    }

    public final kmp k() {
        return this.a;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.k());
        return gtn2.toString();
    }
}

