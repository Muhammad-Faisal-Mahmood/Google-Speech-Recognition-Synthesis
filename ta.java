/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 */
import android.content.res.Resources;
import j$.util.Objects;

public final class ta {
    public final Resources a;
    public final Resources.Theme b;

    public ta(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (ta)object;
            if (this.a.equals(((ta)object).a) && Objects.equals(this.b, ((ta)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}

