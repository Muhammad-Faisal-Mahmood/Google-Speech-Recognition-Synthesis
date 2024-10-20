/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class bkn
implements bkz {
    public final bko a;
    public final bli b;
    public final List c;

    public /* synthetic */ bkn(bko bko2, bli bli2, List list) {
        this.a = bko2;
        this.b = bli2;
        this.c = list;
    }

    @Override
    public final void a(bla bla2, boolean bl2) {
        if (bl2) {
            List list = this.c;
            bko bko2 = this.a;
            bla bla3 = bko2.a;
            if (bla3 != null) {
                bli bli2 = this.b;
                bla3.a(false);
                bli2.notifyItemChanged(list.indexOf(bko2.a));
            }
            bko2.a = bla2;
            bko2.b = list.indexOf(bko2.a);
            if (bko2.c) {
                bko2.c();
            }
        }
    }
}

