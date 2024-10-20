/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class aup {
    private final aum a;
    private final AtomicBoolean b;
    private final jny c;

    public aup(aum aum2) {
        this.a = aum2;
        this.b = new AtomicBoolean(false);
        this.c = new jog(new mq(this, 8));
    }

    private final axc b() {
        return (axc)this.c.a();
    }

    protected abstract String a();

    public final axc d() {
        this.a.i();
        axc axc2 = this.b.compareAndSet(false, true) ? this.b() : this.e();
        return axc2;
    }

    public final axc e() {
        aum aum2 = this.a;
        aum2.i();
        aum2.j();
        return aum2.d().b().k(this.a());
    }

    public final void f(axc axc2) {
        jse.e(axc2, "statement");
        if (axc2 == this.b()) {
            this.b.set(false);
        }
    }
}

