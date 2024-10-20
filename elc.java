/*
 * Decompiled with CFR 0.152.
 */
public final class elc
extends jqs
implements jro {
    final Object a;
    private Object b;
    private final int c;

    public elc(eie eie2, jqb jqb2, int n2) {
        this.c = n2;
        this.a = eie2;
        super(2, jqb2);
    }

    public elc(eli eli2, jqb jqb2, int n2) {
        this.c = n2;
        this.a = eli2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        block7: {
            boolean bl2;
            block8: {
                boolean bl3;
                Object var6_4;
                block6: {
                    int n2 = this.c;
                    var6_4 = null;
                    if (n2 == 0) break block7;
                    jns.ak(object);
                    object = (jvb)this.b;
                    boolean bl4 = euf.r(((eie)this.a).b);
                    bl2 = bl3 = false;
                    if (!bl4) break block8;
                    object = this.a;
                    object = ((eie)object).f;
                    if (object == null) break block6;
                    try {
                        object = object.isEnabled();
                    }
                    catch (Throwable throwable) {
                        object = jns.aj(throwable);
                    }
                }
                object = null;
                if (object instanceof jod) {
                    object = var6_4;
                }
                bl2 = bl3;
                if (jse.i(object, true)) {
                    bl2 = bl3;
                    if (((eie)this.a).d.isBluetoothScoAvailableOffCall()) {
                        bl2 = true;
                    }
                }
            }
            return bl2;
        }
        jns.ak(object);
        object = (jvb)this.b;
        jse.ah((jvb)object, null, null, new aus((eli)this.a, null, 15), 3);
        jse.ah((jvb)object, null, null, new aus((eli)this.a, null, 16, null), 3);
        jse.ah((jvb)object, null, null, new aus((eli)this.a, null, 17, null), 3);
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        if (this.c != 0) {
            object = ((jqm)this).c((jvb)object, (jqb)object2);
            object2 = jon.a;
            return ((elc)object).a(object2);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((elc)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        if (this.c != 0) {
            jqb2 = new elc((eie)this.a, jqb2, 1);
            ((elc)jqb2).b = object;
            return jqb2;
        }
        jqb2 = new elc((eli)this.a, jqb2, 0);
        ((elc)jqb2).b = object;
        return jqb2;
    }
}

