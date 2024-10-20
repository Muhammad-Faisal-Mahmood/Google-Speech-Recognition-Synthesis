/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class cho
implements Parcelable.Creator {
    private final int a;

    public cho(int n2) {
        this.a = n2;
    }

    public static boolean a(int n2) {
        return n2 == 0;
    }

    public static boolean b(Object object) {
        return object == null;
    }

    public final /* synthetic */ Object createFromParcel(Parcel objectArray) {
        int n2 = this.a;
        boolean bl2 = true;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        boolean bl6 = false;
        int n7 = 0;
        int n8 = 0;
        Object object = null;
        Object[] objectArray2 = null;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        byte[] byArray = null;
        Object object6 = null;
        Object object7 = null;
        switch (n2) {
            default: {
                object = dcm.h(objectArray.readParcelableArray(den.class.getClassLoader()));
                object2 = dcm.h(objectArray.readParcelableArray(den.class.getClassLoader()));
                object5 = dcm.h(objectArray.readParcelableArray(den.class.getClassLoader()));
                object6 = dcm.h(objectArray.readParcelableArray(den.class.getClassLoader()));
                n6 = objectArray.readInt();
                n5 = objectArray.readInt();
                bl3 = n6 == 1;
            }
            case 19: {
                object5 = fxf.O(objectArray.readString());
                n6 = objectArray.readInt();
                objectArray = objectArray.readParcelableArray(den.class.getClassLoader());
                object2 = dbx.f();
                object2.d((String)object5);
                object2.e(n6);
                if (objectArray != null) {
                    for (n6 = n8; n6 < objectArray.length; ++n6) {
                        object2.b((den)objectArray[n6]);
                    }
                }
                return object2.a();
            }
            case 18: {
                object5 = dbu.d;
                object5 = objectArray.readParcelableArray(der.class.getClassLoader());
                n5 = objectArray.readInt();
                objectArray = objectArray.createByteArray();
                object2 = dbu.e();
                if (object5 != null) {
                    for (n6 = 0; n6 < ((Parcelable[])object5).length; ++n6) {
                        object2.b((der)object5[n6]);
                    }
                }
                bl3 = n5 == 1 ? bl2 : false;
                object2.c(bl3);
                object2.a = (byte[])objectArray;
                return object2.a();
            }
            case 17: {
                n4 = kl.U((Parcel)objectArray);
                n7 = 0;
                n5 = n6 = (n8 = 0);
                object2 = null;
                object5 = null;
                block71: while (objectArray.dataPosition() < n4) {
                    n3 = objectArray.readInt();
                    switch (kl.Q(n3)) {
                        default: {
                            kl.ag((Parcel)objectArray, n3);
                            continue block71;
                        }
                        case 7: {
                            n5 = kl.ah((Parcel)objectArray, n3) ? 1 : 0;
                            continue block71;
                        }
                        case 6: {
                            object5 = kl.ab((Parcel)objectArray, n3);
                            continue block71;
                        }
                        case 5: {
                            n6 = kl.S((Parcel)objectArray, n3);
                            continue block71;
                        }
                        case 4: {
                            object2 = kl.ac((Parcel)objectArray, n3);
                            continue block71;
                        }
                        case 3: {
                            n8 = kl.ah((Parcel)objectArray, n3) ? 1 : 0;
                            continue block71;
                        }
                        case 2: 
                    }
                    n7 = kl.S((Parcel)objectArray, n3);
                }
                kl.ae((Parcel)objectArray, n4);
                return new cls(n7, n8 != 0, (List)object2, n6, (String)object5, n5 != 0);
            }
            case 16: {
                n5 = kl.U((Parcel)objectArray);
                bl5 = false;
                n6 = 0;
                while (objectArray.dataPosition() < n5) {
                    n7 = objectArray.readInt();
                    n8 = kl.Q(n7);
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                kl.ag((Parcel)objectArray, n7);
                                continue;
                            }
                            n6 = kl.S((Parcel)objectArray, n7);
                            continue;
                        }
                        bl5 = kl.ah((Parcel)objectArray, n7);
                        continue;
                    }
                    bl3 = kl.ah((Parcel)objectArray, n7);
                }
                kl.ae((Parcel)objectArray, n5);
                return new clm(bl3, bl5, n6);
            }
            case 15: {
                n5 = kl.U((Parcel)objectArray);
                n6 = 0;
                bl3 = bl4;
                while (objectArray.dataPosition() < n5) {
                    n7 = objectArray.readInt();
                    n8 = kl.Q(n7);
                    if (n8 != 2) {
                        if (n8 != 3) {
                            kl.ag((Parcel)objectArray, n7);
                            continue;
                        }
                        n6 = kl.S((Parcel)objectArray, n7);
                        continue;
                    }
                    bl3 = kl.ah((Parcel)objectArray, n7);
                }
                kl.ae((Parcel)objectArray, n5);
                return new clg(bl3, n6);
            }
            case 14: {
                n5 = kl.U((Parcel)objectArray);
                bl6 = false;
                object5 = object7;
                bl3 = bl5;
                bl5 = bl6;
                while (objectArray.dataPosition() < n5) {
                    n8 = objectArray.readInt();
                    n6 = kl.Q(n8);
                    if (n6 != 1) {
                        if (n6 != 2) {
                            if (n6 != 3) {
                                kl.ag((Parcel)objectArray, n8);
                                continue;
                            }
                            bl5 = kl.ah((Parcel)objectArray, n8);
                            continue;
                        }
                        bl3 = kl.ah((Parcel)objectArray, n8);
                        continue;
                    }
                    object5 = kl.ad((Parcel)objectArray, n8, cle.CREATOR);
                }
                kl.ae((Parcel)objectArray, n5);
                return new clf((List)object5, bl3, bl5);
            }
            case 13: {
                n5 = kl.U((Parcel)objectArray);
                object6 = null;
                object2 = null;
                object5 = object2;
                while (objectArray.dataPosition() < n5) {
                    n8 = objectArray.readInt();
                    n6 = kl.Q(n8);
                    if (n6 != 1) {
                        if (n6 != 2) {
                            if (n6 != 3) {
                                kl.ag((Parcel)objectArray, n8);
                                continue;
                            }
                            n8 = kl.T((Parcel)objectArray, n8);
                            n4 = objectArray.dataPosition();
                            if (n8 == 0) {
                                object5 = null;
                                continue;
                            }
                            object5 = new ArrayList();
                            n7 = objectArray.readInt();
                            for (n6 = 0; n6 < n7; ++n6) {
                                ((ArrayList)object5).add(objectArray.readInt());
                            }
                            objectArray.setDataPosition(n4 + n8);
                            continue;
                        }
                        object2 = kl.ai((Parcel)objectArray, n8);
                        continue;
                    }
                    object6 = kl.ab((Parcel)objectArray, n8);
                }
                kl.ae((Parcel)objectArray, n5);
                return new cle((String)object6, (byte[])object2, (List)object5);
            }
            case 12: {
                n5 = kl.U((Parcel)objectArray);
                object2 = null;
                object5 = object;
                n6 = n3;
                while (objectArray.dataPosition() < n5) {
                    n8 = objectArray.readInt();
                    n7 = kl.Q(n8);
                    if (n7 != 1) {
                        if (n7 != 2) {
                            if (n7 != 3) {
                                kl.ag((Parcel)objectArray, n8);
                                continue;
                            }
                            object2 = (cge)kl.Y((Parcel)objectArray, n8, cge.CREATOR);
                            continue;
                        }
                        object5 = (cbk)kl.Y((Parcel)objectArray, n8, cbk.CREATOR);
                        continue;
                    }
                    n6 = kl.S((Parcel)objectArray, n8);
                }
                kl.ae((Parcel)objectArray, n5);
                return new cko(n6, (cbk)object5, (cge)object2);
            }
            case 11: {
                n5 = kl.U((Parcel)objectArray);
                object5 = objectArray2;
                n6 = n4;
                while (objectArray.dataPosition() < n5) {
                    n8 = objectArray.readInt();
                    n7 = kl.Q(n8);
                    if (n7 != 1) {
                        if (n7 != 2) {
                            kl.ag((Parcel)objectArray, n8);
                            continue;
                        }
                        object5 = (cgd)kl.Y((Parcel)objectArray, n8, cgd.CREATOR);
                        continue;
                    }
                    n6 = kl.S((Parcel)objectArray, n8);
                }
                kl.ae((Parcel)objectArray, n5);
                return new ckn(n6, (cgd)object5);
            }
            case 10: {
                n6 = kl.U((Parcel)objectArray);
                object6 = null;
                object5 = object2;
                object2 = object6;
                while (objectArray.dataPosition() < n6) {
                    n5 = objectArray.readInt();
                    n8 = kl.Q(n5);
                    if (n8 != 1) {
                        if (n8 != 2) {
                            kl.ag((Parcel)objectArray, n5);
                            continue;
                        }
                        object2 = kl.ab((Parcel)objectArray, n5);
                        continue;
                    }
                    object5 = kl.ac((Parcel)objectArray, n5);
                }
                kl.ae((Parcel)objectArray, n6);
                return new ckl((List)object5, (String)object2);
            }
            case 9: {
                n7 = kl.U((Parcel)objectArray);
                n8 = 0;
                object5 = object3;
                n6 = n5;
                n5 = n8;
                while (objectArray.dataPosition() < n7) {
                    n8 = objectArray.readInt();
                    n4 = kl.Q(n8);
                    if (n4 != 1) {
                        if (n4 != 2) {
                            if (n4 != 3) {
                                kl.ag((Parcel)objectArray, n8);
                                continue;
                            }
                            object5 = (Intent)kl.Y((Parcel)objectArray, n8, Intent.CREATOR);
                            continue;
                        }
                        n5 = kl.S((Parcel)objectArray, n8);
                        continue;
                    }
                    n6 = kl.S((Parcel)objectArray, n8);
                }
                kl.ae((Parcel)objectArray, n7);
                return new cki(n6, n5, (Intent)object5);
            }
            case 8: {
                n8 = kl.U((Parcel)objectArray);
                n5 = 0;
                while (objectArray.dataPosition() < n8) {
                    n4 = objectArray.readInt();
                    n7 = kl.Q(n4);
                    if (n7 != 1) {
                        if (n7 != 2) {
                            kl.ag((Parcel)objectArray, n4);
                            continue;
                        }
                        n5 = kl.S((Parcel)objectArray, n4);
                        continue;
                    }
                    n6 = kl.S((Parcel)objectArray, n4);
                }
                kl.ae((Parcel)objectArray, n8);
                return new cjs(n6, n5);
            }
            case 7: {
                n6 = kl.U((Parcel)objectArray);
                object5 = object4;
                while (objectArray.dataPosition() < n6) {
                    n5 = objectArray.readInt();
                    if (kl.Q(n5) != 2) {
                        kl.ag((Parcel)objectArray, n5);
                        continue;
                    }
                    object5 = kl.ad((Parcel)objectArray, n5, cjq.CREATOR);
                }
                kl.ae((Parcel)objectArray, n6);
                return new cjr((List)object5);
            }
            case 6: {
                n8 = kl.U((Parcel)objectArray);
                object6 = null;
                object2 = null;
                bl3 = bl6;
                while (objectArray.dataPosition() < n8) {
                    n5 = objectArray.readInt();
                    n6 = kl.Q(n5);
                    if (n6 != 2) {
                        if (n6 != 3) {
                            if (n6 != 4) {
                                if (n6 != 5) {
                                    kl.ag((Parcel)objectArray, n5);
                                    continue;
                                }
                                bl3 = kl.ah((Parcel)objectArray, n5);
                                continue;
                            }
                            object2 = (cjp)kl.Y((Parcel)objectArray, n5, cjp.CREATOR);
                            continue;
                        }
                        object6 = kl.ab((Parcel)objectArray, n5);
                        continue;
                    }
                    object5 = kl.ab((Parcel)objectArray, n5);
                }
                kl.ae((Parcel)objectArray, n8);
                return new cjq((String)object5, (String)object6, (cjp)object2, bl3);
            }
            case 5: {
                n7 = kl.U((Parcel)objectArray);
                long l2 = 0L;
                double d2 = 0.0;
                bl3 = false;
                n5 = n6 = (n8 = 0);
                object6 = null;
                object2 = null;
                object5 = object2;
                block84: while (objectArray.dataPosition() < n7) {
                    n4 = objectArray.readInt();
                    switch (kl.Q(n4)) {
                        default: {
                            kl.ag((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 10: {
                            n5 = kl.S((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 9: {
                            n6 = kl.S((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 8: {
                            n8 = kl.S((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 7: {
                            object5 = kl.ai((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 6: {
                            object2 = kl.ab((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 5: {
                            d2 = kl.P((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 4: {
                            bl3 = kl.ah((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 3: {
                            l2 = kl.V((Parcel)objectArray, n4);
                            continue block84;
                        }
                        case 2: 
                    }
                    object6 = kl.ab((Parcel)objectArray, n4);
                }
                kl.ae((Parcel)objectArray, n7);
                return new cjp((String)object6, l2, bl3, d2, (String)object2, (byte[])object5, n8, n6, n5);
            }
            case 4: {
                n6 = kl.U((Parcel)objectArray);
                String string = null;
                byArray = null;
                object5 = byArray;
                object6 = object2 = object5;
                object = object6;
                object3 = objectArray2 = (object7 = (object4 = object));
                block85: while (objectArray.dataPosition() < n6) {
                    n5 = objectArray.readInt();
                    switch (kl.Q(n5)) {
                        default: {
                            kl.ag((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 11: {
                            object3 = kl.am((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 10: {
                            objectArray2 = kl.aj((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 9: {
                            object7 = kl.am((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 8: {
                            object4 = kl.aj((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 7: {
                            object = kl.am((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 6: {
                            object6 = kl.am((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 5: {
                            object2 = kl.am((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 4: {
                            object5 = kl.am((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 3: {
                            byArray = kl.ai((Parcel)objectArray, n5);
                            continue block85;
                        }
                        case 2: 
                    }
                    string = kl.ab((Parcel)objectArray, n5);
                }
                kl.ae((Parcel)objectArray, n6);
                return new cjn(string, byArray, (byte[][])object5, (byte[][])object2, (byte[][])object6, (byte[][])object, (int[])object4, (byte[][])object7, (int[])objectArray2, (byte[][])object3);
            }
            case 3: {
                n5 = kl.U((Parcel)objectArray);
                object5 = byArray;
                while (objectArray.dataPosition() < n5) {
                    n6 = objectArray.readInt();
                    if (kl.Q(n6) != 2) {
                        kl.ag((Parcel)objectArray, n6);
                        continue;
                    }
                    object5 = kl.ai((Parcel)objectArray, n6);
                }
                kl.ae((Parcel)objectArray, n5);
                return new cjk((byte[])object5);
            }
            case 2: {
                n6 = kl.U((Parcel)objectArray);
                long l3 = 0L;
                bl3 = false;
                object = null;
                object6 = null;
                object5 = object6;
                object2 = object5;
                block87: while (objectArray.dataPosition() < n6) {
                    n5 = objectArray.readInt();
                    switch (kl.Q(n5)) {
                        default: {
                            kl.ag((Parcel)objectArray, n5);
                            continue block87;
                        }
                        case 7: {
                            l3 = kl.V((Parcel)objectArray, n5);
                            continue block87;
                        }
                        case 6: {
                            object2 = kl.ai((Parcel)objectArray, n5);
                            continue block87;
                        }
                        case 5: {
                            bl3 = kl.ah((Parcel)objectArray, n5);
                            continue block87;
                        }
                        case 4: {
                            object5 = (cji[])kl.ak((Parcel)objectArray, n5, cji.CREATOR);
                            continue block87;
                        }
                        case 3: {
                            object6 = kl.ab((Parcel)objectArray, n5);
                            continue block87;
                        }
                        case 2: 
                    }
                    object = kl.ab((Parcel)objectArray, n5);
                }
                kl.ae((Parcel)objectArray, n6);
                return new cjj((String)object, (String)object6, (cji[])object5, bl3, (byte[])object2, l3);
            }
            case 1: {
                n5 = kl.U((Parcel)objectArray);
                object2 = null;
                object5 = object6;
                n6 = n7;
                while (objectArray.dataPosition() < n5) {
                    n8 = objectArray.readInt();
                    n7 = kl.Q(n8);
                    if (n7 != 2) {
                        if (n7 != 3) {
                            if (n7 != 4) {
                                kl.ag((Parcel)objectArray, n8);
                                continue;
                            }
                            object2 = kl.al((Parcel)objectArray, n8);
                            continue;
                        }
                        object5 = (cjp[])kl.ak((Parcel)objectArray, n8, cjp.CREATOR);
                        continue;
                    }
                    n6 = kl.S((Parcel)objectArray, n8);
                }
                kl.ae((Parcel)objectArray, n5);
                return new cji(n6, (cjp[])object5, (String[])object2);
            }
            case 0: {
                n6 = kl.U((Parcel)objectArray);
                object7 = null;
                object4 = null;
                object5 = object4;
                object6 = object2 = object5;
                object = object6;
                block89: while (objectArray.dataPosition() < n6) {
                    n5 = objectArray.readInt();
                    switch (kl.Q(n5)) {
                        default: {
                            kl.ag((Parcel)objectArray, n5);
                            continue block89;
                        }
                        case 7: {
                            object = kl.W((Parcel)objectArray, n5);
                            continue block89;
                        }
                        case 6: {
                            object6 = kl.ab((Parcel)objectArray, n5);
                            continue block89;
                        }
                        case 5: {
                            object2 = kl.ab((Parcel)objectArray, n5);
                            continue block89;
                        }
                        case 4: {
                            object5 = kl.ab((Parcel)objectArray, n5);
                            continue block89;
                        }
                        case 3: {
                            object4 = kl.ab((Parcel)objectArray, n5);
                            continue block89;
                        }
                        case 2: 
                    }
                    object7 = kl.ab((Parcel)objectArray, n5);
                }
                kl.ae((Parcel)objectArray, n6);
                return new chn((String)object7, (String)object4, (String)object5, (String)object2, (String)object6, (Bundle)object);
            }
        }
        bl5 = n5 == 1;
        return new daz((gzx)object, (gzx)object2, (gzx)object5, (gzx)object6, bl3, bl5, objectArray.createByteArray());
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        switch (this.a) {
            default: {
                return new dcm[n2];
            }
            case 19: {
                return new dbx[n2];
            }
            case 18: {
                return new dbu[n2];
            }
            case 17: {
                return new cls[n2];
            }
            case 16: {
                return new clm[n2];
            }
            case 15: {
                return new clg[n2];
            }
            case 14: {
                return new clf[n2];
            }
            case 13: {
                return new cle[n2];
            }
            case 12: {
                return new cko[n2];
            }
            case 11: {
                return new ckn[n2];
            }
            case 10: {
                return new ckl[n2];
            }
            case 9: {
                return new cki[n2];
            }
            case 8: {
                return new cjs[n2];
            }
            case 7: {
                return new cjr[n2];
            }
            case 6: {
                return new cjq[n2];
            }
            case 5: {
                return new cjp[n2];
            }
            case 4: {
                return new cjn[n2];
            }
            case 3: {
                return new cjk[n2];
            }
            case 2: {
                return new cjj[n2];
            }
            case 1: {
                return new cji[n2];
            }
            case 0: 
        }
        return new chn[n2];
    }
}

