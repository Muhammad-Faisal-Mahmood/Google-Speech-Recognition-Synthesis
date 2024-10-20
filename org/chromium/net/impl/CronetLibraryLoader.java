/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.ConditionVariable
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Process
 *  android.util.Log
 */
package org.chromium.net.impl;

import J.N;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.impl.ImplVersion;

public class CronetLibraryLoader {
    public static final String a;
    public static final ConditionVariable b;
    public static final ConditionVariable c;
    public static kqr d;
    public static bzo e;
    private static final Object f;
    private static boolean g;
    private static final String h;
    private static final HandlerThread i;

    static {
        f = new Object();
        h = "cronet.".concat(ImplVersion.getCronetVersion());
        a = "CronetLibraryLoader";
        i = new HandlerThread("CronetInit");
        b = new ConditionVariable();
        c = new ConditionVariable();
    }

    public static void a(Runnable runnable) {
        HandlerThread handlerThread = i;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        new Handler(handlerThread.getLooper()).post(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Context object, kqo object2, boolean bl2) {
        Object object3 = f;
        synchronized (object3) {
            block11: {
                int n2;
                block10: {
                    block9: {
                        if (g) {
                            return false;
                        }
                        jjj.c = object;
                        object = i;
                        if (!object.isAlive()) {
                            object.start();
                            object = new kqq();
                            CronetLibraryLoader.a((Runnable)object);
                        }
                        if (!bl2) {
                            ((kqo)object2).v();
                            System.loadLibrary(h);
                        }
                        N.MAuYp$hS();
                        object = ImplVersion.getCronetVersion();
                        if (!((String)object).equals(jjj.Y())) {
                            object2 = new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", object, jjj.Y()));
                            throw object2;
                        }
                        object2 = a;
                        String string = System.getProperty("os.arch");
                        Log.i((String)"cr_".concat(String.valueOf(object2)), (String)String.format(Locale.US, "Cronet version: %s, arch: %s", object, string));
                        if (!Log.isLoggable((String)"chromium", (int)2)) break block9;
                        n2 = -2;
                        break block10;
                    }
                    if (!Log.isLoggable((String)"chromium", (int)3)) break block11;
                    n2 = -1;
                }
                N.Mrxu2pQS(n2);
            }
            b.open();
            g = true;
            return true;
        }
    }

    public static bzo c() {
        c.block();
        return e;
    }

    private static void ensureInitializedFromNative() {
        CronetLibraryLoader.b(jjj.c, null, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] getBaseFeatureOverrides() {
        Object object;
        Object object2;
        Object object3 = CronetLibraryLoader.c();
        hya hya2 = new HashMap();
        for (Map.Entry entry : ((bzo)object3).aa().entrySet()) {
            try {
                boolean bl2;
                int n2;
                object3 = (String)entry.getKey();
                Object object4 = (bzo)entry.getValue();
                if (!((String)object3).startsWith("ChromiumBaseFeature_")) {
                    object3 = null;
                } else {
                    object2 = ((String)object3).substring(20);
                    object3 = new kpy();
                    n2 = ((String)object2).indexOf("_PARAM_");
                    if (n2 < 0) {
                        ((kpy)object3).a = object2;
                    } else {
                        ((kpy)object3).a = ((String)object2).substring(0, n2);
                        ((kpy)object3).b = ((String)object2).substring(n2 + 7);
                    }
                }
                if (object3 == null) continue;
                object2 = object = (hwp)hya2.get(((kpy)object3).a);
                if (object == null) {
                    object2 = kqa.DEFAULT_INSTANCE.l();
                    hya2.put(((kpy)object3).a, object2);
                }
                if ((object = ((kpy)object3).b) == null) {
                    n2 = ((bzo)object4).ah();
                    if (n2 != 1) {
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("HTTP flag has type ");
                        ((StringBuilder)object3).append((Object)jjj.Z(n2));
                        ((StringBuilder)object3).append(", but only boolean flags are supported as base::Feature overrides");
                        object2 = new IllegalArgumentException(((StringBuilder)object3).toString());
                        throw object2;
                    }
                    bl2 = ((bzo)object4).ag();
                    if (!((hwp)object2).b.B()) {
                        ((hwp)object2).u();
                    }
                    object3 = (kqa)((hwp)object2).b;
                    n2 = kqa.ENABLED_FIELD_NUMBER;
                    ((kqa)object3).bitField0_ |= 1;
                    ((kqa)object3).enabled_ = bl2;
                    continue;
                }
                n2 = ((bzo)object4).ah() - 1;
                if (n2 != 0) {
                    object3 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? ((bzo)object4).ae() : hvu.r(((bzo)object4).af(), StandardCharsets.UTF_8)) : hvu.r(Float.toString(((bzo)object4).ac()), StandardCharsets.UTF_8)) : hvu.r(Long.toString(((bzo)object4).ad(), 10), StandardCharsets.UTF_8);
                } else {
                    bl2 = ((bzo)object4).ag();
                    object3 = "true";
                    if (!bl2) {
                        object3 = "false";
                    }
                    object3 = hvu.r((String)object3, StandardCharsets.UTF_8);
                }
                object3.getClass();
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object2 = (kqa)((hwp)object2).b;
                n2 = kqa.ENABLED_FIELD_NUMBER;
                object4 = ((kqa)object2).params_;
                if (!((hya)object4).b) {
                    ((kqa)object2).params_ = ((hya)object4).a();
                }
                ((kqa)object2).params_.put(object, object3);
            }
            catch (RuntimeException runtimeException) {
                object = (String)entry.getKey();
                object2 = new StringBuilder("Could not parse HTTP flag `");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("` as a base::Feature override");
                throw new IllegalArgumentException(((StringBuilder)object2).toString(), runtimeException);
            }
        }
        object3 = kqc.DEFAULT_INSTANCE.l();
        object2 = hya2.entrySet().iterator();
        while (object2.hasNext()) {
            Map.Entry entry = object2.next();
            object = (String)entry.getKey();
            kqa kqa2 = (kqa)((hwp)entry.getValue()).o();
            object.getClass();
            kqa2.getClass();
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            kqc kqc2 = (kqc)((hwp)object3).b;
            hya2 = kqc2.featureStates_;
            if (!hya2.b) {
                kqc2.featureStates_ = hya2.a();
            }
            kqc2.featureStates_.put(object, kqa2);
        }
        return ((kqc)((hwp)object3).o()).g();
    }

    private static String getDefaultUserAgent() {
        return ksd.a(jjj.c);
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int n2) {
        jjj.ad(a, a.af(n2, "Setting network thread priority to "), new Object[0]);
        Process.setThreadPriority((int)n2);
    }
}

