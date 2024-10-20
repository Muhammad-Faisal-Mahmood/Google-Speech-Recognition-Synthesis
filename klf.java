/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

final class klf
extends IOException {
    static final kgn a = new kle();

    public klf(Throwable throwable) {
        super(throwable);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ kgv a(kid object) {
        void var0_3;
        try {
            object = ((kid)object).a(((kid)object).b);
            return object;
        }
        catch (RuntimeException runtimeException) {
        }
        catch (Error error) {
            // empty catch block
        }
        throw new klf((Throwable)var0_3);
    }
}

