/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  hom
 */
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class cvq
implements hny {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ cvq(cwj cwj2, cth cth2, ctf ctf2, ctt ctt2, int n2) {
        this.e = n2;
        this.d = cwj2;
        this.a = cth2;
        this.c = ctf2;
        this.b = ctt2;
    }

    public /* synthetic */ cvq(cwj cwj2, ctj ctj2, ctq ctq2, hny hny2, int n2) {
        this.e = n2;
        this.b = cwj2;
        this.c = ctj2;
        this.a = ctq2;
        this.d = hny2;
    }

    public /* synthetic */ cvq(cwj cwj2, ctt ctt2, cth cth2, ctf ctf2, int n2) {
        this.e = n2;
        this.d = cwj2;
        this.b = ctt2;
        this.a = cth2;
        this.c = ctf2;
    }

    public /* synthetic */ cvq(cwj cwj2, Object object, cth cth2, ctq ctq2, int n2) {
        this.e = n2;
        this.b = cwj2;
        this.d = object;
        this.c = cth2;
        this.a = ctq2;
    }

    public /* synthetic */ cvq(dua dua2, hpn hpn2, dvt dvt2, String string, int n2) {
        this.e = n2;
        this.c = dua2;
        this.b = hpn2;
        this.a = dvt2;
        this.d = string;
    }

    public /* synthetic */ cvq(Object object, ctq ctq2, Object object2, Object object3, int n2) {
        this.e = n2;
        this.a = object;
        this.c = ctq2;
        this.b = object2;
        this.d = object3;
    }

    public /* synthetic */ cvq(Object object, Object object2, Object object3, Object object4, int n2) {
        this.e = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object4;
    }

    public /* synthetic */ cvq(Object object, Object object2, Object object3, Object object4, int n2, byte[] byArray) {
        this.e = n2;
        this.d = object;
        this.a = object2;
        this.b = object3;
        this.c = object4;
    }

    public /* synthetic */ cvq(Object object, Object object2, Object object3, Object object4, int n2, char[] cArray) {
        this.e = n2;
        this.d = object;
        this.b = object2;
        this.c = object3;
        this.a = object4;
    }

    public /* synthetic */ cvq(kpo kpo2, ddn ddn2, ddn ddn3, den den2, int n2) {
        this.e = n2;
        this.d = kpo2;
        this.c = ddn2;
        this.a = ddn3;
        this.b = den2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        long l2;
        long l3;
        Object object2;
        Object object3;
        Object object4;
        int n2;
        block68: {
            int n3;
            block69: {
                n3 = this.e;
                n2 = 16;
                object4 = null;
                switch (n3) {
                    default: {
                        object = (Void)object;
                        object = (dwn)hhk.S((Future)this.b);
                        if (!((dwn)object).c.isEmpty()) break;
                        return hpj.a;
                    }
                    case 19: {
                        Object object5 = this.a;
                        object4 = ((dco)object5).b;
                        object = (Throwable)object;
                        ddb.a();
                        Object object6 = this.d;
                        Object object7 = this.b;
                        object4 = (ddn)this.c;
                        object7 = (den)object7;
                        object6 = (kpo)object6;
                        object5 = new dgz((kpo)object6, (ddn)object5, (den)object7, (ddn)object4, (Throwable)object, 0);
                        ((cxv)((kpo)object6).f).a((dau)object5);
                        return hhk.J((Throwable)object);
                    }
                    case 18: {
                        object4 = (kpo)this.d;
                        Object object8 = ((dfu)((kpo)object4).c).d;
                        Object object9 = this.c;
                        object = (Throwable)object;
                        try {
                            ((dfl)object8).b.getWritableDatabase().execSQL("UPDATE file_metadata SET validation_count=validation_count+1 WHERE namespace=? AND name=?", (Object[])new String[]{((dco)object9).a, ((dco)object9).b});
                            Object object10 = this.b;
                            Object object11 = this.a;
                            object8 = ((kpo)object4).f;
                            object9 = new dgz((kpo)object4, (ddn)object11, (den)object10, (ddn)object9, (Throwable)object, 1);
                            ((cxv)object8).a((dau)object9);
                        }
                        catch (SQLiteException sQLiteException) {
                            object4 = ((dfl)object8).b;
                            IOException iOException = new IOException("SqliteFileMetadataTable#incrementValidationFailureCount, SQL update failed, name: ".concat(object9.toString()), sQLiteException);
                            object4.a(iOException);
                            throw iOException;
                        }
                        return hhk.J((Throwable)object);
                    }
                    case 17: {
                        object = (Void)object;
                        Object object12 = this.a;
                        object = this.c;
                        Object object13 = this.b;
                        object4 = (kpo)this.d;
                        object13 = (den)object13;
                        ((kpo)object4).c((den)object13, (ddn)object, (ddn)object12);
                        return kpo.e((den)object13);
                    }
                    case 16: {
                        n3 = ((ctv)object).h;
                        n2 = (int)ins.a.b().e();
                        Object object14 = this.c;
                        object4 = this.b;
                        object = this.d;
                        if (n3 >= n2) {
                            object14 = this.a;
                            cyr.d("%s: Checksum mismatch detected but the has already reached retry limit! Skipping removal for file %s", "DownloaderCallbackImpl", object);
                            ((cyu)object14).d(1115);
                            return hpj.a;
                        } else {
                            cyr.c("%s: Removing file and marking as corrupted due to checksum mismatch", "DownloaderCallbackImpl");
                            ((bmu)object4).z((Uri)object14);
                        }
                        return hpj.a;
                        catch (IOException iOException) {
                            cyr.j(iOException, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", object);
                            return hhk.J(iOException);
                        }
                    }
                    case 15: {
                        Object object15 = (ctv)object;
                        Object object16 = this.a;
                        Object object17 = this.c;
                        object3 = this.d;
                        object2 = object4;
                        if (object15 != null) {
                            object = object2 = ctp.b(((ctv)object15).d);
                            if (object2 == null) {
                                object = ctp.a;
                            }
                            object2 = object4;
                            if (object == ctp.e) {
                                object = this.b;
                                Object object18 = (cyb)object3;
                                object2 = ((cyb)object18).a;
                                n2 = ((cyb)object18).n;
                                object15 = ((ctv)object15).c;
                                object4 = ((cyb)object18).c;
                                object18 = ((cyb)object18).k;
                                object2 = crh.f((Context)object2, n2, (String)object15, ((ctt)object).e, (cuv)object4, (gto)object18, false);
                            }
                        }
                        if (object2 == null) {
                            object = css.a();
                            ((kqr)object).b = csr.G;
                            return hhk.J(((kqr)object).a());
                        }
                        try {
                            if (((cyb)object3).o.B((Uri)object17)) {
                                ((cyb)object3).o.z((Uri)object17);
                            }
                            ((cyb)object3).e.a();
                            ((cyb)object3).o.z((Uri)object16);
                            object2 = hlq.a.l();
                        }
                        catch (IOException iOException) {
                            object2 = (cyb)object3;
                            cyr.j(iOException, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", ((cyb)object2).f.c, ((cyb)object2).d.g);
                            ((cyb)object2).c.a();
                            object2 = css.a();
                            ((kqr)object2).b = csr.H;
                            ((kqr)object2).d = iOException;
                            return hhk.J(((kqr)object2).a());
                        }
                        object = (cyb)object3;
                        object3 = ((cyb)object).g.c;
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        object17 = ((hwp)object2).b;
                        object4 = (hlq)object17;
                        object3.getClass();
                        ((hlq)object4).b |= 1;
                        ((hlq)object4).c = object3;
                        n2 = ((cyb)object).h;
                        if (!((hwv)object17).B()) {
                            ((hwp)object2).u();
                        }
                        object3 = ((hwp)object2).b;
                        object4 = (hlq)object3;
                        ((hlq)object4).b |= 2;
                        ((hlq)object4).d = n2;
                        object4 = ((cyb)object).g.d;
                        if (!((hwv)object3).B()) {
                            ((hwp)object2).u();
                        }
                        object17 = ((hwp)object2).b;
                        object3 = (hlq)object17;
                        object4.getClass();
                        ((hlq)object3).b |= 4;
                        ((hlq)object3).e = object4;
                        l3 = ((cyb)object).i;
                        if (!((hwv)object17).B()) {
                            ((hwp)object2).u();
                        }
                        object3 = ((hwp)object2).b;
                        object4 = (hlq)object3;
                        ((hlq)object4).b |= 0x40;
                        ((hlq)object4).i = l3;
                        object4 = ((cyb)object).j;
                        if (!((hwv)object3).B()) {
                            ((hwp)object2).u();
                        }
                        object3 = (hlq)((hwp)object2).b;
                        object4.getClass();
                        ((hlq)object3).b |= 0x80;
                        ((hlq)object3).j = object4;
                        object2 = (hlq)((hwp)object2).o();
                        object4 = ((cyb)object).m;
                        object3 = ((cyb)object).d;
                        l3 = ((ctf)object3).e;
                        l2 = ((cyb)object).f.d;
                        object3 = ((ctf)object3).c;
                        n3 = 0;
                        break block69;
                    }
                    case 14: {
                        object = (Void)object;
                        ctj ctj2 = (ctj)((gto)this.b).f();
                        object = ((cwz)this.a).c;
                        object4 = this.d;
                        return ((cwj)object).e((ctq)this.c, ctj2, (hny)object4);
                    }
                    case 13: {
                        object4 = (cth)object;
                        Object object19 = this.d;
                        object = hpj.a;
                        if (object4 != null) {
                            Object object20 = this.b;
                            Object object21 = this.a;
                            object = (cwj)object19;
                            object = ((cwj)object).q(((cwj)object).c.i((ctq)object21), new cwd(object19, (ctq)object20, (cth)object4, 8));
                        }
                        object4 = new cvy(object19, (hwv)this.c, 10);
                        return ((cwj)object19).q((hpn)object, (hny)object4);
                    }
                    case 12: {
                        Object object22 = (cxs)object;
                        object = ((cxs)object22).a;
                        if (object == null) {
                            object = ((cxs)object22).b;
                        }
                        Object object23 = this.d;
                        Object object24 = this.c;
                        if (object != null) {
                            Object object25 = this.b;
                            object4 = (cwj)this.a;
                            object22 = new bzo(((cwj)object4).i);
                            object24 = (ctq)object24;
                            return ((cwj)object4).q(((cwj)object4).B((ctq)object24, (cth)object, (hny)object25, (bzo)object22), new cvq((cwj)object4, object23, (cth)object, (ctq)object24, 10));
                        }
                        cwj.v((List)object23, (ctq)object24);
                        return hhk.J((Throwable)((Object)new AssertionError((Object)"impossible error")));
                    }
                    case 11: {
                        Object object26;
                        object4 = (ctv)object;
                        object = object26 = ctp.b(((ctv)object4).d);
                        if (object26 == null) {
                            object = ctp.a;
                        }
                        if (object != ctp.e) {
                            return hpj.a;
                        }
                        Object object27 = this.b;
                        Object object28 = this.c;
                        object26 = this.a;
                        object = (cwj)this.d;
                        object26 = (cth)object26;
                        ctf ctf2 = (ctf)object28;
                        object28 = dah.e(((cwj)object).f((ctv)object4, ctf2, (cth)object26));
                        object27 = (ctt)object27;
                        return ((dah)object28).g(new cvu((cwj)object, ctf2, (cth)object26, (ctv)object4, (ctt)object27, 0), ((cwj)object).e).d(czl.class, new cvq((cwj)object, (cth)object26, ctf2, (ctt)object27, 4), ((cwj)object).e);
                    }
                    case 10: {
                        object = (cwi)((Object)object);
                        object4 = this.a;
                        if (object != cwi.b) {
                            cwj.v((List)this.d, (ctq)object4);
                        }
                        Object object29 = this.b;
                        object = hlq.a.l();
                        hwv hwv2 = (ctq)object4;
                        Object object30 = ((ctq)hwv2).c;
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        object4 = ((hwp)object).b;
                        hwv hwv3 = (hlq)object4;
                        object30.getClass();
                        ((hlq)hwv3).b = 1 | ((hlq)hwv3).b;
                        ((hlq)hwv3).c = object30;
                        object30 = ((ctq)hwv2).d;
                        if (!((hwv)object4).B()) {
                            ((hwp)object).u();
                        }
                        object4 = this.c;
                        hwv2 = ((hwp)object).b;
                        hwv3 = (hlq)hwv2;
                        object30.getClass();
                        ((hlq)hwv3).b |= 4;
                        ((hlq)hwv3).e = object30;
                        object30 = (cth)object4;
                        n2 = ((cth)object30).f;
                        if (!hwv2.B()) {
                            ((hwp)object).u();
                        }
                        hwv2 = hwv3 = ((hwp)object).b;
                        ((hlq)hwv2).b |= 2;
                        ((hlq)hwv2).d = n2;
                        long l4 = ((cth)object30).s;
                        if (!hwv3.B()) {
                            ((hwp)object).u();
                        }
                        hwv2 = ((hwp)object).b;
                        hwv3 = (hlq)hwv2;
                        ((hlq)hwv3).b |= 0x40;
                        ((hlq)hwv3).i = l4;
                        object30 = ((cth)object30).t;
                        if (!hwv2.B()) {
                            ((hwp)object).u();
                        }
                        object29 = ((cwj)object29).i;
                        hwv2 = (hlq)((hwp)object).b;
                        object30.getClass();
                        ((hlq)hwv2).b |= 0x80;
                        ((hlq)hwv2).j = object30;
                        ((cyu)object29).j(3, (hlq)((hwp)object).o(), 2);
                        return hhk.K(object4);
                    }
                    case 9: {
                        object = (cxk)object;
                        cyr.h("%s: Shared file not found, newFileKey = %s", "FileGroupManager", this.b);
                        Object object31 = (cwj)this.d;
                        ((cwj)object31).b.a();
                        object31 = ((cwj)object31).i;
                        object4 = this.c;
                        cwj.A((cyu)object31, (cth)this.a, (ctf)object4, 26);
                        return hhk.J((Throwable)object);
                    }
                    case 8: {
                        if (((Boolean)object).booleanValue()) {
                            return hpj.a;
                        }
                        object = this.a;
                        object4 = this.c;
                        Object object32 = this.d;
                        Object object33 = this.b;
                        ((bzo)object32).j((cth)object4);
                        hhk.K(true);
                        object4 = (cwj)object33;
                        return ((cwj)object4).q(((cwj)object4).c.i((ctq)object), new bpu(object33, object, 16, null));
                    }
                    case 7: {
                        Object object34 = this.c;
                        cth cth2 = (cth)object;
                        if (object34 != null) {
                            object = object34;
                        } else {
                            object = object34 = cth2.m;
                            if (object34 == null) {
                                object = ctj.a;
                            }
                        }
                        ArrayList<Object> arrayList = new ArrayList<Object>();
                        object4 = cth2.o.iterator();
                        while (true) {
                            Object object35;
                            Object object36;
                            int n4;
                            Object object37 = this.a;
                            object34 = this.b;
                            if (!object4.hasNext()) {
                                object = this.d;
                                return crh.w(arrayList).v(new cvt(object34, object37, object, arrayList, 1), ((cwj)object34).e);
                            }
                            ctf ctf3 = (ctf)object4.next();
                            if (cqq.ae(ctf3)) continue;
                            n3 = n4 = a.t(cth2.j);
                            if (n4 == 0) {
                                n3 = 1;
                            }
                            ctt ctt2 = crh.l(ctf3, n3);
                            if (Build.VERSION.SDK_INT >= 30) {
                                object34 = (cwj)object34;
                                object36 = ((cwj)object34).l(cth2, ctf3, ctt2);
                                object36 = dah.e((hpn)object36).g(new btb((cwj)object34, ctf3, cth2, 15), ((cwj)object34).e).g(new cvu((cwj)object34, ctf3, cth2, (hpn)object36, ctt2, 2), ((cwj)object34).e).d(czl.class, new btb((cwj)object34, ctf3, cth2, 16), ((cwj)object34).e);
                                object37 = (ctq)object37;
                                object35 = (ctj)object;
                                n2 = 16;
                                object34 = ((cwj)object34).q((hpn)object36, new dca((cwj)object34, (ctq)object37, ctf3, ctt2, (ctj)object35, cth2, 1));
                            } else {
                                try {
                                    object35 = ((cwj)object34).j;
                                    n3 = cth2.p;
                                    hxk hxk2 = cth2.q;
                                    object34 = object36 = cth2.i;
                                    if (object36 == null) {
                                        object34 = hvi.a;
                                    }
                                    object34 = ((egg)object35).p((ctq)object37, ctf3, ctt2, (ctj)object, n3, hxk2, (hvi)object34);
                                }
                                catch (RuntimeException runtimeException) {
                                    object36 = css.a();
                                    ((kqr)object36).b = csr.c;
                                    ((kqr)object36).d = runtimeException;
                                    object34 = hhk.J(((kqr)object36).a());
                                }
                            }
                            arrayList.add(object34);
                        }
                    }
                    case 6: {
                        object = (Void)object;
                        object = (cth)this.a;
                        long l5 = ((cth)object).s;
                        String string = ((cth)object).t;
                        object = this.c;
                        object4 = this.b;
                        return ((cwj)this.d).n((ctq)object4, (css)object, l5, string);
                    }
                    case 5: {
                        object = (Void)object;
                        object = (cth)this.a;
                        long l6 = ((cth)object).s;
                        String string = ((cth)object).t;
                        object4 = this.c;
                        object = this.b;
                        return ((cwj)this.d).n((ctq)object, (css)object4, l6, string);
                    }
                    case 4: {
                        n2 = ((czl)object).a;
                        object4 = (cwj)this.d;
                        cyu cyu2 = ((cwj)object4).i;
                        Object object38 = this.c;
                        object = (cth)this.a;
                        object38 = (ctf)object38;
                        cwj.A(cyu2, (cth)object, (ctf)object38, n2);
                        cyr.e("%s: File couldn't be shared after download %s, filegroup %s", "FileGroupManager", ((ctf)object38).c, ((cth)object).d);
                        long l7 = ((cth)object).l;
                        return ((cwj)object4).r((cth)object, (ctf)object38, (ctt)this.b, l7);
                    }
                    case 3: {
                        object = (Void)object;
                        Object object39 = this.d;
                        object = (cwj)object39;
                        object4 = ((cwj)object).c.i((ctq)this.a);
                        Object object40 = this.c;
                        return ((cwj)object).q((hpn)object4, new cwd(object39, (ctq)this.b, (cth)object40, 7));
                    }
                    case 2: {
                        object = (Void)object;
                        object4 = this.b;
                        Object object41 = this.c;
                        Object object42 = this.a;
                        object = (cwj)this.d;
                        object42 = (cth)object42;
                        object41 = (ctf)object41;
                        object4 = (ctt)object4;
                        return dah.e(((cwj)object).l((cth)object42, (ctf)object41, (ctt)object4)).g(new cvq((cwj)object, (cth)object42, (ctf)object41, (ctt)object4, 11), (Executor)hom.a);
                    }
                    case 1: {
                        object = (Void)object;
                        object = (csg)hhk.S((Future)this.b);
                        Object object43 = this.c;
                        if (!((csu)object43).g.g()) return hhk.K(object);
                        try {
                            ((csv)((csu)object43).g.c()).a((csg)object);
                        }
                        catch (Exception exception) {
                            cyr.o(exception, "%s: Listener onComplete failed for group %s", "MobileDataDownload", ((csg)object).c);
                        }
                        object4 = (cuq)this.a;
                        if (!((cuq)object4).e.g()) return hhk.K(object);
                        object43 = this.d;
                        ((daa)((cuq)object4).e.c()).i((String)object43);
                        return hhk.K(object);
                    }
                    case 0: {
                        Object object44;
                        Object object45 = (ctv)object;
                        object = this.a;
                        if (object45 != null && ((ctv)object45).e) {
                            object4 = this.b;
                            object44 = ((dmt)object).a;
                            object45 = ((ctv)object45).g;
                            object4.add(crh.e((Context)object44, (String)object45));
                        }
                        object44 = this.d;
                        Object object46 = this.c;
                        dmt dmt2 = (dmt)object;
                        object45 = dmt2.d;
                        object4 = (egg)object45;
                        return fxf.aj(fxf.ak(((egg)object4).f.e((ctt)object46), new cww(object45, object46, 9, null), (Executor)((egg)object4).a), new cvp(object, object44, object46, 0), (Executor)dmt2.c);
                    }
                }
                Object object47 = this.d;
                Object object48 = this.a;
                object4 = (dua)this.c;
                hph hph2 = hph.q(dvv.b((dua)object4).a());
                object48 = (dvt)object48;
                return hno.g(hph.q(hno.f(hph2, new cym(((dvt)object48).a, 18), ((dua)object4).d())), new fbl((String)object47, (dvt)object48, (dua)object4, (dwn)object, 1), ((dua)object4).d());
            }
            while (n3 < ((cyb)object).d.l.size()) {
                n2 = n3 + 1;
                if (!fxf.V(((cti)((cyb)object).d.l.get((int)n3)).e, ((cyb)object).f.e)) {
                    n3 = n2;
                    continue;
                }
                break block68;
            }
            n2 = 0;
        }
        ((cyu)object4).g((hlq)object2, 4, l3, l2, (String)object3, n2);
        return hpj.a;
    }
}

