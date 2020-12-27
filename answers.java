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


       //   Targil 14 :
        System.out.println("Please Enter a number for number_6: ");
           int number_6 = scanner.nextInt();
          System.out.println("Please Enter a number for number_7: ");
           int number_7 = scanner.nextInt();
           if (number_6 != number_7) { 
               if (number_6 < number_7) {
                  System.out.println(String.format("%d , %d", number_6, number_7));
              } else {
                  System.out.println(String.format("%d, %d", number_7, number_6));
               }
          }
          else    {
             System.out.println("Equal numbers");
          }


        //Targil 15:
        
          for (int index = 0; index <= 10; index ++ )
         {
            System.out.println(index);
          }


        //Targil 16:
           for (int index1 = 1; index1 <= 50; index1 += 2 )
          {
             System.out.println(index1);
          }


        // Targil 17:

         Random r = new Random();
           int random_number;
           do {
                random_number = r.nextInt(20) + 10;
             System.out.println(random_number);
          }
          while (random_number != 15);
         }


        //Targil 18:
          System.out.println("Please enter a number");
          int number = scanner.nextInt();
          switch (number) {
             case 1:
                 System.out.println("One");
                 break;
            case 2:
                System.out.println("Two");
               break;
            case 3:
                System.out.println("Three");
                break;
           default:
               System.out.println("unknown number");
         }


        //Targil 19 :
         int count = 0;
          while (true)   {
               System.out.println("guess a number");
           int number_1 =scanner.nextInt();
              if (number_1 == 0)   {
                 break;
             }
        count += number_1;
          }
         System.out.println(count);


        //Targil 20:
         System.out.println("Please Enter a  number with 3 digits ");
          int number_3digit = scanner.nextInt();
          int meot = number_3digit/100;
          System.out.println(String.format("%d" , meot));


        //Targil 21 :
         System.out.println("Enter a number for grades ");
         int grade = scanner.nextInt();
         int count = 0;
         int sum = 0;
         while (grade != 1) {
             sum += grade;
             count++;
             grade = scanner.nextInt();
         }
         System.out.println(String.format("%f" , (float) sum/count));





        //Targil 22:
       System.out.println("Please Enter a number: ");
        int number;
         number = scanner.nextInt();
        int index = 0;
        int sum = 1;
       for(index =1; index <= number; index++)
       {
           sum*= index;
       }
       System.out.println(sum);



        //Targil 23:
        System.out.println("Please Enter a number: ");
        int number = scanner.nextInt();
        int max = scanner.nextInt();
        while (number > 0)   {
            if (max < number)   {
                max = number;
            }
            number = scanner.nextInt();
             }
        System.out.println(max);



        //Targil 24:
        System.out.println("Please Enter a number: ");
        int number = scanner.nextInt();
        for (int index = 0; index <= number; index++)
            System.out.print("-");


        


        //Targil 25 :
        float temperature;
      do {
            System.out.println("Please Enter your temperature");
            temperature = scanner.nextFloat();
            if (temperature == -1) {
                System.out.println(String.format("%f > %d", temperature , 37));
                break;
            } 
            else if (temperature <= 37) { // ok ? yes. sababa! more? or ... ok bye bye :) keep on practicing!
                System.out.println("wellcome");
            } 
            else {
                System.out.println("sorry, you cannot enter");
           }
           }
        while (temperature != -1);





