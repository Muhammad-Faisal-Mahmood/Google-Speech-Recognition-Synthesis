/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public final class fah {
    public static final hei a = hei.m("com/google/android/libraries/speech/modeldownload/languagepacks/helper/VoiceSearchConfigProtoUtils");

    public static hac a(huw huw2) {
        hac hac2 = hcy.a;
        try {
            Object object = Collection$_EL.stream(huw2.j);
            Object object2 = new fab(4);
            Object object3 = new fab(5);
            Object object4 = new faf(0);
            object4 = (hac)object.collect(gye.b((Function)object2, (Function)object3, (BinaryOperator)object4));
            object = new hxj(huw2.k, huw.l);
            object3 = hjq.c(Collection$_EL.stream(DesugarCollections.unmodifiableMap(object).entrySet()));
            object = new fai(huw2, 1);
            object2 = new hjo((Predicate)object, 1);
            object = ((hjq)object3).b((BiPredicate)object2);
            object3 = new bsk(object4, huw2, 2);
            object2 = new hjo((Predicate)object3, 0);
            object3 = ((hjq)object).b((BiPredicate)object2);
            Object object5 = new hjn(1);
            object = new fag((hac)object4);
            object4 = ((hjp)object3).a;
            object2 = new fbi((hjq)object3, (BiFunction)object5, 4);
            object5 = new fbi((hjq)object3, (BiFunction)object, 4);
            object = new hjq((Stream)object4, (Function)object2, (Function)object5);
            object4 = ((hjq)object).b;
            object2 = ((hjq)object).c;
            Objects.requireNonNull(object2);
            object3 = new fja(object2, 2);
            object = ((hjq)object).d;
            Objects.requireNonNull(object);
            object2 = new fja(object, 2);
            object4 = (hac)object4.collect(gye.a((Function)object3, (Function)object2));
            return object4;
        }
        catch (RuntimeException runtimeException) {
            ((heg)((heg)((heg)a.g().h(hfo.a, "VoiceSearchConfigUtils")).i(runtimeException)).j("com/google/android/libraries/speech/modeldownload/languagepacks/helper/VoiceSearchConfigProtoUtils", "parseDomainToFeatureIndex", 75, "VoiceSearchConfigProtoUtils.java")).G("Failed to parse domain to feature index for [%s, %d], Reason: %s", huw2.d, huw2.f, runtimeException.getMessage());
            return hac2;
        }
    }

    public static hav b(huw object) {
        object = ((huw)object).k.size() > 0 ? (hav)Collection$_EL.stream(DesugarCollections.unmodifiableMap(new hxj(((huw)object).k, huw.l)).keySet()).filter(new bod(object, 20)).map(new fab(3)).distinct().collect(gye.b) : hav.n(new hxd(((huw)object).i, huw.a));
        return object;
    }

    public static huw c(huw huw2) {
        int n2 = huw2.f;
        hwp hwp2 = (hwp)huw2.C(5);
        hwp2.x(huw2);
        if (n2 >= 5042) {
            fah.e(hwp2, huw2, idq.k);
            fah.e(hwp2, huw2, idq.j);
        } else if (n2 >= 3000) {
            fah.e(hwp2, huw2, idq.k);
        }
        return (huw)hwp2.o();
    }

    public static boolean d(int n2, String string, int n3) {
        if (idq.b(n2) == null) {
            ((heg)((heg)a.g().h(hfo.a, "VoiceSearchConfigUtils")).j("com/google/android/libraries/speech/modeldownload/languagepacks/helper/VoiceSearchConfigProtoUtils", "isCastableToDomainId", 104, "VoiceSearchConfigProtoUtils.java")).G("Unrecognized domain ID for [%s, %d]: %d. Ignoring this domain and its associated features.", string, n3, n2);
            return false;
        }
        return true;
    }

    private static void e(hwp hyg2, huw object, idq idq2) {
        int n2;
        if (((huw)object).k.size() > 0 && !((huw)object).k.containsKey(n2 = idq2.m)) {
            try {
                n2 = idq.c.m;
                Object object2 = ((huw)object).k;
                Object object3 = n2;
                if (object2.containsKey(object3)) {
                    object3 = (ibz)huw.l.a((Integer)object2.get(object3));
                    n2 = idq2.m;
                    object3.getClass();
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    object2 = (huw)((hwp)hyg2).b;
                    hya hya2 = ((huw)object2).k;
                    if (!hya2.b) {
                        ((huw)object2).k = hya2.a();
                    }
                } else {
                    object2 = new IllegalArgumentException();
                    throw object2;
                }
                hxj hxj2 = new hxj(((huw)object2).k, huw.l);
                hxj2.put(n2, object3);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                a.as(a.h().h(hfo.a, "VoiceSearchConfigUtils"), "DomainToRecognizer map exists, but does not contain recognizer for DEFAULT_CONTINUOUS. This is unexpected. Recognizer selection may not behave as expected.", "com/google/android/libraries/speech/modeldownload/languagepacks/helper/VoiceSearchConfigProtoUtils", "addDomain", '\u0096', "VoiceSearchConfigProtoUtils.java", illegalArgumentException);
            }
        }
        if (((huw)object).i.size() > 0 && !new hxd(((huw)object).i, huw.a).contains(idq2)) {
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hyg2 = (huw)((hwp)hyg2).b;
            idq2.getClass();
            object = ((huw)hyg2).i;
            if (!object.c()) {
                ((huw)hyg2).i = hwv.q((hxb)object);
            }
            ((huw)hyg2).i.g(idq2.m);
        }
    }
}

