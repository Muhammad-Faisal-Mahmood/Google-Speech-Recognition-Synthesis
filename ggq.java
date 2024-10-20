/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class ggq
implements gfo {
    private final AtomicReference a;

    public ggq(Map map, gft gft2) {
        jse.e(map, "map");
        jse.e(gft2, "metadata");
        this.a = new AtomicReference<ggp>(new ggp(map, gft2, false));
    }

    @Override
    public final gex a(String object, jrk jrk2) {
        Object object2;
        block4: {
            ggp ggp2;
            jse.e(object, "experimentId");
            Object object3 = null;
            do {
                ggp2 = (ggp)this.a.get();
                object2 = ggp2;
                if (ggp2.b) break block4;
                if (object3 == null) {
                    object2 = new ggp(ggp2.c, ggp2.a, true);
                } else {
                    object2 = ggp2.c;
                    jse.e(object2, "<set-?>");
                    ((ggp)object3).c = object2;
                    object2 = ggp2.a;
                    jse.e(object2, "<set-?>");
                    ((ggp)object3).a = object2;
                    object2 = object3;
                }
                object3 = object2;
            } while (!a.l(this.a, ggp2, object2));
            if (!ggp2.b) {
                jrk2.a(ggp2.a);
            }
        }
        object = jjj.G(((ggp)object2).c, object);
        jse.d(object, "getValue(...)");
        return (gex)object;
    }

    @Override
    public final gft b() {
        return ((ggp)this.a.get()).a;
    }

    @Override
    public final void c() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e(Map map, gft gft2) {
        block2: {
            ggp ggp2;
            ggp ggp3;
            jse.e(map, "newExperimentValues");
            ggp ggp4 = null;
            do {
                ggp3 = (ggp)this.a.get();
                if (ggp3.b) break block2;
                ggp2 = ggp4;
                if (ggp4 == null) {
                    ggp2 = new ggp(map, gft2, false);
                }
                ggp4 = ggp2;
            } while (!a.l(this.a, ggp3, ggp2));
            return true;
        }
        return false;
    }
}

