/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

public final class klg
implements URLStreamHandlerFactory,
Cloneable {
    static final Set a = new LinkedHashSet<String>(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));
    static final TimeZone b = DesugarTimeZone.getTimeZone("GMT");
    static final ThreadLocal c = new kkv();
    static final Comparator d = new dfs(9);
    public static final int e = 0;
    private final kgp f;

    public klg(kgp kgp2) {
        this.f = kgp2;
    }

    static IOException a(Throwable throwable) {
        if (!(throwable instanceof IOException)) {
            if (!(throwable instanceof Error)) {
                if (throwable instanceof RuntimeException) {
                    throw (RuntimeException)throwable;
                }
                throw new AssertionError();
            }
            throw (Error)throwable;
        }
        throw (IOException)throwable;
    }

    static String b(kgv kgv2) {
        kgq kgq2 = kgv2.b;
        Object object = kgq.a;
        StringBuilder stringBuilder = new StringBuilder();
        object = kgq2 == object ? "HTTP/1.0" : "HTTP/1.1";
        stringBuilder.append((String)object);
        stringBuilder.append(" ");
        stringBuilder.append(kgv2.d);
        stringBuilder.append(" ");
        stringBuilder.append(kgv2.c);
        return stringBuilder.toString();
    }

    static Map e(kgk kgk2, String string) {
        TreeMap treeMap = new TreeMap(d);
        int n2 = kgk2.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = kgk2.c(i2);
            String string3 = kgk2.d(i2);
            ArrayList<String> arrayList = new ArrayList<String>();
            List list = (List)treeMap.get(string2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(string3);
            treeMap.put(string2, DesugarCollections.unmodifiableList(arrayList));
        }
        if (string != null) {
            treeMap.put(null, DesugarCollections.unmodifiableList(Collections.singletonList(string)));
        }
        return DesugarCollections.unmodifiableMap(treeMap);
    }

    static boolean f(String string) {
        return !string.equals("GET") && !string.equals("HEAD");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static String g() {
        block3: {
            try {
                String string = System.getProperty("http.agent");
                if (string == null) break block3;
                return string;
            }
            catch (AccessControlException accessControlException) {
                return null;
            }
        }
        return null;
    }

    public final HttpURLConnection c(URL uRL) {
        return this.d(uRL, this.f.k);
    }

    @Override
    public final URLStreamHandler createURLStreamHandler(String string) {
        if (!string.equals("http") && !string.equals("https")) {
            return null;
        }
        return new kkw(this, string);
    }

    final HttpURLConnection d(URL uRL, Proxy object) {
        String string = uRL.getProtocol();
        kgo kgo2 = new kgo(this.f);
        if (!jse.i(object, kgo2.i)) {
            kgo2.x = null;
        }
        kgo2.i = object;
        object = new kgp(kgo2);
        if (string.equals("http")) {
            return new kla(uRL, (kgp)object);
        }
        if (string.equals("https")) {
            return new kky(uRL, (kgp)object);
        }
        throw new IllegalArgumentException("Unexpected protocol: ".concat(String.valueOf(string)));
    }
}

