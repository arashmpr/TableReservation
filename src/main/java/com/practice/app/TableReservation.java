package com.practice.app;

import java.util.Scanner;

public class TableReservation {

    private boolean isRunning;
    private Scanner scanner;

    public TableReservation() {
        this.isRunning = true;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Welcome to TableReservation application!");
        System.out.println();

        while(isRunning) {
            String cmd = scanner.nextLine();

            if (cmd.equals("EXIT")) {
                isRunning = false;
            }
            else {
                CommandHandler commandHandler = new CommandHandler(cmd);
                commandHandler.handleCommand();
            }
        }
    }
}
