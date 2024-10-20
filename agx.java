/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

public final class agx
implements gtq {
    private final int a;

    public /* synthetic */ agx(int n2) {
        this.a = n2;
    }

    @Override
    public final boolean a(Object object) {
        switch (this.a) {
            default: {
                String string = (String)object;
                object = gls.a;
                return string.startsWith("com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker");
            }
            case 6: {
                return (Context)object instanceof gin;
            }
            case 5: {
                return (Context)object instanceof ilw;
            }
            case 4: {
                object = (Integer)object;
                fxf.K(object);
                return (Integer)object > 0;
            }
            case 3: {
                int n2 = a.w(((ctf)object).m);
                return n2 != 0 && n2 == 2;
            }
            case 2: {
                object = (String)object;
                return object != null && !TextUtils.isEmpty((CharSequence)(object = fxf.T((String)object))) && (!((String)object).contains("text") || ((String)object).contains("text/vtt")) && !((String)object).contains("html") && !((String)object).contains("xml");
            }
            case 1: {
                return ((Map.Entry)object).getKey() != null;
            }
            case 0: 
        }
        return (String)object != null;
    }
}

