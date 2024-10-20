/*
 * Decompiled with CFR 0.152.
 */
public final class acn {
    public static final acq a = new aca();
    public final ayn b;

    public acn(aco aco2) {
        jse.e(aco2, "owner");
        bzb bzb2 = aco2.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging();
        jse.e(aco2, "owner");
        ack ack2 = aco2 instanceof aav ? ((aav)((Object)aco2)).getDefaultViewModelProviderFactory() : act.a;
        this(bzb2, ack2, xm.e(aco2));
    }

    public acn(aco aco2, ack ack2) {
        this(aco2.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging(), ack2, xm.e(aco2));
    }

    public acn(bzb bzb2, ack ack2) {
        jse.e(bzb2, "store");
        this(bzb2, ack2, acp.a);
    }

    public acn(bzb object, ack ack2, acr acr2) {
        jse.e(object, "store");
        jse.e(ack2, "factory");
        jse.e(acr2, "defaultCreationExtras");
        object = new ayn((bzb)object, ack2, acr2);
        this.b = object;
    }

    public final ach a(Class clazz) {
        return this.b(jsd.e(clazz));
    }

    public final ach b(jta jta2) {
        String string = jta2.b();
        if (string != null) {
            return this.b.a(jta2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(string));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}

