/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class jdh
implements jcl {
    public final jcl a;
    public volatile boolean b;
    public List c = new ArrayList();

    public jdh(jcl jcl2) {
        this.a = jcl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
                return;
            }
        }
        runnable.run();
    }

    @Override
    public final void a(iyh iyh2, jck jck2, iwx iwx2) {
        this.b(new ww(this, iyh2, jck2, iwx2, 12));
    }

    @Override
    public final void c(iwx iwx2) {
        this.b(new jdg(this, iwx2, 6));
    }

    @Override
    public final void d(jjq jjq2) {
        if (this.b) {
            this.a.d(jjq2);
            return;
        }
        this.b(new jdg(this, jjq2, 5, null));
    }

    @Override
    public final void e() {
        if (this.b) {
            this.a.e();
            return;
        }
        this.b(new iuk(this, 18));
    }
}

