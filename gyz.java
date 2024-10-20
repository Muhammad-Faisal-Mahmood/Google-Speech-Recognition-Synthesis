/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class gyz
implements Comparable,
Serializable {
    private static final long serialVersionUID = 0L;
    final Comparable b = "";

    public int a(gyz gyz2) {
        if (gyz2 != gyy.a) {
            if (gyz2 == gyw.a) {
                return -1;
            }
            Object object = gyz2.b;
            object = hcr.a;
            int n2 = "".compareTo("");
            if (n2 != 0) {
                return n2;
            }
            return Boolean.compare(this instanceof gyx, gyz2 instanceof gyx);
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean equals(Object object) {
        if (!(object instanceof gyz)) return false;
        object = (gyz)object;
        try {
            int n2 = this.a((gyz)object);
            if (n2 != 0) return false;
            return true;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }
}

