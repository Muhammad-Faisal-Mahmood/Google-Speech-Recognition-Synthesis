/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class bcu
implements bcs {
    private final bcs a;
    private final Object b;

    public bcu(bcs bcs2) {
        this.a = bcs2;
        this.b = new Object();
    }

    @Override
    public final List a(String object) {
        jse.e(object, "workSpecId");
        Object object2 = this.b;
        synchronized (object2) {
            object = this.a.a((String)object);
            return object;
        }
    }

    @Override
    public final boolean b(bgs bgs2) {
        Object object = this.b;
        synchronized (object) {
            boolean bl2 = this.a.b(bgs2);
            return bl2;
        }
    }

    @Override
    public final bzb c(bgs object) {
        jse.e(object, "id");
        Object object2 = this.b;
        synchronized (object2) {
            object = this.a.c((bgs)object);
            return object;
        }
    }

    @Override
    public final bzb d(bgs object) {
        Object object2 = this.b;
        synchronized (object2) {
            object = this.a.d((bgs)object);
            return object;
        }
    }

    @Override
    public final /* synthetic */ bzb e(bhd bhd2) {
        return abr.n(this, bhd2);
    }
}

