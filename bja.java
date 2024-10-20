/*
 * Decompiled with CFR 0.152.
 */
public final class bja
implements jyx {
    final Object a;
    private final int b;

    public bja(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object a(jyy object, jqb object2) {
        if (this.b != 0) {
            Object object3 = this.a;
            Object object4 = new mq(object3, 13);
            bex bex2 = new bex(null);
            object4 = new kaa((jyx[])object3, (jqz)object4, bex2, (jyy)object, null);
            object = new kac(object2.d(), (jqb)object2);
            object4 = jse.aj((kbq)object, object, (jro)object4);
            if (object4 == jqh.a) {
                jsd.j(object2);
            }
            object2 = jqh.a;
            object = object4;
            if (object4 != object2) {
                object = jon.a;
            }
            if (object == object2) {
                return object;
            }
            return jon.a;
        }
        object = new biz((jyy)object);
        if ((object = this.a.a((jyy)object, (jqb)object2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }
}

