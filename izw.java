/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Parcel
 */
import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class izw
extends Binder {
    private static final Logger b = Logger.getLogger(izw.class.getName());
    public izv a;

    public izw(izv izv2) {
        this.a = izv2;
    }

    protected final boolean onTransact(int n2, Parcel parcel, Parcel object, int n3) {
        object = this.a;
        if (object != null) {
            if ((n3 & 1) == 0) {
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.af(n3, "ignoring non-oneway transaction. flags="));
                return false;
            }
            try {
                boolean bl2 = object.a(n2, parcel);
                return bl2;
            }
            catch (RuntimeException runtimeException) {
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.af(n2, "failure sending transaction "), runtimeException);
            }
        }
        return false;
    }

    public final boolean pingBinder() {
        return this.a != null;
    }
}

