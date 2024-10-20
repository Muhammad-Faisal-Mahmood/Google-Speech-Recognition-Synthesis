/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.List;

public final class edj
implements edh {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl");
    private static final List b = jns.f(6, 1999);
    private final Context c;
    private final AudioManager d;
    private final boolean e;

    public edj(Context context, AudioManager audioManager, boolean bl2) {
        this.c = context;
        this.d = audioManager;
        this.e = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final int b() {
        Context context = this.c;
        int n2 = context.getResources().getIdentifier("vr_input_device_channel_index_mask", "integer", context.getPackageName());
        if (n2 == 0) {
            return 3;
        }
        try {
            n2 = this.c.getResources().getInteger(n2);
            ((heg)a.f().h(hfo.a, "ALT.AecChecker").j("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl", "getChannelIndexMask", 80, "AecCheckerImpl.kt")).s("#audio# channel index mask(%d)", n2);
            return n2;
        }
        catch (Resources.NotFoundException notFoundException) {
            return 3;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String c() {
        void var2_4;
        Context context = this.c;
        int n2 = context.getResources().getIdentifier("vr_input_device_address", "string", context.getPackageName());
        Object var2_2 = null;
        if (n2 == 0) {
            return null;
        }
        try {
            String string;
            String string2 = string = this.c.getResources().getString(n2);
            return var2_4;
        }
        catch (Resources.NotFoundException notFoundException) {
            return var2_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean d() {
        Context context = this.c;
        int n2 = context.getResources().getIdentifier("aec_control_with_audiofx", "bool", context.getPackageName());
        if (n2 == 0) {
            return false;
        }
        try {
            boolean bl2 = this.c.getResources().getBoolean(n2);
            ((heg)a.f().h(hfo.a, "ALT.AecChecker").j("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl", "mustEnableAecAudioFx", 94, "AecCheckerImpl.kt")).u("#audio# must enable aec with audiofx(%s)", bl2);
            return bl2;
        }
        catch (Resources.NotFoundException notFoundException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean e() {
        Context context = this.c;
        int n2 = context.getResources().getIdentifier("ns_control_with_audiofx", "bool", context.getPackageName());
        if (n2 == 0) {
            return false;
        }
        try {
            boolean bl2 = this.c.getResources().getBoolean(n2);
            ((heg)a.f().h(hfo.a, "ALT.AecChecker").j("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl", "mustEnableNsAudioFx", 108, "AecCheckerImpl.kt")).u("#audio# must enable ns with audiofx(%s)", bl2);
            return bl2;
        }
        catch (Resources.NotFoundException notFoundException) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final edi a(eae eae22) {
        void var1_5;
        String string;
        jse.e(eae22, "params");
        if (this.e && Build.VERSION.SDK_INT >= 28 && b.contains(eae22.c) && (string = this.c()) != null) {
            AudioDeviceInfo[] audioDeviceInfoArray = this.d.getDevices(1);
            jse.d(audioDeviceInfoArray, "getDevices(...)");
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArray) {
                if (audioDeviceInfo.getType() != 21 || !jse.i(fs$$ExternalSyntheticApiModelOutline0.m(audioDeviceInfo), string)) {
                    continue;
                }
                break;
            }
        } else {
            Object var1_4 = null;
        }
        if (var1_5 == null) {
            return null;
        }
        string = fs$$ExternalSyntheticApiModelOutline0.m((AudioDeviceInfo)var1_5);
        jse.d(string, "getAddress(...)");
        return new edi(string, this.b(), this.d(), this.e(), (AudioDeviceInfo)var1_5);
    }
}

