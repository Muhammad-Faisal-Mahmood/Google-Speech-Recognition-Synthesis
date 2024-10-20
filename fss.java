/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class fss
implements ftc {
    private final caj a;
    private final String b;
    private final CopyOnWriteArrayList c;

    public fss(Context object) {
        object = new caj((Context)object, "STREAMZ_AUDIO_LIBRARY_ANDROID", cat.a, new cba((Context)object, new bpr(6)), new cbg((Context)object), new bpr(5), null);
        this.c = new CopyOnWriteArrayList();
        this.a = object;
        this.b = "STREAMZ_AUDIO_LIBRARY_ANDROID";
    }

    @Override
    public final void a(ftb object) {
        object = ((ftb)object).f();
        if (((gsa)object).b.size() == 0) {
            object = null;
        } else {
            cai cai2 = this.a.e((hyf)object);
            cai2.i = this.b;
            Iterator iterator = this.c.iterator();
            while (true) {
                object = cai2;
                if (!iterator.hasNext()) break;
                cai2.d((String)iterator.next());
            }
        }
        if (object != null) {
            ((cag)object).a();
        }
    }
}

