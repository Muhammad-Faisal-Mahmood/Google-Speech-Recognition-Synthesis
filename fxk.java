/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
import android.graphics.RectF;
import java.util.Arrays;

public final class fxk
implements fxd {
    private final float a;

    public fxk(float f2) {
        this.a = f2;
    }

    @Override
    public final float a(RectF rectF) {
        float f2 = Math.min(rectF.width(), rectF.height());
        return this.a * f2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fxk)) {
            return false;
        }
        object = (fxk)object;
        return this.a == ((fxk)object).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((int)(this.a * 100.0f));
        stringBuilder.append("%");
        return stringBuilder.toString();
    }
}

