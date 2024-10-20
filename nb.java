/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.BackEvent
 */
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class nb
implements OnBackAnimationCallback {
    final jrk a;
    final jrk b;
    final jqz c;
    final jqz d;

    public nb(jrk jrk2, jrk jrk3, jqz jqz2, jqz jqz3) {
        this.a = jrk2;
        this.b = jrk3;
        this.c = jqz2;
        this.d = jqz3;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent object) {
        jse.e(object, "backEvent");
        object = new mk((BackEvent)object);
        this.b.a(object);
    }

    public final void onBackStarted(BackEvent object) {
        jse.e(object, "backEvent");
        object = new mk((BackEvent)object);
        this.a.a(object);
    }
}

