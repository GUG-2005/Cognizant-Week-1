import java.util.*;
import java.io.*;

public class FinancialForecast
{
  public static double forecast(double amt, double rate, int years)
  {
    if (years == 0)
    {
      return amt;
    }
    return forecast(amt * (1 + rate/100.0), rate, years-1);
  }

  public static void main (String [] args)
  {
    double amt = 10000.0;
    double rate = 5.0;
    int years = 5;

    double returns = forecast(amt, rate, years);
    System.out.println("Amount of Rs. "+amt+" has grown at a rate of "+rate+" in "+years+" years.");
    System.out.printf("Returns on initial: Rs. %.2f", returns);
  }
}