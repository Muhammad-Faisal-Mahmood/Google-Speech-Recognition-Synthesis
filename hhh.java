/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.logging.Level;

public final class hhh
implements hgy {
    public final String a;
    public final Level b;
    public final boolean c;
    public final Set d;
    public final hgg e;
    public final int f;
    private volatile hhi g;

    private hhh() {
        this(2, Level.ALL, false, hhj.a, hhj.b);
    }

    public hhh(int n2, Level level, boolean bl2, Set set, hgg hgg2) {
        this.a = "";
        this.f = 2;
        this.b = level;
        this.c = bl2;
        this.d = set;
        this.e = hgg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hfv a(String object) {
        if (this.c && ((String)object).contains(".")) {
            hhi hhi2 = this.g;
            object = hhi2;
            if (hhi2 == null) {
                synchronized (this) {
                    hhi2 = this.g;
                    object = hhi2;
                    if (hhi2 == null) {
                        this.g = object = new hhi(null, 2, this.b, false, this.d, this.e);
                    }
                }
            }
            return object;
        }
        return new hhj((String)object, 2, this.b, this.d, this.e);
    }
}

