/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public final class cji
extends cgk
implements Comparable {
    public static final Parcelable.Creator CREATOR = new cho(1);
    public final int a;
    public final cjp[] b;
    public final String[] c;
    public final Map d;

    public cji(int n2, cjp[] cjpArray, String[] stringArray) {
        this.a = n2;
        this.b = cjpArray;
        this.d = new TreeMap();
        for (cjp cjp2 : cjpArray) {
            this.d.put(cjp2.a, cjp2);
        }
        this.c = stringArray;
        if (stringArray != null) {
            Arrays.sort(stringArray);
        }
    }

    public final boolean equals(Object object) {
        if (object instanceof cji) {
            object = (cji)object;
            if (this.a == ((cji)object).a && a.k(this.d, ((cji)object).d) && Arrays.equals(this.c, ((cji)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        stringBuilder.append(this.a);
        stringBuilder.append(", (");
        String[] stringArray = this.d.values().iterator();
        while (stringArray.hasNext()) {
            stringBuilder.append((cjp)stringArray.next());
            stringBuilder.append(", ");
        }
        stringBuilder.append("), (");
        stringArray = this.c;
        if (stringArray != null) {
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                stringBuilder.append(stringArray[i2]);
                stringBuilder.append(", ");
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append("))");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.A(parcel, 2, this.a);
        kl.N(parcel, 3, this.b, n2);
        kl.L(parcel, 4, this.c);
        kl.w(parcel, n3);
    }
}

