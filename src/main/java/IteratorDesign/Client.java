package IteratorDesign;

public class Client {

    // Iterating items of  a collections
    //  Collection is a common framwork used in all the applications
    // Using Iterater design pattern u can iterate elements of a collection without exposing the
    // underlying representation.

    // Iterator design pattern encapsulates the current position, nuber of elements, data structure used ,etc,,

    // there should be a common interface that all iterators should implement, So all iterator shares a common interface

    // give one - one item at a time --> Lazy evalution

    // Benefits of Iterator design pattern: - 1)java uses iterator dp so u can take advantage of it and apply in ur complex collections
    //2)does not return whole collection (Lazy evalution).    3)can be used for infinite collection
    //3) can pause in between

    //in java all iterators works direcly on data structure rather than giving a copy
    //in java for-each internally uses iterator. But we can only iterate we cannot modify and also they are fail-fast.
    //if ur class implement iterator u can use it in for-each

    //Defination: -Iterator DP provides a way to access the element of an aggregate object sequentially without
    //expoxing its underlying reperesentation



}
