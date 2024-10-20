/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public final class cjj
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(2);
    public final String a;
    public final byte[] b;
    public final String c;
    public final cji[] d;
    public final Map e;
    public final boolean f;
    public final long g;

    /*
     * WARNING - void declaration
     */
    public cjj(String object2, String string, cji[] cjiArray, boolean bl2, byte[] byArray, long l2) {
        void var6_8;
        void var5_7;
        void var4_6;
        void var3_5;
        void var2_4;
        this.a = object2;
        this.c = var2_4;
        this.d = var3_5;
        this.f = var4_6;
        this.b = var5_7;
        this.g = var6_8;
        this.e = new TreeMap();
        for (void var1_3 : var3_5) {
            this.e.put(var1_3.a, var1_3);
        }
    }

    public final boolean equals(Object object) {
        if (object instanceof cjj) {
            object = (cjj)object;
            if (a.k(this.a, ((cjj)object).a) && a.k(this.c, ((cjj)object).c) && this.e.equals(((cjj)object).e) && this.f == ((cjj)object).f && Arrays.equals(this.b, ((cjj)object).b) && this.g == ((cjj)object).g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, this.f, this.b, this.g});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configurations('");
        stringBuilder.append(this.a);
        stringBuilder.append("', '");
        stringBuilder.append(this.c);
        stringBuilder.append("', (");
        Object object = this.e.values().iterator();
        while (object.hasNext()) {
            stringBuilder.append((cji)object.next());
            stringBuilder.append(", ");
        }
        stringBuilder.append("), ");
        stringBuilder.append(this.f);
        stringBuilder.append(", ");
        object = this.b;
        object = object == null ? "null" : Base64.encodeToString((byte[])object, (int)3);
        stringBuilder.append((String)object);
        stringBuilder.append(", ");
        stringBuilder.append(this.g);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.K(parcel, 2, this.a);
        kl.K(parcel, 3, this.c);
        kl.N(parcel, 4, this.d, n2);
        kl.x(parcel, 5, this.f);
        kl.D(parcel, 6, this.b);
        kl.B(parcel, 7, this.g);
        kl.w(parcel, n3);
    }
}

