/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class axd {
    public static final Map a = new HashMap();
    public final boolean b;
    private final File c;
    private final Lock d;
    private FileChannel e;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public axd(String object, File serializable) {
        void var2_5;
        void var2_2;
        jse.e(object, "name");
        this.b = false;
        if (var2_2 != null) {
            serializable = new File((File)var2_2, String.valueOf(object).concat(".lck"));
        } else {
            Object var2_4 = null;
        }
        this.c = var2_5;
        Map map = a;
        synchronized (map) {
            void var2_8;
            Object v2;
            Object v3 = v2 = map.get(object);
            if (v2 == null) {
                ReentrantLock reentrantLock = new ReentrantLock();
                map.put(object, reentrantLock);
            }
            object = (Lock)var2_8;
        }
        this.d = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        this.d.lock();
        if (bl2) {
            try {
                Object object = this.c;
                if (object == null) {
                    object = new IOException("No lock directory was provided.");
                    throw object;
                }
                if ((object = ((File)object).getParentFile()) != null) {
                    ((File)object).mkdirs();
                }
                object = new FileOutputStream(this.c);
                object = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileOutputStream)object).getChannel());
                ((FileChannel)object).lock();
                this.e = object;
                return;
            }
            catch (IOException iOException) {
                this.e = null;
                Log.w((String)"SupportSQLiteLock", (String)"Unable to grab file lock.", (Throwable)iOException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        try {
            FileChannel fileChannel = this.e;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
        catch (IOException iOException) {}
        this.d.unlock();
    }
}

