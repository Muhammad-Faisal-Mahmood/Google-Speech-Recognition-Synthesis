/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.BiConsumer$_CC;
import java.util.function.BiConsumer;
import java.util.function.Function;

public final class gyd
implements BiConsumer {
    public final Function a;
    public final Function b;

    public /* synthetic */ gyd(Function function, Function function2) {
        this.a = function;
        this.b = function2;
    }

    public final void accept(Object object, Object object2) {
        object = (gzy)object;
        Object object3 = gye.a;
        object3 = this.b;
        ((gzy)object).d(ag$$ExternalSyntheticApiModelOutline1.m(this.a, object2), ag$$ExternalSyntheticApiModelOutline1.m((Function)object3, object2));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$_CC.$default$andThen(this, biConsumer);
    }
}

