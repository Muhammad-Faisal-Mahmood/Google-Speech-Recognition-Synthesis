/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.function.Function$_CC;
import java.util.function.Function;

public final class fja
implements Function {
    public final Object a;
    private final int b;

    public /* synthetic */ fja(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return Function$_CC.$default$andThen(this, function);
            }
            return Function$_CC.$default$andThen(this, function);
        }
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return ag$$ExternalSyntheticApiModelOutline1.m((Function)this.a, object);
            }
            object = new fhc((fhd)object);
            ((fhc)object).b = this.a;
            return ((fhc)object).a();
        }
        object = (ezj)object;
        hwp hwp2 = fhw.a.l();
        Object object2 = ((ezj)object).a.toLanguageTag();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object3 = hwp2.b;
        Object object4 = (fhw)object3;
        object2.getClass();
        ((fhw)object4).b = 1 | ((fhw)object4).b;
        ((fhw)object4).c = object2;
        n2 = ((ezj)object).b;
        if (!((hwv)object3).B()) {
            hwp2.u();
        }
        object3 = this.a;
        object2 = (fhw)hwp2.b;
        ((fhw)object2).b |= 2;
        ((fhw)object2).d = n2;
        object4 = ((ezj)object).d;
        object2 = idq.b(((fhv)object3).d);
        object = object2;
        if (object2 == null) {
            object = idq.a;
        }
        object = Collection$_EL.stream((hav)((hac)object4).getOrDefault(object, hdc.a)).filter(new fai(object3, 13));
        n2 = gzx.d;
        object3 = (gzx)object.collect(gye.a);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (fhw)hwp2.b;
        object2 = ((fhw)object).e;
        if (!object2.c()) {
            ((fhw)object).e = hwv.q((hxb)object2);
        }
        object2 = object3.iterator();
        while (object2.hasNext()) {
            object3 = (iaz)object2.next();
            ((fhw)object).e.g(((iaz)object3).r);
        }
        return (fhw)hwp2.o();
    }

    public final /* synthetic */ Function compose(Function function) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return Function$_CC.$default$compose(this, function);
            }
            return Function$_CC.$default$compose(this, function);
        }
        return Function$_CC.$default$compose(this, function);
    }
}

