/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.text.TextUtils
 */
import android.content.ContentValues;
import android.text.TextUtils;

public final class bde
extends avp {
    public bde() {
        super(14, 15);
    }

    @Override
    public final void a(awl closeable) {
        closeable.g("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        closeable.g("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
        closeable.g("DROP TABLE `WorkSpec`");
        closeable.g("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        closeable.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        closeable.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        closeable.g("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int n2 = 0;
        if (contentValues.size() != 0) {
            String string;
            int n3 = contentValues.size();
            Object[] objectArray = new Object[n3];
            StringBuilder stringBuilder = new StringBuilder("UPDATE ");
            stringBuilder.append(awu.a[3]);
            stringBuilder.append("WorkSpec SET ");
            for (String string2 : contentValues.keySet()) {
                string = n2 > 0 ? "," : "";
                stringBuilder.append(string);
                stringBuilder.append(string2);
                objectArray[n2] = contentValues.get(string2);
                stringBuilder.append("=?");
                ++n2;
            }
            for (n2 = n3; n2 < n3; ++n2) {
                objectArray[n2] = (new Object[0])[n2 - n3];
            }
            if (!TextUtils.isEmpty((CharSequence)"last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                stringBuilder.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            string = stringBuilder.toString();
            closeable = ((awu)closeable).k(string);
            yi.i((awq)closeable, objectArray);
            ((axc)closeable).a();
            return;
        }
        throw new IllegalArgumentException("Empty values");
    }
}

