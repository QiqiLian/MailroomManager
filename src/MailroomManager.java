//Qiqi Lian
//113187306
//Recitation 4
import java.util.*;

public class MailroomManager {
    private static int daysCount = 0;
    public static void main (String[]args) {

        PackageStack stack1 = new PackageStack();
        PackageStack stack2 = new PackageStack();
        PackageStack stack3 = new PackageStack();
        PackageStack stack4 = new PackageStack();
        PackageStack stack5 = new PackageStack();
        PackageStack floor = new PackageStack();
        ArrayList<PackageStack> packageStacks = new ArrayList<>();
        packageStacks.add(floor);


        Scanner stdin = new Scanner(System.in);
        System.out.println();
        System.out.println("\n" + "Welcome to the Irving Mailroom Manager. You can try to make it better, but the odds are stacked against you. It is day 0.\n" +
                "\n" +
                "\n" +
                "Menu:\n" +
                "\n" +
                "     D) Deliver a package\n" +
                "\n" +
                "     G) Get someone's package\n" +
                "\n" +
                "     T) Make it tomorrow\n" +
                "\n" +
                "     P) Print the stacks\n" +
                "\n" +
                "     M) Move a package from one stack to another\n" +
                "\n" +
                "     F) Find packages in the wrong stack and move to floor\n" +
                "\n" +
                "     L) List all packages awaiting a user\n" +
                "\n" +
                "     E) Empty the floor.\n" +
                "\n" +
                "     Q) Quit");


        char a;

        do {
            System.out.println();
            System.out.println("Select an option: ");
            a = stdin.next().charAt(0);
            char userInput = Character.toUpperCase(a);

            switch (userInput) {

                case 'T':
                    ++ daysCount;
                    System.out.println("It is now day " + daysCount);


                    PackageStack tempStac = new PackageStack();
                    Package tempPac ;

                    while (!stack1.isEmpty()) {
                        tempPac = stack1.pop();
                        if (daysCount - tempPac.getArrivalDate() < 5) {
                            try {
                                tempStac.push(tempPac);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                    while (!(tempStac.isEmpty())) {
                        try {
                            stack1.push(tempStac.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }

                    }

                    while (!stack2.isEmpty()) {
                        tempPac = stack2.pop();
                        if (daysCount - tempPac.getArrivalDate() < 5) {
                            try {
                                tempStac.push(tempPac);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    while (!(tempStac.isEmpty())) {
                        try {
                            stack2.push(tempStac.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }

                    }

                    while (!stack3.isEmpty()) {
                        tempPac = stack3.pop();
                        if (daysCount - tempPac.getArrivalDate() < 5) {
                            try {
                                tempStac.push(tempPac);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    while (!(tempStac.isEmpty())) {
                        try {
                            stack3.push(tempStac.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }

                    }

                    while (!stack4.isEmpty()) {
                        tempPac = stack4.pop();
                        if (daysCount - tempPac.getArrivalDate() < 5) {
                            try {
                                tempStac.push(tempPac);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    while (!(tempStac.isEmpty())) {
                        try {
                            stack4.push(tempStac.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }

                    }

                    while (!stack5.isEmpty()) {
                        tempPac = stack5.pop();
                        if (daysCount - tempPac.getArrivalDate() < 5) {
                            try {
                                tempStac.push(tempPac);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }


                    while (!(tempStac.isEmpty())) {
                        try {
                            stack5.push(tempStac.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }


                    }
                    while (!floor.isEmpty()) {
                        tempPac = floor.pop();
                        if (daysCount - tempPac.getArrivalDate() < 5) {
                            try {
                                tempStac.push(tempPac);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }


                    while (!(tempStac.isEmpty())) {
                        try {
                            floor.push(tempStac.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }


                    }

                    break;

                case 'D':
                    System.out.println("Please enter the recipient's name: ");
                    String b = stdin.next().toUpperCase();

                    System.out.println("Please enter the weight: ");
                    double c = stdin.nextDouble();
                    Package packages = new Package(b, c, daysCount);
                    System.out.println("A " + c + " pound package is awaiting pickup by " + b);

                    if (b.charAt(0) >= 65 && b.charAt(0) <= 71) {
                        if (stack1.getCount() < 7 ){
                            try {
                                stack1.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack1.getCount() >= 7){
                            try {
                                System.out.println("Stack 1 is full, pushed to Stack 2");
                                stack2.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack2.getCount() >= 7){
                            try {
                                System.out.println("Stack 2 is full, pushed to Stack 3");
                                stack3.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack3.getCount() >= 7){
                            try {
                                System.out.println("Stack 3 is full, pushed to Stack 4");
                                stack4.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack4.getCount() >= 7){
                            try {
                                System.out.println("Stack 4 is full, pushed to Stack 5");
                                stack5.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                    else if (b.charAt(0) >= 72 && b.charAt(0) <= 74) {
                        if (stack2.getCount() < 7){
                            try {

                                stack2.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack2.getCount() >= 7){
                            try {
                                System.out.println("Stack 2 is full, pushed to Stack 1");
                                stack1.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack3.getCount() >= 7){
                            try {
                                System.out.println("Stack 3 is full, pushed to Stack 4");
                                stack4.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack4.getCount() >= 7){
                            try {
                                System.out.println("Stack 4 is full, pushed to Stack 5");
                                stack5.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack5.getCount() >= 7){
                            try {
                                System.out.println("Stack 5 is full, pushed to Stack 1");
                                stack1.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                    else if (b.charAt(0) >= 75 && b.charAt(0) <= 77) {
                        if (stack3.getCount() < 7) {
                            try {
                                stack2.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack3.getCount() >= 7){
                            try {
                                System.out.println("Stack 3 is full, pushed to Stack 2");
                                stack4.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack4.getCount() >= 7){
                            try {
                                System.out.println("Stack 4 is full, pushed to Stack 5");
                                stack5.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack5.getCount() >= 7){
                            try {
                                System.out.println("Stack 5 is full, pushed to Stack 1");
                                stack1.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack1.getCount() >= 7){
                            try {
                                System.out.println("Stack 1 is full, pushed to Stack 2");
                                stack2.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                    else if (b.charAt(0) >= 78 && b.charAt(0) <= 82) {
                        if (stack4.getCount() < 7) {
                            try {
                                stack3.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack4.getCount() >= 7){
                            try {
                                System.out.println("Stack 4 is full, pushed to Stack 3");
                                stack5.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack5.getCount() >= 7){
                            try {
                                System.out.println("Stack 5 is full, pushed to Stack 1");
                                stack1.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack1.getCount() >= 7){
                            try {
                                System.out.println("Stack 1 is full, pushed to Stack 2");
                                stack2.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack2.getCount() >= 7){
                            try {
                                System.out.println("Stack 2 is full, pushed to Stack 3");
                                stack3.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    else if (b.charAt(0) >= 83 && b.charAt(0) <= 90) {
                        if (stack5.getCount() < 7){
                            try {
                                stack4.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack5.getCount() >= 7){
                            try {
                                System.out.println("Stack 5 is full, pushed to Stack 1");
                                stack1.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack1.getCount() >= 7){
                            try {
                                System.out.println("Stack 1 is full, pushed to Stack 2");
                                stack2.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack2.getCount() >= 7){
                            try {
                                System.out.println("Stack 2 is full, pushed to Stack 3");
                                stack3.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        else if (stack3.getCount() >= 7){
                            try {
                                System.out.println("Stack 3 is full, pushed to Stack 4");
                                stack4.push(packages);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }


                    break;

                case 'G':
                    System.out.println("Please enter the recipient's name: ");
                    String d = stdin.next().toUpperCase();
                    int counter = 0;

                    if (d.charAt(0) >= 65 && d.charAt(0) <= 71) {

                        while (!(stack1.isEmpty())) {
                            if (!(stack1.peek().getRecipient().equalsIgnoreCase(d))) {
                                try {
                                    floor.push(stack1.pop());
                                } catch (FullStackException e) {
                                    e.printStackTrace();

                                }


                            } else {
                                break;
                            }

                            counter++;
                        }
                        System.out.println("Moved " +  counter + " amount of packages from Stack 1 to floor");
                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");
                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);
                        Package temp =  stack1.pop();
                        System.out.println();
                        System.out.println("Give " + temp.getRecipient() + " a  " + temp.getWeight() +" pound package, delivered on day "+ temp.getArrivalDate() );
                        System.out.println();

                        System.out.println("Returned " + counter +" from Floor to Stack 1");
                        while (counter > 0) {
                            counter--;
                            try {
                                stack1.push(floor.pop());
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");
                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);

                    }

                     else if (d.charAt(0) >= 72 && d.charAt(0) <= 74) {

                        while (!(stack2.isEmpty())) {
                            if (!(stack2.peek().getRecipient().equalsIgnoreCase(d))) {
                                try {
                                    floor.push(stack2.pop());
                                } catch (FullStackException e) {
                                    e.printStackTrace();

                                }

                            } else {
                                break;
                            }

                            counter++;
                        }
                        System.out.println("Moved " +  counter + " amount of packages from Stack 2 to floor");
                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");

                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);
                        Package temp =  stack2.pop();
                        System.out.println();
                        System.out.println("Give " + temp.getRecipient() + " a  " + temp.getWeight() +" pound package, delivered on day "+ temp.getArrivalDate() );
                        System.out.println();

                        System.out.println("Returned " + counter +" from Floor to Stack 2");
                        while (counter > 0) {
                            counter--;
                            try {
                                stack2.push(floor.pop());
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");
                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);

                    }

                     else if (d.charAt(0) >= 75 && d.charAt(0) <= 77) {

                        while (!(stack3.isEmpty())) {
                            if (!(stack3.peek().getRecipient().equalsIgnoreCase(d))) {
                                try {
                                    floor.push(stack3.pop());
                                } catch (FullStackException e) {
                                    e.printStackTrace();

                                }


                            } else {
                                break;
                            }

                            counter++;
                        }
                        System.out.println("Moved " +  counter + " amount of packages from Stack 3 to floor");
                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");

                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);
                        Package temp =  stack3.pop();
                        System.out.println();
                        System.out.println("Give " + temp.getRecipient() + " a  " + temp.getWeight() +" pound package, delivered on day "+ temp.getArrivalDate() );
                        System.out.println();

                        System.out.println("Returned " + counter +" from Floor to Stack 3");
                        while (counter > 0) {
                            counter--;
                            try {
                                stack3.push(floor.pop());
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");
                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);

                    }

                    else if (d.charAt(0) >= 78 && d.charAt(0) <= 82) {

                        while (!(stack4.isEmpty())) {
                            if (!(stack4.peek().getRecipient().equalsIgnoreCase(d))) {
                                try {
                                    floor.push(stack4.pop());
                                } catch (FullStackException e) {
                                    e.printStackTrace();

                                }


                            } else {
                                break;
                            }

                            counter++;
                        }
                        System.out.println("Moved " +  counter + " amount of packages from Stack 4 to floor");
                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");

                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);
                        Package temp =  stack4.pop();
                        System.out.println();
                        System.out.println("Give " + temp.getRecipient() + " a  " + temp.getWeight() +" pound package, delivered on day "+ temp.getArrivalDate() );
                        System.out.println();

                        System.out.println("Returned " + counter +" from Floor to Stack 4");
                        while (counter > 0) {
                            counter--;
                            try {
                                stack4.push(floor.pop());
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");
                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);

                    }

                     else if (d.charAt(0) >= 83 && d.charAt(0) <= 90) {

                        while (!(stack5.isEmpty())) {
                            if (!(stack5.peek().getRecipient().equalsIgnoreCase(d))) {
                                try {
                                    floor.push(stack5.pop());
                                } catch (FullStackException e) {
                                    e.printStackTrace();

                                }


                            } else {
                                break;
                            }

                            counter++;
                        }
                        System.out.println("Moved " +  counter + " amount of packages from Stack 5 to floor");
                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");

                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);
                        Package temp =  stack5.pop();
                        System.out.println();
                        System.out.println("Give " + temp.getRecipient() + " a  " + temp.getWeight() +" pound package, delivered on day "+ temp.getArrivalDate());
                        System.out.println();

                        System.out.println("Returned " + counter +" from Floor to Stack 5");
                        while (counter > 0) {
                            counter--;
                            try {
                                stack5.push(floor.pop());
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println();
                        System.out.println("Current Packages:\n" +
                                "--------------------------------");
                        System.out.println("Stack 1 (A-G): " + stack1);
                        System.out.println("Stack 2 (H-J): " + stack2);
                        System.out.println("Stack 3 (K-M): " + stack3);
                        System.out.println("Stack 4 (N-R): " + stack4);
                        System.out.println("Stack 5 (S-Z): " + stack5);
                        System.out.println("Floor: " + floor);

                    }

                    break;


                case 'P':
                    System.out.println("Stack 1 (A-G): " + stack1);
                    System.out.println("Stack 2 (H-J): " + stack2);
                    System.out.println("Stack 3 (K-M): " + stack3);
                    System.out.println("Stack 4 (N-R): " + stack4);
                    System.out.println("Stack 5 (S-Z): " + stack5);
                    System.out.println("Floor: " + floor);

                    break;

                case 'M':

                    PackageStack temp = new PackageStack();
                    PackageStack temp2 = new PackageStack();

                    System.out.println("Please enter the source stack (enter 0 for Floor): ");
                    int x = stdin.nextInt();
                    if (x == 1) {
                        temp = stack1;
                    }
                    if (x == 2) {
                        temp = stack2;
                    }
                    if (x == 3) {
                        temp = stack3;
                    }
                    if (x == 4) {
                        temp = stack4;
                    }
                    if (x == 5) {
                        temp = stack5;
                    }
                    if (x == 0) {
                        temp = floor;
                    }

                    System.out.println("Please enter the destination stack: ");
                    int y = stdin.nextInt();
                    if (y == 1) {
                        temp2 = stack1;

                    }
                    if (y == 2) {
                        temp2 = stack2;

                    }
                    if (y == 3) {
                        temp2 = stack3;

                    }
                    if (y == 4) {
                        temp2 = stack4;

                    }
                    if (y == 5) {
                        temp2 = stack5;

                    }
                    if (y == 0) {
                        temp2 = floor;
                    }


                    try {
                        temp2.push(temp.pop());
                    } catch (FullStackException e) {
                        e.printStackTrace();
                    }

                    break;

                case 'F':
                    PackageStack tempStack = new PackageStack();
                    Package tempPack;
                    int counts = 0;

                    while (!stack1.isEmpty()) {
                        tempPack = stack1.pop();
                        if (tempPack.getRecipient().charAt(0) >= 65 & tempPack.getRecipient().charAt(0) <= 71) {
                            try {
                                tempStack.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        } else {

                            try {
                                floor.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    while (!(tempStack.isEmpty())) {
                        try {
                            stack1.push(tempStack.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }

                    while (!stack2.isEmpty()) {
                        tempPack = stack2.pop();
                        if (tempPack.getRecipient().charAt(0) >= 72 & tempPack.getRecipient().charAt(0) <= 74) {
                            try {
                                tempStack.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }

                        } else {
                            try {
                                floor.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                    while (!(tempStack.isEmpty())) {
                        try {
                            stack2.push(tempStack.pop());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    while (!stack3.isEmpty()) {
                        tempPack = stack3.pop();
                        if (tempPack.getRecipient().charAt(0) >= 75 & tempPack.getRecipient().charAt(0) <= 77) {
                            try {
                                tempStack.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }

                        } else {
                            try {
                                floor.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                    while (!(tempStack.isEmpty())) {
                        try {
                            stack3.push(tempStack.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }
                    while (!stack4.isEmpty()) {
                        tempPack = stack4.pop();
                        if (tempPack.getRecipient().charAt(0) >= 78 & tempPack.getRecipient().charAt(0) <= 82) {
                            try {
                                tempStack.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }

                        } else {
                            try {
                                floor.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }


                    }
                    while (!(tempStack.isEmpty())) {
                        try {
                            stack4.push(tempStack.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }

                    while (!stack5.isEmpty()) {
                        tempPack = stack5.pop();
                        if (tempPack.getRecipient().charAt(0) >= 83 & tempPack.getRecipient().charAt(0) <= 90) {
                            try {
                                tempStack.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }

                        } else {
                            try {
                                floor.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                    while (!(tempStack.isEmpty())) {
                        try {
                            stack5.push(tempStack.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }

                    break;

                case 'L':
                    PackageStack tempPlace = new PackageStack();
                    PackageStack counting = new PackageStack();

                    int counters = 0;
                    System.out.println("Please enter the recipients name ");
                    String f = stdin.next().toUpperCase();
                    while (!stack1.isEmpty()) {
                            tempPack = stack1.pop();
                            if (tempPack.getRecipient().equals(f)) {
                                try {
                                    counting.push(tempPack);
                                } catch (FullStackException e) {
                                    e.printStackTrace();
                                }
                            }
                        try {
                            tempPlace.push(tempPack);
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }
                        while (!(tempPlace.isEmpty())) {
                            try {
                                stack1.push(tempPlace.pop());
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }


                    while (!stack2.isEmpty()) {
                        tempPack = stack2.pop();
                        if (tempPack.getRecipient().equals(f)) {
                            try {
                                counting.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            tempPlace.push(tempPack);
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }
                    while (!(tempPlace.isEmpty())) {
                        try {
                            stack2.push(tempPlace.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }


                    while (!stack3.isEmpty()) {
                        tempPack = stack3.pop();
                        if (tempPack.getRecipient().equals(f)) {
                            try {
                                counting.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            tempPlace.push(tempPack);
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }
                    while (!(tempPlace.isEmpty())) {
                        try {
                            stack3.push(tempPlace.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }

                    }
                    while (!stack4.isEmpty()) {
                        tempPack = stack4.pop();
                        if (tempPack.getRecipient().equals(f)) {
                            try {
                                counting.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            tempPlace.push(tempPack);
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }
                    while (!(tempPlace.isEmpty())) {
                        try {
                            stack4.push(tempPlace.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }

                    }
                    while (!stack5.isEmpty()) {
                        tempPack = stack5.pop();
                        if (tempPack.getRecipient().equals(f)) {
                            try {
                                counting.push(tempPack);
                            } catch (FullStackException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            tempPlace.push(tempPack);
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }
                    while (!(tempPlace.isEmpty())) {
                        try {
                            stack5.push(tempPlace.pop());
                        } catch (FullStackException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(f + " has " + counting.getCount() + " packages, it was delivered "  );
                    while (!counting.isEmpty()) {

                        System.out.println(counting.pop().toString());
                    }

                    break;

                case 'E':
                    if (floor.isEmpty()){
                        System.out.println("Its already empty");
                    }
                    while(!(floor.isEmpty())){
                        floor.pop();
                    }

                    break;

            }


        }
        while (a != 'Q');
        System.out.println("Use Amazon Locker next time");

    }


}
