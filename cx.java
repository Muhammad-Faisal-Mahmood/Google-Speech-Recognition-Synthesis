/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

public final class cx
extends Enum {
    public static final /* enum */ cx a;
    public static final /* enum */ cx b;
    public static final /* enum */ cx c;
    public static final /* enum */ cx d;
    private static final cx[] e;

    static {
        cx cx2;
        cx cx3;
        cx cx4;
        cx cx5;
        a = cx5 = new cx("REMOVED", 0);
        b = cx4 = new cx("VISIBLE", 1);
        c = cx3 = new cx("GONE", 2);
        d = cx2 = new cx("INVISIBLE", 3);
        e = new cx[]{cx5, cx4, cx3, cx2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cx() {
        void var2_-1;
        void var1_-1;
    }

    public static cx[] values() {
        return (cx[])e.clone();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(View view, ViewGroup viewGroup) {
        jse.e(view, "view");
        jse.e(viewGroup, "container");
        int n2 = this.ordinal();
        ViewParent viewParent = null;
        ViewParent viewParent2 = null;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) return;
                    if (by.S(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                    return;
                }
                if (by.S(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(8);
                return;
            }
            if (by.S(2)) {
                Objects.toString(view);
            }
            ViewParent viewParent3 = view.getParent();
            viewParent = viewParent2;
            if (viewParent3 instanceof ViewGroup) {
                viewParent = (ViewGroup)viewParent3;
            }
            if (viewParent == null) {
                if (by.S(2)) {
                    Objects.toString(view);
                    Objects.toString(viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        viewParent2 = view.getParent();
        viewGroup = viewParent;
        if (viewParent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup)viewParent2;
        }
        if (viewGroup == null) return;
        if (by.S(2)) {
            Objects.toString(view);
            Objects.toString(viewGroup);
        }
        viewGroup.removeView(view);
    }
}

