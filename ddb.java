/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public final class ddb {
    private static final ddb a;
    private static final crh b;

    static {
        b = new crh();
        a = new ddb();
    }

    public ddb() {
        new HashSet();
    }

    public static void a() {
        a.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final crh b() {
        synchronized (this) {
            return b;
        }
    }
}

