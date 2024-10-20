/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Log
 *  android.widget.ImageView
 *  android.widget.Switch
 *  android.widget.TextView
 */
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

public final class afq
implements Handler.Callback {
    public final Object a;
    private final int b;

    public /* synthetic */ afq(afu afu2, int n2) {
        this.b = n2;
        this.a = afu2;
    }

    public afq(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean handleMessage(Message object) {
        int n2 = this.b;
        boolean bl2 = false;
        if (n2 != 0) {
            Object object2 = null;
            if (n2 != 1) {
                n2 = ((Message)object).what;
                if (n2 != 0) {
                    if (n2 != 1) {
                        return bl2;
                    }
                    HashMap hashMap = ((cfo)this.a).c;
                    // MONITORENTER : hashMap
                    cfn cfn2 = (cfn)((Message)object).obj;
                    cfp cfp2 = (cfp)((cfo)this.a).c.get(cfn2);
                    if (cfp2 != null && cfp2.b == 3) {
                        object = String.valueOf(cfn2);
                        CharSequence charSequence = new StringBuilder("Timeout waiting for ServiceConnection callback ");
                        charSequence.append((String)object);
                        charSequence = charSequence.toString();
                        object = new Exception();
                        Log.e((String)"GmsClientSupervisor", (String)charSequence, (Throwable)object);
                        object = cfp2.f;
                        if (object == null) {
                            object = object2;
                        }
                        object2 = object;
                        if (object == null) {
                            object2 = new ComponentName(cfn2.c, "unknown");
                        }
                        cfp2.onServiceDisconnected((ComponentName)object2);
                    }
                    // MONITOREXIT : hashMap
                    return true;
                } else {
                    object2 = ((cfo)this.a).c;
                    // MONITORENTER : object2
                    cfn cfn3 = (cfn)((Message)object).obj;
                    object = (cfp)((cfo)this.a).c.get(cfn3);
                    if (object != null && ((cfp)object).b()) {
                        if (((cfp)object).c) {
                            ((cfp)object).g.e.removeMessages(1, (Object)((cfp)object).e);
                            cgr.a(((cfp)object).g.d, (ServiceConnection)object);
                            ((cfp)object).c = false;
                            ((cfp)object).b = 2;
                        }
                        ((cfo)this.a).c.remove(cfn3);
                    }
                    // MONITOREXIT : object2
                }
                return true;
            }
            object = (ol)((Message)object).obj;
            if (((ol)object).e == null) {
                ((ol)object).e = ((ol)object).a.inflate(((ol)object).d, ((ol)object).c, false);
            }
            object2 = ((ol)object).f;
            Object object3 = this.a;
            Object object4 = ((ol)object).g;
            object2 = ((ol)object).e;
            n2 = ((ol)object).d;
            Object object5 = ((ol)object).c;
            object5 = ((bmm)object4).a;
            object4 = ((bmm)object4).b;
            object5 = (bmn)object5;
            ((bmn)object5).d = object2;
            ((bmn)object5).e = bnv.i(((bmn)object5).d, 2131427522);
            ((bmn)object5).f = (ImageView)bnv.i(((bmn)object5).d, 2131427521);
            ((bmn)object5).g = (Switch)bnv.i(((bmn)object5).d, 2131427523);
            ((bmn)object5).h = (TextView)bnv.i(((bmn)object5).d, 2131427524);
            ((bmn)object5).i = (TextView)bnv.i(((bmn)object5).d, 2131427525);
            ((bmn)object5).j = ((bmn)object5).d.getContext().getResources().getBoolean(2131034131);
            ((bmn)object5).a();
            ag$$ExternalSyntheticApiModelOutline1.m((Consumer)object4, (Object)((bmn)object5).d);
            ((ol)object).g = null;
            ((ol)object).a = null;
            ((ol)object).b = null;
            ((ol)object).c = null;
            ((ol)object).d = 0;
            ((ol)object).e = null;
            ((ol)object).f = null;
            ((uo)((om)((ayn)object3).c).c).b(object);
            return true;
        }
        object = (afu)this.a;
        Iterator iterator = ((afu)object).d.iterator();
        do {
            if (!iterator.hasNext()) return true;
            aft aft2 = (aft)iterator.next();
            afs afs2 = ((afu)object).c;
            if (aft2.d || !aft2.c) continue;
            ads ads2 = aft2.b.a();
            aft2.b = new adr();
            aft2.c = false;
            afs2.a(aft2.a, ads2);
        } while (!((afu)object).b.b());
        return true;
    }
}

