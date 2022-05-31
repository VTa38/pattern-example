package com.VTa38.behavioral.Visitor;

public interface Visitor {
    void visit (Bread bread);
    void visit (Cake cake);
    void visit (Meat meat);
} //  Позволяет проще совершать определённые операции над группами объектов
