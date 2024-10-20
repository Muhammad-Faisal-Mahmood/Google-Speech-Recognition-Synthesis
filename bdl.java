/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class bdl
extends aun {
    public final WorkDatabase_Impl a;

    public bdl(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        awl2.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        awl2.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        awl2.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        awl2.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        awl2.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        awl2.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        awl2.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        awl2.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        awl2.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        awl2.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        awl2.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        awl2.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        awl2.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        awl2.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    @Override
    public final iuv b(awl object) {
        Cloneable cloneable = new HashMap<String, avx>(2);
        ((HashMap)cloneable).put("work_spec_id", new avx("work_spec_id", "TEXT", true, 1, null, 1));
        ((HashMap)cloneable).put("prerequisite_id", new avx("prerequisite_id", "TEXT", true, 2, null, 1));
        Object object2 = new HashSet<avy>(2);
        ((HashSet)object2).add(new avy("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        ((HashSet)object2).add(new avy("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        Object object3 = new HashSet<avz>(2);
        ((HashSet)object3).add(new avz("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        ((HashSet)object3).add(new avz("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        object2 = new awa("Dependency", (Map)((Object)cloneable), (Set)object2, (Set)object3);
        object3 = awa.a((awl)object, "Dependency");
        if (!wg.i((awa)object2, object3)) {
            return new iuv(false, a.am(object3, object2, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        object3 = new HashMap<String, avx>(32);
        ((HashMap)object3).put("id", new avx("id", "TEXT", true, 1, null, 1));
        ((HashMap)object3).put("state", new avx("state", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("worker_class_name", new avx("worker_class_name", "TEXT", true, 0, null, 1));
        ((HashMap)object3).put("input_merger_class_name", new avx("input_merger_class_name", "TEXT", true, 0, null, 1));
        ((HashMap)object3).put("input", new avx("input", "BLOB", true, 0, null, 1));
        ((HashMap)object3).put("output", new avx("output", "BLOB", true, 0, null, 1));
        ((HashMap)object3).put("initial_delay", new avx("initial_delay", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("interval_duration", new avx("interval_duration", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("flex_duration", new avx("flex_duration", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("run_attempt_count", new avx("run_attempt_count", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("backoff_policy", new avx("backoff_policy", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("backoff_delay_duration", new avx("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("last_enqueue_time", new avx("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        ((HashMap)object3).put("minimum_retention_duration", new avx("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("schedule_requested_at", new avx("schedule_requested_at", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("run_in_foreground", new avx("run_in_foreground", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("out_of_quota_policy", new avx("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("period_count", new avx("period_count", "INTEGER", true, 0, "0", 1));
        ((HashMap)object3).put("generation", new avx("generation", "INTEGER", true, 0, "0", 1));
        ((HashMap)object3).put("next_schedule_time_override", new avx("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        ((HashMap)object3).put("next_schedule_time_override_generation", new avx("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        ((HashMap)object3).put("stop_reason", new avx("stop_reason", "INTEGER", true, 0, "-256", 1));
        ((HashMap)object3).put("trace_tag", new avx("trace_tag", "TEXT", false, 0, null, 1));
        ((HashMap)object3).put("required_network_type", new avx("required_network_type", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("required_network_request", new avx("required_network_request", "BLOB", true, 0, "x''", 1));
        ((HashMap)object3).put("requires_charging", new avx("requires_charging", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("requires_device_idle", new avx("requires_device_idle", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("requires_battery_not_low", new avx("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("requires_storage_not_low", new avx("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("trigger_content_update_delay", new avx("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("trigger_max_content_delay", new avx("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        ((HashMap)object3).put("content_uri_triggers", new avx("content_uri_triggers", "BLOB", true, 0, null, 1));
        object2 = new HashSet(0);
        cloneable = new HashSet(2);
        ((HashSet)cloneable).add(new avz("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        ((HashSet)cloneable).add(new avz("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        object2 = new awa("WorkSpec", (Map)object3, (Set)object2, (Set)((Object)cloneable));
        object3 = awa.a((awl)object, "WorkSpec");
        if (!wg.i((awa)object2, object3)) {
            return new iuv(false, a.am(object3, object2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        cloneable = new HashMap(2);
        ((HashMap)cloneable).put("tag", new avx("tag", "TEXT", true, 1, null, 1));
        ((HashMap)cloneable).put("work_spec_id", new avx("work_spec_id", "TEXT", true, 2, null, 1));
        object3 = new HashSet<avy>(1);
        ((HashSet)object3).add(new avy("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        object2 = new HashSet<avz>(1);
        ((HashSet)object2).add(new avz("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        object2 = new awa("WorkTag", (Map)((Object)cloneable), (Set)object3, (Set)object2);
        object3 = awa.a((awl)object, "WorkTag");
        if (!wg.i((awa)object2, object3)) {
            return new iuv(false, a.am(object3, object2, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        object2 = new HashMap<String, avx>(3);
        ((HashMap)object2).put("work_spec_id", new avx("work_spec_id", "TEXT", true, 1, null, 1));
        ((HashMap)object2).put("generation", new avx("generation", "INTEGER", true, 2, "0", 1));
        ((HashMap)object2).put("system_id", new avx("system_id", "INTEGER", true, 0, null, 1));
        object3 = new HashSet<avy>(1);
        ((HashSet)object3).add(new avy("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        object2 = new awa("SystemIdInfo", (Map)object2, (Set)object3, new HashSet(0));
        object3 = awa.a((awl)object, "SystemIdInfo");
        if (!wg.i((awa)object2, object3)) {
            return new iuv(false, a.am(object3, object2, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        object2 = new HashMap<String, avx>(2);
        ((HashMap)object2).put("name", new avx("name", "TEXT", true, 1, null, 1));
        ((HashMap)object2).put("work_spec_id", new avx("work_spec_id", "TEXT", true, 2, null, 1));
        object3 = new HashSet<avy>(1);
        ((HashSet)object3).add(new avy("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        cloneable = new HashSet(1);
        ((HashSet)cloneable).add(new avz("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        object3 = new awa("WorkName", (Map)object2, (Set)object3, (Set)((Object)cloneable));
        object2 = awa.a((awl)object, "WorkName");
        if (!wg.i((awa)object3, object2)) {
            return new iuv(false, a.am(object2, object3, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        object3 = new HashMap<String, avx>(2);
        ((HashMap)object3).put("work_spec_id", new avx("work_spec_id", "TEXT", true, 1, null, 1));
        ((HashMap)object3).put("progress", new avx("progress", "BLOB", true, 0, null, 1));
        object2 = new HashSet<avy>(1);
        ((HashSet)object2).add(new avy("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        object3 = new awa("WorkProgress", (Map)object3, (Set)object2, new HashSet(0));
        object2 = awa.a((awl)object, "WorkProgress");
        if (!wg.i((awa)object3, object2)) {
            return new iuv(false, a.am(object2, object3, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        object2 = new HashMap<String, avx>(2);
        ((HashMap)object2).put("key", new avx("key", "TEXT", true, 1, null, 1));
        ((HashMap)object2).put("long_value", new avx("long_value", "INTEGER", false, 0, null, 1));
        object2 = new awa("Preference", (Map)object2, new HashSet(0), new HashSet(0));
        object = awa.a((awl)object, "Preference");
        if (!wg.i((awa)object2, object)) {
            return new iuv(false, a.am(object, object2, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n"));
        }
        return new iuv(true, null);
    }
}

