/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$-CC
 */
package androidx.wear.ambient;

import android.app.Activity;
import android.os.Bundle;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import androidx.work.impl.WorkDatabase;
import com.android.car.ui.core.BaseLayoutController;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class AmbientMode$AmbientCallback {
    public AmbientMode$AmbientCallback() {
    }

    public AmbientMode$AmbientCallback(byte[] byArray) {
    }

    public static final bas a(Map object) {
        object = new bas((Map)object);
        AmbientModeSupport$AmbientCallback.a((bas)object);
        return object;
    }

    public static final void b(bas bas2, Map map) {
        jse.e(bas2, "data");
        bas bas3 = bas.a;
        AmbientMode$AmbientCallback.c(bas2.b, map);
    }

    /*
     * WARNING - void declaration
     */
    public static final void c(Map object2, Map map) {
        for (Map.Entry entry : object2.entrySet()) {
            void var0_38;
            void var1_39;
            String string = (String)entry.getKey();
            Object object = entry.getValue();
            jse.e(string, "key");
            if (object == null) {
                Object var0_3 = null;
            } else {
                int n2 = jsk.a;
                Object object3 = new jrz(object.getClass());
                Object v2 = object;
                if (!jse.i(object3, new jrz(Boolean.TYPE))) {
                    Object v3 = object;
                    if (!jse.i(object3, new jrz(Byte.TYPE))) {
                        Object v4 = object;
                        if (!jse.i(object3, new jrz(Integer.TYPE))) {
                            Object v5 = object;
                            if (!jse.i(object3, new jrz(Long.TYPE))) {
                                Object v6 = object;
                                if (!jse.i(object3, new jrz(Float.TYPE))) {
                                    Object v7 = object;
                                    if (!jse.i(object3, new jrz(Double.TYPE))) {
                                        Object v8 = object;
                                        if (!jse.i(object3, new jrz(String.class))) {
                                            Object v9 = object;
                                            if (!jse.i(object3, new jrz(Boolean[].class))) {
                                                Object v10 = object;
                                                if (!jse.i(object3, new jrz(Byte[].class))) {
                                                    Object v11 = object;
                                                    if (!jse.i(object3, new jrz(Integer[].class))) {
                                                        Object v12 = object;
                                                        if (!jse.i(object3, new jrz(Long[].class))) {
                                                            Object v13 = object;
                                                            if (!jse.i(object3, new jrz(Float[].class))) {
                                                                Object v14 = object;
                                                                if (!jse.i(object3, new jrz(Double[].class))) {
                                                                    Object v15 = object;
                                                                    if (!jse.i(object3, new jrz(String[].class))) {
                                                                        boolean bl2 = jse.i(object3, new jrz(boolean[].class));
                                                                        int n3 = 0;
                                                                        int n4 = 0;
                                                                        int n5 = 0;
                                                                        int n6 = 0;
                                                                        int n7 = 0;
                                                                        n2 = 0;
                                                                        if (bl2) {
                                                                            object3 = (boolean[])object;
                                                                            n7 = ((Object)object3).length;
                                                                            String string2 = bat.a;
                                                                            object = new Boolean[n7];
                                                                            while (true) {
                                                                                Object object4 = object;
                                                                                if (n2 < n7) {
                                                                                    object[n2] = (boolean)object3[n2];
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else if (jse.i(object3, new jrz(byte[].class))) {
                                                                            object3 = (byte[])object;
                                                                            n7 = ((Object)object3).length;
                                                                            String string3 = bat.a;
                                                                            object = new Byte[n7];
                                                                            n2 = n3;
                                                                            while (true) {
                                                                                Object object5 = object;
                                                                                if (n2 < n7) {
                                                                                    object[n2] = (byte)object3[n2];
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else if (jse.i(object3, new jrz(int[].class))) {
                                                                            object3 = (int[])object;
                                                                            n7 = ((Object)object3).length;
                                                                            String string4 = bat.a;
                                                                            object = new Integer[n7];
                                                                            n2 = n4;
                                                                            while (true) {
                                                                                Object object6 = object;
                                                                                if (n2 < n7) {
                                                                                    object[n2] = (int)object3[n2];
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else if (jse.i(object3, new jrz(long[].class))) {
                                                                            object3 = (long[])object;
                                                                            n7 = ((Object)object3).length;
                                                                            String string5 = bat.a;
                                                                            object = new Long[n7];
                                                                            n2 = n5;
                                                                            while (true) {
                                                                                Object object7 = object;
                                                                                if (n2 < n7) {
                                                                                    object[n2] = (long)object3[n2];
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else if (jse.i(object3, new jrz(float[].class))) {
                                                                            object3 = (float[])object;
                                                                            n7 = ((Object)object3).length;
                                                                            String string6 = bat.a;
                                                                            object = new Float[n7];
                                                                            n2 = n6;
                                                                            while (true) {
                                                                                Object object8 = object;
                                                                                if (n2 < n7) {
                                                                                    object[n2] = Float.valueOf((float)object3[n2]);
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else if (jse.i(object3, new jrz(double[].class))) {
                                                                            object3 = (double[])object;
                                                                            n6 = ((Object)object3).length;
                                                                            String string7 = bat.a;
                                                                            object = new Double[n6];
                                                                            n2 = n7;
                                                                            while (true) {
                                                                                Object object9 = object;
                                                                                if (n2 < n6) {
                                                                                    object[n2] = (double)object3[n2];
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            StringBuilder stringBuilder = new StringBuilder("Key ");
                                                                            stringBuilder.append(string);
                                                                            stringBuilder.append(" has invalid type ");
                                                                            stringBuilder.append(object3);
                                                                            throw new IllegalArgumentException(stringBuilder.toString());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var1_39.put(string, var0_38);
        }
    }

    public static final void d(String string, String string2, Map map) {
        map.put(string, string2);
    }

    public static final bbp e(AmbientLifecycleObserver$AmbientLifecycleCallback.-CC -CC2, String string, Executor executor, jqz jqz2) {
        jse.e(executor, "executor");
        return new bbq(kl.o(new cvd(executor, -CC2, string, jqz2, new abo(bbp.b), 1)));
    }

    public static bnq f(Activity object) {
        if ((object = BaseLayoutController.getBaseLayoutController((Activity)object)) != null) {
            return ((BaseLayoutController)object).getToolbarController();
        }
        return null;
    }

    public static bnq g(Activity activity) {
        bnq bnq2 = AmbientMode$AmbientCallback.f(activity);
        if (bnq2 != null) {
            return bnq2;
        }
        throw new IllegalArgumentException(a.ar(activity, "Activity ", " does not have a CarUi Toolbar! Are you using Theme.CarUi.WithToolbar?"));
    }

    public static final int h(WorkDatabase workDatabase, String string) {
        Long l2 = workDatabase.u().a(string);
        int n2 = 0;
        int n3 = l2 != null ? (int)l2.longValue() : 0;
        if (n3 != Integer.MAX_VALUE) {
            n2 = n3 + 1;
        }
        AmbientMode$AmbientCallback.i(workDatabase, string, n2);
        return n3;
    }

    public static final void i(WorkDatabase workDatabase, String string, int n2) {
        long l2 = n2;
        workDatabase.u().b(new bgf(string, l2));
    }

    public static final bhd j(List object, bhd bhd2) {
        jse.e(object, "schedulers");
        jse.e(bhd2, "workSpec");
        jse.e(bhd2, "workSpec");
        boolean bl2 = bhd2.f.d("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean bl3 = bhd2.f.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean bl4 = bhd2.f.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (!bl2 && bl3 && bl4) {
            object = bhd2.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AmbientMode$AmbientCallback.b(bhd2.f, linkedHashMap);
            AmbientMode$AmbientCallback.d("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", (String)object, linkedHashMap);
            return bhd.e(bhd2, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", AmbientMode$AmbientCallback.a(linkedHashMap), 0, 0L, 0, 0, 0L, 0, 0xFFFFEB);
        }
        return bhd2;
    }

    public static final bbp k(UUID uUID, bdn bdn2) {
        jse.e(uUID, "id");
        AmbientLifecycleObserver$AmbientLifecycleCallback.-CC -CC2 = bdn2.c.o;
        Object object = bdn2.k.a;
        jse.d(object, "workManagerImpl.workTask\u2026ecutor.serialTaskExecutor");
        return AmbientMode$AmbientCallback.e(-CC2, "CancelWorkById", (Executor)object, new bfb(bdn2, uUID, 2, null));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void l(bdn iterator, String string) {
        Object object = ((bdn)((Object)iterator)).d;
        jse.d(object, "workManagerImpl.workDatabase");
        Object object2 = ((WorkDatabase)object).z();
        bgc bgc2 = ((WorkDatabase)object).t();
        List list = jns.g(string);
        while (!list.isEmpty()) {
            String string2 = (String)jns.k(list);
            object = object2.a(string2);
            if (object != bbv.c && object != bbv.d) {
                object = (bhw)object2;
                ((bhw)object).a.j();
                axc axc2 = ((bhw)object).d.d();
                axc2.g(1, string2);
                ((bhw)object2).a.k();
                {
                    catch (Throwable throwable) {
                        throw throwable;
                    }
                }
                try {
                    axc2.a();
                    ((bhw)object2).a.n();
                }
                catch (Throwable throwable) {
                    ((bhw)object2).a.l();
                    throw throwable;
                }
                try {
                    ((bhw)object2).a.l();
                }
                finally {
                    ((bhw)object).d.f(axc2);
                }
            }
            list.addAll(bgc2.a(string2));
        }
        object = ((bdn)((Object)iterator)).f;
        jse.d(object, "workManagerImpl.processor");
        object2 = ((bcn)object).j;
        synchronized (object2) {
            bbi.a();
            ((bcn)object).h.add(string);
            object = ((bcn)object).d(string);
        }
        bcn.f((dhl)object, 1);
        iterator = ((bdn)((Object)iterator)).e.iterator();
        while (iterator.hasNext()) {
            ((bcp)iterator.next()).b(string);
        }
    }

    public static final void m(String string, bdn bdn2) {
        jse.e(string, "name");
        WorkDatabase workDatabase = bdn2.d;
        jse.d(workDatabase, "workManagerImpl.workDatabase");
        workDatabase.m(new ai((Object)workDatabase, (Object)string, (Object)bdn2, 9, null));
    }

    public static final void n(bdn bdn2) {
        bcr.a(bdn2.c, bdn2.d, bdn2.e);
    }

    public final void onAmbientOffloadInvalidated() {
    }

    public final void onEnterAmbient(Bundle bundle) {
    }

    public final void onExitAmbient() {
    }

    public final void onUpdateAmbient() {
    }
}

