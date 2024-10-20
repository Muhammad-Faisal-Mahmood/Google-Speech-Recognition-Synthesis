/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  com.android.car.ui.plugin.oemapis.BiConsumer
 *  com.android.car.ui.plugin.oemapis.Consumer
 *  com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV2
 */
package com.android.car.ui.toolbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import com.android.car.ui.plugin.oemapis.BiConsumer;
import com.android.car.ui.plugin.oemapis.Consumer;
import com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV2;
import com.android.car.ui.toolbar.MenuItemAdapterV1;
import com.android.car.ui.toolbar.ProgressBarControllerAdapterV1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda0;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda10;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda11;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda2;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda3;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda4;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda5;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda6;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda7;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda8;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$$ExternalSyntheticLambda9;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$2;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$3;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$ToolbarAdapterState;
import j$.util.Collection$_EL;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ToolbarControllerAdapterV2
implements bnq {
    private ToolbarControllerAdapterV2$ToolbarAdapterState mAdapterState = new ToolbarControllerAdapterV2$ToolbarAdapterState();
    private final Set mBackListeners;
    private boolean mBackgroundShown;
    private List mClientMenuItems;
    private final Context mContext;
    private final Set mDeprecatedBackListeners;
    private final Set mDeprecatedSearchCompletedListeners;
    private final Set mDeprecatedSearchListeners;
    private final List mDeprecatedTabs;
    private final ToolbarControllerOEMV2 mOemToolbar;
    private final Set mOnTabSelectedListeners = new HashSet();
    private final ProgressBarControllerAdapterV1 mProgressBar;
    private final Set mSearchCompletedListeners;
    private final bmt mSearchConfigBuilder;
    private String mSearchHint;
    private final Set mSearchListeners;
    private final bne mSearchWidescreenController;
    private final boolean mSupportsImeSearch;

    public static /* synthetic */ void $r8$lambda$x0VSFTCXhExgpBQle7YkCdMP8AE(ToolbarControllerAdapterV2 toolbarControllerAdapterV2) {
        toolbarControllerAdapterV2.updateModernTabsFromDeprecatedOnes();
    }

    static /* bridge */ /* synthetic */ Set -$$Nest$fgetmDeprecatedSearchListeners(ToolbarControllerAdapterV2 toolbarControllerAdapterV2) {
        return toolbarControllerAdapterV2.mDeprecatedSearchListeners;
    }

    static /* bridge */ /* synthetic */ Set -$$Nest$fgetmSearchListeners(ToolbarControllerAdapterV2 toolbarControllerAdapterV2) {
        return toolbarControllerAdapterV2.mSearchListeners;
    }

    static /* bridge */ /* synthetic */ bne -$$Nest$fgetmSearchWidescreenController(ToolbarControllerAdapterV2 toolbarControllerAdapterV2) {
        return toolbarControllerAdapterV2.mSearchWidescreenController;
    }

    public ToolbarControllerAdapterV2(Context context, ToolbarControllerOEMV2 toolbarControllerOEMV2) {
        this.mDeprecatedBackListeners = new HashSet();
        this.mBackListeners = new HashSet();
        this.mDeprecatedSearchListeners = new HashSet();
        this.mDeprecatedSearchCompletedListeners = new HashSet();
        this.mSearchListeners = new HashSet();
        this.mSearchCompletedListeners = new HashSet();
        this.mClientMenuItems = Collections.emptyList();
        this.mDeprecatedTabs = new ArrayList();
        boolean bl2 = true;
        this.mBackgroundShown = true;
        this.mOemToolbar = toolbarControllerOEMV2;
        this.mProgressBar = new ProgressBarControllerAdapterV1(toolbarControllerOEMV2.getProgressBar());
        this.mContext = context;
        this.mSearchConfigBuilder = new bmt();
        Activity activity = bnv.e(context);
        this.mSearchWidescreenController = new bne(context);
        context = toolbarControllerOEMV2.getImeSearchInterface();
        if (context == null) {
            bl2 = false;
        }
        this.mSupportsImeSearch = bl2;
        if (context != null) {
            context.setOnPrivateImeCommandListener((BiConsumer)new ToolbarControllerAdapterV2$1(this));
            context.setSearchTextViewConsumer((Consumer)new ToolbarControllerAdapterV2$2(this));
        }
        toolbarControllerOEMV2.setBackListener((Runnable)new ToolbarControllerAdapterV2$$ExternalSyntheticLambda8(this, activity));
        toolbarControllerOEMV2.setSearchListener((Consumer)new ToolbarControllerAdapterV2$3(this));
        toolbarControllerOEMV2.setSearchCompletedListener((Runnable)new ToolbarControllerAdapterV2$$ExternalSyntheticLambda9(this));
    }

    private Drawable getDrawable(int n2) {
        if (n2 == 0) {
            return null;
        }
        return this.mContext.getDrawable(n2);
    }

    private void update(ToolbarControllerAdapterV2$ToolbarAdapterState toolbarControllerAdapterV2$ToolbarAdapterState) {
        int n2;
        ToolbarControllerAdapterV2$ToolbarAdapterState toolbarControllerAdapterV2$ToolbarAdapterState2 = this.mAdapterState;
        this.mAdapterState = toolbarControllerAdapterV2$ToolbarAdapterState;
        if (!TextUtils.equals((CharSequence)toolbarControllerAdapterV2$ToolbarAdapterState.getShownTitle(), (CharSequence)toolbarControllerAdapterV2$ToolbarAdapterState2.getShownTitle())) {
            this.mOemToolbar.setTitle(toolbarControllerAdapterV2$ToolbarAdapterState.getTitle());
        }
        if (!TextUtils.equals((CharSequence)toolbarControllerAdapterV2$ToolbarAdapterState.getShownSubtitle(), (CharSequence)toolbarControllerAdapterV2$ToolbarAdapterState2.getShownSubtitle())) {
            this.mOemToolbar.setSubtitle(toolbarControllerAdapterV2$ToolbarAdapterState.getSubtitle());
        }
        if (toolbarControllerAdapterV2$ToolbarAdapterState.getShownLogo() != toolbarControllerAdapterV2$ToolbarAdapterState2.getShownLogo()) {
            this.mOemToolbar.setLogo(toolbarControllerAdapterV2$ToolbarAdapterState.getShownLogo());
        } else if (toolbarControllerAdapterV2$ToolbarAdapterState.getShownLogo() != null && toolbarControllerAdapterV2$ToolbarAdapterState.getLogoDirty()) {
            this.mOemToolbar.setLogo(toolbarControllerAdapterV2$ToolbarAdapterState.getShownLogo());
        }
        bmv bmv2 = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetSearchMode(toolbarControllerAdapterV2$ToolbarAdapterState);
        bmv bmv3 = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetSearchMode(toolbarControllerAdapterV2$ToolbarAdapterState2);
        boolean bl2 = false;
        if (bmv2 != bmv3) {
            n2 = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetSearchMode(toolbarControllerAdapterV2$ToolbarAdapterState).ordinal();
            if (n2 != 1) {
                if (n2 != 2) {
                    this.mOemToolbar.setSearchMode(0);
                } else {
                    this.mOemToolbar.setSearchMode(2);
                }
            } else {
                this.mOemToolbar.setSearchMode(1);
            }
        }
        if (toolbarControllerAdapterV2$ToolbarAdapterState2.getNavButtonMode() != toolbarControllerAdapterV2$ToolbarAdapterState.getNavButtonMode()) {
            if (toolbarControllerAdapterV2$ToolbarAdapterState.getNavButtonMode() == bmp.d) {
                this.mOemToolbar.setNavButtonMode(0);
            } else if (toolbarControllerAdapterV2$ToolbarAdapterState.getNavButtonMode() == bmp.b) {
                this.mOemToolbar.setNavButtonMode(2);
            } else if (toolbarControllerAdapterV2$ToolbarAdapterState.getNavButtonMode() == bmp.c) {
                this.mOemToolbar.setNavButtonMode(3);
            } else {
                this.mOemToolbar.setNavButtonMode(1);
            }
        }
        n2 = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mhasTabs(toolbarControllerAdapterV2$ToolbarAdapterState) && !ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mhasTabs(toolbarControllerAdapterV2$ToolbarAdapterState2) ? 1 : 0;
        boolean bl3 = bl2;
        if (!ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mhasTabs(toolbarControllerAdapterV2$ToolbarAdapterState)) {
            bl3 = bl2;
            if (ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mhasTabs(toolbarControllerAdapterV2$ToolbarAdapterState2)) {
                bl3 = true;
            }
        }
        if (n2 != 0) {
            this.mOemToolbar.setTabs(Collection$_EL.stream(toolbarControllerAdapterV2$ToolbarAdapterState.getTabs()).map(new ToolbarControllerAdapterV2$$ExternalSyntheticLambda4()).collect(Collectors.toList()), toolbarControllerAdapterV2$ToolbarAdapterState.getSelectedTab());
        } else if (bl3) {
            this.mOemToolbar.setTabs(Collections.emptyList(), -1);
        } else if (ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mhasTabs(toolbarControllerAdapterV2$ToolbarAdapterState) && toolbarControllerAdapterV2$ToolbarAdapterState.getTabsDirty()) {
            this.mOemToolbar.setTabs(Collection$_EL.stream(toolbarControllerAdapterV2$ToolbarAdapterState.getTabs()).map(new ToolbarControllerAdapterV2$$ExternalSyntheticLambda4()).collect(Collectors.toList()), toolbarControllerAdapterV2$ToolbarAdapterState.getSelectedTab());
        } else if (ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mhasTabs(toolbarControllerAdapterV2$ToolbarAdapterState) && toolbarControllerAdapterV2$ToolbarAdapterState.getSelectedTab() != toolbarControllerAdapterV2$ToolbarAdapterState2.getSelectedTab()) {
            this.mOemToolbar.selectTab(toolbarControllerAdapterV2$ToolbarAdapterState.getSelectedTab(), true);
        }
        if (!Objects.equals(ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetShownMenuItems(toolbarControllerAdapterV2$ToolbarAdapterState), ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetShownMenuItems(toolbarControllerAdapterV2$ToolbarAdapterState2))) {
            this.mOemToolbar.setMenuItems(ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetShownMenuItems(toolbarControllerAdapterV2$ToolbarAdapterState));
        }
    }

    private void updateModernTabsFromDeprecatedOnes() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.mDeprecatedTabs.iterator();
        if (!iterator.hasNext()) {
            iterator = bnv.l(arrayList, new ToolbarControllerAdapterV2$$ExternalSyntheticLambda6(this, arrayList));
            this.update(this.mAdapterState.copy().setTabs(bnv.l((List)((Object)iterator), new ToolbarControllerAdapterV2$$ExternalSyntheticLambda7())).build());
            return;
        }
        iterator = (bzb)iterator.next();
        throw null;
    }

    public void addTab(bni object) {
        ToolbarControllerAdapterV2$$ExternalSyntheticLambda1 toolbarControllerAdapterV2$$ExternalSyntheticLambda1 = new ToolbarControllerAdapterV2$$ExternalSyntheticLambda1(this);
        int n2 = ToolbarControllerAdapterV2$$ExternalSyntheticLambda2.a;
        object = new bzb(this.mContext, (bni)object, toolbarControllerAdapterV2$$ExternalSyntheticLambda1);
        this.mDeprecatedTabs.add(object);
        this.updateModernTabsFromDeprecatedOnes();
    }

    public boolean canShowSearchResultItems() {
        return this.getSearchCapabilities().b;
    }

    public boolean canShowSearchResultsView() {
        return this.getSearchCapabilities().a;
    }

    public void clearAllTabs() {
        this.setTabs(Collections.emptyList());
    }

    public bml findMenuItemById(int n2) {
        for (bml bml2 : this.getMenuItems()) {
            if (bml2.f != n2) continue;
            return bml2;
        }
        return null;
    }

    public boolean getBackgroundShown() {
        return this.mBackgroundShown;
    }

    public List getMenuItems() {
        return this.mClientMenuItems;
    }

    public bmp getNavButtonMode() {
        return this.mAdapterState.getNavButtonMode();
    }

    public bmq getProgressBar() {
        return this.mProgressBar;
    }

    public bms getSearchCapabilities() {
        if (!this.mSupportsImeSearch) {
            return new bms(new bmr());
        }
        return this.mSearchWidescreenController.b();
    }

    public CharSequence getSearchHint() {
        return this.mSearchHint;
    }

    public bmv getSearchMode() {
        return ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetSearchMode(this.mAdapterState);
    }

    public int getSelectedTab() {
        int n2 = this.mAdapterState.getSelectedTab();
        if (this.mAdapterState.getTabs().isEmpty() && n2 != -1) {
            throw new IllegalStateException("mSelectedTab should've been -1");
        }
        return n2;
    }

    public boolean getShowMenuItemsWhileSearching() {
        return this.mAdapterState.getShowMenuItemsWhileSearching();
    }

    public boolean getShowTabsInSubpage() {
        return this.mAdapterState.getShowTabsInSubpage();
    }

    public bnp getState() {
        return this.mAdapterState.getState();
    }

    public CharSequence getSubtitle() {
        return this.mAdapterState.getSubtitle();
    }

    public bni getTab(int n2) {
        return (bni)((bzb)this.mDeprecatedTabs.get((int)n2)).a;
    }

    public int getTabCount() {
        return this.mDeprecatedTabs.size();
    }

    public int getTabPosition(bni bni2) {
        for (int i2 = 0; i2 < this.mDeprecatedTabs.size(); ++i2) {
            if (((bzb)this.mDeprecatedTabs.get((int)i2)).a != bni2) continue;
            return i2;
        }
        return -1;
    }

    public List getTabs() {
        return DesugarCollections.unmodifiableList(Collection$_EL.stream(this.mAdapterState.getTabs()).map(new ToolbarControllerAdapterV2$$ExternalSyntheticLambda0()).collect(Collectors.toList()));
    }

    public CharSequence getTitle() {
        return this.mAdapterState.getTitle();
    }

    @Override
    public boolean isStateSet() {
        return this.mAdapterState.isStateSet();
    }

    public /* synthetic */ void lambda$addTab$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(bni object, bng bng2) {
        object = this.mOnTabSelectedListeners.iterator();
        while (object.hasNext()) {
            ((bno)object.next()).a();
        }
    }

    public /* synthetic */ void lambda$new$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(Activity activity) {
        Iterator iterator = this.mDeprecatedBackListeners.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= ((bnl)iterator.next()).a();
        }
        iterator = this.mBackListeners.iterator();
        while (iterator.hasNext()) {
            bl2 |= ((Boolean)ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(iterator.next()))).booleanValue();
        }
        if (!bl2 && activity != null) {
            activity.onBackPressed();
        }
    }

    public /* synthetic */ void lambda$new$1$com-android-car-ui-toolbar-ToolbarControllerAdapterV2() {
        Iterator iterator = this.mDeprecatedSearchCompletedListeners.iterator();
        while (iterator.hasNext()) {
            ((bnm)iterator.next()).a();
        }
        iterator = this.mSearchCompletedListeners.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
    }

    public /* synthetic */ MenuItemAdapterV1 lambda$setMenuItems$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(bml bml2) {
        return new MenuItemAdapterV1(this, bml2);
    }

    public /* synthetic */ bng lambda$setTabs$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(List list, bng bng2) {
        bnf bnf2 = new bnf(bng2);
        bnf2.a = new ToolbarControllerAdapterV2$$ExternalSyntheticLambda5(this, list, bng2, (java.util.function.Consumer)bng2.d);
        return new bng(bnf2);
    }

    public /* synthetic */ void lambda$setTabs$1$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(List list, bng bng2, java.util.function.Consumer consumer, bng bng3) {
        int n2 = list.indexOf(bng2);
        this.mAdapterState = this.mAdapterState.copy().setSelectedTab(n2).build();
        if (consumer != null) {
            ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)bng2);
        }
    }

    public /* synthetic */ bng lambda$updateModernTabsFromDeprecatedOnes$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(List list, bng bng2) {
        bnf bnf2 = new bnf(bng2);
        bnf2.a = new ToolbarControllerAdapterV2$$ExternalSyntheticLambda10(this, list, bng2, (java.util.function.Consumer)bng2.d);
        return new bng(bnf2);
    }

    public /* synthetic */ void lambda$updateModernTabsFromDeprecatedOnes$1$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(List list, bng bng2, java.util.function.Consumer consumer, bng bng3) {
        int n2 = list.indexOf(bng2);
        this.mAdapterState = this.mAdapterState.copy().setSelectedTab(n2).build();
        if (consumer != null) {
            ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)bng2);
        }
    }

    public void registerBackListener(Supplier supplier) {
        this.mBackListeners.add(supplier);
    }

    public void registerOnBackListener(bnl bnl2) {
        this.mDeprecatedBackListeners.add(bnl2);
    }

    public void registerOnSearchCompletedListener(bnm bnm2) {
        this.mDeprecatedSearchCompletedListeners.add(bnm2);
    }

    public void registerOnSearchListener(bnn bnn2) {
        this.mDeprecatedSearchListeners.add(bnn2);
    }

    public void registerOnTabSelectedListener(bno bno2) {
        this.mOnTabSelectedListeners.add(bno2);
    }

    public void registerSearchCompletedListener(Runnable runnable) {
        this.mSearchCompletedListeners.add(runnable);
    }

    public void registerSearchListener(java.util.function.Consumer consumer) {
        this.mSearchListeners.add(consumer);
    }

    public bml requireMenuItemById(int n2) {
        bml bml2 = this.findMenuItemById(n2);
        if (bml2 != null) {
            return bml2;
        }
        throw new IllegalArgumentException("ID does not reference a MenuItem on this Toolbar");
    }

    public void selectTab(int n2) {
        if (n2 >= 0 && n2 < this.mAdapterState.getTabs().size()) {
            this.update(this.mAdapterState.copy().setSelectedTab(n2).build());
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Tab position is invalid: "));
    }

    public void setBackgroundShown(boolean bl2) {
        this.mBackgroundShown = bl2;
        this.mOemToolbar.setBackgroundShown(bl2);
    }

    public void setLogo(int n2) {
        this.setLogo(this.getDrawable(n2));
    }

    @Override
    public void setLogo(Drawable drawable) {
        this.update(this.mAdapterState.copy().setLogo(drawable).build());
    }

    public List setMenuItems(int n2) {
        List list = AmbientModeSupport$AmbientCallback.u(this.mContext, n2);
        this.setMenuItems(list);
        return list;
    }

    @Override
    public void setMenuItems(List list) {
        List list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        this.mClientMenuItems = list2;
        this.update(this.mAdapterState.copy().setMenuItems(bnv.l(list2, new ToolbarControllerAdapterV2$$ExternalSyntheticLambda3(this))).build());
    }

    @Override
    public void setNavButtonMode(bmp bmp2) {
        this.update(this.mAdapterState.copy().setNavButtonMode(bmp2).build());
    }

    @Override
    public void setNavButtonMode(bnk bnk2) {
        int n2 = bnk2.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    this.setNavButtonMode(bmp.d);
                    return;
                }
                this.setNavButtonMode(bmp.c);
                return;
            }
            this.setNavButtonMode(bmp.b);
            return;
        }
        this.setNavButtonMode(bmp.a);
    }

    public void setOnLogoClickListener(Runnable runnable) {
    }

    public void setSearchConfig(bmu bmu2) {
        this.mSearchWidescreenController.c(bmu2);
    }

    public void setSearchHint(int n2) {
        this.setSearchHint(this.mContext.getString(n2));
    }

    public void setSearchHint(CharSequence charSequence) {
        charSequence = bnv.j(charSequence);
        this.mSearchHint = charSequence;
        this.mOemToolbar.setSearchHint((String)charSequence);
    }

    public void setSearchIcon(int n2) {
        this.setSearchIcon(this.getDrawable(n2));
    }

    public void setSearchIcon(Drawable drawable) {
        this.mOemToolbar.setSearchIcon(drawable);
    }

    public void setSearchMode(bmv bmv2) {
        this.update(this.mAdapterState.copy().setSearchMode(bmv2).build());
    }

    public void setSearchQuery(String string) {
        this.mOemToolbar.setSearchQuery(string);
    }

    public void setSearchResultItems(List list) {
        this.mSearchConfigBuilder.b(list);
        this.setSearchConfig(this.mSearchConfigBuilder.a());
    }

    public void setSearchResultsInputViewIcon(Drawable drawable) {
        bmt bmt2 = this.mSearchConfigBuilder;
        bmt2.b = drawable;
        this.setSearchConfig(bmt2.a());
    }

    public void setSearchResultsView(View view) {
        bmt bmt2 = this.mSearchConfigBuilder;
        bmt2.a = view;
        this.setSearchConfig(bmt2.a());
    }

    public void setShowMenuItemsWhileSearching(boolean bl2) {
        this.update(this.mAdapterState.copy().setShowMenuItemsWhileSearching(bl2).build());
    }

    public void setShowTabsInSubpage(boolean bl2) {
        this.update(this.mAdapterState.copy().setShowTabsInSubpage(bl2).build());
    }

    @Override
    public void setState(bnp bnp2) {
        this.update(this.mAdapterState.copy().setState(bnp2).build());
    }

    public void setSubtitle(int n2) {
        String string = n2 == 0 ? null : this.mContext.getString(n2);
        this.setSubtitle(string);
    }

    public void setSubtitle(bjh bjh2) {
        this.update(this.mAdapterState.copy().setSubtitle(bnv.j(bjh2.a())).build());
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
        this.update(this.mAdapterState.copy().setSubtitle(bnv.j(charSequence)).build());
    }

    @Override
    public void setTabs(List list) {
        this.setTabs(list, 0);
    }

    public void setTabs(List list, int n2) {
        this.mDeprecatedTabs.clear();
        if (list != null && !list.isEmpty()) {
            if (n2 < 0 || n2 >= list.size()) {
                throw new IllegalArgumentException(a.af(n2, "Tab position is invalid: "));
            }
        } else {
            n2 = -1;
        }
        list = bnv.l(list, new ToolbarControllerAdapterV2$$ExternalSyntheticLambda11(this, list));
        this.update(this.mAdapterState.copy().setTabs(bnv.l(list, new ToolbarControllerAdapterV2$$ExternalSyntheticLambda7())).setSelectedTab(n2).build());
    }

    @Override
    public void setTitle(int n2) {
        String string = n2 == 0 ? null : this.mContext.getString(n2);
        this.setTitle(string);
    }

    public void setTitle(bjh bjh2) {
        this.update(this.mAdapterState.copy().setTitle(bnv.j(bjh2.toString())).build());
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.update(this.mAdapterState.copy().setTitle(bnv.j(charSequence)).build());
    }

    public boolean unregisterBackListener(Supplier supplier) {
        return this.mBackListeners.remove(supplier);
    }

    public boolean unregisterOnBackListener(bnl bnl2) {
        return this.mDeprecatedBackListeners.remove(bnl2);
    }

    public boolean unregisterOnSearchCompletedListener(bnm bnm2) {
        return this.mDeprecatedSearchCompletedListeners.remove(bnm2);
    }

    public boolean unregisterOnSearchListener(bnn bnn2) {
        return this.mDeprecatedSearchListeners.remove(bnn2);
    }

    public boolean unregisterOnTabSelectedListener(bno bno2) {
        return this.mOnTabSelectedListeners.remove(bno2);
    }

    public boolean unregisterSearchCompletedListener(Runnable runnable) {
        return this.mSearchCompletedListeners.remove(runnable);
    }

    public boolean unregisterSearchListener(java.util.function.Consumer consumer) {
        return this.mSearchListeners.remove(consumer);
    }

    public void updateMenuItems() {
        List list = ToolbarControllerAdapterV2$ToolbarAdapterState.-$$Nest$mgetShownMenuItems(this.mAdapterState);
        this.mOemToolbar.setMenuItems(list);
    }
}

