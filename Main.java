package com.pilipinasairlink;

import com.pilipinasairlink.ui.ConsoleUI;

/**
 * ============================================================
 *  PILIPINAS AIRLINK DATA SOLUTION
 *  Inventory Management System
 *
 *  Built with: Pure Java SE (JDK 17+)
 *  No external libraries or database required.
 *
 *  Compile:
 *    javac -d out -sourcepath src src/com/pilipinasairlink/Main.java
 *
 *  Run:
 *    java -cp out com.pilipinasairlink.Main
 * ============================================================
 */
public class Main {
    public static void main(String[] args) {
        new ConsoleUI().start();
    }
}
