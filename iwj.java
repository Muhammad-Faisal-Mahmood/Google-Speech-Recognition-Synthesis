/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class iwj {
    private static final Logger a;
    private static iwj b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        Level level;
        a = Logger.getLogger(iwj.class.getName());
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("jhd"));
        }
        catch (ClassNotFoundException classNotFoundException) {
            level = Level.WARNING;
            a.logp(level, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", classNotFoundException);
        }
        try {
            arrayList.add(Class.forName("jnp"));
        }
        catch (ClassNotFoundException classNotFoundException) {
            level = Level.FINE;
            a.logp(level, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", classNotFoundException);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static iwj b() {
        synchronized (iwj.class) {
            if (b != null) return b;
            Iterable iterable = c;
            Iterator iterator = iwi.class.getClassLoader();
            Object object = new ixk(1);
            object = kmp.L(iwi.class, iterable, (ClassLoader)((Object)iterator), (iyd)object);
            iterator = new Iterator();
            b = iterator;
            iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (iwi)iterator.next();
                a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(object))));
                b.c((iwi)object);
            }
            b.d();
            return b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void c(iwi iwi2) {
        synchronized (this) {
            iwi2.e();
            fxf.r(true, "isAvailable() returned false");
            this.d.add(iwi2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d() {
        synchronized (this) {
            this.e.clear();
            Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                iwi iwi2 = (iwi)iterator.next();
                String string = iwi2.c();
                if ((iwi)this.e.get(string) != null) {
                    iwi2.d();
                    continue;
                }
                this.e.put(string, iwi2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final iwi a(String object) {
        synchronized (this) {
            return (iwi)this.e.get(object);
        }
    }
}

