/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public final class aoh {
    public final aex a;
    public final int b;
    public final int[] c;
    public final adu[] d;
    private int e;

    public aoh(aex aex2, int[] nArray) {
        int n2 = nArray.length;
        boolean bl2 = n2 > 0;
        abr.f(bl2);
        abr.i(aex2);
        this.a = aex2;
        this.b = n2;
        this.d = new adu[n2];
        for (n2 = 0; n2 < nArray.length; ++n2) {
            this.d[n2] = aex2.a(nArray[n2]);
        }
        Arrays.sort(this.d, new aog(0));
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; ++i2) {
            block4: {
                nArray = this.c;
                adu adu2 = this.d[i2];
                for (n2 = 0; n2 <= 0; ++n2) {
                    if (adu2 != aex2.d[n2]) {
                        continue;
                    }
                    break block4;
                }
                n2 = -1;
            }
            nArray[i2] = n2;
        }
    }

    public aoh(aex aex2, int[] nArray, List list) {
        this(aex2, nArray);
        gzx.o(list);
    }

    public static void c(List list, long[] lArray) {
        int n2 = 0;
        long l2 = 0L;
        int n3 = 0;
        while (true) {
            if (n3 >= lArray.length) break;
            l2 += lArray[n3];
            ++n3;
        }
        for (int i2 = n2; i2 < list.size(); ++i2) {
            gzs gzs2 = (gzs)list.get(i2);
            if (gzs2 == null) continue;
            gzs2.h(new aof(l2, lArray[i2]));
        }
    }

    public final int a() {
        return this.c.length;
    }

    public final adu b(int n2) {
        return this.d[n2];
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aoh)object;
            if (this.a.equals(((aoh)object).a) && Arrays.equals(this.c, ((aoh)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.e;
        if (n2 == 0) {
            this.e = n3 = System.identityHashCode(this.a) * 31 + Arrays.hashCode(this.c);
        }
        return n3;
    }
}

