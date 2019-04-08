package com.zayhan.graph;

import java.util.*;

public class Graph<V>{

    private Map<V, List<Node<V>>> adjList;
    private Set<V> vertices;

    public Graph(){
        this.adjList = new HashMap<>();
        this.vertices = new HashSet<>();
    }

    private static class Node<V>{
        private V name;

        private int weight;

        public V getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public int hashCode(){
            return this.name.hashCode();
        }

        @Override
        public String toString(){
            return "(" + this.weight + ")" + this.name;
        }

    }

}
