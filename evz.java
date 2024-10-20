/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public final class evz
implements AutoCloseable {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter");
    public static final jtv b = new jtv("[\\\\/:*?\"<>|]");
    public final Context c;
    public final boolean d;
    public final evx e;
    public int f;
    public final int g;
    public final jtz h;
    public RandomAccessFile i;
    public File j;
    public RandomAccessFile k;
    public File l;
    private final jvb m;
    private final int n;
    private final jny o;
    private final jny p;
    private final jny q;
    private final jny r;
    private final jny s;
    private final dtu t;

    public evz(Context object, jvb jvb2, cgw cgw2, boolean bl2, long l2, long l3, crh crh2, evx evx2) {
        jse.e(jvb2, "blockingScope");
        jse.e(cgw2, "clock");
        jse.e(crh2, "audioTimeConverter");
        this.c = object;
        this.m = jvb2;
        this.d = bl2;
        this.e = evx2;
        object = cqq.av(jvb2);
        this.t = object;
        this.g = jse.k(3840, (int)l3) * 1024;
        this.n = jse.k(10, (int)l2);
        this.h = new jtz(false, jud.a);
        this.o = new jog(new eop(this, 10));
        this.p = new jog(new eop(this, 11));
        this.q = new jog(new eop(this, 12));
        this.r = new jog(new eop(this, 14));
        this.s = new jog(new eop(this, 13));
        ((dtu)object).j(new ehs(this, null, 4));
    }

    public static final File h(String object) {
        File file = ((File)(object = new File((String)object))).getParentFile();
        if (file != null) {
            file.mkdirs();
        }
        if (((File)object).exists() && !((File)object).delete()) {
            throw new IOException();
        }
        if (((File)object).createNewFile()) {
            return object;
        }
        throw new IOException();
    }

    private final String i() {
        return (String)this.q.a();
    }

    private final String j() {
        return (String)this.s.a();
    }

    public final hpn a() {
        if (this.h.b()) {
            return hhk.I();
        }
        return this.t.j(new ehs(this, null, 5, null));
    }

    public final hpn b(hvu hvu2, Integer n2, Long l2) {
        if (this.h.b()) {
            return hhk.I();
        }
        return this.t.j(new eme(this, hvu2, n2, l2, null, 2));
    }

    public final String c() {
        return (String)this.o.a();
    }

    @Override
    public final void close() {
        this.a();
    }

    public final String d() {
        return (String)this.p.a();
    }

    public final String e() {
        return (String)this.r.a();
    }

    public final void f() {
        if (!this.h.c()) {
            File file;
            Object object = this.i;
            Object var2_2 = null;
            hei hei2 = null;
            if (object != null) {
                crh.S((RandomAccessFile)object, ero.d);
                hei hei3 = a;
                ((heg)hei3.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeFile", 235, "AudioFileWriter.kt")).A("#audio# finalized audio(%s); wrote %d", this.d(), this.f);
                file = this.j;
                object = file;
                if (file == null) {
                    jse.h("file");
                    object = null;
                }
                if (((File)object).renameTo(new File(this.i()))) {
                    ((heg)hei3.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeFile", 237, "AudioFileWriter.kt")).u("#audio# final audio location: %s", this.i());
                }
            }
            object = this.k;
            if (object != null) {
                crh.S((RandomAccessFile)object, ero.e);
                file = this.l;
                object = file;
                if (file == null) {
                    jse.h("timestampFile");
                    object = null;
                }
                if (((File)object).length() == 0L) {
                    ((heg)a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeTimestampsFile", 248, "AudioFileWriter.kt")).u("#audio# no audio timestamps at: %s, removing...", this.e());
                    object = this.l;
                    if (object == null) {
                        jse.h("timestampFile");
                        object = hei2;
                    }
                    ((File)object).delete();
                    return;
                }
                hei2 = a;
                ((heg)hei2.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeTimestampsFile", 252, "AudioFileWriter.kt")).u("#audio# finalized audio timestamps(%s)", this.e());
                object = this.l;
                if (object == null) {
                    jse.h("timestampFile");
                    object = var2_2;
                }
                if (((File)object).renameTo(new File(this.j()))) {
                    ((heg)hei2.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "closeTimestampsFile", 254, "AudioFileWriter.kt")).u("#audio# final audio timestamps location: %s", this.j());
                }
            }
        }
    }

    public final void g(File object, String string) {
        File[] fileArray;
        if (object != null && ((File)object).exists() && ((File)object).isDirectory() && (fileArray = ((File)object).listFiles()) != null) {
            int n2;
            ArrayList<File> arrayList = new ArrayList<File>();
            for (n2 = 0; n2 < fileArray.length; ++n2) {
                File file = fileArray[n2];
                if (!file.isFile()) continue;
                jse.b(file);
                jse.e(file, "<this>");
                object = file.getName();
                jse.d(object, "getName(...)");
                if (!jse.i(jse.Y((String)object, ""), string)) continue;
                arrayList.add(file);
            }
            object = jns.q(arrayList, new dfs(6));
            if (object != null) {
                n2 = this.n;
                if (object.size() > n2) {
                    n2 = object.size();
                    int n3 = this.n;
                    ((heg)a.f().h(hfo.a, "ALT.AudioFileWriter").j("com/google/android/libraries/search/audio/store/persistent/AudioFileWriter", "maintainMaxFiles", 286, "AudioFileWriter.kt")).u("#audio# removing oldest recordings files(*.%s) to free space...", string);
                    object = jns.r((Iterable)object, n2 - n3).iterator();
                    while (object.hasNext()) {
                        ((File)object.next()).delete();
                    }
                }
            }
        }
    }
}

