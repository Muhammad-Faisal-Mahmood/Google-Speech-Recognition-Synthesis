/*
 * Decompiled with CFR 0.152.
 */
public final class aci
implements jny {
    private final jta a;
    private final jqz b;
    private final jqz c;
    private final jqz d;
    private ach e;

    public aci(jta jta2, jqz jqz2, jqz jqz3, jqz jqz4) {
        this.a = jta2;
        this.b = jqz2;
        this.c = jqz3;
        this.d = jqz4;
    }

    @Override
    public final /* synthetic */ Object a() {
        Object object;
        Object object2 = object = this.e;
        if (object == null) {
            object2 = this.b;
            Object object3 = this.c;
            object = this.d;
            object2 = object2.a();
            object3 = object3.a();
            object = object.a();
            jse.e(object2, "store");
            jse.e(object3, "factory");
            object = (acr)object;
            this.e = object2 = new acn((bzb)object2, (ack)object3, (acr)object).b(this.a);
        }
        return object2;
    }

    @Override
    public final boolean b() {
        throw null;
    }
}

