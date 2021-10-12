package co.skr;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question3 {

	public static void main(String[] args) {
		/**
		 * function<param1, param2>
		 * @params1 - input type
		 * @params2 - return type
		 */
		Function<Integer, Double> interface1 = y -> y / 2.0;
        System.out.println(interface1.apply(76));
        
        /**
         * Suppliers are useful when we don’t need to supply any value 
         * and obtain a result at the same time.
		 * @params1 - input type
         */
        Supplier<Double> interface2 = () -> Math.random();
        System.out.println(interface2.get());
        
        /**
         * Predicate is useful as can take value without return type
		 * @params1 - input type
		 * test(T t) : Evaluates this predicate on the given 
		 * argument.boolean test(T t)
         */
        Predicate<Integer> lesserThan = i -> (i < 25); 
        System.out.println(lesserThan.test(6));
        
        /**
         * The lambda expression assigned to an object of Consumer 
         * type is used to define its accept() which eventually applies 
         * the given operation on its argument.
         * Consumers are useful when it not needed to return any
         * value as they are expected to operate via side-effects. 
         */
        Consumer<Integer> display = x -> System.out.println(x);
        display.accept(45);
	}

}
