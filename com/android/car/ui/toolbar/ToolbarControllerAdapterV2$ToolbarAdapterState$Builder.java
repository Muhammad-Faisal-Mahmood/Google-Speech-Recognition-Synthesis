/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.android.car.ui.toolbar;

import android.graphics.drawable.Drawable;
import com.android.car.ui.toolbar.TabAdapterV1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$ToolbarAdapterState;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ToolbarControllerAdapterV2$ToolbarAdapterState$Builder {
    private Drawable mLogo;
    private boolean mLogoDirty = false;
    private List mMenuItems;
    private bmp mNavButtonMode;
    private bmv mSearchMode;
    private int mSelectedTab;
    private boolean mShowMenuItemsWhileSearching;
    private boolean mShowTabsInSubpage;
    private bnp mState;
    private final ToolbarControllerAdapterV2$ToolbarAdapterState mStateClonedFrom;
    private boolean mStateSet;
    private String mSubtitle;
    private List mTabs;
    private boolean mTabsDirty = false;
    private String mTitle;
    private boolean mWasChanged = false;

    static /* bridge */ /* synthetic */ Drawable -$$Nest$fgetmLogo(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mLogo;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmLogoDirty(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mLogoDirty;
    }

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmMenuItems(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mMenuItems;
    }

    static /* bridge */ /* synthetic */ bmp -$$Nest$fgetmNavButtonMode(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mNavButtonMode;
    }

    static /* bridge */ /* synthetic */ bmv -$$Nest$fgetmSearchMode(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mSearchMode;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetmSelectedTab(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mSelectedTab;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmShowMenuItemsWhileSearching(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mShowMenuItemsWhileSearching;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmShowTabsInSubpage(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mShowTabsInSubpage;
    }

    static /* bridge */ /* synthetic */ bnp -$$Nest$fgetmState(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mState;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmStateSet(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mStateSet;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetmSubtitle(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mSubtitle;
    }

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmTabs(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mTabs;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmTabsDirty(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mTabsDirty;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetmTitle(ToolbarControllerAdapterV2$ToolbarAdapterState$Builder toolbarControllerAdapterV2$ToolbarAdapterState$Builder) {
        return toolbarControllerAdapterV2$ToolbarAdapterState$Builder.mTitle;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder(ToolbarControllerAdapterV2$ToolbarAdapterState toolbarControllerAdapterV2$ToolbarAdapterState) {
        this.mStateClonedFrom = toolbarControllerAdapterV2$ToolbarAdapterState;
        this.mState = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmState(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mStateSet = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmStateSet(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mShowTabsInSubpage = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmShowTabsInSubpage(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mTabs = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmTabs(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mMenuItems = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmMenuItems(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mShowMenuItemsWhileSearching = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmShowMenuItemsWhileSearching(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mSelectedTab = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmSelectedTab(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mTitle = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmTitle(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mSubtitle = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmSubtitle(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mLogo = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmLogo(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mNavButtonMode = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmNavButtonMode(toolbarControllerAdapterV2$ToolbarAdapterState);
        this.mSearchMode = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$fgetmSearchMode(toolbarControllerAdapterV2$ToolbarAdapterState);
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder addTab(TabAdapterV1 tabAdapterV1) {
        ArrayList<TabAdapterV1> arrayList = new ArrayList<TabAdapterV1>(this.mTabs);
        arrayList.add(tabAdapterV1);
        this.mTabs = DesugarCollections.unmodifiableList(arrayList);
        this.mWasChanged = true;
        this.mTabsDirty = true;
        return this;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState build() {
        if (!this.mWasChanged) {
            return this.mStateClonedFrom;
        }
        return new ToolbarControllerAdapterV2$ToolbarAdapterState(this, null);
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setLogo(Drawable drawable) {
        if (this.mLogo != drawable) {
            this.mLogo = drawable;
            this.mWasChanged = true;
            this.mLogoDirty = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setMenuItems(List list) {
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

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setNavButtonMode(bmp bmp2) {
        if (bmp2 != this.mNavButtonMode) {
            this.mNavButtonMode = bmp2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setSearchMode(bmv bmv2) {
        if (!this.mStateSet) {
            if (this.mSearchMode != bmv2) {
                this.mSearchMode = bmv2;
                this.mWasChanged = true;
            }
            return this;
        }
        throw new IllegalStateException("Cannot use setSearchMode() with setState()");
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setSelectedTab(int n2) {
        if (this.mSelectedTab != n2) {
            this.mSelectedTab = n2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setShowMenuItemsWhileSearching(boolean bl2) {
        if (this.mShowMenuItemsWhileSearching != bl2) {
            this.mShowMenuItemsWhileSearching = bl2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setShowTabsInSubpage(boolean bl2) {
        if (this.mShowTabsInSubpage != bl2) {
            this.mShowTabsInSubpage = bl2;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setState(bnp bnp2) {
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

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setSubtitle(String string) {
        if (!Objects.equals(this.mSubtitle, string)) {
            this.mSubtitle = string;
            this.mWasChanged = true;
        }
        return this;
    }

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setTabs(List list) {
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

    public ToolbarControllerAdapterV2$ToolbarAdapterState$Builder setTitle(String string) {
        if (!Objects.equals(this.mTitle, string)) {
            this.mTitle = string;
            this.mWasChanged = true;
        }
        return this;
    }
}

