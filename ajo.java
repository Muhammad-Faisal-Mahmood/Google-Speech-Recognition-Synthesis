/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

final class ajo
implements ajm {
    public final amz a;
    public final Object b;
    public final List c;
    public int d;
    public boolean e;

    public ajo(ane ane2, boolean bl2) {
        this.a = new amz(ane2, bl2);
        this.c = new ArrayList();
        this.b = new Object();
    }

    @Override
    public final aew a() {
        return this.a.g;
    }

    @Override
    public final Object b() {
        return this.b;
    }

    public final void c(int n2) {
        this.d = n2;
        this.e = false;
        this.c.clear();
    }
}

