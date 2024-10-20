/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.io.InputStream;
import java.util.concurrent.Executor;

final class jio
implements jjf {
    public final jip a;
    private final iul b;
    private final kmp c;

    public jio(jip jip2, kmp kmp2, iul iul2) {
        this.a = jip2;
        this.c = kmp2;
        this.b = iul2;
        ((ius)iul2).d(new jin(this, 0), (Executor)hom.a);
    }

    @Override
    public final void a(iyh object) {
        block4: {
            block3: {
                int n2 = jnr.a;
                Object var3_4 = null;
                try {
                    if (!((iyh)object).g()) break block3;
                    this.c.X();
                    object = var3_4;
                    break block4;
                }
                catch (Throwable throwable) {
                    this.b.j(null);
                    throw throwable;
                }
            }
            jip.g(this.a);
            this.c.W();
            object = new iyj(iyh.c.e("RPC cancelled"), null, false);
        }
        this.b.j((Throwable)object);
    }

    @Override
    public final void b() {
        int n2 = jnr.a;
        if (this.a.c) {
            return;
        }
        this.c.e();
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void d(jjq jjq2) {
        int n2 = jnr.a;
        if (!this.a.c) {
            InputStream inputStream;
            while (true) {
                inputStream = jjq2.g();
                if (inputStream == null) return;
                this.c.f(this.a.a.d.b(inputStream));
                break;
            }
            catch (Throwable throwable) {
                try {
                    jeb.h(inputStream);
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    jeb.g(jjq2);
                    gun.b(throwable2);
                    throw new RuntimeException(throwable2);
                }
            }
            {
                inputStream.close();
                continue;
            }
        }
        jeb.g(jjq2);
    }

    @Override
    public final void e() {
        int n2 = jnr.a;
        if (this.a.c) {
            return;
        }
        this.c.g();
    }
}

