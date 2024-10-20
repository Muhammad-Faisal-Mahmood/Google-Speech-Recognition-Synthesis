/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 */
import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class dgg
implements dej {
    public final AssetManager a;
    private final String b;
    private final bmu c;

    public dgg(bmt bmt2) {
        this.b = (String)bmt2.c;
        this.a = (AssetManager)bmt2.b;
        this.c = new bmu((hpq)bmt2.a, null);
    }

    @Override
    public final hpn a(ddn ddn2) {
        return this.c.o(ddn2);
    }

    @Override
    public final hpn b(den object, deh object2, File file) {
        ((hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/packs/AssetFetcher", "fetch", 80, "AssetFetcher.java")).C("Fetching %s from assets with params: %s", ((den)object).o().e(), object2);
        object2 = ((den)object).o();
        object = new dgf(this, (den)object, file, 0);
        return this.c.p(object2, (ddz)object);
    }

    @Override
    public final String c() {
        return "AssetFetcher";
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final elq d(den object) {
        block15: {
            void var1_4;
            String[] stringArray;
            block17: {
                void var5_12;
                Object object2;
                block18: {
                    block16: {
                        int n2;
                        stringArray = null;
                        String string = this.e((den)object);
                        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/AssetFetcher", "assetsHavePack", 148, "AssetFetcher.java")).C("Searching for assets for pack %s in path %s", object, string);
                        object2 = this.a.list(string);
                        if (object2 != null && (n2 = ((String[])object2).length) > 0) {
                            ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/AssetFetcher", "assetsHavePack", 153, "AssetFetcher.java")).G("Found %s in asset path %s (dir with %d files)", object, string, n2);
                            break block15;
                        }
                        object2 = this.a.open(string);
                        if (object2 == null) break block16;
                        stringArray = object2;
                        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/AssetFetcher", "assetsHavePack", 159, "AssetFetcher.java")).C("Found %s in asset path %s", object, string);
                        try {
                            ((InputStream)object2).close();
                            break block15;
                        }
                        catch (IOException iOException) {}
                    }
                    stringArray = object2;
                    try {
                        ((hfk)ddd.a.m().j("com/google/android/libraries/micore/superpacks/packs/AssetFetcher", "assetsHavePack", 162, "AssetFetcher.java")).u("Pack %s not found in assets", object);
                        return null;
                    }
                    catch (IOException iOException) {}
                    break block18;
                    catch (Throwable throwable) {
                        break block17;
                    }
                    catch (IOException iOException) {
                        object2 = null;
                    }
                }
                stringArray = object2;
                ((hfk)((hfk)ddd.a.m().i((Throwable)var5_12)).j("com/google/android/libraries/micore/superpacks/packs/AssetFetcher", "assetsHavePack", 164, "AssetFetcher.java")).u("Pack %s not found in assets", object);
                if (object2 == null) return null;
                try {
                    ((InputStream)object2).close();
                    return null;
                }
                catch (IOException iOException) {
                    return null;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (stringArray == null) throw var1_4;
            try {
                stringArray.close();
            }
            catch (IOException iOException) {
                throw var1_4;
            }
            throw var1_4;
        }
        if (((den)object).k() != null) return elq.b((den)object);
        return elq.c();
    }

    final String e(den object) {
        Object object2 = (dco)((den)object).o();
        String string = ((dco)object2).a;
        object2 = ((dco)object2).b;
        object = (object = ((den)object).k()) != null ? ".".concat((String)object) : "";
        object = ((String)object2).concat((String)object);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("/");
        ((StringBuilder)object2).append((String)object);
        string = ((StringBuilder)object2).toString();
        object2 = this.b;
        object = string;
        if (object2 != null) {
            object = a.ao(string, (String)object2, "/");
        }
        return object;
    }
}

