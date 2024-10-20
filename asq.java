/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.widget.Toast
 */
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

public final class asq
implements View.OnCreateContextMenuListener,
MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public asq(Preference preference) {
        this.a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View object, ContextMenu.ContextMenuInfo object2) {
        object = this.a;
        object2 = ((Preference)object).getSummary();
        if (((Preference)object).isCopyingEnabled() && !TextUtils.isEmpty((CharSequence)object2)) {
            contextMenu.setHeaderTitle((CharSequence)object2);
            contextMenu.add(0, 0, 0, 2132017262).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)this);
        }
    }

    public final boolean onMenuItemClick(MenuItem object) {
        Object object2 = (ClipboardManager)this.a.getContext().getSystemService("clipboard");
        object = this.a.getSummary();
        object2.setPrimaryClip(ClipData.newPlainText((CharSequence)"Preference", (CharSequence)object));
        if (Build.VERSION.SDK_INT <= 32) {
            object2 = this.a;
            Toast.makeText((Context)((Preference)object2).getContext(), (CharSequence)((Preference)object2).getContext().getString(2132017446, new Object[]{object}), (int)0).show();
        }
        return true;
    }
}

