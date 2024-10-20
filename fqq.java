/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.InflaterInputStream;

public final class fqq
implements fpp {
    public boolean a = false;

    public final InputStream b(fpo object) {
        Object object2;
        Object object3 = object2 = ((fpo)object).a.e((Uri)((fpo)object).e);
        if (this.a) {
            object3 = new BufferedInputStream((InputStream)object2);
        }
        object2 = new ArrayList();
        object2.add(object3);
        if (!((fpo)object).c.isEmpty()) {
            Iterator iterator = ((fpo)object).c;
            ArrayList arrayList = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                ((fqz)iterator.next()).f();
            }
            object3 = !arrayList.isEmpty() ? new fpl((InputStream)object3, arrayList) : null;
            if (object3 != null) {
                object2.add(object3);
            }
        }
        object3 = ((fpo)object).b.iterator();
        while (object3.hasNext()) {
            object = (fvc)object3.next();
            object2.add(new InflaterInputStream((InputStream)fvd.P((Iterable)object2)));
        }
        Collections.reverse(object2);
        return (InputStream)object2.get(0);
    }
}

