/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import org.chromium.net.ProxyChangeListener;
import org.chromium.net.ProxyChangeListener$ProxyReceiver;

public final class kph
implements Runnable {
    public final ProxyChangeListener$ProxyReceiver a;
    public final Intent b;

    public /* synthetic */ kph(ProxyChangeListener$ProxyReceiver proxyReceiver, Intent intent) {
        this.a = proxyReceiver;
        this.b = intent;
    }

    @Override
    public final void run() {
        this.a.a.b(ProxyChangeListener.a(this.b));
    }
}

