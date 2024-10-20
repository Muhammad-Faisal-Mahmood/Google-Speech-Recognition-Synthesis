/*
 * Decompiled with CFR 0.152.
 */
public final class fnl
implements fnw {
    private final int a;

    public fnl(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(foo object) {
        block15: {
            switch (this.a) {
                default: {
                    if (object instanceof fok) {
                        object = (fok)object;
                        break;
                    }
                    break block15;
                }
                case 6: {
                    if (object instanceof fom) {
                        ((fom)object).a();
                    }
                    return;
                }
                case 5: {
                    fnx.J((foo)object);
                    return;
                }
                case 4: {
                    if (object instanceof fnr) {
                        ((fnr)object).a();
                    }
                    return;
                }
                case 3: {
                    fnv.i((foo)object);
                    return;
                }
                case 2: {
                    if (object instanceof fno) {
                        ((fno)object).a();
                    }
                    return;
                }
                case 1: {
                    if (object instanceof fnb) {
                        ((fnb)object).a();
                    }
                    return;
                }
                case 0: {
                    if (object instanceof fms) {
                        ((fms)object).a();
                    }
                    return;
                }
            }
            object.a();
        }
    }
}

