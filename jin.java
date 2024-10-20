/*
 * Decompiled with CFR 0.152.
 */
public final class jin
implements ium {
    final Object a;
    private final int b;

    public jin(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(ius object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                object = kmp.R((ius)object);
                if (iyh.e.n.equals((Object)((iyh)object).n)) {
                    this.a.c((iyh)object);
                }
                return;
            }
            Object object2 = this.a;
            object = ((ius)object).c();
            ((iul)object2).j((Throwable)object);
            return;
        }
        if (((ius)object).c() != null) {
            jip.g(((jio)this.a).a);
        }
    }
}

