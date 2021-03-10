/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author Krystian
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Wyświetlenie opcji menu głównego
        String menu = ("Menu\n\n1 - Dodawanie\n2 - Odejmowanie\n3 - Mnożenie\n4 - Dzielenie\n5 - Kwadrat z liczby\n6 - Silnia\n\n7 - Reset wyniku\n8 - Wyjście"); 
        
        Oblicz o;
        o = new Oblicz();
        
        float wynik = 0;
        
        while(true)
        {
            // czyszczenie konsoli
            System.out.print("\033\143");
            // wypisanie opcji menu
            System.out.println(menu);
            // Aktualny wynik
            System.out.println("\n\nWYNIK = " + wynik);
            // pobranie liczby od użytkownika
            System.out.print("\nchoice: ");
            float choice = scanner.nextFloat();
            
            if(choice == 1)
            {
                if(wynik != 0)
                {
                    System.out.print(wynik + " + ");
                    float a = wynik;
                    float b = scanner.nextFloat();
                    wynik = o.dodaj(a, b);
                }
                else
                {
                    System.out.print("Wprowadź pierwszą liczbę: ");
                    float a = scanner.nextFloat();
                    System.out.print(a + " + ");
                    float b = scanner.nextFloat();
                    wynik = o.dodaj(a,b);
                }
            }
            else if(choice == 2)
            {
                if(wynik != 0)
                {
                    System.out.print(wynik + " - ");
                    float a = wynik;
                    float b = scanner.nextFloat();
                    wynik = o.odejmij(a, b);
                }
                else
                {
                    System.out.print("Wprowadź pierwszą liczbę: ");
                    float a = scanner.nextFloat();
                    System.out.print(a + " - ");
                    float b = scanner.nextFloat();
                    wynik = o.odejmij(a,b);
                }
            }
            else if(choice == 3)
            {
                if(wynik != 0)
                {
                    System.out.print(wynik + " * ");
                    float a = wynik;
                    float b = scanner.nextFloat();
                    wynik = o.pomnoz(a, b);
                }
                else
                {
                    System.out.print("Wprowadź pierwszą liczbę: ");
                    float a = scanner.nextFloat();
                    System.out.print(a + " * ");
                    float b = scanner.nextFloat();
                    wynik = o.pomnoz(a,b);
                }
            }
            else if(choice == 4)
            {
                if(wynik != 0)
                {
                    System.out.print(wynik + " / ");
                    float a = wynik;
                    float b = scanner.nextFloat();
                    wynik = o.podziel(a, b);
                }
                else
                {
                    System.out.print("Wprowadź pierwszą liczbę: ");
                    float a = scanner.nextFloat();
                    System.out.print(a + " / ");
                    float b = scanner.nextFloat();
                    wynik = o.podziel(a,b);
                }
            }
            else if(choice == 5)
            {
                if(wynik != 0)
                {
                    float a = wynik;
                    wynik = o.kwadrat(a);
                }
                else
                {
                    System.out.print("Wprowadź liczbę: ");
                    float a = scanner.nextFloat();
                    wynik = o.kwadrat(a);
                }
            }
            else if(choice == 6)
            {
                {
                    System.out.print("Wprowadź liczbę dodatnią całkowitą: ");
                    int a = scanner.nextInt();
                    wynik = o.silnia(a);
                }
            }
            else if(choice == 7)
            {
                wynik = 0;
            }
            // Wyjście z programu
            else if(choice == 8)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Niewłaściwa komenda!");
            }
        }
    }

}

class Oblicz
{
    Oblicz()
    {
        System.out.println("Kalkulator");
    }
    // funkcja dodawania
    int dodaj(int a, int b)
    {
        return (a + b);
    }
    float dodaj(float a, float b)
    {
        return (a + b);
    }
    // funkcja odejmowania
    int odejmij(int a, int b)
    {
        return (a - b);
    }
    float odejmij(float a, float b)
    {
        return (a - b);
    }
    // funkcja mnożenia
    int pomnoz(int a, int b)
    {
        return (a * b);
    }
    float pomnoz(float a, float b)
    {
        return (a * b);
    }
    // funkcja dzielenia
    int podziel(int a, int b)
    {
        return (a / b);
    }
    float podziel(float a, float b)
    {
        return (a / b);
    }
    // funkcja podnoszenia do kwadratu
    int kwadrat(int a)
    {
        return (a * a);
    }
    float kwadrat(float a)
    {
        return (a * a);
    }
    // funkcja silnia
    int silnia(int a)
    {
        int wynik = 1;
        for(int i = 1; i <= a; i++)
        {
            wynik = wynik * i;
        }
        return wynik;
    }
}