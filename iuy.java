/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.logging.Level;

public abstract class iuy
extends kmp {
    protected iuy() {
        super(null);
    }

    public iwk i() {
        ixj ixj2;
        ArrayList<Object> arrayList;
        gui gui2;
        jjn jjn2;
        Object object;
        Object object2;
        Object object3;
        jco jco2;
        jfy jfy2;
        block13: {
            block12: {
                jfy2 = (jfy)this.j();
                jco2 = jfy2.t.a();
                object3 = jfy.m(jfy2.l, jfy2.j, jco2.b());
                object2 = ((ksb)object3).a;
                object = ((ksb)object3).b;
                jjn2 = new jjn(jeb.o, 0);
                object3 = ((ksb)object3).a;
                gui2 = jeb.q;
                ((URI)object3).toString();
                arrayList = new ArrayList<Object>(jfy2.i);
                int n2 = 0;
                while (true) {
                    int n3 = arrayList.size();
                    ixj2 = null;
                    if (n2 >= n3) break block12;
                    if (arrayList.get(n2) instanceof jfx) break;
                    ++n2;
                }
                object3 = ((jfx)arrayList.get((int)n2)).a;
                throw null;
            }
            kmp.P();
            object3 = jfy.f;
            if (object3 != null) {
                try {
                    Boolean bl2 = true;
                    object3 = (iua)((Method)object3).invoke(null, bl2, bl2, false, bl2);
                    break block13;
                }
                catch (InvocationTargetException invocationTargetException) {
                    jfy.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", invocationTargetException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    jfy.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", illegalAccessException);
                }
            }
            object3 = null;
        }
        if (object3 != null) {
            arrayList.add(0, object3);
        }
        try {
            object3 = (iua)Class.forName("jas").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
        }
        catch (InvocationTargetException invocationTargetException) {
            jfy.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", invocationTargetException);
            object3 = ixj2;
        }
        catch (IllegalAccessException illegalAccessException) {
            jfy.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", illegalAccessException);
            object3 = ixj2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            jfy.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", noSuchMethodException);
            object3 = ixj2;
        }
        catch (ClassNotFoundException classNotFoundException) {
            jfy.a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", classNotFoundException);
            object3 = ixj2;
        }
        if (object3 != null) {
            arrayList.add(0, object3);
        }
        object3 = jjt.a;
        ixj2 = (ixj)object;
        return new jga(new jfs(jfy2, jco2, (URI)object2, ixj2, jjn2, gui2, arrayList, (jjt)object3));
    }

    public abstract kmp j();

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("delegate", this.j());
        return gtn2.toString();
    }
}

