/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 */
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

public final class htz
implements ixz {
    public final htx[] a;

    public htz(htx ... htxArray) {
        this.a = htxArray;
    }

    @Override
    public final kmp a(ixx object, iwx object2, ixy ixy2) {
        Object object3;
        jse.e(ixy2, "next");
        Object object4 = ius.k();
        jse.d(object4, "current(...)");
        for (int i2 = 0; i2 < ((htx[])(object3 = this.a)).length; ++i2) {
            htx htx2 = object3[i2];
            object4 = object3 = ((ius)object4).l(htx2.c, new AtomicReference()).l(htx2.d, new AtomicReference());
            if (!((iwx)object2).h(htx2.a)) continue;
            object4 = ((ius)object3).l(htx2.b, ((iwx)object2).b(htx2.a));
        }
        object3 = new hty((ixx)object, this, (ius)object4);
        object = ((ius)object4).a();
        try {
            object2 = new ixp(ixy2.a((ixx)object3, (iwx)object2), (ius)object4);
            return object2;
        }
        finally {
            ((ius)object4).f((ius)object);
        }
    }

    public final void b(iwx iwx2, ius ius2, boolean bl2) {
        Object object;
        for (int i2 = 0; i2 < ((htx[])(object = this.a)).length; ++i2) {
            htx htx2 = object[i2];
            object = bl2 ? htx2.c : htx2.d;
            if ((object = (Parcelable)((AtomicReference)((iup)object).a(ius2)).getAndSet(null)) == null) continue;
            iwx2.g(htx2.a, object);
        }
    }
}

