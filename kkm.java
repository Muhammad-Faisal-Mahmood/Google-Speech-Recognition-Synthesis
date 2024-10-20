/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public interface kkm {
    public String a(SSLSocket var1);

    public X509TrustManager b(SSLSocketFactory var1);

    public void c(SSLSocket var1, String var2, List var3);

    public boolean d();

    public boolean e(SSLSocket var1);

    public boolean f(SSLSocketFactory var1);
}

