/*
 * Decompiled with CFR 0.152.
 */
public final class jux {
    public static final jqf a(jqf jqf2, jqf jqf3) {
        if (!jux.e(jqf3)) {
            return jqf2.plus(jqf3);
        }
        return jux.d(jqf2, jqf3, false);
    }

    public static final jqf b(jvb object, jqf jqf2) {
        jqf2 = jux.d(object.bA(), jqf2, true);
        object = jve.a ? jqf2.plus(new juz(jve.c.incrementAndGet())) : jqf2;
        if (jqf2 != jvo.a && jqf2.get(jqc.b) == null) {
            return object.plus(jvo.a);
        }
        return object;
    }

    public static final jxh c(jqb object, jqf jqf2, Object object2) {
        boolean bl2 = object instanceof jqp;
        Object object3 = null;
        Object var5_5 = null;
        if (!bl2) {
            return null;
        }
        if (jqf2.get(jxi.a) != null) {
            block6: {
                do {
                    if (object instanceof jvl) {
                        object = var5_5;
                        break block6;
                    }
                    object3 = object.bx();
                    if (object3 == null) {
                        object = var5_5;
                        break block6;
                    }
                    object = object3;
                } while (!(object3 instanceof jxh));
                object = (jxh)object3;
            }
            object3 = object;
            if (object != null) {
                ((jxh)object).R(jqf2, object2);
                object3 = object;
            }
        }
        return object3;
    }

    private static final jqf d(jqf jqf2, jqf jqf3, boolean bl2) {
        boolean bl3 = jux.e(jqf2);
        boolean bl4 = jux.e(jqf3);
        if (!bl3 && !bl4) {
            return jqf2.plus(jqf3);
        }
        jsj jsj2 = new jsj();
        jsj2.a = jqf3;
        jqf2 = (jqf)jqf2.fold(jqg.a, new juw(jsj2, bl2));
        if (bl4) {
            jsj2.a = ((jqf)jsj2.a).fold(jqg.a, ghk.e);
        }
        return jqf2.plus((jqf)jsj2.a);
    }

    private static final boolean e(jqf jqf2) {
        return (Boolean)jqf2.fold(false, ghk.f);
    }
}

