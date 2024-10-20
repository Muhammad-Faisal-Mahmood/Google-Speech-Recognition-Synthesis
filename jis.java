/*
 * Decompiled with CFR 0.152.
 */
final class jis
extends jcw {
    final jjq a;
    final jiu b;

    public jis(jiu jiu2, jjq jjq2) {
        this.a = jjq2;
        this.b = jiu2;
        super(jiu2.a);
    }

    /*
     * Loose catch block
     */
    @Override
    public final void a() {
        int n2 = jnr.a;
        {
            catch (Throwable throwable) {
                this.b.f(throwable);
                throw throwable;
            }
        }
        this.b.c().d(this.a);
        return;
    }
}

