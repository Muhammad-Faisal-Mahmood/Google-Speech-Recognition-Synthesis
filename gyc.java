/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.BiConsumer$_CC;
import java.util.function.BiConsumer;

public final class gyc
implements BiConsumer {
    private final int a;

    public /* synthetic */ gyc(int n2) {
        this.a = n2;
    }

    public final void accept(Object object, Object object2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        hcc hcc2 = (hcc)object;
                        object = hcd.a;
                        object = object2;
                        if (object2 == null) {
                            object = hcd.b;
                        }
                        hcc2.b(object);
                        return;
                    }
                    ((hcc)object).b(object2);
                    return;
                }
                ((bzq)object).G((hcr)object2);
                return;
            }
            ((gzs)object).h(object2);
            return;
        }
        ((hat)object).j(object2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return BiConsumer$_CC.$default$andThen(this, biConsumer);
                    }
                    return BiConsumer$_CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$_CC.$default$andThen(this, biConsumer);
            }
            return BiConsumer$_CC.$default$andThen(this, biConsumer);
        }
        return BiConsumer$_CC.$default$andThen(this, biConsumer);
    }
}

