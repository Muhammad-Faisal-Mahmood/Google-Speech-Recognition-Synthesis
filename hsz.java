/*
 * Decompiled with CFR 0.152.
 */
public final class hsz
implements iua {
    private final jnu a;
    private final Class b;
    private final Class c;

    public hsz(jnu jnu2, Class clazz, Class clazz2) {
        this.a = jnu2;
        this.b = clazz;
        this.c = clazz2;
    }

    @Override
    public final itz a(ixb object, itw itw2, itx itx2) {
        try {
            Object object2 = this.a.b();
            idi.E((ixb)object, this.b, true);
            idi.E((ixb)object, this.c, false);
            hte hte2 = new hte(itx2, (ixb)object, itw2, (gzx)object2);
            object = new htj(hte2);
            return object;
        }
        catch (iyi iyi2) {
            return new hud(iyh.c(iyi2));
        }
    }
}

