/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Future;

public final class cud
implements hnx {
    public final cuq a;
    public final hpn b;
    public final hpn c;
    public final ctq d;
    public final boolean e;
    public final csu f;
    public final String g;

    public /* synthetic */ cud(cuq cuq2, hpn hpn2, hpn hpn3, ctq ctq2, boolean bl2, csu csu2, String string) {
        this.a = cuq2;
        this.b = hpn2;
        this.c = hpn3;
        this.d = ctq2;
        this.e = bl2;
        this.f = csu2;
        this.g = string;
    }

    @Override
    public final hpn a() {
        Object object = this.b;
        if (((gto)hhk.S((Future)object)).g()) {
            object = hhk.K(new cvk((hpn)((gto)hhk.S((Future)object)).c()));
        } else {
            object = this.c;
            if (((gto)hhk.S((Future)object)).g()) {
                object = hhk.K(new cvk((hpn)((gto)hhk.S((Future)object)).c()));
            } else {
                object = this.g;
                csu csu2 = this.f;
                boolean bl2 = this.e;
                ctq ctq2 = this.d;
                cuq cuq2 = this.a;
                object = fxf.ak(fxf.ak(cuq2.c.e(ctq2, false), new bpu(cuq2, ctq2, 9, null), cuq2.d), new cug(cuq2, ctq2, bl2, csu2, (String)object), cuq2.d);
            }
        }
        return object;
    }
}

