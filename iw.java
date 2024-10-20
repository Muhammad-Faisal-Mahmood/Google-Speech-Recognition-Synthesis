/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.Log
 *  android.view.View
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public final class iw
extends kl {
    private static final int[] a = new int[]{16843284};
    private final Drawable b;
    private final int c;
    private final Rect d = new Rect();

    public iw(Context context, int n2) {
        TypedArray typedArray = context.obtainStyledAttributes(a);
        context = typedArray.getDrawable(0);
        this.b = context;
        if (context == null) {
            Log.w((String)"DividerItem", (String)"@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArray.recycle();
        int n3 = n2;
        if (n2 != 0) {
            n3 = 1;
        }
        this.c = n3;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, ld ld2) {
        view = this.b;
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.c == 1) {
            rect.set(0, 0, 0, view.getIntrinsicHeight());
            return;
        }
        rect.set(0, 0, view.getIntrinsicWidth(), 0);
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView.n != null && this.b != null) {
            int n2;
            int n3 = this.c;
            int n4 = 0;
            int n5 = 0;
            if (n3 == 1) {
                int n6;
                canvas.save();
                if (recyclerView.i) {
                    n3 = recyclerView.getPaddingLeft();
                    n6 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(n3, recyclerView.getPaddingTop(), n6, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    n6 = recyclerView.getWidth();
                    n3 = 0;
                }
                n4 = recyclerView.getChildCount();
                while (n5 < n4) {
                    View view = recyclerView.getChildAt(n5);
                    RecyclerView.K(view, this.d);
                    int n7 = this.d.bottom + Math.round(view.getTranslationY());
                    int n8 = this.b.getIntrinsicHeight();
                    this.b.setBounds(n3, n7 - n8, n6, n7);
                    this.b.draw(canvas);
                    ++n5;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.i) {
                n2 = recyclerView.getPaddingTop();
                n3 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), n2, recyclerView.getWidth() - recyclerView.getPaddingRight(), n3);
            } else {
                n3 = recyclerView.getHeight();
                n2 = 0;
            }
            int n9 = recyclerView.getChildCount();
            for (n5 = n4; n5 < n9; ++n5) {
                View view = recyclerView.getChildAt(n5);
                RecyclerView.K(view, this.d);
                int n10 = this.d.right + Math.round(view.getTranslationX());
                n4 = this.b.getIntrinsicWidth();
                this.b.setBounds(n10 - n4, n2, n10, n3);
                this.b.draw(canvas);
            }
            canvas.restore();
        }
    }
}

