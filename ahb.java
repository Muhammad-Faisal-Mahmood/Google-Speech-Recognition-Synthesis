/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.text.TextUtils
 */
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class ahb
extends agl {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public ahb() {
        super(false);
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        block4: {
            if (n3 == 0) {
                return 0;
            }
            if (this.c == 0L) {
                return -1;
            }
            try {
                RandomAccessFile randomAccessFile = this.a;
                int n4 = agf.a;
                n2 = randomAccessFile.read(byArray, n2, (int)Math.min(this.c, (long)n3));
                if (n2 <= 0) break block4;
            }
            catch (IOException iOException) {
                throw new aha(iOException, 2000);
            }
            this.c -= (long)n2;
            this.g(n2);
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long b(agt agt2) {
        Object object;
        Uri uri;
        this.b = uri = agt2.a;
        this.j();
        int n2 = 2006;
        try {
            object = uri.getPath();
            abr.i(object);
            this.a = object = new RandomAccessFile((String)object, "r");
        }
        catch (RuntimeException runtimeException) {
            throw new aha(runtimeException, 2000);
        }
        catch (SecurityException securityException) {
            throw new aha(securityException, 2006);
        }
        catch (FileNotFoundException fileNotFoundException) {
            if (TextUtils.isEmpty((CharSequence)uri.getQuery()) && TextUtils.isEmpty((CharSequence)uri.getFragment())) {
                if (fileNotFoundException.getCause() instanceof ErrnoException && ((ErrnoException)fileNotFoundException.getCause()).errno == OsConstants.EACCES) {
                    throw new aha(fileNotFoundException, n2);
                }
                n2 = 2005;
                throw new aha(fileNotFoundException, n2);
            }
            throw new aha(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), fileNotFoundException, 1004);
        }
        try {
            ((RandomAccessFile)object).seek(agt2.e);
            long l2 = agt2.f;
            this.c = l2 = this.a.length() - agt2.e;
            if (l2 < 0L) throw new aha(null, null, 2008);
            this.d = true;
            this.i(agt2);
            return this.c;
        }
        catch (IOException iOException) {
            throw new aha(iOException, 2000);
        }
    }

    @Override
    public final Uri c() {
        return this.b;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        Throwable throwable2222222;
        this.b = null;
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.a = null;
        if (!this.d) return;
        this.d = false;
        this.h();
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            {
                aha aha2 = new aha(iOException, 2000);
                throw aha2;
            }
        }
        this.a = null;
        if (!this.d) {
            throw throwable2222222;
        }
        this.d = false;
        this.h();
        throw throwable2222222;
    }
}

