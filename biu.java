/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class biu
extends jqo {
    public Object a;
    final ConstraintTrackingWorker b;
    public int c;

    public biu(ConstraintTrackingWorker constraintTrackingWorker, jqb jqb2) {
        this.b = constraintTrackingWorker;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, null, null, this);
    }
}

