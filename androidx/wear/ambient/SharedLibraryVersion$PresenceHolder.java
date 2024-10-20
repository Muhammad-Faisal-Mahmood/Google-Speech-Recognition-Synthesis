/*
 * Decompiled with CFR 0.152.
 */
package androidx.wear.ambient;

final class SharedLibraryVersion$PresenceHolder {
    static final boolean a;

    static {
        boolean bl2;
        try {
            Class.forName("com.google.android.wearable.compat.WearableActivityController");
            bl2 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            bl2 = false;
        }
        a = bl2;
    }

    private SharedLibraryVersion$PresenceHolder() {
    }
}

