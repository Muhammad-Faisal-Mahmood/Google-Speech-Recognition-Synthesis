/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ilc
implements ikv {
    private final Set a = new HashSet();

    public final void a() {
        if (fvc.e == null) {
            fvc.e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == fvc.e) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((ilu)iterator.next()).a();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}

