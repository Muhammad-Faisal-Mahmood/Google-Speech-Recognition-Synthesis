/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;

public final class fyd
implements Handler.Callback {
    final bzb a;

    public fyd(bzb bzb2) {
        this.a = bzb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message object) {
        if (object.what != 0) {
            return false;
        }
        Object object2 = this.a;
        object = (fxf)object.obj;
        object2 = ((bzb)object2).a;
        synchronized (object2) {
            if (object != null) {
                return true;
            }
            throw null;
        }
    }
}

