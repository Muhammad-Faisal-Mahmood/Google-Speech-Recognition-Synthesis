/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.WorkerParameters;

public abstract class bbz {
    public abstract bbh a(Context var1, String var2, WorkerParameters var3);

    public final bbh b(Context object, String string, WorkerParameters workerParameters) {
        jse.e(object, "appContext");
        jse.e(string, "workerClassName");
        jse.e(workerParameters, "workerParameters");
        bbh bbh2 = this.a((Context)object, string, workerParameters);
        Object object2 = bbh2;
        if (bbh2 == null) {
            try {
                object2 = Class.forName(string).asSubclass(bbh.class);
                jse.d(object2, "{\n                Class.\u2026class.java)\n            }");
            }
            catch (Throwable throwable) {
                string = String.valueOf(string);
                bbi.a().d(bca.a, "Invalid class: ".concat(string), throwable);
                throw throwable;
            }
            try {
                object = ((Class)object2).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(object, workerParameters);
                jse.d(object, "{\n                val co\u2026Parameters)\n            }");
                object2 = (bbh)object;
            }
            catch (Throwable throwable) {
                string = String.valueOf(string);
                bbi.a().d(bca.a, "Could not instantiate ".concat(string), throwable);
                throw throwable;
            }
        }
        if (!((bbh)object2).d) {
            return object2;
        }
        object = new StringBuilder("WorkerFactory (");
        object.append(this.getClass().getName());
        object.append(") returned an instance of a ListenableWorker (");
        object.append(string);
        object.append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        throw new IllegalStateException(object.toString());
    }
}

