/*
 * Decompiled with CFR 0.152.
 */
public final class ilz
implements imb {
    private img a;

    public static void a(ilz ilz2, img img2) {
        idi.l(img2);
        if (ilz2.a == null) {
            ilz2.a = img2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object b() {
        img img2 = this.a;
        if (img2 != null) {
            return img2.b();
        }
        throw new IllegalStateException();
    }
}

