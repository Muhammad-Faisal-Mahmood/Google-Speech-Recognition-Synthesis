/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public final class jfy
extends kmp {
    public static final Logger a = Logger.getLogger(jfy.class.getName());
    static final long b = TimeUnit.MINUTES.toMillis(30L);
    static final long c = TimeUnit.SECONDS.toMillis(1L);
    public static final jgp d = new jjn(jeb.o, 0);
    static final Pattern e;
    public static final Method f;
    private static final iuw v;
    private static final iug w;
    public jgp g;
    public jgp h;
    public final List i;
    public ixl j;
    final List k;
    public final String l;
    public String m;
    final iuw n;
    final iug o;
    long p;
    public boolean q;
    final ivk r;
    public Map s;
    public final jfu t;
    public final jft u;

    static {
        v = iuw.b;
        w = iug.a;
        e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        GenericDeclaration genericDeclaration = null;
        try {
            GenericDeclaration genericDeclaration2 = Class.forName("jar");
            Class<Boolean> clazz = Boolean.TYPE;
            genericDeclaration = genericDeclaration2 = genericDeclaration2.getDeclaredMethod("getClientInterceptor", clazz, clazz, clazz, clazz);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Level level = Level.FINE;
            a.logp(level, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", noSuchMethodException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            Level level = Level.FINE;
            a.logp(level, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", classNotFoundException);
        }
        f = genericDeclaration;
    }

    public jfy(String string, jfu jfu2, jft jft2) {
        super(null);
        jgp jgp2;
        this.g = jgp2 = d;
        this.h = jgp2;
        this.i = new ArrayList();
        this.j = ixl.b();
        this.k = new ArrayList();
        this.n = v;
        this.o = w;
        this.p = b;
        this.q = true;
        this.r = ivk.b;
        new ArrayList();
        a.s(string, "target");
        this.l = string;
        this.t = jfu2;
        this.u = jft2;
        kmp.Q();
    }

    public jfy(SocketAddress socketAddress, String string, jfu object) {
        super(null);
        jgp jgp2;
        this.g = jgp2 = d;
        this.h = jgp2;
        this.i = new ArrayList();
        this.j = ixl.b();
        this.k = new ArrayList();
        this.n = v;
        this.o = w;
        this.p = b;
        this.q = true;
        this.r = ivk.b;
        new ArrayList();
        this.l = jfy.j(socketAddress);
        this.t = object;
        object = new ixl();
        ((ixl)object).e(new jfw(socketAddress, string));
        this.j = object;
        this.u = new jkh();
        kmp.Q();
    }

    private static List V(List object) {
        Object object2 = new ArrayList<Object>(object.size());
        Object object3 = object.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            if (object == null) {
                object2.add(null);
                continue;
            }
            if (object instanceof Map) {
                object2.add(jfy.k((Map)object));
                continue;
            }
            if (object instanceof List) {
                object2.add(jfy.V((List)object));
                continue;
            }
            if (object instanceof String) {
                object2.add(object);
                continue;
            }
            if (object instanceof Double) {
                object2.add(object);
                continue;
            }
            if (object instanceof Boolean) {
                object2.add(object);
                continue;
            }
            object2 = object.toString();
            object3 = String.valueOf(object.getClass());
            object = new StringBuilder("The entry '");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("' is of type '");
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append("', which is not supported");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return DesugarCollections.unmodifiableList(object2);
    }

    static String j(SocketAddress object) {
        try {
            object = String.valueOf(object);
            StringBuilder stringBuilder = new StringBuilder("/");
            stringBuilder.append((String)object);
            URI uRI = new URI("directaddress", "", stringBuilder.toString(), null);
            object = uRI.toString();
            return object;
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new RuntimeException(uRISyntaxException);
        }
    }

    public static Map k(Map object) {
        Object object2 = new LinkedHashMap<String, Object>();
        for (Map.Entry entry : object.entrySet()) {
            fxf.v(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String string = (String)entry.getKey();
            object = entry.getValue();
            if (object == null) {
                object2.put(string, null);
                continue;
            }
            if (object instanceof Map) {
                object2.put(string, jfy.k((Map)object));
                continue;
            }
            if (object instanceof List) {
                object2.put(string, jfy.V((List)object));
                continue;
            }
            if (object instanceof String) {
                object2.put(string, object);
                continue;
            }
            if (object instanceof Double) {
                object2.put(string, object);
                continue;
            }
            if (object instanceof Boolean) {
                object2.put(string, object);
                continue;
            }
            object2 = String.valueOf(entry);
            string = String.valueOf(object.getClass());
            object = new StringBuilder("The value of the map entry '");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("' is of type '");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("', which is not supported");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return DesugarCollections.unmodifiableMap(object2);
    }

    public static ksb m(String string, ixl object, Collection collection) {
        URI uRI;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            uRI = new URI(string);
        }
        catch (URISyntaxException uRISyntaxException) {
            stringBuilder.append(uRISyntaxException.getMessage());
            uRI = null;
        }
        ixj ixj2 = uRI != null ? ((ixl)object).a(uRI.getScheme()) : null;
        String string2 = "";
        URI uRI2 = uRI;
        ixj ixj3 = ixj2;
        if (ixj2 == null) {
            uRI2 = uRI;
            ixj3 = ixj2;
            if (!e.matcher(string).matches()) {
                try {
                    uRI2 = new URI(((ixl)object).c(), "", a.ai(string, "/"), null);
                    ixj3 = ((ixl)object).a(uRI2.getScheme());
                }
                catch (URISyntaxException uRISyntaxException) {
                    throw new IllegalArgumentException(uRISyntaxException);
                }
            }
        }
        if (ixj3 == null) {
            object = string2;
            if (stringBuilder.length() > 0) {
                object = a.ar(stringBuilder, " (", ")");
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", string, object));
        }
        if (collection != null && !collection.containsAll(ixj3.c())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uRI2.getScheme(), string));
        }
        return new ksb(uRI2, ixj3);
    }

    public final void l(long l2, TimeUnit timeUnit) {
        boolean bl2 = l2 > 0L;
        fxf.u(bl2, "idle timeout is %s, but must be positive", l2);
        if (timeUnit.toDays(l2) >= 30L) {
            this.p = -1L;
            return;
        }
        this.p = Math.max(timeUnit.toMillis(l2), c);
    }
}

