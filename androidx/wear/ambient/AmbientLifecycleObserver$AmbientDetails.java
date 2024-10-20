/*
 * Decompiled with CFR 0.152.
 */
package androidx.wear.ambient;

public final class AmbientLifecycleObserver$AmbientDetails {
    private final boolean a;
    private final boolean b;

    public AmbientLifecycleObserver$AmbientDetails(boolean bl2, boolean bl3) {
        this.a = bl2;
        this.b = bl3;
    }

    public final boolean getBurnInProtectionRequired() {
        return this.a;
    }

    public final boolean getDeviceHasLowBitAmbient() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AmbientDetails - burnInProtectionRequired: ");
        stringBuilder.append(this.a);
        stringBuilder.append(", deviceHasLowBitAmbient: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

