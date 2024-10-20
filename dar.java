/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.UUID;

public final class dar
implements hpb {
    final String a;
    final long b;

    public dar(String string, long l2) {
        this.a = string;
        this.b = l2;
    }

    @Override
    public final void a(Throwable serializable) {
        serializable = new StringBuilder("Failed to scheduled periodic tasks for MDD lib ");
        ((StringBuilder)serializable).append(this.a);
        ((StringBuilder)serializable).append(" ");
        ((StringBuilder)serializable).append(this.b);
        Log.e((String)"MDDTikTokTaskScheduler", (String)((StringBuilder)serializable).toString());
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        String.valueOf((UUID)object);
    }
}

