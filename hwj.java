/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hwj {
    public static final hwj a = new hwj(null);
    private static volatile boolean b = false;
    private static volatile hwj c;
    private final Map d;

    hwj() {
        this.d = new HashMap();
    }

    public hwj(byte[] byArray) {
        this.d = Collections.emptyMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static hwj a() {
        Object object = c;
        if (object != null) {
            return object;
        }
        synchronized (hwj.class) {
            object = c;
            if (object != null) {
                return object;
            }
            object = hyo.a;
            c = object = hwo.b(hwj.class);
            return object;
        }
    }

    public gpm b(hyf object, int n2) {
        object = new hwi(object, n2);
        return (gpm)this.d.get(object);
    }
}

