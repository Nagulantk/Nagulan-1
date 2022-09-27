
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        LinkedList<Passengers> ticketsl=new LinkedList<>();
        LinkedList<Passengers> ticketsm=new LinkedList<>();
        LinkedList<Passengers> ticketsu=new LinkedList<>();
        LinkedList<Passengers> ractickets2=new LinkedList<>();
        LinkedList<Passengers> children=new LinkedList<>();
        LinkedList<Passengers> waitinglist=new LinkedList<>();

        int l=21,u=21,m=21,r=18,w=10,l1=0,m1=0,u1=0,r1=0,w1=0,c=1,otp;
        boolean t=true;
        while(t) {
            System.out.println("if you Want to book ticket:");
            String z = input.nextLine();
            if (z.equals("Yes")) {
                System.out.println("Enter the name of the passenger:");
                String name = input.nextLine();
                System.out.println("Enter the age of the passenger");
                int age = input.nextInt();
                input.nextLine();
                System.out.println("Enter gender:");
                String Gender = input.nextLine();
                System.out.println("Enter Berth preference:");
                otp=c+c*1000;
                c++;
                String berth = input.nextLine();
                System.err.println("Your Booking Details:");
                if (age < 5) {
                    Passengers p = new Passengers(name, age, Gender, berth,otp);
                    children.add(p);

                        System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);

                } else {
                    if ((age > 60 || (Gender.equals("Female"))) && l1 < l) {
                        berth = "Lower";
                        l1++;
                        Passengers p = new Passengers(name, age, Gender, berth,otp);
                        ticketsl.add(p);
                        System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                        continue;
                    } else if (berth.equals("Lower")) {
                        if (l1 < l) {
                            l1++;
                            Passengers p = new Passengers(name, age, Gender, berth,otp);
                            ticketsl.add(p);
                            System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                            continue;
                        } else {
                            if (m1 < m) {
                                berth = "Middle";
                                m1++;
                                Passengers p = new Passengers(name, age, Gender, berth,otp);
                                ticketsm.add(p);
                                System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                                continue;
                            } else if (u1 < u) {
                                berth = "Upper";
                                u1++;
                                Passengers p = new Passengers(name, age, Gender, berth,otp);
                                ticketsu.add(p);
                                System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                                continue;
                            }
                        }


                    } else if (berth.equals("Middle")) {
                        if (m1 < m) {
                            m1++;
                            Passengers p = new Passengers(name, age, Gender, berth,otp);
                            ticketsm.add(p);
                            System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                            continue;
                        } else {
                            if (u1 < u) {
                                berth = "Upper";
                                u1++;
                                Passengers p = new Passengers(name, age, Gender, berth,otp);
                                ticketsu.add(p);
                                System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                                continue;
                            } else if (l1 < l) {
                                berth = "Lower";
                                l1++;
                                Passengers p = new Passengers(name, age, Gender, berth,otp);
                                ticketsu.add(p);
                                System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                                continue;
                            }
                        }

                    } else if (berth.equals("Upper")) {
                        if (u1 < u) {
                            u1++;
                            Passengers p = new Passengers(name, age, Gender, berth,otp);
                            ticketsu.add(p);
                            System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);continue;
                        } else {
                            if (m1 < m) {
                                berth = "Middle";
                                m1++;
                                Passengers p = new Passengers(name, age, Gender, berth,otp);
                                ticketsm.add(p);
                                System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                                continue;
                            } else if (l1 < l) {
                                berth = "Lower";
                                l1++;
                                Passengers p = new Passengers(name, age, Gender, berth,otp);
                                ticketsl.add(p);
                                System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                                continue;
                            }
                        }

                    } else if (berth.equals("Rac") && r1 < r) {
                        r1++;
                        Passengers p = new Passengers(name, age, Gender, berth,otp);
                        ractickets2.add(p);
                        System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Your password is:"+otp);
                        continue;
                    } else {
                        if (w1 < w) {
                            w1++;
                            Passengers p = new Passengers(name, age, Gender, berth,"Waiting List",otp);
                            waitinglist.add(p);
                            System.err.println("Name:"+p.name+" Age:"+p.age+" Gender:"+p.gender+" Berth:"+p.berthpreference+" Status:"+p.status+" Your password is:"+otp);
                            continue;
                        } else {
                            System.out.println("Tickets Not available");
                            t = false;
                        }

                    }
                }
            } else {
                System.out.println("If you want to cancel the tickets:");
                String x = input.nextLine();
                if (x.equals("Yes")) {
                    System.out.println("Enter the name of the passenger:");
                    String name = input.nextLine();
                    System.out.println("Enter the age of the passenger");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter gender:");
                    String Gender = input.nextLine();
                    System.out.println("Enter Berth preference:");
                    String berth = input.nextLine();
                    System.out.println("Enter password:");
                    int q=input.nextInt();
                    int g;
                    if (age < 5) {
                         g=0;
                        for (Passengers h : children) {
                            if ((h.name).equals(name)&&h.age==age&&(h.gender).equals(Gender)&&h.password==q) {
                                children.remove(g);
                            }
                            g++;
                        }
                    } else {

                        System.out.println("If you are in waiting list:");
                  input.nextLine();
                        String i = input.nextLine();

                       if (i.equals("No")) {
                           System.out.println("If you have booked rac ticket:");
                            String y = input.nextLine();
                            if (y.equals("No")) {
                                if (berth.equals("Lower")) {
                                     g=0;
                                    for (Passengers h : ticketsl) {
                                        if ((h.name).equals(name)&&h.age==age&&(h.gender).equals(Gender)&&h.password==q){
                                           ticketsl.remove(g);
                                            l1--;
                                        }
                                        g++;
                                    }

                                }
                                if (berth.equals("Upper")) {
                                     g=0;
                                    for (Passengers h : ticketsu) {
                                        if ((h.name).equals(name)&&h.age==age&&(h.gender).equals(Gender)&&h.password==q) {
                                            ticketsu.remove(g);
                                            u1--;
                                        }
                                        g++;
                                    }

                                }
                                if (berth.equals("Middle")) { g=0;
                                    for (Passengers h : ticketsm) {
                                        if ((h.name).equals(name)&&h.age==age&&(h.gender).equals(Gender)&&h.password==q) {
                                           ticketsm.remove(g);
                                            m1--;
                                        }
                                        g++;
                                    }

                                }
                            } else { g=0;
                               for (Passengers h : ractickets2) {
                                    if ((h.name).equals(name)&&h.age==age&&(h.gender).equals(Gender)&&h.password==q) {
                                      ractickets2.remove(g);
                                       r1--;
                                    }
                                    g++;
                               }
//
                            }
                       } else { g=0;
                           for (Passengers h : waitinglist) {
                               if ((h.name).equals(name)&&h.age==age&&(h.gender).equals(Gender)&&h.password==q) {
                                    waitinglist.remove(g);
                                    w1--;
                                }
                               g++;
                            }
                        }
                    }
                    System.err.println("Your ticket is cancelled:");
                } else {
                    t = false;
                }

            System.err.println("Your ticket is cancelled:");
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.println();
        }
        System.err.println("Total passenger details:");
        for(Passengers h:ticketsl){
        System.err.println("Name:"+h.name+" Age:"+h.age+" Gender:"+h.gender+" Berth:"+h.berthpreference);}
        for(Passengers h:ticketsu){
            System.err.println("Name:"+h.name+" Age:"+h.age+" Gender"+h.gender+" Berth:"+h.berthpreference);}

        for(Passengers h:ticketsm){
            System.err.println("Name:"+h.name+" Age:"+h.age+" Gender"+h.gender+" Berth:"+h.berthpreference);}

        for(Passengers h:children){
            System.err.println("Name:"+h.name+" Age:"+h.age+" Gender"+h.gender+" Berth:"+h.berthpreference);}

        for(Passengers h:ractickets2){
            System.err.println("Name:"+h.name+" Age:"+h.age+" Gender"+h.gender+" Berth:"+h.berthpreference);}

        for(Passengers h:waitinglist){
            System.err.println("Name:"+h.name+" Age:"+h.age+" Gender"+h.gender+" Berth:"+h.berthpreference);}
        System.err.println("Total Lower Berth Tickets Filled:"+l1);
        System.err.println("Total Upper Berth Tickets Filled:"+u1);
        System.err.println("Total Middle Berth Tickets Filled:"+u1);
        System.err.println("Total Rac Tickets Filled:"+r1);
        System.err.println("Total Lower Berth Tickets Remaining:"+(l-l1));
        System.err.println("Total Upper Berth Tickets Remaining:"+(u-u1));
        System.err.println("Total Middle Berth Tickets Remaining:"+(m-m1));
        System.err.println("Total Rac Berth Tickets Remaining:"+(r-r1));
        System.err.println("Waiting List Count:"+w1);



    }
}
 class  Passengers {
    String name;
    int age;
    String gender;
    String berthpreference;
    String status;
    int password;

    public Passengers(String n, int a, String b, String s,int p) {
        name = n;
        age = a;
        gender = b;
        berthpreference = s;
        password=p;
    }
     public Passengers(String n, int a, String b, String s,String v,int p) {
         name = n;
         age = a;
         gender = b;
         berthpreference = s;
         status=v;
         password=p;
     }


}
