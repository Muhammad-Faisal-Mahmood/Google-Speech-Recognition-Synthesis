/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;

public final class ProtoParsers$InternalDontUse
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(12);
    private volatile byte[] a;
    private volatile hyf b;

    public ProtoParsers$InternalDontUse(byte[] byArray, hyf hyf2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (byArray == null) {
            bl3 = hyf2 != null ? bl2 : false;
        }
        fxf.r(bl3, "Must have a message or bytes");
        this.a = byArray;
        this.b = hyf2;
    }

    public final hyf a(hyf hyf2, hwj hwj2) {
        try {
            hyf2 = this.b(hyf2, hwj2);
            return hyf2;
        }
        catch (hxn hxn2) {
            throw new IllegalStateException(hxn2);
        }
    }

    public final hyf b(hyf hyf2, hwj hwj2) {
        if (this.b == null) {
            this.b = hyf2.bh().f(this.a, hwj2).r();
        }
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        if (this.a == null) {
            byte[] byArray = new byte[this.b.k()];
            try {
                this.b.aZ(hwd.ag(byArray));
                this.a = byArray;
            }
            catch (IOException iOException) {
                throw new AssertionError((Object)iOException);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}

