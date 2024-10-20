/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.SearchEvent
 *  android.view.View
 *  android.view.Window$Callback
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class ff
implements Window.Callback {
    public final Window.Callback d;

    public ff(Window.Callback callback) {
        if (callback != null) {
            this.d = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.d.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.d.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.d.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.d.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.d.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.d.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.d.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.d.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.d.onContentChanged();
    }

    public boolean onCreatePanelMenu(int n2, Menu menu) {
        return this.d.onCreatePanelMenu(n2, menu);
    }

    public final View onCreatePanelView(int n2) {
        return this.d.onCreatePanelView(n2);
    }

    public final void onDetachedFromWindow() {
        this.d.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        return this.d.onMenuItemSelected(n2, menuItem);
    }

    public boolean onMenuOpened(int n2, Menu menu) {
        return this.d.onMenuOpened(n2, menu);
    }

    public void onPanelClosed(int n2, Menu menu) {
        this.d.onPanelClosed(n2, menu);
    }

    public final void onPointerCaptureChanged(boolean bl2) {
        ag$$ExternalSyntheticApiModelOutline0.m(this.d, bl2);
    }

    public boolean onPreparePanel(int n2, View view, Menu menu) {
        return this.d.onPreparePanel(n2, view, menu);
    }

    public void onProvideKeyboardShortcuts(List list, Menu menu, int n2) {
        ag$$ExternalSyntheticApiModelOutline1.m(this.d, list, menu, n2);
    }

    public final boolean onSearchRequested() {
        return this.d.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.d.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.d.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean bl2) {
        this.d.onWindowFocusChanged(bl2);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.d.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int n2) {
        return this.d.onWindowStartingActionMode(callback, n2);
    }
}

