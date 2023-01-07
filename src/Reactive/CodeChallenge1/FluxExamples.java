package Reactive.CodeChallenge1;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class FluxExamples {

    public static Flux<String> emptyFlux(){
        return Flux.empty();
    }

    public static Flux<String> fooBarFluxFromValues(){
        return Flux.just("foo","bar");
    }
    public static Flux<String> fooBarFluxFromList(){
        List<String> list = Arrays.asList("foo","bar");
        return Flux.fromIterable(list);
    }
    public static Flux<String> errorFlux(){
        return Flux.error(new IllegalStateException());
    }
    public static Flux<Long> counter(){
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }
}
