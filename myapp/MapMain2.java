package myapp;

import java.util.LinkedList;
import java.util.Map;
import java.util.*;

public class MapMain2 {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wilma");
        names.add("betty");

        Map<String, BankAccount> accts = new HashMap<>();

        for (String n: names) {
            BankAccount acct = new BankAccount(n);
            accts.put(acct.getAccountId(), acct);
        }

        Set<String> keys = accts.keySet();
        Collection<BankAccount> values = accts.values();

        BankAccount acct;
        for(String acctId: keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s, name = %s\n", acctId, acct.getName());
            
        }

/* 
        //instantiate

        BankAccount fred = new BankAccount("fred");
        BankAccount barney = new BankAccount("barney");
        BankAccount wilma = new BankAccount("wilma");
        BankAccount betty = new BankAccount("betty");
        
        
        // crete a simple map

        Map<String, BankAccount> accts = new HashMap<>();
        accts.put(fred.getAccountId(), fred);
        accts.put(barney.getAccountId(),barney);
        accts.put(wilma.getAccountId(),wilma);
        accts.put(betty.getAccountId(),betty);

        System.out.printf("size: %d\n", accts.size());
        System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountId()));
        System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

       
        
        */

       


    }
    
}
