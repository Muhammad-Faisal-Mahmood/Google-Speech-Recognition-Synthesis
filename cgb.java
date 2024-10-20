/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

public final class cgb
implements ccw {
    final ccx a;
    final Object b;
    private final int c;

    public cgb(ccx ccx2, bzo bzo2, int n2) {
        this.c = n2;
        this.a = ccx2;
        this.b = bzo2;
    }

    public cgb(cxu cxu2, BasePendingResult basePendingResult, int n2) {
        this.c = n2;
        this.a = basePendingResult;
        this.b = cxu2;
    }

    @Override
    public final void a(Status object) {
        if (this.c != 0) {
            object = this.a;
            ((cxu)this.b).a.remove(object);
            return;
        }
        if (((Status)object).a()) {
            this.a.d(TimeUnit.MILLISECONDS);
            ((bzo)this.b).c(null);
            return;
        }
        Object object2 = this.b;
        object = kl.ax((Status)object);
        ((bzo)object2).b((Exception)object);
    }
}

