/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.Window$Callback
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

public class db
extends Activity
implements abe,
vd {
    public final abg f;

    public db() {
        new pa(null);
        this.f = new abg(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jse.e(keyEvent, "event");
        View view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        if (wj.q(view, keyEvent)) {
            return true;
        }
        return ve.a(this, view, (Window.Callback)this, keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        jse.e(keyEvent, "event");
        View view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        if (wj.q(view, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public abb getLifecycle() {
        return this.f;
    }

    @Override
    public final boolean j(KeyEvent keyEvent) {
        jse.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n2 = abt.a;
        wd.m(this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        jse.e(bundle, "outState");
        this.f.e(aba.c);
        super.onSaveInstanceState(bundle);
    }
}

