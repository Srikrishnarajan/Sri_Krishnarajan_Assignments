package co.skr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;

public class Question4to7 {

	public static void main(String[] args) {
		News news1 = new News(1, "Vijay", "Surya", "comment");
        News news2 = new News(2, "Ajith", "Soori", "budget");
        News news3 = new News(1, "Karthi", "Vadivelu", "comment");
        News news4 = new News(3, "Kamal", "Surya", "budget");
        News news5 = new News(1, "Rajini", "Vadivelu", "comment");
        News news6 = new News(3, "Dhanush", "Surya", "budget");
        News news7 = new News(1, "Rahman", "Vivek", "comment");

        List<News> news = new ArrayList<>();
        
        news.add(news1);
        news.add(news2);
        news.add(news3);
        news.add(news4);
        news.add(news5);
        news.add(news6);
        news.add(news7);
        
        maxComments(news);
        budgetCount(news);
        maxCommentsByUser(news);
        System.out.println(sortMaxCommentsByUser(news));
	}

	public static int maxComments(List<News> news) {
        List<News>news1 = news;
        List<News> list = new ArrayList<>();
        int max = 0;
        
        list = news.stream().filter(news2 -> news1.stream().anyMatch(one -> one.getNewsId() == news2.getNewsId() && one != news2))
        		.collect(Collectors.toCollection(ArrayList::new));
        
        Map<Integer,Integer>map = new HashMap<>();
        
        for(News news2: list){
               if(map.containsKey(news2.getNewsId())){
                   map.put(news2.getNewsId(), map.get(news2.getNewsId())+1);
               }
               else{
                   map.put(news2.getNewsId(), 1);
               }
        }

        @SuppressWarnings("rawtypes")
		Set s1 = map.entrySet();
        @SuppressWarnings("rawtypes")
		Iterator itr = s1.iterator();

        int id = 0;
        
        while(itr.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(max < (int)m1.getValue()) {
                max = (int) m1.getValue();
                id = (int)m1.getKey();
            }
        }
        
        System.out.println(max);
        return id;
    }

    public static int budgetCount(List<News> news) {
        String budget="budget";
        long budgtC=news.stream()
                .filter(p->p.getComment().contains(budget)).count();
        System.out.println(budgtC);
        return (int)budgtC;
    }

    public static String maxCommentsByUser (List<News> news) {
        List<News>news1 = news;
        List<News> list = new ArrayList<>();
        
        list= news.stream()
                .filter(news2->news1.stream()
                        .anyMatch(one->one.getCommentByUser()==news2.getCommentByUser() && one!=news2)).collect(Collectors.toCollection(ArrayList::new));

        Map<String,Integer> map = new HashMap<>();
        
        for(News news2: list){
            if(map.containsKey(news2.getCommentByUser())){
                map.put(news2.getCommentByUser(), map.get(news2.getCommentByUser())+1);
            }
            else{
                map.put(news2.getCommentByUser(), 1);
            }
        }

        @SuppressWarnings("rawtypes")
		Set s1 = map.entrySet();
        @SuppressWarnings("rawtypes")
		Iterator itr = s1.iterator();

        String id="";
        int max=0;
        
        while(itr.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            
            if(max<(int)m1.getValue()) {
                max = (int) m1.getValue();
                id = (String)m1.getKey();
            }
        }
        
        System.out.println(id);
        return id;
    }

    public static Map<String, Integer> sortMaxCommentsByUser(List <News> news) {

        Map<String,Long> map1= new HashMap<>();
        map1 = news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));

        List<Map.Entry<String, Long>> list = new LinkedList<Map.Entry<String, Long>>(map1.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Long> >() {
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return -(o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        
        for (Map.Entry<String, Long> aa : list) {
            temp.put(aa.getKey(), (int) (long)aa.getValue());
        }
        
        return temp;
    }
}
