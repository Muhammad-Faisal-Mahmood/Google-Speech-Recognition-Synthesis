/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Configuration
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import java.util.Locale;

public final class gin
extends ContextWrapper
implements ghv {
    private static final hei a = hei.m("com/google/apps/tiktok/inject/peer/FragmentContextWrapper");
    private final gui b;

    public gin(be be2, Context context) {
        fxf.K(context);
        gin.b(context, gin.a(be2));
        super(context);
        this.b = fvd.ap(new eyd(this, 8));
    }

    public gin(be be2, LayoutInflater layoutInflater) {
        Context context = layoutInflater.getContext();
        fxf.K(context);
        gin.b(context, gin.a(be2));
        super(context);
        this.b = fvd.ap(new drq(this, layoutInflater, 7));
    }

    private static Locale a(be be2) {
        Locale locale;
        if (be2 instanceof gim && (locale = ((gim)((Object)be2)).M()) != null) {
            return locale;
        }
        be2 = be2.D;
        if (be2 != null) {
            return gin.a(be2);
        }
        return null;
    }

    private static void b(Context context, Locale locale) {
        if (locale != null) {
            ((heg)((heg)a.c()).j("com/google/apps/tiktok/inject/peer/FragmentContextWrapper", "maybeApplyCustomLocale", 46, "FragmentContextWrapper.java")).u("applying customLocale = %s", locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            context = context.getResources();
            context.updateConfiguration(configuration, context.getDisplayMetrics());
        }
    }

    public final Object getSystemService(String object) {
        object = !"layout_inflater".equals(object) ? this.getBaseContext().getSystemService((String)object) : this.b.a();
        return object;
    }
}

