/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Logger;

public final class hpm {
    private final String a;
    private volatile Logger b;
    private final jrw c = new jrw();

    public hpm(Class clazz) {
        this.a = clazz.getName();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Logger a() {
        Object object = this.b;
        if (object != null) {
            return object;
        }
        object = this.c;
        synchronized (object) {
            Logger logger = this.b;
            if (logger != null) {
                return logger;
            }
            this.b = logger = Logger.getLogger(this.a);
            return logger;
        }
    }
}

