/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 */
public final class gjq
extends iva {
    final gqn a;
    final String b;

    public gjq(itz itz2, String string, gqn gqn2) {
        super(itz2);
        this.b = string;
        this.a = gqn2;
    }

    @Override
    public final void a(fvc object, iwx iwx2) {
        object = new fbx(this, object, iwx2, 13, null);
        gqn.d(this.a, (Runnable)object).run();
    }

    public final /* synthetic */ void b(fvc fvc2, iwx iwx2) {
        gol gol2 = fxf.as(this.b, gqv.a);
        try {
            hqa hqa2 = new hqa();
            gol2.a(hqa2);
            gjr gjr2 = new gjr(fvc2, hqa2);
            super.a(gjr2, iwx2);
            return;
        }
        finally {
            gol2.close();
        }
    }
}

