/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class iuw {
    static final gtk a = gtk.c(',');
    public static final iuw b;
    public final byte[] c;
    private final Map d;

    static {
        iuw iuw2 = new iuw();
        iuw2 = new iuw(new iud(1), true, iuw2);
        b = new iuw(iud.a, false, iuw2);
    }

    public iuw() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }

    private iuw(iuu object, boolean bl2, iuw object2) {
        int n2;
        Iterator iterator = object.b();
        fxf.r(((String)((Object)iterator)).contains(",") ^ true, "Comma is currently not allowed in message encoding");
        int n3 = n2 = ((iuw)object2).d.size();
        if (!((iuw)object2).d.containsKey(object.b())) {
            n3 = n2 + 1;
        }
        LinkedHashMap<Object, iuv> object32 = new LinkedHashMap<Object, iuv>(n3);
        for (iuv iuv2 : ((iuw)object2).d.values()) {
            object2 = iuv2.b.b();
            if (((String)object2).equals(iterator)) continue;
            object32.put(object2, new iuv((iuu)iuv2.b, iuv2.a));
        }
        object32.put(iterator, new iuv((iuu)((Object)object), bl2));
        iterator = DesugarCollections.unmodifiableMap(object32);
        this.d = iterator;
        object2 = a;
        object = new HashSet<String>(iterator.size());
        for (Map.Entry entry : iterator.entrySet()) {
            if (!((iuv)entry.getValue()).a) continue;
            object.add((String)entry.getKey());
        }
        this.c = ((gtk)object2).d(DesugarCollections.unmodifiableSet(object)).getBytes(Charset.forName("US-ASCII"));
    }

    public final iuu a(String object) {
        if ((object = (iuv)this.d.get(object)) != null) {
            return ((iuv)object).b;
        }
        return null;
    }
}

