/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.net.Uri
 *  android.util.JsonWriter
 *  hom
 */
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.JsonWriter;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class crh {
    public static volatile crh c;

    public crh() {
    }

    public crh(cgw cgw2) {
        jse.e(cgw2, "clock");
    }

    public crh(byte[] byArray) {
    }

    public static gto A(String string, int n2, gzx arrayList) {
        jse.e(string, "locale");
        ArrayList arrayList22 = new ArrayList();
        for (Object e2 : arrayList) {
            if (!jse.i(((ezj)e2).a.toLanguageTag(), string)) continue;
            arrayList22.add(e2);
        }
        arrayList = new ArrayList();
        for (Object t2 : arrayList22) {
            if (((ezj)t2).b != n2) continue;
            arrayList.add(t2);
        }
        ((hfk)ezs.a.b()).G("LanguagePacks matching given constraints of %s %d: %s", string, n2, arrayList);
        if (arrayList.isEmpty()) {
            return gsl.a;
        }
        if (arrayList.size() > 1) {
            ((hfk)ezs.a.b()).A("Multiple LanguagePacks matching constraints of %s %d. Arbitrary pack will be selected.", string, n2);
        }
        return gto.h(arrayList.get(0));
    }

    public static hav B(gzm object) {
        jse.e(object, "packs");
        LinkedHashMap<Locale, Object> linkedHashMap = new LinkedHashMap<Locale, Object>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            ezj ezj2 = (ezj)object;
            Locale locale = ezj2.a;
            Object object2 = linkedHashMap.get(locale);
            if (object2 != null || linkedHashMap.containsKey(locale)) {
                object2 = (ezj)object2;
                object = object2;
                if (((ezj)object2).b <= ezj2.b) {
                    object = ezj2;
                }
            }
            linkedHashMap.put(locale, object);
        }
        return fvd.V(linkedHashMap.values());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static hav C(gzm iterator, faq faq2) {
        gzm gzm2;
        Object object;
        Object object2;
        ArrayList<Object> arrayList;
        jse.e(iterator, "packs");
        jse.e(faq2, "request");
        Serializable serializable = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            arrayList = iterator.next();
            object2 = (ezj)((Object)arrayList);
            if ((1 & faq2.c) != 0 && !jse.i(((ezj)object2).a.toLanguageTag(), faq2.d)) continue;
            serializable.add(arrayList);
        }
        iterator = new ArrayList();
        serializable = serializable.iterator();
        while (serializable.hasNext()) {
            arrayList = serializable.next();
            object2 = (ezj)((Object)arrayList);
            if ((faq2.c & 2) != 0 && (long)((ezj)object2).b != faq2.e) continue;
            iterator.add(arrayList);
        }
        object2 = new ArrayList();
        arrayList = iterator.iterator();
        while (arrayList.hasNext()) {
            object = arrayList.next();
            iterator = (ezj)object;
            if ((4 & faq2.c) != 0) {
                gzm2 = ((ezj)((Object)iterator)).c;
                serializable = idq.b(faq2.f);
                iterator = serializable;
                if (serializable == null) {
                    iterator = idq.a;
                }
                if (!gzm2.contains(iterator)) continue;
            }
            object2.add(object);
        }
        arrayList = new ArrayList<Object>();
        object = object2.iterator();
        block3: while (true) {
            if (!object.hasNext()) {
                iterator = fvd.V(arrayList);
                ((hfk)ezs.a.b()).u("LanguagePacks matching given LanguagePackRequest: %s", iterator);
                return iterator;
            }
            object2 = object.next();
            Iterator iterator2 = (ezj)object2;
            if (faq2.g.size() != 0) {
                iterator = ezs.a;
                jse.b(iterator2);
                gzm2 = fvd.T(new hxd(faq2.g, faq.a));
                if ((faq2.c & 4) != 0) {
                    serializable = idq.b(faq2.f);
                    iterator = serializable;
                    if (serializable == null) {
                        iterator = idq.a;
                    }
                    iterator = gto.h(iterator);
                } else {
                    iterator = gsl.a;
                }
                jse.e(iterator2, "pack");
                jse.e(gzm2, "requestedFeatures");
                iterator2 = ((ezj)((Object)iterator2)).d;
                serializable = new LinkedHashMap();
                for (Map.Entry entry : iterator2.entrySet()) {
                    if (!((Boolean)((gto)((Object)iterator)).b(new eex(new etv((idq)entry.getKey(), 4), 17)).e(true)).booleanValue()) continue;
                    ((HashMap)serializable).put(entry.getKey(), entry.getValue());
                }
                if (serializable.isEmpty()) continue;
                iterator = serializable.entrySet().iterator();
                block5: while (true) {
                    if (!iterator.hasNext()) continue block3;
                    serializable = iterator.next().getValue();
                    jse.d(serializable, "component2(...)");
                    serializable = (hav)serializable;
                    if (gzm2 instanceof Collection && gzm2.isEmpty()) break;
                    iterator2 = gzm2.iterator();
                    while (iterator2.hasNext()) {
                        if (((gzm)serializable).contains((iaz)((Object)iterator2.next()))) continue;
                        continue block5;
                    }
                    break;
                }
            }
            arrayList.add(object2);
        }
    }

    public static long D(long l2, int n2, int n3) {
        return l2 << n2 | (long)n3 & -1L >>> 64 - n2;
    }

    public static String E(Context object, String object2, long l2, int n2) {
        int n3;
        byte[] byArray;
        block8: {
            object = object.getApplicationContext().getResources();
            object = object.openRawResource(object.getIdentifier((String)object2, "raw", object.getResourcePackageName(2131427625)));
            byArray = new byte[1024];
            object2 = new ByteArrayOutputStream();
            ((InputStream)object).skip(l2);
            n3 = n2;
            if (n2 > 0) break block8;
            n3 = Integer.MAX_VALUE;
        }
        while (n3 > 0) {
            n2 = ((InputStream)object).read(byArray, 0, Math.min(n3, 1024));
            if (n2 == -1) break;
            ((ByteArrayOutputStream)object2).write(byArray, 0, n2);
            n3 -= n2;
        }
        try {
            ((InputStream)object).close();
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to read license or metadata text.", iOException);
        }
        try {
            object = ((ByteArrayOutputStream)object2).toString("UTF-8");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", unsupportedEncodingException);
        }
    }

    public static String F(ZipEntry object) {
        String string = ((ZipEntry)object).getName();
        if (string.contains("..")) {
            for (object = new File(string); object != null; object = ((File)object).getParentFile()) {
                if (!((File)object).getName().equals("..")) {
                    continue;
                }
                throw new ZipException("Illegal name: ".concat(String.valueOf(string)));
            }
        }
        return string;
    }

    public static String G(eyf eyf2) {
        jse.e(eyf2, "attributionId");
        if (eyf2 != eyf.a && eyf2 != eyf.b && eyf2 != eyf.c && eyg.a.containsKey(eyf2)) {
            return String.valueOf(eyg.a.get(eyf2));
        }
        return "invalid_attribution";
    }

    public static /* synthetic */ exe H(ewy ewy2) {
        jse.e(ewy2, "appId");
        return new exf(ewy2);
    }

    public static void I(DataOutput dataOutput, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            dataOutput.write(n2 >> i2 * 8 & 0xFF);
        }
    }

    public static void J(DataOutput dataOutput, String object) {
        object = ((String)object).getBytes(jts.a);
        jse.d(object, "getBytes(...)");
        dataOutput.write((byte[])object);
    }

    public static String K(Object object) {
        jse.e(object, "<this>");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object.getClass().getSimpleName());
        stringBuilder.append('@');
        int n2 = System.identityHashCode(object);
        jse.ab(16);
        object = Integer.toString(n2, 16);
        jse.d(object, "toString(...)");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public static String L(eaz object) {
        jse.e(object, "<this>");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioRouteType[name=".concat(String.valueOf(eay.a(((eaz)object).b).name())));
        switch (eay.a(((eaz)object).b).ordinal()) {
            default: {
                throw new joa();
            }
            case 7: {
                object = ((eaz)object).b == 8 ? (ebi)((eaz)object).c : ebi.a;
                ebm ebm2 = ((ebi)object).c;
                object = ebm2;
                if (ebm2 == null) {
                    object = ebm.a;
                }
                int n2 = ((ebm)object).c;
                object = new StringBuilder(",precachedBufferId=[opaqueToken=");
                ((StringBuilder)object).append(n2);
                ((StringBuilder)object).append("]");
                stringBuilder.append(((StringBuilder)object).toString());
                break;
            }
            case 6: {
                object = ((eaz)object).b == 7 ? (ebf)((eaz)object).c : ebf.a;
                ebm ebm3 = ((ebf)object).c;
                object = ebm3;
                if (ebm3 == null) {
                    object = ebm.a;
                }
                int n3 = ((ebm)object).c;
                object = new StringBuilder(",precachedBufferId=[opaqueToken=");
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append("]");
                stringBuilder.append(((StringBuilder)object).toString());
                break;
            }
            case 5: {
                object = ((eaz)object).b == 6 ? (ebn)((eaz)object).c : ebn.a;
                ebm ebm4 = ((ebn)object).b;
                object = ebm4;
                if (ebm4 == null) {
                    object = ebm.a;
                }
                int n4 = ((ebm)object).c;
                object = new StringBuilder(",precachedBufferId=[opaqueToken=");
                ((StringBuilder)object).append(n4);
                ((StringBuilder)object).append("]");
                stringBuilder.append(((StringBuilder)object).toString());
                break;
            }
            case 4: {
                hwv hwv2 = ((eaz)object).b == 5 ? (ebj)((eaz)object).c : ebj.a;
                ecq ecq2 = hwv2.c;
                hwv2 = ecq2;
                if (ecq2 == null) {
                    hwv2 = ecq.a;
                }
                int n5 = ((ecq)hwv2).b;
                object = ((eaz)object).b == 5 ? (ebj)((eaz)object).c : ebj.a;
                hwv2 = ((ebj)object).c;
                object = hwv2;
                if (hwv2 == null) {
                    object = ecq.a;
                }
                int n6 = ((ecq)object).c;
                object = new StringBuilder(",handoffData=[handoffId=");
                ((StringBuilder)object).append(n5);
                ((StringBuilder)object).append(",handoffOffset=");
                ((StringBuilder)object).append(n6);
                ((StringBuilder)object).append("]");
                stringBuilder.append(((StringBuilder)object).toString());
                break;
            }
            case 3: {
                object = ((eaz)object).b == 4 ? (eba)((eaz)object).c : eba.a;
                ebm ebm5 = ((eba)object).d;
                object = ebm5;
                if (ebm5 == null) {
                    object = ebm.a;
                }
                int n7 = ((ebm)object).c;
                object = new StringBuilder(",precachedBufferId=[opaqueToken=");
                ((StringBuilder)object).append(n7);
                ((StringBuilder)object).append("]");
                stringBuilder.append(((StringBuilder)object).toString());
                break;
            }
            case 2: {
                object = ((eaz)object).b == 3 ? (ebh)((eaz)object).c : ebh.a;
                int n8 = ((ebh)object).c;
                object = new StringBuilder(",captureSessionId=");
                ((StringBuilder)object).append(n8);
                stringBuilder.append(((StringBuilder)object).toString());
                break;
            }
            case 0: {
                object = ((eaz)object).b == 1 ? (ebd)((eaz)object).c : ebd.a;
                ebc ebc2 = ebc.b(((ebd)object).c);
                object = ebc2;
                if (ebc2 == null) {
                    object = ebc.c;
                }
                stringBuilder.append(",connectionStrategyFallbackBehavior=".concat(String.valueOf(((Enum)object).name())));
            }
            case 1: 
            case 8: 
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static String M(eip hwv2) {
        jse.e(hwv2, "<this>");
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = hwv2.b;
        if (eio.a(n2) == eio.J) {
            stringBuilder.append("ClientInfo[N/A");
        } else {
            stringBuilder.append("ClientInfo[name=".concat(String.valueOf(eio.a(n2).name())));
        }
        n2 = eio.a(hwv2.b).ordinal();
        if (n2 != 0) {
            if (n2 != 6) {
                if (n2 == 13) {
                    hwv2 = hwv2.b == 20 ? (eji)hwv2.c : eji.a;
                    stringBuilder.append(",entryPoint=".concat(String.valueOf(((eji)hwv2).c)));
                }
            } else {
                hwv2 = hwv2.b == 12 ? (eix)hwv2.c : eix.a;
                stringBuilder.append(",entryPoint=".concat(String.valueOf(((eix)hwv2).b)));
            }
        } else {
            hwv2 = hwv2.b == 1 ? (eiq)hwv2.c : eiq.a;
            stringBuilder.append(",extraInfo=".concat(String.valueOf(((eiq)hwv2).b)));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static String N(eaz object) {
        jse.e(object, "<this>");
        int n2 = ((eaz)object).b;
        object = eay.a(n2) == eay.i ? "N/A" : eay.a(n2).name();
        return object;
    }

    public static String O(eip object) {
        jse.e(object, "<this>");
        int n2 = ((eip)object).b;
        object = eio.a(n2) == eio.J ? "N/A" : eio.a(n2).name();
        return object;
    }

    public static String P(eaz object) {
        jse.e(object, "<this>");
        switch (eay.a(((eaz)object).b).ordinal()) {
            default: {
                throw new joa();
            }
            case 8: {
                object = "AUDIOROUTE_NOT_SET";
                break;
            }
            case 7: {
                object = "GACS_AUDIO_ROUTE";
                break;
            }
            case 6: {
                object = "CAR_AUDIO_ROUTE";
                break;
            }
            case 5: {
                object = "SODA_ROUTE";
                break;
            }
            case 4: {
                object = "HANDOVER_ROUTE";
                break;
            }
            case 3: {
                object = "BISTO_AUDIO_ROUTE";
                break;
            }
            case 2: {
                object = "DSP_AUDIO_ROUTE";
                break;
            }
            case 1: {
                object = "BUILTIN_AUDIO_ROUTE";
                break;
            }
            case 0: {
                int n2;
                object = ((eaz)object).b == 1 ? (ebd)((eaz)object).c : ebd.a;
                ebc ebc2 = ebc.b(((ebd)object).c);
                object = ebc2;
                if (ebc2 == null) {
                    object = ebc.c;
                }
                if ((n2 = ((Enum)object).ordinal()) != 0) {
                    if (n2 != 1) {
                        if (n2 == 2) {
                            object = "BLUETOOTH_AUDIO_ROUTE_CONNECT_IN_PARALLEL_FALLBACK_TO_BUILTIN";
                            break;
                        }
                        throw new joa();
                    }
                    object = "BLUETOOTH_AUDIO_ROUTE_FALLBACK_TO_BUILTIN";
                    break;
                }
                object = "BLUETOOTH_AUDIO_ROUTE";
            }
        }
        return object;
    }

    public static long Q(long l2) {
        long l3 = cgw.o();
        return cgw.p().toEpochMilli() * 1000000L - (l3 - l2);
    }

    public static String R(efs object) {
        switch (((Enum)object).ordinal()) {
            default: {
                throw new joa();
            }
            case 13: {
                object = "echoref";
                break;
            }
            case 12: {
                object = "hotword";
                break;
            }
            case 11: {
                object = "gacs";
                break;
            }
            case 10: {
                object = "voicedsp";
                break;
            }
            case 9: {
                object = "pfd";
                break;
            }
            case 8: {
                object = "uri";
                break;
            }
            case 7: {
                object = "car";
                break;
            }
            case 6: {
                object = "bisto";
                break;
            }
            case 5: {
                object = "soda";
                break;
            }
            case 4: {
                object = "dsp";
                break;
            }
            case 3: {
                object = "sync";
                break;
            }
            case 2: {
                object = "zlm";
                break;
            }
            case 1: {
                object = "builtin";
                break;
            }
            case 0: {
                object = "unknown";
            }
        }
        return object;
    }

    public static Object S(RandomAccessFile object, jrk jrk2) {
        try {
            jrk2.a(object);
            object = jon.a;
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        return object;
    }

    public static hpn T(evp evp2, dzn object) {
        jse.e(object, "audioData");
        object = ((dzn)object).c == 1 ? (dzm)((dzn)object).d : dzm.a;
        object = ((dzm)object).c;
        jse.d(object, "getBytes(...)");
        return evp2.c((hvu)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String U(ebx ebx2) {
        Object object;
        int n2 = ebx2.c;
        int n3 = n2 != 0 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? 0 : 3) : 2) : 1) : 4;
        if (n3 == 0) throw null;
        if (--n3 != 0) {
            Object object2 = "null";
            object = "";
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) return String.format(Locale.US, "timestamp: %s | event: %s", Instant.ofEpochMilli(ebx2.e).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS")), object);
                    object = "Empty AudioEvent.";
                    return String.format(Locale.US, "timestamp: %s | event: %s", Instant.ofEpochMilli(ebx2.e).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS")), object);
                } else {
                    Object object3;
                    Object object4 = n2 == 4 ? (ecf)ebx2.d : ecf.a;
                    n3 = a.y(((ecf)object4).c);
                    switch (n3) {
                        default: {
                            object = object2;
                            break;
                        }
                        case 6: {
                            object = "OUTCOME_NOT_SET";
                            break;
                        }
                        case 5: {
                            object = "BLUETOOTH_CONNECTION_OUTCOME";
                            break;
                        }
                        case 4: {
                            object = "AUDIO_START_TIME_OUTCOME";
                            break;
                        }
                        case 3: {
                            object = "AUDIO_BUFFER_OUTCOME";
                            break;
                        }
                        case 2: {
                            object = "HOTWORD_FIRST_BYTE_READ_OUTCOME";
                            break;
                        }
                        case 1: {
                            object = "AUDIO_REQUEST_FIRST_BYTE_READ_OUTCOME";
                        }
                    }
                    if (n3 == 0) throw null;
                    StringBuilder stringBuilder = new StringBuilder((String)object);
                    stringBuilder.append(":");
                    if ((((ecf)object4).b & 1) != 0) {
                        object3 = Locale.US;
                        object = object2 = ((ecf)object4).e;
                        if (object2 == null) {
                            object = eip.a;
                        }
                        stringBuilder.append(String.format((Locale)object3, " clientInfo: %s ", crh.M((eip)object)));
                    }
                    if ((((ecf)object4).b & 2) != 0) {
                        stringBuilder.append(String.format(Locale.US, " sessionToken: %d ", ((ecf)object4).f));
                    }
                    n3 = ((ecf)object4).c;
                    int n4 = a.y(n3);
                    n2 = n4 - 1;
                    if (n4 == 0) throw null;
                    if (n2 != 0) {
                        if (n2 != 1) {
                            if (n2 != 2) {
                                if (n2 != 3) {
                                    if (n2 != 4) {
                                        if (n2 == 5) {
                                            stringBuilder.append(" Empty ClientEvent outcome");
                                        }
                                    } else {
                                        object = n3 == 5 ? (ecc)((ecf)object4).d : ecc.a;
                                        stringBuilder.append(" [ stage: ");
                                        object2 = object4 = ecb.b(((ecc)object).c);
                                        if (object4 == null) {
                                            object2 = ecb.a;
                                        }
                                        stringBuilder.append(((Enum)object2).name());
                                        stringBuilder.append(" name: ");
                                        stringBuilder.append(((ecc)object).d);
                                        stringBuilder.append(" class: ");
                                        stringBuilder.append(((ecc)object).e);
                                        stringBuilder.append(" majorClass: ");
                                        stringBuilder.append(((ecc)object).f);
                                        stringBuilder.append(" ]");
                                    }
                                } else {
                                    object = n3 == 4 ? (eca)((ecf)object4).d : eca.a;
                                    stringBuilder.append(" [ sourceType: ");
                                    object2 = object4 = efs.b(((eca)object).c);
                                    if (object4 == null) {
                                        object2 = efs.a;
                                    }
                                    stringBuilder.append(((Enum)object2).name());
                                    object2 = object4 = ((eca)object).d;
                                    if (object4 == null) {
                                        object2 = eaf.a;
                                    }
                                    if ((((eaf)object2).b & 1) != 0) {
                                        stringBuilder.append(" audioStartTimeElapsedMs: ");
                                        stringBuilder.append(Duration.ofNanos(((eaf)object2).c).toMillis());
                                    }
                                    object4 = ewt.a;
                                    ((hws)object2).h((gpm)object4);
                                    if (((hws)object2).r.o((hwu)((gpm)object4).a)) {
                                        object4 = ewt.a;
                                        ((hws)object2).h((gpm)object4);
                                        object2 = ((hws)object2).r.l((hwu)((gpm)object4).a);
                                        object2 = object2 == null ? ((gpm)object4).d : ((gpm)object4).k(object2);
                                        object3 = (ewr)object2;
                                        stringBuilder.append(" completionReason: ");
                                        object2 = object4 = ews.b(((ewr)object3).c);
                                        if (object4 == null) {
                                            object2 = ews.a;
                                        }
                                        stringBuilder.append(((Enum)object2).name());
                                        stringBuilder.append(" computationTimeMs: ");
                                        stringBuilder.append(Duration.ofNanos(((ewr)object3).d).toMillis());
                                    }
                                    if ((4 & ((eca)object).b) != 0) {
                                        stringBuilder.append(" unixEpochStartTime: ");
                                        stringBuilder.append(((eca)object).e);
                                    }
                                    stringBuilder.append(" ]");
                                }
                            } else {
                                object = n3 == 3 ? (ebw)((ecf)object4).d : ebw.a;
                                stringBuilder.append(" [");
                                object3 = Locale.US;
                                if ((((ebw)object).b & 1) != 0) {
                                    object2 = object4 = ecd.b(((ebw)object).c);
                                    if (object4 == null) {
                                        object2 = ecd.a;
                                    }
                                    object2 = ((Enum)object2).name();
                                } else {
                                    object2 = ecd.a;
                                }
                                stringBuilder.append(String.format((Locale)object3, " outcome: %s ", object2));
                                if ((((ebw)object).b & 2) != 0) {
                                    stringBuilder.append(String.format(Locale.US, " buffer_id: %s ", ((ebw)object).d));
                                }
                                if ((((ebw)object).b & 0x10) != 0) {
                                    stringBuilder.append(String.format(Locale.US, " offset: %s ", ((ebw)object).g));
                                }
                                if ((4 & ((ebw)object).b) != 0) {
                                    stringBuilder.append(String.format(Locale.US, " bytes_available: %s ", ((ebw)object).e));
                                }
                                if ((((ebw)object).b & 8) != 0) {
                                    stringBuilder.append(String.format(Locale.US, " raw_error: %s ", ((ebw)object).f));
                                }
                                stringBuilder.append("]");
                            }
                        } else {
                            object = n3 == 2 ? (ecj)((ecf)object4).d : ecj.a;
                            n3 = ((ecj)object).b;
                            object2 = "OUTCOME_UNKNOWN_HOTWORD_FIRST_BYTE_READ";
                            if ((n3 & 1) != 0) {
                                object4 = Locale.US;
                                n3 = a.t(((ecj)object).c);
                                if (n3 == 0) {
                                    object = object2;
                                } else {
                                    object = object2;
                                    if (n3 != 1) {
                                        object = n3 != 2 ? "OUTCOME_FAILED_READING_HOTWORD_FIRST_BYTE" : "OUTCOME_SUCCESS_HOTWORD_FIRST_BYTE_READ";
                                    }
                                }
                                stringBuilder.append(String.format((Locale)object4, " %s ", object));
                            } else {
                                stringBuilder.append(String.format(Locale.US, " %s ", "OUTCOME_UNKNOWN_HOTWORD_FIRST_BYTE_READ"));
                            }
                        }
                    } else {
                        object = n3 == 1 ? (ebz)((ecf)object4).d : ebz.a;
                        n3 = ((ebz)object).b;
                        object2 = "OUTCOME_UNKNOWN_FIRST_BYTE_READ";
                        if ((n3 & 1) != 0) {
                            object4 = Locale.US;
                            n3 = a.t(((ebz)object).c);
                            if (n3 == 0) {
                                object = object2;
                            } else {
                                object = object2;
                                if (n3 != 1) {
                                    object = n3 != 2 ? "OUTCOME_FAILED_READING_FIRST_BYTE" : "OUTCOME_SUCCESS_FIRST_BYTE_READ";
                                }
                            }
                            stringBuilder.append(String.format((Locale)object4, " %s ", object));
                        } else {
                            stringBuilder.append(String.format(Locale.US, " %s ", "OUTCOME_UNKNOWN_FIRST_BYTE_READ"));
                        }
                    }
                    object = stringBuilder.toString();
                }
                return String.format(Locale.US, "timestamp: %s | event: %s", Instant.ofEpochMilli(ebx2.e).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS")), object);
            } else {
                Object object5;
                ecg ecg2 = n2 == 3 ? (ecg)ebx2.d : ecg.a;
                n3 = ecg2.c;
                n2 = doc.e(n3);
                if (n2 == 0) throw null;
                switch (n2 - 1) {
                    default: {
                        break;
                    }
                    case 8: {
                        object = "Empty ClientEvent Status.";
                        break;
                    }
                    case 7: {
                        Object object6;
                        object = n3 == 102 ? (eci)ecg2.d : eci.a;
                        if (((eci)object).c == 2) {
                            Object object7;
                            Locale locale = Locale.US;
                            object5 = ((eci)object).c == 2 ? (eav)((eci)object).d : eav.a;
                            object5 = object7 = ebg.b(((eav)object5).c);
                            if (object7 == null) {
                                object5 = ebg.a;
                            }
                            object7 = ((Enum)object5).name();
                            object = object5 = ((eci)object).e;
                            if (object5 == null) {
                                object = eaz.a;
                            }
                            object = String.format(locale, "AudioRouteDisconnectStatus: %s, route: %s", object7, crh.P((eaz)object));
                            break;
                        }
                        Locale locale = Locale.US;
                        object5 = ((eci)object).c == 1 ? (eax)((eci)object).d : eax.a;
                        object5 = object6 = ebo.b(((eax)object5).c);
                        if (object6 == null) {
                            object5 = ebo.a;
                        }
                        object6 = ((Enum)object5).name();
                        object = object5 = ((eci)object).e;
                        if (object5 == null) {
                            object = eaz.a;
                        }
                        object = String.format(locale, "UpdateRoutingStatus: %s, route: %s", object6, crh.P((eaz)object));
                        break;
                    }
                    case 6: {
                        object = n3 == 101 ? (ecy)ecg2.d : ecy.a;
                        object = object5 = ((ecy)object).c;
                        if (object5 == null) {
                            object = ebq.a;
                        }
                        Locale locale = Locale.US;
                        n3 = ((ebq)object).b;
                        if (n3 == 1) {
                            object = object5 = ebr.b((Integer)((ebq)object).c);
                            if (object5 == null) {
                                object = ebr.a;
                            }
                            object = ((Enum)object).name();
                        } else {
                            if (n3 == 2) {
                                object = object5 = ebp.b((Integer)((ebq)object).c);
                                if (object5 == null) {
                                    object = ebp.a;
                                }
                            } else {
                                object = ebp.a;
                            }
                            object = ((Enum)object).name();
                        }
                        object5 = ecg2.c == 101 ? (ecy)ecg2.d : ecy.a;
                        ebv ebv2 = ebv.b(((ecy)object5).d);
                        object5 = ebv2;
                        if (ebv2 == null) {
                            object5 = ebv.a;
                        }
                        object = String.format(locale, "HotwordStoptListeningStatus: AudioSourceOpeningStatus: %s, StopListeningReason: %s", object, ((Enum)object5).name());
                        break;
                    }
                    case 5: {
                        object = n3 == 100 ? (ecx)ecg2.d : ecx.a;
                        object = object5 = ((ecx)object).c;
                        if (object5 == null) {
                            object = ebt.a;
                        }
                        Locale locale = Locale.US;
                        n3 = ((ebt)object).b;
                        if (n3 == 1) {
                            object = object5 = ebu.b((Integer)((ebt)object).c);
                            if (object5 == null) {
                                object = ebu.a;
                            }
                            object = ((Enum)object).name();
                        } else {
                            if (n3 == 2) {
                                object = object5 = ebs.b((Integer)((ebt)object).c);
                                if (object5 == null) {
                                    object = ebs.a;
                                }
                            } else {
                                object = ebs.a;
                            }
                            object = ((Enum)object).name();
                        }
                        object = String.format(locale, "HotwordStartListeningStatus: AudioSourceOpeningStatus: %s", object);
                        break;
                    }
                    case 4: {
                        Object object8;
                        object = n3 == 8 ? (eby)ecg2.d : eby.a;
                        if (((eby)object).c == 2) {
                            Object object9;
                            Locale locale = Locale.US;
                            object5 = ((eby)object).c == 2 ? (eav)((eby)object).d : eav.a;
                            object5 = object9 = ebg.b(((eav)object5).c);
                            if (object9 == null) {
                                object5 = ebg.a;
                            }
                            object9 = ((Enum)object5).name();
                            long l2 = ecg2.h;
                            object = object5 = ((eby)object).e;
                            if (object5 == null) {
                                object = eaz.a;
                            }
                            object = String.format(locale, "AudioRouteDisconnectStatus: %s, clientToken: %s, route: %s", object9, l2, crh.P((eaz)object));
                            break;
                        }
                        Locale locale = Locale.US;
                        object5 = ((eby)object).c == 1 ? (eax)((eby)object).d : eax.a;
                        object5 = object8 = ebo.b(((eax)object5).c);
                        if (object8 == null) {
                            object5 = ebo.a;
                        }
                        object8 = ((Enum)object5).name();
                        long l3 = ecg2.h;
                        object = object5 = ((eby)object).e;
                        if (object5 == null) {
                            object = eaz.a;
                        }
                        object = String.format(locale, "UpdateRoutingStatus: %s, clientToken: %s, route: %s", object8, l3, crh.P((eaz)object));
                        break;
                    }
                    case 3: {
                        Locale locale = Locale.US;
                        object = ecg2.c == 6 ? (dzy)ecg2.d : dzy.a;
                        n3 = n2 = dox.c(((dzy)object).c);
                        if (n2 == 0) {
                            n3 = 1;
                        }
                        String string = dox.b(n3);
                        object = ecg2.c == 6 ? (dzy)ecg2.d : dzy.a;
                        object = object5 = dzw.b(((dzy)object).d);
                        if (object5 == null) {
                            object = dzw.a;
                        }
                        String string2 = ((Enum)object).name();
                        object = object5 = ecg2.f;
                        if (object5 == null) {
                            object = efn.a;
                        }
                        object = String.format(locale, "AudioFocusReleasingStatus: %s, AudioFocusReleasingReason: %s, audioFocusToken: %d", string, string2, ((efn)object).c);
                        break;
                    }
                    case 2: {
                        Locale locale = Locale.US;
                        object = ecg2.c == 5 ? (dzv)ecg2.d : dzv.a;
                        n3 = n2 = dox.e(((dzv)object).c);
                        if (n2 == 0) {
                            n3 = 1;
                        }
                        String string = dox.d(n3);
                        object = object5 = ecg2.f;
                        if (object5 == null) {
                            object = efn.a;
                        }
                        object = String.format(locale, "AudioFocusAcquiringStatus: %s, audioFocusToken: %d", string, ((efn)object).c);
                        break;
                    }
                    case 1: {
                        Object object10;
                        object = n3 == 2 ? (eas)ecg2.d : eas.a;
                        object = object5 = ((eas)object).c;
                        if (object5 == null) {
                            object = ebq.a;
                        }
                        Locale locale = Locale.US;
                        if (((ebq)object).b == 1) {
                            object10 = Locale.US;
                            if (((ebq)object).b == 1) {
                                object = object5 = ebr.b((Integer)((ebq)object).c);
                                if (object5 == null) {
                                    object = ebr.a;
                                }
                            } else {
                                object = ebr.a;
                            }
                            object = String.format((Locale)object10, "success: %s", ((Enum)object).name());
                        } else {
                            object10 = Locale.US;
                            if (((ebq)object).b == 2) {
                                object = object5 = ebp.b((Integer)((ebq)object).c);
                                if (object5 == null) {
                                    object = ebp.a;
                                }
                            } else {
                                object = ebp.a;
                            }
                            object = String.format((Locale)object10, "failure: %s", ((Enum)object).name());
                        }
                        object5 = ecg2.c == 2 ? (eas)ecg2.d : eas.a;
                        object5 = object10 = ebv.b(((eas)object5).d);
                        if (object10 == null) {
                            object5 = ebv.a;
                        }
                        object = String.format(locale, "StopListeningResult %s, StopListeningReason: %s, sessionToken: %d", object, ((Enum)object5).name(), ecg2.e);
                        break;
                    }
                    case 0: {
                        object = n3 == 1 ? (ear)ecg2.d : ear.a;
                        object = object5 = ((ear)object).c;
                        if (object5 == null) {
                            object = ebt.a;
                        }
                        if (((ebt)object).b == 1) {
                            Locale locale = Locale.US;
                            if (((ebt)object).b == 1) {
                                object = object5 = ebu.b((Integer)((ebt)object).c);
                                if (object5 == null) {
                                    object = ebu.a;
                                }
                            } else {
                                object = ebu.a;
                            }
                            object = String.format(locale, "StartListeningResult success: %s, sessionToken: %d", ((Enum)object).name(), ecg2.e);
                            break;
                        }
                        Locale locale = Locale.US;
                        if (((ebt)object).b == 2) {
                            object = object5 = ebs.b((Integer)((ebt)object).c);
                            if (object5 == null) {
                                object = ebs.a;
                            }
                        } else {
                            object = ebs.a;
                        }
                        object = String.format(locale, "StartListeningResult failure: %s, sessionToken: %d", ((Enum)object).name(), ecg2.e);
                    }
                }
                object5 = Locale.US;
                n3 = doc.e(ecg2.c);
                switch (n3) {
                    default: {
                        break;
                    }
                    case 9: {
                        object2 = "RESULT_NOT_SET";
                        break;
                    }
                    case 8: {
                        object2 = "HOTWORD_CLIENT_ROUTE_STATUS";
                        break;
                    }
                    case 7: {
                        object2 = "HOTWORD_STOP_LISTENING_STATUS";
                        break;
                    }
                    case 6: {
                        object2 = "HOTWORD_START_LISTENING_STATUS";
                        break;
                    }
                    case 5: {
                        object2 = "AUDIO_REQUEST_CLIENT_ROUTE_STATUS";
                        break;
                    }
                    case 4: {
                        object2 = "RELEASE_AUDIO_FOCUS_STATUS";
                        break;
                    }
                    case 3: {
                        object2 = "ACQUIRE_AUDIO_FOCUS_STATUS";
                        break;
                    }
                    case 2: {
                        object2 = "STOP_LISTENING_STATUS";
                        break;
                    }
                    case 1: {
                        object2 = "START_LISTENING_STATUS";
                    }
                }
                if (n3 == 0) throw null;
                object = String.format((Locale)object5, "%s: %s", object2, object);
            }
            return String.format(Locale.US, "timestamp: %s | event: %s", Instant.ofEpochMilli(ebx2.e).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS")), object);
        } else {
            object = n2 == 2 ? (ece)ebx2.d : ece.a;
            object = crh.aa((ece)object);
        }
        return String.format(Locale.US, "timestamp: %s | event: %s", Instant.ofEpochMilli(ebx2.e).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS")), object);
    }

    public static String V(eae eae2) {
        hwv hwv2;
        hwv hwv3;
        StringBuilder stringBuilder = new StringBuilder("AudioLibInputParams: [");
        if ((eae2.b & 1) != 0) {
            stringBuilder.append(" sourceType: ");
            stringBuilder.append(eae2.c);
        }
        if ((eae2.b & 2) != 0) {
            stringBuilder.append(" sampleRateHz: ");
            stringBuilder.append(eae2.d);
        }
        if ((eae2.b & 4) != 0) {
            stringBuilder.append(" channelConfig: ");
            stringBuilder.append(eae2.e);
        }
        if ((eae2.b & 8) != 0) {
            stringBuilder.append(" encodingFormat: ");
            stringBuilder.append(eae2.f);
        }
        if ((eae2.b & 0x20) != 0) {
            stringBuilder.append("  audioEffects: [");
            hwv2 = hwv3 = eae2.h;
            if (hwv3 == null) {
                hwv2 = eac.a;
            }
            if ((hwv2.b & 1) != 0) {
                stringBuilder.append("  noiseSuppressionEnabled: ");
                hwv2 = hwv3 = eae2.h;
                if (hwv3 == null) {
                    hwv2 = eac.a;
                }
                stringBuilder.append(hwv2.c);
            }
            hwv2 = hwv3 = eae2.h;
            if (hwv3 == null) {
                hwv2 = eac.a;
            }
            if ((hwv2.b & 2) != 0) {
                stringBuilder.append("  acousticEchoCancellationEnabled: ");
                hwv2 = hwv3 = eae2.h;
                if (hwv3 == null) {
                    hwv2 = eac.a;
                }
                stringBuilder.append(hwv2.d);
            }
            stringBuilder.append("]");
        }
        if ((eae2.b & 0x10) != 0) {
            stringBuilder.append(" customAudioBufferLengthInSec: ");
            stringBuilder.append(eae2.g);
        }
        if ((eae2.b & 0x80) != 0) {
            stringBuilder.append(" customAudioResourceTimeoutMs: ");
            stringBuilder.append(eae2.i);
        }
        if ((eae2.b & 0x800) != 0) {
            stringBuilder.append(" usePushMechanism: ");
            stringBuilder.append(eae2.m);
        }
        if ((eae2.b & 0x100) != 0) {
            stringBuilder.append(" timestampPollingMs: ");
            hwv2 = hwv3 = eae2.j;
            if (hwv3 == null) {
                hwv2 = ead.a;
            }
            stringBuilder.append(((ead)hwv2).c);
        }
        if ((eae2.b & 0x200) != 0) {
            stringBuilder.append(" enableLoopbackAudio: ");
            stringBuilder.append(eae2.k);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static /* synthetic */ bzb W(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzb(hwp2);
    }

    public static /* synthetic */ bzq X(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzq((Object)hwp2, null);
    }

    public static /* synthetic */ bzq Y(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new bzq((Object)hwp2, null);
    }

    private final Object Z(hus object, int n2) {
        if (n2 < 5) {
            int n3 = ((hus)object).r();
            int n4 = n3 - 1;
            if (n4 != 0) {
                if (n4 != 5) {
                    if (n4 != 6) {
                        if (n4 == 7) {
                            return ((hus)object).q();
                        }
                        String string = idi.x(n3);
                        object = ((hus)object).f();
                        StringBuilder stringBuilder = new StringBuilder("Unsupported extra type found: ");
                        stringBuilder.append(string);
                        stringBuilder.append(": ");
                        stringBuilder.append((String)object);
                        throw new dbo(stringBuilder.toString());
                    }
                    return ((hus)object).b();
                }
                return ((hus)object).j();
            }
            ((hus)object).l();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            while (((hus)object).p()) {
                arrayList.add(this.Z((hus)object, n2 + 1));
            }
            ((hus)object).n();
            return arrayList;
        }
        throw new dbo("Array has a depth greater than max of 5: ".concat(((hus)object).f()));
    }

    public static hpn a(ckz ckz2) {
        crw crw2 = new crw(ckz2);
        ckz2.g((Executor)hom.a, new crv(crw2));
        return crw2;
    }

    private static String aa(ece object) {
        Object object2;
        Object object3;
        Object object4 = object3 = ech.b(((ece)object).e);
        if (object3 == null) {
            object4 = ech.a;
        }
        StringBuilder stringBuilder = new StringBuilder(((Enum)object4).name());
        if ((((ece)object).b & 0x40) != 0) {
            stringBuilder.append(", ");
            object4 = object3 = ((ece)object).k;
            if (object3 == null) {
                object4 = eip.a;
            }
            stringBuilder.append(crh.M((eip)object4));
        }
        int n2 = ((ece)object).b;
        boolean bl2 = false;
        boolean bl3 = false;
        if ((n2 & 2) != 0) {
            stringBuilder.append(String.format(Locale.US, ", clientToken: %d", ((ece)object).f));
        }
        if ((((ece)object).b & 4) != 0) {
            stringBuilder.append(String.format(Locale.US, ", sessionToken: %d", ((ece)object).g));
        }
        if ((((ece)object).b & 0x80) != 0) {
            stringBuilder.append(String.format(Locale.US, ", routeSessionToken: %d", ((ece)object).l));
        }
        if ((((ece)object).b & 0x10) != 0) {
            object2 = Locale.US;
            object4 = object3 = ((ece)object).i;
            if (object3 == null) {
                object4 = efn.a;
            }
            stringBuilder.append(String.format((Locale)object2, ", audioFocusToken: %d", ((efn)object4).c));
        }
        if ((((ece)object).b & 0x100) != 0) {
            object2 = Locale.US;
            object4 = object3 = edo.b(((ece)object).m);
            if (object3 == null) {
                object4 = edo.a;
            }
            stringBuilder.append(String.format((Locale)object2, ", audioAdapter: %s", ((Enum)object4).name()));
        }
        if (((ece)object).n.size() > 0) {
            object3 = Locale.US;
            object2 = ((ece)object).n;
            jse.e(object2, "<this>");
            object4 = new ArrayList(jns.B((Iterable)object2));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object4.add(((eln)object2.next()).c);
            }
            stringBuilder.append(String.format((Locale)object3, ", refs: %s", object4.toString()));
        }
        if ((((ece)object).b & 8) != 0) {
            object2 = Locale.US;
            object4 = object3 = ebv.b(((ece)object).h);
            if (object3 == null) {
                object4 = ebv.a;
            }
            stringBuilder.append(String.format(object2, ", StopListeningReason: %s", new Object[]{((Enum)object4).name()}));
        }
        if ((((ece)object).b & 0x20) != 0) {
            object2 = Locale.US;
            object4 = object3 = eap.b(((ece)object).j);
            if (object3 == null) {
                object4 = eap.a;
            }
            stringBuilder.append(String.format(object2, ", ClientDeactivatingStatus: %s", new Object[]{((Enum)object4).name()}));
        }
        if ((n2 = ((ece)object).c) != 0) {
            switch (n2) {
                default: {
                    n2 = 0;
                    break;
                }
                case 205: {
                    n2 = 6;
                    break;
                }
                case 204: {
                    n2 = 5;
                    break;
                }
                case 203: {
                    n2 = 4;
                    break;
                }
                case 202: {
                    n2 = 3;
                    break;
                }
                case 201: {
                    n2 = 2;
                    break;
                }
                case 200: {
                    n2 = 1;
                    break;
                }
            }
        } else {
            n2 = 7;
        }
        if (n2 != 0) {
            if (--n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 == 5) {
                                    stringBuilder.append(", ");
                                    object = ((ece)object).c == 205 ? (ebk)((ece)object).d : ebk.a;
                                    object4 = object3 = ((ebk)object).d;
                                    if (object3 == null) {
                                        object4 = eip.a;
                                    }
                                    object3 = crh.M((eip)object4);
                                    object = object4 = ((ebk)object).c;
                                    if (object4 == null) {
                                        object = eaz.a;
                                    }
                                    object = crh.L((eaz)object);
                                    object4 = new StringBuilder("HotwordAudioRouteRequestParams: [");
                                    ((StringBuilder)object4).append((String)object3);
                                    ((StringBuilder)object4).append(", ");
                                    ((StringBuilder)object4).append((String)object);
                                    ((StringBuilder)object4).append("]");
                                    stringBuilder.append(((StringBuilder)object4).toString());
                                }
                            } else {
                                stringBuilder.append(", ");
                                object = ((ece)object).c == 204 ? (eaw)((ece)object).d : eaw.a;
                                object = object4 = ((eaw)object).c;
                                if (object4 == null) {
                                    object = eaz.a;
                                }
                                object = crh.L((eaz)object);
                                object4 = new StringBuilder("AudioRouteRequestParams: [");
                                ((StringBuilder)object4).append((String)object);
                                ((StringBuilder)object4).append("]");
                                stringBuilder.append(((StringBuilder)object4).toString());
                            }
                        } else {
                            stringBuilder.append(", ");
                            object = ((ece)object).c == 203 ? (dzx)((ece)object).d : dzx.a;
                            object3 = new StringBuilder("AudioFocusRequestParams: [ audioFocusGain: ");
                            ((StringBuilder)object3).append(((dzx)object).c);
                            if ((((dzx)object).b & 0x10) != 0) {
                                ((StringBuilder)object3).append(" usageType: ");
                                ((StringBuilder)object3).append(((dzx)object).g);
                            } else {
                                ((StringBuilder)object3).append(" streamType: ");
                                ((StringBuilder)object3).append(((dzx)object).d);
                            }
                            if ((((dzx)object).b & 8) != 0) {
                                ((StringBuilder)object3).append(" ");
                                object = object4 = ((dzx)object).f;
                                if (object4 == null) {
                                    object = eip.a;
                                }
                                ((StringBuilder)object3).append(crh.M((eip)object));
                            }
                            ((StringBuilder)object3).append("]");
                            stringBuilder.append(((StringBuilder)object3).toString());
                        }
                    } else {
                        stringBuilder.append(", ");
                        object = ((ece)object).c == 202 ? (ecw)((ece)object).d : ecw.a;
                        object2 = new StringBuilder("HotwordMicInputParams: [AudioInputMode: ");
                        n2 = ecv.a(((ecw)object).c).ordinal();
                        if (n2 != 0) {
                            if (n2 != 1) {
                                if (n2 == 2) {
                                    ((StringBuilder)object2).append("built-in mic");
                                }
                            } else {
                                ((StringBuilder)object2).append("media_sync_event: ");
                                object4 = ((ecw)object).c == 9 ? (ecz)((ecw)object).d : ecz.a;
                                ((StringBuilder)object2).append(((ecz)object4).b);
                            }
                        } else {
                            ((StringBuilder)object2).append("uri");
                        }
                        if ((((ecw)object).b & 1) != 0) {
                            ((StringBuilder)object2).append(", ");
                            object4 = object3 = ((ecw)object).e;
                            if (object3 == null) {
                                object4 = eae.a;
                            }
                            ((StringBuilder)object2).append(crh.V((eae)object4));
                        }
                        if ((((ecw)object).b & 2) != 0) {
                            ((StringBuilder)object2).append(" enableEmulatedMicrophone: ");
                            ((StringBuilder)object2).append(((ecw)object).f);
                        }
                        if ((((ecw)object).b & 8) != 0) {
                            ((StringBuilder)object2).append(" captureMode: ");
                            n2 = a.w(((ecw)object).h);
                            object4 = n2 != 0 && n2 != 1 ? "HOTWORD_CAPTURE_MODE_CONCURRENT" : "HOTWORD_CAPTURE_MODE_DEFAULT";
                            ((StringBuilder)object2).append((String)object4);
                        }
                        if ((((ecw)object).b & 4) != 0) {
                            ((StringBuilder)object2).append(" ");
                            object = object4 = ((ecw)object).g;
                            if (object4 == null) {
                                object = eip.a;
                            }
                            ((StringBuilder)object2).append(crh.M((eip)object));
                        }
                        ((StringBuilder)object2).append("]");
                        stringBuilder.append(((StringBuilder)object2).toString());
                    }
                } else {
                    stringBuilder.append(", ");
                    object = ((ece)object).c == 201 ? (eao)((ece)object).d : eao.a;
                    object2 = new StringBuilder("AudioRequestMicInputParams: [AudioInputMode: ");
                    n2 = ean.a(((eao)object).c).ordinal();
                    if (n2 != 0) {
                        if (n2 != 1) {
                            if (n2 != 2) {
                                if (n2 != 3) {
                                    if (n2 != 4) {
                                        if (n2 == 5) {
                                            ((StringBuilder)object2).append("built-in mic");
                                        }
                                    } else {
                                        ((StringBuilder)object2).append("enable_voice_dsp_hotword_mic: ");
                                        if (((eao)object).c == 17) {
                                            bl3 = (Boolean)((eao)object).d;
                                        }
                                        ((StringBuilder)object2).append(bl3);
                                    }
                                } else {
                                    ((StringBuilder)object2).append("enable_zero_latency_mic: ");
                                    bl3 = bl2;
                                    if (((eao)object).c == 10) {
                                        bl3 = (Boolean)((eao)object).d;
                                    }
                                    ((StringBuilder)object2).append(bl3);
                                }
                            } else {
                                ((StringBuilder)object2).append("file_path");
                            }
                        } else {
                            ((StringBuilder)object2).append("handoff_data: [handoff_id: ");
                            object4 = ((eao)object).c == 3 ? (ecq)((eao)object).d : ecq.a;
                            ((StringBuilder)object2).append(((ecq)object4).b);
                            ((StringBuilder)object2).append(", handoff_offset: ");
                            object4 = ((eao)object).c == 3 ? (ecq)((eao)object).d : ecq.a;
                            ((StringBuilder)object2).append(((ecq)object4).c);
                            ((StringBuilder)object2).append("]");
                        }
                    } else {
                        ((StringBuilder)object2).append("uri");
                    }
                    if ((((eao)object).b & 1) != 0) {
                        ((StringBuilder)object2).append(", ");
                        object4 = object3 = ((eao)object).g;
                        if (object3 == null) {
                            object4 = eae.a;
                        }
                        ((StringBuilder)object2).append(crh.V((eae)object4));
                    }
                    if ((((eao)object).b & 2) != 0) {
                        ((StringBuilder)object2).append(" enableEmulatedMicrophone: ");
                        ((StringBuilder)object2).append(((eao)object).h);
                    }
                    if ((((eao)object).b & 4) != 0) {
                        ((StringBuilder)object2).append(" micForTalkBack: ");
                        ((StringBuilder)object2).append(((eao)object).i);
                    }
                    if ((((eao)object).b & 8) != 0) {
                        ((StringBuilder)object2).append(" fastFailIfOpNotAllowed: ");
                        ((StringBuilder)object2).append(((eao)object).j);
                    }
                    if ((((eao)object).b & 0x10) != 0) {
                        ((StringBuilder)object2).append(" micOccupiedBehavior: ");
                        object = object4 = edc.b(((eao)object).k);
                        if (object4 == null) {
                            object = edc.a;
                        }
                        ((StringBuilder)object2).append(((Enum)object).name());
                    }
                    ((StringBuilder)object2).append("]");
                    stringBuilder.append(((StringBuilder)object2).toString());
                }
            } else {
                stringBuilder.append(", ");
                object = ((ece)object).c == 200 ? (eam)((ece)object).d : eam.a;
                object2 = new StringBuilder("AudioRequestActivationParams [");
                if ((((eam)object).b & 1) != 0) {
                    object4 = object3 = ((eam)object).c;
                    if (object3 == null) {
                        object4 = eip.a;
                    }
                    ((StringBuilder)object2).append(crh.M((eip)object4));
                }
                if ((((eam)object).b & 2) != 0) {
                    ((StringBuilder)object2).append(" intent: ");
                    object = object4 = eal.b(((eam)object).d);
                    if (object4 == null) {
                        object = eal.a;
                    }
                    ((StringBuilder)object2).append(((Enum)object).name());
                }
                ((StringBuilder)object2).append("]");
                stringBuilder.append(((StringBuilder)object2).toString());
            }
            return stringBuilder.toString();
        }
        throw null;
    }

    public static long b(boolean bl2, boolean bl3, boolean bl4, int n2, int n3, int n4, long l2) {
        long l3 = 0L;
        long l4 = true != bl2 ? 0L : 1L;
        long l5 = true != bl3 ? 0L : 1L;
        if (bl4) {
            l3 = 1L;
        }
        l4 = l5 | l4 + l4;
        return ((((l4 + l4 | l3) << 6 | (long)(n2 + 21 & 0x3F)) << 6 | (long)(n3 + 21)) << 6 | (long)(n4 + 21 & 0x3F)) << 43 | 0x7FFFFFFFFFFL & l2;
    }

    public static Uri c(Context object, gto gto2) {
        fps fps2 = new fps((Context)object);
        object = gto2 != null && gto2.g() ? (String)gto2.c() : "datadownload";
        fps2.d((String)object);
        if (gto2 != null && gto2.g()) {
            fps2.e("datadownload");
        }
        return fps2.a();
    }

    public static Uri d(Context context, gto gto2) {
        return crh.c(context, gto2).buildUpon().appendPath("links").build();
    }

    public static Uri e(Context context, String string) {
        guf guf2 = fpu.a;
        return fvc.K(string, context.getPackageName(), 0L);
    }

    /*
     * Unable to fully structure code
     */
    public static Uri f(Context var0, int var1_2, String var2_3, String var3_4, cuv var4_5, gto var5_6, boolean var6_7) {
        if (!var6_7) ** GOTO lbl4
        try {
            return crh.e(var0, var3_4);
lbl4:
            // 1 sources

            var3_4 = crh.g(var1_2);
            var0 = crh.c(var0, var5_6).buildUpon().appendPath(var3_4).build().buildUpon().appendPath(var2_3).build();
            return var0;
        }
        catch (Exception var0_1) {
            cyr.j(var0_1, "%s: Unable to create mobstore uri for file %s.", new Object[]{"DirectoryUtil", var2_3});
            var4_5.a();
            return null;
        }
    }

    public static String g(int n2) {
        if (--n2 != 0) {
            if (n2 != 1) {
                return "public_3p";
            }
            return "private";
        }
        return "public";
    }

    public static cyj h(cxx object, img object2, img object3, img object4) {
        object4 = (cwk)object4.b();
        gto gto2 = ((cxx)object).g;
        idi.m(gto2);
        object3 = (Executor)object3.b();
        object2 = (cqq)object2.b();
        if (gto2.g()) {
            object2 = (csw)gto2.c();
            object = ((cxx)object).i;
            object = new cyo((csw)object2, (cwk)object4, (Executor)object3);
        } else {
            object = new cyk();
        }
        return object;
    }

    public static cwj i(cxt object, cxx object2, img object3, img object4, img object5, img object6, img img2, img object7, img object8, img object9, img img3, img img4, img img5, img img6, img img7, img img8, img img9, img img10, img img11) {
        Context context = ilt.c((cxt)object);
        cyu cyu2 = (cyu)object3.b();
        cuv cuv2 = (cuv)object4.b();
        cwk cwk2 = (cwk)img8.b();
        object = crh.m((cxt)object, (cxx)object2, (img)object3, (img)object4, (img)object5, (img)object6, img2, (img)object7, (img)object8, (img)object9, img3, img4, img6, img7, img8);
        object3 = (cqq)img5.b();
        object4 = (gto)img9.b();
        object8 = (Executor)img2.b();
        object5 = (gto)object5.b();
        object7 = (bmu)object7.b();
        object9 = (gto)img10.b();
        object2 = crh.h((cxx)object2, (img)object6, img2, img8);
        object6 = (cqq)object6.b();
        return new cwj(context, cyu2, cuv2, cwk2, (egg)object, (cqq)object3, (gto)object4, (Executor)object8, (gto)object5, (bmu)object7, (gto)object9, (cyj)object2, (Executor)img11.b());
    }

    public static Uri j(Uri object) {
        object = object.toString();
        return Uri.parse((String)((String)object).substring(0, ((String)object).lastIndexOf("_")));
    }

    public static String k(String string, String string2) {
        return a.ao(string2, string, "_");
    }

    public static ctt l(ctf object, int n2) {
        hwp hwp2 = ctt.a.l();
        Object object2 = ((ctf)object).d;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        hwv hwv3 = (ctt)hwv2;
        object2.getClass();
        ((ctt)hwv3).b |= 1;
        ((ctt)hwv3).c = object2;
        int n3 = ((ctf)object).e;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object2 = (ctt)hwp2.b;
        ((ctt)object2).b |= 2;
        ((ctt)object2).d = n3;
        object2 = cqq.Z((ctf)object);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv2 = hwv3 = hwp2.b;
        object2.getClass();
        ((ctt)hwv2).b |= 4;
        ((ctt)hwv2).e = object2;
        if (!hwv3.B()) {
            hwp2.u();
        }
        object2 = (ctt)hwp2.b;
        ((ctt)object2).f = n2 - 1;
        ((ctt)object2).b |= 8;
        if ((((ctf)object).b & 0x20) != 0) {
            object = object2 = ((ctf)object).h;
            if (object2 == null) {
                object = ikm.a;
            }
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object2 = (ctt)hwp2.b;
            object.getClass();
            ((ctt)object2).g = object;
            ((ctt)object2).b |= 0x10;
        }
        return (ctt)hwp2.o();
    }

    public static egg m(cxt object, cxx cxx2, img object2, img object3, img object4, img object5, img object6, img object7, img object8, img object9, img object10, img object11, img object12, img img2, img img3) {
        Context context = ilt.c((cxt)object);
        object3 = (cuv)object3.b();
        cxl cxl2 = (cxl)object8.b();
        object8 = (bmu)object7.b();
        object = ilt.c((cxt)object);
        object9 = (gui)object9.b();
        object7 = (bmu)object7.b();
        dad dad2 = (dad)object10.b();
        object10 = (gto)object11.b();
        object12 = (cys)object12.b();
        Executor executor = (Executor)object6.b();
        cqq cqq2 = (cqq)object5.b();
        object = new dmu((Context)object, (gui)object9, (bmu)object7, dad2, (gto)object10, (cys)object12, executor);
        object7 = (gto)img2.b();
        object9 = (gto)object11.b();
        object2 = (cyu)object2.b();
        object5 = (cqq)object5.b();
        object10 = (cwk)img3.b();
        object4 = (gto)object4.b();
        object6 = (Executor)object6.b();
        object11 = new fvc(null);
        return new egg(context, (cuv)object3, cxl2, (bmu)object8, (dmu)object, (gto)object7, (gto)object9, (cyu)object2, (cqq)object5, (cwk)object10, (gto)object4, (Executor)object6, (fvc)cxx2.h.e(object11));
    }

    public static String n(Object object) {
        if (object == null) {
            object = "-";
        } else {
            String string = object instanceof ddf ? ((ddf)object).c() : object.getClass().getSimpleName();
            int n2 = object.hashCode();
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(":");
            ((StringBuilder)object).append(n2);
            object = ((StringBuilder)object).toString();
        }
        return object;
    }

    static int o(String string, int n2) {
        int n3 = string.length();
        if (n2 >= n3) {
            return -1;
        }
        if ((n2 = string.indexOf(10, n2)) == -1) {
            return n3 - 1;
        }
        return n2;
    }

    public static dcz p(String string, int n2) {
        int n3 = crh.o(string, n2);
        dcz dcz2 = null;
        int n4 = n2;
        n2 = n3;
        while (n2 > 0) {
            dcz dcz3;
            int n5;
            n3 = n2 >= string.length() ? string.length() - 1 : n2;
            for (n5 = n4; n5 <= n3 && Character.isWhitespace(string.charAt(n5)); ++n5) {
            }
            if (n5 > n4 && n5 <= n3 - 2 && string.charAt(n5) == 'a' && string.charAt(n5 + 1) == 't' && Character.isWhitespace(string.charAt(n5 + 2))) {
                dcz3 = dcz2;
                if (dcz2 == null) {
                    dcz3 = new dcz();
                    dcz3.a = n4;
                    dcz3.c = string;
                }
                dcz3.b = n2;
            } else {
                dcz3 = dcz2;
                if (dcz2 != null) break;
            }
            n4 = n2 + 1;
            n2 = crh.o(string, n4);
            dcz2 = dcz3;
        }
        return dcz2;
    }

    public static String q(Throwable serializable, int n2) {
        String string = serializable.getClass().getName();
        String string2 = ((Throwable)serializable).getMessage();
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(": ");
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        serializable = ((Throwable)serializable).getCause();
        if (serializable != null) {
            if (n2 >= 5) {
                return ((String)charSequence).concat("\n(...)");
            }
            string = crh.q((Throwable)serializable, n2 + 1);
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append((String)charSequence);
            ((StringBuilder)serializable).append("\nCaused by: ");
            ((StringBuilder)serializable).append(string);
            return ((StringBuilder)serializable).toString();
        }
        return charSequence;
    }

    public static Throwable r(Throwable throwable) {
        Class<?> clazz;
        Throwable throwable2 = throwable.getCause();
        if (throwable2 == null || !(clazz = throwable.getClass()).equals(ExecutionException.class) && !clazz.equals(hju.class)) {
            return throwable;
        }
        return crh.r(throwable2);
    }

    public static void s(AssetManager object, String object2, File file) {
        hji hji2 = new hji();
        try {
            object = object.open((String)object2);
            hji2.c((Closeable)object);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            object2 = new BufferedOutputStream(fileOutputStream);
            hji2.c((Closeable)object2);
            hjg.a((InputStream)object, (OutputStream)object2);
            hji2.close();
            return;
        }
        catch (Throwable throwable) {
            try {
                throw hji2.a(throwable);
            }
            catch (Throwable throwable2) {
                hji2.close();
                throw throwable2;
            }
        }
    }

    public static void t(JsonWriter jsonWriter, ddm ddm2) {
        for (String string : ddm2.b()) {
            Object object = ddm2.a(string);
            if (object == null) continue;
            jsonWriter.name(string).value(object.toString());
        }
    }

    public static hpn v(hpn hpn2, Callable callable, Executor executor) {
        fxf.K(executor);
        hqa hqa2 = new hqa();
        hpn2.c(new daw(hqa2, callable, hpn2, executor), executor);
        return hqa2;
    }

    public static bzq w(Iterable iterable) {
        return new bzq((Object)hhk.Y(iterable), null);
    }

    @SafeVarargs
    public static bzq x(hpn ... hpnArray) {
        return new bzq((Object)hhk.Z(hpnArray), null);
    }

    public static bzq y(Iterable iterable) {
        return new bzq((Object)hhk.aa(iterable), null);
    }

    @SafeVarargs
    public static bzq z(hpn ... hpnArray) {
        return new bzq((Object)hhk.ab(hpnArray), null);
    }

    public final Object u(hus hus2) {
        return this.Z(hus2, 0);
    }
}

