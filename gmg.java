/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class gmg
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;

    public gmg(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
    }

    public final knl a() {
        boolean bl2;
        Object object = ((imc)this.d).a;
        bzo bzo2 = ((gmd)this.a).a();
        object = (Set)object;
        boolean bl3 = ((Set)((imc)this.e).a).isEmpty();
        boolean bl4 = bl2 = false;
        if (bl3) {
            bl4 = bl2;
            if (object.isEmpty()) {
                bl4 = true;
            }
        }
        object = this.c;
        jnu jnu2 = this.b;
        fxf.r(bl4, "Can't provide @AccountSyncMonitor monitors into application scope.");
        return new knl(bzo2, jnu2, (jnu)object);
    }
}

