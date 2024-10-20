/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Callable;

public final class fjh
implements Callable {
    public final int a;
    public final Object b;
    private final int c;

    public /* synthetic */ fjh(Object object, int n2, int n3) {
        this.c = n3;
        this.b = object;
        this.a = n2;
    }

    public final Object call() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                n2 = this.a;
                return ((izg)this.b).a.a(n2);
            }
            n2 = eff.a;
            n2 = this.a;
            this.b.onAudioFocusChange(n2);
            return true;
        }
        fjj fjj2 = (fjj)this.b;
        n2 = this.a;
        int n3 = fjj2.i;
        if (n2 != n3) {
            AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = fjj2.l;
            hwr hwr2 = (hwr)fiq.a.l();
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            fiq fiq2 = (fiq)hwr2.b;
            fiq2.b = 5;
            fiq2.c = n2;
            ambientModeSupport$AmbientController.f((fiq)hwr2.o());
            fjj2.i = n2;
        }
        return null;
    }
}

