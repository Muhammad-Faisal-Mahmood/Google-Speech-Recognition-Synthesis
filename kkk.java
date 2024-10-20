/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class kkk
implements kkm {
    public static final AmbientMode$AmbientController a = new AmbientMode$AmbientController(null);
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;

    public kkk(Class clazz) {
        jse.e(clazz, "sslSocketClass");
        this.b = clazz;
        Method method = clazz.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        jse.d(method, "getDeclaredMethod(...)");
        this.c = method;
        this.d = clazz.getMethod("setHostname", String.class);
        this.e = clazz.getMethod("getAlpnSelectedProtocol", null);
        this.f = clazz.getMethod("setAlpnProtocols", byte[].class);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String a(SSLSocket object) {
        jse.e(object, "sslSocket");
        boolean bl2 = this.e((SSLSocket)object);
        Object var3_5 = null;
        if (!bl2) {
            return null;
        }
        Object object2 = (byte[])this.e.invoke(object, null);
        object = var3_5;
        if (object2 == null) return object;
        try {
            return new String((byte[])object2, jts.a);
        }
        catch (InvocationTargetException invocationTargetException22) {
            object2 = invocationTargetException22.getCause();
            if (!(object2 instanceof NullPointerException)) throw new AssertionError((Object)invocationTargetException22);
            if (!jse.i(((NullPointerException)object2).getMessage(), "ssl == null")) throw new AssertionError((Object)invocationTargetException22);
            return var3_5;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
    }

    @Override
    public /* synthetic */ X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    @Override
    public final void c(SSLSocket sSLSocket, String object, List object2) {
        jse.e(sSLSocket, "sslSocket");
        jse.e(object2, "protocols");
        if (this.e(sSLSocket)) {
            try {
                this.c.invoke((Object)sSLSocket, true);
                this.d.invoke((Object)sSLSocket, object);
                object = this.f;
                Object object3 = kkf.b;
                jse.e(object2, "protocols");
                object3 = new klm();
                for (String string : kmp.C((List)object2)) {
                    ((klm)object3).F(string.length());
                    ((klm)object3).P(string);
                }
                ((Method)object).invoke((Object)sSLSocket, new Object[]{((klm)object3).z()});
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new AssertionError((Object)invocationTargetException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
        }
    }

    @Override
    public final boolean d() {
        return kkb.a;
    }

    @Override
    public final boolean e(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "sslSocket");
        return this.b.isInstance(sSLSocket);
    }

    @Override
    public /* synthetic */ boolean f(SSLSocketFactory sSLSocketFactory) {
        return false;
    }
}

