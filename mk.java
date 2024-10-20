/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.BackEvent
 */
import android.window.BackEvent;

public final class mk {
    public final float a;
    private final float b;
    private final float c;
    private final int d;

    public mk(BackEvent backEvent) {
        jse.e(backEvent, "backEvent");
        jse.e(backEvent, "backEvent");
        float f2 = mk$$ExternalSyntheticApiModelOutline0.m(backEvent);
        jse.e(backEvent, "backEvent");
        float f3 = mk$$ExternalSyntheticApiModelOutline0.m$1(backEvent);
        jse.e(backEvent, "backEvent");
        float f4 = mk$$ExternalSyntheticApiModelOutline0.m$2(backEvent);
        jse.e(backEvent, "backEvent");
        int n2 = mk$$ExternalSyntheticApiModelOutline0.m(backEvent);
        this.b = f2;
        this.c = f3;
        this.a = f4;
        this.d = n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BackEventCompat{touchX=");
        stringBuilder.append(this.b);
        stringBuilder.append(", touchY=");
        stringBuilder.append(this.c);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.a);
        stringBuilder.append(", swipeEdge=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

