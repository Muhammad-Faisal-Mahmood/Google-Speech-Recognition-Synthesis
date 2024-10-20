/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class dgp
implements djm {
    private final File a;
    private final File b;
    private final eky c;

    public dgp(File file, String string, eky eky2) {
        this.c = eky2;
        this.a = file;
        this.b = new File(file, string);
    }

    @Override
    public final long a() {
        return this.b.length();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(InputStream object, long l2, long l3) {
        if (!this.a.exists()) {
            if (!this.a.mkdirs()) throw new IOException("Error creating output directory");
        }
        if (l2 > this.b.length()) {
            l3 = this.b.length();
            object = new StringBuilder("Given offsetBytes does not correspond with existing data: ");
            ((StringBuilder)object).append(l2);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(l3);
            throw new IOException(((StringBuilder)object).toString());
        }
        kmi kmi2 = l2 > 0L ? klw.a(new FileOutputStream(this.b, true)) : klw.a(new FileOutputStream(this.b, false));
        object = new kme(klw.c((InputStream)object));
        Object object2 = this.c;
        Object object3 = (fkg)((eky)object2).b;
        Object object4 = ((den)((fkg)object3).c).o();
        Object object5 = ((den)((fkg)object3).c).e();
        long l4 = ((File)((fkg)object3).a).length();
        object3 = ((dgu)((fkg)object3).b).h;
        object4 = new dgt((ddn)object4, (String)((eky)object2).a, object5, l4, 1);
        ((dgv)object3).d.a((dau)object4);
        try {
            object4 = new klm();
            l4 = 0L;
            while (!object.y()) {
                object.b((klm)object4, 8192L);
                long l5 = ((klm)object4).b;
                if (l5 > 0L) {
                    kmi2.bK((klm)object4, l5);
                }
                l4 += l5;
                object3 = this.c;
                object5 = ((eky)object3).b;
                object2 = ((eky)object3).a;
                object3 = ((dgu)((fkg)object5).b).h.d;
                object5 = ((fkg)object5).c;
                dgs dgs2 = new dgs((den)object5, (String)object2, l2 + l4, l2 + l3);
                ((cxv)object3).a(dgs2);
            }
            kmi2.flush();
            l2 = this.b.length();
            ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 90, "DefaultResponseWriter.java")).G("Wrote response to file: %s, size: %d, read: %d", this.b.getAbsolutePath(), l2, l4);
        }
        catch (Throwable throwable) {
            try {
                kmi2.close();
            }
            catch (IOException iOException) {
                ((hfk)((hfk)((hfk)ddd.a.g()).i(iOException)).j("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 98, "DefaultResponseWriter.java")).r("Error closing download file");
            }
            try {
                object.close();
                throw throwable;
            }
            catch (IOException iOException) {
                ((hfk)((hfk)((hfk)ddd.a.g()).i(iOException)).j("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 103, "DefaultResponseWriter.java")).r("Error closing buffered source");
            }
            throw throwable;
        }
        try {
            kmi2.close();
        }
        catch (IOException iOException) {
            ((hfk)((hfk)((hfk)ddd.a.g()).i(iOException)).j("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 98, "DefaultResponseWriter.java")).r("Error closing download file");
        }
        try {
            object.close();
            return;
        }
        catch (IOException iOException) {
            ((hfk)((hfk)((hfk)ddd.a.g()).i(iOException)).j("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 103, "DefaultResponseWriter.java")).r("Error closing buffered source");
            return;
        }
    }
}

