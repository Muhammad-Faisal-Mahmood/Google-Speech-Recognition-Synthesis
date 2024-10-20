/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

public final class jev {
    public static final Logger a = Logger.getLogger(jev.class.getName());

    private jev() {
    }

    public static Object a(hus hus2) {
        fxf.B(hus2.p(), "unexpected end of JSON");
        int n2 = hus2.r() - 1;
        boolean bl2 = true;
        boolean bl3 = true;
        if (n2 != 0) {
            if (n2 != 2) {
                if (n2 != 5) {
                    double d2;
                    int n3;
                    if (n2 != 6) {
                        if (n2 != 7) {
                            if (n2 == 8) {
                                int n4;
                                n2 = n4 = hus2.d;
                                if (n4 == 0) {
                                    n2 = hus2.a();
                                }
                                if (n2 == 7) {
                                    hus2.d = 0;
                                    int[] nArray = hus2.i;
                                    n2 = hus2.h - 1;
                                    nArray[n2] = nArray[n2] + 1;
                                    return null;
                                }
                                throw hus2.e("null");
                            }
                            throw new IllegalStateException("Bad token: ".concat(hus2.f()));
                        }
                        return hus2.q();
                    }
                    n2 = n3 = hus2.d;
                    if (n3 == 0) {
                        n2 = hus2.a();
                    }
                    if (n2 == 15) {
                        hus2.d = 0;
                        int[] nArray = hus2.i;
                        n2 = hus2.h - 1;
                        nArray[n2] = nArray[n2] + 1;
                        d2 = hus2.e;
                    } else {
                        Object object;
                        if (n2 == 16) {
                            object = hus2.b;
                            n2 = hus2.c;
                            n3 = hus2.f;
                            hus2.g = new String((char[])object, n2, n3);
                            hus2.c = n2 + n3;
                        } else if (n2 != 8 && n2 != 9) {
                            if (n2 == 10) {
                                hus2.g = hus2.k();
                            } else if (n2 != 11) {
                                throw hus2.e("a double");
                            }
                        } else {
                            char c2 = n2 == 8 ? (char)'\'' : '\"';
                            hus2.g = hus2.i(c2);
                        }
                        hus2.d = 11;
                        d2 = Double.parseDouble(hus2.g);
                        if (hus2.a != hur.a && (Double.isNaN(d2) || Double.isInfinite(d2))) {
                            object = new StringBuilder("JSON forbids NaN and infinities: ");
                            ((StringBuilder)object).append(d2);
                            throw hus2.d(((StringBuilder)object).toString());
                        }
                        hus2.g = null;
                        hus2.d = 0;
                        object = hus2.i;
                        n2 = hus2.h - 1;
                        object[n2] = object[n2] + true;
                    }
                    return d2;
                }
                return hus2.j();
            }
            hus2.m();
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
            while (hus2.p()) {
                linkedHashMap.put(hus2.h(), jev.a(hus2));
            }
            bl2 = hus2.r() == 4 ? bl3 : false;
            fxf.B(bl2, "Bad token: ".concat(hus2.f()));
            hus2.o();
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        hus2.l();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        while (hus2.p()) {
            arrayList.add(jev.a(hus2));
        }
        if (hus2.r() != 2) {
            bl2 = false;
        }
        fxf.B(bl2, "Bad token: ".concat(hus2.f()));
        hus2.n();
        return DesugarCollections.unmodifiableList(arrayList);
    }
}

