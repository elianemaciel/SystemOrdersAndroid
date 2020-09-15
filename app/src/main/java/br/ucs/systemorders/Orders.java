package br.ucs.systemorders;

import java.io.Serializable;

public class Orders implements Serializable {
    private int id;
    private int num_order;
    private int table;

    public Orders() {
    }

    public Orders(int id, int num_order, int table) {
        this.id = id;
        this.num_order = num_order;
        this.table = table;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumOrder() {
        return num_order;
    }
    public void setNumOrder(int num_order) {
        this.num_order = num_order;
    }
    public int getTable() {
        return table;
    }
    public void setTable(int table) {
        this.table = table;
    }
};