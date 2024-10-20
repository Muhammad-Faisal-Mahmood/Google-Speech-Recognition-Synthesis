/*
 * Decompiled with CFR 0.152.
 */
import java.util.RandomAccess;

final class jos
extends jot
implements RandomAccess {
    private final jot a;
    private final int b;
    private final int c;

    public jos(jot jot2, int n2, int n3) {
        this.a = jot2;
        this.b = n2;
        jns.ah(n2, n3, jot2.a());
        this.c = n3 - n2;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final Object get(int n2) {
        jns.af(n2, this.c);
        int n3 = this.b;
        return this.a.get(n3 + n2);
    }
}

