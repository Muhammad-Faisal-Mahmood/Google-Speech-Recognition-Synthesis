/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff$Mode
 */
import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class oz {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final ki g;
    private final bzb h;

    public oz() {
        this(6);
    }

    public oz(int n2) {
        this.a = n2;
        this.h = new bzb(0);
        this.g = new ki(null);
    }

    public static int c(int n2, PorterDuff.Mode mode) {
        return (n2 + 31) * 31 + mode.hashCode();
    }

    protected static final void d(Object object, Object object2) {
        jse.e(object, "key");
        jse.e(object2, "oldValue");
    }

    private static final void e(Object object, Object object2) {
        jse.e(object, "key");
        jse.e(object2, "value");
    }

    public final Object a(Object object) {
        ki ki2 = this.g;
        synchronized (ki2) {
            block5: {
                object = ((LinkedHashMap)this.h.a).get(object);
                if (object == null) break block5;
                ++this.e;
                return object;
            }
            ++this.f;
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object b(Object object, Object object2) {
        Object object3;
        jse.e(object3, "value");
        ki ki2 = this.g;
        // MONITORENTER : ki2
        ++this.c;
        int n2 = this.b;
        oz.e(object, object3);
        this.b = n2 + 1;
        object3 = this.h.Z(object, object3);
        if (object3 != null) {
            n2 = this.b;
            oz.e(object, object3);
            this.b = n2 - 1;
        }
        // MONITOREXIT : ki2
        if (object3 != null) {
            oz.d(object, object3);
        }
        n2 = this.a;
        while (true) {
            ki2 = this.g;
            // MONITORENTER : ki2
            if (this.b < 0 || this.h.aa() && this.b != 0) {
                kl.q("LruCache.sizeOf() is reporting inconsistent results!");
            }
            if (this.b <= n2) {
                // MONITOREXIT : ki2
                return object3;
            }
            if (this.h.aa()) {
                return object3;
            }
            Object object4 = ((LinkedHashMap)this.h.a).entrySet();
            jse.d(object4, "<get-entries>(...)");
            jse.e(object4, "<this>");
            boolean bl2 = object4 instanceof List;
            object = null;
            if (bl2) {
                if (!(object4 = (List)object4).isEmpty()) {
                    object = object4.get(0);
                }
            } else if ((object4 = object4.iterator()).hasNext()) {
                object = object4.next();
            }
            object4 = (Map.Entry)object;
            if (object4 == null) {
                // MONITOREXIT : ki2
                return object3;
            }
            object = object4.getKey();
            Object v2 = object4.getValue();
            object4 = this.h;
            jse.e(object, "key");
            ((LinkedHashMap)((bzb)object4).a).remove(object);
            int n3 = this.b;
            oz.e(object, v2);
            this.b = n3 - 1;
            ++this.d;
            // MONITOREXIT : ki2
            oz.d(object, v2);
        }
    }

    public final String toString() {
        ki ki2 = this.g;
        synchronized (ki2) {
            int n2;
            block6: {
                block5: {
                    n2 = this.e;
                    int n3 = this.f + n2;
                    if (n3 == 0) break block5;
                    n2 = n2 * 100 / n3;
                    break block6;
                }
                n2 = 0;
            }
            CharSequence charSequence = new StringBuilder("LruCache[maxSize=");
            charSequence.append(this.a);
            charSequence.append(",hits=");
            charSequence.append(this.e);
            charSequence.append(",misses=");
            charSequence.append(this.f);
            charSequence.append(",hitRate=");
            charSequence.append(n2);
            charSequence.append("%]");
            charSequence = charSequence.toString();
            return charSequence;
        }
    }
}

