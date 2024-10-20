/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 */
import android.content.Intent;
import android.content.IntentSender;

public final class ns {
    public Intent a;
    private final IntentSender b;
    private int c;
    private int d;

    public ns(IntentSender intentSender) {
        jse.e(intentSender, "intentSender");
        this.b = intentSender;
    }

    public final nt a() {
        return new nt(this.b, this.a, this.c, this.d);
    }

    public final void b(int n2, int n3) {
        this.d = n2;
        this.c = n3;
    }
}

