package com.practice.app;

import java.util.Scanner;

public class TableReservation {
    private UserManager userManager = new UserManager();

    private boolean isRunning = true;
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome!");
        System.out.println();

        while(isRunning) {
            String cmd = scanner.nextLine();

            if (cmd.equals("EXIT")) {
                isRunning = false;
            }
            else {
                CommandHandler commandHandler = new CommandHandler(cmd, userManager);
                commandHandler.process_command();
            }
        }
    }
}
