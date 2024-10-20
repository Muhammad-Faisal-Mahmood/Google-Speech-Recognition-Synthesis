/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public final class axp
extends ayc {
    private static final String[] u = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property v = new axh(PointF.class);
    private static final Property w = new axi(PointF.class);
    private static final Property x = new axj(PointF.class);
    private static final Property y = new axk(PointF.class);
    private static final Property z = new axl(PointF.class);

    private static final void f(aym aym2) {
        View view = aym2.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        aym2.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        aym2.a.put("android:changeBounds:parent", aym2.b.getParent());
    }

    @Override
    public final Animator a(ViewGroup viewGroup, aym object, aym aym2) {
        block14: {
            block15: {
                int n2;
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                Rect rect;
                ViewGroup viewGroup2;
                block22: {
                    int n15;
                    block21: {
                        block19: {
                            int n16;
                            block18: {
                                int n17;
                                block20: {
                                    block17: {
                                        block16: {
                                            if (object == null || aym2 == null) break block14;
                                            viewGroup2 = (ViewGroup)((aym)object).a.get("android:changeBounds:parent");
                                            viewGroup = (ViewGroup)aym2.a.get("android:changeBounds:parent");
                                            if (viewGroup2 == null || viewGroup == null) break block15;
                                            viewGroup2 = aym2.b;
                                            rect = (Rect)((aym)object).a.get("android:changeBounds:bounds");
                                            viewGroup = (Rect)aym2.a.get("android:changeBounds:bounds");
                                            n14 = rect.left;
                                            n13 = viewGroup.left;
                                            n12 = rect.top;
                                            n11 = viewGroup.top;
                                            n10 = rect.right;
                                            n9 = viewGroup.right;
                                            n8 = rect.bottom;
                                            n7 = viewGroup.bottom;
                                            n6 = n10 - n14;
                                            n15 = n8 - n12;
                                            n5 = n9 - n13;
                                            n16 = n7 - n11;
                                            viewGroup = (Rect)((aym)object).a.get("android:changeBounds:clip");
                                            object = (Rect)aym2.a.get("android:changeBounds:clip");
                                            n4 = n15;
                                            if (n6 == 0) break block16;
                                            n17 = n15;
                                            if (n15 != 0) break block17;
                                            n4 = 0;
                                        }
                                        if (n5 == 0) break block18;
                                        n17 = n4;
                                        if (n16 != 0) break block17;
                                        n3 = 0;
                                        n15 = 0;
                                        n2 = n4;
                                        break block19;
                                    }
                                    n4 = n14 == n13 && n12 == n11 ? 0 : 1;
                                    if (n10 != n9) break block20;
                                    n2 = n17;
                                    n3 = n16;
                                    n15 = n4;
                                    if (n8 == n7) break block19;
                                }
                                n15 = n4 + 1;
                                n2 = n17;
                                n3 = n16;
                                break block19;
                            }
                            n15 = 0;
                            n3 = n16;
                            n2 = n4;
                        }
                        if (viewGroup != null && !viewGroup.equals(object)) break block21;
                        n4 = n15;
                        if (viewGroup != null) break block22;
                        n4 = n15;
                        if (object == null) break block22;
                    }
                    n4 = n15 + 1;
                }
                if (n4 > 0) {
                    ayr.b((View)viewGroup2, n14, n12, n10, n8);
                    if (n4 == 2) {
                        float f2 = n11;
                        float f3 = n13;
                        float f4 = n12;
                        float f5 = n14;
                        if (n6 == n5 && n2 == n3) {
                            viewGroup = yj.k(f5, f4, f3, f2);
                            viewGroup = yj.l(viewGroup2, z, (Path)viewGroup);
                        } else {
                            float f6 = n7;
                            float f7 = n9;
                            float f8 = n8;
                            float f9 = n10;
                            object = new axo((View)viewGroup2);
                            viewGroup = yj.k(f5, f4, f3, f2);
                            aym2 = yj.l(object, v, (Path)viewGroup);
                            viewGroup = yj.k(f9, f8, f7, f6);
                            rect = yj.l(object, w, (Path)viewGroup);
                            viewGroup = new AnimatorSet();
                            viewGroup.playTogether(new Animator[]{aym2, rect});
                            viewGroup.addListener((Animator.AnimatorListener)new axm((axo)object));
                        }
                    } else if (n14 == n13 && n12 == n11) {
                        float f10 = n7;
                        float f11 = n9;
                        float f12 = n8;
                        viewGroup = yj.k(n10, f12, f11, f10);
                        viewGroup = yj.l(viewGroup2, x, (Path)viewGroup);
                    } else {
                        viewGroup = yj.k(n14, n12, n13, n11);
                        viewGroup = yj.l(viewGroup2, y, (Path)viewGroup);
                    }
                    if (viewGroup2.getParent() instanceof ViewGroup) {
                        object = (ViewGroup)viewGroup2.getParent();
                        ayo.a((ViewGroup)object, true);
                        this.j().D(new axn((ViewGroup)object));
                    }
                    return viewGroup;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void b(aym aym2) {
        axp.f(aym2);
    }

    @Override
    public final void c(aym aym2) {
        axp.f(aym2);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final String[] e() {
        return u;
    }
}

