/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class ddt {
    public Object a;
    private boolean b;
    private byte c;

    public final ddu a() {
        Object object;
        if (this.c == 1 && (object = this.a) != null) {
            boolean bl2 = this.b;
            return new dcs((dds)object, bl2);
        }
        object = new StringBuilder();
        if (this.a == null) {
            ((StringBuilder)object).append(" constraints");
        }
        if (this.c == 0) {
            ((StringBuilder)object).append(" runInForeground");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(boolean bl2) {
        this.b = bl2;
        this.c = 1;
    }

    public final cuz c() {
        if (this.a == null) {
            this.a = hdc.a;
        }
        if (this.c == 1) {
            return new cuz(this.b, (hav)this.a);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    public final void d(boolean bl2) {
        this.b = bl2;
        this.c = 1;
    }

    public final void e(Set set) {
        this.a = hav.n(set);
    }
}

