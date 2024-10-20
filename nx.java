/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.AssetManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class nx
extends ContextWrapper {
    private static Configuration b;
    public int a;
    private Resources.Theme c;
    private LayoutInflater d;
    private Configuration e;
    private Resources f;

    public nx() {
        super(null);
    }

    public nx(Context context, int n2) {
        super(context);
        this.a = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final Resources b() {
        if (this.f != null) return this.f;
        Configuration configuration = this.e;
        if (configuration != null) {
            if (b == null) {
                Configuration configuration2 = new Configuration();
                configuration2.fontScale = 0.0f;
                b = configuration2;
            }
            if (!configuration.equals(b)) {
                this.f = this.createConfigurationContext(this.e).getResources();
                return this.f;
            }
        }
        this.f = super.getResources();
        return this.f;
    }

    private final void c() {
        if (this.c == null) {
            this.c = this.b().newTheme();
            Resources.Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.c.setTo(theme);
            }
        }
        this.c.applyStyle(this.a, true);
    }

    public final void a(Configuration configuration) {
        if (this.f == null) {
            if (this.e == null) {
                this.e = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    public final AssetManager getAssets() {
        return this.b().getAssets();
    }

    public final Resources getResources() {
        return this.b();
    }

    public final Object getSystemService(String string) {
        if ("layout_inflater".equals(string)) {
            if (this.d == null) {
                this.d = LayoutInflater.from((Context)this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.d;
        }
        return this.getBaseContext().getSystemService(string);
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.c;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2132083752;
        }
        this.c();
        return this.c;
    }

    public final void setTheme(int n2) {
        if (this.a != n2) {
            this.a = n2;
            this.c();
        }
    }
}

