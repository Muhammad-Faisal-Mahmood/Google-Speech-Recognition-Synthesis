/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.backup.BackupAgentHelper
 *  android.app.backup.BackupHelper
 *  android.app.backup.SharedPreferencesBackupHelper
 */
package com.google.android.apps.speech.tts.googletts.settings;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;

public class TTSBackupAgent
extends BackupAgentHelper {
    public final void onCreate() {
        this.addHelper("pref_helper", (BackupHelper)new SharedPreferencesBackupHelper(ag$$ExternalSyntheticApiModelOutline1.m(this), new String[]{String.valueOf(this.getPackageName()).concat("_preferences")}));
    }
}

