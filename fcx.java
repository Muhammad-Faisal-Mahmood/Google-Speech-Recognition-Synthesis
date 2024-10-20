/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.speech.RecognitionPart$Builder
 */
import android.os.Bundle;
import android.speech.RecognitionPart;
import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$_CC;
import j$.util.stream.Collectors;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.function.Function;

public final class fcx
implements Function {
    private final int a;

    public /* synthetic */ fcx(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 19: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 18: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 17: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 16: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 15: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 14: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 13: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 12: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 11: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 10: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 9: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 8: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 7: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 6: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 5: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 4: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 3: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 2: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 1: {
                return Function$_CC.$default$andThen(this, function);
            }
            case 0: 
        }
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        block63: {
            block64: {
                int n2 = this.a;
                int n3 = 5;
                Object object2 = false;
                switch (n2) {
                    default: {
                        object = (hcc)object;
                        Object object3 = hcd.a;
                        if (((hcc)object).a == null) break block63;
                        if (((hcc)object).b.isEmpty()) {
                            object = object3 = ((hcc)object).a;
                            if (object3 != hcd.b) break;
                            return null;
                        }
                        break block64;
                    }
                    case 19: {
                        object = (hcc)object;
                        if (((hcc)object).b.isEmpty()) {
                            return Optional.ofNullable(((hcc)object).a);
                        }
                        throw ((hcc)object).a(false);
                    }
                    case 18: {
                        return hac.i((LinkedHashMap)object);
                    }
                    case 17: {
                        return ((gzy)object).b();
                    }
                    case 16: {
                        return ((hat)object).g();
                    }
                    case 15: {
                        return ((gzs)object).g();
                    }
                    case 14: {
                        object = (bzq)object;
                        gzs gzs2 = new gzs(((bzq)object).a.size());
                        Collections.sort(((bzq)object).a, hcq.a);
                        object = ((bzq)object).a.iterator();
                        object = object instanceof hbl ? (hbl)object : new hbl((Iterator)object);
                        while (((hbl)object).hasNext()) {
                            object2 = (hcr)((hbl)object).next();
                            while (((hbl)object).hasNext()) {
                                if (!((hbl)object).b) {
                                    ((hbl)object).c = ((hbl)object).a.next();
                                    ((hbl)object).b = true;
                                }
                                Serializable serializable = (hcr)((hbl)object).c;
                                Object object4 = ((hcr)object2).b;
                                gyz gyz2 = serializable.c;
                                gyz gyz3 = serializable.b;
                                gyz gyz4 = ((hcr)object2).c;
                                n2 = ((gyz)object4).a(gyz3);
                                n3 = gyz4.a(gyz2);
                                object4 = n2 >= 0 && n3 <= 0 ? object2 : serializable;
                                fxf.y(((hcr)object4).b(), "Overlapping ranges not permitted but found %s overlapping %s", object2, serializable);
                                object4 = (hcr)((hbl)object).next();
                                serializable = ((hcr)object2).b;
                                serializable = ((hcr)object4).b;
                                serializable = ((hcr)object2).c;
                                object4 = ((hcr)object4).c;
                            }
                            gzs2.h(object2);
                        }
                        object = gzs2.g();
                        object = ((AbstractCollection)object).isEmpty() ? has.a : (((hct)object).c == 1 && ((hcr)fvd.Q((Iterable)object)).equals(hcr.a) ? has.b : new has((gzx)object));
                        return object;
                    }
                    case 13: {
                        return ((gli)object).b.b();
                    }
                    case 12: {
                        object = (ffx)object;
                        n2 = ((ffx)object).c.size();
                        RecognitionPart.Builder builder = new RecognitionPart.Builder((String)((ffx)object).c.get(n2 - 1));
                        if (((ffx)object).c.size() == 2) {
                            mk$$ExternalSyntheticApiModelOutline0.m(builder, (String)((ffx)object).c.get(0));
                        }
                        if ((((ffx)object).b & 1) != 0) {
                            mk$$ExternalSyntheticApiModelOutline0.m(builder, ((ffx)object).d);
                        }
                        if ((((ffx)object).b & 2) != 0) {
                            int n4;
                            n2 = n4 = a.F(((ffx)object).e);
                            if (n4 == 0) {
                                n2 = 1;
                            }
                            if (--n2 != 0) {
                                if (n2 != 1) {
                                    if (n2 != 2) {
                                        if (n2 != 3) {
                                            if (n2 == 4) {
                                                n3 = 4;
                                            }
                                        } else {
                                            n3 = 3;
                                        }
                                    } else {
                                        n3 = 2;
                                    }
                                } else {
                                    n3 = 1;
                                }
                            } else {
                                n3 = 0;
                            }
                            mk$$ExternalSyntheticApiModelOutline0.m(builder, n3);
                        }
                        return mk$$ExternalSyntheticApiModelOutline0.m(builder);
                    }
                    case 11: {
                        object = Collection$_EL.stream(((idp)object).b).map(new fcx(10));
                        n3 = gzx.d;
                        object = new fet((gzx)object.collect(gye.a));
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("alternative_spans", (ArrayList)Collection$_EL.stream(((fet)object).a).map(new fcx(2)).collect(Collectors.toCollection(new fes(0))));
                        return bundle;
                    }
                    case 10: {
                        object = (ido)object;
                        return new fer(((ido)object).b, ((ido)object).c, new ArrayList(((ido)object).d));
                    }
                    case 9: {
                        return Integer.parseInt((String)object);
                    }
                    case 8: {
                        int n5;
                        ffx ffx2 = (ffx)object;
                        n2 = fje.a;
                        object2 = fio.a.l();
                        Object object5 = ffx2.c;
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        object = (fio)((hwp)object2).b;
                        Object object6 = ((fio)object).c;
                        if (!object6.c()) {
                            ((fio)object).c = hwv.s((hxk)object6);
                        }
                        hvc.g((Iterable)object5, ((fio)object).c);
                        long l2 = ffx2.d;
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        object = (fio)((hwp)object2).b;
                        ((fio)object).b |= 1;
                        ((fio)object).d = l2;
                        n2 = n5 = a.F(ffx2.e);
                        if (n5 == 0) {
                            n2 = 1;
                        }
                        if (--n2 != 0) {
                            if (n2 != 1) {
                                if (n2 != 2) {
                                    if (n2 != 3) {
                                        if (n2 != 4) {
                                            n3 = 6;
                                        }
                                    } else {
                                        n3 = 4;
                                    }
                                } else {
                                    n3 = 3;
                                }
                            } else {
                                n3 = 2;
                            }
                        } else {
                            n3 = 1;
                        }
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        object = (fio)((hwp)object2).b;
                        ((fio)object).e = n3 - 1;
                        ((fio)object).b |= 2;
                        if ((ffx2.b & 4) != 0) {
                            object5 = fik.a.l();
                            object = object6 = ffx2.f;
                            if (object6 == null) {
                                object = few.a;
                            }
                            object = ((few)object).c;
                            if (!((hwp)object5).b.B()) {
                                ((hwp)object5).u();
                            }
                            hwv hwv2 = ((hwp)object5).b;
                            object6 = (fik)hwv2;
                            object.getClass();
                            ((fik)object6).b = 1 | ((fik)object6).b;
                            ((fik)object6).c = object;
                            object = object6 = ffx2.f;
                            if (object6 == null) {
                                object = few.a;
                            }
                            boolean bl2 = ((few)object).d;
                            if (!hwv2.B()) {
                                ((hwp)object5).u();
                            }
                            object = (fik)((hwp)object5).b;
                            ((fik)object).b |= 2;
                            ((fik)object).d = bl2;
                            object6 = (fik)((hwp)object5).o();
                            if (!((hwp)object2).b.B()) {
                                ((hwp)object2).u();
                            }
                            object = (fio)((hwp)object2).b;
                            object6.getClass();
                            ((fio)object).f = object6;
                            ((fio)object).b |= 4;
                        }
                        return (fio)((hwp)object2).o();
                    }
                    case 7: {
                        object = new fhc((fhd)object);
                        ((fhc)object).b(true);
                        return ((fhc)object).a();
                    }
                    case 6: {
                        object = new fhc((fhd)object);
                        ((fhc)object).d = object2;
                        return ((fhc)object).a();
                    }
                    case 5: {
                        fhd fhd2 = (fhd)object;
                        object = fhd2;
                        if (!Objects.equals(fhd2.e, object2)) {
                            object = new fhc(fhd2);
                            ((fhc)object).d = true;
                            object = ((fhc)object).a();
                        }
                        return object;
                    }
                    case 4: {
                        return (cnk)((jnu)object).b();
                    }
                    case 3: {
                        return hvu.t((String)object);
                    }
                    case 2: {
                        fer fer2 = (fer)object;
                        object = new Bundle();
                        object.putInt("start", fer2.a);
                        object.putInt("end", fer2.b);
                        object.putStringArrayList("alternatives", fer2.c);
                        return object;
                    }
                    case 1: {
                        return ((idw)object).c;
                    }
                    case 0: {
                        ezj ezj2 = (ezj)object;
                        object = idw.a.l();
                        String string = ezj2.a.toLanguageTag();
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        object2 = ((hwp)object).b;
                        idw idw2 = (idw)object2;
                        string.getClass();
                        idw2.b |= 1;
                        idw2.c = string;
                        n3 = ezj2.b;
                        if (!((hwv)object2).B()) {
                            ((hwp)object).u();
                        }
                        idw2 = (idw)((hwp)object).b;
                        idw2.b |= 2;
                        idw2.d = n3;
                        object = (idw)((hwp)object).o();
                    }
                }
                return object;
            }
            throw ((hcc)object).a(false);
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$compose(this, function);
            }
            case 19: {
                return Function$_CC.$default$compose(this, function);
            }
            case 18: {
                return Function$_CC.$default$compose(this, function);
            }
            case 17: {
                return Function$_CC.$default$compose(this, function);
            }
            case 16: {
                return Function$_CC.$default$compose(this, function);
            }
            case 15: {
                return Function$_CC.$default$compose(this, function);
            }
            case 14: {
                return Function$_CC.$default$compose(this, function);
            }
            case 13: {
                return Function$_CC.$default$compose(this, function);
            }
            case 12: {
                return Function$_CC.$default$compose(this, function);
            }
            case 11: {
                return Function$_CC.$default$compose(this, function);
            }
            case 10: {
                return Function$_CC.$default$compose(this, function);
            }
            case 9: {
                return Function$_CC.$default$compose(this, function);
            }
            case 8: {
                return Function$_CC.$default$compose(this, function);
            }
            case 7: {
                return Function$_CC.$default$compose(this, function);
            }
            case 6: {
                return Function$_CC.$default$compose(this, function);
            }
            case 5: {
                return Function$_CC.$default$compose(this, function);
            }
            case 4: {
                return Function$_CC.$default$compose(this, function);
            }
            case 3: {
                return Function$_CC.$default$compose(this, function);
            }
            case 2: {
                return Function$_CC.$default$compose(this, function);
            }
            case 1: {
                return Function$_CC.$default$compose(this, function);
            }
            case 0: 
        }
        return Function$_CC.$default$compose(this, function);
    }
}

