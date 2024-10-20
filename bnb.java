/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.hardware.display.DisplayManager
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.provider.Settings$Secure
 *  android.util.Log
 *  android.view.Display
 *  android.view.SurfaceControlViewHost
 *  android.view.View
 *  android.view.inputmethod.InputMethodInfo
 *  android.view.inputmethod.InputMethodManager
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceControlViewHost;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.android.car.ui.core.SearchResultsProvider;
import j$.util.function.BiConsumer$_CC;
import java.util.Iterator;
import java.util.function.BiConsumer;

public final class bnb
implements BiConsumer {
    public final bne a;

    public /* synthetic */ bnb(bne bne2) {
        this.a = bne2;
    }

    public final void accept(Object object, Object object2) {
        block30: {
            block28: {
                int n2;
                int n3;
                bne bne2;
                block29: {
                    Object object3;
                    Context context;
                    Object object4 = (String)object;
                    object2 = (Bundle)object2;
                    boolean bl2 = "automotive_wide_screen_clear_data".equals(object4);
                    bne2 = this.a;
                    if (bl2 && (object = bne2.d) != null) {
                        object.setText((CharSequence)"");
                    }
                    bl2 = "automotive_wide_screen_post_load_search_results".equals(object4);
                    object = null;
                    if (bl2) {
                        context = bne2.b;
                        object3 = SearchResultsProvider.a(context);
                        context.getContentResolver().delete(object3, null, null);
                    }
                    "automotive_wide_screen_back_clicked".equals(object4);
                    if (object2 == null) break block28;
                    if (object2.getString("search_result_item_id_list") != null) {
                        object3 = object2.getString("search_result_item_id_list");
                        object4 = bne2.k.c;
                        if (object4 != null) {
                            object = (bla)object4.get(Integer.parseInt((String)object3));
                        }
                        if (object != null && (object = ((bla)object).i) != null) {
                            ((eky)object).b();
                        }
                    }
                    if (object2.getString("search_result_supplemental_icon_id_list") != null) {
                        object = object2.getString("search_result_supplemental_icon_id_list");
                        object4 = bne2.k.c;
                        if (object4 != null) {
                            object = (bla)object4.get(Integer.parseInt((String)object));
                        }
                    }
                    n3 = object2.getInt("content_area_surface_display_id");
                    int n4 = object2.getInt("content_area_surface_height");
                    n2 = object2.getInt("content_area_surface_width");
                    if ((object2 = object2.getBinder("content_area_surface_host_token")) != null) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            object = ((DisplayManager)bne2.b.getSystemService(DisplayManager.class)).getDisplay(n3);
                            bne2.e = new SurfaceControlViewHost(bne2.b, (Display)object, (IBinder)object2);
                            bne2.f = n4;
                            bne2.g = n2;
                            context = new Bundle();
                            object = bne2.k.b;
                            if (object != null) {
                                Iterator iterator;
                                object2 = bnv.a;
                                if (object instanceof BitmapDrawable && (object2 = (BitmapDrawable)object).getBitmap() != null) {
                                    object4 = object2.getBitmap();
                                } else {
                                    object2 = (Drawable)object;
                                    object = object2.getIntrinsicWidth() > 0 && object2.getIntrinsicHeight() > 0 ? Bitmap.createBitmap((int)object2.getIntrinsicWidth(), (int)object2.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888) : Bitmap.createBitmap((int)1, (int)1, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                                    object4 = new Canvas((Bitmap)object);
                                    object2.setBounds(0, 0, object4.getWidth(), object4.getHeight());
                                    object2.draw((Canvas)object4);
                                    object4 = object;
                                }
                                Context context2 = bne2.b;
                                object2 = context2.getResources();
                                n3 = 2131165379;
                                object = object2;
                                n4 = n3;
                                object3 = (InputMethodManager)context2.getSystemService(InputMethodManager.class);
                                object = object2;
                                n4 = n3;
                                String string = Settings.Secure.getString((ContentResolver)context2.getContentResolver(), (String)"default_input_method");
                                object = object2;
                                n4 = n3;
                                try {
                                    iterator = object3.getInputMethodList().iterator();
                                }
                                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                    Log.w((String)"car-ui-lib", (String)"Unable to read `R.dimen.car_ui_primary_icon_size` from the IME service. Please make sure the IME service is exported via `android.view.InputMethod` intent-filter.", (Throwable)nameNotFoundException);
                                    n2 = n4;
                                    object3 = object;
                                }
                                while (true) {
                                    object = object2;
                                    n4 = n3;
                                    object3 = object2;
                                    n2 = n3;
                                    if (!iterator.hasNext()) break;
                                    object = object2;
                                    n4 = n3;
                                    object3 = (InputMethodInfo)iterator.next();
                                    object = object2;
                                    n4 = n3;
                                    if (!object3.getId().equals(string)) continue;
                                    object = object2;
                                    n4 = n3;
                                    object = object2 = context2.createPackageContext(object3.getPackageName(), 0).getResources();
                                    n4 = n3;
                                    n3 = object2.getIdentifier("car_ui_primary_icon_size", "dimen", object3.getPackageName());
                                    continue;
                                    break;
                                }
                                n3 = object3.getDimensionPixelSize(n2);
                                context.putByteArray("extracted_text_icon", bnv.q(Bitmap.createScaledBitmap((Bitmap)object4, (int)n3, (int)n3, (boolean)true)));
                            }
                            context.putParcelable("content_area_surface_package", (Parcelable)sk$$ExternalSyntheticApiModelOutline1.m(bne2.e));
                            bne2.c.sendAppPrivateCommand((View)bne2.d, "automotive_wide_screen", (Bundle)context);
                            return;
                        }
                        throw new IllegalStateException("Views in the widescreen ime aren't supported pre R");
                    }
                    n3 = n4;
                    if (n4 != 0) break block29;
                    if (n2 == 0) break block28;
                    n3 = 0;
                }
                if (Build.VERSION.SDK_INT < 30) break block30;
                bne2.f = n3;
                bne2.g = n2;
                object = bne2.e;
                if (object != null) {
                    sk$$ExternalSyntheticApiModelOutline1.m((SurfaceControlViewHost)object, n2, n3);
                }
            }
            return;
        }
        throw new IllegalStateException("Views in the widescreen ime aren't supported pre R");
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$_CC.$default$andThen(this, biConsumer);
    }
}

