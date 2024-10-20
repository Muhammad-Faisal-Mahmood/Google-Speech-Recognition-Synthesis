/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 */
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class kjz
extends kkf {
    public static final boolean a;
    private final List c;

    static {
        boolean bl2;
        boolean bl3 = kmp.D();
        boolean bl4 = bl2 = false;
        if (bl3) {
            bl4 = bl2;
            if (Build.VERSION.SDK_INT >= 29) {
                bl4 = true;
            }
        }
        a = bl4;
    }

    public kjz() {
        Object object = kmp.B() ? new kkg() : null;
        List<Object> list2 = jns.Q(new kkm[]{object, new kkl(kkk.a)});
        object = new ArrayList();
        for (List<Object> list2 : list2) {
            if (!((kkm)((Object)list2)).d()) continue;
            object.add(list2);
        }
        this.c = object;
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
}

