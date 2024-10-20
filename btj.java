/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class btj
implements btk {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader");
    public static final hpq b;
    public final Context c;
    public final bwq d;
    public final bsy e;
    public final bsy f;
    public final bsy g;
    public final dgg h;
    public final int i;
    public final Set j = new HashSet();
    public final Set k = new HashSet();
    public final List l = new ArrayList();
    public final bsz m;
    public final dbx n;
    gbq o;
    public final bxf p;
    public egg q;
    public final bxt r;

    static {
        ivg ivg2 = new ivg(null);
        ivg2.h("voice-downloader-task-%d");
        b = hhk.E(Executors.newFixedThreadPool(1, ivg.i(ivg2)));
    }

    public btj(Context object, bxf object2, bwq object3, bxt bxt2, dbx object4) {
        bsy bsy2;
        this.c = object;
        this.p = object2;
        this.d = object3;
        this.r = bxt2;
        this.n = object4;
        this.i = ((bud)bxt2.b).b;
        this.e = bsy2 = new bsy(ddw.a, "/product/tts/google/");
        this.f = object4 = new bsy(ddw.a, "/oem/tts/google/");
        this.g = object3 = new bsy(ddw.a, "/system/tts/google/");
        Object object5 = new bmt(null);
        ((bmt)object5).b = object.getAssets();
        if (!TextUtils.isEmpty((CharSequence)"voices")) {
            ((bmt)object5).c = "voices";
            ((bmt)object5).a = ddw.a;
            this.h = object5 = new dgg((bmt)object5);
            this.m = new bsz((bxf)object2, (dgg)object5, bsy2, (bsy)object4, (bsy)object3, btj.f(object), bxt2);
            object2 = new cqg(this, 1);
            object = b;
            this.o = new gbq((hnx)object2, (Executor)object);
            if (ito.c()) {
                hhk.T(this.o.c(), gqk.g(new cur(1)), (Executor)object);
            }
            return;
        }
        throw new IllegalArgumentException("Asset directory must be empty or start with '/'");
    }

    public static ddr a(dbx dbx2) {
        ddq ddq2 = ddr.j();
        ddl ddl2 = new ddl();
        ddl2.b().d("manifest_instance", dbx2);
        ddq2.e(ddl2.a());
        return ddq2.a();
    }

    public static String e(buc buc2, String string, bua bua2, btz btz2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)fvd.N(guf.b('#').e(string), 0));
        stringBuilder.append(cab.c(bua2, btz2));
        stringBuilder.append("-r");
        stringBuilder.append(buc2.e);
        return stringBuilder.toString();
    }

    public static String f(Context context) {
        return gtk.c(File.separatorChar).e(context.getFilesDir().getAbsolutePath(), "superpacks", new Object[0]);
    }

    public static String[] i(Context stringArray, String string) {
        String[] stringArray2 = new String[]{};
        try {
            stringArray = stringArray.getAssets().list(a.ai(string, "voices"));
        }
        catch (IOException iOException) {
            ((heg)((heg)((heg)a.f()).i(iOException)).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getBundledVoiceAssets", 890, "VoiceDataDownloader.java")).u("Failed the get bundled pack directory for directory %s", "voices".concat(string));
            stringArray = stringArray2;
        }
        if (stringArray != null) {
            return stringArray;
        }
        return new String[0];
    }

    public final hpn b(buc buc2, int n2, bti bti2) {
        ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "fetchVoiceInternal", 275, "VoiceDataDownloader.java")).u("fetchVoiceInternal %s", buc2.c);
        fxf.K(this.c);
        return hno.g(hph.q(this.o.c()), new dhh(this, buc2, bti2, n2, 1), b);
    }

    public final hpn c() {
        hnx hnx2 = gqk.c(new btc(this));
        hpq hpq2 = b;
        return hno.f(hph.q(hhk.P(hnx2, hpq2)), new brk(this, 3), hpq2);
    }

    @Override
    public final hpn d() {
        return this.o.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        int n2;
        int n3;
        Object object;
        Object object22;
        fxf.K(this.c);
        Object object3 = this.l;
        synchronized (object3) {
            if (!this.l.isEmpty()) {
                return;
            }
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object22 : btj.i(this.c, "")) {
            object = btj.i(this.c, String.valueOf(File.separator).concat(String.valueOf(object22)));
            n3 = ((String[])object).length;
            if (n3 == 0) continue;
            for (n2 = 0; n2 < n3; ++n2) {
                object22 = object[n2].replace(".zvoice", "");
                arrayList.add(object22);
                ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "checkDefaultVoices", 641, "VoiceDataDownloader.java")).u("Got bundled voice %s", object22);
            }
        }
        object22 = new ArrayList();
        object22.add("/product/tts/google/");
        object22.add("/oem/tts/google/");
        object22.add("/system/tts/google/");
        n3 = object22.size();
        int n4 = 0;
        while (true) {
            block14: {
                block15: {
                    block13: {
                        if (n4 >= n3) break block13;
                        object3 = new File((String)object22.get(n4)).listFiles();
                        if (object3 == null) break block14;
                        break block15;
                    }
                    object3 = this.l;
                    synchronized (object3) {
                        if (this.l.isEmpty()) {
                            this.l.addAll(arrayList);
                        }
                    }
                    fxf.q(this.l.isEmpty() ^ true);
                    return;
                }
                for (n2 = 0; n2 < ((String[])object3).length; ++n2) {
                    object = object3[n2];
                    if (".".equals(((File)object).getName()) || "..".equals(((File)object).getName()) || !((File)object).isDirectory() || !((File)object).canRead() || (object = ((File)object).listFiles()) == null) continue;
                    for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
                        Object object4 = object[i2];
                        if (!((File)object4).getName().contains(".zvoice")) continue;
                        arrayList.add(((File)object4).getName().replace(".zvoice", ""));
                    }
                }
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h(String string) {
        Set set = this.j;
        synchronized (set) {
            return this.j.contains(string);
        }
    }

    public final void j(buc buc2, int n2, String string, bti bti2) {
        String string2 = buc2.c;
        ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "fetchVoice", 346, "VoiceDataDownloader.java")).u("voicesToFetch %s", string2);
        fxf.K(this.d);
        this.d.c(buc2.c, buc2.e, n2, string);
        hhk.T(this.b(buc2, 0, bti2), gqk.g(new btg(this, string2, buc2, n2, string, bti2)), b);
    }

    @Override
    public final hpn k(buc buc2) {
        fxf.K(this.d);
        this.d.c(buc2.c, buc2.e, 5, "com.google.android.tts");
        hph hph2 = hph.q(this.b(buc2, 0, null));
        btb btb2 = new btb(this, buc2, 0);
        hpq hpq2 = b;
        return hmv.g(hno.g(hph2, btb2, hpq2), Throwable.class, new btb(this, buc2, 2), hpq2);
    }
}

