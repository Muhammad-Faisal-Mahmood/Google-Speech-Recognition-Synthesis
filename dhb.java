/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;

public final class dhb
implements dja {
    final hqa a;
    final String b;
    final File c;
    final fkg d;

    public dhb(hqa hqa2, String string, fkg fkg2, File file) {
        this.a = hqa2;
        this.b = string;
        this.d = fkg2;
        this.c = file;
    }

    @Override
    public final void a(File serializable, diz diz2) {
        serializable = new dhd(this.b, diz2);
        this.d.d(this.b, this.c, (Exception)serializable);
        this.a.n((Throwable)serializable);
    }

    @Override
    public final void b(File object) {
        if (((File)object).exists()) {
            this.a.m(new dei(this.b));
            fkg fkg2 = this.d;
            object = this.b;
            Object object2 = this.c;
            ddn ddn2 = ((den)fkg2.c).o();
            dco dco2 = (dco)ddn2;
            String string = dco2.a;
            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/DownloadFetcher$DownloadState$1", "onSuccess", 385, "DownloadFetcher.java")).G("Download of %s for pack %s succeeded (%s bytes)", dec.g(string, (String)object), ddn2.e(), dec.g(string, Long.toString(((File)fkg2.a).length())));
            long l2 = ((File)object2).length();
            ddb.a();
            object2 = dco2.b;
            object2 = ((dgu)fkg2.b).h;
            object = new dgt(ddn2, (String)object, fkg2.c, l2, 0);
            ((dgv)object2).d.a((dau)object);
            return;
        }
        object = new IOException("Downloaded file does not exist.");
        this.a.n((Throwable)object);
        this.d.d(this.b, this.c, (Exception)object);
    }
}

