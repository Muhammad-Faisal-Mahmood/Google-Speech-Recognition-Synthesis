/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.text.Editable
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

final class yn
implements ActionMode.Callback {
    public final ActionMode.Callback a;
    private final TextView b;
    private Class c;
    private Method d;
    private boolean e;
    private boolean f;

    public yn(ActionMode.Callback callback, TextView textView) {
        this.a = callback;
        this.b = textView;
        this.f = false;
    }

    private static final Intent a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }

    /*
     * Unable to fully structure code
     */
    public final boolean onPrepareActionMode(ActionMode var1_1, Menu var2_2) {
        var7_3 = this.b.getContext();
        var6_4 = var7_3.getPackageManager();
        if (!this.f) {
            this.f = true;
            try {
                var5_5 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.c = var5_5;
                this.d = var5_5.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                this.e = true;
            }
            catch (ClassNotFoundException | NoSuchMethodException var5_6) {
                this.c = null;
                this.d = null;
                this.e = false;
            }
        }
        try {
            var5_5 = this.e != false && this.c.isInstance(var2_2) != false ? this.d : var2_2.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
            var3_8 = var2_2.size();
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException var5_7) {
            ** continue;
        }
        while ((var4_9 = var3_8 - 1) >= 0) {
            var8_10 = var2_2.getItem(var4_9);
            var3_8 = var4_9;
            if (var8_10.getIntent() == null) continue;
            var3_8 = var4_9;
            if (!"android.intent.action.PROCESS_TEXT".equals(var8_10.getIntent().getAction())) continue;
            var5_5.invoke((Object)var2_2, new Object[]{var4_9});
            var3_8 = var4_9;
        }
        var5_5 = new ArrayList<E>();
        if (!(var7_3 instanceof Activity)) {
            while (true) {
                break;
            }
        } else {
            var9_11 = var6_4.queryIntentActivities(yn.a(), 0).iterator();
            while (true) {
                if (!var9_11.hasNext()) ** continue;
                var8_10 = (ResolveInfo)var9_11.next();
                if (!var7_3.getPackageName().equals(var8_10.activityInfo.packageName) && (!var8_10.activityInfo.exported || var8_10.activityInfo.permission != null && var7_3.checkSelfPermission(var8_10.activityInfo.permission) != 0)) ** continue;
                var5_5.add(var8_10);
            }
        }
        for (var3_8 = 0; var3_8 < var5_5.size(); ++var3_8) {
            var8_10 = (ResolveInfo)var5_5.get(var3_8);
            var7_3 = var2_2.add(0, 0, var3_8 + 100, var8_10.loadLabel(var6_4));
            var9_11 = this.b;
            var10_12 = yn.a();
            var4_9 = var9_11 instanceof Editable != false && var9_11.onCheckIsTextEditor() != false && var9_11.isEnabled() != false ? 1 : 0;
            var7_3.setIntent(var10_12.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", (boolean)(var4_9 ^ 1)).setClassName(var8_10.activityInfo.packageName, var8_10.activityInfo.name)).setShowAsAction(1);
        }
lbl51:
        // 2 sources

        return this.a.onPrepareActionMode(var1_1, var2_2);
    }
}

