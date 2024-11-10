package StrategyPattern;

public class Sorter {

    private SortingStrategy strategy;

    public Sorter(SortingStrategy strategy){
        this.strategy =  strategy;
    }

    public void setStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(int[] arr){
        strategy.sort(arr);
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
