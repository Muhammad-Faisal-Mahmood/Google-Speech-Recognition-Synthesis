/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class dht
implements des {
    private final bmu a;

    public dht(hpq hpq2) {
        this.a = new bmu(hpq2, "ZipUnpacker");
    }

    public static String e(ZipEntry object) {
        if (!TextUtils.isEmpty((CharSequence)(object = crh.F((ZipEntry)object)))) {
            return object;
        }
        throw new IOException("Cannot unzip file containing entry with empty name");
    }

    static void f(File file) {
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Cannot create directory ".concat(String.valueOf(file.getAbsolutePath())));
        }
    }

    /*
     * Loose catch block
     */
    public static void g(InputStream inputStream, File file, dhs dhs2, dcx dcx2, gtq gtq2) {
        inputStream = new ZipInputStream(inputStream);
        while (true) {
            ZipEntry zipEntry;
            block10: {
                dcx2.a();
                zipEntry = ((ZipInputStream)inputStream).getNextEntry();
                if (zipEntry != null) break block10;
                ((ZipInputStream)inputStream).close();
                return;
            }
            boolean bl2 = gtq2.a(zipEntry);
            if (!bl2) continue;
            dhp dhp2 = new dhp((ZipInputStream)inputStream);
            dhs2.a(file, dhp2, zipEntry, dcx2);
            break;
        }
        catch (Throwable throwable) {
            try {
                ((ZipInputStream)inputStream).closeEntry();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    ((ZipInputStream)inputStream).close();
                }
                catch (Throwable throwable3) {
                    throwable2.addSuppressed(throwable3);
                }
                throw throwable2;
            }
        }
        {
            ((ZipInputStream)inputStream).closeEntry();
            continue;
        }
    }

    @Override
    public final hpn a(ddn ddn2) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/ZipUnpacker", "cancel", 83, "ZipUnpacker.java")).u("Canceling unzipping of %s", ddn2);
        return this.a.o(ddn2);
    }

    @Override
    public final hpn b(den den2, String string, File file, File file2) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/ZipUnpacker", "unpack", 75, "ZipUnpacker.java")).G("Unzipping %s from %s to %s", den2, dec.e(file), dec.e(file2));
        if (this.d(string)) {
            return this.a.p(den2.o(), new dho(file, den2, file2, string));
        }
        throw new IllegalArgumentException("Scheme not supported: ".concat(string));
    }

    @Override
    public final String c() {
        return "ZipUnpacker";
    }

    @Override
    public final boolean d(String string) {
        return "zip".equals(string) || "zip_zip".equals(string);
        {
        }
    }
}

