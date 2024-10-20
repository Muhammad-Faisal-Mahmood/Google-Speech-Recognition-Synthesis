/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  com.android.car.ui.plugin.oemapis.Consumer
 *  com.android.car.ui.plugin.oemapis.Function
 *  com.android.car.ui.plugin.oemapis.InsetsOEMV1
 *  com.android.car.ui.plugin.oemapis.PluginFactoryOEMV6
 *  com.android.car.ui.plugin.oemapis.TextOEMV1
 *  com.android.car.ui.plugin.oemapis.TextOEMV1$Builder
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3
 *  com.android.car.ui.plugin.oemapis.preference.PreferenceOEMV1
 *  com.android.car.ui.plugin.oemapis.preference.PreferenceViewAttributesOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2$Action
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2$Builder
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2$IconType
 *  com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV2
 *  com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV2
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.car.ui.appstyledview.AppStyledViewControllerAdapterV3;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.plugin.oemapis.Consumer;
import com.android.car.ui.plugin.oemapis.Function;
import com.android.car.ui.plugin.oemapis.InsetsOEMV1;
import com.android.car.ui.plugin.oemapis.PluginFactoryOEMV6;
import com.android.car.ui.plugin.oemapis.TextOEMV1;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3;
import com.android.car.ui.plugin.oemapis.preference.PreferenceOEMV1;
import com.android.car.ui.plugin.oemapis.preference.PreferenceViewAttributesOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV2;
import com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$$ExternalSyntheticLambda0;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$$ExternalSyntheticLambda2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$$ExternalSyntheticLambda3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$4;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$5;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$6;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV6$7;
import com.android.car.ui.recyclerview.CarUiListItemAdapterAdapterV1;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.android.car.ui.recyclerview.RecyclerViewAdapterV2;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class PluginFactoryAdapterV6
implements bkc {
    private final bki mFactoryStub = new bki();
    private final PluginFactoryOEMV6 mOem;

    public static /* synthetic */ ListItemOEMV1 $r8$lambda$hV39siAVN_Pjo68RR25p3qw7WZI(blf blf2) {
        return PluginFactoryAdapterV6.toOemListItem(blf2);
    }

    static /* bridge */ /* synthetic */ Insets -$$Nest$madaptInsets(PluginFactoryAdapterV6 pluginFactoryAdapterV6, InsetsOEMV1 insetsOEMV1) {
        return pluginFactoryAdapterV6.adaptInsets(insetsOEMV1);
    }

    static /* bridge */ /* synthetic */ ListItemOEMV1 -$$Nest$smtoOemListItem(blf blf2) {
        return PluginFactoryAdapterV6.toOemListItem(blf2);
    }

    public PluginFactoryAdapterV6(PluginFactoryOEMV6 pluginFactoryOEMV6) {
        this.mOem = pluginFactoryOEMV6;
        pluginFactoryOEMV6.setRotaryFactories((Function)new PluginFactoryAdapterV6$1(this), (Function)new PluginFactoryAdapterV6$2(this));
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
        object = new PluginFactoryAdapterV6$6(n3, n2, n4, bl3);
        bl3 = context.getResources().getConfiguration().getLayoutDirection() == 0;
        return new PluginFactoryAdapterV6$7(bl2, n5, (LayoutStyleOEMV1)object, n6, n7, n8, n9, n10, bl3, n12, n13, n11, n14, n15, n16, n18, n19, n17, n20, n21, (Drawable)attributeSet);
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
                ContentListItemOEMV2.Builder builder = new ContentListItemOEMV2.Builder(PluginFactoryAdapterV6.toOemListItemAction(((bla)blf2).c));
                bjh bjh2 = ((bla)blf2).b;
                if (bjh2 != null) {
                    builder.setTitle(PluginFactoryAdapterV6.toOemText(bjh2));
                }
                builder.setIcon(((bla)blf2).a, PluginFactoryAdapterV6.toOemListItemIconType(((bla)blf2).d));
                if (((bla)blf2).c == bkx.e) {
                    builder.setSupplementalIcon(null, null);
                }
                if (((bla)blf2).i != null) {
                    builder.setOnItemClickedListener((Consumer)new PluginFactoryAdapterV6$$ExternalSyntheticLambda2((bla)blf2));
                }
                builder.setOnCheckedChangeListener((Consumer)new PluginFactoryAdapterV6$$ExternalSyntheticLambda3((bla)blf2)).setActionDividerVisible(false).setEnabled(((bla)blf2).f).setChecked(((bla)blf2).e).setActivated(((bla)blf2).g).setSecure(false);
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
        AppStyledViewControllerOEMV3 appStyledViewControllerOEMV3 = this.mOem.createAppStyledView(object);
        object = appStyledViewControllerOEMV3 == null ? new bjt((Context)object) : new AppStyledViewControllerAdapterV3((Context)object, appStyledViewControllerOEMV3);
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
            PluginFactoryAdapterV6$4 pluginFactoryAdapterV6$4 = new PluginFactoryAdapterV6$4(this, n2);
            pluginFactoryAdapterV6$4 = preferenceOEMV1.createCarUiPreferenceView((PreferenceViewAttributesOEMV1)pluginFactoryAdapterV6$4);
            return pluginFactoryAdapterV6$4;
        }
        catch (Exception exception) {
            return blf.d(context, attributeSet);
        }
    }

    public kf createListItemAdapter(List list) {
        List list2 = bnv.l(list, new PluginFactoryAdapterV6$$ExternalSyntheticLambda0());
        Object object = this.mOem.createListItemAdapter(list2);
        if (object == null) {
            return new bli(list);
        }
        object = new CarUiListItemAdapterAdapterV1((AdapterOEMV1)object);
        ((kf)object).registerAdapterDataObserver(new PluginFactoryAdapterV6$5(this, list2, list));
        return object;
    }

    @Override
    public CarUiRecyclerView createRecyclerView(Context object, AttributeSet attributeSet) {
        RecyclerViewAttributesOEMV1 recyclerViewAttributesOEMV1 = PluginFactoryAdapterV6.from((Context)object, attributeSet);
        RecyclerViewOEMV2 recyclerViewOEMV2 = this.mOem.createRecyclerView((Context)object, recyclerViewAttributesOEMV1);
        if (recyclerViewOEMV2 != null) {
            object = new RecyclerViewAdapterV2((Context)object, attributeSet, 0);
            ((RecyclerViewAdapterV2)object).setOemRecyclerView(recyclerViewOEMV2, recyclerViewAttributesOEMV1);
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
        ToolbarControllerOEMV2 toolbarControllerOEMV2 = this.mOem.installBaseLayoutAround(context, view, (Consumer)new PluginFactoryAdapterV6$3(this, bju2), bl2, bl3);
        if (toolbarControllerOEMV2 != null) {
            return new ToolbarControllerAdapterV2(context, toolbarControllerOEMV2);
        }
        if (bl2) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, true, bl3);
        }
        return null;
    }
}

