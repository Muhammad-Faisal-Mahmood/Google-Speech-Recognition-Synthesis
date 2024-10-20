/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jeb {
    public static final Charset a;
    public static final iws b;
    public static final iws c;
    public static final iws d;
    public static final iws e;
    public static final iws f;
    static final iws g;
    public static final iws h;
    public static final iws i;
    public static final iws j;
    public static final guf k;
    public static final long l;
    public static final ixu m;
    public static final itv n;
    public static final jjl o;
    public static final jjl p;
    public static final gui q;
    private static final Logger r;
    private static final Set s;
    private static final iuc t;

    static {
        r = Logger.getLogger(jeb.class.getName());
        s = DesugarCollections.unmodifiableSet(EnumSet.of(iye.a, new iye[]{iye.d, iye.f, iye.g, iye.j, iye.k, iye.l, iye.p}));
        a = Charset.forName("US-ASCII");
        b = new iwm("grpc-timeout", new jea(0));
        c = new iwm("grpc-encoding", iwx.b);
        d = ivp.a("grpc-accept-encoding", new jed(1));
        e = new iwm("content-encoding", iwx.b);
        f = ivp.a("accept-encoding", new jed(1));
        g = new iwm("content-length", iwx.b);
        h = new iwm("content-type", iwx.b);
        i = new iwm("te", iwx.b);
        j = new iwm("user-agent", iwx.b);
        k = guf.b(',').d();
        l = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        m = new jhf();
        n = new itv("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        t = new iuc();
        o = new jdy();
        p = new jkg(1);
        q = new jhe(1);
    }

    private jeb() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static iyh a(int n2) {
        iye iye2;
        block10: {
            block11: {
                if (n2 >= 100 && n2 < 200) {
                    iye2 = iye.n;
                    return iye2.a().e(a.af(n2, "HTTP status code "));
                }
                if (n2 == 400) break block10;
                if (n2 == 401) {
                    iye2 = iye.q;
                    return iye2.a().e(a.af(n2, "HTTP status code "));
                }
                if (n2 == 403) {
                    iye2 = iye.h;
                    return iye2.a().e(a.af(n2, "HTTP status code "));
                }
                if (n2 == 404) {
                    iye2 = iye.m;
                    return iye2.a().e(a.af(n2, "HTTP status code "));
                }
                if (n2 == 429) break block11;
                if (n2 == 431) break block10;
                switch (n2) {
                    default: {
                        iye2 = iye.c;
                        return iye2.a().e(a.af(n2, "HTTP status code "));
                    }
                    case 502: 
                    case 503: 
                    case 504: 
                }
            }
            iye2 = iye.o;
            return iye2.a().e(a.af(n2, "HTTP status code "));
        }
        iye2 = iye.n;
        return iye2.a().e(a.af(n2, "HTTP status code "));
    }

    public static iyh b(iyh iyh2) {
        fxf.q(true);
        Object object = iyh2;
        if (s.contains((Object)iyh2.n)) {
            Object object2 = iyh2.n;
            object = iyh2.o;
            iyh iyh3 = iyh.j;
            String string = object2.toString();
            object2 = new StringBuilder("Inappropriate status code from control plane: ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append((String)object);
            object = iyh3.e(((StringBuilder)object2).toString()).d(iyh2.p);
        }
        return object;
    }

    static jcm c(iwb iwb2, boolean bl2) {
        Object object = iwb2.b;
        if (object != null) {
            object = (jbk)object;
            fxf.B(((jbk)object).g, "Subchannel is not started");
            object = ((jbk)object).f.a();
        } else {
            object = null;
        }
        if (object == null) {
            object = iwb2.c;
            if (!((iyh)object).g()) {
                if (iwb2.d) {
                    return new jdr(jeb.b((iyh)object), jck.c);
                }
                if (!bl2) {
                    return new jdr(jeb.b((iyh)object), jck.a);
                }
            }
            return null;
        }
        return object;
    }

    public static String d(String string, int n2) {
        try {
            Object object = new URI(null, null, string, n2, null, null, null);
            object = ((URI)object).getAuthority();
            return object;
        }
        catch (URISyntaxException uRISyntaxException) {
            StringBuilder stringBuilder = new StringBuilder("Invalid host or port: ");
            stringBuilder.append(string);
            stringBuilder.append(" ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString(), uRISyntaxException);
        }
    }

    public static String e(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string2 != null) {
            stringBuilder.append(string2);
            stringBuilder.append(' ');
        }
        stringBuilder.append("grpc-java-");
        stringBuilder.append(string);
        stringBuilder.append("/1.68.0-SNAPSHOT");
        return stringBuilder.toString();
    }

    public static URI f(String string) {
        a.s(string, "authority");
        try {
            URI uRI = new URI(null, string, null, null, null);
            return uRI;
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(string)), uRISyntaxException);
        }
    }

    static void g(jjq jjq2) {
        InputStream inputStream;
        while ((inputStream = jjq2.g()) != null) {
            jeb.h(inputStream);
        }
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            r.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", iOException);
            return;
        }
    }

    public static boolean i(itw itw2) {
        return !Boolean.TRUE.equals(itw2.g(n));
    }

    public static boolean j(String string) {
        String string2;
        String string3 = string2 = System.getenv(string);
        if (string2 == null) {
            string3 = System.getProperty(string);
        }
        string = string3;
        if (string3 != null) {
            string = string3.trim();
        }
        return !fxf.P(string) && Boolean.parseBoolean(string);
    }

    public static ThreadFactory k(String string) {
        ivg ivg2 = new ivg(null);
        ivg2.g();
        ivg2.h(string);
        return ivg.i(ivg2);
    }

    public static iuc[] l(itw itw2, int n2, boolean bl2) {
        List list = itw2.d;
        int n3 = list.size();
        iuc[] iucArray = new iuc[n3 + 1];
        a.s(itw2, "callOptions cannot be null");
        for (n2 = 0; n2 < list.size(); ++n2) {
            iucArray[n2] = ((fvc)list.get(n2)).b();
        }
        iucArray[n3] = t;
        return iucArray;
    }
}

