/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.WorkerParameters;

public final class bdw
extends jqo {
    public Object a;
    public int b;
    public WorkerParameters c;
    final dhl d;
    public dhl e;

    public bdw(dhl dhl2, jqb jqb2) {
        this.d = dhl2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.b |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}

