/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.Parcel
 */
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public abstract class jad {
    public static final Logger a = Logger.getLogger(jad.class.getName());
    public static final kmp c = new kmp();
    protected final IBinder b;

    protected jad(IBinder iBinder) {
        this.b = iBinder;
    }

    public static jad b(IBinder object, Executor executor) {
        object = object instanceof Binder ? new jab((IBinder)object, executor) : new jac((IBinder)object);
        return object;
    }

    public abstract void a(int var1, jah var2);

    public final boolean c(int n2, Parcel parcel) {
        try {
            boolean bl2 = this.b.transact(n2, parcel, null, 1);
            return bl2;
        }
        finally {
            parcel.recycle();
        }
    }
}

