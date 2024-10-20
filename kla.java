/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class kla
extends HttpURLConnection {
    kgp a;
    final kkz b = new kkz(this);
    kgk c;
    boolean d;
    long e = -1L;
    public final Object f;
    kgv g;
    boolean h = true;
    Proxy i;
    kgj j;
    khp k;
    final bzo l = new bzo(null, null, null);
    private kgv m;
    private Throwable n;

    public kla(URL uRL, kgp kgp2) {
        super(uRL);
        this.f = new Object();
        this.a = kgp2;
    }

    static /* synthetic */ void b(kla kla2, URL uRL) {
        kla2.url = uRL;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final kgv e(boolean var1_1) {
        block26: {
            var2_2 = this.f;
            synchronized (var2_2) {
                var3_4 = this.m;
                if (var3_4 != null) {
                    return var3_4;
                }
                var3_4 = this.n;
                if (var3_4 != null) {
                    if (var1_1 && (var4_9 = this.g) != null) {
                        return var4_9;
                    }
                    throw klg.a((Throwable)var3_4);
                }
            }
            var2_2 = this.f();
            this.b.b();
            var3_4 = var2_2.b.d;
            if (var3_4 != null) {
                ((klc)var3_4).e.close();
            }
            if (this.d) {
                var2_2 = this.f;
                synchronized (var2_2) {
                    try {
                        try {
                            while (this.m == null && this.n == null) {
                                this.f.wait();
                            }
                            break block26;
                        }
                        catch (InterruptedException var3_6) {
                            Thread.currentThread().interrupt();
                            var3_7 = new InterruptedIOException();
                            throw var3_7;
                        }
                    }
                    catch (Throwable var3_5) {}
                    throw var3_5;
                }
            }
            this.d = true;
            try {
                if (var2_2.f.compareAndSet(false, true)) {
                    var2_2.e.e();
                    var2_2.f();
                }
                ** GOTO lbl50
            }
            catch (IOException var2_3) {
                this.c(var2_3);
                break block26;
            }
            try {
                var2_2.a.c.b((khp)var2_2);
                var3_4 = var2_2.d();
            }
            finally {
                var2_2.a.c.d((khp)var2_2);
            }
            {
                this.d((kgv)var3_4);
                break block26;
lbl50:
                // 1 sources

                var2_2 = new IllegalStateException("Already Executed");
                throw var2_2;
            }
        }
        var2_2 = this.f;
        synchronized (var2_2) {
            var3_4 = this.n;
            if (var3_4 != null) {
                throw klg.a((Throwable)var3_4);
            }
            var3_4 = this.m;
            if (var3_4 != null) {
                return var3_4;
            }
            throw new AssertionError();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final khp f() {
        int n2;
        Object object;
        Object object2;
        int n3;
        Object object3;
        block17: {
            block16: {
                int n4;
                int n5;
                int n6;
                block19: {
                    block18: {
                        object3 = this.k;
                        if (object3 != null) {
                            return object3;
                        }
                        n3 = 1;
                        this.connected = true;
                        if (this.doOutput) {
                            if (this.method.equals("GET")) {
                                this.method = "POST";
                            } else if (!klg.f(this.method)) {
                                throw new ProtocolException(String.valueOf(this.method).concat(" does not support writing"));
                            }
                        }
                        if (this.l.av("User-Agent") != null) break block17;
                        object2 = this.l;
                        object = klg.g();
                        if (object == null) break block18;
                        n2 = 0;
                        while (true) {
                            n6 = ((String)object).length();
                            object3 = object;
                            if (n2 >= n6) break block16;
                            n5 = ((String)object).codePointAt(n2);
                            if (n5 <= 31 || n5 >= 127) break;
                            n2 += Character.charCount(n5);
                        }
                        object3 = new klm();
                        ((klm)object3).K((String)object, 0, n2);
                        ((klm)object3).L(63);
                        n4 = n2;
                        break block19;
                    }
                    object3 = "ObsoleteUrlFactory";
                    break block16;
                }
                while ((n4 += Character.charCount(n5)) < n6) {
                    n2 = ((String)object).codePointAt(n4);
                    n5 = n2 > 31 && n2 < 127 ? n2 : 63;
                    ((klm)object3).L(n5);
                    n5 = n2;
                }
                object3 = ((klm)object3).k();
            }
            ((bzo)object2).az("User-Agent", (String)object3);
        }
        if (klg.f(this.method)) {
            if (this.l.av("Content-Type") == null) {
                this.l.az("Content-Type", "application/x-www-form-urlencoded");
            }
            long l2 = this.e;
            long l3 = -1L;
            n2 = n3;
            if (l2 == -1L) {
                n2 = this.chunkLength > 0 ? n3 : 0;
            }
            object3 = this.l.av("Content-Length");
            l2 = this.e;
            if (l2 != -1L) {
                l3 = l2;
            } else if (object3 != null) {
                l3 = Long.parseLong((String)object3);
            }
            object3 = n2 != 0 ? new kld(l3) : new kkx(l3);
            ((klc)object3).c.n(this.a.x, TimeUnit.MILLISECONDS);
        } else {
            object3 = null;
        }
        try {
            object = this.getURL().toString();
            object2 = kgm.a;
            jse.e(object, "<this>");
            object2 = new kgl();
            ((kgl)object2).c(null, (String)object);
            object = ((kgl)object2).a();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = new MalformedURLException();
            ((Throwable)object).initCause(illegalArgumentException);
            throw object;
        }
        object2 = new kgr();
        ((kgr)object2).a = object;
        ((kgr)object2).b = this.l.aw().e();
        ((kgr)object2).c(this.method, (kgt)object3);
        object = ((kgr)object2).a();
        object3 = new kgo(this.a);
        ((kgo)object3).b.clear();
        ((kgo)object3).b.add(klf.a);
        ((kgo)object3).c.clear();
        ((kgo)object3).c.add(this.b);
        ((kgo)object3).a = new kge(this.a.c.a());
        this.getUseCaches();
        this.k = object3 = new khp(new kgp((kgo)object3), (kgs)object);
        return object3;
    }

    final kgk a() {
        if (this.c == null) {
            Object object = this.e(true);
            Object object2 = ((kgv)object).f;
            Object object3 = ((kgv)object).b;
            object2 = ((kgk)object2).e();
            ((bzo)object2).az("ObsoleteUrlFactory-Selected-Protocol", ((kgq)((Object)object3)).g);
            object3 = ((kgv)object).h;
            int n2 = klg.e;
            if (object3 == null) {
                if (((kgv)object).i == null) {
                    object = "NONE";
                } else {
                    n2 = ((kgv)object).d;
                    object = new StringBuilder("CACHE ");
                    ((StringBuilder)object).append(n2);
                    object = ((StringBuilder)object).toString();
                }
            } else if (((kgv)object).i == null) {
                n2 = ((kgv)object).d;
                object = new StringBuilder("NETWORK ");
                ((StringBuilder)object).append(n2);
                object = ((StringBuilder)object).toString();
            } else {
                object = ((kgv)object).h;
                object3 = new StringBuilder("CONDITIONAL_CACHE ");
                ((StringBuilder)object3).append(((kgv)object).d);
                object = ((StringBuilder)object3).toString();
            }
            ((bzo)object2).az("ObsoleteUrlFactory-Response-Source", (String)object);
            this.c = ((bzo)object2).aw();
        }
        return this.c;
    }

    @Override
    public final void addRequestProperty(String string, String string2) {
        if (!this.connected) {
            if (string != null) {
                if (string2 == null) {
                    return;
                }
                this.l.az(string, string2);
                return;
            }
            throw new NullPointerException("field == null");
        }
        throw new IllegalStateException("Cannot add request property after connection is made");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(IOException iOException) {
        Object object = this.f;
        synchronized (object) {
            Throwable throwable = iOException;
            if (iOException instanceof klf) {
                throwable = iOException.getCause();
            }
            this.n = throwable;
            this.f.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void connect() {
        if (this.d) {
            return;
        }
        Object object = this.f();
        this.d = true;
        if (!((khp)object).f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        ((khp)object).f();
        Object object2 = ((khp)object).a;
        object = new khm((khp)object, this);
        kge kge2 = ((kgp)object2).c;
        synchronized (kge2) {
            block14: {
                kge2.a.add(object);
                String string = ((khm)object).a();
                Iterator iterator = kge2.b.iterator();
                jse.d(iterator, "iterator(...)");
                while (iterator.hasNext()) {
                    object2 = (khm)iterator.next();
                    if (!jse.i(((khm)object2).a(), string)) continue;
                    break block14;
                }
                iterator = kge2.a.iterator();
                jse.d(iterator, "iterator(...)");
                while (iterator.hasNext()) {
                    object2 = (khm)iterator.next();
                    if (!jse.i(((khm)object2).a(), string)) continue;
                    break block14;
                }
                object2 = null;
            }
            if (object2 != null) {
                ((khm)object).a = ((khm)object2).a;
            }
        }
        kge2.e();
        object2 = this.f;
        synchronized (object2) {
            try {
                block15: {
                    try {
                        while (this.h && this.m == null && this.n == null) {
                            this.f.wait();
                        }
                        object = this.n;
                        if (object != null) break block15;
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        InterruptedIOException interruptedIOException = new InterruptedIOException();
                        throw interruptedIOException;
                    }
                    return;
                }
                throw klg.a((Throwable)object);
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(kgv kgv2) {
        Object object = this.f;
        synchronized (object) {
            this.m = kgv2;
            this.j = kgv2.e;
            this.url = kgv2.a.a.g();
            this.f.notifyAll();
            return;
        }
    }

    @Override
    public final void disconnect() {
        if (this.k == null) {
            return;
        }
        this.b.b();
        this.k.g();
    }

    @Override
    public final int getConnectTimeout() {
        return this.a.v;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final InputStream getErrorStream() {
        try {
            kgv kgv2 = this.e(true);
            int n2 = klg.e;
            if (kgv2.a.b.equals("HEAD")) {
                return null;
            }
            n2 = kgv2.d;
            if (n2 >= 100 && n2 < 200 || n2 == 204 || n2 == 304) {
                long l2;
                String string = kgv2.f.b("Content-Length");
                if (string != null) {
                    try {
                        l2 = Long.parseLong(string);
                    }
                    catch (NumberFormatException numberFormatException) {}
                }
                l2 = -1L;
                if (l2 == -1L) {
                    if (!"chunked".equalsIgnoreCase(kgv.a(kgv2, "Transfer-Encoding"))) return null;
                }
            }
            if (kgv2.d < 400) return null;
            return kgv2.g.c();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String getHeaderField(int n2) {
        kgk kgk2;
        try {
            kgk2 = this.a();
            if (n2 < 0) return null;
        }
        catch (IOException iOException) {
            return null;
        }
        if (n2 < kgk2.a()) return kgk2.d(n2);
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String getHeaderField(String string) {
        if (string != null) return this.a().b(string);
        try {
            return klg.b(this.e(true));
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String getHeaderFieldKey(int n2) {
        kgk kgk2;
        try {
            kgk2 = this.a();
            if (n2 < 0) return null;
        }
        catch (IOException iOException) {
            return null;
        }
        if (n2 < kgk2.a()) return kgk2.c(n2);
        return null;
    }

    public final Map getHeaderFields() {
        try {
            Map map = klg.e(this.a(), klg.b(this.e(true)));
            return map;
        }
        catch (IOException iOException) {
            return Collections.emptyMap();
        }
    }

    @Override
    public final InputStream getInputStream() {
        if (this.doInput) {
            kgv kgv2 = this.e(false);
            if (kgv2.d < 400) {
                return kgv2.g.c();
            }
            throw new FileNotFoundException(this.url.toString());
        }
        throw new ProtocolException("This protocol does not support input");
    }

    @Override
    public final boolean getInstanceFollowRedirects() {
        return this.a.h;
    }

    @Override
    public final OutputStream getOutputStream() {
        kgt kgt2 = this.f().b.d;
        if (kgt2 != null) {
            if (kgt2 instanceof kld) {
                this.connect();
                this.b.b();
            }
            kgt2 = (klc)kgt2;
            if (!((klc)kgt2).f) {
                return ((klc)kgt2).e;
            }
            throw new ProtocolException("cannot write request body after response has been read");
        }
        throw new ProtocolException("method does not support a request body: ".concat(String.valueOf(this.method)));
    }

    @Override
    public final Permission getPermission() {
        int n2;
        Object object = this.getURL();
        String string = ((URL)object).getHost();
        if (((URL)object).getPort() != -1) {
            n2 = ((URL)object).getPort();
        } else {
            String string2 = ((URL)object).getProtocol();
            object = kgm.a;
            n2 = jvf.t(string2);
        }
        if (this.usingProxy()) {
            object = (InetSocketAddress)this.a.k.address();
            string = ((InetSocketAddress)object).getHostName();
            n2 = ((InetSocketAddress)object).getPort();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(n2);
        return new SocketPermission(((StringBuilder)object).toString(), "connect, resolve");
    }

    @Override
    public final int getReadTimeout() {
        return this.a.w;
    }

    public final Map getRequestProperties() {
        if (!this.connected) {
            return klg.e(this.l.aw(), null);
        }
        throw new IllegalStateException("Cannot access request header fields after connection is set");
    }

    @Override
    public final String getRequestProperty(String string) {
        if (string == null) {
            return null;
        }
        return this.l.av(string);
    }

    @Override
    public final int getResponseCode() {
        return this.e((boolean)true).d;
    }

    @Override
    public final String getResponseMessage() {
        return this.e((boolean)true).c;
    }

    @Override
    public final void setConnectTimeout(int n2) {
        kgo kgo2 = new kgo(this.a);
        kgo2.a(n2, TimeUnit.MILLISECONDS);
        this.a = new kgp(kgo2);
    }

    @Override
    public final void setFixedLengthStreamingMode(int n2) {
        this.setFixedLengthStreamingMode((long)n2);
    }

    @Override
    public final void setFixedLengthStreamingMode(long l2) {
        if (!this.connected) {
            if (this.chunkLength <= 0) {
                if (l2 >= 0L) {
                    this.e = l2;
                    this.fixedContentLength = (int)Math.min(l2, Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException("contentLength < 0");
            }
            throw new IllegalStateException("Already in chunked mode");
        }
        throw new IllegalStateException("Already connected");
    }

    @Override
    public final void setIfModifiedSince(long l2) {
        super.setIfModifiedSince(l2);
        if (this.ifModifiedSince != 0L) {
            bzo bzo2 = this.l;
            Date date = new Date(this.ifModifiedSince);
            bzo2.ay("If-Modified-Since", ((DateFormat)klg.c.get()).format(date));
            return;
        }
        this.l.aA("If-Modified-Since");
    }

    @Override
    public final void setInstanceFollowRedirects(boolean bl2) {
        kgo kgo2 = new kgo(this.a);
        kgo2.f = bl2;
        this.a = new kgp(kgo2);
    }

    @Override
    public final void setReadTimeout(int n2) {
        kgo kgo2 = new kgo(this.a);
        kgo2.b(n2, TimeUnit.MILLISECONDS);
        this.a = new kgp(kgo2);
    }

    @Override
    public final void setRequestMethod(String string) {
        if (klg.a.contains(string)) {
            this.method = string;
            return;
        }
        String string2 = String.valueOf(klg.a);
        StringBuilder stringBuilder = new StringBuilder("Expected one of ");
        stringBuilder.append(string2);
        stringBuilder.append(" but was ");
        stringBuilder.append(string);
        throw new ProtocolException(stringBuilder.toString());
    }

    @Override
    public final void setRequestProperty(String string, String string2) {
        if (!this.connected) {
            if (string != null) {
                if (string2 == null) {
                    return;
                }
                this.l.ay(string, string2);
                return;
            }
            throw new NullPointerException("field == null");
        }
        throw new IllegalStateException("Cannot set request property after connection is made");
    }

    @Override
    public final boolean usingProxy() {
        if (this.i != null) {
            return true;
        }
        Proxy proxy = this.a.k;
        return proxy != null && proxy.type() != Proxy.Type.DIRECT;
    }
}

