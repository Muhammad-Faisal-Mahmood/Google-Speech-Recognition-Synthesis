/*
 * Decompiled with CFR 0.152.
 */
public abstract class jqq
extends jqm {
    public jqq(jqb jqb2) {
        super(jqb2);
        if (jqb2 != null && jqb2.d() != jqg.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override
    public final jqf d() {
        return jqg.a;
    }
}

