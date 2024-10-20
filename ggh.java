/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ggh {
    public final jnu a;
    public final Executor b;
    public final iku c;
    public final int d;
    public final Set e;
    public final Map f;
    public final iku g;
    public final iku h;
    public final iku i;
    public final knl j;
    public final cya k;
    public final cya l;
    public final AmbientModeSupport$AmbientController m;

    public ggh(jnu jnu2, knl knl2, Executor executor, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, iku iku2, int n2, Set set, Map map, iku iku3, iku iku4, iku iku5, cya cya2, cya cya3) {
        jse.e(jnu2, "phenotypeClient");
        jse.e(executor, "executor");
        jse.e(ambientModeSupport$AmbientController, "subpackager");
        jse.e(iku2, "configurationUpdater");
        jse.e(set, "logSources");
        jse.e(map, "packages");
        jse.e(iku3, "legacyParamsMap");
        jse.e(iku4, "runtimeProperties");
        jse.e(iku5, "runtimePropertiesWithFallback");
        jse.e(cya3, "storageInfoProvider");
        this.a = jnu2;
        this.j = knl2;
        this.b = executor;
        this.m = ambientModeSupport$AmbientController;
        this.c = iku2;
        this.d = n2;
        this.e = set;
        this.f = map;
        this.g = iku3;
        this.h = iku4;
        this.i = iku5;
        this.l = cya2;
        this.k = cya3;
    }
}

