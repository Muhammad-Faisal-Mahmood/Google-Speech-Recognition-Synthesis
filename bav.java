/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bav
extends bbz {
    public final List a = new CopyOnWriteArrayList();

    @Override
    public final bbh a(Context object, String string, WorkerParameters object2) {
        block3: {
            jse.e(object, "appContext");
            jse.e(string, "workerClassName");
            jse.e(object2, "workerParameters");
            for (Object object3 : this.a) {
                try {
                    if ((object3 = ((bbz)object3).a((Context)object, string, (WorkerParameters)object2)) == null) continue;
                    object = object3;
                    break block3;
                }
                catch (Throwable throwable) {
                    object2 = new StringBuilder("Unable to instantiate a ListenableWorker (");
                    ((StringBuilder)object2).append(string);
                    ((StringBuilder)object2).append(')');
                    string = ((StringBuilder)object2).toString();
                    bbi.a().d(baw.a, string, throwable);
                    throw throwable;
                }
            }
            object = null;
        }
        return object;
    }
}

