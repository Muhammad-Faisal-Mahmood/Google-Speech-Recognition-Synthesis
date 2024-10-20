/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  com.android.car.ui.plugin.oemapis.FocusAreaOEMV1
 *  com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1
 *  com.android.car.ui.plugin.oemapis.InsetsOEMV1
 *  com.android.car.ui.plugin.oemapis.PluginFactoryOEMV1
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV1
 *  com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV1
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.car.ui.FocusArea;
import com.android.car.ui.FocusAreaAdapterV1;
import com.android.car.ui.FocusParkingView;
import com.android.car.ui.FocusParkingViewAdapterV1;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV1;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.plugin.oemapis.FocusAreaOEMV1;
import com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1;
import com.android.car.ui.plugin.oemapis.InsetsOEMV1;
import com.android.car.ui.plugin.oemapis.PluginFactoryOEMV1;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV1;
import com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV1$$ExternalSyntheticLambda0;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV1$$ExternalSyntheticLambda1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV1$$ExternalSyntheticLambda2;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class PluginFactoryAdapterV1
implements bkc {
    private final bki mFactoryStub = new bki();
    private final PluginFactoryOEMV1 mOem;

    public PluginFactoryAdapterV1(PluginFactoryOEMV1 pluginFactoryOEMV1) {
        this.mOem = pluginFactoryOEMV1;
        pluginFactoryOEMV1.setRotaryFactories((Function)new PluginFactoryAdapterV1$$ExternalSyntheticLambda0(), (Function)new PluginFactoryAdapterV1$$ExternalSyntheticLambda1());
    }

    private Insets adaptInsets(InsetsOEMV1 insetsOEMV1) {
        return new Insets(insetsOEMV1.getLeft(), insetsOEMV1.getTop(), insetsOEMV1.getRight(), insetsOEMV1.getBottom());
    }

    static /* synthetic */ FocusParkingViewOEMV1 lambda$new$0(Context context) {
        return new FocusParkingViewAdapterV1(new FocusParkingView(context));
    }

    static /* synthetic */ FocusAreaOEMV1 lambda$new$1(Context context) {
        return new FocusAreaAdapterV1(new FocusArea(context));
    }

    public bjs createAppStyledView(Context object) {
        AppStyledViewControllerOEMV1 appStyledViewControllerOEMV1 = this.mOem.createAppStyledView(object);
        object = appStyledViewControllerOEMV1 == null ? new bjt((Context)object) : new AppStyledViewControllerAdapterV1((Context)object, appStyledViewControllerOEMV1);
        return object;
    }

    @Override
    public View createCarUiPreferenceView(Context context, AttributeSet attributeSet) {
        return blf.d(context, attributeSet);
    }

    public kf createListItemAdapter(List list) {
        return new bli(list);
    }

    @Override
    public CarUiRecyclerView createRecyclerView(Context context, AttributeSet attributeSet) {
        return new blp(context, attributeSet);
    }

    @Override
    public bok createTextView(Context context, AttributeSet attributeSet) {
        return new bol(context, attributeSet);
    }

    @Override
    public bnq installBaseLayoutAround(Context context, View view, bju bju2, boolean bl2, boolean bl3) {
        if (!this.mOem.customizesBaseLayout()) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, bl2, bl3);
        }
        PluginFactoryOEMV1 pluginFactoryOEMV1 = this.mOem;
        PluginFactoryAdapterV1$$ExternalSyntheticLambda2 pluginFactoryAdapterV1$$ExternalSyntheticLambda2 = bju2 == null ? null : new PluginFactoryAdapterV1$$ExternalSyntheticLambda2(this, bju2);
        if ((pluginFactoryAdapterV1$$ExternalSyntheticLambda2 = pluginFactoryOEMV1.installBaseLayoutAround(context, view, (Consumer)pluginFactoryAdapterV1$$ExternalSyntheticLambda2, bl2, bl3)) != null) {
            return new ToolbarControllerAdapterV1(context, (ToolbarControllerOEMV1)pluginFactoryAdapterV1$$ExternalSyntheticLambda2);
        }
        if (bl2) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, true, bl3);
        }
        return null;
    }

    public /* synthetic */ void lambda$installBaseLayoutAround$0$com-android-car-ui-pluginsupport-PluginFactoryAdapterV1(bju bju2, InsetsOEMV1 insetsOEMV1) {
        bju2.a(this.adaptInsets(insetsOEMV1));
    }
}

