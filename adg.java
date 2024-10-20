/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.Arrays;

public final class adg {
    public static final int i = 0;
    public final long a;
    public final int b;
    @Deprecated
    public final Uri[] c;
    public final aef[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    static {
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
        agf.z(6);
        agf.z(7);
        agf.z(8);
    }

    public adg(int n2, int[] object, aef[] aefArray, long[] objectArray) {
        int n3 = ((int[])object).length;
        int n4 = aefArray.length;
        int n5 = 0;
        boolean bl2 = n3 == n4;
        abr.d(bl2);
        this.a = 0L;
        this.b = n2;
        this.e = object;
        this.d = aefArray;
        this.f = objectArray;
        this.g = 0L;
        this.h = false;
        this.c = new Uri[n4];
        for (n2 = n5; n2 < (objectArray = (Object[])this.c).length; ++n2) {
            object = aefArray[n2];
            if (object == null) {
                object = null;
            } else {
                object = object.b;
                abr.i(object);
                object = object.a;
            }
            objectArray[n2] = (long)object;
        }
    }

    public final int a() {
        return this.b(-1);
    }

    public final int b(int n2) {
        int n3;
        int[] nArray;
        ++n2;
        while (n2 < (nArray = this.e).length && (n3 = nArray[n2]) != 0 && n3 != 1) {
            ++n2;
        }
        return n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (adg)object;
            if (this.b == ((adg)object).b && Arrays.equals(this.d, ((adg)object).d) && Arrays.equals(this.e, ((adg)object).e) && Arrays.equals(this.f, ((adg)object).f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b * 31 - 1) * 961 + Arrays.hashCode(this.d)) * 31 + Arrays.hashCode(this.e)) * 31 + Arrays.hashCode(this.f)) * 961;
    }
}

