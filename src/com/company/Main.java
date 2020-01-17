package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

//        String[] roomsSplit = rooms.split("&");
//        String[] splitValues = new String[20];

//      String sampleString = "Livingroom 5 3 & BedRoom 2 4 "
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rooms in the apartment");
        //  String input = scanner.nextLine();
        String input = "Livingroom 5 3 & BedRoom 2 4 & Kitchen 5 2 ";

//// Finner antall mellomrom for å angi størrelsen på ny array for alle enkeltverdier
//        Pattern pattern = Pattern.compile(" ");
//        Matcher matcher = pattern.matcher(input);
//        int from = 0;
//        int count = 0;
//        while (matcher.find(from)) {
//            count++;
//            from = matcher.start()+1;
//        }
//        System.out.println(count);
//
//
//
//
        String[] stringArray = input.split("&");
        System.out.println(Arrays.toString(stringArray));
//
//        for (int i = 0; i <stringArray.length ; i++) {
//
//        }

        String stue = stringArray[0].trim();
        String[] livingRoom = stue.split(" ");
        System.out.println("LivingRoom: " + Arrays.toString(livingRoom));

        String soverom = stringArray[1].trim();
        String[] bedRoom = soverom.split(" ");
//        System.out.println("BedRoom: " + Arrays.toString(bedRoom));

        String kjøkken = stringArray[2].trim();
        String [] kitchen = kjøkken.split(" ");

        //Opprettelse av objekter
        Room[] room = {
            new Room (livingRoom[0], Integer.parseInt(livingRoom[1]), Integer.parseInt(livingRoom[2])),
            new Room (bedRoom[0], Integer.parseInt(bedRoom[1]), Integer.parseInt(bedRoom[2])),
            new Room (kitchen[0], Integer.parseInt(kitchen[1]), Integer.parseInt(kitchen[2]))
        };

//        System.out.println(Arrays.toString(room));
        System.out.println(room[0].printDescription());
        System.out.println(room[1]);
        System.out.println(room[2].toString());

    }
}
