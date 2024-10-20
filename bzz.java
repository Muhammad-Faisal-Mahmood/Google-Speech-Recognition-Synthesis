/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.PersistableBundle
 *  android.text.style.TtsSpan
 */
import android.os.PersistableBundle;
import android.text.style.TtsSpan;
import java.nio.charset.StandardCharsets;

public final class bzz {
    private static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/util/MarkupHelper");

    public static iiw a(String object) {
        hwp hwp2 = iiw.a.l();
        String string = object;
        if (!bzz.c((CharSequence)object)) {
            ((heg)((heg)a.g()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "createLucidPieceText", 701, "MarkupHelper.java")).u("Input to speech synthesizer contains invalid UTF-16: %s", object);
            string = "";
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (iiw)hwp2.b;
        string.getClass();
        ((iiw)object).b |= 2;
        ((iiw)object).e = string;
        return (iiw)hwp2.o();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static iiw b(TtsSpan object, CharSequence object2, bry object3) {
        Object object4 = object2;
        if (!bzz.c((CharSequence)object2)) {
            ((heg)((heg)a.g()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "createPiece", 64, "MarkupHelper.java")).u("Input to speech synthesizer contains invalid UTF-16: %s", object2);
            object4 = "";
        }
        hwp hwp2 = iiw.a.l();
        Object object5 = object.getType();
        PersistableBundle persistableBundle = object.getArgs();
        if (((bsa)object3).e().equals("rus") && (persistableBundle.containsKey("android.arg.case") || persistableBundle.containsKey("android.arg.multiplicity") || persistableBundle.containsKey("android.arg.gender"))) {
            object2 = ijy.a.l();
            if (persistableBundle.containsKey("android.arg.multiplicity") && persistableBundle.get("android.arg.multiplicity").equals("android.plural")) {
                ((hwp)object2).V(2820);
            } else if (persistableBundle.containsKey("android.arg.gender") && persistableBundle.containsKey("android.arg.gender")) {
                if (persistableBundle.get("android.arg.gender").equals("android.male")) {
                    ((hwp)object2).V(2052);
                } else if (persistableBundle.get("android.arg.gender").equals("android.female")) {
                    ((hwp)object2).V(2051);
                } else if (persistableBundle.get("android.arg.gender").equals("android.neutral")) {
                    ((hwp)object2).V(2053);
                }
            }
            if (persistableBundle.containsKey("android.arg.case")) {
                if (persistableBundle.get("android.arg.case").equals("android.nominative")) {
                    ((hwp)object2).V(771);
                } else if (persistableBundle.get("android.arg.case").equals("android.genitive")) {
                    ((hwp)object2).V(774);
                } else if (persistableBundle.get("android.arg.case").equals("android.dative")) {
                    ((hwp)object2).V(773);
                } else if (persistableBundle.get("android.arg.case").equals("android.accusative")) {
                    ((hwp)object2).V(772);
                } else if (persistableBundle.get("android.arg.case").equals("android.instrumental")) {
                    ((hwp)object2).V(776);
                } else if (persistableBundle.get("android.arg.case").equals("android.locative")) {
                    ((hwp)object2).V(775);
                }
            }
            object2 = (ijy)((hwp)object2).o();
        } else {
            object2 = null;
        }
        if (((String)object5).equals("android.type.text")) {
            object = bzz.f(persistableBundle, "android.arg.text");
            if (object != null) {
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (iiw)hwp2.b;
                ((iiw)object2).b |= 2;
                ((iiw)object2).e = object;
                return (iiw)hwp2.o();
            } else {
                object = object4.toString();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (iiw)hwp2.b;
                object.getClass();
                ((iiw)object2).b |= 2;
                ((iiw)object2).e = object;
            }
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.cardinal")) {
            object = bzz.l(persistableBundle);
            if (object == null) return null;
            if (object2 != null) {
                object3 = (hwr)iis.a.l();
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                iis iis2 = (iis)((hwr)object3).b;
                iis2.d = object2;
                iis2.b |= 2;
                object3 = (iis)((hwp)object3).o();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (iiw)hwp2.b;
                object3.getClass();
                ((iiw)object2).f = object3;
                ((iiw)object2).b |= 8;
            }
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (ijp)((hwp)object).o();
            object.getClass();
            ((iiw)object2).d = object;
            ((iiw)object2).c = 107;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.decimal")) {
            object2 = bzz.k(persistableBundle);
            if (object2 == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (iiw)hwp2.b;
            object2 = (ijp)((hwp)object2).o();
            object2.getClass();
            ((iiw)object).d = object2;
            ((iiw)object).c = 107;
            object2 = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (iiw)hwp2.b;
            object2.getClass();
            ((iiw)object).b |= 2;
            ((iiw)object).e = object2;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.fraction")) {
            object2 = bzz.j(persistableBundle);
            if (object2 == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (iiw)hwp2.b;
            object2 = (ijl)((hwp)object2).o();
            object2.getClass();
            ((iiw)object).d = object2;
            ((iiw)object).c = 109;
            object2 = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (iiw)hwp2.b;
            object2.getClass();
            ((iiw)object).b |= 2;
            ((iiw)object).e = object2;
            return (iiw)hwp2.o();
        }
        boolean bl2 = ((String)object5).equals("android.type.ordinal");
        int n2 = 1;
        if (bl2) {
            object = ijq.a.l();
            object2 = bzz.g(persistableBundle, "android.arg.number");
            if (object2 == null) {
                bzz.h("android.type.ordinal", "android.arg.number");
                return null;
            }
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (ijq)((hwp)object).b;
            ((ijq)object3).b |= 1;
            ((ijq)object3).c = object2;
            if (object == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (ijq)((hwp)object).o();
            object.getClass();
            ((iiw)object2).d = object;
            ((iiw)object2).c = 108;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.measure")) {
            object = ijn.a.l();
            if (persistableBundle.get("android.arg.denominator") != null) {
                object3 = bzz.j(persistableBundle);
                if (object3 != null) {
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object2 = (ijn)((hwp)object).b;
                    object3 = (ijl)((hwp)object3).o();
                    object3.getClass();
                    ((ijn)object2).d = object3;
                    ((ijn)object2).c = 2;
                }
            } else if (persistableBundle.get("android.arg.fractional_part") != null) {
                object3 = bzz.k(persistableBundle);
                if (object3 != null) {
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object2 = (ijn)((hwp)object).b;
                    object3 = (ijp)((hwp)object3).o();
                    object3.getClass();
                    ((ijn)object2).d = object3;
                    ((ijn)object2).c = 1;
                }
            } else if (persistableBundle.get("android.arg.number") != null && (object3 = bzz.l(persistableBundle)) != null) {
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijn)((hwp)object).b;
                object3 = (ijp)((hwp)object3).o();
                object3.getClass();
                ((ijn)object2).d = object3;
                ((ijn)object2).c = 1;
            }
            if ((object3 = bzz.f(persistableBundle, "android.arg.unit")) == null) {
                bzz.h("android.type.measure", "android.arg.unit");
                return null;
            }
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (ijn)((hwp)object).b;
            ((ijn)object2).b |= 1;
            ((ijn)object2).e = object3;
            if (object == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (ijn)((hwp)object).o();
            object.getClass();
            ((iiw)object2).d = object;
            ((iiw)object2).c = 113;
            object2 = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (iiw)hwp2.b;
            object2.getClass();
            ((iiw)object).b |= 2;
            ((iiw)object).e = object2;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.time")) {
            object2 = ijw.a.l();
            object = bzz.d(persistableBundle, "android.arg.hours");
            if (object != null) {
                if ((Integer)object < 0) return null;
                if ((Integer)object >= 25) return null;
                int n3 = (Integer)object;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object = (ijw)((hwp)object2).b;
                ((ijw)object).b |= 1;
                ((ijw)object).c = n3;
                object3 = bzz.d(persistableBundle, "android.arg.minutes");
                object = object2;
                if (object3 != null) {
                    if ((Integer)object3 < 0) return null;
                    if ((Integer)object3 >= 60) return null;
                    n3 = (Integer)object3;
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object = (ijw)((hwp)object2).b;
                    ((ijw)object).b |= 2;
                    ((ijw)object).d = n3;
                    object = object2;
                }
            } else {
                bzz.h("android.type.time", "android.arg.hours");
                return null;
            }
            if (object == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (ijw)((hwp)object).o();
            object.getClass();
            ((iiw)object2).d = object;
            ((iiw)object2).c = 111;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.date")) {
            int n4;
            object = ijg.a.l();
            object2 = bzz.d(persistableBundle, "android.arg.day");
            if (object2 != null) {
                n4 = (Integer)object2;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijg)((hwp)object).b;
                ((ijg)object2).b |= 2;
                ((ijg)object2).f = n4;
                n4 = 1;
            } else {
                n4 = 0;
            }
            object2 = bzz.d(persistableBundle, "android.arg.weekday");
            if (object2 != null) {
                n4 = (Integer)object2;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijg)((hwp)object).b;
                ((ijg)object2).b |= 1;
                ((ijg)object2).e = n4;
                n4 = 1;
            }
            if ((object2 = bzz.d(persistableBundle, "android.arg.month")) != null) {
                n4 = (Integer)object2;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijg)((hwp)object).b;
                ((ijg)object2).c = 3;
                ((ijg)object2).d = n4 + 1;
                n4 = n2;
            }
            if ((object2 = bzz.d(persistableBundle, "android.arg.year")) != null) {
                n4 = (Integer)object2;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijg)((hwp)object).b;
                ((ijg)object2).b |= 4;
                ((ijg)object2).g = n4;
            } else if (n4 == 0) return null;
            if (object == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (ijg)((hwp)object).o();
            object.getClass();
            ((iiw)object2).d = object;
            ((iiw)object2).c = 114;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.money")) {
            object = ijo.a.l();
            object2 = ijp.a.l();
            object5 = bzz.g(persistableBundle, "android.arg.integer_part");
            if (object5 == null) {
                bzz.h("android.type.decimal", "android.arg.integer_part");
                return null;
            }
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object3 = (ijp)((hwp)object2).b;
            ((ijp)object3).b |= 1;
            ((ijp)object3).c = object5;
            object3 = bzz.g(persistableBundle, "android.arg.fractional_part");
            if (object3 != null) {
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object5 = (ijp)((hwp)object2).b;
                ((ijp)object5).b |= 2;
                ((ijp)object5).d = object3;
            }
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (ijo)((hwp)object).b;
            object2 = (ijp)((hwp)object2).o();
            object2.getClass();
            ((ijo)object3).c = object2;
            ((ijo)object3).b |= 1;
            object3 = bzz.g(persistableBundle, "android.arg.money");
            if (object3 == null) {
                bzz.h("android.type.money", "android.arg.money");
                return null;
            }
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (ijo)((hwp)object).b;
            ((ijo)object2).b |= 2;
            ((ijo)object2).d = object3;
            if (object == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (ijo)((hwp)object).o();
            object.getClass();
            ((iiw)object2).d = object;
            ((iiw)object2).c = 116;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.telephone")) {
            object = ijv.a.l();
            object3 = bzz.f(persistableBundle, "android.arg.country_code");
            if (object3 != null) {
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijv)((hwp)object).b;
                ((ijv)object2).b |= 1;
                ((ijv)object2).c = object3;
            }
            if ((object2 = bzz.f(persistableBundle, "android.arg.number_parts")) != null) {
                for (String string : guf.h().e((CharSequence)object2)) {
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object3 = (ijv)((hwp)object).b;
                    string.getClass();
                    object2 = ((ijv)object3).d;
                    if (!object2.c()) {
                        ((ijv)object3).d = hwv.s((hxk)object2);
                    }
                    ((ijv)object3).d.add(string);
                }
            }
            if ((object3 = bzz.f(persistableBundle, "android.arg.extension")) != null) {
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijv)((hwp)object).b;
                ((ijv)object2).b |= 2;
                ((ijv)object2).e = object3;
            }
            if (object == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (ijv)((hwp)object).o();
            object.getClass();
            ((iiw)object2).d = object;
            ((iiw)object2).c = 115;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.electronic")) {
            object2 = bzz.i(persistableBundle);
            if (object2 == null) return null;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (iiw)hwp2.b;
            object2 = (ijj)((hwp)object2).o();
            object2.getClass();
            ((iiw)object).d = object2;
            ((iiw)object).c = 117;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.digits")) {
            object2 = ijh.a.l();
            object = bzz.f(persistableBundle, "android.arg.digits");
            if (object == null) {
                object = null;
            } else {
                object3 = guf.h().e((CharSequence)object).iterator();
                while (true) {
                    object = object2;
                    if (!object3.hasNext()) break;
                    ((hwp)object2).U((String)object3.next());
                }
            }
            if (object != null) {
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (iiw)hwp2.b;
                object = (ijh)((hwp)object).o();
                object.getClass();
                ((iiw)object2).d = object;
                ((iiw)object2).c = 110;
                return (iiw)hwp2.o();
            } else {
                if (!object4.toString().matches("[0-9]+")) return null;
                object2 = ijh.a.l();
                ((hwp)object2).U(object4.toString());
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (iiw)hwp2.b;
                object2 = (ijh)((hwp)object2).o();
                object2.getClass();
                ((iiw)object).d = object2;
                ((iiw)object).c = 110;
                object2 = object4.toString();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (iiw)hwp2.b;
                object2.getClass();
                ((iiw)object).b |= 2;
                ((iiw)object).e = object2;
            }
            return (iiw)hwp2.o();
        }
        if (((String)object5).equals("android.type.verbatim")) {
            object = bzz.f(persistableBundle, "android.arg.verbatim");
            if (object != null) {
                object3 = ijx.a.l();
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object2 = (ijx)((hwp)object3).b;
                ((ijx)object2).b |= 1;
                ((ijx)object2).c = object;
                object = (ijx)((hwp)object3).o();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (iiw)hwp2.b;
                object.getClass();
                ((iiw)object2).d = object;
                ((iiw)object2).c = 102;
                return (iiw)hwp2.o();
            } else {
                object = ijx.a.l();
                object3 = object4.toString();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (ijx)((hwp)object).b;
                object3.getClass();
                ((ijx)object2).b |= 1;
                ((ijx)object2).c = object3;
                object2 = (ijx)((hwp)object).o();
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (iiw)hwp2.b;
                object2.getClass();
                ((iiw)object).d = object2;
                ((iiw)object).c = 102;
            }
            return (iiw)hwp2.o();
        }
        if (object.getType().equals("android.type.location")) {
            object = ian.a.l();
            object5 = bzz.d(persistableBundle, "android.latitude_e7");
            object3 = bzz.d(persistableBundle, "android.longitude_e7");
            if (object5 != null && object3 != null) {
                object2 = iam.a.l();
                int n5 = (Integer)object5;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object5 = (iam)((hwp)object2).b;
                ((iam)object5).b |= 1;
                ((iam)object5).c = n5;
                n5 = (Integer)object3;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object3 = (iam)((hwp)object2).b;
                ((iam)object3).b |= 2;
                ((iam)object3).d = n5;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (ian)((hwp)object).b;
                object2 = (iam)((hwp)object2).o();
                object2.getClass();
                ((ian)object3).c = object2;
                ((ian)object3).b |= 0x10;
            }
            if (persistableBundle.containsKey("android.cell_id") || persistableBundle.containsKey("android.fprint")) {
                long l2;
                object2 = ial.a.l();
                object3 = bzz.e(persistableBundle, "android.cell_id");
                if (object3 != null) {
                    l2 = (Long)object3;
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (ial)((hwp)object2).b;
                    ((ial)object3).b |= 1;
                    ((ial)object3).c = l2;
                }
                if ((object3 = bzz.e(persistableBundle, "android.fprint")) != null) {
                    l2 = (Long)object3;
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (ial)((hwp)object2).b;
                    ((ial)object3).b |= 2;
                    ((ial)object3).d = l2;
                }
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (ian)((hwp)object).b;
                object2 = (ial)((hwp)object2).o();
                object2.getClass();
                ((ian)object3).d = object2;
                ((ian)object3).b |= 0x200;
            }
            object2 = iiz.a.l();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object3 = (iiz)((hwp)object2).b;
            object = (ian)((hwp)object).o();
            object.getClass();
            ((iiz)object3).c = object;
            ((iiz)object3).b |= 1;
            object3 = (iiz)((hwp)object2).o();
            object = (hwr)iis.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (iis)((hwr)object).b;
            object3.getClass();
            ((iis)object2).c = object3;
            ((iis)object2).b |= 1;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object = (iis)((hwp)object).o();
            object.getClass();
            ((iiw)object2).f = object;
            ((iiw)object2).b |= 8;
            object = object4.toString();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (iiw)hwp2.b;
            object.getClass();
            ((iiw)object2).b |= 2;
            ((iiw)object2).e = object;
            return (iiw)hwp2.o();
        }
        if (object.getType().equals("android.type.pause")) {
            object3 = bzz.d(persistableBundle, "android.milliseconds");
            if (object3 == null) {
                bzz.h("android.type.pause", "android.milliseconds");
                return null;
            }
            object = ijs.a.l();
            object2 = ijr.a.l();
            float f2 = ((Integer)object3).intValue();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object3 = (ijr)((hwp)object2).b;
            ((ijr)object3).b |= 2;
            ((ijr)object3).c = f2 /= 1000.0f;
            object3 = (ijr)((hwp)object2).o();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (ijs)((hwp)object).b;
            object3.getClass();
            ((ijs)object2).c = object3;
            ((ijs)object2).b |= 2;
            object2 = (ijs)((hwp)object).o();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (iiw)hwp2.b;
            object2.getClass();
            ((iiw)object).d = object2;
            ((iiw)object).c = 101;
            return (iiw)hwp2.o();
        }
        ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "createPiece", 226, "MarkupHelper.java")).u("TtsSpan of type %s is not recognized.", object5);
        return null;
    }

    public static boolean c(CharSequence charSequence) {
        return StandardCharsets.UTF_16.newEncoder().canEncode(charSequence.toString());
    }

    private static Integer d(PersistableBundle object, String string) {
        if ((object = object.get(string)) instanceof String) {
            String string2 = (String)object;
            object = string2;
            if (string2.length() > 0) {
                object = string2;
                if (string2.charAt(0) == '+') {
                    object = string2.substring(1);
                }
            }
            try {
                object = Integer.valueOf((String)object);
                return object;
            }
            catch (NumberFormatException numberFormatException) {
                ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsInt", 551, "MarkupHelper.java")).u("The value of argument %s could not be parsed as an integer.", string);
                return null;
            }
        }
        if (object instanceof Integer) {
            return (Integer)object;
        }
        if (object instanceof Double) {
            if (!((Double)(object = (Double)object) > 2.147483647E9) && !((Double)object < -2.147483648E9)) {
                return ((Double)object).intValue();
            }
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsInt", 559, "MarkupHelper.java")).C("The value of the argument %s is not in integer range: %f", string, object);
            return null;
        }
        if (object instanceof Long) {
            if ((Long)(object = (Long)object) <= Integer.MAX_VALUE && (Long)object >= Integer.MIN_VALUE) {
                return ((Long)object).intValue();
            }
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsInt", 566, "MarkupHelper.java")).C("The value of the argument %s is not in integer range: %d", string, object);
            return null;
        }
        ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsInt", 572, "MarkupHelper.java")).u("The value of argument %s should not be passed as an object.", string);
        return null;
    }

    private static Long e(PersistableBundle object, String string) {
        if ((object = object.get(string)) instanceof Long) {
            return (Long)object;
        }
        if (object instanceof String) {
            String string2 = (String)object;
            object = string2;
            if (string2.length() > 0) {
                object = string2;
                if (string2.charAt(0) == '+') {
                    object = string2.substring(1);
                }
            }
            try {
                object = Long.valueOf((String)object);
                return object;
            }
            catch (NumberFormatException numberFormatException) {
                ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsLong", 597, "MarkupHelper.java")).u("The value of argument %s could not be parsed as a long.", string);
                return null;
            }
        }
        if (object instanceof Integer) {
            return ((Integer)object).longValue();
        }
        if (object instanceof Double) {
            if (!((Double)(object = (Double)object) > 9.223372036854776E18) && !((Double)object < -9.223372036854776E18)) {
                return ((Double)object).longValue();
            }
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsLong", 605, "MarkupHelper.java")).C("The value of the argument %s is not in long range: %s", string, object);
            return null;
        }
        ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsLong", 610, "MarkupHelper.java")).u("The value of argument %s should not be passed as an object.", string);
        return null;
    }

    private static String f(PersistableBundle object, String string) {
        if ((object = object.get(string)) instanceof String) {
            string = (String)object;
            if (bzz.c(string)) {
                return string;
            }
            ((heg)((heg)a.g()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getAsString", 630, "MarkupHelper.java")).u("Input to speech synthesizer contains invalid UTF-16: %s", string);
        }
        if (!(object instanceof Integer || object instanceof Double || object instanceof Long)) {
            return null;
        }
        return object.toString();
    }

    private static String g(PersistableBundle object, String string) {
        if ((object = object.get(string)) instanceof String) {
            string = (String)object;
            object = string;
            if (string.length() > 0) {
                object = string;
                if (string.charAt(0) == '+') {
                    object = string.substring(1);
                }
            }
            return object;
        }
        if (!(object instanceof Integer || object instanceof Double || object instanceof Long)) {
            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "getNumberAsString", 528, "MarkupHelper.java")).u("The value of argument %s should not be passed as an object.", string);
            return null;
        }
        return object.toString();
    }

    private static void h(String string, String string2) {
        ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupHelper", "logWarning", 233, "MarkupHelper.java")).C("TtsSpan of type %s does not have a value for argument %s", string, string2);
    }

    private static hwp i(PersistableBundle object) {
        int n2;
        Object object2;
        hwp hwp2 = ijj.a.l();
        Object object3 = bzz.f(object, "android.arg.protocol");
        int n3 = 1;
        if (object3 != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ijj)hwp2.b;
            ((ijj)object2).b |= 1;
            ((ijj)object2).c = object3;
            n2 = 1;
        } else {
            n2 = 0;
        }
        object3 = bzz.f(object, "android.arg.username");
        if (object3 != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ijj)hwp2.b;
            ((ijj)object2).b |= 2;
            ((ijj)object2).d = object3;
            n2 = 1;
        }
        if ((object2 = bzz.f(object, "android.arg.password")) != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (ijj)hwp2.b;
            ((ijj)object3).b |= 4;
            ((ijj)object3).e = object2;
        }
        if ((object3 = bzz.f(object, "android.arg.domain")) != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ijj)hwp2.b;
            ((ijj)object2).b |= 8;
            ((ijj)object2).f = object3;
            n2 = 1;
        }
        if ((object3 = bzz.d(object, "android.arg.port")) != null) {
            n2 = (Integer)object3;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (ijj)hwp2.b;
            ((ijj)object3).b |= 0x10;
            ((ijj)object3).g = n2;
            n2 = 1;
        }
        if ((object2 = bzz.f(object, "android.arg.path")) != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (ijj)hwp2.b;
            ((ijj)object3).b |= 0x20;
            ((ijj)object3).h = object2;
            n2 = 1;
        }
        if ((object2 = bzz.f(object, "android.arg.query_string")) != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object3 = (ijj)hwp2.b;
            ((ijj)object3).b |= 0x40;
            ((ijj)object3).i = object2;
            n2 = n3;
        }
        if ((object3 = bzz.f(object, "android.arg.fragment_id")) != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (ijj)hwp2.b;
            object.b |= 0x80;
            object.j = object3;
        } else if (n2 == 0) {
            return null;
        }
        return hwp2;
    }

    private static hwp j(PersistableBundle object) {
        Object object2;
        hwp hwp2 = ijl.a.l();
        String string = bzz.g(object, "android.arg.integer_part");
        if (string != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ijl)hwp2.b;
            ((ijl)object2).b |= 1;
            ((ijl)object2).c = string;
        }
        if ((string = bzz.g(object, "android.arg.numerator")) == null) {
            bzz.h("android.type.fraction", "android.arg.numerator");
            return null;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object2 = (ijl)hwp2.b;
        ((ijl)object2).b |= 2;
        ((ijl)object2).d = string;
        object2 = bzz.g(object, "android.arg.denominator");
        if (object2 == null) {
            bzz.h("android.type.fraction", "android.arg.denominator");
            return null;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (ijl)hwp2.b;
        object.b |= 4;
        object.e = object2;
        return hwp2;
    }

    private static hwp k(PersistableBundle object) {
        hwp hwp2 = ijp.a.l();
        String string = bzz.g(object, "android.arg.integer_part");
        if (string == null) {
            bzz.h("android.type.decimal", "android.arg.integer_part");
            return null;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        ijp ijp2 = (ijp)hwp2.b;
        ijp2.b |= 1;
        ijp2.c = string;
        string = bzz.g(object, "android.arg.fractional_part");
        if (string != null) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (ijp)hwp2.b;
            object.b |= 2;
            object.d = string;
        }
        return hwp2;
    }

    private static hwp l(PersistableBundle object) {
        hwp hwp2 = ijp.a.l();
        String string = bzz.g(object, "android.arg.number");
        if (string == null) {
            bzz.h("android.type.cardinal", "android.arg.number");
            return null;
        }
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (ijp)hwp2.b;
        object.b |= 1;
        object.c = string;
        return hwp2;
    }
}

