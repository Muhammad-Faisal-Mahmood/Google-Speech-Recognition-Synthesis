/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable$Creator
 */
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public final class aqo
implements Parcelable.Creator {
    private final int a;

    public aqo(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Object createFromParcel(Parcel objectArray) {
        Object object;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long l2;
        int n2 = this.a;
        int n3 = 0;
        Object object2 = null;
        Object object3 = null;
        switch (n2) {
            default: {
                n3 = kl.U((Parcel)objectArray);
                l2 = 0L;
                string7 = null;
                string = string6 = (string5 = (string4 = (string3 = (string2 = null))));
                object = object3 = (object2 = string);
                break;
            }
            case 19: {
                n2 = kl.U((Parcel)objectArray);
                object2 = null;
                while (objectArray.dataPosition() < n2) {
                    n3 = objectArray.readInt();
                    int n4 = kl.Q(n3);
                    if (n4 != 1) {
                        if (n4 != 2) {
                            kl.ag((Parcel)objectArray, n3);
                            continue;
                        }
                        object2 = (bpg)kl.Y((Parcel)objectArray, n3, bpg.CREATOR);
                        continue;
                    }
                    object3 = kl.ad((Parcel)objectArray, n3, bpi.CREATOR);
                }
                kl.ae((Parcel)objectArray, n2);
                return new bpk((List)object3, (bpg)object2);
            }
            case 18: {
                n2 = kl.U((Parcel)objectArray);
                n3 = 0;
                byte[] byArray = null;
                String string8 = null;
                object2 = object3 = string8;
                while (objectArray.dataPosition() < n2) {
                    int n5 = objectArray.readInt();
                    int n6 = kl.Q(n5);
                    if (n6 != 1) {
                        if (n6 != 2) {
                            if (n6 != 3) {
                                if (n6 != 4) {
                                    if (n6 != 5) {
                                        kl.ag((Parcel)objectArray, n5);
                                        continue;
                                    }
                                    object2 = kl.ab((Parcel)objectArray, n5);
                                    continue;
                                }
                                object3 = (ParcelFileDescriptor)kl.Y((Parcel)objectArray, n5, ParcelFileDescriptor.CREATOR);
                                continue;
                            }
                            n3 = kl.S((Parcel)objectArray, n5);
                            continue;
                        }
                        string8 = kl.ab((Parcel)objectArray, n5);
                        continue;
                    }
                    byArray = kl.ai((Parcel)objectArray, n5);
                }
                kl.ae((Parcel)objectArray, n2);
                return new bpj(byArray, string8, n3, (ParcelFileDescriptor)object3, (String)object2);
            }
            case 17: {
                n2 = kl.U((Parcel)objectArray);
                object3 = object2;
                while (objectArray.dataPosition() < n2) {
                    int n7 = objectArray.readInt();
                    int n8 = kl.Q(n7);
                    if (n8 != 1) {
                        if (n8 != 2) {
                            kl.ag((Parcel)objectArray, n7);
                            continue;
                        }
                        n3 = kl.S((Parcel)objectArray, n7);
                        continue;
                    }
                    object3 = kl.ab((Parcel)objectArray, n7);
                }
                kl.ae((Parcel)objectArray, n2);
                return new bpi((String)object3, n3);
            }
            case 16: {
                int n9;
                int n10 = kl.U((Parcel)objectArray);
                int n11 = 0;
                n2 = n3 = (n9 = 0);
                object2 = null;
                object3 = null;
                block46: while (objectArray.dataPosition() < n10) {
                    int n12 = objectArray.readInt();
                    switch (kl.Q(n12)) {
                        default: {
                            kl.ag((Parcel)objectArray, n12);
                            continue block46;
                        }
                        case 6: {
                            n2 = kl.S((Parcel)objectArray, n12);
                            continue block46;
                        }
                        case 5: {
                            n3 = kl.S((Parcel)objectArray, n12);
                            continue block46;
                        }
                        case 4: {
                            n9 = kl.S((Parcel)objectArray, n12);
                            continue block46;
                        }
                        case 3: {
                            n11 = kl.S((Parcel)objectArray, n12);
                            continue block46;
                        }
                        case 2: {
                            object3 = kl.ab((Parcel)objectArray, n12);
                            continue block46;
                        }
                        case 1: 
                    }
                    object2 = kl.ab((Parcel)objectArray, n12);
                }
                kl.ae((Parcel)objectArray, n10);
                return new boy((String)object2, (String)object3, n11, n9, n3, n2);
            }
            case 15: {
                return new ats((Parcel)objectArray);
            }
            case 14: {
                return new atq((Parcel)objectArray);
            }
            case 13: {
                return new atb((Parcel)objectArray);
            }
            case 12: {
                return new asm((Parcel)objectArray);
            }
            case 11: {
                return new asj((Parcel)objectArray);
            }
            case 10: {
                return new asg((Parcel)objectArray);
            }
            case 9: {
                return new asd((Parcel)objectArray);
            }
            case 8: {
                return new aqz((Parcel)objectArray);
            }
            case 7: {
                return new aqy((Parcel)objectArray);
            }
            case 6: {
                object2 = objectArray.readString();
                abr.i(object2);
                object3 = objectArray.readString();
                objectArray = objectArray.createStringArray();
                abr.i(objectArray);
                return new aqx((String)object2, (String)object3, gzx.p(objectArray));
            }
            case 5: {
                return new aqw((Parcel)objectArray);
            }
            case 4: {
                return new aqv((Parcel)objectArray);
            }
            case 3: {
                return new aqu((Parcel)objectArray);
            }
            case 2: {
                return new aqq((Parcel)objectArray);
            }
            case 1: {
                return new aqn((Parcel)objectArray);
            }
            case 0: {
                return new aqp((Parcel)objectArray);
            }
        }
        block47: while (objectArray.dataPosition() < n3) {
            n2 = objectArray.readInt();
            switch (kl.Q(n2)) {
                default: {
                    kl.ag((Parcel)objectArray, n2);
                    continue block47;
                }
                case 12: {
                    object = kl.ab((Parcel)objectArray, n2);
                    continue block47;
                }
                case 11: {
                    object3 = kl.ab((Parcel)objectArray, n2);
                    continue block47;
                }
                case 10: {
                    object2 = kl.ad((Parcel)objectArray, n2, Scope.CREATOR);
                    continue block47;
                }
                case 9: {
                    string = kl.ab((Parcel)objectArray, n2);
                    continue block47;
                }
                case 8: {
                    l2 = kl.V((Parcel)objectArray, n2);
                    continue block47;
                }
                case 7: {
                    string6 = kl.ab((Parcel)objectArray, n2);
                    continue block47;
                }
                case 6: {
                    string5 = (Uri)kl.Y((Parcel)objectArray, n2, Uri.CREATOR);
                    continue block47;
                }
                case 5: {
                    string4 = kl.ab((Parcel)objectArray, n2);
                    continue block47;
                }
                case 4: {
                    string3 = kl.ab((Parcel)objectArray, n2);
                    continue block47;
                }
                case 3: {
                    string2 = kl.ab((Parcel)objectArray, n2);
                    continue block47;
                }
                case 2: 
            }
            string7 = kl.ab((Parcel)objectArray, n2);
        }
        kl.ae((Parcel)objectArray, n3);
        return new GoogleSignInAccount(string7, string2, string3, string4, (Uri)string5, string6, l2, string, (List)object2, (String)object3, (String)object);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        switch (this.a) {
            default: {
                return new GoogleSignInAccount[n2];
            }
            case 19: {
                return new bpk[n2];
            }
            case 18: {
                return new bpj[n2];
            }
            case 17: {
                return new bpi[n2];
            }
            case 16: {
                return new boy[n2];
            }
            case 15: {
                return new ats[n2];
            }
            case 14: {
                return new atq[n2];
            }
            case 13: {
                return new atb[n2];
            }
            case 12: {
                return new asm[n2];
            }
            case 11: {
                return new asj[n2];
            }
            case 10: {
                return new asg[n2];
            }
            case 9: {
                return new asd[n2];
            }
            case 8: {
                return new aqz[n2];
            }
            case 7: {
                return new aqy[n2];
            }
            case 6: {
                return new aqx[n2];
            }
            case 5: {
                return new aqw[n2];
            }
            case 4: {
                return new aqv[n2];
            }
            case 3: {
                return new aqu[n2];
            }
            case 2: {
                return new aqq[n2];
            }
            case 1: {
                return new aqn[n2];
            }
            case 0: 
        }
        return new aqp[n2];
    }
}

