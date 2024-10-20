/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public abstract class fqw
implements fqv {
    protected Uri a(Uri uri) {
        throw null;
    }

    protected Uri b(Uri uri) {
        throw null;
    }

    protected abstract fqv c();

    @Override
    public /* synthetic */ File d(Uri uri) {
        throw null;
    }

    @Override
    public InputStream e(Uri uri) {
        throw null;
    }

    @Override
    public boolean g(Uri uri) {
        throw null;
    }

    @Override
    public final Iterable h(Uri object) {
        ArrayList<Uri> arrayList = new ArrayList<Uri>();
        object = this.c().h(this.b((Uri)object)).iterator();
        while (object.hasNext()) {
            arrayList.add(this.a((Uri)object.next()));
        }
        return arrayList;
    }

    @Override
    public final void i(Uri uri) {
        this.c().i(this.b(uri));
    }

    @Override
    public final void j(Uri uri) {
        this.c().j(this.b(uri));
    }

    @Override
    public final void k(Uri uri) {
        this.c().k(this.b(uri));
    }

    @Override
    public final void l(Uri uri, Uri uri2) {
        this.c().l(this.b(uri), this.b(uri2));
    }

    @Override
    public final boolean m(Uri uri) {
        return this.c().m(this.b(uri));
    }

    @Override
    public final long p(Uri uri) {
        return this.c().p(this.b(uri));
    }

    @Override
    public final OutputStream q(Uri uri) {
        return this.c().q(this.b(uri));
    }

    @Override
    public final OutputStream r(Uri uri) {
        return this.c().r(this.b(uri));
    }
}

