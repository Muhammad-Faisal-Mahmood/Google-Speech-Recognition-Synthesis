/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.Layout
 *  android.view.MenuItem
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;

public final class LicenseActivity
extends dp {
    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((mr)this).setContentView(2131624056);
        Object object = (eys)this.getIntent().getParcelableExtra("license");
        if (this.o() != null) {
            this.o().f(((eys)object).a);
            this.o().h();
            this.o().d(true);
            ((eq)this.o()).p.c(null);
        }
        bundle = (TextView)this.findViewById(2131427710);
        object = crh.E((Context)this, "third_party_licenses", ((eys)object).b, ((eys)object).c);
        if (object == null) {
            this.finish();
            return;
        }
        bundle.setText((CharSequence)object);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView)this.findViewById(2131427709);
        int n2 = bundle.getInt("scroll_pos");
        if (n2 != 0) {
            scrollView.post((Runnable)new mp(this, n2, scrollView, 6));
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView)this.findViewById(2131427709);
        Layout layout = ((TextView)this.findViewById(2131427710)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}

