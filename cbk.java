/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class cbk
extends cgk {
    public static final Parcelable.Creator CREATOR;
    public static final cbk a;
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;

    static {
        a = new cbk(0);
        CREATOR = new caw(6);
    }

    public cbk(int n2) {
        this(n2, null, null);
    }

    public cbk(int n2, int n3, PendingIntent pendingIntent, String string) {
        this.b = n2;
        this.c = n3;
        this.d = pendingIntent;
        this.e = string;
    }

    public cbk(int n2, PendingIntent pendingIntent) {
        this(n2, pendingIntent, null);
    }

    public cbk(int n2, PendingIntent pendingIntent, String string) {
        this(1, n2, pendingIntent, string);
    }

    public final boolean a() {
        return this.c != 0 && this.d != null;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cbk)) {
            return false;
        }
        object = (cbk)object;
        return this.c == ((cbk)object).c && a.k(this.d, ((cbk)object).d) && a.k(this.e, ((cbk)object).e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e});
    }

    public final String toString() {
        String string;
        ArrayList arrayList = new ArrayList();
        int n2 = this.c;
        if (n2 != 99) {
            if (n2 != 1500) {
                block0 : switch (n2) {
                    default: {
                        switch (n2) {
                            default: {
                                string = a.ah(n2, "UNKNOWN_ERROR_CODE(", ")");
                                break block0;
                            }
                            case 25: {
                                string = "API_INSTALL_REQUIRED";
                                break block0;
                            }
                            case 24: {
                                string = "API_DISABLED_FOR_CONNECTION";
                                break block0;
                            }
                            case 23: {
                                string = "API_DISABLED";
                                break block0;
                            }
                            case 22: {
                                string = "RESOLUTION_ACTIVITY_NOT_FOUND";
                                break block0;
                            }
                            case 21: {
                                string = "API_VERSION_UPDATE_REQUIRED";
                                break block0;
                            }
                            case 20: {
                                string = "RESTRICTED_PROFILE";
                                break block0;
                            }
                            case 19: {
                                string = "SERVICE_MISSING_PERMISSION";
                                break block0;
                            }
                            case 18: {
                                string = "SERVICE_UPDATING";
                                break block0;
                            }
                            case 17: {
                                string = "SIGN_IN_FAILED";
                                break block0;
                            }
                            case 16: {
                                string = "API_UNAVAILABLE";
                                break block0;
                            }
                            case 15: {
                                string = "INTERRUPTED";
                                break block0;
                            }
                            case 14: {
                                string = "TIMEOUT";
                                break block0;
                            }
                            case 13: 
                        }
                        string = "CANCELED";
                        break;
                    }
                    case 11: {
                        string = "LICENSE_CHECK_FAILED";
                        break;
                    }
                    case 10: {
                        string = "DEVELOPER_ERROR";
                        break;
                    }
                    case 9: {
                        string = "SERVICE_INVALID";
                        break;
                    }
                    case 8: {
                        string = "INTERNAL_ERROR";
                        break;
                    }
                    case 7: {
                        string = "NETWORK_ERROR";
                        break;
                    }
                    case 6: {
                        string = "RESOLUTION_REQUIRED";
                        break;
                    }
                    case 5: {
                        string = "INVALID_ACCOUNT";
                        break;
                    }
                    case 4: {
                        string = "SIGN_IN_REQUIRED";
                        break;
                    }
                    case 3: {
                        string = "SERVICE_DISABLED";
                        break;
                    }
                    case 2: {
                        string = "SERVICE_VERSION_UPDATE_REQUIRED";
                        break;
                    }
                    case 1: {
                        string = "SERVICE_MISSING";
                        break;
                    }
                    case 0: {
                        string = "SUCCESS";
                        break;
                    }
                    case -1: {
                        string = "UNKNOWN";
                        break;
                    }
                }
            } else {
                string = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
        } else {
            string = "UNFINISHED";
        }
        kl.aw("statusCode", string, arrayList);
        kl.aw("resolution", this.d, arrayList);
        kl.aw("message", this.e, arrayList);
        return kl.av(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, this.b);
        kl.A(parcel, 2, this.c);
        kl.J(parcel, 3, (Parcelable)this.d, n2);
        kl.K(parcel, 4, this.e);
        kl.w(parcel, n3);
    }
}

