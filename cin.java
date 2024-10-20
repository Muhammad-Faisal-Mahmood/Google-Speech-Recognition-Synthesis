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

public class cin
extends bow
implements IInterface {
    public cin() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    public void b() {
    }

    public void c(Status status, ciw ciw2) {
    }

    public void d(Status status, String string) {
    }

    public void e(Status status) {
    }

    @Override
    protected final boolean y(int n2, Parcel parcel, Parcel object) {
        switch (n2) {
            default: {
                return false;
            }
            case 23: {
                object = (Status)box.a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(cjd.CREATOR);
                box.b(parcel);
                break;
            }
            case 22: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 21: {
                object = (Status)box.a(parcel, Status.CREATOR);
                String string = parcel.readString();
                box.b(parcel);
                this.d((Status)object, string);
                break;
            }
            case 20: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 19: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                this.e((Status)object);
                break;
            }
            case 18: {
                this.b();
                break;
            }
            case 17: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.e(parcel);
                box.b(parcel);
                break;
            }
            case 16: {
                object = (Status)box.a(parcel, Status.CREATOR);
                parcel.readInt();
                box.b(parcel);
                break;
            }
            case 15: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 14: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (ciz)box.a(parcel, ciz.CREATOR);
                box.b(parcel);
                break;
            }
            case 13: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.e(parcel);
                box.b(parcel);
                break;
            }
            case 12: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (cjb)box.a(parcel, cjb.CREATOR);
                box.b(parcel);
                break;
            }
            case 11: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (cja)box.a(parcel, cja.CREATOR);
                box.b(parcel);
                break;
            }
            case 10: {
                object = (Status)box.a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(cil.CREATOR);
                box.b(parcel);
                break;
            }
            case 9: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 8: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (cix)box.a(parcel, cix.CREATOR);
                box.b(parcel);
                break;
            }
            case 7: {
                object = (Status)box.a(parcel, Status.CREATOR);
                ciw ciw2 = (ciw)box.a(parcel, ciw.CREATOR);
                box.b(parcel);
                this.c((Status)object, ciw2);
                break;
            }
            case 6: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 5: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 4: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 3: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 2: {
                object = (Status)box.a(parcel, Status.CREATOR);
                object = (ciw)box.a(parcel, ciw.CREATOR);
                box.b(parcel);
                break;
            }
            case 1: {
                object = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
            }
        }
        return true;
    }
}

