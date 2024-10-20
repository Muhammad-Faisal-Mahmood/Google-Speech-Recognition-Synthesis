/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.Scroller
 */
package com.android.car.ui.recyclerview;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import j$.util.Objects;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DefaultScrollBar {
    private final kh mAdapterChangeObserver;
    private float mButtonDisabledAlpha;
    private final SparseArray mChildHeightByAdapterPosition = new SparseArray();
    private Context mContext;
    private View mDownButton;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private kc mOrientationHelper;
    private bma mPageDownOnContinuousScrollListener;
    private bma mPageUpOnContinuousScrollListener;
    private final Interpolator mPaginationInterpolator = new AccelerateDecelerateInterpolator();
    private RecyclerView mRecyclerView;
    private final kt mRecyclerViewOnScrollListener;
    private View mScrollThumb;
    private View mScrollTrack;
    private View mScrollView;
    private int mScrollbarThumbMinHeight;
    private blr mSnapHelper;
    private View mUpButton;

    public static /* synthetic */ void $r8$lambda$nCelFiq6-nQoNZrtlFQi8foRkCE(DefaultScrollBar defaultScrollBar) {
        defaultScrollBar.updatePaginationButtons();
    }

    public static /* bridge */ /* synthetic */ void -$$Nest$mcacheChildrenHeight(DefaultScrollBar defaultScrollBar, ko ko2) {
        defaultScrollBar.cacheChildrenHeight(ko2);
    }

    public static /* bridge */ /* synthetic */ void -$$Nest$mclearCachedHeights(DefaultScrollBar defaultScrollBar) {
        defaultScrollBar.clearCachedHeights();
    }

    public static /* bridge */ /* synthetic */ void -$$Nest$mupdatePaginationButtons(DefaultScrollBar defaultScrollBar) {
        defaultScrollBar.updatePaginationButtons();
    }

    DefaultScrollBar() {
        this.mAdapterChangeObserver = new blx(this);
        this.mRecyclerViewOnScrollListener = new bly(this);
    }

    private void cacheChildrenHeight(ko ko2) {
        if (ko2 != null) {
            for (int i2 = 0; i2 < ko2.ao(); ++i2) {
                View view = ko2.aA(i2);
                int n2 = ko.bk(view);
                if (this.mChildHeightByAdapterPosition.indexOfKey(n2) >= 0) continue;
                this.mChildHeightByAdapterPosition.put(n2, (Object)view.getHeight());
            }
        }
    }

    private int calculateScrollThumbLength(int n2, int n3) {
        float f2 = this.mScrollTrack.getHeight();
        return Math.max(Math.round((float)n3 / (float)n2 * f2), Math.min(this.mScrollbarThumbMinHeight, this.mScrollTrack.getHeight()));
    }

    private int calculateScrollThumbOffset(int n2, int n3, int n4) {
        int n5 = this.mScrollTrack.getTop();
        if (this.isDownEnabled()) {
            float f2 = n3;
            float f3 = n2;
            n2 = this.mScrollTrack.getHeight();
            n2 = Math.round(f2 / f3 * (float)(n2 - n4));
        } else {
            n2 = this.mScrollTrack.getHeight() - n4;
        }
        return n5 + n2;
    }

    private void clearCachedHeights() {
        this.mChildHeightByAdapterPosition.clear();
        this.cacheChildrenHeight(this.getLayoutManager());
    }

    private int estimateNextPositionScrollUp(int n2, int n3, kc object) {
        int n4;
        int n5 = n2 - 1;
        int n6 = 0;
        int n7 = 0;
        while (true) {
            n4 = n6;
            if (n5 < 0) break;
            if (this.mChildHeightByAdapterPosition.indexOfKey(n5) < 0) {
                float f2;
                blr blr2 = this.mSnapHelper;
                ko ko2 = ((kc)object).a;
                int n8 = -n3;
                int n9 = ko2.ao();
                float f3 = 1.0f;
                if (n9 == 0) {
                    f2 = f3;
                } else {
                    Object object2;
                    Object object3 = null;
                    n3 = Integer.MAX_VALUE;
                    n2 = Integer.MIN_VALUE;
                    object = null;
                    for (n7 = 0; n7 < n9; ++n7) {
                        object2 = ko2.aA(n7);
                        n5 = ko.bk((View)object2);
                        if (n5 == -1) {
                            n4 = n3;
                        } else {
                            n4 = n5 < n3 ? n5 : n3;
                            if (n5 < n3) {
                                object3 = object2;
                            }
                            n3 = n2;
                            if (n5 > n2) {
                                object = object2;
                                n3 = n5;
                            }
                            n2 = n3;
                        }
                        n3 = n4;
                    }
                    f2 = f3;
                    if (object3 != null) {
                        if (object == null) {
                            f2 = f3;
                        } else {
                            object2 = blr2.i(ko2);
                            n4 = Math.min(((kc)object2).d((View)object3), ((kc)object2).d((View)object));
                            n4 = Math.max(((kc)object2).a((View)object3), ((kc)object2).a((View)object)) - n4;
                            f2 = n4 == 0 ? 0.0f : (float)n4 / (float)(n2 - n3 + 1);
                        }
                    }
                }
                if (f2 <= 0.0f) {
                    n4 = n6;
                    break;
                }
                n4 = Math.round((float)n8 / f2);
                break;
            }
            if ((Integer)this.mChildHeightByAdapterPosition.get(n5) + n7 > Math.abs(n3)) {
                n4 = n5 - n2 + 1;
                break;
            }
            n7 += ((Integer)this.mChildHeightByAdapterPosition.get(n5)).intValue();
            --n5;
        }
        return n4;
    }

    private View getFirstMostVisibleChild(kc kc2) {
        View view;
        int n2 = 0;
        View view2 = null;
        float f2 = 0.0f;
        while (true) {
            float f3;
            view = view2;
            if (n2 >= this.getLayoutManager().ao() || (f3 = blr.h(view = this.getLayoutManager().aA(n2), kc2)) == 1.0f) break;
            float f4 = f3 == f2 ? 0 : (f3 > f2 ? 1 : -1);
            if (f4 > 0) {
                view2 = view;
            }
            if (f4 > 0) {
                f2 = f3;
            }
            ++n2;
        }
        return view;
    }

    private kc getOrientationHelper(ko ko2) {
        kc kc2 = this.mOrientationHelper;
        if (kc2 == null || kc2.a != ko2) {
            this.mOrientationHelper = new kb(ko2);
        }
        return this.mOrientationHelper;
    }

    private boolean isDownEnabled() {
        return this.mDownButton.isEnabled();
    }

    private void moveY(View view, float f2) {
        view.animate().y(f2).setDuration(0L).setInterpolator((TimeInterpolator)this.mPaginationInterpolator).start();
    }

    private void setDownEnabled(boolean bl2) {
        if (!bl2) {
            this.mPageDownOnContinuousScrollListener.a();
        }
        this.mDownButton.setEnabled(bl2);
        View view = this.mDownButton;
        float f2 = bl2 ? 1.0f : this.mButtonDisabledAlpha;
        view.setAlpha(f2);
    }

    private void setParameters(int n2, int n3, int n4) {
        if (this.mScrollView.isLaidOut() && this.mScrollView.getVisibility() == 0 && n2 != 0) {
            n4 = this.calculateScrollThumbLength(n2, n4);
            n2 = this.calculateScrollThumbOffset(n2, n3, n4);
            ViewGroup.LayoutParams layoutParams = this.mScrollThumb.getLayoutParams();
            if (layoutParams.height != n4 || n4 < this.mScrollThumb.getHeight()) {
                layoutParams.height = n4;
                this.mScrollThumb.requestLayout();
            }
            this.moveY(this.mScrollThumb, n2);
        }
    }

    private void setUpEnabled(boolean bl2) {
        if (!bl2) {
            this.mPageUpOnContinuousScrollListener.a();
        }
        this.mUpButton.setEnabled(bl2);
        View view = this.mUpButton;
        float f2 = bl2 ? 1.0f : this.mButtonDisabledAlpha;
        view.setAlpha(f2);
    }

    private void updatePaginationButtons() {
        ko ko2 = this.getLayoutManager();
        if (ko2 == null) {
            this.mScrollView.setVisibility(8);
            return;
        }
        boolean bl2 = this.isAtStart();
        boolean bl3 = this.isAtEnd();
        this.setUpEnabled(bl2 ^ true);
        this.setDownEnabled(bl3 ^ true);
        int n2 = this.mScrollView.getVisibility();
        int n3 = 0;
        int n4 = 0;
        if (bl2 && bl3 || ko2.aq() == 0) {
            this.mScrollView.setVisibility(8);
            n4 = n3;
        } else {
            int n5 = this.getOrientationHelper(ko2).k();
            int n6 = this.mContext.getResources().getDimensionPixelSize(2131165432);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.mUpButton.getLayoutParams();
            n3 = marginLayoutParams.topMargin;
            int n7 = marginLayoutParams.bottomMargin;
            marginLayoutParams = (ViewGroup.MarginLayoutParams)this.mDownButton.getLayoutParams();
            int n8 = marginLayoutParams.topMargin;
            int n9 = marginLayoutParams.bottomMargin;
            int n10 = n6 + n6;
            n8 = n3 + n7 + (n8 + n9);
            n3 = 1;
            if (n5 < n10 + n8) {
                if (n2 == 0) {
                    n4 = 1;
                }
                this.mScrollView.setVisibility(8);
            } else {
                marginLayoutParams = (ViewGroup.MarginLayoutParams)this.mScrollTrack.getLayoutParams();
                n7 = marginLayoutParams.topMargin;
                n4 = marginLayoutParams.bottomMargin;
                if (n5 < n10 + Math.max(n6, this.mScrollbarThumbMinHeight) + (n8 + (n7 + n4))) {
                    this.mScrollTrack.setVisibility(4);
                    this.mScrollThumb.setVisibility(4);
                } else {
                    this.mScrollTrack.setVisibility(0);
                    this.mScrollThumb.setVisibility(0);
                }
                n4 = n2 != 0 ? n3 : 0;
                this.mScrollView.setVisibility(0);
            }
        }
        if (ko2.Z()) {
            this.setParameters(this.computeVerticalScrollRange(), this.computeVerticalScrollOffset(), this.computeVerticalScrollExtent());
        } else {
            this.setParameters(this.computeHorizontalScrollRange(), this.computeHorizontalScrollOffset(), this.computeHorizontalScrollExtent());
        }
        this.mScrollView.invalidate();
        if (n4 != 0) {
            this.mScrollView.post((Runnable)new bls(this));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void adapterChanged(kf kf2) {
        try {
            if (this.mRecyclerView.g() != null) {
                this.mRecyclerView.g().unregisterAdapterDataObserver(this.mAdapterChangeObserver);
            }
        }
        catch (IllegalStateException illegalStateException) {}
        if (kf2 == null) return;
        try {
            kf2.registerAdapterDataObserver(this.mAdapterChangeObserver);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
    }

    public int computeHorizontalScrollExtent() {
        return this.getRecyclerView().computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return this.getRecyclerView().computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return this.getRecyclerView().computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return this.getRecyclerView().computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return this.getRecyclerView().computeVerticalScrollOffset();
    }

    public int computeVerticalScrollRange() {
        return this.getRecyclerView().computeVerticalScrollRange();
    }

    public ko getLayoutManager() {
        return this.getRecyclerView().n;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public void initialize(Context object, RecyclerView object2, View object3) {
        this.mContext = object;
        this.mRecyclerView = object2;
        this.mScrollView = object3;
        object2 = object.getResources();
        this.mButtonDisabledAlpha = bnv.b((Resources)object2, 2131165285);
        this.mScrollbarThumbMinHeight = object2.getDimensionPixelSize(2131165393);
        this.mUpButton = bnv.i(this.mScrollView, 2131427508);
        object2 = new blu(this);
        this.mUpButton.setOnClickListener((View.OnClickListener)object2);
        this.mPageUpOnContinuousScrollListener = object2 = new bma((Context)object, (View.OnClickListener)object2);
        this.mUpButton.setOnTouchListener((View.OnTouchListener)object2);
        this.mDownButton = bnv.i(this.mScrollView, 2131427507);
        object2 = new blv(this);
        this.mDownButton.setOnClickListener((View.OnClickListener)object2);
        this.mPageDownOnContinuousScrollListener = object2 = new bma((Context)object, (View.OnClickListener)object2);
        this.mDownButton.setOnTouchListener((View.OnTouchListener)object2);
        this.mScrollTrack = bnv.i(this.mScrollView, 2131427510);
        this.mScrollThumb = bnv.i(this.mScrollView, 2131427509);
        this.mSnapHelper = new blr((Context)object);
        this.getRecyclerView().G = null;
        object2 = this.mSnapHelper;
        object = this.getRecyclerView();
        object3 = ((kr)object2).a;
        if (object3 != object) {
            if (object3 != null) {
                ((RecyclerView)object3).X(((kr)object2).c);
                ((kr)object2).a.G = null;
            }
            ((kr)object2).a = object;
            object3 = ((kr)object2).a;
            if (object3 != null) {
                if (((RecyclerView)object3).G == null) {
                    ((RecyclerView)object3).u(((kr)object2).c);
                    object3 = ((kr)object2).a;
                    ((RecyclerView)object3).G = object2;
                    ((kr)object2).b = new Scroller(object3.getContext(), (Interpolator)new DecelerateInterpolator());
                    ((kr)object2).a();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        ((blr)object2).e = object;
        object = new blz(this.mRecyclerView, this.mScrollTrack, this.mScrollView);
        object.a.setOnTouchListener((View.OnTouchListener)object);
        this.getRecyclerView().u(this.mRecyclerViewOnScrollListener);
        this.mScrollView.setVisibility(8);
        this.mScrollView.addOnLayoutChangeListener((View.OnLayoutChangeListener)new blw(this));
        if (this.mRecyclerView.g() != null) {
            this.adapterChanged(this.mRecyclerView.g());
        }
    }

    public boolean isAtEnd() {
        return this.mSnapHelper.j(this.getLayoutManager());
    }

    public boolean isAtStart() {
        boolean bl2;
        Object object = this.mSnapHelper;
        ko ko2 = this.getLayoutManager();
        boolean bl3 = bl2 = true;
        if (ko2 != null) {
            if (ko2.ao() == 0) {
                bl3 = bl2;
            } else {
                View view = Objects.requireNonNull(ko2.aA(0));
                if (((kc)(object = ((blr)object).i(ko2))).d(view) >= ((kc)object).j() && ko.bk(view) == 0) {
                    return true;
                }
                bl3 = false;
            }
        }
        return bl3;
    }

    public /* synthetic */ void lambda$initialize$0$com-android-car-ui-recyclerview-DefaultScrollBar(View view) {
        this.pageUp();
    }

    public /* synthetic */ void lambda$initialize$1$com-android-car-ui-recyclerview-DefaultScrollBar(View view) {
        this.pageDown();
    }

    public /* synthetic */ void lambda$initialize$2$com-android-car-ui-recyclerview-DefaultScrollBar(View object, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        object = new blt(this);
        this.mHandler.post((Runnable)object);
    }

    public /* synthetic */ void lambda$updatePaginationButtons$0$com-android-car-ui-recyclerview-DefaultScrollBar() {
        this.mScrollView.requestLayout();
    }

    public void pageDown() {
        ko ko2 = this.getLayoutManager();
        if (ko2 != null && ko2.ao() != 0) {
            int n2;
            block4: {
                View view;
                kc kc2 = this.getOrientationHelper(ko2);
                int n3 = kc2.k();
                View view2 = this.getFirstMostVisibleChild(kc2);
                int n4 = ko2.bm(view2) && kc2.a(view2) > kc2.f() ? Math.min(n3, kc2.a(view2) - kc2.f()) : n3;
                n2 = ko2.ao();
                do {
                    int n5 = n2 - 1;
                    n2 = n4;
                    if (n5 < 0) break block4;
                    view = ko2.aA(n5);
                    n2 = n4;
                    if (kc2.d(view) <= kc2.d(view2)) break block4;
                    n2 = n5;
                } while (kc2.d(view) - kc2.j() > n3);
                if (kc2.a(view) <= kc2.f()) {
                    n2 = kc2.a(view);
                    n4 = kc2.j();
                } else {
                    n2 = kc2.d(view);
                    n4 = kc2.j();
                }
                n2 -= n4;
            }
            this.smoothScrollBy(0, n2);
        }
    }

    public void pageUp() {
        int n2 = this.computeVerticalScrollOffset();
        ko ko2 = this.getLayoutManager();
        if (ko2 != null && ko2.ao() != 0 && n2 != 0) {
            kc kc2 = this.getOrientationHelper(ko2);
            int n3 = kc2.k();
            ko2 = this.getFirstMostVisibleChild(kc2);
            if (ko2 != null) {
                this.getLayoutManager();
                n2 = ko.bk((View)ko2);
            } else {
                n2 = 0;
            }
            int n4 = this.estimateNextPositionScrollUp(n2, n3 - Math.max(0, kc2.j() - kc2.d((View)ko2)), kc2);
            if (n4 == 0) {
                this.smoothScrollBy(0, -n3);
                return;
            }
            this.smoothScrollToPosition(Math.max(0, n2 + n4));
        }
    }

    public void requestLayout() {
        this.mScrollView.requestLayout();
    }

    public void setHighlightThumb(boolean bl2) {
        this.mScrollThumb.setActivated(bl2);
    }

    public void setPadding(int n2, int n3) {
        View view = this.mScrollView;
        view.setPadding(view.getPaddingLeft(), n2, this.mScrollView.getPaddingRight(), n3);
        this.updatePaginationButtons();
    }

    public void smoothScrollBy(int n2, int n3) {
        this.getRecyclerView().au(n2, n3);
    }

    public void smoothScrollToPosition(int n2) {
        this.getRecyclerView().ae(n2);
    }
}

