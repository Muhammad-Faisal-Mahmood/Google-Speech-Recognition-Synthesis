/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  com.android.car.ui.plugin.oemapis.Consumer
 *  com.android.car.ui.plugin.oemapis.Function
 *  com.android.car.ui.plugin.oemapis.InsetsOEMV1
 *  com.android.car.ui.plugin.oemapis.PluginFactoryOEMV9
 *  com.android.car.ui.plugin.oemapis.TextOEMV1
 *  com.android.car.ui.plugin.oemapis.TextOEMV1$Builder
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV4
 *  com.android.car.ui.plugin.oemapis.preference.PreferenceOEMV1
 *  com.android.car.ui.plugin.oemapis.preference.PreferenceViewAttributesOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2$Action
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2$Builder
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2$IconType
 *  com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV3
 *  com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV3
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV4;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.plugin.oemapis.Consumer;
import com.android.car.ui.plugin.oemapis.Function;
import com.android.car.ui.plugin.oemapis.InsetsOEMV1;
import com.android.car.ui.plugin.oemapis.PluginFactoryOEMV9;
import com.android.car.ui.plugin.oemapis.TextOEMV1;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV4;
import com.android.car.ui.plugin.oemapis.preference.PreferenceOEMV1;
import com.android.car.ui.plugin.oemapis.preference.PreferenceViewAttributesOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV3;
import com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$$ExternalSyntheticLambda1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$$ExternalSyntheticLambda2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$$ExternalSyntheticLambda3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$4;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$5;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$6;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9$7;
import com.android.car.ui.recyclerview.CarUiListItemAdapterAdapterV2;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.android.car.ui.recyclerview.RecyclerViewAdapterV3;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class PluginFactoryAdapterV9
implements bkc {
    private final bki mFactoryStub = new bki();
    private final PluginFactoryOEMV9 mOem;

    public static /* synthetic */ ListItemOEMV1 $r8$lambda$vlhx93mi2JtYdz0uyIG6TNf0I9Y(blf blf2) {
        return PluginFactoryAdapterV9.toOemListItem(blf2);
    }

    static /* bridge */ /* synthetic */ Insets -$$Nest$madaptInsets(PluginFactoryAdapterV9 pluginFactoryAdapterV9, InsetsOEMV1 insetsOEMV1) {
        return pluginFactoryAdapterV9.adaptInsets(insetsOEMV1);
    }

    static /* bridge */ /* synthetic */ ListItemOEMV1 -$$Nest$smtoOemListItem(blf blf2) {
        return PluginFactoryAdapterV9.toOemListItem(blf2);
    }

    public PluginFactoryAdapterV9(PluginFactoryOEMV9 pluginFactoryOEMV9) {
        this.mOem = pluginFactoryOEMV9;
        pluginFactoryOEMV9.setRotaryFactories((Function)new PluginFactoryAdapterV9$1(this), (Function)new PluginFactoryAdapterV9$2(this));
    }

    private Insets adaptInsets(InsetsOEMV1 insetsOEMV1) {
        return new Insets(insetsOEMV1.getLeft(), insetsOEMV1.getTop(), insetsOEMV1.getRight(), insetsOEMV1.getBottom());
    }

    private static RecyclerViewAttributesOEMV1 from(Context context, AttributeSet attributeSet) {
        int[] nArray;
        Object object = context.obtainStyledAttributes(attributeSet, bjm.c, 0, 0);
        int n2 = object.getInt(4, 0);
        int n3 = object.getInt(5, 1);
        boolean bl2 = object.getBoolean(7, false);
        int n4 = object.getInt(0, 1);
        boolean bl3 = object.getBoolean(6, false);
        int n5 = object.getInt(1, 2);
        object.recycle();
        int[] nArray2 = nArray = new int[17];
        nArray[0] = 16842996;
        nArray2[1] = 16842997;
        nArray2[2] = 16843071;
        nArray2[3] = 0x1010140;
        nArray2[4] = 16843699;
        nArray2[5] = 16842966;
        nArray2[6] = 16843700;
        nArray2[7] = 16842968;
        nArray2[8] = 16842967;
        nArray2[9] = 16842969;
        nArray2[10] = 16843701;
        nArray2[11] = 16842999;
        nArray2[12] = 16843702;
        nArray2[13] = 16843001;
        nArray2[14] = 16843000;
        nArray2[15] = 16843002;
        nArray2[16] = 16842964;
        Arrays.sort(nArray);
        object = context.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        int n6 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16842996), -1);
        int n7 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16842997), -2);
        int n8 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843071), 0);
        int n9 = object.getLayoutDimension(Arrays.binarySearch(nArray, 0x1010140), 0);
        int n10 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16842966), 0);
        int n11 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16842968), 0);
        int n12 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843699), 0);
        int n13 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843700), 0);
        int n14 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16842967), 0);
        int n15 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16842969), 0);
        int n16 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16842999), 0);
        int n17 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843001), 0);
        int n18 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843701), 0);
        int n19 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843702), 0);
        int n20 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843000), 0);
        int n21 = object.getLayoutDimension(Arrays.binarySearch(nArray, 16843002), 0);
        attributeSet = object.getDrawable(Arrays.binarySearch(nArray, 16842964));
        object.recycle();
        object = new PluginFactoryAdapterV9$6(n3, n2, n4, bl3);
        bl3 = context.getResources().getConfiguration().getLayoutDirection() == 0;
        return new PluginFactoryAdapterV9$7(bl2, n5, (LayoutStyleOEMV1)object, n6, n7, n8, n9, n10, bl3, n12, n13, n11, n14, n15, n16, n18, n19, n17, n20, n21, (Drawable)attributeSet);
    }

    static /* synthetic */ void lambda$toOemListItem$0(bla bla2, ContentListItemOEMV2 contentListItemOEMV2) {
        throw null;
    }

    static /* synthetic */ void lambda$toOemListItem$1(bla bla2, ContentListItemOEMV2 contentListItemOEMV2) {
        bla2.i.b();
    }

    static /* synthetic */ void lambda$toOemListItem$2(bla bla2, ContentListItemOEMV2 contentListItemOEMV2) {
        bla2.a(contentListItemOEMV2.isChecked());
    }

    private static ListItemOEMV1 toOemListItem(blf blf2) {
        if (!(blf2 instanceof blc)) {
            if (blf2 instanceof bla) {
                blf2 = (bla)blf2;
                ContentListItemOEMV2.Builder builder = new ContentListItemOEMV2.Builder(PluginFactoryAdapterV9.toOemListItemAction(((bla)blf2).c));
                bjh bjh2 = ((bla)blf2).b;
                if (bjh2 != null) {
                    builder.setTitle(PluginFactoryAdapterV9.toOemText(bjh2));
                }
                builder.setIcon(((bla)blf2).a, PluginFactoryAdapterV9.toOemListItemIconType(((bla)blf2).d));
                if (((bla)blf2).c == bkx.e) {
                    builder.setSupplementalIcon(null, null);
                }
                if (((bla)blf2).i != null) {
                    builder.setOnItemClickedListener((Consumer)new PluginFactoryAdapterV9$$ExternalSyntheticLambda1((bla)blf2));
                }
                builder.setOnCheckedChangeListener((Consumer)new PluginFactoryAdapterV9$$ExternalSyntheticLambda2((bla)blf2)).setActionDividerVisible(false).setEnabled(((bla)blf2).f).setChecked(((bla)blf2).e).setActivated(((bla)blf2).g).setSecure(false);
                return builder.build();
            }
            throw new IllegalStateException("Unknown view type.");
        }
        blf2 = (blc)blf2;
        throw null;
    }

    private static ContentListItemOEMV2.Action toOemListItemAction(bkx bkx2) {
        int n2 = bkx2.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                return ContentListItemOEMV2.Action.CHEVRON;
                            }
                            throw new IllegalStateException("Unexpected list item action type");
                        }
                        return ContentListItemOEMV2.Action.ICON;
                    }
                    return ContentListItemOEMV2.Action.RADIO_BUTTON;
                }
                return ContentListItemOEMV2.Action.CHECK_BOX;
            }
            return ContentListItemOEMV2.Action.SWITCH;
        }
        return ContentListItemOEMV2.Action.NONE;
    }

    private static ContentListItemOEMV2.IconType toOemListItemIconType(bky bky2) {
        int n2 = bky2.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return ContentListItemOEMV2.IconType.AVATAR;
                }
                throw new IllegalStateException("Unexpected list item icon type");
            }
            return ContentListItemOEMV2.IconType.STANDARD;
        }
        return ContentListItemOEMV2.IconType.CONTENT;
    }

    private static TextOEMV1 toOemText(bjh bjh2) {
        TextOEMV1.Builder builder = new TextOEMV1.Builder((List)bjh2.c);
        int n2 = bjh2.b;
        builder = builder.setMaxChars(Integer.MAX_VALUE);
        n2 = bjh2.a;
        return builder.setMaxLines(Integer.MAX_VALUE).build();
    }

    private static List toOemText(List object) {
        ArrayList<TextOEMV1> arrayList = new ArrayList<TextOEMV1>();
        object = object.iterator();
        while (object.hasNext()) {
            bjh bjh2 = (bjh)object.next();
            TextOEMV1.Builder builder = new TextOEMV1.Builder((List)bjh2.c);
            int n2 = bjh2.b;
            builder = builder.setMaxChars(Integer.MAX_VALUE);
            n2 = bjh2.a;
            arrayList.add(builder.setMaxLines(Integer.MAX_VALUE).build());
        }
        return arrayList;
    }

    public bjs createAppStyledView(Context object) {
        AppStyledViewControllerOEMV4 appStyledViewControllerOEMV4 = this.mOem.createAppStyledView(object);
        object = appStyledViewControllerOEMV4 == null ? new bjt((Context)object) : new AppStyledViewControllerAdapterV4((Context)object, appStyledViewControllerOEMV4);
        return object;
    }

    @Override
    public View createCarUiPreferenceView(Context context, AttributeSet attributeSet) {
        PreferenceOEMV1 preferenceOEMV1 = this.mOem.createCarUiPreference(context);
        if (preferenceOEMV1 == null) {
            return blf.d(context, attributeSet);
        }
        try {
            int n2 = this.getPreferenceType(context, attributeSet);
            PluginFactoryAdapterV9$4 pluginFactoryAdapterV9$4 = new PluginFactoryAdapterV9$4(this, n2);
            pluginFactoryAdapterV9$4 = preferenceOEMV1.createCarUiPreferenceView((PreferenceViewAttributesOEMV1)pluginFactoryAdapterV9$4);
            return pluginFactoryAdapterV9$4;
        }
        catch (Exception exception) {
            return blf.d(context, attributeSet);
        }
    }

    public kf createListItemAdapter(List list) {
        List list2 = bnv.l(list, new PluginFactoryAdapterV9$$ExternalSyntheticLambda3());
        AdapterOEMV2 adapterOEMV2 = this.mOem.createListItemAdapter(list2);
        if (adapterOEMV2 == null) {
            return new bli(list);
        }
        CarUiListItemAdapterAdapterV2 carUiListItemAdapterAdapterV2 = new CarUiListItemAdapterAdapterV2(adapterOEMV2);
        carUiListItemAdapterAdapterV2.registerAdapterDataObserver(new PluginFactoryAdapterV9$5(this, list2, list, adapterOEMV2, carUiListItemAdapterAdapterV2));
        return carUiListItemAdapterAdapterV2;
    }

    @Override
    public CarUiRecyclerView createRecyclerView(Context object, AttributeSet attributeSet) {
        RecyclerViewAttributesOEMV1 recyclerViewAttributesOEMV1 = PluginFactoryAdapterV9.from((Context)object, attributeSet);
        RecyclerViewOEMV3 recyclerViewOEMV3 = this.mOem.createRecyclerView((Context)object, recyclerViewAttributesOEMV1);
        if (recyclerViewOEMV3 != null) {
            object = new RecyclerViewAdapterV3((Context)object, attributeSet, 0);
            ((RecyclerViewAdapterV3)object).setOemRecyclerView(recyclerViewOEMV3, recyclerViewAttributesOEMV1);
            return object;
        }
        return new blp((Context)object, attributeSet);
    }

    @Override
    public bok createTextView(Context context, AttributeSet attributeSet) {
        return new bol(context, attributeSet);
    }

    public int getPreferenceType(Context context, AttributeSet attributeSet) {
        context = context.obtainStyledAttributes(attributeSet, bjm.k, 0, 0);
        int n2 = context.getInt(18, 0);
        context.recycle();
        return n2;
    }

    @Override
    public bnq installBaseLayoutAround(Context context, View view, bju bju2, boolean bl2, boolean bl3) {
        if (!this.mOem.customizesBaseLayout()) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, bl2, bl3);
        }
        ToolbarControllerOEMV3 toolbarControllerOEMV3 = this.mOem.installBaseLayoutAround(context, view, (Consumer)new PluginFactoryAdapterV9$3(this, bju2), bl2, bl3);
        if (toolbarControllerOEMV3 != null) {
            return new ToolbarControllerAdapterV3(context, toolbarControllerOEMV3);
        }
        if (bl2) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, true, bl3);
        }
        return null;
    }
}

