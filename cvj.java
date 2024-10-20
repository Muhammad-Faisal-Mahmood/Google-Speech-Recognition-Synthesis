/*
 * Decompiled with CFR 0.152.
 */
public final class cvj
extends cvm {
    private final csg a;

    public cvj(csg csg2) {
        this.a = csg2;
    }

    @Override
    public final csg a() {
        return this.a;
    }

    @Override
    public final int b() {
        return 3;
    }

    public final boolean equals(Object object) {
        return object instanceof cvn && ((cvn)(object = (cvn)object)).b() == 3 && this.a.equals(((cvn)object).a());
    }

    public final int hashCode() {
        int n2;
        csg csg2 = this.a;
        if (csg2.B()) {
            n2 = csg2.i();
        } else {
            int n3;
            n2 = n3 = csg2.memoizedHashCode;
            if (n3 == 0) {
                csg2.memoizedHashCode = n2 = csg2.i();
            }
        }
        return n2;
    }
}

