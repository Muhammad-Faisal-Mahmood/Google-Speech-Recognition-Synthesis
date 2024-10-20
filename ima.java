/*
 * Decompiled with CFR 0.152.
 */
public final class ima
implements img,
iku {
    private static final Object a = new Object();
    private volatile img b;
    private volatile Object c = a;

    private ima(img img2) {
        this.b = img2;
    }

    public static iku a(img img2) {
        if (img2 instanceof iku) {
            return (iku)((Object)img2);
        }
        idi.l(img2);
        return new ima(img2);
    }

    public static iku c(jnu jnu2) {
        return ima.a(idi.j(jnu2));
    }

    public static img d(img img2) {
        idi.l(img2);
        if (img2 instanceof ima) {
            return img2;
        }
        return new ima(img2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object e() {
        synchronized (this) {
            Object object = this.c;
            Object object2 = a;
            if (object != object2) {
                return object;
            }
            object = this.b.b();
            Object object3 = this.c;
            if (object3 != object2 && object3 != object) {
                object2 = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(" & ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(". This is likely due to a circular dependency.");
                IllegalStateException illegalStateException = new IllegalStateException(((StringBuilder)object2).toString());
                throw illegalStateException;
            }
            this.c = object;
            this.b = null;
            return object;
        }
    }

    @Override
    public final Object b() {
        Object object;
        Object object2 = object = this.c;
        if (object == a) {
            object2 = this.e();
        }
        return object2;
    }
}

