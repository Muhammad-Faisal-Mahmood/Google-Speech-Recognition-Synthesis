/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class jix
extends jcw {
    final iul a;
    final hqa b;
    final iwx c;
    final jje d;
    final jiu e;

    public jix(iul iul2, hqa hqa2, iwx iwx2, jje jje2, jiu jiu2) {
        this.a = iul2;
        this.b = hqa2;
        this.c = iwx2;
        this.d = jje2;
        this.e = jiu2;
        super(iul2);
    }

    @Override
    public final void a() {
        int n2 = jnr.a;
        jjf jjf2 = jja.c;
        if (this.b.isCancelled()) {
            return;
        }
        try {
            Object object = (ksb)hhk.S(this.b);
            Object object2 = this.c;
            object2 = ((ksb)object).b.a((ixx)((ksb)object).a, (iwx)object2);
            Object object3 = ((ksb)object).a;
            object = ((jip)object3).b;
            object2 = new jio((jip)object3, (kmp)object2, (iul)object);
            this.e.g((jjf)object2);
            ((ius)this.a).d(new jin(this.d, 2), (Executor)hom.a);
            return;
        }
        catch (Throwable throwable) {
            try {
                jje jje2 = this.d;
                Object object = iyh.c(throwable);
                iwx iwx2 = new iwx();
                jje2.e((iyh)object, iwx2);
                this.a.j(null);
                object = new IllegalStateException(throwable);
                throw object;
            }
            catch (Throwable throwable2) {
                this.e.g(jjf2);
                throw throwable2;
            }
        }
    }
}

