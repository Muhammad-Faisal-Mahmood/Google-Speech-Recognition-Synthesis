/*
 * Decompiled with CFR 0.152.
 */
public final class cob
implements imb {
    private final jnu a;
    private final jnu b;
    private final int c;

    public cob(jnu jnu2, jnu jnu3, int n2) {
        this.c = n2;
        this.a = jnu2;
        this.b = jnu3;
    }

    public final hpr a() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object = (gto)((imc)this.b).a;
                object = cgw.m(this.a, (gto)object);
                idi.m(object);
                return object;
            }
            Object object = (gto)((imc)this.b).a;
            object = cgw.m(this.a, (gto)object);
            idi.m(object);
            return object;
        }
        Object object = (gto)((imc)this.b).a;
        object = cgw.m(this.a, (gto)object);
        idi.m(object);
        return object;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                return this.a();
            }
            return this.a();
        }
        return this.a();
    }
}

