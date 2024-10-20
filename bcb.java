/*
 * Decompiled with CFR 0.152.
 */
public final class bcb
extends we {
    @Override
    public final void l(awl awl2) {
        awl2.d();
        try {
            StringBuilder stringBuilder = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            stringBuilder.append(System.currentTimeMillis() - bdb.a);
            stringBuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            awl2.g(stringBuilder.toString());
            awl2.h();
            return;
        }
        finally {
            awl2.f();
        }
    }
}

