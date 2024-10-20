/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.lang.ref.WeakReference;

public final class bjo {
    final int a;
    final long b;
    elq c;

    public bjo(int n2, long l2) {
        this.a = n2;
        this.b = l2;
        if (n2 == 2 && l2 <= 0L) {
            throw new IllegalArgumentException("Expiration time must be positive if CacheType is CACHE_TYPE_EXPIRED_AFTER_SOME_TIME");
        }
    }

    public final View a(long l2) {
        int n2;
        elq elq2 = this.c;
        if (elq2 != null && !((n2 = this.a) == 2 ? l2 >= elq2.a + this.b : n2 != 3)) {
            return (View)((WeakReference)elq2.b).get();
        }
        return null;
    }

    public final void b(View object, long l2) {
        if (this.a == 1) {
            return;
        }
        object = object != null ? new elq((View)object, l2) : null;
        this.c = object;
    }
}

