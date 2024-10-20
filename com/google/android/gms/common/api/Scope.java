/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope
extends cgk
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new caw(11);
    final int a;
    public final String b;

    public Scope(int n2, String string) {
        kl.as(string, "scopeUri must not be null or empty");
        this.a = n2;
        this.b = string;
    }

    public Scope(String string) {
        this(1, string);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope)object).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.A(parcel, 1, this.a);
        kl.K(parcel, 2, this.b);
        kl.w(parcel, n2);
    }
}

