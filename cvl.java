/*
 * Decompiled with CFR 0.152.
 */
public final class cvl
extends cvm {
    private final cth a;

    public cvl(cth cth2) {
        this.a = cth2;
    }

    @Override
    public final int b() {
        return 1;
    }

    @Override
    public final cth d() {
        return this.a;
    }

    public final boolean equals(Object object) {
        return object instanceof cvn && ((cvn)(object = (cvn)object)).b() == 1 && this.a.equals(((cvn)object).d());
    }

    public final int hashCode() {
        int n2;
        cth cth2 = this.a;
        if (cth2.B()) {
            n2 = cth2.i();
        } else {
            int n3;
            n2 = n3 = cth2.memoizedHashCode;
            if (n3 == 0) {
                cth2.memoizedHashCode = n2 = cth2.i();
            }
        }
        return n2;
    }
}

