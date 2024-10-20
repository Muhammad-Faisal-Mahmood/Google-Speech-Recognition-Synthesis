/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class kkd
extends kkf {
    private final Method a;
    private final Method c;
    private final Method d;
    private final Class e;
    private final Class f;

    public kkd(Method method, Method method2, Method method3, Class clazz, Class clazz2) {
        jse.e(method, "putMethod");
        jse.e(method2, "getMethod");
        jse.e(method3, "removeMethod");
        jse.e(clazz, "clientProviderClass");
        jse.e(clazz2, "serverProviderClass");
        this.a = method;
        this.c = method2;
        this.d = method3;
        this.e = clazz;
        this.f = clazz2;
    }

    @Override
    public final String a(SSLSocket object) {
        block6: {
            jse.e(object, "sslSocket");
            Object object2 = this.c;
            Object var2_5 = null;
            object = Proxy.getInvocationHandler(((Method)object2).invoke(null, object));
            jse.c(object, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            object2 = (kkc)object;
            object = var2_5;
            if (((kkc)object2).a || (object = ((kkc)object2).b) != null) break block6;
            try {
                kkf.m(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                object = var2_5;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError("failed to get ALPN selected protocol", illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new AssertionError("failed to get ALPN selected protocol", invocationTargetException);
            }
        }
        return object;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String object, List list) {
        jse.e(sSLSocket, "sslSocket");
        jse.e(list, "protocols");
        list = kmp.C(list);
        try {
            ClassLoader classLoader = kkf.class.getClassLoader();
            Class clazz = this.e;
            Class clazz2 = this.f;
            object = new kkc(list);
            object = Proxy.newProxyInstance(classLoader, new Class[]{clazz, clazz2}, (InvocationHandler)object);
            this.a.invoke(null, sSLSocket, object);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError("failed to set ALPN", illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError("failed to set ALPN", invocationTargetException);
        }
    }

    @Override
    public final void j(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "sslSocket");
        try {
            this.d.invoke(null, sSLSocket);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError("failed to remove ALPN", invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError("failed to remove ALPN", illegalAccessException);
        }
    }
}

