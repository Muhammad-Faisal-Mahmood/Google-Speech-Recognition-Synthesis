/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package org.chromium.base.task;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.base.ThreadUtils;

public class PostTask {
    public static final Object a;
    public static List b;
    public static knq c;
    public static volatile Executor d;
    private static volatile boolean e;
    private static final knr[] f;

    static {
        knt knt2;
        int n2;
        a = new Object();
        b = new ArrayList();
        c = new knq();
        f = new knr[9];
        for (n2 = 0; n2 <= 5; ++n2) {
            knt2 = new knt(n2);
            PostTask.f[n2] = knt2;
        }
        for (n2 = 6; n2 <= 8; ++n2) {
            knt2 = new knu(n2);
            PostTask.f[n2] = knt2;
        }
    }

    public static void a(int n2, Runnable runnable) {
        f[n2].a(runnable);
    }

    public static void b(Runnable runnable) {
        knu knu2 = (knu)f[7];
        if (ThreadUtils.a().getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        PostTask.a(7, runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void onNativeSchedulerReady() {
        List list;
        if (e) {
            return;
        }
        e = true;
        Iterator iterator = a;
        synchronized (iterator) {
            list = b;
            b = null;
        }
        iterator = list.iterator();
        while (iterator.hasNext()) {
            ((knt)iterator.next()).b();
        }
    }
}

