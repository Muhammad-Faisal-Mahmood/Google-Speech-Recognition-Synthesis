/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipDescription
 *  android.net.Uri
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputContentInfo
 */
import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputContentInfo;

public final class hk$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ ClipDescription m(InputContentInfo inputContentInfo) {
        return inputContentInfo.getDescription();
    }

    public static /* bridge */ /* synthetic */ Uri m(InputContentInfo inputContentInfo) {
        return inputContentInfo.getContentUri();
    }

    public static /* bridge */ /* synthetic */ InputContentInfo m(Object object) {
        return (InputContentInfo)object;
    }

    public static /* bridge */ /* synthetic */ void m(EditorInfo editorInfo, String[] stringArray) {
        editorInfo.contentMimeTypes = stringArray;
    }

    public static /* bridge */ /* synthetic */ void m(InputContentInfo inputContentInfo) {
        inputContentInfo.requestPermission();
    }

    public static /* bridge */ /* synthetic */ Uri m$1(InputContentInfo inputContentInfo) {
        return inputContentInfo.getLinkUri();
    }
}

