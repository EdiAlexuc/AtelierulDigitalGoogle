package Reactive.CodeChallenge2;

import reactor.core.publisher.Mono;

public class MonoExamples {

    public static Mono<String> emptyMono(){
       return Mono.empty();
    }

    public static Mono<String> monoWithNoSignal(){
        return Mono.never();
    }

    public static Mono<String> fooMono(){
        return Mono.just("foo");
    }

    public static Mono<String> errorMono(){
        return Mono.error(new IllegalStateException());
    }

}
