/*
 * Decompiled with CFR 0.152.
 */
public final class aob {
    public static final aob a = new aob(new aex[0]);
    public final int b;
    public final gzx c;
    private int d;

    static {
        agf.z(0);
    }

    public aob(aex ... object) {
        this.c = gzx.p((Object[])object);
        this.b = ((aex[])object).length;
        int n2 = 0;
        while (n2 < ((hct)this.c).c) {
            int n3;
            int n4 = n3 = n2 + 1;
            while (true) {
                object = this.c;
                if (n4 >= ((hct)object).c) break;
                if (((aex)object.get(n2)).equals(this.c.get(n4))) {
                    afx.c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
                ++n4;
            }
            n2 = n3;
        }
    }

    public final aex a(int n2) {
        return (aex)this.c.get(n2);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aob)object;
            if (this.b == ((aob)object).b && fvd.z(this.c, ((aob)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            this.d = n3 = this.c.hashCode();
        }
        return n3;
    }
}

