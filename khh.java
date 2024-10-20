/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public final class khh {
    public static final khh a = new khh(new bzo(new kha(String.valueOf(khb.e).concat(" TaskRunner"), true)));
    public static final Logger b;
    public boolean c;
    public long d;
    public final List e;
    public final List f;
    public final Runnable g;
    public final bzo h;
    private int i;

    static {
        Logger logger = Logger.getLogger(khh.class.getName());
        jse.d(logger, "getLogger(...)");
        b = logger;
    }

    public khh(bzo bzo2) {
        this.h = bzo2;
        this.i = 10000;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new khg(this);
    }

    public final khf a() {
        synchronized (this) {
            int n2 = this.i;
            this.i = n2 + 1;
            return new khf(this, a.af(n2, "Q"));
        }
    }

    public final void b(khd khd2, long l2) {
        Object object = khb.a;
        object = khd2.b;
        jse.b(object);
        if (((khf)object).d == khd2) {
            boolean bl2 = ((khf)object).f;
            ((khf)object).f = false;
            ((khf)object).d = null;
            this.e.remove(object);
            if (l2 != -1L && !bl2 && !((khf)object).c) {
                ((khf)object).d(khd2, l2, true);
            }
            if (!((khf)object).e.isEmpty()) {
                this.f.add(object);
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void c(khf khf2) {
        Object object = khb.a;
        if (khf2.d == null) {
            if (!khf2.e.isEmpty()) {
                object = this.f;
                if (!object.contains(khf2)) {
                    object.add(khf2);
                }
            } else {
                this.f.remove(khf2);
            }
        }
        if (this.c) {
            this.notify();
            return;
        }
        this.h.au(this.g);
    }
}

