/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

public final class chx
extends cgk {
    public static final chy CREATOR = new chy(0);
    public final chz a;
    public final byte[] b;

    public chx(chz chz2, byte[] byArray) {
        this.a = Objects.requireNonNull(chz2);
        this.b = Objects.requireNonNull(byArray);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (chx)object;
            if (this.a.equals(((chx)object).a) && Arrays.equals(this.b, ((chx)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a) * 31 + Arrays.hashCode(this.b);
    }

    public final String toString() {
        Object object = this.b;
        String string = String.valueOf(this.a);
        String string2 = Arrays.toString((byte[])object);
        object = string2;
        if (string2.length() > 20) {
            object = String.valueOf(string2.substring(0, 17)).concat("...");
        }
        string2 = String.format((String)object, new Object[0]);
        object = new StringBuilder("ServiceDump{serviceDumpRequest=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", dumpOutput=\"");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("\"}");
        return ((StringBuilder)object).toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.J(parcel, 2, this.a, n2);
        kl.D(parcel, 3, this.b);
        kl.w(parcel, n3);
    }
}

