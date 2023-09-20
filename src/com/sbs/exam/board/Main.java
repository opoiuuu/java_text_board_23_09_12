package com.sbs.exam.board;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("== 자바 텍스트 게시판 ==");
        System.out.println("== 프로그램 시작 ==");
        System.out.print("명령)");
        String cmd = sc.nextLine();
        System.out.println("입력된 명령어 : "+ cmd);

        sc.close();

        System.out.println("== 프로그램 종료 ==");

    }
}