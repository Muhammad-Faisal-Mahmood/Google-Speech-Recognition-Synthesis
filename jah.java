/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import java.io.Closeable;

final class jah
implements Closeable {
    private Parcel a;

    public jah(Parcel parcel) {
        this.a = parcel;
    }

    public static jah c() {
        return new jah(Parcel.obtain());
    }

    public final Parcel a() {
        boolean bl2 = this.a != null;
        fxf.B(bl2, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel parcel = this.a();
        this.a = null;
        return parcel;
    }

    @Override
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}

