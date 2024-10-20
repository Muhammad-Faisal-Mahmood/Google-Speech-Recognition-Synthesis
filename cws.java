/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class cws
implements gte {
    public final Object a;
    private final int b;

    public /* synthetic */ cws(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object apply(Object object) {
        block36: {
            String string;
            int n2 = this.b;
            Object object2 = false;
            switch (n2) {
                default: {
                    object2 = (cth)object;
                    object = cyo.i((cth)object2);
                    string = ((cth)object2).d;
                    if (cqq.h()) break;
                    object = hpj.a;
                    break block36;
                }
                case 19: {
                    return (ctv)((hac)object).get(this.a);
                }
                case 18: {
                    return (Uri)((hac)object).get(this.a);
                }
                case 17: {
                    ctx ctx2 = (ctx)object;
                    cyr.c("%s: Starting migration to add download transform", "ProtoDataStoreSharedFilesMetadata");
                    hwp hwp2 = (hwp)ctx2.C(5);
                    hwp2.x(ctx2);
                    Iterator iterator = DesugarCollections.unmodifiableMap(ctx2.b).keySet().iterator();
                    Object object3 = this.a;
                    while (iterator.hasNext()) {
                        ctt ctt2;
                        object2 = (String)iterator.next();
                        try {
                            ctt2 = cqq.I((String)object2, ((cxd)object3).a, ((cxd)object3).b);
                            object2.getClass();
                        }
                        catch (czs czs2) {
                            cyr.h("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", object2);
                            ((cxd)object3).b.a();
                            hwp2.E((String)object2);
                            continue;
                        }
                        object = ctx2.b;
                        object = object.containsKey(object2) ? (ctv)object.get(object2) : null;
                        hwp2.E((String)object2);
                        if (object == null) {
                            cyr.g("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            continue;
                        }
                        hwp2.D(cqq.M(ctt2), (ctv)object);
                    }
                    return (ctx)hwp2.o();
                }
                case 16: {
                    object = (Void)object;
                    return (List)((AtomicReference)this.a).get();
                }
                case 15: {
                    object = (IOException)object;
                    cyr.f("Failed to commit migration metadata to disk");
                    new Exception("Migration to ChecksumOnly failed.", (Throwable)object);
                    ((cxd)this.a).b.a();
                    return object2;
                }
                case 14: {
                    ctx ctx3 = (ctx)object;
                    cyr.c("%s: Starting migration to dedup on checksum onlu", "ProtoDataStoreSharedFilesMetadata");
                    hwp hwp3 = (hwp)ctx3.C(5);
                    hwp3.x(ctx3);
                    Iterator iterator = DesugarCollections.unmodifiableMap(ctx3.b).keySet().iterator();
                    object2 = this.a;
                    while (iterator.hasNext()) {
                        ctt ctt3;
                        String string2 = (String)iterator.next();
                        try {
                            ctt3 = cqq.I(string2, ((cxd)object2).a, ((cxd)object2).b);
                            string2.getClass();
                        }
                        catch (czs czs3) {
                            cyr.h("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", string2);
                            ((cxd)object2).b.a();
                            hwp3.E(string2);
                            continue;
                        }
                        object = ctx3.b;
                        object = object.containsKey(string2) ? (ctv)object.get(string2) : null;
                        hwp3.E(string2);
                        if (object == null) {
                            cyr.g("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                            continue;
                        }
                        hwp3.D(cqq.L(ctt3), (ctv)object);
                    }
                    return (ctx)hwp3.o();
                }
                case 13: {
                    object = (ctx)object;
                    object2 = (hwp)((hwv)object).C(5);
                    ((hwp)object2).x((hwv)object);
                    ((hwp)object2).E((String)this.a);
                    return (ctx)((hwp)object2).o();
                }
                case 12: {
                    return (ctv)((hac)object).get(this.a);
                }
                case 11: {
                    object = (IOException)object;
                    cyr.f("Failed to commit migration metadata to disk");
                    new Exception("Migration to DownloadTransform failed.", (Throwable)object);
                    ((cxd)this.a).b.a();
                    return object2;
                }
                case 10: {
                    object = (Void)object;
                    return this.a;
                }
                case 9: {
                    object2 = (cto)object;
                    object = (hwp)((hwv)object2).C(5);
                    ((hwp)object).x((hwv)object2);
                    object2 = DesugarCollections.unmodifiableMap(((cto)object2).b).entrySet().iterator();
                    Object object4 = this.a;
                    while (object2.hasNext()) {
                        Object object5 = (Map.Entry)object2.next();
                        String string3 = (String)object5.getKey();
                        try {
                            ctq ctq2 = cqq.S(string3);
                            cth cth2 = (cth)object5.getValue();
                            object5 = new cxr(ctq2, cth2);
                            object4.add(object5);
                        }
                        catch (czq czq2) {
                            ((hwp)object).C(string3);
                            cyr.q(czq2, "Failed to deserialized file group key: ".concat(String.valueOf(string3)));
                        }
                    }
                    return (cto)((hwp)object).o();
                }
                case 8: {
                    object = (cto)object;
                    object2 = (hwp)((hwv)object).C(5);
                    ((hwp)object2).x((hwv)object);
                    ((hwp)object2).C((String)this.a);
                    return (cto)((hwp)object2).o();
                }
                case 7: {
                    return (cth)DesugarCollections.unmodifiableMap(((cto)object).b).get(this.a);
                }
                case 6: {
                    object = (Void)object;
                    return this.a;
                }
                case 5: {
                    object2 = (cto)object;
                    object = (hwp)((hwv)object2).C(5);
                    ((hwp)object).x((hwv)object2);
                    Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        object2 = (ctq)iterator.next();
                        cyr.e("%s: Removing group %s %s", "ProtoDataStoreFileGroupsMetadata", ((ctq)object2).c, ((ctq)object2).d);
                        ((hwp)object).C(cqq.U((ctq)object2));
                    }
                    return (cto)((hwp)object).o();
                }
                case 4: {
                    return (ctr)DesugarCollections.unmodifiableMap(((cto)object).c).get(this.a);
                }
                case 3: {
                    object2 = (cto)object;
                    object = (hwp)((hwv)object2).C(5);
                    ((hwp)object).x((hwv)object2);
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object2 = (cto)((hwp)object).b;
                    Object object6 = cto.a;
                    object6 = ((cto)object2).d;
                    if (!object6.c()) {
                        ((cto)object2).d = hwv.s((hxk)object6);
                    }
                    hvc.g((Iterable)this.a, ((cto)object2).d);
                    return (cto)((hwp)object).o();
                }
                case 2: {
                    return fvd.y((List)object, new cws(this.a, 0));
                }
                case 1: {
                    object = (Void)object;
                    boolean bl2 = cwz.a;
                    this.a.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                    return null;
                }
                case 0: {
                    object = (cth)object;
                    return ((cwz)this.a).b((cth)object);
                }
            }
            object2 = this.a;
            cyo cyo2 = (cyo)object2;
            object = fxf.ak(fxf.aj(cyo2.d(string), new cxc(4), cyo2.b), new cww(object2, object, 15, null), cyo2.b);
        }
        return object;
    }
}

