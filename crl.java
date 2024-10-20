/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class crl
implements ckx {
    public final cka a;
    public final String b;
    public final Executor c;

    public /* synthetic */ crl(cka cka2, String string, Executor executor) {
        this.a = cka2;
        this.b = string;
        this.c = executor;
    }

    @Override
    public final void a(Object object) {
        object = (Void)object;
        boolean bl2 = crn.a;
        Object object2 = this.a;
        object = this.b;
        object2 = ((cka)object2).m((String)object);
        object = new crm((String)object, 0);
        ((ckz)object2).h(this.c, (ckw)object);
    }
}

