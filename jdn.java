/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jdn
extends ixi {
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final jdm f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private final boolean A;
    private ixf B;
    final ixu g;
    public final Random h = new Random();
    public final AtomicReference i;
    public final String j;
    public final int k;
    public final long l;
    public final iym m;
    public final guh n;
    protected boolean o;
    public final ixh p;
    public boolean q;
    protected volatile int r;
    private final String w;
    private final jjl x;
    private boolean y;
    private Executor z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block8: {
            String string;
            Object object2 = Logger.getLogger(jdn.class.getName());
            a = object2;
            b = DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
            Object object3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
            s = object3;
            t = string = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
            object = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
            u = object;
            c = Boolean.parseBoolean((String)object3);
            d = Boolean.parseBoolean(string);
            e = Boolean.parseBoolean((String)object);
            object3 = jdn.class.getClassLoader();
            object = null;
            try {
                object3 = Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, (ClassLoader)object3).asSubclass(jdm.class);
            }
            catch (ClassCastException classCastException) {
                object2 = Level.FINE;
                a.logp((Level)object2, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", classCastException);
                break block8;
            }
            catch (ClassNotFoundException classNotFoundException) {
                object2 = Level.FINE;
                a.logp((Level)object2, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", classNotFoundException);
                break block8;
            }
            try {
                object3 = ((Class)object3).getConstructor(null);
            }
            catch (Exception exception) {
                object2 = Level.FINE;
                a.logp((Level)object2, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", exception);
                break block8;
            }
            try {
                object3 = (jdm)((Constructor)object3).newInstance(null);
                if (object3.b() != null) {
                    ((Logger)object2).logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", object3.b());
                    break block8;
                }
                object = object3;
            }
            catch (Exception exception) {
                object2 = Level.FINE;
                a.logp((Level)object2, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", exception);
            }
        }
        f = object;
    }

    protected jdn(String object, ixc ixc2, jjl object2, guh guh2, boolean bl2) {
        boolean bl3 = true;
        this.r = 1;
        this.i = new AtomicReference();
        a.s(ixc2, "args");
        this.x = object2;
        a.s(object, "name");
        object2 = URI.create("//".concat((String)object));
        boolean bl4 = ((URI)object2).getHost() != null;
        fxf.v(bl4, "Invalid DNS name: %s", object);
        object = ((URI)object2).getAuthority();
        fxf.L(object, "nameUri (%s) doesn't have an authority", object2);
        this.w = object;
        this.j = ((URI)object2).getHost();
        this.k = ((URI)object2).getPort() == -1 ? ixc2.a : ((URI)object2).getPort();
        this.g = ixc2.b;
        long l2 = 0L;
        if (!bl2) {
            long l3;
            object = System.getProperty("networkaddress.cache.ttl");
            l2 = l3 = 30L;
            if (object != null) {
                try {
                    l2 = Long.parseLong((String)object);
                }
                catch (NumberFormatException numberFormatException) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", object, 30L});
                    l2 = l3;
                }
            }
            if (l2 > 0L) {
                l2 = TimeUnit.SECONDS.toNanos(l2);
            }
        }
        this.l = l2;
        this.n = guh2;
        this.m = ixc2.c;
        this.z = object = ixc2.f;
        bl2 = object == null ? bl3 : false;
        this.A = bl2;
        this.p = ixc2.d;
    }

    public static String e() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            }
            catch (UnknownHostException unknownHostException) {
                throw new RuntimeException(unknownHostException);
            }
        }
        return v;
    }

    private final void f() {
        long l2;
        long l3;
        if (!(this.q || this.y || this.o && (l3 = (l2 = this.l - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false && (l3 <= 0 || this.n.a(TimeUnit.NANOSECONDS) <= this.l))) {
            this.q = true;
            this.z.execute(new jdk(this, this.B));
        }
    }

    @Override
    public final String a() {
        return this.w;
    }

    @Override
    public final void b() {
        boolean bl2 = this.B != null;
        fxf.B(bl2, "not started");
        this.f();
    }

    @Override
    public final void c() {
        if (!this.y) {
            this.y = true;
            Executor executor = this.z;
            if (executor != null && this.A) {
                jjm.d(this.x, executor);
                this.z = null;
            }
        }
    }

    @Override
    public final void d(ixf ixf2) {
        boolean bl2 = this.B == null;
        fxf.B(bl2, "already started");
        if (this.A) {
            this.z = jjm.a(this.x);
        }
        this.B = ixf2;
        this.f();
    }
}

