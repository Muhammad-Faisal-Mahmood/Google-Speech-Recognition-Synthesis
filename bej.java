/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;

public final class bej
implements Runnable {
    private final bem a;
    private final Intent b;
    private final int c;

    public bej(bem bem2, Intent intent, int n2) {
        this.a = bem2;
        this.b = intent;
        this.c = n2;
    }

    @Override
    public final void run() {
        this.a.d(this.b, this.c);
    }
}

