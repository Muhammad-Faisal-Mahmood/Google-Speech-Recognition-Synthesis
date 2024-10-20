/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.view.KeyEvent;
import android.widget.TextView;

public final class bmx
implements TextView.OnEditorActionListener {
    public final bna a;

    public /* synthetic */ bmx(bna bna2) {
        this.a = bna2;
    }

    public final boolean onEditorAction(TextView object, int n2, KeyEvent keyEvent) {
        boolean bl2;
        block4: {
            boolean bl3;
            block3: {
                block5: {
                    object = this.a;
                    bl3 = false;
                    if (n2 == 6 || n2 == 3) break block3;
                    bl2 = bl3;
                    if (keyEvent == null) break block4;
                    n2 = keyEvent.getKeyCode();
                    if (n2 == 66 || n2 == 160) break block5;
                    bl2 = bl3;
                    if (n2 != 84) break block4;
                }
                n2 = keyEvent.getAction();
                bl2 = true;
                if (n2 == 1) {
                    ((bna)((Object)object)).d();
                    return true;
                }
                break block4;
            }
            ((bna)((Object)object)).d();
            bl2 = bl3;
        }
        return bl2;
    }
}

