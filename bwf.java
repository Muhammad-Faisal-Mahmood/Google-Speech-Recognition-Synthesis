/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class bwf
implements Consumer {
    public final String a;
    public final fgu b;
    public final Optional c;

    public /* synthetic */ bwf(String string, fgu fgu2, Optional optional) {
        this.a = string;
        this.b = fgu2;
        this.c = optional;
    }

    public final void accept(Object object) {
        object = (bzo)object;
        Object object2 = idq.a;
        boolean bl2 = this.c.isPresent();
        object = ((bzo)object).a;
        dyj dyj2 = dxv.aG.b("model_manager", this.a);
        gpm gpm2 = hky.i;
        hwp hwp2 = hky.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object3 = hwp2.b;
        Object object4 = (hky)object3;
        ((hky)object4).c = ((idq)object2).m;
        ((hky)object4).b |= 1;
        if (!((hwv)object3).B()) {
            hwp2.u();
        }
        object2 = this.b;
        hwv hwv2 = hwp2.b;
        object3 = (hky)hwv2;
        object4 = ((fgu)object2).d;
        object4.getClass();
        ((hky)object3).b |= 2;
        ((hky)object3).d = object4;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object4 = hwp2.b;
        object3 = (hky)object4;
        ((hky)object3).b |= 8;
        ((hky)object3).f = bl2;
        if (!((hwv)object4).B()) {
            hwp2.u();
        }
        object3 = ((fgu)object2).b;
        object4 = hwp2.b;
        object2 = (hky)object4;
        object3.getClass();
        ((hky)object2).b |= 0x10;
        ((hky)object2).g = object3;
        if (!((hwv)object4).B()) {
            hwp2.u();
        }
        object2 = (hky)hwp2.b;
        ((hky)object2).b |= 0x20;
        ((hky)object2).h = false;
        dyj2.u(gpm2, (hky)hwp2.o());
        object.a(dyj2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

