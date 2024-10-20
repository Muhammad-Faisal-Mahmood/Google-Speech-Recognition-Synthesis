/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
import android.graphics.RectF;
import java.util.Arrays;

public final class fxa
implements fxd {
    private final float a;

    public fxa(float f2) {
        this.a = f2;
    }

    @Override
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fxa)) {
            return false;
        }
        object = (fxa)object;
        return this.a == ((fxa)object).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("px");
        return stringBuilder.toString();
    }
}

