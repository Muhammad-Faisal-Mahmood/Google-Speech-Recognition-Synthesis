/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 */
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class apc
implements apa,
ahl {
    public static final gzx a;
    public static final gzx b;
    public static final gzx c;
    public static final gzx d;
    public static final gzx e;
    public static final gzx f;
    private static apc h;
    public final bzb g;
    private final hac i;
    private final apj j;
    private int k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private int r;

    static {
        Long l2 = 1700000L;
        Long l3 = 860000L;
        a = gzx.s(4300000L, 3200000L, 2400000L, l2, l3);
        Long l4 = 980000L;
        b = gzx.s(1500000L, l4, 750000L, 520000L, 290000L);
        Long l5 = 2000000L;
        Long l6 = 1300000L;
        Long l7 = 1000000L;
        c = gzx.s(l5, l6, l7, l3, 610000L);
        d = gzx.s(2500000L, l2, 1200000L, 970000L, 680000L);
        e = gzx.s(4700000L, 2800000L, 0x200B20L, l2, l4);
        f = gzx.s(2700000L, l5, 1600000L, l6, l7);
    }

    public apc(Context object, Map object2) {
        this.i = hac.i((Map)object2);
        this.g = new bzb(null, null, null, null);
        this.j = new apj();
        if (object != null) {
            WeakReference<Object> weakReference2;
            int n2;
            object = jle.g((Context)object);
            this.r = n2 = ((jle)object).e();
            this.p = this.h(n2);
            object2 = new AmbientMode$AmbientController(this, null);
            for (WeakReference<Object> weakReference2 : (CopyOnWriteArrayList)((jle)object).c) {
                if (weakReference2.get() != null) continue;
                ((CopyOnWriteArrayList)((jle)object).c).remove(weakReference2);
            }
            Object object3 = ((jle)object).c;
            weakReference2 = new WeakReference<Object>(object2);
            ((CopyOnWriteArrayList)object3).add(weakReference2);
            weakReference2 = ((jle)object).d;
            object = new aj(object, object2, 20, null);
            ((Handler)weakReference2).post((Runnable)object);
            return;
        }
        this.r = 0;
        this.p = this.h(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static apc e(Context object) {
        synchronized (apc.class) {
            if (h != null) return h;
            Context context = object == null ? null : object.getApplicationContext();
            int n2 = agf.a;
            object = object != null && (object = (TelephonyManager)object.getSystemService("phone")) != null && !TextUtils.isEmpty((CharSequence)(object = object.getNetworkCountryIso())) ? fxf.U((String)object) : fxf.U(Locale.getDefault().getCountry());
            int[] nArray = apc.g((String)object);
            object = new HashMap(8);
            object.put(0, 1000000L);
            Object object2 = a;
            object.put(2, (Long)object2.get(nArray[0]));
            object.put(3, (Long)b.get(nArray[1]));
            object.put(4, (Long)c.get(nArray[2]));
            object.put(5, (Long)d.get(nArray[3]));
            object.put(10, (Long)e.get(nArray[4]));
            object.put(9, (Long)f.get(nArray[5]));
            object.put(7, (Long)object2.get(nArray[0]));
            h = object2 = new apc(context, (Map)object);
            return h;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int[] g(String string) {
        int n2 = string.hashCode();
        if (n2 != 2091) {
            if (n2 != 2092) {
                if (n2 != 2102) {
                    if (n2 != 2103) {
                        if (n2 != 2111) {
                            if (n2 != 2112) {
                                if (n2 != 2135) {
                                    if (n2 != 2136) {
                                        switch (n2) {
                                            default: {
                                                switch (n2) {
                                                    default: {
                                                        switch (n2) {
                                                            default: {
                                                                switch (n2) {
                                                                    default: {
                                                                        switch (n2) {
                                                                            default: {
                                                                                switch (n2) {
                                                                                    default: {
                                                                                        return new int[]{2, 2, 2, 2, 2, 2};
                                                                                    }
                                                                                    case 2150: {
                                                                                        if (!string.equals("CI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                        return new int[]{2, 4, 3, 4, 2, 2};
                                                                                    }
                                                                                    case 2149: {
                                                                                        if (!string.equals("CH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                        return new int[]{0, 1, 0, 0, 0, 2};
                                                                                    }
                                                                                    case 2148: {
                                                                                        if (!string.equals("CG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                        return new int[]{3, 4, 3, 3, 2, 2};
                                                                                    }
                                                                                    case 2147: {
                                                                                        if (!string.equals("CF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                        return new int[]{4, 2, 4, 2, 2, 2};
                                                                                    }
                                                                                }
                                                                            }
                                                                            case 2130: {
                                                                                if (!string.equals("BT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                return new int[]{3, 1, 2, 2, 3, 2};
                                                                            }
                                                                            case 2129: {
                                                                                if (!string.equals("BS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                return new int[]{3, 2, 1, 1, 2, 2};
                                                                            }
                                                                            case 2128: {
                                                                                if (!string.equals("BR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                return new int[]{1, 1, 1, 1, 2, 4};
                                                                            }
                                                                            case 2127: {
                                                                                if (!string.equals("BQ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                                return new int[]{1, 2, 0, 0, 2, 2};
                                                                            }
                                                                        }
                                                                    }
                                                                    case 2125: {
                                                                        if (!string.equals("BO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                        return new int[]{1, 2, 4, 4, 2, 2};
                                                                    }
                                                                    case 2124: {
                                                                        if (!string.equals("BN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                        return new int[]{3, 2, 0, 0, 2, 2};
                                                                    }
                                                                    case 2123: {
                                                                        if (!string.equals("BM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                        return new int[]{0, 2, 0, 0, 2, 2};
                                                                    }
                                                                    case 2122: {
                                                                        if (!string.equals("BL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                        return new int[]{1, 2, 2, 2, 2, 2};
                                                                    }
                                                                }
                                                            }
                                                            case 2100: {
                                                                if (!string.equals("AU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                return new int[]{0, 3, 1, 1, 3, 0};
                                                            }
                                                            case 2099: {
                                                                if (!string.equals("AT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                return new int[]{0, 0, 0, 0, 0, 2};
                                                            }
                                                            case 2098: {
                                                                if (!string.equals("AS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                return new int[]{2, 2, 3, 3, 2, 2};
                                                            }
                                                            case 2097: {
                                                                if (!string.equals("AR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                return new int[]{2, 2, 2, 2, 1, 2};
                                                            }
                                                            case 2096: {
                                                                if (!string.equals("AQ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                                return new int[]{4, 2, 2, 2, 2, 2};
                                                            }
                                                        }
                                                    }
                                                    case 2877: {
                                                        if (!string.equals("ZW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 4, 3, 2, 2};
                                                    }
                                                    case 2867: {
                                                        if (!string.equals("ZM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 4, 3, 2, 2};
                                                    }
                                                    case 2855: {
                                                        if (!string.equals("ZA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 4, 2, 1, 1, 2};
                                                    }
                                                    case 2843: {
                                                        if (!string.equals("YT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 3, 4, 2, 2};
                                                    }
                                                    case 2828: {
                                                        if (!string.equals("YE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2803: {
                                                        if (!string.equals("XK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 1, 1, 2, 2};
                                                    }
                                                    case 2780: {
                                                        if (!string.equals("WS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 2, 2, 2, 2};
                                                    }
                                                    case 2767: {
                                                        if (!string.equals("WF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 4, 2, 2};
                                                    }
                                                    case 2751: {
                                                        if (!string.equals("VU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 3, 2, 2, 2};
                                                    }
                                                    case 2744: {
                                                        if (!string.equals("VN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 1, 2, 2, 2};
                                                    }
                                                    case 2739: {
                                                        if (!string.equals("VI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 1, 2, 2, 2};
                                                    }
                                                    case 2737: {
                                                        if (!string.equals("VG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 1, 1, 2, 4};
                                                    }
                                                    case 2735: {
                                                        if (!string.equals("VE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2733: {
                                                        if (!string.equals("VC")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 0, 0, 2, 2};
                                                    }
                                                    case 2731: {
                                                        if (!string.equals("VA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2725: {
                                                        if (!string.equals("UZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 3, 4, 3, 2};
                                                    }
                                                    case 2724: {
                                                        if (!string.equals("UY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 1, 2, 1, 2};
                                                    }
                                                    case 2718: {
                                                        if (!string.equals("US")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 4, 1, 3, 1};
                                                    }
                                                    case 2706: {
                                                        if (!string.equals("UG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 2, 3, 4, 2};
                                                    }
                                                    case 2700: {
                                                        if (!string.equals("UA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 1, 2, 3, 3};
                                                    }
                                                    case 2694: {
                                                        if (!string.equals("TZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 2, 1, 3, 2};
                                                    }
                                                    case 2691: {
                                                        if (!string.equals("TW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 0, 0};
                                                    }
                                                    case 2690: {
                                                        if (!string.equals("TV")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 4, 2, 2};
                                                    }
                                                    case 2688: {
                                                        if (!string.equals("TT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 4, 1, 0, 2, 2};
                                                    }
                                                    case 2686: {
                                                        if (!string.equals("TR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 1, 1, 1, 2, 2};
                                                    }
                                                    case 2683: {
                                                        if (!string.equals("TO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 4, 3, 2, 2};
                                                    }
                                                    case 2682: {
                                                        if (!string.equals("TN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 1, 1, 2, 2};
                                                    }
                                                    case 2681: {
                                                        if (!string.equals("TM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 4, 2, 2};
                                                    }
                                                    case 2680: {
                                                        if (!string.equals("TL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 4, 4, 2, 2};
                                                    }
                                                    case 2678: {
                                                        if (!string.equals("TJ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 4, 4, 2, 2};
                                                    }
                                                    case 2676: {
                                                        if (!string.equals("TH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 1, 2, 2, 2, 2};
                                                    }
                                                    case 2675: {
                                                        if (!string.equals("TG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 1, 0, 2, 2};
                                                    }
                                                    case 2672: {
                                                        if (!string.equals("TD")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 4, 4, 2, 2};
                                                    }
                                                    case 2671: {
                                                        if (!string.equals("TC")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 1, 2, 2, 2};
                                                    }
                                                    case 2663: {
                                                        if (!string.equals("SZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 3, 4, 2, 2};
                                                    }
                                                    case 2662: {
                                                        if (!string.equals("SY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 4, 4, 2, 2};
                                                    }
                                                    case 2661: {
                                                        if (!string.equals("SX")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 0, 0, 2, 2};
                                                    }
                                                    case 2659: {
                                                        if (!string.equals("SV")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 2, 1, 2, 2};
                                                    }
                                                    case 2657: {
                                                        if (!string.equals("ST")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 1, 2, 2, 2};
                                                    }
                                                    case 2656: {
                                                        if (!string.equals("SS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 2, 4, 2, 2};
                                                    }
                                                    case 2655: {
                                                        if (!string.equals("SR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 4, 4, 1, 2, 2};
                                                    }
                                                    case 2652: {
                                                        if (!string.equals("SO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 3, 4, 4, 2};
                                                    }
                                                    case 2651: {
                                                        if (!string.equals("SN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 3, 2, 2, 2};
                                                    }
                                                    case 2650: {
                                                        if (!string.equals("SM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2649: {
                                                        if (!string.equals("SL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 3, 3, 2, 2};
                                                    }
                                                    case 2648: {
                                                        if (!string.equals("SK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 1, 1, 1, 2, 2};
                                                    }
                                                    case 2647: {
                                                        if (!string.equals("SJ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2646: {
                                                        if (!string.equals("SI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 1, 2};
                                                    }
                                                    case 2645: {
                                                        if (!string.equals("SH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2644: {
                                                        if (!string.equals("SG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 3, 3, 1, 1};
                                                    }
                                                    case 2642: {
                                                        if (!string.equals("SE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2641: {
                                                        if (!string.equals("SD")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 4, 4, 2, 2};
                                                    }
                                                    case 2640: {
                                                        if (!string.equals("SC")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2639: {
                                                        if (!string.equals("SB")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 4, 3, 2, 2};
                                                    }
                                                    case 2638: {
                                                        if (!string.equals("SA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 1, 2, 2, 0};
                                                    }
                                                    case 2629: {
                                                        if (!string.equals("RW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 2, 0, 2, 2};
                                                    }
                                                    case 2627: {
                                                        if (!string.equals("RU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 0, 1, 3, 3};
                                                    }
                                                    case 2625: {
                                                        if (!string.equals("RS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 0, 1, 2, 2};
                                                    }
                                                    case 2621: {
                                                        if (!string.equals("RO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 1, 1, 3, 2};
                                                    }
                                                    case 2611: {
                                                        if (!string.equals("RE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 3, 2, 3, 1, 2};
                                                    }
                                                    case 2576: {
                                                        if (!string.equals("QA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 4, 4, 4, 4, 2};
                                                    }
                                                    case 2569: {
                                                        if (!string.equals("PY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2567: {
                                                        if (!string.equals("PW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 4, 1, 2, 2};
                                                    }
                                                    case 2564: {
                                                        if (!string.equals("PT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 1, 2};
                                                    }
                                                    case 2563: {
                                                        if (!string.equals("PS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 1, 3, 2, 2};
                                                    }
                                                    case 2562: {
                                                        if (!string.equals("PR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 0, 2, 1, 2, 0};
                                                    }
                                                    case 2557: {
                                                        if (!string.equals("PM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2556: {
                                                        if (!string.equals("PL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 2, 2, 4, 4};
                                                    }
                                                    case 2555: {
                                                        if (!string.equals("PK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 3, 3, 2, 2};
                                                    }
                                                    case 2552: {
                                                        if (!string.equals("PH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 2, 3, 2, 1};
                                                    }
                                                    case 2551: {
                                                        if (!string.equals("PG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 3, 3, 2, 2};
                                                    }
                                                    case 2550: {
                                                        if (!string.equals("PF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 3, 1, 2, 2};
                                                    }
                                                    case 2549: {
                                                        if (!string.equals("PE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 4, 4, 3, 2};
                                                    }
                                                    case 2545: {
                                                        if (!string.equals("PA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 2, 3, 2, 2};
                                                    }
                                                    case 2526: {
                                                        if (!string.equals("OM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 1, 2, 4, 2};
                                                    }
                                                    case 2508: {
                                                        if (!string.equals("NZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 1, 2, 4, 2};
                                                    }
                                                    case 2503: {
                                                        if (!string.equals("NU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2500: {
                                                        if (!string.equals("NR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 4, 4, 2, 2};
                                                    }
                                                    case 2498: {
                                                        if (!string.equals("NP")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 4, 3, 2, 2};
                                                    }
                                                    case 2497: {
                                                        if (!string.equals("NO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 3, 0, 0, 2};
                                                    }
                                                    case 2494: {
                                                        if (!string.equals("NL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 4, 3, 0, 4};
                                                    }
                                                    case 2491: {
                                                        if (!string.equals("NI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2489: {
                                                        if (!string.equals("NG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 2, 1, 2, 2};
                                                    }
                                                    case 2488: {
                                                        if (!string.equals("NF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2487: {
                                                        if (!string.equals("NE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2485: {
                                                        if (!string.equals("NC")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 3, 4, 2, 2};
                                                    }
                                                    case 2483: {
                                                        if (!string.equals("NA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 3, 2, 2, 2};
                                                    }
                                                    case 2477: {
                                                        if (!string.equals("MZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 2, 2, 2, 2};
                                                    }
                                                    case 2476: {
                                                        if (!string.equals("MY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 4, 1, 1, 0};
                                                    }
                                                    case 2475: {
                                                        if (!string.equals("MX")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 4, 4, 4, 3, 2};
                                                    }
                                                    case 2474: {
                                                        if (!string.equals("MW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 2, 1, 2, 2};
                                                    }
                                                    case 2473: {
                                                        if (!string.equals("MV")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 1, 3, 4, 2};
                                                    }
                                                    case 2472: {
                                                        if (!string.equals("MU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 0, 2, 2, 2};
                                                    }
                                                    case 2471: {
                                                        if (!string.equals("MT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2470: {
                                                        if (!string.equals("MS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2469: {
                                                        if (!string.equals("MR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 3, 4, 2, 2};
                                                    }
                                                    case 2468: {
                                                        if (!string.equals("MQ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 2, 3, 2, 2};
                                                    }
                                                    case 2467: {
                                                        if (!string.equals("MP")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2466: {
                                                        if (!string.equals("MO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 4, 4, 3, 1};
                                                    }
                                                    case 2465: {
                                                        if (!string.equals("MN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 0, 2, 2, 2, 2};
                                                    }
                                                    case 2464: {
                                                        if (!string.equals("MM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 3, 3, 4, 2};
                                                    }
                                                    case 2463: {
                                                        if (!string.equals("ML")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 2, 2, 2, 2};
                                                    }
                                                    case 2462: {
                                                        if (!string.equals("MK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 0, 1, 3, 2};
                                                    }
                                                    case 2459: {
                                                        if (!string.equals("MH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 4, 2, 2};
                                                    }
                                                    case 2458: {
                                                        if (!string.equals("MG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 3, 3, 2, 2};
                                                    }
                                                    case 2457: {
                                                        if (!string.equals("MF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 2, 3, 2, 2};
                                                    }
                                                    case 2456: {
                                                        if (!string.equals("ME")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 0, 0, 1, 3, 2};
                                                    }
                                                    case 2455: {
                                                        if (!string.equals("MD")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 0, 0, 2, 2};
                                                    }
                                                    case 2454: {
                                                        if (!string.equals("MC")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 2, 0, 2, 2};
                                                    }
                                                    case 2452: {
                                                        if (!string.equals("MA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 1, 1, 2, 2};
                                                    }
                                                    case 2445: {
                                                        if (!string.equals("LY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 3, 3, 2, 2};
                                                    }
                                                    case 2442: {
                                                        if (!string.equals("LV")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2441: {
                                                        if (!string.equals("LU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 0, 3, 2, 1, 3};
                                                    }
                                                    case 2440: {
                                                        if (!string.equals("LT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 1, 0, 1, 0, 2};
                                                    }
                                                    case 2439: {
                                                        if (!string.equals("LS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 3, 3, 2, 2};
                                                    }
                                                    case 2438: {
                                                        if (!string.equals("LR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2431: {
                                                        if (!string.equals("LK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 3, 3, 4, 2};
                                                    }
                                                    case 2429: {
                                                        if (!string.equals("LI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2423: {
                                                        if (!string.equals("LC")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 1, 1, 2, 2};
                                                    }
                                                    case 2422: {
                                                        if (!string.equals("LB")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 1, 2, 2, 2};
                                                    }
                                                    case 2421: {
                                                        if (!string.equals("LA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 1, 3, 2, 2};
                                                    }
                                                    case 2415: {
                                                        if (!string.equals("KZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 2, 2, 3, 2};
                                                    }
                                                    case 2414: {
                                                        if (!string.equals("KY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 0, 0, 2, 2};
                                                    }
                                                    case 2412: {
                                                        if (!string.equals("KW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2407: {
                                                        if (!string.equals("KR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 4, 4, 4};
                                                    }
                                                    case 2403: {
                                                        if (!string.equals("KN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 0, 0, 2, 2};
                                                    }
                                                    case 2402: {
                                                        if (!string.equals("KM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 3, 2, 2, 2};
                                                    }
                                                    case 2398: {
                                                        if (!string.equals("KI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 4, 4, 2, 2};
                                                    }
                                                    case 2397: {
                                                        if (!string.equals("KH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 4, 2, 2, 2};
                                                    }
                                                    case 2396: {
                                                        if (!string.equals("KG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 1, 2, 2, 2};
                                                    }
                                                    case 2394: {
                                                        if (!string.equals("KE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 1, 1, 1, 2};
                                                    }
                                                    case 2374: {
                                                        if (!string.equals("JP")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 3, 2, 3, 4, 2};
                                                    }
                                                    case 2373: {
                                                        if (!string.equals("JO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 1, 1, 1, 2, 2};
                                                    }
                                                    case 2371: {
                                                        if (!string.equals("JM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 4, 3, 1, 2, 2};
                                                    }
                                                    case 2363: {
                                                        if (!string.equals("JE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 0, 1, 2, 2};
                                                    }
                                                    case 2347: {
                                                        if (!string.equals("IT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 1, 1, 2, 1, 2};
                                                    }
                                                    case 2346: {
                                                        if (!string.equals("IS")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2345: {
                                                        if (!string.equals("IR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 3, 3, 4, 3};
                                                    }
                                                    case 2344: {
                                                        if (!string.equals("IQ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 3, 2, 2, 2};
                                                    }
                                                    case 2342: {
                                                        if (!string.equals("IO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 2, 0, 2, 2};
                                                    }
                                                    case 2341: {
                                                        if (!string.equals("IN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 1, 3, 2, 2, 3};
                                                    }
                                                    case 2340: {
                                                        if (!string.equals("IM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 0, 1, 2, 2};
                                                    }
                                                    case 2339: {
                                                        if (!string.equals("IL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 2, 3, 4, 2};
                                                    }
                                                    case 2332: {
                                                        if (!string.equals("IE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 1, 1, 1, 1, 2};
                                                    }
                                                    case 2331: {
                                                        if (!string.equals("ID")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 3, 3, 2, 4};
                                                    }
                                                    case 2317: {
                                                        if (!string.equals("HU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2316: {
                                                        if (!string.equals("HT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2314: {
                                                        if (!string.equals("HR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2307: {
                                                        if (!string.equals("HK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 1, 0, 1, 1, 0};
                                                    }
                                                    case 2290: {
                                                        if (!string.equals("GY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 1, 1, 3, 2, 2};
                                                    }
                                                    case 2288: {
                                                        if (!string.equals("GW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 1, 2, 2, 2};
                                                    }
                                                    case 2286: {
                                                        if (!string.equals("GU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 4, 3, 3, 2};
                                                    }
                                                    case 2285: {
                                                        if (!string.equals("GT")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 2, 1, 2, 2};
                                                    }
                                                    case 2283: {
                                                        if (!string.equals("GR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 0, 0, 1, 2};
                                                    }
                                                    case 2282: {
                                                        if (!string.equals("GQ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2281: {
                                                        if (!string.equals("GP")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 1, 3, 2, 2};
                                                    }
                                                    case 2279: {
                                                        if (!string.equals("GN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 4, 2, 2, 2};
                                                    }
                                                    case 2278: {
                                                        if (!string.equals("GM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 2, 4, 2, 2};
                                                    }
                                                    case 2277: {
                                                        if (!string.equals("GL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 2, 0, 2, 2};
                                                    }
                                                    case 2274: {
                                                        if (!string.equals("GI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 0, 1, 2, 2};
                                                    }
                                                    case 2273: {
                                                        if (!string.equals("GH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 3, 2, 2, 2};
                                                    }
                                                    case 2272: {
                                                        if (!string.equals("GG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 1, 1, 2, 2};
                                                    }
                                                    case 2271: {
                                                        if (!string.equals("GF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 3, 3, 2, 2};
                                                    }
                                                    case 2270: {
                                                        if (!string.equals("GE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 1, 0, 2, 2, 2};
                                                    }
                                                    case 2269: {
                                                        if (!string.equals("GD")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 0, 0, 2, 2};
                                                    }
                                                    case 2267: {
                                                        if (!string.equals("GB")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 1, 3, 2, 2, 2};
                                                    }
                                                    case 2266: {
                                                        if (!string.equals("GA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 0, 0, 2, 2};
                                                    }
                                                    case 2252: {
                                                        if (!string.equals("FR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 1, 1, 1, 0, 2};
                                                    }
                                                    case 2249: {
                                                        if (!string.equals("FO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 0, 2, 2};
                                                    }
                                                    case 2247: {
                                                        if (!string.equals("FM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 4, 0, 2, 2};
                                                    }
                                                    case 2245: {
                                                        if (!string.equals("FK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2244: {
                                                        if (!string.equals("FJ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 2, 3, 2, 2};
                                                    }
                                                    case 2243: {
                                                        if (!string.equals("FI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 1, 0, 2};
                                                    }
                                                    case 2223: {
                                                        if (!string.equals("ET")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 4, 4, 4, 2};
                                                    }
                                                    case 2222: {
                                                        if (!string.equals("ES")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 1, 0};
                                                    }
                                                    case 2221: {
                                                        if (!string.equals("ER")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2210: {
                                                        if (!string.equals("EG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 3, 3, 2, 2};
                                                    }
                                                    case 2208: {
                                                        if (!string.equals("EE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 0, 2};
                                                    }
                                                    case 2206: {
                                                        if (!string.equals("EC")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 3, 2, 1, 2, 2};
                                                    }
                                                    case 2198: {
                                                        if (!string.equals("DZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 4, 4, 2, 2};
                                                    }
                                                    case 2187: {
                                                        if (!string.equals("DO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2185: {
                                                        if (!string.equals("DM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 0, 0, 2, 2};
                                                    }
                                                    case 2183: {
                                                        if (!string.equals("DK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 2, 0, 0, 2};
                                                    }
                                                    case 2182: {
                                                        if (!string.equals("DJ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 3, 3, 2, 2};
                                                    }
                                                    case 2177: {
                                                        if (!string.equals("DE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 1, 4, 2, 2, 1};
                                                    }
                                                    case 2167: {
                                                        if (!string.equals("CZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 2, 0, 1, 2};
                                                    }
                                                    case 2166: {
                                                        if (!string.equals("CY")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 0, 1, 0, 0, 2};
                                                    }
                                                    case 2165: {
                                                        if (!string.equals("CX")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 2, 2, 2, 2};
                                                    }
                                                    case 2164: {
                                                        if (!string.equals("CW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 2, 0, 0, 2, 2};
                                                    }
                                                    case 2163: {
                                                        if (!string.equals("CV")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 0, 1, 2, 2};
                                                    }
                                                    case 2162: {
                                                        if (!string.equals("CU")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 4, 4, 2, 2};
                                                    }
                                                    case 2159: {
                                                        if (!string.equals("CR")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2156: {
                                                        if (!string.equals("CO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 3, 3, 2, 2, 2};
                                                    }
                                                    case 2155: {
                                                        if (!string.equals("CN")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 0, 1, 1, 3, 1};
                                                    }
                                                    case 2154: {
                                                        if (!string.equals("CM")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 3, 4, 2, 2};
                                                    }
                                                    case 2153: {
                                                        if (!string.equals("CL")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 1, 2, 2, 2, 2};
                                                    }
                                                    case 2152: {
                                                        if (!string.equals("CK")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 2, 2, 1, 2, 2};
                                                    }
                                                    case 2145: {
                                                        if (!string.equals("CD")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 3, 2, 2, 2, 2};
                                                    }
                                                    case 2142: {
                                                        if (!string.equals("CA")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 2, 1, 2, 3, 3};
                                                    }
                                                    case 2133: {
                                                        if (!string.equals("BW")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 2, 1, 0, 2, 2};
                                                    }
                                                    case 2120: {
                                                        if (!string.equals("BJ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 2, 3, 2, 2};
                                                    }
                                                    case 2119: {
                                                        if (!string.equals("BI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 4, 4, 4, 2, 2};
                                                    }
                                                    case 2118: {
                                                        if (!string.equals("BH")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{1, 3, 1, 3, 4, 2};
                                                    }
                                                    case 2117: {
                                                        if (!string.equals("BG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 0, 0, 1, 2};
                                                    }
                                                    case 2116: {
                                                        if (!string.equals("BF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 3, 4, 4, 2, 2};
                                                    }
                                                    case 2115: {
                                                        if (!string.equals("BE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{0, 0, 1, 0, 1, 2};
                                                    }
                                                    case 2114: {
                                                        if (!string.equals("BD")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{2, 1, 3, 2, 4, 2};
                                                    }
                                                    case 2105: {
                                                        if (!string.equals("AZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{4, 2, 3, 3, 2, 2};
                                                    }
                                                    case 2094: {
                                                        if (!string.equals("AO")) return new int[]{2, 2, 2, 2, 2, 2};
                                                        return new int[]{3, 4, 4, 3, 2, 2};
                                                    }
                                                    case 2088: 
                                                }
                                                if (!string.equals("AI")) return new int[]{2, 2, 2, 2, 2, 2};
                                                return new int[]{1, 2, 0, 0, 2, 2};
                                            }
                                            case 2086: {
                                                if (!string.equals("AG")) return new int[]{2, 2, 2, 2, 2, 2};
                                                return new int[]{2, 4, 3, 4, 2, 2};
                                            }
                                            case 2085: {
                                                if (!string.equals("AF")) return new int[]{2, 2, 2, 2, 2, 2};
                                                return new int[]{4, 4, 3, 4, 2, 2};
                                            }
                                            case 2084: {
                                                if (!string.equals("AE")) return new int[]{2, 2, 2, 2, 2, 2};
                                                return new int[]{1, 4, 2, 3, 4, 1};
                                            }
                                            case 2083: 
                                        }
                                        if (!string.equals("AD")) return new int[]{2, 2, 2, 2, 2, 2};
                                        return new int[]{1, 2, 0, 0, 2, 2};
                                    }
                                    if (!string.equals("BZ")) return new int[]{2, 2, 2, 2, 2, 2};
                                    return new int[]{2, 2, 2, 1, 2, 2};
                                }
                                if (!string.equals("BY")) return new int[]{2, 2, 2, 2, 2, 2};
                                return new int[]{1, 2, 3, 3, 2, 2};
                            }
                            if (!string.equals("BB")) return new int[]{2, 2, 2, 2, 2, 2};
                            return new int[]{1, 2, 0, 0, 2, 2};
                        }
                        if (!string.equals("BA")) return new int[]{2, 2, 2, 2, 2, 2};
                        return new int[]{1, 1, 1, 1, 2, 2};
                    }
                    if (!string.equals("AX")) return new int[]{2, 2, 2, 2, 2, 2};
                    return new int[]{0, 2, 2, 2, 2, 2};
                }
                if (!string.equals("AW")) return new int[]{2, 2, 2, 2, 2, 2};
                return new int[]{2, 2, 3, 4, 2, 2};
            }
            if (!string.equals("AM")) return new int[]{2, 2, 2, 2, 2, 2};
            return new int[]{2, 3, 2, 3, 2, 2};
        }
        if (!string.equals("AL")) return new int[]{2, 2, 2, 2, 2, 2};
        return new int[]{1, 1, 1, 2, 2, 2};
    }

    private final long h(int n2) {
        Long l2;
        Long l3 = l2 = (Long)this.i.get(n2);
        if (l2 == null) {
            l3 = (Long)this.i.get(0);
        }
        l2 = l3;
        if (l3 == null) {
            l2 = 1000000L;
        }
        return l2;
    }

    private final void i(int n2, long l2, long l3) {
        block5: {
            long l4;
            int n3;
            block3: {
                block4: {
                    n3 = n2;
                    l4 = l2;
                    if (n2 != 0) break block3;
                    l4 = l2;
                    if (l2 != 0L) break block4;
                    if (l3 == this.q) break block5;
                    l4 = 0L;
                }
                n3 = 0;
            }
            this.q = l3;
            for (Object object : (CopyOnWriteArrayList)this.g.a) {
                if (((giu)object).a) continue;
                Object object2 = ((giu)object).b;
                object = new kox((giu)object, n3, l4, 1);
                ((Handler)object2).post((Runnable)object);
            }
        }
    }

    private static boolean j(agt agt2, boolean bl2) {
        return bl2 && !agt2.b(8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(agt agt2, boolean bl2, int n2) {
        synchronized (this) {
            bl2 = apc.j(agt2, bl2);
            if (!bl2) {
                return;
            }
            this.m += (long)n2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(agt object, boolean bl2) {
        synchronized (this) {
            bl2 = apc.j((agt)object, bl2);
            if (!bl2) {
                return;
            }
            int n2 = this.k;
            int n3 = 0;
            bl2 = n2 > 0;
            abr.f(bl2);
            long l2 = SystemClock.elapsedRealtime();
            long l3 = this.l;
            long l4 = this.n;
            int n4 = (int)(l2 - l3);
            this.n = l4 + (long)n4;
            l3 = this.o;
            l4 = this.m;
            this.o = l3 + l4;
            if (n4 > 0) {
                int n5;
                float f2 = l4;
                apj apj2 = this.j;
                n2 = (int)Math.sqrt(l4);
                if (apj2.e != 1) {
                    Collections.sort(apj2.c, apj.a);
                    apj2.e = 1;
                }
                if ((n5 = apj2.h) > 0) {
                    object = apj2.d;
                    apj2.h = --n5;
                    object = object[n5];
                } else {
                    object = new api();
                }
                float f3 = n4;
                n5 = apj2.f;
                apj2.f = n5 + 1;
                ((api)object).a = n5;
                ((api)object).b = n2;
                ((api)object).c = f2 * 8000.0f / f3;
                apj2.c.add(object);
                apj2.g += n2;
                while ((n2 = apj2.g) > 2000) {
                    object = (api)apj2.c.get(0);
                    n5 = ((api)object).b;
                    if (n5 <= (n2 -= 2000)) {
                        apj2.g -= n5;
                        apj2.c.remove(0);
                        n2 = apj2.h;
                        if (n2 >= 5) continue;
                        api[] apiArray = apj2.d;
                        apj2.h = n2 + 1;
                        apiArray[n2] = object;
                        continue;
                    }
                    ((api)object).b = n5 - n2;
                    apj2.g -= n2;
                }
                if (this.n >= 2000L || this.o >= 524288L) {
                    block24: {
                        apj2 = this.j;
                        if (apj2.e != 0) {
                            Collections.sort(apj2.c, apj.b);
                            apj2.e = 0;
                        }
                        f2 = apj2.g;
                        n2 = 0;
                        while (n3 < apj2.c.size()) {
                            object = (api)apj2.c.get(n3);
                            if ((float)(n2 += ((api)object).b) >= 0.5f * f2) {
                                f2 = ((api)object).c;
                                break block24;
                            }
                            ++n3;
                        }
                        if (apj2.c.isEmpty()) {
                            f2 = Float.NaN;
                        } else {
                            object = apj2.c;
                            f2 = ((api)((ArrayList)object).get((int)(((ArrayList)object).size() - 1))).c;
                        }
                    }
                    this.p = (long)f2;
                }
                this.i(n4, this.m, this.p);
                this.l = l2;
                this.m = 0L;
            }
            --this.k;
            return;
        }
    }

    @Override
    public final void c() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(agt agt2, boolean bl2) {
        synchronized (this) {
            bl2 = apc.j(agt2, bl2);
            if (!bl2) {
                return;
            }
            if (this.k == 0) {
                this.l = SystemClock.elapsedRealtime();
            }
            ++this.k;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(int n2) {
        synchronized (this) {
            if (this.r != n2) {
                this.r = n2;
                if (n2 != 1 && n2 != 0 && n2 != 8) {
                    this.p = this.h(n2);
                    long l2 = SystemClock.elapsedRealtime();
                    n2 = this.k > 0 ? (int)(l2 - this.l) : 0;
                    this.i(n2, this.m, this.p);
                    this.l = l2;
                    this.m = 0L;
                    this.o = 0L;
                    this.n = 0L;
                    apj apj2 = this.j;
                    apj2.c.clear();
                    apj2.e = -1;
                    apj2.f = 0;
                    apj2.g = 0;
                    return;
                }
            }
            return;
        }
    }
}

