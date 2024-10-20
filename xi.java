/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.DisplayCutout
 *  android.view.WindowInsets
 */
import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

class xi
extends xh {
    public xi(xn xn2, WindowInsets windowInsets) {
        super(xn2, windowInsets);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof xi)) {
            return false;
        }
        object = (xi)object;
        return Objects.equals(this.a, ((xi)object).a) && Objects.equals(this.b, ((xi)object).b);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public vc o() {
        DisplayCutout displayCutout = fs$$ExternalSyntheticApiModelOutline0.m(this.a);
        if (displayCutout == null) {
            return null;
        }
        return new vc(displayCutout);
    }

    @Override
    public xn p() {
        return xn.m(fs$$ExternalSyntheticApiModelOutline0.m(this.a));
    }
}

