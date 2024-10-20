/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public final class bmm {
    public final Object a;
    public final Object b;

    public bmm(bfc bfc2, jyh jyh2) {
        this.a = bfc2;
        this.b = jyh2;
    }

    public /* synthetic */ bmm(bmn bmn2, Consumer consumer) {
        this.a = bmn2;
        this.b = consumer;
    }

    public final void a(Object object) {
        object = ((bfc)this.a).e(object) ? new ber(((bfc)this.a).d()) : beq.a;
        this.b.g(object);
    }
}

