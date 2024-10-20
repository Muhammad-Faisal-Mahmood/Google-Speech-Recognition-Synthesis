/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class cug
implements hny {
    public final cuq a;
    public final ctq b;
    public final boolean c;
    public final csu d;
    public final String e;

    public /* synthetic */ cug(cuq cuq2, ctq ctq2, boolean bl2, csu csu2, String string) {
        this.a = cuq2;
        this.b = ctq2;
        this.c = bl2;
        this.d = csu2;
        this.e = string;
    }

    @Override
    public final hpn a(Object object) {
        Object object2 = (cxs)object;
        object = ((cxs)object2).a;
        if (object != null) {
            object = hhk.K(new cvl((cth)object));
        } else {
            object = this.d;
            boolean bl2 = this.c;
            Object object3 = this.b;
            cth cth2 = ((cxs)object2).b;
            if (cth2 == null) {
                object2 = css.a();
                ((kqr)object2).b = csr.q;
                ((kqr)object2).c = "Nothing to download for file group: ".concat(String.valueOf(((ctq)object3).c));
                object3 = ((kqr)object2).a();
                if (bl2) {
                    ((csv)((csu)object).g.c()).b((Throwable)object3);
                }
                object = hhk.J((Throwable)object3);
            } else {
                object2 = this.a;
                if (bl2) {
                    ((daa)((cuq)object2).e.c()).g(((csu)object).a, (csv)((csu)object).g.c());
                    bl2 = true;
                } else {
                    bl2 = false;
                }
                String string = this.e;
                object = dah.e(cuq.q(cth2, cuq.o((ctq)object3, cth2), null, 2, false, ((csu)object).i, ((cuq)object2).c, ((cuq)object2).d, ((cuq)object2).k)).f(new ain(12), ((cuq)object2).d).f(new cue((cuq)object2, bl2, (csu)object, string), ((cuq)object2).d);
                object3 = new cul((cuq)object2, bl2, string);
                object2 = ((cuq)object2).d;
                fxf.al(((hoz)object).b, (hpb)object3, (Executor)object2);
                object = ((dah)object).f(new ain(9), (Executor)hom.a);
            }
        }
        return object;
    }
}

