package a0814.streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TransferQueue;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan =  new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 700),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950));
        System.out.println(transactions);


        // 2011년 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬
        practice1(transactions);
        // 거래자가 근무하는 모든 도시를 중복없이 나열
        practice2(transactions);
        // Combridge에서 근무하는 모든 거래자를 찾아 이름순으로 정렬
        practice3(transactions);
        //문제4. //밀라노엔 거래자가 있는지 유무
        practice4(transactions);
         //문제5 .//케임브리지 거주하는 모든 트랜잭션값 출력
        practice5(transactions);
        //6. 모든 거래자의 이름을 알파벳 순으로 정렬
        practice6(transactions);
        practice7(transactions);//최대값 구하기
        practice8(transactions);//최소값 구하기
    }


    //8.최소값 구하기
    
    private static void practice8(List<Transaction> transactions) {
       Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));
        System.out.println(result);
        System.out.println(result.get().getValue());    
        System.out.println();
        System.out.println();
        System.out.println();
    }
    //7.최대값 구하기()
    private static void practice7(List<Transaction> transactions) {
        Transaction result = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue))
            .orElse(null); 
            //값이 없으면 null 있으면 객체반환 (min인 max 는 null값 처리)
            System.out.println(result);
            System.out.println();
            System.out.println();
            System.out.println();
    }
    //6.
    private static void practice6(List<Transaction> transactions) {
        List<String> result = transactions.stream()
        .map(tran -> tran.getTrader().getCity())
        .distinct()
        .sorted()
        .toList();
        System.out.println(result);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
            .toList();
        System.out.println(result);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void practice4(List<Transaction> transactions) {
        boolean result = transactions.stream()
        .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity()));
        System.out.println(result);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
        .map(Transaction::getTrader)
        .filter(trader ->("Cambidge").equals(trader.getCity()))
        .distinct()
        .sorted(Comparator.comparing(Trader::getName)).toList();
        System.out.println(result);
        System.out.println();
        System.out.println();
        System.out.println();
    }
        

    private static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
        .map((tran) -> tran.getTrader().getCity())
        .distinct()
        .toList();
        System.out.println();
        System.out.println();
        System.out.println();
    }


    
    

    private static void practice1(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
        .filter(transaction -> 2011 == transaction.getYear())
        .sorted(Comparator.comparing(Transaction::getValue))
        // .sorted(Comparator.comparing(t -> t.getValue()))
        .toList();
        System.out.println(result);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
