/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;

final class arc
implements are {
    private final long[] a;
    private final long[] b;
    private final long c;

    public arc(long[] lArray, long[] lArray2, long l2) {
        this.a = lArray;
        this.b = lArray2;
        if (l2 == -9223372036854775807L) {
            l2 = agf.i(lArray2[lArray2.length - 1]);
        }
        this.c = l2;
    }

    private static Pair g(long l2, long[] lArray, long[] lArray2) {
        int n2 = agf.y(lArray, l2, true);
        long l3 = lArray[n2];
        long l4 = lArray2[n2];
        if (++n2 == lArray.length) {
            return Pair.create((Object)l3, (Object)l4);
        }
        long l5 = lArray[n2];
        long l6 = lArray2[n2];
        double d2 = l5 == l3 ? 0.0 : ((double)l2 - (double)l3) / (double)(l5 - l3);
        return Pair.create((Object)l2, (Object)((long)(d2 * (double)(l6 - l4)) + l4));
    }

    @Override
    public final long a() {
        return this.c;
    }

    @Override
    public final int b() {
        return -2147483647;
    }

    @Override
    public final apz c(long l2) {
        Object object = arc.g(agf.m(agf.h(l2, 0L, this.c)), this.b, this.a);
        object = new aqc(agf.i((Long)object.first), (Long)object.second);
        return new apz((aqc)object, (aqc)object);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final long e() {
        return -1L;
    }

    @Override
    public final long f(long l2) {
        return agf.i((Long)arc.g((long)l2, (long[])this.a, (long[])this.b).second);
    }
}

