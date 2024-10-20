/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executors;

public final class ddw {
    public static final hpq a;

    static {
        ivg ivg2 = new ivg(null);
        ivg2.h("superpacks-task-%d");
        a = hhk.E(Executors.newSingleThreadExecutor(ivg.i(ivg2)));
    }
}

