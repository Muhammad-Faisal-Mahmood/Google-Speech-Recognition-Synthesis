/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class jnk
extends iwh {
    public static final Logger e = Logger.getLogger(jnk.class.getName());
    public final ivz f;
    protected boolean g;
    protected final iwi h;
    protected iui i;
    private final Map j = new LinkedHashMap();

    protected jnk(ivz ivz2) {
        this.h = new jhd();
        this.f = ivz2;
        e.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final iyh a(iwd object) {
        Object object2;
        Object object3;
        this.g = true;
        e.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddressesInternal", "Received resolution result: {0}", object);
        Cloneable cloneable = new HashMap();
        Object object4 = ((iwd)object).a.iterator();
        while (true) {
            boolean bl2 = object4.hasNext();
            object3 = null;
            if (!bl2) break;
            object3 = (iux)object4.next();
            its its2 = its.a;
            List list = ((iwd)object).a;
            its its3 = ((iwd)object).b;
            Object object5 = ((iwd)object).c;
            List<iux> list2 = Collections.singletonList(object3);
            object2 = new kpy(its.a);
            ((kpy)object2).b(d, true);
            its its4 = ((kpy)object2).a();
            object2 = new iwd(list2, its4, null);
            jnj jnj2 = new jnj((iux)object3);
            cloneable.put(jnj2, object2);
        }
        if (cloneable.isEmpty()) {
            object = iyh.k.e("NameResolver returned no usable address. ".concat(String.valueOf(String.valueOf(object))));
            this.b((iyh)object);
        } else {
            for (Map.Entry entry : cloneable.entrySet()) {
                object = object3 = (jni)this.j.get(entry.getKey());
                if (object3 == null) {
                    object = this.f(entry.getKey());
                    this.j.put(entry.getKey(), object);
                }
                a.s((iwd)entry.getValue(), "Missing address list for child");
                ((jni)object).a.c((iwd)entry.getValue());
            }
            object4 = iyh.b;
            Set set = cloneable.keySet();
            cloneable = new ArrayList();
            object2 = gzx.o(this.j.keySet());
            int n2 = object2.size();
            int n3 = 0;
            while (true) {
                object3 = cloneable;
                object = object4;
                if (n3 >= n2) break;
                object = object2.get(n3);
                if (!set.contains(object)) {
                    cloneable.add((jni)this.j.remove(object));
                }
                ++n3;
            }
        }
        if (!((iyh)object).g()) {
            return object;
        }
        this.h();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            ((jni)object3.next()).b();
        }
        return object;
    }

    @Override
    public final void b(iyh iyh2) {
        if (this.i != iui.b) {
            this.f.f(iui.c, new ivy(iwb.a(iyh2)));
        }
    }

    @Override
    public final void e() {
        e.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator iterator = this.j.values().iterator();
        while (iterator.hasNext()) {
            ((jni)iterator.next()).b();
        }
        this.j.clear();
    }

    protected jni f(Object object) {
        throw null;
    }

    public final Collection g() {
        return this.j.values();
    }

    protected abstract void h();
}

