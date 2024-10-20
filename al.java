/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

public final class al
extends jsf
implements jqz {
    final Object a;
    final Object b;
    final Object c;
    private final int d;

    public al(an an2, Object object, ViewGroup viewGroup, int n2) {
        this.d = n2;
        this.b = an2;
        this.a = object;
        this.c = viewGroup;
        super(0);
    }

    public al(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.b = object;
        this.c = object2;
        this.a = object3;
        super(0);
    }

    public al(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.a = object;
        this.c = object2;
        this.b = object3;
        super(0);
    }

    public al(Object object, Object object2, Object object3, int n2, char[] cArray) {
        this.d = n2;
        this.c = object;
        this.a = object2;
        this.b = object3;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object a() {
        int n2 = this.d;
        Object object = null;
        Object object2 = null;
        switch (n2) {
            default: {
                object2 = ((kfx)this.c).b;
                jse.b(object2);
                object = ((kfs)this.b).i;
                return ((kks)object2).a(((kgj)this.a).a(), ((kgm)object).c);
            }
            case 6: {
                object = crh.R((efs)this.c);
                object2 = (dzi)this.b.a().c();
                ewg ewg2 = (ewg)this.a;
                evq evq2 = ewg2.a((String)object);
                int n3 = ewj.d(ewg2.g);
                byte[] byArray = new byte[n3];
                n2 = 0;
                while (true) {
                    try {
                        object = object2.a(byArray, n2, 0, n3);
                    }
                    catch (Throwable throwable) {
                        object = jns.aj(throwable);
                    }
                    if (joe.a(object) != null) {
                        ((heg)ewg.a.h().h(hfo.a, "ALT.SessionAudioStore").j("com/google/android/libraries/search/audio/store/session/SessionAudioStore", "storeAudio", 172, "SessionAudioStore.kt")).s("#audio# cannot read session(%s) next audio data", ewg2.h);
                        evq2.a();
                        return jon.a;
                    }
                    int n4 = ((Number)object).intValue();
                    if (n4 < 0) break;
                    if (n4 <= 0) continue;
                    n2 += n4;
                    if (evq2.c(hvu.s(byArray, 0, n4)).isCancelled()) break;
                }
                evq2.a();
                return jon.a;
            }
            case 5: {
                eoq eoq2 = (eoq)this.a;
                eae eae2 = eoq2.e;
                n2 = eae2.b;
                if ((n2 & 0x400) != 0) {
                    object = this.c;
                    object2 = eoq2.b;
                    return ((dml)object).l((eip)object2, eae2);
                }
                object = object2;
                if ((n2 & 0x200) == 0) return object;
                object = this.b;
                object2 = eoq2.b;
                return ((dml)object).m((eip)object2, eae2);
            }
            case 4: {
                Object object3 = (eoi)this.a;
                object2 = ((eoi)object3).f;
                n2 = ((eae)object2).b;
                if ((n2 & 0x400) != 0) {
                    object = this.c;
                    object3 = ((eoi)object3).b;
                    return ((dml)object).l((eip)object3, (eae)object2);
                }
                if ((n2 & 0x200) == 0) return object;
                object = this.b;
                object3 = ((eoi)object3).b;
                return ((dml)object).m((eip)object3, (eae)object2);
            }
            case 3: {
                object2 = this.a;
                object = this.c;
                object2 = new al(this.b, object, object2, 2);
                Object object4 = ((bdn)object).d.z();
                object = object4.e((String)this.a);
                if (object.size() > 1) throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                if ((object = (bhb)jns.l((List)object)) == null) {
                    object2.a();
                    return jon.a;
                }
                Object object5 = object4.b(((bhb)object).a);
                if (object5 == null) {
                    object2 = new StringBuilder("WorkSpec with ");
                    ((StringBuilder)object2).append(((bhb)object).a);
                    ((StringBuilder)object2).append(", that matches a name \"");
                    ((StringBuilder)object2).append((String)this.a);
                    ((StringBuilder)object2).append("\", wasn't found");
                    throw new IllegalStateException(((StringBuilder)object2).toString());
                }
                if (!((bhd)object5).d()) throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                if (((bhb)object).b == bbv.f) {
                    object4.f(((bhb)object).a);
                    object2.a();
                    return jon.a;
                }
                object2 = this.b;
                object = ((bhb)object).a;
                object = bhd.e((bhd)((bmu)object2).b, (String)object, null, null, null, 0, 0L, 0, 0, 0L, 0, 0xFFFFFE);
                Object object6 = ((bdn)this.c).f;
                jse.d(object6, "processor");
                WorkDatabase workDatabase = ((bdn)this.c).d;
                jse.d(workDatabase, "workDatabase");
                object5 = ((bdn)this.c).c;
                jse.d(object5, "configuration");
                List list = ((bdn)this.c).e;
                jse.d(list, "schedulers");
                object4 = this.b;
                String string = ((bhd)object).b;
                object2 = workDatabase.z().b(string);
                if (object2 == null) throw new IllegalArgumentException(a.aj(string, "Worker with ", " doesn't exist"));
                if (((bhd)object2).c.a()) return jon.a;
                if (((bhd)object2).d() ^ ((bhd)object).d()) {
                    object4 = wl.h;
                    object5 = new StringBuilder("Can't update ");
                    ((StringBuilder)object5).append((String)object4.a(object2));
                    ((StringBuilder)object5).append(" Worker to ");
                    ((StringBuilder)object5).append((String)object4.a(object));
                    ((StringBuilder)object5).append(" Worker. Update operation must preserve worker's type.");
                    throw new UnsupportedOperationException(((StringBuilder)object5).toString());
                }
                boolean bl2 = ((bcn)object6).c(string);
                if (!bl2) {
                    object6 = list.iterator();
                    while (object6.hasNext()) {
                        ((bcp)object6.next()).b(string);
                    }
                }
                workDatabase.m(new bdq(workDatabase, (bhd)object2, (bhd)object, list, string, (Set)((bmu)object4).a, bl2));
                if (bl2) return jon.a;
                bcr.a((bam)object5, workDatabase, list);
                return jon.a;
            }
            case 2: {
                object = this.c;
                Object object7 = this.a;
                object2 = jns.d(this.b);
                object7 = (String)object7;
                bib.a(new bcz((bdn)object, (String)object7, 2, (List)object2));
                return jon.a;
            }
            case 1: {
                object = this.a;
                object2 = this.c;
                ((an)this.b).d.f((ViewGroup)object2, object);
                return jon.a;
            }
            case 0: 
        }
        object = ((an)this.b).a;
        if (!object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (((ao)object.next()).a.f) continue;
                object2 = new tu();
                object = (an)this.b;
                Object object8 = ((ao)((an)object).a.get((int)0)).a.c;
                object8 = this.a;
                ak ak2 = new ak(this.b, 2);
                ((an)object).d.r(object8, (tu)object2, ak2);
                ((tu)object2).a();
                return jon.a;
            }
        }
        an an2 = (an)this.b;
        object2 = an2.g;
        jse.b(object2);
        object = new aj(this.b, this.c, 4, null);
        an2.d.u(object2, (Runnable)object);
        return jon.a;
    }
}

