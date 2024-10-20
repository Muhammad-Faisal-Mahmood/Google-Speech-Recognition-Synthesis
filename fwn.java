/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class fwn
implements vk {
    final fwp a;
    final fue b;

    public fwn(fue fue2, fwp fwp2) {
        this.b = fue2;
        this.a = fwp2;
    }

    @Override
    public final xn a(View object, xn xn2) {
        int n2;
        int n3;
        int n4;
        boolean bl2;
        fue fue2;
        tg tg2;
        block13: {
            fwp fwp2;
            block12: {
                int n5;
                block11: {
                    int n6;
                    int n7;
                    fwp2 = new fwp(this.a);
                    tg tg3 = xn2.f(7);
                    n5 = tg3.c;
                    tg2 = xn2.f(32);
                    fue2 = this.b;
                    fue2.b.m = n5;
                    bl2 = fvd.c((View)object);
                    n4 = object.getPaddingBottom();
                    n3 = object.getPaddingLeft();
                    n2 = object.getPaddingRight();
                    BottomSheetBehavior bottomSheetBehavior = fue2.b;
                    if (bottomSheetBehavior.f) {
                        bottomSheetBehavior.l = xn2.a();
                        n4 = fwp2.d + fue2.b.l;
                    }
                    bottomSheetBehavior = fue2.b;
                    if (bottomSheetBehavior.g) {
                        n5 = bl2 ? fwp2.c : fwp2.a;
                        n3 = n5 + tg3.b;
                    }
                    if (bottomSheetBehavior.h) {
                        n5 = bl2 ? fwp2.a : fwp2.c;
                        n2 = n5 + tg3.d;
                    }
                    fwp2 = (ViewGroup.MarginLayoutParams)object.getLayoutParams();
                    bl2 = fue2.b.i;
                    int n8 = 1;
                    n5 = n7 = 0;
                    if (bl2) {
                        n6 = ((ViewGroup.MarginLayoutParams)fwp2).leftMargin;
                        int n9 = tg3.b;
                        n5 = n7;
                        if (n6 != n9) {
                            ((ViewGroup.MarginLayoutParams)fwp2).leftMargin = n9;
                            n5 = 1;
                        }
                    }
                    if (fue2.b.j && (n7 = ((ViewGroup.MarginLayoutParams)fwp2).rightMargin) != (n6 = tg3.d)) {
                        ((ViewGroup.MarginLayoutParams)fwp2).rightMargin = n6;
                        n5 = n8;
                    }
                    if (!fue2.b.k || (n7 = ((ViewGroup.MarginLayoutParams)fwp2).topMargin) == (n8 = tg3.c)) break block11;
                    ((ViewGroup.MarginLayoutParams)fwp2).topMargin = n8;
                    break block12;
                }
                if (n5 == 0) break block13;
            }
            object.setLayoutParams((ViewGroup.LayoutParams)fwp2);
        }
        object.setPadding(n3, object.getPaddingTop(), n2, n4);
        bl2 = fue2.a;
        if (bl2) {
            fue2.b.e = tg2.e;
        }
        object = fue2.b;
        if (((BottomSheetBehavior)object).f || bl2) {
            ((BottomSheetBehavior)object).Q();
        }
        return xn2;
    }
}

