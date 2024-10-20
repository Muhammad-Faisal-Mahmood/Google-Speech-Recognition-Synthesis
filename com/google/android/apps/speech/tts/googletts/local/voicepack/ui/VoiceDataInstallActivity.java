/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.Menu
 *  android.view.MenuItem
 */
package com.google.android.apps.speech.tts.googletts.local.voicepack.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.List;

public final class VoiceDataInstallActivity
extends dp
implements bju {
    private btj k;
    private btn l;
    private bxf m;

    final List D() {
        return bvm.a(this.m, this.l, this.k);
    }

    @Override
    public final void a(Insets insets) {
        this.requireViewById(2131427721).setPadding(insets.getLeft(), insets.getTop(), insets.getRight(), insets.getBottom());
    }

    @Override
    protected final void onCreate(Bundle object) {
        if (this.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            this.setTheme(2132083246);
        }
        super.onCreate((Bundle)object);
        ((mr)this).setContentView(2131624059);
        object = this.getApplicationContext();
        this.k = ((bvf)fvd.l((Context)object, bvf.class)).j();
        this.l = ((bvf)fvd.l((Context)object, bvf.class)).k();
        this.m = ((bvf)fvd.l((Context)object, bvf.class)).A();
        Object object2 = this.findViewById(2131427721);
        object = new LinearLayoutManager();
        if (this.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            object2 = (CarUiRecyclerView)object2;
            object2.setLayoutStyle(ble.d((ko)object));
            object2.addItemDecoration(new iw((Context)this, ((LinearLayoutManager)object).k));
            object2.setAdapter(new buo(izk.b((Context)this, this.D())));
        } else {
            object2 = (RecyclerView)object2;
            ((RecyclerView)object2).ac((ko)object);
            ((RecyclerView)object2).t(new iw((Context)this, ((LinearLayoutManager)object).k));
            ((RecyclerView)object2).ab(new buo(izk.b((Context)this, this.D())));
        }
        if (this.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            object = AmbientMode$AmbientCallback.g(this);
            object.setState(bnp.b);
            object.setTitle(2132017506);
            return;
        }
        object = this.o();
        if (object != null) {
            if (this.getPackageManager().hasSystemFeature("android.software.leanback_only")) {
                ((de)object).d(false);
            } else {
                ((de)object).d(true);
            }
            ((de)object).h();
            ((de)object).f(this.getString(2132017506));
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.getPackageManager().hasSystemFeature("android.software.leanback_only")) {
            return false;
        }
        this.getMenuInflater().inflate(2131755008, menu);
        if (brt.b()) {
            menu.findItem(2131427408).setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131427401) {
            this.startActivity(new Intent((Context)this, LicenseMenuActivity.class));
            return true;
        }
        if (menuItem.getItemId() == 2131427408) {
            dkh.a((Context)this);
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

