/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class acu {
    public final Map a;
    public final Set b;
    public volatile boolean c;
    public final wg d = new wg();

    public acu() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashSet();
    }

    public static final void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
                return;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }
}

