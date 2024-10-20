/*
 * Decompiled with CFR 0.152.
 */
final class jde
extends jdi {
    public final iwc a;
    final jdf b;
    private final ius g;
    private final iuc[] h;

    public jde(jdf jdf2, iwc iwc2, iuc[] iucArray) {
        this.b = jdf2;
        this.g = ius.k();
        this.a = iwc2;
        this.h = iucArray;
    }

    @Override
    public final void b(jeh jeh2) {
        if (this.a.a.h()) {
            jeh2.a("wait_for_ready");
        }
        super.b(jeh2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(iyh object) {
        super.c((iyh)object);
        object = this.b.a;
        synchronized (object) {
            jdf jdf2 = this.b;
            if (jdf2.e != null) {
                boolean bl2 = jdf2.g.remove(this);
                if (!this.b.e() && bl2) {
                    jdf2 = this.b;
                    jdf2.b.b(jdf2.d);
                    if (this.b.h.a != null) {
                        jdf2 = this.b;
                        jdf2.b.b(jdf2.e);
                        this.b.e = null;
                    }
                }
            }
        }
        this.b.b.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Runnable p(jcm object) {
        ius ius2;
        block7: {
            ius2 = this.g.a();
            iwc iwc2 = this.a;
            object = object.b(iwc2.c, iwc2.b, iwc2.a, this.h);
            if (this.e == null) break block7;
            return null;
        }
        a.s(object, "stream");
        super.t((jcj)object);
        object = this.d;
        if (object == null) {
            this.f = null;
            this.c = true;
        }
        // MONITOREXIT : this
        if (object == null) return null;
        super.s((jcl)object);
        return new iuk(this, 15);
        finally {
            this.g.f(ius2);
        }
    }

    @Override
    protected final void q() {
        iuc[] iucArray;
        for (int i2 = 0; i2 < (iucArray = this.h).length; ++i2) {
            iucArray[i2].h();
        }
    }
}

