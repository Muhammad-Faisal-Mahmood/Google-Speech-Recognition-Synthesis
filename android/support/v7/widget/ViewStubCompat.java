/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
extends View {
    public LayoutInflater a;
    private int b = 0;
    private int c;
    private WeakReference d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        context = context.obtainStyledAttributes(attributeSet, er.A, n2, 0);
        this.c = context.getResourceId(2, -1);
        this.b = context.getResourceId(1, 0);
        this.setId(context.getResourceId(0, -1));
        context.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    public final View a() {
        ViewParent viewParent = this.getParent();
        if (viewParent instanceof ViewGroup) {
            if (this.b != 0) {
                ViewGroup viewGroup = (ViewGroup)viewParent;
                LayoutInflater layoutInflater = this.a;
                viewParent = layoutInflater;
                if (layoutInflater == null) {
                    viewParent = LayoutInflater.from((Context)this.getContext());
                }
                viewParent = viewParent.inflate(this.b, viewGroup, false);
                int n2 = this.c;
                if (n2 != -1) {
                    viewParent.setId(n2);
                }
                n2 = viewGroup.indexOfChild((View)this);
                viewGroup.removeViewInLayout((View)this);
                layoutInflater = this.getLayoutParams();
                if (layoutInflater != null) {
                    viewGroup.addView((View)viewParent, n2, (ViewGroup.LayoutParams)layoutInflater);
                } else {
                    viewGroup.addView((View)viewParent, n2);
                }
                this.d = new WeakReference<ViewParent>(viewParent);
                return viewParent;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    protected final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    protected final void onMeasure(int n2, int n3) {
        this.setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int n2) {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            if ((weakReference = (View)weakReference.get()) != null) {
                weakReference.setVisibility(n2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(n2);
        if (n2 != 0 && n2 != 4) {
            return;
        }
        this.a();
    }
}

