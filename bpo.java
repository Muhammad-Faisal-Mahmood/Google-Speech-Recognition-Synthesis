/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class bpo {
    public final Context a;
    public final ExecutorService b;
    public final Executor c;

    public bpo() {
        throw null;
    }

    public bpo(Context context, ExecutorService executorService, Executor executor) {
        this.a = context;
        this.b = executorService;
        this.c = executor;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bpo) {
            object = (bpo)object;
            if (this.a.equals(((bpo)object).a) && this.b.equals(((bpo)object).b) && this.c.equals(((bpo)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        Object object = this.c;
        Object object2 = this.b;
        String string = String.valueOf(this.a);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("AiCoreClientOptions{context=");
        stringBuilder.append(string);
        stringBuilder.append(", workerExecutor=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", callbackExecutor=");
        stringBuilder.append((String)object);
        stringBuilder.append(", bindImportantEnabled=false, bindWaivePriorityEnabled=false}");
        return stringBuilder.toString();
    }
}

