package co.skr;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Question8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 29, 30, 10, 17, 21, 29, 14);

        Consumer<List<Integer>> printList = li -> li.stream().forEach(e -> System.out.print(e+" "));

        Thread thread = new Thread(() -> printList.accept(list));
        thread.start();
	}

}
