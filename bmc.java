/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import j$.util.Objects;

public final class bmc
extends kl {
    public int a;
    private final Drawable b;
    private final Drawable c;

    public bmc(Drawable drawable, Drawable drawable2, int n2) {
        this.b = drawable;
        this.c = drawable2;
        this.a = n2;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, ld ld2) {
        view = this.b;
        rect.set(0, 0, view.getIntrinsicWidth(), view.getIntrinsicHeight());
    }

    @Override
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int n2;
        int n3;
        int n4;
        int n5;
        View view;
        ko ko2;
        int n6;
        int n7;
        double d2;
        ko ko3 = Objects.requireNonNull(recyclerView.n);
        double d3 = Math.ceil((double)ko3.ao() / (double)this.a);
        int n8 = 1;
        int n9 = 1;
        while ((d2 = (double)n9) <= d3) {
            if (n9 != 1) {
                n7 = n9 - 1;
                n6 = d2 == d3 ? this.a * n7 : this.a * n9;
                ko2 = ko3.aA(this.a * n7);
                view = ko3.aA(n6 - 1);
                n5 = ko2.getLeft();
                n4 = (int)recyclerView.getContext().getResources().getDimension(2131165383);
                n6 = ko2.getTop();
                n3 = this.c.getIntrinsicHeight();
                n7 = view.getRight();
                n2 = (int)recyclerView.getContext().getResources().getDimension(2131165381);
                this.c.setBounds(n5 + n4, n6 - n3, n7 - n2, n6);
                this.c.draw(canvas);
            }
            ++n9;
        }
        ko2 = Objects.requireNonNull(recyclerView.n);
        n7 = ko2.ao();
        n3 = this.a;
        n5 = n7 / n3;
        n4 = Math.min(n7, n3);
        for (n9 = n8; n9 < n4; ++n9) {
            n6 = n9 < n7 % n3 ? this.a * n5 : (n5 - 1) * this.a;
            view = ko2.aA(n9);
            ko3 = ko2.aA(n6 + n9);
            int n10 = view.getTop();
            int n11 = (int)recyclerView.getContext().getResources().getDimension(2131165384);
            n6 = view.getLeft();
            int n12 = this.b.getIntrinsicWidth();
            n2 = ko3.getBottom();
            n8 = (int)recyclerView.getContext().getResources().getDimension(2131165380);
            this.b.setBounds(n6 - n12, n10 + n11, n6, n2 - n8);
            this.b.draw(canvas);
        }
    }
}

