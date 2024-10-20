/*
 * Decompiled with CFR 0.152.
 */
public class acl
implements ack {
    public static acl c;
    public static final acq d;

    static {
        d = acn.a;
    }

    @Override
    public ach a(Class clazz) {
        jse.e(clazz, "modelClass");
        return wg.d(clazz);
    }

    @Override
    public ach b(Class clazz, acr acr2) {
        jse.e(clazz, "modelClass");
        return this.a(clazz);
    }

    @Override
    public final ach c(jta jta2, acr acr2) {
        return this.b(jsd.c(jta2), acr2);
    }
}

