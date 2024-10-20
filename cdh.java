/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class cdh
extends cdd {
    public final ceg b;

    public cdh(ceg ceg2, bzo bzo2) {
        super(4, bzo2);
        this.b = ceg2;
    }

    @Override
    public final boolean a(cdx object) {
        object = (bmu)((cdx)object).d.get(this.b);
        return object != null && ((cem)((bmu)object).c).c;
    }

    @Override
    public final cbm[] b(cdx object) {
        object = (bmu)((cdx)object).d.get(this.b);
        if (object == null) {
            return null;
        }
        return ((cem)((bmu)object).c).b;
    }

    @Override
    public final void c(cdx object) {
        bmu bmu2 = (bmu)((cdx)object).d.remove(this.b);
        if (bmu2 != null) {
            ccp ccp2 = ((cdx)object).b;
            object = this.a;
            ((cen)((AmbientMode$AmbientController)bmu2.b).a).b.a(ccp2, object);
            object = ((cem)bmu2.c).a;
            ((cei)object).a = null;
            ((cei)object).b = null;
            return;
        }
        this.a.e(false);
    }
}

