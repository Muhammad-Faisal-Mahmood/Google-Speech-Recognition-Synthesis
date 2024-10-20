/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

public final class bdq
implements Runnable {
    public final WorkDatabase a;
    public final bhd b;
    public final bhd c;
    public final List d;
    public final String e;
    public final Set f;
    public final boolean g;

    public /* synthetic */ bdq(WorkDatabase workDatabase, bhd bhd2, bhd bhd3, List list, String string, Set set, boolean bl2) {
        this.a = workDatabase;
        this.b = bhd2;
        this.c = bhd3;
        this.d = list;
        this.e = string;
        this.f = set;
        this.g = bl2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        WorkDatabase workDatabase = this.a;
        jse.e(workDatabase, "$workDatabase");
        Object object = this.d;
        jse.e(object, "$schedulers");
        String string = this.e;
        jse.e(string, "$workSpecId");
        bhe bhe2 = workDatabase.z();
        bhx bhx2 = workDatabase.A();
        Object object2 = this.b;
        Object object3 = ((bhd)object2).c;
        int n2 = ((bhd)object2).l;
        long l2 = ((bhd)object2).o;
        int n3 = ((bhd)object2).t;
        int n4 = ((bhd)object2).u;
        long l3 = ((bhd)object2).v;
        int n5 = ((bhd)object2).w;
        object2 = this.c;
        object3 = bhd.e((bhd)object2, null, (bbv)((Object)object3), null, null, n2, l2, n3, n4 + 1, l3, n5, 12835837);
        if (((bhd)object2).w == 1) {
            ((bhd)object3).v = ((bhd)object2).v;
            ++((bhd)object3).w;
        }
        bhd bhd2 = AmbientMode$AmbientCallback.j((List)object, (bhd)object3);
        object = (bhw)bhe2;
        ((bhw)object).a.j();
        ((bhw)object).a.k();
        object3 = ((bhw)bhe2).c;
        object2 = ((aup)object3).d();
        ((axb)object2).g(1, bhd2.b);
        ((axb)object2).e(2, AmbientLifecycleObserverKt.e(bhd2.c));
        ((axb)object2).g(3, bhd2.d);
        ((axb)object2).g(4, bhd2.e);
        ((axb)object2).c(5, AmbientModeSupport$AmbientCallback.a(bhd2.f));
        ((axb)object2).c(6, AmbientModeSupport$AmbientCallback.a(bhd2.g));
        ((axb)object2).e(7, bhd2.h);
        ((axb)object2).e(8, bhd2.i);
        ((axb)object2).e(9, bhd2.j);
        ((axb)object2).e(10, bhd2.l);
        ((axb)object2).e(11, AmbientLifecycleObserverKt.b(bhd2.m));
        ((axb)object2).e(12, bhd2.n);
        ((axb)object2).e(13, bhd2.o);
        ((axb)object2).e(14, bhd2.p);
        ((axb)object2).e(15, bhd2.q);
        ((axb)object2).e(16, (long)bhd2.r);
        ((axb)object2).e(17, AmbientLifecycleObserverKt.d(bhd2.s));
        ((axb)object2).e(18, bhd2.t);
        ((axb)object2).e(19, bhd2.u);
        ((axb)object2).e(20, bhd2.v);
        ((axb)object2).e(21, bhd2.w);
        ((axb)object2).e(22, bhd2.x);
        Object object4 = bhd2.y;
        if (object4 == null) {
            ((axb)object2).f(23);
        } else {
            ((axb)object2).g(23, (String)object4);
        }
        object4 = bhd2.k;
        ((axb)object2).e(24, AmbientLifecycleObserverKt.c(((baq)object4).b));
        ((axb)object2).c(25, AmbientLifecycleObserverKt.l(((baq)object4).c));
        ((axb)object2).e(26, (long)((baq)object4).d);
        ((axb)object2).e(27, (long)((baq)object4).e);
        ((axb)object2).e(28, (long)((baq)object4).f);
        ((axb)object2).e(29, (long)((baq)object4).g);
        ((axb)object2).e(30, ((baq)object4).h);
        ((axb)object2).e(31, ((baq)object4).i);
        ((axb)object2).c(32, AmbientLifecycleObserverKt.m(((baq)object4).j));
        ((axb)object2).g(33, bhd2.b);
        ((axc)object2).a();
        ((aup)object3).f((axc)object2);
        ((bhw)bhe2).a.n();
        object = (bia)bhx2;
        ((bia)object).a.j();
        object2 = ((bia)object).c.d();
        ((axb)object2).g(1, string);
        ((bia)bhx2).a.k();
        {
            catch (Throwable throwable) {
                ((bia)object).c.f((axc)object2);
                throw throwable;
            }
        }
        ((axc)object2).a();
        ((bia)bhx2).a.n();
        ((bia)bhx2).a.l();
        boolean bl2 = this.g;
        object3 = this.f;
        ((bia)object).c.f((axc)object2);
        AmbientLifecycleObserverKt.n(bhx2, string, (Set)object3);
        if (bl2) return;
        bhe2.l(string, -1L);
        workDatabase.y().a(string);
        return;
        catch (Throwable throwable) {
            ((bia)bhx2).a.l();
            throw throwable;
        }
        catch (Throwable throwable) {
            ((aup)object3).f((axc)object2);
            throw throwable;
        }
        finally {
            ((bhw)object).a.l();
        }
    }
}

