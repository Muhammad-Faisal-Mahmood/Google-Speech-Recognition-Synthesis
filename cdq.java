/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  android.util.Pair
 */
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class cdq
extends gbs {
    public cdq() {
        super(Looper.getMainLooper(), (byte[])null);
    }

    public cdq(Looper looper) {
        super(looper, (byte[])null);
    }

    public final void handleMessage(Message object) {
        int n2 = ((Message)object).what;
        if (n2 != 1) {
            if (n2 != 2) {
                n2 = ((Message)object).what;
                object = new StringBuilder("Don't know how to handle message: ");
                ((StringBuilder)object).append(n2);
                Log.wtf((String)"BasePendingResult", (String)((StringBuilder)object).toString(), (Throwable)new Exception());
                return;
            }
            ((BasePendingResult)((Message)object).obj).h(Status.d);
            return;
        }
        object = (Pair)((Message)object).obj;
        ki ki2 = (ki)((Pair)object).first;
        object = (cda)((Pair)object).second;
        try {
            throw null;
        }
        catch (RuntimeException runtimeException) {
            BasePendingResult.i((cda)object);
            throw runtimeException;
        }
    }
}

