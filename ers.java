/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRecordingConfiguration
 */
import android.media.AudioRecordingConfiguration;
import java.util.Arrays;

public final class ers {
    private final gto a;
    private final dml b;

    public ers(gto gto2, dml dml2) {
        jse.e(gto2, "systemMicUseOwnerChecker");
        jse.e(dml2, "audioSessionIdStore");
        this.a = gto2;
        this.b = dml2;
    }

    public final erl a(AudioRecordingConfiguration audioRecordingConfiguration, eri ... eriArray) {
        jse.e(audioRecordingConfiguration, "configuration");
        jse.e(eriArray, "owners");
        if (jns.U((Object[])eriArray, (Object)eri.b) && this.b.o(ag$$ExternalSyntheticApiModelOutline1.m(audioRecordingConfiguration))) {
            return erk.b;
        }
        ers ers2 = (ers)this.a.f();
        if (ers2 != null) {
            return ers2.a(audioRecordingConfiguration, Arrays.copyOf(eriArray, eriArray.length));
        }
        return erk.a;
    }
}

