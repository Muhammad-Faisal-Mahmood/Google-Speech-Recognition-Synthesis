/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class fbv
implements Consumer {
    public final fby a;
    public final int b;

    public /* synthetic */ fbv(fby fby2, int n2) {
        this.a = fby2;
        this.b = n2;
    }

    public final void accept(Object object) {
        int n2;
        fby fby2 = this.a;
        object = (bzo)object;
        if (fby2.k) {
            Object object2 = fby2.d;
            object2 = dxv.aN.b("model_manager", (String)object2);
            ((bzo)object).a.a((dyk)object2);
        }
        if ((n2 = this.b - 1) != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    ((bzo)object).O(fby2.d, 13);
                    return;
                }
                ((bzo)object).O(fby2.d, 12);
                return;
            }
            ((bzo)object).M(fby2.d);
            return;
        }
        ((bzo)object).O(fby2.d, 11);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

