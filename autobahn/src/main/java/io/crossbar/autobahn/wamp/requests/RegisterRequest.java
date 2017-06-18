package io.crossbar.autobahn.wamp.requests;

import java.util.concurrent.CompletableFuture;

import io.crossbar.autobahn.wamp.types.IInvocationHandler;
import io.crossbar.autobahn.wamp.types.Registration;

public class RegisterRequest extends Request {
    public final CompletableFuture<Registration> onReply;
    public final String procedure;
    public final IInvocationHandler endpoint;

    public RegisterRequest(long request, CompletableFuture<Registration> onReply, String procedure,
                           IInvocationHandler endpoint) {
        super(request);
        this.onReply = onReply;
        this.procedure = procedure;
        this.endpoint = endpoint;
    }
}
