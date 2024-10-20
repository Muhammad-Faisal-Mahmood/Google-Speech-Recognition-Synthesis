/*
 * Decompiled with CFR 0.152.
 */
import j$.util.function.BiFunction$_CC;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class faf
implements BinaryOperator {
    private final int a;

    public /* synthetic */ faf(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            default: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 6: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 5: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 4: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 3: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 2: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 1: {
                return BiFunction$_CC.$default$andThen(this, function);
            }
            case 0: 
        }
        return BiFunction$_CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object object, Object object2) {
        block14: {
            hcc hcc2;
            switch (this.a) {
                default: {
                    hcc2 = (hcc)object;
                    object2 = (hcc)object2;
                    if (hcc2.a != null) break;
                    object = object2;
                    break block14;
                }
                case 6: {
                    object = (gzy)object;
                    gzy gzy2 = (gzy)object2;
                    fxf.K(gzy2);
                    ((gzy)object).c(((gzy)object).a + gzy2.a);
                    Object object3 = gzy2.b;
                    object2 = ((gzy)object).b;
                    int n2 = ((gzy)object).a;
                    int n3 = gzy2.a;
                    System.arraycopy(object3, 0, object2, n2 + n2, n3 + n3);
                    ((gzy)object).a += gzy2.a;
                    return object;
                }
                case 5: {
                    object = (hat)object;
                    ((hat)object).k((hat)object2);
                    return object;
                }
                case 4: {
                    object = (gzs)object;
                    object2 = (gzs)object2;
                    ((gzk)object).a(((gzs)object2).a, ((gzs)object2).b);
                    return object;
                }
                case 3: {
                    object = (bzq)object;
                    object2 = ((bzq)object2).a.iterator();
                    while (object2.hasNext()) {
                        ((bzq)object).G((hcr)object2.next());
                    }
                    return object;
                }
                case 2: {
                    object = (String)object;
                    object2 = (String)object2;
                    ((hfk)((hfk)fcl.a.h()).j("com/google/android/libraries/speech/modelmanager/languagepack/dataservice/impl/LanguagePackDataServiceImpl", "createDisplayNamesMap", 116, "LanguagePackDataServiceImpl.java")).G("Language display name config has duplicate locales: '%s' and '%s'. Choosing %s arbitrarily, but config may have an error.", object, object2, object);
                    return object;
                }
                case 1: {
                    object = (String)object;
                    object2 = (String)object2;
                    ((hfk)((hfk)fac.a.h()).j("com/google/android/libraries/speech/modeldownload/languagepacks/displaynames/LanguageDisplayNames", "createDisplayNamesMap", 73, "LanguageDisplayNames.java")).G("Language display name config has duplicate locales: '%s' and '%s'. Choosing %s arbitrarily, but config may have an error.", object, object2, object);
                    return object;
                }
                case 0: {
                    object = (hav)object;
                    throw new IllegalStateException(String.format("Duplicate recognizer key found with features: %s and %s", (hav)object2, object));
                }
            }
            object = hcc2;
            if (((hcc)object2).a != null) {
                if (hcc2.b.isEmpty()) {
                    hcc2.b = new ArrayList();
                }
                hcc2.b.add(((hcc)object2).a);
                hcc2.b.addAll(((hcc)object2).b);
                if (hcc2.b.size() <= 4) {
                    object = hcc2;
                } else {
                    object = hcc2.b;
                    object.subList(4, object.size()).clear();
                    throw hcc2.a(true);
                }
            }
        }
        return object;
    }
}

