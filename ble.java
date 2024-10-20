/*
 * Decompiled with CFR 0.152.
 */
import android.support.v7.widget.LinearLayoutManager;

public final class ble
implements bld {
    public int a = 1;
    public boolean b = false;

    public static ble d(ko ko2) {
        if (ko2 == null) {
            return null;
        }
        if (ko2 instanceof LinearLayoutManager) {
            ble ble2 = new ble();
            ko2 = (LinearLayoutManager)ko2;
            int n2 = ((LinearLayoutManager)ko2).k != 0 ? 1 : 0;
            ble2.a = n2;
            ble2.b = ((LinearLayoutManager)ko2).m;
            return ble2;
        }
        throw new AssertionError((Object)"LinearLayoutManager required.");
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final int b() {
        return this.a;
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final boolean f() {
        return this.b;
    }
}

