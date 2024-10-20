/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import j$.util.Collection$_EL;
import j$.util.function.Function$_CC;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class fbi
implements Function {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ fbi(hjq hjq2, BiFunction biFunction, int n2) {
        this.c = n2;
        this.b = hjq2;
        this.a = biFunction;
    }

    public /* synthetic */ fbi(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return Function$_CC.$default$andThen(this, function);
                    }
                    return Function$_CC.$default$andThen(this, function);
                }
                return Function$_CC.$default$andThen(this, function);
            }
            return Function$_CC.$default$andThen(this, function);
        }
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        Object object2 = (hjq)this.b;
                        Function function = ((hjq)object2).d;
                        object2 = ag$$ExternalSyntheticApiModelOutline1.m(((hjq)object2).c, object);
                        object = ag$$ExternalSyntheticApiModelOutline1.m(function, object);
                        return ag$$ExternalSyntheticApiModelOutline1.m((BiFunction)this.a, object2, object);
                    }
                    object = (Class)object;
                    fxf.K(gda.a);
                    Object object3 = (gel)this.a;
                    Executor executor = ((gel)object3).f;
                    object = ((gel)object3).e;
                    bmu bmu2 = ((gel)object3).i;
                    object3 = ((gel)object3).g;
                    return new gem((gds)this.b, (cgw)object3, bmu2, (gbr)object, executor);
                }
                object = new fhc((fhd)object);
                ((fhc)object).b = this.a;
                ((fhc)object).c = this.b;
                return ((fhc)object).a();
            }
            object = (ezj)object;
            Object object4 = ((ezj)object).a;
            Object object5 = byu.a;
            object4 = ((Locale)object4).toLanguageTag();
            object5 = ((ezj)object).a.toLanguageTag();
            object4 = (String)((hac)this.a).getOrDefault(object4, object5);
            n2 = true != Collection$_EL.stream(((ezo)this.b).b).anyMatch(new bod(object, 11)) ? 2 : 3;
            object5 = gsl.a;
            return new byq((ezj)object, (gto)object5, n2, (gto)object5, true, (String)object4);
        }
        ezj ezj2 = (ezj)object;
        ((hfk)((hfk)fbj.a.b()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "updateLanguagePackFileGroup", 167, "ZipfileLanguagePackPopulator.java")).u("#updateLanguagePackFileGroup: %s", ezj2);
        if (ezj2.h == 2 && ezj2.f.g()) {
            object = this.b;
            fbj fbj2 = (fbj)this.a;
            object = fxf.ak(fbj2.d.a(), new fbh(fbj2, ezj2, (cty)object), fbj2.e);
            fxf.al((hpn)object, new cmr(ezj2, 8), fbj2.e);
        } else {
            ((hfk)((hfk)fbj.a.g()).j("com/google/android/libraries/speech/modeldownload/languagepacks/zipfile/ZipfileLanguagePackPopulator", "updateLanguagePackFileGroup", 170, "ZipfileLanguagePackPopulator.java")).u("LanguagePack descriptor does not seem to describe a downloadable zipfile! Skipping download attempt: %s", ezj2);
            object = hhk.K(false);
        }
        return object;
    }

    public final /* synthetic */ Function compose(Function function) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return Function$_CC.$default$compose(this, function);
                    }
                    return Function$_CC.$default$compose(this, function);
                }
                return Function$_CC.$default$compose(this, function);
            }
            return Function$_CC.$default$compose(this, function);
        }
        return Function$_CC.$default$compose(this, function);
    }
}

