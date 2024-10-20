/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ApplicationErrorReport
 *  android.graphics.Bitmap
 *  android.graphics.RectF
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable$Creator
 */
import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import java.util.ArrayList;
import java.util.List;

public final class cgi
implements Parcelable.Creator {
    private final int a;

    public cgi(int n2) {
        this.a = n2;
    }

    public static final ErrorReport a(Parcel parcel) {
        int n2;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        boolean bl14;
        boolean bl15;
        boolean bl16;
        boolean bl17;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        Object object12;
        Object object13;
        chv[] chvArray;
        chv[] chvArray2;
        chv[] chvArray3;
        Object object14;
        Object object15;
        Object[] objectArray;
        Object object16;
        Object object17;
        Object object18;
        chv[] chvArray4;
        Object object19;
        Object object20;
        Object object21;
        Object object22;
        Object object23;
        Object object24;
        Object object25;
        Object object26;
        Object object27;
        Object object28;
        Object object29;
        chv[] chvArray5;
        chv[] chvArray6;
        Object object30;
        Object object31;
        Object object32;
        Object object33;
        chv[] chvArray7;
        Object object34;
        chv[] chvArray8;
        Object object35;
        Object object36;
        chv[] chvArray9;
        chv[] chvArray10;
        chv[] chvArray11;
        chv[] chvArray12;
        int n22 = kl.U(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        Object object37 = chvArray12 = (chvArray11 = (chvArray10 = (chvArray9 = (object36 = (object35 = (chvArray8 = (object34 = (chvArray7 = (object33 = (object32 = (object31 = (object30 = (chvArray6 = (chvArray5 = (object29 = (object28 = (object27 = (object26 = (object25 = (object24 = (object23 = (object22 = (object21 = (object20 = (object19 = (chvArray4 = (object18 = (object17 = (object16 = (objectArray = (object15 = (object14 = (chvArray3 = (chvArray2 = (chvArray = (object13 = (object12 = (object11 = (object10 = (object9 = (object8 = (object7 = (object6 = (object5 = (object4 = (object3 = (object2 = (object = null))))))))))))))))))))))))))))))))))))))))))))))));
        Object[] objectArray2 = object37;
        int n3 = 0;
        boolean bl18 = bl17 = (bl16 = (bl15 = (bl14 = (bl13 = (bl12 = (bl11 = (bl10 = (bl9 = (bl8 = (bl7 = (bl6 = (bl5 = (bl4 = (bl3 = (bl2 = false)))))))))))))));
        block72: while (parcel.dataPosition() < n22) {
            int n4 = kl.R(parcel);
            switch (kl.Q(n4)) {
                default: {
                    kl.ag(parcel, n4);
                    continue block72;
                }
                case 71: {
                    objectArray2 = (chx[])kl.ak(parcel, n4, chx.CREATOR);
                    continue block72;
                }
                case 70: {
                    object37 = (chn)kl.Y(parcel, n4, chn.CREATOR);
                    continue block72;
                }
                case 69: {
                    chvArray12 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 68: {
                    bl18 = kl.ah(parcel, n4);
                    continue block72;
                }
                case 67: {
                    bl17 = kl.ah(parcel, n4);
                    continue block72;
                }
                case 66: {
                    chvArray11 = kl.al(parcel, n4);
                    continue block72;
                }
                case 65: {
                    chvArray10 = kl.al(parcel, n4);
                    continue block72;
                }
                case 64: {
                    chvArray9 = kl.al(parcel, n4);
                    continue block72;
                }
                case 63: {
                    n2 = kl.S(parcel, n4);
                    continue block72;
                }
                case 62: {
                    bl15 = kl.S(parcel, n4);
                    continue block72;
                }
                case 61: {
                    object36 = kl.ac(parcel, n4);
                    continue block72;
                }
                case 60: {
                    object35 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 59: {
                    chvArray8 = (chv[])kl.Y(parcel, n4, Bitmap.CREATOR);
                    continue block72;
                }
                case 58: {
                    bl14 = kl.ah(parcel, n4);
                    continue block72;
                }
                case 57: {
                    object34 = kl.ad(parcel, n4, RectF.CREATOR);
                    continue block72;
                }
                case 56: {
                    chvArray7 = kl.W(parcel, n4);
                    continue block72;
                }
                case 55: {
                    bl13 = kl.ah(parcel, n4);
                    continue block72;
                }
                case 54: {
                    object33 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 53: {
                    object32 = (chw)kl.Y(parcel, n4, chw.CREATOR);
                    continue block72;
                }
                case 52: {
                    object31 = (cib)kl.Y(parcel, n4, cib.CREATOR);
                    continue block72;
                }
                case 51: {
                    object30 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 50: {
                    bl12 = kl.ah(parcel, n4);
                    continue block72;
                }
                case 49: {
                    chvArray6 = kl.al(parcel, n4);
                    continue block72;
                }
                case 48: {
                    chvArray5 = (chv[])kl.ak(parcel, n4, chv.CREATOR);
                    continue block72;
                }
                case 47: {
                    object29 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 46: {
                    object28 = (BitmapTeleporter)kl.Y(parcel, n4, BitmapTeleporter.CREATOR);
                    continue block72;
                }
                case 45: {
                    object27 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 44: {
                    object26 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 43: {
                    object25 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 42: {
                    object24 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 41: {
                    object23 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 40: {
                    object22 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 39: {
                    object21 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 38: {
                    bl11 = kl.S(parcel, n4);
                    continue block72;
                }
                case 37: {
                    object20 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 36: {
                    object19 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 35: {
                    bl10 = kl.ah(parcel, n4);
                    continue block72;
                }
                case 34: {
                    bl9 = kl.S(parcel, n4);
                    continue block72;
                }
                case 33: {
                    bl8 = kl.S(parcel, n4);
                    continue block72;
                }
                case 32: {
                    bl7 = kl.ah(parcel, n4);
                    continue block72;
                }
                case 31: {
                    chvArray4 = kl.W(parcel, n4);
                    continue block72;
                }
                case 30: {
                    object18 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 29: {
                    object17 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 28: {
                    object16 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 27: {
                    bl6 = kl.S(parcel, n4);
                    continue block72;
                }
                case 26: {
                    bl5 = kl.S(parcel, n4);
                    continue block72;
                }
                case 25: {
                    bl4 = kl.S(parcel, n4);
                    continue block72;
                }
                case 24: {
                    bl3 = kl.S(parcel, n4);
                    continue block72;
                }
                case 23: {
                    objectArray = kl.ai(parcel, n4);
                    continue block72;
                }
                case 22: {
                    object15 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 21: {
                    object14 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 20: {
                    chvArray3 = kl.al(parcel, n4);
                    continue block72;
                }
                case 19: {
                    chvArray2 = kl.al(parcel, n4);
                    continue block72;
                }
                case 18: {
                    chvArray = kl.al(parcel, n4);
                    continue block72;
                }
                case 17: {
                    object13 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 16: {
                    object12 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 15: {
                    object11 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 14: {
                    object10 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 13: {
                    object9 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 12: {
                    bl2 = kl.S(parcel, n4);
                    continue block72;
                }
                case 11: {
                    object8 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 10: {
                    object7 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 9: {
                    object6 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 8: {
                    object5 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 7: {
                    object4 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 6: {
                    object3 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 5: {
                    object2 = kl.ab(parcel, n4);
                    continue block72;
                }
                case 4: {
                    n3 = kl.S(parcel, n4);
                    continue block72;
                }
                case 3: {
                    object = kl.ab(parcel, n4);
                    continue block72;
                }
                case 2: 
            }
            applicationErrorReport = (ApplicationErrorReport)kl.Y(parcel, n4, ApplicationErrorReport.CREATOR);
        }
        kl.ae(parcel, n22);
        return new ErrorReport(applicationErrorReport, (String)object, n3, (String)object2, (String)object3, (String)object4, (String)object5, (String)object6, (String)object7, (String)object8, bl2 ? 1 : 0, (String)object9, (String)object10, (String)object11, (String)object12, (String)object13, (String[])chvArray, (String[])chvArray2, (String[])chvArray3, (String)object14, (String)object15, (byte[])objectArray, bl3 ? 1 : 0, bl4 ? 1 : 0, bl5 ? 1 : 0, bl6 ? 1 : 0, (String)object16, (String)object17, (String)object18, (Bundle)chvArray4, bl7, bl8 ? 1 : 0, bl9 ? 1 : 0, bl10, (String)object19, (String)object20, bl11 ? 1 : 0, (String)object21, (String)object22, (String)object23, (String)object24, (String)object25, (String)object26, (String)object27, (BitmapTeleporter)object28, (String)object29, chvArray5, (String[])chvArray6, bl12, (String)object30, (cib)object31, (chw)object32, (String)object33, bl13, (Bundle)chvArray7, (List)object34, bl14, (Bitmap)chvArray8, (String)object35, (List)object36, bl15 ? 1 : 0, n2, (String[])chvArray9, (String[])chvArray10, (String[])chvArray11, bl17, bl18, (String)chvArray12, (chn)object37, (chx[])objectArray2);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2;
        int n3 = this.a;
        long l2 = 0L;
        Integer n4 = null;
        Number number = null;
        Number number2 = null;
        String[] stringArray = null;
        Object object = null;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        Integer n5 = null;
        switch (n3) {
            default: {
                n2 = kl.U(parcel);
                object2 = null;
                stringArray = null;
                break;
            }
            case 19: {
                n3 = kl.U(parcel);
                object2 = n5;
                while (parcel.dataPosition() < n3) {
                    int n6 = parcel.readInt();
                    if (kl.Q(n6) != 2) {
                        kl.ag(parcel, n6);
                        continue;
                    }
                    object2 = kl.ad(parcel, n6, cjf.CREATOR);
                }
                kl.ae(parcel, n3);
                return new FetchBackUpDeviceContactInfoResponseEntity((List)object2);
            }
            case 18: {
                n3 = kl.U(parcel);
                object2 = n4;
                while (parcel.dataPosition() < n3) {
                    int n7 = parcel.readInt();
                    if (kl.Q(n7) != 2) {
                        kl.ag(parcel, n7);
                        continue;
                    }
                    object2 = kl.Z(parcel, n7);
                }
                kl.ae(parcel, n3);
                return new cjg((Integer)object2);
            }
            case 17: {
                int n8 = kl.U(parcel);
                object3 = null;
                number2 = null;
                object2 = number2;
                stringArray = object2;
                object4 = stringArray;
                number = object4;
                object = number;
                block61: while (parcel.dataPosition() < n8) {
                    n3 = parcel.readInt();
                    switch (kl.Q(n3)) {
                        default: {
                            kl.ag(parcel, n3);
                            continue block61;
                        }
                        case 8: {
                            object = (cjg)kl.Y(parcel, n3, cjg.CREATOR);
                            continue block61;
                        }
                        case 7: {
                            number2 = kl.aa(parcel, n3);
                            continue block61;
                        }
                        case 6: {
                            number = kl.aa(parcel, n3);
                            continue block61;
                        }
                        case 5: {
                            object4 = kl.aa(parcel, n3);
                            continue block61;
                        }
                        case 4: {
                            stringArray = kl.ab(parcel, n3);
                            continue block61;
                        }
                        case 3: {
                            object2 = kl.ad(parcel, n3, cjh.CREATOR);
                            continue block61;
                        }
                        case 2: 
                    }
                    object3 = kl.ab(parcel, n3);
                }
                kl.ae(parcel, n8);
                return new cjf((String)object3, (Long)number2, (List)object2, (String)stringArray, (Long)object4, (Long)number, (cjg)object);
            }
            case 16: {
                int n9 = kl.U(parcel);
                stringArray = null;
                object2 = null;
                while (parcel.dataPosition() < n9) {
                    n3 = parcel.readInt();
                    int n10 = kl.Q(n3);
                    if (n10 != 1) {
                        if (n10 != 2) {
                            if (n10 != 3) {
                                kl.ag(parcel, n3);
                                continue;
                            }
                            l2 = kl.V(parcel, n3);
                            continue;
                        }
                        int n11 = kl.T(parcel, n3);
                        n10 = parcel.dataPosition();
                        if (n11 == 0) {
                            object2 = null;
                            continue;
                        }
                        object2 = new ArrayList();
                        int n12 = parcel.readInt();
                        for (n3 = 0; n3 < n12; ++n3) {
                            ((ArrayList)object2).add(parcel.readLong());
                        }
                        parcel.setDataPosition(n10 + n11);
                        continue;
                    }
                    stringArray = kl.ab(parcel, n3);
                }
                kl.ae(parcel, n9);
                return new cje((String)stringArray, (List)object2, l2);
            }
            case 15: {
                int n13 = kl.U(parcel);
                stringArray = null;
                n3 = 0;
                object2 = number;
                while (parcel.dataPosition() < n13) {
                    int n14 = parcel.readInt();
                    int n15 = kl.Q(n14);
                    if (n15 != 1) {
                        if (n15 != 2) {
                            if (n15 != 3) {
                                kl.ag(parcel, n14);
                                continue;
                            }
                            stringArray = (cjc)kl.Y(parcel, n14, cjc.CREATOR);
                            continue;
                        }
                        object2 = (cje)kl.Y(parcel, n14, cje.CREATOR);
                        continue;
                    }
                    n3 = kl.S(parcel, n14);
                }
                kl.ae(parcel, n13);
                return new cjd(n3, (cje)object2, (cjc)stringArray);
            }
            case 14: {
                int n16 = kl.U(parcel);
                l2 = 0L;
                object4 = null;
                stringArray = null;
                object2 = stringArray;
                int n17 = 0;
                int n18 = 0;
                n3 = 0;
                block65: while (parcel.dataPosition() < n16) {
                    int n19 = parcel.readInt();
                    switch (kl.Q(n19)) {
                        default: {
                            kl.ag(parcel, n19);
                            continue block65;
                        }
                        case 7: {
                            l2 = kl.V(parcel, n19);
                            continue block65;
                        }
                        case 6: {
                            n3 = kl.S(parcel, n19);
                            continue block65;
                        }
                        case 5: {
                            object2 = kl.ab(parcel, n19);
                            continue block65;
                        }
                        case 4: {
                            stringArray = kl.ab(parcel, n19);
                            continue block65;
                        }
                        case 3: {
                            n18 = kl.S(parcel, n19);
                            continue block65;
                        }
                        case 2: {
                            n17 = kl.S(parcel, n19);
                            continue block65;
                        }
                        case 1: 
                    }
                    object4 = kl.ab(parcel, n19);
                }
                kl.ae(parcel, n16);
                return new cjc((String)object4, n17, n18, (String)stringArray, (String)object2, n3, l2);
            }
            case 13: {
                n3 = kl.U(parcel);
                while (parcel.dataPosition() < n3) {
                    kl.ag(parcel, parcel.readInt());
                }
                kl.ae(parcel, n3);
                return new cjb();
            }
            case 12: {
                int n20 = kl.U(parcel);
                stringArray = null;
                n3 = 0;
                object2 = number2;
                while (parcel.dataPosition() < n20) {
                    int n21 = parcel.readInt();
                    int n22 = kl.Q(n21);
                    if (n22 != 1) {
                        if (n22 != 2) {
                            if (n22 != 3) {
                                kl.ag(parcel, n21);
                                continue;
                            }
                            stringArray = (ciy)kl.Y(parcel, n21, ciy.CREATOR);
                            continue;
                        }
                        object2 = kl.ab(parcel, n21);
                        continue;
                    }
                    n3 = kl.S(parcel, n21);
                }
                kl.ae(parcel, n20);
                return new cja(n3, (String)object2, (ciy)stringArray);
            }
            case 11: {
                int n23 = kl.U(parcel);
                l2 = 0L;
                object2 = null;
                int n24 = 0;
                int n25 = 0;
                int n26 = 0;
                int n27 = 0;
                int n28 = 0;
                int n29 = 0;
                n3 = 0;
                block68: while (parcel.dataPosition() < n23) {
                    int n30 = parcel.readInt();
                    switch (kl.Q(n30)) {
                        default: {
                            kl.ag(parcel, n30);
                            continue block68;
                        }
                        case 10: {
                            n3 = kl.S(parcel, n30);
                            continue block68;
                        }
                        case 9: {
                            n29 = kl.S(parcel, n30);
                            continue block68;
                        }
                        case 8: {
                            n28 = kl.S(parcel, n30);
                            continue block68;
                        }
                        case 7: {
                            n27 = kl.S(parcel, n30);
                            continue block68;
                        }
                        case 6: {
                            n26 = kl.S(parcel, n30);
                            continue block68;
                        }
                        case 5: {
                            n25 = kl.S(parcel, n30);
                            continue block68;
                        }
                        case 4: {
                            l2 = kl.V(parcel, n30);
                            continue block68;
                        }
                        case 3: {
                            object2 = kl.ab(parcel, n30);
                            continue block68;
                        }
                        case 2: 
                    }
                    n24 = kl.S(parcel, n30);
                }
                kl.ae(parcel, n23);
                return new ciz(n24, (String)object2, l2, n25, n26, n27, n28, n29, n3);
            }
            case 10: {
                int n31 = kl.U(parcel);
                n3 = 0;
                while (parcel.dataPosition() < n31) {
                    int n32 = parcel.readInt();
                    if (kl.Q(n32) != 1) {
                        kl.ag(parcel, n32);
                        continue;
                    }
                    n3 = kl.S(parcel, n32);
                }
                kl.ae(parcel, n31);
                return new DeviceContactsSyncSetting(n3);
            }
            case 9: {
                int n33 = kl.U(parcel);
                int n34 = 0;
                n3 = 0;
                while (parcel.dataPosition() < n33) {
                    int n35 = parcel.readInt();
                    int n36 = kl.Q(n35);
                    if (n36 != 1) {
                        if (n36 != 2) {
                            kl.ag(parcel, n35);
                            continue;
                        }
                        n34 = kl.S(parcel, n35);
                        continue;
                    }
                    n3 = kl.S(parcel, n35);
                }
                kl.ae(parcel, n33);
                return new ciy(n3, n34);
            }
            case 8: {
                int n37 = kl.U(parcel);
                int n38 = 0;
                n3 = 0;
                while (parcel.dataPosition() < n37) {
                    int n39 = parcel.readInt();
                    int n40 = kl.Q(n39);
                    if (n40 != 2) {
                        if (n40 != 3) {
                            kl.ag(parcel, n39);
                            continue;
                        }
                        n38 = kl.S(parcel, n39);
                        continue;
                    }
                    n3 = kl.S(parcel, n39);
                }
                kl.ae(parcel, n37);
                return new cix(n3, n38);
            }
            case 7: {
                int n41 = kl.U(parcel);
                object4 = null;
                number = null;
                n3 = 0;
                object2 = stringArray;
                stringArray = number;
                while (parcel.dataPosition() < n41) {
                    int n42 = parcel.readInt();
                    int n43 = kl.Q(n42);
                    if (n43 != 1) {
                        if (n43 != 2) {
                            if (n43 != 4) {
                                if (n43 != 5) {
                                    kl.ag(parcel, n42);
                                    continue;
                                }
                                stringArray = kl.al(parcel, n42);
                                continue;
                            }
                            n3 = kl.S(parcel, n42);
                            continue;
                        }
                        object4 = kl.aj(parcel, n42);
                        continue;
                    }
                    object2 = kl.ab(parcel, n42);
                }
                kl.ae(parcel, n41);
                return new ciw((String)object2, (int[])object4, n3, stringArray);
            }
            case 6: {
                int n44 = kl.U(parcel);
                stringArray = null;
                int n45 = 0;
                n3 = 0;
                object2 = object;
                while (parcel.dataPosition() < n44) {
                    int n46 = parcel.readInt();
                    int n47 = kl.Q(n46);
                    if (n47 != 1) {
                        if (n47 != 2) {
                            if (n47 != 3) {
                                if (n47 != 4) {
                                    kl.ag(parcel, n46);
                                    continue;
                                }
                                n45 = kl.S(parcel, n46);
                                continue;
                            }
                            n3 = kl.S(parcel, n46);
                            continue;
                        }
                        stringArray = kl.ab(parcel, n46);
                        continue;
                    }
                    object2 = kl.ab(parcel, n46);
                }
                kl.ae(parcel, n44);
                return new cil((String)object2, (String)stringArray, n3, n45);
            }
            case 5: {
                int n48 = kl.U(parcel);
                int n49 = 0;
                n3 = 0;
                while (parcel.dataPosition() < n48) {
                    int n50 = parcel.readInt();
                    int n51 = kl.Q(n50);
                    if (n51 != 2) {
                        if (n51 != 3) {
                            kl.ag(parcel, n50);
                            continue;
                        }
                        n49 = kl.S(parcel, n50);
                        continue;
                    }
                    n3 = kl.S(parcel, n50);
                }
                kl.ae(parcel, n48);
                return new cib(n3, n49);
            }
            case 4: {
                n3 = kl.U(parcel);
                stringArray = null;
                object2 = null;
                boolean bl2 = false;
                boolean bl3 = false;
                boolean bl4 = false;
                boolean bl5 = false;
                block75: while (parcel.dataPosition() < n3) {
                    int n52 = parcel.readInt();
                    switch (kl.Q(n52)) {
                        default: {
                            kl.ag(parcel, n52);
                            continue block75;
                        }
                        case 7: {
                            object2 = (chz[])kl.ak(parcel, n52, chz.CREATOR);
                            continue block75;
                        }
                        case 6: {
                            bl5 = kl.ah(parcel, n52);
                            continue block75;
                        }
                        case 5: {
                            bl4 = kl.ah(parcel, n52);
                            continue block75;
                        }
                        case 4: {
                            bl3 = kl.ah(parcel, n52);
                            continue block75;
                        }
                        case 3: {
                            bl2 = kl.ah(parcel, n52);
                            continue block75;
                        }
                        case 2: 
                    }
                    stringArray = kl.ab(parcel, n52);
                }
                kl.ae(parcel, n3);
                return new chw((String)stringArray, bl2, bl3, bl4, bl5, (chz[])object2);
            }
            case 3: {
                int n53 = kl.U(parcel);
                object4 = null;
                stringArray = null;
                while (parcel.dataPosition() < n53) {
                    int n54 = parcel.readInt();
                    n3 = kl.Q(n54);
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) {
                                kl.ag(parcel, n54);
                                continue;
                            }
                            stringArray = kl.ab(parcel, n54);
                            continue;
                        }
                        object4 = kl.ab(parcel, n54);
                        continue;
                    }
                    object2 = (ParcelFileDescriptor)kl.Y(parcel, n54, ParcelFileDescriptor.CREATOR);
                }
                kl.ae(parcel, n53);
                return new chv((ParcelFileDescriptor)object2, (String)object4, (String)stringArray);
            }
            case 2: {
                return cgi.a(parcel);
            }
            case 1: {
                int n55 = kl.U(parcel);
                int n56 = 0;
                boolean bl6 = false;
                boolean bl7 = false;
                int n57 = 0;
                n3 = 0;
                while (parcel.dataPosition() < n55) {
                    int n58 = parcel.readInt();
                    int n59 = kl.Q(n58);
                    if (n59 != 1) {
                        if (n59 != 2) {
                            if (n59 != 3) {
                                if (n59 != 4) {
                                    if (n59 != 5) {
                                        kl.ag(parcel, n58);
                                        continue;
                                    }
                                    n3 = kl.S(parcel, n58);
                                    continue;
                                }
                                n57 = kl.S(parcel, n58);
                                continue;
                            }
                            bl7 = kl.ah(parcel, n58);
                            continue;
                        }
                        bl6 = kl.ah(parcel, n58);
                        continue;
                    }
                    n56 = kl.S(parcel, n58);
                }
                kl.ae(parcel, n55);
                return new cgg(n56, bl6, bl7, n57, n3);
            }
            case 0: {
                int n60 = kl.U(parcel);
                n3 = 0;
                object2 = object3;
                while (parcel.dataPosition() < n60) {
                    int n61 = parcel.readInt();
                    int n62 = kl.Q(n61);
                    if (n62 != 1) {
                        if (n62 != 2) {
                            kl.ag(parcel, n61);
                            continue;
                        }
                        object2 = kl.ad(parcel, n61, cga.CREATOR);
                        continue;
                    }
                    n3 = kl.S(parcel, n61);
                }
                kl.ae(parcel, n60);
                return new cgh(n3, (List)object2);
            }
        }
        while (parcel.dataPosition() < n2) {
            n3 = parcel.readInt();
            int n63 = kl.Q(n3);
            if (n63 != 2) {
                if (n63 != 3) {
                    if (n63 != 4) {
                        kl.ag(parcel, n3);
                        continue;
                    }
                    stringArray = kl.Z(parcel, n3);
                    continue;
                }
                object2 = kl.Z(parcel, n3);
                continue;
            }
            object4 = kl.ab(parcel, n3);
        }
        kl.ae(parcel, n2);
        return new cjh((String)object4, (Integer)object2, (Integer)stringArray);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        switch (this.a) {
            default: {
                return new cjh[n2];
            }
            case 19: {
                return new FetchBackUpDeviceContactInfoResponseEntity[n2];
            }
            case 18: {
                return new cjg[n2];
            }
            case 17: {
                return new cjf[n2];
            }
            case 16: {
                return new cje[n2];
            }
            case 15: {
                return new cjd[n2];
            }
            case 14: {
                return new cjc[n2];
            }
            case 13: {
                return new cjb[n2];
            }
            case 12: {
                return new cja[n2];
            }
            case 11: {
                return new ciz[n2];
            }
            case 10: {
                return new DeviceContactsSyncSetting[n2];
            }
            case 9: {
                return new ciy[n2];
            }
            case 8: {
                return new cix[n2];
            }
            case 7: {
                return new ciw[n2];
            }
            case 6: {
                return new cil[n2];
            }
            case 5: {
                return new cib[n2];
            }
            case 4: {
                return new chw[n2];
            }
            case 3: {
                return new chv[n2];
            }
            case 2: {
                return new ErrorReport[n2];
            }
            case 1: {
                return new cgg[n2];
            }
            case 0: 
        }
        return new cgh[n2];
    }
}

