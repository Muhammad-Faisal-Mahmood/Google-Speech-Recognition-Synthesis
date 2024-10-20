/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class hsu
extends itz {
    public final Queue a;
    public itz b = null;
    public boolean c = false;
    public fvc d;
    private final hpn e;
    private final Executor f = new hpz((Executor)hom.a);

    public hsu(hpn hpn2) {
        this.a = new ArrayDeque();
        this.e = hpn2;
    }

    private final void b(Runnable runnable) {
        runnable = gqk.i(new hsk(this, runnable, 2));
        this.f.execute(runnable);
    }

    @Override
    public final void a(fvc fvc2, iwx iwx2) {
        this.d = fvc2;
        ena ena2 = new ena((Object)this, (Object)fvc2, 11, null);
        Executor executor = this.f;
        fxf.al(this.e, ena2, executor);
        this.b(new hst(this, (Object)fvc2, (Object)iwx2, 2));
    }

    @Override
    public final void c(String string, Throwable throwable) {
        this.b(new hst(this, (Object)string, (Object)throwable, 0));
    }

    @Override
    public final void d() {
        this.b(new gjf(this, 18));
    }

    @Override
    public final void e(int n2) {
        this.b(new cdw((Object)this, n2, 6, null));
    }

    @Override
    public final void f(Object object) {
        this.b(new hsk(this, object, 3));
    }

    public final String toString() {
        String string = super.toString();
        String string2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("delegate=[");
        stringBuilder.append(string2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

