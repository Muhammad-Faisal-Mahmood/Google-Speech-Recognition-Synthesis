/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.DialogInterface
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
import android.content.DialogInterface;
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

public class fos
extends at {
    protected final fnv ag = new fnv();

    @Override
    public void c() {
        this.ag.e();
        super.c();
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        this.ag.a(bundle);
        super.onActivityCreated(bundle);
    }

    @Override
    public void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        this.ag.K();
    }

    @Override
    public void onAttach(Activity activity) {
        this.ag.j();
        super.onAttach(activity);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.ag.L();
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.ag.M();
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.ag.y(bundle);
        super.onCreate(bundle);
    }

    @Override
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.ag.N();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.ag.O()) {
            this.setHasOptionsMenu(true);
        }
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ag.g(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void onDestroy() {
        ((fnx)this.ag).d();
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        this.ag.b();
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        this.ag.c();
        super.onDetach();
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        this.ag.e();
        super.onDismiss(dialogInterface);
    }

    @Override
    public final void onLowMemory() {
        this.ag.z();
        super.onLowMemory();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.ag.P();
    }

    @Override
    public void onPause() {
        this.ag.f();
        super.onPause();
    }

    @Override
    public final void onPrepareOptionsMenu(Menu menu) {
        if (this.ag.Q()) {
            this.setHasOptionsMenu(true);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        this.ag.R();
    }

    @Override
    public void onResume() {
        fhq.f(this.getChildFragmentManager());
        this.ag.A();
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        this.ag.B(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override
    public void onStart() {
        fhq.f(this.getChildFragmentManager());
        this.ag.C();
        super.onStart();
    }

    @Override
    public void onStop() {
        this.ag.D();
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        this.ag.k(bundle);
    }

    @Override
    public final void setUserVisibleHint(boolean bl2) {
        this.ag.h(bl2);
        super.setUserVisibleHint(bl2);
    }
}

