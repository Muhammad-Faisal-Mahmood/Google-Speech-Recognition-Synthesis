/*
 * Decompiled with CFR 0.152.
 */
public final class pc {
    public static final Object a = new Object();

    public static final Object a(pb object, int n2) {
        if ((n2 = pd.a(((pb)object).b, ((pb)object).d, n2)) >= 0 && (object = ((pb)object).c[n2]) != a) {
            return object;
        }
        return null;
    }

    public static final void b(pb pb2) {
        int n2 = pb2.d;
        int[] nArray = pb2.b;
        Object[] objectArray = pb2.c;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            int n4 = n3;
            if (object != a) {
                if (i2 != n3) {
                    nArray[n3] = nArray[i2];
                    objectArray[n3] = object;
                    objectArray[i2] = null;
                }
                n4 = n3 + 1;
            }
            n3 = n4;
        }
        pb2.a = false;
        pb2.d = n3;
    }
}

