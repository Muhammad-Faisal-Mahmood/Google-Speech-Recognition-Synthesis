/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public class cbd
extends bow
implements IInterface {
    public cbd() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected final boolean y(int n2, Parcel parcel, Parcel casArray) {
        switch (n2) {
            default: {
                return false;
            }
            case 8: {
                casArray = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                this.b((Status)casArray);
                break;
            }
            case 7: {
                casArray = (DataHolder)box.a(parcel, DataHolder.CREATOR);
                box.b(parcel);
                throw new UnsupportedOperationException();
            }
            case 6: {
                casArray = (Status)box.a(parcel, Status.CREATOR);
                casArray = (cas[])parcel.createTypedArray(cas.CREATOR);
                box.b(parcel);
                throw new UnsupportedOperationException();
            }
            case 5: {
                casArray = (Status)box.a(parcel, Status.CREATOR);
                parcel.readLong();
                box.b(parcel);
                throw new UnsupportedOperationException();
            }
            case 4: {
                casArray = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                throw new UnsupportedOperationException();
            }
            case 3: {
                casArray = (Status)box.a(parcel, Status.CREATOR);
                parcel.readLong();
                box.b(parcel);
                throw new UnsupportedOperationException();
            }
            case 2: {
                casArray = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                throw new UnsupportedOperationException();
            }
            case 1: {
                casArray = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                this.c((Status)casArray);
            }
        }
        return true;
    }
}

