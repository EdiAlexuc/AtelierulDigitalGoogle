package Reactive.CodeChallenge4;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserExamples {

    static Mono<User> capitalizeOne(Mono<User> mono) {
        return mono.map(user -> new User(
                user.getFirstName().toUpperCase(),
                user.getLastName().toUpperCase(),
                user.getUsername().toUpperCase()));
    }

    static Flux<User> capitalizeMany(Flux<User> flux) {
        return flux.map(user -> new User(
                user.getFirstName().toUpperCase(),
                user.getLastName().toUpperCase(),
                user.getUsername().toUpperCase()));
    }

    static Flux<User> asyncCapitalizeMany(Flux<User> flux) {
        return flux.flatMap(UserExamples::asyncCapitalizeUser);
    }

    static Mono<User> asyncCapitalizeUser(User u) {
        return Mono.just(new User(
                u.getFirstName().toUpperCase(),
                u.getLastName().toUpperCase(),
                u.getUsername().toUpperCase()));
    }


}
