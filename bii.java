/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;

public final class bii
extends jsf
implements jqz {
    final jrk a;
    final WorkDatabase b;

    public bii(jrk jrk2, WorkDatabase workDatabase) {
        this.a = jrk2;
        this.b = workDatabase;
        super(0);
    }

    @Override
    public final Object a() {
        return this.a.a(this.b);
    }
}

