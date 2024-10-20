/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
import android.graphics.RectF;
import java.util.Arrays;

public final class fxb
implements fxd {
    private final fxd a;
    private final float b;

    public fxb(float f2, fxd fxd2) {
        while (fxd2 instanceof fxb) {
            fxd2 = ((fxb)fxd2).a;
            f2 += ((fxb)fxd2).b;
        }
        this.a = fxd2;
        this.b = f2;
    }

    @Override
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fxb)) {
            return false;
        }
        object = (fxb)object;
        return this.a.equals(((fxb)object).a) && this.b == ((fxb)object).b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}

