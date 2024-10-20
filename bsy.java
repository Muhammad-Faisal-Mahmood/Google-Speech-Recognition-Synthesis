/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class bsy
implements dej {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/SystemDirFetcher");
    public final File b;
    private final bmu c;

    public bsy(hpq hpq2, String string) {
        this.c = new bmu(hpq2, null);
        this.b = new File(string);
    }

    @Override
    public final hpn a(ddn ddn2) {
        return this.c.o(ddn2);
    }

    @Override
    public final hpn b(den object, deh object2, File file) {
        object2 = ((den)object).o();
        object = new dgf(this, (den)object, file, 1);
        return this.c.p(object2, (ddz)object);
    }

    @Override
    public final String c() {
        return "SystemDirFetcher";
    }

    @Override
    public final elq d(den den2) {
        File[] fileArray = this.b.listFiles();
        if (fileArray != null) {
            for (int i2 = 0; i2 < fileArray.length; ++i2) {
                if (!new File(fileArray[i2].getPath(), den2.i().concat(".zvoice")).exists()) continue;
                return elq.b(den2);
            }
        }
        return null;
    }
}

