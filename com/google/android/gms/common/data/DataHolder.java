/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.CursorWindow
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 */
package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder
extends cgk
implements Closeable {
    public static final Parcelable.Creator CREATOR = new caw(14);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    boolean h = false;
    private final boolean i;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int n2, String[] stringArray, CursorWindow[] cursorWindowArray, int n3, Bundle bundle) {
        this.i = true;
        this.a = n2;
        this.b = stringArray;
        this.d = cursorWindowArray;
        this.e = n3;
        this.f = bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        synchronized (this) {
            if (!this.h) {
                CursorWindow[] cursorWindowArray;
                this.h = true;
                for (int i2 = 0; i2 < (cursorWindowArray = this.d).length; ++i2) {
                    cursorWindowArray[i2].close();
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void finalize() {
        boolean bl2;
        if (!this.i) return;
        if (this.d.length <= 0) return;
        synchronized (this) {
            bl2 = this.h;
        }
        if (bl2) return;
        try {
            this.close();
            Log.e((String)"DataBuffer", (String)a.ar(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            return;
        }
        finally {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String[] stringArray = this.b;
        int n3 = kl.u(parcel);
        kl.L(parcel, 1, stringArray);
        kl.N(parcel, 2, (Parcelable[])this.d, n2);
        kl.A(parcel, 3, this.e);
        kl.C(parcel, 4, this.f);
        kl.A(parcel, 1000, this.a);
        kl.w(parcel, n3);
        if ((n2 & 1) != 0) {
            this.close();
        }
    }
}

