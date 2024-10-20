/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class dba
implements dau {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ dba(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public final void a(Object object) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                Object object2 = ((dwm)this.b).d;
                                ((dgw)object).f(((den)this.a).o(), ((AtomicBoolean)object2).get());
                                return;
                            }
                            object = (bzq)object;
                            n2 = dfu.i;
                            Object object3 = this.b;
                            ((bzq)object).r((String)this.a, (Throwable)object3);
                            return;
                        }
                        object = (bzq)object;
                        Object object4 = this.b;
                        ((bzq)object).p((String)this.a, (Throwable)object4);
                        return;
                    }
                    object = (bzq)object;
                    Object object5 = this.b;
                    ((bzq)object).i((String)this.a, (Throwable)object5);
                    return;
                }
                bzq bzq2 = (bzq)object;
                object = this.b;
                bzq2.r((String)this.a, (Throwable)object);
                return;
            }
            object = (bzq)object;
            Object object6 = this.b;
            ((bzq)object).p((String)this.a, (Throwable)object6);
            return;
        }
        object = (bzq)object;
        Object object7 = this.b;
        ((bzq)object).i((String)this.a, (Throwable)object7);
    }
}

