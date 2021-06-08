package com.yhz.datastruct.staticlist;

public class StaticListNode<T> {
    private T value;
    private Integer cur;

    public StaticListNode(T value) {
        this.value = value;
    }

    public StaticListNode(T value, Integer cur) {
        this.value = value;
        this.cur = cur;
    }

    public StaticListNode() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Integer getCur() {
        return cur;
    }

    public void setCur(Integer cur) {
        this.cur = cur;
    }


}
