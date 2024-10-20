/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 */
import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class knq
extends ThreadPoolExecutor {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final ThreadFactory d;
    private static final BlockingQueue e;

    static {
        int n2;
        a = n2 = Runtime.getRuntime().availableProcessors();
        b = Math.max(2, Math.min(n2 - 1, 4));
        c = n2 + n2 + 1;
        d = new knp(0);
        e = new ArrayBlockingQueue(128);
    }

    public knq() {
        super(b, c, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>)e, d);
        this.allowCoreThreadTimeOut(true);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void execute(Runnable object2) {
        try {
            super.execute((Runnable)object2);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            void var1_12;
            HashMap hashMap = new HashMap();
            for (Runnable runnable : this.getQueue().toArray(new Runnable[0])) {
                Class<?> clazz = runnable.getClass();
                if (clazz != kno.class) {
                    void var1_6;
                    String string;
                    Class<?> clazz2 = clazz;
                    if (clazz.getEnclosingClass() == AsyncTask.class) {
                        Class<AsyncTask> clazz3 = AsyncTask.class;
                    }
                    int n2 = hashMap.containsKey(string = var1_6.getName()) ? (Integer)hashMap.get(string) : 0;
                    hashMap.put(string, n2 + 1);
                    continue;
                }
                kno kno2 = (kno)runnable;
                throw null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((Integer)entry.getValue() <= 32) continue;
                stringBuilder.append((String)entry.getKey());
                stringBuilder.append(' ');
            }
            if (stringBuilder.length() == 0) {
                String string = "NO CLASSES FOUND";
            } else {
                String string = stringBuilder.toString();
            }
            throw new RejectedExecutionException("Prominent classes in AsyncTask: ".concat((String)var1_12), rejectedExecutionException);
        }
    }
}

