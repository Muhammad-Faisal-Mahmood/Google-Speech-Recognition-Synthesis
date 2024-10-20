/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 */
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class kkb
extends kkf {
    public static final boolean a;
    private final List c;
    private final knl d;

    static {
        boolean bl2 = kmp.D();
        boolean bl3 = false;
        if (bl2 && Build.VERSION.SDK_INT < 30) {
            bl3 = true;
        }
        a = bl3;
    }

    public kkb() {
        GenericDeclaration genericDeclaration;
        Object object;
        Object object2;
        Object object3 = null;
        try {
            object2 = Class.forName(a.aw("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            jse.c(object2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            object = Class.forName(a.aw("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl"));
            jse.c(object, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
            Class<?> clazz = Class.forName(a.aw("com.android.org.conscrypt", ".SSLParametersImpl"));
            jse.b(clazz);
            genericDeclaration = new GenericDeclaration((Class)object2, (Class)object, clazz);
        }
        catch (Exception exception) {
            kkf.b.l("unable to load android socket classes", 5, exception);
            genericDeclaration = null;
        }
        object = jns.Q(new kkm[]{genericDeclaration, new kkl(kkk.a)});
        genericDeclaration = new ArrayList();
        object2 = object.iterator();
        while (object2.hasNext()) {
            object = object2.next();
            if (!((kkm)object).d()) continue;
            genericDeclaration.add((Object)object);
        }
        this.c = genericDeclaration;
        try {
            genericDeclaration = Class.forName("dalvik.system.CloseGuard");
            object2 = genericDeclaration.getMethod("get", null);
            object = genericDeclaration.getMethod("open", String.class);
            genericDeclaration = genericDeclaration.getMethod("warnIfOpen", null);
            object3 = object2;
        }
        catch (Exception exception) {
            genericDeclaration = null;
            object = null;
        }
        this.d = new knl((Method)object3, (Method)object, (Method)genericDeclaration);
    }

    @Override
    public final String a(SSLSocket sSLSocket) {
        kkm kkm22;
        block2: {
            jse.e(sSLSocket, "sslSocket");
            for (kkm kkm22 : this.c) {
                if (!((kkm)kkm22).e(sSLSocket)) continue;
                break block2;
            }
            kkm22 = null;
        }
        kkm22 = kkm22;
        if (kkm22 != null) {
            return kkm22.a(sSLSocket);
        }
        return null;
    }

    @Override
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        kkm kkm22;
        block2: {
            for (kkm kkm22 : this.c) {
                if (!((kkm)kkm22).f(sSLSocketFactory)) continue;
                break block2;
            }
            kkm22 = null;
        }
        kkm22 = kkm22;
        if (kkm22 != null) {
            return kkm22.b(sSLSocketFactory);
        }
        return null;
    }

    @Override
    public final kks c(X509TrustManager x509TrustManager) {
        jse.e(x509TrustManager, "trustManager");
        kkh kkh2 = kmp.A(x509TrustManager);
        if (kkh2 != null) {
            return kkh2;
        }
        return super.c(x509TrustManager);
    }

    @Override
    public final void d(SSLSocket sSLSocket, String string, List list) {
        kkm kkm22;
        block2: {
            jse.e(sSLSocket, "sslSocket");
            jse.e(list, "protocols");
            for (kkm kkm22 : this.c) {
                if (!((kkm)kkm22).e(sSLSocket)) continue;
                break block2;
            }
            kkm22 = null;
        }
        kkm22 = kkm22;
        if (kkm22 != null) {
            kkm22.c(sSLSocket, string, list);
        }
    }

    @Override
    public final boolean e(String string) {
        return ag$$ExternalSyntheticApiModelOutline1.m(NetworkSecurityPolicy.getInstance(), string);
    }

    @Override
    public final kku f(X509TrustManager object) {
        jse.e(object, "trustManager");
        try {
            Method method = object.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            jse.b(method);
            kka kka2 = new kka((X509TrustManager)object, method);
            object = kka2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = super.f((X509TrustManager)object);
        }
        return object;
    }

    @Override
    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int n2) {
        jse.e(socket, "socket");
        jse.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, n2);
            return;
        }
        catch (ClassCastException classCastException) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", classCastException);
            }
            throw classCastException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h(String string, Object object) {
        Object object2 = this.d;
        if (object != null) {
            try {
                object2 = ((knl)object2).a;
                jse.b(object2);
                ((Method)object2).invoke(object, null);
                return;
            }
            catch (Exception exception) {}
        }
        kkf.m(this, string, 5, 4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object i() {
        Object object;
        Object object2 = this.d;
        Object object3 = ((knl)object2).b;
        Object object4 = object = null;
        if (object3 == null) return object4;
        try {
            object4 = ((Method)object3).invoke(null, null);
            object2 = ((knl)object2).c;
            jse.b(object2);
            ((Method)object2).invoke(object4, "response.body().close()");
        }
        catch (Exception exception) {
            return object;
        }
        return object4;
    }
}

