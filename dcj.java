/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class dcj {
    public static final dbv a = dbv.b;
    public static final dbq b = dbq.a;
    public static final dbs c = dbs.a;
    public final int d;
    private final Map e = new HashMap();
    private final dci f;

    public dcj(int n2) {
        this.d = n2;
        this.f = new dci(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final dci g(String object) {
        synchronized (this) {
            if (this.e.containsKey(object)) return (dci)this.e.get(object);
            Map map = this.e;
            dci dci2 = new dci(this);
            map.put(object, dci2);
            return (dci)this.e.get(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final dbq a(String object) {
        synchronized (this) {
            return this.d((String)object).b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dbs b(String object) {
        synchronized (this) {
            return this.d((String)object).c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dbv c(String object) {
        synchronized (this) {
            return this.d((String)object).a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dci d(String object) {
        synchronized (this) {
            if (object != null) {
                if ((object = (dci)this.e.get(object)) == null) return this.f;
                return object;
            }
            return this.f;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(String string, dbv dbv2) {
        synchronized (this) {
            this.g((String)string).a = dbv2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(String string) {
        synchronized (this) {
            int n2 = this.d((String)string).d;
            return;
        }
    }
}

