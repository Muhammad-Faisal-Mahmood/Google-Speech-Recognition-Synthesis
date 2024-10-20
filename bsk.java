/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.dispatch.VoicePolicyManager;
import j$.util.function.Predicate$_CC;
import java.util.Locale;
import java.util.function.Predicate;

public final class bsk
implements Predicate {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ bsk(VoicePolicyManager voicePolicyManager, brv brv2, int n2) {
        this.c = n2;
        this.b = voicePolicyManager;
        this.a = brv2;
    }

    public /* synthetic */ bsk(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                return Predicate$_CC.$default$and(this, predicate);
            }
            return Predicate$_CC.$default$and(this, predicate);
        }
        return Predicate$_CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                return Predicate$_CC.$default$negate(this);
            }
            return Predicate$_CC.$default$negate(this);
        }
        return Predicate$_CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                return Predicate$_CC.$default$or(this, predicate);
            }
            return Predicate$_CC.$default$or(this, predicate);
        }
        return Predicate$_CC.$default$or(this, predicate);
    }

    public final boolean test(Object object) {
        boolean bl2;
        block7: {
            int n2;
            block13: {
                block11: {
                    Object object2;
                    Object object3;
                    int n3;
                    block9: {
                        block10: {
                            block12: {
                                int n4;
                                block8: {
                                    n4 = this.c;
                                    if (n4 == 0) break block7;
                                    n3 = 1;
                                    if (n4 != 1) {
                                        if (!((hac)this.a).containsKey(object = (ibz)object)) {
                                            Object object4 = this.b;
                                            heg heg2 = (heg)((heg)fah.a.g().h(hfo.a, "VoiceSearchConfigUtils")).j("com/google/android/libraries/speech/modeldownload/languagepacks/helper/VoiceSearchConfigProtoUtils", "parseDomainToFeatureIndex", 57, "VoiceSearchConfigProtoUtils.java");
                                            object4 = (huw)object4;
                                            heg2.G("Unrecognized recognizer for [%s, %d]: %d. Ignoring it and its associated features.", ((huw)object4).d, ((huw)object4).f, ((ibz)object).ai);
                                            return false;
                                        }
                                        return true;
                                    }
                                    object = (bso)object;
                                    object3 = ((bso)object).g();
                                    object2 = this.a;
                                    if (object3 == bua.d || ((bso)object).g() == bua.e) break block8;
                                    if (((bso)object).g() != bua.f) break block9;
                                    n2 = isv.c();
                                    break block10;
                                }
                                object3 = (brv)object2;
                                if ((double)((brv)object3).a() < 0.5 || (double)((brv)object3).a() > 2.0 || ((brv)object3).d != 100) break block11;
                                if (((bso)object).g() != bua.d) break block12;
                                n4 = itb.c() && cab.a.contains(((bso)object).e()) ? 1 : 0;
                                int n5 = itb.a.b().a() && cab.b.contains(((bso)object).e()) ? 1 : 0;
                                n2 = n4 | n5;
                                break block10;
                            }
                            if (((bso)object).g() != bua.e) break block9;
                            n2 = ((bso)object).f() == btz.c ? iss.d() : (((bso)object).f() == btz.d ? (int)(iss.e() ? 1 : 0) : (int)(iss.c() ? 1 : 0));
                        }
                        if (n2 == 0) break block11;
                    }
                    object3 = this.b;
                    String string = ((bso)object).m();
                    object3 = (VoicePolicyManager)object3;
                    n2 = n3;
                    if (!((VoicePolicyManager)object3).d.contains(string)) break block13;
                    object2 = ((brv)object2).j;
                    object3 = ((VoicePolicyManager)object3).c;
                    object2 = fxf.O((String)object2);
                    object3 = (hav)((hac)object3).get(object2);
                    n2 = n3;
                    if (object3 == null) break block13;
                    n2 = n3;
                    if (!((gzm)object3).contains(((bso)object).m())) break block13;
                    ((heg)((heg)VoicePolicyManager.a.c()).j("com/google/android/apps/speech/tts/googletts/dispatch/VoicePolicyManager", "isVoiceAllowed", 135, "VoicePolicyManager.java")).C("Caller %s restricted from using voice %s", object2, ((bso)object).m());
                }
                n2 = 0;
            }
            return n2 != 0;
        }
        object = (String)object;
        VoicePolicyManager voicePolicyManager = (VoicePolicyManager)this.a;
        voicePolicyManager.b();
        String string = ((String)object).toLowerCase(Locale.getDefault());
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = (String)this.b;
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(string);
        string = stringBuilder.toString();
        if (voicePolicyManager.e.containsKey(string)) {
            bl2 = (Boolean)voicePolicyManager.e.get(string);
        } else {
            bl2 = voicePolicyManager.nativeManagerCanClientAccess1PVoices(voicePolicyManager.b, string2, ((String)object).toLowerCase(Locale.getDefault()));
            voicePolicyManager.e.put(string, bl2);
        }
        return bl2;
    }
}

