/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.android.car.ui.toolbar;

import android.graphics.drawable.Drawable;
import com.android.car.ui.toolbar.TabAdapterV1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1$ToolbarAdapterState;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ToolbarControllerAdapterV1$ToolbarAdapterState$Builder {
    private Drawable mLogo;
    private boolean mLogoDirty = false;
    private List mMenuItems;
    private bmp mNavButtonMode;
    private bmv mSearchMode;
    private int mSelectedTab;
    private boolean mShowMenuItemsWhileSearching;
    private boolean mShowTabsInSubpage;
    private bnp mState;
    private final ToolbarControllerAdapterV1$ToolbarAdapterState mStateClonedFrom;
    private boolean mStateSet;
    private String mSubtitle;
    private List mTabs;
    private boolean mTabsDirty = false;
    private String mTitle;
    private boolean mWasChanged = false;

    static /* bridge */ /* synthetic */ Drawable -$$Nest$fgetmLogo(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mLogo;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmLogoDirty(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mLogoDirty;
    }

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmMenuItems(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mMenuItems;
    }

    static /* bridge */ /* synthetic */ bmp -$$Nest$fgetmNavButtonMode(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mNavButtonMode;
    }

    static /* bridge */ /* synthetic */ bmv -$$Nest$fgetmSearchMode(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mSearchMode;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetmSelectedTab(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mSelectedTab;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmShowMenuItemsWhileSearching(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mShowMenuItemsWhileSearching;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmShowTabsInSubpage(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mShowTabsInSubpage;
    }

    static /* bridge */ /* synthetic */ bnp -$$Nest$fgetmState(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mState;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmStateSet(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mStateSet;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetmSubtitle(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mSubtitle;
    }

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmTabs(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mTabs;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmTabsDirty(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mTabsDirty;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetmTitle(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV1$ToolbarAdapterState$Builder.mTitle;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        this.mStateClonedFrom = toolbarControllerAdapterV1$ToolbarAdapterState;
        this.mState = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmState(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mStateSet = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmStateSet(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mShowTabsInSubpage = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmShowTabsInSubpage(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mTabs = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmTabs(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mMenuItems = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmMenuItems(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mShowMenuItemsWhileSearching = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmShowMenuItemsWhileSearching(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mSelectedTab = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmSelectedTab(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mTitle = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmTitle(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mSubtitle = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmSubtitle(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mLogo = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmLogo(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mNavButtonMode = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmNavButtonMode(toolbarControllerAdapterV1$ToolbarAdapterState);
        this.mSearchMode = ToolbarControllerAdapterV1$ToolbarAdapterState.-$$Nest$fgetmSearchMode(toolbarControllerAdapterV1$ToolbarAdapterState);
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder addTab(TabAdapterV1 tabAdapterV1) {
        ArrayList<TabAdapterV1> arrayList = new ArrayList<TabAdapterV1>(this.mTabs);
        arrayList.add(tabAdapterV1);
        this.mTabs = DesugarCollections.unmodifiableList(arrayList);
        this.mWasChanged = true;
        this.mTabsDirty = true;
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState build() {
        if (!this.mWasChanged) {
            return this.mStateClonedFrom;
        }
        return new ToolbarControllerAdapterV1$ToolbarAdapterState(this, null);
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setLogo(Drawable drawable) {
        if (this.mLogo != drawable) {
            this.mLogo = drawable;
            this.mWasChanged = true;
            this.mLogoDirty = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setMenuItems(List list) {
        List list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        if (!Objects.equals(this.mMenuItems, list2)) {
            this.mMenuItems = list2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setNavButtonMode(bmp bmp2) {
        if (bmp2 != this.mNavButtonMode) {
            this.mNavButtonMode = bmp2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setSearchMode(bmv bmv2) {
        if (!this.mStateSet) {
            if (this.mSearchMode != bmv2) {
                this.mSearchMode = bmv2;
                this.mWasChanged = true;
            }
            return this;
        }
        throw new IllegalStateException("Cannot use setSearchMode() with setState()");
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setSelectedTab(int n2) {
        if (this.mSelectedTab != n2) {
            this.mSelectedTab = n2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setShowMenuItemsWhileSearching(boolean bl2) {
        if (this.mShowMenuItemsWhileSearching != bl2) {
            this.mShowMenuItemsWhileSearching = bl2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setShowTabsInSubpage(boolean bl2) {
        if (this.mShowTabsInSubpage != bl2) {
            this.mShowTabsInSubpage = bl2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setState(bnp bnp2) {
        if (this.mSearchMode == bmv.a) {
            if (bnp2 != this.mState) {
                this.mState = bnp2;
                this.mStateSet = true;
                this.mWasChanged = true;
            }
            return this;
        }
        throw new IllegalStateException("Cannot use setSearchMode() with setState()");
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setSubtitle(String string) {
        if (!Objects.equals(this.mSubtitle, string)) {
            this.mSubtitle = string;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setTabs(List list) {
        List list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        if (!Objects.equals(list2, this.mTabs)) {
            this.mTabs = list = DesugarCollections.unmodifiableList(list2);
            int n2 = true != list.isEmpty() ? 0 : -1;
            this.mSelectedTab = n2;
            this.mWasChanged = true;
            this.mTabsDirty = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder setTitle(String string) {
        if (!Objects.equals(this.mTitle, string)) {
            this.mTitle = string;
            this.mWasChanged = true;
        }
        return this;
    }
}

