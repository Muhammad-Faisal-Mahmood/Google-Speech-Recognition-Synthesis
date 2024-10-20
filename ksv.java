/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 *  android.os.Build$VERSION
 *  android.util.Pair
 */
import android.net.TrafficStats;
import android.os.Build;
import android.util.Pair;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;

public final class ksv
extends HttpURLConnection {
    public final ksy a;
    public kpt b;
    public final ksw c;
    public ksx d;
    public kpv e;
    public IOException f;
    public boolean g;
    private final koc h;
    private final List i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private List o;
    private Map p;

    public ksv(URL uRL, koc koc2) {
        super(uRL);
        this.h = koc2;
        this.a = new ksy();
        this.c = new ksw(this);
        this.i = new ArrayList();
    }

    static /* synthetic */ URL a(ksv ksv2) {
        return ksv2.url;
    }

    static /* synthetic */ boolean c(ksv ksv2) {
        return ksv2.instanceFollowRedirects;
    }

    static /* synthetic */ boolean d(ksv ksv2) {
        return ksv2.instanceFollowRedirects;
    }

    static /* bridge */ /* synthetic */ void e(ksv ksv2) {
        ksv2.n = true;
    }

    static /* synthetic */ void f(ksv ksv2, URL uRL) {
        ksv2.url = uRL;
    }

    private final int g(String string) {
        for (int i2 = 0; i2 < this.i.size(); ++i2) {
            if (!((String)((Pair)this.i.get((int)i2)).first).equalsIgnoreCase(string)) continue;
            return i2;
        }
        return -1;
    }

    private final List h() {
        Object object2 = this.o;
        if (object2 != null) {
            return object2;
        }
        this.o = new ArrayList();
        for (Object object2 : this.e.b()) {
            if (((String)object2.getKey()).equalsIgnoreCase("Content-Encoding")) continue;
            this.o.add(new AbstractMap.SimpleImmutableEntry(object2));
        }
        this.o = object2 = DesugarCollections.unmodifiableList(this.o);
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Map.Entry i(int n2) {
        List list;
        try {
            this.k();
            list = this.h();
            if (n2 >= list.size()) return null;
        }
        catch (IOException iOException) {
            return null;
        }
        return (Map.Entry)list.get(n2);
    }

    private final Map j() {
        Map map = this.p;
        if (map != null) {
            return map;
        }
        map = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : this.h()) {
            ArrayList<String> arrayList = new ArrayList<String>();
            if (map.containsKey(entry.getKey())) {
                arrayList.addAll((Collection)map.get(entry.getKey()));
            }
            arrayList.add((String)entry.getValue());
            map.put((String)entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        this.p = map = DesugarCollections.unmodifiableMap(map);
        return map;
    }

    private final void k() {
        Object object = this.d;
        if (object != null) {
            ((ksx)object).b();
            this.d.close();
        }
        if (!this.n) {
            this.m();
            this.a.a();
        }
        if (this.n) {
            object = this.f;
            if (object == null) {
                if (this.e != null) {
                    return;
                }
                throw new NullPointerException("Response info is null when there is no exception.");
            }
            throw object;
        }
        throw new IllegalStateException("No response.");
    }

    private final void l(String string, String string2, boolean bl2) {
        if (!this.connected) {
            int n2 = this.g(string);
            if (n2 >= 0) {
                if (bl2) {
                    this.i.remove(n2);
                } else {
                    throw new UnsupportedOperationException(a.aj(string, "Cannot add multiple headers of the same key, ", ". crbug.com/432719."));
                }
            }
            this.i.add(Pair.create((Object)string, (Object)string2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }

    private final void m() {
        Object object;
        Object object2;
        block24: {
            int n2;
            block23: {
                block22: {
                    Object object3;
                    block21: {
                        if (this.connected || (object2 = this.d) != null && !((ksx)object2).c()) {
                            return;
                        }
                        object2 = this.h.f(this.getURL().toString(), new ksu(this), this.a);
                        if (this.doOutput) {
                            if (this.method.equals("GET")) {
                                this.method = "POST";
                            }
                            if ((object3 = this.d) != null) {
                                object = this.a;
                                object3 = Objects.requireNonNull(((ksx)object3).a(), "Invalid UploadDataProvider.");
                                Object object4 = (ksc)object2;
                                object4.e = object3;
                                object4.f = (Executor)Objects.requireNonNull(object, "Invalid UploadDataProvider Executor.");
                                if (object4.a == null) {
                                    object4.a = "POST";
                                }
                                if (this.getRequestProperty("Content-Length") == null && !this.n()) {
                                    this.addRequestProperty("Content-Length", Long.toString(this.d.a().a()));
                                }
                            } else if (this.getRequestProperty("Content-Length") == null) {
                                this.addRequestProperty("Content-Length", "0");
                            }
                            if (this.getRequestProperty("Content-Type") == null) {
                                this.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                            }
                        }
                        for (Object object4 : this.i) {
                            object3 = (String)object4.first;
                            object4 = (String)object4.second;
                            ((ksc)object2).aj((String)object3, (String)object4);
                        }
                        if (!this.getUseCaches()) {
                            ((ksc)object2).b = true;
                        }
                        object3 = this.method;
                        object = (kol)object2;
                        ((kol)object).ai((String)object3);
                        if (this.j) break block21;
                        n2 = TrafficStats.getThreadStatsTag();
                        if (n2 != -1) {
                            this.k = n2;
                            this.j = true;
                        }
                        if (!this.j) break block22;
                    }
                    n2 = this.k;
                    object3 = (ksc)object2;
                    ((ksc)object3).h = true;
                    ((ksc)object3).i = n2;
                }
                if (this.l) break block23;
                if (Build.VERSION.SDK_INT < 28) break block24;
                n2 = fs$$ExternalSyntheticApiModelOutline0.m();
                if (n2 != -1) {
                    this.m = n2;
                    this.l = true;
                }
                if (!this.l) break block24;
            }
            n2 = this.m;
            object2 = (ksc)object2;
            ((ksc)object2).j = true;
            ((ksc)object2).k = n2;
        }
        this.b = object2 = ((kol)object).ah();
        ((kpt)object2).d();
        this.connected = true;
    }

    private final boolean n() {
        return this.chunkLength > 0;
    }

    @Override
    public final void addRequestProperty(String string, String string2) {
        this.l(string, string2, false);
    }

    public final void b(int n2) {
        if (!this.connected) {
            this.j = true;
            this.k = n2;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    @Override
    public final void connect() {
        this.getOutputStream();
        this.m();
    }

    @Override
    public final void disconnect() {
        if (this.connected) {
            this.b.a();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final InputStream getErrorStream() {
        block3: {
            try {
                this.k();
                if (this.e.a < 400) break block3;
                return this.c;
            }
            catch (IOException iOException) {
                return null;
            }
        }
        return null;
    }

    @Override
    public final String getHeaderField(int n2) {
        Map.Entry entry = this.i(n2);
        if (entry == null) {
            return null;
        }
        return (String)entry.getValue();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String getHeaderField(String object) {
        Map map;
        try {
            this.k();
            map = this.j();
            if (!map.containsKey(object)) return null;
        }
        catch (IOException iOException) {
            return null;
        }
        object = (List)map.get(object);
        return (String)object.get(object.size() - 1);
    }

    @Override
    public final String getHeaderFieldKey(int n2) {
        Map.Entry entry = this.i(n2);
        if (entry == null) {
            return null;
        }
        return (String)entry.getKey();
    }

    public final Map getHeaderFields() {
        try {
            this.k();
            return this.j();
        }
        catch (IOException iOException) {
            return Collections.emptyMap();
        }
    }

    @Override
    public final InputStream getInputStream() {
        this.k();
        if (!this.instanceFollowRedirects && this.g) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.e.a < 400) {
            return this.c;
        }
        throw new FileNotFoundException(this.url.toString());
    }

    @Override
    public final OutputStream getOutputStream() {
        if (this.d == null && this.doOutput) {
            if (!this.connected) {
                if (this.n()) {
                    this.d = new ksr(this, this.chunkLength, this.a);
                    this.m();
                } else {
                    long l2 = this.fixedContentLength;
                    if (this.fixedContentLengthLong != -1L) {
                        l2 = this.fixedContentLengthLong;
                    }
                    if (l2 != -1L) {
                        this.d = new kst(this, l2, this.a);
                        this.m();
                    } else {
                        String string = this.getRequestProperty("Content-Length");
                        this.d = string == null ? new ksp(this) : new ksp(this, Long.parseLong(string));
                    }
                }
            } else {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
        }
        return this.d;
    }

    public final Map getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Pair pair : this.i) {
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList<String> arrayList = new ArrayList<String>();
                    arrayList.add((String)pair.second);
                    treeMap.put((String)pair.first, DesugarCollections.unmodifiableList(arrayList));
                    continue;
                }
                throw new IllegalStateException("Should not have multiple values.");
            }
            return DesugarCollections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    @Override
    public final String getRequestProperty(String string) {
        int n2 = this.g(string);
        if (n2 >= 0) {
            return (String)((Pair)this.i.get((int)n2)).second;
        }
        return null;
    }

    @Override
    public final int getResponseCode() {
        this.k();
        return this.e.a;
    }

    @Override
    public final String getResponseMessage() {
        this.k();
        return this.e.b;
    }

    @Override
    public final void setConnectTimeout(int n2) {
    }

    @Override
    public final void setRequestProperty(String string, String string2) {
        this.l(string, string2, true);
    }

    @Override
    public final boolean usingProxy() {
        return false;
    }
}

