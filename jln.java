/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

final class jln
extends jlp {
    private final Method d;
    private final Method e;
    private final Method f;
    private final Class g;
    private final Class h;

    public jln(Method method, Method method2, Method method3, Class clazz, Class clazz2, Provider provider) {
        super(provider);
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = clazz;
        this.h = clazz2;
    }

    @Override
    public final String a(SSLSocket object) {
        block6: {
            Object object2 = this.e;
            Object var3_5 = null;
            object2 = (jlo)Proxy.getInvocationHandler(((Method)object2).invoke(null, object));
            int n2 = jlo.c;
            object = var3_5;
            if (((jlo)object2).a || (object = ((jlo)object2).b) != null) break block6;
            try {
                a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new AssertionError();
            }
        }
        return object;
    }

    @Override
    public final void b(SSLSocket sSLSocket, String object, List object2) {
        Object object3;
        object = new ArrayList(object2.size());
        int n2 = object2.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            object3 = (jlq)((Object)object2.get(i2));
            if (object3 == jlq.a) continue;
            object.add(((jlq)((Object)object3)).e);
        }
        try {
            object3 = jlp.class.getClassLoader();
            Class clazz = this.g;
            Class clazz2 = this.h;
            object2 = new jlo((List)object);
            object = Proxy.newProxyInstance(object3, new Class[]{clazz, clazz2}, (InvocationHandler)object2);
            this.d.invoke(null, sSLSocket, object);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError((Object)invocationTargetException);
        }
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final void d(SSLSocket sSLSocket) {
        try {
            this.f.invoke(null, sSLSocket);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", invocationTargetException);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError();
        }
    }
}

