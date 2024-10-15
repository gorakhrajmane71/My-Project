import java.util.*; 
class LaxmiChitFund
{
    static String username; 
    static Long mobile ; 
    static String pan ;
    static Long adhar ;
    static String address;
    static int pin ; 
    static double bal ;
    final static Long accountnumber = 1234123412234L;
    final static String ifscCode = "LCF1234" ;
    static ArrayList<String> Statement = new ArrayList<>();

    public static void main (String[] args)
    {
        welcome();
    }
    public static void welcome()
    {
        for ( ; ; )
        {
            Scanner sc = new Scanner (System.in);
            System.out.println();
            System.out.println("***** Welcome*******");
            System.out.println("******* LAXMI CHIT FUND *****");
            System.out.println();
            System.out.println("1. Exsisting User ");
            System.out.println("2. Create Bank Account ");
            System.out.println();
            System.out.print("Enter an option : ");
            int opt = sc.nextInt();
            switch(opt)
            {
                case 1: login(sc);break;
                case 2: createAccount (sc) ;break;
                default : System.out.println("Wrong Option Entered");
            }
        }
    }

    public static void login (Scanner sc)
    {
        if(username!=null)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println();
                System.out.println("   *****LOGIN MODULE*****   " );
                System.out.println();
                System.out.print("Mobile: ");
                Long mobile1 = sc.nextLong();
                System.out.print("pin : ");
                int pin1 = sc.nextInt();
                if((mobile==mobile1)||(pin==pin1))
                    {
                        homePage(sc);
                    }
                else{
                    System.out. println();
                    System.out.println("Wrong credentials Entered");
                    System.out. println();
                }
            }
            System.exit(0);
        
        }else {
            System.out.println();
            System.out.println ("Create Your Account First ");
            System.out.println();
        }
    }
    public static void createAccount (Scanner sc)
    {
            System.out.println();
            System.out.println("  ******* Account Creation Module ******* ");
            System.out.println();
            System.out.print("Username : "); 
            sc.nextLine();
            username=sc.nextLine();
            System.out. print("Mobile : ");
            mobile = sc.nextLong();
            System.out.print("Adhar : ");
            adhar = sc. nextLong();
            System.out.print("Pancard: ");
            pan = sc.next();
            System.out.print("Address : ");
            sc. nextLine();
            address=sc.nextLine();
            System.out.print("Pin : ");
            pin=sc.nextInt();
            System.out.print("Enter the amount to deposit : ");
            bal = sc.nextDouble();
            Statement.add("Deposit: "+ bal);

            System.out. println();
            System.out.println("Account Created Successfully ");
            System.out.println();
    }
    public static void homePage(Scanner sc)
    {
        for (; ; )
        {
            System.out.println();
            System.out.println("*** HOME PAGE MODULE ***");
            System.out.println();
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Statement");
            System.out.println("5. Edit Profile");
            System.out.println("6. Logout");
            System.out.println();
            System.out. print("Enter an option : ");
            int option= sc.nextInt();
            System.out.println();
            switch (option)
            {
                case 2: withdraw(sc);break;
                case 3: chekBalance(sc);break;
                case 4: statement();break;
                case 5: editProfile(sc);break;
                case 6: System. exit (0);
                default:System.out.println("wrong option entered");
                case 1: deposit(sc); break;
            }
        }
    }
public static void deposit (Scanner sc)
{
    System.out.println(" *****DEPOSIT AMOUNT***** ");
    System.out.println();
    System.out.print("Enter the amount : "); 
    double depositAmount = sc.nextDouble();
    bal += depositAmount;
    Statement.add("Deposit: "+ depositAmount);
    System. out.println();
    System. out. println ("Amount Deposited Successfully ");
}

public static void withdraw(Scanner sc)
{
    for (int i=1;i<=3 ;i++)
    {
        System.out.println("**** Widthdraw Amount ****");
        System.out.println();
        System.out.print("Enter the amount : ");
        double withdrawAmount = sc.nextDouble();
        System.out.print ("Enter your pin: ");
        int pin1 = sc.nextInt();
        if(pin==pin1)
        {
            if(withdrawAmount<=bal)
            {
                bal-=withdrawAmount;
                Statement.add("withdraw : "+ withdrawAmount);
                System.out.println("Amount debited Successfully");
            }
            else{
                System.out.println("Insufficients funds");
            }
            return;
        }
        else{
            System.out.println();
            System.out.println("Wrong Pin Entered");
        }
    }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
}

public static void chekBalance(Scanner sc)
{
        for (int i=1;i<=3 ;i++)
        {
            System.out.println(" **** CHECK BALANCE ****");
            System.out.print("Enter your pin : "); 
            int pin1 = sc.nextInt();
            if(pin==pin1)
            {
            System.out.println();
            System.out.println("Account Balance is : "+bal+"rs");
            return;
            }
            else{
                System.out.println();
                System.out.println("Wrong Pin Entered");
            }
        }
        System.out.println();
        System.out.println("Your account has been deactivated for 24 hours");
        System.exit(0);
    }
    public static void statement()
    {
        System.out.println("** Statement ** ");
        System.out.println();
        for (String tran: Statement)
        {
            System. out.println(tran);
        }
    }

public static void editProfile(Scanner sc)
{
System.out.println("*****Edit Profile***** ");
System.out.println(("****what do are you changes***** "));
System.out.println();
System.out.println("1.Edit Username");
System.out.println("2.Edit Address");
System.out.println("3.Edit Mobile number");
System.out.println("4.Edit pin");
System.out.println();
System.out. print("Enter an option : ");
int option= sc.nextInt();
switch (option)
 {
    case 1:System.err.println("Enter your pin");
            int pin1=sc.nextInt();
    {
        if(pin==pin1)
        {
            System.out.print("Enter your new usrename : ");
            sc.nextLine();
            username=sc.nextLine();
            System.out.println("Succefully changes your username");
        }
        else
            System.out.println("Wrong pin Enterd");
        
    }
    break;
    case 2:System.err.println("Enter your pin");
             pin1=sc.nextInt();
            {
                if(pin==pin1)
                {
                    System.out.print("Enter your new Address : ");
                    sc.nextLine();
                    address=sc.nextLine();
                    System.out.println("Succefully change your Adderess");
                    
                }
            else
                System.out.println("Wrong pin Enterd");
                
             }
            break;
        case 3:System.err.println("Enter your pin");
                pin1=sc.nextInt();
                {
                    if(pin==pin1)
                    {
                        System.out.print("Enter your Mobile Number : ");
                        sc.nextLine();
                        mobile=sc.nextLong();
                        System.out.println("Succefully change your Mobile number");
                        
                    }
                    else
                    System.out.println("Wrong pin Enterd");
                    
            }
            break;
            case 4:System.err.println("Enter your pin");
                pin1=sc.nextInt();
                {
                    if(pin==pin1)
                    {
                        System.out.print("Enter your new pin : ");
                        sc.nextLine();
                        pin=sc.nextInt();
                        System.out.println("Succefully change your pin");
                        
                    }
                    else
                    System.out.println("Wrong pin Enterd");
                    
            }
            break;
           
            
            default:System.out.println("Wrong option Entered ");
            break;
            
}
}
}



    
            
           
            
                
            
            
        







