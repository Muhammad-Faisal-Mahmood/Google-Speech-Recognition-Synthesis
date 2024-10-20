/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public final class cvc
implements dja {
    private final po a;

    public cvc(po po2) {
        this.a = po2;
    }

    @Override
    public final void a(File object, diz diz2) {
        cyr.p("%s: Failed to download file %s due to %s", "DownloadCompleteHandler", ((File)object).getName(), diz2.b);
        kqr kqr2 = css.a();
        switch (((diy)((Object)diz2.b)).ordinal()) {
            default: {
                object = csr.c;
                break;
            }
            case 11: {
                object = csr.o;
                break;
            }
            case 10: {
                object = csr.n;
                break;
            }
            case 9: {
                object = csr.m;
                break;
            }
            case 8: {
                object = csr.l;
                break;
            }
            case 7: {
                object = csr.k;
                break;
            }
            case 6: {
                object = csr.j;
                break;
            }
            case 5: {
                object = csr.i;
                break;
            }
            case 4: {
                object = csr.h;
                break;
            }
            case 3: {
                object = csr.g;
                break;
            }
            case 2: {
                object = csr.f;
                break;
            }
            case 1: {
                object = csr.e;
                break;
            }
            case 0: {
                object = csr.d;
            }
        }
        kqr2.b = object;
        Object object2 = ((diy)((Object)diz2.b)).name();
        object = new StringBuilder("ANDROID_DOWNLOADER_");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("; ");
        object = ((StringBuilder)object).toString();
        int n2 = diz2.a;
        object2 = object;
        if (n2 >= 0) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("HttpCode: ");
            ((StringBuilder)object2).append(n2);
            ((StringBuilder)object2).append("; ");
            object2 = ((StringBuilder)object2).toString();
        }
        Object object3 = diz2.c;
        object = object2;
        if (object3 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("Message: ");
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append("; ");
            object = ((StringBuilder)object).toString();
        }
        object3 = diz2.d;
        object2 = object;
        if (object3 != null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("AuthToken: ");
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append("; ");
            object2 = ((StringBuilder)object2).toString();
        }
        object = diz2.e;
        kqr2.c = object2;
        if (object != null) {
            kqr2.d = object;
        }
        this.a.d(kqr2.a());
    }

    @Override
    public final void b(File file) {
        cyr.d("%s: Downloaded file %s", "DownloadCompleteHandler", file.getName());
        this.a.c(null);
    }
}

