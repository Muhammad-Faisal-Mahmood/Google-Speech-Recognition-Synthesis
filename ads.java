/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseBooleanArray
 */
import android.util.SparseBooleanArray;

public final class ads {
    public final SparseBooleanArray a;

    public ads(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int n2) {
        abr.h(n2, this.b());
        return this.a.keyAt(n2);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ads)) {
            return false;
        }
        object = (ads)object;
        int n2 = agf.a;
        return this.a.equals((Object)((ads)object).a);
    }

    public final int hashCode() {
        int n2 = agf.a;
        return this.a.hashCode();
    }
}

