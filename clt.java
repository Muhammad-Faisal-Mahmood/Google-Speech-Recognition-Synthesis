/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public class clt
extends bow
implements IInterface {
    public clt() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void b(Status status, cls cls2) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override
    protected final boolean y(int n2, Parcel parcel, Parcel object) {
        switch (n2) {
            default: {
                return false;
            }
            case 15: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (clf)box.a(parcel, clf.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 14: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (clm)box.a(parcel, clm.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 13: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 12: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (clg)box.a(parcel, clg.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 11: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 10: {
                object = (PendingIntent)box.a(parcel, PendingIntent.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented");
            }
            case 9: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (clf)box.a(parcel, clf.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented");
            }
            case 8: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.d(parcel);
                object = (clf)box.a(parcel, clf.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 7: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 6: {
                object = (Status)box.a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 5: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                this.d((Status)object);
                break;
            }
            case 4: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                this.c((Status)object);
                break;
            }
            case 3: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                throw new IllegalStateException("Not implemented.");
            }
            case 2: {
                Status status = (Status)box.a(parcel, Status.CREATOR);
                object = (cls)box.a(parcel, cls.CREATOR);
                box.b(parcel);
                this.b(status, (cls)object);
            }
        }
        return true;
    }
}

