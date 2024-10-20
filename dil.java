/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class dil {
    public static final dil a = new dil(TimeUnit.HOURS.toSeconds(1L));
    public static final Random b = new Random();
    public final long c;

    public dil(long l2) {
        dec.n("expBackoffMinDelaySeconds", 30L);
        dec.n("expBackoffMaxDelaySeconds", l2);
        this.c = l2;
    }
}

