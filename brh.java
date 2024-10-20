/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class brh
implements ila,
ilv {
    private img a;
    private img b;
    private img c;
    private img d;
    private final brg e;

    public brh() {
        throw null;
    }

    public brh(brg brg2, abw object) {
        this.e = brg2;
        imb imb2 = imc.a(object);
        this.a = imb2;
        this.b = new flj(imb2, 6);
        img img2 = brg2.c;
        object = brg2.h;
        this.c = new egt(imb2, img2, (jnu)object, 15);
        this.d = new egt((jnu)brg2.a, (jnu)brg2.l, (jnu)object, 17, null);
    }

    @Override
    public final Map a() {
        return hcy.a;
    }

    @Override
    public final Map b() {
        return new imd(hac.m(this.b, this.c, this.d));
    }
}

