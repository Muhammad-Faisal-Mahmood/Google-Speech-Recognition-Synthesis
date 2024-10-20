/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
import android.os.IBinder;
import java.io.IOException;

public final class hrs
implements gui {
    private final ixw a;
    private final iys b;
    private boolean c;

    public hrs(ixw ixw2, iys iys2, abe abe2) {
        this.a = ixw2;
        this.b = iys2;
        kmp.K(abe2.getLifecycle(), ixw2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IBinder b() {
        synchronized (this) {
            boolean bl2 = this.c;
            if (bl2) return this.b.a;
            try {
                this.c = true;
                this.a.b();
                return this.b.a;
            }
            catch (IOException iOException) {
                ((heg)((heg)((heg)hrt.a.g()).i(iOException)).j("com/google/frameworks/client/data/android/binder/IoGrpcInterop$ServerLifecycle", "get", 76, "IoGrpcInterop.java")).u("Unable to start server %s", this.a);
            }
            return this.b.a;
        }
    }
}

