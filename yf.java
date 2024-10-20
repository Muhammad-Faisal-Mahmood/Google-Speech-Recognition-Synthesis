/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  android.view.View
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputConnectionWrapper
 *  android.view.inputmethod.InputContentInfo
 */
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class yf
extends InputConnectionWrapper {
    final AmbientMode$AmbientController a;

    public yf(InputConnection inputConnection, AmbientMode$AmbientController ambientMode$AmbientController) {
        this.a = ambientMode$AmbientController;
        super(inputConnection, false);
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int n2, Bundle bundle) {
        block6: {
            Object object;
            Object object2;
            Object object3;
            bzb bzb2;
            block5: {
                block4: {
                    bzb2 = null;
                    if (inputContentInfo != null) {
                        bzb2 = new bzb(new bzb(inputContentInfo, null), null);
                    }
                    object3 = this.a;
                    if ((n2 & 1) == 0) break block4;
                    try {
                        hk$$ExternalSyntheticApiModelOutline0.m(hk$$ExternalSyntheticApiModelOutline0.m(((bzb)bzb2.a).a));
                        object2 = ((bzb)bzb2.a).a;
                        object = bundle == null ? new Bundle() : new Bundle(bundle);
                    }
                    catch (Exception exception) {
                        Log.w((String)"InputConnectionCompat", (String)"Can't insert content from IME; requestPermission() failed", (Throwable)exception);
                    }
                    object.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", (Parcelable)object2);
                    break block5;
                    break block6;
                }
                object = bundle;
            }
            object2 = new ClipData(hk$$ExternalSyntheticApiModelOutline0.m(hk$$ExternalSyntheticApiModelOutline0.m(((bzb)bzb2.a).a)), new ClipData.Item(hk$$ExternalSyntheticApiModelOutline0.m(hk$$ExternalSyntheticApiModelOutline0.m(((bzb)bzb2.a).a))));
            object2 = Build.VERSION.SDK_INT >= 31 ? new ut((ClipData)object2, 2) : new uv((ClipData)object2, 2);
            object3 = ((AmbientMode$AmbientController)object3).a;
            object2.d(hk$$ExternalSyntheticApiModelOutline0.m$1(hk$$ExternalSyntheticApiModelOutline0.m(((bzb)bzb2.a).a)));
            object2.b((Bundle)object);
            object = a.Q((uu)object2);
            if (wj.c((View)object3, (uz)object) == null) {
                return true;
            }
        }
        return super.commitContent(inputContentInfo, n2, bundle);
    }
}

