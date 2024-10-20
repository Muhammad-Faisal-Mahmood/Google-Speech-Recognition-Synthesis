/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Fragment
 *  android.app.assist.AssistContent
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.CancellationSignal
 *  android.view.ActionMode
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 */
import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.function.Consumer;

public class fou
extends bh {
    private int k;
    protected final fnm l = new fnm();

    private final void o() {
        --this.k;
    }

    private final void p() {
        int n2 = this.k;
        this.k = n2 + 1;
        if (n2 == 0) {
            this.l.x();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.l.m() || super.dispatchKeyEvent(keyEvent);
        {
        }
    }

    @Override
    public final void e() {
        this.l.o();
    }

    public void finish() {
        this.l.a();
        super.finish();
    }

    public final void finishAfterTransition() {
        this.l.b();
        super.finishAfterTransition();
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        fnm fnm2 = this.l;
        for (int i2 = 0; i2 < fnm2.a.size(); ++i2) {
            foo foo2 = (foo)fnm2.a.get(i2);
            if (!(foo2 instanceof fmp)) continue;
            ((fmp)((Object)foo2)).a();
        }
        super.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        fnm fnm2 = this.l;
        for (int i2 = 0; i2 < fnm2.a.size(); ++i2) {
            foo foo2 = (foo)fnm2.a.get(i2);
            if (!(foo2 instanceof fmq)) continue;
            ((fmq)((Object)foo2)).a();
        }
        super.onActionModeStarted(actionMode);
    }

    public final void onActivityReenter(int n2, Intent intent) {
        this.l.n();
        super.onActivityReenter(n2, intent);
    }

    @Override
    protected void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        this.l.K();
    }

    public final void onAttachedToWindow() {
        this.l.c();
        super.onAttachedToWindow();
    }

    @Override
    public void onBackPressed() {
        if (!this.l.l()) {
            super.onBackPressed();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        this.l.L();
        super.onConfigurationChanged(configuration);
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.l.M() || super.onContextItemSelected(menuItem);
        {
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.l.y(bundle);
        super.onCreate(bundle);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.l.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        return this.l.O() || super.onCreateOptionsMenu(menu);
        {
        }
    }

    @Override
    protected void onDestroy() {
        ((fnx)this.l).d();
        super.onDestroy();
    }

    public final void onDetachedFromWindow() {
        this.l.e();
        super.onDetachedFromWindow();
    }

    public final void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.l.p(consumer);
    }

    public final boolean onKeyDown(int n2, KeyEvent keyEvent) {
        return this.l.q() || super.onKeyDown(n2, keyEvent);
        {
        }
    }

    public final boolean onKeyUp(int n2, KeyEvent keyEvent) {
        return this.l.r() || super.onKeyUp(n2, keyEvent);
        {
        }
    }

    public final void onLowMemory() {
        this.l.z();
        super.onLowMemory();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.l.s();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.l.P() || super.onOptionsItemSelected(menuItem);
        {
        }
    }

    @Override
    protected void onPause() {
        ((fnx)this.l).f();
        super.onPause();
    }

    public final void onPerformDirectAction(String string, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.l.t();
    }

    protected void onPostCreate(Bundle bundle) {
        this.l.g(bundle);
        super.onPostCreate(bundle);
    }

    @Override
    protected void onPostResume() {
        this.l.h();
        super.onPostResume();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.l.Q() || super.onPrepareOptionsMenu(menu);
        {
        }
    }

    public final void onProvideAssistContent(AssistContent assistContent) {
        this.l.u();
        super.onProvideAssistContent(assistContent);
    }

    public final void onProvideAssistData(Bundle bundle) {
        this.l.v();
        super.onProvideAssistData(bundle);
    }

    @Override
    public void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        this.l.R();
        super.onRequestPermissionsResult(n2, stringArray, nArray);
    }

    protected final void onRestoreInstanceState(Bundle bundle) {
        this.l.i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override
    protected void onResume() {
        fhq.f(this.bb());
        this.l.A();
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        this.l.B(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override
    protected void onStart() {
        fhq.f(this.bb());
        this.l.C();
        super.onStart();
    }

    @Override
    protected void onStop() {
        this.l.D();
        super.onStop();
    }

    public final void onTopResumedActivityChanged(boolean bl2) {
        this.l.E(bl2);
        super.onTopResumedActivityChanged(bl2);
    }

    public void onUserInteraction() {
        this.l.j();
        super.onUserInteraction();
    }

    @Override
    protected final void onUserLeaveHint() {
        this.l.k();
        super.onUserLeaveHint();
    }

    public final void onWindowFocusChanged(boolean bl2) {
        this.l.w();
        super.onWindowFocusChanged(bl2);
    }

    public void startActivity(Intent intent) {
        this.p();
        super.startActivity(intent);
        this.o();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.p();
        super.startActivity(intent, bundle);
        this.o();
    }

    @Override
    public final void startActivityForResult(Intent intent, int n2) {
        this.p();
        super.startActivityForResult(intent, n2);
        this.o();
    }

    @Override
    public final void startActivityForResult(Intent intent, int n2, Bundle bundle) {
        this.p();
        super.startActivityForResult(intent, n2, bundle);
        this.o();
    }

    public final void startActivityFromFragment(Fragment fragment, Intent intent, int n2, Bundle bundle) {
        this.p();
        super.startActivityFromFragment(fragment, intent, n2, bundle);
        this.o();
    }
}

