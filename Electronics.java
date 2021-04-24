import java.util.*;
import java.text.*;
class Electronics
{
    Scanner S=new Scanner(System.in);
    int as,cost=0,number,ans=0;
    double dis=0;
    String email="",password="";
    void date()
    { 
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
    }
    void main()
    {        
        date();
        line();
        System.out.println("                          WELCOME TO FABULO SHOPPING(SHOP BY BRANDS)");
        System.out.println("SHOP AS MUCH AS YOU CAN CAUSE FABULO PRESENTS YOU WITH THE BIGGEST SALE OF THE YEAR!!");
        System.out.println("YOU CAN EXIT EITHER BY COMING BACK TO HOME SCREEN OR BY ENTERING WRONG CHOICE");
        line();
        System.out.println("Please choose one of the options given below :-");
        do
        {
            System.out.println(" 1}Customer Details \n 2}Shop \n 3}Exit");
            as=S.nextInt();
            System.out.println("\f");
            date();
            switch(as)
            {
                case 1:
                do
                {
                    System.out.println(" YOU NEED TO ADD YOUR DETAILS INORDER TO MODIFY OR DELETE THEM \n 1}Add \n 2}Modify \n 3}Delete");
                    int x=S.nextInt();
                    System.out.println("\f");
                    date();
                    ans=0;
                    switch(x)
                    {
                        case 1: add();
                        break;                
                        case 2:modify();
                        break;        
                        case 3:delete();
                        break;
                        default: System.exit(0);
                    }
                    System.out.println("Do you want to surf through other options?If yes enter 1");
                    ans =S.nextInt();
                    System.out.println("\f");  
                    date();
                }while(ans==1);
                break;
                case 2: 
                do{
                    ans=0;
                    System.out.println("Select :-");     
                    System.out.println(" 1}Computers & Accessories \n 2}Cameras,Audio & Video \n 3}Mobiles & Tablets");
                    int b=S.nextInt();
                    System.out.println("\f");
                    date();
                    switch(b)
                    {
                        case 1: cost=cost+computers();
                        break;
                        case 2: cost=cost+camera();
                        break;  
                        case 3:cost=cost+mobile();
                        break;
                        default: System.exit(0);
                    }
                    System.out.println("Do you want to surf through other options ?If yes enter 1");
                    ans =S.nextInt();
                    System.out.println("\f");
                    date();
                }while(ans==1);
                break;
                case 3:System.exit(0);
                default: System.exit(0);
            }
            System.out.println("Do you want to go to Home Screen ?If yes enter 1");
            ans =S.nextInt();
            System.out.println("\f");
            date();
        }while(ans==1);        
        if(cost>0)
        {            
            System.out.println("Total number of Gadgets purchased:-  "+number);
            System.out.println("Number of Gadgets purchased     |     discount");
            System.out.println("  2                             |       15%   ");
            System.out.println("  3-4                           |       20%   ");
            System.out.println("  5                             |       35%   ");
            System.out.println("  5+                            |       45%   ");
            if(number<2)
            {
                System.out.println("You get no discount");
            }
            else if((number==2))
            {
                System.out.println("You get 15% off for buying"+number+"Gadgets");
                dis=((cost*15)/100.0);
                System.out.println("So cost decreased= "+dis);
            }
            else if((number>=3)&&(number<=4))
            {
                System.out.println("You get 20% off for buying"+number+"Gadgets");
                dis=((cost*20)/100.0);
                System.out.println("So cost decreased= "+dis);
            }
            else if(number==5)
            {
                System.out.println("You get 35% off for buying"+number+"Gadgets");
                dis=((cost*35)/100.0);
                System.out.println("So cost decreased= "+dis);
            }
            else
            {
                System.out.println("You get 45% off for buying"+number+"Gadgets");
                dis=((cost*45)/100.0);
                System.out.println("So cost decreased= "+dis);
            }
            System.out.println("                         ---------------------------------");
            System.out.println("                         |*******************************|");
            System.out.println("                         |*----- THE TOTAL COST:- ------*|");        
            System.out.println("                                     RS"+cost);
            System.out.println("                         |*- TOTAL COST AFTER DISCOUNT:-*|");
            System.out.println("                                     RS"+(cost-dis));
            System.out.println("                         |*-----------------------------*|");
            System.out.println("                         |*-----------------------------*|");
            System.out.println("                         |*******************************|");
            System.out.println("                         ---------------------------------");
            System.out.println("                         THANK YOU VERY MUCH FOR SHOPPING!!!");
            line();
        }
        else
        {
            System.out.println(" THANKS FOR ENTERING YOUR DETAILS,BE SURE TO SHOP THE NEXT TIME YOU COME HERE");
            System.exit(0);
        }
    }
    int computers()
    {           
        System.out.println("Gadgets available are:- \n 1 Laptops \n 2 Desktops & Moniters \n 3 Pendrives \n 4 Printers & Ink \n 5 Networking & Internet Devices \n 6 Softwares "); 
        System.out.println("Enter your choice");
        int f=S.nextInt();
        System.out.println("\f");
        date();
        ans=0;
        switch(f)
        {
            case 1: cost= cost + laptop();
            line();
            break;
            case 2: cost=cost+ desktop();
            line();
            break;
            case 3:cost=cost+pendrive();
            line();
            break;
            case 4:cost=cost+printer();  
            line();
            break;
            case 5:cost=cost+network(); 
            line();
            break;
            case 6:cost=cost+software();    
            line();
            break;
            default:System.exit(0);                
        }
        return cost;
    }
    int camera()
    {
        System.out.println("Gadgets available are:- \n 1 Cameras \n 2 Telivisions \n 3 Speakers & Radio ");
        System.out.println("Enter your choice");
        int f=S.nextInt();
        ans=0;
        switch(f)
        {                                   
            case 1:cost=cost+cameras();  
            line();
            break;  
            case 2:cost=cost+tv();  
            line();
            break;    
            case 3:cost=cost+speaker(); 
            line();
            break;   
            default: System.exit(0);
        }
        return cost;
    }
    int mobile()
    {
        System.out.println("Gadgets available are:- \n 1 Smartphones \n 2 Android phones \n 3 Cases,Covers & Screen protecters \n 4 Tablets");
        System.out.println("Enter your choice");
        int f=S.nextInt();
        ans=0;
        switch(f)
        {
            case 1: cost=cost+smart();                
            line();
            break;
            case 2:cost=cost+android(); 
            line();
            break;        
            case 3:cost=cost+cases();                
            line();
            break;
            case 4:cost=cost+tab();               
            line();
            break; 
            default:System.exit(0);
        }
        return cost;
    }
    int laptop()
    {
        System.out.println("Laptops available are:- \n 1 Dell \n 2 Acer \n 3 Apple  \n 4 HP  "); 
        int x=S.nextInt();
        int b;
        ans=0;
        switch(x)
        {
            case 1: System.out.println(" 1.Dell Inspiron 3558 Notebook of Rs 27300 \n 2.Dell Vostro 3558 15.6-inch Laptop of Rs 33000 \n 3.Dell Inspiron 15 3558 15.6-inch Laptop of Rs 32900");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of laptops you want to purchase");                
                b=S.nextInt();
                number=number+b;
                cost =cost+b*27300;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*33000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*32900;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Acer Aspire ES1-521 of Rs 17700 \n 2.Acer One 10 S1002-15XR 10.1-inch Laptop of Rs 14500 \n 3.Acer E5-553 15.6-inch Laptop of Rs 26500");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*17700;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*14500;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*26500;
            }
            else 
            {
                System.exit(0);;
            }
            break;
            case 3: System.out.println(" 1.Apple Macbook Pro MD101HN/A 13-inch Laptop of Rs 51000 \n 2.Apple MacBook Air MMGF2HN/A 13.3-inch Laptop  of Rs 62000 \n 3.Apple MacBook Pro MJLT2HN/A 15-inch Laptop of Rs 168000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*51000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*62000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*168000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 4: System.out.println(" 1.HP 15.6-inch Laptop of Rs 27000 \n 2.HP 15-ac156TX 15.6-inch Laptop  of Rs 29900 \n 3.HP Pavilion 15-AU006TX 15.6-inch Laptop of Rs 55000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*27000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*29900;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of laptops you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*55000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int desktop()
    {
        System.out.println("Desktops & Moniters available are:- \n 1 BenQ \n 2 LG \n 3 Samsung ");  
        int x=S.nextInt();
        int b;
        ans=0;
        switch(x)
        {
            case 1: System.out.println(" 1.BenQ (24 inch) LED Flicker Free LED-Lit HDMI Monitorof Rs 95000 \n 2.BenQ 21.5-inch Monitor (Black) of Rs 73300 \n 3.BenQ 21.5 inch Slim bezel IPS Monitor with HDMI of Rs 86000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*95000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*73300;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*86000;
            }
            else 
            {
                System.exit(0);;
            }
            break;
            case 2: System.out.println(" 1.LG 24 IPS Slim LED Monitor Rs 15,100.00 \n 2.LG 19-inch LED Monitor With VGA & HDMI (Black)of Rs 59000 \n 3.LG LED 15-inch Monitor - Black of Rs 45000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*15100;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*59000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*45000;
            }
            else 
            {
                System.exit(0);;
            }
            break;
            case 3: System.out.println(" 1.Samsung Curved 23.6-inch Monitor (Black)of Rs 14200 \n 2.Samsung 21.5-inch LED Night View Monitor (Black)  of Rs 7800 \n 3.Samsung 18.5 Super Slim LED Monitor with PLS panel 178/178 Full Viewing Angleof Rs 5400");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*14200;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*7800;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of moniters you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*5400;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int pendrive()
    {
        int b,x;
        System.out.println("Pendrives:- \n 1 HP \n 2 Sony \n 3 Sandisk ");
        x=S.nextInt();        
        switch(x)
        {
            case 1: System.out.println(" 1.8GB of Rs 350 \n 2.16GB of Rs 400 \n 3.32GB of Rs 1000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*350;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*400;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*1000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.8GB of Rs 310 \n 2.16GB of Rs 340 \n 3.32GB of Rs 870");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*310;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*340;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*870;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.8GB of Rs 200 \n 2.16GB of Rs 250 \n 3.32GB of Rs 590");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*200;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*250;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of pendrives you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*590;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int printer()
    {        
        int b,x;
        ans=0;
        System.out.println("Printers & Ink:- \n 1 HP \n 2 Canon \n 3 Epson  "); 
        x=S.nextInt();       
        switch(x)
        {
            case 1: System.out.println(" 1.HP DeskJet Ink Advantage All-in-One Printer of Rs 4000 \n 2.HP DeskJet All-in-One Printe rof Rs 2700 \n 3.HP 2-pack Black & Tri-color Ink Advantage Cartridges of Rs 650");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*4000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*2700;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*650;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Canon Pixma All-in-One InkJet Printer of Rs 24000 \n 2.Canon Pixma All-in-One InkJet Wifi Printer of Rs 42000 \n 3.Canon Ink Cartridge Color of Rs 850");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*24000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =b*42000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*850;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.Epson Colour Ink Tank System Printer of Rs 10200 \n 2.Epson  360 Color Inkjet Printer of Rs 10300 \n Original Epson Ink All Colors - 70 ml each of Rs 1450");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*10200;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*10300;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of printers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*1450;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int network()
    {  
        int b,x;
        System.out.println(" Networking & Internet Devices are:- \n 1 Wifi routers \n 2 Wireless USB adapters \n 3 Repeaters "); 
        x=S.nextInt();         
        switch(x)
        {
            case 1: System.out.println(" 1.N Series Routers of Rs 900\n 2.AC Series Routers of Rs 1900 \n 3.Gamer Routers of Rs 6000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*900;
            }
            else if(a==2)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*1900;
            }
            else if(a==3)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*6000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Linksys Dual-Band Wireless USB 3.0 Adapter of Rs 4000 \n 2.TP-Link 150Mbps Wireless N Nano USB Adapter (Black) of Rs 450 \n 3.Mini Wi-Fi Receiver 300Mbps USB 2.0 Wireless Wi-Fi Network Adapter of Rs 250");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*4000;
            }
            else if(a==2)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*450;
            }
            else if(a==3)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*250;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.TP-Link 300Mbps Universal WiFi Range Extender (White)of Rs 1400 \n 2.D-link Wireless Range Extender of Rs 1800 \n 3.300Mbs wireless wifi repeater,AP mode with inbuilt antenna Range Extender of Rs 900");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*1400;
            }
            else if(a==2)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*1800;
            }
            else if(a==3)
            {
                System.out.println("How many do you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*900;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int software()
    {
        int b,x;
        ans=0;
        System.out.println(" Softwares Based on:- \n 1 Antivirus & Security \n 2 Operating \n 3 Business & Office");         
        x=S.nextInt();
        switch(x)
        {
            case 1: System.out.println(" 1.Quick Heal of Rs 750 \n 2.McAfee of Rs 400 \n 3.Kaspersky of Rs 250");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*750;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*400;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*250;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Windows 8 of Rs 8000 \n 2.Windows 7 of Rs 74000 \n 3.Windows 10 of Rs 10000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*8000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*7400;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*10000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.MS Office of Rs 3500 \n 2.Lantech of Rs 5000 \n 3.Tally of Rs 18000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*3500;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*5000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of softwares you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*18000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int cameras()
    {
        ans=0;
        int b,x;      
        System.out.println("Cameras available are:- \n 1 Canon \n 2 Nikon \n 3 Sony");
        x=S.nextInt();
        switch(x)
        {
            case 1: System.out.println(" 1.Digital SLR Camera of Rs 35000 \n 2.Point & Shoot cameras of Rs 14000 \n 3.Mirrorless cameras of Rs 5000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*35000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*14000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*5000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Digital SLR Camera of Rs 30000 \n 2.Point & Shoot cameras of Rs 12000 \n 3.Mirrorless cameras of Rs 5000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*3000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*12000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*5000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.Digital SLR Camera of Rs 30000 \n 2.Point & Shoot cameras of Rs 17000 \n 3.Mirrorless cameras of Rs 1200");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*30000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*17000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of cameras you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*5200;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int tv()
    {
        int b,x;
        System.out.println("Televisions available are:- \n 1 Sony \n 2 Panasonic \n 3 Samsung"); 
        x=S.nextInt();
        ans=0;       
        switch(x)
        {
            case 1: System.out.println(" 1.LED Smart TV (32 inch)of Rs 35000 \n 2.Android LED TV(43 inch)of Rs 60000 \n 3.LED Smart TV(24 inch) of Rs 20000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*35000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*60000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*20000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Smart TV (32 inch)of Rs 40000 \n 2.Android LED TV(43 inch)of Rs 60000 \n 3.LED Smart TV(24 inch) of Rs 20000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*40000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*60000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*20000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.LED Smart TV (32 inch)of Rs 30000 \n 2.Android LED TV(43 inch)of Rs 50000 \n 3.LED Smart TV(24 inch) of Rs 15000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*30000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*50000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of TV you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*15000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int speaker()
    {
        ans=0;
        int b,x;
        System.out.println("Speakers available are:- \n 1 Bose \n 2 Philips \n 3 JBL");        
        x=S.nextInt();
        switch(x)
        {
            case 1:System.out.println("Bose Speakers cost Rs9000 ,How many do you want to buy?");
            int a=S.nextInt();
            number=number+a;
            cost=cost +9000*a;
            break;
            case 2:System.out.println("Philips Speakers cost Rs3000 ,How many do you want to buy?");
            a=S.nextInt();
            number=number+a;
            cost=cost +3000*a ;
            break;
            case 3:System.out.println("JBL Speakers cost Rs1500 ,How many do you want to buy?");
            a=S.nextInt();
            number=number+a;
            cost=cost +1500*a;
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int android()
    {
        ans=0;
        int b,x;
        System.out.println("Smartphones available are:- \n 1 Sony \n 2 Samsung \n 3 Micromax ");        
        x=S.nextInt();
        switch(x)
        {
            case 1: System.out.println(" 1.Sony Xperia XA Dual  of Rs 17000 \n 2.Sony Xperia XA Ultra Dual of Rs 26000 \n 3.Sony Xperia XZ Dual  of Rs50000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*17000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*26000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*50000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Samsung Galaxy Grand 2  of Rs 13500(only few left!!) \n 2.Samsung Tizen of Rs 41000 \n 3.Samsung Galaxy of Rs 14000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*13500;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*41000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*14000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.Micromax Canvas Mega of Rs 7000 \n 2.Micromax x900 Dual Sim of Rs 1500 \n 3.Micromax Canvas 6 Pro of Rs 10000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*7000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*1500;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*10000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int smart()
    {
        ans=0;
        int b,x;
        System.out.println(" Android phones  available are:- \n 1 Apple \n 2 Samsung \n 3 Micromax ");       
        x=S.nextInt();       
        switch(x)
        {
            case 1: System.out.println(" 1.Apple iPhone 7 of Rs 70000 \n 2.Apple iPhone 5s (Silver, 16GB) of Rs 20000 \n 3.Apple iPhone 6s (Space Grey, 16GB) of Rs 40000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*70000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*20000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*40000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Samsung On7 Pro of Rs 9000 \n 2.Samsung On5 Pro of Rs 7000 \n 3.Samsung Tizen Z3 of Rs 6000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*9000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*7000;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*6000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.Micromax Canvas Mega of Rs 7000 \n 2.Micromax x900 Dual Sim of Rs 1500 \n 3.Micromax Canvas 6 Pro of Rs 10000");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*7000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*1500;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of phones you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*10000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int cases()
    {
        int b,x;
        System.out.println("Cases,Covers & Screen protecters  available are:- \n 1 Apple \n 2 Samsung \n 3 Micromax ");
        x=S.nextInt();
        ans=0;
        switch(x)
        {
            case 1: System.out.println(" 1.Cover 0f 300 \n 2.Case of Rs 350 \n 3.ScreenGuard of Rs 200");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of Covers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*300;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of Cases you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*350;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of ScreenGuard you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*200;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" 1.Covers of Rs 100 \n 2.Cases of Rs 150 \n 3.ScreenGuard of Rs 100");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of covers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*100;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of cases you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*150;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of ScreenGuard you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*100;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3: System.out.println(" 1.Covers of Rs 100 \n 2.Cases of Rs 150 \n 3.ScreenGuard of Rs 100");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of covers you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*100;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of cases you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*150;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of ScreenGuard you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*100;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    int tab()
    {
        System.out.println("Tablets available are:- \n 1 Apple \n 2 Samsung \n 3 Lenovo ");
        int b,x;
        x=S.nextInt();
        ans=0;
        switch(x)
        {
            case 1: System.out.println(" 1.Apple iPad Air 2 Tablet,Gold of 38000 \n 2.Apple iPad Mini 2 Tablet,Space Grey of Rs 17500 \n 3.Apple iPad Air 2 Wi-Fi 32GB - Goldof Rs 30000");
            int a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*38000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*17500;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*30000;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 2: System.out.println(" Samsung Tablet (8 inch, 16GB, Wi-Fi+3G+Voice Calling), White of Rs 16500 \n 2.Samsung Tablet (7 inch, 8GB, Wi-Fi+3G+Voice Calling), EBONY Black of Rs 8500 \n 3.Samsung Galaxy J Max Tablet of Rs 13500");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*16500;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*8500;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*13500;
            }
            else 
            {
                System.exit(0);
            }
            break;
            case 3:System.out.println(" 1.Lenovo Yoga Tab 3 of Rs 13000 \n 2.Lenovo A8-50 Tablet of Rs 10500 \n 3.Lenovo PHAB Plus Tablet of Rs 14500");
            a=S.nextInt();
            if(a==1)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*13000;
            }
            else if(a==2)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*10500;
            }
            else if(a==3)
            {
                System.out.println("Enter the number of tablets you want to purchase");
                b=S.nextInt();
                number=number+b;
                cost =cost+b*14500;
            }
            else 
            {
                System.exit(0);
            }
            break;
            default:System.exit(0);
        }
        return cost;
    }
    void line()
    {
        for(int i=1;i<=100;i++)
        {            
            System.out.print("*");
            if(i==100)
                System.out.println();
        }
    }
    void add()

    {   System.out.println("CREATE YOUR OWN ACCOUNT FOR FREE");
        System.out.println("Enter name");
        String name=S.next();
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)<96 || name.charAt(i)>122)
            {
                if(name.charAt(i)!=32)
                {System.out.println("Name should not have numbers or special characters \n Enter valid name");
                    name=S.next();
                    break;
                }
                else
                {break;}
            }
        }
        System.out.println("Enter your gender (f/m)");
        String gender=S.next();
        System.out.println("Date Of Birth");
        System.out.println("Enter the date in numbers");
        int date=S.nextInt();
        while(date<1|| date>31)
        {
            System.out.println("invalid date");
            System.out.println("Enter the Date");
            int date1=S.nextInt();
        }
        System.out.println("Enter the month in numbers");
        int month=S.nextInt();
        while(month<1 || month >12)
        {
            System.out.println("invalid month");
            System.out.println("Enter the month ");
            int month1=S.nextInt();
        }
        System.out.println("Enter the year in numbers");
        int  year=S.nextInt();      
        System.out.println("Enter email");
        email=S.next();
        System.out.println("Enter Password");
        password=S.next();
        System.out.println("Re-enter the Password");
        String password1=S.next();
        for(;(!(password.equals(password1)));)        
        {
            System.out.println("PLEASE re-enter the Correct Password");
            password1=S.next();
        }
        System.out.println("Enter \n 1 to Confirm \n 2 to Cancel");
        int r=S.nextInt();
        switch(r)
        {
            case 1:
            System.out.println("Data is added");
            break;
            case 2:System.out.println("Data is cancelled");
            name="";
            password="";
            email="";
            gender="";
            date=0;
            month=0;
            year=0;
            break;
            default:System.out.println("invalid entry");
        }
    }
    void modify()
    {
        System.out.println("Enter your email");
        String e=S.next();
        System.out.println("Enter your email's password");
        String p=S.next();
        if(e.equals(email) && p.equals(password))
        {
            System.out.println("Enter modified name");
            String name=S.next();
            System.out.println("Enter modified gender ");        
            String gender=S.next();
            System.out.println("Enter modified Date Of Birth using the following format dd/mm/yyyy");        
            String dates=S.next();
            System.out.println("Enter modified email");
            String emailm=S.next();
            System.out.println("Data has been changed");
        }
        else
        {
            System.out.println("Wrong data has been entered");
        }
    }
    void delete()

    {
        System.out.println("Enter your email");
        String e=S.next();
        System.out.println("Enter your email's password");
        String p=S.next();
        if(e.equals(email) && p.equals(password))
        {
            System.out.println("Enter name that you want to delete");
            String name=S.next();
            name="";
            System.out.println("Enter gender that you want to delete");        
            String gender=S.next();
            gender="";
            System.out.println("Enter Date Of Birth that you want to delete");        
            String dates=S.next();
            dates="";
            System.out.println("Enter email that you want to delete");
            String emailm=S.next(); 
            emailm="";
            System.out.println("THE DATA IS DELETED");
        }
        else
        {
            System.out.println("Wrong data has been entered");
        }
    }
}
