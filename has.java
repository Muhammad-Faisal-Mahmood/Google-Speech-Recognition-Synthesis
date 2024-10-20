/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class has
extends gxy
implements Serializable {
    public static final has a;
    public static final has b;
    private final transient gzx c;

    static {
        int n2 = gzx.d;
        a = new has(hct.a);
        b = new has(gzx.q(hcr.a));
    }

    public has(gzx gzx2) {
        this.c = gzx2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new har(this.c);
    }
}

