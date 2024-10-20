/*
 * Decompiled with CFR 0.152.
 */
final class hsl
extends ixn {
    final hsm a;
    private iwx b;

    public hsl(hsm hsm2, fvc fvc2) {
        this.a = hsm2;
        super(fvc2);
    }

    @Override
    public final void W(iwx iwx2) {
        this.b = iwx2;
    }

    @Override
    public final void X(Object object) {
        iwx iwx2 = this.b;
        if (iwx2 != null) {
            this.g.W(iwx2);
            this.b = null;
        }
        this.g.X(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(iyh object, iwx iterator) {
        Object object2 = ((iyh)object).n;
        if (!object2.equals((Object)iye.q) && !object2.equals((Object)iye.h)) {
            object2 = this.b;
            if (object2 != null) {
                this.g.W((iwx)object2);
                this.b = null;
            }
            this.g.a((iyh)object, (iwx)((Object)iterator));
            return;
        }
        iterator = this.a;
        object = ((hsm)((Object)iterator)).a;
        synchronized (object) {
            ((hsm)((Object)iterator)).c = ((hsm)((Object)iterator)).d.a(((hsm)((Object)iterator)).e, ((hsm)((Object)iterator)).f.f(hrm.a, true));
            iterator = ((hsm)((Object)iterator)).b.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
            return;
        }
    }
}

