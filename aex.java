/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class aex {
    public final int a;
    public final String b;
    public final int c;
    public final adu[] d;
    private int e;

    static {
        agf.z(0);
        agf.z(1);
    }

    public aex(String string, adu ... aduArray) {
        int n2;
        abr.d(true);
        this.b = string;
        this.d = aduArray;
        this.a = 1;
        int n3 = n2 = ael.a(aduArray[0].o);
        if (n2 == -1) {
            string = aduArray[0].n;
            n3 = ael.a(null);
        }
        this.c = n3;
        aex.b(aduArray[0].d);
        n3 = aduArray[0].f;
    }

    private static String b(String string) {
        if (string != null && !string.equals("und")) {
            return string;
        }
        return "";
    }

    private static void c(String string, String string2, String string3, int n2) {
        StringBuilder stringBuilder = new StringBuilder("Different ");
        stringBuilder.append(string);
        stringBuilder.append(" combined in one TrackGroup: '");
        stringBuilder.append(string2);
        stringBuilder.append("' (track 0) and '");
        stringBuilder.append(string3);
        stringBuilder.append("' (track ");
        stringBuilder.append(n2);
        stringBuilder.append(")");
        afx.c("TrackGroup", "", new IllegalStateException(stringBuilder.toString()));
    }

    public final adu a(int n2) {
        return this.d[n2];
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aex)object;
            if (this.b.equals(((aex)object).b) && Arrays.equals(this.d, ((aex)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.e;
        if (n2 == 0) {
            this.e = n3 = (this.b.hashCode() + 527) * 31 + Arrays.hashCode(this.d);
        }
        return n3;
    }
}

