/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

public final class aa
implements Parcelable.Creator {
    private final int a;

    public aa(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Object createFromParcel(Parcel object) {
        switch (this.a) {
            default: {
                return new aqm((Parcel)object);
            }
            case 19: {
                return new aql((Parcel)object);
            }
            case 18: {
                return new aqk((Parcel)object);
            }
            case 17: {
                return new aqj((Parcel)object);
            }
            case 16: {
                return new aqi((Parcel)object);
            }
            case 15: {
                return new aqh((Parcel)object);
            }
            case 14: {
                return new aek((Parcel)object);
            }
            case 13: {
                return new adp((Parcel)object);
            }
            case 12: {
                return new adq((Parcel)object);
            }
            case 11: {
                return new ym((Parcel)object);
            }
            case 10: {
                jse.e(object, "inParcel");
                jse.e(object, "parcel");
                Parcelable parcelable = object.readParcelable(IntentSender.class.getClassLoader());
                jse.b(parcelable);
                return new nt((IntentSender)parcelable, (Intent)object.readParcelable(Intent.class.getClassLoader()), object.readInt(), object.readInt());
            }
            case 9: {
                jse.e(object, "parcel");
                jse.e(object, "parcel");
                int n2 = object.readInt();
                object = object.readInt() == 0 ? null : (Intent)Intent.CREATOR.createFromParcel(object);
                return new nk(n2, (Intent)object);
            }
            case 8: {
                return new lq((Parcel)object);
            }
            case 7: {
                return new lp((Parcel)object);
            }
            case 6: {
                return new jt((Parcel)object);
            }
            case 5: {
                return new hz((Parcel)object);
            }
            case 4: {
                return new cc((Parcel)object);
            }
            case 3: {
                return new bz((Parcel)object);
            }
            case 2: {
                return new bu((Parcel)object);
            }
            case 1: {
                return new z((Parcel)object);
            }
            case 0: 
        }
        return new ab((Parcel)object);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        switch (this.a) {
            default: {
                return new aqm[n2];
            }
            case 19: {
                return new aql[n2];
            }
            case 18: {
                return new aqk[n2];
            }
            case 17: {
                return new aqj[n2];
            }
            case 16: {
                return new aqi[n2];
            }
            case 15: {
                return new aqh[n2];
            }
            case 14: {
                return new aek[n2];
            }
            case 13: {
                return new adp[n2];
            }
            case 12: {
                return new adq[n2];
            }
            case 11: {
                return new ym[n2];
            }
            case 10: {
                return new nt[n2];
            }
            case 9: {
                return new nk[n2];
            }
            case 8: {
                return new lq[n2];
            }
            case 7: {
                return new lp[n2];
            }
            case 6: {
                return new jt[n2];
            }
            case 5: {
                return new hz[n2];
            }
            case 4: {
                return new cc[n2];
            }
            case 3: {
                return new bz[n2];
            }
            case 2: {
                return new bu[n2];
            }
            case 1: {
                return new z[n2];
            }
            case 0: 
        }
        return new ab[n2];
    }
}

