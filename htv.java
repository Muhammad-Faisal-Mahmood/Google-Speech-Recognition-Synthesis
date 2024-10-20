/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

public final class htv
extends ive {
    private static final hei a = hei.m("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry");
    private static final ksb g;
    private static final ksb h;
    private final Map b;
    private final Object c;
    private final Map d;
    private final Map e;
    private final ConcurrentHashMap f;

    static {
        h = new ksb((Object)null, (Object)null);
        g = kmp.T("not_found", null, new HashMap());
    }

    public htv(Map map) {
        this.b = map;
        this.c = new Object();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new ConcurrentHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ksb a(String string) {
        Object object;
        Object object2 = object = (ksb)this.f.get(string);
        if (object == null) {
            int n2 = string.indexOf(47);
            object2 = object;
            if (n2 > 0) {
                String string2 = string.substring(0, n2);
                Object object3 = this.c;
                synchronized (object3) {
                    object = object2 = (ksb)this.e.get(string2);
                    if (object2 == null) {
                        object = (jnu)this.b.get(string2);
                        if (object != null) {
                            object = (itt)object.b();
                            this.d.put(string2, object);
                            object = object.l();
                        } else {
                            ((heg)((heg)a.h()).j("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry", "initService", 113, "LazyServicesHandlerRegistry.java")).u("No factory available for service %s.", string2);
                            object = g;
                        }
                        this.e.put(string2, object);
                    }
                    object = object != g ? (ksb)((ksb)object).a.get(string) : null;
                    object2 = object;
                    if (object == null) {
                        object2 = h;
                    }
                    this.f.put(string, object2);
                }
            }
        }
        if (object2 == h) {
            return null;
        }
        return object2;
    }
}

