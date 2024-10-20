/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 */
import android.content.pm.PackageManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class iyq
extends iyx {
    final gui a;
    final PackageManager b;
    final hav c;
    final Executor d;

    public iyq() {
        throw null;
    }

    public iyq(gui gui2, PackageManager packageManager, hav hav2, Executor executor) {
        this.a = gui2;
        this.b = packageManager;
        this.c = hav2;
        this.d = executor;
    }

    @Override
    @Deprecated
    public final iyh a(int n2) {
        try {
            iyh iyh2 = (iyh)this.b(n2).get();
            return iyh2;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return iyh.c.d(interruptedException);
        }
        catch (CancellationException cancellationException) {
            return iyh.c.d(cancellationException);
        }
        catch (ExecutionException executionException) {
            return iyh.c(executionException);
        }
    }

    public final hpn b(int n2) {
        return hhk.O(new hrr(this.a, this.b, this.c, n2, 0), this.d);
    }
}

