/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ApplicationErrorReport
 *  android.app.ApplicationErrorReport$CrashInfo
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.File;
import java.util.List;

public class ErrorReport
extends cgk
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cgi(2);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public chv[] U;
    public String[] V;
    public boolean W;
    public String X;
    public cib Y;
    public chw Z;
    public ApplicationErrorReport a;
    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String ap;
    public chn aq;
    public chx[] ar;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String string, int n2, String string2, String string3, String string4, String string5, String string6, String string7, String string8, int n3, String string9, String string10, String string11, String string12, String string13, String[] stringArray, String[] stringArray2, String[] stringArray3, String string14, String string15, byte[] byArray, int n4, int n5, int n6, int n7, String string16, String string17, String string18, Bundle bundle, boolean bl2, int n8, int n9, boolean bl3, String string19, String string20, int n10, String string21, String string22, String string23, String string24, String string25, String string26, String string27, BitmapTeleporter bitmapTeleporter, String string28, chv[] chvArray, String[] stringArray4, boolean bl4, String string29, cib cib2, chw chw2, String string30, boolean bl5, Bundle bundle2, List list, boolean bl6, Bitmap bitmap, String string31, List list2, int n11, int n12, String[] stringArray5, String[] stringArray6, String[] stringArray7, boolean bl7, boolean bl8, String string32, chn chn2, chx[] chxArray) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = string;
        this.c = n2;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.h = string6;
        this.i = string7;
        this.j = string8;
        this.k = n3;
        this.l = string9;
        this.m = string10;
        this.n = string11;
        this.o = string12;
        this.p = string13;
        this.q = stringArray;
        this.r = stringArray2;
        this.s = stringArray3;
        this.t = string14;
        this.u = string15;
        this.v = byArray;
        this.w = n4;
        this.x = n5;
        this.y = n6;
        this.z = n7;
        this.A = string16;
        this.B = string17;
        this.C = string18;
        this.D = bundle;
        this.E = bl2;
        this.F = n8;
        this.G = n9;
        this.H = bl3;
        this.I = string19;
        this.J = string20;
        this.K = n10;
        this.L = string21;
        this.M = string22;
        this.N = string23;
        this.O = string24;
        this.P = string25;
        this.Q = string26;
        this.R = string27;
        this.S = bitmapTeleporter;
        this.T = string28;
        this.U = chvArray;
        this.V = stringArray4;
        this.W = bl4;
        this.X = string29;
        this.Y = cib2;
        this.Z = chw2;
        this.aa = string30;
        this.ab = bl5;
        this.ac = bundle2;
        this.ad = list;
        this.ae = bl6;
        this.af = bitmap;
        this.ag = string31;
        this.ah = list2;
        this.ai = n11;
        this.aj = n12;
        this.ak = stringArray5;
        this.al = stringArray6;
        this.am = stringArray7;
        this.an = bl7;
        this.ao = bl8;
        this.ap = string32;
        this.aq = chn2;
        this.ar = chxArray;
    }

    public ErrorReport(cht cht2, File object) {
        this.a = new ApplicationErrorReport();
        Object object2 = cht2.b;
        if (object2 != null && !object2.isEmpty()) {
            this.D = cht2.b;
        }
        if (!TextUtils.isEmpty((CharSequence)cht2.a)) {
            this.B = cht2.a;
        }
        if (!TextUtils.isEmpty((CharSequence)cht2.c)) {
            this.b = cht2.c;
        }
        if ((object2 = cht2.d.crashInfo) != null) {
            this.M = ((ApplicationErrorReport.CrashInfo)object2).throwMethodName;
            this.K = ((ApplicationErrorReport.CrashInfo)object2).throwLineNumber;
            this.L = ((ApplicationErrorReport.CrashInfo)object2).throwClassName;
            this.N = ((ApplicationErrorReport.CrashInfo)object2).stackTrace;
            this.I = ((ApplicationErrorReport.CrashInfo)object2).exceptionClassName;
            this.O = ((ApplicationErrorReport.CrashInfo)object2).exceptionMessage;
            this.J = ((ApplicationErrorReport.CrashInfo)object2).throwFileName;
        }
        if ((object2 = cht2.j) != null) {
            this.Y = object2;
        }
        if (!TextUtils.isEmpty((CharSequence)cht2.e)) {
            this.P = cht2.e;
        }
        if (!TextUtils.isEmpty((CharSequence)(object2 = cht2.g))) {
            this.a.packageName = object2;
        }
        if (!TextUtils.isEmpty((CharSequence)cht2.n)) {
            this.ag = cht2.n;
        }
        if ((object2 = cht2.m) != null) {
            this.af = object2;
        }
        if (object != null) {
            this.S = cht2.f;
            List list = cht2.h;
            if (list != null && !list.isEmpty()) {
                object2 = list.iterator();
                while (object2.hasNext()) {
                    ((chv)object2.next()).d = object;
                }
                this.U = list.toArray(new chv[0]);
            }
        }
        if ((object = cht2.k) != null) {
            this.Z = object;
        }
        this.W = cht2.i;
        this.ae = cht2.l;
        this.E = cht2.o;
        this.an = cht2.q;
        this.ap = cht2.r;
        this.aq = cht2.s;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.J(parcel, 2, (Parcelable)this.a, n2);
        kl.K(parcel, 3, this.b);
        kl.A(parcel, 4, this.c);
        kl.K(parcel, 5, this.d);
        kl.K(parcel, 6, this.e);
        kl.K(parcel, 7, this.f);
        kl.K(parcel, 8, this.g);
        kl.K(parcel, 9, this.h);
        kl.K(parcel, 10, this.i);
        kl.K(parcel, 11, this.j);
        kl.A(parcel, 12, this.k);
        kl.K(parcel, 13, this.l);
        kl.K(parcel, 14, this.m);
        kl.K(parcel, 15, this.n);
        kl.K(parcel, 16, this.o);
        kl.K(parcel, 17, this.p);
        kl.L(parcel, 18, this.q);
        kl.L(parcel, 19, this.r);
        kl.L(parcel, 20, this.s);
        kl.K(parcel, 21, this.t);
        kl.K(parcel, 22, this.u);
        kl.D(parcel, 23, this.v);
        kl.A(parcel, 24, this.w);
        kl.A(parcel, 25, this.x);
        kl.A(parcel, 26, this.y);
        kl.A(parcel, 27, this.z);
        kl.K(parcel, 28, this.A);
        kl.K(parcel, 29, this.B);
        kl.K(parcel, 30, this.C);
        kl.C(parcel, 31, this.D);
        kl.x(parcel, 32, this.E);
        kl.A(parcel, 33, this.F);
        kl.A(parcel, 34, this.G);
        kl.x(parcel, 35, this.H);
        kl.K(parcel, 36, this.I);
        kl.K(parcel, 37, this.J);
        kl.A(parcel, 38, this.K);
        kl.K(parcel, 39, this.L);
        kl.K(parcel, 40, this.M);
        kl.K(parcel, 41, this.N);
        kl.K(parcel, 42, this.O);
        kl.K(parcel, 43, this.P);
        kl.K(parcel, 44, this.Q);
        kl.K(parcel, 45, this.R);
        kl.J(parcel, 46, this.S, n2);
        kl.K(parcel, 47, this.T);
        kl.N(parcel, 48, this.U, n2);
        kl.L(parcel, 49, this.V);
        kl.x(parcel, 50, this.W);
        kl.K(parcel, 51, this.X);
        kl.J(parcel, 52, this.Y, n2);
        kl.J(parcel, 53, this.Z, n2);
        kl.K(parcel, 54, this.aa);
        kl.x(parcel, 55, this.ab);
        kl.C(parcel, 56, this.ac);
        kl.O(parcel, 57, this.ad);
        kl.x(parcel, 58, this.ae);
        kl.J(parcel, 59, (Parcelable)this.af, n2);
        kl.K(parcel, 60, this.ag);
        kl.M(parcel, 61, this.ah);
        kl.A(parcel, 62, this.ai);
        kl.A(parcel, 63, this.aj);
        kl.L(parcel, 64, this.ak);
        kl.L(parcel, 65, this.al);
        kl.L(parcel, 66, this.am);
        kl.x(parcel, 67, this.an);
        kl.x(parcel, 68, this.ao);
        kl.K(parcel, 69, this.ap);
        kl.J(parcel, 70, this.aq, n2);
        kl.N(parcel, 71, this.ar, n2);
        kl.w(parcel, n3);
    }
}

