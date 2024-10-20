/*
 * Decompiled with CFR 0.152.
 */
public final class kbv {
    public static final kbt a = new kbt("NO_THREAD_ELEMENTS");
    private static final jro b = ghk.i;
    private static final jro c = ghk.j;
    private static final jro d = ghk.k;

    public static final Object a(jqf object) {
        object = object.fold(0, b);
        jse.b(object);
        return object;
    }

    public static final Object b(jqf object, Object object2) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = kbv.a((jqf)object);
        }
        if (object3 == Integer.valueOf(0)) {
            object = a;
        } else if (object3 instanceof Integer) {
            object = object.fold(new kby((jqf)object, ((Number)object3).intValue()), d);
        } else {
            jse.c(object3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            object = ((jxb)object3).a((jqf)object);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void c(jqf jqf2, Object object) {
        if (object == a) return;
        if (object instanceof kby) {
            kby kby2 = (kby)object;
            int n2 = kby2.c.length - 1;
            if (n2 < 0) return;
            while (true) {
                int n3 = n2 - 1;
                object = kby2.c[n2];
                jse.b(object);
                object.b(jqf2, kby2.b[n2]);
                if (n3 < 0) return;
                n2 = n3;
            }
        }
        Object object2 = jqf2.fold(null, c);
        jse.c(object2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((jxb)object2).b(jqf2, object);
    }
}

