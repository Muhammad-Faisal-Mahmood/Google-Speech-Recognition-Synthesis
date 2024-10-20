/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class bir {
    public final bbt a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Object d = new Object();

    static {
        bbi.b("WorkTimer");
    }

    public bir(bbt bbt2) {
        this.a = bbt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(bgs bgs2) {
        Object object = this.d;
        synchronized (object) {
            if ((bcv)this.b.remove(bgs2) != null) {
                bbi.a();
                Objects.toString(bgs2);
                this.c.remove(bgs2);
            }
            return;
        }
    }
}

