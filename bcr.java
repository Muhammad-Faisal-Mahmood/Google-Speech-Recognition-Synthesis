/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bcr {
    public static final int a = 0;

    static {
        bbi.b("Schedulers");
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive exception aggregation
     */
    public static void a(bam object, WorkDatabase iterator, List object2) {
        block23: {
            bcp bcp2;
            if (bcp2 != null && bcp2.size() != 0) {
                Cursor cursor;
                auo auo2;
                Iterator iterator2;
                block21: {
                    block20: {
                        Object object3;
                        Object object4;
                        long l2;
                        long l3;
                        boolean bl2;
                        boolean bl3;
                        boolean bl4;
                        boolean bl5;
                        Object object5;
                        Object object6;
                        Object object7;
                        int n2;
                        int n3;
                        long l4;
                        int n4;
                        int n5;
                        Enum enum_;
                        boolean bl6;
                        long l5;
                        long l6;
                        long l7;
                        long l8;
                        Object object8;
                        int n6;
                        long l9;
                        long l10;
                        long l11;
                        ArrayList<Object> arrayList;
                        Object object9;
                        String string;
                        String string2;
                        Object object10;
                        Object object11;
                        bhe bhe2 = ((WorkDatabase)((Object)iterator2)).z();
                        ((aum)((Object)iterator2)).k();
                        auo2 = auo.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
                        ((bhw)bhe2).a.j();
                        cursor = wf.i(((bhw)bhe2).a, auo2, false);
                        int n7 = wf.k(cursor, "id");
                        int n8 = wf.k(cursor, "state");
                        int n9 = wf.k(cursor, "worker_class_name");
                        int n10 = wf.k(cursor, "input_merger_class_name");
                        int n11 = wf.k(cursor, "input");
                        int n12 = wf.k(cursor, "output");
                        int n13 = wf.k(cursor, "initial_delay");
                        int n14 = wf.k(cursor, "interval_duration");
                        int n15 = wf.k(cursor, "flex_duration");
                        int n16 = wf.k(cursor, "run_attempt_count");
                        int n17 = wf.k(cursor, "backoff_policy");
                        int n18 = wf.k(cursor, "backoff_delay_duration");
                        int n19 = wf.k(cursor, "last_enqueue_time");
                        int n20 = wf.k(cursor, "minimum_retention_duration");
                        int n21 = wf.k(cursor, "schedule_requested_at");
                        int n22 = wf.k(cursor, "run_in_foreground");
                        int n23 = wf.k(cursor, "out_of_quota_policy");
                        int n24 = wf.k(cursor, "period_count");
                        int n25 = wf.k(cursor, "generation");
                        int n26 = wf.k(cursor, "next_schedule_time_override");
                        int n27 = wf.k(cursor, "next_schedule_time_override_generation");
                        int n28 = wf.k(cursor, "stop_reason");
                        int n29 = wf.k(cursor, "trace_tag");
                        int n30 = wf.k(cursor, "required_network_type");
                        int n31 = wf.k(cursor, "required_network_request");
                        int n32 = wf.k(cursor, "requires_charging");
                        int n33 = wf.k(cursor, "requires_device_idle");
                        int n34 = wf.k(cursor, "requires_battery_not_low");
                        int n35 = wf.k(cursor, "requires_storage_not_low");
                        int n36 = wf.k(cursor, "trigger_content_update_delay");
                        int n37 = wf.k(cursor, "trigger_max_content_delay");
                        int n38 = wf.k(cursor, "content_uri_triggers");
                        Object object12 = new ArrayList(cursor.getCount());
                        while (cursor.moveToNext()) {
                            object11 = cursor.getString(n7);
                            object10 = AmbientLifecycleObserverKt.i(cursor.getInt(n8));
                            string2 = cursor.getString(n9);
                            string = cursor.getString(n10);
                            object9 = bas.a(cursor.getBlob(n11));
                            arrayList = bas.a(cursor.getBlob(n12));
                            l11 = cursor.getLong(n13);
                            l10 = cursor.getLong(n14);
                            l9 = cursor.getLong(n15);
                            n6 = cursor.getInt(n16);
                            object8 = AmbientLifecycleObserverKt.f(cursor.getInt(n17));
                            l8 = cursor.getLong(n18);
                            l7 = cursor.getLong(n19);
                            l6 = cursor.getLong(n20);
                            l5 = cursor.getLong(n21);
                            bl6 = cursor.getInt(n22) != 0;
                            enum_ = AmbientLifecycleObserverKt.h(cursor.getInt(n23));
                            n5 = cursor.getInt(n24);
                            n4 = cursor.getInt(n25);
                            l4 = cursor.getLong(n26);
                            n3 = cursor.getInt(n27);
                            n2 = cursor.getInt(n28);
                            object7 = cursor.isNull(n29) ? null : cursor.getString(n29);
                            object6 = AmbientLifecycleObserverKt.g(cursor.getInt(n30));
                            object5 = AmbientLifecycleObserverKt.j(cursor.getBlob(n31));
                            bl5 = cursor.getInt(n32) != 0;
                            bl4 = cursor.getInt(n33) != 0;
                            bl3 = cursor.getInt(n34) != 0;
                            bl2 = cursor.getInt(n35) != 0;
                            l3 = cursor.getLong(n36);
                            l2 = cursor.getLong(n37);
                            object4 = AmbientLifecycleObserverKt.k(cursor.getBlob(n38));
                            object3 = new baq((bid)object5, (bbj)((Object)object6), bl5, bl4, bl3, bl2, l3, l2, (Set)object4);
                            object6 = new bhd((String)object11, (bbv)((Object)object10), string2, string, (bas)object9, (bas)((Object)arrayList), l11, l10, l9, (baq)object3, n6, (bak)((Object)object8), l8, l7, l6, l5, bl6, (bbr)enum_, n5, n4, l4, n3, n2, (String)object7);
                            object12.add(object6);
                        }
                        cursor.close();
                        auo2.j();
                        object7 = ((bam)object).p;
                        bcr.b(bhe2, object12);
                        n38 = ((bam)object).m;
                        auo2 = auo.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                        auo2.e(1, n38);
                        ((bhw)bhe2).a.j();
                        cursor = wf.i(((bhw)bhe2).a, auo2, false);
                        n14 = wf.k(cursor, "id");
                        n18 = wf.k(cursor, "state");
                        n7 = wf.k(cursor, "worker_class_name");
                        n17 = wf.k(cursor, "input_merger_class_name");
                        n15 = wf.k(cursor, "input");
                        n19 = wf.k(cursor, "output");
                        n10 = wf.k(cursor, "initial_delay");
                        n23 = wf.k(cursor, "interval_duration");
                        n16 = wf.k(cursor, "flex_duration");
                        n13 = wf.k(cursor, "run_attempt_count");
                        n22 = wf.k(cursor, "backoff_policy");
                        n8 = wf.k(cursor, "backoff_delay_duration");
                        n9 = wf.k(cursor, "last_enqueue_time");
                        n24 = wf.k(cursor, "minimum_retention_duration");
                        n25 = wf.k(cursor, "schedule_requested_at");
                        n12 = wf.k(cursor, "run_in_foreground");
                        n11 = wf.k(cursor, "out_of_quota_policy");
                        n26 = wf.k(cursor, "period_count");
                        n27 = wf.k(cursor, "generation");
                        n20 = wf.k(cursor, "next_schedule_time_override");
                        n28 = wf.k(cursor, "next_schedule_time_override_generation");
                        n21 = wf.k(cursor, "stop_reason");
                        n29 = wf.k(cursor, "trace_tag");
                        n30 = wf.k(cursor, "required_network_type");
                        n31 = wf.k(cursor, "required_network_request");
                        n32 = wf.k(cursor, "requires_charging");
                        n33 = wf.k(cursor, "requires_device_idle");
                        n34 = wf.k(cursor, "requires_battery_not_low");
                        n35 = wf.k(cursor, "requires_storage_not_low");
                        n36 = wf.k(cursor, "trigger_content_update_delay");
                        n37 = wf.k(cursor, "trigger_max_content_delay");
                        n38 = wf.k(cursor, "content_uri_triggers");
                        arrayList = new ArrayList<Object>(cursor.getCount());
                        while (cursor.moveToNext()) {
                            string2 = cursor.getString(n14);
                            enum_ = AmbientLifecycleObserverKt.i(cursor.getInt(n18));
                            object8 = cursor.getString(n7);
                            string = cursor.getString(n17);
                            object10 = bas.a(cursor.getBlob(n15));
                            object3 = bas.a(cursor.getBlob(n19));
                            l11 = cursor.getLong(n10);
                            l3 = cursor.getLong(n23);
                            l10 = cursor.getLong(n16);
                            n6 = cursor.getInt(n13);
                            object9 = AmbientLifecycleObserverKt.f(cursor.getInt(n22));
                            l5 = cursor.getLong(n8);
                            l9 = cursor.getLong(n9);
                            l6 = cursor.getLong(n24);
                            l8 = cursor.getLong(n25);
                            bl6 = cursor.getInt(n12) != 0;
                            object11 = AmbientLifecycleObserverKt.h(cursor.getInt(n11));
                            n5 = cursor.getInt(n26);
                            n4 = cursor.getInt(n27);
                            l4 = cursor.getLong(n20);
                            n3 = cursor.getInt(n28);
                            n2 = cursor.getInt(n21);
                            object7 = cursor.isNull(n29) ? null : cursor.getString(n29);
                            object4 = AmbientLifecycleObserverKt.g(cursor.getInt(n30));
                            bid bid2 = AmbientLifecycleObserverKt.j(cursor.getBlob(n31));
                            bl5 = cursor.getInt(n32) != 0;
                            bl4 = cursor.getInt(n33) != 0;
                            bl3 = cursor.getInt(n34) != 0;
                            bl2 = cursor.getInt(n35) != 0;
                            l2 = cursor.getLong(n36);
                            l7 = cursor.getLong(n37);
                            object5 = AmbientLifecycleObserverKt.k(cursor.getBlob(n38));
                            object6 = new baq(bid2, (bbj)((Object)object4), bl5, bl4, bl3, bl2, l2, l7, (Set)object5);
                            object5 = new bhd(string2, (bbv)enum_, (String)object8, string, (bas)object10, (bas)object3, l11, l3, l10, (baq)object6, n6, (bak)((Object)object9), l5, l9, l6, l8, bl6, (bbr)((Object)object11), n5, n4, l4, n3, n2, (String)object7);
                            arrayList.add(object5);
                        }
                        cursor.close();
                        auo2.j();
                        object = ((bam)object).p;
                        bcr.b(bhe2, arrayList);
                        arrayList.addAll((Collection<Object>)object12);
                        object = bhe2.k();
                        ((aum)((Object)iterator2)).n();
                        if (arrayList.size() <= 0) break block20;
                        object7 = arrayList.toArray(new bhd[arrayList.size()]);
                        iterator2 = bcp2.iterator();
                        while (iterator2.hasNext()) {
                            object12 = (bcp)iterator2.next();
                            if (!object12.d()) continue;
                            object12.c((bhd)object7);
                        }
                    }
                    if (object.size() > 0) {
                        object = object.toArray(new bhd[object.size()]);
                        iterator2 = bcp2.iterator();
                        while (iterator2.hasNext()) {
                            bcp2 = (bcp)iterator2.next();
                            if (bcp2.d()) continue;
                            bcp2.c((bhd[])object);
                        }
                    }
                    break block23;
                    catch (Throwable throwable) {
                        break block21;
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                try {
                    void var0_5;
                    block22: {
                        cursor.close();
                        auo2.j();
                        throw object;
                        catch (Throwable throwable) {
                            break block22;
                        }
                        catch (Throwable throwable) {
                            // empty catch block
                        }
                    }
                    cursor.close();
                    auo2.j();
                    throw var0_5;
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                finally {
                    ((aum)((Object)iterator2)).l();
                }
            }
        }
    }

    private static void b(bhe bhe2, List object) {
        if (object.size() > 0) {
            long l2 = System.currentTimeMillis();
            object = object.iterator();
            while (object.hasNext()) {
                bhe2.l(((bhd)object.next()).b, l2);
            }
        }
    }
}

