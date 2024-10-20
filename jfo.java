/*
 * Decompiled with CFR 0.152.
 */
final class jfo
extends jdd {
    final ius c;
    final ixb d;
    final itw e;
    final jfp f;
    private final long g;

    public jfo(jfp itx2, ius ius2, ixb ixb2, itw itw2) {
        this.f = itx2;
        itx2 = ((jfp)itx2).c;
        super(((jfs)itx2).e(itw2), ((jfs)itx2).j, itw2.b);
        this.c = ius2;
        this.d = ixb2;
        this.e = itw2;
        this.g = System.nanoTime();
    }

    @Override
    protected final void b() {
        jel jel2 = new jel(this, 13);
        this.f.c.m.execute(jel2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void j() {
        Object object;
        Object object2;
        block8: {
            block7: {
                object2 = this.c.a();
                object = this.e.f(iuc.f, System.nanoTime() - this.g);
                object = this.f.c(this.d, (itw)object);
                if (this.b == null) break block7;
                object2 = null;
                break block8;
            }
            super.i((itz)object);
            // MONITOREXIT : this
            object2 = new jcy(this, this.a);
        }
        if (object2 == null) {
            object2 = this.f;
            object = new jel(this, 13);
            ((jfp)object2).c.m.execute((Runnable)object);
            return;
        }
        object = this.f;
        itw itw2 = this.e;
        ((jfp)object).c.e(itw2).execute(new jdg(this, object2, 14, null));
        return;
        finally {
            this.c.f((ius)object2);
        }
    }
}

