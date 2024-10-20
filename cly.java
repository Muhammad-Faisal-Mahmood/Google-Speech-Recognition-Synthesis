/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.common.api.Status;

final class cly
extends clt {
    private final cdm a;
    private final clu b;
    private final clv c;

    public cly(clv clv2, cdm cdm2, clu clu2) {
        this.c = clv2;
        this.a = cdm2;
        this.b = clu2;
    }

    @Override
    public final void c(Status status) {
        if (!status.a()) {
            this.a.g();
            return;
        }
        this.a.g();
    }

    @Override
    public final void d(Status object) {
        if (!object.a()) {
            this.a.g();
            return;
        }
        object = this.b;
        if (object == null) {
            this.a.g();
            return;
        }
        this.c.e((clu)((Object)object), this);
    }
}

