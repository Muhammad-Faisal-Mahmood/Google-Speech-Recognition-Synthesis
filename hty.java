/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class hty
extends ixo {
    final htz a;
    final ius b;

    public hty(ixx ixx2, htz htz2, ius ius2) {
        this.a = htz2;
        this.b = ius2;
        super(ixx2);
    }

    @Override
    public final void a(iyh iyh2, iwx iwx2) {
        Object object;
        block1: {
            jse.e(iyh2, "status");
            int n2 = 0;
            while (true) {
                object = this.a;
                htx[] htxArray = ((htz)object).a;
                if (n2 >= htxArray.length) break block1;
                object = this.b;
                if (((AtomicReference)htxArray[n2].c.a((ius)object)).get() != null) break;
                ++n2;
            }
            throw new IllegalStateException("Response headers can be populated only before the first response message.");
        }
        ((htz)object).b(iwx2, this.b, false);
        super.a(iyh2, iwx2);
    }

    @Override
    public final void b(iwx iwx2) {
        ius ius2 = this.b;
        this.a.b(iwx2, ius2, true);
        super.b(iwx2);
    }
}

