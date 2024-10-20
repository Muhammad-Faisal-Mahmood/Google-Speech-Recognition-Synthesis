/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public class aqi
implements aej {
    public static final Parcelable.Creator CREATOR = new aa(16);
    public final String a;
    public final String b;

    public aqi(Parcel parcel) {
        String string = parcel.readString();
        int n2 = agf.a;
        this.a = string;
        this.b = parcel.readString();
    }

    public aqi(String string, String string2) {
        this.a = fxf.U(string);
        this.b = string2;
    }

    @Override
    public final void a(aeh aeh2) {
        int n2;
        block12: {
            String string = this.a;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1939198791: {
                    if (!string.equals("ARTIST")) break;
                    n2 = 1;
                    break block12;
                }
                case 1746739798: {
                    if (!string.equals("ALBUMARTIST")) break;
                    n2 = 3;
                    break block12;
                }
                case 428414940: {
                    if (!string.equals("DESCRIPTION")) break;
                    n2 = 4;
                    break block12;
                }
                case 79833656: {
                    if (!string.equals("TITLE")) break;
                    n2 = 0;
                    break block12;
                }
                case 62359119: {
                    if (!string.equals("ALBUM")) break;
                    n2 = 2;
                    break block12;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return;
                        }
                        aeh2.e = this.b;
                        return;
                    }
                    aeh2.d = this.b;
                    return;
                }
                aeh2.c = this.b;
                return;
            }
            aeh2.b = this.b;
            return;
        }
        aeh2.a = this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqi)object;
            if (this.a.equals(((aqi)object).a) && this.b.equals(((aqi)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() + 527) * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VC: ");
        stringBuilder.append(this.a);
        stringBuilder.append("=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}

