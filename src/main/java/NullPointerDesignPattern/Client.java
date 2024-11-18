package NullPointerDesignPattern;

public class Client {

    //Null invention is a mistake quoted by the inventor of null
//    in this design pattern we replace the conditions with polymorphism
//    ex:- if(cat==null)  with if(obj is indtanceOf cat)
//    We can use this in ListIterator deign pattern where if the object is not iterable then it should return
//    NullIterator object rather then returning "null"

//    We can use this design paattern with congetion with Command or Composite Design Pattern


//    The first time I heard of this pattern, I dismissed it immediately as dumb. Then I took the time to examine it and it literally changed my life. It is now my favorite pattern. The simplicity is genius and it makes your code some much better and cleaner.
//
//
//    I recently implemented (within the last year or so) a small framework where I received models from an XML file as (JAXB) objects. I replaced nulls with Null Objects to avoid situations such as the wrong name or ID is pass and a valid model could not be found. So instead, my framework simply returns a null object and the system would not break because my null object obviously respects the interface.
//
//    Fast forward to about a month ago. I needed to integrate this framework to interact with a legacy system that doesn't generate these models. I was able to seamlessly do it because, now my null object is used to represent the "model" of the legacy system. In order words, the legacy system has NO MODEL; which is precisely what the null object represents.  This is why this changed my life. That decision around 12 months ago to put this concept in practice,  even though I "didn't needed it" saved me weeks or perhaps months of additional implementation. I was able to integrate this legacy system in a couple of days.
}
