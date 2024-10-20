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
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import j$.util.Objects;

public final class bmd
extends kl {
    private final Drawable a;
    private int b;

    public bmd(Drawable drawable) {
        this.a = drawable;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, ld ld2) {
        int n2;
        super.a(rect, view, recyclerView, ld2);
        if (recyclerView.c(view) == 0) {
            return;
        }
        this.b = n2 = ((LinearLayoutManager)Objects.requireNonNull(recyclerView.n)).k;
        if (n2 == 0) {
            rect.left = this.a.getIntrinsicWidth();
            return;
        }
        rect.top = this.a.getIntrinsicHeight();
    }

    @Override
    public final void b(Canvas canvas, RecyclerView object) {
        int n2;
        int n3 = this.b;
        int n4 = 0;
        if (n3 == 0) {
            int n5 = object.getPaddingTop();
            int n6 = (int)object.getContext().getResources().getDimension(2131165384);
            int n7 = object.getHeight();
            int n8 = object.getPaddingBottom();
            n3 = (int)object.getContext().getResources().getDimension(2131165380);
            ko ko2 = object.n;
            int n9 = ko2.ao();
            for (n2 = n4; n2 < n9 - 1; ++n2) {
                object = ko2.aA(n2);
                kp kp2 = (kp)object.getLayoutParams();
                n4 = object.getRight() + kp2.rightMargin;
                int n10 = this.a.getIntrinsicWidth();
                this.a.setBounds(n4, n5 + n6, n10 + n4, n7 - n8 - n3);
                this.a.draw(canvas);
            }
        } else {
            int n11 = object.getPaddingLeft();
            int n12 = (int)object.getContext().getResources().getDimension(2131165383);
            n4 = object.getWidth();
            n3 = object.getPaddingRight();
            int n13 = (int)object.getContext().getResources().getDimension(2131165381);
            ko ko3 = object.n;
            int n14 = ko3.ao();
            for (n2 = 0; n2 < n14 - 1; ++n2) {
                View view = ko3.aA(n2);
                object = (kp)view.getLayoutParams();
                int n15 = view.getBottom() + ((kp)((Object)object)).bottomMargin;
                int n16 = this.a.getIntrinsicHeight();
                this.a.setBounds(n11 + n12, n15, n4 - n3 - n13, n16 + n15);
                this.a.draw(canvas);
            }
        }
    }
}

