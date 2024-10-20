/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.view.InputDevice
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.WindowInsets
 */
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

public class vy {
    public vy() {
    }

    public vy(Context context) {
        context.getApplicationContext();
    }

    public vy(Context context, Handler handler) {
        context.getApplicationContext();
        new aib(handler);
    }

    public vy(byte[] byArray) {
    }

    static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static WindowInsets c(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void d(View view) {
        view.requestApplyInsets();
    }

    public static int e(Resources resources, int n2, uq uq2, int n3) {
        if (n2 != -1) {
            if (n2 != 0 && (n2 = resources.getDimensionPixelSize(n2)) >= 0) {
                return n2;
            }
            return n3;
        }
        return (Integer)uq2.a();
    }

    public static int f(Resources resources, String string, String string2) {
        return resources.getIdentifier(string, string2, "android");
    }

    public static boolean g(int n2, int n3, int n4) {
        InputDevice inputDevice = InputDevice.getDevice((int)n2);
        return inputDevice != null && inputDevice.getMotionRange(n3, n4) != null;
    }

    public static boolean h(MotionEvent motionEvent, int n2) {
        return (motionEvent.getSource() & n2) == n2;
    }

    public static int i(int n2) {
        return n2 & 0x180;
    }

    public static int j(int n2) {
        return n2 & 7;
    }

    public static int k(int n2) {
        return n2 & 0x40;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean l(int n2, boolean bl2) {
        boolean bl3;
        n2 = vy.j(n2);
        boolean bl4 = bl3 = true;
        if (n2 == 4) return bl4;
        if (!bl2) return false;
        if (n2 != 3) return false;
        return bl3;
    }

    public static int m(int n2, int n3, int n4) {
        return vy.n(n2, n3, n4, 0, 128);
    }

    public static int n(int n2, int n3, int n4, int n5, int n6) {
        return n2 | n3 | n4 | n5 | n6;
    }

    public void a() {
    }
}

