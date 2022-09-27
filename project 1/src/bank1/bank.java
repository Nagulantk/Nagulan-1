package bank1;

import java.util.*;
public class bank {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no of customers:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        ArrayList<Customer> customer = new ArrayList<>();
        ArrayList<Giftcard> giftcard = new ArrayList<>();
        ArrayList<Transaction> transaction = new ArrayList<>();

        int i, customernumber, balance;
        for (i = 0; i < n; i++) {
            System.out.println("Enter customer number:");
            customernumber = input.nextInt();
            System.out.println("Enter custmoer balance");

            balance = input.nextInt();
            Customer s = new Customer(customernumber, balance);
            customer.add(s);
        }
        int k, x, y, z = 1, pin, q = 0, t = 1;
        boolean m = true;
        boolean o = true;
        while (m) {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("1.Account summary");
            System.out.println("2.create gift card");
            System.out.println("3.Topup gift card summary");
            System.out.println("4.to do transactions");
            System.out.println("5.open or close gift card");
            System.out.println("6.block gift card");
            System.out.println("7.Exit");
            k = input.nextInt();
            switch (k) {
                case 1:
                    for (Customer j : customer) {
                        System.out.println("Customer id: " + j.customernumber + " Balance:" + j.balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter customer id");
                    x = input.nextInt();
                    if (x <= n) {
                        System.out.println("Enter giftcard amount");
                        y = input.nextInt();
                        for (Customer j : customer) {
                            if (x == j.customernumber) {
                                if (y <= j.balance) {
                                    j.balance = j.balance - y;
                                    o = true;
                                } else {
                                    System.out.println("Insufficient balance");
                                    o = false;
                                }
                            }
                        }
                        if (o) {
                            pin = z * 1000;
                            Giftcard s = new Giftcard(x, z, y, pin);
                            z++;
                            giftcard.add(s);
                            bank.getgiftcard(giftcard);
                        }
                    } else {
                        System.out.println("Invalid customer number");
                    }
                    break;
                case 3:
                    System.out.println("Enter the card no");
                    x = input.nextInt();
                    if (x < z) {
                        System.out.println("Enter pin");
                        y = input.nextInt();
                        for (Giftcard j : giftcard) {

                            if (x == j.cardnumber) {
                                if (j.status == "Active") {
                                    if (y == j.pin) {
                                        System.out.println("Enter top up amount");
                                        x = input.nextInt();
                                        for (Customer h : customer) {
                                            if (j.customernumber == h.customernumber) {
                                                if (x <= h.balance) {
                                                    j.giftcardamount = j.giftcardamount + x;
                                                    h.balance = h.balance - x;
                                                    o = true;
                                                } else {
                                                    System.out.println("Insufficient balance");
                                                    o = false;
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Pin is invalid");
                                        o = false;
                                    }
                                } else {
                                    System.out.println("Sorry ,the card is " + j.status);
                                }
                            }
                        }
                        if (o) {
                            bank.getgiftcard(giftcard);
                        }
                    } else {
                        System.out.println("Invalid card number");
                    }
                    break;

                case 4:
                    System.out.println("Enter card number");
                    x = input.nextInt();
                    if (x < z) {
                        System.out.println("Enter pin");
                        y = input.nextInt();
                        for (Giftcard j : giftcard) {

                            if (j.cardnumber == x) {
                                if (j.status == "Active") {
                                    if (j.pin == y) {
                                        System.out.println("Enter the amount purchased");
                                        q = input.nextInt();
                                        if (q <= j.giftcardamount) {
                                            j.giftcardamount = j.giftcardamount - q;
                                            if (q >= 500) {
                                                j.rewardpoints = j.rewardpoints + (q / 500)*10;
                                                if(j.rewardpoints>=100&&j.rewardpoints<300)
                                                {
                                                    j.level="Silver";
                                                }
                                                else if(j.rewardpoints>=300&&j.rewardpoints<800)
                                                {
                                                    j.level="Gold";
                                                }
                                                else if(j.rewardpoints>=800)
                                                {
                                                    j.level="Platinum";
                                                }
                                            }
                                            o = true;
                                        } else {
                                            System.out.println("Insufficient balance");
                                            o = false;
                                        }
                                    } else {
                                        System.out.println("Invalid pin");
                                        o = false;
                                    }
                                } else {
                                    System.out.println("Sorry, the card is " + j.status);
                                    o = false;
                                }
                            }
                        }
                        if (o) {
                            Transaction s = new Transaction(t, x, q);
                            t++;
                            transaction.add(s);
                            for (Transaction j : transaction) {
                                System.out.println("Transaction Number:" + j.transactionnumber + " Card number:" + j.cardnumber + " Purchased amount:" + j.transactionamount);
                            }
                            System.out.println("-----------------------------------------------------------------------------------");
                            bank.getgiftcard(giftcard);
                        }
                    } else {
                        System.out.println("Invalid card number");
                    }
                    break;
                case 5:
                    System.out.println("Enter the card number to be close or open ");
                    x = input.nextInt();
                    if (x < z) {
                        System.out.println("Enter pin");
                        y = input.nextInt();
                        for (Giftcard j : giftcard) {
                            if (j.cardnumber == x) {
                                if (j.pin == y) {
                                    if (j.status == "Active") {
                                        j.status = "Closed";
                                        for (Customer w : customer) {
                                            if (j.customernumber == w.customernumber) {
                                                w.balance = w.balance + j.giftcardamount;
                                                j.giftcardamount = 0;
                                                o = true;
                                            }
                                        }
                                    } else if (j.status == "Closed") {
                                        j.status = "Active";
                                        o = true;
                                    } else {
                                        o = false;
                                    }
                                } else {
                                    System.out.println("Invalid pin");
                                    o = false;
                                }
                            }
                        }
                        if (o) {
                            bank.getgiftcard(giftcard);
                        }
                    } else {
                        System.out.println("Invalid card number");
                    }

                    break;
                case 6:
                    System.out.println("Enter the card number to be opened or blocked");
                    x = input.nextInt();
                    if (x < z) {
                        System.out.println("Enter the pin:");
                        y = input.nextInt();
                        for (Giftcard j : giftcard) {
                            if (j.cardnumber == x) {
                                if (j.pin == y) {
                                    if (j.status == "Blocked") {
                                        j.status = "Active";
                                    } else {
                                        j.status = "Blocked";
                                    }
                                } else {
                                    System.out.println("Invalid pin");
                                    break;
                                }
                                bank.getgiftcard(giftcard);
                            }
                        }
                    } else {
                        System.out.println("Invalid card number");
                    }
                    break;
                case 7:
                    m = false;
                    System.out.println("Thankyou!!!");
                    break;

            }


        }

    }

    public static void getgiftcard(ArrayList<Giftcard> a) {
        for (Giftcard w : a) {
            System.out.println("Customer number:" + w.customernumber + " Cardnumber:" + w.cardnumber + " GiftcardBalance:" + w.giftcardamount + " Status:" + w.status + " Reward points:" + w.rewardpoints+" Level:"+w.level);
        }
    }
}
class Customer{
    int customernumber;
    int balance;
    public Customer(int n,int a)
    {
        customernumber=n;
        balance=a;
    }

}
class Giftcard{
    int customernumber;
    int cardnumber;
    int giftcardamount;
    int pin;
    String status="Active";
    int rewardpoints=0;
    String level="Bronze";
     public Giftcard(int a,int b,int c,int d)
     {
         customernumber=a;
         cardnumber=b;
         giftcardamount=c;
         pin=d;
     }
}
class Transaction
{
    int transactionnumber;
    int cardnumber;
    int transactionamount;
    public Transaction(int a,int b,int c)
    {
        transactionnumber=a;
        cardnumber=b;
        transactionamount=c;
    }
}
