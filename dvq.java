/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class dvq
implements gui {
    public final dua a;
    public final String b;
    public final boolean c;
    public final Set d;

    public /* synthetic */ dvq(dua dua2, String string, boolean bl2, Set set) {
        this.a = dua2;
        this.b = string;
        this.c = bl2;
        this.d = set;
    }

    @Override
    public final Object a() {
        return new dvr(this.a, this.b, this.c, this.d);
    }
}

