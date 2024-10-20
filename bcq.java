/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

public final class bcq
implements bcc {
    public final Executor a;
    public final List b;
    public final bam c;
    public final WorkDatabase d;

    public /* synthetic */ bcq(Executor executor, List list, bam bam2, WorkDatabase workDatabase) {
        this.a = executor;
        this.b = list;
        this.c = bam2;
        this.d = workDatabase;
    }

    @Override
    public final void a(bgs object, boolean bl2) {
        bam bam2 = this.c;
        WorkDatabase workDatabase = this.d;
        object = new ww(this.b, (bgs)object, bam2, workDatabase, 6);
        this.a.execute((Runnable)object);
    }
}

