/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ApplicationErrorReport
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import java.util.List;

public final class cht
extends cgk {
    public static final Parcelable.Creator CREATOR = new chu();
    public String a;
    public Bundle b;
    public String c;
    public final ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public final String g;
    public List h;
    public boolean i;
    public cib j;
    public chw k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public boolean q;
    public String r;
    public chn s;

    public cht(String string, Bundle bundle, String string2, ApplicationErrorReport applicationErrorReport, String string3, BitmapTeleporter bitmapTeleporter, String string4, List arrayList, boolean bl2, cib cib2, chw chw2, boolean bl3, Bitmap bitmap, String string5, boolean bl4, long l2, boolean bl5, String string6, chn chn2) {
        this.a = string;
        string = bundle == null ? new Bundle() : bundle;
        this.b = string;
        this.c = string2;
        if (applicationErrorReport == null) {
            applicationErrorReport = new ApplicationErrorReport();
        }
        this.d = applicationErrorReport;
        this.e = string3;
        this.f = bitmapTeleporter;
        this.g = string4;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.h = arrayList;
        this.i = bl2;
        this.j = cib2;
        this.k = chw2;
        this.l = bl3;
        this.m = bitmap;
        this.n = string5;
        this.o = bl4;
        this.p = l2;
        this.q = bl5;
        this.r = string6;
        this.s = chn2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        chu.a(this, parcel, n2);
    }
}

