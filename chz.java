/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

public final class chz
extends cgk {
    public static final cia CREATOR = new cia();
    public final String a;
    public final String[] b;
    public final int c;
    public final boolean d;

    public chz(String string, String[] stringArray, int n2, boolean bl2) {
        this.a = Objects.requireNonNull(string);
        this.b = stringArray;
        if (n2 != 2 && n2 != 1) {
            throw new IllegalArgumentException(a.af(n2, "Unknown expected output format="));
        }
        this.c = n2;
        this.d = bl2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (chz)object;
            if (this.d == ((chz)object).d && this.c == ((chz)object).c && this.a.equals(((chz)object).a) && Arrays.equals(this.b, ((chz)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.d, this.c) * 31 + Arrays.hashCode(this.b);
    }

    public final String toString() {
        String string = Arrays.toString(this.b);
        StringBuilder stringBuilder = new StringBuilder("ServiceDumpRequest{service='");
        stringBuilder.append(this.a);
        stringBuilder.append("', dumpsysFlags=");
        stringBuilder.append(string);
        stringBuilder.append(", expectedOutputFormat=");
        stringBuilder.append(this.c);
        stringBuilder.append(", showOutputToUser=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.K(parcel, 2, this.a);
        kl.L(parcel, 3, this.b);
        kl.A(parcel, 4, this.c);
        kl.x(parcel, 5, this.d);
        kl.w(parcel, n2);
    }
}

