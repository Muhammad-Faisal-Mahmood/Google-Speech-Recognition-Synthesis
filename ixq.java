/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class ixq
implements ixs {
    final int a;
    final ixs[] b;
    private final int c;

    private ixq(int n2, ixs[] ixsArray, int n3) {
        this.a = n2;
        this.b = ixsArray;
        this.c = n3;
    }

    static ixs b(ixs ixs2, int n2, ixs ixs3, int n3, int n4) {
        int n5;
        int n6 = ixq.f(n2, n4);
        if (n6 == (n5 = ixq.f(n3, n4))) {
            ixs2 = ixq.b(ixs2, n2, ixs3, n3, n4 + 5);
            n2 = ((ixq)ixs2).c;
            return new ixq(n6, new ixs[]{ixs2}, n2);
        }
        ixs ixs4 = (n2 = ixq.g(n2, n4)) > (n3 = ixq.g(n3, n4)) ? ixs2 : ixs3;
        if (n2 > n3) {
            ixs2 = ixs3;
        }
        n2 = ixs2.a();
        n3 = ixs4.a();
        return new ixq(n6 | n5, new ixs[]{ixs2, ixs4}, n2 + n3);
    }

    private final int e(int n2) {
        return Integer.bitCount(n2 - 1 & this.a);
    }

    private static int f(int n2, int n3) {
        return 1 << ixq.g(n2, n3);
    }

    private static int g(int n2, int n3) {
        return n2 >>> n3 & 0x1F;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final ixs c(Object ixsArray, Object object, int n2, int n3) {
        int n4 = this.a;
        int n5 = ixq.f(n2, n3);
        int n6 = this.e(n5);
        if ((n4 & n5) == 0) {
            ixs[] ixsArray2 = this.b;
            ixs[] ixsArray3 = new ixs[ixsArray2.length + 1];
            System.arraycopy(ixsArray2, 0, ixsArray3, 0, n6);
            ixsArray3[n6] = new ixr(ixsArray, object, 0);
            ixsArray = this.b;
            System.arraycopy(ixsArray, n6, ixsArray3, n6 + 1, ixsArray.length - n6);
            return new ixq(n4 | n5, ixsArray3, this.c + 1);
        }
        ixs[] ixsArray4 = this.b;
        ixsArray4 = Arrays.copyOf(ixsArray4, ixsArray4.length);
        ixsArray = this.b[n6].c(ixsArray, object, n2, n3 + 5);
        ixsArray4[n6] = ixsArray;
        n2 = this.c;
        n3 = ixsArray.a();
        n6 = this.b[n6].a();
        return new ixq(this.a, ixsArray4, n2 + n3 - n6);
    }

    @Override
    public final Object d(Object object, int n2, int n3) {
        int n4 = this.a;
        int n5 = ixq.f(n2, n3);
        if ((n4 & n5) == 0) {
            return null;
        }
        n5 = this.e(n5);
        return this.b[n5].d(object, n2, n3 + 5);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompressedIndex(");
        ixs[] ixsArray = Integer.toBinaryString(this.a);
        stringBuilder.append(String.format("bitmap=%s ", new Object[]{ixsArray}));
        ixsArray = this.b;
        int n2 = ixsArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(ixsArray[i2]);
            stringBuilder.append(" ");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

