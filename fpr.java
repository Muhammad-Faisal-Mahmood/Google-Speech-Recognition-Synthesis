/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 */
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class fpr
extends fqw {
    private final Context a;
    private final fqv b;
    private final Object c = new Object();
    private String d;

    public fpr(cxt cxt2) {
        this.b = new fpv(null);
        this.a = (Context)cxt2.a;
    }

    private final boolean n(Uri uri) {
        return !TextUtils.isEmpty((CharSequence)uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority());
    }

    private static final void o() {
        throw new fpx("Android backend cannot perform remote operations without a remote backend");
    }

    @Override
    protected final Uri a(Uri uri) {
        try {
            Context context = this.a;
            fps fps2 = new fps(context);
            fps2.b(uri.getPath());
            uri = fps2.a();
            return uri;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new fpz(illegalArgumentException);
        }
    }

    @Override
    protected final Uri b(Uri object) {
        if (!this.n((Uri)object)) {
            object = ((fqw)this).d((Uri)object);
            Uri.Builder builder = new Uri.Builder().scheme("file").authority("").path("/");
            gzs gzs2 = new gzs();
            builder.path(((File)object).getAbsolutePath());
            return fvc.J(builder, gzs2);
        }
        throw new fpz("Operation across authorities is not allowed.");
    }

    @Override
    protected final fqv c() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final File d(Uri object) {
        String string;
        if (this.n((Uri)object)) throw new IOException("operation is not permitted in other authorities.");
        File file = fvc.L(object, this.a);
        if (crt.e(this.a)) {
            return file;
        }
        object = this.c;
        synchronized (object) {
            if (this.d == null) {
                this.d = fvc.M(this.a).getAbsolutePath();
            }
            string = this.d;
        }
        if (!file.getAbsolutePath().startsWith(string)) throw new fpx("Cannot access credential-protected data from direct boot");
        return file;
    }

    @Override
    public final InputStream e(Uri uri) {
        if (!this.n(uri)) {
            return this.b.e(((fqw)this).b(uri));
        }
        fpr.o();
        throw null;
    }

    @Override
    public final String f() {
        return "android";
    }

    @Override
    public final boolean g(Uri uri) {
        if (!this.n(uri)) {
            return this.b.g(((fqw)this).b(uri));
        }
        fpr.o();
        throw null;
    }
}

