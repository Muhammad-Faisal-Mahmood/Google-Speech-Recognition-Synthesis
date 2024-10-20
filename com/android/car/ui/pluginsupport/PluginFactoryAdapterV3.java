/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  com.android.car.ui.plugin.oemapis.FocusAreaOEMV1
 *  com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1
 *  com.android.car.ui.plugin.oemapis.InsetsOEMV1
 *  com.android.car.ui.plugin.oemapis.PluginFactoryOEMV3
 *  com.android.car.ui.plugin.oemapis.TextOEMV1
 *  com.android.car.ui.plugin.oemapis.TextOEMV1$Builder
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV2
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV1$Action
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV1$Builder
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV1$IconType
 *  com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV1
 *  com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV1
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.car.ui.FocusArea;
import com.android.car.ui.FocusAreaAdapterV1;
import com.android.car.ui.FocusParkingView;
import com.android.car.ui.FocusParkingViewAdapterV1;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV2;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.plugin.oemapis.FocusAreaOEMV1;
import com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1;
import com.android.car.ui.plugin.oemapis.InsetsOEMV1;
import com.android.car.ui.plugin.oemapis.PluginFactoryOEMV3;
import com.android.car.ui.plugin.oemapis.TextOEMV1;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV1;
import com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$$ExternalSyntheticLambda0;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$$ExternalSyntheticLambda2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$$ExternalSyntheticLambda3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$$ExternalSyntheticLambda4;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$$ExternalSyntheticLambda5;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$$ExternalSyntheticLambda6;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3$3;
import com.android.car.ui.recyclerview.CarUiListItemAdapterAdapterV1;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.android.car.ui.recyclerview.RecyclerViewAdapterV1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class PluginFactoryAdapterV3
implements bkc {
    private final bki mFactoryStub = new bki();
    private final PluginFactoryOEMV3 mOem;

    public static /* synthetic */ ListItemOEMV1 $r8$lambda$3F5PtepjNTk0SePz_uOoZGtS-os(blf blf2) {
        return PluginFactoryAdapterV3.toOemListItem(blf2);
    }

    static /* bridge */ /* synthetic */ ListItemOEMV1 -$$Nest$smtoOemListItem(blf blf2) {
        return PluginFactoryAdapterV3.toOemListItem(blf2);
    }

    public PluginFactoryAdapterV3(PluginFactoryOEMV3 pluginFactoryOEMV3) {
        this.mOem = pluginFactoryOEMV3;
        pluginFactoryOEMV3.setRotaryFactories((Function)new PluginFactoryAdapterV3$$ExternalSyntheticLambda4(), (Function)new PluginFactoryAdapterV3$$ExternalSyntheticLambda5());
    }

    private Insets adaptInsets(InsetsOEMV1 insetsOEMV1) {
        return new Insets(insetsOEMV1.getLeft(), insetsOEMV1.getTop(), insetsOEMV1.getRight(), insetsOEMV1.getBottom());
    }

    private static RecyclerViewAttributesOEMV1 from(Context context, AttributeSet attributeSet) {
        Object object = context.obtainStyledAttributes(attributeSet, bjm.c, 0, 0);
        int n2 = object.getInt(4, 0);
        int n3 = object.getInt(5, 1);
        boolean bl2 = object.getBoolean(7, false);
        int n4 = object.getInt(0, 1);
        boolean bl3 = object.getBoolean(6, false);
        int n5 = object.getInt(1, 2);
        object.recycle();
        Object object2 = object = (Object)new int[17];
        object2[0] = (TypedArray)16842996;
        object2[1] = (TypedArray)16842997;
        object2[2] = (TypedArray)16843071;
        object2[3] = (TypedArray)0x1010140;
        object2[4] = (TypedArray)16843699;
        object2[5] = (TypedArray)16842966;
        object2[6] = (TypedArray)16843700;
        object2[7] = (TypedArray)16842968;
        object2[8] = (TypedArray)16842967;
        object2[9] = (TypedArray)16842969;
        object2[10] = (TypedArray)16843701;
        object2[11] = (TypedArray)16842999;
        object2[12] = (TypedArray)16843702;
        object2[13] = (TypedArray)16843001;
        object2[14] = (TypedArray)16843000;
        object2[15] = (TypedArray)16843002;
        object2[16] = (TypedArray)16842964;
        Arrays.sort((int[])object);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, (int[])object, 0, 0);
        int n6 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16842996), -1);
        int n7 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16842997), -2);
        int n8 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843071), 0);
        int n9 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 0x1010140), 0);
        int n10 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16842966), 0);
        int n11 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16842968), 0);
        int n12 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843699), 0);
        int n13 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843700), 0);
        int n14 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16842967), 0);
        int n15 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16842969), 0);
        int n16 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16842999), 0);
        int n17 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843001), 0);
        int n18 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843701), 0);
        int n19 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843702), 0);
        int n20 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843000), 0);
        int n21 = typedArray.getLayoutDimension(Arrays.binarySearch((int[])object, 16843002), 0);
        attributeSet = typedArray.getDrawable(Arrays.binarySearch((int[])object, 16842964));
        typedArray.recycle();
        object = new PluginFactoryAdapterV3$2(n3, n2, n4, bl3);
        bl3 = context.getResources().getConfiguration().getLayoutDirection() == 0;
        return new PluginFactoryAdapterV3$3(bl2, n5, (LayoutStyleOEMV1)object, n6, n7, n8, n9, n10, bl3, n12, n13, n11, n14, n15, n16, n18, n19, n17, n20, n21, (Drawable)attributeSet);
    }

    static /* synthetic */ FocusParkingViewOEMV1 lambda$new$0(Context context) {
        return new FocusParkingViewAdapterV1(new FocusParkingView(context));
    }

    static /* synthetic */ FocusAreaOEMV1 lambda$new$1(Context context) {
        return new FocusAreaAdapterV1(new FocusArea(context));
    }

    static /* synthetic */ void lambda$toOemListItem$0(bla bla2, ContentListItemOEMV1 contentListItemOEMV1) {
        throw null;
    }

    static /* synthetic */ void lambda$toOemListItem$1(bla bla2, ContentListItemOEMV1 contentListItemOEMV1) {
        bla2.i.b();
    }

    static /* synthetic */ void lambda$toOemListItem$2(bla bla2, ContentListItemOEMV1 contentListItemOEMV1) {
        bla2.a(contentListItemOEMV1.isChecked());
    }

    private static ListItemOEMV1 toOemListItem(blf blf2) {
        if (!(blf2 instanceof blc)) {
            if (blf2 instanceof bla) {
                blf2 = (bla)blf2;
                ContentListItemOEMV1.Builder builder = new ContentListItemOEMV1.Builder(PluginFactoryAdapterV3.toOemListItemAction(((bla)blf2).c));
                bjh bjh2 = ((bla)blf2).b;
                if (bjh2 != null) {
                    builder.setTitle(PluginFactoryAdapterV3.toOemText(bjh2));
                }
                builder.setIcon(((bla)blf2).a, PluginFactoryAdapterV3.toOemListItemIconType(((bla)blf2).d));
                if (((bla)blf2).c == bkx.e) {
                    builder.setSupplementalIcon(null, null);
                }
                if (((bla)blf2).i != null) {
                    builder.setOnItemClickedListener((Consumer)new PluginFactoryAdapterV3$$ExternalSyntheticLambda2((bla)blf2));
                }
                builder.setOnCheckedChangeListener((Consumer)new PluginFactoryAdapterV3$$ExternalSyntheticLambda3((bla)blf2)).setActionDividerVisible(false).setEnabled(((bla)blf2).f).setChecked(((bla)blf2).e).setActivated(((bla)blf2).g).setSecure(false);
                return builder.build();
            }
            throw new IllegalStateException("Unknown view type.");
        }
        blf2 = (blc)blf2;
        throw null;
    }

    private static ContentListItemOEMV1.Action toOemListItemAction(bkx bkx2) {
        int n2 = bkx2.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 == 5) {
                                return ContentListItemOEMV1.Action.CHEVRON;
                            }
                            throw new IllegalStateException("Unexpected list item action type");
                        }
                        return ContentListItemOEMV1.Action.ICON;
                    }
                    return ContentListItemOEMV1.Action.RADIO_BUTTON;
                }
                return ContentListItemOEMV1.Action.CHECK_BOX;
            }
            return ContentListItemOEMV1.Action.SWITCH;
        }
        return ContentListItemOEMV1.Action.NONE;
    }

    private static ContentListItemOEMV1.IconType toOemListItemIconType(bky bky2) {
        int n2 = bky2.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    return ContentListItemOEMV1.IconType.AVATAR;
                }
                throw new IllegalStateException("Unexpected list item icon type");
            }
            return ContentListItemOEMV1.IconType.STANDARD;
        }
        return ContentListItemOEMV1.IconType.CONTENT;
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
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (bjh)iterator.next();
            TextOEMV1.Builder builder = new TextOEMV1.Builder((List)((bjh)object).c);
            int n2 = ((bjh)object).b;
            builder = builder.setMaxChars(Integer.MAX_VALUE);
            n2 = ((bjh)object).a;
            arrayList.add(builder.setMaxLines(Integer.MAX_VALUE).build());
        }
        return arrayList;
    }

    public bjs createAppStyledView(Context object) {
        AppStyledViewControllerOEMV2 appStyledViewControllerOEMV2 = this.mOem.createAppStyledView(object);
        object = appStyledViewControllerOEMV2 == null ? new bjt((Context)object) : new AppStyledViewControllerAdapterV2((Context)object, appStyledViewControllerOEMV2);
        return object;
    }

    @Override
    public View createCarUiPreferenceView(Context context, AttributeSet attributeSet) {
        return blf.d(context, attributeSet);
    }

    public kf createListItemAdapter(List list) {
        List list2 = bnv.l(list, new PluginFactoryAdapterV3$$ExternalSyntheticLambda0());
        Object object = this.mOem.createListItemAdapter(list2);
        if (object == null) {
            return new bli(list);
        }
        object = new CarUiListItemAdapterAdapterV1((AdapterOEMV1)object);
        ((kf)object).registerAdapterDataObserver(new PluginFactoryAdapterV3$1(this, list2, list));
        return object;
    }

    @Override
    public CarUiRecyclerView createRecyclerView(Context object, AttributeSet attributeSet) {
        RecyclerViewAttributesOEMV1 recyclerViewAttributesOEMV1 = PluginFactoryAdapterV3.from((Context)object, attributeSet);
        RecyclerViewOEMV1 recyclerViewOEMV1 = this.mOem.createRecyclerView((Context)object, recyclerViewAttributesOEMV1);
        if (recyclerViewOEMV1 != null) {
            object = new RecyclerViewAdapterV1((Context)object, attributeSet, 0);
            ((RecyclerViewAdapterV1)object).setOemRecyclerView(recyclerViewOEMV1, recyclerViewAttributesOEMV1);
            return object;
        }
        return new blp((Context)object, attributeSet);
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
        PluginFactoryOEMV3 pluginFactoryOEMV3 = this.mOem;
        PluginFactoryAdapterV3$$ExternalSyntheticLambda6 pluginFactoryAdapterV3$$ExternalSyntheticLambda6 = bju2 == null ? null : new PluginFactoryAdapterV3$$ExternalSyntheticLambda6(this, bju2);
        if ((pluginFactoryAdapterV3$$ExternalSyntheticLambda6 = pluginFactoryOEMV3.installBaseLayoutAround(context, view, (Consumer)pluginFactoryAdapterV3$$ExternalSyntheticLambda6, bl2, bl3)) != null) {
            return new ToolbarControllerAdapterV1(context, (ToolbarControllerOEMV1)pluginFactoryAdapterV3$$ExternalSyntheticLambda6);
        }
        if (bl2) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, true, bl3);
        }
        return null;
    }

    public /* synthetic */ void lambda$installBaseLayoutAround$0$com-android-car-ui-pluginsupport-PluginFactoryAdapterV3(bju bju2, InsetsOEMV1 insetsOEMV1) {
        bju2.a(this.adaptInsets(insetsOEMV1));
    }
}

