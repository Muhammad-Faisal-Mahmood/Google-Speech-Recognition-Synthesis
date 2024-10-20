/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
import android.graphics.RectF;
import java.util.Arrays;

public final class fxc
implements fxd {
    private final float a;

    public fxc(float f2) {
        this.a = f2;
    }

    @Override
    public final float a(RectF rectF) {
        float f2 = rectF.width() / 2.0f;
        float f3 = rectF.height() / 2.0f;
        return rw.A(this.a, Math.min(f2, f3));
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fxc)) {
            return false;
        }
        object = (fxc)object;
        return this.a == ((fxc)object).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}

