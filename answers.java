Scanner scanner = new Scanner(System.in);


	//Targil 4:
        int x = 5;
        int y = (20 + 12);
        float e = 7.5f;

     //Targil 5:
     int a = 5;
     int b = 6;
     int sum = a + b;
     int multiphy = (a * b);


     //Targil 6:
     String color = "Red";

     //Targil 7:
     System.out.println("Please Enter your name: ");
      String name = scanner.nextLine();
      System.out.println("Hello" + " " + name + "  " + "wellcome to Java! ");


      //Targil 8 :
     int year = 2020;
      year += 10;
      year -= 30;


      //Targil 9:
        int a1 = 3;
        int b1 = 4;
        int c1 = 2;
        int sum1 = a1 + b1 + c1;
        int memutza = (sum1 / 3);


        //Targil 10:
        System.out.println("Please Enter a number for speed: ");
        int speed = scanner.nextInt();
        if (speed > 120) {
            System.out.println(" too fast");
        }
        else if (speed < 80) {
            System.out.println("too slow");
        }
        else {
            System.out.println("good driver");
        }


        //Targil 11 :
        System.out.println("Please Enter a number for Tommer_Age:  ");
        int Tommer_Age = scanner.nextInt();
        System.out.println("Please Enter a number for Danny_Age:  ");
        int Danny_Age = scanner.nextInt();
        if (Tommer_Age > Danny_Age) {
            System.out.println("Tommer is older");
        }
        else {
            System.out.println("Danny is older");
        }


        //Targil 12:
        System.out.println("Please Enter a number for number_1 : ");
        int number_1 = scanner.nextInt();
        System.out.println("Please Enter a number for number_2: ");
        int number_2 = scanner.nextInt();
        if (number_1 == number_2) {
            System.out.println("equal");
        }
        else if (number_1 > number_2) {
            System.out.println(number_2);
        }
        else   {
            System.out.println(number_1);
        }


        //Targil 13 :
        System.out.println("Please Enter a number for number_3 : ");
        int number_3 = scanner.nextInt();
        System.out.println("Please Enter a number for number_4: ");
        int number_4 = scanner.nextInt();
        System.out.println("Please Enter a number for number_5: ");
        int number_5 = scanner.nextInt();
        if (number_3 > number_4 && number_4 > number_5) {
            System.out.println(number_4);
        }
        else if (number_4 > number_3 && number_3 > number_5)   {
            System.out.println(number_3);
        }
        else   {
            System.out.println(number_5);
        }
