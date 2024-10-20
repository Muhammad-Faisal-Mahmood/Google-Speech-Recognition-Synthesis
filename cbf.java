/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

public final class cbf
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(3);
    public final String a;
    public final int b;
    public int c;

    public cbf(String string, int n2, int n3) {
        this.a = string;
        this.b = n2;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cbf)) {
            return false;
        }
        object = (cbf)object;
        return Objects.equals(this.a, ((cbf)object).a) && this.b == ((cbf)object).b && this.c == ((cbf)object).c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogErrorParcelable[LogSourceName: ");
        stringBuilder.append(this.a);
        stringBuilder.append(", ClearcutStatusCode: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ErrorCount: ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.K(parcel, 1, this.a);
        kl.A(parcel, 2, this.b);
        kl.A(parcel, 3, this.c);
        kl.w(parcel, n2);
    }
}

