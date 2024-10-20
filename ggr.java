/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class ggr
implements gfo {
    private volatile gft a;
    private hac b;
    private boolean c;
    private hth d;

    public ggr(Map map, gft gft2) {
        jse.e(map, "initialValues");
        jse.e(gft2, "metadata");
        this.a = gft2;
        this.b = fvd.U(map);
    }

    @Override
    public final gex a(String object, jrk jrk2) {
        jse.e(object, "experimentId");
        fpk.c();
        object = jjj.G(this.b, object);
        jse.d(object, "getValue(...)");
        object = (gex)object;
        if (!this.c) {
            jrk2.a(this.a);
        }
        this.c = true;
        return object;
    }

    @Override
    public final gft b() {
        return this.a;
    }

    @Override
    public final void c() {
        fpk.c();
        hth hth2 = this.d;
        jse.b(hth2);
        this.b = (hac)hth2.b;
        hth2 = this.d;
        jse.b(hth2);
        this.a = (gft)hth2.a;
        this.c = false;
        this.d = null;
    }

    @Override
    public final boolean d() {
        fpk.c();
        return this.d != null;
    }

    @Override
    public final boolean e(Map map, gft gft2) {
        boolean bl2;
        jse.e(map, "newExperimentValues");
        fpk.c();
        map = fvd.U(map);
        if (this.c) {
            this.d = new hth((hac)map, gft2);
            bl2 = false;
        } else {
            this.b = map;
            this.a = gft2;
            bl2 = true;
        }
        return bl2;
    }
}

