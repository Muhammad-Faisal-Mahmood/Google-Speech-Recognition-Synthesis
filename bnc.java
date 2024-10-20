/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.graphics.drawable.BitmapDrawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowInsets
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 */
import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.android.car.ui.core.SearchResultsProvider;
import com.android.car.ui.recyclerview.CarUiRecyclerView;

public final class bnc
implements View.OnApplyWindowInsetsListener {
    public final bne a;

    public /* synthetic */ bnc(bne bne2) {
        this.a = bne2;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            bne bne2 = this.a;
            if (bne2.d == null) {
                view = view.onApplyWindowInsets(windowInsets);
            } else {
                boolean bl2 = sk$$ExternalSyntheticApiModelOutline1.m(windowInsets, sk$$ExternalSyntheticApiModelOutline1.m());
                int n2 = 0;
                if (bl2) {
                    Uri uri;
                    Object object;
                    Object object2 = bne2.a();
                    if (!bne2.h && object2 != null) {
                        bne2.j = object2.getLayoutParams();
                        bne2.i = (ViewGroup)object2.getParent();
                        object = bne2.i;
                        if (object != null) {
                            object.removeView((View)object2);
                        }
                        uri = new FrameLayout.LayoutParams(-1, -1);
                        object = bne2.k.a;
                        if (object instanceof CarUiRecyclerView) {
                            object = (View)object;
                            uri.topMargin = -object.getPaddingTop();
                            uri.bottomMargin = -object.getPaddingBottom();
                            uri.leftMargin = -object.getPaddingLeft();
                            uri.rightMargin = -object.getPaddingRight();
                        }
                        object = new FrameLayout(bne2.b);
                        object.addView((View)object2, (ViewGroup.LayoutParams)uri);
                    } else {
                        object = null;
                    }
                    object2 = bne2.b;
                    uri = SearchResultsProvider.a((Context)object2);
                    object2.getContentResolver().delete(uri, null, null);
                    if (bne2.a() == null || !bne2.b().a) {
                        Object object3 = bne2.k.c;
                        if (object3 == null) {
                            bne2.c.sendAppPrivateCommand((View)bne2.d, "automotive_wide_screen", null);
                        } else {
                            while (n2 < object3.size()) {
                                bla bla2 = (bla)object3.get(n2);
                                ContentValues contentValues = new ContentValues();
                                object2 = n2;
                                contentValues.put("primaryId", (Integer)object2);
                                contentValues.put("secondary", (Integer)object2);
                                object2 = (BitmapDrawable)bla2.a;
                                object2 = object2 != null ? (Object)bnv.q(object2.getBitmap()) : null;
                                contentValues.put("primary_image", (byte[])object2);
                                contentValues.put("secondary_image", null);
                                object2 = bla2.b;
                                object2 = object2 != null ? ((bjh)object2).a().toString() : null;
                                contentValues.put("title", (String)object2);
                                contentValues.put("subtitle", null);
                                bne2.b.getContentResolver().insert(uri, contentValues);
                                ++n2;
                            }
                            bne2.c.sendAppPrivateCommand((View)bne2.d, "wide_screen_search_results", new Bundle());
                        }
                    }
                    bne2.a.post((Runnable)new aks((Object)bne2, object, 13, null));
                } else {
                    View view2 = bne2.a();
                    if (bne2.i != null && view2 != null) {
                        bne2.a.post((Runnable)new aks((Object)bne2, (Object)view2, 14, null));
                    }
                    bne2.h = false;
                }
                view = view.onApplyWindowInsets(windowInsets);
            }
            return view;
        }
        throw new IllegalStateException("Cannot check if the ime is visible pre R");
    }
}

