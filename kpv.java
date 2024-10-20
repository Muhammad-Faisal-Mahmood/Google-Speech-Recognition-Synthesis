/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

public final class kpv {
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    private final List e;
    private final String f;
    private final AtomicLong g;
    private final kpu h;

    public kpv() {
        throw null;
    }

    public kpv(List list, int n2, String string, List list2, boolean bl2, String string2, String string3, long l2) {
        this.e = DesugarCollections.unmodifiableList(list);
        this.a = n2;
        this.b = string;
        this.h = new kpu(DesugarCollections.unmodifiableList(list2));
        this.c = bl2;
        this.d = string2;
        this.f = string3;
        this.g = new AtomicLong(l2);
    }

    public final String a() {
        int n2 = this.e.size();
        return (String)this.e.get(n2 - 1);
    }

    public final List b() {
        return this.h.a;
    }

    public final Map c() {
        kpu kpu2 = this.h;
        Object object = kpu2.b;
        if (object == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry entry : kpu2.a) {
                object = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    object.addAll((Collection)treeMap.get(entry.getKey()));
                }
                object.add((String)entry.getValue());
                treeMap.put((String)entry.getKey(), DesugarCollections.unmodifiableList(object));
            }
            kpu2.b = DesugarCollections.unmodifiableMap(treeMap);
            object = kpu2.b;
        }
        return object;
    }

    public final void d(long l2) {
        this.g.set(l2);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", Integer.toHexString(System.identityHashCode(this)), this.a(), this.e.toString(), this.a, this.b, this.b().toString(), this.c, this.d, this.f, this.g.get());
    }
}

