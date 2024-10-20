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
 *  com.android.car.ui.plugin.oemapis.PluginFactoryOEMV5
 *  com.android.car.ui.plugin.oemapis.TextOEMV1
 *  com.android.car.ui.plugin.oemapis.TextOEMV1$Builder
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV2
 *  com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3
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
import com.android.car.ui.plugin.oemapis.PluginFactoryOEMV5;
import com.android.car.ui.plugin.oemapis.TextOEMV1;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV2;
import com.android.car.ui.plugin.oemapis.appstyledview.AppStyledViewControllerOEMV3;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV2;
import com.android.car.ui.plugin.oemapis.toolbar.ToolbarControllerOEMV2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$$ExternalSyntheticLambda1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$$ExternalSyntheticLambda2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$$ExternalSyntheticLambda3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$2;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$3;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$4;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$5;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$6;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5$7;
import com.android.car.ui.recyclerview.CarUiListItemAdapterAdapterV1;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import com.android.car.ui.recyclerview.RecyclerViewAdapterV2;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class PluginFactoryAdapterV5
implements bkc {
    private final bki mFactoryStub = new bki();
    private final PluginFactoryOEMV5 mOem;

    public static /* synthetic */ ListItemOEMV1 $r8$lambda$au_BzObTJij7OPqKWCQ8jZk_W6I(blf blf2) {
        return PluginFactoryAdapterV5.toOemListItem(blf2);
    }

    static /* bridge */ /* synthetic */ Insets -$$Nest$madaptInsets(PluginFactoryAdapterV5 pluginFactoryAdapterV5, InsetsOEMV1 insetsOEMV1) {
        return pluginFactoryAdapterV5.adaptInsets(insetsOEMV1);
    }

    static /* bridge */ /* synthetic */ ListItemOEMV1 -$$Nest$smtoOemListItem(blf blf2) {
        return PluginFactoryAdapterV5.toOemListItem(blf2);
    }

    public PluginFactoryAdapterV5(PluginFactoryOEMV5 pluginFactoryOEMV5) {
        this.mOem = pluginFactoryOEMV5;
        pluginFactoryOEMV5.setRotaryFactories((Function)new PluginFactoryAdapterV5$1(this), (Function)new PluginFactoryAdapterV5$2(this));
    }

    private Insets adaptInsets(InsetsOEMV1 insetsOEMV1) {
        return new Insets(insetsOEMV1.getLeft(), insetsOEMV1.getTop(), insetsOEMV1.getRight(), insetsOEMV1.getBottom());
    }

    private static AppStyledViewControllerOEMV3 from(AppStyledViewControllerOEMV2 appStyledViewControllerOEMV2) {
        return new PluginFactoryAdapterV5$7(appStyledViewControllerOEMV2);
    }

    private static RecyclerViewAttributesOEMV1 from(Context context, AttributeSet object) {
        Object object2 = context.obtainStyledAttributes(object, bjm.c, 0, 0);
        int n2 = object2.getInt(4, 0);
        int n3 = object2.getInt(5, 1);
        boolean bl2 = object2.getBoolean(7, false);
        int n4 = object2.getInt(0, 1);
        boolean bl3 = object2.getBoolean(6, false);
        int n5 = object2.getInt(1, 2);
        object2.recycle();
        Object object3 = object2 = (Object)new int[17];
        object3[0] = (TypedArray)16842996;
        object3[1] = (TypedArray)16842997;
        object3[2] = (TypedArray)16843071;
        object3[3] = (TypedArray)0x1010140;
        object3[4] = (TypedArray)16843699;
        object3[5] = (TypedArray)16842966;
        object3[6] = (TypedArray)16843700;
        object3[7] = (TypedArray)16842968;
        object3[8] = (TypedArray)16842967;
        object3[9] = (TypedArray)16842969;
        object3[10] = (TypedArray)16843701;
        object3[11] = (TypedArray)16842999;
        object3[12] = (TypedArray)16843702;
        object3[13] = (TypedArray)16843001;
        object3[14] = (TypedArray)16843000;
        object3[15] = (TypedArray)16843002;
        object3[16] = (TypedArray)16842964;
        Arrays.sort((int[])object2);
        object = context.obtainStyledAttributes(object, (int[])object2, 0, 0);
        int n6 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16842996), -1);
        int n7 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16842997), -2);
        int n8 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843071), 0);
        int n9 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 0x1010140), 0);
        int n10 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16842966), 0);
        int n11 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16842968), 0);
        int n12 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843699), 0);
        int n13 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843700), 0);
        int n14 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16842967), 0);
        int n15 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16842969), 0);
        int n16 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16842999), 0);
        int n17 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843001), 0);
        int n18 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843701), 0);
        int n19 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843702), 0);
        int n20 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843000), 0);
        int n21 = object.getLayoutDimension(Arrays.binarySearch((int[])object2, 16843002), 0);
        object2 = object.getDrawable(Arrays.binarySearch((int[])object2, 16842964));
        object.recycle();
        object = new PluginFactoryAdapterV5$5(n3, n2, n4, bl3);
        bl3 = context.getResources().getConfiguration().getLayoutDirection() == 0;
        return new PluginFactoryAdapterV5$6(bl2, n5, (LayoutStyleOEMV1)object, n6, n7, n8, n9, n10, bl3, n12, n13, n11, n14, n15, n16, n18, n19, n17, n20, n21, (Drawable)object2);
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
                bla bla2 = (bla)blf2;
                blf2 = new ContentListItemOEMV2.Builder(PluginFactoryAdapterV5.toOemListItemAction(bla2.c));
                bjh bjh2 = bla2.b;
                if (bjh2 != null) {
                    blf2.setTitle(PluginFactoryAdapterV5.toOemText(bjh2));
                }
                blf2.setIcon(bla2.a, PluginFactoryAdapterV5.toOemListItemIconType(bla2.d));
                if (bla2.c == bkx.e) {
                    blf2.setSupplementalIcon(null, null);
                }
                if (bla2.i != null) {
                    blf2.setOnItemClickedListener(new PluginFactoryAdapterV5$$ExternalSyntheticLambda1(bla2));
                }
                blf2.setOnCheckedChangeListener(new PluginFactoryAdapterV5$$ExternalSyntheticLambda2(bla2)).setActionDividerVisible(false).setEnabled(bla2.f).setChecked(bla2.e).setActivated(bla2.g).setSecure(false);
                return blf2.build();
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public bjs createAppStyledView(Context object) {
        void var1_4;
        AppStyledViewControllerOEMV3 appStyledViewControllerOEMV3;
        block5: {
            AppStyledViewControllerOEMV3 appStyledViewControllerOEMV32 = null;
            try {
                Method method = this.mOem.getClass().getDeclaredMethod("createAppStyledView", Context.class);
                String string = fs$$ExternalSyntheticApiModelOutline0.m(method.getGenericReturnType());
                if (ag$$ExternalSyntheticApiModelOutline0.m(AppStyledViewControllerOEMV3.class).equals(string)) {
                    appStyledViewControllerOEMV3 = this.mOem.createAppStyledView(object);
                    break block5;
                }
                appStyledViewControllerOEMV3 = appStyledViewControllerOEMV32;
                if (ag$$ExternalSyntheticApiModelOutline0.m(AppStyledViewControllerOEMV2.class).equals(string)) {
                    appStyledViewControllerOEMV3 = PluginFactoryAdapterV5.from((AppStyledViewControllerOEMV2)method.invoke((Object)this.mOem, object));
                }
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                appStyledViewControllerOEMV3 = appStyledViewControllerOEMV32;
            }
        }
        if (appStyledViewControllerOEMV3 == null) {
            bjt bjt2 = new bjt((Context)object);
            return var1_4;
        }
        AppStyledViewControllerAdapterV3 appStyledViewControllerAdapterV3 = new AppStyledViewControllerAdapterV3((Context)object, appStyledViewControllerOEMV3);
        return var1_4;
    }

    @Override
    public View createCarUiPreferenceView(Context context, AttributeSet attributeSet) {
        return blf.d(context, attributeSet);
    }

    public kf createListItemAdapter(List list) {
        List list2 = bnv.l(list, new PluginFactoryAdapterV5$$ExternalSyntheticLambda3());
        Object object = this.mOem.createListItemAdapter(list2);
        if (object == null) {
            return new bli(list);
        }
        object = new CarUiListItemAdapterAdapterV1((AdapterOEMV1)object);
        ((kf)object).registerAdapterDataObserver(new PluginFactoryAdapterV5$4(this, list2, list));
        return object;
    }

    @Override
    public CarUiRecyclerView createRecyclerView(Context object, AttributeSet attributeSet) {
        RecyclerViewAttributesOEMV1 recyclerViewAttributesOEMV1 = PluginFactoryAdapterV5.from((Context)object, attributeSet);
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

    @Override
    public bnq installBaseLayoutAround(Context context, View view, bju bju2, boolean bl2, boolean bl3) {
        if (!this.mOem.customizesBaseLayout()) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, bl2, bl3);
        }
        ToolbarControllerOEMV2 toolbarControllerOEMV2 = this.mOem.installBaseLayoutAround(context, view, (Consumer)new PluginFactoryAdapterV5$3(this, bju2), bl2, bl3);
        if (toolbarControllerOEMV2 != null) {
            return new ToolbarControllerAdapterV2(context, toolbarControllerOEMV2);
        }
        if (bl2) {
            return this.mFactoryStub.installBaseLayoutAround(context, view, bju2, true, bl3);
        }
        return null;
    }
}

