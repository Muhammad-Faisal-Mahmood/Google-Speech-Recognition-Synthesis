/*
 * Decompiled with CFR 0.152.
 */
public final class dbd
implements dau {
    public final ddn a;
    public final ded b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ dbd(ddn ddn2, ded ded2, String string, dhu dhu2, int n2) {
        this.e = n2;
        this.a = ddn2;
        this.b = ded2;
        this.c = string;
        this.d = dhu2;
    }

    public /* synthetic */ dbd(ddn ddn2, ded ded2, String string, Throwable throwable, int n2) {
        this.e = n2;
        this.a = ddn2;
        this.b = ded2;
        this.d = string;
        this.c = throwable;
    }

    public /* synthetic */ dbd(ddn ddn2, String string, ded ded2, Exception exception, int n2) {
        this.e = n2;
        this.a = ddn2;
        this.c = string;
        this.b = ded2;
        this.d = exception;
    }

    public /* synthetic */ dbd(ddn ddn2, String string, ded ded2, Throwable throwable, int n2) {
        this.e = n2;
        this.a = ddn2;
        this.d = string;
        this.b = ded2;
        this.c = throwable;
    }

    @Override
    public final void a(Object object) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        dgw dgw2 = (dgw)object;
                        Object object2 = this.c;
                        ded ded2 = this.b;
                        object = this.d;
                        dgw2.b(this.a, (String)object, ded2, (Throwable)object2);
                        return;
                    }
                    dgw dgw3 = (dgw)object;
                    Object object3 = this.d;
                    object = this.b;
                    Object object4 = this.c;
                    dgw3.b(this.a, (String)object4, (ded)object, (Throwable)object3);
                    return;
                }
                bzq bzq2 = (bzq)object;
                Object object5 = this.c;
                Object object6 = this.d;
                object = this.b;
                bzq2.s(this.a, (ded)object, (String)object6, (Throwable)object5);
                return;
            }
            object = (bzq)object;
            Object object7 = this.c;
            Object object8 = this.d;
            ded ded3 = this.b;
            ((bzq)object).t(this.a, ded3, (String)object8, (Throwable)object7);
            return;
        }
        bzq bzq3 = (bzq)object;
        Object object9 = this.d;
        Object object10 = this.c;
        object = this.b;
        bzq3.l(this.a, (ded)object, (String)object10, (dhu)object9);
    }
}

