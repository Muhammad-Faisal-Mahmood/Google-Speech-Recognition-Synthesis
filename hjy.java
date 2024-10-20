/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class hjy
implements Serializable {
    public static int c(int n2) {
        boolean bl2 = n2 > 0;
        fxf.x(bl2, "%s (%s) must be > 0", "numAttempts", n2);
        return Math.min(n2, 131072);
    }

    public boolean bo(int n2) {
        throw null;
    }
}

