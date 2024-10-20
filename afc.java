/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class afc {
    public final int a;
    public final aex b;
    public final boolean[] c;
    private final int[] d;

    static {
        agf.z(0);
        agf.z(1);
        agf.z(3);
        agf.z(4);
    }

    public afc(aex aex2, int[] nArray, boolean[] blArray) {
        int n2 = aex2.a;
        this.a = 1;
        abr.d(true);
        this.b = aex2;
        this.d = (int[])nArray.clone();
        this.c = (boolean[])blArray.clone();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (afc)object;
            if (this.b.equals(((afc)object).b) && Arrays.equals(this.d, ((afc)object).d) && Arrays.equals(this.c, ((afc)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 961 + Arrays.hashCode(this.d)) * 31 + Arrays.hashCode(this.c);
    }
}

