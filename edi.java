/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 */
import android.media.AudioDeviceInfo;

public final class edi {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final AudioDeviceInfo d;
    private final String e;

    public edi(String string, int n2, boolean bl2, boolean bl3, AudioDeviceInfo audioDeviceInfo) {
        jse.e(string, "inputDeviceAddress");
        this.e = string;
        this.a = n2;
        this.b = bl2;
        this.c = bl3;
        this.d = audioDeviceInfo;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof edi)) {
            return false;
        }
        object = (edi)object;
        if (!jse.i(this.e, ((edi)object).e)) {
            return false;
        }
        if (this.a != ((edi)object).a) {
            return false;
        }
        if (this.b != ((edi)object).b) {
            return false;
        }
        if (this.c != ((edi)object).c) {
            return false;
        }
        return jse.i(this.d, ((edi)object).d);
    }

    public final int hashCode() {
        int n2 = this.e.hashCode();
        AudioDeviceInfo audioDeviceInfo = this.d;
        boolean bl2 = this.c;
        boolean bl3 = this.b;
        return (((n2 * 31 + this.a) * 31 + a.f(bl3)) * 31 + a.f(bl2)) * 31 + audioDeviceInfo.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AecInternalConfig(inputDeviceAddress=");
        stringBuilder.append(this.e);
        stringBuilder.append(", channelIndexMask=");
        stringBuilder.append(this.a);
        stringBuilder.append(", useAudiofxForAec=");
        stringBuilder.append(this.b);
        stringBuilder.append(", useAudiofxForNs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", device=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

