/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

public final class ivk {
    public static final Logger a = Logger.getLogger(ivk.class.getName());
    public static final ivk b = new ivk();
    public final ConcurrentNavigableMap c = new ConcurrentSkipListMap();
    public final ConcurrentNavigableMap d = new ConcurrentSkipListMap();
    public final ConcurrentMap e = new ConcurrentHashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();
    public final ConcurrentMap g = new ConcurrentHashMap();

    public static long a(ivs ivs2) {
        return ivs2.c().a;
    }

    public static void b(Map object, ivm ivm2) {
        object = object.put(ivm2.c().a, ivm2);
    }

    public static void c(Map object, ivm ivm2) {
        object = (ivm)object.remove(ivk.a(ivm2));
    }
}

