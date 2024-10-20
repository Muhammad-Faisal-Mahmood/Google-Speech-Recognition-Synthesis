/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class bvg
implements bul {
    final Object a;
    private final int b;

    public bvg(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        if (this.b != 0) {
            Map map = ((bse)this.a).a;
            synchronized (map) {
                ((bse)this.a).a.clear();
            }
            Map map2 = ((bse)this.a).b;
            synchronized (map2) {
                ((bse)this.a).b.clear();
                return;
            }
        }
        ((bvi)this.a).J();
    }

    @Override
    public final void b() {
    }
}

