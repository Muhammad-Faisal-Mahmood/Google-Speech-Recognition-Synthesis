/*
 * Decompiled with CFR 0.152.
 */
public final class kat {
    public static final kbt a = new kbt("CLOSED");

    public static final Object a(kau object, long l2, jro jro2) {
        while (true) {
            kbt kbt2;
            kau kau2 = object;
            if (kau2.b >= l2 && !kau2.i()) {
                return object;
            }
            Object object2 = kau2.a();
            if (object2 == (kbt2 = a)) {
                return kbt2;
            }
            if ((object2 = (kau)object2) != null) {
                object = object2;
                continue;
            }
            object2 = jro2.b(kau2.b + 1L, object);
            if (!kau2.a.d(null, object2)) continue;
            object = object2;
            if (!kau2.i()) continue;
            kau2.e();
            object = object2;
        }
    }
}

