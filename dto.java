/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 */
import android.database.ContentObserver;
import java.util.Iterator;

final class dto
extends ContentObserver {
    final dtp a;

    public dto(dtp dtp2) {
        this.a = dtp2;
        super(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChange(boolean bl2) {
        dtp dtp2 = this.a;
        Iterator iterator = dtp2.d;
        synchronized (iterator) {
            dtp2.e = null;
            dul.e();
        }
        synchronized (dtp2) {
            iterator = dtp2.f.iterator();
            while (iterator.hasNext()) {
                ((dtq)iterator.next()).a();
            }
            return;
        }
    }
}

