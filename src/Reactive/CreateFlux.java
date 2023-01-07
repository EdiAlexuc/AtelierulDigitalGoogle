package Reactive;

import reactor.core.publisher.Flux;

public class CreateFlux {
    public static Flux emptyFlux(){
        return Flux.empty();
    }

    public static Flux fooBarFromValue(){
        return Flux.just("foo", "bar");
    }

    public static void main(String[] args) {
        System.out.println(emptyFlux());
        System.out.println(fooBarFromValue().map(value -> value + " some").count());
    }
}
