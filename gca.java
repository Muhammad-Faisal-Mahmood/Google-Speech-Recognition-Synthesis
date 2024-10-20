/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  hom
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class gca
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private static final hei f;
    public final int a;
    public boolean b;
    gto c = gsl.a;
    public Object d;
    public Object e;
    private Throwable g;
    private gby h;

    static {
        f = hei.m("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
        CREATOR = new chy(9);
    }

    public gca(int n2, Object object, hpn hpn2) {
        this.a = n2;
        this.d = object;
        hhk.T(hpn2, gqk.g(new gbz(this)), (Executor)hom.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public gca(Parcel parcel) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            int n2 = parcel.readInt();
            this.c = gto.i(n2);
            if (n2 != 1) return;
        }
        catch (RuntimeException runtimeException) {
            ((heg)((heg)((heg)f.g()).i(runtimeException)).j("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).s("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = runtimeException;
            return;
        }
        this.b = true;
        this.e = parcel.readValue(classLoader);
        this.g = (Throwable)parcel.readValue(classLoader);
    }

    private static void d(Object object, Parcel parcel) {
        int n2 = parcel.dataPosition();
        try {
            parcel.writeValue(object);
            return;
        }
        catch (RuntimeException runtimeException) {
            parcel.setDataPosition(n2);
            a.as(f.g(), "Result lost due to non-parcelable type.", "com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", '\u00ee', "ParcelableFuture.java", runtimeException);
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(object.getClass()))), runtimeException);
        }
    }

    public final void a() {
        gby gby2 = this.h;
        if (gby2 != null) {
            Object object = this.g;
            if (object != null) {
                gby2.a.execute(gqk.i(new fbx(gby2, this, object, 7, null)));
                return;
            }
            object = this.e;
            gby2.a.execute(gqk.i(new fbx(gby2, this, object, 6, null)));
        }
    }

    final void b(Throwable throwable) {
        this.g = throwable;
        this.b = true;
        this.a();
    }

    final void c(gby gby2) {
        this.h = gby2;
        if (gby2 != null && this.b) {
            this.a();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Object object = this.d;
        String string = "";
        object = object != null ? a.ax(object, "input=", ";") : "";
        Object object2 = this.e;
        object2 = object2 != null ? a.ax(object2, "result=", ";") : "";
        Serializable serializable = this.g;
        if (serializable != null) {
            string = a.ax(serializable, "error=", ";");
        }
        serializable = new StringBuilder("ParcelableFuture(");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append((String)object2);
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(")");
        return ((StringBuilder)serializable).toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        n2 = 1;
        try {
            gca.d(this.d, parcel);
        }
        catch (RuntimeException runtimeException) {
            parcel.writeValue(null);
            this.b = true;
            this.g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", runtimeException);
            this.e = null;
        }
        if (!this.b) {
            n2 = 2;
        }
        parcel.writeInt(n2);
        if (this.b) {
            try {
                gca.d(this.e, parcel);
            }
            catch (RuntimeException runtimeException) {
                parcel.writeValue(null);
                this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", runtimeException);
            }
            try {
                gca.d(this.g, parcel);
                return;
            }
            catch (RuntimeException runtimeException) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.g))), runtimeException);
                this.g = illegalArgumentException;
                gca.d(illegalArgumentException, parcel);
            }
        }
    }
}

