/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

public final class cfl
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(17);
    public static final Scope[] a = new Scope[0];
    public static final cbm[] b = new cbm[0];
    public final int c;
    public final int d;
    public final int e;
    public String f;
    public IBinder g;
    public Scope[] h;
    public Bundle i;
    public Account j;
    public cbm[] k;
    public cbm[] l;
    public boolean m;
    public int n;
    public boolean o;
    public String p;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public cfl(int n2, int n3, int n4, String string, IBinder object, Scope[] cbmArray, Bundle cbmArray2, Account account, cbm[] cbmArray3, cbm[] cbmArray4, boolean bl2, int n5, boolean bl3, String string2) {
        cbm[] cbmArray5;
        block13: {
            block12: {
                block11: {
                    cbmArray5 = cbmArray;
                    if (cbmArray == null) {
                        cbmArray5 = a;
                    }
                    cbmArray = cbmArray2;
                    if (cbmArray2 == null) {
                        cbmArray = new Bundle();
                    }
                    cbmArray2 = cbmArray3;
                    if (cbmArray3 == null) {
                        cbmArray2 = b;
                    }
                    cbmArray3 = cbmArray4;
                    if (cbmArray4 == null) {
                        cbmArray3 = b;
                    }
                    this.c = n2;
                    this.d = n3;
                    this.e = n4;
                    this.f = "com.google.android.gms".equals(string) ? "com.google.android.gms" : string;
                    if (n2 >= 2) break block12;
                    account = null;
                    string = account;
                    if (object != null) {
                        string = object.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        object = string instanceof cfs ? (cfs)((Object)string) : new cfs((IBinder)object);
                        string = account;
                        if (object != null) {
                            Throwable throwable2222222;
                            long l2;
                            block10: {
                                l2 = Binder.clearCallingIdentity();
                                object = ((bov)object).b(2, ((bov)object).a());
                                string = (Account)box.a((Parcel)object, Account.CREATOR);
                                object.recycle();
                                {
                                    catch (Throwable throwable2222222) {
                                        break block10;
                                    }
                                    catch (RemoteException remoteException) {}
                                    {
                                        Log.w((String)"AccountAccessor", (String)"Remote account accessor probably died");
                                    }
                                    Binder.restoreCallingIdentity((long)l2);
                                    string = account;
                                    break block11;
                                }
                                Binder.restoreCallingIdentity((long)l2);
                                break block11;
                            }
                            Binder.restoreCallingIdentity((long)l2);
                            throw throwable2222222;
                        }
                    }
                }
                this.j = string;
                break block13;
            }
            this.g = object;
            this.j = account;
        }
        this.h = cbmArray5;
        this.i = cbmArray;
        this.k = cbmArray2;
        this.l = cbmArray3;
        this.m = bl2;
        this.n = n5;
        this.o = bl3;
        this.p = string2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        caw.a(this, parcel, n2);
    }
}

