/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class bhw
implements bhe {
    public final aum a;
    public final atw b;
    public final atv c;
    public final aup d;
    public final aup e;
    public final aup f;
    public final aup g;
    public final aup h;
    private final aup i;
    private final aup j;
    private final aup k;
    private final aup l;
    private final aup m;
    private final aup n;
    private final aup o;

    public bhw(aum aum2) {
        this.a = aum2;
        this.b = new bhn(aum2);
        this.c = new atv(aum2);
        this.i = new bhp(aum2);
        this.j = new bhq(aum2);
        this.d = new bhr(aum2);
        this.e = new bhs(aum2);
        this.k = new bht(aum2);
        this.l = new bhu(aum2);
        this.f = new bhv(aum2);
        this.g = new bhf(aum2);
        new bhg(aum2);
        this.m = new bhh(aum2);
        this.n = new bhi(aum2);
        this.h = new bhj(aum2);
        new bhk(aum2);
        new bhl(aum2);
        this.o = new bhm(aum2);
    }

    @Override
    public final bbv a(String object) {
        Cursor cursor;
        auo auo2;
        block8: {
            Object var3_6;
            block9: {
                auo2 = auo.a("SELECT state FROM workspec WHERE id=?", 1);
                auo2.g(1, (String)object);
                this.a.j();
                cursor = wf.i(this.a, auo2, false);
                boolean bl2 = cursor.moveToFirst();
                var3_6 = null;
                object = var3_6;
                if (!bl2) break block8;
                if (!cursor.isNull(0)) break block9;
                object = null;
            }
            object = cursor.getInt(0);
            if (object == null) {
                object = var3_6;
            } else {
                object = AmbientLifecycleObserverKt.i((Integer)object);
            }
        }
        return object;
        finally {
            cursor.close();
            auo2.j();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bhd b(String object) {
        void var1_4;
        Cursor cursor;
        auo auo2;
        block4: {
            block5: {
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
                auo2 = auo.a("SELECT * FROM workspec WHERE id=?", 1);
                auo2.g(1, (String)object);
                this.a.j();
                cursor = wf.i(this.a, auo2, false);
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
                    break block4;
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
                    boolean bl2 = cursor.moveToFirst();
                    object = null;
                    bid bid2 = null;
                    if (!bl2) break block5;
                    String string = cursor.getString(n15);
                    bbv bbv2 = AmbientLifecycleObserverKt.i(cursor.getInt(n14));
                    String string2 = cursor.getString(n13);
                    String string3 = cursor.getString(n12);
                    bas bas2 = bas.a(cursor.getBlob(n11));
                    bas bas3 = bas.a(cursor.getBlob(n10));
                    long l2 = cursor.getLong(n9);
                    long l3 = cursor.getLong(n8);
                    long l4 = cursor.getLong(n7);
                    n8 = cursor.getInt(n6);
                    bak bak2 = AmbientLifecycleObserverKt.f(cursor.getInt(n5));
                    long l5 = cursor.getLong(n4);
                    long l6 = cursor.getLong(n3);
                    long l7 = cursor.getLong(n2);
                    long l8 = cursor.getLong(n16);
                    bl2 = cursor.getInt(n17) != 0;
                    bbr bbr2 = AmbientLifecycleObserverKt.h(cursor.getInt(n18));
                    n2 = cursor.getInt(n19);
                    n20 = cursor.getInt(n20);
                    long l9 = cursor.getLong(n21);
                    n21 = cursor.getInt(n22);
                    n23 = cursor.getInt(n23);
                    object = cursor.isNull(n24) ? bid2 : cursor.getString(n24);
                    bbj bbj2 = AmbientLifecycleObserverKt.g(cursor.getInt(n25));
                    bid2 = AmbientLifecycleObserverKt.j(cursor.getBlob(n26));
                    boolean bl3 = cursor.getInt(n27) != 0;
                    boolean bl4 = cursor.getInt(n28) != 0;
                    boolean bl5 = cursor.getInt(n29) != 0;
                    boolean bl6 = cursor.getInt(n30) != 0;
                    long l10 = cursor.getLong(n31);
                    long l11 = cursor.getLong(n32);
                    Set set = AmbientLifecycleObserverKt.k(cursor.getBlob(n33));
                    baq baq2 = new baq(bid2, bbj2, bl3, bl4, bl5, bl6, l10, l11, set);
                    object = new bhd(string, bbv2, string2, string3, bas2, bas3, l2, l3, l4, baq2, n8, bak2, l5, l6, l7, l8, bl2, bbr2, n2, n20, l9, n21, n23, (String)object);
                }
                catch (Throwable throwable) {
                    break block4;
                }
            }
            cursor.close();
            auo2.j();
            return object;
        }
        cursor.close();
        auo2.j();
        throw var1_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List c() {
        void var63_4;
        Cursor cursor;
        auo auo2;
        block5: {
            ArrayList<Object> arrayList;
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
            Object object = this.a;
            auo2 = auo.a("SELECT * FROM workspec WHERE state=1", 0);
            ((aum)object).j();
            cursor = wf.i(this.a, auo2, false);
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
                break block5;
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
                arrayList = new ArrayList<Object>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.getString(n15);
                    bbv bbv2 = AmbientLifecycleObserverKt.i(cursor.getInt(n14));
                    String string2 = cursor.getString(n13);
                    String string3 = cursor.getString(n12);
                    bas bas2 = bas.a(cursor.getBlob(n11));
                    bas bas3 = bas.a(cursor.getBlob(n10));
                    long l2 = cursor.getLong(n9);
                    long l3 = cursor.getLong(n8);
                    long l4 = cursor.getLong(n7);
                    int n34 = cursor.getInt(n6);
                    bak bak2 = AmbientLifecycleObserverKt.f(cursor.getInt(n5));
                    long l5 = cursor.getLong(n4);
                    long l6 = cursor.getLong(n3);
                    long l7 = cursor.getLong(n2);
                    long l8 = cursor.getLong(n16);
                    boolean bl2 = cursor.getInt(n17) != 0;
                    bbr bbr2 = AmbientLifecycleObserverKt.h(cursor.getInt(n18));
                    int n35 = cursor.getInt(n19);
                    int n36 = cursor.getInt(n20);
                    long l9 = cursor.getLong(n21);
                    int n37 = cursor.getInt(n22);
                    int n38 = cursor.getInt(n23);
                    object = cursor.isNull(n24) ? null : cursor.getString(n24);
                    bbj bbj2 = AmbientLifecycleObserverKt.g(cursor.getInt(n25));
                    bid bid2 = AmbientLifecycleObserverKt.j(cursor.getBlob(n26));
                    boolean bl3 = cursor.getInt(n27) != 0;
                    boolean bl4 = cursor.getInt(n28) != 0;
                    boolean bl5 = cursor.getInt(n29) != 0;
                    boolean bl6 = cursor.getInt(n30) != 0;
                    long l10 = cursor.getLong(n31);
                    long l11 = cursor.getLong(n32);
                    Object object2 = AmbientLifecycleObserverKt.k(cursor.getBlob(n33));
                    baq baq2 = new baq(bid2, bbj2, bl3, bl4, bl5, bl6, l10, l11, (Set)object2);
                    object2 = new bhd(string, bbv2, string2, string3, bas2, bas3, l2, l3, l4, baq2, n34, bak2, l5, l6, l7, l8, bl2, bbr2, n35, n36, l9, n37, n38, (String)object);
                    arrayList.add(object2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            auo2.j();
            return arrayList;
        }
        cursor.close();
        auo2.j();
        throw var63_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List d() {
        void var63_4;
        Cursor cursor;
        auo auo2;
        block5: {
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
            Object object = this.a;
            auo2 = auo.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
            ((aum)object).j();
            cursor = wf.i(this.a, auo2, false);
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
                break block5;
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
                    long l2 = cursor.getLong(n9);
                    long l3 = cursor.getLong(n8);
                    long l4 = cursor.getLong(n7);
                    int n34 = cursor.getInt(n6);
                    bak bak2 = AmbientLifecycleObserverKt.f(cursor.getInt(n5));
                    long l5 = cursor.getLong(n4);
                    long l6 = cursor.getLong(n3);
                    long l7 = cursor.getLong(n2);
                    long l8 = cursor.getLong(n16);
                    boolean bl2 = cursor.getInt(n17) != 0;
                    bbr bbr2 = AmbientLifecycleObserverKt.h(cursor.getInt(n18));
                    int n35 = cursor.getInt(n19);
                    int n36 = cursor.getInt(n20);
                    long l9 = cursor.getLong(n21);
                    int n37 = cursor.getInt(n22);
                    int n38 = cursor.getInt(n23);
                    object = cursor.isNull(n24) ? null : cursor.getString(n24);
                    bbj bbj2 = AmbientLifecycleObserverKt.g(cursor.getInt(n25));
                    bid bid2 = AmbientLifecycleObserverKt.j(cursor.getBlob(n26));
                    boolean bl3 = cursor.getInt(n27) != 0;
                    boolean bl4 = cursor.getInt(n28) != 0;
                    boolean bl5 = cursor.getInt(n29) != 0;
                    boolean bl6 = cursor.getInt(n30) != 0;
                    long l10 = cursor.getLong(n31);
                    long l11 = cursor.getLong(n32);
                    Set set = AmbientLifecycleObserverKt.k(cursor.getBlob(n33));
                    baq baq2 = new baq(bid2, bbj2, bl3, bl4, bl5, bl6, l10, l11, set);
                    bhd bhd2 = new bhd(string, bbv2, string2, string3, bas2, bas3, l2, l3, l4, baq2, n34, bak2, l5, l6, l7, l8, bl2, bbr2, n35, n36, l9, n37, n38, (String)object);
                    arrayList.add(bhd2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            auo2.j();
            return arrayList;
        }
        cursor.close();
        auo2.j();
        throw var63_4;
    }

    @Override
    public final List e(String string) {
        auo auo2 = auo.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        auo2.g(1, string);
        this.a.j();
        string = wf.i(this.a, auo2, false);
        try {
            ArrayList<bhb> arrayList = new ArrayList<bhb>(string.getCount());
            while (string.moveToNext()) {
                String string2 = string.getString(0);
                bbv bbv2 = AmbientLifecycleObserverKt.i(string.getInt(1));
                bhb bhb2 = new bhb(string2, bbv2);
                arrayList.add(bhb2);
            }
            return arrayList;
        }
        finally {
            string.close();
            auo2.j();
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final void f(String string) {
        this.a.j();
        axc axc2 = this.i.d();
        axc2.g(1, string);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.i.f(axc2);
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final void g(String string, int n2) {
        this.a.j();
        axc axc2 = this.m.d();
        axc2.g(1, string);
        axc2.e(2, n2);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.m.f(axc2);
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final void h(String string, long l2) {
        this.a.j();
        axc axc2 = this.l.d();
        axc2.e(1, l2);
        axc2.g(2, string);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.l.f(axc2);
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final void i(String string, bas bas2) {
        this.a.j();
        axc axc2 = this.k.d();
        axc2.c(1, AmbientModeSupport$AmbientCallback.a(bas2));
        axc2.g(2, string);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.k.f(axc2);
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final void j(String string, int n2) {
        this.a.j();
        long l2 = n2;
        axc axc2 = this.o.d();
        axc2.e(1, l2);
        axc2.g(2, string);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.o.f(axc2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List k() {
        void var63_59;
        Cursor cursor;
        auo auo2;
        block5: {
            ArrayList<Object> arrayList;
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
            auo2 = auo.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
            auo2.e(1, 200L);
            this.a.j();
            cursor = wf.i(this.a, auo2, false);
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
                break block5;
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
                arrayList = new ArrayList<Object>(cursor.getCount());
                while (cursor.moveToNext()) {
                    String string = cursor.getString(n15);
                    bbv bbv2 = AmbientLifecycleObserverKt.i(cursor.getInt(n14));
                    String string2 = cursor.getString(n13);
                    String string3 = cursor.getString(n12);
                    bas bas2 = bas.a(cursor.getBlob(n11));
                    bas bas3 = bas.a(cursor.getBlob(n10));
                    long l2 = cursor.getLong(n9);
                    long l3 = cursor.getLong(n8);
                    long l4 = cursor.getLong(n7);
                    int n34 = cursor.getInt(n6);
                    bak bak2 = AmbientLifecycleObserverKt.f(cursor.getInt(n5));
                    long l5 = cursor.getLong(n4);
                    long l6 = cursor.getLong(n3);
                    long l7 = cursor.getLong(n2);
                    long l8 = cursor.getLong(n16);
                    boolean bl2 = cursor.getInt(n17) != 0;
                    bbr bbr2 = AmbientLifecycleObserverKt.h(cursor.getInt(n18));
                    int n35 = cursor.getInt(n19);
                    int n36 = cursor.getInt(n20);
                    long l9 = cursor.getLong(n21);
                    int n37 = cursor.getInt(n22);
                    int n38 = cursor.getInt(n23);
                    String string4 = cursor.isNull(n24) ? null : cursor.getString(n24);
                    bbj bbj2 = AmbientLifecycleObserverKt.g(cursor.getInt(n25));
                    bid bid2 = AmbientLifecycleObserverKt.j(cursor.getBlob(n26));
                    boolean bl3 = cursor.getInt(n27) != 0;
                    boolean bl4 = cursor.getInt(n28) != 0;
                    boolean bl5 = cursor.getInt(n29) != 0;
                    boolean bl6 = cursor.getInt(n30) != 0;
                    long l10 = cursor.getLong(n31);
                    long l11 = cursor.getLong(n32);
                    Object object = AmbientLifecycleObserverKt.k(cursor.getBlob(n33));
                    baq baq2 = new baq(bid2, bbj2, bl3, bl4, bl5, bl6, l10, l11, (Set)object);
                    object = new bhd(string, bbv2, string2, string3, bas2, bas3, l2, l3, l4, baq2, n34, bak2, l5, l6, l7, l8, bl2, bbr2, n35, n36, l9, n37, n38, string4);
                    arrayList.add(object);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            cursor.close();
            auo2.j();
            return arrayList;
        }
        cursor.close();
        auo2.j();
        throw var63_59;
    }

    /*
     * Loose catch block
     */
    @Override
    public final void l(String string, long l2) {
        this.a.j();
        axc axc2 = this.n.d();
        axc2.e(1, l2);
        axc2.g(2, string);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.n.f(axc2);
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final void m(bbv bbv2, String string) {
        this.a.j();
        axc axc2 = this.j.d();
        axc2.e(1, AmbientLifecycleObserverKt.e(bbv2));
        axc2.g(2, string);
        this.a.k();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        try {
            axc2.a();
            this.a.n();
        }
        catch (Throwable throwable) {
            this.a.l();
            throw throwable;
        }
        try {
            this.a.l();
            return;
        }
        finally {
            this.j.f(axc2);
        }
    }
}

