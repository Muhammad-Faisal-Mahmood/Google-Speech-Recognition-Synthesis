/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.Parcel
 */
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public class ckj
extends bow
implements IInterface {
    public ckj() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void c(cko cko2) {
    }

    @Override
    protected final boolean y(int n2, Parcel parcel, Parcel parcel2) {
        switch (n2) {
            default: {
                return false;
            }
            case 9: {
                ckl ckl2 = (ckl)box.a(parcel, ckl.CREATOR);
                box.b(parcel);
                break;
            }
            case 8: {
                cko cko2 = (cko)box.a(parcel, cko.CREATOR);
                box.b(parcel);
                this.c(cko2);
                break;
            }
            case 7: {
                cgk cgk2 = (Status)box.a(parcel, Status.CREATOR);
                cgk2 = (GoogleSignInAccount)box.a(parcel, GoogleSignInAccount.CREATOR);
                box.b(parcel);
                break;
            }
            case 6: {
                Status status = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 4: {
                Status status = (Status)box.a(parcel, Status.CREATOR);
                box.b(parcel);
                break;
            }
            case 3: {
                cgk cgk3 = (cbk)box.a(parcel, cbk.CREATOR);
                cgk3 = (cki)box.a(parcel, cki.CREATOR);
                box.b(parcel);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

