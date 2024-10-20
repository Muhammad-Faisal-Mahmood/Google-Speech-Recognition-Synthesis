/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.DisplayCutout
 */
import android.view.DisplayCutout;
import j$.util.Objects;

public final class vc {
    public final DisplayCutout a;

    public vc(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (vc)object;
            return Objects.equals(this.a, ((vc)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return fs$$ExternalSyntheticApiModelOutline0.m(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisplayCutoutCompat{");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

