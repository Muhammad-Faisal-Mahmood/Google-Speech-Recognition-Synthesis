/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.MenuItem
 */
package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;

public final class LicenseMenuActivity
extends dp {
    @Override
    protected final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        ((mr)this).setContentView(2131624057);
        if (this.o() != null) {
            this.o().d(true);
        }
        if (!(((by)(object2 = this.bb())).d(2131427712) instanceof eyu)) {
            object = new eyu();
            object2 = new y((by)object2);
            ((ce)object2).c(2131427712, (be)object, null, 1);
            ((ce)object2).b();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

