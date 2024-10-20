/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class jdc
extends fvc {
    public volatile boolean a;
    public List b = new ArrayList();
    public final fvc c;

    public jdc(fvc fvc2) {
        super((short[])null);
        this.c = fvc2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void aI(Runnable runnable) {
        synchronized (this) {
            if (!this.a) {
                this.b.add(runnable);
                return;
            }
        }
        runnable.run();
    }

    @Override
    public final void W(iwx iwx2) {
        if (this.a) {
            this.c.W(iwx2);
            return;
        }
        this.aI(new hsk((Object)this, (Object)iwx2, 19, null));
    }

    @Override
    public final void X(Object object) {
        if (this.a) {
            this.c.X(object);
            return;
        }
        this.aI(new hsk((Object)this, object, 20, null));
    }

    @Override
    public final void Y() {
        if (this.a) {
            this.c.Y();
            return;
        }
        this.aI(new iuk(this, 9));
    }

    @Override
    public final void a(iyh iyh2, iwx iwx2) {
        this.aI(new hst((Object)this, (Object)iyh2, (Object)iwx2, 10));
    }
}

