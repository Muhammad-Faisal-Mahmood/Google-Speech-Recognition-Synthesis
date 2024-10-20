/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 */
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class crn {
    public static boolean a;
    public static final Object b;
    private static final String[] c;

    static {
        c = new String[]{"COLLECTION_BASIS_VERIFIER"};
        a = false;
        b = new Object();
    }

    public static void a(cre object, ilo object2) {
        Object object3 = new cka(((cre)object).a);
        String string = String.valueOf(((cre)object).a.getPackageName());
        Object object4 = ((cre)object).a;
        if (((ilo)object2).a == null) {
            try {
                ((ilo)object2).a = object4.getPackageManager().getPackageInfo((String)object4.getPackageName(), (int)0).versionCode;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                ((ilo)object2).a = -1;
            }
        }
        string = "com.google.android.libraries.consentverifier#".concat(string);
        object2 = ((cka)object3).j(string, (Integer)((ilo)object2).a, c, null);
        if (cqq.b(((cre)object).a)) {
            object = cih.a;
            object = Executors.defaultThreadFactory();
            object = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>)new LinkedBlockingQueue<Runnable>(), (ThreadFactory)object);
            ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(true);
            object = Executors.unconfigurableExecutorService((ExecutorService)object);
        } else {
            object = new LinkedBlockingQueue(10);
            object4 = new ivg(null);
            ((ivg)object4).h("ConsentVerifierLibraryThread-%d");
            ThreadFactory threadFactory = ivg.i((ivg)object4);
            object4 = crq.a;
            object = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, (BlockingQueue<Runnable>)object, threadFactory, (RejectedExecutionHandler)object4);
        }
        try {
            object4 = new crl((cka)object3, string, (Executor)object);
            ((ckz)object2).i((Executor)object, (ckx)object4);
            object3 = new crm(string, 1);
            ((ckz)object2).h((Executor)object, (ckw)object3);
            return;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            Log.w((String)"CBVerifier", (String)String.format("Execution failure when updating phenotypeflags for %s. %s", string, rejectedExecutionException));
            return;
        }
    }
}

