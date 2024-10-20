/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

import j$.time.zone.e;
import j$.time.zone.g;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class i {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentHashMap b;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList;
        a = copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static e a(String string, boolean bl2) {
        Objects.requireNonNull(string, "zoneId");
        ConcurrentHashMap concurrentHashMap = b;
        Object object = (i)concurrentHashMap.get(string);
        if (object == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new RuntimeException("No time-zone data files registered");
            }
            object = new StringBuilder("Unknown time-zone ID: ");
            ((StringBuilder)object).append(string);
            throw new RuntimeException(((StringBuilder)object).toString());
        }
        return ((i)object).b(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void d(i object) {
        Object object2;
        Objects.requireNonNull(object, "provider");
        // MONITORENTER : j$.time.zone.i.class
        Object object3 = ((i)object).c().iterator();
        while (object3.hasNext()) {
            object2 = (String)object3.next();
            Objects.requireNonNull(object2, "zoneId");
            if ((i)b.putIfAbsent(object2, object) == null) continue;
            object = String.valueOf(object);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to register zone as one already registered with that ID: ");
            stringBuilder.append((String)object2);
            stringBuilder.append(", currently loading from provider: ");
            stringBuilder.append((String)object);
            object3 = new RuntimeException(stringBuilder.toString());
            throw object3;
        }
        object2 = new HashSet(b.keySet());
        Collections.unmodifiableSet(object2);
        // MONITOREXIT : j$.time.zone.i.class
        a.add(object);
    }

    protected abstract e b(String var1);

    protected abstract Set c();
}

