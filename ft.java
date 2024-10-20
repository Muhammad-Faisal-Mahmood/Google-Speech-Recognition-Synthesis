/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.Window
 */
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.Window;

final class ft
implements DialogInterface.OnKeyListener,
DialogInterface.OnClickListener,
DialogInterface.OnDismissListener,
gd {
    public final fs a;
    public dn b;
    fo c;

    public ft(fs fs2) {
        this.a = fs2;
    }

    @Override
    public final void a(fs object, boolean bl2) {
        if ((bl2 || object == this.a) && (object = this.b) != null) {
            ((ei)object).dismiss();
        }
    }

    @Override
    public final boolean b(fs fs2) {
        return false;
    }

    public final void onClick(DialogInterface object, int n2) {
        object = ((fn)this.c.a()).a(n2);
        this.a.z((MenuItem)object, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int n2, KeyEvent keyEvent) {
        int n3;
        block15: {
            int n4;
            block14: {
                n4 = n2;
                if (n2 == 82) break block14;
                n3 = n2;
                if (n2 != 4) break block15;
                n4 = 4;
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                dialogInterface = this.b.getWindow();
                n3 = n4;
                if (dialogInterface != null) {
                    dialogInterface = dialogInterface.getDecorView();
                    n3 = n4;
                    if (dialogInterface != null) {
                        dialogInterface = dialogInterface.getKeyDispatcherState();
                        n3 = n4;
                        if (dialogInterface != null) {
                            dialogInterface.startTracking(keyEvent, (Object)this);
                            return true;
                        }
                    }
                }
            } else {
                n3 = n4;
                if (keyEvent.getAction() == 1) {
                    n3 = n4;
                    if (!keyEvent.isCanceled()) {
                        Window window = this.b.getWindow();
                        n3 = n4;
                        if (window != null) {
                            window = window.getDecorView();
                            n3 = n4;
                            if (window != null) {
                                window = window.getKeyDispatcherState();
                                n3 = n4;
                                if (window != null) {
                                    n3 = n4;
                                    if (window.isTracking(keyEvent)) {
                                        this.a.i(true);
                                        dialogInterface.dismiss();
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return this.a.performShortcut(n3, keyEvent, 0);
    }
}

