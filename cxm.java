/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
import android.content.Context;
import android.content.SharedPreferences;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class cxm
implements cwk {
    public final Executor a;
    private final Context b;
    private final cuv c;
    private final gto d;

    public cxm(Context context, cuv cuv2, gto gto2, Executor executor) {
        this.b = context;
        this.c = cuv2;
        this.d = gto2;
        this.a = executor;
    }

    @Override
    public final hpn a(cth object) {
        cyr.d("%s: Adding file group %s", "SharedPreferencesFileGroupsMetadata", ((cth)object).d);
        cth cth2 = cqq.Y((cth)object, cqq.x() / 1000L + ((cth)object).k);
        object = new ArrayList();
        object.add(cth2);
        return this.m((List)object);
    }

    @Override
    public final hpn b() {
        cqq.z(this.b, "gms_icing_mdd_groups", this.d).edit().clear().commit();
        cqq.z(this.b, "gms_icing_mdd_group_key_properties", this.d).edit().clear().commit();
        return this.k();
    }

    @Override
    public final hpn c() {
        return fxf.ak(this.d(), new cwu(this, 16), this.a);
    }

    @Override
    public final hpn d() {
        ArrayList<ctq> arrayList = new ArrayList<ctq>();
        SharedPreferences sharedPreferences = cqq.z(this.b, "gms_icing_mdd_groups", this.d);
        Iterator iterator = sharedPreferences.getAll().keySet().iterator();
        SharedPreferences.Editor editor = null;
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            try {
                arrayList.add(cqq.S(string));
            }
            catch (czq czq2) {
                cyr.q(czq2, "Failed to deserialize groupKey:".concat(String.valueOf(string)));
                this.c.a();
                SharedPreferences.Editor editor2 = editor;
                if (editor == null) {
                    editor2 = sharedPreferences.edit();
                }
                editor2.remove(string);
                cyr.c("%s: Deleting null file group ", "SharedPreferencesFileGroupsMetadata");
                editor = editor2;
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return hhk.K(arrayList);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn e() {
        Object object2;
        Object object;
        block9: {
            block8: {
                object = cqq.T(this.b, this.d);
                try {
                    object2 = new FileInputStream((File)object);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    cyr.c("File %s not found while reading.", ((File)object).getAbsolutePath());
                    int n4 = gzx.d;
                    object = hct.a;
                    return hhk.K(object);
                }
                try {
                    object = ByteBuffer.allocate((int)((File)object).length());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    cyr.j(illegalArgumentException, "%s: Exception while reading from stale groups into buffer.", "FileGroupsMetadataUtil");
                    int n2 = gzx.d;
                    object = hct.a;
                    return hhk.K(object);
                }
                try {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream)object2).getChannel()).read((ByteBuffer)object);
                    ((ByteBuffer)object).rewind();
                    object = cqq.O((ByteBuffer)object, cth.class, (hym)cth.a.C(7));
                }
                catch (IOException iOException) {
                    object = null;
                    break block8;
                }
                try {
                    ((FileInputStream)object2).close();
                    object2 = object;
                    break block9;
                }
                catch (IOException iOException) {}
            }
            cyr.j((Throwable)object2, "%s: IOException occurred while reading file groups.", "FileGroupsMetadataUtil");
            object2 = object;
        }
        object = object2;
        if (object2 != null) return hhk.K(object);
        int n3 = gzx.d;
        object = hct.a;
        return hhk.K(object);
    }

    @Override
    public final hpn f() {
        return hpj.a;
    }

    @Override
    public final hpn g(ctq object) {
        Context context = this.b;
        object = cqq.U((ctq)object);
        return hhk.K((cth)cqq.B(cqq.z(context, "gms_icing_mdd_groups", this.d), (String)object, (hym)cth.a.C(7)));
    }

    @Override
    public final hpn h(ctq object) {
        Context context = this.b;
        object = cqq.U((ctq)object);
        return hhk.K((ctr)cqq.B(cqq.z(context, "gms_icing_mdd_group_key_properties", this.d), (String)object, (hym)ctr.a.C(7)));
    }

    @Override
    public final hpn i(ctq object) {
        Context context = this.b;
        gto gto2 = this.d;
        object = cqq.U((ctq)object);
        return hhk.K(cqq.G(cqq.z(context, "gms_icing_mdd_groups", gto2), (String)object));
    }

    @Override
    public final hpn j(List object) {
        SharedPreferences.Editor editor = cqq.z(this.b, "gms_icing_mdd_groups", this.d).edit();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (ctq)iterator.next();
            cyr.e("%s: Removing group %s %s", "SharedPreferencesFileGroupsMetadata", ((ctq)object).c, ((ctq)object).d);
            editor.remove(cqq.D((hyf)object));
        }
        return hhk.K(editor.commit());
    }

    @Override
    public final hpn k() {
        this.n().delete();
        return hpj.a;
    }

    @Override
    public final hpn l(ctq object, cth cth2) {
        Context context = this.b;
        gto gto2 = this.d;
        object = cqq.U((ctq)object);
        return hhk.K(cqq.H(cqq.z(context, "gms_icing_mdd_groups", gto2), (String)object, cth2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn m(List object) {
        FileOutputStream fileOutputStream;
        File file = this.n();
        try {
            fileOutputStream = new FileOutputStream(file, true);
        }
        catch (FileNotFoundException fileNotFoundException) {
            cyr.g("File %s not found while writing.", file.getAbsolutePath());
            return hhk.K(false);
        }
        try {
            object = cqq.N((Iterable)object);
            if (object != null) {
                DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).write((ByteBuffer)object);
            }
            fileOutputStream.close();
            return hhk.K(true);
        }
        catch (IOException iOException) {
            cyr.f("IOException occurred while writing file groups.");
            return hhk.K(false);
        }
    }

    final File n() {
        return cqq.T(this.b, this.d);
    }
}

