/*
 * Decompiled with CFR 0.152.
 */
final class jit
extends jcw {
    final jiu a;

    public jit(jiu jiu2) {
        this.a = jiu2;
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
                this.a.f(throwable);
                throw throwable;
            }
        }
        this.a.c().e();
        return;
    }
}

