/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class asu
extends Handler {
    final ata a;

    public asu(ata ata2, Looper looper) {
        this.a = ata2;
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.f();
    }
}

