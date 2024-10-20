/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.PendingIntent
 *  android.database.CursorWindow
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.accounts.Account;
import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

public final class caw
implements Parcelable.Creator {
    private final int a;

    public caw(int n2) {
        this.a = n2;
    }

    public static void a(cfl cfl2, Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, cfl2.c);
        kl.A(parcel, 2, cfl2.d);
        kl.A(parcel, 3, cfl2.e);
        kl.K(parcel, 4, cfl2.f);
        kl.F(parcel, 5, cfl2.g);
        kl.N(parcel, 6, cfl2.h, n2);
        kl.C(parcel, 7, cfl2.i);
        kl.J(parcel, 8, (Parcelable)cfl2.j, n2);
        kl.N(parcel, 10, cfl2.k, n2);
        kl.N(parcel, 11, cfl2.l, n2);
        kl.x(parcel, 12, cfl2.m);
        kl.A(parcel, 13, cfl2.n);
        kl.x(parcel, 14, cfl2.o);
        kl.K(parcel, 15, cfl2.p);
        kl.w(parcel, n3);
    }

    public final /* synthetic */ Object createFromParcel(Parcel object) {
        int n2 = this.a;
        Object object2 = null;
        CursorWindow[] cursorWindowArray = null;
        cbm[] cbmArray = null;
        Object object3 = null;
        Object[] objectArray = null;
        IBinder iBinder = null;
        Object object4 = null;
        Bundle bundle = null;
        IBinder iBinder2 = null;
        Object object5 = null;
        Scope[] scopeArray = null;
        int n3 = 0;
        int n4 = 0;
        boolean bl2 = false;
        int n5 = 0;
        boolean bl3 = false;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        switch (n2) {
            default: {
                n6 = kl.U(object);
                cursorWindowArray = null;
                objectArray = null;
                n7 = 0;
                bl3 = bl2 = false;
                break;
            }
            case 19: {
                n8 = kl.U(object);
                n6 = 0;
                n7 = 0;
                cursorWindowArray = null;
                objectArray = scopeArray;
                while (object.dataPosition() < n8) {
                    n5 = object.readInt();
                    n3 = kl.Q(n5);
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 4) {
                                    kl.ag(object, n5);
                                    continue;
                                }
                                cursorWindowArray = (GoogleSignInAccount)kl.Y(object, n5, GoogleSignInAccount.CREATOR);
                                continue;
                            }
                            n7 = kl.S(object, n5);
                            continue;
                        }
                        objectArray = (Account)kl.Y(object, n5, Account.CREATOR);
                        continue;
                    }
                    n6 = kl.S(object, n5);
                }
                kl.ae(object, n8);
                return new cgd(n6, (Account)objectArray, n7, (GoogleSignInAccount)cursorWindowArray);
            }
            case 18: {
                n4 = kl.U(object);
                long l2 = 0L;
                long l3 = 0L;
                n6 = -1;
                objectArray = null;
                cursorWindowArray = null;
                n5 = 0;
                n8 = n7 = (n3 = 0);
                block93: while (object.dataPosition() < n4) {
                    n2 = object.readInt();
                    switch (kl.Q(n2)) {
                        default: {
                            kl.ag(object, n2);
                            continue block93;
                        }
                        case 9: {
                            n6 = kl.S(object, n2);
                            continue block93;
                        }
                        case 8: {
                            n8 = kl.S(object, n2);
                            continue block93;
                        }
                        case 7: {
                            cursorWindowArray = kl.ab(object, n2);
                            continue block93;
                        }
                        case 6: {
                            objectArray = kl.ab(object, n2);
                            continue block93;
                        }
                        case 5: {
                            l3 = kl.V(object, n2);
                            continue block93;
                        }
                        case 4: {
                            l2 = kl.V(object, n2);
                            continue block93;
                        }
                        case 3: {
                            n7 = kl.S(object, n2);
                            continue block93;
                        }
                        case 2: {
                            n3 = kl.S(object, n2);
                            continue block93;
                        }
                        case 1: 
                    }
                    n5 = kl.S(object, n2);
                }
                kl.ae(object, n4);
                return new cga(n5, n3, n7, l2, l3, (String)objectArray, (String)cursorWindowArray, n8, n6);
            }
            case 17: {
                n2 = kl.U(object);
                scopeArray = cfl.a;
                bundle = new Bundle();
                objectArray = cfl.b;
                cbmArray = objectArray;
                object3 = null;
                iBinder2 = null;
                cursorWindowArray = iBinder2;
                object2 = cursorWindowArray;
                n4 = 0;
                n3 = n8 = (n6 = (n7 = (n5 = 0)));
                block94: while (object.dataPosition() < n2) {
                    int n9 = object.readInt();
                    switch (kl.Q(n9)) {
                        default: {
                            kl.ag(object, n9);
                            continue block94;
                        }
                        case 15: {
                            object2 = kl.ab(object, n9);
                            continue block94;
                        }
                        case 14: {
                            n3 = kl.ah(object, n9) ? 1 : 0;
                            continue block94;
                        }
                        case 13: {
                            n8 = kl.S(object, n9);
                            continue block94;
                        }
                        case 12: {
                            n6 = kl.ah(object, n9) ? 1 : 0;
                            continue block94;
                        }
                        case 11: {
                            cbmArray = (cbm[])kl.ak(object, n9, cbm.CREATOR);
                            continue block94;
                        }
                        case 10: {
                            objectArray = (cbm[])kl.ak(object, n9, cbm.CREATOR);
                            continue block94;
                        }
                        case 8: {
                            cursorWindowArray = (CursorWindow[])kl.Y(object, n9, Account.CREATOR);
                            continue block94;
                        }
                        case 7: {
                            bundle = kl.W(object, n9);
                            continue block94;
                        }
                        case 6: {
                            scopeArray = (Scope[])kl.ak(object, n9, Scope.CREATOR);
                            continue block94;
                        }
                        case 5: {
                            iBinder2 = kl.X(object, n9);
                            continue block94;
                        }
                        case 4: {
                            object3 = kl.ab(object, n9);
                            continue block94;
                        }
                        case 3: {
                            n7 = kl.S(object, n9);
                            continue block94;
                        }
                        case 2: {
                            n5 = kl.S(object, n9);
                            continue block94;
                        }
                        case 1: 
                    }
                    n4 = kl.S(object, n9);
                }
                kl.ae(object, n2);
                return new cfl(n4, n5, n7, (String)object3, iBinder2, scopeArray, bundle, (Account)cursorWindowArray, (cbm[])objectArray, cbmArray, n6 != 0, n8, n3 != 0, (String)object2);
            }
            case 16: {
                n8 = kl.U(object);
                object2 = null;
                objectArray = null;
                cursorWindowArray = objectArray;
                bl2 = false;
                n7 = n6 = 0;
                block95: while (object.dataPosition() < n8) {
                    n3 = object.readInt();
                    switch (kl.Q(n3)) {
                        default: {
                            kl.ag(object, n3);
                            continue block95;
                        }
                        case 6: {
                            cursorWindowArray = (CursorWindow[])kl.aj(object, n3);
                            continue block95;
                        }
                        case 5: {
                            n7 = kl.S(object, n3);
                            continue block95;
                        }
                        case 4: {
                            objectArray = kl.aj(object, n3);
                            continue block95;
                        }
                        case 3: {
                            n6 = kl.ah(object, n3) ? 1 : 0;
                            continue block95;
                        }
                        case 2: {
                            bl2 = kl.ah(object, n3);
                            continue block95;
                        }
                        case 1: 
                    }
                    object2 = (cgg)kl.Y(object, n3, cgg.CREATOR);
                }
                kl.ae(object, n8);
                return new cfh((cgg)object2, bl2, n6 != 0, (int[])objectArray, n7, (int[])cursorWindowArray);
            }
            case 15: {
                n6 = kl.U(object);
                cursorWindowArray = null;
                n7 = 0;
                objectArray = null;
                while (object.dataPosition() < n6) {
                    n8 = object.readInt();
                    n3 = kl.Q(n8);
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 4) {
                                    kl.ag(object, n8);
                                    continue;
                                }
                                cursorWindowArray = (cfh)kl.Y(object, n8, cfh.CREATOR);
                                continue;
                            }
                            n7 = kl.S(object, n8);
                            continue;
                        }
                        objectArray = (cbm[])kl.ak(object, n8, cbm.CREATOR);
                        continue;
                    }
                    object2 = kl.W(object, n8);
                }
                kl.ae(object, n6);
                return new cfg((Bundle)object2, (cbm[])objectArray, n7, (cfh)cursorWindowArray);
            }
            case 14: {
                n3 = kl.U(object);
                object2 = null;
                objectArray = null;
                cursorWindowArray = objectArray;
                n6 = 0;
                n7 = 0;
                while (object.dataPosition() < n3) {
                    n5 = object.readInt();
                    n4 = kl.Q(n5);
                    if (n4 != 1) {
                        if (n4 != 2) {
                            if (n4 != 3) {
                                if (n4 != 4) {
                                    if (n4 != 1000) {
                                        kl.ag(object, n5);
                                        continue;
                                    }
                                    n6 = kl.S(object, n5);
                                    continue;
                                }
                                cursorWindowArray = kl.W(object, n5);
                                continue;
                            }
                            n7 = kl.S(object, n5);
                            continue;
                        }
                        objectArray = (PendingIntent)kl.ak(object, n5, CursorWindow.CREATOR);
                        continue;
                    }
                    object2 = kl.al(object, n5);
                }
                kl.ae(object, n3);
                object = new DataHolder(n6, (String[])object2, (CursorWindow[])objectArray, n7, (Bundle)cursorWindowArray);
                object.c = new Bundle();
                for (n7 = 0; n7 < (cursorWindowArray = object.b).length; ++n7) {
                    object.c.putInt(cursorWindowArray[n7], n7);
                }
                object.g = new int[object.d.length];
                n6 = 0;
                for (n7 = n8; n7 < (cursorWindowArray = object.d).length; ++n7) {
                    object.g[n7] = n6;
                    n8 = cursorWindowArray[n7].getStartPosition();
                    n6 += object.d[n7].getNumRows() - (n6 - n8);
                }
                return object;
            }
            case 13: {
                n8 = kl.U(object);
                n6 = 0;
                n7 = n3;
                while (object.dataPosition() < n8) {
                    n5 = object.readInt();
                    n3 = kl.Q(n5);
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                kl.ag(object, n5);
                                continue;
                            }
                            n6 = kl.S(object, n5);
                            continue;
                        }
                        cursorWindowArray = (ParcelFileDescriptor)kl.Y(object, n5, ParcelFileDescriptor.CREATOR);
                        continue;
                    }
                    n7 = kl.S(object, n5);
                }
                kl.ae(object, n8);
                return new BitmapTeleporter(n7, (ParcelFileDescriptor)cursorWindowArray, n6);
            }
            case 12: {
                n6 = kl.U(object);
                cursorWindowArray = null;
                n7 = 0;
                objectArray = null;
                object2 = cbmArray;
                while (object.dataPosition() < n6) {
                    n8 = object.readInt();
                    n3 = kl.Q(n8);
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 4) {
                                    kl.ag(object, n8);
                                    continue;
                                }
                                cursorWindowArray = (cbk)kl.Y(object, n8, cbk.CREATOR);
                                continue;
                            }
                            objectArray = (PendingIntent)kl.Y(object, n8, PendingIntent.CREATOR);
                            continue;
                        }
                        object2 = kl.ab(object, n8);
                        continue;
                    }
                    n7 = kl.S(object, n8);
                }
                kl.ae(object, n6);
                return new Status(n7, (String)object2, (PendingIntent)objectArray, (cbk)cursorWindowArray);
            }
            case 11: {
                n6 = kl.U(object);
                n7 = n4;
                cursorWindowArray = object3;
                while (object.dataPosition() < n6) {
                    n8 = object.readInt();
                    n3 = kl.Q(n8);
                    if (n3 != 1) {
                        if (n3 != 2) {
                            kl.ag(object, n8);
                            continue;
                        }
                        cursorWindowArray = kl.ab(object, n8);
                        continue;
                    }
                    n7 = kl.S(object, n8);
                }
                kl.ae(object, n6);
                return new Scope(n7, (String)cursorWindowArray);
            }
            case 10: {
                n7 = kl.U(object);
                bl3 = false;
                bl2 = false;
                cursorWindowArray = null;
                while (object.dataPosition() < n7) {
                    n6 = object.readInt();
                    n8 = kl.Q(n6);
                    if (n8 != 1) {
                        if (n8 != 2) {
                            if (n8 != 3) {
                                if (n8 != 4) {
                                    kl.ag(object, n6);
                                    continue;
                                }
                                bl2 = kl.ah(object, n6);
                                continue;
                            }
                            bl3 = kl.ah(object, n6);
                            continue;
                        }
                        cursorWindowArray = kl.X(object, n6);
                        continue;
                    }
                    objectArray = kl.ab(object, n6);
                }
                kl.ae(object, n7);
                return new ccb((String)objectArray, (IBinder)cursorWindowArray, bl3, bl2);
            }
            case 9: {
                n8 = kl.U(object);
                n6 = 0;
                n7 = 0;
                cursorWindowArray = iBinder;
                while (object.dataPosition() < n8) {
                    n3 = object.readInt();
                    n5 = kl.Q(n3);
                    if (n5 != 1) {
                        if (n5 != 2) {
                            if (n5 != 3) {
                                if (n5 != 4) {
                                    kl.ag(object, n3);
                                    continue;
                                }
                                n7 = kl.S(object, n3);
                                continue;
                            }
                            n6 = kl.S(object, n3);
                            continue;
                        }
                        cursorWindowArray = kl.ab(object, n3);
                        continue;
                    }
                    bl2 = kl.ah(object, n3);
                }
                kl.ae(object, n8);
                return new cca(bl2, (String)cursorWindowArray, n6, n7);
            }
            case 8: {
                boolean bl4;
                n7 = kl.U(object);
                objectArray = null;
                cursorWindowArray = null;
                boolean bl5 = false;
                bl3 = bl2 = (bl4 = false);
                block105: while (object.dataPosition() < n7) {
                    n6 = object.readInt();
                    switch (kl.Q(n6)) {
                        default: {
                            kl.ag(object, n6);
                            continue block105;
                        }
                        case 6: {
                            bl3 = kl.ah(object, n6);
                            continue block105;
                        }
                        case 5: {
                            bl2 = kl.ah(object, n6);
                            continue block105;
                        }
                        case 4: {
                            cursorWindowArray = kl.X(object, n6);
                            continue block105;
                        }
                        case 3: {
                            bl4 = kl.ah(object, n6);
                            continue block105;
                        }
                        case 2: {
                            bl5 = kl.ah(object, n6);
                            continue block105;
                        }
                        case 1: 
                    }
                    objectArray = kl.ab(object, n6);
                }
                kl.ae(object, n7);
                return new cbz((String)objectArray, bl5, bl4, (IBinder)cursorWindowArray, bl2, bl3);
            }
            case 7: {
                n6 = kl.U(object);
                long l4 = -1L;
                n7 = n5;
                cursorWindowArray = object4;
                while (object.dataPosition() < n6) {
                    n3 = object.readInt();
                    n8 = kl.Q(n3);
                    if (n8 != 1) {
                        if (n8 != 2) {
                            if (n8 != 3) {
                                kl.ag(object, n3);
                                continue;
                            }
                            l4 = kl.V(object, n3);
                            continue;
                        }
                        n7 = kl.S(object, n3);
                        continue;
                    }
                    cursorWindowArray = kl.ab(object, n3);
                }
                kl.ae(object, n6);
                return new cbm((String)cursorWindowArray, n7, l4);
            }
            case 6: {
                n8 = kl.U(object);
                n6 = 0;
                n7 = 0;
                cursorWindowArray = null;
                objectArray = bundle;
                while (object.dataPosition() < n8) {
                    n5 = object.readInt();
                    n3 = kl.Q(n5);
                    if (n3 != 1) {
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 4) {
                                    kl.ag(object, n5);
                                    continue;
                                }
                                cursorWindowArray = kl.ab(object, n5);
                                continue;
                            }
                            objectArray = (PendingIntent)kl.Y(object, n5, PendingIntent.CREATOR);
                            continue;
                        }
                        n7 = kl.S(object, n5);
                        continue;
                    }
                    n6 = kl.S(object, n5);
                }
                kl.ae(object, n8);
                return new cbk(n6, n7, (PendingIntent)objectArray, (String)cursorWindowArray);
            }
            case 5: {
                n2 = kl.U(object);
                bl2 = true;
                cbmArray = null;
                object2 = null;
                cursorWindowArray = object2;
                objectArray = cursorWindowArray;
                n4 = 0;
                n3 = n8 = (n6 = (n7 = (n5 = 0)));
                block108: while (object.dataPosition() < n2) {
                    int n10 = object.readInt();
                    switch (kl.Q(n10)) {
                        default: {
                            kl.ag(object, n10);
                            continue block108;
                        }
                        case 13: {
                            n3 = kl.S(object, n10);
                            continue block108;
                        }
                        case 12: {
                            n8 = kl.ah(object, n10) ? 1 : 0;
                            continue block108;
                        }
                        case 11: {
                            objectArray = kl.Z(object, n10);
                            continue block108;
                        }
                        case 10: {
                            n6 = kl.S(object, n10);
                            continue block108;
                        }
                        case 9: {
                            n7 = kl.ah(object, n10) ? 1 : 0;
                            continue block108;
                        }
                        case 8: {
                            cursorWindowArray = kl.ab(object, n10);
                            continue block108;
                        }
                        case 7: {
                            bl2 = kl.ah(object, n10);
                            continue block108;
                        }
                        case 5: {
                            object2 = kl.ab(object, n10);
                            continue block108;
                        }
                        case 4: {
                            n5 = kl.S(object, n10);
                            continue block108;
                        }
                        case 3: {
                            n4 = kl.S(object, n10);
                            continue block108;
                        }
                        case 2: 
                    }
                    cbmArray = kl.ab(object, n10);
                }
                kl.ae(object, n2);
                return new cbi((String)cbmArray, n4, n5, (String)object2, bl2, (String)cursorWindowArray, n7 != 0, n6, (Integer)objectArray, n8 != 0, n3);
            }
            case 4: {
                n7 = kl.U(object);
                bl2 = bl3;
                while (object.dataPosition() < n7) {
                    n6 = object.readInt();
                    if (kl.Q(n6) != 1) {
                        kl.ag(object, n6);
                        continue;
                    }
                    bl2 = kl.ah(object, n6);
                }
                kl.ae(object, n7);
                return new cbh(bl2);
            }
            case 3: {
                n3 = kl.U(object);
                n8 = 0;
                n7 = n6;
                cursorWindowArray = iBinder2;
                n6 = n8;
                while (object.dataPosition() < n3) {
                    n8 = object.readInt();
                    n5 = kl.Q(n8);
                    if (n5 != 1) {
                        if (n5 != 2) {
                            if (n5 != 3) {
                                kl.ag(object, n8);
                                continue;
                            }
                            n6 = kl.S(object, n8);
                            continue;
                        }
                        n7 = kl.S(object, n8);
                        continue;
                    }
                    cursorWindowArray = kl.ab(object, n8);
                }
                kl.ae(object, n3);
                return new cbf((String)cursorWindowArray, n7, n6);
            }
            case 2: {
                n3 = kl.U(object);
                n8 = 0;
                n6 = 0;
                while (object.dataPosition() < n3) {
                    n5 = object.readInt();
                    n4 = kl.Q(n5);
                    if (n4 != 1) {
                        if (n4 != 2) {
                            if (n4 != 3) {
                                kl.ag(object, n5);
                                continue;
                            }
                            n6 = kl.S(object, n5);
                            continue;
                        }
                        n8 = kl.S(object, n5);
                        continue;
                    }
                    n7 = kl.S(object, n5);
                }
                kl.ae(object, n3);
                return new cbc(n7, n8, n6);
            }
            case 1: {
                n6 = kl.U(object);
                bl2 = true;
                object5 = null;
                object4 = null;
                cursorWindowArray = object4;
                objectArray = cursorWindowArray;
                object2 = objectArray;
                cbmArray = object2;
                bundle = cbmArray;
                scopeArray = bundle;
                object3 = iBinder2 = scopeArray;
                n7 = 0;
                block112: while (object.dataPosition() < n6) {
                    n8 = object.readInt();
                    switch (kl.Q(n8)) {
                        default: {
                            kl.ag(object, n8);
                            continue block112;
                        }
                        case 14: {
                            object3 = (cbc)kl.Y(object, n8, cbc.CREATOR);
                            continue block112;
                        }
                        case 13: {
                            n7 = kl.S(object, n8);
                            continue block112;
                        }
                        case 12: {
                            iBinder2 = kl.al(object, n8);
                            continue block112;
                        }
                        case 11: {
                            scopeArray = (cbh)kl.Y(object, n8, cbh.CREATOR);
                            continue block112;
                        }
                        case 9: {
                            bundle = (cjn[])kl.ak(object, n8, cjn.CREATOR);
                            continue block112;
                        }
                        case 8: {
                            bl2 = kl.ah(object, n8);
                            continue block112;
                        }
                        case 7: {
                            cbmArray = (cbm[])kl.am(object, n8);
                            continue block112;
                        }
                        case 6: {
                            object2 = kl.aj(object, n8);
                            continue block112;
                        }
                        case 5: {
                            objectArray = kl.al(object, n8);
                            continue block112;
                        }
                        case 4: {
                            cursorWindowArray = (CursorWindow[])kl.aj(object, n8);
                            continue block112;
                        }
                        case 3: {
                            object4 = kl.ai(object, n8);
                            continue block112;
                        }
                        case 2: 
                    }
                    object5 = (cbi)kl.Y(object, n8, cbi.CREATOR);
                }
                kl.ae(object, n6);
                return new cas((cbi)object5, (byte[])object4, (int[])cursorWindowArray, (String[])objectArray, (int[])object2, (byte[][])cbmArray, bl2, (cjn[])bundle, (cbh)scopeArray, (String[])iBinder2, n7, (cbc)object3);
            }
            case 0: {
                n7 = kl.U(object);
                cursorWindowArray = object5;
                while (object.dataPosition() < n7) {
                    n6 = object.readInt();
                    if (kl.Q(n6) != 1) {
                        kl.ag(object, n6);
                        continue;
                    }
                    cursorWindowArray = kl.ad(object, n6, cbf.CREATOR);
                }
                kl.ae(object, n7);
                return new cav((List)cursorWindowArray);
            }
        }
        while (object.dataPosition() < n6) {
            n3 = object.readInt();
            n8 = kl.Q(n3);
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                kl.ag(object, n3);
                                continue;
                            }
                            bl3 = kl.ah(object, n3);
                            continue;
                        }
                        bl2 = kl.ah(object, n3);
                        continue;
                    }
                    objectArray = (cbk)kl.Y(object, n3, cbk.CREATOR);
                    continue;
                }
                cursorWindowArray = kl.X(object, n3);
                continue;
            }
            n7 = kl.S(object, n3);
        }
        kl.ae(object, n6);
        return new cge(n7, (IBinder)cursorWindowArray, (cbk)objectArray, bl2, bl3);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        switch (this.a) {
            default: {
                return new cge[n2];
            }
            case 19: {
                return new cgd[n2];
            }
            case 18: {
                return new cga[n2];
            }
            case 17: {
                return new cfl[n2];
            }
            case 16: {
                return new cfh[n2];
            }
            case 15: {
                return new cfg[n2];
            }
            case 14: {
                return new DataHolder[n2];
            }
            case 13: {
                return new BitmapTeleporter[n2];
            }
            case 12: {
                return new Status[n2];
            }
            case 11: {
                return new Scope[n2];
            }
            case 10: {
                return new ccb[n2];
            }
            case 9: {
                return new cca[n2];
            }
            case 8: {
                return new cbz[n2];
            }
            case 7: {
                return new cbm[n2];
            }
            case 6: {
                return new cbk[n2];
            }
            case 5: {
                return new cbi[n2];
            }
            case 4: {
                return new cbh[n2];
            }
            case 3: {
                return new cbf[n2];
            }
            case 2: {
                return new cbc[n2];
            }
            case 1: {
                return new cas[n2];
            }
            case 0: 
        }
        return new cav[n2];
    }
}

