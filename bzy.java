/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spanned
 *  android.text.TextUtils
 *  android.text.style.TtsSpan
 */
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.TtsSpan;
import com.google.android.apps.speech.tts.googletts.util.SsmlHandler;
import com.google.android.apps.speech.tts.googletts.util.SsmlToLucidParserResult;
import java.io.Serializable;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class bzy {
    private static final hei a;
    private static final Map b;

    static {
        HashMap<String, BreakIterator> hashMap;
        a = hei.m("com/google/android/apps/speech/tts/googletts/util/MarkupGenerator");
        b = hashMap = new HashMap<String, BreakIterator>();
        hashMap.put("default", BreakIterator.getSentenceInstance(Locale.US));
    }

    public static List a(brv object, bry object2, List object3, ike iterator, boolean bl2, String object4) {
        block71: {
            block77: {
                int n2;
                Object object5;
                Object object6;
                Object object7;
                block76: {
                    boolean bl3;
                    block74: {
                        Object object8;
                        Object object92;
                        Object object10;
                        block75: {
                            block72: {
                                block73: {
                                    int n3;
                                    int n4;
                                    if (((brv)object).a.toString().isEmpty()) break block71;
                                    if (((brv)object).n) {
                                        object2 = SsmlHandler.nativeSsmlToLucid(((brv)object).a.toString());
                                        ((brv)object).o = ((SsmlToLucidParserResult)object2).getParseResult();
                                        if (!((SsmlToLucidParserResult)object2).getParseResult()) {
                                            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupGenerator", "handleSsmlInput", 157, "MarkupGenerator.java")).r("Unable to correctly parse SSML input. Parse results might be unexpected.");
                                        }
                                        object3 = (hwr)iis.a.l();
                                        hwp hwp2 = ika.a.l();
                                        if (object4 != null) {
                                            hwp hwp3 = ijz.a.l();
                                            if (!hwp3.b.B()) {
                                                hwp3.u();
                                            }
                                            ijz ijz2 = (ijz)hwp3.b;
                                            ijz2.b |= 1;
                                            ijz2.c = object4;
                                            hwp2.W((ijz)hwp3.o());
                                        }
                                        if (bzy.b((ike)((Object)iterator))) {
                                            iterator = (iiy)bzy.c((ike)((Object)iterator)).o();
                                            if (!((hwp)object3).b.B()) {
                                                ((hwp)object3).u();
                                            }
                                            object4 = (iis)((hwr)object3).b;
                                            iterator.getClass();
                                            ((iis)object4).e = iterator;
                                            ((iis)object4).b |= 4;
                                        }
                                        float f2 = ((brv)object).l;
                                        if (!hwp2.b.B()) {
                                            hwp2.u();
                                        }
                                        object = (ika)hwp2.b;
                                        ((ika)object).b |= 1;
                                        ((ika)object).c = f2;
                                        iterator = (ika)hwp2.o();
                                        if (!((hwp)object3).b.B()) {
                                            ((hwp)object3).u();
                                        }
                                        object = (iis)((hwr)object3).b;
                                        iterator.getClass();
                                        ((iis)object).f = iterator;
                                        ((iis)object).b |= 8;
                                        iterator = new ArrayList();
                                        object = ((SsmlToLucidParserResult)object2).getText();
                                        object2 = (hwp)((hwv)object).C(5);
                                        ((hwp)object2).x((hwv)object);
                                        object4 = (hwr)object2;
                                        object = object2 = ((ikd)((hwr)object4).b).c;
                                        if (object2 == null) {
                                            object = iiu.a;
                                        }
                                        if ((((iiu)object).b & 1) != 0) {
                                            object = object2 = ((ikd)((hwr)object4).b).c;
                                            if (object2 == null) {
                                                object = iiu.a;
                                            }
                                            object = object2 = ((iiu)object).d;
                                            if (object2 == null) {
                                                object = iis.a;
                                            }
                                            ((hwp)object3).x((hwv)object);
                                        }
                                        object = object2 = ((ikd)((hwr)object4).b).c;
                                        if (object2 == null) {
                                            object = iiu.a;
                                        }
                                        object2 = (hwp)((hwv)object).C(5);
                                        ((hwp)object2).x((hwv)object);
                                        object = (hwr)object2;
                                        object3 = (iis)((hwp)object3).o();
                                        if (!((hwp)object).b.B()) {
                                            ((hwp)object).u();
                                        }
                                        object2 = (iiu)((hwr)object).b;
                                        object3.getClass();
                                        ((iiu)object2).d = object3;
                                        ((iiu)object2).b |= 1;
                                        object2 = (iiu)((hwp)object).o();
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (ikd)((hwr)object4).b;
                                        object2.getClass();
                                        ((ikd)object).c = object2;
                                        ((ikd)object).b |= 1;
                                        iterator.add(new bxt((hwr)object4));
                                        return iterator;
                                    }
                                    object7 = ((brv)object).a;
                                    if (object7 instanceof Spanned) {
                                        object6 = (Spanned)object7;
                                        object5 = new ArrayList();
                                        n4 = 0;
                                        n3 = 0;
                                        n2 = 0;
                                        while (n4 < object6.length()) {
                                            object7 = (TtsSpan[])object6.getSpans(n4, n4 + 1, TtsSpan.class);
                                            object10 = new ArrayList<Object>();
                                            for (Object object92 : object7) {
                                                if (!object92.getType().equals("android.type.sentence") || object6.getSpanStart(object92) != n4) continue;
                                                ((ArrayList)object10).add(object92);
                                            }
                                            if (!((ArrayList)object10).isEmpty()) {
                                                if (n3 != n4) {
                                                    object5.add((bxt)bzy.d((Spanned)object6, n3, n4, object2));
                                                }
                                                object7 = (TtsSpan)((ArrayList)object10).get(0);
                                                object5.add((bxt)bzy.d((Spanned)object6, n4, object6.getSpanEnd(object7), object2));
                                                n2 = object6.getSpanEnd(object7);
                                                n3 = object6.getSpanEnd(object7);
                                            }
                                            n4 = ++n2;
                                        }
                                        object7 = object5;
                                        if (n3 != object6.length()) {
                                            object5.add(bzy.d((Spanned)object6, n3, object6.length(), (bry)object2));
                                            object7 = object5;
                                        }
                                    } else {
                                        object5 = object7.toString();
                                        object6 = new ArrayList();
                                        object7 = new ArrayList();
                                        kh.k(bzz.a((String)object5), bzx.a, (List)object6, (List)object7);
                                        object7 = Arrays.asList(kh.u((List)object6, (List)object7));
                                    }
                                    n2 = object3.contains(btx.b) && ism.a.b().a() ? 1 : 0;
                                    if (!bl2) break block72;
                                    if (n2 != 0) break block73;
                                    object3 = new ArrayList();
                                    object6 = object7.iterator();
                                    while (object6.hasNext()) {
                                        Serializable serializable;
                                        Object object11;
                                        object8 = (bxt)object6.next();
                                        object7 = object5 = ((ikd)((hwr)((bxt)object8).a).b).c;
                                        if (object5 == null) {
                                            object7 = iiu.a;
                                        }
                                        object7 = (iit)((iiu)object7).c.get(0);
                                        object7 = ((iit)object7).b == 2 ? (iix)((iit)object7).c : iix.a;
                                        object10 = ((iix)object7).c;
                                        object7 = ((bsa)object2).e();
                                        object5 = ((bsa)object2).c();
                                        if (!TextUtils.isEmpty((CharSequence)object7) && !TextUtils.isEmpty((CharSequence)object5)) {
                                            object92 = ((String)object7).toLowerCase(Locale.getDefault());
                                            object11 = ((String)object5).toLowerCase(Locale.getDefault());
                                            serializable = new StringBuilder();
                                            ((StringBuilder)serializable).append((String)object92);
                                            ((StringBuilder)serializable).append("-");
                                            ((StringBuilder)serializable).append((String)object11);
                                            object11 = ((StringBuilder)serializable).toString();
                                            object92 = b;
                                            if (object92.containsKey(object11)) {
                                                object5 = (BreakIterator)object92.get(object11);
                                            } else {
                                                object5 = BreakIterator.getSentenceInstance(new Locale(((String)object7).toLowerCase(Locale.getDefault()), ((String)object5).toLowerCase(Locale.getDefault())));
                                                if (object5 == null) {
                                                    object5 = (BreakIterator)object92.get("default");
                                                } else {
                                                    object92.put(object11, object5);
                                                }
                                            }
                                        } else {
                                            object5 = (BreakIterator)b.get("default");
                                        }
                                        if (object5 == null) {
                                            ((heg)((heg)a.h()).j("com/google/android/apps/speech/tts/googletts/util/MarkupGenerator", "breakIntoMultipleSentences", 262, "MarkupGenerator.java")).C("Unable to find break iterator, lang = %s, country = %s", ((bsa)object2).e(), ((bsa)object2).c());
                                            object5 = Arrays.asList(object8);
                                            object7 = object6;
                                        } else {
                                            object7 = new ArrayList();
                                            serializable = new ArrayList();
                                            object11 = new ArrayList();
                                            for (n3 = 0; n3 < object10.size(); ++n3) {
                                                iiw iiw2 = (iiw)object10.get(n3);
                                                if ((iiw2.b & 2) != 0) {
                                                    ((BreakIterator)object5).setText(iiw2.e);
                                                    n4 = ((BreakIterator)object5).first();
                                                    n2 = ((BreakIterator)object5).next();
                                                    while (n2 != -1) {
                                                        String string;
                                                        int n5;
                                                        if (n4 != 0 && kh.l((List)((Object)serializable)) > 0) {
                                                            object7.add(kh.u((List)((Object)serializable), (List)object11));
                                                            serializable.clear();
                                                            object11.clear();
                                                        }
                                                        Object object12 = gsx.c;
                                                        object92 = iiw2.e.substring(n4, n2);
                                                        int n6 = new gsu((gsy)object12).c((CharSequence)object92, 0);
                                                        int n7 = object92.length();
                                                        int n8 = 0;
                                                        while (true) {
                                                            n5 = n7;
                                                            if (n8 >= n7) break;
                                                            if (!((gsy)object12).b(object92.charAt(n8))) {
                                                                n5 = n7;
                                                                break;
                                                            }
                                                            ++n8;
                                                        }
                                                        while ((n7 = n5 - 1) > n8) {
                                                            n5 = n7;
                                                            if (((gsy)object12).b(object92.charAt(n7))) continue;
                                                        }
                                                        if (!(string = object92.subSequence(n8, n7 + 1).toString()).isEmpty()) {
                                                            object92 = new bzw(n4 + n6, string.length());
                                                            if (string.length() > 200) {
                                                                ((heg)((heg)a.c()).j("com/google/android/apps/speech/tts/googletts/util/MarkupGenerator", "breakIntoMultipleSentences", 300, "MarkupGenerator.java")).u("Found overly long sentence: %s", string);
                                                            }
                                                            hwp hwp4 = (hwp)iiw2.C(5);
                                                            hwp4.x(iiw2);
                                                            if (!hwp4.b.B()) {
                                                                hwp4.u();
                                                            }
                                                            object12 = (iiw)hwp4.b;
                                                            string.getClass();
                                                            ((iiw)object12).b |= 2;
                                                            ((iiw)object12).e = string;
                                                            kh.k((iiw)hwp4.o(), new bzu(((bxt)object8).a(n3), (bzx)object92), (List)((Object)serializable), (List)object11);
                                                        }
                                                        n8 = ((BreakIterator)object5).next();
                                                        n4 = n2;
                                                        n2 = n8;
                                                    }
                                                    object92 = object7;
                                                    object7 = object3;
                                                    object3 = object92;
                                                } else {
                                                    object92 = object3;
                                                    object3 = object7;
                                                    kh.k(iiw2, ((bxt)object8).a(n3), (List)((Object)serializable), (List)object11);
                                                    object7 = object92;
                                                }
                                                object92 = object6;
                                                object6 = object7;
                                                object7 = object3;
                                                object3 = object6;
                                                object6 = object92;
                                            }
                                            if (kh.l((List)((Object)serializable)) > 0) {
                                                object7.add(kh.u((List)((Object)serializable), (List)object11));
                                            }
                                            object5 = object7;
                                            object7 = object6;
                                        }
                                        object3.addAll(object5);
                                        object6 = object7;
                                    }
                                    object2 = object3;
                                    break block74;
                                }
                                bl2 = true;
                                break block75;
                            }
                            bl2 = false;
                        }
                        object5 = object7.iterator();
                        block7: while (true) {
                            object2 = object7;
                            if (!object5.hasNext()) break;
                            object6 = (bxt)object5.next();
                            n2 = 0;
                            while (true) {
                                object2 = object3 = ((ikd)((hwr)((bxt)object6).a).b).c;
                                if (object3 == null) {
                                    object2 = iiu.a;
                                }
                                if (n2 >= ((iiu)object2).c.size()) continue block7;
                                object2 = object3 = ((ikd)((hwr)((bxt)object6).a).b).c;
                                if (object3 == null) {
                                    object2 = iiu.a;
                                }
                                object2 = (iit)((iiu)object2).c.get(n2);
                                object10 = (hwp)((hwv)object2).C(5);
                                ((hwp)object10).x((hwv)object2);
                                object2 = (iit)((hwp)object10).b;
                                if (((iit)object2).b == 2) {
                                    object3 = (iix)((iit)object2).c;
                                    object2 = (hwp)((hwv)object3).C(5);
                                    ((hwp)object2).x((hwv)object3);
                                    object92 = (hwr)object2;
                                    if (!((hwp)object92).b.B()) {
                                        ((hwp)object92).u();
                                    }
                                    object2 = (iix)((hwr)object92).b;
                                    object3 = iix.a;
                                    ((iix)object2).b |= 2;
                                    ((iix)object2).e = bl2;
                                    object2 = (iix)((hwp)object92).o();
                                    if (!((hwp)object10).b.B()) {
                                        ((hwp)object10).u();
                                    }
                                    object3 = (iit)((hwp)object10).b;
                                    object2.getClass();
                                    ((iit)object3).c = object2;
                                    ((iit)object3).b = 2;
                                    object8 = ((bxt)object6).a;
                                    object92 = (hwr)object8;
                                    object2 = object3 = ((ikd)((hwr)object92).b).c;
                                    if (object3 == null) {
                                        object2 = iiu.a;
                                    }
                                    object3 = (hwp)((hwv)object2).C(5);
                                    ((hwp)object3).x((hwv)object2);
                                    object2 = (hwr)object3;
                                    object3 = (iit)((hwp)object10).o();
                                    if (!((hwp)object2).b.B()) {
                                        ((hwp)object2).u();
                                    }
                                    object10 = (iiu)((hwr)object2).b;
                                    object3.getClass();
                                    ((iiu)object10).G();
                                    ((iiu)object10).c.set(n2, object3);
                                    object2 = (iiu)((hwp)object2).o();
                                    object3 = (hwp)object8;
                                    if (!((hwp)object3).b.B()) {
                                        ((hwp)object3).u();
                                    }
                                    object3 = (ikd)((hwr)object92).b;
                                    object2.getClass();
                                    ((ikd)object3).c = object2;
                                    ((ikd)object3).b |= 1;
                                }
                                ++n2;
                            }
                            break;
                        }
                    }
                    n2 = object4 == null && (double)((brv)object).l == 1.0 ? 0 : 1;
                    bl2 = bl3 = bzy.b((ike)((Object)iterator));
                    if (n2 != 0) break block76;
                    if (!bl3) break block77;
                    bl2 = true;
                }
                if (!object2.isEmpty()) {
                    object7 = (hwr)iis.a.l();
                    if (n2 != 0) {
                        float f3;
                        object3 = ika.a.l();
                        if (object4 != null) {
                            object5 = ijz.a.l();
                            if (!((hwp)object5).b.B()) {
                                ((hwp)object5).u();
                            }
                            object6 = (ijz)((hwp)object5).b;
                            ((ijz)object6).b |= 1;
                            ((ijz)object6).c = object4;
                            ((hwp)object3).W((ijz)((hwp)object5).o());
                        }
                        if ((double)(f3 = ((brv)object).l) != 1.0) {
                            if (!((hwp)object3).b.B()) {
                                ((hwp)object3).u();
                            }
                            object = (ika)((hwp)object3).b;
                            ((ika)object).b |= 1;
                            ((ika)object).c = f3;
                        }
                        object = (ika)((hwp)object3).o();
                        if (!((hwp)object7).b.B()) {
                            ((hwp)object7).u();
                        }
                        object3 = (iis)((hwr)object7).b;
                        object.getClass();
                        ((iis)object3).f = object;
                        ((iis)object3).b |= 8;
                    }
                    if (bl2) {
                        fxf.K(iterator);
                        object = (iiy)bzy.c(iterator).o();
                        if (!((hwp)object7).b.B()) {
                            ((hwp)object7).u();
                        }
                        object3 = (iis)((hwr)object7).b;
                        object.getClass();
                        ((iis)object3).e = object;
                        ((iis)object3).b |= 4;
                    }
                    iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        object4 = (bxt)iterator.next();
                        object = object3 = ((ikd)((hwr)((bxt)object4).a).b).c;
                        if (object3 == null) {
                            object = iiu.a;
                        }
                        object3 = (hwp)((hwv)object).C(5);
                        ((hwp)object3).x((hwv)object);
                        object5 = (hwr)object3;
                        object3 = (iis)((hwp)object7).o();
                        if (!((hwp)object5).b.B()) {
                            ((hwp)object5).u();
                        }
                        object = (iiu)((hwr)object5).b;
                        object3.getClass();
                        ((iiu)object).d = object3;
                        ((iiu)object).b |= 1;
                        object = (iiu)((hwp)object5).o();
                        object3 = ((bxt)object4).a;
                        object4 = (hwp)object3;
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        object3 = (ikd)((hwr)object3).b;
                        object.getClass();
                        ((ikd)object3).c = object;
                        ((ikd)object3).b |= 1;
                    }
                }
            }
            return object2;
        }
        return new ArrayList();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean b(ike ike2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (ike2 == null) return bl3;
        if ((double)ike2.c != 1.0) return true;
        if ((double)ike2.d != 1.0) return true;
        return bl2;
    }

    static hwp c(ike hwv2) {
        float f2;
        hwp hwp2 = iiy.a.l();
        if ((hwv2.b & 2) != 0 && (double)(f2 = hwv2.d) != 1.0) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            iiy iiy2 = (iiy)hwp2.b;
            iiy2.c = 1;
            iiy2.d = Float.valueOf(f2);
        }
        if ((hwv2.b & 1) != 0 && (double)(f2 = hwv2.c) != 1.0) {
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (iiy)hwp2.b;
            ((iiy)hwv2).b |= 8;
            ((iiy)hwv2).e = f2;
        }
        return hwp2;
    }

    static bxt d(Spanned spanned, int n2, int n3, bry bry2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (n2 < n3) {
            int n4;
            int n5;
            int n6;
            block8: {
                TtsSpan ttsSpan;
                TtsSpan ttsSpan2 = (TtsSpan)spanned.getSpans(n2, n2 + 1, TtsSpan.class);
                n6 = ((TtsSpan[])ttsSpan2).length;
                for (n5 = 0; n5 < n6; ++n5) {
                    ttsSpan = ttsSpan2[n5];
                    if (ttsSpan.getType().equals("android.type.sentence") || spanned.getSpanStart((Object)ttsSpan) != n2) continue;
                    spanned.getSpanEnd((Object)ttsSpan);
                }
                n4 = ((TtsSpan[])ttsSpan2).length;
                for (n5 = 0; n5 < n4; ++n5) {
                    ttsSpan = ttsSpan2[n5];
                    int n7 = spanned.getSpanStart((Object)ttsSpan);
                    if ((ttsSpan = bzz.b(ttsSpan, spanned.subSequence(n7, n6 = spanned.getSpanEnd((Object)ttsSpan)), bry2)) == null) {
                        continue;
                    }
                    kh.k((iiw)ttsSpan, new bzw(n7, n6 - n7), arrayList, arrayList2);
                    n4 = 1;
                    n5 = n6;
                    break block8;
                }
                n5 = n2;
                n4 = 0;
            }
            n6 = n5++;
            if (n4 == 0) {
                block9: {
                    while (n5 < spanned.length()) {
                        n4 = n5 + 1;
                        for (TtsSpan ttsSpan2 : (TtsSpan)spanned.getSpans(n5, n4, TtsSpan.class)) {
                            if (spanned.getSpanStart((Object)ttsSpan2) != n5 || spanned.getSpanEnd((Object)ttsSpan2) > n3 || ttsSpan2.getType().equals("android.type.sentence")) {
                                continue;
                            }
                            break block9;
                        }
                        n5 = n4;
                    }
                    n5 = n3;
                }
                kh.k(bzz.a(spanned.toString().substring(n2, n5)), new bzw(n2, n5 - n2), arrayList, arrayList2);
                n6 = n5;
            }
            n2 = n6;
        }
        return kh.u(arrayList, arrayList2);
    }
}

