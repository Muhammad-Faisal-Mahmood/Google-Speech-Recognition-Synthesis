/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

final class dfg {
    static final long a;
    static final long b;
    static final long c;
    static final String d;
    static final String e;
    public static final int f = 0;

    static {
        long l2;
        long l3;
        long l4;
        a = l4 = TimeUnit.SECONDS.toMillis(60L);
        b = l3 = TimeUnit.SECONDS.toMillis(60L);
        c = l2 = TimeUnit.SECONDS.toMillis(60L);
        StringBuilder stringBuilder = new StringBuilder("CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), connection_attempts INT DEFAULT(3), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), http_conn_timeout_millis INT DEFAULT(");
        stringBuilder.append(l4);
        stringBuilder.append("), http_read_timeout_millis INT DEFAULT(");
        stringBuilder.append(l3);
        stringBuilder.append("), http_write_timeout_millis INT DEFAULT(");
        stringBuilder.append(l2);
        stringBuilder.append("), http_retry_on_conn_failure INT DEFAULT(1), UNIQUE (download_id) ON CONFLICT FAIL)");
        d = stringBuilder.toString();
        stringBuilder = new StringBuilder("CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), connection_attempts INT DEFAULT(3), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), http_conn_timeout_millis INT DEFAULT(");
        stringBuilder.append(l4);
        stringBuilder.append("), http_read_timeout_millis INT DEFAULT(");
        stringBuilder.append(l3);
        stringBuilder.append("), http_write_timeout_millis INT DEFAULT(");
        stringBuilder.append(l2);
        stringBuilder.append("), http_retry_on_conn_failure INT DEFAULT(1), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)");
        e = stringBuilder.toString();
    }
}

