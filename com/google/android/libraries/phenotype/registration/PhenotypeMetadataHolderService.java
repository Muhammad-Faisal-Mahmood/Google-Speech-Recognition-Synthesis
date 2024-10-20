/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.IBinder
 */
package com.google.android.libraries.phenotype.registration;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class PhenotypeMetadataHolderService
extends Service {
    private PhenotypeMetadataHolderService() {
    }

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}

