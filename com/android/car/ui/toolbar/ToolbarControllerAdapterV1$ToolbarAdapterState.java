/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  com.android.car.ui.toolbar.ToolbarControllerAdapterV1-IA
 */
package com.android.car.ui.toolbar;

import android.graphics.drawable.Drawable;
import com.android.car.ui.toolbar.MenuItemAdapterV1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1$ToolbarAdapterState$$ExternalSyntheticLambda0;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1$ToolbarAdapterState$$ExternalSyntheticLambda1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1$ToolbarAdapterState$$ExternalSyntheticLambda2;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1$ToolbarAdapterState$Builder;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1-IA;
import j$.util.Collection$_EL;
import j$.util.DesugarCollections;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import j$.util.stream.Stream$_CC;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class ToolbarControllerAdapterV1$ToolbarAdapterState {
    private final Drawable mLogo;
    private final boolean mLogoDirty;
    private final List mMenuItems;
    private final bmp mNavButtonMode;
    private final bmv mSearchMode;
    private final int mSelectedTab;
    private final boolean mShowMenuItemsWhileSearching;
    private final boolean mShowTabsInSubpage;
    private final bnp mState;
    private final boolean mStateSet;
    private final String mSubtitle;
    private final List mTabs;
    private final boolean mTabsDirty;
    private final String mTitle;

    static /* bridge */ /* synthetic */ Drawable -$$Nest$fgetmLogo(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mLogo;
    }

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmMenuItems(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mMenuItems;
    }

    static /* bridge */ /* synthetic */ bmp -$$Nest$fgetmNavButtonMode(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mNavButtonMode;
    }

    static /* bridge */ /* synthetic */ bmv -$$Nest$fgetmSearchMode(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mSearchMode;
    }

    static /* bridge */ /* synthetic */ int -$$Nest$fgetmSelectedTab(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mSelectedTab;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmShowMenuItemsWhileSearching(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mShowMenuItemsWhileSearching;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmShowTabsInSubpage(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mShowTabsInSubpage;
    }

    static /* bridge */ /* synthetic */ bnp -$$Nest$fgetmState(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mState;
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$fgetmStateSet(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mStateSet;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetmSubtitle(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mSubtitle;
    }

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmTabs(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mTabs;
    }

    static /* bridge */ /* synthetic */ String -$$Nest$fgetmTitle(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.mTitle;
    }

    static /* bridge */ /* synthetic */ bmv -$$Nest$mgetSearchMode(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.getSearchMode();
    }

    static /* bridge */ /* synthetic */ List -$$Nest$mgetShownMenuItems(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.getShownMenuItems();
    }

    static /* bridge */ /* synthetic */ boolean -$$Nest$mhasTabs(ToolbarControllerAdapterV1$ToolbarAdapterState toolbarControllerAdapterV1$ToolbarAdapterState) {
        return toolbarControllerAdapterV1$ToolbarAdapterState.hasTabs();
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState() {
        this.mState = bnp.a;
        this.mStateSet = false;
        this.mShowTabsInSubpage = false;
        this.mTabs = Collections.emptyList();
        this.mMenuItems = Collections.emptyList();
        this.mSelectedTab = -1;
        this.mTitle = null;
        this.mSubtitle = null;
        this.mLogo = null;
        this.mShowMenuItemsWhileSearching = false;
        this.mTabsDirty = false;
        this.mLogoDirty = false;
        this.mNavButtonMode = bmp.d;
        this.mSearchMode = bmv.a;
    }

    private ToolbarControllerAdapterV1$ToolbarAdapterState(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder) {
        this.mState = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmState(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mStateSet = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmStateSet(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mShowTabsInSubpage = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmShowTabsInSubpage(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mTabs = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmTabs(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mMenuItems = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmMenuItems(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mSelectedTab = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmSelectedTab(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mTitle = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmTitle(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mSubtitle = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmSubtitle(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mLogo = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmLogo(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mShowMenuItemsWhileSearching = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmShowMenuItemsWhileSearching(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mTabsDirty = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmTabsDirty(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mLogoDirty = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmLogoDirty(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mNavButtonMode = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmNavButtonMode(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
        this.mSearchMode = ToolbarControllerAdapterV1$ToolbarAdapterState$Builder.-$$Nest$fgetmSearchMode(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
    }

    public /* synthetic */ ToolbarControllerAdapterV1$ToolbarAdapterState(ToolbarControllerAdapterV1$ToolbarAdapterState$Builder toolbarControllerAdapterV1$ToolbarAdapterState$Builder, ToolbarControllerAdapterV1-IA toolbarControllerAdapterV1-IA) {
        this(toolbarControllerAdapterV1$ToolbarAdapterState$Builder);
    }

    private bmv getSearchMode() {
        if (this.mStateSet) {
            bnp bnp2 = this.mState;
            if (bnp2 == bnp.c) {
                return bmv.b;
            }
            if (bnp2 == bnp.d) {
                return bmv.c;
            }
            return bmv.a;
        }
        return this.mSearchMode;
    }

    private List getShownMenuItems() {
        Stream stream = this.mMenuItems;
        bmv bmv2 = this.getSearchMode();
        stream = Collection$_EL.stream((Collection)((Object)stream));
        if (bmv2 == bmv.c && !this.mShowMenuItemsWhileSearching) {
            stream = Stream$_CC.empty();
        } else if (bmv2 == bmv.b) {
            stream = this.mShowMenuItemsWhileSearching ? Collection$_EL.stream(this.mMenuItems).filter(new ToolbarControllerAdapterV1$ToolbarAdapterState$$ExternalSyntheticLambda0()) : Stream$_CC.empty();
        }
        return DesugarCollections.unmodifiableList(stream.filter(new ToolbarControllerAdapterV1$ToolbarAdapterState$$ExternalSyntheticLambda1()).map(new ToolbarControllerAdapterV1$ToolbarAdapterState$$ExternalSyntheticLambda2()).collect(Collectors.toList()));
    }

    private boolean hasTabs() {
        if (!this.mStateSet) {
            return !this.getTabs().isEmpty();
        }
        bnp bnp2 = this.mState;
        return (bnp2 == bnp.a || bnp2 == bnp.b && this.getShowTabsInSubpage()) && !this.getTabs().isEmpty();
    }

    static /* synthetic */ boolean lambda$getShownMenuItems$0(MenuItemAdapterV1 menuItemAdapterV1) {
        return !menuItemAdapterV1.getClientMenuItem().c;
    }

    public ToolbarControllerAdapterV1$ToolbarAdapterState$Builder copy() {
        return new ToolbarControllerAdapterV1$ToolbarAdapterState$Builder(this);
    }

    public Drawable getLogo() {
        return this.mLogo;
    }

    public boolean getLogoDirty() {
        return this.mLogoDirty;
    }

    public bmp getNavButtonMode() {
        if (this.mStateSet && this.mNavButtonMode == bmp.d && this.mState != bnp.a) {
            return bmp.a;
        }
        return this.mNavButtonMode;
    }

    public int getSelectedTab() {
        return this.mSelectedTab;
    }

    public boolean getShowMenuItemsWhileSearching() {
        return this.mShowMenuItemsWhileSearching;
    }

    public boolean getShowTabsInSubpage() {
        return this.mShowTabsInSubpage;
    }

    public Drawable getShownLogo() {
        bnp bnp2;
        if (this.mStateSet && (bnp2 = this.mState) != bnp.a && bnp2 != bnp.b) {
            return null;
        }
        return this.mLogo;
    }

    public String getShownSubtitle() {
        Object object;
        block3: {
            block2: {
                if (this.mStateSet && (object = this.mState) != bnp.a && object != bnp.b) break block2;
                String string = this.mSubtitle;
                object = string;
                if (string != null) break block3;
            }
            object = "";
        }
        return object;
    }

    public String getShownTitle() {
        Object object;
        block3: {
            block2: {
                if (this.mStateSet && (object = this.mState) != bnp.a && object != bnp.b) break block2;
                String string = this.mTitle;
                object = string;
                if (string != null) break block3;
            }
            object = "";
        }
        return object;
    }

    public bnp getState() {
        return this.mState;
    }

    public String getSubtitle() {
        String string;
        String string2 = string = this.mSubtitle;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public List getTabs() {
        return this.mTabs;
    }

    public boolean getTabsDirty() {
        return this.mTabsDirty;
    }

    public String getTitle() {
        String string;
        String string2 = string = this.mTitle;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public boolean isStateSet() {
        return this.mStateSet;
    }
}

