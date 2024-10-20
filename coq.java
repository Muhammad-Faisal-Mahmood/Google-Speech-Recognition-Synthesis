/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class coq
extends hoz
implements hpp {
    public volatile hpp a;

    public coq(hpn hpn2, hpp hpp2) {
        super(hpn2);
        this.a = hpp2;
        hpn2.c(new cmw(this, 6), (Executor)hom.a);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}

