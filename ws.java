/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsAnimation$Bounds
 */
import android.view.WindowInsetsAnimation;

public final class ws {
    public final tg a;
    public final tg b;

    public ws(WindowInsetsAnimation.Bounds bounds) {
        this.a = tg.e(sk$$ExternalSyntheticApiModelOutline1.m(bounds));
        this.b = tg.e(sk$$ExternalSyntheticApiModelOutline1.m$1(bounds));
    }

    public ws(tg tg2, tg tg3) {
        this.a = tg2;
        this.b = tg3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Bounds{lower=");
        stringBuilder.append(this.a);
        stringBuilder.append(" upper=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

