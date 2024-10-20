/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 */
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class xu {
    public static final xu a;
    public static final xu b;
    public static final xu c;
    public static final xu d;
    public static final xu e;
    public static final xu f;
    public static final xu g;
    public static final xu h;
    public static final xu i;
    final Object j;
    public final int k;
    public final Class l;
    public final yd m;

    static {
        new xu(1);
        new xu(2);
        new xu(4);
        new xu(8);
        new xu(16);
        new xu(32);
        new xu(64);
        new xu(128);
        new xu(256, xw.class);
        new xu(512, xw.class);
        new xu(1024, xx.class);
        new xu(2048, xx.class);
        a = new xu(4096);
        b = new xu(8192);
        new xu(16384);
        new xu(32768);
        new xu(65536);
        new xu(131072, yb.class);
        c = new xu(262144);
        d = new xu(524288);
        e = new xu(0x100000);
        new xu(0x200000, yc.class);
        new xu(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        f = new xu(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, xz.class);
        g = new xu(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new xu(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        h = new xu(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new xu(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        int n2 = Build.VERSION.SDK_INT;
        Object var2_1 = null;
        Object object = n2 >= 29 ? dp$$ExternalSyntheticApiModelOutline0.m() : null;
        new xu(object, 16908358, null, null, null);
        object = Build.VERSION.SDK_INT >= 29 ? dp$$ExternalSyntheticApiModelOutline0.m$1() : null;
        new xu(object, 16908359, null, null, null);
        object = Build.VERSION.SDK_INT >= 29 ? dp$$ExternalSyntheticApiModelOutline0.m$2() : null;
        new xu(object, 16908360, null, null, null);
        object = Build.VERSION.SDK_INT >= 29 ? dp$$ExternalSyntheticApiModelOutline0.m$3() : null;
        new xu(object, 16908361, null, null, null);
        new xu(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new xu(ag$$ExternalSyntheticApiModelOutline1.m(), 16908349, null, null, ya.class);
        new xu(ag$$ExternalSyntheticApiModelOutline0.m(), 16908354, null, null, xy.class);
        object = Build.VERSION.SDK_INT >= 28 ? fs$$ExternalSyntheticApiModelOutline0.m() : null;
        new xu(object, 16908356, null, null, null);
        object = Build.VERSION.SDK_INT >= 28 ? fs$$ExternalSyntheticApiModelOutline0.m$1() : null;
        new xu(object, 16908357, null, null, null);
        object = Build.VERSION.SDK_INT >= 30 ? sk$$ExternalSyntheticApiModelOutline1.m() : null;
        new xu(object, 16908362, null, null, null);
        object = Build.VERSION.SDK_INT >= 30 ? sk$$ExternalSyntheticApiModelOutline1.m$1() : null;
        new xu(object, 16908372, null, null, null);
        object = Build.VERSION.SDK_INT >= 32 ? xu$$ExternalSyntheticApiModelOutline6.m() : null;
        new xu(object, 16908373, null, null, null);
        object = Build.VERSION.SDK_INT >= 32 ? xu$$ExternalSyntheticApiModelOutline6.m$1() : null;
        new xu(object, 16908374, null, null, null);
        object = Build.VERSION.SDK_INT >= 32 ? xu$$ExternalSyntheticApiModelOutline6.m$2() : null;
        new xu(object, 16908375, null, null, null);
        object = Build.VERSION.SDK_INT >= 33 ? a$$ExternalSyntheticApiModelOutline0.m() : null;
        new xu(object, 16908376, null, null, null);
        object = var2_1;
        if (Build.VERSION.SDK_INT >= 34) {
            object = mk$$ExternalSyntheticApiModelOutline0.m();
        }
        i = new xu(object, 16908382, null, null, null);
    }

    public xu(int n2) {
        this(null, n2, null, null, null);
    }

    private xu(int n2, Class clazz) {
        this(null, n2, null, null, clazz);
    }

    public xu(Object object, int n2, CharSequence charSequence, yd object2, Class clazz) {
        this.k = n2;
        this.m = object2;
        object2 = object;
        if (object == null) {
            object2 = new AccessibilityNodeInfo.AccessibilityAction(n2, charSequence);
        }
        this.j = object2;
        this.l = clazz;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction)this.j).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction)this.j).getLabel();
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof xu)) {
            return false;
        }
        object = (xu)object;
        return this.j.equals(((xu)object).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder("AccessibilityActionCompat: ");
        String string2 = string = xv.b(this.k);
        if (string.equals("ACTION_UNKNOWN")) {
            string2 = string;
            if (this.b() != null) {
                string2 = this.b().toString();
            }
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

