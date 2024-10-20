/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;

final class fxy
implements Handler.Callback {
    public final boolean handleMessage(Message object) {
        int n2 = object.what;
        if (n2 != 0) {
            if (n2 != 1) {
                return false;
            }
            fyb fyb2 = (fyb)object.obj;
            n2 = object.arg1;
            throw null;
        }
        object = (fyb)object.obj;
        throw null;
    }
}

