/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ixl {
    private static final Logger a = Logger.getLogger(ixl.class.getName());
    private static ixl b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private hac e = hcy.a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ixl b() {
        synchronized (ixl.class) {
            if (b != null) return b;
            Object object = new ArrayList();
            try {
                ((ArrayList)object).add(Class.forName("jdo"));
            }
            catch (ClassNotFoundException classNotFoundException) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", classNotFoundException);
            }
            Iterator iterator = DesugarCollections.unmodifiableList(object);
            object = ixj.class.getClassLoader();
            ixk ixk2 = new ixk(0);
            iterator = kmp.L(ixj.class, (Iterable)((Object)iterator), (ClassLoader)object, ixk2);
            if (iterator.isEmpty()) {
                a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = object = new ixl();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object = (ixj)iterator.next();
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(object))));
                b.f((ixj)object);
            }
            b.g();
            return b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void f(ixj ixj2) {
        synchronized (this) {
            ixj2.d();
            fxf.r(true, "isAvailable() returned false");
            this.d.add(ixj2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void g() {
        synchronized (this) {
            HashMap<String, ixj> hashMap = new HashMap<String, ixj>();
            Iterator iterator = this.d.iterator();
            String string = "unknown";
            int n2 = Integer.MIN_VALUE;
            while (true) {
                if (!iterator.hasNext()) {
                    this.e = hac.i(hashMap);
                    this.c = string;
                    return;
                }
                ixj ixj2 = (ixj)iterator.next();
                String string2 = ixj2.b();
                if ((ixj)hashMap.get(string2) != null) {
                    ixj2.e();
                } else {
                    hashMap.put(string2, ixj2);
                }
                ixj2.e();
                if (n2 < 5) {
                    ixj2.e();
                    string = ixj2.b();
                }
                n2 = 5;
            }
        }
    }

    public final ixj a(String string) {
        if (string == null) {
            return null;
        }
        return (ixj)this.d().get(string.toLowerCase(Locale.US));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c() {
        synchronized (this) {
            return this.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Map d() {
        synchronized (this) {
            return this.e;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(ixj ixj2) {
        synchronized (this) {
            this.f(ixj2);
            this.g();
            return;
        }
    }
}

