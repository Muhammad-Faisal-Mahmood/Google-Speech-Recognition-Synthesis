/*
 * Decompiled with CFR 0.152.
 */
final class jbb
implements Runnable {
    final jba a;
    final String b;
    final iwx c;
    final ixb d;
    final jjo e;
    final itw f;
    final jbc g;

    public jbb(jbc jbc2, String string, iwx iwx2, ixb ixb2, jjo jjo2, itw itw2) {
        this.b = string;
        this.c = iwx2;
        this.d = ixb2;
        this.e = jjo2;
        this.f = itw2;
        this.g = jbc2;
        this.a = new jba(string, jbc2.a, jbc2.e, iwx2, jbc2, this, jbc2.c, jbc2.f, ixb2, jjo2, itw2, jbc2.g);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = this.g.c;
        synchronized (object) {
            Object object2 = this.g;
            if (((jbc)object2).j) {
                jaz jaz2 = this.a.o;
                object2 = ((jbc)object2).k;
                iwx iwx2 = new iwx();
                jaz2.l((iyh)object2, true, iwx2);
            } else {
                if (!((jbc)object2).l) {
                    AssertionError assertionError = new AssertionError((Object)"Transport is not started");
                    throw assertionError;
                }
                Object object3 = this.a;
                ((jbc)object2).d.add(object3);
                object3 = ((jba)object3).o;
                ((jaz)object3).h.p = object2 = ((jbc)object2).i;
            }
            return;
        }
    }
}

