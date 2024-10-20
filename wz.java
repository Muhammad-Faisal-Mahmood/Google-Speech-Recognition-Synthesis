/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsets
 *  android.view.WindowInsetsAnimation
 *  android.view.WindowInsetsAnimation$Bounds
 */
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class wz
extends WindowInsetsAnimation$Callback {
    private final wt a;
    private List b;
    private ArrayList c;
    private final HashMap d = new HashMap();

    public wz(wt wt2) {
        super(0);
        this.a = wt2;
    }

    private final ilo a(WindowInsetsAnimation windowInsetsAnimation) {
        ilo ilo2;
        ilo ilo3 = ilo2 = (ilo)this.d.get(windowInsetsAnimation);
        if (ilo2 == null) {
            ilo3 = new ilo(windowInsetsAnimation);
            this.d.put(windowInsetsAnimation, ilo3);
        }
        return ilo3;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a(windowInsetsAnimation);
        this.a.a();
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(this.a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets object, List object2) {
        WindowInsetsAnimation windowInsetsAnimation = this.c;
        if (windowInsetsAnimation == null) {
            this.c = windowInsetsAnimation = new ArrayList(object2.size());
            this.b = DesugarCollections.unmodifiableList(windowInsetsAnimation);
        } else {
            windowInsetsAnimation.clear();
        }
        int n2 = object2.size();
        while (--n2 >= 0) {
            windowInsetsAnimation = sk$$ExternalSyntheticApiModelOutline1.m(object2.get(n2));
            ilo ilo2 = this.a(windowInsetsAnimation);
            ilo2.h(sk$$ExternalSyntheticApiModelOutline1.m(windowInsetsAnimation));
            this.c.add(ilo2);
        }
        object2 = this.a;
        object = xn.m((WindowInsets)object);
        ((wt)object2).b(this.b);
        return ((xn)object).e();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation object, WindowInsetsAnimation.Bounds object2) {
        object = this.a((WindowInsetsAnimation)object);
        object2 = new ws((WindowInsetsAnimation.Bounds)object2);
        this.a.d((ilo)object, (ws)object2);
        object = ((ws)object2).a;
        object2 = ((ws)object2).b;
        return new WindowInsetsAnimation.Bounds(((tg)object).a(), ((tg)object2).a());
    }
}

