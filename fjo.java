/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class fjo
implements Consumer {
    public final Object a;
    private final int b;

    public /* synthetic */ fjo(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void accept(Object object) {
        switch (this.b) {
            default: {
                ((fsx)((bmu)object).a.a()).b(this.a);
                return;
            }
            case 7: {
                ((ffz)object).d((String)this.a);
                return;
            }
            case 6: {
                ((ffz)object).l((String)this.a);
                return;
            }
            case 5: {
                ((fga)object).c((String)this.a);
                return;
            }
            case 4: {
                ((fga)object).h((String)this.a);
                return;
            }
            case 3: {
                ((fga)object).g((String)this.a);
                return;
            }
            case 2: {
                ((fga)object).i((String)this.a);
                return;
            }
            case 1: {
                bzo bzo2 = (bzo)object;
                object = (String)this.a;
                bzo2.N((String)object);
                bzo2.M((String)object);
                return;
            }
            case 0: 
        }
        ((fas)object).accept(this.a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            default: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 0: 
        }
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

