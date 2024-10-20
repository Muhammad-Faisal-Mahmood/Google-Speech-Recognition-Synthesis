/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class bix
extends jqo {
    public Object a;
    public Object b;
    final ConstraintTrackingWorker c;
    public int d;
    public ConstraintTrackingWorker e;

    public bix(ConstraintTrackingWorker constraintTrackingWorker, jqb jqb2) {
        this.c = constraintTrackingWorker;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.b = object;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}

