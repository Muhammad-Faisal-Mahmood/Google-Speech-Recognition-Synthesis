/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

final class jai
extends InputStream
implements InputStreamRetargetInterface {
    public static final int f = 0;
    public final Parcelable.Creator a;
    public final boolean b;
    public final Parcelable c;
    InputStream d;
    Parcelable e;

    public jai(Parcelable.Creator creator, Parcelable parcelable, boolean bl2) {
        boolean bl3;
        this.a = creator;
        this.c = parcelable;
        this.b = bl2;
        boolean bl4 = bl3 = true;
        if (creator == null) {
            bl4 = bl2 ? bl3 : false;
        }
        fxf.q(bl4);
    }

    private final InputStream b() {
        if (this.d == null) {
            Object object = this.c;
            Parcel parcel = Parcel.obtain();
            parcel.writeParcelable(object, 0);
            object = parcel.marshall();
            parcel.recycle();
            this.d = new ByteArrayInputStream((byte[])object);
        }
        return this.d;
    }

    final int a(Parcel parcel) {
        Parcelable parcelable = this.c;
        int n2 = parcel.dataPosition();
        parcel.writeParcelable(this.c, parcelable.describeContents());
        return parcel.dataPosition() - n2;
    }

    @Override
    public final int available() {
        return this.b().available();
    }

    @Override
    public final void close() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override
    public final void mark(int n2) {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.mark(n2);
        }
    }

    @Override
    public final boolean markSupported() {
        return true;
    }

    @Override
    public final int read() {
        return this.b().read();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        return this.b().read(byArray, n2, n3);
    }

    @Override
    public final void reset() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override
    public final long skip(long l2) {
        if (l2 <= 0L) {
            return 0L;
        }
        return this.b().skip(l2);
    }

    public final String toString() {
        String string = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder("ParcelableInputStream[V: ");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

