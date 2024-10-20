/*
 * Decompiled with CFR 0.152.
 */
public final class jwq {
    public static final kbt a = new kbt("COMPLETING_ALREADY");
    public static final kbt b = new kbt("COMPLETING_WAITING_CHILDREN");
    public static final kbt c = new kbt("COMPLETING_RETRY");
    public static final kbt d = new kbt("TOO_LATE_TO_CANCEL");
    public static final kbt e = new kbt("SEALED");
    public static final jvs f = new jvs(false);
    public static final jvs g = new jvs(true);

    public static final Object a(Object object) {
        if (object instanceof jwe) {
            return new jwf((jwe)object);
        }
        return object;
    }

    public static final Object b(Object object) {
        Object object2 = object instanceof jwf ? (jwf)object : null;
        Object object3 = object;
        if (object2 != null) {
            object2 = ((jwf)object2).a;
            object3 = object;
            if (object2 != null) {
                object3 = object2;
            }
        }
        return object3;
    }
}

