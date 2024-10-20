/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

final class kky
extends HttpsURLConnection {
    private final HttpURLConnection a;
    private final kla b;

    public kky(URL object, kgp kgp2) {
        object = new kla((URL)object, kgp2);
        super(((URLConnection)object).getURL());
        this.a = object;
        this.b = object;
    }

    protected final kgj a() {
        kla kla2 = this.b;
        if (kla2.k != null) {
            return kla2.j;
        }
        throw new IllegalStateException("Connection has not yet been established");
    }

    @Override
    public final void addRequestProperty(String string, String string2) {
        this.a.addRequestProperty(string, string2);
    }

    @Override
    public final void connect() {
        this.connected = true;
        this.a.connect();
    }

    @Override
    public final void disconnect() {
        this.a.disconnect();
    }

    @Override
    public final boolean getAllowUserInteraction() {
        return this.a.getAllowUserInteraction();
    }

    @Override
    public final String getCipherSuite() {
        kgj kgj2 = this.a();
        if (kgj2 != null) {
            return kgj2.b.s;
        }
        return null;
    }

    @Override
    public final int getConnectTimeout() {
        return this.a.getConnectTimeout();
    }

    @Override
    public final Object getContent() {
        return this.a.getContent();
    }

    public final Object getContent(Class[] classArray) {
        return this.a.getContent(classArray);
    }

    @Override
    public final String getContentEncoding() {
        return this.a.getContentEncoding();
    }

    @Override
    public final int getContentLength() {
        return this.a.getContentLength();
    }

    @Override
    public final long getContentLengthLong() {
        return ag$$ExternalSyntheticApiModelOutline1.m(this.a);
    }

    @Override
    public final String getContentType() {
        return this.a.getContentType();
    }

    @Override
    public final long getDate() {
        return this.a.getDate();
    }

    @Override
    public final boolean getDefaultUseCaches() {
        return this.a.getDefaultUseCaches();
    }

    @Override
    public final boolean getDoInput() {
        return this.a.getDoInput();
    }

    @Override
    public final boolean getDoOutput() {
        return this.a.getDoOutput();
    }

    @Override
    public final InputStream getErrorStream() {
        return this.a.getErrorStream();
    }

    @Override
    public final long getExpiration() {
        return this.a.getExpiration();
    }

    @Override
    public final String getHeaderField(int n2) {
        return this.a.getHeaderField(n2);
    }

    @Override
    public final String getHeaderField(String string) {
        return this.a.getHeaderField(string);
    }

    @Override
    public final long getHeaderFieldDate(String string, long l2) {
        return this.a.getHeaderFieldDate(string, l2);
    }

    @Override
    public final int getHeaderFieldInt(String string, int n2) {
        return this.a.getHeaderFieldInt(string, n2);
    }

    @Override
    public final String getHeaderFieldKey(int n2) {
        return this.a.getHeaderFieldKey(n2);
    }

    @Override
    public final long getHeaderFieldLong(String string, long l2) {
        return ag$$ExternalSyntheticApiModelOutline1.m(this.a, string, l2);
    }

    public final Map getHeaderFields() {
        return this.a.getHeaderFields();
    }

    @Override
    public final HostnameVerifier getHostnameVerifier() {
        return this.b.a.s;
    }

    @Override
    public final long getIfModifiedSince() {
        return this.a.getIfModifiedSince();
    }

    @Override
    public final InputStream getInputStream() {
        return this.a.getInputStream();
    }

    @Override
    public final boolean getInstanceFollowRedirects() {
        return this.a.getInstanceFollowRedirects();
    }

    @Override
    public final long getLastModified() {
        return this.a.getLastModified();
    }

    @Override
    public final Certificate[] getLocalCertificates() {
        Object object = this.a();
        if (object != null && !(object = ((kgj)object).c).isEmpty()) {
            return object.toArray(new Certificate[object.size()]);
        }
        return null;
    }

    @Override
    public final Principal getLocalPrincipal() {
        Object object = this.a();
        if (object != null && (object = (object = jns.l(((kgj)object).c)) instanceof X509Certificate ? (X509Certificate)object : null) != null) {
            return ((X509Certificate)object).getSubjectX500Principal();
        }
        return null;
    }

    @Override
    public final OutputStream getOutputStream() {
        return this.a.getOutputStream();
    }

    @Override
    public final Principal getPeerPrincipal() {
        Object object = this.a();
        if (object != null && (object = (object = jns.l(((kgj)object).a())) instanceof X509Certificate ? (X509Certificate)object : null) != null) {
            return ((X509Certificate)object).getSubjectX500Principal();
        }
        return null;
    }

    @Override
    public final Permission getPermission() {
        return this.a.getPermission();
    }

    @Override
    public final int getReadTimeout() {
        return this.a.getReadTimeout();
    }

    @Override
    public final String getRequestMethod() {
        return this.a.getRequestMethod();
    }

    public final Map getRequestProperties() {
        return this.a.getRequestProperties();
    }

    @Override
    public final String getRequestProperty(String string) {
        return this.a.getRequestProperty(string);
    }

    @Override
    public final int getResponseCode() {
        return this.a.getResponseCode();
    }

    @Override
    public final String getResponseMessage() {
        return this.a.getResponseMessage();
    }

    @Override
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.b.a.a();
    }

    @Override
    public final Certificate[] getServerCertificates() {
        Object object = this.a();
        if (object != null && !(object = ((kgj)object).a()).isEmpty()) {
            return object.toArray(new Certificate[object.size()]);
        }
        return null;
    }

    @Override
    public final URL getURL() {
        return this.a.getURL();
    }

    @Override
    public final boolean getUseCaches() {
        return this.a.getUseCaches();
    }

    @Override
    public final void setAllowUserInteraction(boolean bl2) {
        this.a.setAllowUserInteraction(bl2);
    }

    @Override
    public final void setChunkedStreamingMode(int n2) {
        this.a.setChunkedStreamingMode(n2);
    }

    @Override
    public final void setConnectTimeout(int n2) {
        this.a.setConnectTimeout(n2);
    }

    @Override
    public final void setDefaultUseCaches(boolean bl2) {
        this.a.setDefaultUseCaches(bl2);
    }

    @Override
    public final void setDoInput(boolean bl2) {
        this.a.setDoInput(bl2);
    }

    @Override
    public final void setDoOutput(boolean bl2) {
        this.a.setDoOutput(bl2);
    }

    @Override
    public final void setFixedLengthStreamingMode(int n2) {
        this.a.setFixedLengthStreamingMode(n2);
    }

    @Override
    public final void setFixedLengthStreamingMode(long l2) {
        this.a.setFixedLengthStreamingMode(l2);
    }

    @Override
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        kla kla2 = this.b;
        kgo kgo2 = new kgo(kla2.a);
        jse.e(hostnameVerifier, "hostnameVerifier");
        if (!jse.i(hostnameVerifier, kgo2.q)) {
            kgo2.x = null;
        }
        kgo2.q = hostnameVerifier;
        kla2.a = new kgp(kgo2);
    }

    @Override
    public final void setIfModifiedSince(long l2) {
        this.a.setIfModifiedSince(l2);
    }

    @Override
    public final void setInstanceFollowRedirects(boolean bl2) {
        this.a.setInstanceFollowRedirects(bl2);
    }

    @Override
    public final void setReadTimeout(int n2) {
        this.a.setReadTimeout(n2);
    }

    @Override
    public final void setRequestMethod(String string) {
        this.a.setRequestMethod(string);
    }

    @Override
    public final void setRequestProperty(String string, String string2) {
        this.a.setRequestProperty(string, string2);
    }

    @Override
    public final void setSSLSocketFactory(SSLSocketFactory object) {
        if (object != null) {
            Object object2 = this.b;
            Object object3 = new kgo(((kla)object2).a);
            if (!jse.i(object, ((kgo)object3).m)) {
                ((kgo)object3).x = null;
            }
            ((kgo)object3).m = object;
            X509TrustManager x509TrustManager = kkf.b.b((SSLSocketFactory)object);
            if (x509TrustManager != null) {
                ((kgo)object3).n = x509TrustManager;
                object = kkf.b;
                x509TrustManager = ((kgo)object3).n;
                jse.b(x509TrustManager);
                ((kgo)object3).s = ((kkf)object).c(x509TrustManager);
                ((kla)object2).a = new kgp((kgo)object3);
                return;
            }
            object3 = object.getClass();
            object2 = kkf.b;
            object = new StringBuilder("Unable to extract the trust manager on ");
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append(", sslSocketFactory is ");
            ((StringBuilder)object).append(object3);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        throw new IllegalArgumentException("sslSocketFactory == null");
    }

    @Override
    public final void setUseCaches(boolean bl2) {
        this.a.setUseCaches(bl2);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final boolean usingProxy() {
        return this.a.usingProxy();
    }
}

