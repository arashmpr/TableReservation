package com.practice.app;

public class App 
{
    public static void main( String[] args )
    {
        Context ctx = new Context();
        TableReservation tableReservation = new TableReservation(ctx);
        tableReservation.run();
    }
}