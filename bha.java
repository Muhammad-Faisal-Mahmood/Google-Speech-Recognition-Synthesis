/*
 * Decompiled with CFR 0.152.
 */
public final class bha
implements bgw {
    public final aum a;
    public final aup b;
    private final aup c;

    public bha(aum aum2) {
        this.a = aum2;
        new bgx(aum2);
        this.c = new bgy(aum2);
        this.b = new bgz(aum2);
    }

    /*
     * Loose catch block
     */
    @Override
    public final void a(String string) {
        this.a.j();
        axc axc2 = this.c.d();
        axc2.g(1, string);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.c.f(axc2);
        }
    }
}

