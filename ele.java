/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class ele
implements eef {
    public final eli a;
    public final eef b;

    public /* synthetic */ ele(eli eli2, eef eef2) {
        this.a = eli2;
        this.b = eef2;
    }

    @Override
    public final /* synthetic */ hpn a(dzj dzj2) {
        return doc.a(this, dzj2);
    }

    @Override
    public final dzk i(dzj object, int n2) {
        eli eli2 = this.a;
        List list = eli2.d;
        eef eef2 = this.b;
        synchronized (list) {
            object = eef2.i((dzj)object, jse.l(eli2.e.b, n2));
            if (!eli2.f.b()) {
                eli2.d.add(((dzk)object).b);
            }
            return object;
        }
    }

    @Override
    public final /* synthetic */ dzk k(dzj dzj2) {
        return dpg.j(this, dzj2);
    }
}

