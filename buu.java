/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.widget.PopupMenu$OnMenuItemClickListener
 */
import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;

public final class buu
implements PopupMenu.OnMenuItemClickListener {
    public final MultipleVoicesActivity a;
    public final Context b;
    public final izk c;

    public /* synthetic */ buu(MultipleVoicesActivity multipleVoicesActivity, izk izk2, Context context) {
        this.a = multipleVoicesActivity;
        this.c = izk2;
        this.b = context;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        izk izk2;
        MultipleVoicesActivity multipleVoicesActivity;
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    int n2 = menuItem.getItemId();
                    multipleVoicesActivity = this.a;
                    izk2 = this.c;
                    bl2 = true;
                    if (n2 != 2131427411) break block2;
                    multipleVoicesActivity.D((buc)izk2.c);
                    break block3;
                }
                if (menuItem.getItemId() == 2131427410) break block4;
                bl2 = false;
            }
            return bl2;
        }
        multipleVoicesActivity.I(this.b, izk2);
        return true;
    }
}

