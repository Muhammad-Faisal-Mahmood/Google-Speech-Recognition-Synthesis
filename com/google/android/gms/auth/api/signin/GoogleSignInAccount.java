/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
public class GoogleSignInAccount
extends cgk
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aqo(20);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    final List i;
    public final String j;
    public final String k;
    private final Set l = new HashSet();

    public GoogleSignInAccount(String string, String string2, String string3, String string4, Uri uri, String string5, long l2, String string6, List list, String string7, String string8) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = uri;
        this.f = string5;
        this.g = l2;
        this.h = string6;
        this.i = list;
        this.j = string7;
        this.k = string8;
    }

    public final Set a() {
        HashSet hashSet = new HashSet(this.i);
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof GoogleSignInAccount)) {
            return false;
        }
        object = (GoogleSignInAccount)object;
        return ((GoogleSignInAccount)object).h.equals(this.h) && ((GoogleSignInAccount)object).a().equals(this.a());
    }

    public final int hashCode() {
        return (this.h.hashCode() + 527) * 31 + this.a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        int n3 = kl.u(parcel);
        kl.K(parcel, 2, string);
        kl.K(parcel, 3, this.b);
        kl.K(parcel, 4, this.c);
        kl.K(parcel, 5, this.d);
        kl.J(parcel, 6, (Parcelable)this.e, n2);
        kl.K(parcel, 7, this.f);
        kl.B(parcel, 8, this.g);
        kl.K(parcel, 9, this.h);
        kl.O(parcel, 10, this.i);
        kl.K(parcel, 11, this.j);
        kl.K(parcel, 12, this.k);
        kl.w(parcel, n3);
    }
}

