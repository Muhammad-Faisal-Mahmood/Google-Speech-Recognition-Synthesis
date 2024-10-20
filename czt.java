/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.system.ErrnoException
 *  android.system.Os
 */
import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

public final class czt {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri a(Context object, Uri object2) {
        void var0_4;
        try {
            void var1_5;
            String string = Os.readlink((String)fvc.L((Uri)var1_5, object).getAbsolutePath());
            if (string != null) {
                fps fps2 = new fps((Context)object);
                fps2.b(string);
                return fps2.a();
            }
            IOException iOException = new IOException("Unable to read symlink");
            throw iOException;
        }
        catch (ErrnoException errnoException) {
            throw new IOException("Unable to read symlink", (Throwable)var0_4);
        }
        catch (fpz fpz2) {
            // empty catch block
        }
        throw new IOException("Unable to read symlink", (Throwable)var0_4);
    }

    /*
     * WARNING - void declaration
     */
    public static void b(Context context, Uri uri, Uri uri2) {
        void var0_3;
        try {
            Os.symlink((String)fvc.L(uri2, context).getAbsolutePath(), (String)fvc.L(uri, context).getAbsolutePath());
            return;
        }
        catch (ErrnoException errnoException) {
        }
        catch (fpz fpz2) {
            // empty catch block
        }
        throw new IOException("Unable to create symlink", (Throwable)var0_3);
    }
}

