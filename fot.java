/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class fot
extends be {
    protected final fnv a = new fnv();

    @Override
    public void onActivityCreated(Bundle bundle) {
        this.a.a(bundle);
        super.onActivityCreated(bundle);
    }

    @Override
    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        this.a.K();
    }

    @Override
    public void onAttach(Activity activity) {
        this.a.j();
        super.onAttach(activity);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.L();
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.a.M();
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.a.y(bundle);
        super.onCreate(bundle);
    }

    @Override
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.a.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.a.O()) {
            this.setHasOptionsMenu(true);
        }
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.g(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void onDestroy() {
        ((fnx)this.a).d();
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        this.a.b();
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        this.a.c();
        super.onDetach();
    }

    @Override
    public final void onLowMemory() {
        this.a.z();
        super.onLowMemory();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.a.P();
    }

    @Override
    public void onPause() {
        this.a.f();
        super.onPause();
    }

    @Override
    public final void onPrepareOptionsMenu(Menu menu) {
        if (this.a.Q()) {
            this.setHasOptionsMenu(true);
        }
    }

    @Override
    public void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        this.a.R();
    }

    @Override
    public void onResume() {
        this.a.A();
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        this.a.B(bundle);
    }

    @Override
    public void onStart() {
        this.a.C();
        super.onStart();
    }

    @Override
    public void onStop() {
        this.a.D();
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        this.a.k(bundle);
    }

    @Override
    public final void setUserVisibleHint(boolean bl2) {
        this.a.h(bl2);
        super.setUserVisibleHint(bl2);
    }
}

