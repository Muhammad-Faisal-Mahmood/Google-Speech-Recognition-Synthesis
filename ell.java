/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class ell {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/core/ref/RefManagerImpl");
    private final Map b;
    private final dtu c;

    public ell(dtu dtu2) {
        jse.e(dtu2, "tokenGenerator");
        this.c = dtu2;
        this.b = new LinkedHashMap();
    }

    private final int e(eln object) {
        object = (Set)this.b.get(((eln)object).c);
        if (object != null) {
            return object.size();
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final elk a(eln eln2, eln eln3) {
        synchronized (this) {
            jse.e(eln2, "key");
            jse.e(eln3, "ref");
            Map map = this.b;
            String string = eln2.c;
            Object object = map.get(string);
            Object object2 = object;
            if (object == null) {
                object2 = new LinkedHashSet();
                map.put(string, object2);
            }
            object2 = (Set)object2;
            object = eln3.c;
            jse.d(object, "getValue(...)");
            boolean bl2 = object2.add(object);
            object2 = new elk(bl2 ^ true, this.e(eln2));
            ((heg)a.f().h(hfo.a, "ALT.RefManager").j("com/google/android/libraries/search/audio/core/ref/RefManagerImpl", "addRef", 68, "RefManager.kt")).G("#audio# referencing(%s) to(%s), (%s)", eln3.c, eln2.c, object2);
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final elk b(eln eln2, eln eln3) {
        synchronized (this) {
            jse.e(eln2, "key");
            jse.e(eln3, "ref");
            Object object = (Set)this.b.get(eln2.c);
            boolean bl2 = object != null ? object.remove(eln3.c) : false;
            object = new elk(bl2, this.e(eln2));
            ((heg)a.f().h(hfo.a, "ALT.RefManager").j("com/google/android/libraries/search/audio/core/ref/RefManagerImpl", "removeRef", 76, "RefManager.kt")).G("#audio# de-referencing(%s) from(%s), (%s)", eln3.c, eln2.c, object);
            return object;
        }
    }

    public final eln c(String string) {
        dlm dlm2 = cqq.aw(eln.a.l());
        String string2 = String.format("%016X", Arrays.copyOf(new Object[]{this.c.i()}, 1));
        jse.d(string2, "format(...)");
        dlm2.n(string.concat(String.valueOf(string2)));
        return dlm2.m();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d(eln object, eln eln2) {
        synchronized (this) {
            jse.e(object, "key");
            Set set = (Set)this.b.get(((eln)object).c);
            object = set;
            if (set != null) return object.contains(eln2.c);
            object = jpc.a;
            return object.contains(eln2.c);
        }
    }
}

