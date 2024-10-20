/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

final class cdy {
    public final cdj a;
    public final cbm b;

    public cdy(cdj cdj2, cbm cbm2) {
        this.a = cdj2;
        this.b = cbm2;
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof cdy) {
            object = (cdy)object;
            if (a.k(this.a, ((cdy)object).a) && a.k(this.b, ((cdy)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kl.aw("key", this.a, arrayList);
        kl.aw("feature", this.b, arrayList);
        return kl.av(arrayList, this);
    }
}

