/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.GooglePlayServicesManifestException;

public final class GooglePlayServicesIncorrectManifestValueException
extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int n2) {
        int n3 = cbp.c;
        StringBuilder stringBuilder = new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        stringBuilder.append(n3);
        stringBuilder.append(" but found ");
        stringBuilder.append(n2);
        stringBuilder.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(stringBuilder.toString());
    }
}

