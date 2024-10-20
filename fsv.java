/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class fsv
implements fsr {
    double[] a = new double[5];
    int b = 0;

    @Override
    public final hun a() {
        hwv hwv2;
        Object object;
        hyg hyg2 = hul.a.l();
        for (int i2 = 0; i2 < this.b; ++i2) {
            object = huk.a.l();
            double d2 = this.a[i2];
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hwv hwv3 = ((hwp)object).b;
            hwv2 = (huk)hwv3;
            ((huk)hwv2).b |= 1;
            ((huk)hwv2).c = d2;
            if (!hwv3.B()) {
                ((hwp)object).u();
            }
            hwv2 = (huk)((hwp)object).b;
            ((huk)hwv2).b |= 2;
            ((huk)hwv2).d = 1L;
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hwv2 = (hul)((hwp)hyg2).b;
            hwv3 = (huk)((hwp)object).o();
            hwv3.getClass();
            object = ((hul)hwv2).b;
            if (!object.c()) {
                ((hul)hwv2).b = hwv.s((hxk)object);
            }
            ((hul)hwv2).b.add(hwv3);
        }
        object = hun.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hwv2 = (hun)((hwp)object).b;
        hyg2 = (hul)((hwp)hyg2).o();
        hyg2.getClass();
        hwv2.c = hyg2;
        hwv2.b = 3;
        return (hun)((hwp)object).o();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(", count = ");
        stringBuilder.append(this.b);
        stringBuilder.append(", value =");
        stringBuilder.append(Arrays.toString(this.a));
        return stringBuilder.toString();
    }
}

