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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class cjn
extends cgk {
    public static final Parcelable.Creator CREATOR;
    public static final byte[][] a;
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;
    public final byte[][] k;

    static {
        a = new byte[0][];
        CREATOR = new cho(4);
    }

    public cjn(String string, byte[] byArray, byte[][] byArray2, byte[][] byArray3, byte[][] byArray4, byte[][] byArray5, int[] nArray, byte[][] byArray6, int[] nArray2, byte[][] byArray7) {
        this.b = string;
        this.c = byArray;
        this.d = byArray2;
        this.e = byArray3;
        this.f = byArray4;
        this.g = byArray5;
        this.h = nArray;
        this.i = byArray6;
        this.j = nArray2;
        this.k = byArray7;
    }

    public static byte[][] a(List object, cjm cjm2) {
        Object object2;
        Object object3 = object.iterator();
        int n2 = 0;
        while (object3.hasNext()) {
            object2 = (cjn)object3.next();
            if (object2 == null || (object2 = (Object)cjm2.a((cjn)object2)) == null) continue;
            n2 += ((Object)object2).length;
        }
        object3 = new byte[n2][];
        object = object.iterator();
        int n3 = 0;
        block1: while (object.hasNext()) {
            object2 = (cjn)object.next();
            if (object2 == null || (object2 = (Object)cjm2.a((cjn)object2)) == null) continue;
            int n4 = 0;
            n2 = n3;
            while (true) {
                n3 = n2;
                if (n4 >= ((Object)object2).length) continue block1;
                Object object4 = object2[n4];
                n3 = n2;
                if (object4 != null) {
                    object3[n2] = object4;
                    n3 = n2 + 1;
                }
                ++n4;
                n2 = n3;
            }
        }
        return object3;
    }

    private static List b(int[] nArray) {
        if (nArray == null) {
            return Collections.emptyList();
        }
        ArrayList<cjs> arrayList = new ArrayList<cjs>(nArray.length >> 1);
        for (int i2 = 0; i2 < nArray.length; i2 += 2) {
            arrayList.add(new cjs(nArray[i2], nArray[i2 + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList<byte[][]> arrayList = new ArrayList<byte[][]>();
        Object object = this.i;
        if (object != null) {
            Collections.addAll(arrayList, object);
        }
        if ((object = (Object)this.c) != null) {
            arrayList.add((byte[][])object);
        }
        return cjn.e((byte[][])arrayList.toArray((T[])new byte[0][]));
    }

    private static Set d(int[] nArray) {
        int n2;
        if (nArray != null && (n2 = nArray.length) != 0) {
            HashSet hashSet = hhk.q(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                hashSet.add(nArray[i2]);
            }
            return hashSet;
        }
        return Collections.emptySet();
    }

    private static Set e(byte[][] byArray) {
        int n2;
        if (byArray != null && (n2 = byArray.length) != 0) {
            HashSet hashSet = hhk.q(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                byte[] byArray2 = byArray[i2];
                kl.at(byArray2);
                hashSet.add(Base64.encodeToString((byte[])byArray2, (int)3));
            }
            return hashSet;
        }
        return Collections.emptySet();
    }

    private static void f(StringBuilder stringBuilder, String object, byte[][] byArray) {
        stringBuilder.append((String)object);
        stringBuilder.append("=");
        if (byArray == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        boolean bl2 = true;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            object = byArray[i2];
            if (!bl2) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            kl.at(object);
            stringBuilder.append(Base64.encodeToString((byte[])object, (int)3));
            stringBuilder.append("'");
            bl2 = false;
        }
        stringBuilder.append(")");
    }

    public final boolean equals(Object object) {
        if (object instanceof cjn) {
            object = (cjn)object;
            if (a.k(this.b, ((cjn)object).b) && a.k(this.c(), super.c()) && a.k(cjn.e(this.d), cjn.e(((cjn)object).d)) && a.k(cjn.e(this.e), cjn.e(((cjn)object).e)) && a.k(cjn.e(this.f), cjn.e(((cjn)object).f)) && a.k(cjn.e(this.g), cjn.e(((cjn)object).g)) && a.k(cjn.d(this.h), cjn.d(((cjn)object).h)) && a.k(cjn.b(this.j), cjn.b(((cjn)object).j)) && a.k(cjn.e(this.k), cjn.e(((cjn)object).k))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        Object object = this.b;
        object = object == null ? "null" : a.aj((String)object, "'", "'");
        stringBuilder.append((String)object);
        object = this.c;
        stringBuilder.append(", direct==");
        if (object == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString((byte[])object, (int)3));
            stringBuilder.append("'");
        }
        stringBuilder.append(", ");
        cjn.f(stringBuilder, "GAIA=", this.d);
        stringBuilder.append(", ");
        cjn.f(stringBuilder, "PSEUDO=", this.e);
        stringBuilder.append(", ");
        cjn.f(stringBuilder, "ALWAYS=", this.f);
        stringBuilder.append(", ");
        cjn.f(stringBuilder, "OTHER=", this.g);
        stringBuilder.append(", weak=");
        stringBuilder.append(Arrays.toString(this.h));
        stringBuilder.append(", ");
        cjn.f(stringBuilder, "directs=", this.i);
        stringBuilder.append(", genDims=");
        stringBuilder.append(Arrays.toString(cjn.b(this.j).toArray()));
        stringBuilder.append(", ");
        cjn.f(stringBuilder, "external=", this.k);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.K(parcel, 2, this.b);
        kl.D(parcel, 3, this.c);
        kl.E(parcel, 4, this.d);
        kl.E(parcel, 5, this.e);
        kl.E(parcel, 6, this.f);
        kl.E(parcel, 7, this.g);
        kl.G(parcel, 8, this.h);
        kl.E(parcel, 9, this.i);
        kl.G(parcel, 10, this.j);
        kl.E(parcel, 11, this.k);
        kl.w(parcel, n2);
    }
}

