/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.PopupWindow$OnDismissListener
 */
import android.widget.PopupWindow;

final class gb
implements PopupWindow.OnDismissListener {
    final gc a;

    public gb(gc gc2) {
        this.a = gc2;
    }

    public final void onDismiss() {
        this.a.c();
    }
}

