/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.io.IOException;

public final class ajn
implements ani,
alc {
    public final ajq a;
    private final ajo b;

    public ajn(ajq ajq2, ajo ajo2) {
        this.a = ajq2;
        this.b = ajo2;
    }

    private final Pair f(anc anc2) {
        Object object = null;
        if (anc2 != null) {
            block3: {
                object = this.b;
                for (int i2 = 0; i2 < ((ajo)object).c.size(); ++i2) {
                    if (((anc)((ajo)object).c.get((int)i2)).d != anc2.d) continue;
                    Object object2 = anc2.a;
                    anc2 = anc2.a(Pair.create((Object)((ajo)object).b, (Object)object2));
                    break block3;
                }
                anc2 = null;
            }
            if (anc2 == null) {
                return null;
            }
            object = anc2;
        }
        return Pair.create((Object)this.b.d, (Object)object);
    }

    @Override
    public final void A(int n2, anc object, hti object2) {
        Pair pair = this.f((anc)object);
        if (pair != null) {
            object = this.a;
            object2 = new ai((Object)this, (Object)pair, object2, 3, null);
            ((ajq)object).g.c((Runnable)object2);
        }
    }

    @Override
    public final void B(int n2, anc object, amv object2, hti hti2) {
        Pair pair = this.f((anc)object);
        if (pair != null) {
            object = this.a;
            object2 = new ww(this, pair, (amv)object2, hti2, 2);
            ((ajq)object).g.c((Runnable)object2);
        }
    }

    @Override
    public final void C(int n2, anc object, amv object2, hti hti2) {
        Pair pair = this.f((anc)object);
        if (pair != null) {
            object = this.a;
            object2 = new ww(this, pair, (amv)object2, hti2, 4);
            ((ajq)object).g.c((Runnable)object2);
        }
    }

    @Override
    public final void D(int n2, anc object, amv object2, hti hti2, IOException iOException, boolean bl2) {
        Pair pair = this.f((anc)object);
        if (pair != null) {
            object = this.a;
            object2 = new jho(this, pair, (amv)object2, hti2, iOException, bl2, 1);
            ((ajq)object).g.c((Runnable)object2);
        }
    }

    @Override
    public final void E(int n2, anc object, amv object2, hti hti2) {
        Pair pair = this.f((anc)object);
        if (pair != null) {
            object = this.a;
            object2 = new ww(this, pair, (amv)object2, hti2, 3);
            ((ajq)object).g.c((Runnable)object2);
        }
    }
}

