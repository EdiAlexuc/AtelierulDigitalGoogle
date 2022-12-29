package Generics.CodeChallenge1;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class ExchangeDesk {
    private List<Rate> rates = new ArrayList<Rate>();
    public<F extends Currency, T extends Currency>T exchange(F from, Class<T> to) throws ReflectiveOperationException {
        T newCurrency = null;

        float currentValue = from.getValue();

        Constructor<T>[] constructors = (Constructor<T>[]) to.getDeclaredConstructors();
        newCurrency = constructors[0].newInstance(currentValue / findRate(from.getClass(),to));
        return newCurrency;
    }

    public<F extends Currency, T extends Currency> void addRate(Class<F> from, Class<T> to, float rate){
        rates.add((new Rate(from, to, rate)));
    }

    private float findRate(Class from, Class to){
        for(Rate rate: rates){
            if(rate.getFrom().equals(from) && rate.getTo().equals(to))
                return rate.getRateValue();
        }
        return 1;
    }
}
