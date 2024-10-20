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

final class asv
extends kl {
    public Drawable a;
    public int b;
    public boolean c;
    final ata d;

    public asv(ata ata2) {
        this.d = ata2;
        this.c = true;
    }

    private final boolean c(View object, RecyclerView recyclerView) {
        boolean bl2;
        lg lg2 = recyclerView.i((View)object);
        boolean bl3 = lg2 instanceof atm;
        boolean bl4 = bl2 = false;
        if (bl3) {
            bl4 = bl2;
            if (((atm)lg2).d) {
                bl4 = this.c;
                int n2 = recyclerView.indexOfChild((View)object);
                if (n2 < recyclerView.getChildCount() - 1) {
                    bl3 = true;
                    object = recyclerView.i(recyclerView.getChildAt(n2 + 1));
                    bl4 = bl2;
                    if (object instanceof atm) {
                        bl4 = bl2;
                        if (((atm)object).c) {
                            bl4 = bl3;
                        }
                    }
                }
            }
        }
        return bl4;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, ld ld2) {
        if (this.c(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int n2 = recyclerView.getChildCount();
            int n3 = recyclerView.getWidth();
            for (int i2 = 0; i2 < n2; ++i2) {
                View view = recyclerView.getChildAt(i2);
                if (!this.c(view, recyclerView)) continue;
                int n4 = (int)view.getY() + view.getHeight();
                this.a.setBounds(0, n4, n3, this.b + n4);
                this.a.draw(canvas);
            }
        }
    }
}

