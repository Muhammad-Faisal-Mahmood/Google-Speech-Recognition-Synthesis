/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;

final class bhn
extends atw {
    public bhn(aum aum2) {
        super(aum2);
    }

    @Override
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override
    protected final /* synthetic */ void c(axc axc2, Object object) {
        object = (bhd)object;
        axc2.g(1, ((bhd)object).b);
        axc2.e(2, AmbientLifecycleObserverKt.e(((bhd)object).c));
        axc2.g(3, ((bhd)object).d);
        axc2.g(4, ((bhd)object).e);
        axc2.c(5, AmbientModeSupport$AmbientCallback.a(((bhd)object).f));
        axc2.c(6, AmbientModeSupport$AmbientCallback.a(((bhd)object).g));
        axc2.e(7, ((bhd)object).h);
        axc2.e(8, ((bhd)object).i);
        axc2.e(9, ((bhd)object).j);
        axc2.e(10, ((bhd)object).l);
        axc2.e(11, AmbientLifecycleObserverKt.b(((bhd)object).m));
        axc2.e(12, ((bhd)object).n);
        axc2.e(13, ((bhd)object).o);
        axc2.e(14, ((bhd)object).p);
        axc2.e(15, ((bhd)object).q);
        axc2.e(16, (long)((bhd)object).r);
        axc2.e(17, AmbientLifecycleObserverKt.d(((bhd)object).s));
        axc2.e(18, ((bhd)object).t);
        axc2.e(19, ((bhd)object).u);
        axc2.e(20, ((bhd)object).v);
        axc2.e(21, ((bhd)object).w);
        axc2.e(22, ((bhd)object).x);
        String string = ((bhd)object).y;
        if (string == null) {
            axc2.f(23);
        } else {
            axc2.g(23, string);
        }
        object = ((bhd)object).k;
        axc2.e(24, AmbientLifecycleObserverKt.c(((baq)object).b));
        axc2.c(25, AmbientLifecycleObserverKt.l(((baq)object).c));
        axc2.e(26, (long)((baq)object).d);
        axc2.e(27, (long)((baq)object).e);
        axc2.e(28, (long)((baq)object).f);
        axc2.e(29, (long)((baq)object).g);
        axc2.e(30, ((baq)object).h);
        axc2.e(31, ((baq)object).i);
        axc2.c(32, AmbientLifecycleObserverKt.m(((baq)object).j));
    }
}

