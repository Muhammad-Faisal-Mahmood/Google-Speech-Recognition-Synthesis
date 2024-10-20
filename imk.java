/*
 * Decompiled with CFR 0.152.
 */
public final class imk
implements img {
    private static final Object a = new Object();
    private volatile img b;
    private volatile Object c = a;

    private imk(img img2) {
        this.b = img2;
    }

    public static img a(img img2) {
        if (!(img2 instanceof imk) && !(img2 instanceof ima)) {
            idi.l(img2);
            return new imk(img2);
        }
        return img2;
    }

    @Override
    public final Object b() {
        Object object;
        Object object2 = object = this.c;
        if (object == a) {
            object2 = this.b;
            if (object2 == null) {
                object2 = this.c;
            } else {
                this.c = object2 = object2.b();
                this.b = null;
            }
        }
        return object2;
    }
}

