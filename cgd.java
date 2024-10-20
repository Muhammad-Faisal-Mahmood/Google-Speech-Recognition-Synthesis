/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class cgd
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(19);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public cgd(int n2, Account account, int n3, GoogleSignInAccount googleSignInAccount) {
        this.a = n2;
        this.b = account;
        this.c = n3;
        this.d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, this.a);
        kl.J(parcel, 2, (Parcelable)this.b, n2);
        kl.A(parcel, 3, this.c);
        kl.J(parcel, 4, this.d, n2);
        kl.w(parcel, n3);
    }
}

