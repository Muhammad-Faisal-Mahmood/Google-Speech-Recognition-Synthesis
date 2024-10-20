/*
 * Decompiled with CFR 0.152.
 */
import j$.util.stream.Stream;
import java.util.function.Function;

public final class hjp
extends hjq {
    public final Stream a;

    public hjp(Stream stream, Function function, Function function2, Stream stream2) {
        this.a = stream2;
        super(stream, function, function2);
    }

    @Override
    public final Stream a() {
        return this.a;
    }
}

