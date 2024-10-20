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

public abstract class for
extends ata {
    protected final fnv d = new fnv();

    @Override
    public void onActivityCreated(Bundle bundle) {
        this.d.a(bundle);
        super.onActivityCreated(bundle);
    }

    @Override
    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        this.d.K();
    }

    @Override
    public void onAttach(Activity activity) {
        this.d.j();
        super.onAttach(activity);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.d.L();
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.d.M();
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.d.y(bundle);
        super.onCreate(bundle);
    }

    @Override
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.d.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.d.O()) {
            this.setHasOptionsMenu(true);
        }
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d.g(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void onDestroy() {
        ((fnx)this.d).d();
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        this.d.b();
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        this.d.c();
        super.onDetach();
    }

    @Override
    public final void onLowMemory() {
        this.d.z();
        super.onLowMemory();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.d.P();
    }

    @Override
    public void onPause() {
        this.d.f();
        super.onPause();
    }

    @Override
    public final void onPrepareOptionsMenu(Menu menu) {
        if (this.d.Q()) {
            this.setHasOptionsMenu(true);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        this.d.R();
    }

    @Override
    public void onResume() {
        fhq.f(this.getChildFragmentManager());
        this.d.A();
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        this.d.B(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override
    public void onStart() {
        fhq.f(this.getChildFragmentManager());
        this.d.C();
        super.onStart();
    }

    @Override
    public void onStop() {
        this.d.D();
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        this.d.k(bundle);
        super.onViewCreated(view, bundle);
    }

    @Override
    public final void setUserVisibleHint(boolean bl2) {
        this.d.h(bl2);
        super.setUserVisibleHint(bl2);
    }
}

