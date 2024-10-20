/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Handler
 *  android.os.Message
 */
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class dj
extends Handler {
    private final WeakReference a;

    public dj(DialogInterface dialogInterface) {
        this.a = new WeakReference<DialogInterface>(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int n2 = message.what;
        if (n2 != -3 && n2 != -2 && n2 != -1) {
            if (n2 != 1) {
                return;
            }
            ((DialogInterface)message.obj).dismiss();
            return;
        }
        ((DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)this.a.get(), message.what);
    }
}

