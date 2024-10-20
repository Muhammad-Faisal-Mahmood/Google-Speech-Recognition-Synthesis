/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 */
package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class DiagnosticsWorker
extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        jse.e(context, "context");
        jse.e(workerParameters, "parameters");
        super(context, workerParameters);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final AmbientLifecycleObserverKt c() {
        void var63_4;
        Cursor cursor;
        Object object;
        block8: {
            ArrayList<bhd> arrayList;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            Object object2 = bdn.i(this.a);
            object = ((bdn)object2).d;
            jse.d(object, "workManager.workDatabase");
            bhe bhe2 = ((WorkDatabase)object).z();
            bgt bgt2 = ((WorkDatabase)object).x();
            bhx bhx2 = ((WorkDatabase)object).A();
            bgn bgn2 = ((WorkDatabase)object).w();
            object2 = ((bdn)object2).c.p;
            long l2 = System.currentTimeMillis();
            long l3 = TimeUnit.DAYS.toMillis(1L);
            object = auo.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
            ((auo)object).e(1, l2 - l3);
            object2 = (bhw)bhe2;
            ((bhw)object2).a.j();
            cursor = wf.i(((bhw)object2).a, (awr)object, false);
            try {
                n15 = wf.k(cursor, "id");
                n14 = wf.k(cursor, "state");
                n13 = wf.k(cursor, "worker_class_name");
                n12 = wf.k(cursor, "input_merger_class_name");
                n11 = wf.k(cursor, "input");
                n10 = wf.k(cursor, "output");
                n9 = wf.k(cursor, "initial_delay");
                n8 = wf.k(cursor, "interval_duration");
                n7 = wf.k(cursor, "flex_duration");
                n6 = wf.k(cursor, "run_attempt_count");
                n5 = wf.k(cursor, "backoff_policy");
                n4 = wf.k(cursor, "backoff_delay_duration");
                n3 = wf.k(cursor, "last_enqueue_time");
                n2 = wf.k(cursor, "minimum_retention_duration");
            }
            catch (Throwable throwable) {
                // empty catch block
                break block8;
            }
            try {
                int n16 = wf.k(cursor, "schedule_requested_at");
                int n17 = wf.k(cursor, "run_in_foreground");
                int n18 = wf.k(cursor, "out_of_quota_policy");
                int n19 = wf.k(cursor, "period_count");
                int n20 = wf.k(cursor, "generation");
                int n21 = wf.k(cursor, "next_schedule_time_override");
                int n22 = wf.k(cursor, "next_schedule_time_override_generation");
                int n23 = wf.k(cursor, "stop_reason");
                int n24 = wf.k(cursor, "trace_tag");
                int n25 = wf.k(cursor, "required_network_type");
                int n26 = wf.k(cursor, "required_network_request");
                int n27 = wf.k(cursor, "requires_charging");
                int n28 = wf.k(cursor, "requires_device_idle");
                int n29 = wf.k(cursor, "requires_battery_not_low");
                int n30 = wf.k(cursor, "requires_storage_not_low");
                int n31 = wf.k(cursor, "trigger_content_update_delay");
                int n32 = wf.k(cursor, "trigger_max_content_delay");
                int n33 = wf.k(cursor, "content_uri_triggers");
                arrayList = new ArrayList<bhd>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.getString(n15);
                    bbv bbv2 = AmbientLifecycleObserverKt.i(cursor.getInt(n14));
                    String string2 = cursor.getString(n13);
                    String string3 = cursor.getString(n12);
                    bas bas2 = bas.a(cursor.getBlob(n11));
                    bas bas3 = bas.a(cursor.getBlob(n10));
                    long l4 = cursor.getLong(n9);
                    long l5 = cursor.getLong(n8);
                    long l6 = cursor.getLong(n7);
                    int n34 = cursor.getInt(n6);
                    bak bak2 = AmbientLifecycleObserverKt.f(cursor.getInt(n5));
                    long l7 = cursor.getLong(n4);
                    long l8 = cursor.getLong(n3);
                    long l9 = cursor.getLong(n2);
                    l2 = cursor.getLong(n16);
                    boolean bl2 = cursor.getInt(n17) != 0;
                    bbr bbr2 = AmbientLifecycleObserverKt.h(cursor.getInt(n18));
                    int n35 = cursor.getInt(n19);
                    int n36 = cursor.getInt(n20);
                    long l10 = cursor.getLong(n21);
                    int n37 = cursor.getInt(n22);
                    int n38 = cursor.getInt(n23);
                    object2 = cursor.isNull(n24) ? null : cursor.getString(n24);
                    bbj bbj2 = AmbientLifecycleObserverKt.g(cursor.getInt(n25));
                    bid bid2 = AmbientLifecycleObserverKt.j(cursor.getBlob(n26));
                    boolean bl3 = cursor.getInt(n27) != 0;
                    boolean bl4 = cursor.getInt(n28) != 0;
                    boolean bl5 = cursor.getInt(n29) != 0;
                    boolean bl6 = cursor.getInt(n30) != 0;
                    long l11 = cursor.getLong(n31);
                    l3 = cursor.getLong(n32);
                    Set set = AmbientLifecycleObserverKt.k(cursor.getBlob(n33));
                    baq baq2 = new baq(bid2, bbj2, bl3, bl4, bl5, bl6, l11, l3, set);
                    bhd bhd2 = new bhd(string, bbv2, string2, string3, bas2, bas3, l4, l5, l6, baq2, n34, bak2, l7, l8, l9, l2, bl2, bbr2, n35, n36, l10, n37, n38, (String)object2);
                    arrayList.add(bhd2);
                }
            }
            catch (Throwable throwable) {
                break block8;
            }
            cursor.close();
            ((auo)object).j();
            object2 = bhe2.c();
            object = bhe2.k();
            if (!arrayList.isEmpty()) {
                bbi.a().e(bjd.a, "Recently completed work:\n\n");
                bbi.a().e(bjd.a, bjd.a(bgt2, bhx2, bgn2, arrayList));
            }
            if (!object2.isEmpty()) {
                bbi.a().e(bjd.a, "Running work:\n\n");
                bbi.a().e(bjd.a, bjd.a(bgt2, bhx2, bgn2, (List)object2));
            }
            if (!object.isEmpty()) {
                bbi.a().e(bjd.a, "Enqueued work:\n\n");
                bbi.a().e(bjd.a, bjd.a(bgt2, bhx2, bgn2, (List)object));
            }
            return new bbg();
        }
        cursor.close();
        ((auo)object).j();
        throw var63_4;
    }
}

