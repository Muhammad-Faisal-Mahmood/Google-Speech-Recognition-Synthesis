/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class bih
extends jsf
implements jrk {
    final bzb a;

    public bih(bzb bzb2) {
        this.a = bzb2;
        super(1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object a(Object object) {
        Object object2;
        long l2;
        long l3;
        boolean bl2;
        Object object3;
        Object object4;
        Cloneable cloneable;
        int n2;
        int n3;
        int n4;
        int n5;
        object = (WorkDatabase)object;
        jse.e(object, "db");
        Object object5 = bhd.a;
        object = ((WorkDatabase)object).v();
        Object object6 = new ArrayList();
        object5 = new StringBuilder("SELECT * FROM workspec");
        bzb bzb2 = this.a;
        if (!bzb2.a.isEmpty()) {
            ((StringBuilder)object5).append(" WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            n5 = bzb2.a.size();
            if (n5 > 0) {
                ArrayList<String> arrayList = new ArrayList<String>(n5);
                for (n4 = 0; n4 < n5; ++n4) {
                    arrayList.add("?");
                }
                ((StringBuilder)object5).append(jns.D(arrayList, ",", null, null, null, 62));
            }
            ((StringBuilder)object5).append("))");
            object6.addAll(bzb2.a);
        }
        ((StringBuilder)object5).append(";");
        object6 = new awk(((StringBuilder)object5).toString(), object6.toArray(new Object[0]));
        object5 = (bgl)object;
        ((bgl)object5).a.j();
        Cursor cursor = wf.i(((bgl)object5).a, (awr)object6, true);
        try {
            int n6 = wf.j(cursor, "id");
            int n7 = wf.j(cursor, "state");
            int n8 = wf.j(cursor, "output");
            int n9 = wf.j(cursor, "initial_delay");
            int n10 = wf.j(cursor, "interval_duration");
            int n11 = wf.j(cursor, "flex_duration");
            int n12 = wf.j(cursor, "run_attempt_count");
            int n13 = wf.j(cursor, "backoff_policy");
            int n14 = wf.j(cursor, "backoff_delay_duration");
            int n15 = wf.j(cursor, "last_enqueue_time");
            n4 = wf.j(cursor, "period_count");
            n5 = wf.j(cursor, "generation");
            int n16 = wf.j(cursor, "next_schedule_time_override");
            int n17 = wf.j(cursor, "stop_reason");
            int n18 = wf.j(cursor, "required_network_type");
            int n19 = wf.j(cursor, "required_network_request");
            int n20 = wf.j(cursor, "requires_charging");
            int n21 = wf.j(cursor, "requires_device_idle");
            n3 = wf.j(cursor, "requires_battery_not_low");
            n2 = wf.j(cursor, "requires_storage_not_low");
            int n22 = wf.j(cursor, "trigger_content_update_delay");
            int n23 = wf.j(cursor, "trigger_max_content_delay");
            int n24 = wf.j(cursor, "content_uri_triggers");
            cloneable = new HashMap();
            object4 = new HashMap();
            while (cursor.moveToNext()) {
                object6 = cursor.getString(n6);
                if (!((HashMap)cloneable).containsKey(object6)) {
                    object5 = new ArrayList();
                    ((HashMap)cloneable).put(object6, object5);
                }
                if (((HashMap)object4).containsKey(object5 = cursor.getString(n6))) continue;
                object6 = new ArrayList();
                ((HashMap)object4).put(object5, object6);
            }
            cursor.moveToPosition(-1);
            ((bgl)object).b((HashMap)cloneable);
            ((bgl)object).a((HashMap)object4);
            object3 = new ArrayList(cursor.getCount());
            int n25 = n4;
            int n26 = n5;
            n4 = n23;
            n5 = n22;
            while (true) {
                void var51_9;
                void var54_70;
                void var52_18;
                bl2 = cursor.moveToNext();
                Object var54_69 = null;
                long l4 = 0L;
                if (!bl2) break;
                object = n6 == -1 ? null : cursor.getString(n6);
                object5 = n7 == -1 ? null : AmbientLifecycleObserverKt.i(cursor.getInt(n7));
                object6 = n8 == -1 ? null : bas.a(cursor.getBlob(n8));
                l3 = n9 == -1 ? 0L : cursor.getLong(n9);
                l2 = n10 == -1 ? 0L : cursor.getLong(n10);
                long l5 = n11 == -1 ? 0L : cursor.getLong(n11);
                n22 = n12 == -1 ? 0 : cursor.getInt(n12);
                if (n13 == -1) {
                    Object var51_7 = null;
                } else {
                    bak bak2 = AmbientLifecycleObserverKt.f(cursor.getInt(n13));
                }
                long l6 = n14 == -1 ? 0L : cursor.getLong(n14);
                long l7 = n15 == -1 ? 0L : cursor.getLong(n15);
                n23 = n25 == -1 ? 0 : cursor.getInt(n25);
                int n27 = n26 == -1 ? 0 : cursor.getInt(n26);
                long l8 = n16 == -1 ? 0L : cursor.getLong(n16);
                int n28 = n17 == -1 ? 0 : cursor.getInt(n17);
                if (n18 == -1) {
                    Object var52_17 = null;
                } else {
                    bbj bbj2 = AmbientLifecycleObserverKt.g(cursor.getInt(n18));
                }
                object2 = n19 == -1 ? null : AmbientLifecycleObserverKt.j(cursor.getBlob(n19));
                bl2 = n20 != -1 && cursor.getInt(n20) != 0;
                boolean bl3 = n21 != -1 && cursor.getInt(n21) != 0;
                boolean bl4 = n3 != -1 && cursor.getInt(n3) != 0;
                boolean bl5 = n2 != -1 && cursor.getInt(n2) != 0;
                long l9 = n5 == -1 ? 0L : cursor.getLong(n5);
                if (n4 != -1) {
                    l4 = cursor.getLong(n4);
                }
                if (n24 != -1) {
                    Set set = AmbientLifecycleObserverKt.k(cursor.getBlob(n24));
                }
                baq baq2 = new baq((bid)object2, (bbj)var52_18, bl2, bl3, bl4, bl5, l9, l4, (Set)var54_70);
                ArrayList arrayList = (ArrayList)((HashMap)cloneable).get(cursor.getString(n6));
                object2 = (ArrayList)((HashMap)object4).get(cursor.getString(n6));
                bhc bhc2 = new bhc((String)object, (bbv)((Object)object5), (bas)object6, l3, l2, l5, baq2, n22, (bak)var51_9, l6, l7, n23, n27, l8, n28, arrayList, (List)object2);
                object3.add(bhc2);
            }
            object5 = new ArrayList(jns.B(object3));
            object = object3.iterator();
        }
        finally {
            cursor.close();
        }
        while (true) {
            void var51_13;
            if (!object.hasNext()) {
                jse.d(object5, "WORK_INFO_MAPPER.apply(d\u2026(querySpec.toRawQuery()))");
                return object5;
            }
            bhc bhc3 = (bhc)object.next();
            object6 = !bhc3.q.isEmpty() ? (bas)bhc3.q.get(0) : bas.a;
            UUID uUID = UUID.fromString(bhc3.a);
            jse.d(uUID, "fromString(id)");
            bbv bbv2 = bhc3.b;
            cloneable = new HashSet(bhc3.p);
            object2 = bhc3.c;
            n2 = bhc3.h;
            n3 = bhc3.m;
            object4 = bhc3.g;
            l2 = bhc3.d;
            l3 = bhc3.e;
            long l10 = l3 - 0L;
            n5 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
            n4 = n5 != 0 ? 0 : 1;
            if (n5 != 0) {
                bbu bbu2 = new bbu(l3, bhc3.f);
            } else {
                Object var51_12 = null;
            }
            object3 = bhc3.b;
            bbv bbv3 = bbv.a;
            if (object3 == bbv3) {
                bl2 = object3 == bbv3 && n2 > 0;
                l3 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.c(bl2, n2, bhc3.i, bhc3.j, bhc3.k, bhc3.l, (n4 ^ 1) != 0, l2, bhc3.f, l3, bhc3.n);
            } else {
                l3 = Long.MAX_VALUE;
            }
            object5.add(new bbw(uUID, bbv2, (Set)((Object)cloneable), (bas)object2, (bas)object6, n2, n3, (baq)object4, l2, (bbu)var51_13, l3, bhc3.o));
        }
    }
}

