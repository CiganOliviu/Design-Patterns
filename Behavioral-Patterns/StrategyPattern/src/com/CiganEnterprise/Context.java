package com.CiganEnterprise;

public class Context {

    private ISort sorter;

    public Context(ISort sorter) {
        this.sorter = sorter;
    }

    public void SetSorter(ISort sorter) {
        this.sorter = sorter;
    }

    void Sort(int[] numbers) {

        sorter.Sort(numbers);
    }
}
