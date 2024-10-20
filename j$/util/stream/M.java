/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.L;

abstract class M
implements L {
    protected final L a;
    protected final L b;
    private final long c;

    M(L l2, L l3) {
        this.a = l2;
        this.b = l3;
        this.c = l2.count() + l3.count();
    }

    @Override
    public final L a(int n2) {
        if (n2 == 0) {
            return this.a;
        }
        if (n2 == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final long count() {
        return this.c;
    }

    @Override
    public final int h() {
        return 2;
    }
}

