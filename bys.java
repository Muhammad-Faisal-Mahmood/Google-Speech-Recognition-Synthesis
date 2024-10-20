/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.function.Function$_CC;
import java.util.function.Function;

public final class bys
implements Function {
    public final byu a;
    public final hac b;
    public final ezo c;
    public final hac d;

    public /* synthetic */ bys(byu byu2, hac hac2, ezo ezo2, hac hac3) {
        this.a = byu2;
        this.b = hac2;
        this.c = ezo2;
        this.d = hac3;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        Object object2;
        Object object3;
        int n2;
        ezj ezj2 = (ezj)object;
        object = ezj2.a;
        object = (ezj)this.b.getOrDefault(object, ezj2);
        object = ((ezj)object).b > ezj2.b ? gto.i(object) : gsl.a;
        if (!((gto)object).g()) {
            n2 = 1;
        } else {
            object3 = this.c;
            object2 = ((gto)object).c();
            n2 = true != Collection$_EL.stream(((ezo)object3).b).anyMatch(new bod(object2, 10)) ? 2 : 3;
        }
        object2 = this.d;
        object3 = this.a;
        return fxf.aj(((byu)object3).c.e(ezj2), new byr((hac)object2, ezj2, n2, (gto)object, ezj2.c()), ((byu)object3).b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

