/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 */
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class chv
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(3);
    ParcelFileDescriptor a;
    final String b;
    final String c;
    public File d;

    public chv(ParcelFileDescriptor parcelFileDescriptor, String string, String string2) {
        this.a = parcelFileDescriptor;
        this.b = string;
        this.c = string2;
    }

    static final void a(Closeable closeable) {
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            Log.w((String)"FileTeleporter", (String)"Could not close stream", (Throwable)iOException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeToParcel(Parcel object, int n2) {
        Object object2;
        if (this.a != null) {
            int n3 = kl.u((Parcel)object);
            kl.J((Parcel)object, 2, (Parcelable)this.a, n2);
            kl.K((Parcel)object, 3, this.b);
            kl.K((Parcel)object, 4, this.c);
            kl.w((Parcel)object, n3);
            return;
        }
        object = this.d;
        if (object == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            object = File.createTempFile("teleporter", ".tmp", (File)object);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Could not create temporary file:", iOException);
        }
        try {
            object2 = new FileOutputStream((File)object);
            this.a = ParcelFileDescriptor.open((File)object, (int)0x10000000);
            ((File)object).delete();
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new IllegalStateException("Temporary file is somehow already deleted.");
        }
        object = new DataOutputStream((OutputStream)object2);
        try {
            try {
                throw null;
            }
            catch (IOException iOException) {
                object2 = new IllegalStateException("Could not write into unlinked file", iOException);
                throw object2;
            }
        }
        catch (Throwable throwable) {}
        chv.a((Closeable)object);
        throw throwable;
    }
}

