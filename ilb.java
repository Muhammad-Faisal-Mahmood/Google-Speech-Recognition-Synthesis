/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class ilb
implements ack {
    public static final acq a = new aca();
    private final Map b;
    private final ack c;
    private final ack d;

    public ilb(Map map, ack ack2, bqz bqz2) {
        this.b = map;
        this.c = ack2;
        this.d = new ilf(bqz2, 1);
    }

    @Override
    public final ach a(Class clazz) {
        if (this.b.containsKey(clazz)) {
            return we.h(clazz);
        }
        return this.c.a(clazz);
    }

    @Override
    public final ach b(Class clazz, acr acr2) {
        if (this.b.containsKey(clazz)) {
            return this.d.b(clazz, acr2);
        }
        return this.c.b(clazz, acr2);
    }

    @Override
    public final /* synthetic */ ach c(jta jta2, acr acr2) {
        return we.g(this, jta2, acr2);
    }
}

