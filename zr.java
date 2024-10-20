/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Spannable
 *  android.text.method.KeyListener
 *  android.text.method.MetaKeyKeyListener
 *  android.view.KeyEvent
 *  android.view.View
 */
import android.text.Editable;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class zr
implements KeyListener {
    private final KeyListener a;

    public zr(KeyListener keyListener) {
        this.a = keyListener;
    }

    public final void clearMetaKeyState(View view, Editable editable, int n2) {
        this.a.clearMetaKeyState(view, editable, n2);
    }

    public final int getInputType() {
        return this.a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int n2, KeyEvent keyEvent) {
        block6: {
            block5: {
                block3: {
                    boolean bl2;
                    block4: {
                        block2: {
                            if (n2 == 67) break block2;
                            if (n2 != 112) break block3;
                            bl2 = wb.d(editable, keyEvent, true);
                            break block4;
                        }
                        bl2 = wb.d(editable, keyEvent, false);
                    }
                    if (!bl2) break block3;
                    MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)editable);
                    break block5;
                }
                if (!this.a.onKeyDown(view, editable, n2, keyEvent)) break block6;
            }
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int n2, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, n2, keyEvent);
    }
}

