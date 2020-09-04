package com.mycompany.b.functionalinterface.intro;

import java.util.ArrayList;

public class MyList<T> extends ArrayList<T> {
    private static final long serialVersionUID = 1L;

    public void performActionOnEach(Action<T> action){
        for (T element : this){
            action.performAction(element);
        }
    }

    public <V> MyList<V> applyTransformationOnEach(Transformation<T, V> transformation){
        MyList<V> myList = new MyList<V>();

        for (T element : this){
            myList.add(transformation.performTransformation(element));
        }
        return myList;
    }
}
