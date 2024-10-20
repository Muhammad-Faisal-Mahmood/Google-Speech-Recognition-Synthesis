/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 *  android.view.KeyEvent$Callback
 *  android.view.KeyEvent$DispatcherState
 *  android.view.View
 *  android.view.Window$Callback
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ve {
    private static boolean a = false;
    private static Method b;
    private static boolean c = false;
    private static Field d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(vd object, View view, Window.Callback object2, KeyEvent keyEvent) {
        Object var6_9;
        block13: {
            Method method;
            boolean bl2;
            block15: {
                block12: {
                    block14: {
                        bl2 = false;
                        if (object == null) {
                            return bl2;
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            return object.j(keyEvent);
                        }
                        boolean bl3 = object2 instanceof Activity;
                        method = null;
                        var6_9 = null;
                        if (!bl3) break block14;
                        view = (Activity)object2;
                        view.onUserInteraction();
                        object = view.getWindow();
                        if (!object.hasFeature(8)) break block13;
                        object2 = view.getActionBar();
                        if (keyEvent.getKeyCode() != 82 || object2 == null) break block13;
                        if (a) break block15;
                        try {
                            b = object2.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            break block12;
                        }
                        catch (NoSuchMethodException noSuchMethodException) {}
                    }
                    if (object2 instanceof Dialog) {
                        view = (Dialog)object2;
                        object = ve.b((Dialog)view);
                        if (object != null && object.onKey((DialogInterface)view, keyEvent.getKeyCode(), keyEvent) || (object = view.getWindow()).superDispatchKeyEvent(keyEvent) || wj.p((View)(object2 = object.getDecorView()), keyEvent)) return true;
                        object = method;
                        if (object2 == null) return keyEvent.dispatch((KeyEvent.Callback)view, (KeyEvent.DispatcherState)object, (Object)view);
                        object = object2.getKeyDispatcherState();
                        return keyEvent.dispatch((KeyEvent.Callback)view, (KeyEvent.DispatcherState)object, (Object)view);
                    } else {
                        if (view != null) {
                            if (wj.p(view, keyEvent)) return true;
                        }
                        if (object.j(keyEvent)) return true;
                        return bl2;
                    }
                }
                a = true;
            }
            if ((method = b) != null) {
                try {
                    object2 = method.invoke(object2, keyEvent);
                    if (object2 == null || !(bl2 = ((Boolean)object2).booleanValue())) break block13;
                    return true;
                }
                catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
            }
        }
        if (object.superDispatchKeyEvent(keyEvent)) return true;
        object2 = object.getDecorView();
        if (wj.p((View)object2, keyEvent)) return true;
        object = var6_9;
        if (object2 == null) return keyEvent.dispatch((KeyEvent.Callback)view, (KeyEvent.DispatcherState)object, (Object)view);
        object = object2.getKeyDispatcherState();
        return keyEvent.dispatch((KeyEvent.Callback)view, (KeyEvent.DispatcherState)object, (Object)view);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static DialogInterface.OnKeyListener b(Dialog dialog) {
        Field field;
        if (!c) {
            try {
                d = field = Dialog.class.getDeclaredField("mOnKeyListener");
                field.setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            c = true;
        }
        if ((field = d) == null) return null;
        try {
            return (DialogInterface.OnKeyListener)field.get(dialog);
        }
        catch (IllegalAccessException illegalAccessException) {
            return null;
        }
    }
}

