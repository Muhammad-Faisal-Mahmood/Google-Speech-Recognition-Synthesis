/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executors;

public final class ddv {
    public static final hpr a;

    static {
        ivg ivg2 = new ivg(null);
        ivg2.h("superpacks-control-%d");
        a = hhk.F(Executors.newSingleThreadScheduledExecutor(ivg.i(ivg2)));
    }
}

