/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;

public final class ewx {
    private static final hei a = hei.m("com/google/android/libraries/search/integrations/storage/FileUtilsKt");

    public static final File a(Context object) {
        object = object.getCacheDir();
        jse.d(object, "getCacheDir(...)");
        object = new File((File)object, "audio_library/recordings");
        if (!(((File)object).exists() || ((File)object).mkdirs() || ((File)object).exists())) {
            ((heg)a.g().h(hfo.a, "FileUtils").j("com/google/android/libraries/search/integrations/storage/FileUtilsKt", "createDirIfNotExists", 133, "FileUtils.kt")).r("Directory not created");
        }
        return object;
    }
}

