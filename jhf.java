/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jhf
implements ixu {
    public static final Logger a = Logger.getLogger(jhf.class.getName());
    private static final gui c;
    private static final jjj d;
    public final InetSocketAddress b;

    static {
        d = new jjj();
        c = new jhe(0);
    }

    public jhf() {
        gui gui2 = c;
        jjj jjj2 = d;
        String[] stringArray = System.getenv("GRPC_PROXY_EXP");
        fxf.K(gui2);
        fxf.K(jjj2);
        if (stringArray != null) {
            int n2 = (stringArray = stringArray.split(":", 2)).length > 1 ? Integer.parseInt(stringArray[1]) : 80;
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.b = new InetSocketAddress(stringArray[0], n2);
            return;
        }
        this.b = null;
    }

    public static final ixt a(InetSocketAddress object) {
        Object object2 = ((InetSocketAddress)object).getHostString();
        Object var2_3 = null;
        try {
            object2 = new URI("https", null, (String)object2, ((InetSocketAddress)object).getPort(), null, null, null);
        }
        catch (URISyntaxException uRISyntaxException) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", uRISyntaxException);
            return null;
        }
        Object object3 = ProxySelector.getDefault();
        if (object3 == null) {
            a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
            return null;
        }
        if ((object2 = ((ProxySelector)object3).select((URI)object2)).size() > 1) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
        }
        if (((Proxy)(object2 = object2.get(0))).type() == Proxy.Type.DIRECT) {
            return null;
        }
        object3 = (InetSocketAddress)((Proxy)object2).address();
        PasswordAuthentication passwordAuthentication = jjj.b(((InetSocketAddress)object3).getHostString(), ((InetSocketAddress)object3).getAddress(), ((InetSocketAddress)object3).getPort());
        object2 = object3;
        if (((InetSocketAddress)object3).isUnresolved()) {
            object2 = new InetSocketAddress(InetAddress.getByName(((InetSocketAddress)object3).getHostName()), ((InetSocketAddress)object3).getPort());
        }
        object3 = new ivg();
        ((ivg)object3).e((InetSocketAddress)object);
        ((ivg)object3).d((SocketAddress)object2);
        if (passwordAuthentication == null) {
            return ((ivg)object3).c();
        }
        ((ivg)object3).d = passwordAuthentication.getUserName();
        object = passwordAuthentication.getPassword() == null ? var2_3 : new String(passwordAuthentication.getPassword());
        ((ivg)object3).b = object;
        return ((ivg)object3).c();
    }
}

