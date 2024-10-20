/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewPropertyAnimator
 *  android.widget.FrameLayout
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2
 *  com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.OnChildAttachStateChangeListenerOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV3
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV3$OnScrollListenerOEMV3
 *  com.android.car.ui.plugin.oemapis.recyclerview.ViewHolderOEMV1
 */
package com.android.car.ui.recyclerview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.OnChildAttachStateChangeListenerOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV3;
import com.android.car.ui.plugin.oemapis.recyclerview.ViewHolderOEMV1;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.android.car.ui.recyclerview.RecyclerViewAdapterAdapterV2;
import com.android.car.ui.recyclerview.RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1;
import com.android.car.ui.recyclerview.RecyclerViewAdapterV3$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class RecyclerViewAdapterV3
extends FrameLayout
implements CarUiRecyclerView,
RecyclerViewOEMV3.OnScrollListenerOEMV3,
OnChildAttachStateChangeListenerOEMV1,
bkt,
boe {
    private kf mAdapter;
    private final List mChildAttachStateChangeListeners;
    private int mHeight;
    private bld mLayoutStyle;
    private AdapterOEMV2 mOEMAdapter;
    private RecyclerViewOEMV3 mOEMRecyclerView;
    private bmb mRecyclerView;
    private final List mScrollListeners = new ArrayList();
    private int mWidth;

    public RecyclerViewAdapterV3(Context context) {
        this(context, null);
    }

    public RecyclerViewAdapterV3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewAdapterV3(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2, 0);
        this.mChildAttachStateChangeListeners = new ArrayList();
        this.setBackground(null);
        this.setPadding(0, 0, 0, 0);
    }

    private static int toInternalScrollState(int n2) {
        int n3 = 1;
        if (n2 != 1) {
            n3 = 2;
            if (n2 != 2) {
                return 0;
            }
        }
        return n3;
    }

    @Override
    public void addItemDecoration(kl kl2) {
    }

    public void addItemDecoration(kl kl2, int n2) {
    }

    @Override
    public void addOnChildAttachStateChangeListener(kq kq2) {
        this.mChildAttachStateChangeListeners.add(kq2);
    }

    @Override
    public void addOnLayoutCompleteListener(Runnable runnable) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.addOnLayoutCompleteListener(runnable);
        }
    }

    public void addOnScrollListener(blk blk2) {
        this.mScrollListeners.add(blk2);
    }

    public ViewPropertyAnimator animate() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.getView().animate();
        }
        throw new IllegalStateException("OEMRecyclerView is not initialized!");
    }

    public boolean canScrollHorizontally(int n2) {
        return this.mOEMRecyclerView.getView().canScrollHorizontally(n2);
    }

    public boolean canScrollVertically(int n2) {
        return this.mOEMRecyclerView.getView().canScrollVertically(n2);
    }

    public void clearOnChildAttachStateChangeListeners() {
        this.mChildAttachStateChangeListeners.clear();
        this.mOEMRecyclerView.clearOnScrollListeners();
    }

    public void clearOnScrollListeners() {
        this.mScrollListeners.clear();
        this.mOEMRecyclerView.clearOnScrollListeners();
    }

    public int findFirstCompletelyVisibleItemPosition() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.findFirstCompletelyVisibleItemPosition();
        }
        return 0;
    }

    public int findFirstVisibleItemPosition() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.findFirstVisibleItemPosition();
        }
        return 0;
    }

    public int findLastCompletelyVisibleItemPosition() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.findLastCompletelyVisibleItemPosition();
        }
        return 0;
    }

    public int findLastVisibleItemPosition() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.findLastVisibleItemPosition();
        }
        return 0;
    }

    public View findViewByPosition(int n2) {
        return this.mOEMRecyclerView.findViewByPosition(n2);
    }

    @Override
    public lg findViewHolderForAdapterPosition(int n2) {
        ViewHolderOEMV1 viewHolderOEMV1 = this.mOEMRecyclerView.findViewHolderForAdapterPosition(n2);
        if (viewHolderOEMV1 instanceof RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1) {
            return ((RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1)viewHolderOEMV1).getViewHolder();
        }
        return null;
    }

    public lg findViewHolderForLayoutPosition(int n2) {
        ViewHolderOEMV1 viewHolderOEMV1 = this.mOEMRecyclerView.findViewHolderForLayoutPosition(n2);
        if (viewHolderOEMV1 instanceof RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1) {
            return ((RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1)viewHolderOEMV1).getViewHolder();
        }
        return null;
    }

    @Override
    public kf getAdapter() {
        return this.mAdapter;
    }

    @Override
    public int getChildLayoutPosition(View view) {
        return this.mOEMRecyclerView.getChildLayoutPosition(view);
    }

    public int getDecoratedEnd(View view) {
        return this.mOEMRecyclerView.getDecoratedEnd(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        return this.mOEMRecyclerView.getDecoratedMeasuredHeight(view);
    }

    public int getDecoratedMeasuredWidth(View view) {
        return this.mOEMRecyclerView.getDecoratedMeasuredWidth(view);
    }

    public int getDecoratedMeasurement(View view) {
        return this.mOEMRecyclerView.getDecoratedMeasurement(view);
    }

    public int getDecoratedMeasurementInOther(View view) {
        return this.mOEMRecyclerView.getDecoratedMeasurementInOther(view);
    }

    public int getDecoratedStart(View view) {
        return this.mOEMRecyclerView.getDecoratedStart(view);
    }

    public int getEndAfterPadding() {
        return this.mOEMRecyclerView.getEndAfterPadding();
    }

    public kl getItemDecorationAt(int n2) {
        return null;
    }

    public int getItemDecorationCount() {
        return 0;
    }

    @Deprecated
    public ko getLayoutManager() {
        return null;
    }

    public bld getLayoutStyle() {
        return this.mLayoutStyle;
    }

    public int getPaddingBottom() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.getView().getPaddingBottom();
        }
        return super.getPaddingBottom();
    }

    public int getPaddingEnd() {
        if (this.getContext().getResources().getConfiguration().getLayoutDirection() == 0) {
            return this.getPaddingRight();
        }
        return this.getPaddingLeft();
    }

    public int getPaddingLeft() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.getView().getPaddingLeft();
        }
        return super.getPaddingLeft();
    }

    public int getPaddingRight() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.getView().getPaddingRight();
        }
        return super.getPaddingRight();
    }

    public int getPaddingStart() {
        if (this.getContext().getResources().getConfiguration().getLayoutDirection() == 0) {
            return this.getPaddingLeft();
        }
        return this.getPaddingRight();
    }

    public int getPaddingTop() {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            return recyclerViewOEMV3.getView().getPaddingTop();
        }
        return super.getPaddingTop();
    }

    @Override
    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public View getRecyclerViewChildAt(int n2) {
        return this.mOEMRecyclerView.getRecyclerViewChildAt(n2);
    }

    public int getRecyclerViewChildCount() {
        return this.mOEMRecyclerView.getRecyclerViewChildCount();
    }

    public int getRecyclerViewChildPosition(View view) {
        return this.mOEMRecyclerView.getRecyclerViewChildPosition(view);
    }

    public int getScrollState() {
        return RecyclerViewAdapterV3.toInternalScrollState(this.mOEMRecyclerView.getScrollState());
    }

    public int getStartAfterPadding() {
        return this.mOEMRecyclerView.getStartAfterPadding();
    }

    public int getTotalSpace() {
        return this.mOEMRecyclerView.getTotalSpace();
    }

    @Override
    public View getView() {
        return this;
    }

    public boolean hasFixedSize() {
        return this.mOEMRecyclerView.hasFixedSize();
    }

    @Override
    public void invalidateItemDecorations() {
    }

    @Override
    public boolean isLayoutCompleted() {
        kf kf2 = this.getAdapter();
        return kf2 != null && kf2.getItemCount() > 0 && (kf2 = this.mOEMRecyclerView) != null && !kf2.isComputingLayout();
    }

    public void onChildViewAttachedToWindow(View view) {
        Iterator iterator = this.mChildAttachStateChangeListeners.iterator();
        while (iterator.hasNext()) {
            ((kq)iterator.next()).a(view);
        }
    }

    public void onChildViewDetachedFromWindow(View object) {
        object = this.mChildAttachStateChangeListeners.iterator();
        while (object.hasNext()) {
            ((kq)object.next()).b();
        }
    }

    public void onScrollStateChanged(RecyclerViewOEMV3 object, int n2) {
        object = this.mScrollListeners.iterator();
        while (object.hasNext()) {
            ((blk)object.next()).a();
        }
    }

    public void onScrolled(RecyclerViewOEMV3 object, int n2, int n3) {
        object = this.mScrollListeners.iterator();
        while (object.hasNext()) {
            ((blk)object.next()).b();
        }
    }

    public void removeItemDecoration(kl kl2) {
    }

    public void removeItemDecorationAt(int n2) {
    }

    public void removeOnChildAttachStateChangeListener(kq kq2) {
        this.mChildAttachStateChangeListeners.remove(kq2);
    }

    @Override
    public void removeOnLayoutCompleteListener(Runnable runnable) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.removeOnLayoutCompleteListener(runnable);
        }
    }

    public void removeOnScrollListener(blk blk2) {
        this.mScrollListeners.remove(blk2);
    }

    public void scrollBy(int n2, int n3) {
        this.mOEMRecyclerView.getView().scrollBy(n2, n3);
    }

    @Override
    public void scrollToPosition(int n2) {
        this.mOEMRecyclerView.scrollToPosition(n2);
    }

    public void scrollToPositionWithOffset(int n2, int n3) {
        this.mOEMRecyclerView.scrollToPositionWithOffset(n2, n3);
    }

    @Override
    public void setAdapter(kf kf2) {
        if (kf2 == null) {
            this.mAdapter = null;
            this.mOEMAdapter = null;
            this.mOEMRecyclerView.setAdapter(null);
            return;
        }
        Object object = this.mAdapter;
        if (object instanceof blj) {
            ((blj)object).b();
        }
        this.mAdapter = kf2;
        object = new RecyclerViewAdapterAdapterV2(this.getContext(), kf2);
        this.mOEMAdapter = object;
        this.mOEMRecyclerView.setAdapter((AdapterOEMV2)object);
        if (kf2 instanceof blj) {
            ((blj)((Object)kf2)).a();
        }
    }

    public void setAlpha(float f2) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.setAlpha(f2);
        }
    }

    public void setBackground(Drawable drawable) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.getView().setBackground(drawable);
        }
    }

    public void setBackgroundColor(int n2) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.getView().setBackgroundColor(n2);
        }
    }

    public void setBackgroundResource(int n2) {
        if (this.mOEMRecyclerView != null) {
            Drawable drawable = this.getResources().getDrawable(n2);
            this.mOEMRecyclerView.getView().setBackground(drawable);
        }
    }

    @Override
    public void setClipToPadding(boolean bl2) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.setClipToPadding(bl2);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.mOEMRecyclerView.setContentDescription(charSequence);
    }

    public void setHasFixedSize(boolean bl2) {
        this.mOEMRecyclerView.setHasFixedSize(bl2);
    }

    public void setItemAnimator(kk kk2) {
    }

    public void setLayoutManager(ko ko2) {
        if (ko2 instanceof GridLayoutManager) {
            this.setLayoutStyle(blb.d(ko2));
            return;
        }
        this.setLayoutStyle(ble.d(ko2));
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Rect rect;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            rect = new Rect(Math.max(marginLayoutParams.leftMargin, marginLayoutParams.getMarginStart()), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, Math.max(marginLayoutParams.bottomMargin, marginLayoutParams.getMarginEnd()));
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
        } else {
            rect = null;
        }
        marginLayoutParams = this.mOEMRecyclerView;
        if (marginLayoutParams != null) {
            marginLayoutParams = marginLayoutParams.getView().getLayoutParams();
            int n2 = layoutParams.width;
            int n3 = -1;
            n2 = n2 == 0 ? -1 : layoutParams.width;
            marginLayoutParams.width = n2;
            n2 = layoutParams.height == 0 ? n3 : layoutParams.height;
            marginLayoutParams.height = n2;
            if (rect != null && marginLayoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
        this.mWidth = layoutParams.width;
        this.mHeight = layoutParams.height;
        super.setLayoutParams(layoutParams);
    }

    @Override
    public void setLayoutStyle(bld object) {
        this.mLayoutStyle = object;
        if (object == null) {
            this.mOEMRecyclerView.setLayoutStyle(null);
            return;
        }
        object = new RecyclerViewAdapterV3$1(this, (bld)object);
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.setLayoutStyle((LayoutStyleOEMV1)object);
        }
    }

    public void setOemRecyclerView(RecyclerViewOEMV3 object, RecyclerViewAttributesOEMV1 recyclerViewAttributesOEMV1) {
        this.mOEMRecyclerView = object;
        LayoutStyleOEMV1 layoutStyleOEMV1 = object.getLayoutStyle();
        if (layoutStyleOEMV1.getLayoutType() == 1) {
            object = new blb();
            ((blb)object).b = layoutStyleOEMV1.getReverseLayout();
            ((blb)object).e(layoutStyleOEMV1.getSpanCount());
            ((blb)object).a = layoutStyleOEMV1.getOrientation();
            if (recyclerViewAttributesOEMV1 != null) {
                recyclerViewAttributesOEMV1.getSize();
            }
        } else {
            object = new ble();
            ((ble)object).b = layoutStyleOEMV1.getReverseLayout();
            ((ble)object).a = layoutStyleOEMV1.getOrientation();
            if (recyclerViewAttributesOEMV1 != null) {
                recyclerViewAttributesOEMV1.getSize();
            }
        }
        this.mLayoutStyle = object;
        recyclerViewAttributesOEMV1 = new FrameLayout(this.getContext());
        this.mRecyclerView = object = new bmb(this.getContext(), this);
        recyclerViewAttributesOEMV1.addView((View)object);
        this.mOEMRecyclerView.addOnScrollListener((RecyclerViewOEMV3.OnScrollListenerOEMV3)this);
        this.mOEMRecyclerView.addOnChildAttachStateChangeListener((OnChildAttachStateChangeListenerOEMV1)this);
        object = new ViewGroup.MarginLayoutParams(this.mWidth, this.mHeight);
        this.addView(this.mOEMRecyclerView.getView(), (ViewGroup.LayoutParams)object);
    }

    public void setOnFlingListener(kr kr2) {
    }

    @Override
    public void setPadding(int n2, int n3, int n4, int n5) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.getView().setPadding(n2, n3, n4, n5);
        }
    }

    public void setPaddingRelative(int n2, int n3, int n4, int n5) {
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOEMRecyclerView;
        if (recyclerViewOEMV3 != null) {
            recyclerViewOEMV3.getView().setPaddingRelative(n2, n3, n4, n5);
        }
    }

    public void setSpanSizeLookup(jm jm2) {
        bld bld2 = this.mLayoutStyle;
        if (bld2 instanceof blb) {
            ((blb)bld2).c = jm2;
            this.setLayoutStyle(bld2);
        }
    }

    public void smoothScrollBy(int n2, int n3) {
        this.mOEMRecyclerView.smoothScrollBy(n2, n3);
    }

    public void smoothScrollToPosition(int n2) {
        this.mOEMRecyclerView.smoothScrollToPosition(n2);
    }
}

