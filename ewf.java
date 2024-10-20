/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ewf
implements dzj {
    final evq a;
    final jsj b;
    final ewg c;
    final jur d;

    public ewf(evq evq2, jur jur2, jsj jsj2, ewg ewg2) {
        this.a = evq2;
        this.d = jur2;
        this.b = jsj2;
        this.c = ewg2;
    }

    @Override
    public final Executor a() {
        return this.c.b;
    }

    @Override
    public final void b(dzn object) {
        jse.e(object, "audioData");
        if (((dzn)object).c != 2) {
            if (this.a.b((dzn)object).isCancelled() && (object = (dzk)this.b.a) != null) {
                ((dzk)object).b.a();
            }
            return;
        }
        this.a.a();
        this.d.O(jon.a);
    }
}

