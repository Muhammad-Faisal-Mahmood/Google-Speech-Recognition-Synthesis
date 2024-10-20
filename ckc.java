/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ckc
extends bov
implements IInterface {
    public ckc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(clu clu2, String string) {
        Parcel parcel = this.a();
        int n2 = box.a;
        parcel.writeStrongBinder((IBinder)clu2);
        parcel.writeString(string);
        this.c(5, parcel);
    }
}

